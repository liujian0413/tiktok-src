package com.p280ss.android.ugc.aweme.profile.model;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UpdateUserTime */
public class UpdateUserTime implements Serializable {
    private int count;
    private long currentTime;

    public int getCount() {
        return this.count;
    }

    public long getCurrentTime() {
        return this.currentTime;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setCurrentTime(long j) {
        this.currentTime = j;
    }
}
