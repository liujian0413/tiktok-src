package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.filter.C29230az;
import com.p280ss.android.ugc.aweme.filter.C29238ba;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.C29297h;
import com.p280ss.android.ugc.aweme.filter.model.C29321a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39673j;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39682m.C39683a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39682m.C39684b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.util.Map;
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
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.editor.r */
public final class C44350r extends C12629j implements C44396a {

    /* renamed from: n */
    public static final C44351a f114572n = new C44351a(null);

    /* renamed from: i */
    public EditViewModel f114573i;

    /* renamed from: j */
    public VEVideoPublishEditViewModel f114574j;

    /* renamed from: k */
    public EditGestureViewModel f114575k;

    /* renamed from: l */
    public VideoPublishEditModel f114576l;

    /* renamed from: m */
    public C39673j f114577m;

    /* renamed from: o */
    private EditFilterViewModel f114578o;

    /* renamed from: com.ss.android.ugc.gamora.editor.r$a */
    public static final class C44351a {
        private C44351a() {
        }

        public /* synthetic */ C44351a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.r$b */
    public static final class C44352b implements C39684b {

        /* renamed from: a */
        final /* synthetic */ C44350r f114579a;

        /* renamed from: b */
        final /* synthetic */ boolean f114580b;

        /* renamed from: c */
        final /* synthetic */ C29230az f114581c;

        /* renamed from: d */
        final /* synthetic */ C29238ba f114582d;

        /* renamed from: a */
        public final void mo98969a() {
            Object obj;
            C44350r.m140307d(this.f114579a).mo106443a(true, false);
            C6907h.m21519a((Context) this.f114579a.f33526d_, "filter_confirm", "mid_page", "0", 0, C39500av.m126145c(C44350r.m140306c(this.f114579a)));
            if (this.f114580b) {
                LiveData i = C44350r.m140305b(this.f114579a).mo119517i();
                C7573i.m23582a((Object) i, "publishEditViewModel.selectedFilter");
                C29321a aVar = (C29321a) i.getValue();
                if (aVar != null) {
                    C22984d a = C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("creation_id", C44350r.m140306c(this.f114579a).creationId).mo59973a("shoot_way", C44350r.m140306c(this.f114579a).mShootWay).mo59970a("draft_id", C44350r.m140306c(this.f114579a).draftId);
                    String str = "filter_id";
                    C29296g gVar = aVar.f77314b;
                    String str2 = null;
                    if (gVar != null) {
                        obj = Integer.valueOf(gVar.f77266a);
                    } else {
                        obj = null;
                    }
                    C22984d a2 = a.mo59972a(str, obj);
                    String str3 = "filter_name";
                    C29296g gVar2 = aVar.f77314b;
                    if (gVar2 != null) {
                        str2 = gVar2.f77267b;
                    }
                    C6907h.m21524a("adjust_filter_complete", (Map) a2.mo59973a(str3, str2).mo59972a("value", (Object) Float.valueOf(C44350r.m140306c(this.f114579a).mSelectedFilterIntensity)).f60753a);
                }
            }
        }

        /* renamed from: a */
        public final void mo98970a(C29296g gVar) {
            C7573i.m23587b(gVar, "filter");
            C44350r.m140304a(this.f114579a).mo29069f().setValue(gVar);
            C44350r.m140305b(this.f114579a).mo119509a(gVar, false);
            C44350r.m140306c(this.f114579a).mSelectedId = gVar.f77270e;
            C44350r.m140306c(this.f114579a).mCurFilterLabels = gVar.f77268c;
            C44350r.m140306c(this.f114579a).mCurFilterIds = String.valueOf(gVar.f77266a);
            if (this.f114580b) {
                C44350r.m140306c(this.f114579a).mSelectedFilterIntensity = C29297h.m96116a(gVar, this.f114581c, this.f114582d);
            }
            C35563c.f93240c.mo83132a(C44350r.m140306c(this.f114579a).getAvetParameter().getContentType(), "mid_page", gVar.f77268c);
            JSONObject c = C39500av.m126145c(C44350r.m140306c(this.f114579a));
            try {
                c.put("filter_name", gVar.f77268c);
            } catch (JSONException unused) {
            }
            C6907h.m21519a((Context) this.f114579a.f33526d_, "filter_click", "mid_page", "0", 0, c);
        }

        /* renamed from: a */
        public final void mo98971a(C29296g gVar, int i) {
            C29230az azVar = this.f114581c;
            if (gVar == null) {
                C7573i.m23580a();
            }
            azVar.mo74795a(gVar, i);
            C44350r.m140306c(this.f114579a).mSelectedFilterIntensity = C29297h.m96115a(gVar, i, this.f114582d);
            C44350r.m140305b(this.f114579a).mo119509a(gVar, false);
        }

        C44352b(C44350r rVar, boolean z, C29230az azVar, C29238ba baVar) {
            this.f114579a = rVar;
            this.f114580b = z;
            this.f114581c = azVar;
            this.f114582d = baVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.r$c */
    public static final class C44353c implements C39683a {

        /* renamed from: a */
        final /* synthetic */ C29230az f114583a;

        /* renamed from: b */
        final /* synthetic */ C29238ba f114584b;

        /* renamed from: a */
        public final int mo98966a(C29296g gVar) {
            C7573i.m23587b(gVar, "filterBean");
            return this.f114583a.mo74794a(gVar, this.f114584b);
        }

        /* renamed from: b */
        public final int mo98967b(C29296g gVar) {
            C7573i.m23587b(gVar, "filterBean");
            return C29297h.m96117a(gVar, gVar.f77275j, this.f114584b);
        }

        /* renamed from: c */
        public final float mo98968c(C29296g gVar) {
            C7573i.m23587b(gVar, "filterBean");
            return C29297h.m96119b(gVar, this.f114584b);
        }

        C44353c(C29230az azVar, C29238ba baVar) {
            this.f114583a = azVar;
            this.f114584b = baVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.r$d */
    static final class C44354d extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44350r f114585a;

        C44354d(C44350r rVar) {
            this.f114585a = rVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140331a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140331a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            C44350r.m140308e(this.f114585a).mo98955b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.r$e */
    static final class C44355e<T> implements C0053p<C29296g> {

        /* renamed from: a */
        final /* synthetic */ C44350r f114586a;

        C44355e(C44350r rVar) {
            this.f114586a = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C29296g gVar) {
            if (gVar != null) {
                C44350r.m140308e(this.f114586a).mo98953a(gVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.r$f */
    static final class C44356f<T> implements C0053p<Object> {

        /* renamed from: a */
        final /* synthetic */ C44350r f114587a;

        C44356f(C44350r rVar) {
            this.f114587a = rVar;
        }

        public final void onChanged(Object obj) {
            C44350r.m140308e(this.f114587a).mo98952a();
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

    /* renamed from: G */
    private final void m140301G() {
        C44353c cVar;
        EditViewModel editViewModel = this.f114573i;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        Object value = editViewModel.mo106437L().getValue();
        if (value == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a(value, "editViewModel.filterIntensityStore.value!!");
        C29230az azVar = (C29230az) value;
        EditViewModel editViewModel2 = this.f114573i;
        if (editViewModel2 == null) {
            C7573i.m23583a("editViewModel");
        }
        Object value2 = editViewModel2.mo106436K().getValue();
        if (value2 == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a(value2, "editViewModel.filterInte…ltIntensityGetter.value!!");
        C29238ba baVar = (C29238ba) value2;
        boolean a = C35563c.f93231M.mo93305a(Property.EnableFilterIntensityJust);
        C39673j jVar = this.f114577m;
        if (jVar == null) {
            C7573i.m23583a("filterModule");
        }
        jVar.mo98954a((C39684b) new C44352b(this, a, azVar, baVar));
        C39673j jVar2 = this.f114577m;
        if (jVar2 == null) {
            C7573i.m23583a("filterModule");
        }
        if (a) {
            cVar = new C44353c(azVar, baVar);
        } else {
            cVar = null;
        }
        jVar2.f103159i = cVar;
    }

    /* renamed from: H */
    private final void m140302H() {
        EditFilterViewModel editFilterViewModel = this.f114578o;
        if (editFilterViewModel == null) {
            C7573i.m23583a("filterViewModel");
        }
        mo91869c(editFilterViewModel, C44357s.f114588a, new C11672v(), new C44354d(this));
        EditFilterViewModel editFilterViewModel2 = this.f114578o;
        if (editFilterViewModel2 == null) {
            C7573i.m23583a("filterViewModel");
        }
        C0043i iVar = this;
        editFilterViewModel2.mo106215g().observe(iVar, new C44355e(this));
        EditFilterViewModel editFilterViewModel3 = this.f114578o;
        if (editFilterViewModel3 == null) {
            C7573i.m23583a("filterViewModel");
        }
        editFilterViewModel3.mo106216h().observe(iVar, new C44356f(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ EditGestureViewModel m140304a(C44350r rVar) {
        EditGestureViewModel editGestureViewModel = rVar.f114575k;
        if (editGestureViewModel == null) {
            C7573i.m23583a("gestureViewModel");
        }
        return editGestureViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoPublishEditViewModel m140305b(C44350r rVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = rVar.f114574j;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ VideoPublishEditModel m140306c(C44350r rVar) {
        VideoPublishEditModel videoPublishEditModel = rVar.f114576l;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("model");
        }
        return videoPublishEditModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ EditViewModel m140307d(C44350r rVar) {
        EditViewModel editViewModel = rVar.f114573i;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ C39673j m140308e(C44350r rVar) {
        C39673j jVar = rVar.f114577m;
        if (jVar == null) {
            C7573i.m23583a("filterModule");
        }
        return jVar;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        C29296g gVar;
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            JediViewModel a = C36113b.m116288a(fragmentActivity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f114573i = (EditViewModel) a;
            C0063u a2 = C0069x.m159a(fragmentActivity).mo147a(VEVideoPublishEditViewModel.class);
            C7573i.m23582a((Object) a2, "ViewModelProviders.of(fr…ditViewModel::class.java)");
            this.f114574j = (VEVideoPublishEditViewModel) a2;
            JediViewModel a3 = C36113b.m116288a(fragmentActivity).mo91871a(EditGestureViewModel.class);
            C7573i.m23582a((Object) a3, "JediViewModelProviders.o…ureViewModel::class.java)");
            this.f114575k = (EditGestureViewModel) a3;
            JediViewModel a4 = C36113b.m116288a(fragmentActivity).mo91871a(EditFilterViewModel.class);
            C7573i.m23582a((Object) a4, "JediViewModelProviders.o…terViewModel::class.java)");
            this.f114578o = (EditFilterViewModel) a4;
            EditViewModel editViewModel = this.f114573i;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            this.f114576l = editViewModel.mo29069f();
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                AppCompatActivity appCompatActivity = (AppCompatActivity) activity2;
                Activity activity3 = this.f33526d_;
                if (!(activity3 instanceof C23258e)) {
                    activity3 = null;
                }
                C23258e eVar = (C23258e) activity3;
                View view = this.f33523b;
                if (view != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f114574j;
                    if (vEVideoPublishEditViewModel == null) {
                        C7573i.m23583a("publishEditViewModel");
                    }
                    LiveData i = vEVideoPublishEditViewModel.mo119517i();
                    C7573i.m23582a((Object) i, "publishEditViewModel.selectedFilter");
                    C29321a aVar = (C29321a) i.getValue();
                    if (aVar != null) {
                        gVar = aVar.f77314b;
                    } else {
                        gVar = null;
                    }
                    VideoPublishEditModel videoPublishEditModel = this.f114576l;
                    if (videoPublishEditModel == null) {
                        C7573i.m23583a("model");
                    }
                    C39673j jVar = new C39673j(appCompatActivity, eVar, frameLayout, gVar, videoPublishEditModel);
                    this.f114577m = jVar;
                    m140301G();
                    m140302H();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
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
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aij, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…filter, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
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
