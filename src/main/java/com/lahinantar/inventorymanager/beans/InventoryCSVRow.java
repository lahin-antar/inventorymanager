package com.lahinantar.inventorymanager.beans;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

@Data
public class InventoryCSVRow {
    @CsvBindByName
    private String code;
    @CsvBindByName
    private String name;
    @CsvBindByName
    private String batch;
    @CsvBindByName
    private int stock;
    @CsvBindByName
    private int deal;
    @CsvBindByName
    private int free;
    @CsvBindByName
    private double mrp;
    @CsvBindByName
    private double rate;
    @CsvBindByName
    private String exp;
    @CsvBindByName
    private String company;
    @CsvBindByName
    private String supplier;
}
