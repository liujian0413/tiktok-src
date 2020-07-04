package com.p280ss.android.ugc.aweme.main.dialogmanager;

import android.os.Handler;
import com.p280ss.android.ugc.aweme.C7162m;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.main.dialogmanager.a */
public final class C32985a implements C7162m {

    /* renamed from: a */
    public static final C32985a f85948a = new C32985a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f85949b;

    /* renamed from: com.ss.android.ugc.aweme.main.dialogmanager.a$a */
    static final class C32986a implements Runnable {

        /* renamed from: a */
        public static final C32986a f85950a = new C32986a();

        C32986a() {
        }

        public final void run() {
            if (!C32985a.f85949b) {
                C42961az.m136380a(new C32987b());
            }
        }
    }

    private C32985a() {
    }

    /* renamed from: b */
    public final void mo18612b() {
        f85949b = true;
    }

    /* renamed from: c */
    public final void mo18613c() {
    }

    /* renamed from: a */
    public final void mo18611a() {
        if (f85949b) {
            f85949b = false;
            new Handler().postDelayed(C32986a.f85950a, TimeUnit.SECONDS.toMillis(5));
        }
    }
}
