package com.example.demo.entity

import javax.persistence.Table
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Column

@Table(name="member")
@Entity
data class AccountType (
    @Id
    @Column(name="id", unique = true, length = 50)
    var id: String,

    @Column(name="email", unique = true, length = 50)
    var email: String,

    @Column(name="name", length = 50)
    var name: String,
)