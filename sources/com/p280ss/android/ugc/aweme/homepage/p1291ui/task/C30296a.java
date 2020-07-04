package com.p280ss.android.ugc.aweme.homepage.p1291ui.task;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.task.a */
public final class C30296a {

    /* renamed from: a */
    public static final C30296a f79657a = new C30296a();

    private C30296a() {
    }

    /* renamed from: a */
    private static Keva m99052a() {
        Keva repoFromSp = Keva.getRepoFromSp(C6399b.m19921a(), "TabStatus", 0);
        C7573i.m23582a((Object) repoFromSp, "Keva.getRepoFromSp(AppCo…ants.MODE_SINGLE_PROCESS)");
        return repoFromSp;
    }

    /* renamed from: a */
    public final void mo79793a(int i) {
        m99052a().storeInt("last_tab_id", i);
    }

    /* renamed from: b */
    public final int mo79794b(int i) {
        return m99052a().getInt("last_tab_id", 0);
    }
}
