package com.hoardings.android.college;

/**
 * Created by karthik on 02/10/16.
 */
public class StudentDetails {

    private String name;
    private String phone;
    private String email;

    public StudentDetails(String email, String username, String phone) {
        this.email = email;
        this.name =username;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
