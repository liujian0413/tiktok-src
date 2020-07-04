package com.bytedance.android.live.core.rxutils;

import com.bytedance.android.live.base.model.exception.NetworkErrorException;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.live.core.rxutils.h */
public final class C3299h implements C7327h<C7492s<Throwable>, C7496w<?>> {

    /* renamed from: a */
    public final int f10031a;

    /* renamed from: b */
    public final long f10032b;

    /* renamed from: c */
    public int f10033c;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7496w<?> apply(C7492s<Throwable> sVar) throws Exception {
        return sVar.mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) new C7327h<Throwable, C7496w<?>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C7496w<?> apply(Throwable th) throws Exception {
                if ((th instanceof NetworkErrorException) && C3299h.m12362a((NetworkErrorException) th)) {
                    return C7492s.m23289a(th);
                }
                C3299h hVar = C3299h.this;
                int i = hVar.f10033c + 1;
                hVar.f10033c = i;
                if (i <= C3299h.this.f10031a) {
                    return C7492s.m23295b(C3299h.this.f10032b, TimeUnit.MILLISECONDS);
                }
                return C7492s.m23289a(th);
            }
        });
    }

    /* renamed from: a */
    public static boolean m12362a(NetworkErrorException networkErrorException) {
        if (networkErrorException.getStatusCode() < 500 || networkErrorException.getStatusCode() > 599) {
            return false;
        }
        return true;
    }

    public C3299h(int i, long j) {
        if (i <= 0) {
            i = 1;
        }
        this.f10031a = i;
        if (j <= 0) {
            j = 500;
        }
        this.f10032b = j;
    }
}
