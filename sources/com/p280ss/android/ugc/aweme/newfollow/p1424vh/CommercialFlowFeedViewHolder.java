package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p022v4.content.C0683b;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22942a;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22943b;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22944c;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.commerce.p1104a.C24411a;
import com.p280ss.android.ugc.aweme.commercialize.C24558c;
import com.p280ss.android.ugc.aweme.commercialize.log.C24933af;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24942al;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.p1114a.C24504a.C24505a;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.AdRatingView;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.C24510b;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.DescTextView;
import com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25384x;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25193b;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25196d;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1139d.C25346b;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1139d.C25347c.C25348a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1139d.C25349d;
import com.p280ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar;
import com.p280ss.android.ugc.aweme.discover.mob.C26780aa;
import com.p280ss.android.ugc.aweme.feed.helper.C28418f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.FollowVideoViewHolder;
import com.p280ss.android.ugc.aweme.forward.p1268b.C29876a;
import com.p280ss.android.ugc.aweme.newfollow.util.C34195b;
import com.p280ss.android.ugc.aweme.newfollow.util.C34199d;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder */
public class CommercialFlowFeedViewHolder extends FollowVideoViewHolder {

    /* renamed from: bf */
    public static final C19388d f89201bf = new C34206b();

    /* renamed from: bg */
    public static final C34205a f89202bg = new C34205a(null);

    /* renamed from: a */
    private final C25349d f89203a;

    /* renamed from: aW */
    public boolean f89204aW;

    /* renamed from: aX */
    public LinearLayout f89205aX;

    /* renamed from: aY */
    public LinearLayout f89206aY;

    /* renamed from: aZ */
    public AdRatingView f89207aZ;

    /* renamed from: b */
    private boolean f89208b;

    /* renamed from: ba */
    public View f89209ba;

    /* renamed from: bb */
    public DmtTextView f89210bb;

    /* renamed from: bc */
    public DmtTextView f89211bc;

    /* renamed from: bd */
    public RelativeLayout f89212bd;

    /* renamed from: be */
    public final FollowFeedLayout f89213be;

    /* renamed from: bh */
    private int f89214bh;

    /* renamed from: bi */
    private int f89215bi;

    /* renamed from: bj */
    private DmtTextView f89216bj;

    /* renamed from: bk */
    private LinearLayout f89217bk;

    /* renamed from: bl */
    private DescTextView f89218bl;

    /* renamed from: bm */
    private RemoteImageView f89219bm;

    /* renamed from: bn */
    private DmtTextView f89220bn;

    /* renamed from: bo */
    private C24933af f89221bo;

    /* renamed from: bp */
    private SearchAdBottomBar f89222bp;

    /* renamed from: bq */
    private final C34218l f89223bq;

    /* renamed from: c */
    private String f89224c;

    /* renamed from: d */
    private boolean f89225d;

    /* renamed from: e */
    private boolean f89226e;

    /* renamed from: f */
    private boolean f89227f;

    /* renamed from: g */
    private boolean f89228g;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$a */
    public static final class C34205a {
        private C34205a() {
        }

        public /* synthetic */ C34205a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$b */
    public static final class C34206b implements C19388d {
        C34206b() {
        }

        /* renamed from: a */
        public final void mo51373a() {
        }

        /* renamed from: a */
        public final void mo51374a(C19387c cVar, C19384a aVar) {
            C7573i.m23587b(cVar, "downloadModel");
        }

        /* renamed from: a */
        public final void mo51375a(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
        }

        /* renamed from: a */
        public final void mo51376a(C19400e eVar, int i) {
            C7573i.m23587b(eVar, "shortInfo");
        }

        /* renamed from: b */
        public final void mo51377b(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
        }

        /* renamed from: b */
        public final void mo51378b(C19400e eVar, int i) {
            C7573i.m23587b(eVar, "shortInfo");
        }

        /* renamed from: c */
        public final void mo51379c(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$c */
    static final class C34207c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommercialFlowFeedViewHolder f89229a;

        C34207c(CommercialFlowFeedViewHolder commercialFlowFeedViewHolder) {
            this.f89229a = commercialFlowFeedViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f89229a.mo86959aq()) {
                CommercialFlowFeedViewHolder commercialFlowFeedViewHolder = this.f89229a;
                Aweme aweme = this.f89229a.f77546j;
                C7573i.m23582a((Object) aweme, "mAweme");
                commercialFlowFeedViewHolder.mo86956a(aweme.getAwemeRawAd(), "bg_name");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$d */
    static final class C34208d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommercialFlowFeedViewHolder f89230a;

        C34208d(CommercialFlowFeedViewHolder commercialFlowFeedViewHolder) {
            this.f89230a = commercialFlowFeedViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f89230a.mo86959aq()) {
                CommercialFlowFeedViewHolder commercialFlowFeedViewHolder = this.f89230a;
                Aweme aweme = this.f89230a.f77546j;
                C7573i.m23582a((Object) aweme, "mAweme");
                commercialFlowFeedViewHolder.mo86956a(aweme.getAwemeRawAd(), "bg_hot_region");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$e */
    static final class C34209e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommercialFlowFeedViewHolder f89231a;

        C34209e(CommercialFlowFeedViewHolder commercialFlowFeedViewHolder) {
            this.f89231a = commercialFlowFeedViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f89231a.mo86959aq()) {
                CommercialFlowFeedViewHolder commercialFlowFeedViewHolder = this.f89231a;
                Aweme aweme = this.f89231a.f77546j;
                C7573i.m23582a((Object) aweme, "mAweme");
                commercialFlowFeedViewHolder.mo86956a(aweme.getAwemeRawAd(), "bg_title");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$f */
    static final class C34210f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommercialFlowFeedViewHolder f89232a;

        C34210f(CommercialFlowFeedViewHolder commercialFlowFeedViewHolder) {
            this.f89232a = commercialFlowFeedViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f89232a.mo86959aq()) {
                CommercialFlowFeedViewHolder commercialFlowFeedViewHolder = this.f89232a;
                Aweme aweme = this.f89232a.f77546j;
                C7573i.m23582a((Object) aweme, "mAweme");
                commercialFlowFeedViewHolder.mo86956a(aweme.getAwemeRawAd(), "bg_photo");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$g */
    static final class C34211g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommercialFlowFeedViewHolder f89233a;

        C34211g(CommercialFlowFeedViewHolder commercialFlowFeedViewHolder) {
            this.f89233a = commercialFlowFeedViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f89233a.mo86959aq()) {
                Aweme aweme = this.f89233a.f77546j;
                C7573i.m23582a((Object) aweme, "mAweme");
                if (aweme.isAppAd()) {
                    if (!C6399b.m19944t()) {
                        Context ab = this.f89233a.mo75261ab();
                        C7573i.m23582a((Object) ab, "context");
                        C25193b bVar = C25193b.f66485a;
                        Aweme aweme2 = this.f89233a.f77546j;
                        C7573i.m23582a((Object) aweme2, "mAweme");
                        C25196d.m82880a(ab, C25193b.m82872a(aweme2, null), C342121.f89234a, new C7561a<C7581n>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C34211g f89235a;

                            {
                                this.f89235a = r1;
                            }

                            public final /* synthetic */ Object invoke() {
                                m110495a();
                                return C7581n.f20898a;
                            }

                            /* renamed from: a */
                            private void m110495a() {
                                C19535g a = DownloaderManagerHolder.m75524a();
                                String x = C25352e.m83241x(this.f89235a.f89233a.f77546j);
                                Aweme aweme = this.f89235a.f89233a.f77546j;
                                C7573i.m23582a((Object) aweme, "mAweme");
                                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                                if (awemeRawAd == null) {
                                    C7573i.m23580a();
                                }
                                C7573i.m23582a((Object) awemeRawAd, "mAweme.awemeRawAd!!");
                                Long adId = awemeRawAd.getAdId();
                                C7573i.m23582a((Object) adId, "mAweme.awemeRawAd!!.adId");
                                long longValue = adId.longValue();
                                Aweme aweme2 = this.f89235a.f89233a.f77546j;
                                C7573i.m23582a((Object) aweme2, "mAweme");
                                C19386b a2 = C22943b.m75511a("result_ad", aweme2.getAwemeRawAd(), "bg_download_button");
                                Aweme aweme3 = this.f89235a.f89233a.f77546j;
                                C7573i.m23582a((Object) aweme3, "mAweme");
                                AwemeRawAd awemeRawAd2 = aweme3.getAwemeRawAd();
                                if (awemeRawAd2 == null) {
                                    C7573i.m23580a();
                                }
                                a.mo51670a(x, longValue, 2, a2, C22942a.m75508a(awemeRawAd2));
                            }
                        }).mo65822a();
                    }
                    this.f89233a.mo75308a(true, true);
                    return;
                }
                CommercialFlowFeedViewHolder commercialFlowFeedViewHolder = this.f89233a;
                Aweme aweme3 = this.f89233a.f77546j;
                C7573i.m23582a((Object) aweme3, "mAweme");
                commercialFlowFeedViewHolder.mo86956a(aweme3.getAwemeRawAd(), "bg_more_button");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$h */
    static final class C34214h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommercialFlowFeedViewHolder f89236a;

        C34214h(CommercialFlowFeedViewHolder commercialFlowFeedViewHolder) {
            this.f89236a = commercialFlowFeedViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89236a.mo86958ap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$i */
    static final class C34215i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommercialFlowFeedViewHolder f89237a;

        C34215i(CommercialFlowFeedViewHolder commercialFlowFeedViewHolder) {
            this.f89237a = commercialFlowFeedViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89237a.mo86958ap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$j */
    static final class C34216j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommercialFlowFeedViewHolder f89238a;

        /* renamed from: b */
        final /* synthetic */ boolean f89239b;

        /* renamed from: c */
        final /* synthetic */ boolean f89240c;

        C34216j(CommercialFlowFeedViewHolder commercialFlowFeedViewHolder, boolean z, boolean z2) {
            this.f89238a = commercialFlowFeedViewHolder;
            this.f89239b = z;
            this.f89240c = z2;
        }

        public final void run() {
            String str;
            LinearLayout linearLayout = this.f89238a.f89205aX;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (this.f89239b) {
                this.f89238a.mo75317d(this.f89238a.f77546j);
            }
            if (this.f89240c) {
                C24961b b = C24958f.m81905a().mo65273b(this.f89238a.f77546j).mo65266a("result_ad").mo65276b("play");
                if (!C25352e.m83224g(this.f89238a.f77546j) || !TextUtils.equals(this.f89238a.mo75290r(), "general_search")) {
                    str = "";
                } else {
                    str = "video";
                }
                b.mo65283e(str).mo65270a(this.f89238a.mo75261ab());
            }
            this.f89238a.f89204aW = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$k */
    static final class C34217k implements C25372a {

        /* renamed from: a */
        final /* synthetic */ CommercialFlowFeedViewHolder f89241a;

        C34217k(CommercialFlowFeedViewHolder commercialFlowFeedViewHolder) {
            this.f89241a = commercialFlowFeedViewHolder;
        }

        /* renamed from: a */
        public final void mo61517a(boolean z) {
            String str;
            C24961b a = C24958f.m81905a().mo65273b(this.f89241a.f77546j).mo65266a("result_ad");
            if (z) {
                str = "deeplink_success";
            } else {
                str = "deeplink_failed";
            }
            a.mo65276b(str).mo65270a(this.f89241a.mo75261ab());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$l */
    public static final class C34218l implements C25346b {

        /* renamed from: a */
        final /* synthetic */ CommercialFlowFeedViewHolder f89242a;

        /* renamed from: a */
        public final long mo65903a() {
            C34199d dVar = this.f89242a.f77592aR;
            C7573i.m23582a((Object) dVar, "mPlayVideoHelper");
            return dVar.mo86938d();
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo86969a(com.p280ss.android.ugc.aweme.feed.model.Aweme r5, com.p280ss.android.ugc.playerkit.videoview.C44960f r6) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder r6 = r4.f89242a
                com.ss.android.ugc.aweme.newfollow.util.d r6 = r6.f77592aR
                java.lang.String r0 = "mPlayVideoHelper"
                kotlin.jvm.internal.C7573i.m23582a(r6, r0)
                long r0 = r6.mo86937c()
                r2 = 0
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 <= 0) goto L_0x0014
                return r0
            L_0x0014:
                if (r5 == 0) goto L_0x0025
                com.ss.android.ugc.aweme.feed.model.Video r6 = r5.getVideo()
                if (r6 == 0) goto L_0x0025
                int r6 = r6.getDuration()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                goto L_0x0026
            L_0x0025:
                r6 = 0
            L_0x0026:
                if (r6 == 0) goto L_0x0046
                com.ss.android.ugc.aweme.feed.model.Video r6 = r5.getVideo()
                java.lang.String r0 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r6, r0)
                int r6 = r6.getDuration()
                if (r6 <= 0) goto L_0x0046
                com.ss.android.ugc.aweme.feed.model.Video r5 = r5.getVideo()
                java.lang.String r6 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r5, r6)
                int r5 = r5.getDuration()
                long r5 = (long) r5
                return r5
            L_0x0046:
                r5 = 1
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.newfollow.p1424vh.CommercialFlowFeedViewHolder.C34218l.mo86969a(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.playerkit.videoview.f):long");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$m */
    static final class C34219m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchAdBottomBar f89243a;

        C34219m(SearchAdBottomBar searchAdBottomBar) {
            this.f89243a = searchAdBottomBar;
        }

        public final void run() {
            this.f89243a.mo66232a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$n */
    static final class C34220n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchAdBottomBar f89244a;

        C34220n(SearchAdBottomBar searchAdBottomBar) {
            this.f89244a = searchAdBottomBar;
        }

        public final void run() {
            this.f89244a.mo66233b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$o */
    static final class C34221o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommercialFlowFeedViewHolder f89245a;

        C34221o(CommercialFlowFeedViewHolder commercialFlowFeedViewHolder) {
            this.f89245a = commercialFlowFeedViewHolder;
        }

        public final void run() {
            CharSequence charSequence;
            RelativeLayout relativeLayout = this.f89245a.f89212bd;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            this.f89245a.mo75311ai();
            LinearLayout linearLayout = this.f89245a.f89205aX;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            Aweme aweme = this.f89245a.f77546j;
            C7573i.m23582a((Object) aweme, "mAweme");
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            String str = null;
            if (awemeRawAd != null) {
                charSequence = awemeRawAd.getAppInstall();
            } else {
                charSequence = null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                DmtTextView dmtTextView = this.f89245a.f89210bb;
                if (dmtTextView != null) {
                    dmtTextView.setVisibility(8);
                }
                View view = this.f89245a.f89209ba;
                if (view != null) {
                    view.setVisibility(8);
                }
            } else {
                AdRatingView adRatingView = this.f89245a.f89207aZ;
                if (adRatingView == null || adRatingView.getVisibility() != 0) {
                    DmtTextView dmtTextView2 = this.f89245a.f89210bb;
                    if (dmtTextView2 != null) {
                        Aweme aweme2 = this.f89245a.f77546j;
                        C7573i.m23582a((Object) aweme2, "mAweme");
                        AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            str = awemeRawAd2.getAppInstall();
                        }
                        dmtTextView2.setText(str);
                    }
                } else {
                    DmtTextView dmtTextView3 = this.f89245a.f89210bb;
                    if (dmtTextView3 != null) {
                        dmtTextView3.post(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C34221o f89246a;

                            {
                                this.f89246a = r1;
                            }

                            public final void run() {
                                int measuredWidth;
                                String str;
                                if (this.f89246a.f89245a.mo86957ao()) {
                                    LinearLayout linearLayout = this.f89246a.f89245a.f89206aY;
                                    if (linearLayout == null) {
                                        C7573i.m23580a();
                                    }
                                    int i = linearLayout.getLayoutParams().width;
                                    AdRatingView adRatingView = this.f89246a.f89245a.f89207aZ;
                                    if (adRatingView == null) {
                                        C7573i.m23580a();
                                    }
                                    measuredWidth = (i - adRatingView.getMeasuredWidth()) - C23486n.m77122a(16.5d);
                                } else {
                                    LinearLayout linearLayout2 = this.f89246a.f89245a.f89206aY;
                                    if (linearLayout2 == null) {
                                        C7573i.m23580a();
                                    }
                                    int i2 = linearLayout2.getLayoutParams().width;
                                    AdRatingView adRatingView2 = this.f89246a.f89245a.f89207aZ;
                                    if (adRatingView2 == null) {
                                        C7573i.m23580a();
                                    }
                                    measuredWidth = ((i2 - adRatingView2.getMeasuredWidth()) - C23486n.m77122a(16.5d)) - C23486n.m77122a(58.0d);
                                }
                                int i3 = measuredWidth;
                                Aweme aweme = this.f89246a.f89245a.f77546j;
                                C7573i.m23582a((Object) aweme, "mAweme");
                                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                                if (awemeRawAd == null) {
                                    C7573i.m23580a();
                                }
                                C7573i.m23582a((Object) awemeRawAd, "mAweme.awemeRawAd!!");
                                CharSequence appInstall = awemeRawAd.getAppInstall();
                                DmtTextView dmtTextView = this.f89246a.f89245a.f89210bb;
                                if (dmtTextView == null) {
                                    C7573i.m23580a();
                                }
                                DynamicLayout dynamicLayout = new DynamicLayout(appInstall, dmtTextView.getPaint(), i3, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                                if (dynamicLayout.getLineCount() > 1) {
                                    DmtTextView dmtTextView2 = this.f89246a.f89245a.f89210bb;
                                    if (dmtTextView2 != null) {
                                        dmtTextView2.setVisibility(8);
                                    }
                                    View view = this.f89246a.f89245a.f89209ba;
                                    if (view != null) {
                                        view.setVisibility(8);
                                    }
                                    return;
                                }
                                DmtTextView dmtTextView3 = this.f89246a.f89245a.f89210bb;
                                if (dmtTextView3 != null) {
                                    Aweme aweme2 = this.f89246a.f89245a.f77546j;
                                    C7573i.m23582a((Object) aweme2, "mAweme");
                                    AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                                    if (awemeRawAd2 != null) {
                                        str = awemeRawAd2.getAppInstall();
                                    } else {
                                        str = null;
                                    }
                                    dmtTextView3.setText(str);
                                }
                            }
                        });
                    }
                }
            }
            C43081e.m136670a(this.f89245a.f89211bc);
            float a = (float) C23486n.m77122a(2.0d);
            Context ab = this.f89245a.mo75261ab();
            C7573i.m23582a((Object) ab, "context");
            C24510b bVar = new C24510b(a, ab.getResources().getColor(R.color.w0));
            if (C25352e.m83199A(this.f89245a.f77546j) || C25352e.m83315Z(this.f89245a.f77546j)) {
                C43081e.m136673a(this.f89245a.f89211bc, bVar, C0683b.m2912c(this.f89245a.mo75261ab(), R.color.a5q), Color.parseColor(C25352e.m83242y(this.f89245a.f77546j)), 300);
            } else {
                DmtTextView dmtTextView4 = this.f89245a.f89211bc;
                if (dmtTextView4 != null) {
                    dmtTextView4.setBackground(bVar);
                }
            }
            LinearLayout linearLayout2 = this.f89245a.f89205aX;
            if (linearLayout2 != null) {
                ViewPropertyAnimator animate = linearLayout2.animate();
                if (animate != null) {
                    ViewPropertyAnimator alpha = animate.alpha(1.0f);
                    if (alpha != null) {
                        ViewPropertyAnimator duration = alpha.setDuration(150);
                        if (duration != null) {
                            duration.start();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$p */
    static final class C34223p implements C24939aj {

        /* renamed from: a */
        final /* synthetic */ CommercialFlowFeedViewHolder f89247a;

        /* renamed from: b */
        final /* synthetic */ AwemeRawAd f89248b;

        /* renamed from: c */
        final /* synthetic */ String f89249c;

        C34223p(CommercialFlowFeedViewHolder commercialFlowFeedViewHolder, AwemeRawAd awemeRawAd, String str) {
            this.f89247a = commercialFlowFeedViewHolder;
            this.f89248b = awemeRawAd;
            this.f89249c = str;
        }

        /* renamed from: a */
        public final void mo63403a(String str, String str2, long j) {
            C24961b a = C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65263a(this.f89248b);
            if (C23764b.m77913a(this.f89249c)) {
                a.mo65283e(this.f89249c);
            }
            a.mo65270a(this.f89247a.mo75261ab());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommercialFlowFeedViewHolder$q */
    static final class C34224q implements C24939aj {

        /* renamed from: a */
        final /* synthetic */ CommercialFlowFeedViewHolder f89250a;

        /* renamed from: b */
        final /* synthetic */ AwemeRawAd f89251b;

        /* renamed from: c */
        final /* synthetic */ String f89252c;

        C34224q(CommercialFlowFeedViewHolder commercialFlowFeedViewHolder, AwemeRawAd awemeRawAd, String str) {
            this.f89250a = commercialFlowFeedViewHolder;
            this.f89251b = awemeRawAd;
            this.f89252c = str;
        }

        /* renamed from: a */
        public final void mo63403a(String str, String str2, long j) {
            C24961b a = C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("show").mo65263a(this.f89251b);
            if (C23764b.m77913a(this.f89252c)) {
                a.mo65283e(this.f89252c);
            }
            a.mo65270a(this.f89250a.mo75261ab());
        }
    }

    /* renamed from: a */
    public final void mo75308a(boolean z, boolean z2) {
        if (this.f89205aX != null) {
            LinearLayout linearLayout = this.f89205aX;
            int i = 8;
            if (linearLayout == null || linearLayout.getVisibility() != 8) {
                LinearLayout linearLayout2 = this.f89205aX;
                if (linearLayout2 != null) {
                    linearLayout2.setAlpha(1.0f);
                }
                LinearLayout linearLayout3 = this.f89205aX;
                if (linearLayout3 != null) {
                    ViewPropertyAnimator animate = linearLayout3.animate();
                    if (animate != null) {
                        ViewPropertyAnimator alpha = animate.alpha(0.0f);
                        if (alpha != null) {
                            ViewPropertyAnimator duration = alpha.setDuration(150);
                            if (duration != null) {
                                ViewPropertyAnimator withEndAction = duration.withEndAction(new C34216j(this, z, z2));
                                if (withEndAction != null) {
                                    withEndAction.start();
                                }
                            }
                        }
                    }
                }
                RelativeLayout relativeLayout = this.f89212bd;
                if (relativeLayout != null) {
                    relativeLayout.setAlpha(0.0f);
                }
                RelativeLayout relativeLayout2 = this.f89212bd;
                if (relativeLayout2 != null) {
                    if (!TimeLockRuler.isTeenModeON()) {
                        i = 0;
                    }
                    relativeLayout2.setVisibility(i);
                }
                RelativeLayout relativeLayout3 = this.f89212bd;
                if (relativeLayout3 != null) {
                    ViewPropertyAnimator animate2 = relativeLayout3.animate();
                    if (animate2 != null) {
                        ViewPropertyAnimator alpha2 = animate2.alpha(1.0f);
                        if (alpha2 != null) {
                            ViewPropertyAnimator duration2 = alpha2.setDuration(150);
                            if (duration2 != null) {
                                duration2.start();
                            }
                        }
                    }
                }
                C28418f a = C28418f.m93413a();
                C7573i.m23582a((Object) a, "FeedSharePlayInfoHelper.inst()");
                a.f74935e = false;
            }
        }
    }

    /* renamed from: aC */
    private final void m110455aC() {
        this.f89227f = false;
        this.f89228g = false;
    }

    /* renamed from: ac */
    public final void mo75262ac() {
        super.mo75262ac();
        m110455aC();
        m110453aA();
        m110465az();
    }

    /* renamed from: aD */
    private final boolean m110456aD() {
        if (!this.f89228g) {
            this.f89227f = C23487o.m77156c(this.itemView);
            this.f89228g = true;
        }
        return this.f89227f;
    }

    /* renamed from: aw */
    private final void m110462aw() {
        if (this.f89224c != null) {
            DownloaderManagerHolder.m75524a().mo51669a(this.f89224c, hashCode());
            this.f89224c = null;
        }
    }

    /* renamed from: az */
    private final void m110465az() {
        if (this.f89221bo != null) {
            if (!m110456aD()) {
                this.f89225d = false;
            } else if (!this.f89225d) {
                this.f89225d = true;
                C24942al.m81834a(mo75261ab(), this.f89221bo);
            }
        }
    }

    /* renamed from: aB */
    private final boolean m110454aB() {
        if (C25329c.m83217a(mo75290r())) {
            Aweme aweme = this.f77546j;
            C7573i.m23582a((Object) aweme, "mAweme");
            if (TextUtils.equals(aweme.getAid(), C34195b.m110393a())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ar */
    private final void mo86986ar() {
        if (mo75232H()) {
            this.f89208b = false;
            if (this.f89222bp == null) {
                ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.dbw);
                if (viewStub != null) {
                    viewStub.setLayoutResource(R.layout.a_f);
                    View inflate = viewStub.inflate();
                    if (inflate != null) {
                        this.f89222bp = (SearchAdBottomBar) inflate;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar");
                    }
                }
            }
            SearchAdBottomBar searchAdBottomBar = this.f89222bp;
            if (searchAdBottomBar != null) {
                searchAdBottomBar.mo66230a(this.f77546j);
            }
        }
    }

    /* renamed from: ao */
    public final boolean mo86957ao() {
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "mAweme");
        Video video = aweme.getVideo();
        C7573i.m23582a((Object) video, "mAweme.video");
        int height = video.getHeight() * 3;
        Aweme aweme2 = this.f77546j;
        C7573i.m23582a((Object) aweme2, "mAweme");
        Video video2 = aweme2.getVideo();
        C7573i.m23582a((Object) video2, "mAweme.video");
        if (height >= video2.getWidth() * 4) {
            return true;
        }
        return false;
    }

    /* renamed from: aq */
    public final boolean mo86959aq() {
        boolean z;
        boolean a = C25352e.m83215a(this.f77546j);
        if (C25352e.m83221d(this.f77546j) || !a) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C10761a.m31399c(mo75261ab(), (int) R.string.e3).mo25750a();
        }
        return z;
    }

    /* renamed from: k */
    public void mo68530k() {
        super.mo68530k();
        SearchAdBottomBar searchAdBottomBar = this.f89222bp;
        if (searchAdBottomBar != null) {
            searchAdBottomBar.setVisibility(8);
        }
        Aweme aweme = this.f77546j;
        boolean d = C25352e.m83221d(aweme);
        C7573i.m23582a((Object) aweme, "aweme");
        m110451a(aweme, d);
        if (d) {
            m110459at();
            mo86986ar();
        }
    }

    /* renamed from: aA */
    private final void m110453aA() {
        if (this.f77530as && !m110454aB()) {
            if (!m110456aD()) {
                this.f89226e = false;
            } else if (!this.f89226e) {
                this.f89226e = true;
                C24958f.m81905a().mo65266a("result_ad").mo65276b("show").mo65273b(this.f77546j).mo65283e("video").mo65270a(mo75261ab());
                Aweme aweme = this.f77546j;
                if (aweme != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        C7573i.m23582a((Object) awemeRawAd, "it");
                        m110468c(awemeRawAd, null);
                    }
                }
            }
        }
    }

    /* renamed from: aj */
    public final void mo75312aj() {
        super.mo75312aj();
        if (this.f77593aS != null && this.f77546j != null && C25352e.m83221d(this.f77546j)) {
            C24961b e = C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("play_break").mo65283e("video");
            C43222g gVar = this.f77593aS;
            C7573i.m23582a((Object) gVar, "mPlayer");
            C24961b a = e.mo65255a(gVar.mo104915n());
            Aweme aweme = this.f77546j;
            C7573i.m23582a((Object) aweme, "mAweme");
            Video video = aweme.getVideo();
            C7573i.m23582a((Object) video, "mAweme.video");
            a.mo65271b((long) video.getVideoLength()).mo65270a(mo75261ab());
        }
    }

    /* renamed from: al */
    public final boolean mo75314al() {
        if (C25352e.m83221d(this.f77546j)) {
            Aweme aweme = this.f77546j;
            C7573i.m23582a((Object) aweme, "mAweme");
            Video video = aweme.getVideo();
            C7573i.m23582a((Object) video, "mAweme.video");
            if (video.getHeight() >= 300) {
                if (!C34269d.m110856a(mo75261ab())) {
                    return m110458as();
                }
                if (TextUtils.isEmpty(C25352e.m83302M(this.f77546j))) {
                    return m110458as();
                }
                if (!C19929d.m65759a(C25352e.m83302M(this.f77546j))) {
                    return m110458as();
                }
                if (C25384x.m83529a(this.f77546j)) {
                    return false;
                }
                return m110458as();
            }
        }
        return false;
    }

    /* renamed from: ap */
    public final void mo86958ap() {
        if (!mo86959aq()) {
            C24411a.m80259a();
            C24411a.m80261a(mo75261ab(), this.f77546j);
            if (C25352e.m83221d(this.f77546j)) {
                Context ab = mo75261ab();
                Aweme aweme = this.f77546j;
                C7573i.m23582a((Object) aweme, "mAweme");
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) awemeRawAd, "mAweme.awemeRawAd!!");
                String valueOf = String.valueOf(awemeRawAd.getCreativeId().longValue());
                String str = "background";
                Aweme aweme2 = this.f77546j;
                C7573i.m23582a((Object) aweme2, "mAweme");
                AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                if (awemeRawAd2 == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) awemeRawAd2, "mAweme.awemeRawAd!!");
                C24976t.m82219f(ab, valueOf, str, awemeRawAd2.getLogExtra());
            }
            mo75308a(true, false);
        }
    }

    /* renamed from: e */
    public void mo68520e() {
        super.mo68520e();
        C26780aa.m87959a(this.itemView, mo75290r(), this.f77546j);
        C24942al.m81837c(mo75261ab(), this.f89221bo);
        C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("otherclick").mo65283e("video").mo65270a(mo75261ab());
    }

    /* renamed from: ay */
    private final void m110464ay() {
        SearchAdBottomBar searchAdBottomBar = this.f89222bp;
        if (searchAdBottomBar != null) {
            Aweme aweme = this.f77546j;
            C7573i.m23582a((Object) aweme, "mAweme");
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C7573i.m23582a((Object) awemeRawAd, "mAweme.awemeRawAd ?: return");
                this.f89208b = true;
                int showButtonSeconds = awemeRawAd.getShowButtonSeconds() * 1000;
                if (showButtonSeconds < 0) {
                    showButtonSeconds = 0;
                }
                int max = Math.max(showButtonSeconds, awemeRawAd.getShowButtonColorSeconds() * 1000);
                if (max < 0) {
                    max = 0;
                }
                if (this.f89223bq.mo65903a() >= ((long) showButtonSeconds)) {
                    searchAdBottomBar.mo66232a(true);
                    searchAdBottomBar.mo66233b(true);
                    return;
                }
                long a = this.f89223bq.mo86969a(this.f77546j, null);
                this.f89203a.mo65913a(new C25348a().mo65906a(a).mo65905a(showButtonSeconds).mo65907a((Runnable) new C34219m(searchAdBottomBar)).mo65908a(false).mo65909a());
                this.f89203a.mo65913a(new C25348a().mo65906a(a).mo65905a(max).mo65907a((Runnable) new C34220n(searchAdBottomBar)).mo65908a(false).mo65909a());
                this.f89203a.mo65912a((C25346b) this.f89223bq);
                this.f89203a.mo65914b();
            }
        }
    }

    /* renamed from: ad */
    public final void mo75263ad() {
        String str;
        super.mo75263ad();
        if (C25352e.m83313X(this.f77546j)) {
            if (C6399b.m19944t()) {
                if (!C6776h.m20948b(mo75261ab(), C25352e.m83305P(this.f77546j)) && C25371n.m83443a(mo75261ab())) {
                    C25371n.m83471b(mo75261ab(), C25352e.m83305P(this.f77546j));
                }
            } else if (!DownloaderManagerHolder.m75524a().mo51673b(C25352e.m83241x(this.f77546j))) {
                C19535g a = DownloaderManagerHolder.m75524a();
                String x = C25352e.m83241x(this.f77546j);
                Aweme aweme = this.f77546j;
                C7573i.m23582a((Object) aweme, "mAweme");
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) awemeRawAd, "mAweme.awemeRawAd!!");
                Long adId = awemeRawAd.getAdId();
                C7573i.m23582a((Object) adId, "mAweme.awemeRawAd!!.adId");
                long longValue = adId.longValue();
                Aweme aweme2 = this.f77546j;
                C7573i.m23582a((Object) aweme2, "mAweme");
                C19386b a2 = C22943b.m75512a("result_ad", aweme2.getAwemeRawAd(), false);
                Aweme aweme3 = this.f77546j;
                C7573i.m23582a((Object) aweme3, "mAweme");
                AwemeRawAd awemeRawAd2 = aweme3.getAwemeRawAd();
                if (awemeRawAd2 == null) {
                    C7573i.m23580a();
                }
                a.mo51670a(x, longValue, 2, a2, C22942a.m75508a(awemeRawAd2));
            }
        }
        m110463ax();
        if (!C25352e.m83313X(this.f77546j) || C6776h.m20948b(mo75261ab(), C25352e.m83305P(this.f77546j)) || DownloaderManagerHolder.m75524a().mo51673b(C25352e.m83241x(this.f77546j))) {
            C24961b b = C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("click");
            if (C25352e.m83313X(this.f77546j)) {
                str = "download_button";
            } else {
                str = "more_button";
            }
            b.mo65283e(str).mo65270a(mo75261ab());
        }
    }

    /* renamed from: as */
    private final boolean m110458as() {
        String str;
        String str2;
        if (this.f89205aX == null || this.f89207aZ == null || this.f89210bb == null || this.f89209ba == null || !C25352e.m83221d(this.f77546j)) {
            return false;
        }
        this.f89212bd = (RelativeLayout) this.itemView.findViewById(R.id.eh4);
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "mAweme");
        if (aweme.isAppAd() && DownloaderManagerHolder.m75524a().mo51673b(C25352e.m83241x(this.f77546j))) {
            return false;
        }
        this.f89204aW = true;
        Aweme aweme2 = this.f77546j;
        C7573i.m23582a((Object) aweme2, "mAweme");
        String str3 = null;
        if (aweme2.isAppAd()) {
            Context ab = mo75261ab();
            Aweme aweme3 = this.f77546j;
            C7573i.m23582a((Object) aweme3, "mAweme");
            AwemeRawAd awemeRawAd = aweme3.getAwemeRawAd();
            if (awemeRawAd != null) {
                str2 = awemeRawAd.getCreativeIdStr();
            } else {
                str2 = null;
            }
            String str4 = "bg_download_button";
            Aweme aweme4 = this.f77546j;
            C7573i.m23582a((Object) aweme4, "mAweme");
            AwemeRawAd awemeRawAd2 = aweme4.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                str3 = awemeRawAd2.getLogExtra();
            }
            C24976t.m82210e(ab, str2, str4, str3);
        } else {
            Context ab2 = mo75261ab();
            Aweme aweme5 = this.f77546j;
            C7573i.m23582a((Object) aweme5, "mAweme");
            AwemeRawAd awemeRawAd3 = aweme5.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                str = awemeRawAd3.getCreativeIdStr();
            } else {
                str = null;
            }
            String str5 = "bg_more_button";
            Aweme aweme6 = this.f77546j;
            C7573i.m23582a((Object) aweme6, "mAweme");
            AwemeRawAd awemeRawAd4 = aweme6.getAwemeRawAd();
            if (awemeRawAd4 != null) {
                str3 = awemeRawAd4.getLogExtra();
            }
            C24976t.m82210e(ab2, str, str5, str3);
        }
        LinearLayout linearLayout = this.f89205aX;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
        }
        RelativeLayout relativeLayout = this.f89212bd;
        if (relativeLayout != null) {
            relativeLayout.setAlpha(1.0f);
        }
        RelativeLayout relativeLayout2 = this.f89212bd;
        if (relativeLayout2 != null) {
            ViewPropertyAnimator animate = relativeLayout2.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(0.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(150);
                    if (duration != null) {
                        ViewPropertyAnimator withEndAction = duration.withEndAction(new C34221o(this));
                        if (withEndAction != null) {
                            withEndAction.start();
                        }
                    }
                }
            }
        }
        C28418f a = C28418f.m93413a();
        C7573i.m23582a((Object) a, "FeedSharePlayInfoHelper.inst()");
        a.f74934d = true;
        C28418f a2 = C28418f.m93413a();
        C7573i.m23582a((Object) a2, "FeedSharePlayInfoHelper.inst()");
        a2.f74935e = true;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e  */
    /* renamed from: av */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m110461av() {
        /*
            r4 = this;
            android.widget.LinearLayout r0 = r4.f89217bk
            r1 = 8
            if (r0 == 0) goto L_0x0009
            r0.setVisibility(r1)
        L_0x0009:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.String r0 = r0.getDesc()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0082
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r4.f89218bl
            if (r0 == 0) goto L_0x0025
            r1 = 2
            r0.setMaxLines(r1)
        L_0x0025:
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r4.f89218bl
            if (r0 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            java.lang.String r1 = r1.getDesc()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0039:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f77546j
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83221d(r0)
            if (r0 != 0) goto L_0x0089
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f77546j
            java.lang.String r1 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r0.getAdMoreTextual()
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0089
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r4.f89218bl
            if (r0 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 != 0) goto L_0x0070
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0070:
            java.lang.String r3 = "mAweme.awemeRawAd!!"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            java.lang.String r1 = r1.getAdMoreTextual()
            java.lang.String r3 = "mAweme.awemeRawAd!!.adMoreTextual"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            r0.setMoreString(r1)
            goto L_0x0089
        L_0x0082:
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r4.f89218bl
            if (r0 == 0) goto L_0x0089
            r0.setVisibility(r1)
        L_0x0089:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f77546j
            java.lang.String r1 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x00c7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f77546j
            java.lang.String r1 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r1 = "mAweme.author"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarMedium()
            if (r0 != 0) goto L_0x00ad
            goto L_0x00c7
        L_0x00ad:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r4.f89219bm
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            java.lang.String r3 = "mAweme.author"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getAvatarMedium()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r1)
            goto L_0x00d3
        L_0x00c7:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r4.f89219bm
            r1 = 2131232103(0x7f080567, float:1.8080306E38)
            com.ss.android.ugc.aweme.base.model.AppImageUri r1 = com.p280ss.android.ugc.aweme.base.model.AppImageUri.m76615a(r1)
            com.p280ss.android.ugc.aweme.base.C23323e.m76504a(r0, r1)
        L_0x00d3:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f77546j
            java.lang.String r1 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 != 0) goto L_0x00e1
            return
        L_0x00e1:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f77546j
            r1 = 3
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx.m83125a(r0, r1)
            if (r0 == 0) goto L_0x012d
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r4.f89216bj
            if (r0 == 0) goto L_0x012c
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 == 0) goto L_0x0108
            com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r1.getOmVast()
            if (r1 == 0) goto L_0x0108
            com.bytedance.vast.model.Vast r1 = r1.vast
            if (r1 == 0) goto L_0x0108
            java.lang.String r1 = r1.adTitle
            goto L_0x0109
        L_0x0108:
            r1 = r2
        L_0x0109:
            if (r1 != 0) goto L_0x010e
            java.lang.String r2 = ""
            goto L_0x0127
        L_0x010e:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 == 0) goto L_0x0127
            com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r1.getOmVast()
            if (r1 == 0) goto L_0x0127
            com.bytedance.vast.model.Vast r1 = r1.vast
            if (r1 == 0) goto L_0x0127
            java.lang.String r2 = r1.adTitle
        L_0x0127:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
        L_0x012c:
            return
        L_0x012d:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r4.f89216bj
            if (r0 == 0) goto L_0x015c
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            if (r1 != 0) goto L_0x0143
            java.lang.String r1 = ""
        L_0x0140:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x0158
        L_0x0143:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            java.lang.String r2 = "mAweme.author"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.String r1 = r1.getNickname()
            goto L_0x0140
        L_0x0158:
            r0.setText(r1)
            return
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.newfollow.p1424vh.CommercialFlowFeedViewHolder.m110461av():void");
    }

    /* renamed from: ax */
    private final void m110463ax() {
        boolean z;
        if (C25352e.m83221d(this.f77546j)) {
            C24962g.m81963b(this.f77546j);
            boolean z2 = true;
            if (!C25352e.m83313X(this.f77546j) || C6776h.m20948b(mo75261ab(), C25352e.m83305P(this.f77546j))) {
                z = true;
            } else {
                z = false;
            }
            Aweme aweme = this.f77546j;
            C7573i.m23582a((Object) aweme, "mAweme");
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) awemeRawAd, "mAweme.awemeRawAd!!");
            String openUrl = awemeRawAd.getOpenUrl();
            boolean b = C25371n.m83473b(openUrl);
            if (C25352e.m83361c(openUrl)) {
                String builder = Uri.parse(C24505a.f64678a).buildUpon().appendQueryParameter("tag", "result_ad").toString();
                C7573i.m23582a((Object) builder, "Uri.parse(CommercializeC…              .toString()");
                openUrl = C25352e.m83325a(openUrl, builder);
            } else {
                z2 = false;
            }
            if (!z || !b || !C25371n.m83458a(mo75261ab(), openUrl, this.f77546j, false, false)) {
                Context ab = mo75261ab();
                Aweme aweme2 = this.f77546j;
                String N = C25352e.m83303N(this.f77546j);
                String O = C25352e.m83304O(this.f77546j);
                Aweme aweme3 = this.f77546j;
                C7573i.m23582a((Object) aweme3, "mAweme");
                AwemeRawAd awemeRawAd2 = aweme3.getAwemeRawAd();
                if (awemeRawAd2 == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) awemeRawAd2, "mAweme.awemeRawAd!!");
                if (C25371n.m83453a(ab, aweme2, N, O, awemeRawAd2.isUseOrdinaryWeb(), false, 5)) {
                    C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("open_url_h5").mo65270a(mo75261ab());
                }
                return;
            }
            if (z2) {
                C24558c a = C24558c.m80613a();
                C7573i.m23582a((Object) a, "CommercializeManager.getInstance()");
                a.f64800a = this.f77546j;
            }
            C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("open_url_app").mo65270a(mo75261ab());
            C25371n.m83440a((C25372a) new C34217k(this));
        }
    }

    /* renamed from: at */
    private final void m110459at() {
        float b = ((float) C23482j.m77098b(mo75261ab())) / ((float) C23486n.m77122a(375.0d));
        if (mo86957ao()) {
            this.f89205aX = (LinearLayout) this.itemView.findViewById(R.id.e_w);
            this.f89206aY = (LinearLayout) this.itemView.findViewById(R.id.e_u);
            this.f89216bj = (DmtTextView) this.itemView.findViewById(R.id.cl);
            this.f89207aZ = (AdRatingView) this.itemView.findViewById(R.id.d5);
            this.f89209ba = this.itemView.findViewById(R.id.ce);
            this.f89210bb = (DmtTextView) this.itemView.findViewById(R.id.b_);
            this.f89217bk = (LinearLayout) this.itemView.findViewById(R.id.ch);
            this.f89218bl = (DescTextView) this.itemView.findViewById(R.id.bo);
            this.f89219bm = (RemoteImageView) this.itemView.findViewById(R.id.c5);
            this.f89211bc = (DmtTextView) this.itemView.findViewById(R.id.aj6);
            this.f89220bn = (DmtTextView) this.itemView.findViewById(R.id.aj_);
            LinearLayout linearLayout = this.f89206aY;
            if (linearLayout != null) {
                LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (int) (((float) C23486n.m77122a(183.0d)) * b);
                }
            }
            DmtTextView dmtTextView = this.f89220bn;
            if (dmtTextView != null) {
                LayoutParams layoutParams2 = dmtTextView.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = (int) (((float) C23486n.m77122a(86.5d)) * b);
                }
            }
            DmtTextView dmtTextView2 = this.f89211bc;
            if (dmtTextView2 != null) {
                LayoutParams layoutParams3 = dmtTextView2.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = (int) (((float) C23486n.m77122a(86.5d)) * b);
                    if (layoutParams3 != null) {
                        if (layoutParams3 != null) {
                            ((MarginLayoutParams) layoutParams3).setMarginStart((int) (((float) C23486n.m77122a(10.0d)) * b));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                }
            }
        } else {
            this.f89205aX = (LinearLayout) this.itemView.findViewById(R.id.aw_);
            this.f89206aY = (LinearLayout) this.itemView.findViewById(R.id.aw8);
            this.f89216bj = (DmtTextView) this.itemView.findViewById(R.id.ck);
            this.f89207aZ = (AdRatingView) this.itemView.findViewById(R.id.d4);
            this.f89209ba = this.itemView.findViewById(R.id.cd);
            this.f89210bb = (DmtTextView) this.itemView.findViewById(R.id.b9);
            this.f89217bk = (LinearLayout) this.itemView.findViewById(R.id.cg);
            this.f89218bl = (DescTextView) this.itemView.findViewById(R.id.bn);
            this.f89219bm = (RemoteImageView) this.itemView.findViewById(R.id.c4);
            this.f89211bc = (DmtTextView) this.itemView.findViewById(R.id.aj5);
            this.f89220bn = (DmtTextView) this.itemView.findViewById(R.id.aj9);
            LinearLayout linearLayout2 = this.f89206aY;
            if (linearLayout2 != null) {
                LayoutParams layoutParams4 = linearLayout2.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.width = (int) (((float) C23486n.m77122a(223.0d)) * b);
                }
            }
            DmtTextView dmtTextView3 = this.f89220bn;
            if (dmtTextView3 != null) {
                LayoutParams layoutParams5 = dmtTextView3.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.width = (int) (((float) C23486n.m77122a(106.5d)) * b);
                }
            }
            DmtTextView dmtTextView4 = this.f89211bc;
            if (dmtTextView4 != null) {
                LayoutParams layoutParams6 = dmtTextView4.getLayoutParams();
                if (layoutParams6 != null) {
                    layoutParams6.width = (int) (((float) C23486n.m77122a(106.5d)) * b);
                    if (layoutParams6 != null) {
                        if (layoutParams6 != null) {
                            ((MarginLayoutParams) layoutParams6).setMarginStart((int) (((float) C23486n.m77122a(10.0d)) * b));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                }
            }
        }
        DescTextView descTextView = this.f89218bl;
        if (descTextView != null) {
            descTextView.setDescLightDrawable(R.drawable.z2);
        }
        DescTextView descTextView2 = this.f89218bl;
        if (descTextView2 != null) {
            descTextView2.mo1061a();
        }
        LinearLayout linearLayout3 = this.f89205aX;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new C34215i(this));
        }
        DmtTextView dmtTextView5 = this.f89216bj;
        if (dmtTextView5 != null) {
            dmtTextView5.setOnClickListener(new C34207c(this));
        }
        LinearLayout linearLayout4 = this.f89217bk;
        if (linearLayout4 != null) {
            linearLayout4.setOnClickListener(new C34208d(this));
        }
        DescTextView descTextView3 = this.f89218bl;
        if (descTextView3 != null) {
            descTextView3.setOnClickListener(new C34209e(this));
        }
        RemoteImageView remoteImageView = this.f89219bm;
        if (remoteImageView != null) {
            remoteImageView.setOnClickListener(new C34210f(this));
        }
        DmtTextView dmtTextView6 = this.f89211bc;
        if (dmtTextView6 != null) {
            dmtTextView6.setOnClickListener(new C34211g(this));
        }
        DmtTextView dmtTextView7 = this.f89220bn;
        if (dmtTextView7 != null) {
            dmtTextView7.setOnClickListener(new C34214h(this));
        }
        C43081e.m136671a((View) this.f89211bc, 0.75f);
        C43081e.m136670a(this.f89220bn);
        C43081e.m136671a((View) this.f89218bl, 0.75f);
        C43081e.m136671a((View) this.f89219bm, 0.75f);
        C43081e.m136671a((View) this.f89217bk, 0.75f);
        C43081e.m136671a((View) this.f89216bj, 0.75f);
        if (C25352e.m83221d(this.f77546j)) {
            DmtTextView dmtTextView8 = this.f89211bc;
            if (dmtTextView8 != null) {
                dmtTextView8.setText(C25384x.m83526a(mo75261ab(), this.f77546j, true));
            }
            float a = (float) C23486n.m77122a(2.0d);
            Context ab = mo75261ab();
            C7573i.m23582a((Object) ab, "context");
            Drawable bVar = new C24510b(a, ab.getResources().getColor(R.color.w0));
            if (C25352e.m83199A(this.f77546j)) {
                bVar = C43081e.m136669a(bVar.mutate(), C0683b.m2912c(mo75261ab(), R.color.a5q));
                C7573i.m23582a((Object) bVar, "AdAnimationUtils.tintDra…or(context, R.color.s14))");
            }
            DmtTextView dmtTextView9 = this.f89211bc;
            if (dmtTextView9 != null) {
                dmtTextView9.setBackground(bVar);
            }
        }
        if (SymphonyAdManager.m82664a().mo65651b(mo75261ab(), this.f77546j) || SymphonyAdManager.m82664a().mo65654c(mo75261ab(), this.f77546j)) {
            int i = 0;
            if (C25352e.m83221d(this.f77546j)) {
                Aweme aweme = this.f77546j;
                C7573i.m23582a((Object) aweme, "mAweme");
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) awemeRawAd, "mAweme.awemeRawAd!!");
                i = awemeRawAd.getNativeCardType();
            }
            switch (i) {
                case 1:
                    m110460au();
                    return;
                case 2:
                    m110461av();
                    return;
                default:
                    m110460au();
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0053  */
    /* renamed from: au */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m110460au() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f77546j
            java.lang.String r1 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f77546j
            java.lang.String r1 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r1 = "mAweme.author"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarMedium()
            if (r0 != 0) goto L_0x0024
            goto L_0x003e
        L_0x0024:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r6.f89219bm
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            java.lang.String r2 = "mAweme.author"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getAvatarMedium()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r1)
            goto L_0x004a
        L_0x003e:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r6.f89219bm
            r1 = 2131232103(0x7f080567, float:1.8080306E38)
            com.ss.android.ugc.aweme.base.model.AppImageUri r1 = com.p280ss.android.ugc.aweme.base.model.AppImageUri.m76615a(r1)
            com.p280ss.android.ugc.aweme.base.C23323e.m76504a(r0, r1)
        L_0x004a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f77546j
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83221d(r0)
            if (r0 != 0) goto L_0x0053
            return
        L_0x0053:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f77546j
            r1 = 3
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx.m83125a(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x00a2
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.f89216bj
            if (r0 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x007b
            com.ss.android.ugc.aweme.commercialize.model.OmVast r2 = r2.getOmVast()
            if (r2 == 0) goto L_0x007b
            com.bytedance.vast.model.Vast r2 = r2.vast
            if (r2 == 0) goto L_0x007b
            java.lang.String r2 = r2.adTitle
            goto L_0x007c
        L_0x007b:
            r2 = r1
        L_0x007c:
            if (r2 != 0) goto L_0x0081
            java.lang.String r2 = ""
            goto L_0x009c
        L_0x0081:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x009b
            com.ss.android.ugc.aweme.commercialize.model.OmVast r2 = r2.getOmVast()
            if (r2 == 0) goto L_0x009b
            com.bytedance.vast.model.Vast r2 = r2.vast
            if (r2 == 0) goto L_0x009b
            java.lang.String r2 = r2.adTitle
            goto L_0x009c
        L_0x009b:
            r2 = r1
        L_0x009c:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            goto L_0x00d0
        L_0x00a2:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.f89216bj
            if (r0 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            if (r2 != 0) goto L_0x00b8
            java.lang.String r2 = ""
        L_0x00b5:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L_0x00cd
        L_0x00b8:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            java.lang.String r3 = "mAweme.author"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r2 = r2.getNickname()
            goto L_0x00b5
        L_0x00cd:
            r0.setText(r2)
        L_0x00d0:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = r0.getAppInstall()
            goto L_0x00e3
        L_0x00e2:
            r0 = r1
        L_0x00e3:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 1082130432(0x40800000, float:4.0)
            r3 = 8
            if (r0 == 0) goto L_0x011b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f77546j
            java.lang.String r4 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 != 0) goto L_0x00ff
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00ff:
            java.lang.String r4 = "mAweme.awemeRawAd!!"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            float r0 = r0.getAppLike()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x011b
            android.widget.LinearLayout r0 = r6.f89217bk
            if (r0 == 0) goto L_0x0113
            r0.setVisibility(r3)
        L_0x0113:
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r6.f89218bl
            if (r0 == 0) goto L_0x011b
            r4 = 2
            r0.setMaxLines(r4)
        L_0x011b:
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r0 = r6.f89207aZ
            if (r0 == 0) goto L_0x013b
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.f77546j
            java.lang.String r5 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r4.getAwemeRawAd()
            if (r4 != 0) goto L_0x012f
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x012f:
            java.lang.String r5 = "mAweme.awemeRawAd!!"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            float r4 = r4.getAppLike()
            r0.setRatingProgress(r4)
        L_0x013b:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f77546j
            java.lang.String r4 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 != 0) goto L_0x014b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x014b:
            java.lang.String r4 = "mAweme.awemeRawAd!!"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            float r0 = r0.getAppLike()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0166
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r0 = r6.f89207aZ
            if (r0 == 0) goto L_0x015f
            r0.setVisibility(r3)
        L_0x015f:
            android.view.View r0 = r6.f89209ba
            if (r0 == 0) goto L_0x0166
            r0.setVisibility(r3)
        L_0x0166:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = r0.getAppInstall()
            goto L_0x0179
        L_0x0178:
            r0 = r1
        L_0x0179:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0190
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.f89210bb
            if (r0 == 0) goto L_0x0188
            r0.setVisibility(r3)
        L_0x0188:
            android.view.View r0 = r6.f89209ba
            if (r0 == 0) goto L_0x01ac
            r0.setVisibility(r3)
            goto L_0x01ac
        L_0x0190:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.f89210bb
            if (r0 == 0) goto L_0x01ac
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f77546j
            java.lang.String r4 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r2, r4)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x01a6
            java.lang.String r2 = r2.getAppInstall()
            goto L_0x01a7
        L_0x01a6:
            r2 = r1
        L_0x01a7:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
        L_0x01ac:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.String r0 = r0.getDesc()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0212
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r6.f89218bl
            if (r0 == 0) goto L_0x01d3
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f77546j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r2 = r2.getDesc()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
        L_0x01d3:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x01e4
            java.lang.String r1 = r0.getAdMoreTextual()
        L_0x01e4:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x021a
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r6.f89218bl
            if (r0 == 0) goto L_0x0211
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.f77546j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 != 0) goto L_0x0200
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0200:
            java.lang.String r2 = "mAweme.awemeRawAd!!"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.String r1 = r1.getAdMoreTextual()
            java.lang.String r2 = "mAweme.awemeRawAd!!.adMoreTextual"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r0.setMoreString(r1)
        L_0x0211:
            return
        L_0x0212:
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r6.f89218bl
            if (r0 == 0) goto L_0x021a
            r0.setVisibility(r3)
            return
        L_0x021a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.newfollow.p1424vh.CommercialFlowFeedViewHolder.m110460au():void");
    }

    public void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        C42961az.m136382c(this);
        this.f89225d = false;
        this.f89226e = false;
        m110465az();
        m110453aA();
        mo75308a(false, false);
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "aweme");
        m110469e(aweme);
    }

    public void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        C42961az.m136383d(this);
        if (m110454aB()) {
            C34195b.m110394a("");
        }
        m110462aw();
        this.f89203a.mo65910a();
        this.f89208b = false;
    }

    /* renamed from: e */
    private final void m110469e(Aweme aweme) {
        m110462aw();
        this.f89224c = C25352e.m83241x(aweme);
        if (this.f89224c != null) {
            C19535g a = DownloaderManagerHolder.m75524a();
            int hashCode = hashCode();
            C19388d dVar = f89201bf;
            Context ab = mo75261ab();
            Aweme aweme2 = this.f77546j;
            C7573i.m23582a((Object) aweme2, "mAweme");
            a.mo51665a(hashCode, dVar, C22944c.m75516a(ab, aweme2.getAwemeRawAd(), true, "result_ad"));
        }
    }

    @C7709l
    public final void onForwardResultEvent(C29876a aVar) {
        C7573i.m23587b(aVar, "event");
        if (aVar.f78474c == this.f77546j && C25329c.m83221d(aVar.f78474c)) {
            mo75252a(mo75261ab(), 4);
            C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("repost").mo65270a(mo75261ab());
        }
    }

    /* renamed from: h */
    public final void mo75278h(String str) {
        super.mo75278h(str);
        if (C25352e.m83221d(this.f77546j)) {
            C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("click_source").mo65283e(str).mo65270a(mo75261ab());
            C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("click").mo65283e(str).mo65270a(mo75261ab());
            m110463ax();
        }
    }

    /* renamed from: g */
    public final boolean mo75276g(String str) {
        if (!C25352e.m83221d(this.f77546j)) {
            return false;
        }
        C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("click_source").mo65283e(str).mo65270a(mo75261ab());
        if (C25352e.m83215a(this.f77546j)) {
            m110463ax();
            C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("click").mo65283e(str).mo65270a(mo75261ab());
            return true;
        }
        if (C25352e.m83225h(this.f77546j)) {
            C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("click").mo65283e(str).mo65270a(mo75261ab());
        }
        return false;
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        super.mo63044a(dVar);
        if (C25352e.m83221d(this.f77546j)) {
            Aweme aweme = this.f77546j;
            C7573i.m23582a((Object) aweme, "mAweme");
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) awemeRawAd, "mAweme.awemeRawAd!!");
            this.f89215bi = awemeRawAd.getShowOutflowMaskTimes();
            C28418f a = C28418f.m93413a();
            C7573i.m23582a((Object) a, "FeedSharePlayInfoHelper.inst()");
            a.f74936f = 0;
            C28418f a2 = C28418f.m93413a();
            C7573i.m23582a((Object) a2, "FeedSharePlayInfoHelper.inst()");
            this.f89214bh = a2.f74936f;
            C28418f a3 = C28418f.m93413a();
            C7573i.m23582a((Object) a3, "FeedSharePlayInfoHelper.inst()");
            a3.f74934d = false;
            C28418f a4 = C28418f.m93413a();
            C7573i.m23582a((Object) a4, "FeedSharePlayInfoHelper.inst()");
            a4.f74937g = false;
            if (C25352e.m83224g(this.f77546j)) {
                C24976t.m82078a(this.f77546j, "result_ad", "video");
            }
            if (!this.f89208b && mo75232H()) {
                m110464ay();
            }
        }
    }

    /* renamed from: b */
    public void mo63047b(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        super.mo63047b(str);
        if (C25352e.m83221d(this.f77546j)) {
            this.f89203a.mo65916c();
            C24961b e = C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("play_over").mo65283e("video");
            Aweme aweme = this.f77546j;
            C7573i.m23582a((Object) aweme, "mAweme");
            Video video = aweme.getVideo();
            C7573i.m23582a((Object) video, "mAweme.video");
            e.mo65271b((long) video.getVideoLength()).mo65270a(mo75261ab());
            this.f89214bh++;
            C28418f a = C28418f.m93413a();
            C7573i.m23582a((Object) a, "FeedSharePlayInfoHelper.inst()");
            a.f74936f = this.f89214bh;
            if (this.f89214bh >= this.f89215bi) {
                C28418f a2 = C28418f.m93413a();
                C7573i.m23582a((Object) a2, "FeedSharePlayInfoHelper.inst()");
                if (!a2.f74934d) {
                    Aweme aweme2 = this.f77546j;
                    C7573i.m23582a((Object) aweme2, "mAweme");
                    AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        str3 = awemeRawAd.getWebUrl();
                    } else {
                        str3 = null;
                    }
                    if (TextUtils.isEmpty(str3)) {
                        C24961b b = C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("play");
                        if (!C25352e.m83224g(this.f77546j) || !TextUtils.equals(mo75290r(), "general_search")) {
                            str4 = "";
                        } else {
                            str4 = "video";
                        }
                        b.mo65283e(str4).mo65270a(mo75261ab());
                        return;
                    } else if (mo75314al()) {
                        mo75311ai();
                        return;
                    } else {
                        this.f89215bi++;
                        C24961b b2 = C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("play");
                        if (!C25352e.m83224g(this.f77546j) || !TextUtils.equals(mo75290r(), "general_search")) {
                            str5 = "";
                        } else {
                            str5 = "video";
                        }
                        b2.mo65283e(str5).mo65270a(mo75261ab());
                        return;
                    }
                }
            }
            C24961b b3 = C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("play");
            if (!C25352e.m83224g(this.f77546j) || !TextUtils.equals(mo75290r(), "general_search")) {
                str2 = "";
            } else {
                str2 = "video";
            }
            b3.mo65283e(str2).mo65270a(mo75261ab());
        }
    }

    /* renamed from: a */
    public void mo63045a(C44921e eVar) {
        String str;
        super.mo63045a(eVar);
        C24942al.m81836b(mo75261ab(), this.f89221bo);
        if (C25352e.m83221d(this.f77546j)) {
            C24961b b = C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("play");
            if (!C25352e.m83224g(this.f77546j) || !TextUtils.equals(mo75290r(), "general_search")) {
                str = "";
            } else {
                str = "video";
            }
            b.mo65283e(str).mo65270a(mo75261ab());
        }
    }

    /* renamed from: a */
    public void mo63046a(String str) {
        super.mo63046a(str);
        C28418f a = C28418f.m93413a();
        C7573i.m23582a((Object) a, "FeedSharePlayInfoHelper.inst()");
        this.f89214bh = a.f74936f;
        mo75308a(false, true);
        if (!this.f89208b && mo75232H()) {
            m110464ay();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m110466b(AwemeRawAd awemeRawAd, String str) {
        C24962g.m81952a((C24939aj) new C34223p(this, awemeRawAd, str), awemeRawAd.getClickTrackUrlList(), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m110468c(AwemeRawAd awemeRawAd, String str) {
        C7573i.m23587b(awemeRawAd, "rawAd");
        C24962g.m81952a((C24939aj) new C34224q(this, awemeRawAd, str), awemeRawAd.getTrackUrlList(), true);
    }

    /* renamed from: a */
    public final void mo86956a(AwemeRawAd awemeRawAd, String str) {
        if (awemeRawAd != null) {
            Context ab = mo75261ab();
            C7573i.m23582a((Object) ab, "context");
            C25193b bVar = C25193b.f66485a;
            Aweme aweme = this.f77546j;
            C7573i.m23582a((Object) aweme, "mAweme");
            C25196d.m82879a(ab, C25193b.m82872a(aweme, null)).mo65822a();
            C24976t.m82227g(mo75261ab(), String.valueOf(awemeRawAd.getCreativeId().longValue()), str, awemeRawAd.getLogExtra());
            m110466b(awemeRawAd, null);
        }
    }

    /* renamed from: a */
    private final void m110451a(Aweme aweme, boolean z) {
        int i;
        int i2;
        TextView textView = (TextView) this.itemView.findViewById(R.id.di);
        if (textView != null) {
            if (z) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) awemeRawAd, "aweme.awemeRawAd!!");
                AwemeTextLabelModel label = awemeRawAd.getLabel();
                if (label != null) {
                    textView.setVisibility(0);
                    if (TextUtils.isEmpty(label.getTextColor())) {
                        i = -1;
                    } else {
                        i = Color.parseColor(label.getTextColor());
                    }
                    textView.setTextColor(i);
                    if (TextUtils.isEmpty(label.getBgColor())) {
                        i2 = C0683b.m2912c(mo75261ab(), R.color.w0);
                    } else {
                        i2 = Color.parseColor(label.getBgColor());
                    }
                    textView.setBackgroundDrawable(C23487o.m77131a(i2, (float) C23486n.m77122a(2.0d)));
                    textView.setText(label.getLabelName());
                    return;
                }
            }
            textView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo75252a(Context context, int i) {
        super.mo75252a(context, i);
        switch (i) {
            case 0:
                C24942al.m81838d(context, this.f89221bo);
                return;
            case 1:
                C24942al.m81839e(context, this.f89221bo);
                return;
            case 2:
                C24942al.m81840f(context, this.f89221bo);
                return;
            case 3:
                C24942al.m81841g(context, this.f89221bo);
                return;
            case 4:
                C24942al.m81842h(context, this.f89221bo);
                return;
            case 5:
                C24942al.m81837c(context, this.f89221bo);
                return;
            case 6:
                C24942al.m81836b(context, this.f89221bo);
                break;
        }
    }
}
