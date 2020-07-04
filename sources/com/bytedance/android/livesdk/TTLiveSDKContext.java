package com.bytedance.android.livesdk;

import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.init.SDKServiceInitTask;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.p394i.C8308c;
import com.bytedance.android.livesdk.p428w.C9166c;
import com.bytedance.android.livesdk.p428w.C9168e;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.service.C9514b;
import com.bytedance.android.livesdkapi.service.C9515c;
import com.bytedance.android.p109c.p112b.C2307i;
import com.bytedance.android.p109c.p112b.C2307i.C2311b;
import com.bytedance.android.p109c.p112b.C2307i.C2311b.C2312a;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

public class TTLiveSDKContext {
    private static C9168e sHostServiceWrapper;
    private static final ConcurrentHashMap<Class, Object> sServices = new ConcurrentHashMap<>();

    public static C9168e getHostService() {
        return sHostServiceWrapper;
    }

    public static void delayInit() {
        C8308c.m25372a().mo21474b();
    }

    public static String getLiveHostDomain() {
        return ((IHostNetwork) C3596c.m13172a(IHostNetwork.class)).getHostDomain();
    }

    public static C9515c getLiveService() {
        return (C9515c) getServiceInternal(C9515c.class);
    }

    public static void initGiftResource() {
        getLiveService().mo22009a(getHostService().mo22360a().context());
        C7492s.m23282a(C3907ag.f11655a).mo19294a(C47549a.m148327a()).mo19304b(C7333a.m23044b()).mo19333l();
    }

    public static void setHostServiceWrapper(C9168e eVar) {
        sHostServiceWrapper = eVar;
    }

    static <T> T getService(Class<T> cls) {
        return sServices.get(cls);
    }

    private static <T> T getServiceInternal(Class<T> cls) {
        return sServices.get(cls);
    }

    private static boolean isDebug(C9514b bVar) {
        if (bVar == null || !bVar.mo14561a().isLocalTest()) {
            return false;
        }
        return true;
    }

    public static boolean initialize(C9514b bVar) {
        sHostServiceWrapper = C9166c.m27247a(bVar);
        C2311b a = C2307i.m9916a();
        StringBuilder sb = new StringBuilder();
        sb.append(getHostService().mo22360a().context().getFilesDir().getPath());
        sb.append(File.separator);
        sb.append("live_kv");
        a.mo8121a(sb.toString()).mo8122a(false).mo8120a((C2312a) new C2312a() {
            /* renamed from: a */
            public final void mo8087a(int i, String str) {
                m13688b(i, str);
            }

            /* renamed from: b */
            private static void m13688b(int i, String str) {
                switch (i) {
                    case 1:
                        C8444d.m25673b();
                        C8444d.m11970a("SuperKV", str);
                        return;
                    case 2:
                        C8444d.m25673b();
                        C8444d.m11973d("SuperKV", str);
                        return;
                    default:
                        C8444d.m25673b();
                        C8444d.m11972c("SuperKV", str);
                        return;
                }
            }

            /* renamed from: a */
            public final void mo8088a(int i, String str, Throwable th) {
                m13688b(3, str);
                C8444d.m25673b();
                C8444d.m11969a(6, th.getStackTrace());
            }
        }).mo8123a();
        C8308c.m25372a().mo21473a(0, new SDKServiceInitTask(bVar));
        C8308c.m25372a().mo21474b();
        return true;
    }

    public static <T> void registerService(Class<T> cls, T t) {
        sServices.put(cls, t);
    }

    static <T> void unRegisterService(Class<T> cls, T t) {
        sServices.remove(cls, t);
    }
}
