package com.p280ss.android.ugc.aweme.festival.christmas.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.model.GlobalDonationInfo */
public class GlobalDonationInfo implements Serializable {
    @C6593c(mo15949a = "donation_all_amount")
    private double donationAllAmount;
    @C6593c(mo15949a = "join_count")
    private long joinCount;

    public double getDonationAllAmount() {
        return this.donationAllAmount;
    }

    public long getJoinCount() {
        return this.joinCount;
    }

    public void setDonationAllAmount(double d) {
        this.donationAllAmount = d;
    }

    public void setJoinCount(long j) {
        this.joinCount = j;
    }
}
