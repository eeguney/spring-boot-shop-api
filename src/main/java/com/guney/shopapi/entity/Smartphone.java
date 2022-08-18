package com.guney.shopapi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="smartphones")
public class Smartphone{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "storage")
    private String storage;

    @Column(name = "weight")
    private int weight;

    @Column(name = "display_size")
    private String displaySize;

    @Column(name = "display_resolution")
    private String displayResolution;

    @Column(name = "os")
    private String os;

    @Column(name = "ram_memory")
    private String ramMemory;

    @Column(name = "battery")
    private String battery;

    @Column(name = "price")
    private String price;

}
