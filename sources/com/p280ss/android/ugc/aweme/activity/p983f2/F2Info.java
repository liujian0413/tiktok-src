package com.p280ss.android.ugc.aweme.activity.p983f2;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.activity.f2.F2Info */
public final class F2Info implements Serializable {
    @C6593c(mo15949a = "activity_id")
    private final int activityId;
    @C6593c(mo15949a = "card_info")
    private final NotifyInfo cardInfo;
    @C6593c(mo15949a = "notice_info")
    private final NotifyInfo noticeInfo;

    public static /* synthetic */ F2Info copy$default(F2Info f2Info, int i, NotifyInfo notifyInfo, NotifyInfo notifyInfo2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = f2Info.activityId;
        }
        if ((i2 & 2) != 0) {
            notifyInfo = f2Info.cardInfo;
        }
        if ((i2 & 4) != 0) {
            notifyInfo2 = f2Info.noticeInfo;
        }
        return f2Info.copy(i, notifyInfo, notifyInfo2);
    }

    public final int component1() {
        return this.activityId;
    }

    public final NotifyInfo component2() {
        return this.cardInfo;
    }

    public final NotifyInfo component3() {
        return this.noticeInfo;
    }

    public final F2Info copy(int i, NotifyInfo notifyInfo, NotifyInfo notifyInfo2) {
        return new F2Info(i, notifyInfo, notifyInfo2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F2Info) {
                F2Info f2Info = (F2Info) obj;
                if (!(this.activityId == f2Info.activityId) || !C7573i.m23585a((Object) this.cardInfo, (Object) f2Info.cardInfo) || !C7573i.m23585a((Object) this.noticeInfo, (Object) f2Info.noticeInfo)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int getActivityId() {
        return this.activityId;
    }

    public final NotifyInfo getCardInfo() {
        return this.cardInfo;
    }

    public final NotifyInfo getNoticeInfo() {
        return this.noticeInfo;
    }

    public final int hashCode() {
        int i = this.activityId * 31;
        NotifyInfo notifyInfo = this.cardInfo;
        int i2 = 0;
        int hashCode = (i + (notifyInfo != null ? notifyInfo.hashCode() : 0)) * 31;
        NotifyInfo notifyInfo2 = this.noticeInfo;
        if (notifyInfo2 != null) {
            i2 = notifyInfo2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("F2Info(activityId=");
        sb.append(this.activityId);
        sb.append(", cardInfo=");
        sb.append(this.cardInfo);
        sb.append(", noticeInfo=");
        sb.append(this.noticeInfo);
        sb.append(")");
        return sb.toString();
    }

    public F2Info(int i, NotifyInfo notifyInfo, NotifyInfo notifyInfo2) {
        this.activityId = i;
        this.cardInfo = notifyInfo;
        this.noticeInfo = notifyInfo2;
    }
}
