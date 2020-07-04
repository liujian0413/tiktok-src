package com.p280ss.android.ugc.aweme.app.p1020a;

import android.app.Application;
import com.p280ss.android.ugc.aweme.C21084a;
import com.p280ss.android.ugc.aweme.C21659as;
import com.p280ss.android.ugc.aweme.C21666az;
import com.p280ss.android.ugc.aweme.C21667b;
import com.p280ss.android.ugc.aweme.IAccountService.C21078b;
import com.p280ss.android.ugc.aweme.IAccountUserService.C6856a;
import com.p280ss.android.ugc.aweme.app.application.p1025a.C22858a;
import com.p280ss.android.ugc.aweme.app.application.p1025a.C22859b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.a.a */
public final class C22730a {

    /* renamed from: a */
    public static final C22730a f60419a = new C22730a();

    private C22730a() {
    }

    /* renamed from: a */
    private static C21659as m75098a() {
        return new C22754c();
    }

    /* renamed from: b */
    private static C21078b m75100b() {
        return new C22859b();
    }

    /* renamed from: c */
    private static C21666az m75101c() {
        return new C22858a();
    }

    /* renamed from: d */
    private static C6856a m75102d() {
        return new C22755d();
    }

    /* renamed from: e */
    private static C21667b m75103e() {
        return new C22735b();
    }

    /* renamed from: a */
    public static final void m75099a(Application application) {
        C7573i.m23587b(application, "appContext");
        C21084a.m71114a(application, m75098a(), m75100b(), m75101c(), m75102d(), new C22762k(), m75103e());
    }
}
