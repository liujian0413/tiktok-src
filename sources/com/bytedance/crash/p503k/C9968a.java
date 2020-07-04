package com.bytedance.crash.p503k;

import android.os.Handler;

/* renamed from: com.bytedance.crash.k.a */
public abstract class C9968a implements Runnable {

    /* renamed from: a */
    public Handler f27203a;

    /* renamed from: b */
    public final long f27204b;

    /* renamed from: c */
    public final long f27205c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24600a() {
        if (this.f27204b > 0) {
            this.f27203a.postDelayed(this, this.f27204b);
        } else {
            this.f27203a.post(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24601a(long j) {
        if (j > 0) {
            this.f27203a.postDelayed(this, j);
        } else {
            this.f27203a.post(this);
        }
    }

    C9968a(Handler handler, long j, long j2) {
        this.f27203a = handler;
        this.f27204b = j;
        this.f27205c = j2;
    }
}
