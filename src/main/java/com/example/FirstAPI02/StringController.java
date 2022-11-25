package com.example.FirstAPI02;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/api")
public class StringController {

    @NotBlank(message = "Mandatory")
    String str1;

    String str2;

    @GetMapping(value = "/strings")
    public String getStrings(@Valid @RequestParam String str1, String str2){
        this.str1=str1;
        this.str2=str2;
        if (str2 == null) {
            return str1;
        }else{
            return str1 + str2;
        }

    }
}
