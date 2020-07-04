package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment */
public final class PromotionAppointment implements Serializable {
    @C6593c(mo15949a = "appointment_num")
    private int appointmentNum;
    @C6593c(mo15949a = "is_appointment")
    private boolean isAppointment;
    @C6593c(mo15949a = "server_time")
    private long serverTime;
    @C6593c(mo15949a = "show_label")
    private String showLabel;
    @C6593c(mo15949a = "show_text")
    private String showText;
    @C6593c(mo15949a = "start_time")
    private long startTime;
    @C6593c(mo15949a = "start_time_text")
    private String startTimeText;

    public PromotionAppointment() {
        this(0, 0, null, null, null, false, 0, 127, null);
    }

    public static /* synthetic */ PromotionAppointment copy$default(PromotionAppointment promotionAppointment, long j, long j2, String str, String str2, String str3, boolean z, int i, int i2, Object obj) {
        PromotionAppointment promotionAppointment2 = promotionAppointment;
        return promotionAppointment.copy((i2 & 1) != 0 ? promotionAppointment2.startTime : j, (i2 & 2) != 0 ? promotionAppointment2.serverTime : j2, (i2 & 4) != 0 ? promotionAppointment2.startTimeText : str, (i2 & 8) != 0 ? promotionAppointment2.showText : str2, (i2 & 16) != 0 ? promotionAppointment2.showLabel : str3, (i2 & 32) != 0 ? promotionAppointment2.isAppointment : z, (i2 & 64) != 0 ? promotionAppointment2.appointmentNum : i);
    }

    public final long component1() {
        return this.startTime;
    }

    public final long component2() {
        return this.serverTime;
    }

    public final String component3() {
        return this.startTimeText;
    }

    public final String component4() {
        return this.showText;
    }

    public final String component5() {
        return this.showLabel;
    }

    public final boolean component6() {
        return this.isAppointment;
    }

    public final int component7() {
        return this.appointmentNum;
    }

    public final PromotionAppointment copy(long j, long j2, String str, String str2, String str3, boolean z, int i) {
        PromotionAppointment promotionAppointment = new PromotionAppointment(j, j2, str, str2, str3, z, i);
        return promotionAppointment;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PromotionAppointment) {
                PromotionAppointment promotionAppointment = (PromotionAppointment) obj;
                if (this.startTime == promotionAppointment.startTime) {
                    if ((this.serverTime == promotionAppointment.serverTime) && C7573i.m23585a((Object) this.startTimeText, (Object) promotionAppointment.startTimeText) && C7573i.m23585a((Object) this.showText, (Object) promotionAppointment.showText) && C7573i.m23585a((Object) this.showLabel, (Object) promotionAppointment.showLabel)) {
                        if (this.isAppointment == promotionAppointment.isAppointment) {
                            if (this.appointmentNum == promotionAppointment.appointmentNum) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getAppointmentNum() {
        return this.appointmentNum;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public final String getShowLabel() {
        return this.showLabel;
    }

    public final String getShowText() {
        return this.showText;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getStartTimeText() {
        return this.startTimeText;
    }

    public final int hashCode() {
        long j = this.startTime;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.serverTime;
        int i2 = (i + ((int) ((j2 >>> 32) ^ j2))) * 31;
        String str = this.startTimeText;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.showText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.showLabel;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        int i4 = (hashCode2 + i3) * 31;
        boolean z = this.isAppointment;
        if (z) {
            z = true;
        }
        return ((i4 + (z ? 1 : 0)) * 31) + this.appointmentNum;
    }

    public final boolean isAppointment() {
        return this.isAppointment;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotionAppointment(startTime=");
        sb.append(this.startTime);
        sb.append(", serverTime=");
        sb.append(this.serverTime);
        sb.append(", startTimeText=");
        sb.append(this.startTimeText);
        sb.append(", showText=");
        sb.append(this.showText);
        sb.append(", showLabel=");
        sb.append(this.showLabel);
        sb.append(", isAppointment=");
        sb.append(this.isAppointment);
        sb.append(", appointmentNum=");
        sb.append(this.appointmentNum);
        sb.append(")");
        return sb.toString();
    }

    public final void setAppointment(boolean z) {
        this.isAppointment = z;
    }

    public final void setAppointmentNum(int i) {
        this.appointmentNum = i;
    }

    public final void setServerTime(long j) {
        this.serverTime = j;
    }

    public final void setShowLabel(String str) {
        this.showLabel = str;
    }

    public final void setShowText(String str) {
        this.showText = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStartTimeText(String str) {
        this.startTimeText = str;
    }

    public PromotionAppointment(long j, long j2, String str, String str2, String str3, boolean z, int i) {
        this.startTime = j;
        this.serverTime = j2;
        this.startTimeText = str;
        this.showText = str2;
        this.showLabel = str3;
        this.isAppointment = z;
        this.appointmentNum = i;
    }

    public /* synthetic */ PromotionAppointment(long j, long j2, String str, String str2, String str3, boolean z, int i, int i2, C7571f fVar) {
        long j3;
        String str4;
        String str5;
        String str6;
        boolean z2;
        long j4 = 0;
        if ((i2 & 1) != 0) {
            j3 = 0;
        } else {
            j3 = j;
        }
        if ((i2 & 2) == 0) {
            j4 = j2;
        }
        if ((i2 & 4) != 0) {
            str4 = "";
        } else {
            str4 = str;
        }
        if ((i2 & 8) != 0) {
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i2 & 16) != 0) {
            str6 = "";
        } else {
            str6 = str3;
        }
        int i3 = 0;
        if ((i2 & 32) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 64) == 0) {
            i3 = i;
        }
        this(j3, j4, str4, str5, str6, z2, i3);
    }
}
