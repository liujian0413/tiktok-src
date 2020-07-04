package com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
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
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.filter.C29231b;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39440c.C39441a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39440c.C39445e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.p1561a.C39429a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.p1561a.C39433d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1605g.C40582c;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.editor.EditAudioEffectViewModel;
import com.p280ss.android.ugc.gamora.editor.EditViewModel;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g */
public final class C39452g extends C12629j implements C39465j, C44396a {

    /* renamed from: r */
    public static final C39453a f102411r = new C39453a(null);

    /* renamed from: i */
    public boolean f102412i;

    /* renamed from: j */
    public View f102413j;

    /* renamed from: k */
    public RecyclerView f102414k;

    /* renamed from: l */
    public C34860g f102415l;

    /* renamed from: m */
    public AudioItemAdapter f102416m;

    /* renamed from: n */
    public C15389d f102417n;

    /* renamed from: o */
    public EditViewModel f102418o;

    /* renamed from: p */
    public VideoPublishEditModel f102419p;

    /* renamed from: q */
    public EditAudioEffectViewModel f102420q;

    /* renamed from: s */
    private int f102421s = 1;

    /* renamed from: t */
    private TextView f102422t;

    /* renamed from: u */
    private View f102423u;

    /* renamed from: v */
    private C29231b f102424v;

    /* renamed from: w */
    private C39433d f102425w;

    /* renamed from: x */
    private FrameLayout f102426x;

    /* renamed from: y */
    private VEVideoPublishEditViewModel f102427y;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g$a */
    public static final class C39453a {
        private C39453a() {
        }

        public /* synthetic */ C39453a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g$b */
    public static final class C39454b implements C39445e {

        /* renamed from: a */
        final /* synthetic */ C39452g f102428a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g$b$a */
        static final class C39455a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C39454b f102429a;

            /* renamed from: b */
            final /* synthetic */ CategoryPageModel f102430b;

            C39455a(C39454b bVar, CategoryPageModel categoryPageModel) {
                this.f102429a = bVar;
                this.f102430b = categoryPageModel;
            }

            public final void run() {
                this.f102429a.f102428a.m126005a(this.f102430b, true);
            }
        }

        /* renamed from: a */
        public final void mo98275a(int i, String str) {
            C7573i.m23587b(str, "msg");
        }

        C39454b(C39452g gVar) {
            this.f102428a = gVar;
        }

        /* renamed from: a */
        public final void mo98276a(CategoryPageModel categoryPageModel) {
            RecyclerView recyclerView = this.f102428a.f102414k;
            if (recyclerView != null) {
                recyclerView.post(new C39455a(this, categoryPageModel));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g$c */
    public static final class C39456c extends C34861a {

        /* renamed from: a */
        final /* synthetic */ C39452g f102431a;

        /* renamed from: a */
        public final void mo74767a() {
            this.f102431a.f102412i = true;
            C34860g gVar = this.f102431a.f102415l;
            if (gVar != null) {
                gVar.mo74767a();
            }
        }

        /* renamed from: b */
        public final void mo74847b() {
            C34860g gVar = this.f102431a.f102415l;
            if (gVar != null) {
                gVar.mo74847b();
            }
        }

        /* renamed from: c */
        public final void mo74769c() {
            C34860g gVar = this.f102431a.f102415l;
            if (gVar != null) {
                gVar.mo74769c();
            }
        }

        /* renamed from: d */
        public final void mo74768d() {
            this.f102431a.f102412i = false;
            C34860g gVar = this.f102431a.f102415l;
            if (gVar != null) {
                gVar.mo74768d();
            }
        }

        C39456c(C39452g gVar) {
            this.f102431a = gVar;
        }

        /* renamed from: a */
        public final void mo74844a(float f, int i, int i2) {
            C34860g gVar = this.f102431a.f102415l;
            if (gVar != null) {
                gVar.mo74844a(f, i, i2);
            }
        }

        /* renamed from: b */
        public final void mo74848b(float f, int i, int i2) {
            C34860g gVar = this.f102431a.f102415l;
            if (gVar != null) {
                gVar.mo74848b(f, i, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g$d */
    static final class C39457d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39452g f102432a;

        C39457d(C39452g gVar) {
            this.f102432a = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C39452g.m126007c(this.f102432a).mo106170a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g$e */
    static final class C39458e<T> implements C0053p<AudioEffectParam> {

        /* renamed from: a */
        final /* synthetic */ C39452g f102433a;

        C39458e(C39452g gVar) {
            this.f102433a = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(AudioEffectParam audioEffectParam) {
            C39452g.m126002a(this.f102433a).veAudioEffectParam = audioEffectParam;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g$f */
    public static final class C39459f extends C34861a {

        /* renamed from: a */
        final /* synthetic */ C39452g f102434a;

        /* renamed from: d */
        public final void mo74768d() {
            C39452g.m126006b(this.f102434a).mo106443a(true, false);
        }

        C39459f(C39452g gVar) {
            this.f102434a = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g$g */
    static final class C39460g extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39452g f102435a;

        C39460g(C39452g gVar) {
            this.f102435a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m126040a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m126040a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                this.f102435a.mo30920G();
            } else {
                this.f102435a.mo30921H();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g$h */
    static final class C39461h extends Lambda implements C7563m<C44396a, Object, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39452g f102436a;

        C39461h(C39452g gVar) {
            this.f102436a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m126041a((C44396a) obj, obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m126041a(C44396a aVar, Object obj) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(obj, "it");
            AudioItemAdapter audioItemAdapter = this.f102436a.f102416m;
            if (audioItemAdapter != null) {
                audioItemAdapter.mo98245a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g$i */
    public static final class C39462i extends C40582c {

        /* renamed from: a */
        final /* synthetic */ C39452g f102437a;

        /* renamed from: a */
        public final void mo74767a() {
            View view = this.f102437a.f102413j;
            if (view != null) {
                view.setVisibility(0);
            }
            super.mo74767a();
        }

        C39462i(C39452g gVar) {
            this.f102437a = gVar;
        }
    }

    /* renamed from: A */
    public final void mo30993A() {
        super.mo30993A();
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

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo98281a(Effect effect) {
        C39433d dVar = this.f102425w;
        if (dVar != null) {
            dVar.mo98263a(effect);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
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
    public final void mo30921H() {
        C29231b bVar = this.f102424v;
        if (bVar != null) {
            bVar.mo74849b(new C40582c());
        }
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        C39441a.m125976a();
        C39440c.m125967a();
    }

    /* renamed from: K */
    private final void m126000K() {
        m126005a(C39438b.m125963b(), false);
        C39441a.m125976a().mo98273a((C39445e) new C39454b(this));
    }

    /* renamed from: q */
    public final void mo31008q() {
        super.mo31008q();
        C39441a.m125976a();
        C39440c.m125968a(1);
        C39433d dVar = this.f102425w;
        if (dVar != null) {
            dVar.mo98262a();
        }
    }

    /* renamed from: I */
    private final void m125998I() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            C15389d dVar = this.f102417n;
            VideoPublishEditModel videoPublishEditModel = this.f102419p;
            if (videoPublishEditModel == null) {
                C7573i.m23583a("publishEditModel");
            }
            VideoPublishEditModel videoPublishEditModel2 = this.f102419p;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("publishEditModel");
            }
            this.f102416m = new AudioItemAdapter(appCompatActivity, dVar, videoPublishEditModel, videoPublishEditModel2.veAudioEffectParam);
            AudioItemAdapter audioItemAdapter = this.f102416m;
            if (audioItemAdapter != null) {
                audioItemAdapter.f102353c = this;
            }
            RecyclerView recyclerView = this.f102414k;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.f102416m);
            }
            m126000K();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    /* renamed from: J */
    private final void m125999J() {
        View view = this.f102413j;
        if (view == null) {
            C7573i.m23580a();
        }
        this.f102423u = view.findViewById(R.id.edy);
        View view2 = this.f102413j;
        if (view2 == null) {
            C7573i.m23580a();
        }
        view2.findViewById(R.id.ee3).setOnClickListener(new C39457d(this));
        View view3 = this.f102413j;
        if (view3 == null) {
            C7573i.m23580a();
        }
        this.f102414k = (RecyclerView) view3.findViewById(R.id.ee1);
        RecyclerView recyclerView = this.f102414k;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f33526d_, 0, false));
        }
    }

    /* renamed from: G */
    public final void mo30920G() {
        EditViewModel editViewModel = this.f102418o;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        this.f102417n = (C15389d) editViewModel.mo106448i().getValue();
        FrameLayout frameLayout = this.f102426x;
        if (frameLayout == null) {
            C7573i.m23583a("parentLayout");
        }
        frameLayout.removeAllViews();
        Activity activity = this.f33526d_;
        if (activity != null) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            FrameLayout frameLayout2 = this.f102426x;
            if (frameLayout2 == null) {
                C7573i.m23583a("parentLayout");
            }
            m126003a(appCompatActivity, frameLayout2);
            View view = this.f102413j;
            if (view != null) {
                view.setVisibility(4);
            }
            C29231b bVar = this.f102424v;
            if (bVar != null) {
                bVar.mo74845a((C34856c) new C39462i(this));
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoPublishEditModel m126002a(C39452g gVar) {
        VideoPublishEditModel videoPublishEditModel = gVar.f102419p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditViewModel m126006b(C39452g gVar) {
        EditViewModel editViewModel = gVar.f102418o;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditAudioEffectViewModel m126007c(C39452g gVar) {
        EditAudioEffectViewModel editAudioEffectViewModel = gVar.f102420q;
        if (editAudioEffectViewModel == null) {
            C7573i.m23583a("audioEffectViewModel");
        }
        return editAudioEffectViewModel;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f102418o = (EditViewModel) a;
            EditViewModel editViewModel = this.f102418o;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            this.f102419p = editViewModel.mo29069f();
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                C0063u a2 = C0069x.m159a((FragmentActivity) activity2).mo147a(VEVideoPublishEditViewModel.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                this.f102427y = (VEVideoPublishEditViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditAudioEffectViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…ectViewModel::class.java)");
                    this.f102420q = (EditAudioEffectViewModel) a3;
                    VideoPublishEditModel videoPublishEditModel = this.f102419p;
                    if (videoPublishEditModel == null) {
                        C7573i.m23583a("publishEditModel");
                    }
                    this.f102421s = C39428a.m125947a(videoPublishEditModel);
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f102427y;
                    if (vEVideoPublishEditViewModel == null) {
                        C7573i.m23583a("publishEditViewModel");
                    }
                    vEVideoPublishEditViewModel.mo119512d().observe(this, new C39458e(this));
                    this.f102415l = new C39459f(this);
                    EditAudioEffectViewModel editAudioEffectViewModel = this.f102420q;
                    if (editAudioEffectViewModel == null) {
                        C7573i.m23583a("audioEffectViewModel");
                    }
                    mo91868b(editAudioEffectViewModel, C39463h.f102438a, new C11672v(), new C39460g(this));
                    EditAudioEffectViewModel editAudioEffectViewModel2 = this.f102420q;
                    if (editAudioEffectViewModel2 == null) {
                        C7573i.m23583a("audioEffectViewModel");
                    }
                    mo91868b(editAudioEffectViewModel2, C39464i.f102439a, new C11672v(), new C39461h(this));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m126005a(CategoryPageModel categoryPageModel, boolean z) {
        if (categoryPageModel != null) {
            AudioItemAdapter audioItemAdapter = this.f102416m;
            if (audioItemAdapter != null) {
                audioItemAdapter.mo98249a(categoryPageModel, z);
            }
        }
    }

    /* renamed from: a */
    private final void m126003a(AppCompatActivity appCompatActivity, FrameLayout frameLayout) {
        TextView textView;
        if (this.f102413j == null) {
            this.f102413j = LayoutInflater.from(appCompatActivity).inflate(R.layout.hc, frameLayout, false);
            View view = this.f102413j;
            FrameLayout frameLayout2 = null;
            if (view != null) {
                textView = (TextView) view.findViewById(R.id.dtx);
            } else {
                textView = null;
            }
            this.f102422t = textView;
            View view2 = this.f102413j;
            if (view2 != null) {
                frameLayout2 = (FrameLayout) view2.findViewById(R.id.bj9);
            }
            this.f102425w = new C39429a(frameLayout2);
            m125999J();
            m125998I();
            View view3 = this.f102413j;
            if (view3 == null) {
                C7573i.m23580a();
            }
            View view4 = this.f102423u;
            if (view4 == null) {
                C7573i.m23580a();
            }
            this.f102424v = new C29231b(frameLayout, view3, view4);
            C29231b bVar = this.f102424v;
            if (bVar == null) {
                C7573i.m23580a();
            }
            bVar.mo74846a((C34860g) new C39456c(this));
            return;
        }
        m126000K();
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aid, viewGroup, false);
        if (inflate != null) {
            this.f102426x = (FrameLayout) inflate;
            FrameLayout frameLayout = this.f102426x;
            if (frameLayout == null) {
                C7573i.m23583a("parentLayout");
            }
            return frameLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
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
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }
}
