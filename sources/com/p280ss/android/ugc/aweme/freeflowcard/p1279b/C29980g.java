package com.p280ss.android.ugc.aweme.freeflowcard.p1279b;

import bolts.C1592h;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.utils.C23484l;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.freeflowcard.data.FreeflowNoticeApi.C29982a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.b.g */
public final class C29980g extends C29977f {

    /* renamed from: b */
    public static final C29980g f78792b = new C29980g();

    /* renamed from: com.ss.android.ugc.aweme.freeflowcard.b.g$a */
    public static final class C29981a implements C18245g<BaseResponse> {
        C29981a() {
        }

        public final void onFailure(Throwable th) {
            C7573i.m23587b(th, "t");
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }
    }

    private C29980g() {
    }

    /* renamed from: b */
    public final boolean mo76170b() {
        C6900g b = C6900g.m21454b();
        C7573i.m23582a((Object) b, "NetworkStateManager.getInstance()");
        return b.mo16942c();
    }

    /* renamed from: e */
    private static void m98297e() {
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (a.isLogin()) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(C23484l.m77111a(AwemeApplication.m21341a())));
            C18246h.m60214a(C29982a.m98300a(sb.toString()), (C18245g<? super V>) new C29981a<Object>(), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final boolean mo76168a(boolean z) {
        if (!super.mo76168a(z)) {
            m98297e();
        }
        return true;
    }
}
