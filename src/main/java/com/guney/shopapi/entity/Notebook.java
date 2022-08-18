package com.guney.shopapi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "notebooks")
public class Notebook {

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

    @Column(name = "processor")
    private String processor;

    @Column(name = "graphic_card")
    private String graphicCard;

    @Column(name = "screen_resolution")
    private String screenResolution;

    @Column(name = "motherboard")
    private String motherboard;

    @Column(name = "ram_memory")
    private String ramMemory;

    @Column(name = "screen_size")
    private String screenSize;

    @Column(name = "price")
    private String price;
}
