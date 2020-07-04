package com.p280ss.android.ugc.aweme.app.launch;

import android.app.Activity;
import android.app.Application;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6403c;
import com.bytedance.ies.ugc.appcontext.C6403c.C6404a;
import com.bytedance.ies.ugc.appcontext.C6405d.C6408c;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.C7153e;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.app.launch.b */
public final class C6872b {

    /* renamed from: a */
    public static final C6872b f19523a = new C6872b();

    /* renamed from: com.ss.android.ugc.aweme.app.launch.b$a */
    public static final class C6873a implements C7153e {
        C6873a() {
        }

        /* renamed from: a */
        public final void mo16891a(String str) {
            C7573i.m23587b(str, "label");
            C6857a.m21312e().mo16822a(str, false);
        }

        /* renamed from: b */
        public final void mo16892b(String str) {
            C7573i.m23587b(str, "label");
            C6857a.m21312e().mo16827b(str, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.b$b */
    static final class C6874b extends Lambda implements C7562b<C6403c, C7581n> {

        /* renamed from: a */
        public static final C6874b f19524a = new C6874b();

        C6874b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m21401a((C6403c) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m21401a(C6403c cVar) {
            C7573i.m23587b(cVar, "$receiver");
            cVar.f18725e = Integer.valueOf(R.string.jf);
            cVar.mo15338a("musical_ly");
            cVar.mo15342c("musically");
            cVar.f18722b = false;
            cVar.mo15340b("14.7.4");
            cVar.f18729i = 2021407040;
            cVar.mo15344d("musically-android");
            cVar.f18731k = 1233;
            cVar.f18732l = C6876c.m21403a();
            cVar.f18723c = new C6408c() {
                /* renamed from: a */
                public final boolean mo15349a(Activity activity) {
                    if (activity != null && !(activity instanceof AmeActivity)) {
                        return true;
                    }
                    return false;
                }
            };
        }
    }

    private C6872b() {
    }

    /* renamed from: a */
    public static void m21398a(Application application) {
        C7573i.m23587b(application, "app");
        C7121a.f20005a.mo18544a(application, (C7153e) new C6873a());
        C6399b.f18694b.mo15327a(C6404a.m19964a(application, C6874b.f19524a));
    }
}
