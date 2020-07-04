package com.p280ss.android.ugc.aweme.comment.widgets;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.p848c.p849a.p850a.C19229b.C19231a;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22942a;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22943b;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22944c;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22946e;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22947f;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarWithBorderView;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.commercialize.p1121d.C24613b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget */
public final class CommentAdWidget extends BaseCommentWidget implements C0053p<C23083a>, OnClickListener {

    /* renamed from: j */
    static final /* synthetic */ C7595j[] f64349j = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mCommentAdLayout", "getMCommentAdLayout()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mCommentAdSourceTv", "getMCommentAdSourceTv()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mCommentAdDesTv", "getMCommentAdDesTv()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mCommentAdBtn", "getMCommentAdBtn()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mCommentAdUserAvatar", "getMCommentAdUserAvatar()Lcom/ss/android/ugc/aweme/base/ui/AvatarWithBorderView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mCommentAdCloseBtn", "getMCommentAdCloseBtn()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mDownloadStatusChangeListener", "getMDownloadStatusChangeListener()Lcom/ss/android/ugc/aweme/comment/widgets/CommentAdWidget$VideoCommentDownloadStatusChangeListener;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mAdViewController", "getMAdViewController()Lcom/ss/android/ugc/aweme/commercialize/feed/AdViewController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mDownloadEventConfig", "getMDownloadEventConfig()Lcom/ss/android/download/api/download/DownloadEventConfig;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mAdOpenCallBack", "getMAdOpenCallBack()Lcom/ss/android/ugc/aweme/commercialize/listener/AdOpenCallBack;"))};

    /* renamed from: k */
    public static final C24379a f64350k = new C24379a(null);

    /* renamed from: l */
    private final C24378a f64351l = m80119a((int) R.id.z2);

    /* renamed from: m */
    private final C24378a f64352m = m80119a((int) R.id.z1);

    /* renamed from: n */
    private final C24378a f64353n = m80119a((int) R.id.z0);

    /* renamed from: o */
    private final C24378a f64354o = m80119a((int) R.id.yx);

    /* renamed from: p */
    private final C24378a f64355p = m80119a((int) R.id.z3);

    /* renamed from: q */
    private final C24378a f64356q = m80119a((int) R.id.yy);

    /* renamed from: r */
    private final C7541d f64357r = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C24385f(this));

    /* renamed from: s */
    private final C7541d f64358s = C7546e.m23568a(LazyThreadSafetyMode.NONE, C24383d.f64367a);

    /* renamed from: t */
    private final C7541d f64359t = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C24384e(this));

    /* renamed from: u */
    private final C7541d f64360u = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C24381c(this));

    /* renamed from: v */
    private boolean f64361v = true;

    /* renamed from: w */
    private boolean f64362w;

    /* renamed from: x */
    private final C7561a<C7581n> f64363x;

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget$a */
    public static final class C24379a {
        private C24379a() {
        }

        public /* synthetic */ C24379a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget$b */
    final class C24380b implements C19388d {
        /* renamed from: a */
        public final void mo51374a(C19387c cVar, C19384a aVar) {
            C7573i.m23587b(cVar, "downloadModel");
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo51373a() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget r0 = com.p280ss.android.ugc.aweme.comment.widgets.CommentAdWidget.this
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.mo63302a()
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                if (r0 == 0) goto L_0x0017
                com.ss.android.ugc.aweme.commercialize.model.CommentStruct r0 = r0.getCommentArea()
                if (r0 == 0) goto L_0x0017
                java.lang.String r0 = r0.getButtonText()
                goto L_0x0018
            L_0x0017:
                r0 = 0
            L_0x0018:
                if (r0 == 0) goto L_0x0032
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r1 = r0.length()
                r2 = 1
                if (r1 <= 0) goto L_0x0025
                r1 = 1
                goto L_0x0026
            L_0x0025:
                r1 = 0
            L_0x0026:
                if (r1 != r2) goto L_0x0032
                com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget r1 = com.p280ss.android.ugc.aweme.comment.widgets.CommentAdWidget.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.mo63310i()
                r1.setText(r0)
                return
            L_0x0032:
                com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget r0 = com.p280ss.android.ugc.aweme.comment.widgets.CommentAdWidget.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.mo63310i()
                r1 = 2131824015(0x7f110d8f, float:1.9280846E38)
                r0.setText(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.widgets.CommentAdWidget.C24380b.mo51373a():void");
        }

        public C24380b() {
        }

        /* renamed from: a */
        public final void mo51375a(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            CommentAdWidget.this.mo63310i().setText(R.string.db6);
        }

        /* renamed from: b */
        public final void mo51377b(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            CommentAdWidget.this.mo63310i().setText(R.string.bt2);
        }

        /* renamed from: c */
        public final void mo51379c(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            CommentAdWidget.this.mo63310i().setText(R.string.a5i);
        }

        /* renamed from: b */
        public final void mo51378b(C19400e eVar, int i) {
            C7573i.m23587b(eVar, "shortInfo");
            CommentAdWidget.this.mo63310i().setText(R.string.css);
        }

        /* renamed from: a */
        public final void mo51376a(C19400e eVar, int i) {
            C7573i.m23587b(eVar, "shortInfo");
            CommentAdWidget.this.mo63310i().setText(R.string.ij);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget$c */
    static final class C24381c extends Lambda implements C7561a<C24613b> {

        /* renamed from: a */
        final /* synthetic */ CommentAdWidget f64365a;

        C24381c(CommentAdWidget commentAdWidget) {
            this.f64365a = commentAdWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C24613b invoke() {
            return new C24613b(this) {

                /* renamed from: a */
                final /* synthetic */ C24381c f64366a;

                {
                    this.f64366a = r1;
                }

                /* renamed from: a */
                public final void mo58895a() {
                    long j;
                    if (this.f64366a.f64365a.mo63304d() && this.f64366a.f64365a.mo63302a().isAppAd()) {
                        C19535g a = DownloaderManagerHolder.m75524a();
                        String x = C25352e.m83241x(this.f64366a.f64365a.mo63302a());
                        AwemeRawAd awemeRawAd = this.f64366a.f64365a.mo63302a().getAwemeRawAd();
                        if (awemeRawAd == null) {
                            C7573i.m23580a();
                        }
                        C7573i.m23582a((Object) awemeRawAd, "aweme.awemeRawAd!!");
                        Long creativeId = awemeRawAd.getCreativeId();
                        if (creativeId != null) {
                            j = creativeId.longValue();
                        } else {
                            j = 0;
                        }
                        C19386b j2 = this.f64366a.f64365a.mo63311j();
                        AwemeRawAd awemeRawAd2 = this.f64366a.f64365a.mo63302a().getAwemeRawAd();
                        if (awemeRawAd2 == null) {
                            C7573i.m23580a();
                        }
                        a.mo51670a(x, j, 2, j2, C22942a.m75508a(awemeRawAd2));
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget$d */
    static final class C24383d extends Lambda implements C7561a<C24723e> {

        /* renamed from: a */
        public static final C24383d f64367a = new C24383d();

        C24383d() {
            super(0);
        }

        /* renamed from: a */
        private static C24723e m80163a() {
            return new C24723e();
        }

        public final /* synthetic */ Object invoke() {
            return m80163a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget$e */
    static final class C24384e extends Lambda implements C7561a<C19386b> {

        /* renamed from: a */
        final /* synthetic */ CommentAdWidget f64368a;

        C24384e(CommentAdWidget commentAdWidget) {
            this.f64368a = commentAdWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C19386b invoke() {
            if (C25352e.m83217a(this.f64368a.mo63306f())) {
                return C22943b.m75513b("comment_end_ad", this.f64368a.mo63302a().getAwemeRawAd());
            }
            C22946e a = C22947f.m75522a();
            C19231a a2 = new C19231a().mo50975a("comment_end_ad").mo50978b("comment_end_ad").mo50980c("comment_end_ad").mo50982d("feed_download_ad").mo50983e("feed_download_ad").mo50984f("feed_download_ad").mo50985g("feed_download_ad").mo50981c(false).mo50974a((Object) this.f64368a.mo63302a().getAwemeRawAd());
            C7573i.m23582a((Object) a2, "AdDownloadEventConfig.Bu…tObject(aweme.awemeRawAd)");
            return a.mo59939a(a2, "comment_end_ad");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentAdWidget$f */
    static final class C24385f extends Lambda implements C7561a<C24380b> {

        /* renamed from: a */
        final /* synthetic */ CommentAdWidget f64369a;

        C24385f(CommentAdWidget commentAdWidget) {
            this.f64369a = commentAdWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C24380b invoke() {
            return new C24380b();
        }
    }

    /* renamed from: k */
    private final View m80133k() {
        return this.f64351l.mo63309a(this, f64349j[0]);
    }

    /* renamed from: l */
    private final DmtTextView m80134l() {
        return (DmtTextView) this.f64352m.mo63309a(this, f64349j[1]);
    }

    /* renamed from: m */
    private final DmtTextView m80135m() {
        return (DmtTextView) this.f64353n.mo63309a(this, f64349j[2]);
    }

    /* renamed from: n */
    private final AvatarWithBorderView m80136n() {
        return (AvatarWithBorderView) this.f64355p.mo63309a(this, f64349j[4]);
    }

    /* renamed from: o */
    private final View m80137o() {
        return this.f64356q.mo63309a(this, f64349j[5]);
    }

    /* renamed from: p */
    private final C24380b m80138p() {
        return (C24380b) this.f64357r.getValue();
    }

    /* renamed from: q */
    private final C24723e m80139q() {
        return (C24723e) this.f64358s.getValue();
    }

    /* renamed from: r */
    private final C24613b m80140r() {
        return (C24613b) this.f64360u.getValue();
    }

    /* renamed from: b */
    public final int mo60147b() {
        return R.layout.b5c;
    }

    /* renamed from: i */
    public final DmtTextView mo63310i() {
        return (DmtTextView) this.f64354o.mo63309a(this, f64349j[3]);
    }

    /* renamed from: j */
    public final C19386b mo63311j() {
        return (C19386b) this.f64359t.getValue();
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: w */
    private final void m80145w() {
        m80144v();
        m80143u();
    }

    public final void onPause() {
        super.onPause();
        m80144v();
    }

    public final void onResume() {
        super.onResume();
        m80143u();
    }

    /* renamed from: y */
    private final void m80147y() {
        m80130a(m80133k(), 0, 360, true);
    }

    /* renamed from: x */
    private final void m80146x() {
        View k = m80133k();
        Context context = this.f60919b;
        C7573i.m23582a((Object) context, "mContext");
        m80130a(k, context.getResources().getDimensionPixelOffset(R.dimen.bj), 0, false);
    }

    /* renamed from: z */
    private final void m80148z() {
        View k = m80133k();
        Context context = this.f60919b;
        C7573i.m23582a((Object) context, "mContext");
        m80130a(k, context.getResources().getDimensionPixelOffset(R.dimen.bj), 360, false);
    }

    public final void onCreate() {
        super.onCreate();
        C0053p pVar = this;
        this.f60922e.mo60133a("comment_ad_struct", pVar, true).mo60133a("comment_ad_view_state", pVar, true);
    }

    /* renamed from: s */
    private final boolean m80141s() {
        String str;
        boolean z;
        if (mo63304d() && mo63302a().isAd()) {
            AwemeRawAd awemeRawAd = mo63302a().getAwemeRawAd();
            if (awemeRawAd != null) {
                str = awemeRawAd.getLearnMoreBgColor();
            } else {
                str = null;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    private final void m80142t() {
        this.f64361v = true;
        m80146x();
        C43081e.m136670a(mo63310i());
        C43081e.m136670a(m80134l());
        C43081e.m136670a(m80135m());
        C43081e.m136670a(m80136n());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo63308h() {
        OnClickListener onClickListener = this;
        m80133k().setOnClickListener(onClickListener);
        m80134l().setOnClickListener(onClickListener);
        m80135m().setOnClickListener(onClickListener);
        mo63310i().setOnClickListener(onClickListener);
        m80136n().setOnClickListener(onClickListener);
        m80137o().setOnClickListener(onClickListener);
    }

    /* renamed from: u */
    private final void m80143u() {
        if (!C6399b.m19944t() && mo63304d() && mo63302a().isAppAd() && !C25329c.m83210L(mo63302a()) && !this.f64362w) {
            DownloaderManagerHolder.m75524a().mo51666a(this.f60919b, hashCode(), m80138p(), C22944c.m75515a(this.f60919b, mo63302a().getAwemeRawAd()));
            this.f64362w = true;
        }
    }

    /* renamed from: v */
    private final void m80144v() {
        if (mo63304d() && mo63302a().isAppAd() && mo63302a().getAwemeRawAd() != null && this.f64362w) {
            C19535g a = DownloaderManagerHolder.m75524a();
            AwemeRawAd awemeRawAd = mo63302a().getAwemeRawAd();
            if (awemeRawAd == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) awemeRawAd, "aweme.awemeRawAd!!");
            a.mo51669a(awemeRawAd.getDownloadUrl(), hashCode());
            this.f64362w = false;
        }
    }

    /* renamed from: b */
    private final void m80132b(int i) {
        if (C25371n.m83449a(this.f60919b, mo63302a(), m80139q(), i, m80140r())) {
            this.f64363x.invoke();
        }
    }

    public CommentAdWidget(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "hide");
        this.f64363x = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m80131a(com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct r5) {
        /*
            r4 = this;
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r4.m80134l()
            java.lang.String r1 = r5.getSource()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r4.m80135m()
            java.lang.String r1 = r5.getTitle()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r1 = com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            java.lang.String r1 = r5.getAid()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getRawAdAwemeById(r1)
            boolean r1 = r4.m80141s()
            if (r1 == 0) goto L_0x008c
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r1 == 0) goto L_0x006a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r4.mo63310i()
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            boolean r2 = r1 instanceof android.graphics.drawable.GradientDrawable
            if (r2 != 0) goto L_0x0047
            r1 = 0
        L_0x0047:
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L_0x008c
            java.lang.String r2 = "aweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.getAwemeRawAd()
            if (r2 != 0) goto L_0x0059
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0059:
            java.lang.String r3 = "aweme.awemeRawAd!!"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r2 = r2.getLearnMoreBgColor()
            int r2 = android.graphics.Color.parseColor(r2)
            r1.setColor(r2)
            goto L_0x008c
        L_0x006a:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r4.mo63310i()
            java.lang.String r2 = "aweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.getAwemeRawAd()
            if (r2 != 0) goto L_0x007c
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x007c:
            java.lang.String r3 = "aweme.awemeRawAd!!"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r2 = r2.getLearnMoreBgColor()
            int r2 = android.graphics.Color.parseColor(r2)
            r1.setTextColor(r2)
        L_0x008c:
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r1 != 0) goto L_0x00a5
            java.lang.String r1 = "aweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r1 = r0.isAppAd()
            if (r1 == 0) goto L_0x00a5
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25329c.m83210L(r0)
            if (r0 != 0) goto L_0x00a5
            r0 = 1
            goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            if (r0 != 0) goto L_0x00b5
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r4.mo63310i()
            java.lang.String r1 = r5.getButtonText()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x00b5:
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r0 = r4.m80136n()
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r5.getAvatarIcon()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.widgets.CommentAdWidget.m80131a(com.ss.android.ugc.aweme.commercialize.model.CommentStruct):void");
    }

    /* renamed from: a */
    public final void onChanged(C23083a aVar) {
        super.onChanged(aVar);
        if (aVar != null) {
            String str = aVar.f60948a;
            int hashCode = str.hashCode();
            if (hashCode != 566175283) {
                if (hashCode != 584899985) {
                    if (hashCode == 2016314694 && str.equals("comment_aweme_and_params")) {
                        m80142t();
                        Pair pair = (Pair) aVar.mo60161a();
                        if (pair != null) {
                            Aweme aweme = (Aweme) pair.getFirst();
                            if (aweme != null) {
                                m80139q().mo64699a(this.f60919b, aweme);
                                m80145w();
                            }
                        }
                    }
                } else if (str.equals("comment_ad_struct")) {
                    CommentStruct commentStruct = (CommentStruct) aVar.mo60161a();
                    if (commentStruct != null) {
                        m80131a(commentStruct);
                    }
                }
            } else if (str.equals("comment_ad_view_state")) {
                Object obj = (Integer) aVar.mo60161a();
                if (obj == null) {
                    obj = Boolean.valueOf(false);
                }
                if (C7573i.m23585a(obj, (Object) Integer.valueOf(0))) {
                    m80146x();
                } else if (C7573i.m23585a(obj, (Object) Integer.valueOf(1))) {
                    if (this.f64361v) {
                        m80147y();
                    }
                } else if (C7573i.m23585a(obj, (Object) Integer.valueOf(2))) {
                    m80148z();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f8, code lost:
        if (r12.equals("counsel") != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0127, code lost:
        if (r12.equals("web") != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012d, code lost:
        if (com.p280ss.android.ugc.aweme.commercialize.p1128im.C24758a.m81251b(r2) == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012f, code lost:
        com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82009O(r11.f60919b, mo63302a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0139, code lost:
        com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82224g(r11.f60919b, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013e, code lost:
        com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82216f(r11.f60919b, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r12)
            r0 = 0
            if (r12 == 0) goto L_0x000b
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 != 0) goto L_0x0011
            r1 = r0
        L_0x0011:
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 != 0) goto L_0x0016
            return
        L_0x0016:
            int r1 = r1.bottomMargin
            if (r1 >= 0) goto L_0x001b
            return
        L_0x001b:
            boolean r1 = r11.mo63304d()
            if (r1 != 0) goto L_0x0022
            return
        L_0x0022:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.mo63302a()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 != 0) goto L_0x002d
            return
        L_0x002d:
            java.lang.String r2 = "aweme.awemeRawAd ?: return"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.String r2 = r1.getOpenUrl()
            java.lang.String r3 = r11.mo63306f()
            boolean r3 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83217a(r3)
            r4 = 2131297205(0x7f0903b5, float:1.8212348E38)
            r5 = 2131297204(0x7f0903b4, float:1.8212346E38)
            r6 = 2131297209(0x7f0903b9, float:1.8212356E38)
            r7 = 0
            r8 = 2131297210(0x7f0903ba, float:1.8212358E38)
            r9 = 2131297208(0x7f0903b8, float:1.8212354E38)
            if (r3 == 0) goto L_0x008f
            int r12 = r12.getId()
            if (r12 == r9) goto L_0x0084
            if (r12 == r8) goto L_0x0084
            r0 = 2131297207(0x7f0903b7, float:1.8212352E38)
            if (r12 == r0) goto L_0x0084
            if (r12 != r6) goto L_0x0060
            goto L_0x0084
        L_0x0060:
            if (r12 != r5) goto L_0x0077
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r11.mo63302a()
            boolean r12 = r12.isAppAd()
            if (r12 != 0) goto L_0x0071
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82216f(r12, r1)
        L_0x0071:
            r12 = 24
            r11.m80132b(r12)
            return
        L_0x0077:
            if (r12 != r4) goto L_0x0083
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82256m(r12, r1)
            r11.f64361v = r7
            r11.m80148z()
        L_0x0083:
            return
        L_0x0084:
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82216f(r12, r1)
            r12 = 23
            r11.m80132b(r12)
            return
        L_0x008f:
            int r3 = r12.getId()
            r10 = 5
            if (r3 == r9) goto L_0x0181
            if (r3 != r8) goto L_0x009a
            goto L_0x0181
        L_0x009a:
            if (r3 != r6) goto L_0x00bc
            android.content.Context r12 = r11.f60919b
            java.lang.String r0 = "title"
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82208e(r12, r1, r0)
            boolean r12 = com.p280ss.android.ugc.aweme.commercialize.p1128im.C24758a.m81251b(r2)
            if (r12 == 0) goto L_0x00b3
            android.content.Context r12 = r11.f60919b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.mo63302a()
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82011Q(r12, r0)
            goto L_0x00b8
        L_0x00b3:
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82243j(r12, r1)
        L_0x00b8:
            r11.m80132b(r10)
            return
        L_0x00bc:
            if (r3 != r5) goto L_0x0174
            java.lang.String r12 = r1.getType()
            r0 = r12
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x00cd
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00ce
        L_0x00cd:
            r7 = 1
        L_0x00ce:
            if (r7 == 0) goto L_0x00d1
            return
        L_0x00d1:
            if (r12 != 0) goto L_0x00d5
            goto L_0x016f
        L_0x00d5:
            int r0 = r12.hashCode()
            switch(r0) {
                case -1354573786: goto L_0x015d;
                case 96801: goto L_0x0144;
                case 117588: goto L_0x0121;
                case 3083120: goto L_0x010e;
                case 3148996: goto L_0x00fb;
                case 957829685: goto L_0x00f2;
                case 1893962841: goto L_0x00de;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            goto L_0x016f
        L_0x00de:
            java.lang.String r0 = "redpacket"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x016f
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82216f(r12, r1)
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82260n(r12, r1)
            goto L_0x016f
        L_0x00f2:
            java.lang.String r0 = "counsel"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x016f
            goto L_0x0129
        L_0x00fb:
            java.lang.String r0 = "form"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x016f
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82216f(r12, r1)
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82224g(r12, r1)
            goto L_0x016f
        L_0x010e:
            java.lang.String r0 = "dial"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x016f
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82216f(r12, r1)
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82248k(r12, r1)
            goto L_0x016f
        L_0x0121:
            java.lang.String r0 = "web"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x016f
        L_0x0129:
            boolean r12 = com.p280ss.android.ugc.aweme.commercialize.p1128im.C24758a.m81251b(r2)
            if (r12 == 0) goto L_0x0139
            android.content.Context r12 = r11.f60919b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.mo63302a()
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82009O(r12, r0)
            goto L_0x013e
        L_0x0139:
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82224g(r12, r1)
        L_0x013e:
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82216f(r12, r1)
            goto L_0x016f
        L_0x0144:
            java.lang.String r0 = "app"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x016f
            boolean r12 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r12 == 0) goto L_0x016f
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82216f(r12, r1)
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82252l(r12, r1)
            goto L_0x016f
        L_0x015d:
            java.lang.String r0 = "coupon"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x016f
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82216f(r12, r1)
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82232h(r12, r1)
        L_0x016f:
            r12 = 6
            r11.m80132b(r12)
            return
        L_0x0174:
            if (r3 != r4) goto L_0x0180
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82256m(r12, r1)
            r11.f64361v = r7
            r11.m80148z()
        L_0x0180:
            return
        L_0x0181:
            int r12 = r12.getId()
            if (r12 != r9) goto L_0x018a
            java.lang.String r0 = "name"
            goto L_0x018e
        L_0x018a:
            if (r12 != r8) goto L_0x018e
            java.lang.String r0 = "photo"
        L_0x018e:
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82208e(r12, r1, r0)
            boolean r12 = com.p280ss.android.ugc.aweme.commercialize.p1128im.C24758a.m81251b(r2)
            if (r12 == 0) goto L_0x01a3
            android.content.Context r12 = r11.f60919b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.mo63302a()
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82010P(r12, r0)
            goto L_0x01a8
        L_0x01a3:
            android.content.Context r12 = r11.f60919b
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82237i(r12, r1)
        L_0x01a8:
            r11.m80132b(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.widgets.CommentAdWidget.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private final void m80130a(View view, int i, int i2, boolean z) {
        LayoutParams layoutParams;
        boolean z2;
        AwemeRawAd awemeRawAd = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof MarginLayoutParams)) {
            layoutParams = null;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            int i3 = marginLayoutParams.bottomMargin;
            if (i3 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || z2) {
                if (!z && z2) {
                    C43081e.m136668a(view, i3, i, i2).start();
                }
                return;
            }
            Context context = this.f60919b;
            if (mo63304d()) {
                awemeRawAd = mo63302a().getAwemeRawAd();
            }
            C24976t.m82207e(context, awemeRawAd);
            C43081e.m136668a(view, i3, i, i2).start();
        }
    }
}
