package com.p280ss.android.ugc.aweme.freeflowcard.p1279b;

import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.net.C25706a;
import com.p280ss.android.ugc.aweme.freeflowcard.p1278a.C29970b;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.b.e */
public final class C29976e implements C29975d {

    /* renamed from: a */
    public static final C29976e f78783a;

    /* renamed from: b */
    private static final String f78784b = f78784b;

    /* renamed from: c */
    private static volatile boolean f78785c;

    /* renamed from: d */
    private static volatile boolean f78786d;

    private C29976e() {
    }

    /* renamed from: b */
    public final boolean mo76170b() {
        return m98286a();
    }

    static {
        C29976e eVar = new C29976e();
        f78783a = eVar;
        C42961az.m136382c(eVar);
    }

    /* renamed from: a */
    private static boolean m98286a() {
        C6900g b = C6900g.m21454b();
        C7573i.m23582a((Object) b, "NetworkStateManager.getInstance()");
        if (b.mo16943d()) {
            C6900g b2 = C6900g.m21454b();
            C7573i.m23582a((Object) b2, "NetworkStateManager.getInstance()");
            if (!b2.mo16942c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m98287b(boolean z) {
        f78786d = z;
    }

    @C7709l(mo20402c = 1)
    public final void onNetworkChanged(C25706a aVar) {
        C7573i.m23587b(aVar, "event");
        if (m98286a()) {
            f78785c = false;
        }
    }

    /* renamed from: a */
    public final boolean mo76168a(boolean z) {
        if (!f78785c && !C29972a.f78779b && !z && !f78786d) {
            f78785c = true;
            C10761a.m31409e(C6399b.m19921a(), (int) R.string.c_m).mo25750a();
            String str = f78784b;
            C22984d dVar = new C22984d();
            dVar.mo59973a("enter_from", C29972a.f78778a);
            C6907h.m21524a(str, (Map) dVar.f60753a);
            C29970b.m98268a("popups");
        }
        return true;
    }
}
