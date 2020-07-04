package com.p280ss.android.ugc.aweme.journey;

import com.bytedance.dataplatform.C6324d;
import com.bytedance.dataplatform.p507a.C10034a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.language.C32330k;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import java.util.HashMap;
import java.util.Map;
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
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.journey.l */
public final class C32250l {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f84284a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32250l.class), "needShow", "getNeedShow()Z")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32250l.class), "needShowInternal", "getNeedShowInternal()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32250l.class), "isInterestSupportRegion", "isInterestSupportRegion()Z")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32250l.class), "abParams", "getAbParams()Ljava/lang/Integer;"))};

    /* renamed from: b */
    public static boolean f84285b;

    /* renamed from: c */
    public static final C32250l f84286c = new C32250l();

    /* renamed from: d */
    private static boolean f84287d;

    /* renamed from: e */
    private static String f84288e;

    /* renamed from: f */
    private static String[] f84289f = {"BR", "DE", "FR", "GB", "ID", "IN", "JP", "KR", "US", "VN", "TH", "AU"};

    /* renamed from: g */
    private static final C7541d f84290g = C7546e.m23569a(C32253c.f84298a);

    /* renamed from: h */
    private static final C7541d f84291h = C7546e.m23569a(C32254d.f84299a);

    /* renamed from: i */
    private static final C7541d f84292i = C7546e.m23568a(LazyThreadSafetyMode.NONE, C32252b.f84297a);

    /* renamed from: j */
    private static C22984d f84293j;

    /* renamed from: k */
    private static final C7541d f84294k = C7546e.m23568a(LazyThreadSafetyMode.NONE, C32251a.f84296a);

    /* renamed from: l */
    private static int f84295l;

    /* renamed from: com.ss.android.ugc.aweme.journey.l$a */
    static final class C32251a extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C32251a f84296a = new C32251a();

        C32251a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m104762a();
        }

        /* renamed from: a */
        private static Integer m104762a() {
            Integer a = C10034a.m29818a(true);
            C7573i.m23582a((Object) a, "result");
            C32250l.m104751a(C22984d.m75611a().mo59973a("result", AppLog.getAbSDKVersion()).mo59973a("sp_result", C6324d.m19634a("new_user_journey")).mo59970a("journey_result", a.intValue()).mo59973a("debuginfo", C6324d.m19637b("new_user_journey")));
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.l$b */
    static final class C32252b extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C32252b f84297a = new C32252b();

        C32252b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m104763a());
        }

        /* renamed from: a */
        private static boolean m104763a() {
            String g = C32330k.m104885g();
            for (String a : C32250l.m104754b()) {
                if (C7634n.m23717a(g, a, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.l$c */
    static final class C32253c extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C32253c f84298a = new C32253c();

        C32253c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m104764a());
        }

        /* renamed from: a */
        private static boolean m104764a() {
            boolean z;
            if (C32250l.f84286c.mo83471d() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || C32255m.m104766a(C6399b.m19921a())) {
                return z;
            }
            Keva.getRepo("new_user_journey").storeBoolean("new_user_journey_show", true);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.l$d */
    static final class C32254d extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C32254d f84299a = new C32254d();

        C32254d() {
            super(0);
        }

        /* renamed from: a */
        private static int m104765a() {
            return C32250l.f84286c.mo83474i();
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m104765a());
        }
    }

    private C32250l() {
    }

    /* renamed from: a */
    public static String m104749a() {
        return f84288e;
    }

    /* renamed from: b */
    public static String[] m104754b() {
        return f84289f;
    }

    /* renamed from: f */
    public static C22984d m104755f() {
        return f84293j;
    }

    /* renamed from: h */
    public static int m104756h() {
        return f84295l;
    }

    /* renamed from: c */
    public final boolean mo83470c() {
        return ((Boolean) f84290g.getValue()).booleanValue();
    }

    /* renamed from: d */
    public final int mo83471d() {
        return ((Number) f84291h.getValue()).intValue();
    }

    /* renamed from: e */
    public final boolean mo83472e() {
        return ((Boolean) f84292i.getValue()).booleanValue();
    }

    /* renamed from: g */
    public final Integer mo83473g() {
        return (Integer) f84294k.getValue();
    }

    /* renamed from: i */
    public final int mo83474i() {
        if (!C6399b.m19944t() || !C28580o.m93828a().booleanValue() || Keva.getRepo("new_user_journey").contains("new_user_journey_show")) {
            return -1;
        }
        Integer g = mo83473g();
        C7573i.m23582a((Object) g, "abParams");
        return g.intValue();
    }

    /* renamed from: a */
    public static void m104750a(int i) {
        f84295l = 1;
    }

    /* renamed from: a */
    public static void m104751a(C22984d dVar) {
        f84293j = dVar;
    }

    /* renamed from: a */
    public static void m104752a(String str) {
        f84288e = str;
    }

    /* renamed from: b */
    public static final String m104753b(int i) {
        if (f84287d || f84286c.mo83471d() == -1) {
            return null;
        }
        if (f84288e != null) {
            f84287d = true;
            return f84288e;
        } else if (i != 4) {
            return null;
        } else {
            HashMap hashMap = new HashMap();
            Map map = hashMap;
            Integer g = f84286c.mo83473g();
            C7573i.m23582a((Object) g, "abParams");
            map.put("recommend_group", g);
            map.put("special_type", Integer.valueOf(f84295l));
            return C42996by.m136485a(hashMap);
        }
    }
}
