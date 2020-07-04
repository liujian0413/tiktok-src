package com.p280ss.android.ugc.aweme.p999aj;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.aj.b */
public class C22477b {

    /* renamed from: a */
    static final C22481c f59925a;

    /* renamed from: com.ss.android.ugc.aweme.aj.b$a */
    static class C22478a implements C22481c {

        /* renamed from: a */
        final Handler f59926a = new Handler(Looper.getMainLooper());

        C22478a() {
        }

        /* renamed from: a */
        public final void mo59058a(Activity activity, final String[] strArr, final C22480b bVar) {
            this.f59926a.post(new Runnable() {
                public final void run() {
                    if (bVar != null) {
                        int[] iArr = new int[strArr.length];
                        Arrays.fill(iArr, 0);
                        bVar.mo53549a(strArr, iArr);
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.aj.b$b */
    public interface C22480b {
        /* renamed from: a */
        void mo53549a(String[] strArr, int[] iArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.aj.b$c */
    interface C22481c {
        /* renamed from: a */
        void mo59058a(Activity activity, String[] strArr, C22480b bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.aj.b$d */
    static class C22482d implements C22481c {
        C22482d() {
        }

        /* renamed from: a */
        public final void mo59058a(Activity activity, String[] strArr, C22480b bVar) {
            if (((C22476a) activity.getFragmentManager().findFragmentByTag("permissions")) == null) {
                C22476a aVar = new C22476a();
                Bundle bundle = new Bundle();
                bundle.putStringArray("permissions", strArr);
                aVar.setArguments(bundle);
                aVar.f59924a = bVar;
                activity.getFragmentManager().beginTransaction().add(aVar, "permissions").commitAllowingStateLoss();
            }
        }
    }

    /* renamed from: a */
    private static boolean m74365a() {
        if (VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    static {
        if (m74365a()) {
            f59925a = new C22482d();
        } else {
            f59925a = new C22478a();
        }
    }

    /* renamed from: a */
    public static void m74364a(Activity activity, String[] strArr, C22480b bVar) {
        f59925a.mo59058a(activity, strArr, bVar);
    }
}
