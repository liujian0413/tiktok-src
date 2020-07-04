package com.p280ss.android.ugc.aweme.commercialize.anchor;

import com.google.gson.p276a.C6591a;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.e */
public final class C24536e {
    @C6593c(mo15949a = "type")

    /* renamed from: a */
    public final int f64760a;
    @C6593c(mo15949a = "icon")

    /* renamed from: b */
    public final UrlModel f64761b;
    @C6593c(mo15949a = "title")

    /* renamed from: c */
    public final String f64762c;
    @C6593c(mo15949a = "web_url")

    /* renamed from: d */
    public final String f64763d;
    @C6593c(mo15949a = "added_icon")

    /* renamed from: e */
    public final UrlModel f64764e;
    @C6593c(mo15949a = "desc")

    /* renamed from: f */
    public final String f64765f;
    @C6593c(mo15949a = "content")

    /* renamed from: g */
    public final String f64766g;
    @C6593c(mo15949a = "is_recommend")

    /* renamed from: h */
    public boolean f64767h;
    @C6593c(mo15949a = "is_beta")

    /* renamed from: i */
    public final boolean f64768i;
    @C6593c(mo15949a = "hashtag")

    /* renamed from: j */
    public final String f64769j;
    @C6591a(mo15945a = false, mo15946b = false)

    /* renamed from: k */
    public C7561a<C7581n> f64770k;
    @C6591a(mo15945a = false, mo15946b = false)

    /* renamed from: l */
    public ExtensionMisc f64771l;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24536e) {
                C24536e eVar = (C24536e) obj;
                if ((this.f64760a == eVar.f64760a) && C7573i.m23585a((Object) this.f64761b, (Object) eVar.f64761b) && C7573i.m23585a((Object) this.f64762c, (Object) eVar.f64762c) && C7573i.m23585a((Object) this.f64763d, (Object) eVar.f64763d) && C7573i.m23585a((Object) this.f64764e, (Object) eVar.f64764e) && C7573i.m23585a((Object) this.f64765f, (Object) eVar.f64765f) && C7573i.m23585a((Object) this.f64766g, (Object) eVar.f64766g)) {
                    if (this.f64767h == eVar.f64767h) {
                        if (!(this.f64768i == eVar.f64768i) || !C7573i.m23585a((Object) this.f64769j, (Object) eVar.f64769j) || !C7573i.m23585a((Object) this.f64770k, (Object) eVar.f64770k) || !C7573i.m23585a((Object) this.f64771l, (Object) eVar.f64771l)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f64760a) * 31;
        UrlModel urlModel = this.f64761b;
        int i = 0;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str = this.f64762c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f64763d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.f64764e;
        int hashCode5 = (hashCode4 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        String str3 = this.f64765f;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f64766g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.f64767h;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f64768i;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str5 = this.f64769j;
        int hashCode8 = (i3 + (str5 != null ? str5.hashCode() : 0)) * 31;
        C7561a<C7581n> aVar = this.f64770k;
        int hashCode9 = (hashCode8 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ExtensionMisc extensionMisc = this.f64771l;
        if (extensionMisc != null) {
            i = extensionMisc.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorPublishStruct(type=");
        sb.append(this.f64760a);
        sb.append(", icon=");
        sb.append(this.f64761b);
        sb.append(", title=");
        sb.append(this.f64762c);
        sb.append(", webUrl=");
        sb.append(this.f64763d);
        sb.append(", addedIcon=");
        sb.append(this.f64764e);
        sb.append(", desc=");
        sb.append(this.f64765f);
        sb.append(", content=");
        sb.append(this.f64766g);
        sb.append(", isRecommend=");
        sb.append(this.f64767h);
        sb.append(", isBeta=");
        sb.append(this.f64768i);
        sb.append(", hashtag=");
        sb.append(this.f64769j);
        sb.append(", onClickAction=");
        sb.append(this.f64770k);
        sb.append(", extensionMisc=");
        sb.append(this.f64771l);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo64334a(ExtensionMisc extensionMisc) {
        C7573i.m23587b(extensionMisc, "<set-?>");
        this.f64771l = extensionMisc;
    }

    /* renamed from: a */
    public final void mo64335a(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f64770k = aVar;
    }
}
