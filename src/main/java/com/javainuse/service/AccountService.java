package com.javainuse.service;

import com.javainuse.dto.request.AccountDto;
import com.javainuse.entity.AccountEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    List<AccountEntity> getAllAccount();
}
