package com.controller;

import org.apache.poi.ss.usermodel.*;
import org.springframework.context.annotation.Bean;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ReadAndWriteExcelFile {

    public String readExcelFile(){

        ExcelUtil qa3short = new ExcelUtil(System.getProperty("user.home")+"/Downloads/Fatura/invId.xlsx","QA3-short");

        List<Map<String, String>> dataList = qa3short.getDataList();


        int rowNum = qa3short.rowCount();

        String id = qa3short.getCellData(rowNum-1,0);

       return id;
    }

    public String writeExcelFile(){

        ExcelUtil qa3short = new ExcelUtil(System.getProperty("user.home")+"/Downloads/Fatura/invId.xlsx","QA3-short");

        int rowNum = qa3short.rowCount();

        String id = qa3short.getCellData(rowNum-1,0);

        int id2 = Integer.parseInt(id);

        int id3 = id2 +1;

        String newId = String.valueOf(id3);

         qa3short.setCellData(newId,"invoiceId",rowNum);

        return "Successfully Added new number";
    }
}
