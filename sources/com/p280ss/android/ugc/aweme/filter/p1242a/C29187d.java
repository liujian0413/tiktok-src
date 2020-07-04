package com.p280ss.android.ugc.aweme.filter.p1242a;

import bolts.C1592h;
import com.bytedance.apm.util.C9653q;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27414b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27416b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27419e;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.C29340y;
import com.p280ss.android.ugc.aweme.filter.C29341z;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.a.d */
public final class C29187d {

    /* renamed from: a */
    public final C27416b<C29296g, Void> f77083a;

    /* renamed from: b */
    private long f77084b;

    /* renamed from: c */
    private final C27414b<C29296g, Void> f77085c;

    /* renamed from: d */
    private final String f77086d;

    /* renamed from: com.ss.android.ugc.aweme.filter.a.d$a */
    static final class C29188a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C29187d f77087a;

        C29188a(C29187d dVar) {
            this.f77087a = dVar;
        }

        public final /* synthetic */ Object call() {
            m95812a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m95812a() {
            C29341z.m96268d((C29296g) this.f77087a.f77083a.f72333e);
        }
    }

    /* renamed from: a */
    public final void mo74788a() {
        this.f77084b = System.currentTimeMillis();
    }

    /* renamed from: c */
    private final void m95808c() {
        if (C9653q.m28546a()) {
            C1592h.m7853a((Callable<TResult>) new C29188a<TResult>(this));
        } else {
            C29341z.m96268d((C29296g) this.f77083a.f72333e);
        }
    }

    /* renamed from: b */
    public final void mo74790b() {
        C29340y.m96241a().mo75016b((C29296g) this.f77083a.f72333e);
        this.f77083a.mo70523a(3);
        this.f77083a.f72331c = null;
        this.f77085c.mo70508b(this.f77083a);
        if (!this.f77083a.f72330b) {
            m95808c();
        }
        C6893q.m21444a("filter_download_error_rate", 0, C6869c.m21381a().mo16882a("tools_use_downloader", Boolean.valueOf(true)).mo16887a("url", this.f77086d).mo16887a("duration", String.valueOf(System.currentTimeMillis() - this.f77084b)).mo16888b());
    }

    /* renamed from: b */
    private static String m95807b(Exception exc) {
        String b = C41530am.m132282b((Throwable) exc);
        C7573i.m23582a((Object) b, "ToolsLogUtil.getStackTraceString(e)");
        return b;
    }

    /* renamed from: a */
    public final void mo74789a(Exception exc) {
        String str;
        this.f77083a.mo70523a(4);
        C27416b<C29296g, Void> bVar = this.f77083a;
        Integer valueOf = Integer.valueOf(-1);
        String str2 = null;
        if (exc != null) {
            str = exc.getMessage();
        } else {
            str = null;
        }
        bVar.f72332d = new C27419e(valueOf, str, exc);
        this.f77085c.mo70512c(this.f77083a);
        StringBuilder sb = new StringBuilder("failed download filter : ");
        sb.append(((C29296g) this.f77083a.f72333e).f77266a);
        sb.append(", reason : ");
        if (exc != null) {
            str2 = exc.getMessage();
        }
        sb.append(str2);
        C6893q.m21444a("filter_download_error_rate", 1, C6869c.m21381a().mo16887a("exception", m95807b(exc)).mo16882a("tools_use_downloader", Boolean.valueOf(true)).mo16887a("url", this.f77086d).mo16885a("filter_id", Integer.valueOf(((C29296g) this.f77083a.f72333e).f77266a)).mo16887a("filter_name", ((C29296g) this.f77083a.f72333e).f77267b).mo16888b());
    }

    public C29187d(C27416b<C29296g, Void> bVar, C27414b<C29296g, Void> bVar2, String str) {
        C7573i.m23587b(bVar, "task");
        C7573i.m23587b(bVar2, "callback");
        C7573i.m23587b(str, "url");
        this.f77083a = bVar;
        this.f77085c = bVar2;
        this.f77086d = str;
    }
}
