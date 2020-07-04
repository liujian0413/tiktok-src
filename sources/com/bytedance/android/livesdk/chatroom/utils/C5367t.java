package com.bytedance.android.livesdk.chatroom.utils;

import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.t */
public final class C5367t implements C9302a {

    /* renamed from: a */
    private static long f15640a = 10000;

    /* renamed from: b */
    private long f15641b;

    /* renamed from: c */
    private C9301a f15642c = new C9301a(this);

    /* renamed from: d */
    private boolean f15643d;

    /* renamed from: e */
    private boolean f15644e;

    /* renamed from: f */
    private boolean f15645f;

    /* renamed from: g */
    private boolean f15646g = true;

    /* renamed from: a */
    public final void mo13638a() {
        if (!this.f15643d) {
            this.f15643d = true;
            this.f15641b = SystemClock.elapsedRealtime();
            this.f15642c.sendEmptyMessageDelayed(100, f15640a);
        }
    }

    /* renamed from: b */
    public final void mo13639b() {
        if (this.f15643d) {
            this.f15645f = true;
            this.f15642c.removeCallbacksAndMessages(null);
            m17098g();
        }
    }

    /* renamed from: c */
    public final void mo13640c() {
        if (this.f15643d && this.f15645f) {
            this.f15645f = false;
            this.f15641b = SystemClock.elapsedRealtime();
            this.f15642c.sendEmptyMessageDelayed(100, f15640a);
        }
    }

    /* renamed from: d */
    public final void mo13641d() {
        if (this.f15643d && !this.f15645f) {
            this.f15643d = false;
            this.f15644e = true;
            this.f15642c.removeCallbacksAndMessages(null);
            m17098g();
        }
    }

    /* renamed from: e */
    public final void mo13642e() {
        this.f15643d = false;
        this.f15644e = false;
        this.f15645f = false;
        this.f15646g = true;
        this.f15642c.removeCallbacksAndMessages(null);
    }

    /* renamed from: f */
    private void m17097f() {
        ((C3495l) C3596c.m13172a(C3495l.class)).getLiveWatchTime().onNext(Long.valueOf(f15640a));
        this.f15641b = SystemClock.elapsedRealtime();
        this.f15642c.sendEmptyMessageDelayed(100, f15640a);
    }

    /* renamed from: g */
    private void m17098g() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f15641b;
        if (!this.f15646g || elapsedRealtime >= 10000) {
            ((C3495l) C3596c.m13172a(C3495l.class)).getLiveWatchTime().onNext(Long.valueOf((elapsedRealtime / 1000) * 1000));
        }
    }

    /* renamed from: a */
    public final void mo12403a(Message message) {
        if (!this.f15644e && message.what == 100) {
            if (this.f15646g) {
                this.f15646g = false;
            }
            m17097f();
        }
    }
}
