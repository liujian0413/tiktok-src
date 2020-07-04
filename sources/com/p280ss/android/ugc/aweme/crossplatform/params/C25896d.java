package com.p280ss.android.ugc.aweme.crossplatform.params;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.Set;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.params.d */
public final class C25896d {

    /* renamed from: a */
    public String f68490a;

    /* renamed from: b */
    public String f68491b;

    /* renamed from: c */
    public String f68492c;

    /* renamed from: d */
    public String f68493d;

    /* renamed from: e */
    public String f68494e;

    /* renamed from: f */
    public String f68495f = "0";

    /* renamed from: g */
    public String f68496g;

    /* renamed from: h */
    public String f68497h;

    /* renamed from: i */
    public String f68498i;

    /* renamed from: j */
    public String f68499j;

    /* renamed from: k */
    public boolean f68500k;

    /* renamed from: l */
    public DynamicType f68501l = DynamicType.NONE;

    /* renamed from: m */
    public String f68502m;

    /* renamed from: n */
    public boolean f68503n;

    /* renamed from: o */
    public String f68504o;

    /* renamed from: d */
    public final boolean mo67278d() {
        if (TextUtils.equals("1", this.f68497h) || !TextUtils.isEmpty(this.f68498i)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo67272a() {
        String str;
        if (!TextUtils.isEmpty(this.f68491b)) {
            str = this.f68491b;
            if (str == null) {
                C7573i.m23580a();
                return str;
            }
        } else {
            str = this.f68490a;
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    C7573i.m23580a();
                }
                if (!C7634n.m23723c(str, "_android", false)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("_android");
                    str = sb.toString();
                }
            }
        }
        return str;
    }

    /* renamed from: b */
    public final String mo67275b() {
        String str;
        if (!TextUtils.isEmpty(this.f68493d)) {
            str = this.f68493d;
            if (str == null) {
                C7573i.m23580a();
                return str;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f68492c);
            sb.append(".android.jsbundle");
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: c */
    public final boolean mo67277c() {
        if (!C7163a.m22363a()) {
            return TextUtils.equals(this.f68495f, "1");
        }
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl rnFallback = inst.getRnFallback();
        C7573i.m23582a((Object) rnFallback, "SharePrefCache.inst().rnFallback");
        Object d = rnFallback.mo59877d();
        C7573i.m23582a(d, "SharePrefCache.inst().rnFallback.cache");
        if (((Boolean) d).booleanValue()) {
            return true;
        }
        return TextUtils.equals(this.f68495f, "1");
    }

    /* renamed from: a */
    public final void mo67273a(DynamicType dynamicType) {
        C7573i.m23587b(dynamicType, "<set-?>");
        this.f68501l = dynamicType;
    }

    /* renamed from: a */
    public final void mo67274a(String str) {
        if (str == null) {
            str = "0";
        }
        this.f68495f = str;
    }

    /* renamed from: b */
    public final void mo67276b(String str) {
        String str2;
        C7573i.m23587b(str, "reactId");
        if (this.f68496g != null) {
            Uri parse = Uri.parse(this.f68496g);
            C7573i.m23582a((Object) parse, "uri");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Builder clearQuery = parse.buildUpon().clearQuery();
            for (String str3 : queryParameterNames) {
                if (TextUtils.equals(str3, "reactId")) {
                    str2 = str;
                } else {
                    str2 = parse.getQueryParameter(str3);
                }
                clearQuery.appendQueryParameter(str3, str2);
            }
            this.f68496g = clearQuery.toString();
        }
    }
}
