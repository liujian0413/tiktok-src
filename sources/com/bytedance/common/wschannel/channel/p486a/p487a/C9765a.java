package com.bytedance.common.wschannel.channel.p486a.p487a;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9783b;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Response;
import okio.ByteString;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.a */
final class C9765a {

    /* renamed from: a */
    public final C9768a f26546a;

    /* renamed from: b */
    public long f26547b = this.f26552g;

    /* renamed from: c */
    public AtomicBoolean f26548c = new AtomicBoolean(false);

    /* renamed from: d */
    public long f26549d = DouPlusShareGuideExperiment.MIN_VALID_DURATION;

    /* renamed from: e */
    private final Handler f26550e;

    /* renamed from: f */
    private long f26551f = 270000;

    /* renamed from: g */
    private long f26552g = this.f26551f;

    /* renamed from: h */
    private C9783b f26553h;

    /* renamed from: i */
    private Runnable f26554i = new Runnable() {
        public final void run() {
            if (C9765a.this.f26548c.getAndSet(false)) {
                C9765a.this.mo24190c();
                if (C9765a.this.f26546a != null) {
                    C9765a.this.f26546a.mo24193a();
                }
            }
        }
    };

    /* renamed from: j */
    private Runnable f26555j = new Runnable() {
        public final void run() {
            C9765a.this.mo24189b();
            C9765a.this.mo24186a();
        }
    };

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.a$a */
    interface C9768a {
        /* renamed from: a */
        void mo24193a();
    }

    /* renamed from: b */
    public final void mo24189b() {
        try {
            if (this.f26553h != null) {
                this.f26553h.mo24213d(ByteString.EMPTY);
                m28799d();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private void m28799d() {
        this.f26548c.set(true);
        this.f26550e.removeCallbacks(this.f26554i);
        this.f26550e.postDelayed(this.f26554i, this.f26549d);
    }

    /* renamed from: a */
    public final void mo24186a() {
        long j = this.f26551f;
        this.f26550e.removeCallbacks(this.f26555j);
        this.f26550e.postDelayed(this.f26555j, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo24190c() {
        this.f26550e.removeCallbacks(this.f26554i);
        this.f26550e.removeCallbacks(this.f26555j);
        this.f26548c.set(false);
    }

    /* renamed from: a */
    private void m28798a(Response response) {
        String[] split;
        if (response != null) {
            String header = response.header("Handshake-Options");
            if (header != null) {
                for (String str : header.split(";")) {
                    if (!TextUtils.isEmpty(str)) {
                        String[] split2 = str.split("=");
                        if ("ping-interval".equals(split2[0])) {
                            try {
                                this.f26551f = Long.parseLong(split2[1]) * 1000;
                                return;
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24187a(C9783b bVar, Response response) {
        this.f26553h = bVar;
        m28798a(response);
        mo24186a();
    }

    C9765a(Handler handler, C9768a aVar) {
        this.f26550e = handler;
        this.f26546a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24188a(C9783b bVar, ByteString byteString) {
        this.f26548c.set(false);
        this.f26550e.removeCallbacks(this.f26554i);
    }
}
