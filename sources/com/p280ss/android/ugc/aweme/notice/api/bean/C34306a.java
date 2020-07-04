package com.p280ss.android.ugc.aweme.notice.api.bean;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.a */
public final class C34306a {

    /* renamed from: e */
    public static final C34307a f89444e = new C34307a(null);

    /* renamed from: a */
    public int f89445a;

    /* renamed from: b */
    public final int f89446b;

    /* renamed from: c */
    public final int f89447c;

    /* renamed from: d */
    public final String f89448d;

    /* renamed from: com.ss.android.ugc.aweme.notice.api.bean.a$a */
    public static final class C34307a {
        private C34307a() {
        }

        public /* synthetic */ C34307a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static int[] m110971a(int i) {
            switch (i) {
                case 0:
                    return new int[]{7};
                case 1:
                    return new int[]{3};
                case 2:
                    return new int[]{6};
                case 3:
                    return new int[]{44, 2, 43};
                default:
                    return new int[0];
            }
        }
    }

    /* renamed from: a */
    public static final int[] m110969a(int i) {
        return C34307a.m110971a(i);
    }

    /* renamed from: a */
    public final void mo87141a() {
        this.f89445a = 0;
    }

    public C34306a(int i, int i2, String str) {
        C7573i.m23587b(str, "title");
        this.f89446b = i;
        this.f89447c = i2;
        this.f89448d = str;
    }
}
