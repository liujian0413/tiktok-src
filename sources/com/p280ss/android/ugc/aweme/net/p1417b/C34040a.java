package com.p280ss.android.ugc.aweme.net.p1417b;

import com.p280ss.android.ugc.networkspeed.C44903d.C44904a;
import com.p280ss.android.ugc.networkspeed.C44905e;
import com.toutiao.proxyserver.speed.C46543a;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.aweme.net.b.a */
public final class C34040a implements C44904a {

    /* renamed from: a */
    private double f88793a;

    /* renamed from: a */
    public final double mo86732a(Queue<C44905e> queue, C44905e[] eVarArr) {
        return this.f88793a;
    }

    /* renamed from: b */
    public final double mo86733b(Queue<C44905e> queue, C44905e[] eVarArr) {
        double b = C46543a.m146292a().mo115720b() * 1000.0d;
        if (b < 0.0d) {
            b = -1.0d;
        }
        this.f88793a = b;
        return this.f88793a;
    }
}
