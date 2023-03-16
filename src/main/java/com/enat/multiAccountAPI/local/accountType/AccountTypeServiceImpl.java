package com.enat.multiAccountAPI.local.accountType;


import com.enat.multiAccountAPI.local.newAccounts.NewAccounts;
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
public class AccountTypeServiceImpl implements AccountTypeService {
    private final AccountTypeRepository accountTypeRepository;
    private final EmployeeClient employeeClient;
    private final EmployeeMapper employeeMapper;

    @Override
    public AccountType createAccountType(AccountType intervenes, JwtAuthenticationToken token
    ) {
        var employeeId = Util.getEmployeeID(token);
        var maintainer = getEmployee(employeeId);
        System.out.println(maintainer.getEmail());
        intervenes.setMaintainer(maintainer);

        return   accountTypeRepository.save(intervenes);
    }

    @Override
    public AccountType getAccountTypeById(long id) {
        return accountTypeRepository.findById(id).orElseThrow(()-> new EntityNotFoundException(NewAccounts.class, "Intervene with that id " + id + " was not found!"));
    }

    @Override
    public AccountType updateAccountType(long id, AccountType newAccounts
            , JwtAuthenticationToken token
    ) throws IllegalAccessException {
        var i = getAccountTypeById(id);
//        var employeeId = getEmployeeID(token);
//        if(intervene.getMaintained_by().getEmployeeId().equals(employeeId)){
//            throw new IllegalAccessException("You are not allowed to update this Intervene");
//        }
        BeanUtils.copyProperties(newAccounts, i, Util.getNullPropertyNames(newAccounts));
        return accountTypeRepository.save(i);
    }

    @Override
    public Page<AccountType> getAllAccountType(Pageable pageable
            , JwtAuthenticationToken token
    ) {
        return accountTypeRepository.findAllByDeletedIsFalseOrderByCreatedAtDesc(pageable);
    }

    @Override
    public void deleteAccountTypeById(long id) {
        accountTypeRepository.deleteById(id);
    }

    private Employee getEmployee(String employeeId) {
//        return null;
        return employeeMapper.employeeDtoToEmployee(employeeClient.getEmployeeById(employeeId));
    }
}
