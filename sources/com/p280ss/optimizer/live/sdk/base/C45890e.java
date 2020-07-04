package com.p280ss.optimizer.live.sdk.base;

import android.os.Handler;
import android.os.Looper;
import com.p280ss.optimizer.live.sdk.base.model.C45898a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.optimizer.live.sdk.base.e */
public final class C45890e {

    /* renamed from: a */
    public final Set<C45894a> f117310a = new HashSet();

    /* renamed from: b */
    public final Handler f117311b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final C45883a f117312c;

    /* renamed from: d */
    public C45898a f117313d = null;

    /* renamed from: e */
    public boolean f117314e = false;

    /* renamed from: f */
    public int f117315f = 0;

    /* renamed from: g */
    private final C45895f f117316g;

    /* renamed from: com.ss.optimizer.live.sdk.base.e$a */
    public interface C45894a {
        /* renamed from: a */
        void mo111175a(C45898a aVar);
    }

    /* renamed from: a */
    public final void mo111169a() {
        if (!this.f117314e) {
            this.f117314e = true;
            this.f117316g.mo111176a(new Runnable() {
                public final void run() {
                    final C45898a aVar;
                    try {
                        aVar = new C45898a(C45890e.this.f117312c.mo111162a("/video/live/qos/v2/ipSettings"));
                    } catch (Exception unused) {
                        aVar = null;
                    }
                    C45890e.this.f117311b.post(new Runnable() {
                        public final void run() {
                            C45890e.this.f117314e = false;
                            if (aVar == null) {
                                C45890e eVar = C45890e.this;
                                int i = eVar.f117315f + 1;
                                eVar.f117315f = i;
                                if (i <= 5) {
                                    C45890e.this.mo111170a(10000);
                                    return;
                                }
                                return;
                            }
                            C45890e.this.f117315f = 0;
                            C45890e.this.f117313d = aVar;
                            for (C45894a a : C45890e.this.f117310a) {
                                a.mo111175a(C45890e.this.f117313d);
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo111171a(C45894a aVar) {
        this.f117310a.add(aVar);
    }

    /* renamed from: a */
    public final void mo111170a(long j) {
        this.f117311b.removeCallbacksAndMessages(null);
        this.f117311b.postDelayed(new Runnable() {
            public final void run() {
                C45890e.this.mo111169a();
            }
        }, 10000);
    }

    C45890e(C45895f fVar, C45883a aVar) {
        this.f117316g = fVar;
        this.f117312c = aVar;
    }
}
