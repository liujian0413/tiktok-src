package com.p280ss.android.ugc.aweme.activity.p983f2;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.activity.f2.NotifyInfo */
public final class NotifyInfo implements Serializable {
    @C6593c(mo15949a = "button_msg")
    private final String buttonMsg;
    @C6593c(mo15949a = "icon_url")
    private final String iconUrl;
    @C6593c(mo15949a = "status")
    private final String status;
    @C6593c(mo15949a = "title")
    private final String title;

    public static /* synthetic */ NotifyInfo copy$default(NotifyInfo notifyInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notifyInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = notifyInfo.iconUrl;
        }
        if ((i & 4) != 0) {
            str3 = notifyInfo.status;
        }
        if ((i & 8) != 0) {
            str4 = notifyInfo.buttonMsg;
        }
        return notifyInfo.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final String component3() {
        return this.status;
    }

    public final String component4() {
        return this.buttonMsg;
    }

    public final NotifyInfo copy(String str, String str2, String str3, String str4) {
        return new NotifyInfo(str, str2, str3, str4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.buttonMsg, (java.lang.Object) r3.buttonMsg) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.activity.p983f2.NotifyInfo
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.activity.f2.NotifyInfo r3 = (com.p280ss.android.ugc.aweme.activity.p983f2.NotifyInfo) r3
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.iconUrl
            java.lang.String r1 = r3.iconUrl
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.status
            java.lang.String r1 = r3.status
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.buttonMsg
            java.lang.String r3 = r3.buttonMsg
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.activity.p983f2.NotifyInfo.equals(java.lang.Object):boolean");
    }

    public final String getButtonMsg() {
        return this.buttonMsg;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.iconUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.status;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.buttonMsg;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyInfo(title=");
        sb.append(this.title);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", buttonMsg=");
        sb.append(this.buttonMsg);
        sb.append(")");
        return sb.toString();
    }

    public NotifyInfo(String str, String str2, String str3, String str4) {
        this.title = str;
        this.iconUrl = str2;
        this.status = str3;
        this.buttonMsg = str4;
    }
}
