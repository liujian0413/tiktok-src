package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.os.Handler;
import com.p280ss.android.medialib.p880b.C19622b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.p */
public final class C41394p implements C19622b {

    /* renamed from: a */
    public Handler f107706a;

    /* renamed from: b */
    public C19622b f107707b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.p$a */
    static final class C41395a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C41394p f107708a;

        /* renamed from: b */
        final /* synthetic */ int f107709b;

        C41395a(C41394p pVar, int i) {
            this.f107708a = pVar;
            this.f107709b = i;
        }

        public final void run() {
            this.f107708a.f107707b.mo52204a(this.f107709b);
        }
    }

    /* renamed from: a */
    public final void mo52204a(int i) {
        this.f107706a.post(new C41395a(this, i));
    }

    /* renamed from: a */
    public final void mo52205a(int i, int i2) {
        this.f107707b.mo52205a(i, i2);
    }

    public C41394p(Handler handler, C19622b bVar) {
        C7573i.m23587b(handler, "mHandler");
        C7573i.m23587b(bVar, "mNativeInitListener");
        this.f107706a = handler;
        this.f107707b = bVar;
    }
}
