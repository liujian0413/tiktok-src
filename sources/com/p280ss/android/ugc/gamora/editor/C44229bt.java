package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
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
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39528f;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39528f.C39529a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39530g;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39531h;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39779q;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39506a.C39507a;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C43072du;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
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

/* renamed from: com.ss.android.ugc.gamora.editor.bt */
public final class C44229bt extends C12629j implements C44396a {

    /* renamed from: p */
    public static final C44230a f114354p = new C44230a(null);

    /* renamed from: i */
    public ConstraintLayout f114355i;

    /* renamed from: j */
    public EditViewModel f114356j;

    /* renamed from: k */
    public ImageView f114357k;

    /* renamed from: l */
    public TextView f114358l;

    /* renamed from: m */
    public ViewGroup f114359m;

    /* renamed from: n */
    public final Map<Integer, View> f114360n = new LinkedHashMap();

    /* renamed from: o */
    public C39531h f114361o;

    /* renamed from: q */
    private EditToolbarViewModel f114362q;

    /* renamed from: r */
    private VideoPublishEditModel f114363r;

    /* renamed from: s */
    private EditAutoEnhanceViewModel f114364s;

    /* renamed from: t */
    private C44248ca f114365t;

    /* renamed from: com.ss.android.ugc.gamora.editor.bt$a */
    public static final class C44230a {
        private C44230a() {
        }

        public /* synthetic */ C44230a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bt$b */
    static final class C44231b extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44229bt f114366a;

        C44231b(C44229bt btVar) {
            this.f114366a = btVar;
            super(2);
        }

        /* renamed from: a */
        private void m140009a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C39531h hVar = this.f114366a.f114361o;
            if (hVar != null) {
                hVar.mo98387a(z);
            }
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140009a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bt$c */
    static final class C44232c extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44229bt f114367a;

        C44232c(C44229bt btVar) {
            this.f114367a = btVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140010a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140010a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            LayoutParams layoutParams = C44229bt.m139989e(this.f114367a).getLayoutParams();
            if (!(layoutParams instanceof MarginLayoutParams)) {
                layoutParams = null;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = i;
                C44229bt.m139989e(this.f114367a).setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bt$d */
    static final class C44233d extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44229bt f114368a;

        C44233d(C44229bt btVar) {
            this.f114368a = btVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140011a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140011a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            ImageView b = C44229bt.m139986b(this.f114368a);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            b.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bt$e */
    static final class C44234e extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44229bt f114369a;

        C44234e(C44229bt btVar) {
            this.f114369a = btVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140012a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140012a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            TextView c = C44229bt.m139987c(this.f114369a);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            c.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bt$f */
    static final class C44235f extends Lambda implements C7563m<C44396a, List<? extends C44267cf>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44229bt f114370a;

        /* renamed from: com.ss.android.ugc.gamora.editor.bt$f$a */
        public static final class C44236a implements C39530g {

            /* renamed from: a */
            final /* synthetic */ C44235f f114371a;

            /* renamed from: a */
            public final void mo98384a() {
                C6907h.m21524a("click_more_icon", (Map) C22984d.m75611a().mo59973a("creation_id", C44229bt.m139985a(this.f114371a.f114370a).mo29069f().creationId).mo59973a("enter_from", "video_edit_page").mo59973a("shoot_way", C44229bt.m139985a(this.f114371a.f114370a).mo29069f().mShootWay).mo59973a("content_type", C39500av.m126133a(C44229bt.m139985a(this.f114371a.f114370a).mo29069f())).mo59973a("content_source", C39500av.m126142b(C44229bt.m139985a(this.f114371a.f114370a).mo29069f())).f60753a);
            }

            C44236a(C44235f fVar) {
                this.f114371a = fVar;
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.bt$f$b */
        public static final class C44237b extends C42939as {

            /* renamed from: a */
            final /* synthetic */ C44267cf f114372a;

            /* renamed from: b */
            final /* synthetic */ C44235f f114373b;

            /* renamed from: c */
            final /* synthetic */ List f114374c;

            /* renamed from: d */
            final /* synthetic */ Map f114375d;

            /* renamed from: a */
            public final void mo70606a(View view) {
                C44229bt.m139985a(this.f114373b.f114370a).mo106440a(this.f114372a.f114425a);
            }

            C44237b(C44267cf cfVar, C44235f fVar, List list, Map map) {
                this.f114372a = cfVar;
                this.f114373b = fVar;
                this.f114374c = list;
                this.f114375d = map;
            }
        }

        C44235f(C44229bt btVar) {
            this.f114370a = btVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140013a((C44396a) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140013a(C44396a aVar, List<C44267cf> list) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(list, "items");
            List arrayList = new ArrayList();
            Map linkedHashMap = new LinkedHashMap();
            for (C44267cf cfVar : list) {
                Activity activity = this.f114370a.f33526d_;
                if (activity == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) activity, "activity!!");
                View a = C39529a.m126252a(activity, cfVar.f114427c, cfVar.f114426b);
                arrayList.add(a);
                linkedHashMap.put(Integer.valueOf(cfVar.f114425a), a);
                a.setOnClickListener(new C44237b(cfVar, this, arrayList, linkedHashMap));
            }
            this.f114370a.f114360n.clear();
            this.f114370a.f114360n.putAll(linkedHashMap);
            C44229bt.m139988d(this.f114370a).removeAllViews();
            C39531h hVar = this.f114370a.f114361o;
            if (hVar != null) {
                hVar.mo98388b();
            }
            C44229bt btVar = this.f114370a;
            ViewGroup d = C44229bt.m139988d(this.f114370a);
            Activity activity2 = this.f114370a.f33526d_;
            if (activity2 == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity2, "activity!!");
            C39531h hVar2 = new C39531h(d, arrayList, activity2);
            hVar2.mo98385a();
            hVar2.f102595a = new C44236a(this);
            btVar.f114361o = hVar2;
            this.f114370a.mo30920G();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bt$g */
    static final class C44238g extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44229bt f114376a;

        C44238g(C44229bt btVar) {
            this.f114376a = btVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140016a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140016a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            C39531h hVar = this.f114376a.f114361o;
            if (hVar != null) {
                hVar.mo98388b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bt$h */
    public static final class C44239h extends C42939as {

        /* renamed from: a */
        final /* synthetic */ C44229bt f114377a;

        C44239h(C44229bt btVar) {
            this.f114377a = btVar;
        }

        /* renamed from: a */
        public final void mo70606a(View view) {
            C7573i.m23587b(view, "v");
            C44229bt.m139985a(this.f114377a).mo106451l();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bt$i */
    public static final class C44240i extends C42939as {

        /* renamed from: a */
        final /* synthetic */ C44229bt f114378a;

        C44240i(C44229bt btVar) {
            this.f114378a = btVar;
        }

        /* renamed from: a */
        public final void mo70606a(View view) {
            C7573i.m23587b(view, "v");
            C43072du.m136630a("camera_start");
            C44229bt.m139985a(this.f114378a).mo106451l();
        }
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        m139979H();
        m139980I();
        m139981J();
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
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
        C44248ca caVar = this.f114365t;
        if (caVar != null) {
            caVar.mo106740a();
        }
    }

    /* renamed from: L */
    private final void m139983L() {
        EditViewModel editViewModel = this.f114356j;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        if (!editViewModel.mo106430C()) {
            C39779q.m127362a("voice", -1);
        } else {
            C39779q.m127362a("voice", C39779q.m127375g());
        }
        if (!C39507a.m126197d()) {
            C39779q.m127362a("auto_enhance", -1);
        } else {
            C39779q.m127362a("auto_enhance", C39779q.m127370c());
        }
    }

    /* renamed from: H */
    private final void m139979H() {
        View h_ = mo31004h_(R.id.jn);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.back)");
        this.f114357k = (ImageView) h_;
        ImageView imageView = this.f114357k;
        if (imageView == null) {
            C7573i.m23583a("mBackImageView");
        }
        imageView.setOnClickListener(new C44239h(this));
        View h_2 = mo31004h_(R.id.dqr);
        C7573i.m23582a((Object) h_2, "requireViewById(R.id.tv_back_tip)");
        this.f114358l = (TextView) h_2;
        TextView textView = this.f114358l;
        if (textView == null) {
            C7573i.m23583a("mTvBackTip");
        }
        textView.setOnClickListener(new C44240i(this));
        View h_3 = mo31004h_(R.id.bki);
        C7573i.m23582a((Object) h_3, "requireViewById(R.id.layout_tool_container)");
        this.f114359m = (ViewGroup) h_3;
    }

    /* renamed from: I */
    private final void m139980I() {
        EditToolbarViewModel editToolbarViewModel = this.f114362q;
        if (editToolbarViewModel == null) {
            C7573i.m23583a("editToolbarViewModel");
        }
        mo91868b(editToolbarViewModel, C44241bu.f114379a, new C11672v(), new C44233d(this));
        EditToolbarViewModel editToolbarViewModel2 = this.f114362q;
        if (editToolbarViewModel2 == null) {
            C7573i.m23583a("editToolbarViewModel");
        }
        mo91868b(editToolbarViewModel2, C44243bw.f114381a, new C11672v(), new C44234e(this));
        EditToolbarViewModel editToolbarViewModel3 = this.f114362q;
        if (editToolbarViewModel3 == null) {
            C7573i.m23583a("editToolbarViewModel");
        }
        mo91868b(editToolbarViewModel3, C44244bx.f114382a, new C11672v(), new C44235f(this));
        EditToolbarViewModel editToolbarViewModel4 = this.f114362q;
        if (editToolbarViewModel4 == null) {
            C7573i.m23583a("editToolbarViewModel");
        }
        mo91869c(editToolbarViewModel4, C44245by.f114383a, new C11672v(), new C44238g(this));
        EditToolbarViewModel editToolbarViewModel5 = this.f114362q;
        if (editToolbarViewModel5 == null) {
            C7573i.m23583a("editToolbarViewModel");
        }
        mo91868b(editToolbarViewModel5, C44246bz.f114384a, new C11672v(), new C44231b(this));
        EditToolbarViewModel editToolbarViewModel6 = this.f114362q;
        if (editToolbarViewModel6 == null) {
            C7573i.m23583a("editToolbarViewModel");
        }
        mo91868b(editToolbarViewModel6, C44242bv.f114380a, new C11672v(), new C44232c(this));
    }

    /* renamed from: G */
    public final void mo30920G() {
        C44248ca caVar = this.f114365t;
        if (caVar != null) {
            caVar.mo106740a();
        }
        Activity activity = this.f33526d_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            EditViewModel editViewModel = this.f114356j;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            EditToolbarViewModel editToolbarViewModel = this.f114362q;
            if (editToolbarViewModel == null) {
                C7573i.m23583a("editToolbarViewModel");
            }
            C12629j jVar = this.f33524c;
            if (jVar != null) {
                C44248ca caVar2 = new C44248ca(fragmentActivity, editViewModel, editToolbarViewModel, (C12604b) jVar);
                caVar2.mo106744a(this.f114360n);
                caVar2.mo106748b(this.f114360n);
                caVar2.mo106749c(this.f114360n);
                caVar2.mo106745a(this.f114360n, 80);
                View view = (View) this.f114360n.get(Integer.valueOf(1));
                if (view != null) {
                    if (view != null) {
                        caVar2.mo106747b((C39528f) view);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                    }
                }
                View view2 = (View) this.f114360n.get(Integer.valueOf(9));
                if (view2 != null) {
                    if (view2 != null) {
                        caVar2.mo106743a((C39528f) view2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
                    }
                }
                this.f114365t = caVar2;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: K */
    private final void m139982K() {
        List arrayList = new ArrayList();
        EditViewModel editViewModel = this.f114356j;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        boolean s = editViewModel.mo106458s();
        EditViewModel editViewModel2 = this.f114356j;
        if (editViewModel2 == null) {
            C7573i.m23583a("editViewModel");
        }
        if (editViewModel2.mo106429B()) {
            arrayList.add(new C44267cf(13, R.drawable.a4n, R.string.axh));
        }
        if (C39507a.m126197d() && !s) {
            arrayList.add(new C44267cf(9, R.drawable.ed, R.string.nl));
        }
        EditViewModel editViewModel3 = this.f114356j;
        if (editViewModel3 == null) {
            C7573i.m23583a("editViewModel");
        }
        if (editViewModel3.mo106430C()) {
            arrayList.add(new C44267cf(6, R.drawable.aqp, R.string.p1));
        }
        arrayList.add(new C44267cf(5, R.drawable.aq4, R.string.b6p));
        EditViewModel editViewModel4 = this.f114356j;
        if (editViewModel4 == null) {
            C7573i.m23583a("editViewModel");
        }
        if (editViewModel4.mo106432G()) {
            arrayList.add(new C44267cf(11, R.drawable.aqj, R.string.mu));
        }
        if (this.f114356j == null) {
            C7573i.m23583a("editViewModel");
        }
        if (!EditViewModel.m139162E()) {
            EditViewModel editViewModel5 = this.f114356j;
            if (editViewModel5 == null) {
                C7573i.m23583a("editViewModel");
            }
            if (!editViewModel5.mo106461w()) {
                EditViewModel editViewModel6 = this.f114356j;
                if (editViewModel6 == null) {
                    C7573i.m23583a("editViewModel");
                }
                if (!editViewModel6.mo106462x()) {
                    arrayList.add(new C44267cf(8, R.drawable.apw, R.string.amm));
                }
            }
            EditViewModel editViewModel7 = this.f114356j;
            if (editViewModel7 == null) {
                C7573i.m23583a("editViewModel");
            }
            if (!editViewModel7.mo106461w()) {
                arrayList.add(new C44267cf(7, R.drawable.aqq, R.string.dvi));
            }
        } else {
            EditViewModel editViewModel8 = this.f114356j;
            if (editViewModel8 == null) {
                C7573i.m23583a("editViewModel");
            }
            if (editViewModel8.mo106462x()) {
                arrayList.add(new C44267cf(7, R.drawable.aqq, R.string.dvi));
            }
        }
        EditViewModel editViewModel9 = this.f114356j;
        if (editViewModel9 == null) {
            C7573i.m23583a("editViewModel");
        }
        if (editViewModel9.mo106431D()) {
            arrayList.add(new C44267cf(10, R.drawable.aqa, R.string.ajf));
        }
        EditToolbarViewModel editToolbarViewModel = this.f114362q;
        if (editToolbarViewModel == null) {
            C7573i.m23583a("editToolbarViewModel");
        }
        editToolbarViewModel.mo106410a(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0145, code lost:
        if (r0.mo106434I() != false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01b5, code lost:
        if (r0.isStickPointMode == false) goto L_0x01b9;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m139981J() {
        /*
            r6 = this;
            r6.m139982K()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114363r
            if (r0 != 0) goto L_0x000c
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x000c:
            boolean r0 = r0.mIsFromDraft
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f114356j
            if (r0 != 0) goto L_0x001b
            java.lang.String r3 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x001b:
            boolean r0 = r0.mo106461w()
            if (r0 != 0) goto L_0x006b
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f114356j
            if (r0 != 0) goto L_0x002a
            java.lang.String r3 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x002a:
            boolean r0 = r0.mo106433H()
            if (r0 != 0) goto L_0x006b
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f114356j
            if (r0 != 0) goto L_0x0039
            java.lang.String r3 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0039:
            boolean r0 = r0.mo106462x()
            if (r0 != 0) goto L_0x006b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114363r
            if (r0 != 0) goto L_0x0048
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0048:
            boolean r0 = r0.isMvThemeVideoType()
            if (r0 != 0) goto L_0x006b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114363r
            if (r0 != 0) goto L_0x0057
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0057:
            boolean r0 = r0.isStatusVideoType()
            if (r0 == 0) goto L_0x005e
            goto L_0x006b
        L_0x005e:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r6.f114362q
            if (r0 != 0) goto L_0x0067
            java.lang.String r3 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0067:
            r0.mo106416b(r1)
            goto L_0x0077
        L_0x006b:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r6.f114362q
            if (r0 != 0) goto L_0x0074
            java.lang.String r3 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0074:
            r0.mo106416b(r2)
        L_0x0077:
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39506a.C39507a.m126197d()
            if (r0 == 0) goto L_0x00c6
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r6.f114362q
            if (r0 != 0) goto L_0x0086
            java.lang.String r3 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0086:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r6.f114363r
            if (r3 != 0) goto L_0x008f
            java.lang.String r4 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x008f:
            boolean r3 = r3.autoEnhanceOn
            if (r3 == 0) goto L_0x00a9
            android.app.Activity r3 = r6.f33526d_
            if (r3 != 0) goto L_0x009a
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x009a:
            android.content.Context r3 = (android.content.Context) r3
            r4 = 2131230910(0x7f0800be, float:1.8077886E38)
            android.graphics.drawable.Drawable r3 = android.support.p022v4.content.C0683b.m2903a(r3, r4)
            if (r3 != 0) goto L_0x00be
            kotlin.jvm.internal.C7573i.m23580a()
            goto L_0x00be
        L_0x00a9:
            android.app.Activity r3 = r6.f33526d_
            if (r3 != 0) goto L_0x00b0
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00b0:
            android.content.Context r3 = (android.content.Context) r3
            r4 = 2131230908(0x7f0800bc, float:1.8077882E38)
            android.graphics.drawable.Drawable r3 = android.support.p022v4.content.C0683b.m2903a(r3, r4)
            if (r3 != 0) goto L_0x00be
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00be:
            java.lang.String r4 = "if (mModel.autoEnhanceOn…c_auto_enhance_off_new)!!"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            r0.mo106414b(r3)
        L_0x00c6:
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f114356j
            if (r0 != 0) goto L_0x00cf
            java.lang.String r3 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00cf:
            boolean r0 = r0.mo106464z()
            r3 = 8
            if (r0 == 0) goto L_0x00fc
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r6.f114362q
            if (r0 != 0) goto L_0x00e0
            java.lang.String r4 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x00e0:
            r0.mo106421d(r3, r2)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r6.f114362q
            if (r0 != 0) goto L_0x00ec
            java.lang.String r4 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x00ec:
            r4 = 7
            r0.mo106421d(r4, r2)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r6.f114362q
            if (r0 != 0) goto L_0x00f9
            java.lang.String r5 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x00f9:
            r0.mo106407a(r4, r2)
        L_0x00fc:
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f114356j
            if (r0 != 0) goto L_0x0105
            java.lang.String r4 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0105:
            boolean r0 = r0.mo106430C()
            if (r0 == 0) goto L_0x017f
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f114356j
            if (r0 != 0) goto L_0x0114
            java.lang.String r4 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0114:
            boolean r0 = r0.mo106461w()
            if (r0 != 0) goto L_0x0147
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f114356j
            if (r0 != 0) goto L_0x0123
            java.lang.String r4 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0123:
            boolean r0 = r0.mo106462x()
            if (r0 != 0) goto L_0x0147
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f114356j
            if (r0 != 0) goto L_0x0132
            java.lang.String r4 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0132:
            boolean r0 = r0.mo106463y()
            if (r0 != 0) goto L_0x0147
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f114356j
            if (r0 != 0) goto L_0x0141
            java.lang.String r4 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0141:
            boolean r0 = r0.mo106434I()
            if (r0 == 0) goto L_0x017f
        L_0x0147:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114363r
            if (r0 != 0) goto L_0x0150
            java.lang.String r4 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0150:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            r4 = 6
            if (r0 == 0) goto L_0x0173
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114363r
            if (r0 != 0) goto L_0x015e
            java.lang.String r5 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x015e:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            boolean r0 = r0.hasRecord()
            if (r0 == 0) goto L_0x0173
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r6.f114362q
            if (r0 != 0) goto L_0x016f
            java.lang.String r5 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x016f:
            r0.mo106421d(r4, r1)
            goto L_0x017f
        L_0x0173:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r6.f114362q
            if (r0 != 0) goto L_0x017c
            java.lang.String r5 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x017c:
            r0.mo106421d(r4, r2)
        L_0x017f:
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f114356j
            if (r0 != 0) goto L_0x0188
            java.lang.String r4 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0188:
            boolean r0 = r0.mo106461w()
            if (r0 != 0) goto L_0x01b8
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f114356j
            if (r0 != 0) goto L_0x0197
            java.lang.String r4 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0197:
            boolean r0 = r0.mo106462x()
            if (r0 != 0) goto L_0x01b8
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114363r
            if (r0 != 0) goto L_0x01a6
            java.lang.String r4 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x01a6:
            java.lang.String r0 = r0.mMusicPath
            if (r0 == 0) goto L_0x01b8
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114363r
            if (r0 != 0) goto L_0x01b3
            java.lang.String r4 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x01b3:
            boolean r0 = r0.isStickPointMode
            if (r0 != 0) goto L_0x01b8
            goto L_0x01b9
        L_0x01b8:
            r1 = 0
        L_0x01b9:
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f114363r
            if (r4 != 0) goto L_0x01ca
            java.lang.String r5 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x01ca:
            boolean r4 = r4.isMvThemeVideoType()
            if (r4 == 0) goto L_0x01ff
            if (r0 == 0) goto L_0x01ff
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f114363r
            if (r4 != 0) goto L_0x01db
            java.lang.String r5 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x01db:
            com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r4 = r4.mvCreateVideoData
            java.util.List<java.lang.String> r4 = r4.musicIds
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = com.p280ss.android.ugc.aweme.base.utils.C23477d.m77081a(r4)
            if (r4 != 0) goto L_0x01ff
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f114363r
            if (r4 != 0) goto L_0x01f0
            java.lang.String r5 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x01f0:
            com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r4 = r4.mvCreateVideoData
            java.util.List<java.lang.String> r4 = r4.musicIds
            java.lang.String r0 = r0.getMusicId()
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x01ff
            r1 = 0
        L_0x01ff:
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f114356j
            if (r0 != 0) goto L_0x0208
            java.lang.String r0 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0208:
            boolean r0 = com.p280ss.android.ugc.gamora.editor.EditViewModel.m139162E()
            if (r0 == 0) goto L_0x0231
            android.app.Activity r0 = r6.f33526d_
            if (r0 == 0) goto L_0x0229
            android.support.v4.app.FragmentActivity r0 = (android.support.p022v4.app.FragmentActivity) r0
            com.ss.android.ugc.gamora.a.a r0 = com.p280ss.android.ugc.gamora.p1486a.C36113b.m116288a(r0)
            java.lang.Class<com.ss.android.ugc.gamora.editor.EditMusicViewModel> r2 = com.p280ss.android.ugc.gamora.editor.EditMusicViewModel.class
            com.bytedance.jedi.arch.JediViewModel r0 = r0.mo91871a(r2)
            java.lang.String r2 = "JediViewModelProviders.o…sicViewModel::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.gamora.editor.EditMusicViewModel r0 = (com.p280ss.android.ugc.gamora.editor.EditMusicViewModel) r0
            r0.mo106301a(r1)
            goto L_0x023d
        L_0x0229:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        L_0x0231:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r6.f114362q
            if (r0 != 0) goto L_0x023a
            java.lang.String r2 = "editToolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x023a:
            r0.mo106407a(r3, r1)
        L_0x023d:
            r6.m139983L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44229bt.m139981J():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ EditViewModel m139985a(C44229bt btVar) {
        EditViewModel editViewModel = btVar.f114356j;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m139986b(C44229bt btVar) {
        ImageView imageView = btVar.f114357k;
        if (imageView == null) {
            C7573i.m23583a("mBackImageView");
        }
        return imageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m139987c(C44229bt btVar) {
        TextView textView = btVar.f114358l;
        if (textView == null) {
            C7573i.m23583a("mTvBackTip");
        }
        return textView;
    }

    /* renamed from: d */
    public static final /* synthetic */ ViewGroup m139988d(C44229bt btVar) {
        ViewGroup viewGroup = btVar.f114359m;
        if (viewGroup == null) {
            C7573i.m23583a("mToolbarContainer");
        }
        return viewGroup;
    }

    /* renamed from: e */
    public static final /* synthetic */ ConstraintLayout m139989e(C44229bt btVar) {
        ConstraintLayout constraintLayout = btVar.f114355i;
        if (constraintLayout == null) {
            C7573i.m23583a("titleLayout");
        }
        return constraintLayout;
    }

    /* renamed from: d */
    public final void mo30944d(Bundle bundle) {
        super.mo30944d(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java]");
            this.f114356j = (EditViewModel) a;
            EditViewModel editViewModel = this.f114356j;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            this.f114363r = editViewModel.mo29069f();
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditToolbarViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…barViewModel::class.java]");
                this.f114362q = (EditToolbarViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditAutoEnhanceViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…nceViewModel::class.java)");
                    this.f114364s = (EditAutoEnhanceViewModel) a3;
                    return;
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
        View inflate = layoutInflater.inflate(R.layout.aix, viewGroup, false);
        if (inflate != null) {
            this.f114355i = (ConstraintLayout) inflate;
            ConstraintLayout constraintLayout = this.f114355i;
            if (constraintLayout == null) {
                C7573i.m23583a("titleLayout");
            }
            return constraintLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
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
