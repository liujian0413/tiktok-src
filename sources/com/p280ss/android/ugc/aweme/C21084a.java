package com.p280ss.android.ugc.aweme;

import android.app.Application;
import com.p280ss.android.common.applog.GlobalContext;
import com.p280ss.android.ugc.aweme.IAccountService.C21078b;
import com.p280ss.android.ugc.aweme.IAccountService.C21081e;
import com.p280ss.android.ugc.aweme.IAccountUserService.C6856a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceProvider;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.a */
public final class C21084a {

    /* renamed from: a */
    public static Application f56601a;

    /* renamed from: b */
    public static C21659as f56602b;

    /* renamed from: c */
    public static C21078b f56603c;

    /* renamed from: d */
    public static C21666az f56604d;

    /* renamed from: e */
    public static C6856a f56605e;

    /* renamed from: f */
    public static C21081e f56606f;

    /* renamed from: g */
    public static final C21084a f56607g = new C21084a();

    /* renamed from: h */
    private static ConcurrentHashMap<Class<?>, ServiceProvider<?>> f56608h;

    /* renamed from: i */
    private static C21667b f56609i;

    private C21084a() {
    }

    /* renamed from: a */
    public static Application m71112a() {
        Application application = f56601a;
        if (application == null) {
            C7573i.m23583a("sContext");
        }
        return application;
    }

    /* renamed from: b */
    public static C21659as m71115b() {
        C21659as asVar = f56602b;
        if (asVar == null) {
            C7573i.m23583a("sNetworkApi");
        }
        return asVar;
    }

    /* renamed from: a */
    public static final <T> T m71113a(Class<T> cls) {
        C7573i.m23587b(cls, "clazz");
        ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap = f56608h;
        if (concurrentHashMap == null) {
            C7573i.m23583a("sNeedServices");
        }
        if (concurrentHashMap.contains(cls)) {
            ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap2 = f56608h;
            if (concurrentHashMap2 == null) {
                C7573i.m23583a("sNeedServices");
            }
            Object obj = concurrentHashMap2.get(cls);
            if (obj == null) {
                C7573i.m23580a();
            }
            return ((ServiceProvider) obj).get();
        }
        C21667b bVar = f56609i;
        if (bVar == null) {
            C7573i.m23583a("sServiceProvider");
        }
        ServiceProvider a = bVar.mo57929a(cls);
        if (a != null) {
            ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap3 = f56608h;
            if (concurrentHashMap3 == null) {
                C7573i.m23583a("sNeedServices");
            }
            concurrentHashMap3.put(cls, a);
            return a.get();
        }
        StringBuilder sb = new StringBuilder("你没有在AccountSdkInitializer初始化中注册");
        sb.append(cls.getCanonicalName());
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public static final void m71114a(Application application, C21659as asVar, C21078b bVar, C21666az azVar, C6856a aVar, C21081e eVar, C21667b bVar2) {
        C7573i.m23587b(application, "appContext");
        C7573i.m23587b(asVar, "networkApi");
        C7573i.m23587b(bVar, "userOperator");
        C7573i.m23587b(azVar, "authorize");
        C7573i.m23587b(aVar, "accountUserChangeListener");
        C7573i.m23587b(eVar, "interceptor");
        C7573i.m23587b(bVar2, "serviceProvider");
        f56601a = application;
        f56602b = asVar;
        f56603c = bVar;
        f56604d = azVar;
        f56606f = eVar;
        f56605e = aVar;
        f56608h = new ConcurrentHashMap<>();
        f56609i = bVar2;
        GlobalContext.setContext(application);
    }
}
