package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.common.base.C17454q;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gb */
public final class C39936gb implements C18245g<SynthetiseResult> {

    /* renamed from: a */
    File f103721a;

    /* renamed from: b */
    long f103722b;

    /* renamed from: c */
    C17454q f103723c = C17454q.m58004b();

    public final void onFailure(Throwable th) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onSuccess(SynthetiseResult synthetiseResult) {
        long a = this.f103723c.mo44941a(TimeUnit.MILLISECONDS);
        if (this.f103721a.exists()) {
            C6893q.m21447a("type_av_publish_concat", C6869c.m21381a().mo16884a("speed", Float.valueOf(((float) this.f103722b) / ((float) a))).mo16886a("processTime", Long.valueOf(a)).mo16888b());
        }
    }

    public C39936gb(String str, long j) {
        this.f103721a = new File(str);
        this.f103722b = j;
    }
}
