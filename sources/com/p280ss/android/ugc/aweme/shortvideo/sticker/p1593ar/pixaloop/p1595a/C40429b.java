package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b */
public final class C40429b {

    /* renamed from: j */
    public static final C40430a f105101j = new C40430a(null);

    /* renamed from: a */
    public String f105102a;

    /* renamed from: b */
    public String f105103b;

    /* renamed from: c */
    public boolean f105104c;

    /* renamed from: d */
    public String f105105d;

    /* renamed from: e */
    public Boolean f105106e = Boolean.valueOf(true);

    /* renamed from: f */
    public Boolean f105107f = Boolean.valueOf(true);

    /* renamed from: g */
    public C40427a f105108g = new C40427a();

    /* renamed from: h */
    public long f105109h;

    /* renamed from: i */
    public int f105110i = 1;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.b$a */
    public static final class C40430a {
        private C40430a() {
        }

        public /* synthetic */ C40430a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final List<String> mo100450b() {
        return this.f105108g.f105098a;
    }

    /* renamed from: c */
    public final String mo100451c() {
        return this.f105108g.f105099b;
    }

    /* renamed from: a */
    public final boolean mo100449a() {
        if (!C23477d.m77081a((Collection<T>) this.f105108g.f105098a)) {
            return true;
        }
        return false;
    }

    public C40429b() {
    }

    /* renamed from: a */
    public final C40429b mo100448a(String str) {
        C7573i.m23587b(str, "sdkExtra");
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("pl");
            if (optJSONObject != null) {
                this.f105106e = Boolean.valueOf(optJSONObject.optBoolean("guide", true));
                this.f105107f = Boolean.valueOf(optJSONObject.optBoolean("loading", true));
                this.f105108g.f105099b = optJSONObject.optString("imgK");
                this.f105108g.f105100c = optJSONObject.optString("relation");
                JSONArray optJSONArray = optJSONObject.optJSONArray("alg");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = optJSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            List<String> list = this.f105108g.f105098a;
                            C7573i.m23582a((Object) string, "str");
                            list.add(string);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return this;
    }

    public C40429b(String str, long j) {
        C7573i.m23587b(str, "imgPath");
        this.f105102a = str;
        this.f105109h = j;
    }

    public C40429b(String str, String str2, boolean z) {
        C7573i.m23587b(str, "imgPath");
        C7573i.m23587b(str2, "algorithmName");
        this.f105102a = str;
        this.f105103b = str2;
        this.f105104c = z;
    }
}
