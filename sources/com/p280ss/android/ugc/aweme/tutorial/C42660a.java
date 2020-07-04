package com.p280ss.android.ugc.aweme.tutorial;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.p023a.C0534a;
import android.support.p022v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
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
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41253ah;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41006c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41011f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41013h;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.TabLayoutOnPageChangeListener;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42347l;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.bottomtab.C43869e;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.tutorial.a */
public final class C42660a extends C43869e implements C44396a {

    /* renamed from: l */
    public static final String[] f110899l = {"basic", C22704b.f60412a};

    /* renamed from: m */
    public static final C42661a f110900m = new C42661a(null);

    /* renamed from: i */
    public TabLayout f110901i;

    /* renamed from: j */
    public ViewPager f110902j;

    /* renamed from: k */
    public final C43868d f110903k;

    /* renamed from: n */
    private View f110904n;

    /* renamed from: o */
    private ViewStub f110905o;

    /* renamed from: p */
    private ImageView f110906p;

    /* renamed from: q */
    private View f110907q;

    /* renamed from: com.ss.android.ugc.aweme.tutorial.a$a */
    public static final class C42661a {
        private C42661a() {
        }

        /* renamed from: a */
        public static String[] m135510a() {
            return C42660a.f110899l;
        }

        public /* synthetic */ C42661a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.a$b */
    static final class C42662b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f110908a;

        /* renamed from: b */
        final /* synthetic */ C42660a f110909b;

        C42662b(View view, C42660a aVar) {
            this.f110908a = view;
            this.f110909b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f110909b.f33526d_ instanceof VideoRecordNewActivity) {
                Activity activity = this.f110909b.f33526d_;
                if (activity != null) {
                    C39382ed edVar = ((VideoRecordNewActivity) activity).f107267H;
                    C7573i.m23582a((Object) edVar, "(activity as VideoRecordNewActivity).plan");
                    C42156aw J = edVar.mo97896J();
                    if (J == null) {
                        C7573i.m23580a();
                    }
                    J.mo103594a((Object) this.f110908a, (C42155av) new C42347l("close_view"));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.a$c */
    public static final class C42663c implements C41006c {

        /* renamed from: a */
        final /* synthetic */ TutorialPagerAdapter f110910a;

        /* renamed from: b */
        final /* synthetic */ C42660a f110911b;

        /* renamed from: b */
        public final void mo74744b(C41011f fVar) {
        }

        /* renamed from: c */
        public final void mo74745c(C41011f fVar) {
            this.f110910a.mo104266b(C42660a.m135494b(this.f110911b).getCurrentItem());
        }

        /* renamed from: a */
        public final void mo74743a(C41011f fVar) {
            Keva.getRepo("CreationTutorialScene").storeInt("CreationTutorialScene", C42660a.m135492a(this.f110911b).getSelectedTabPosition());
            C42672b.m135519a(C42661a.m135510a()[C42660a.m135492a(this.f110911b).getSelectedTabPosition()]);
        }

        C42663c(TutorialPagerAdapter tutorialPagerAdapter, C42660a aVar) {
            this.f110910a = tutorialPagerAdapter;
            this.f110911b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.a$d */
    static final class C42664d implements OnClickListener {

        /* renamed from: a */
        public static final C42664d f110912a = new C42664d();

        C42664d() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    public final String bQ_() {
        return "CreationTutorialScene";
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
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

    public final void bR_() {
        if (this.f110904n == null) {
            m135490G();
        }
        ObjectAnimator.ofFloat(this.f110904n, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
        C41253ah.m131871a(true);
        C42672b.m135518a(this.f110903k.mo106146e());
    }

    public final void bS_() {
        ObjectAnimator.ofFloat(this.f110904n, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
        C41253ah.m131871a(false);
    }

    /* renamed from: G */
    private final void m135490G() {
        ViewStub viewStub = this.f110905o;
        if (viewStub == null) {
            C7573i.m23583a("viewStub");
        }
        this.f110904n = viewStub.inflate();
        View view = this.f110904n;
        if (view != null) {
            view.setOnClickListener(C42664d.f110912a);
            View findViewById = view.findViewById(R.id.a53);
            C7573i.m23582a((Object) findViewById, "findViewById(R.id.creation_tutorial_tab_layout)");
            this.f110901i = (TabLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.a56);
            C7573i.m23582a((Object) findViewById2, "findViewById(R.id.creation_tutorial_viewpager)");
            this.f110902j = (ViewPager) findViewById2;
            View findViewById3 = view.findViewById(R.id.a50);
            C7573i.m23582a((Object) findViewById3, "findViewById(R.id.creation_tutorial_close)");
            this.f110906p = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.a55);
            C7573i.m23582a((Object) findViewById4, "findViewById(R.id.creation_tutorial_title_rl)");
            this.f110907q = findViewById4;
            ImageView imageView = this.f110906p;
            if (imageView == null) {
                C7573i.m23583a("closeView");
            }
            imageView.setOnClickListener(new C42662b(view, this));
            int c = C39805en.m127450c(this.f33526d_);
            View view2 = this.f110907q;
            if (view2 == null) {
                C7573i.m23583a("titleLayout");
            }
            LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = c;
                View view3 = this.f110907q;
                if (view3 == null) {
                    C7573i.m23583a("titleLayout");
                }
                view3.setLayoutParams(marginLayoutParams);
                Activity activity = this.f33526d_;
                if (activity != null) {
                    TutorialPagerAdapter tutorialPagerAdapter = new TutorialPagerAdapter((FragmentActivity) activity);
                    ViewPager viewPager = this.f110902j;
                    if (viewPager == null) {
                        C7573i.m23583a("viewPager");
                    }
                    viewPager.setAdapter(tutorialPagerAdapter);
                    int count = tutorialPagerAdapter.getCount();
                    for (int i = 0; i < count; i++) {
                        View a = tutorialPagerAdapter.mo104265a(i);
                        TabLayout tabLayout = this.f110901i;
                        if (tabLayout == null) {
                            C7573i.m23583a("tabLayout");
                        }
                        TabLayout tabLayout2 = this.f110901i;
                        if (tabLayout2 == null) {
                            C7573i.m23583a("tabLayout");
                        }
                        tabLayout.mo101336a(tabLayout2.mo101329a().mo101401a(a));
                        m135493a(i, tutorialPagerAdapter.getCount(), a);
                    }
                    ViewPager viewPager2 = this.f110902j;
                    if (viewPager2 == null) {
                        C7573i.m23583a("viewPager");
                    }
                    TabLayout tabLayout3 = this.f110901i;
                    if (tabLayout3 == null) {
                        C7573i.m23583a("tabLayout");
                    }
                    viewPager2.addOnPageChangeListener(new TabLayoutOnPageChangeListener(tabLayout3));
                    TabLayout tabLayout4 = this.f110901i;
                    if (tabLayout4 == null) {
                        C7573i.m23583a("tabLayout");
                    }
                    ViewPager viewPager3 = this.f110902j;
                    if (viewPager3 == null) {
                        C7573i.m23583a("viewPager");
                    }
                    tabLayout4.mo101335a((C41006c) new C41013h(viewPager3));
                    TabLayout tabLayout5 = this.f110901i;
                    if (tabLayout5 == null) {
                        C7573i.m23583a("tabLayout");
                    }
                    tabLayout5.mo101335a((C41006c) new C42663c(tutorialPagerAdapter, this));
                    int a2 = C0534a.m2233a(Keva.getRepo("CreationTutorialScene").getInt("CreationTutorialScene", 0), 0, tutorialPagerAdapter.getCount());
                    ViewPager viewPager4 = this.f110902j;
                    if (viewPager4 == null) {
                        C7573i.m23583a("viewPager");
                    }
                    viewPager4.setCurrentItem(a2, false);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public C42660a(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        this.f110903k = dVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ TabLayout m135492a(C42660a aVar) {
        TabLayout tabLayout = aVar.f110901i;
        if (tabLayout == null) {
            C7573i.m23583a("tabLayout");
        }
        return tabLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ ViewPager m135494b(C42660a aVar) {
        ViewPager viewPager = aVar.f110902j;
        if (viewPager == null) {
            C7573i.m23583a("viewPager");
        }
        return viewPager;
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
        View inflate = layoutInflater.inflate(R.layout.ahy, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.cyq);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.scene_creation_tutorial)");
        this.f110905o = (ViewStub) findViewById;
        C7573i.m23582a((Object) inflate, "view");
        return inflate;
    }

    /* renamed from: a */
    private final void m135493a(int i, int i2, View view) {
        if (view.getParent() instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                LayoutParams layoutParams = ((ViewGroup) parent).getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    if (i == 0) {
                        ((MarginLayoutParams) layoutParams).leftMargin = (int) C9738o.m28708b((Context) this.f33526d_, 16.0f);
                    } else if (i == i2 - 1) {
                        ((MarginLayoutParams) layoutParams).rightMargin = (int) C9738o.m28708b((Context) this.f33526d_, 16.0f);
                    }
                    ViewParent parent2 = view.getParent();
                    if (parent2 != null) {
                        ((ViewGroup) parent2).setLayoutParams(layoutParams);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
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
