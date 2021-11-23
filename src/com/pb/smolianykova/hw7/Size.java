package com.pb.smolianykova.hw7;

public enum Size {
    XXS("32"),
    XS("34"),
    S("36"),
    M("38"),
    L("40");

    private String num;
    Size(String num) {
        this.num = num;
    }

    String getEuroSize(){ return num;}

    String getDescription(Size size) {
        if (size == XXS) {
            return "детский размер";
        }
        return "взрослый размер";
    }
}
