package com.example.library.validation;

import java.util.regex.Pattern;

public class ValidCheck {
    public boolean isValidCodeBorrowBook(String value){
        boolean flag=false;
        String pattern = "^MS-[0-9]{4}$";
        boolean isMatch = Pattern.matches(pattern, value);
        if (isMatch) {
            flag=true;
        } else {
            flag=false;
        }
        return flag;
    }
}
