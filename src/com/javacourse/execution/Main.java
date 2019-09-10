package com.javacourse.execution;

import com.javacourse.clone.DollySheep;
import com.javacourse.interfaces.Boeing;
import com.javacourse.interfaces.MI8;
import com.javacourse.interfaces.Test;

public class Main {
    public static DollySheep foo(DollySheep sheep){
        DollySheep sheep1 = null;
        try {
            sheep1 = (DollySheep) sheep.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep1;
    }



    public static void main(String [] args){

        StringBuilder sb = new StringBuilder();
        StringBuffer sbuf = new StringBuffer();


    }


}
