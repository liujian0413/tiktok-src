package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.NeedPointStruct */
public final class NeedPointStruct implements Serializable {
    @C6593c(mo15949a = "point_type")
    private int pointType;
    @C6593c(mo15949a = "time_stamp")
    private long timeStamp;

    public final int getPointType() {
        return this.pointType;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final void setPointType(int i) {
        this.pointType = i;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }
}
