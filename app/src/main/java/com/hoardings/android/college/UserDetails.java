package com.hoardings.android.college;

/**
 * Created by karthik on 01/10/16.
 */
public class UserDetails {

    private String userName;
    private String password;
    private String name;

    public UserDetails(String userName, String password, String name) {
        this.userName = userName;
        this.password = password;
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
