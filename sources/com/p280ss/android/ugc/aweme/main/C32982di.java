package com.p280ss.android.ugc.aweme.main;

import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.main.di */
public final class C32982di {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f85942a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32982di.class), "mPreferences", "getMPreferences()Lcom/ss/android/ugc/aweme/main/MainTabPreferences;"))};

    /* renamed from: b */
    private final C7541d f85943b = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, C32983a.f85944a);

    /* renamed from: com.ss.android.ugc.aweme.main.di$a */
    static final class C32983a extends Lambda implements C7561a<C32961dd> {

        /* renamed from: a */
        public static final C32983a f85944a = new C32983a();

        C32983a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m106623a();
        }

        /* renamed from: a */
        private static C32961dd m106623a() {
            return (C32961dd) C23336d.m76560a(AwemeApplication.m21341a(), C32961dd.class);
        }
    }

    /* renamed from: f */
    private final C32961dd m106612f() {
        return (C32961dd) this.f85943b.getValue();
    }

    /* renamed from: b */
    public final String mo84685b() {
        String str = "";
        try {
            String h = m106612f().mo60473h("");
            C7573i.m23582a((Object) h, "mPreferences.getUnloginContentLanguage(\"\")");
            return h;
        } catch (Throwable th) {
            C2077a.m9161a(th, "MainTabPreferences AbstractMethodError");
            return str;
        }
    }

    /* renamed from: c */
    public final boolean mo84689c() {
        try {
            return m106612f().mo60482n(false);
        } catch (Throwable th) {
            C2077a.m9161a(th, "MainTabPreferences AbstractMethodError");
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo84690d() {
        try {
            return m106612f().mo60485q(false);
        } catch (Throwable th) {
            C2077a.m9161a(th, "MainTabPreferences AbstractMethodError");
            return false;
        }
    }

    /* renamed from: e */
    public final String mo84691e() {
        String str = "";
        try {
            String j = m106612f().mo60477j("");
            C7573i.m23582a((Object) j, "mPreferences.getConsumedFeedsForLocationPopup(\"\")");
            return j;
        } catch (Throwable th) {
            C2077a.m9161a(th, "MainTabPreferences AbstractMethodError");
            return str;
        }
    }

    /* renamed from: a */
    public final boolean mo84684a() {
        try {
            return m106612f().mo60481m(false);
        } catch (Throwable th) {
            C2077a.m9161a(th, "MainTabPreferences AbstractMethodError");
            return false;
        }
    }

    /* renamed from: a */
    public final void mo84683a(boolean z) {
        try {
            m106612f().mo60480l(z);
        } catch (Throwable th) {
            C2077a.m9161a(th, "MainTabPreferences AbstractMethodError");
        }
    }

    /* renamed from: b */
    public final void mo84687b(boolean z) {
        try {
            m106612f().mo60483o(true);
        } catch (Throwable th) {
            C2077a.m9161a(th, "MainTabPreferences AbstractMethodError");
        }
    }

    /* renamed from: c */
    public final void mo84688c(boolean z) {
        try {
            m106612f().mo60484p(true);
        } catch (Throwable th) {
            C2077a.m9161a(th, "MainTabPreferences AbstractMethodError");
        }
    }

    /* renamed from: a */
    public final void mo84682a(String str) {
        C7573i.m23587b(str, "contentLanguage");
        try {
            m106612f().mo60471g(str);
        } catch (Throwable th) {
            C2077a.m9161a(th, "MainTabPreferences AbstractMethodError");
        }
    }

    /* renamed from: b */
    public final void mo84686b(String str) {
        C7573i.m23587b(str, "feedsCount");
        try {
            m106612f().mo60475i(str);
        } catch (Throwable th) {
            C2077a.m9161a(th, "MainTabPreferences AbstractMethodError");
        }
    }
}
