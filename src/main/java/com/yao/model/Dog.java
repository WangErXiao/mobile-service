package com.yao.model;



import javax.xml.bind.annotation.*;

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

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }

    @XmlElement
    public void setColor(String color) {
        this.color = color;
    }
}
