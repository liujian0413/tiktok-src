package com.p280ss.android.ugc.aweme.discover.hitrank;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.HitTaskInfo */
public final class HitTaskInfo implements Serializable {
    @C6593c(mo15949a = "compeleted_task_cnt")
    private int compeletedTaskCnt;
    @C6593c(mo15949a = "total_task_cnt")
    private int totalTaskCnt;

    public static /* synthetic */ HitTaskInfo copy$default(HitTaskInfo hitTaskInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hitTaskInfo.compeletedTaskCnt;
        }
        if ((i3 & 2) != 0) {
            i2 = hitTaskInfo.totalTaskCnt;
        }
        return hitTaskInfo.copy(i, i2);
    }

    public final int component1() {
        return this.compeletedTaskCnt;
    }

    public final int component2() {
        return this.totalTaskCnt;
    }

    public final HitTaskInfo copy(int i, int i2) {
        return new HitTaskInfo(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HitTaskInfo) {
                HitTaskInfo hitTaskInfo = (HitTaskInfo) obj;
                if (this.compeletedTaskCnt == hitTaskInfo.compeletedTaskCnt) {
                    if (this.totalTaskCnt == hitTaskInfo.totalTaskCnt) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getCompeletedTaskCnt() {
        return this.compeletedTaskCnt;
    }

    public final int getTotalTaskCnt() {
        return this.totalTaskCnt;
    }

    public final int hashCode() {
        return (this.compeletedTaskCnt * 31) + this.totalTaskCnt;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HitTaskInfo(compeletedTaskCnt=");
        sb.append(this.compeletedTaskCnt);
        sb.append(", totalTaskCnt=");
        sb.append(this.totalTaskCnt);
        sb.append(")");
        return sb.toString();
    }

    public final void setCompeletedTaskCnt(int i) {
        this.compeletedTaskCnt = i;
    }

    public final void setTotalTaskCnt(int i) {
        this.totalTaskCnt = i;
    }

    public HitTaskInfo(int i, int i2) {
        this.compeletedTaskCnt = i;
        this.totalTaskCnt = i2;
    }
}
