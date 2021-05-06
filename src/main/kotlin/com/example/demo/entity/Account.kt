package com.example.demo.entity

import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "account", schema = "bcsms")
@Entity
data class AccountType (
    var id: String,
    var name: String,
    var email: String
)