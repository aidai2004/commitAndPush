package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "state_name")
    private String stateName;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country_name")
    private String countryName;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "address")
    private User user;
}