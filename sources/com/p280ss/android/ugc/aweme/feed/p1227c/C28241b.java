package com.p280ss.android.ugc.aweme.feed.p1227c;

import android.app.Activity;
import android.support.p022v4.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.c.b */
public final class C28241b {

    /* renamed from: a */
    private List<C28231a> f74400a = new ArrayList();

    /* renamed from: a */
    public final void mo71852a() {
        for (C28231a c : this.f74400a) {
            c.mo71836c();
        }
    }

    /* renamed from: a */
    public final void mo71855a(C28231a aVar) {
        if (!this.f74400a.contains(aVar)) {
            this.f74400a.add(aVar);
        }
    }

    /* renamed from: b */
    public final void mo71858b(String str) {
        for (C28231a aVar : this.f74400a) {
            aVar.f74357d = str;
        }
    }

    /* renamed from: a */
    public final void mo71853a(int i) {
        for (C28231a aVar : this.f74400a) {
            aVar.f74358e = i;
        }
    }

    /* renamed from: a */
    public final void mo71856a(String str) {
        for (C28231a a_ : this.f74400a) {
            a_.mo71835a_(str);
        }
    }

    /* renamed from: a */
    public final void mo71857a(boolean z) {
        for (C28231a aVar : this.f74400a) {
            aVar.f74361h = z;
        }
    }

    /* renamed from: a */
    public final void mo71854a(Activity activity, Fragment fragment) {
        for (C28231a a : this.f74400a) {
            a.mo71834a(activity, fragment);
        }
    }
}
