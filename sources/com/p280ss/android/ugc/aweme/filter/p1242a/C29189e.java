package com.p280ss.android.ugc.aweme.filter.p1242a;

import com.bytedance.common.utility.C6311g;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.ugc.aweme.common.p1141b.C25653a;
import com.p280ss.android.ugc.aweme.common.p1141b.C25653a.C25655a;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27414b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27416b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27419e;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.C29340y;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.a.e */
public final class C29189e extends C27416b<C29296g, Void> {

    /* renamed from: f */
    public static final C29190a f77088f = new C29190a(null);

    /* renamed from: g */
    private int f77089g;

    /* renamed from: com.ss.android.ugc.aweme.filter.a.e$a */
    public static final class C29190a {
        private C29190a() {
        }

        public /* synthetic */ C29190a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.a.e$b */
    public static final class C29191b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C29187d f77090a;

        C29191b(C29187d dVar) {
            this.f77090a = dVar;
        }

        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            this.f77090a.mo74788a();
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            this.f77090a.mo74790b();
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            this.f77090a.mo74789a(baseException);
        }
    }

    /* renamed from: a */
    public final boolean mo70525a() {
        return C29340y.m96241a().mo75019f(((C29296g) this.f72333e).f77266a);
    }

    /* renamed from: c */
    public final void mo70528c(C27414b<C29296g, Void> bVar) {
        C7573i.m23587b(bVar, "callback");
        C29340y.m96241a().mo75016b((C29296g) this.f72333e);
        bVar.mo70508b(this);
    }

    /* renamed from: b */
    public final void mo70527b(C27414b<C29296g, Void> bVar) {
        List list;
        C7573i.m23587b(bVar, "callback");
        String b = C29340y.m96241a().mo75015b(((C29296g) this.f72333e).f77266a);
        C7573i.m23582a((Object) b, "FilterFileManager.getIns…tFilterZipPath(mParam.id)");
        if (((C29296g) this.f72333e).f77269d != null) {
            ToolsUrlModel toolsUrlModel = ((C29296g) this.f72333e).f77269d;
            if (toolsUrlModel != null) {
                list = toolsUrlModel.f109647b;
            } else {
                list = null;
            }
            if (!C6311g.m19573a(list)) {
                ToolsUrlModel toolsUrlModel2 = ((C29296g) this.f72333e).f77269d;
                C7573i.m23582a((Object) toolsUrlModel2, "mParam.resource");
                this.f77089g %= toolsUrlModel2.f109647b.size();
                ToolsUrlModel toolsUrlModel3 = ((C29296g) this.f72333e).f77269d;
                C7573i.m23582a((Object) toolsUrlModel3, "mParam.resource");
                String str = (String) toolsUrlModel3.f109647b.get(this.f77089g);
                if (C35574k.m114859a().mo70110y().mo83121f()) {
                    C7573i.m23582a((Object) str, "filterDownloadUrl");
                    m95813a(str, bVar);
                    return;
                }
                C25653a.m84370a(str, b, (C25655a) new C29193g(this, bVar));
                return;
            }
        }
        this.f72332d = new C27419e(Integer.valueOf(-1), "", null);
        bVar.mo70512c(this);
    }

    public C29189e(String str, C29296g gVar) {
        C7573i.m23587b(str, "mTaskId");
        C7573i.m23587b(gVar, "mParam");
        super(str, gVar);
    }

    /* renamed from: a */
    private final void m95813a(String str, C27414b<C29296g, Void> bVar) {
        C29187d dVar = new C29187d(this, bVar, str);
        DownloadTask url = Downloader.with(C35574k.m114861b()).url(str);
        C29340y.m96241a();
        DownloadTask name = url.name(C29340y.m96244c(((C29296g) this.f72333e).f77266a));
        C29340y a = C29340y.m96241a();
        C7573i.m23582a((Object) a, "FilterFileManager.getInstance()");
        name.savePath(a.f77357a).subThreadListener(new C29191b(dVar)).download();
    }
}
