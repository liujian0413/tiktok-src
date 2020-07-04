package com.p280ss.android.ugc.aweme.commercialize.star;

import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.C23364n;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.star.b */
public final class C25088b {

    /* renamed from: a */
    public static final C25088b f66224a = new C25088b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f66225b;

    /* renamed from: c */
    private static String f66226c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.b$a */
    public static final class C25089a implements C18245g<C25090c> {

        /* renamed from: a */
        final /* synthetic */ C7561a f66227a;

        C25089a(C7561a aVar) {
            this.f66227a = aVar;
        }

        public final void onFailure(Throwable th) {
            C7573i.m23587b(th, "t");
            C25088b.f66225b = false;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(C25090c cVar) {
            boolean z;
            if (cVar != null) {
                if (cVar.f66228a > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    cVar = null;
                }
                if (cVar != null) {
                    C25088b.f66225b = true;
                    this.f66227a.invoke();
                }
            }
        }
    }

    private C25088b() {
    }

    /* renamed from: b */
    public static String m82630b() {
        return f66226c;
    }

    /* renamed from: a */
    public static boolean m82629a() {
        return f66225b;
    }

    static {
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl starAtlasOrderWebUrl = inst.getStarAtlasOrderWebUrl();
        C7573i.m23582a((Object) starAtlasOrderWebUrl, "SharePrefCache.inst().starAtlasOrderWebUrl");
        Object d = starAtlasOrderWebUrl.mo59877d();
        C7573i.m23582a(d, "SharePrefCache.inst().starAtlasOrderWebUrl.cache");
        f66226c = (String) d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0.getStarAtlas() == 1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r0.isWithStarAtlasEntry() == false) goto L_0x0046;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m82631c() {
        /*
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r1 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            r1 = 1
            if (r0 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.profile.model.CommerceUserInfo r0 = r0.getCommerceUserInfo()
            if (r0 == 0) goto L_0x001c
            int r0 = r0.getStarAtlas()
            if (r0 == r1) goto L_0x0044
        L_0x001c:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r2 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r2 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            java.lang.String r2 = "AccountProxyService.userService().curUser"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            boolean r0 = r0.isWithStarAtlasEntry()
            if (r0 != 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r0 = 0
            return r0
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.star.C25088b.m82631c():boolean");
    }

    /* renamed from: a */
    public final void mo65597a(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "checkOrder");
        if (!m82631c()) {
            C18246h.m60214a(StarAtlasOrderApi.m82622a().checkStarAtlasOrder(1, 10), (C18245g<? super V>) new C25089a<Object>(aVar), (Executor) C23364n.f61448a);
        }
    }
}
