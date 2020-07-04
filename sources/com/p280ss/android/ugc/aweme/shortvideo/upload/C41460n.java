package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.google.common.base.C17454q;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.n */
public final class C41460n {

    /* renamed from: a */
    C17454q f107844a;

    /* renamed from: a */
    public final void mo102126a() {
        this.f107844a = C17454q.m58004b();
    }

    /* renamed from: a */
    public final void mo102127a(long j) {
        if (this.f107844a.f48412a) {
            m132124b(j);
            this.f107844a.mo44943d();
        }
    }

    /* renamed from: b */
    private void m132124b(long j) {
        C6893q.m21447a("publish_log_parallel", C38510bb.m123095a().mo96480a("duration", Long.valueOf(this.f107844a.mo44941a(TimeUnit.MILLISECONDS))).mo96478a("upload_speed", Float.valueOf((((float) j) * 1.0f) / ((float) this.f107844a.mo44941a(TimeUnit.MILLISECONDS)))).mo96482b());
    }
}
