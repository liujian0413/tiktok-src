package com.p280ss.android.ugc.aweme.antiaddic.p1012c;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.C22554a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.AntiAddictionTipActivity;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.TeenagerModeAppealActivity;
import com.p280ss.android.ugc.aweme.antiaddic.p1011b.C22559a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.Calendar;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.c.a */
public final class C22563a extends C22554a {

    /* renamed from: a */
    public static final C22564a f60116a = new C22564a(null);

    /* renamed from: b */
    private static final int f60117b = 22;

    /* renamed from: c */
    private static final int f60118c = 6;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.c.a$a */
    public static final class C22564a {
        private C22564a() {
        }

        public /* synthetic */ C22564a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private static boolean m74585a() {
        int i = Calendar.getInstance().get(11);
        if (i >= f60117b || i < f60118c) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m74586b() {
        if (!C6776h.m20947b(C6399b.m19921a()) || C6405d.m19987h()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m74589e() {
        long currentTimeMillis = System.currentTimeMillis();
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl ak = a.mo60067ak();
        C7573i.m23582a((Object) ak, "CommonSharePrefCache.ins…lastShowAntiAddictionTime");
        Object d = ak.mo59877d();
        C7573i.m23582a(d, "CommonSharePrefCache.ins…owAntiAddictionTime.cache");
        if (currentTimeMillis - ((Number) d).longValue() > 57600000) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final void m74588d() {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(11);
        int i2 = instance.get(13);
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl aj = a.mo60066aj();
        C7573i.m23582a((Object) aj, "CommonSharePrefCache.ins…hownAntiAddictionTipToday");
        Object d = aj.mo59877d();
        C7573i.m23582a(d, "CommonSharePrefCache.ins…tiAddictionTipToday.cache");
        if (!((Boolean) d).booleanValue()) {
            return;
        }
        if ((i > f60118c && i < f60117b) || ((i == f60118c && i2 > 0) || m74589e())) {
            C23060u a2 = C23060u.m75742a();
            C7573i.m23582a((Object) a2, "CommonSharePrefCache.inst()");
            C22903bl aj2 = a2.mo60066aj();
            C7573i.m23582a((Object) aj2, "CommonSharePrefCache.ins…hownAntiAddictionTipToday");
            aj2.mo59871a(Boolean.valueOf(false));
        }
    }

    /* renamed from: c */
    private final void m74587c() {
        Activity g = C6405d.m19984g();
        if (!(g instanceof AntiAddictionTipActivity)) {
            if (g != null && !g.isFinishing() && m74585a()) {
                C23060u a = C23060u.m75742a();
                C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
                C22903bl aj = a.mo60066aj();
                C7573i.m23582a((Object) aj, "CommonSharePrefCache.ins…hownAntiAddictionTipToday");
                if (!((Boolean) aj.mo59877d()).booleanValue()) {
                    Intent intent = null;
                    C23060u a2 = C23060u.m75742a();
                    C7573i.m23582a((Object) a2, "CommonSharePrefCache.inst()");
                    C22903bl i = a2.mo60079i();
                    C7573i.m23582a((Object) i, "CommonSharePrefCache.inst().isForceMinor");
                    Object d = i.mo59877d();
                    C7573i.m23582a(d, "CommonSharePrefCache.inst().isForceMinor.cache");
                    if (((Boolean) d).booleanValue()) {
                        intent = new Intent(g, TeenagerModeAppealActivity.class);
                        intent.putExtra("type", 1);
                    } else if (!C22603f.m74729e()) {
                        intent = new Intent(g, AntiAddictionTipActivity.class);
                    }
                    if (intent != null) {
                        g.startActivity(intent);
                        C23060u a3 = C23060u.m75742a();
                        C7573i.m23582a((Object) a3, "CommonSharePrefCache.inst()");
                        C22903bl ak = a3.mo60067ak();
                        C7573i.m23582a((Object) ak, "CommonSharePrefCache.ins…lastShowAntiAddictionTime");
                        ak.mo59871a(Long.valueOf(System.currentTimeMillis()));
                        IAccountUserService a4 = C21115b.m71197a();
                        C7573i.m23582a((Object) a4, "AccountUserProxyService.get()");
                        C6907h.m21524a("time_lock_block_show", (Map) C22984d.m75611a().mo59973a("enter_from", "night_block").mo59970a("is_login", a4.isLogin() ? 1 : 0).f60753a);
                    }
                }
            }
        } else if (!m74585a()) {
            C42961az.m136380a(new C22559a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (((java.lang.Boolean) r1).booleanValue() != false) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59194a(long r1, long r3) {
        /*
            r0 = this;
            boolean r1 = com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isSelfContentFilterOn()
            if (r1 != 0) goto L_0x0029
            com.ss.android.ugc.aweme.app.u r1 = com.p280ss.android.ugc.aweme.app.C23060u.m75742a()
            java.lang.String r2 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.app.bl r1 = r1.mo60079i()
            java.lang.String r2 = "CommonSharePrefCache.inst().isForceMinor"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.Object r1 = r1.mo59877d()
            java.lang.String r2 = "CommonSharePrefCache.inst().isForceMinor.cache"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0035
        L_0x0029:
            boolean r1 = m74586b()
            if (r1 == 0) goto L_0x0032
            r0.m74587c()
        L_0x0032:
            r0.m74588d()
        L_0x0035:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.antiaddic.p1012c.C22563a.mo59194a(long, long):boolean");
    }
}
