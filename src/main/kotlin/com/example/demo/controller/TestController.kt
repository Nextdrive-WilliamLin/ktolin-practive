package com.example.demo

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody
import java.util.*
import com.example.demo.entity.AccountType
import com.example.demo.dao.AccountRepository
import org.springframework.beans.factory.annotation.Autowired

@RestController
    @RequestMapping("/api")
    class TestController(val accountRepository: AccountRepository){

        @GetMapping("/account")
        fun getAccountData(): List<AccountType> {
            var memberList: ArrayList<AccountType> = ArrayList()

            return accountRepository.findAll();
        }

        @PostMapping("/account")
        fun postAccountData(@RequestBody account: AccountType): AccountType {
            return accountRepository.save(account)
        }

    }
