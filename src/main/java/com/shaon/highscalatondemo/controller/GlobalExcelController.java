package com.shaon.highscalatondemo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/excel/api/v1")
public class GlobalExcelController {


    @GetMapping("/upload")
    public void uploadExcel(@RequestParam("file") MultipartFile multipartFile){

    }
}
