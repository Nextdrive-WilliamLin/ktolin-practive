package com.example.demo.entity

import javax.persistence.*

@Entity
data class AccountType (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null,

    @Column(unique = true, length = 50)
    var email: String,

    @Column(length = 50)
    var name: String,
)