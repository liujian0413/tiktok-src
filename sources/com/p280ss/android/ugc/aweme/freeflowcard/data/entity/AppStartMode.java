package com.p280ss.android.ugc.aweme.freeflowcard.data.entity;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.entity.AppStartMode */
public class AppStartMode implements Serializable {

    /* renamed from: id */
    public int f78819id;
    public int mode;
    public long time;

    public String toString() {
        StringBuilder sb = new StringBuilder("AppStartMode{id=");
        sb.append(this.f78819id);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", mode=");
        sb.append(this.mode);
        sb.append('}');
        return sb.toString();
    }
}
