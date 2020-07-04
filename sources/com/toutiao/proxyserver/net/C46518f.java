package com.toutiao.proxyserver.net;

import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.frameworks.baselib.network.http.C10104a.C10106a;
import com.bytedance.ttnet.p671c.C12955b;
import com.toutiao.proxyserver.C46534r;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.toutiao.proxyserver.net.f */
public final class C46518f extends C12955b {

    /* renamed from: F */
    private static final AtomicBoolean f119852F = new AtomicBoolean();

    /* renamed from: C */
    public String f119853C = "20181113_playtest";

    /* renamed from: D */
    public boolean f119854D = C46534r.f119902i;

    /* renamed from: E */
    public int f119855E;

    /* renamed from: c */
    public static void m146224c() {
        if (!f119852F.getAndSet(true)) {
            C10104a.m30003a(new C10106a() {
            });
        }
    }
}
