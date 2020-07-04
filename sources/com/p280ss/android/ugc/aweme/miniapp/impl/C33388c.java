package com.p280ss.android.ugc.aweme.miniapp.impl;

import android.app.Application;
import android.content.Context;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.crash.C9847a;
import com.bytedance.crash.C9895f;
import com.bytedance.crash.C9912i;
import com.bytedance.crash.CrashType;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.C23397p.C23399a;
import com.p280ss.android.ugc.aweme.i18n.C30490m;
import com.p280ss.android.ugc.aweme.miniapp.C33408m;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.p1398a.C33424a;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.p1398a.C33425b;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.p1398a.C33426c;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.c */
public final class C33388c {
    /* renamed from: a */
    public static void m108003a() {
        C23397p.m76735a().mo60808a(new C23399a().mo60810a(C7258h.m22730c()));
    }

    /* renamed from: a */
    public static void m108006a(Map<String, String> map) {
        C9912i.m29314a(map);
    }

    /* renamed from: a */
    public static void m108004a(long j, final C33424a aVar, final C33425b bVar, boolean z) {
        if (z) {
            C1592h.m7848a(j);
            C1592h.m7853a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    return aVar.mo85663a(new C33426c());
                }
            }).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<Object, Object>() {
                public final Object then(C1592h<Object> hVar) throws Exception {
                    C33426c cVar = new C33426c();
                    cVar.f87276a = hVar.mo6889d();
                    cVar.f87277b = hVar.mo6890e();
                    bVar.mo85664a(cVar);
                    return null;
                }
            }, C1592h.f5958b);
            return;
        }
        C1592h.m7848a(j);
        C1592h.m7853a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                return aVar.mo85663a(new C33426c());
            }
        }).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<Object, Object>() {
            public final Object then(C1592h<Object> hVar) throws Exception {
                C33426c cVar = new C33426c();
                cVar.f87276a = hVar.mo6889d();
                cVar.f87277b = hVar.mo6890e();
                bVar.mo85664a(cVar);
                return null;
            }
        });
    }

    /* renamed from: a */
    public static void m108005a(Application application, int i, int i2, final Map<String, String> map) {
        C9912i.m29317b().mo24560b("https://api2.musical.ly/monitor/collect/c/native_bin_crash");
        C9912i.m29317b().mo24561c("https://api2.musical.ly/monitor/collect/c/crash");
        C9912i.m29317b().mo24557a("https://api2.musical.ly/monitor/collect/c/exception");
        if (i == 1) {
            C9912i.m29307a(application, new C33408m(application), 2033, String.valueOf(i2));
        } else {
            C9912i.m29306a((Context) application, (C9895f) new C33408m(application));
        }
        C9912i.m29314a(map);
        C9912i.m29311a((C9847a) new C9847a() {
            /* renamed from: a */
            public final Map<String, String> mo24411a(CrashType crashType) {
                return map;
            }
        }, CrashType.ALL);
        C30490m.m99588a();
    }
}
