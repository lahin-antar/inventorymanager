package com.lahinantar.inventorymanager.controllers;

import com.lahinantar.inventorymanager.beans.InventoryCSVRow;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

@RestController
public class InventoryManagementController {

    @PostMapping("/upload-inventory-data")
    public String uploadInventoryData(@RequestParam MultipartFile file) {
        try {
            Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()));
            CsvToBean<InventoryCSVRow> csvToBean = new CsvToBeanBuilder<InventoryCSVRow>(reader).withType(InventoryCSVRow.class)
                    .withIgnoreLeadingWhiteSpace(true).build();
            for (InventoryCSVRow row : csvToBean) {
                System.out.println(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Welcome Nihal K";
    }
}
