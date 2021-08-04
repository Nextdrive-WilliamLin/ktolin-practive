package com.example.demo

import org.springframework.http.HttpStatus;
import java.util.*
import com.example.demo.entity.AccountType
import com.example.demo.dao.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
    @RequestMapping("/api")
    class TestController(val accountRepository: AccountRepository){

        @GetMapping("/account")
        fun getAccountData(): List<AccountType> {
            return accountRepository.findAll();
        }

        @GetMapping("/account/{id}")
        fun  getAccountDetail(@PathVariable id: Int): Optional<AccountType> {
            return accountRepository.findById(id)
        }


        @PostMapping("/account")
        fun postAccountData(@RequestBody account: AccountType): AccountType {
            return accountRepository.save(account)
        }

        @PostMapping("/updateAccount")
        fun updateAccount(@RequestBody account: AccountType): AccountType {
            return accountRepository.save(account)
        }

        @PutMapping("/account/{id}")
        fun updateAccountByPut(@PathVariable id: Int, @RequestBody data: AccountType): Optional<AccountType> {
            var account: Optional<AccountType> = accountRepository.findById(id)
            account.get().email = data.email
            account.get().name = data.name
            accountRepository.save(account.get())
            return account
        }
    }

