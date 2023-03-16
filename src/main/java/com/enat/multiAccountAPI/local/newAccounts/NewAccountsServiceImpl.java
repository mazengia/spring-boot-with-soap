package com.enat.multiAccountAPI.local.newAccounts;


import com.enat.multiAccountAPI.local.config.Dto.EmployeeClient;
import com.enat.multiAccountAPI.local.config.Dto.EmployeeMapper;
import com.enat.multiAccountAPI.local.config.Dto.embedded.Employee;
import com.enat.multiAccountAPI.local.config.exception.EntityNotFoundException;
import com.enat.multiAccountAPI.local.config.util.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewAccountsServiceImpl implements NewAccountsService {

    private final NewAccountsRepository newAccountsRepository;
    private final EmployeeClient employeeClient;
    private final EmployeeMapper employeeMapper;


    @Override
    public NewAccounts createNewAccounts(NewAccounts intervenes, JwtAuthenticationToken token
    ) {
        var employeeId = Util.getEmployeeID(token);
        var maintainer = getEmployee(employeeId);
        System.out.println(maintainer.getEmail());
        intervenes.setMaintainer(maintainer);

        return   newAccountsRepository.save(intervenes);
    }

    @Override
    public NewAccounts getNewAccountsById(long id) {
        return newAccountsRepository.findById(id).orElseThrow(()-> new EntityNotFoundException(NewAccounts.class, "Intervene with that id " + id + " was not found!"));
    }

    @Override
    public NewAccounts updateNewAccounts(long id, NewAccounts newAccounts
            , JwtAuthenticationToken token
    ) throws IllegalAccessException {
        var i = getNewAccountsById(id);
//        var employeeId = getEmployeeID(token);
//        if(intervene.getMaintained_by().getEmployeeId().equals(employeeId)){
//            throw new IllegalAccessException("You are not allowed to update this Intervene");
//        }
        BeanUtils.copyProperties(newAccounts, i, Util.getNullPropertyNames(newAccounts));
        return newAccountsRepository.save(i);
    }

    @Override
    public Page<NewAccounts> getAllNewAccounts(Pageable pageable
            , JwtAuthenticationToken token
    ) {
        return newAccountsRepository.findAllByDeletedIsFalseOrderByCreatedAtDesc(pageable);
    }

    @Override
    public void deleteNewAccountsById(long id) {
        newAccountsRepository.deleteById(id);
    }

    private Employee getEmployee(String employeeId) {
//        return null;
        return employeeMapper.employeeDtoToEmployee(employeeClient.getEmployeeById(employeeId));
    }
}
