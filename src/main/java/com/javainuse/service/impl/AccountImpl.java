package com.javainuse.service.impl;
import com.javainuse.dto.request.AccountDto;
import com.javainuse.entity.AccountEntity;
import com.javainuse.mapper.AccountMapper;
import com.javainuse.repository.AccountRepository;
import com.javainuse.repository.RoleRepository;
import com.javainuse.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class AccountImpl implements AccountService {
    @Autowired
    PasswordEncoder passwordEncoder;



    @Autowired
    AccountRepository accountRepository;
    @Autowired
    RoleRepository roleRepository;
    AccountMapper accountMapper = new AccountMapper();
    @Override
    public List<AccountEntity> getAllAccount() {

        return accountRepository.findAll();
    }
    @Override
    @Transactional
    public AccountDto createAccount(AccountDto accountDto) {
//        validCreate(accountDto);
//        checkRoleIdExist(accountDto);
        accountDto.setPassword(passwordEncoder.encode(accountDto.getPassword()));
        AccountEntity account = accountMapper.accountDtoToAccountEntity(accountDto);
        AccountEntity entity = accountRepository.save(account);
        return accountMapper.accountEntityToAccountDto(entity);
    }
}
