package com.p280ss.android.ugc.aweme.filter.p1242a;

import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.ugc.aweme.beauty.C23537g;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27414b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27416b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27419e;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42191b;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import java.io.File;
import java.util.Collection;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.a.a */
public final class C29183a extends C27416b<C23537g, Void> {

    /* renamed from: f */
    public static final C29184a f77080f = new C29184a(null);

    /* renamed from: com.ss.android.ugc.aweme.filter.a.a$a */
    public static final class C29184a {
        private C29184a() {
        }

        public /* synthetic */ C29184a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo70525a() {
        return C42191b.m134227b(((C23537g) this.f72333e).f62121a);
    }

    /* renamed from: c */
    public final void mo70528c(C27414b<C23537g, Void> bVar) {
        C7573i.m23587b(bVar, "callback");
        C42194c.f109764a.mo103640b(((C23537g) this.f72333e).f62121a);
        bVar.mo70508b(this);
    }

    /* renamed from: b */
    public final void mo70527b(C27414b<C23537g, Void> bVar) {
        boolean z;
        C7573i.m23587b(bVar, "callback");
        File file = new File(((C23537g) this.f72333e).f62121a.getEffect().getZipPath());
        UrlModel fileUrl = ((C23537g) this.f72333e).f62121a.getEffect().getFileUrl();
        if (fileUrl != null) {
            Collection urlList = fileUrl.getUrlList();
            if (urlList == null || urlList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                fileUrl = null;
            }
            if (fileUrl != null) {
                Downloader.with(C35574k.m114861b()).url((String) fileUrl.getUrlList().get(0)).savePath(file.getParent()).name(file.getName()).subThreadListener(new C29186c(this, bVar)).download();
                return;
            }
        }
        this.f72332d = new C27419e(Integer.valueOf(-1), "", null);
        bVar.mo70512c(this);
    }

    public C29183a(String str, C23537g gVar) {
        C7573i.m23587b(str, "mTaskId");
        C7573i.m23587b(gVar, "mParam");
        super(str, gVar);
    }
}
