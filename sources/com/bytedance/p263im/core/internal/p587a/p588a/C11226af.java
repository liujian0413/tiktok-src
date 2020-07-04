package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.core.internal.a.a.af */
final class C11226af extends C11280o {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        return true;
    }

    C11226af() {
        super(IMCMD.SEND_ONLINE.getValue());
    }

    /* renamed from: b */
    public static void m32897b() {
        int[] iArr = C11198c.m32777a().mo27248b().f30416p;
        if (iArr == null) {
            iArr = C11198c.m32777a().mo27248b().f30415o;
        }
        for (int i : iArr) {
            C11283p.m33057a();
            C11283p.m33059a(i);
        }
        C11283p.m33057a().mo27311d();
    }
}
