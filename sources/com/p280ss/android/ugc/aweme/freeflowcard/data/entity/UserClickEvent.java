package com.p280ss.android.ugc.aweme.freeflowcard.data.entity;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.entity.UserClickEvent */
public class UserClickEvent implements Serializable {
    public int clickType;

    /* renamed from: id */
    public int f78821id;
    public boolean isAutoPlay;
    public long time;

    public UserClickEvent(long j, int i, boolean z) {
        this.time = j;
        this.clickType = i;
        this.isAutoPlay = z;
    }
}
