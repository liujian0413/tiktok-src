package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.p280ss.android.p817ad.splash.C19121g;
import com.p280ss.android.p817ad.splash.C19146j.C19148a;
import com.p280ss.android.p817ad.splash.C19151m;
import com.p280ss.android.p817ad.splash.p825c.C18958a;
import com.p280ss.android.p817ad.splash.p825c.C18960c;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25054b;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.splash.SplashAdManagerHolder;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bq */
public final class C25288bq {
    /* renamed from: a */
    public static void m83091a(C19151m mVar) {
        mVar.mo50576d(true);
    }

    /* renamed from: a */
    public static void m83090a(final Context context, HashMap<String, String> hashMap) {
        C252891 r0 = new C18960c() {
            /* renamed from: a */
            public final void mo50382a(List<String> list) {
                C25054b.m82490a().mo65555b(context, list);
            }

            /* renamed from: a */
            public final boolean mo50383a(C18958a aVar, boolean z) {
                return C25054b.m82490a().mo65552a(aVar.mo50380x(), z);
            }
        };
        boolean booleanValue = C30199h.m98861a().getEnableNormalSplashAd().booleanValue();
        C19148a a = new C19148a().mo50848a(SplashAdManagerHolder.m132885a()).mo50849a(hashMap).mo50847a((C18960c) r0);
        boolean z = true;
        C19148a a2 = a.mo50850a(true);
        if (!C7213d.m22500a().mo18791bc() || !booleanValue) {
            z = false;
        }
        C19121g.m62651a(context, a2.mo50852b(z).mo50851a());
    }
}
