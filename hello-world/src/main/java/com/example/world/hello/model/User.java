package com.example.world.hello.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    int id;
    String name;
    Date registeredDate;
    String formattedRegisterDate;
    final static  SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.formattedRegisterDate = format.format(registeredDate);
        this.registeredDate = registeredDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getRegisteredDate() {

        return registeredDate;
    }

    public String getFormattedRegisterDate() {
        return formattedRegisterDate;
    }
}
