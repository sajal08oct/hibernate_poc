package org.hibernate.poc.entity;

import org.hibernate.poc.entity.enums.PhoneType;

import javax.persistence.*;

@Entity(name = "PHONE")
public class Phone {

    @Id
    private Long id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "phone_type")
    private PhoneType type;

}

