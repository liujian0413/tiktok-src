package com.p280ss.android.ugc.aweme.festival.christmas.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.model.SelfDonationInfo */
public class SelfDonationInfo implements Serializable {
    @C6593c(mo15949a = "charity_org")
    private String charityOrg;
    @C6593c(mo15949a = "currency")
    private int currency;
    @C6593c(mo15949a = "donation_amount")
    private double donationAmount;

    public String getCharityOrg() {
        return this.charityOrg;
    }

    public int getCurrency() {
        return this.currency;
    }

    public double getDonationAmount() {
        return this.donationAmount;
    }

    public void setCharityOrg(String str) {
        this.charityOrg = str;
    }

    public void setCurrency(int i) {
        this.currency = i;
    }

    public void setDonationAmount(double d) {
        this.donationAmount = d;
    }
}
