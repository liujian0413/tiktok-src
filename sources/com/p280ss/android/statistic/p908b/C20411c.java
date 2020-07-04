package com.p280ss.android.statistic.p908b;

import com.p280ss.android.statistic.C20408b;

/* renamed from: com.ss.android.statistic.b.c */
public final class C20411c implements C20409a {

    /* renamed from: a */
    private C20409a f55140a;

    public C20411c(C20409a aVar) {
        this.f55140a = aVar;
    }

    /* renamed from: a */
    public final boolean mo54953a(C20408b bVar) {
        boolean a = this.f55140a.mo54953a(bVar);
        if (a) {
            new StringBuilder("enqueue log is ").append(bVar.toString());
        } else {
            new StringBuilder("not enqueue log is ").append(bVar.toString());
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo54954a(C20408b bVar, String str) {
        boolean a = this.f55140a.mo54954a(bVar, str);
        if (a) {
            StringBuilder sb = new StringBuilder("send to ");
            sb.append(str);
            sb.append(" log is ");
            sb.append(bVar.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("not send to ");
            sb2.append(str);
            sb2.append(" log is ");
            sb2.append(bVar.toString());
        }
        return a;
    }
}
