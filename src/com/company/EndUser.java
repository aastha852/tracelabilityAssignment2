package com.company;

import java.time.LocalDate;
import java.time.Period;

public class EndUser {

    private String endUserName;
    private String endUserBirthDate;

    public EndUser(String userName, String userBirthDate) {
        this.endUserName = userName;
        this.endUserBirthDate = userBirthDate;
    }


    public String getEndUserName() {
        return endUserName;
    }

    public String getEndUserBirthDate() {
        return endUserBirthDate;
    }

    public int getCurrentAge(LocalDate localBirthDate, LocalDate localCurrentDate) {

        if ((localCurrentDate != null) && (localBirthDate != null)) {
            return Period.between(localBirthDate, localCurrentDate).getYears();
        } else {
            return 0;
        }
    }


    public void setEndUserBirthDate(String endUserBirthDate) {
        this.endUserBirthDate = endUserBirthDate;
    }

    public void setEndUserName(String endUserName) {
        this.endUserName = endUserName;
    }


}
