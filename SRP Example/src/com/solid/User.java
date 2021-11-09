package com.solid;

public class User {
    public String name;
    public String email;
    public boolean isValid;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.isValid = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
