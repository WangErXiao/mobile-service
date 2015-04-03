package com.yao.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by root on 15-4-3.
 */
@XmlRootElement(name = "dog")
public class Dog {
    private String name;
    private String color;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
