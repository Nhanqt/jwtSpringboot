package com.javainuse.mapper;

import com.javainuse.dto.request.AccountDto;
import com.javainuse.entity.AccountEntity;
import com.javainuse.entity.RoleEntity;

public class AccountMapper {
    public AccountEntity accountDtoToAccountEntity(AccountDto accountDto){
        AccountEntity accountEntity = new AccountEntity();
        RoleEntity roleEntity = new RoleEntity();
        System.out.println(accountDto);
        roleEntity.setId(accountDto.getRoleId());
        accountEntity.setRole(roleEntity);
        accountEntity.setUsername(accountDto.getUsername());
        accountEntity.setPassword(accountDto.getPassword());
        accountEntity.setActive(true);
        return accountEntity;
    }
    public AccountDto accountEntityToAccountDto(AccountEntity accountEntity){
        AccountDto accountDto = new AccountDto();
        accountDto.setUsername(accountEntity.getUsername());
        accountDto.setPassword(accountEntity.getPassword());
        return  accountDto;
    }
}
