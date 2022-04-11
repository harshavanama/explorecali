package com.example.ec.dto;

import java.util.Arrays;
import java.util.stream.Stream;

public enum Region {
    Central_Coast("Central Coast"), Southern_California("Southern California"),
    Northern_California("Northern California"), Varies("Varies");
    private String label;

    Region(String label) {
        this.label = label;
    }

    public static Region findByLabel(String byLabel){
        for(Region r : Region.values()){
            if(r.label.equalsIgnoreCase(byLabel))
                return r;
        }
        return null;
    }
}
