package com.p280ss.android.ugc.aweme.bullet;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p280ss.android.ugc.aweme.bullet.p1073a.C23559a;
import com.p280ss.android.ugc.aweme.bullet.p1073a.C23561b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.bullet.b */
public final class C23563b {

    /* renamed from: a */
    public static final C23563b f62166a = new C23563b();

    private C23563b() {
    }

    /* renamed from: a */
    public final void mo61488a(Context context, Class<?> cls, String str) {
        m77363a(context, cls, str, null, null);
    }

    /* renamed from: a */
    public static IBulletService m77362a() {
        Object service = ServiceManager.get().getService(IBulletService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ulletService::class.java)");
        return (IBulletService) service;
    }

    static {
        IBulletService iBulletService = (IBulletService) ServiceManager.get().getService(IBulletService.class);
        iBulletService.registerDefaultPackageBundle(new C23603d());
        iBulletService.registerPackageBundle("commerce", new C23559a());
        iBulletService.registerPackageBundle("dou_plus", new C23561b());
        Context a = C6399b.m19921a();
        if (a != null) {
            iBulletService.setApplication((Application) a);
            Context a2 = C6399b.m19921a();
            if (a2 != null) {
                iBulletService.setResourceLoader(new C23612e((Application) a2));
                iBulletService.setReporter(C23602c.f62274a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m77363a(Context context, Class<?> cls, String str, String str2, Bundle bundle) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(cls, "clazz");
        C7573i.m23587b(str, "schema");
        ((IBulletService) ServiceManager.get().getService(IBulletService.class)).open(context, cls, str, str2, bundle);
    }
}
