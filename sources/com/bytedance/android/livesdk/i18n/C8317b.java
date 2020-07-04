package com.bytedance.android.livesdk.i18n;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.i18n.b */
public final class C8317b {

    /* renamed from: f */
    private static C8317b f22838f;

    /* renamed from: a */
    public String f22839a = "";

    /* renamed from: b */
    public long f22840b;

    /* renamed from: c */
    public Map<String, String> f22841c = new HashMap();

    /* renamed from: d */
    public I18nUpdateManager f22842d;

    /* renamed from: e */
    public C8320c f22843e;

    /* renamed from: g */
    private C8315a f22844g = new C8315a() {
        /* renamed from: a */
        public final void mo21481a(String str, long j, Map<String, String> map) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(str, C8317b.this.f22839a)) {
                TextUtils.isEmpty(str);
            } else if (j == C8317b.this.f22840b) {
                if (C8317b.this.f22841c != null && C8317b.this.f22841c.isEmpty()) {
                    C8317b.this.f22843e.mo21487a();
                }
            } else if (map == null || map.isEmpty()) {
                if (C8317b.this.f22841c != null && C8317b.this.f22841c.isEmpty()) {
                    C8317b.this.f22843e.mo21487a();
                }
            } else {
                C8317b.this.f22840b = j;
                C8317b.this.f22841c = map;
                C8317b.this.f22843e.mo21488a(j, map);
            }
        }
    };

    /* renamed from: h */
    private C8321a f22845h = new C8321a() {
        /* renamed from: a */
        public final void mo21485a(String str, Exception exc) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(C8317b.this.f22839a, str)) {
                TextUtils.isEmpty(str);
            }
            C8317b.this.f22842d.mo21477a(C8317b.this.f22840b);
        }

        /* renamed from: a */
        public final void mo21484a(String str, C8322b bVar) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(C8317b.this.f22839a, str)) {
                TextUtils.isEmpty(str);
                C8317b.this.f22842d.mo21477a(C8317b.this.f22840b);
            } else if (bVar.f22859b != C8317b.this.f22840b) {
                if (bVar.f22860c == null || bVar.f22860c.isEmpty()) {
                    C8317b.this.f22842d.mo21477a(C8317b.this.f22840b);
                    return;
                }
                C8317b.this.f22840b = bVar.f22859b;
                C8317b.this.f22841c = bVar.f22860c;
                C8317b.this.f22842d.mo21477a(C8317b.this.f22840b);
            }
        }
    };

    /* renamed from: a */
    public static C8317b m25387a() {
        if (f22838f == null) {
            f22838f = new C8317b();
        }
        return f22838f;
    }

    private C8317b() {
    }

    /* renamed from: a */
    public final String mo21482a(String str) {
        if (this.f22841c.containsKey(str)) {
            return (String) this.f22841c.get(str);
        }
        if (this.f22842d != null) {
            this.f22842d.mo21477a(this.f22840b);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo21483a(Locale locale) {
        if (locale != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage());
            sb.append("_");
            sb.append(locale.getCountry().toLowerCase());
            String sb2 = sb.toString();
            if (!TextUtils.equals(sb2, this.f22839a)) {
                if (this.f22842d != null) {
                    this.f22842d.mo21476a();
                }
                if (this.f22843e != null) {
                    this.f22843e.mo21492b();
                }
                this.f22841c.clear();
                this.f22840b = 0;
                this.f22843e = new C8320c(sb2, this.f22845h);
                this.f22842d = new I18nUpdateManager(sb2, this.f22844g);
                if (TextUtils.isEmpty(this.f22839a)) {
                    this.f22843e.mo21487a();
                } else {
                    this.f22842d.mo21477a(this.f22840b);
                }
                this.f22839a = sb2;
            }
        }
    }
}
