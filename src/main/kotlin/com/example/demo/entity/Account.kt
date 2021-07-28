package com.example.demo.entity

import javax.persistence.*

@Table(name="member")
@Entity
data class AccountType (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(name="email", unique = true, length = 50)
    var email: String,

    @Column(name="name", length = 50)
    var name: String,
)