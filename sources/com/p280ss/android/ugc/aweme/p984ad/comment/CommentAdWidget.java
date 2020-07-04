package com.p280ss.android.ugc.aweme.p984ad.comment;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.p848c.p849a.p850a.C19229b.C19231a;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.commercialize.p1121d.C24613b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1445o.p1446a.C34651a;
import com.p280ss.android.ugc.aweme.p984ad.common.legacy.image.C22443d;
import com.p280ss.android.ugc.aweme.p984ad.common.legacy.image.C22445f;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22381f;
import com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a;
import com.p280ss.android.ugc.aweme.p984ad.p989e.C22452a;
import com.p280ss.android.ugc.aweme.p984ad.p989e.C22453b;
import com.p280ss.android.ugc.aweme.p984ad.p989e.C22460h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.CommentAdWidget */
public final class CommentAdWidget extends BaseAdCommentWidget implements C0053p<KVData>, OnClickListener {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f59728c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mCommentAdLayout", "getMCommentAdLayout()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mCommentAdSourceTv", "getMCommentAdSourceTv()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mCommentAdDesTv", "getMCommentAdDesTv()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mCommentAdBtn", "getMCommentAdBtn()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mCommentAdUserAvatar", "getMCommentAdUserAvatar()Lcom/ss/android/ugc/aweme/ad/common/legacy/image/AvatarWithBorderView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mCommentAdCloseBtn", "getMCommentAdCloseBtn()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mDownloadStatusChangeListener", "getMDownloadStatusChangeListener()Lcom/ss/android/ugc/aweme/ad/comment/CommentAdWidget$VideoCommentDownloadStatusChangeListener;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mAdViewController", "getMAdViewController()Lcom/ss/android/ugc/aweme/commercialize/feed/AdViewController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mDownloadEventConfig", "getMDownloadEventConfig()Lcom/ss/android/download/api/download/DownloadEventConfig;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAdWidget.class), "mAdOpenCallBack", "getMAdOpenCallBack()Lcom/ss/android/ugc/aweme/commercialize/listener/AdOpenCallBack;"))};

    /* renamed from: d */
    public static final C22391a f59729d = new C22391a(null);

    /* renamed from: e */
    private final C22390a f59730e = m74148a((int) R.id.z2);

    /* renamed from: f */
    private final C22390a f59731f = m74148a((int) R.id.z1);

    /* renamed from: g */
    private final C22390a f59732g = m74148a((int) R.id.z0);

    /* renamed from: h */
    private final C22390a f59733h = m74148a((int) R.id.yx);

    /* renamed from: i */
    private final C22390a f59734i = m74148a((int) R.id.z3);

    /* renamed from: j */
    private final C22390a f59735j = m74148a((int) R.id.yy);

    /* renamed from: k */
    private final C7541d f59736k = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C22397f(this));

    /* renamed from: l */
    private final C7541d f59737l = C7546e.m23568a(LazyThreadSafetyMode.NONE, C22395d.f59746a);

    /* renamed from: m */
    private final C7541d f59738m = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C22396e(this));

    /* renamed from: n */
    private final C7541d f59739n = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C22393c(this));

    /* renamed from: o */
    private boolean f59740o = true;

    /* renamed from: p */
    private boolean f59741p;

    /* renamed from: q */
    private final C7561a<C7581n> f59742q;

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.CommentAdWidget$a */
    public static final class C22391a {
        private C22391a() {
        }

        public /* synthetic */ C22391a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.CommentAdWidget$b */
    final class C22392b implements C19388d {
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
                com.ss.android.ugc.aweme.ad.comment.CommentAdWidget r0 = com.p280ss.android.ugc.aweme.p984ad.comment.CommentAdWidget.this
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.mo58886a()
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
                com.ss.android.ugc.aweme.ad.comment.CommentAdWidget r1 = com.p280ss.android.ugc.aweme.p984ad.comment.CommentAdWidget.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.mo58892e()
                r1.setText(r0)
                return
            L_0x0032:
                com.ss.android.ugc.aweme.ad.comment.CommentAdWidget r0 = com.p280ss.android.ugc.aweme.p984ad.comment.CommentAdWidget.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.mo58892e()
                r1 = 2131824015(0x7f110d8f, float:1.9280846E38)
                r0.setText(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p984ad.comment.CommentAdWidget.C22392b.mo51373a():void");
        }

        public C22392b() {
        }

        /* renamed from: a */
        public final void mo51375a(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            CommentAdWidget.this.mo58892e().setText(R.string.db6);
        }

        /* renamed from: b */
        public final void mo51377b(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            CommentAdWidget.this.mo58892e().setText(R.string.bt2);
        }

        /* renamed from: c */
        public final void mo51379c(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            CommentAdWidget.this.mo58892e().setText(R.string.a5i);
        }

        /* renamed from: b */
        public final void mo51378b(C19400e eVar, int i) {
            C7573i.m23587b(eVar, "shortInfo");
            CommentAdWidget.this.mo58892e().setText(R.string.css);
        }

        /* renamed from: a */
        public final void mo51376a(C19400e eVar, int i) {
            C7573i.m23587b(eVar, "shortInfo");
            CommentAdWidget.this.mo58892e().setText(R.string.ij);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.CommentAdWidget$c */
    static final class C22393c extends Lambda implements C7561a<C24613b> {

        /* renamed from: a */
        final /* synthetic */ CommentAdWidget f59744a;

        C22393c(CommentAdWidget commentAdWidget) {
            this.f59744a = commentAdWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C24613b invoke() {
            return new C24613b(this) {

                /* renamed from: a */
                final /* synthetic */ C22393c f59745a;

                {
                    this.f59745a = r1;
                }

                /* renamed from: a */
                public final void mo58895a() {
                    this.f59745a.f59744a.mo58893f();
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.CommentAdWidget$d */
    static final class C22395d extends Lambda implements C7561a<C24723e> {

        /* renamed from: a */
        public static final C22395d f59746a = new C22395d();

        C22395d() {
            super(0);
        }

        /* renamed from: a */
        private static C24723e m74189a() {
            return new C24723e();
        }

        public final /* synthetic */ Object invoke() {
            return m74189a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.CommentAdWidget$e */
    static final class C22396e extends Lambda implements C7561a<C19386b> {

        /* renamed from: a */
        final /* synthetic */ CommentAdWidget f59747a;

        C22396e(CommentAdWidget commentAdWidget) {
            this.f59747a = commentAdWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C19386b invoke() {
            if (C22452a.m74319a(this.f59747a.mo58889c())) {
                C7573i.m23582a((Object) C22375a.m74074a(), "AdDependManager.inst()");
                this.f59747a.mo58886a().getAwemeRawAd();
                return null;
            }
            C22375a a = C22375a.m74074a();
            C7573i.m23582a((Object) a, "AdDependManager.inst()");
            return a.f59707a.mo58866a(new C19231a().mo50975a("comment_end_ad").mo50978b("comment_end_ad").mo50980c("comment_end_ad").mo50982d("feed_download_ad").mo50983e("feed_download_ad").mo50984f("feed_download_ad").mo50985g("feed_download_ad").mo50981c(false).mo50974a((Object) this.f59747a.mo58886a().getAwemeRawAd()), "comment_end_ad");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.CommentAdWidget$f */
    static final class C22397f extends Lambda implements C7561a<C22392b> {

        /* renamed from: a */
        final /* synthetic */ CommentAdWidget f59748a;

        C22397f(CommentAdWidget commentAdWidget) {
            this.f59748a = commentAdWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C22392b invoke() {
            return new C22392b();
        }
    }

    /* renamed from: g */
    private final View m74159g() {
        return this.f59730e.mo58891a(this, f59728c[0]);
    }

    /* renamed from: h */
    private final DmtTextView m74160h() {
        return (DmtTextView) this.f59731f.mo58891a(this, f59728c[1]);
    }

    /* renamed from: i */
    private final DmtTextView m74161i() {
        return (DmtTextView) this.f59732g.mo58891a(this, f59728c[2]);
    }

    /* renamed from: j */
    private final C22443d m74162j() {
        return (C22443d) this.f59734i.mo58891a(this, f59728c[4]);
    }

    /* renamed from: k */
    private final View m74163k() {
        return this.f59735j.mo58891a(this, f59728c[5]);
    }

    /* renamed from: l */
    private final C22392b m74164l() {
        return (C22392b) this.f59736k.getValue();
    }

    /* renamed from: m */
    private final C24723e m74165m() {
        return (C24723e) this.f59737l.getValue();
    }

    /* renamed from: n */
    private final C19386b m74166n() {
        return (C19386b) this.f59738m.getValue();
    }

    /* renamed from: e */
    public final DmtTextView mo58892e() {
        return (DmtTextView) this.f59733h.mo58891a(this, f59728c[3]);
    }

    public final int getLayoutId() {
        return R.layout.b5c;
    }

    /* renamed from: t */
    private final void m74172t() {
        m74171s();
        m74170r();
    }

    public final void onPause() {
        super.onPause();
        m74171s();
    }

    public final void onResume() {
        super.onResume();
        m74170r();
    }

    /* renamed from: v */
    private final void m74174v() {
        m74156a(m74159g(), 0, 360, true);
    }

    /* renamed from: p */
    private final void m74168p() {
        C7573i.m23582a((Object) C22375a.m74074a(), "AdDependManager.inst()");
        mo58886a();
        this.f59742q.invoke();
    }

    /* renamed from: u */
    private final void m74173u() {
        View g = m74159g();
        Context context = this.context;
        C7573i.m23582a((Object) context, "context");
        m74156a(g, context.getResources().getDimensionPixelOffset(R.dimen.bj), 0, false);
    }

    /* renamed from: w */
    private final void m74175w() {
        View g = m74159g();
        Context context = this.context;
        C7573i.m23582a((Object) context, "context");
        m74156a(g, context.getResources().getDimensionPixelOffset(R.dimen.bj), 360, false);
    }

    public final void onCreate() {
        super.onCreate();
        C0053p pVar = this;
        this.dataCenter.observe("comment_ad_struct", pVar, true).observe("comment_ad_view_state", pVar, true);
    }

    /* renamed from: o */
    private final boolean m74167o() {
        String str;
        boolean z;
        if (mo58888b() && mo58886a().isAd()) {
            AwemeRawAd awemeRawAd = mo58886a().getAwemeRawAd();
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

    /* renamed from: q */
    private final void m74169q() {
        this.f59740o = true;
        m74173u();
        C22453b.m74325a(mo58892e());
        C22453b.m74325a(m74160h());
        C22453b.m74325a(m74161i());
        C22453b.m74325a(m74162j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo58890d() {
        OnClickListener onClickListener = this;
        m74159g().setOnClickListener(onClickListener);
        m74160h().setOnClickListener(onClickListener);
        m74161i().setOnClickListener(onClickListener);
        mo58892e().setOnClickListener(onClickListener);
        m74162j().setOnClickListener(onClickListener);
        m74163k().setOnClickListener(onClickListener);
    }

    /* renamed from: r */
    private final void m74170r() {
        if (!C6399b.m19944t() && mo58888b() && mo58886a().isAppAd() && !this.f59741p && C22460h.m74332a(this.context) != null) {
            ServiceManager.get().getService(C34651a.class);
            hashCode();
            m74164l();
            C22375a a = C22375a.m74074a();
            C7573i.m23582a((Object) a, "AdDependManager.inst()");
            a.f59707a.mo58867a(this.context, mo58886a());
            this.f59741p = true;
        }
    }

    /* renamed from: s */
    private final void m74171s() {
        if (mo58888b() && mo58886a().isAppAd() && mo58886a().getAwemeRawAd() != null && this.f59741p) {
            ServiceManager.get().getService(C34651a.class);
            AwemeRawAd awemeRawAd = mo58886a().getAwemeRawAd();
            if (awemeRawAd == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) awemeRawAd, "aweme.awemeRawAd!!");
            awemeRawAd.getDownloadUrl();
            hashCode();
            this.f59741p = false;
        }
    }

    /* renamed from: f */
    public final void mo58893f() {
        if (mo58888b() && mo58886a().isAppAd()) {
            ServiceManager.get().getService(C34651a.class);
            C22452a.m74321b(mo58886a());
            AwemeRawAd awemeRawAd = mo58886a().getAwemeRawAd();
            if (awemeRawAd == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) awemeRawAd, "aweme.awemeRawAd!!");
            Long adId = awemeRawAd.getAdId();
            if (adId == null) {
                C7573i.m23580a();
            }
            adId.longValue();
            m74166n();
            C22375a a = C22375a.m74074a();
            C7573i.m23582a((Object) a, "AdDependManager.inst()");
            C22381f fVar = a.f59707a;
            AwemeRawAd awemeRawAd2 = mo58886a().getAwemeRawAd();
            if (awemeRawAd2 == null) {
                C7573i.m23580a();
            }
            fVar.mo58865a(awemeRawAd2);
        }
    }

    /* renamed from: b */
    private final void m74158b(int i) {
        switch (i) {
            case 5:
            case 23:
                m74168p();
                return;
            case 6:
            case 24:
                if (!mo58886a().isAppAd()) {
                    m74168p();
                    break;
                } else {
                    mo58893f();
                    return;
                }
        }
    }

    public CommentAdWidget(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "hide");
        this.f59742q = aVar;
    }

    /* renamed from: a */
    private final void m74157a(CommentStruct commentStruct) {
        boolean z;
        String str;
        m74160h().setText(commentStruct.getSource());
        m74161i().setText(commentStruct.getTitle());
        DmtTextView i = m74161i();
        Context context = this.context;
        C7573i.m23582a((Object) context, "context");
        i.setTextColor(context.getResources().getColor(R.color.a6u));
        if (m74167o()) {
            AwemeRawAd awemeRawAd = mo58886a().getAwemeRawAd();
            GradientDrawable gradientDrawable = null;
            if (awemeRawAd != null) {
                str = awemeRawAd.getLearnMoreBgColor();
            } else {
                str = null;
            }
            int b = C22452a.m74320b(str);
            if (b != 0) {
                if (C6399b.m19944t()) {
                    Drawable background = mo58892e().getBackground();
                    if (background instanceof GradientDrawable) {
                        gradientDrawable = background;
                    }
                    GradientDrawable gradientDrawable2 = gradientDrawable;
                    if (gradientDrawable2 != null) {
                        gradientDrawable2.setColor(b);
                    }
                } else {
                    mo58892e().setTextColor(b);
                }
            }
        }
        if (C6399b.m19944t() || !mo58886a().isAppAd()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            mo58892e().setText(commentStruct.getButtonText());
        }
        C22445f.m74297a(m74162j(), commentStruct.getAvatarIcon());
    }

    /* renamed from: a */
    public final void onChanged(KVData kVData) {
        super.onChanged(kVData);
        if (kVData != null) {
            String key = kVData.getKey();
            int hashCode = key.hashCode();
            if (hashCode != -1122609433) {
                if (hashCode != 566175283) {
                    if (hashCode == 584899985 && key.equals("comment_ad_struct")) {
                        CommentStruct commentStruct = (CommentStruct) kVData.getData();
                        if (commentStruct != null) {
                            C7573i.m23582a((Object) commentStruct, "kvData.getData<CommentStruct>() ?: return");
                            m74157a(commentStruct);
                        }
                    }
                } else if (key.equals("comment_ad_view_state")) {
                    Object obj = (Integer) kVData.getData();
                    if (obj == null) {
                        obj = Boolean.valueOf(false);
                    }
                    if (C7573i.m23585a(obj, (Object) Integer.valueOf(0))) {
                        m74173u();
                    } else if (C7573i.m23585a(obj, (Object) Integer.valueOf(1))) {
                        if (this.f59740o) {
                            m74174v();
                        }
                    } else if (C7573i.m23585a(obj, (Object) Integer.valueOf(2))) {
                        m74175w();
                    }
                }
            } else if (key.equals("comment_aweme")) {
                m74169q();
                Aweme aweme = (Aweme) kVData.getData();
                if (aweme != null) {
                    C7573i.m23582a((Object) aweme, "kvData.getData<Aweme>() ?: return");
                    m74165m().mo64699a(this.context, aweme);
                    m74172t();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0106, code lost:
        if (r10.equals("counsel") != false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0136, code lost:
        if (r10.equals("web") != false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0138, code lost:
        r10 = com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a.m74074a();
        kotlin.jvm.internal.C7573i.m23582a((java.lang.Object) r10, "AdDependManager.inst()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0147, code lost:
        if (r10.f59708b.mo58862a(r1) == false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0149, code lost:
        com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74139l(r9.context, mo58886a().getAwemeRawAd());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0157, code lost:
        com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74129c(r9.context, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015c, code lost:
        com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74128b(r9.context, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r10)
            r0 = 0
            if (r10 == 0) goto L_0x000b
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 != 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            int r0 = r0.bottomMargin
            if (r0 >= 0) goto L_0x001c
            return
        L_0x001c:
            boolean r0 = r9.mo58888b()
            if (r0 != 0) goto L_0x0023
            return
        L_0x0023:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.mo58886a()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 != 0) goto L_0x002e
            return
        L_0x002e:
            java.lang.String r1 = "aweme.awemeRawAd ?: return"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r1 = r0.getOpenUrl()
            java.lang.String r2 = r9.mo58889c()
            boolean r2 = com.p280ss.android.ugc.aweme.p984ad.p989e.C22452a.m74319a(r2)
            r3 = 2131297205(0x7f0903b5, float:1.8212348E38)
            r4 = 2131297204(0x7f0903b4, float:1.8212346E38)
            r5 = 2131297209(0x7f0903b9, float:1.8212356E38)
            r6 = 2131297210(0x7f0903ba, float:1.8212358E38)
            r7 = 2131297208(0x7f0903b8, float:1.8212354E38)
            r8 = 0
            if (r2 == 0) goto L_0x0090
            int r10 = r10.getId()
            if (r10 == r7) goto L_0x0085
            if (r10 == r6) goto L_0x0085
            r1 = 2131297207(0x7f0903b7, float:1.8212352E38)
            if (r10 == r1) goto L_0x0085
            if (r10 != r5) goto L_0x0061
            goto L_0x0085
        L_0x0061:
            if (r10 != r4) goto L_0x0078
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r9.mo58886a()
            boolean r10 = r10.isAppAd()
            if (r10 != 0) goto L_0x0072
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74128b(r10, r0)
        L_0x0072:
            r10 = 24
            r9.m74158b(r10)
            return
        L_0x0078:
            if (r10 != r3) goto L_0x0084
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74136i(r10, r0)
            r9.f59740o = r8
            r9.m74175w()
        L_0x0084:
            return
        L_0x0085:
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74128b(r10, r0)
            r10 = 23
            r9.m74158b(r10)
            return
        L_0x0090:
            int r10 = r10.getId()
            r2 = 5
            if (r10 == r7) goto L_0x019f
            if (r10 != r6) goto L_0x009b
            goto L_0x019f
        L_0x009b:
            if (r10 != r5) goto L_0x00ca
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74128b(r10, r0)
            com.ss.android.ugc.aweme.ad.a.a r10 = com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a.m74074a()
            java.lang.String r3 = "AdDependManager.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r10, r3)
            com.ss.android.ugc.aweme.ad.a.e r10 = r10.f59708b
            boolean r10 = r10.mo58862a(r1)
            if (r10 == 0) goto L_0x00c1
            android.content.Context r10 = r9.context
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.mo58886a()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74138k(r10, r0)
            goto L_0x00c6
        L_0x00c1:
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74133f(r10, r0)
        L_0x00c6:
            r9.m74158b(r2)
            return
        L_0x00ca:
            if (r10 != r4) goto L_0x0192
            java.lang.String r10 = r0.getType()
            r2 = r10
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x00db
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00dc
        L_0x00db:
            r8 = 1
        L_0x00dc:
            if (r8 == 0) goto L_0x00df
            return
        L_0x00df:
            if (r10 != 0) goto L_0x00e3
            goto L_0x018d
        L_0x00e3:
            int r2 = r10.hashCode()
            switch(r2) {
                case -1354573786: goto L_0x017b;
                case 96801: goto L_0x0162;
                case 117588: goto L_0x0130;
                case 3083120: goto L_0x011d;
                case 3148996: goto L_0x0109;
                case 957829685: goto L_0x0100;
                case 1893962841: goto L_0x00ec;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            goto L_0x018d
        L_0x00ec:
            java.lang.String r1 = "redpacket"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x018d
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74128b(r10, r0)
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74137j(r10, r0)
            goto L_0x018d
        L_0x0100:
            java.lang.String r2 = "counsel"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x018d
            goto L_0x0138
        L_0x0109:
            java.lang.String r1 = "form"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x018d
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74128b(r10, r0)
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74129c(r10, r0)
            goto L_0x018d
        L_0x011d:
            java.lang.String r1 = "dial"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x018d
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74128b(r10, r0)
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74134g(r10, r0)
            goto L_0x018d
        L_0x0130:
            java.lang.String r2 = "web"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x018d
        L_0x0138:
            com.ss.android.ugc.aweme.ad.a.a r10 = com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a.m74074a()
            java.lang.String r2 = "AdDependManager.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r10, r2)
            com.ss.android.ugc.aweme.ad.a.e r10 = r10.f59708b
            boolean r10 = r10.mo58862a(r1)
            if (r10 == 0) goto L_0x0157
            android.content.Context r10 = r9.context
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.mo58886a()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74139l(r10, r1)
            goto L_0x015c
        L_0x0157:
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74129c(r10, r0)
        L_0x015c:
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74128b(r10, r0)
            goto L_0x018d
        L_0x0162:
            java.lang.String r1 = "app"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x018d
            boolean r10 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r10 == 0) goto L_0x018d
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74128b(r10, r0)
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74135h(r10, r0)
            goto L_0x018d
        L_0x017b:
            java.lang.String r1 = "coupon"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x018d
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74128b(r10, r0)
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74131d(r10, r0)
        L_0x018d:
            r10 = 6
            r9.m74158b(r10)
            return
        L_0x0192:
            if (r10 != r3) goto L_0x019e
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74136i(r10, r0)
            r9.f59740o = r8
            r9.m74175w()
        L_0x019e:
            return
        L_0x019f:
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74128b(r10, r0)
            com.ss.android.ugc.aweme.ad.a.a r10 = com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a.m74074a()
            java.lang.String r3 = "AdDependManager.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r10, r3)
            com.ss.android.ugc.aweme.ad.a.e r10 = r10.f59708b
            boolean r10 = r10.mo58862a(r1)
            if (r10 == 0) goto L_0x01c3
            android.content.Context r10 = r9.context
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.mo58886a()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74140m(r10, r0)
            goto L_0x01c8
        L_0x01c3:
            android.content.Context r10 = r9.context
            com.p280ss.android.ugc.aweme.p984ad.p987c.C22387a.m74132e(r10, r0)
        L_0x01c8:
            r9.m74158b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p984ad.comment.CommentAdWidget.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private final void m74156a(View view, int i, int i2, boolean z) {
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
                    C22453b.m74324a(view, i3, i, i2).start();
                }
                return;
            }
            Context context = this.context;
            if (mo58888b()) {
                awemeRawAd = mo58886a().getAwemeRawAd();
            }
            C22387a.m74121a(context, awemeRawAd);
            C22453b.m74324a(view, i3, i, i2).start();
        }
    }
}
