package com.p280ss.android.ugc.aweme.discover.base;

import java.util.LinkedList;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.base.j */
final class C26606j {

    /* renamed from: a */
    public static final C26607a f70164a = new C26607a(null);

    /* renamed from: b */
    private int f70165b = 100000;

    /* renamed from: c */
    private final LinkedList<Integer> f70166c = new LinkedList<>();

    /* renamed from: com.ss.android.ugc.aweme.discover.base.j$a */
    public static final class C26607a {
        private C26607a() {
        }

        public /* synthetic */ C26607a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public static boolean m87385a(int i) {
        return 100000 <= i && 110000 >= i;
    }

    /* renamed from: a */
    public final int mo68290a() {
        if (this.f70166c.size() > 0) {
            Object removeFirst = this.f70166c.removeFirst();
            C7573i.m23582a(removeFirst, "mRecycleList.removeFirst()");
            return ((Number) removeFirst).intValue();
        }
        int i = this.f70165b;
        if (i <= 110000) {
            this.f70165b++;
            return i;
        }
        throw new IllegalStateException("Your viewType is too much,it's impossible in common");
    }
}
