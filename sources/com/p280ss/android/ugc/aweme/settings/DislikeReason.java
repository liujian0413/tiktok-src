package com.p280ss.android.ugc.aweme.settings;

import android.support.annotation.Keep;
import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7571f;

@Keep
/* renamed from: com.ss.android.ugc.aweme.settings.DislikeReason */
public final class DislikeReason {
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public String f98799id;
    @C6593c(mo15949a = "text")
    public String text;

    public DislikeReason() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ DislikeReason copy$default(DislikeReason dislikeReason, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dislikeReason.f98799id;
        }
        if ((i & 2) != 0) {
            str2 = dislikeReason.text;
        }
        return dislikeReason.copy(str, str2);
    }

    public final String component1() {
        return this.f98799id;
    }

    public final String component2() {
        return this.text;
    }

    public final DislikeReason copy(String str, String str2) {
        return new DislikeReason(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.text, (java.lang.Object) r3.text) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.settings.DislikeReason
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.settings.DislikeReason r3 = (com.p280ss.android.ugc.aweme.settings.DislikeReason) r3
            java.lang.String r0 = r2.f98799id
            java.lang.String r1 = r3.f98799id
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.text
            java.lang.String r3 = r3.text
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.settings.DislikeReason.equals(java.lang.Object):boolean");
    }

    public final String getId() {
        return this.f98799id;
    }

    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        String str = this.f98799id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DislikeReason(id=");
        sb.append(this.f98799id);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(")");
        return sb.toString();
    }

    public final void setId(String str) {
        this.f98799id = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public DislikeReason(String str, String str2) {
        this.f98799id = str;
        this.text = str2;
    }

    public /* synthetic */ DislikeReason(String str, String str2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        this(str, str2);
    }
}
