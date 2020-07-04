package com.p280ss.android.ugc.aweme.app.launch;

import android.app.Activity;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.C7121a.C7132f;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.app.launch.f */
public final class C23012f {

    /* renamed from: a */
    private static long f60789a;

    /* renamed from: b */
    private static long f60790b;

    /* renamed from: com.ss.android.ugc.aweme.app.launch.f$a */
    static final class C23013a<T> implements C7326g<Activity> {

        /* renamed from: a */
        public static final C23013a f60791a = new C23013a();

        C23013a() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m75667a((Activity) obj);
        }

        /* renamed from: a */
        private static void m75667a(Activity activity) {
            C23012f.m75666b(System.currentTimeMillis());
            C7132f b = C7121a.m22248b();
            b.mo18559a(new ResumeTask());
            b.mo18560a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.f$b */
    static final class C23014b<T> implements C7326g<Activity> {

        /* renamed from: a */
        public static final C23014b f60792a = new C23014b();

        C23014b() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m75668a((Activity) obj);
        }

        /* renamed from: a */
        private static void m75668a(Activity activity) {
            C23012f.m75665a(System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    public static final void m75664a() {
        C6405d.m19974b().mo19325f((C7326g<? super T>) C23013a.f60791a);
        C6405d.m19976c().mo19325f((C7326g<? super T>) C23014b.f60792a);
    }

    /* renamed from: a */
    public static final void m75665a(long j) {
        f60789a = j;
    }

    /* renamed from: b */
    public static final void m75666b(long j) {
        f60790b = j;
    }
}
