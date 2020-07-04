package com.p280ss.android.ugc.aweme.filter.p1242a;

import bolts.C1592h;
import com.bytedance.apm.util.C9653q;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.p1141b.C25653a.C25655a;
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

/* renamed from: com.ss.android.ugc.aweme.filter.a.g */
public final class C29193g implements C25655a {

    /* renamed from: a */
    public final C27416b<C29296g, Void> f77091a;

    /* renamed from: b */
    private long f77092b;

    /* renamed from: c */
    private final C27414b<C29296g, Void> f77093c;

    /* renamed from: com.ss.android.ugc.aweme.filter.a.g$a */
    static final class C29194a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C29193g f77094a;

        C29194a(C29193g gVar) {
            this.f77094a = gVar;
        }

        public final /* synthetic */ Object call() {
            m95824a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m95824a() {
            C29341z.m96268d((C29296g) this.f77094a.f77091a.f72333e);
        }
    }

    /* renamed from: a */
    private final void m95820a() {
        if (C9653q.m28546a()) {
            C1592h.m7853a((Callable<TResult>) new C29194a<TResult>(this));
        } else {
            C29341z.m96268d((C29296g) this.f77091a.f72333e);
        }
    }

    /* renamed from: a */
    private static String m95819a(Exception exc) {
        String b = C41530am.m132282b((Throwable) exc);
        C7573i.m23582a((Object) b, "ToolsLogUtil.getStackTraceString(e)");
        return b;
    }

    /* renamed from: a */
    public final void mo66541a(String str) {
        C29340y.m96241a().mo75016b((C29296g) this.f77091a.f72333e);
        this.f77091a.mo70523a(3);
        this.f77091a.f72331c = null;
        this.f77093c.mo70508b(this.f77091a);
        if (!this.f77091a.f72330b) {
            m95820a();
        }
        C6893q.m21444a("filter_download_error_rate", 0, C6869c.m21381a().mo16882a("tools_use_downloader", Boolean.valueOf(false)).mo16887a("url", str).mo16887a("duration", String.valueOf(System.currentTimeMillis() - this.f77092b)).mo16888b());
    }

    public C29193g(C27416b<C29296g, Void> bVar, C27414b<C29296g, Void> bVar2) {
        C7573i.m23587b(bVar, "task");
        C7573i.m23587b(bVar2, "callback");
        this.f77091a = bVar;
        this.f77093c = bVar2;
    }

    /* renamed from: a */
    public final void mo66542a(String str, int i) {
        if (this.f77092b == 0) {
            this.f77092b = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo66543a(String str, Exception exc) {
        String str2;
        this.f77091a.mo70523a(4);
        C27416b<C29296g, Void> bVar = this.f77091a;
        Integer valueOf = Integer.valueOf(-1);
        String str3 = null;
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = null;
        }
        bVar.f72332d = new C27419e(valueOf, str2, exc);
        this.f77093c.mo70512c(this.f77091a);
        StringBuilder sb = new StringBuilder("failed download filter : ");
        sb.append(((C29296g) this.f77091a.f72333e).f77266a);
        sb.append(", reason : ");
        if (exc != null) {
            str3 = exc.getMessage();
        }
        sb.append(str3);
        C6893q.m21444a("filter_download_error_rate", 1, C6869c.m21381a().mo16887a("exception", m95819a(exc)).mo16882a("tools_use_downloader", Boolean.valueOf(false)).mo16887a("url", str).mo16885a("filter_id", Integer.valueOf(((C29296g) this.f77091a.f72333e).f77266a)).mo16887a("filter_name", ((C29296g) this.f77091a.f72333e).f77267b).mo16888b());
    }
}
