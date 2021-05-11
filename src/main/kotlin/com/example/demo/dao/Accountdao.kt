package com.example.demo.dao

import org.springframework.data.jpa.repository.JpaRepository
import com.example.demo.entity.AccountType

interface AccountRepository: JpaRepository<AccountType, Int> {
}