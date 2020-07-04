package com.p280ss.android.ugc.aweme.freeflowcard.data.entity;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.entity.AutoPlaySetting */
public class AutoPlaySetting implements Serializable {
    public int changeType;
    public long dayOpenResetTime;

    /* renamed from: id */
    public int f78820id;
    public boolean isDayOpen;
    public boolean isOpen;
    public int monthlyState;
    public long resetTime;

    public AutoPlaySetting(boolean z, int i, long j, int i2, boolean z2, long j2) {
        this.isOpen = z;
        this.changeType = i;
        this.resetTime = j;
        this.monthlyState = i2;
        this.isDayOpen = z2;
        this.dayOpenResetTime = j2;
    }
}
