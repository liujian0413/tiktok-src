package com.p280ss.android.ugc.aweme.commercialize.symphony;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.p073ad.symphony.C2114c;
import com.bytedance.p073ad.symphony.C2131d;
import com.bytedance.p073ad.symphony.p074a.p075a.C2087d;
import com.bytedance.p073ad.symphony.p074a.p075a.C2090f;
import com.bytedance.p073ad.symphony.p076b.C2113d;
import com.bytedance.p073ad.symphony.p076b.p077a.C2110h;
import com.bytedance.p073ad.symphony.p079d.C2132a;
import com.bytedance.p073ad.symphony.p079d.C2136b;
import com.bytedance.p073ad.symphony.p081e.C2141a;
import com.bytedance.p073ad.symphony.p083f.C2154c;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.commercialize.symphony.p1133a.C25148a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25245ar;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.model.AggregationSdk;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.lancet.SymphonyException;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager */
public class SymphonyAdManager implements C25147a {

    /* renamed from: b */
    private static volatile SymphonyAdManager f66278b;

    /* renamed from: a */
    public boolean f66279a;

    /* renamed from: c */
    private C2113d f66280c;

    /* renamed from: d */
    private Map<String, C2087d> f66281d = new HashMap();

    /* renamed from: e */
    private Map<String, C25148a> f66282e = new HashMap();

    /* renamed from: f */
    private boolean f66283f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager$SymphonyAdApi */
    public interface SymphonyAdApi {
        @C6457h
        C18253l<String> doGet(@C6450ac String str);
    }

    /* renamed from: a */
    public final boolean mo65649a(Context context, Aweme aweme, String str) {
        return m82671c(context, aweme, str) == 4;
    }

    /* renamed from: a */
    public static SymphonyAdManager m82664a() {
        if (f66278b == null) {
            synchronized (SymphonyAdManager.class) {
                if (f66278b == null) {
                    f66278b = new SymphonyAdManager();
                }
            }
        }
        return f66278b;
    }

    private SymphonyAdManager() {
        boolean z = false;
        this.f66283f = false;
        Context a = C6399b.m19921a();
        if (a != null) {
            SharedPreferences a2 = C7285c.m22838a(a, "sp_symphony", 0);
            boolean z2 = a2.getBoolean("enable_symphony_sdk_setting", true);
            if (a2.getBoolean("enable_symphony_sdk_ab", true) && z2) {
                z = true;
            }
            this.f66279a = z;
            return;
        }
        C6921a.m21555a("SymphonyAdManager AwemeApplication.getGlobalContext null");
        C6921a.m21559a((Throwable) new SymphonyException());
    }

    /* renamed from: b */
    public static void m82670b() {
        try {
            C7285c.m22838a(C6399b.m19921a(), "sp_symphony", 0).edit().putBoolean("enable_symphony_sdk_setting", C30199h.m98861a().getEnableSymphonySdk().booleanValue()).apply();
        } catch (NullValueException unused) {
        }
    }

    /* renamed from: b */
    public final View mo65650b(Context context) {
        return new SymphonyVideoView(context);
    }

    /* renamed from: e */
    private C2110h m82674e(final Context context) {
        C251132 r0 = new C2132a() {
            /* renamed from: a */
            public final void mo7817a() {
                SymphonyAdManager.this.mo65655d(context);
            }
        };
        C2110h hVar = new C2110h(context);
        hVar.mo7802a(r0);
        return hVar;
    }

    /* renamed from: f */
    private C2113d m82675f(Context context) {
        if (this.f66280c == null) {
            this.f66280c = C2114c.m9313a().f7224c;
        }
        return this.f66280c;
    }

    /* renamed from: d */
    public final void mo65655d(Context context) {
        m82675f(context).mo7780a("tiktok_cold_start_app_open");
    }

    /* renamed from: c */
    private static boolean m82672c(Aweme aweme) {
        if (aweme.isAd() && aweme.getAuthor() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static C2141a m82669b(Aweme aweme) {
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || !aweme.isAd()) {
            return null;
        }
        AggregationSdk aggregationSdk = aweme.getAwemeRawAd().getAggregationSdk();
        if (aggregationSdk == null) {
            return null;
        }
        return C2141a.m9362a(aggregationSdk.getCommonData());
    }

    /* renamed from: a */
    static final /* synthetic */ void m82667a(Exception exc) {
        StringBuilder sb = new StringBuilder("Symphony Error: ");
        sb.append(exc.toString());
        C42880h.m136156a(sb.toString());
    }

    /* renamed from: c */
    public final void mo65653c(Context context) {
        if (this.f66279a && !this.f66283f) {
            this.f66283f = true;
            C25151c cVar = new C25151c(context);
            C251121 r2 = new C2154c() {
                /* renamed from: a */
                public final String mo7835a() {
                    return C6399b.m19926b().f18690a;
                }

                /* renamed from: a */
                public final JSONObject mo7836a(String str) {
                    try {
                        return new JSONObject((String) ((SymphonyAdApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(SymphonyAdApi.class)).doGet(str).get());
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
            C2131d a = new C2131d(context, r2).mo7814a((C2136b) cVar).mo7813a(m82674e(context)).mo7815a(C25152d.f66354a).mo7816a(C7163a.m22363a());
            if (C6399b.m19946v() && ((Integer) SharePrefCache.inst().getPersonalizationMode().mo59877d()).intValue() != 1) {
                C2114c.m9316a(false);
            }
            if (C43122ff.m136767b()) {
                C2114c.m9316a(false);
            }
            C2114c.m9314a(a);
        }
    }

    /* renamed from: a */
    public static void m82668a(boolean z) {
        C7285c.m22838a(C6399b.m19921a(), "sp_symphony", 0).edit().putBoolean("enable_symphony_sdk_ab", z).apply();
    }

    /* renamed from: a */
    public final C2087d mo65645a(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        return (C2087d) this.f66281d.get(aweme.getAid());
    }

    /* renamed from: a */
    public final String mo65646a(Context context) {
        if (!this.f66279a) {
            return "";
        }
        if (!this.f66283f) {
            return "";
        }
        String a = C25245ar.m82990a(m82675f(context).mo7805a("tiktok_cold_start_app_open", true));
        if (TextUtils.isEmpty(a)) {
            a = "";
        }
        return a;
    }

    /* renamed from: d */
    private int m82673d(Context context, Aweme aweme) {
        return m82671c(context, aweme, null);
    }

    /* renamed from: a */
    public final boolean mo65648a(Context context, Aweme aweme) {
        return mo65652b(context, aweme, null);
    }

    /* renamed from: b */
    public final boolean mo65651b(Context context, Aweme aweme) {
        if (m82673d(context, aweme) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo65654c(Context context, Aweme aweme) {
        if (m82673d(context, aweme) == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m82666a(C25148a aVar, String str) {
        if (aVar != null && aVar.f66347b != null && aVar.f66347b.f7272a != null) {
            aVar.f66347b.f7272a.f7329d = str;
        }
    }

    /* renamed from: a */
    public final void mo65647a(Context context, List<Aweme> list) {
        LinkedList linkedList = null;
        if (list != null && !list.isEmpty()) {
            for (Aweme b : list) {
                C2141a b2 = m82669b(b);
                if (b2 != null) {
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                    }
                    linkedList.add(b2);
                }
            }
        }
        m82675f(context).mo7806a("tiktok_cold_start_app_open", (List<C2141a>) linkedList);
    }

    /* renamed from: b */
    public final boolean mo65652b(Context context, Aweme aweme, String str) {
        if (m82671c(context, aweme, str) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private int m82671c(Context context, Aweme aweme, String str) {
        C25148a aVar;
        C2087d dVar;
        if (aweme == null) {
            return 4;
        }
        if (aweme.isLive()) {
            return 0;
        }
        String aid = aweme.getAid();
        if (TextUtils.isEmpty(aid)) {
            return 4;
        }
        if (!aweme.isAd()) {
            return 0;
        }
        if (!C6399b.m19944t()) {
            return 1;
        }
        if (C25300bx.m83125a(aweme, 3)) {
            if (C25300bx.m83127a(aweme, true)) {
                return 3;
            }
            return 4;
        } else if (!this.f66279a) {
            if (m82672c(aweme)) {
                return 1;
            }
            return 4;
        } else if (C25352e.m83231n(aweme)) {
            return 1;
        } else {
            AggregationSdk aggregationSdk = aweme.getAwemeRawAd().getAggregationSdk();
            if (aggregationSdk == null) {
                return 4;
            }
            if (this.f66282e.containsKey(aid)) {
                aVar = (C25148a) this.f66282e.get(aid);
            } else {
                aVar = C25148a.m82733a(aggregationSdk.getCommonData());
                if (aVar == null) {
                    return 4;
                }
                this.f66282e.put(aid, aVar);
            }
            if (this.f66281d.containsKey(aid)) {
                dVar = (C2087d) this.f66281d.get(aid);
            } else if (context == null) {
                return 4;
            } else {
                m82666a(aVar, str);
                dVar = (C2087d) m82675f(context).mo7779a(aVar.f66347b, aVar.f66348c);
                if (dVar == null) {
                    return 4;
                }
                this.f66281d.put(aid, dVar);
            }
            if (!(dVar instanceof C2090f)) {
                return 2;
            }
            if (m82672c(aweme)) {
                return 1;
            }
            return 4;
        }
    }
}
