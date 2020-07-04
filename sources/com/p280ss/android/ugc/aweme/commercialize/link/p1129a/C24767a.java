package com.p280ss.android.ugc.aweme.commercialize.link.p1129a;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.a.a */
public final class C24767a {

    /* renamed from: a */
    public final String f65238a;

    /* renamed from: b */
    public final LinkData f65239b;

    /* renamed from: c */
    public final Aweme f65240c;

    /* renamed from: d */
    public final boolean f65241d;

    /* renamed from: e */
    public final boolean f65242e;

    /* renamed from: f */
    public final int f65243f;

    /* renamed from: g */
    public final long f65244g;

    /* renamed from: h */
    public final String f65245h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.a.a$a */
    public static final class C24768a {

        /* renamed from: a */
        public String f65246a = "";

        /* renamed from: b */
        public LinkData f65247b;

        /* renamed from: c */
        public Aweme f65248c;

        /* renamed from: d */
        public boolean f65249d;

        /* renamed from: e */
        public boolean f65250e = true;

        /* renamed from: f */
        public int f65251f = -1;

        /* renamed from: g */
        public long f65252g = -1;

        /* renamed from: h */
        public String f65253h = "";

        /* renamed from: a */
        public final C24767a mo64785a() {
            C24767a aVar = new C24767a(this.f65246a, this.f65247b, this.f65248c, this.f65249d, this.f65250e, this.f65251f, this.f65252g, this.f65253h);
            return aVar;
        }

        /* renamed from: a */
        public final C24768a mo64779a(int i) {
            C24768a aVar = this;
            aVar.f65251f = i;
            return aVar;
        }

        /* renamed from: b */
        public final C24768a mo64787b(boolean z) {
            C24768a aVar = this;
            aVar.f65250e = true;
            return aVar;
        }

        /* renamed from: a */
        public final C24768a mo64780a(long j) {
            C24768a aVar = this;
            aVar.f65252g = j;
            return aVar;
        }

        /* renamed from: b */
        public final C24768a mo64786b(String str) {
            C7573i.m23587b(str, "refer");
            C24768a aVar = this;
            aVar.f65253h = str;
            return aVar;
        }

        /* renamed from: a */
        public final C24768a mo64781a(LinkData linkData) {
            C24768a aVar = this;
            aVar.f65247b = linkData;
            return aVar;
        }

        /* renamed from: a */
        public final C24768a mo64782a(Aweme aweme) {
            C24768a aVar = this;
            aVar.f65248c = aweme;
            return aVar;
        }

        /* renamed from: a */
        public final C24768a mo64783a(String str) {
            C24768a aVar = this;
            if (str == null) {
                str = "";
            }
            aVar.f65246a = str;
            return aVar;
        }

        /* renamed from: a */
        public final C24768a mo64784a(boolean z) {
            C24768a aVar = this;
            aVar.f65249d = z;
            return aVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24767a) {
                C24767a aVar = (C24767a) obj;
                if (C7573i.m23585a((Object) this.f65238a, (Object) aVar.f65238a) && C7573i.m23585a((Object) this.f65239b, (Object) aVar.f65239b) && C7573i.m23585a((Object) this.f65240c, (Object) aVar.f65240c)) {
                    if (this.f65241d == aVar.f65241d) {
                        if (this.f65242e == aVar.f65242e) {
                            if (this.f65243f == aVar.f65243f) {
                                if (!(this.f65244g == aVar.f65244g) || !C7573i.m23585a((Object) this.f65245h, (Object) aVar.f65245h)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f65238a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        LinkData linkData = this.f65239b;
        int hashCode2 = (hashCode + (linkData != null ? linkData.hashCode() : 0)) * 31;
        Aweme aweme = this.f65240c;
        int hashCode3 = (hashCode2 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        boolean z = this.f65241d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f65242e;
        if (z2) {
            z2 = true;
        }
        int i3 = (((i2 + (z2 ? 1 : 0)) * 31) + this.f65243f) * 31;
        long j = this.f65244g;
        int i4 = (i3 + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f65245h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdLinkLogParams(label=");
        sb.append(this.f65238a);
        sb.append(", linkData=");
        sb.append(this.f65239b);
        sb.append(", aweme=");
        sb.append(this.f65240c);
        sb.append(", fromCommentDialog=");
        sb.append(this.f65241d);
        sb.append(", useLinkExtra=");
        sb.append(this.f65242e);
        sb.append(", visibleRatio=");
        sb.append(this.f65243f);
        sb.append(", showDuration=");
        sb.append(this.f65244g);
        sb.append(", refer=");
        sb.append(this.f65245h);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo64775b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (this.f65244g >= 0) {
                    jSONObject.put("duration", this.f65244g);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo64774a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ad_extra_data")) {
                    jSONObject2 = jSONObject.getJSONObject("ad_extra_data");
                    C7573i.m23582a((Object) jSONObject2, "ext.getJSONObject(Commer…izeMob.Key.AD_EXTRA_DATA)");
                } else {
                    jSONObject2 = new JSONObject();
                }
                if (this.f65243f >= 0) {
                    jSONObject2.put("pixel_pct", this.f65243f);
                }
                if (C6399b.m19944t()) {
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } else {
                    jSONObject.put("ad_extra_data", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public C24767a(String str, LinkData linkData, Aweme aweme, boolean z, boolean z2, int i, long j, String str2) {
        C7573i.m23587b(str, "label");
        C7573i.m23587b(str2, "refer");
        this.f65238a = str;
        this.f65239b = linkData;
        this.f65240c = aweme;
        this.f65241d = z;
        this.f65242e = z2;
        this.f65243f = i;
        this.f65244g = j;
        this.f65245h = str2;
    }
}
