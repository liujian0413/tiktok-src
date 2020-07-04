package com.facebook.ads;

import java.io.Serializable;

public class RewardData implements Serializable {
    public static final long serialVersionUID = 1;
    private String currency;
    private String userID;

    public String getCurrency() {
        return this.currency;
    }

    public String getUserID() {
        return this.userID;
    }

    public RewardData(String str, String str2) {
        this.userID = str;
        this.currency = str2;
    }
}
