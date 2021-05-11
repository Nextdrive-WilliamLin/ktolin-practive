package com.example.demo.entity

import org.hibernate.annotations.TypeDef
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import javax.persistence.*

@Table(name="member")
@Entity
@EntityListeners(AuditingEntityListener::class)
data class AccountType (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: String? = null,

    @Column(unique = true, length = 50)
    var email: String,

    @Column(length = 50)
    var name: String,
) {
    constructor() : this() {

    }
}