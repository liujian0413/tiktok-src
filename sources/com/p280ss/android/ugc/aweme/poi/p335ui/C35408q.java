package com.p280ss.android.ugc.aweme.poi.p335ui;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.util.C42880h;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.q */
public class C35408q {

    /* renamed from: a */
    private static volatile C35408q f92876a;

    /* renamed from: b */
    private Keva f92877b;

    /* renamed from: b */
    public final boolean mo90149b() {
        if (this.f92877b != null) {
            return this.f92877b.getBoolean("enable_fake_gps", false);
        }
        return false;
    }

    /* renamed from: a */
    public static C35408q m114371a() {
        if (f92876a == null) {
            synchronized (C35408q.class) {
                if (f92876a == null) {
                    f92876a = new C35408q();
                }
            }
        }
        return f92876a;
    }

    /* renamed from: c */
    public final Boolean mo90150c() {
        if (this.f92877b == null) {
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(this.f92877b.getBoolean("poi_is_first_not_ask_again", true));
    }

    private C35408q() {
        try {
            this.f92877b = Keva.getRepoFromSp(C6399b.m19921a(), "PoiPreferences", 0);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("SharedPreferencesAnnotatedManager getSP failed ");
            sb.append(th.getMessage());
            C42880h.m136156a(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo90147a(boolean z) {
        if (this.f92877b != null) {
            this.f92877b.storeBoolean("enable_fake_gps", z);
        }
    }

    /* renamed from: a */
    public final void mo90145a(Boolean bool) {
        if (this.f92877b != null) {
            this.f92877b.storeBoolean("poi_is_first_not_ask_again", bool.booleanValue());
        }
    }

    /* renamed from: a */
    public final void mo90148a(double[] dArr) {
        if (this.f92877b != null) {
            this.f92877b.storeString("fake_lat", String.valueOf(dArr[0]));
            this.f92877b.storeString("fake_lng", String.valueOf(dArr[1]));
        }
    }

    /* renamed from: a */
    public final void mo90146a(String str, String str2) {
        if (this.f92877b != null) {
            this.f92877b.storeString("fake_lat", str);
            this.f92877b.storeString("fake_lng", str2);
        }
    }
}
