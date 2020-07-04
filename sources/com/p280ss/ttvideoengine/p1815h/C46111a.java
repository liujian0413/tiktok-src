package com.p280ss.ttvideoengine.p1815h;

import android.content.Context;
import com.bytedance.p532i.C10280a;
import com.bytedance.p532i.C10283b;
import com.bytedance.p532i.C10284c;
import java.util.HashMap;
import org.json.JSONException;

/* renamed from: com.ss.ttvideoengine.h.a */
public final class C46111a implements C10283b {

    /* renamed from: b */
    public static String f117989b = "TTVideo";

    /* renamed from: c */
    private static C46111a f117990c;

    /* renamed from: a */
    public C46112b f117991a;

    /* renamed from: d */
    private C10284c f117992d;

    /* renamed from: e */
    private C10280a f117993e = C10280a.m30444a(this.f117994f);

    /* renamed from: f */
    private Context f117994f;

    /* renamed from: a */
    public final void mo25005a(int i) {
        if (i == 0) {
            this.f117991a.mo112284a(this.f117992d.f27933a);
        }
    }

    /* renamed from: a */
    public static synchronized C46111a m144490a(Context context) {
        C46111a aVar;
        synchronized (C46111a.class) {
            if (f117990c == null) {
                f117990c = new C46111a(context);
            }
            aVar = f117990c;
        }
        return aVar;
    }

    private C46111a(Context context) {
        this.f117994f = context;
        try {
            this.f117991a = new C46112b(this.f117994f);
            this.f117992d = C10284c.m30450a(this.f117994f);
            this.f117992d.f27935d = false;
            this.f117992d.mo25006a((C10283b) this);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo112282a(HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(C10280a.f27920b, hashMap);
        this.f117993e.f27924c = hashMap2;
    }

    /* renamed from: a */
    public final void mo112283a(boolean z) {
        this.f117993e.f27926e = false;
        this.f117993e.mo25001a(false);
    }
}
