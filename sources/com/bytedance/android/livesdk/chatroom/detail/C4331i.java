package com.bytedance.android.livesdk.chatroom.detail;

import android.os.CountDownTimer;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.i */
public final class C4331i {

    /* renamed from: a */
    private CountDownTimer f12630a;

    /* renamed from: b */
    private CountDownTimer f12631b;

    /* renamed from: c */
    private CountDownTimer f12632c;

    public C4331i() {
        m14580e();
    }

    /* renamed from: b */
    public final void mo12045b() {
        if (this.f12632c != null) {
            this.f12632c.start();
        }
    }

    /* renamed from: d */
    public final void mo12047d() {
        mo12046c();
        this.f12630a = null;
        this.f12631b = null;
        this.f12632c = null;
    }

    /* renamed from: a */
    public final void mo12044a() {
        if (this.f12630a != null) {
            this.f12630a.start();
        }
        if (this.f12631b != null) {
            this.f12631b.start();
        }
    }

    /* renamed from: c */
    public final void mo12046c() {
        if (this.f12630a != null) {
            this.f12630a.cancel();
        }
        if (this.f12631b != null) {
            this.f12631b.cancel();
        }
        if (this.f12632c != null) {
            this.f12632c.cancel();
        }
    }

    /* renamed from: e */
    private void m14580e() {
        C43321 r0 = new CountDownTimer(3000, 3000) {
            public final void onFinish() {
            }

            public final void onTick(long j) {
            }
        };
        this.f12630a = r0;
        C43332 r7 = new CountDownTimer(6000, 6000) {
            public final void onFinish() {
            }

            public final void onTick(long j) {
            }
        };
        this.f12631b = r7;
        C43343 r1 = new CountDownTimer(3000, 3000) {
            public final void onFinish() {
            }

            public final void onTick(long j) {
            }
        };
        this.f12632c = r1;
    }
}
