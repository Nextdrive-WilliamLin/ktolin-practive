package com.example.demo.entity

import org.hibernate.annotations.TypeDef
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import javax.persistence.*

@Table(name="member")
@Entity
@EntityListeners(AuditingEntityListener::class)
data class AccountType (
    @Id
    @Column(name="id", unique = true, length = 50)
    var id: String,

    @Column(name="email", unique = true, length = 50)
    var email: String,

    @Column(name="name", length = 50)
    var name: String,
)