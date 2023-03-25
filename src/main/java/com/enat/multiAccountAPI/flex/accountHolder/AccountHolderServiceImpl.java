package com.enat.multiAccountAPI.flex.accountHolder;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountHolderServiceImpl implements AccountHolderService {

//   private final AccountHolderRepository accountHolderRepository;

    @Override
    public Page<AccountHolder> getAccountHolder(String accountNumber, Pageable pageable) throws IllegalAccessException {
//        if(accountHolderRepository.findOneCardHolder(accountNumber, pageable).isEmpty()){
//            throw new IllegalAccessException("card number can't be found");
//        }
//        return accountHolderRepository.findOneCardHolder(accountNumber, pageable);
        return null;
    }

}
