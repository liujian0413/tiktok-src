package com.p280ss.android.ugc.aweme.poi.p335ui.detail.p1474a;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.C35321b;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.a.b */
public class C35318b {

    /* renamed from: c */
    private static volatile C35318b f92588c;

    /* renamed from: a */
    private HashMap<String, C35317a> f92589a = new HashMap<>();

    /* renamed from: b */
    private C35317a f92590b;

    private C35318b() {
    }

    /* renamed from: b */
    public final void mo89887b() {
        if (this.f92590b != null) {
            this.f92590b.mo89879e();
        }
    }

    /* renamed from: c */
    public final void mo89889c() {
        if (this.f92590b != null) {
            this.f92590b.mo89880f();
        }
    }

    /* renamed from: e */
    public final void mo89891e() {
        if (this.f92590b != null) {
            this.f92590b.mo89884j();
        }
    }

    /* renamed from: f */
    public final void mo89892f() {
        if (this.f92590b != null) {
            this.f92590b.mo89883i();
        }
    }

    /* renamed from: a */
    public static C35318b m114003a() {
        if (f92588c == null) {
            synchronized (C35318b.class) {
                if (f92588c == null) {
                    f92588c = new C35318b();
                }
            }
        }
        return f92588c;
    }

    /* renamed from: d */
    public final void mo89890d() {
        for (C35317a h : this.f92589a.values()) {
            h.mo89882h();
        }
        this.f92589a.clear();
    }

    /* renamed from: g */
    private static boolean m114004g() {
        long j;
        int i;
        Keva repo = Keva.getRepo("poi_repo");
        long j2 = 0;
        if (repo != null) {
            long j3 = repo.getLong("collect_action_latest_time", 0);
            j2 = j3;
            j = repo.getLong("collect_display_latest_time", 0);
        } else {
            j = 0;
        }
        int i2 = 5;
        try {
            i = C30199h.m98861a().getPoiSetting().getCollectHintActionInterval().intValue();
            try {
                i2 = C30199h.m98861a().getPoiSetting().getCollectHintDisplayInterval().intValue();
            } catch (NullValueException unused) {
            }
        } catch (NullValueException unused2) {
            i = 5;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j2 <= ((long) i) * 86400000 || currentTimeMillis - j <= ((long) i2) * 86400000) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo89886a(String str) {
        this.f92590b = (C35317a) this.f92589a.get(str);
    }

    /* renamed from: b */
    public final void mo89888b(String str) {
        C35317a aVar = (C35317a) this.f92589a.get(str);
        if (aVar != null) {
            aVar.mo89882h();
            this.f92589a.remove(str);
        }
        if (this.f92590b != null && this.f92590b.mo89875a(str)) {
            this.f92590b = null;
        }
    }

    /* renamed from: a */
    public final C35317a mo89885a(String str, C35321b bVar) {
        if (C6399b.m19944t() || !m114004g()) {
            return null;
        }
        C35319c cVar = new C35319c(str, bVar);
        this.f92589a.put(str, cVar);
        this.f92590b = cVar;
        return cVar;
    }
}
