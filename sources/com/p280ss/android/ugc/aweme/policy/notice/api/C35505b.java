package com.p280ss.android.ugc.aweme.policy.notice.api;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.api.b */
public final class C35505b {
    @C6593c(mo15949a = "text")

    /* renamed from: a */
    public final String f93162a;
    @C6593c(mo15949a = "is_bold")

    /* renamed from: b */
    public final boolean f93163b;
    @C6593c(mo15949a = "link_type")

    /* renamed from: c */
    public final String f93164c;
    @C6593c(mo15949a = "link")

    /* renamed from: d */
    public final String f93165d;
    @C6593c(mo15949a = "extra")

    /* renamed from: e */
    public final String f93166e;
    @C6593c(mo15949a = "approve")

    /* renamed from: f */
    public final boolean f93167f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35505b) {
                C35505b bVar = (C35505b) obj;
                if (C7573i.m23585a((Object) this.f93162a, (Object) bVar.f93162a)) {
                    if ((this.f93163b == bVar.f93163b) && C7573i.m23585a((Object) this.f93164c, (Object) bVar.f93164c) && C7573i.m23585a((Object) this.f93165d, (Object) bVar.f93165d) && C7573i.m23585a((Object) this.f93166e, (Object) bVar.f93166e)) {
                        if (this.f93167f == bVar.f93167f) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f93162a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f93163b;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.f93164c;
        int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f93165d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f93166e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i3 = (hashCode3 + i) * 31;
        boolean z2 = this.f93167f;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PolicyNoticeAction(text=");
        sb.append(this.f93162a);
        sb.append(", isBold=");
        sb.append(this.f93163b);
        sb.append(", linkType=");
        sb.append(this.f93164c);
        sb.append(", link=");
        sb.append(this.f93165d);
        sb.append(", extra=");
        sb.append(this.f93166e);
        sb.append(", approve=");
        sb.append(this.f93167f);
        sb.append(")");
        return sb.toString();
    }
}
