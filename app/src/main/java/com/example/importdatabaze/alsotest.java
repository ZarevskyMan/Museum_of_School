package com.example.importdatabaze;

public enum alsotest {
    ID(0),
    NAME(1);
    alsotest(int i) {
        this.fieldCode =i;
    }
    public int getFieldCode()
    {
        return fieldCode;
    }
    private int fieldCode;
}

