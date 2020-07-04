package com.p280ss.android.ugc.aweme.tools.beauty;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.beauty.C23543l;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.beauty.C38519c;
import com.p280ss.android.ugc.aweme.shortvideo.beauty.C38520d;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.tools.beauty.widegt.C42245a;
import com.p280ss.android.ugc.aweme.tools.beauty.widegt.C42245a.C42248a;
import com.p280ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl.C42227a;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.a */
public final class C42163a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f109697a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42163a.class), "beautyView", "getBeautyView()Lcom/ss/android/ugc/aweme/shortvideo/beauty/IBeautyView;"))};

    /* renamed from: b */
    public final C42164a f109698b = new C42164a(this);

    /* renamed from: c */
    public C7561a<C7581n> f109699c;

    /* renamed from: d */
    public C38519c f109700d;

    /* renamed from: e */
    public final AppCompatActivity f109701e;

    /* renamed from: f */
    private final C7541d f109702f = C7546e.m23569a(new C42165b(this));

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a$a */
    public static final class C42164a implements C42176d {

        /* renamed from: a */
        final /* synthetic */ C42163a f109703a;

        C42164a(C42163a aVar) {
            this.f109703a = aVar;
        }

        /* renamed from: d */
        public final void mo103616d(int i) {
            this.f109703a.f109700d.mo96509d(i);
        }

        /* renamed from: e */
        public final void mo103617e(int i) {
            this.f109703a.f109700d.mo96511e(i);
        }

        /* renamed from: a */
        public final void mo103609a(int i) {
            if (this.f109703a.f109700d.mo96513g()) {
                this.f109703a.f109700d.mo96491a(i);
            }
        }

        /* renamed from: b */
        public final void mo103614b(int i) {
            if (this.f109703a.f109700d.mo96512f()) {
                this.f109703a.f109700d.mo96500b(i);
            }
        }

        /* renamed from: c */
        public final void mo103615c(int i) {
            if (this.f109703a.f109700d.mo96512f()) {
                this.f109703a.f109700d.mo96505c(i);
            }
        }

        /* renamed from: a */
        public final void mo103611a(List<ComposerInfo> list, int i) {
            C7573i.m23587b(list, "paths");
            this.f109703a.f109700d.mo96494a(list, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
        }

        /* renamed from: a */
        public final int[] mo103613a(String str, String str2) {
            C7573i.m23587b(str, "nodePath");
            C7573i.m23587b(str2, "nodeKey");
            int[] a = this.f109703a.f109700d.mo96498a(str, str2);
            C7573i.m23582a((Object) a, "module.checkComposerNode…lusion(nodePath, nodeKey)");
            return a;
        }

        /* renamed from: a */
        public final void mo103610a(String str, String str2, float f) {
            C7573i.m23587b(str, "path");
            C7573i.m23587b(str2, "nodeTag");
            this.f109703a.f109700d.mo96493a(str, str2, f);
        }

        /* renamed from: a */
        public final void mo103612a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
            C7573i.m23587b(list, "oldPaths");
            C7573i.m23587b(list2, "newPaths");
            this.f109703a.f109700d.mo96495a(list, list2, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a$b */
    static final class C42165b extends Lambda implements C7561a<C38520d> {

        /* renamed from: a */
        final /* synthetic */ C42163a f109704a;

        C42165b(C42163a aVar) {
            this.f109704a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C38520d invoke() {
            C0063u a = C0069x.m159a((FragmentActivity) this.f109704a.f109701e).mo147a(ShortVideoContextViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
            C7573i.m23582a((Object) shortVideoContext, "ViewModelProviders.of(ac…       .shortVideoContext");
            AVETParameter i = shortVideoContext.mo96148i();
            if (C23536f.m77298a()) {
                C42227a a2 = new C42227a(this.f109704a.f109701e).mo103669a((C42176d) this.f109704a.f109698b);
                C7573i.m23582a((Object) i, "mETParameter");
                return a2.mo103668a(i).mo103670a();
            }
            C42245a a3 = new C42248a(this.f109704a.f109701e).mo103693a((C42176d) this.f109704a.f109698b).mo103691a(this.f109704a.mo103608d()).mo103692a(i).mo103694a();
            C7573i.m23582a((Object) a3, "ULikeBeautyViewImpl.Buil…                .create()");
            return a3;
        }
    }

    /* renamed from: a */
    public final C38520d mo103604a() {
        return (C38520d) this.f109702f.getValue();
    }

    /* renamed from: c */
    public final void mo103607c() {
        mo103604a().mo96515b();
    }

    /* renamed from: b */
    public final void mo103606b() {
        AVETParameter aVETParameter;
        C42175c cVar = C42175c.f109736a;
        C0063u a = C0069x.m159a((FragmentActivity) this.f109701e).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
        if (shortVideoContext != null) {
            aVETParameter = shortVideoContext.mo96148i();
        } else {
            aVETParameter = null;
        }
        cVar.mo103626a(aVETParameter);
        mo103604a().mo96514a();
    }

    /* renamed from: d */
    public final C23543l mo103608d() {
        C23543l lVar = new C23543l(this.f109700d.mo96490a(), this.f109700d.mo96499b(), this.f109700d.mo96504c(), this.f109700d.mo96508d(), this.f109700d.mo96510e());
        return lVar;
    }

    /* renamed from: a */
    public final void mo103605a(C7561a<C7581n> aVar) {
        this.f109699c = aVar;
        mo103604a().setOutsideClickListener(this.f109699c);
    }

    public C42163a(C38519c cVar, AppCompatActivity appCompatActivity) {
        C7573i.m23587b(cVar, "module");
        C7573i.m23587b(appCompatActivity, "activity");
        this.f109700d = cVar;
        this.f109701e = appCompatActivity;
    }
}
