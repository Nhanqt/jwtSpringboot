package com.javainuse.controller;


import com.javainuse.dto.request.AccountDto;
import com.javainuse.entity.AccountEntity;
import com.javainuse.service.AccountService;
import com.javainuse.utils.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @Autowired
    ResponseHandler responseHandler;
    @RequestMapping(value = "/createAccount", method = RequestMethod.POST)
    public ResponseEntity<?> create(@Valid @RequestBody AccountDto accountDto) {
        accountService.createAccount(accountDto);
        return responseHandler.response(200, "create success", accountDto);
    }
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<?> getAll(){
       List<AccountEntity> accountEntity = accountService.getAllAccount();
       return responseHandler.response(200, "find success", accountEntity);
    }

}
