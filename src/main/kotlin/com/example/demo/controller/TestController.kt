package com.example.demo

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import com.example.demo.entity.AccountType
import com.example.demo.dao.AccountRepository
import org.springframework.beans.factory.annotation.Autowired


@RestController
    @RequestMapping("/api")
    class TestController(){

    @Autowired
    private val accountRepository: AccountRepository? = null

        @ResponseStatus(HttpStatus.OK)
        @GetMapping("/account")
        fun getAccountData(): List<AccountType> {
            var memberList: ArrayList<AccountType> = ArrayList()

            if(accountRepository!=null) {
                return accountRepository.findAll();
            }
            var obj = AccountType(
                id = "0",
                name = "badass",
                email = "none@nextdrive.io"
            )
            memberList.add(obj)
            return memberList
        }
        @PostMapping("/account")
        fun postAccountData() {

        }

    }
