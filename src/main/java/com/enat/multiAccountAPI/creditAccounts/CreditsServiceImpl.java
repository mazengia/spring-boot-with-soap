package com.enat.multiAccountAPI.creditAccounts;


import com.enat.multiAccountAPI.config.Dto.EmployeeClient;
import com.enat.multiAccountAPI.config.Dto.EmployeeMapper;
import com.enat.multiAccountAPI.config.Dto.embedded.Employee;
import com.enat.multiAccountAPI.config.exception.EntityNotFoundException;
import com.enat.multiAccountAPI.config.util.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreditsServiceImpl implements CreditsService {

    private final CreditsRepository creditsRepository;
    private final EmployeeClient employeeClient;
    private final EmployeeMapper employeeMapper;


    @Override
    public Credits createNewAccounts(Credits credits, JwtAuthenticationToken token
    ) {
        var employeeId = Util.getEmployeeID(token);
        var maintainer = getEmployee(employeeId);
        credits.setMaintainer(maintainer);
        return   creditsRepository.save(credits);
    }

    @Override
    public Credits getNewAccountsById(long id) {
        return creditsRepository.findById(id).orElseThrow(()-> new EntityNotFoundException(Credits.class, "Intervene with that id " + id + " was not found!"));
    }

    @Override
    public Page<Credits> getCreditByBatchId(long id, Pageable pageable) {
        return creditsRepository.findAllByBatchCreateIdOrderByCreatedAtDesc(id,pageable);
    }

    @Override
    public Credits updateNewAccounts(long id, Credits credits
            , JwtAuthenticationToken token
    ) throws IllegalAccessException {
        var i = getNewAccountsById(id);
//        var employeeId = getEmployeeID(token);
//        if(intervene.getMaintained_by().getEmployeeId().equals(employeeId)){
//            throw new IllegalAccessException("You are not allowed to update this Intervene");
//        }
        BeanUtils.copyProperties(credits, i, Util.getNullPropertyNames(credits));
        return creditsRepository.save(i);
    }

    @Override
    public Page<Credits> getAllNewAccounts(Pageable pageable
            , JwtAuthenticationToken token
    ) {
        return creditsRepository.findAllByDeletedIsFalseOrderByCreatedAtDesc(pageable);
    }

    @Override
    public void deleteNewAccountsById(long id) {
        creditsRepository.deleteById(id);
    }

    private Employee getEmployee(String employeeId) {
//        return null;
        return employeeMapper.employeeDtoToEmployee(employeeClient.getEmployeeById(employeeId));
    }
}
