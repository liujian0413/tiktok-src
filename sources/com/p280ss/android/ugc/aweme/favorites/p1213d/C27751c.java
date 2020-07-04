package com.p280ss.android.ugc.aweme.favorites.p1213d;

import com.bytedance.jedi.model.repository.C11994b;
import com.p280ss.android.ugc.aweme.favorites.adapter.C27733b;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27701f;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27702g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7496w;

/* renamed from: com.ss.android.ugc.aweme.favorites.d.c */
public final class C27751c extends C11994b {

    /* renamed from: a */
    public final List<C27702g> f73186a = new ArrayList();

    /* renamed from: b */
    public int f73187b;

    /* renamed from: c */
    private final C27750b f73188c = new C27750b();

    /* renamed from: b */
    public final int mo71235b() {
        if (this.f73186a.size() > this.f73187b) {
            return 2;
        }
        return 3;
    }

    /* renamed from: c */
    public final void mo71236c() {
        this.f73186a.clear();
        this.f73187b = 0;
    }

    /* renamed from: a */
    public final List<C27733b> mo71234a(int i) {
        List<C27733b> arrayList = new ArrayList<>();
        int i2 = 0;
        while (i2 < i && this.f73187b + i2 < this.f73186a.size()) {
            arrayList.add(new C27733b(0, this.f73186a.get(this.f73187b + i2)));
            i2++;
        }
        this.f73187b += i2;
        return arrayList;
    }

    /* renamed from: a */
    public final C7319aa<C27701f> mo71233a(int i, int i2) {
        C7319aa<C27701f> a = C7319aa.m22929a((C7496w<? extends T>) this.f73188c.mo29357c(new C27749a(i2, 12)));
        C7573i.m23582a((Object) a, "Single.fromObservable(po…stParams(cursor, count)))");
        return a;
    }
}
