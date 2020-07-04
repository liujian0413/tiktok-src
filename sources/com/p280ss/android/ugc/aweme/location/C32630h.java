package com.p280ss.android.ugc.aweme.location;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C43013ch;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;

/* renamed from: com.ss.android.ugc.aweme.location.h */
public final class C32630h extends C32616a {

    /* renamed from: d */
    private static C32630h f85069d;

    /* renamed from: e */
    private boolean f85070e = true;

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo84013g() {
        super.mo83998b();
        mo83997a(false);
    }

    /* renamed from: f */
    public static boolean m105697f() {
        return C32625g.m105674a(C6399b.m19921a());
    }

    /* renamed from: h */
    private static void m105698h() {
        C7121a.m22254e().mo18551a(new C32642q()).mo18552a();
    }

    /* renamed from: b */
    public final void mo83998b() {
        int i;
        if (mo83999c()) {
            if (this.f85070e) {
                i = 60000;
                this.f85070e = false;
            } else {
                i = 0;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new C32632i(this), (long) i);
        }
    }

    /* renamed from: c */
    public final boolean mo83999c() {
        try {
            PoiSetting poiSetting = C30199h.m98861a().getPoiSetting();
            String g = C32326h.m104885g();
            if (TextUtils.isEmpty(g)) {
                return false;
            }
            String poiRegionList = poiSetting.getPoiRegionList();
            if (TextUtils.isEmpty(poiRegionList)) {
                return false;
            }
            for (String equals : poiRegionList.split(",")) {
                if (TextUtils.equals(g, equals)) {
                    return true;
                }
            }
            return false;
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: i */
    private static C32637n m105699i() {
        C32637n nVar = new C32637n();
        nVar.f85086k = new C32622e();
        C32636m.m105710a(nVar);
        C32635l.m105709a(nVar);
        String str = C6399b.m19926b().f18690a;
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("https://")) {
                nVar.f85076a = str;
            } else {
                StringBuilder sb = new StringBuilder("https://");
                sb.append(str);
                nVar.f85076a = sb.toString();
            }
        }
        try {
            PoiSetting poiSetting = C30199h.m98861a().getPoiSetting();
            nVar.f85077b = poiSetting.getReportWifiMax().intValue();
            nVar.f85078c = poiSetting.getReportBssMax().intValue();
            nVar.f85079d = poiSetting.getReportGps().booleanValue();
            if (m105657e()) {
                nVar.f85080e = poiSetting.getReportAtStart().booleanValue();
            }
            nVar.f85083h = (long) poiSetting.getReportIntervalSeconds().intValue();
            nVar.f85084i = (long) poiSetting.getLocationUpdateInterval().intValue();
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
        nVar.f85081f = false;
        nVar.f85082g = C43013ch.m136515b();
        nVar.f85085j = C7163a.m22363a();
        return nVar;
    }

    private C32630h(Context context) {
        mo83996a(context);
    }

    /* renamed from: b */
    public static synchronized C32630h m105696b(Context context) {
        C32630h hVar;
        synchronized (C32630h.class) {
            if (f85069d == null) {
                f85069d = new C32630h(context.getApplicationContext());
            }
            hVar = f85069d;
        }
        return hVar;
    }

    /* renamed from: a */
    public final C32633j mo83992a(C32638o oVar, Context context) {
        if (C6776h.m20947b(context)) {
            m105698h();
        }
        return C32634k.m105708a((Application) C6399b.m19921a(), m105699i(), oVar);
    }

    /* renamed from: c */
    public final void mo84012c(Activity activity, final C43154a aVar) {
        if (!m105657e()) {
            m105654a(activity, (C43154a) new C43154a() {
                /* renamed from: a */
                public final void mo71375a() {
                    if (aVar != null) {
                        aVar.mo71375a();
                    }
                }

                /* renamed from: b */
                public final void mo71376b() {
                    if (aVar != null) {
                        aVar.mo71376b();
                    }
                }
            });
            return;
        }
        if (aVar != null) {
            aVar.mo71375a();
        }
    }
}
