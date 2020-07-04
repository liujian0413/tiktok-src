package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

@C6505uv
public final class aea {

    /* renamed from: a */
    private static bug f40088a;

    /* renamed from: b */
    private static final Object f40089b = new Object();

    /* renamed from: c */
    private static final aeg<Void> f40090c = new aeb();

    public aea(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        m45672a(context);
    }

    /* renamed from: a */
    public final <T> agj<T> mo39246a(String str, aeg<T> aeg) {
        agu agu = new agu();
        f40088a.mo41335a(new aei(str, agu));
        return afy.m45821a(afy.m45820a((agj<A>) agu, (C15477afu<A, B>) new aed<A,B>(this, aeg), (Executor) acj.f39998a), Throwable.class, (aft<? super X, ? extends V>) new aec<Object,Object>(this, aeg), ago.f40190b);
    }

    /* renamed from: a */
    public final agj<String> mo39245a(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        aeh aeh = new aeh(null);
        aee aee = new aee(this, str2, aeh);
        afg afg = new afg(null);
        aef aef = new aef(this, i, str, aeh, aee, bArr, map, afg);
        if (afg.m45762c()) {
            try {
                afg.mo39278a(str2, "GET", aef.mo39255b(), aef.mo39254a());
            } catch (zza e) {
                acd.m45783e(e.getMessage());
            }
        }
        f40088a.mo41335a(aef);
        return aeh;
    }

    /* renamed from: a */
    public final agj<String> mo39247a(String str, Map<String, String> map) {
        return mo39245a(0, str, map, null);
    }

    /* renamed from: a */
    private static bug m45672a(Context context) {
        bug bug;
        bug bug2;
        synchronized (f40089b) {
            if (f40088a == null) {
                C15585bw.m50188a(context);
                if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43902cq)).booleanValue()) {
                    bug2 = adu.m45660a(context);
                } else {
                    bug2 = new bug(new C15821ko(new File(context.getCacheDir(), "volley")), new C15741hp((C15716gr) new C15979qk()));
                    bug2.mo41336a();
                }
                f40088a = bug2;
            }
            bug = f40088a;
        }
        return bug;
    }
}
