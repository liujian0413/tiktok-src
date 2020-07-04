package com.p280ss.android.ugc.aweme.discover.speed;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.music.presenter.C33809j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.speed.a */
public final class C26874a {

    /* renamed from: a */
    public static final C26874a f70890a = new C26874a();

    /* renamed from: b */
    private static boolean f70891b;

    private C26874a() {
    }

    /* renamed from: b */
    public static boolean m88185b() {
        return f70891b;
    }

    /* renamed from: c */
    public static final boolean m88186c() {
        if (!m88184a() || f70891b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m88184a() {
        if (C6399b.m19944t() && C6384b.m19835a().mo15287a(DiscoverSpeedExperiment.class, true, "discover_speed_detail", C6384b.m19835a().mo15295d().discover_speed_detail, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m88183a(boolean z) {
        f70891b = true;
    }

    /* renamed from: a */
    public static final void m88182a(C25673a<Aweme, ?> aVar, List<? extends Aweme> list) {
        User user;
        C7573i.m23587b(aVar, "model");
        C7573i.m23587b(list, "items");
        if (m88184a()) {
            for (Aweme aweme : list) {
                if (aweme != null) {
                    user = aweme.getAuthor();
                } else {
                    user = null;
                }
                if (user != null) {
                    if (aweme.getStatistics() == null) {
                    }
                }
                return;
            }
            if (aVar instanceof C33809j) {
                ((C33809j) aVar).mo86426a(list);
            }
            if (aVar instanceof C23671a) {
                ((C23671a) aVar).mo61602b(list);
            }
        }
    }
}
