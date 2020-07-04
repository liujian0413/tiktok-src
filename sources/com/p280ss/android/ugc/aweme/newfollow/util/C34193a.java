package com.p280ss.android.ugc.aweme.newfollow.util;

import android.net.ConnectivityManager;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C7162m;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.C22573a;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.util.a */
public final class C34193a implements C7162m {

    /* renamed from: a */
    public static volatile boolean f89170a = true;

    /* renamed from: b */
    public static final C34194a f89171b = new C34194a(null);

    /* renamed from: com.ss.android.ugc.aweme.newfollow.util.a$a */
    public static final class C34194a {
        private C34194a() {
        }

        public /* synthetic */ C34194a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo18612b() {
    }

    /* renamed from: c */
    public final void mo18613c() {
    }

    /* renamed from: d */
    private static void m110389d() {
        try {
            Object systemService = C6399b.m19921a().getSystemService("connectivity");
            if (systemService != null) {
                C6900g.m21454b().mo16941a(((ConnectivityManager) systemService).getActiveNetworkInfo());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo18611a() {
        try {
            if (C21115b.m71197a() != null) {
                if (!f89170a) {
                    IAccountUserService a = C21115b.m71197a();
                    C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
                    if (a.isLogin()) {
                        ParentalPlatformManager.m74627a((C22573a) null);
                    }
                    f89170a = false;
                    m110389d();
                    return;
                }
            }
            f89170a = false;
        } catch (Exception unused) {
        }
    }
}
