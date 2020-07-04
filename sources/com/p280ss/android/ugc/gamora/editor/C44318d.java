package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39506a.C39507a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39509c;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.editor.d */
public final class C44318d extends C12629j implements C44396a {

    /* renamed from: k */
    public static final C44319a f114518k = new C44319a(null);

    /* renamed from: i */
    public EditToolbarViewModel f114519i;

    /* renamed from: j */
    public C39509c f114520j;

    /* renamed from: l */
    private RTLImageView f114521l;

    /* renamed from: m */
    private EditAutoEnhanceViewModel f114522m;

    /* renamed from: n */
    private FrameLayout f114523n;

    /* renamed from: o */
    private EditViewModel f114524o;

    /* renamed from: p */
    private VideoPublishEditModel f114525p;

    /* renamed from: q */
    private VEVideoPublishEditViewModel f114526q;

    /* renamed from: r */
    private C0052o<Boolean> f114527r;

    /* renamed from: com.ss.android.ugc.gamora.editor.d$a */
    public static final class C44319a {
        private C44319a() {
        }

        public /* synthetic */ C44319a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.d$b */
    static final class C44320b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RTLImageView f114528a;

        /* renamed from: b */
        final /* synthetic */ C44318d f114529b;

        C44320b(RTLImageView rTLImageView, C44318d dVar) {
            this.f114528a = rTLImageView;
            this.f114529b = dVar;
        }

        public final void run() {
            this.f114528a.setVisibility(8);
            C44318d.m140202b(this.f114529b).mo106413b(9, true);
            C44318d.m140201a(this.f114529b).mo98362a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.d$c */
    static final class C44321c extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44318d f114530a;

        C44321c(C44318d dVar) {
            this.f114530a = dVar;
            super(2);
        }

        /* renamed from: a */
        private void m140221a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            this.f114530a.mo30920G();
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140221a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.d$d */
    static final class C44322d extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44318d f114531a;

        C44322d(C44318d dVar) {
            this.f114531a = dVar;
            super(2);
        }

        /* renamed from: a */
        private void m140222a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C44318d.m140201a(this.f114531a).mo98362a(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140222a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: a */
    public final void mo106789a(C0052o<Boolean> oVar) {
        C7573i.m23587b(oVar, "value");
        this.f114527r = oVar;
        if (this.f114520j != null) {
            C39509c cVar = this.f114520j;
            if (cVar == null) {
                C7573i.m23583a("mAutoEnhanceController");
            }
            C0052o<Boolean> oVar2 = this.f114527r;
            if (oVar2 == null) {
                C7573i.m23583a("lightDetectionDone");
            }
            cVar.mo98361a(oVar2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: H */
    private final void m140199H() {
        boolean z;
        VideoPublishEditModel videoPublishEditModel = this.f114525p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel.autoEnhanceType != 0 || !C39507a.m126195b()) {
            z = false;
        } else {
            z = true;
        }
        if (C35563c.f93231M.mo93306b(Property.LightEnhanceBlackList) == 1) {
            VideoPublishEditModel videoPublishEditModel2 = this.f114525p;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            videoPublishEditModel2.autoEnhanceType = 2;
        }
        C12629j jVar = this;
        VideoPublishEditModel videoPublishEditModel3 = this.f114525p;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("mModel");
        }
        this.f114520j = new C39509c(jVar, videoPublishEditModel3, z);
        C39509c cVar = this.f114520j;
        if (cVar == null) {
            C7573i.m23583a("mAutoEnhanceController");
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f114526q;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        C0052o t = vEVideoPublishEditViewModel.mo119528t();
        C7573i.m23582a((Object) t, "publishEditViewModel.autoEnhanceControlLiveData");
        cVar.mo98363b(t);
        C39509c cVar2 = this.f114520j;
        if (cVar2 == null) {
            C7573i.m23583a("mAutoEnhanceController");
        }
        C0052o<Boolean> oVar = this.f114527r;
        if (oVar == null) {
            C7573i.m23583a("lightDetectionDone");
        }
        cVar2.mo98361a(oVar);
    }

    /* renamed from: G */
    public final void mo30920G() {
        if (this.f114521l == null) {
            this.f114521l = new RTLImageView(this.f33526d_);
            RTLImageView rTLImageView = this.f114521l;
            if (rTLImageView != null) {
                rTLImageView.setScaleType(ScaleType.FIT_XY);
            }
            RTLImageView rTLImageView2 = this.f114521l;
            if (rTLImageView2 != null) {
                rTLImageView2.setImageResource(R.drawable.cs);
            }
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.setMargins(0, -1200, 0, 0);
            RTLImageView rTLImageView3 = this.f114521l;
            if (rTLImageView3 != null) {
                rTLImageView3.setLayoutParams(layoutParams);
            }
            FrameLayout frameLayout = this.f114523n;
            if (frameLayout == null) {
                C7573i.m23583a("parentLayout");
            }
            frameLayout.addView(this.f114521l);
        }
        RTLImageView rTLImageView4 = this.f114521l;
        if (rTLImageView4 != null) {
            rTLImageView4.animate().translationYBy(3000.0f).setDuration(1500).withEndAction(new C44320b(rTLImageView4, this)).start();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C39509c m140201a(C44318d dVar) {
        C39509c cVar = dVar.f114520j;
        if (cVar == null) {
            C7573i.m23583a("mAutoEnhanceController");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditToolbarViewModel m140202b(C44318d dVar) {
        EditToolbarViewModel editToolbarViewModel = dVar.f114519i;
        if (editToolbarViewModel == null) {
            C7573i.m23583a("toolbarViewModel");
        }
        return editToolbarViewModel;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f114524o = (EditViewModel) a;
            EditViewModel editViewModel = this.f114524o;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            this.f114525p = editViewModel.mo29069f();
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditAutoEnhanceViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…nceViewModel::class.java)");
                this.f114522m = (EditAutoEnhanceViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditToolbarViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…barViewModel::class.java)");
                    this.f114519i = (EditToolbarViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        C0063u a4 = C0069x.m159a((FragmentActivity) activity4).mo147a(VEVideoPublishEditViewModel.class);
                        C7573i.m23582a((Object) a4, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                        this.f114526q = (VEVideoPublishEditViewModel) a4;
                        m140199H();
                        EditAutoEnhanceViewModel editAutoEnhanceViewModel = this.f114522m;
                        if (editAutoEnhanceViewModel == null) {
                            C7573i.m23583a("autoEnhanceViewModel");
                        }
                        mo91869c(editAutoEnhanceViewModel, C44323e.f114532a, new C11672v(), new C44321c(this));
                        EditAutoEnhanceViewModel editAutoEnhanceViewModel2 = this.f114522m;
                        if (editAutoEnhanceViewModel2 == null) {
                            C7573i.m23583a("autoEnhanceViewModel");
                        }
                        mo91868b(editAutoEnhanceViewModel2, C44324f.f114533a, new C11672v(), new C44322d(this));
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aif, viewGroup, false);
        if (inflate != null) {
            this.f114523n = (FrameLayout) inflate;
            FrameLayout frameLayout = this.f114523n;
            if (frameLayout == null) {
                C7573i.m23583a("parentLayout");
            }
            return frameLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
