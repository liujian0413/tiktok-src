package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
import com.bytedance.scene.C12629j;
import com.bytedance.scene.group.C12604b;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39528f;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39528f.C39529a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39779q;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C43057di;
import com.p280ss.android.ugc.gamora.editor.p1742a.C44000a;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
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
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.editor.g */
public final class C44325g extends C12629j implements C44396a {

    /* renamed from: l */
    public static final C44326a f114534l = new C44326a(null);

    /* renamed from: i */
    public EditViewModel f114535i;

    /* renamed from: j */
    public RelativeLayout f114536j;

    /* renamed from: k */
    public View f114537k;

    /* renamed from: m */
    private EditToolbarViewModel f114538m;

    /* renamed from: n */
    private LinearLayout f114539n;

    /* renamed from: o */
    private final Map<Integer, View> f114540o = new LinkedHashMap();

    /* renamed from: p */
    private C44248ca f114541p;

    /* renamed from: com.ss.android.ugc.gamora.editor.g$a */
    public static final class C44326a {
        private C44326a() {
        }

        public /* synthetic */ C44326a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.g$b */
    public static final class C44327b extends C42939as {

        /* renamed from: a */
        final /* synthetic */ C44267cf f114542a;

        /* renamed from: b */
        final /* synthetic */ C44325g f114543b;

        /* renamed from: a */
        public final void mo70606a(View view) {
            C44325g.m140229a(this.f114543b).mo106440a(this.f114542a.f114425a);
        }

        C44327b(C44267cf cfVar, C44325g gVar) {
            this.f114542a = cfVar;
            this.f114543b = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.g$c */
    static final class C44328c extends Lambda implements C7563m<C44396a, List<? extends C44267cf>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44325g f114544a;

        C44328c(C44325g gVar) {
            this.f114544a = gVar;
            super(2);
        }

        /* renamed from: a */
        private void m140253a(C44396a aVar, List<C44267cf> list) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(list, "it");
            this.f114544a.mo106791a(list);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140253a((C44396a) obj, (List) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.g$d */
    static final class C44329d extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44325g f114545a;

        C44329d(C44325g gVar) {
            this.f114545a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140254a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140254a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            View b = C44325g.m140230b(this.f114545a);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            b.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.g$e */
    static final class C44330e extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44325g f114546a;

        C44330e(C44325g gVar) {
            this.f114546a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140255a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140255a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            LayoutParams layoutParams = C44325g.m140231c(this.f114546a).getLayoutParams();
            if (!(layoutParams instanceof MarginLayoutParams)) {
                layoutParams = null;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
                C44325g.m140231c(this.f114546a).setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.g$f */
    static final class C44331f extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44325g f114547a;

        C44331f(C44325g gVar) {
            this.f114547a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140256a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140256a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            LayoutParams layoutParams = C44325g.m140231c(this.f114547a).getLayoutParams();
            if (!(layoutParams instanceof MarginLayoutParams)) {
                layoutParams = null;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = i;
                C44325g.m140231c(this.f114547a).setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.g$g */
    public static final class C44332g extends C42939as {

        /* renamed from: a */
        final /* synthetic */ C44325g f114548a;

        /* renamed from: a */
        public final void mo70606a(View view) {
            C44325g.m140229a(this.f114548a).mo106452m();
        }

        C44332g(C44325g gVar, long j) {
            this.f114548a = gVar;
            super(600);
        }
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        View h_ = mo31004h_(R.id.bgu);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.layout_bottom_tool)");
        this.f114536j = (RelativeLayout) h_;
        View h_2 = mo31004h_(R.id.no);
        C7573i.m23582a((Object) h_2, "requireViewById(R.id.bottom_bar_container)");
        this.f114539n = (LinearLayout) h_2;
        View h_3 = mo31004h_(R.id.c47);
        C7573i.m23582a((Object) h_3, "requireViewById(R.id.next_step)");
        this.f114537k = h_3;
        View view2 = this.f114537k;
        if (view2 == null) {
            C7573i.m23583a("nextStep");
        }
        view2.setOnClickListener(new C44332g(this, 600));
        if (this.f33526d_ != null) {
            Activity activity = this.f33526d_;
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            if (C44000a.m139267a(activity)) {
                Activity activity2 = this.f33526d_;
                if (activity2 == null) {
                    C7573i.m23580a();
                }
                if (C43057di.m136601a(activity2)) {
                    View view3 = this.f114537k;
                    if (view3 == null) {
                        C7573i.m23583a("nextStep");
                    }
                    C7573i.m23582a((Object) activity2, "it");
                    view3.setBackground(activity2.getResources().getDrawable(R.drawable.f124294do));
                    return;
                }
                View view4 = this.f114537k;
                if (view4 == null) {
                    C7573i.m23583a("nextStep");
                }
                C7573i.m23582a((Object) activity2, "it");
                view4.setBackground(activity2.getResources().getDrawable(R.drawable.dn));
            }
        }
    }

    /* renamed from: a */
    public final void mo106791a(List<C44267cf> list) {
        LinearLayout linearLayout = this.f114539n;
        if (linearLayout == null) {
            C7573i.m23583a("bottomBarContainer");
        }
        linearLayout.removeAllViews();
        this.f114540o.clear();
        for (C44267cf cfVar : list) {
            Activity activity = this.f33526d_;
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            View a = C39529a.m126252a(activity, cfVar.f114427c, cfVar.f114426b);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = (int) C9738o.m28708b(mo31011s(), 4.0f);
            LinearLayout linearLayout2 = this.f114539n;
            if (linearLayout2 == null) {
                C7573i.m23583a("bottomBarContainer");
            }
            linearLayout2.addView(a, layoutParams);
            this.f114540o.put(Integer.valueOf(cfVar.f114425a), a);
            a.setOnClickListener(new C44327b(cfVar, this));
        }
        m140224H();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
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

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        C44248ca caVar = this.f114541p;
        if (caVar != null) {
            caVar.mo106740a();
        }
    }

    /* renamed from: J */
    private final void m140226J() {
        List arrayList = new ArrayList();
        EditViewModel editViewModel = this.f114535i;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        boolean s = editViewModel.mo106458s();
        if (s) {
            arrayList.add(new C44267cf(12, R.drawable.b10, R.string.ajh));
        }
        arrayList.add(new C44267cf(1, R.drawable.acz, R.string.chm));
        if (!s) {
            arrayList.add(new C44267cf(2, R.drawable.aq3, R.string.az2));
        }
        arrayList.add(new C44267cf(3, R.drawable.aqk, R.string.fso));
        arrayList.add(new C44267cf(4, R.drawable.aqi, R.string.e1d));
        EditToolbarViewModel editToolbarViewModel = this.f114538m;
        if (editToolbarViewModel == null) {
            C7573i.m23583a("editToolbarViewModel");
        }
        editToolbarViewModel.mo106415b(arrayList);
    }

    /* renamed from: G */
    private final void m140223G() {
        EditToolbarViewModel editToolbarViewModel = this.f114538m;
        if (editToolbarViewModel == null) {
            C7573i.m23583a("editToolbarViewModel");
        }
        mo91868b(editToolbarViewModel, C44333h.f114549a, new C11672v(), new C44328c(this));
        EditToolbarViewModel editToolbarViewModel2 = this.f114538m;
        if (editToolbarViewModel2 == null) {
            C7573i.m23583a("editToolbarViewModel");
        }
        mo91868b(editToolbarViewModel2, C44334i.f114550a, new C11672v(), new C44329d(this));
        EditToolbarViewModel editToolbarViewModel3 = this.f114538m;
        if (editToolbarViewModel3 == null) {
            C7573i.m23583a("editToolbarViewModel");
        }
        mo91868b(editToolbarViewModel3, C44335j.f114551a, new C11672v(), new C44330e(this));
        EditToolbarViewModel editToolbarViewModel4 = this.f114538m;
        if (editToolbarViewModel4 == null) {
            C7573i.m23583a("editToolbarViewModel");
        }
        mo91868b(editToolbarViewModel4, C44336k.f114552a, new C11672v(), new C44331f(this));
        View view = (View) this.f114540o.get(Integer.valueOf(9));
        if (view != null) {
            C44248ca caVar = this.f114541p;
            if (caVar == null) {
                return;
            }
            if (view != null) {
                caVar.mo106743a((C39528f) view);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
            }
        }
    }

    /* renamed from: H */
    private final void m140224H() {
        C44248ca caVar = this.f114541p;
        if (caVar != null) {
            caVar.mo106740a();
        }
        Activity activity = this.f33526d_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            EditViewModel editViewModel = this.f114535i;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            EditToolbarViewModel editToolbarViewModel = this.f114538m;
            if (editToolbarViewModel == null) {
                C7573i.m23583a("editToolbarViewModel");
            }
            C12629j jVar = this.f33524c;
            if (jVar != null) {
                C44248ca caVar2 = new C44248ca(fragmentActivity, editViewModel, editToolbarViewModel, (C12604b) jVar);
                caVar2.mo106744a(this.f114540o);
                caVar2.mo106748b(this.f114540o);
                caVar2.mo106749c(this.f114540o);
                caVar2.mo106745a(this.f114540o, 48);
                if (this.f114535i == null) {
                    C7573i.m23583a("editViewModel");
                }
                if (EditViewModel.m139162E()) {
                    EditToolbarViewModel editToolbarViewModel2 = this.f114538m;
                    if (editToolbarViewModel2 == null) {
                        C7573i.m23583a("editToolbarViewModel");
                    }
                    editToolbarViewModel2.f113758d.f114389e = C35563c.f93230L.mo93342a(Property.CombinedShootModeTipShown);
                    caVar2.mo106742a((View) this.f114540o.get(Integer.valueOf(1)));
                }
                View view = (View) this.f114540o.get(Integer.valueOf(1));
                if (view != null) {
                    if (view != null) {
                        caVar2.mo106747b((C39528f) view);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                    }
                }
                this.f114541p = caVar2;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: K */
    private final void m140227K() {
        EditViewModel editViewModel = this.f114535i;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        VideoPublishEditModel f = editViewModel.mo29069f();
        if (C39360dw.m125725a().mo97931b() != null || (f.isMvThemeVideoType() && !C23477d.m77081a((Collection<T>) f.mvCreateVideoData.musicIds))) {
            C39779q.m127362a("music", -1);
        } else {
            C39779q.m127362a("music", C39779q.m127372d());
        }
        C39779q.m127362a("effect", C39779q.m127374f());
        if (this.f114535i == null) {
            C7573i.m23583a("editViewModel");
        }
        if (!EditViewModel.m139163F()) {
            C39779q.m127362a("sticker", -1);
        } else if (C39779q.m127369b(f.isReviewVideo()) || C39779q.m127371c(f.isReviewVideo())) {
            C39779q.m127362a("sticker", C39779q.m127368b());
        } else if (C39779q.m127367a("sticker")) {
            C39779q.m127362a("sticker", -1);
        } else {
            C39779q.m127362a("sticker", C39779q.m127373e());
        }
        EditViewModel editViewModel2 = this.f114535i;
        if (editViewModel2 == null) {
            C7573i.m23583a("editViewModel");
        }
        if (!editViewModel2.mo106458s() || C39779q.m127367a("status_background")) {
            C39779q.m127362a("status_background", -1);
        } else {
            C39779q.m127362a("status_background", C39779q.m127360a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r0.mo106428A() != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0.mo106462x() != false) goto L_0x0023;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m140225I() {
        /*
            r5 = this;
            r5.m140226J()
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r5.f114535i
            if (r0 != 0) goto L_0x000c
            java.lang.String r1 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x000c:
            boolean r0 = r0.mo106461w()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0023
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r5.f114535i
            if (r0 != 0) goto L_0x001d
            java.lang.String r3 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x001d:
            boolean r0 = r0.mo106462x()
            if (r0 == 0) goto L_0x002f
        L_0x0023:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r5.f114538m
            if (r0 != 0) goto L_0x002c
            java.lang.String r3 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x002c:
            r0.mo106424e(r2, r1)
        L_0x002f:
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r5.f114535i
            if (r0 != 0) goto L_0x0038
            java.lang.String r3 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0038:
            boolean r0 = r0.mo106464z()
            if (r0 != 0) goto L_0x004d
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r5.f114535i
            if (r0 != 0) goto L_0x0047
            java.lang.String r3 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0047:
            boolean r0 = r0.mo106428A()
            if (r0 == 0) goto L_0x0059
        L_0x004d:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r5.f114538m
            if (r0 != 0) goto L_0x0056
            java.lang.String r3 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0056:
            r0.mo106421d(r2, r1)
        L_0x0059:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 != 0) goto L_0x007c
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r5.f114538m
            if (r0 != 0) goto L_0x0068
            java.lang.String r1 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0068:
            android.app.Activity r1 = r5.mo31015v()
            r3 = 2131826478(0x7f11172e, float:1.9285842E38)
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "requireActivity().getString(R.string.select_music)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            r0.mo106409a(r1)
            goto L_0x0098
        L_0x007c:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r5.f114538m
            if (r0 != 0) goto L_0x0085
            java.lang.String r1 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0085:
            android.app.Activity r1 = r5.mo31015v()
            r3 = 2131824963(0x7f111143, float:1.9282769E38)
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "requireActivity().getString(R.string.music_select)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            r0.mo106409a(r1)
        L_0x0098:
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r5.f114535i
            if (r0 != 0) goto L_0x00a1
            java.lang.String r1 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00a1:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.mo29069f()
            com.ss.android.ugc.aweme.shortvideo.dw r1 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r1 = r1.mo97931b()
            com.ss.android.ugc.gamora.editor.EditViewModel r3 = r5.f114535i
            if (r3 != 0) goto L_0x00b6
            java.lang.String r4 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x00b6:
            boolean r3 = r3.mo106428A()
            if (r3 != 0) goto L_0x00f0
            int r3 = r0.recordMode
            if (r3 != r2) goto L_0x00c4
            boolean r2 = r0.mIsFromDraft
            if (r2 == 0) goto L_0x00cc
        L_0x00c4:
            if (r1 != 0) goto L_0x00f0
            boolean r0 = r0.isStatusVideoType()
            if (r0 != 0) goto L_0x00f0
        L_0x00cc:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r5.f114538m
            if (r0 != 0) goto L_0x00d5
            java.lang.String r1 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00d5:
            android.app.Activity r1 = r5.mo31015v()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131232230(0x7f0805e6, float:1.8080563E38)
            android.graphics.drawable.Drawable r1 = android.support.p022v4.content.C0683b.m2903a(r1, r2)
            if (r1 != 0) goto L_0x00e7
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00e7:
            java.lang.String r2 = "ContextCompat.getDrawabl….drawable.ic_music_add)!!"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r0.mo106408a(r1)
            goto L_0x0113
        L_0x00f0:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r5.f114538m
            if (r0 != 0) goto L_0x00f9
            java.lang.String r1 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00f9:
            android.app.Activity r1 = r5.mo31015v()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131232713(0x7f0807c9, float:1.8081543E38)
            android.graphics.drawable.Drawable r1 = android.support.p022v4.content.C0683b.m2903a(r1, r2)
            if (r1 != 0) goto L_0x010b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x010b:
            java.lang.String r2 = "ContextCompat.getDrawabl…edit_addmusic_complete)!!"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r0.mo106408a(r1)
        L_0x0113:
            r5.m140227K()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44325g.m140225I():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ EditViewModel m140229a(C44325g gVar) {
        EditViewModel editViewModel = gVar.f114535i;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m140230b(C44325g gVar) {
        View view = gVar.f114537k;
        if (view == null) {
            C7573i.m23583a("nextStep");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ RelativeLayout m140231c(C44325g gVar) {
        RelativeLayout relativeLayout = gVar.f114536j;
        if (relativeLayout == null) {
            C7573i.m23583a("bottomLayout");
        }
        return relativeLayout;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        m140223G();
        m140225I();
    }

    /* renamed from: d */
    public final void mo30944d(Bundle bundle) {
        super.mo30944d(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java]");
            this.f114535i = (EditViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditToolbarViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…barViewModel::class.java]");
                this.f114538m = (EditToolbarViewModel) a2;
                return;
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
        if (this.f33526d_ != null) {
            Activity activity = this.f33526d_;
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            if (C44000a.m139267a(activity)) {
                View inflate = layoutInflater.inflate(R.layout.aih, viewGroup, false);
                C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…_small, container, false)");
                return inflate;
            }
        }
        View inflate2 = layoutInflater.inflate(R.layout.aig, viewGroup, false);
        C7573i.m23582a((Object) inflate2, "inflater.inflate(R.layou…om_bar, container, false)");
        return inflate2;
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
