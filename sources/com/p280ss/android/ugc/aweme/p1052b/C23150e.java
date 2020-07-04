package com.p280ss.android.ugc.aweme.p1052b;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.b.e */
public abstract class C23150e implements C23148c {

    /* renamed from: a */
    public final Activity f61095a;

    /* renamed from: com.ss.android.ugc.aweme.b.e$a */
    public class C23151a {

        /* renamed from: a */
        public final List<Pair<Integer, Integer>> f61096a = new ArrayList();

        /* renamed from: a */
        public final C23151a mo60294a(int i) {
            return mo60295a(i, 1);
        }

        /* renamed from: a */
        public final void mo60296a() {
            m76066a(0);
        }

        public C23151a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m76066a(long j) {
            C23150e.this.mo60293a(this, j);
        }

        /* renamed from: a */
        public final C23151a mo60295a(int i, int i2) {
            this.f61096a.add(C7579l.m23633a(Integer.valueOf(i), Integer.valueOf(i2)));
            return this;
        }
    }

    /* renamed from: a */
    public abstract void mo60293a(C23151a aVar, long j);

    /* renamed from: a */
    public final C23151a mo60292a() {
        return new C23151a();
    }

    public C23150e(Activity activity) {
        C7573i.m23587b(activity, "activity");
        this.f61095a = activity;
    }
}
