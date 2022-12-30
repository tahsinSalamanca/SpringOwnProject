package com.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class InvoiceIdController {


    public ReadAndWriteExcelFile excelUtils = new ReadAndWriteExcelFile();


    @GetMapping("/getId")
    public String getInvId() throws Exception {
       return excelUtils.readExcelFile();
    }

    @GetMapping("/setId")
    public String setInvId() throws Exception {
        return excelUtils.writeExcelFile();
    }
}
