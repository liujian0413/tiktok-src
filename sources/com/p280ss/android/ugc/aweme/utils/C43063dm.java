package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;

/* renamed from: com.ss.android.ugc.aweme.utils.dm */
public final class C43063dm {

    /* renamed from: a */
    public static final C43063dm f111669a = new C43063dm();

    /* renamed from: b */
    private static long f111670b;

    private C43063dm() {
    }

    /* renamed from: a */
    public static final void m136614a() {
        C41530am.m132285d("click to open camera");
        f111670b = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static final void m136615b() {
        long currentTimeMillis = System.currentTimeMillis() - f111670b;
        StringBuilder sb = new StringBuilder("open camera to first frame cost = ");
        sb.append(currentTimeMillis);
        C41530am.m132285d(sb.toString());
    }

    /* renamed from: c */
    public static final void m136616c() {
        long currentTimeMillis = System.currentTimeMillis() - f111670b;
        StringBuilder sb = new StringBuilder("open camera to view visible cost = ");
        sb.append(currentTimeMillis);
        C41530am.m132285d(sb.toString());
    }
}
