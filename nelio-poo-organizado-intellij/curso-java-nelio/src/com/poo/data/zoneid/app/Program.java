package com.poo.data.zoneid.app;

import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {

        for (String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
    }
}
