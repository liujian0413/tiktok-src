package com.p280ss.android.ugc.aweme.hotsearch.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.hotsearch.model.BillboardWeeklyInfo */
public class BillboardWeeklyInfo implements Serializable {
    @C6593c(mo15949a = "edition_no")
    public int editionNo;
    @C6593c(mo15949a = "end_time")
    public long endTime;
    @C6593c(mo15949a = "start_time")
    public long startTime;
    @C6593c(mo15949a = "uid")
    public String uid;

    public int getEditionNo() {
        return this.editionNo;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String getUid() {
        return this.uid;
    }

    public void setEditionNo(int i) {
        this.editionNo = i;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
