package com.p280ss.android.ugc.aweme.commercialize.widget;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25381v;
import com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView;
import com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView.C25599a;
import com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView.C25601c;
import com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView.C25602d;
import com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.C25625a;
import com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.C25627b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget */
public final class AdPopUpWebPageWidget extends AbsAdFeedWidget {

    /* renamed from: l */
    public static boolean f67519l;

    /* renamed from: m */
    public static final C25634a f67520m = new C25634a(null);

    /* renamed from: j */
    public AdPopUpWebPageView f67521j;

    /* renamed from: k */
    public String f67522k;

    /* renamed from: n */
    private long f67523n;

    /* renamed from: o */
    private final C25635b f67524o = new C25635b(this);

    /* renamed from: p */
    private final C25637d f67525p = new C25637d(this);

    /* renamed from: q */
    private final C25636c f67526q = new C25636c(this);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$a */
    public static final class C25634a {
        private C25634a() {
        }

        /* renamed from: c */
        private static boolean m84256c() {
            return AdPopUpWebPageWidget.f67519l;
        }

        /* renamed from: a */
        public final void mo66465a() {
            if (m84258d()) {
                if (!C43316v.m137250H()) {
                    C43316v.m137450K().mo104948x();
                } else {
                    C44933a.m141791a().mo71672ad();
                }
                m84251a(true);
            }
        }

        /* renamed from: d */
        private static boolean m84258d() {
            if (!C43316v.m137250H()) {
                C43222g K = C43316v.m137450K();
                C7573i.m23582a((Object) K, "PlayerManager.inst()");
                return K.mo104916o();
            }
            C44933a a = C44933a.m141791a();
            C7573i.m23582a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
            return a.mo107442b();
        }

        /* renamed from: b */
        public final void mo66469b() {
            if (m84256c()) {
                if (!C43316v.m137250H()) {
                    C43316v.m137450K().mo104946v();
                } else {
                    C44933a.m141791a().mo71671ac();
                }
                m84251a(false);
            }
        }

        /* renamed from: a */
        private static void m84251a(boolean z) {
            AdPopUpWebPageWidget.f67519l = z;
        }

        public /* synthetic */ C25634a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m84253a(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null && awemeRawAd.getProfileWithWebview() == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        private final AdPopUpWebPageView m84257d(Activity activity) {
            AdPopUpWebPageView adPopUpWebPageView;
            FrameLayout c = m84255c(activity);
            if (c != null) {
                adPopUpWebPageView = (AdPopUpWebPageView) c.findViewById(R.id.d0);
            } else {
                adPopUpWebPageView = null;
            }
            if (!(adPopUpWebPageView instanceof AdPopUpWebPageView)) {
                return null;
            }
            return adPopUpWebPageView;
        }

        /* renamed from: b */
        public final boolean mo66470b(Activity activity) {
            C7573i.m23587b(activity, "activity");
            AdPopUpWebPageView d = m84257d(activity);
            if (d == null || !d.mo66398b()) {
                return false;
            }
            return true;
        }

        public final boolean dismiss(Activity activity) {
            C7573i.m23587b(activity, "activity");
            C25634a aVar = this;
            AdPopUpWebPageView d = aVar.m84257d(activity);
            if (d == null || !d.mo66398b()) {
                return false;
            }
            aVar.mo66469b();
            d.dismiss();
            return true;
        }

        /* renamed from: a */
        public static boolean m84252a(Aweme aweme) {
            int i;
            boolean z;
            int i2;
            boolean z2;
            if (aweme == null || aweme.getAwemeRawAd() == null) {
                return false;
            }
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                i = awemeRawAd.getWebviewType();
            } else {
                i = 0;
            }
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                i2 = awemeRawAd2.getProfileWithWebview();
            } else {
                i2 = 0;
            }
            if (i2 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private static FrameLayout m84255c(Activity activity) {
            View view;
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.bw);
            if (viewStub == null) {
                view = activity.findViewById(R.id.bv);
            } else {
                view = viewStub.inflate();
                if (view == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
                }
            }
            return (FrameLayout) view;
        }

        /* renamed from: a */
        public final void mo66466a(Activity activity) {
            C7573i.m23587b(activity, "activity");
            AdPopUpWebPageView d = m84257d(activity);
            if (d != null) {
                d.mo66396a();
                FrameLayout c = m84255c(activity);
                if (c != null) {
                    c.removeView(d);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo66467a(C25627b bVar) {
            if (bVar == null) {
                return false;
            }
            Context context = bVar.f67496a;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null) {
                return false;
            }
            C25634a aVar = this;
            AdPopUpWebPageView d = aVar.m84257d(activity);
            if (d == null || d.mo66398b()) {
                return false;
            }
            d.getActionMode().f67492f = bVar.f67499d;
            aVar.mo66465a();
            d.mo66397a(bVar);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
            if (r5.equals("0") != false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            if (r4 == false) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
            if (r5 == null) goto L_0x000a;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m84254b(com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd r4, java.lang.String r5) {
            /*
                if (r5 != 0) goto L_0x0011
                if (r4 == 0) goto L_0x000a
                java.lang.String r5 = r4.getWebUrl()
                if (r5 != 0) goto L_0x000c
            L_0x000a:
                java.lang.String r5 = ""
            L_0x000c:
                android.net.Uri r5 = android.net.Uri.parse(r5)
                goto L_0x0015
            L_0x0011:
                android.net.Uri r5 = android.net.Uri.parse(r5)
            L_0x0015:
                r0 = 0
                java.lang.String r1 = "immersive_mode"
                java.lang.String r1 = r5.getQueryParameter(r1)     // Catch:{ UnsupportedOperationException -> 0x0055 }
                r2 = 1
                if (r4 == 0) goto L_0x0024
                boolean r4 = r4.isUseOrdinaryWeb()     // Catch:{ UnsupportedOperationException -> 0x0055 }
                goto L_0x0025
            L_0x0024:
                r4 = 1
            L_0x0025:
                java.lang.String r3 = "topbar_type"
                java.lang.String r5 = r5.getQueryParameter(r3)     // Catch:{ UnsupportedOperationException -> 0x0055 }
                if (r5 != 0) goto L_0x002e
                goto L_0x0047
            L_0x002e:
                int r3 = r5.hashCode()     // Catch:{ UnsupportedOperationException -> 0x0055 }
                switch(r3) {
                    case 48: goto L_0x003f;
                    case 49: goto L_0x0036;
                    default: goto L_0x0035;
                }     // Catch:{ UnsupportedOperationException -> 0x0055 }
            L_0x0035:
                goto L_0x0054
            L_0x0036:
                java.lang.String r4 = "1"
                boolean r4 = r5.equals(r4)     // Catch:{ UnsupportedOperationException -> 0x0055 }
                if (r4 == 0) goto L_0x0054
                goto L_0x0053
            L_0x003f:
                java.lang.String r3 = "0"
                boolean r5 = r5.equals(r3)     // Catch:{ UnsupportedOperationException -> 0x0055 }
                if (r5 == 0) goto L_0x0054
            L_0x0047:
                if (r1 == 0) goto L_0x0051
                java.lang.String r4 = "1"
                boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r1, r4)     // Catch:{ UnsupportedOperationException -> 0x0055 }
                r0 = r4
                goto L_0x0054
            L_0x0051:
                if (r4 != 0) goto L_0x0054
            L_0x0053:
                r0 = 1
            L_0x0054:
                return r0
            L_0x0055:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.C25634a.m84254b(com.ss.android.ugc.aweme.feed.model.AwemeRawAd, java.lang.String):boolean");
        }

        /* renamed from: a */
        public final boolean mo66468a(AwemeRawAd awemeRawAd, String str) {
            int i;
            if (awemeRawAd != null) {
                i = awemeRawAd.getWebviewType();
            } else {
                i = 0;
            }
            if (i == 1 && !m84254b(awemeRawAd, str)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final AdPopUpWebPageView mo66464a(Activity activity, C25381v vVar, C25599a aVar, C25601c cVar) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(vVar, "params");
            AdPopUpWebPageView d = m84257d(activity);
            if (d == null) {
                d = new AdPopUpWebPageView(activity, null, 0, 6, null);
                d.setId(R.id.d0);
                d.setParams(vVar);
                d.setMBehaviorCallback(aVar);
                d.setKeyDownCallBack(cVar);
                FrameLayout c = m84255c(activity);
                if (c != null) {
                    c.addView(d);
                }
            }
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b */
    public static final class C25635b implements C25599a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageWidget f67527a;

        /* renamed from: a */
        public final void mo66418a() {
            this.f67527a.mo66462d();
        }

        /* renamed from: b */
        public final void mo66419b() {
            AdPopUpWebPageWidget.f67520m.mo66469b();
            this.f67527a.mo66463e();
            this.f67527a.f67522k = null;
        }

        C25635b(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f67527a = adPopUpWebPageWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$c */
    public static final class C25636c implements C25601c {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageWidget f67528a;

        /* renamed from: a */
        public final void mo66420a() {
            this.f67528a.f67522k = "back";
        }

        C25636c(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f67528a = adPopUpWebPageWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$d */
    public static final class C25637d implements C25602d {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageWidget f67529a;

        /* renamed from: a */
        public final void mo66421a() {
            this.f67529a.f67522k = "button";
            AdPopUpWebPageWidget.f67520m.mo66469b();
        }

        /* renamed from: b */
        public final void mo66422b() {
            AwemeRawAd awemeRawAd;
            AdPopUpWebPageView adPopUpWebPageView = this.f67529a.f67521j;
            if (adPopUpWebPageView != null) {
                C25625a actionMode = adPopUpWebPageView.getActionMode();
                Aweme aweme = this.f67529a.f67508a;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode.mo66447b(awemeRawAd)) {
                    C24958f.m81905a().mo65266a("homepage_landing_ad").mo65276b("report").mo65273b(this.f67529a.f67508a).mo65278b();
                }
            }
        }

        C25637d(AdPopUpWebPageWidget adPopUpWebPageWidget) {
            this.f67529a = adPopUpWebPageWidget;
        }
    }

    /* renamed from: a */
    public static final boolean m84241a(C25627b bVar) {
        return f67520m.mo66467a(bVar);
    }

    /* renamed from: a */
    public static final boolean m84242a(AwemeRawAd awemeRawAd) {
        return C25634a.m84253a(awemeRawAd);
    }

    /* renamed from: a */
    public static final boolean m84243a(AwemeRawAd awemeRawAd, String str) {
        return f67520m.mo66468a(awemeRawAd, str);
    }

    public static final boolean dismiss(Activity activity) {
        return f67520m.dismiss(activity);
    }

    /* renamed from: h */
    private final void m84246h() {
        this.f67523n = System.currentTimeMillis();
    }

    public final void onResume() {
        m84246h();
        super.onResume();
    }

    public final void onPause() {
        m84240a(System.currentTimeMillis() - this.f67523n);
        super.onPause();
    }

    /* renamed from: g */
    private void m84245g() {
        Activity activity;
        if (this.f67521j != null) {
            Fragment fragment = this.f67509i;
            if (fragment != null) {
                activity = fragment.getActivity();
            } else {
                activity = null;
            }
            if (activity != null) {
                f67520m.mo66466a(activity);
                this.f67521j = null;
            }
        }
    }

    /* renamed from: d */
    public final void mo66462d() {
        AwemeRawAd awemeRawAd;
        DataCenter dataCenter = this.f60922e;
        AwemeRawAd awemeRawAd2 = null;
        if (dataCenter != null) {
            dataCenter.mo60134a("on_ad_pop_up_web_page_show", (Object) null);
        }
        m84246h();
        AdPopUpWebPageView adPopUpWebPageView = this.f67521j;
        if (adPopUpWebPageView != null) {
            C25625a actionMode = adPopUpWebPageView.getActionMode();
            Aweme aweme = this.f67508a;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            if (actionMode.mo66446a(awemeRawAd)) {
                C24958f.m81905a().mo65266a("landing_ad").mo65276b("detail_show").mo65273b(this.f67508a).mo65278b();
            }
            C25625a actionMode2 = adPopUpWebPageView.getActionMode();
            Aweme aweme2 = this.f67508a;
            if (aweme2 != null) {
                awemeRawAd2 = aweme2.getAwemeRawAd();
            }
            if (actionMode2.mo66447b(awemeRawAd2)) {
                C24958f.m81905a().mo65266a("homepage_landing_ad").mo65276b("detail_show").mo65273b(this.f67508a).mo65278b();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r2 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006d, code lost:
        if (r5 == null) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c1 A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m84244f() {
        /*
            r6 = this;
            android.support.v4.app.Fragment r0 = r6.f67509i
            r1 = 0
            if (r0 == 0) goto L_0x000a
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            android.support.v4.app.Fragment r2 = r6.f67509i
            if (r2 == 0) goto L_0x0017
            android.content.Context r2 = r2.getContext()
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            if (r2 != 0) goto L_0x001b
            return
        L_0x001b:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f67508a
            if (r2 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x002a
            java.lang.String r2 = r2.getSource()
            goto L_0x002b
        L_0x002a:
            r2 = r1
        L_0x002b:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0044
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f67508a
            if (r2 == 0) goto L_0x0042
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x0042
            java.lang.String r2 = r2.getSource()
            goto L_0x0056
        L_0x0042:
            r2 = r1
            goto L_0x0056
        L_0x0044:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f67508a
            if (r2 == 0) goto L_0x0054
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x0054
            java.lang.String r2 = r2.getWebTitle()
            if (r2 != 0) goto L_0x0056
        L_0x0054:
            java.lang.String r2 = ""
        L_0x0056:
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$a r3 = f67520m
            android.app.Activity r0 = (android.app.Activity) r0
            com.ss.android.ugc.aweme.commercialize.utils.v$a r4 = new com.ss.android.ugc.aweme.commercialize.utils.v$a
            r4.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r6.f67508a
            if (r5 == 0) goto L_0x006f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r5.getAwemeRawAd()
            if (r5 == 0) goto L_0x006f
            java.lang.String r5 = r5.getWebUrl()
            if (r5 != 0) goto L_0x0071
        L_0x006f:
            java.lang.String r5 = "about:blank"
        L_0x0071:
            com.ss.android.ugc.aweme.commercialize.utils.v$a r4 = r4.mo65943a(r5)
            android.support.v4.app.Fragment r5 = r6.f67509i
            android.arch.lifecycle.i r5 = (android.arch.lifecycle.C0043i) r5
            com.ss.android.ugc.aweme.commercialize.utils.v$a r4 = r4.mo65940a(r5)
            int r5 = com.p280ss.android.ugc.aweme.utils.C43098ej.m136713b()
            com.ss.android.ugc.aweme.commercialize.utils.v$a r4 = r4.mo65939a(r5)
            if (r2 != 0) goto L_0x0089
            java.lang.String r2 = ""
        L_0x0089:
            com.ss.android.ugc.aweme.commercialize.utils.v$a r2 = r4.mo65945b(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.f67508a
            android.os.Bundle r4 = r6.m84239a(r4)
            com.ss.android.ugc.aweme.commercialize.utils.v$a r2 = r2.mo65941a(r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.f67508a
            if (r4 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r4.getAwemeRawAd()
        L_0x009f:
            com.ss.android.ugc.aweme.commercialize.utils.v$a r1 = r2.mo65942a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.v r1 = r1.mo65944a()
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$b r2 = r6.f67524o
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$a r2 = (com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView.C25599a) r2
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$c r4 = r6.f67526q
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$c r4 = (com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView.C25601c) r4
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r0 = r3.mo66464a(r0, r1, r2, r4)
            r6.f67521j = r0
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView r0 = r6.f67521j
            if (r0 == 0) goto L_0x00c1
            com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget$d r1 = r6.f67525p
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$d r1 = (com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView.C25602d) r1
            r0.setTitleBarCallback(r1)
            return
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.m84244f():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66455a() {
        super.mo66455a();
        DataCenter dataCenter = this.f60922e;
        if (dataCenter != null) {
            C0053p pVar = this;
            dataCenter.mo60132a("ad_feed_on_page_selected", pVar);
            dataCenter.mo60132a("ad_feed_on_page_unselected", pVar);
            dataCenter.mo60132a("ad_video_on_resume_play", pVar);
        }
    }

    /* renamed from: e */
    public final void mo66463e() {
        AwemeRawAd awemeRawAd;
        DataCenter dataCenter = this.f60922e;
        AwemeRawAd awemeRawAd2 = null;
        if (dataCenter != null) {
            dataCenter.mo60134a("on_ad_pop_up_web_page_hide", (Object) null);
        }
        AdPopUpWebPageView adPopUpWebPageView = this.f67521j;
        if (adPopUpWebPageView != null) {
            C25625a actionMode = adPopUpWebPageView.getActionMode();
            Aweme aweme = this.f67508a;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            if (actionMode.mo66446a(awemeRawAd)) {
                C24961b b = C24958f.m81905a().mo65266a("landing_ad").mo65276b("landing_page");
                String str = this.f67522k;
                if (str == null) {
                    str = "slide";
                }
                b.mo65283e(str).mo65273b(this.f67508a).mo65278b();
            }
            C25625a actionMode2 = adPopUpWebPageView.getActionMode();
            Aweme aweme2 = this.f67508a;
            if (aweme2 != null) {
                awemeRawAd2 = aweme2.getAwemeRawAd();
            }
            if (actionMode2.mo66447b(awemeRawAd2)) {
                C24961b b2 = C24958f.m81905a().mo65266a("homepage_landing_ad").mo65276b("landing_page");
                String str2 = this.f67522k;
                if (str2 == null) {
                    str2 = "slide";
                }
                b2.mo65283e(str2).mo65273b(this.f67508a).mo65278b();
            }
        }
        m84240a(System.currentTimeMillis() - this.f67523n);
    }

    /* renamed from: a */
    private final void m84240a(long j) {
        if (this.f67521j != null) {
            C22984d a = C22984d.m75611a();
            a.mo59971a("duration", j);
            C6907h.m21524a("h5_stay_time", (Map) a.f60753a);
        }
    }

    /* renamed from: a */
    private final Bundle m84239a(Aweme aweme) {
        Bundle bundle = new Bundle();
        Fragment fragment = this.f67509i;
        if (fragment != null) {
            Context context = fragment.getContext();
            if (context != null) {
                C7573i.m23582a((Object) context, "mFragment?.context?: return bundle");
                if (aweme == null || aweme.getAwemeRawAd() == null) {
                    return bundle;
                }
                C25352e.m83316a(bundle, aweme, context);
                C25352e.m83349b(bundle, aweme, context);
                C25352e.m83356c(bundle, aweme, context);
                C25352e.m83362d(bundle, aweme, context);
                return bundle;
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public final void onChanged(C23083a aVar) {
        String str;
        super.onChanged(aVar);
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode != -1132409520) {
                    if (hashCode == 2040441990 && str.equals("ad_video_on_resume_play") && this.f67521j != null) {
                        Fragment fragment = this.f67509i;
                        if (fragment != null) {
                            FragmentActivity activity = fragment.getActivity();
                            if (activity != null) {
                                C25634a aVar2 = f67520m;
                                C7573i.m23582a((Object) activity, "it");
                                if (aVar2.mo66470b(activity)) {
                                    f67520m.mo66465a();
                                }
                            }
                        }
                    }
                } else if (str.equals("ad_feed_on_page_selected") && C25634a.m84252a(this.f67508a)) {
                    m84244f();
                }
            } else if (str.equals("ad_feed_on_page_unselected")) {
                m84245g();
            }
        }
    }
}
