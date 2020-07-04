package com.p280ss.android.ugc.gamora.recorder;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
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
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35590t;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.p280ss.android.ugc.aweme.tools.C42581q;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.recorder.x */
public final class C44825x extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f115304i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44825x.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;"))};

    /* renamed from: l */
    public static final C44826a f115305l = new C44826a(null);

    /* renamed from: j */
    public C39382ed f115306j;

    /* renamed from: k */
    public LinearLayout f115307k;

    /* renamed from: m */
    private final C7541d f115308m;

    /* renamed from: n */
    private long f115309n;

    /* renamed from: o */
    private DmtTextView f115310o;

    /* renamed from: com.ss.android.ugc.gamora.recorder.x$a */
    public static final class C44826a {
        private C44826a() {
        }

        public /* synthetic */ C44826a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.x$b */
    static final class C44827b extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44825x f115311a;

        C44827b(C44825x xVar) {
            this.f115311a = xVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141490a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141490a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            int b = (int) C9738o.m28708b((Context) this.f115311a.f33526d_, 33.0f);
            LayoutParams layoutParams = C44825x.m141469a(this.f115311a).getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (z) {
                    i = b + ((int) C9738o.m28708b((Context) this.f115311a.f33526d_, 150.0f));
                } else {
                    i = (int) C9738o.m28708b((Context) this.f115311a.f33526d_, 150.0f);
                }
                layoutParams2.bottomMargin = i;
                C44825x.m141469a(this.f115311a).setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.x$c */
    static final class C44828c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44825x f115312a;

        /* renamed from: b */
        final /* synthetic */ FaceStickerBean f115313b;

        /* renamed from: c */
        final /* synthetic */ C42581q f115314c;

        /* renamed from: d */
        final /* synthetic */ FaceStickerCommerceBean f115315d;

        C44828c(C44825x xVar, FaceStickerBean faceStickerBean, C42581q qVar, FaceStickerCommerceBean faceStickerCommerceBean) {
            this.f115312a = xVar;
            this.f115313b = faceStickerBean;
            this.f115314c = qVar;
            this.f115315d = faceStickerCommerceBean;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42962b.f111525a.mo104671a("click_transform_link", C22984d.m75611a().mo59971a("prop_id", this.f115313b.getStickerId()).mo59973a("shoot_way", this.f115314c.f110728b).mo59973a("carrier_type", "video_shoot_page").f60753a);
            if (!C35563c.f93251n.mo83174a((Context) C44825x.m141471b(this.f115312a).f33526d_, this.f115315d.f108865b, false)) {
                C35590t tVar = C35563c.f93251n;
                Context context = C44825x.m141471b(this.f115312a).f33526d_;
                String str = this.f115315d.f108864a;
                C7573i.m23582a((Object) str, "commerceBean.commerceStickerWebUrl");
                tVar.mo83173a(context, C44825x.m141470a(str, "commerce_sticker_tag"), (String) null);
            }
        }
    }

    /* renamed from: H */
    private final RecordViewModel m141467H() {
        return (RecordViewModel) this.f115308m.getValue();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo107269a(C42581q qVar) {
        C7573i.m23587b(qVar, "commerceGoodsTagEvent");
        FaceStickerBean faceStickerBean = qVar.f110729c;
        if (faceStickerBean == null || !faceStickerBean.shouldShowCommerceStickerTag()) {
            C12629j jVar = this.f33524c;
            if (jVar != null) {
                ((C12604b) jVar).mo30940c((C12629j) this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        }
        C12629j jVar2 = this.f33524c;
        if (jVar2 != null) {
            ((C12604b) jVar2).mo30945d((C12629j) this);
            FaceStickerCommerceBean faceStickerCommerceBean = faceStickerBean.getFaceStickerCommerceBean();
            if (faceStickerCommerceBean == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) faceStickerCommerceBean, "faceStickerBean.faceStickerCommerceBean!!");
            if (this.f115309n != faceStickerBean.getStickerId()) {
                C42962b.f111525a.mo104671a("show_transform_link", C22984d.m75611a().mo59971a("prop_id", faceStickerBean.getStickerId()).mo59973a("shoot_way", qVar.f110728b).mo59973a("carrier_type", "video_shoot_page").f60753a);
            }
            this.f115309n = faceStickerBean.getStickerId();
            DmtTextView dmtTextView = this.f115310o;
            if (dmtTextView == null) {
                C7573i.m23583a("commerceStickerText");
            }
            dmtTextView.setText(faceStickerCommerceBean.f108866c);
            LinearLayout linearLayout = this.f115307k;
            if (linearLayout == null) {
                C7573i.m23583a("commerceStickerGoods");
            }
            linearLayout.setOnClickListener(new C44828c(this, faceStickerBean, qVar, faceStickerCommerceBean));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
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
    public final void mo30920G() {
        C12629j jVar = this.f33524c;
        if (jVar != null) {
            ((C12604b) jVar).mo30940c((C12629j) this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
    }

    public C44825x() {
        C7584c a = C7575l.m23595a(RecordViewModel.class);
        this.f115308m = C7546e.m23569a(new RecordCommerceTagScene$$special$$inlined$activityViewModel$1(this, a, a));
        FaceStickerBean faceStickerBean = FaceStickerBean.NONE;
        C7573i.m23582a((Object) faceStickerBean, "FaceStickerBean.NONE");
        this.f115309n = faceStickerBean.getStickerId();
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearLayout m141469a(C44825x xVar) {
        LinearLayout linearLayout = xVar.f115307k;
        if (linearLayout == null) {
            C7573i.m23583a("commerceStickerGoods");
        }
        return linearLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ C39382ed m141471b(C44825x xVar) {
        C39382ed edVar = xVar.f115306j;
        if (edVar == null) {
            C7573i.m23583a("ownerHost");
        }
        return edVar;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Object b = mo30998F().mo31126b((Object) "owner");
        if (b == null) {
            C7573i.m23580a();
        }
        this.f115306j = (C39382ed) b;
        View h_ = mo31004h_(R.id.a0k);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.com…rce_sticker_goods_record)");
        this.f115307k = (LinearLayout) h_;
        View h_2 = mo31004h_(R.id.a0l);
        C7573i.m23582a((Object) h_2, "requireViewById(R.id.commerce_sticker_goods_text)");
        this.f115310o = (DmtTextView) h_2;
        if (C6399b.m19944t()) {
            DmtTextView dmtTextView = this.f115310o;
            if (dmtTextView == null) {
                C7573i.m23583a("commerceStickerText");
            }
            dmtTextView.setFontType("ProximaNova-Semibold");
        } else {
            DmtTextView dmtTextView2 = this.f115310o;
            if (dmtTextView2 == null) {
                C7573i.m23583a("commerceStickerText");
            }
            dmtTextView2.setFontType("PingFangSC-Medium");
        }
        mo91870d(m141467H(), C44829y.f115316a, new C11672v(), new C44827b(this));
    }

    /* renamed from: a */
    public static String m141470a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            str = Uri.parse(str).buildUpon().appendQueryParameter("commerce_enter_from", str2).build().toString();
        }
        C7573i.m23582a((Object) str, "if (!TextUtils.isEmpty(u… else {\n        url\n    }");
        return str;
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.b21, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…_scene, container, false)");
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
