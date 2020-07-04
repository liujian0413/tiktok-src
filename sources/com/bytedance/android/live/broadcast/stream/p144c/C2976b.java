package com.bytedance.android.live.broadcast.stream.p144c;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;

/* renamed from: com.bytedance.android.live.broadcast.stream.c.b */
public final class C2976b implements Callback {

    /* renamed from: a */
    private Handler f9238a;

    /* renamed from: b */
    private boolean f9239b;

    /* renamed from: c */
    private final long f9240c;

    /* renamed from: d */
    private C2975a f9241d;

    /* renamed from: e */
    private int f9242e;

    /* renamed from: a */
    public final void mo9745a() {
        if (!this.f9239b) {
            this.f9242e = 2;
            m11539b(0);
            this.f9239b = true;
        }
    }

    /* renamed from: b */
    public final void mo9747b() {
        if (this.f9239b) {
            m11538a(2, 0);
        }
    }

    /* renamed from: c */
    public final void mo9748c() {
        if (this.f9239b) {
            m11538a(3, 0);
        }
    }

    public C2976b(C2975a aVar) {
        this(aVar, 0);
    }

    public final boolean handleMessage(Message message) {
        if (102 == message.what) {
            m11539b(0);
        }
        return true;
    }

    /* renamed from: b */
    private void m11539b(int i) {
        this.f9238a.removeMessages(102);
        this.f9241d.mo9085a(this.f9242e, i);
        if (4 != this.f9242e) {
            this.f9238a.sendEmptyMessageDelayed(102, this.f9240c);
        }
    }

    /* renamed from: a */
    public final void mo9746a(int i) {
        if (this.f9239b) {
            this.f9238a.removeMessages(102);
            this.f9239b = false;
            m11538a(4, i);
        }
    }

    /* renamed from: a */
    private void m11538a(int i, int i2) {
        this.f9242e = i;
        m11539b(i2);
    }

    private C2976b(C2975a aVar, long j) {
        this.f9242e = 1;
        this.f9238a = new Handler(this);
        this.f9240c = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
        this.f9241d = aVar;
    }
}
