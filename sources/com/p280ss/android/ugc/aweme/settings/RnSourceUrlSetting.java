package com.p280ss.android.ugc.aweme.settings;

import android.support.annotation.Keep;
import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

@Keep
/* renamed from: com.ss.android.ugc.aweme.settings.RnSourceUrlSetting */
public final class RnSourceUrlSetting {
    @C6593c(mo15949a = "channel")
    public final String channel;
    @C6593c(mo15949a = "source_url")
    public final String sourceUrl;

    public RnSourceUrlSetting() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RnSourceUrlSetting copy$default(RnSourceUrlSetting rnSourceUrlSetting, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rnSourceUrlSetting.channel;
        }
        if ((i & 2) != 0) {
            str2 = rnSourceUrlSetting.sourceUrl;
        }
        return rnSourceUrlSetting.copy(str, str2);
    }

    public final String component1() {
        return this.channel;
    }

    public final String component2() {
        return this.sourceUrl;
    }

    public final RnSourceUrlSetting copy(String str, String str2) {
        C7573i.m23587b(str, "channel");
        C7573i.m23587b(str2, "sourceUrl");
        return new RnSourceUrlSetting(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.sourceUrl, (java.lang.Object) r3.sourceUrl) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.settings.RnSourceUrlSetting
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.settings.RnSourceUrlSetting r3 = (com.p280ss.android.ugc.aweme.settings.RnSourceUrlSetting) r3
            java.lang.String r0 = r2.channel
            java.lang.String r1 = r3.channel
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.sourceUrl
            java.lang.String r3 = r3.sourceUrl
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.settings.RnSourceUrlSetting.equals(java.lang.Object):boolean");
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final int hashCode() {
        String str = this.channel;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sourceUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RnSourceUrlSetting(channel=");
        sb.append(this.channel);
        sb.append(", sourceUrl=");
        sb.append(this.sourceUrl);
        sb.append(")");
        return sb.toString();
    }

    public RnSourceUrlSetting(String str, String str2) {
        C7573i.m23587b(str, "channel");
        C7573i.m23587b(str2, "sourceUrl");
        this.channel = str;
        this.sourceUrl = str2;
    }

    public /* synthetic */ RnSourceUrlSetting(String str, String str2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        this(str, str2);
    }
}
