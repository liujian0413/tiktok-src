package com.p280ss.android.ugc.aweme.utils.p1693b;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;

/* renamed from: com.ss.android.ugc.aweme.utils.b.a */
public final class C42964a {

    /* renamed from: a */
    private C42966b f111527a;

    /* renamed from: com.ss.android.ugc.aweme.utils.b.a$a */
    public interface C42965a {
        /* renamed from: a */
        void mo57302a(int i, int i2, Intent intent);
    }

    public C42964a(Activity activity) {
        this.f111527a = m136391a(activity);
    }

    /* renamed from: b */
    private static C42966b m136392b(Activity activity) {
        return (C42966b) activity.getFragmentManager().findFragmentByTag("AvoidOnActivityResult");
    }

    /* renamed from: a */
    private C42966b m136391a(Activity activity) {
        boolean z;
        C42966b b = m136392b(activity);
        if (b == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return b;
        }
        C42966b bVar = new C42966b();
        FragmentManager fragmentManager = activity.getFragmentManager();
        fragmentManager.beginTransaction().add(bVar, "AvoidOnActivityResult").commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
        return bVar;
    }

    /* renamed from: a */
    public final void mo104674a(Intent intent, int i, C42965a aVar) {
        this.f111527a.mo104675a(intent, i, aVar);
    }
}
