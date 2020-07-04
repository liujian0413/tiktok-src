package com.bytedance.sdk.account.network.dispatcher;

import android.os.Looper;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.sdk.account.network.dispatcher.IRequest.Priority;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.account.network.dispatcher.c */
public abstract class C12901c implements C6310a, IRequest, Comparable<IRequest>, Runnable {

    /* renamed from: e */
    private static C12903e f34095e = C12903e.m37565a();

    /* renamed from: a */
    protected final AtomicBoolean f34096a = new AtomicBoolean(false);

    /* renamed from: b */
    protected final AtomicBoolean f34097b = new AtomicBoolean(false);

    /* renamed from: c */
    public final String f34098c;

    /* renamed from: d */
    protected final Priority f34099d;

    /* renamed from: f */
    private C6309f f34100f = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: g */
    private int f34101g;

    /* renamed from: d */
    public final Priority mo31367d() {
        return this.f34099d;
    }

    /* renamed from: e */
    public final int mo31368e() {
        return this.f34101g;
    }

    public void run() {
    }

    /* renamed from: a */
    public final boolean mo31378a() {
        return this.f34097b.get();
    }

    /* renamed from: c */
    public final void mo31380c() {
        this.f34097b.compareAndSet(false, true);
    }

    /* renamed from: g */
    public final void mo31383g() {
        this.f34100f.removeMessages(0);
    }

    /* renamed from: h */
    public final void mo31384h() {
        this.f34100f.removeMessages(1);
    }

    /* renamed from: f */
    public final void mo31382f() {
        mo31383g();
        this.f34100f.sendEmptyMessageDelayed(0, 1000);
    }

    /* renamed from: b */
    public final void mo31379b() {
        if (this.f34096a.compareAndSet(false, true)) {
            if (f34095e == null) {
                f34095e = C12903e.m37565a();
            }
            f34095e.mo31385a(this);
        }
    }

    /* renamed from: a */
    public final C12901c mo31377a(int i) {
        this.f34101g = i;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r1) {
        /*
            r0 = this;
            if (r1 != 0) goto L_0x0003
            return
        L_0x0003:
            int r1 = r1.what     // Catch:{ Throwable -> 0x0016 }
            switch(r1) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0009;
                default: goto L_0x0008;
            }     // Catch:{ Throwable -> 0x0016 }
        L_0x0008:
            goto L_0x0015
        L_0x0009:
            com.bytedance.sdk.account.network.dispatcher.e r1 = f34095e     // Catch:{ Throwable -> 0x0016 }
            r1.mo31387c()     // Catch:{ Throwable -> 0x0016 }
            goto L_0x0015
        L_0x000f:
            com.bytedance.sdk.account.network.dispatcher.e r1 = f34095e     // Catch:{ Throwable -> 0x0016 }
            r1.mo31386b()     // Catch:{ Throwable -> 0x0016 }
            goto L_0x0016
        L_0x0015:
            return
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.network.dispatcher.C12901c.handleMsg(android.os.Message):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compareTo(IRequest iRequest) {
        Priority d = mo31367d();
        Priority d2 = iRequest.mo31367d();
        if (d == null) {
            d = Priority.NORMAL;
        }
        if (d2 == null) {
            d2 = Priority.NORMAL;
        }
        if (d == d2) {
            return mo31368e() - iRequest.mo31368e();
        }
        return d2.ordinal() - d.ordinal();
    }

    protected C12901c(String str, Priority priority) {
        this.f34099d = priority;
        if (C6319n.m19593a(str)) {
            str = getClass().getSimpleName();
        }
        this.f34098c = str;
    }
}
