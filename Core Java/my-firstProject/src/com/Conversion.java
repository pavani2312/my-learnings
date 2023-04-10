package com;

public class Conversion {

    public Integer stringToInt(String str) {
        if(str == null ||  str.trim().equals("")) {
            return 0;
        }else

            return Integer.parseInt(str);

    }

    public Double stringToDouble(String str) {
        if(str == null ||  str.trim().equals("")) {
            return 0.0;
        }else

            return Double.parseDouble(str);

    }

}
