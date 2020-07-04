package com.p280ss.android.ugc.aweme.p1685ug.guide;

import com.bytedance.dataplatform.p507a.C10034a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.journey.C32250l;
import com.p280ss.android.ugc.aweme.p1685ug.C42688c.C42689a;
import com.p280ss.android.ugc.aweme.setting.p1517e.C37624d;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.h */
public final class C42706h {

    /* renamed from: a */
    public static int f110991a = -1;

    /* renamed from: b */
    public static final C42707a f110992b = new C42707a(null);

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.h$a */
    public static final class C42707a {
        private C42707a() {
        }

        /* renamed from: d */
        private static int m135561d() {
            return C42706h.f110991a;
        }

        /* renamed from: g */
        private final boolean m135564g() {
            if (m135562e() == C37624d.f98093a) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        private final boolean m135565h() {
            if (m135562e() == C37624d.f98094b) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        private final boolean m135566i() {
            if (m135562e() == C37624d.f98095c) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        private final boolean m135567j() {
            if (m135562e() == C37624d.f98096d) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        private final boolean m135563f() {
            C42707a aVar = this;
            if (aVar.m135564g() || aVar.m135565h() || aVar.m135566i() || aVar.m135567j()) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final long mo104317b() {
            C42707a aVar = this;
            if (aVar.m135564g() || aVar.m135566i()) {
                return 1000;
            }
            return 3000;
        }

        /* renamed from: c */
        public final boolean mo104318c() {
            if (!C6399b.m19945u()) {
                return true;
            }
            C42707a aVar = this;
            if (aVar.m135564g() || aVar.m135565h()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        private final int m135562e() {
            if (!C42689a.m135545a().mo104287a("1576771200", 940)) {
                return 0;
            }
            if (m135561d() < 0) {
                Integer c = C10034a.m29820c(true);
                C7573i.m23582a((Object) c, "Experiments.getDouyinNewSwipeUpGuide(true)");
                m135560a(c.intValue());
            }
            return m135561d();
        }

        /* renamed from: a */
        public final boolean mo104316a() {
            if (C6399b.m19944t()) {
                if (C32250l.f84286c.mo83470c()) {
                    Integer g = C32250l.f84286c.mo83473g();
                    if (g != null && g.intValue() == 3) {
                        return false;
                    }
                }
                return true;
            } else if (!m135563f()) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a */
        private static void m135560a(int i) {
            C42706h.f110991a = i;
        }

        public /* synthetic */ C42707a(C7571f fVar) {
            this();
        }
    }
}
