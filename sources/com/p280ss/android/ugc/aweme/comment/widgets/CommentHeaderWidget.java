package com.p280ss.android.ugc.aweme.comment.widgets;

import android.content.Context;
import android.net.Uri.Builder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.router.SmartRouter;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.comment.experiment.HideCommentHeaderWidgetExperiment;
import com.p280ss.android.ugc.aweme.commerce.model.SimplePromotion;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24469e;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24471f;
import com.p280ss.android.ugc.aweme.commerce.service.p1113g.C24449a;
import com.p280ss.android.ugc.aweme.commerce.service.p1113g.C24452c.C24453a;
import com.p280ss.android.ugc.aweme.commercialize.link.C24792i;
import com.p280ss.android.ugc.aweme.commercialize.log.C24975s;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeNationalTask;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p280ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p280ss.android.ugc.aweme.feed.model.StarAtlasLink;
import com.p280ss.android.ugc.aweme.feed.model.xigua.XiGuaTaskStruct;
import com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider.C28651a;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29893a;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p1500r.p1501a.C37124b;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.poi.experiment.PoiAreaFilterExperiment;
import com.p280ss.android.ugc.aweme.poi.model.Address;
import com.p280ss.android.ugc.aweme.poi.model.C35109e;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.utils.C35440a;
import com.p280ss.android.ugc.aweme.poi.utils.C35442b;
import com.p280ss.android.ugc.aweme.poi.utils.C35452k;
import com.p280ss.android.ugc.aweme.poi.utils.C35469y;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget */
public final class CommentHeaderWidget extends BaseCommentWidget implements OnClickListener {

    /* renamed from: j */
    static final /* synthetic */ C7595j[] f64370j = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mStarLinkTag", "getMStarLinkTag()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mStarLinkIcon", "getMStarLinkIcon()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mStarLinkTitle", "getMStarLinkTitle()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mStarLinkDesc", "getMStarLinkDesc()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mTaskLinkTag", "getMTaskLinkTag()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mTaskLinkIcon", "getMTaskLinkIcon()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mTaskLinkTitle", "getMTaskLinkTitle()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mTaskLinkDesc", "getMTaskLinkDesc()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mLinkTag", "getMLinkTag()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mLinkIcon", "getMLinkIcon()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mLinkTitle", "getMLinkTitle()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mLinkAdTag", "getMLinkAdTag()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mLinkAdTagDivider", "getMLinkAdTagDivider()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mLinkDesc", "getMLinkDesc()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mCommerceArea", "getMCommerceArea()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mCommerceLogo", "getMCommerceLogo()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mCommerceTitle", "getMCommerceTitle()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mCommerceDescriptionLayout", "getMCommerceDescriptionLayout()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mCommercePrice", "getMCommercePrice()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mCommerceBottomDivider", "getMCommerceBottomDivider()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mCommerceSales", "getMCommerceSales()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mCommerceBottomDivider2", "getMCommerceBottomDivider2()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mPoiCouponText", "getMPoiCouponText()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mCommerceDivider", "getMCommerceDivider()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentHeaderWidget.class), "mCommerceLogoRight", "getMCommerceLogoRight()Landroid/widget/ImageView;"))};

    /* renamed from: l */
    public static final C24386a f64371l = new C24386a(null);

    /* renamed from: A */
    private final C24378a f64372A = m80119a((int) R.id.zz);

    /* renamed from: B */
    private final C24378a f64373B = m80119a((int) R.id.a0a);

    /* renamed from: C */
    private final C24378a f64374C = m80119a((int) R.id.a0n);

    /* renamed from: D */
    private final C24378a f64375D = m80119a((int) R.id.bgy);

    /* renamed from: E */
    private final C24378a f64376E = m80119a((int) R.id.a0c);

    /* renamed from: F */
    private final C24378a f64377F = m80119a((int) R.id.a01);

    /* renamed from: G */
    private final C24378a f64378G = m80119a((int) R.id.a0d);

    /* renamed from: H */
    private final C24378a f64379H = m80119a((int) R.id.a02);

    /* renamed from: I */
    private final C24378a f64380I = m80119a((int) R.id.a3x);

    /* renamed from: J */
    private final C24378a f64381J = m80119a((int) R.id.a08);

    /* renamed from: K */
    private final C24378a f64382K = m80119a((int) R.id.a0b);

    /* renamed from: L */
    private C7562b<? super View, C7581n> f64383L = C24387b.f64399a;

    /* renamed from: k */
    public final C7561a<C7581n> f64384k;

    /* renamed from: m */
    private final C24378a f64385m = m80119a((int) R.id.d_q);

    /* renamed from: n */
    private final C24378a f64386n = m80119a((int) R.id.d_p);

    /* renamed from: o */
    private final C24378a f64387o = m80119a((int) R.id.d_r);

    /* renamed from: p */
    private final C24378a f64388p = m80119a((int) R.id.d_o);

    /* renamed from: q */
    private final C24378a f64389q = m80119a((int) R.id.dgm);

    /* renamed from: r */
    private final C24378a f64390r = m80119a((int) R.id.dgl);

    /* renamed from: s */
    private final C24378a f64391s = m80119a((int) R.id.dgn);

    /* renamed from: t */
    private final C24378a f64392t = m80119a((int) R.id.dgk);

    /* renamed from: u */
    private final C24378a f64393u = m80119a((int) R.id.bmy);

    /* renamed from: v */
    private final C24378a f64394v = m80119a((int) R.id.bmn);

    /* renamed from: w */
    private final C24378a f64395w = m80119a((int) R.id.bmz);

    /* renamed from: x */
    private final C24378a f64396x = m80119a((int) R.id.di);

    /* renamed from: y */
    private final C24378a f64397y = m80119a((int) R.id.dl);

    /* renamed from: z */
    private final C24378a f64398z = m80119a((int) R.id.bmk);

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$a */
    static final class C24386a {
        private C24386a() {
        }

        public /* synthetic */ C24386a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$b */
    static final class C24387b extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        public static final C24387b f64399a = new C24387b();

        C24387b() {
            super(1);
        }

        /* renamed from: a */
        private static void m80214a(View view) {
            C7573i.m23587b(view, "it");
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m80214a((View) obj);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$c */
    static final class C24388c extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ CommentHeaderWidget f64400a;

        /* renamed from: b */
        final /* synthetic */ SimplePromotion f64401b;

        C24388c(CommentHeaderWidget commentHeaderWidget, SimplePromotion simplePromotion) {
            this.f64400a = commentHeaderWidget;
            this.f64401b = simplePromotion;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m80215a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m80215a(View view) {
            String str;
            C7573i.m23587b(view, "it");
            User author = this.f64400a.mo63302a().getAuthor();
            if (author != null) {
                C43222g K = C43316v.m137450K();
                C7573i.m23582a((Object) K, "PlayerManager.inst()");
                C24436a.m80356a().logAndStartPreview(this.f64400a.f60919b, this.f64400a.mo63302a(), this.f64401b.getPromotionId(), (long) this.f64401b.getPromotionSource(), author, this.f64400a.mo63307g(), "click_comment_tag", "full_screen_card", "comment_cart_tag", K.mo104915n());
                if (C25352e.m83224g(this.f64400a.mo63302a())) {
                    Context context = this.f64400a.f60919b;
                    Aweme a = this.f64400a.mo63302a();
                    String str2 = "comment_ad";
                    if (TextUtils.equals(this.f64400a.mo63307g(), "general_search")) {
                        str = "comment_first_ad";
                    } else {
                        str = null;
                    }
                    C24976t.m82153b(context, a, str2, str);
                    return;
                }
                if (C25352e.m83223f(this.f64400a.mo63302a()) || C25352e.m83225h(this.f64400a.mo63302a())) {
                    C24976t.m82183c(this.f64400a.f60919b, this.f64400a.mo63302a(), "comment_ad", "cart");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$d */
    static final class C24389d extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ CommentHeaderWidget f64402a;

        /* renamed from: b */
        final /* synthetic */ PoiStruct f64403b;

        /* renamed from: c */
        final /* synthetic */ ObjectRef f64404c;

        C24389d(CommentHeaderWidget commentHeaderWidget, PoiStruct poiStruct, ObjectRef objectRef) {
            this.f64402a = commentHeaderWidget;
            this.f64403b = poiStruct;
            this.f64404c = objectRef;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m80216a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m80216a(View view) {
            String str;
            C7573i.m23587b(view, "it");
            Context context = this.f64402a.f60919b;
            Aweme a = this.f64402a.mo63302a();
            String e = C33230ac.m107223e(this.f64402a.mo63302a());
            String str2 = "comment_ad";
            if (TextUtils.equals(this.f64402a.mo63307g(), "general_search")) {
                str = "comment_first_ad";
            } else {
                str = null;
            }
            C24976t.m82054a(context, a, e, str2, str);
            SmartRouter.buildRoute(this.f64402a.f60919b, "//poi/detail").withParam("poi_bundle", (Serializable) new C35109e().mo89355p(C33230ac.m107238m(this.f64402a.mo63302a())).mo89350k(C33230ac.m107227g(this.f64402a.mo63302a())).mo89342c(C33230ac.m107223e(this.f64402a.mo63302a())).mo89349j(C33230ac.m107229h(this.f64402a.mo63302a())).mo89336a(this.f64403b).mo89351l(C33230ac.m107205a(this.f64402a.mo63302a())).mo89352m(this.f64402a.mo63306f()).mo89360u((String) this.f64404c.element).mo89363x(String.valueOf(this.f64403b.getPoiSubTitleType())).mo89356q("click_comment").mo89333a(this.f64402a.mo63302a()).mo89338a(C29893a.m97889b(this.f64402a.mo63302a(), "")).mo89331a()).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$e */
    static final class C24390e extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ CommentHeaderWidget f64405a;

        /* renamed from: b */
        final /* synthetic */ String f64406b;

        C24390e(CommentHeaderWidget commentHeaderWidget, String str) {
            this.f64405a = commentHeaderWidget;
            this.f64406b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m80217a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m80217a(View view) {
            C7573i.m23587b(view, "it");
            C37124b.m119336a(this.f64405a.f60919b, this.f64405a.mo63302a());
            C6907h.m21524a("click_mission_icon", (Map) C22984d.m75611a().mo59973a("enter_from", this.f64405a.mo63306f()).mo59973a("group_id", this.f64405a.mo63302a().getAid()).mo59973a("author_id", this.f64406b).mo59973a("entrance_location", "comment_page").f60753a);
        }
    }

    /* renamed from: A */
    private final TextView m80166A() {
        return (TextView) this.f64396x.mo63309a(this, f64370j[11]);
    }

    /* renamed from: B */
    private final View m80167B() {
        return this.f64397y.mo63309a(this, f64370j[12]);
    }

    /* renamed from: C */
    private final TextView m80168C() {
        return (TextView) this.f64398z.mo63309a(this, f64370j[13]);
    }

    /* renamed from: D */
    private final View m80169D() {
        return this.f64372A.mo63309a(this, f64370j[14]);
    }

    /* renamed from: E */
    private final RemoteImageView m80170E() {
        return (RemoteImageView) this.f64373B.mo63309a(this, f64370j[15]);
    }

    /* renamed from: F */
    private final TextView m80171F() {
        return (TextView) this.f64374C.mo63309a(this, f64370j[16]);
    }

    /* renamed from: G */
    private final View m80172G() {
        return this.f64375D.mo63309a(this, f64370j[17]);
    }

    /* renamed from: H */
    private final TextView m80173H() {
        return (TextView) this.f64376E.mo63309a(this, f64370j[18]);
    }

    /* renamed from: I */
    private final View m80174I() {
        return this.f64377F.mo63309a(this, f64370j[19]);
    }

    /* renamed from: J */
    private final TextView m80175J() {
        return (TextView) this.f64378G.mo63309a(this, f64370j[20]);
    }

    /* renamed from: K */
    private final View m80176K() {
        return this.f64379H.mo63309a(this, f64370j[21]);
    }

    /* renamed from: L */
    private final TextView m80177L() {
        return (TextView) this.f64380I.mo63309a(this, f64370j[22]);
    }

    /* renamed from: M */
    private final View m80178M() {
        return this.f64381J.mo63309a(this, f64370j[23]);
    }

    /* renamed from: N */
    private final ImageView m80179N() {
        return (ImageView) this.f64382K.mo63309a(this, f64370j[24]);
    }

    /* renamed from: p */
    private final View m80200p() {
        return this.f64385m.mo63309a(this, f64370j[0]);
    }

    /* renamed from: q */
    private final RemoteImageView m80201q() {
        return (RemoteImageView) this.f64386n.mo63309a(this, f64370j[1]);
    }

    /* renamed from: r */
    private final TextView m80202r() {
        return (TextView) this.f64387o.mo63309a(this, f64370j[2]);
    }

    /* renamed from: s */
    private final TextView m80203s() {
        return (TextView) this.f64388p.mo63309a(this, f64370j[3]);
    }

    /* renamed from: t */
    private final View m80204t() {
        return this.f64389q.mo63309a(this, f64370j[4]);
    }

    /* renamed from: u */
    private final RemoteImageView m80205u() {
        return (RemoteImageView) this.f64390r.mo63309a(this, f64370j[5]);
    }

    /* renamed from: v */
    private final TextView m80206v() {
        return (TextView) this.f64391s.mo63309a(this, f64370j[6]);
    }

    /* renamed from: w */
    private final TextView m80207w() {
        return (TextView) this.f64392t.mo63309a(this, f64370j[7]);
    }

    /* renamed from: x */
    private final View m80208x() {
        return this.f64393u.mo63309a(this, f64370j[8]);
    }

    /* renamed from: y */
    private final RemoteImageView m80209y() {
        return (RemoteImageView) this.f64394v.mo63309a(this, f64370j[9]);
    }

    /* renamed from: z */
    private final TextView m80210z() {
        return (TextView) this.f64395w.mo63309a(this, f64370j[10]);
    }

    /* renamed from: b */
    public final int mo60147b() {
        return R.layout.b5d;
    }

    /* renamed from: j */
    private final boolean m80194j() {
        if (!mo63304d() || !C24792i.m81342b(mo63302a(), true, 0, 4, null) || C25352e.m83364d()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private final boolean m80195k() {
        if (!mo63304d() || !C24792i.m81346c(mo63302a(), true, 0, 4, null) || C25352e.m83364d()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private final boolean m80196l() {
        if (!mo63304d() || !C24792i.m81349d(mo63302a(), true, 0, 4, null) || mo63302a().getMicroAppInfo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private final boolean m80198n() {
        if (!mo63304d() || !C24792i.m81363i(mo63302a(), true, 0) || mo63302a().getPromotion() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private final boolean m80199o() {
        if (!mo63304d() || !C24792i.m81352e(mo63302a(), true, 0, 4, null) || !C37124b.m119338a(mo63302a())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo63308h() {
        OnClickListener onClickListener = this;
        m80200p().setOnClickListener(onClickListener);
        m80204t().setOnClickListener(onClickListener);
        m80208x().setOnClickListener(onClickListener);
        m80169D().setOnClickListener(onClickListener);
    }

    /* renamed from: i */
    private final boolean m80193i() {
        if (!mo63304d() || !C24792i.m81345c(mo63302a(), true, 0) || C25268bg.m83039a(mo63302a()) == null || C25352e.m83364d()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private final boolean m80197m() {
        if (C7634n.m23717a("poi_page", mo63306f(), true) || C7634n.m23717a("poi_page", mo63307g(), true) || C7634n.m23717a("poi_rate_list", mo63306f(), true) || C7634n.m23717a("homestay_reservation_detail", mo63306f(), true) || !mo63304d() || !C24792i.m81352e(mo63302a(), true, 0, 4, null) || mo63302a().getPoiStruct() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    private final void m80180O() {
        if (mo63304d()) {
            m80120a(m80172G());
            m80121b(m80169D(), m80173H(), m80174I(), m80175J(), m80176K(), m80178M(), m80179N(), m80177L(), m80200p(), m80204t(), m80208x(), m80166A(), m80167B());
            if (m80194j()) {
                m80181P();
            } else if (m80195k()) {
                m80182Q();
            } else if (m80193i()) {
                m80183R();
            } else if (m80190a("poi")) {
                m80184S();
            } else if (m80190a("shopping_cart")) {
                m80185T();
            } else if (m80199o()) {
                m80186U();
            }
            if (!(m80173H().getVisibility() == 0 || m80174I().getVisibility() == 0 || m80175J().getVisibility() == 0 || m80176K().getVisibility() == 0 || m80177L().getVisibility() == 0)) {
                m80121b(m80172G());
            }
        }
    }

    /* renamed from: P */
    private final void m80181P() {
        AwemeStarAtlas starAtlasInfo = mo63302a().getStarAtlasInfo();
        if (starAtlasInfo != null) {
            StarAtlasLink starAtlasLink = starAtlasInfo.getStarAtlasLink();
            if (starAtlasLink != null) {
                m80120a(m80200p());
                TextView r = m80202r();
                String title = starAtlasLink.getTitle();
                if (title == null) {
                    title = "";
                }
                r.setText(title);
                TextView s = m80203s();
                String subTitle = starAtlasLink.getSubTitle();
                if (subTitle == null) {
                    subTitle = "";
                }
                s.setText(subTitle);
                ((C13438a) m80201q().getHierarchy()).mo32902c((int) R.color.a6k);
                UrlModel avatarIcon = starAtlasLink.getAvatarIcon();
                if (avatarIcon == null || C6307b.m19566a((Collection<T>) avatarIcon.getUrlList())) {
                    m80201q().setImageResource(R.drawable.bk4);
                } else {
                    C23323e.m76524b(m80201q(), avatarIcon);
                }
                C24975s.m81993a(starAtlasLink, mo63302a(), "show", true, mo63306f());
            }
        }
    }

    /* renamed from: Q */
    private final void m80182Q() {
        AwemeNationalTask awemeNationalTask = mo63302a().getAwemeNationalTask();
        if (awemeNationalTask != null) {
            NationalTaskLink nationalTaskLink = awemeNationalTask.getNationalTaskLink();
            if (nationalTaskLink != null) {
                m80120a(m80204t());
                TextView v = m80206v();
                String title = nationalTaskLink.getTitle();
                if (title == null) {
                    title = "";
                }
                v.setText(title);
                TextView w = m80207w();
                String subTitle = nationalTaskLink.getSubTitle();
                if (subTitle == null) {
                    subTitle = "";
                }
                w.setText(subTitle);
                ((C13438a) m80205u().getHierarchy()).mo32902c((int) R.color.a6k);
                UrlModel avatarIcon = nationalTaskLink.getAvatarIcon();
                if (avatarIcon == null || C6307b.m19566a((Collection<T>) avatarIcon.getUrlList())) {
                    m80205u().setImageResource(R.drawable.bk4);
                } else {
                    C23323e.m76524b(m80205u(), avatarIcon);
                }
                C24975s.m81992a(nationalTaskLink, mo63302a(), "show", true, mo63306f());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r4 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r4 != null) goto L_0x0051;
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m80183R() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.mo63302a()
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83232o(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            android.view.View[] r0 = new android.view.View[r2]
            android.view.View r2 = r6.m80208x()
            r0[r1] = r2
            m80121b(r0)
            return
        L_0x0018:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.mo63302a()
            com.ss.android.ugc.aweme.commercialize.model.LinkData r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg.m83039a(r0)
            if (r0 != 0) goto L_0x0023
            return
        L_0x0023:
            android.view.View[] r3 = new android.view.View[r2]
            android.view.View r4 = r6.m80208x()
            r3[r1] = r4
            m80120a(r3)
            android.widget.TextView r3 = r6.m80210z()
            com.ss.android.ugc.aweme.commercialize.model.LinkData$CommentStruct r4 = r0.commentArea
            if (r4 == 0) goto L_0x003b
            java.lang.String r4 = r4.title
            if (r4 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            java.lang.String r4 = ""
        L_0x003d:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            android.widget.TextView r3 = r6.m80168C()
            com.ss.android.ugc.aweme.commercialize.model.LinkData$CommentStruct r4 = r0.commentArea
            if (r4 == 0) goto L_0x004f
            java.lang.String r4 = r4.featureLabel
            if (r4 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            java.lang.String r4 = ""
        L_0x0051:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r6.m80209y()
            com.facebook.drawee.c.b r3 = r3.getHierarchy()
            com.facebook.drawee.generic.a r3 = (com.facebook.drawee.generic.C13438a) r3
            r4 = 2131100879(0x7f0604cf, float:1.7814152E38)
            r3.mo32902c(r4)
            java.lang.String r3 = r0.label
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0075
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r3 = 0
            goto L_0x0076
        L_0x0075:
            r3 = 1
        L_0x0076:
            r4 = 2
            if (r3 == 0) goto L_0x008d
            android.view.View[] r3 = new android.view.View[r4]
            android.widget.TextView r4 = r6.m80166A()
            android.view.View r4 = (android.view.View) r4
            r3[r1] = r4
            android.view.View r1 = r6.m80167B()
            r3[r2] = r1
            m80121b(r3)
            goto L_0x00ab
        L_0x008d:
            android.widget.TextView r3 = r6.m80166A()
            java.lang.String r5 = r0.label
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r3.setText(r5)
            android.view.View[] r3 = new android.view.View[r4]
            android.widget.TextView r4 = r6.m80166A()
            android.view.View r4 = (android.view.View) r4
            r3[r1] = r4
            android.view.View r1 = r6.m80167B()
            r3[r2] = r1
            m80120a(r3)
        L_0x00ab:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r6.m80209y()
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.getCommentAvatarIcon()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r1, r3)
            android.content.Context r1 = r6.f60919b
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r3 = new com.ss.android.ugc.aweme.commercialize.link.a.a$a
            r3.<init>()
            java.lang.String r4 = "comment_show"
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r3 = r3.mo64783a(r4)
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r3 = r3.mo64781a(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.mo63302a()
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r3 = r3.mo64782a(r4)
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r3 = r3.mo64784a(r2)
            com.ss.android.ugc.aweme.commercialize.link.a.a r3 = r3.mo64785a()
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82038a(r1, r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.mo63302a()
            java.lang.String r3 = "show"
            java.lang.String r4 = r6.mo63306f()
            com.p280ss.android.ugc.aweme.commercialize.log.C24975s.m81991a(r0, r1, r3, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget.m80183R():void");
    }

    /* renamed from: U */
    private final void m80186U() {
        XiGuaTaskStruct xiGuaTask = mo63302a().getXiGuaTask();
        if (xiGuaTask != null) {
            m80120a(m80169D(), m80173H(), m80175J());
            m80170E().setImageURI(new Builder().scheme("res").path("2131232631").build());
            m80171F().setText(R.string.ft5);
            m80173H().setText(xiGuaTask.getTitle());
            m80175J().setText(xiGuaTask.getDesc());
            String b = C33230ac.m107217b(mo63302a().getAuthor());
            this.f64383L = new C24390e(this, b);
            C6907h.m21524a("show_mission_icon", (Map) C22984d.m75611a().mo59973a("enter_from", mo63306f()).mo59973a("group_id", mo63302a().getAid()).mo59973a("author_id", b).mo59973a("entrance_location", "comment_page").f60753a);
        }
    }

    /* renamed from: S */
    private final void m80184S() {
        boolean z;
        double d;
        double d2;
        PoiStruct poiStruct = mo63302a().getPoiStruct();
        if (poiStruct != null) {
            m80120a(m80169D(), m80173H(), m80174I(), m80175J(), m80176K(), m80177L());
            C35469y.m114573a(m80170E(), poiStruct);
            m80171F().setText(poiStruct.poiName);
            LocationBundle a = C32630h.m105696b(this.f60919b).mo83993a();
            if (m80188a(a, poiStruct)) {
                Double valueOf = Double.valueOf(poiStruct.poiLatitude);
                Double valueOf2 = Double.valueOf(poiStruct.poiLongitude);
                if (a == null) {
                    C7573i.m23580a();
                }
                double d3 = a.latitude;
                double d4 = a.longitude;
                if (!a.isGaode) {
                    double[] b = C35440a.m114454b(d4, d3);
                    d = b[0];
                    d2 = b[1];
                } else {
                    d2 = d3;
                    d = d4;
                }
                TextView H = m80173H();
                Context context = this.f60919b;
                C7573i.m23582a((Object) valueOf, "poiLat");
                double doubleValue = valueOf.doubleValue();
                C7573i.m23582a((Object) valueOf2, "poiLng");
                H.setText(C35442b.m114467a(context, doubleValue, valueOf2.doubleValue(), d2, d));
            } else if (!m80189a(poiStruct)) {
                TextView H2 = m80173H();
                Address address = poiStruct.address;
                C7573i.m23582a((Object) address, "poiStruct.address");
                H2.setText(address.getCity());
            } else {
                m80121b(m80173H(), m80174I());
            }
            String a2 = C35452k.m114509a(this.f60919b, poiStruct);
            if (C23764b.m77913a(a2)) {
                m80175J().setText(a2);
                z = true;
            } else {
                m80121b(m80175J(), m80174I());
                z = false;
            }
            ObjectRef objectRef = new ObjectRef();
            objectRef.element = "0";
            if (!C35469y.m114575a(a, poiStruct)) {
                if (C35469y.m114576a(poiStruct)) {
                    objectRef.element = "1";
                }
                m80177L().setText(poiStruct.getPoiSubTitle());
                m80187a(poiStruct, z);
            } else {
                m80121b(m80176K(), m80177L());
            }
            if (C6384b.m19835a().mo15287a(PoiAreaFilterExperiment.class, true, "poi_city_tag_optimize", C6384b.m19835a().mo15295d().poi_city_tag_optimize, 0) != 2 && poiStruct.isAdminArea) {
                m80121b(m80173H(), m80174I(), m80175J(), m80176K(), m80177L());
            }
            this.f64383L = new C24389d(this, poiStruct, objectRef);
        }
    }

    /* renamed from: T */
    private final void m80185T() {
        SimplePromotion promotion = mo63302a().getPromotion();
        if (promotion != null) {
            C7573i.m23582a((Object) promotion, "aweme.promotion ?: return");
            m80120a(m80173H(), m80174I(), m80175J(), m80169D());
            m80170E().setImageURI(new Builder().scheme("res").path("2131232672").build());
            m80171F().setText(promotion.getShortTitle());
            TextView H = m80173H();
            String string = this.f60919b.getString(R.string.c_v);
            C7573i.m23582a((Object) string, "mContext.getString(R.string.money_format)");
            String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{Float.valueOf(((float) promotion.getPrice()) / 100.0f)}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            H.setText(C24449a.m80375a(a));
            TextView J = m80175J();
            String string2 = this.f60919b.getString(R.string.ca_);
            C7573i.m23582a((Object) string2, "mContext.getString(R.string.mouth_sold_num)");
            String a2 = C1642a.m8034a(string2, Arrays.copyOf(new Object[]{C24453a.m80378a((long) promotion.getSales())}, 1));
            C7573i.m23582a((Object) a2, "java.lang.String.format(format, *args)");
            J.setText(a2);
            this.f64383L = new C24388c(this, promotion);
            Context context = m80173H().getContext();
            C7573i.m23582a((Object) context, "mCommercePrice.context");
            String fromGroupId = C28651a.m94274a(context).getFromGroupId();
            Context context2 = m80173H().getContext();
            C7573i.m23582a((Object) context2, "mCommercePrice.context");
            new C24469e().mo63568g(mo63302a().getAuthorUid()).mo63561a("comment_cart_tag").mo63563b(promotion.getPromotionId()).mo63560a(Integer.valueOf(promotion.getPromotionSource())).mo63565d(fromGroupId).mo63566e(C28651a.m94274a(context2).getReferCommodityId()).mo63567f(mo63307g()).mo63564c(mo63302a().getAid()).mo63562b(Integer.valueOf(mo63302a().getFollowStatus())).mo63537a();
            new C24471f().mo63576f(mo63302a().getAuthorUid()).mo63572b("comment_cart_tag").mo63573c(promotion.getPromotionId()).mo63569a(Integer.valueOf(promotion.getPromotionSource())).mo63577g(mo63307g()).mo63574d(mo63302a().getAid()).mo63575e("click_comment").mo63578h(null).mo63570a(mo63307g()).mo63571b(Integer.valueOf(mo63302a().getFollowStatus())).mo63537a();
        }
    }

    /* renamed from: a */
    private static boolean m80189a(PoiStruct poiStruct) {
        boolean z;
        if (poiStruct.address != null) {
            Address address = poiStruct.address;
            C7573i.m23582a((Object) address, "address");
            CharSequence city = address.getCity();
            if (city == null || city.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m80192b(PoiStruct poiStruct) {
        boolean z;
        boolean z2;
        CharSequence charSequence = poiStruct.poiLatitude;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            CharSequence charSequence2 = poiStruct.poiLongitude;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public CommentHeaderWidget(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "hide");
        this.f64384k = aVar;
    }

    /* renamed from: a */
    private final boolean m80190a(String str) {
        int a = C6384b.m19835a().mo15287a(HideCommentHeaderWidgetExperiment.class, true, "hide_comment_header_widget", C6384b.m19835a().mo15295d().hide_comment_header_widget, 0);
        int hashCode = str.hashCode();
        if (hashCode != -1648893033) {
            if (hashCode != -309942941) {
                if (hashCode == 111178 && str.equals("poi") && m80197m() && a != 2) {
                    return true;
                }
                return false;
            } else if (!str.equals("iron_man") || !m80196l() || a == 1) {
                return false;
            } else {
                return true;
            }
        } else if (!str.equals("shopping_cart") || !m80198n() || a == 3) {
            return false;
        } else {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.feed.model.NationalTaskLink] */
    /* JADX WARNING: type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.feed.model.NationalTaskLink] */
    /* JADX WARNING: type inference failed for: r0v19, types: [com.ss.android.ugc.aweme.feed.model.StarAtlasLink] */
    /* JADX WARNING: type inference failed for: r0v20, types: [com.ss.android.ugc.aweme.feed.model.StarAtlasLink] */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.feed.model.StarAtlasLink, com.ss.android.ugc.aweme.feed.model.NationalTaskLink]
      uses: [com.ss.android.ugc.aweme.feed.model.NationalTaskLink, com.ss.android.ugc.aweme.feed.model.StarAtlasLink]
      mth insns count: 103
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r6)
            boolean r0 = com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a.m89578a(r6)
            if (r0 == 0) goto L_0x000a
            return
        L_0x000a:
            r0 = 0
            if (r6 == 0) goto L_0x0016
            int r1 = r6.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            r2 = 1
            if (r1 != 0) goto L_0x001b
            goto L_0x006e
        L_0x001b:
            int r3 = r1.intValue()
            r4 = 2131301746(0x7f091572, float:1.8221559E38)
            if (r3 != r4) goto L_0x006e
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.mo63302a()
            com.ss.android.ugc.aweme.feed.model.AwemeStarAtlas r6 = r6.getStarAtlasInfo()
            if (r6 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.feed.model.StarAtlasLink r6 = r6.getStarAtlasLink()
            goto L_0x0034
        L_0x0033:
            r6 = r0
        L_0x0034:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo63302a()
            java.lang.String r3 = "click"
            java.lang.String r4 = r5.mo63306f()
            com.p280ss.android.ugc.aweme.commercialize.log.C24975s.m81993a(r6, r1, r3, r2, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.mo63302a()
            boolean r6 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83226i(r6)
            if (r6 == 0) goto L_0x0056
            android.content.Context r6 = r5.f60919b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo63302a()
            java.lang.String r3 = "common_link"
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82222g(r6, r1, r3)
        L_0x0056:
            android.content.Context r6 = r5.f60919b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo63302a()
            com.ss.android.ugc.aweme.feed.model.AwemeStarAtlas r1 = r1.getStarAtlasInfo()
            if (r1 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.feed.model.StarAtlasLink r0 = r1.getStarAtlasLink()
        L_0x0066:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo63302a()
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83438a(r6, r0, r1, r2)
            return
        L_0x006e:
            if (r1 != 0) goto L_0x0071
            goto L_0x00af
        L_0x0071:
            int r3 = r1.intValue()
            r4 = 2131302001(0x7f091671, float:1.8222076E38)
            if (r3 != r4) goto L_0x00af
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.mo63302a()
            com.ss.android.ugc.aweme.feed.model.AwemeNationalTask r6 = r6.getAwemeNationalTask()
            if (r6 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.feed.model.NationalTaskLink r6 = r6.getNationalTaskLink()
            goto L_0x008a
        L_0x0089:
            r6 = r0
        L_0x008a:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo63302a()
            java.lang.String r3 = "click"
            java.lang.String r4 = r5.mo63306f()
            com.p280ss.android.ugc.aweme.commercialize.log.C24975s.m81992a(r6, r1, r3, r2, r4)
            android.content.Context r6 = r5.f60919b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo63302a()
            com.ss.android.ugc.aweme.feed.model.AwemeNationalTask r1 = r1.getAwemeNationalTask()
            if (r1 == 0) goto L_0x00a7
            com.ss.android.ugc.aweme.feed.model.NationalTaskLink r0 = r1.getNationalTaskLink()
        L_0x00a7:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo63302a()
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83437a(r6, r0, r1, r2)
            return
        L_0x00af:
            if (r1 != 0) goto L_0x00b3
            goto L_0x012d
        L_0x00b3:
            int r0 = r1.intValue()
            r3 = 2131299498(0x7f090caa, float:1.8217E38)
            if (r0 != r3) goto L_0x012d
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.mo63302a()
            com.ss.android.ugc.aweme.commercialize.model.LinkData r6 = com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg.m83039a(r6)
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r0 = new com.ss.android.ugc.aweme.commercialize.link.a.a$a
            r0.<init>()
            java.lang.String r1 = "click"
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r0 = r0.mo64783a(r1)
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r0 = r0.mo64781a(r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo63302a()
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r0 = r0.mo64782a(r1)
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r0 = r0.mo64784a(r2)
            com.ss.android.ugc.aweme.commercialize.link.a.a r0 = r0.mo64785a()
            android.content.Context r1 = r5.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82038a(r1, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mo63302a()
            java.lang.String r1 = "click"
            java.lang.String r3 = r5.mo63306f()
            com.p280ss.android.ugc.aweme.commercialize.log.C24975s.m81991a(r6, r0, r1, r2, r3)
            android.content.Context r0 = r5.f60919b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo63302a()
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83431a(r0, r6, r1, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mo63302a()
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83224g(r0)
            if (r0 == 0) goto L_0x0111
            android.content.Context r0 = r5.f60919b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo63302a()
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82039a(r0, r6, r1, r2)
        L_0x0111:
            boolean r6 = r5.m80193i()
            if (r6 == 0) goto L_0x013e
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.mo63302a()
            boolean r6 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83226i(r6)
            if (r6 == 0) goto L_0x013e
            android.content.Context r6 = r5.f60919b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mo63302a()
            java.lang.String r1 = "common_link"
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82222g(r6, r0, r1)
            return
        L_0x012d:
            if (r1 != 0) goto L_0x0130
            return
        L_0x0130:
            int r0 = r1.intValue()
            r1 = 2131297243(0x7f0903db, float:1.8212425E38)
            if (r0 != r1) goto L_0x013e
            kotlin.jvm.a.b<? super android.view.View, kotlin.n> r0 = r5.f64383L
            r0.invoke(r6)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void onChanged(C23083a aVar) {
        super.onChanged(aVar);
        if (aVar != null) {
            String str = aVar.f60948a;
            if (str.hashCode() == 2016314694 && str.equals("comment_aweme_and_params") && mo63304d() && mo63305e()) {
                m80180O();
            }
        }
    }

    /* renamed from: a */
    private final boolean m80188a(LocationBundle locationBundle, PoiStruct poiStruct) {
        boolean z;
        if (locationBundle != null) {
            CharSequence charSequence = locationBundle.city;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !m80189a(poiStruct)) {
                String str = locationBundle.city;
                C7573i.m23582a((Object) str, "locationWrapper.city");
                Address address = poiStruct.address;
                C7573i.m23582a((Object) address, "poiStruct.address");
                String city = address.getCity();
                C7573i.m23582a((Object) city, "poiStruct.address.city");
                if (!m80191a(str, city) || m80192b(poiStruct)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m80187a(PoiStruct poiStruct, boolean z) {
        if (!m80189a(poiStruct)) {
            String obj = m80173H().getText().toString();
            String obj2 = m80175J().getText().toString();
            String obj3 = m80177L().getText().toString();
            TextPaint paint = m80173H().getPaint();
            if (((C9738o.m28691a(this.f60919b) - C23486n.m77122a(120.0d)) - (((int) paint.measureText(obj3)) + C23486n.m77122a(14.0d))) - ((int) paint.measureText(obj)) < ((int) paint.measureText(obj2)) + C23486n.m77122a(14.0d)) {
                m80121b(m80175J(), m80174I(), m80176K());
                return;
            }
            m80120a(m80174I());
            if (z) {
                m80120a(m80175J());
                return;
            }
            m80121b(m80175J());
        }
    }

    /* renamed from: a */
    private static boolean m80191a(String str, String str2) {
        boolean z;
        if (C32630h.m105697f()) {
            boolean z2 = true;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (str2.length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    if (str != null) {
                        String lowerCase = str.toLowerCase();
                        C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (str2 != null) {
                            String lowerCase2 = str2.toLowerCase();
                            C7573i.m23582a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                            if (lowerCase.length() > lowerCase2.length()) {
                                return C7634n.m23776c((CharSequence) lowerCase, (CharSequence) lowerCase2, false);
                            }
                            return C7634n.m23776c((CharSequence) lowerCase2, (CharSequence) lowerCase, false);
                        }
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        return false;
    }
}
