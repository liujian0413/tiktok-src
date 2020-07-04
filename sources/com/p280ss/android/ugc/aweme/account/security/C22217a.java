package com.p280ss.android.ugc.aweme.account.security;

import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.security.a */
public final class C22217a {
    @C6593c(mo15949a = "notice_id_str")

    /* renamed from: a */
    public final String f59318a;
    @C6593c(mo15949a = "notice")

    /* renamed from: b */
    public final String f59319b;
    @C6593c(mo15949a = "highlight")

    /* renamed from: c */
    public final List<C22218b> f59320c;
    @C6593c(mo15949a = "has_notice")

    /* renamed from: d */
    public final boolean f59321d;
    @C6593c(mo15949a = "notice_type")

    /* renamed from: e */
    public final String f59322e;
    @C6593c(mo15949a = "notice_model")

    /* renamed from: f */
    public final String f59323f;
    @C6593c(mo15949a = "scheme")

    /* renamed from: g */
    public final String f59324g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22217a) {
                C22217a aVar = (C22217a) obj;
                if (C7573i.m23585a((Object) this.f59318a, (Object) aVar.f59318a) && C7573i.m23585a((Object) this.f59319b, (Object) aVar.f59319b) && C7573i.m23585a((Object) this.f59320c, (Object) aVar.f59320c)) {
                    if (!(this.f59321d == aVar.f59321d) || !C7573i.m23585a((Object) this.f59322e, (Object) aVar.f59322e) || !C7573i.m23585a((Object) this.f59323f, (Object) aVar.f59323f) || !C7573i.m23585a((Object) this.f59324g, (Object) aVar.f59324g)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f59318a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f59319b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<C22218b> list = this.f59320c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.f59321d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str3 = this.f59322e;
        int hashCode4 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f59323f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f59324g;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeInfoNoticeMsg(noticeId=");
        sb.append(this.f59318a);
        sb.append(", notice=");
        sb.append(this.f59319b);
        sb.append(", highlight=");
        sb.append(this.f59320c);
        sb.append(", hasNotice=");
        sb.append(this.f59321d);
        sb.append(", noticeType=");
        sb.append(this.f59322e);
        sb.append(", noticeModel=");
        sb.append(this.f59323f);
        sb.append(", scheme=");
        sb.append(this.f59324g);
        sb.append(")");
        return sb.toString();
    }
}
