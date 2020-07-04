package com.p280ss.android.ugc.aweme.commercialize.symphony;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.p073ad.symphony.p074a.p075a.C2087d;
import com.bytedance.p073ad.symphony.p074a.p075a.C2088e;
import com.bytedance.p073ad.symphony.p074a.p075a.C2088e.C2089a;
import com.bytedance.p073ad.symphony.p078c.C2128g;
import com.bytedance.p073ad.symphony.p079d.p080a.C2134b;
import com.bytedance.p073ad.symphony.util.C2201d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AudioControlView;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.AdRatingView;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.C24510b;
import com.p280ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout.C25109a;
import com.p280ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout.C25110b;
import com.p280ss.android.ugc.aweme.common.widget.C25756b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.p280ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.longvideo.feature.VolumeController;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView */
public final class SymphonyVideoView extends FrameLayout implements C25154f, C25756b {

    /* renamed from: a */
    public C2134b f66304a;

    /* renamed from: b */
    public C2087d f66305b;

    /* renamed from: c */
    public boolean f66306c;

    /* renamed from: d */
    public int f66307d;

    /* renamed from: e */
    public int f66308e;

    /* renamed from: f */
    public boolean f66309f;

    /* renamed from: g */
    public boolean f66310g;

    /* renamed from: h */
    public Aweme f66311h;

    /* renamed from: i */
    private VolumeController f66312i;

    /* renamed from: j */
    private String f66313j;

    /* renamed from: k */
    private String f66314k;

    /* renamed from: l */
    private C25110b f66315l;

    /* renamed from: m */
    private HashMap f66316m;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$a */
    final class C25122a implements OnLongClickListener {
        public C25122a() {
        }

        public final boolean onLongClick(View view) {
            SymphonyVideoView.this.mo65680j();
            ((AdDislikeLayout) SymphonyVideoView.this.mo65671a((int) R.id.a9f)).mo65627b();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$b */
    static final class C25123b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66318a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$b$a */
        public static final class C25124a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ SymphonyVideoView f66319a;

            /* renamed from: b */
            final /* synthetic */ C25123b f66320b;

            public C25124a(SymphonyVideoView symphonyVideoView, C25123b bVar) {
                this.f66319a = symphonyVideoView;
                this.f66320b = bVar;
            }

            public final void run() {
                LinearLayout linearLayout = (LinearLayout) this.f66319a.mo65671a((int) R.id.bx2);
                C7573i.m23582a((Object) linearLayout, "maskAdLayout");
                linearLayout.setVisibility(8);
                this.f66320b.f66318a.mo64616b();
            }
        }

        C25123b(SymphonyVideoView symphonyVideoView) {
            this.f66318a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SymphonyVideoView symphonyVideoView = this.f66318a;
            LinearLayout linearLayout = (LinearLayout) symphonyVideoView.mo65671a((int) R.id.bx2);
            C7573i.m23582a((Object) linearLayout, "maskAdLayout");
            if (linearLayout.getVisibility() != 0) {
                this.f66318a.mo64616b();
            } else {
                LinearLayout linearLayout2 = (LinearLayout) symphonyVideoView.mo65671a((int) R.id.bx2);
                C7573i.m23582a((Object) linearLayout2, "maskAdLayout");
                linearLayout2.setAlpha(1.0f);
                ((LinearLayout) symphonyVideoView.mo65671a((int) R.id.bx2)).animate().alpha(0.0f).setDuration(150).withEndAction(new C25124a(symphonyVideoView, this)).start();
                ((FrameLayout) symphonyVideoView.mo65671a((int) R.id.c18)).animate().alpha(1.0f).setDuration(150).start();
                ((FrameLayout) symphonyVideoView.mo65671a((int) R.id.a7f)).animate().alpha(1.0f).setDuration(150).start();
                ((LinearLayout) symphonyVideoView.mo65671a((int) R.id.bxv)).animate().alpha(1.0f).setDuration(150).start();
            }
            C2128g.m9332a("ad_sdk_replay", this.f66318a.f66305b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$c */
    static final class C25125c implements OnClickListener {

        /* renamed from: a */
        public static final C25125c f66321a = new C25125c();

        C25125c() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$d */
    static final class C25126d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66322a;

        C25126d(SymphonyVideoView symphonyVideoView) {
            this.f66322a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f66322a.mo65676f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$e */
    static final class C25127e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66323a;

        C25127e(SymphonyVideoView symphonyVideoView) {
            this.f66323a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f66323a.mo65676f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$f */
    static final class C25128f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66324a;

        C25128f(SymphonyVideoView symphonyVideoView) {
            this.f66324a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f66324a.mo65676f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$g */
    static final class C25129g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66325a;

        C25129g(SymphonyVideoView symphonyVideoView) {
            this.f66325a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Context context = this.f66325a.getContext();
            if (context != null) {
                new SymphonySharePanel((MainActivity) context, this.f66325a.f66305b, this.f66325a.f66311h).show();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$h */
    static final class C25130h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66326a;

        C25130h(SymphonyVideoView symphonyVideoView) {
            this.f66326a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f66326a.mo65676f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$i */
    static final class C25131i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66327a;

        C25131i(SymphonyVideoView symphonyVideoView) {
            this.f66327a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f66327a.f66306c) {
                ImageView imageView = (ImageView) this.f66327a.mo65671a((int) R.id.c_p);
                C7573i.m23582a((Object) imageView, "pauseIcon");
                imageView.setVisibility(0);
                C2128g.m9332a("ad_sdk_pause", this.f66327a.f66305b);
                this.f66327a.mo64617c();
                return;
            }
            ImageView imageView2 = (ImageView) this.f66327a.mo65671a((int) R.id.c_p);
            C7573i.m23582a((Object) imageView2, "pauseIcon");
            imageView2.setVisibility(8);
            C2128g.m9332a("ad_sdk_continue", this.f66327a.f66305b);
            this.f66327a.mo64616b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$j */
    public static final class C25132j implements C25109a {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66328a;

        /* renamed from: b */
        public final void mo65641b() {
            this.f66328a.f66310g = true;
        }

        /* renamed from: a */
        public final void mo65640a() {
            this.f66328a.f66310g = false;
            this.f66328a.mo65675e();
        }

        C25132j(SymphonyVideoView symphonyVideoView) {
            this.f66328a = symphonyVideoView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$k */
    public static final class C25133k implements C2134b {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66329a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$k$a */
        public static final class C25134a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ SymphonyVideoView f66330a;

            public C25134a(SymphonyVideoView symphonyVideoView) {
                this.f66330a = symphonyVideoView;
            }

            public final void run() {
                LinearLayout linearLayout = (LinearLayout) this.f66330a.mo65671a((int) R.id.bx2);
                C7573i.m23582a((Object) linearLayout, "maskAdLayout");
                linearLayout.setVisibility(8);
            }
        }

        public final void as_() {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).readTaskPlayerCycle(4, true);
            this.f66329a.mo65679i();
            C2134b bVar = this.f66329a.f66304a;
            if (bVar != null) {
                bVar.as_();
            }
            this.f66329a.f66306c = false;
        }

        public final void at_() {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).readTaskPlayerCycle(4, true);
            C2134b bVar = this.f66329a.f66304a;
            if (bVar != null) {
                bVar.at_();
            }
            this.f66329a.f66307d++;
            if (this.f66329a.f66307d != this.f66329a.f66308e || ((SymphonyCard) this.f66329a.mo65671a((int) R.id.df6)).f66288b) {
                C2087d dVar = this.f66329a.f66305b;
                if (dVar != null) {
                    C2088e f = dVar.mo7762f();
                    if (f != null) {
                        f.mo7775a();
                        return;
                    }
                }
                return;
            }
            this.f66329a.mo65674d();
            this.f66329a.f66306c = false;
        }

        public final void ar_() {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).readTaskPlayerCycle(3, true);
            SymphonyVideoView symphonyVideoView = this.f66329a;
            LinearLayout linearLayout = (LinearLayout) symphonyVideoView.mo65671a((int) R.id.bx2);
            C7573i.m23582a((Object) linearLayout, "maskAdLayout");
            if (linearLayout.getVisibility() == 0) {
                LinearLayout linearLayout2 = (LinearLayout) symphonyVideoView.mo65671a((int) R.id.bx2);
                C7573i.m23582a((Object) linearLayout2, "maskAdLayout");
                linearLayout2.setAlpha(1.0f);
                ((LinearLayout) symphonyVideoView.mo65671a((int) R.id.bx2)).animate().alpha(0.0f).setDuration(150).withEndAction(new C25134a(symphonyVideoView)).start();
                ((FrameLayout) symphonyVideoView.mo65671a((int) R.id.c18)).animate().alpha(1.0f).setDuration(150).start();
                ((FrameLayout) symphonyVideoView.mo65671a((int) R.id.a7f)).animate().alpha(1.0f).setDuration(150).start();
                ((LinearLayout) symphonyVideoView.mo65671a((int) R.id.bxv)).animate().alpha(1.0f).setDuration(150).start();
            }
            this.f66329a.mo65677g();
            C2134b bVar = this.f66329a.f66304a;
            if (bVar != null) {
                bVar.ar_();
            }
            ImageView imageView = (ImageView) this.f66329a.mo65671a((int) R.id.c_p);
            C7573i.m23582a((Object) imageView, "pauseIcon");
            imageView.setVisibility(8);
            this.f66329a.f66306c = true;
            if (!this.f66329a.f66309f) {
                C42880h.m136156a("play after unselected");
            }
        }

        C25133k(SymphonyVideoView symphonyVideoView) {
            this.f66329a = symphonyVideoView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$l */
    static final class C25135l extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66331a;

        /* renamed from: b */
        final /* synthetic */ long f66332b = 240;

        C25135l(SymphonyVideoView symphonyVideoView, long j) {
            this.f66331a = symphonyVideoView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m82727a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m82727a() {
            ((SymphonyCard) this.f66331a.mo65671a((int) R.id.df6)).mo65660c();
            this.f66331a.postDelayed(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C25135l f66333a;

                {
                    this.f66333a = r1;
                }

                public final void run() {
                    this.f66333a.f66331a.mo65682l();
                }
            }, this.f66332b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$m */
    static final class C25137m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66334a;

        /* renamed from: b */
        final /* synthetic */ long f66335b = 240;

        C25137m(SymphonyVideoView symphonyVideoView, long j) {
            this.f66334a = symphonyVideoView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
            if (r1 == null) goto L_0x0061;
         */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r0 = r4.f66334a
                r1 = 2131301947(0x7f09163b, float:1.8221966E38)
                r0.mo65671a(r1)
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r0 = r4.f66334a
                com.bytedance.ad.symphony.a.a.d r0 = r0.f66305b
                boolean r0 = com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyCard.m82691a(r0)
                if (r0 == 0) goto L_0x0094
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r0 = r4.f66334a
                r1 = 2131299872(0x7f090e20, float:1.8217758E38)
                android.view.View r0 = r0.mo65671a(r1)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                java.lang.String r1 = "maskAdLayout"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                int r0 = r0.getVisibility()
                if (r0 == 0) goto L_0x0094
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
                com.google.gson.e r1 = new com.google.gson.e
                r1.<init>()
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r2 = r4.f66334a
                com.bytedance.ad.symphony.a.a.d r2 = r2.f66305b
                if (r2 == 0) goto L_0x0042
                com.bytedance.ad.symphony.e.b r2 = r2.mo7751b()
                if (r2 == 0) goto L_0x0042
                java.util.concurrent.ConcurrentHashMap r2 = r2.mo7829a()
                goto L_0x0043
            L_0x0042:
                r2 = 0
            L_0x0043:
                java.lang.String r1 = r1.mo15979b(r2)
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65265a(r1)
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r1 = r4.f66334a
                com.bytedance.ad.symphony.a.a.d r1 = r1.f66305b
                if (r1 == 0) goto L_0x0061
                com.bytedance.ad.symphony.e.b r1 = r1.mo7751b()
                if (r1 == 0) goto L_0x0061
                org.json.JSONObject r1 = r1.f7303e
                if (r1 == 0) goto L_0x0061
                java.lang.String r1 = r1.toString()
                if (r1 != 0) goto L_0x0063
            L_0x0061:
                java.lang.String r1 = ""
            L_0x0063:
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65286h(r1)
                r1 = 1
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65268a(r1)
                java.lang.String r1 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65266a(r1)
                java.lang.String r1 = "othershow"
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65276b(r1)
                java.lang.String r1 = "card"
                com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65283e(r1)
                r0.mo65278b()
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r0 = r4.f66334a
                r0.mo65681k()
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r0 = r4.f66334a
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$m$1 r1 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$m$1
                r1.<init>(r4)
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                long r2 = r4.f66335b
                r0.postDelayed(r1, r2)
            L_0x0094:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView.C25137m.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$n */
    static final class C25139n implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66337a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$n$a */
        public static final class C25140a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ SymphonyVideoView f66338a;

            /* renamed from: b */
            final /* synthetic */ C25139n f66339b;

            public C25140a(SymphonyVideoView symphonyVideoView, C25139n nVar) {
                this.f66338a = symphonyVideoView;
                this.f66339b = nVar;
            }

            public final void run() {
                LinearLayout linearLayout = (LinearLayout) this.f66338a.mo65671a((int) R.id.bx2);
                C7573i.m23582a((Object) linearLayout, "maskAdLayout");
                linearLayout.setVisibility(8);
                this.f66339b.f66337a.mo64616b();
            }
        }

        C25139n(SymphonyVideoView symphonyVideoView) {
            this.f66337a = symphonyVideoView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
            if (r0 == null) goto L_0x003c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r6) {
            /*
                r5 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r6)
                com.ss.android.ugc.aweme.commercialize.log.f$b r6 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
                com.google.gson.e r0 = new com.google.gson.e
                r0.<init>()
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r1 = r5.f66337a
                com.bytedance.ad.symphony.a.a.d r1 = r1.f66305b
                if (r1 == 0) goto L_0x001d
                com.bytedance.ad.symphony.e.b r1 = r1.mo7751b()
                if (r1 == 0) goto L_0x001d
                java.util.concurrent.ConcurrentHashMap r1 = r1.mo7829a()
                goto L_0x001e
            L_0x001d:
                r1 = 0
            L_0x001e:
                java.lang.String r0 = r0.mo15979b(r1)
                com.ss.android.ugc.aweme.commercialize.log.f$b r6 = r6.mo65265a(r0)
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r0 = r5.f66337a
                com.bytedance.ad.symphony.a.a.d r0 = r0.f66305b
                if (r0 == 0) goto L_0x003c
                com.bytedance.ad.symphony.e.b r0 = r0.mo7751b()
                if (r0 == 0) goto L_0x003c
                org.json.JSONObject r0 = r0.f7303e
                if (r0 == 0) goto L_0x003c
                java.lang.String r0 = r0.toString()
                if (r0 != 0) goto L_0x003e
            L_0x003c:
                java.lang.String r0 = ""
            L_0x003e:
                com.ss.android.ugc.aweme.commercialize.log.f$b r6 = r6.mo65286h(r0)
                r0 = 1
                com.ss.android.ugc.aweme.commercialize.log.f$b r6 = r6.mo65268a(r0)
                java.lang.String r0 = "background_ad"
                com.ss.android.ugc.aweme.commercialize.log.f$b r6 = r6.mo65266a(r0)
                java.lang.String r0 = "replay"
                com.ss.android.ugc.aweme.commercialize.log.f$b r6 = r6.mo65276b(r0)
                r6.mo65278b()
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r6 = r5.f66337a
                r0 = 2131299872(0x7f090e20, float:1.8217758E38)
                android.view.View r1 = r6.mo65671a(r0)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                java.lang.String r2 = "maskAdLayout"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                int r1 = r1.getVisibility()
                if (r1 == 0) goto L_0x0072
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r6 = r5.f66337a
                r6.mo64616b()
                return
            L_0x0072:
                android.view.View r1 = r6.mo65671a(r0)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                java.lang.String r2 = "maskAdLayout"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                r2 = 1065353216(0x3f800000, float:1.0)
                r1.setAlpha(r2)
                android.view.View r0 = r6.mo65671a(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                android.view.ViewPropertyAnimator r0 = r0.animate()
                r1 = 0
                android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
                r3 = 150(0x96, double:7.4E-322)
                android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$n$a r1 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$n$a
                r1.<init>(r6, r5)
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                android.view.ViewPropertyAnimator r0 = r0.withEndAction(r1)
                r0.start()
                r0 = 2131300026(0x7f090eba, float:1.821807E38)
                android.view.View r0 = r6.mo65671a(r0)
                android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
                android.view.ViewPropertyAnimator r0 = r0.animate()
                android.view.ViewPropertyAnimator r0 = r0.alpha(r2)
                android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
                r0.start()
                r0 = 2131297519(0x7f0904ef, float:1.8212985E38)
                android.view.View r0 = r6.mo65671a(r0)
                android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
                android.view.ViewPropertyAnimator r0 = r0.animate()
                android.view.ViewPropertyAnimator r0 = r0.alpha(r2)
                android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
                r0.start()
                r0 = 2131299902(0x7f090e3e, float:1.8217819E38)
                android.view.View r6 = r6.mo65671a(r0)
                android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
                android.view.ViewPropertyAnimator r6 = r6.animate()
                android.view.ViewPropertyAnimator r6 = r6.alpha(r2)
                android.view.ViewPropertyAnimator r6 = r6.setDuration(r3)
                r6.start()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView.C25139n.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$o */
    static final class C25141o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66340a;

        C25141o(SymphonyVideoView symphonyVideoView) {
            this.f66340a = symphonyVideoView;
        }

        public final void run() {
            LinearLayout linearLayout = (LinearLayout) this.f66340a.mo65671a((int) R.id.bx2);
            C7573i.m23582a((Object) linearLayout, "maskAdLayout");
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = (LinearLayout) this.f66340a.mo65671a((int) R.id.bx2);
            C7573i.m23582a((Object) linearLayout2, "maskAdLayout");
            linearLayout2.setAlpha(0.0f);
            ((LinearLayout) this.f66340a.mo65671a((int) R.id.bx2)).animate().alpha(1.0f).setDuration(150).start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$p */
    static final class C25142p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66341a;

        C25142p(SymphonyVideoView symphonyVideoView) {
            this.f66341a = symphonyVideoView;
        }

        public final void run() {
            this.f66341a.mo65678h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$q */
    static final class C25143q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66342a;

        C25143q(SymphonyVideoView symphonyVideoView) {
            this.f66342a = symphonyVideoView;
        }

        public final void run() {
            LinearLayout linearLayout = (LinearLayout) this.f66342a.mo65671a((int) R.id.a1w);
            C7573i.m23582a((Object) linearLayout, "contentView");
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$r */
    public static final class C25144r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66343a;

        /* renamed from: b */
        final /* synthetic */ SymphonyVideoView f66344b;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$r$a */
        static final class C25145a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C25144r f66345a;

            C25145a(C25144r rVar) {
                this.f66345a = rVar;
            }

            public final void run() {
                C2088e eVar;
                if (this.f66345a.f66344b.f66309f) {
                    C2087d dVar = this.f66345a.f66344b.f66305b;
                    if (dVar != null) {
                        C2088e f = dVar.mo7762f();
                        if (f != null) {
                            f.mo7775a();
                        }
                    }
                    C2087d dVar2 = this.f66345a.f66344b.f66305b;
                    if (dVar2 != null) {
                        eVar = dVar2.mo7762f();
                    } else {
                        eVar = null;
                    }
                    if (!(eVar instanceof C2089a)) {
                        eVar = null;
                    }
                    C2089a aVar = (C2089a) eVar;
                    if (aVar != null && aVar.mo7778c()) {
                        aVar.mo7777a(false);
                    }
                }
            }
        }

        public C25144r(SymphonyVideoView symphonyVideoView, SymphonyVideoView symphonyVideoView2) {
            this.f66343a = symphonyVideoView;
            this.f66344b = symphonyVideoView2;
        }

        public final void run() {
            LinearLayout linearLayout = (LinearLayout) this.f66343a.mo65671a((int) R.id.bx2);
            C7573i.m23582a((Object) linearLayout, "maskAdLayout");
            linearLayout.setVisibility(8);
            this.f66344b.postDelayed(new C25145a(this), 300);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$s */
    static final class C25146s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f66346a;

        C25146s(SymphonyVideoView symphonyVideoView) {
            this.f66346a = symphonyVideoView;
        }

        public final void run() {
            C2088e eVar;
            if (this.f66346a.f66309f) {
                C2087d dVar = this.f66346a.f66305b;
                if (dVar != null) {
                    C2088e f = dVar.mo7762f();
                    if (f != null) {
                        f.mo7775a();
                    }
                }
                C2087d dVar2 = this.f66346a.f66305b;
                if (dVar2 != null) {
                    eVar = dVar2.mo7762f();
                } else {
                    eVar = null;
                }
                if (!(eVar instanceof C2089a)) {
                    eVar = null;
                }
                C2089a aVar = (C2089a) eVar;
                if (aVar != null && aVar.mo7778c()) {
                    aVar.mo7777a(false);
                }
            }
        }
    }

    public SymphonyVideoView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* renamed from: a */
    public final View mo65671a(int i) {
        if (this.f66316m == null) {
            this.f66316m = new HashMap();
        }
        View view = (View) this.f66316m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f66316m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: f */
    public final void mo65676f() {
        C10761a.m31400c(getContext(), (int) R.string.e3, 0).mo25750a();
    }

    /* renamed from: c */
    public final void mo64617c() {
        if (!this.f66309f || this.f66306c) {
            C2087d dVar = this.f66305b;
            if (dVar != null) {
                C2088e f = dVar.mo7762f();
                if (f != null) {
                    f.mo7776b();
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo65677g() {
        ((PeriscopeLayout) mo65671a((int) R.id.c5_)).mo74425a(800, 3000);
        ((MarqueeView) mo65671a((int) R.id.ay)).mo74411a();
        mo65678h();
    }

    /* renamed from: m */
    private final void m82700m() {
        if (!C21085a.m71117a().f56622i) {
            Space space = (Space) mo65671a((int) R.id.ob);
            C7573i.m23582a((Object) space, "bottom_space");
            LayoutParams layoutParams = space.getLayoutParams();
            C21085a a = C21085a.m71117a();
            C7573i.m23582a((Object) a, "AdaptationManager.getInstance()");
            layoutParams.height = a.mo56926b();
            Space space2 = (Space) mo65671a((int) R.id.ob);
            C7573i.m23582a((Object) space2, "bottom_space");
            space2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: o */
    private final void m82702o() {
        if (getContext() instanceof MainActivity) {
            Context context = getContext();
            if (context != null) {
                MainActivity mainActivity = (MainActivity) context;
                this.f66312i = new VolumeController(mainActivity, (AudioControlView) mo65671a((int) R.id.hs));
                VolumeController volumeController = this.f66312i;
                if (volumeController == null) {
                    C7573i.m23580a();
                }
                mainActivity.registerActivityOnKeyDownListener(volumeController);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
        }
    }

    /* renamed from: p */
    private final void m82703p() {
        if ((getContext() instanceof MainActivity) && this.f66312i != null) {
            Context context = getContext();
            if (context != null) {
                MainActivity mainActivity = (MainActivity) context;
                VolumeController volumeController = this.f66312i;
                if (volumeController == null) {
                    C7573i.m23580a();
                }
                mainActivity.unRegisterActivityOnKeyDownListener(volumeController);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
        }
    }

    /* renamed from: r */
    private final void m82705r() {
        ((AdDislikeLayout) mo65671a((int) R.id.a9f)).setOnLongClickListener(new C25122a());
        ((AdDislikeLayout) mo65671a((int) R.id.a9f)).setOnClickListener(new C25131i(this));
        ((AdDislikeLayout) mo65671a((int) R.id.a9f)).setIDislike(new C25132j(this));
        ((AdDislikeLayout) mo65671a((int) R.id.a9f)).setIDislikeClick(this.f66315l);
    }

    /* renamed from: s */
    private final void m82706s() {
        String str;
        CircleImageView circleImageView = (CircleImageView) mo65671a((int) R.id.c9d);
        C2087d dVar = this.f66305b;
        if (dVar != null) {
            str = dVar.mo7767g();
        } else {
            str = null;
        }
        C23323e.m76514a((RemoteImageView) circleImageView, str);
        ((FrameLayout) mo65671a((int) R.id.c17)).setOnClickListener(new C25130h(this));
    }

    /* renamed from: w */
    private final boolean m82710w() {
        if (C2201d.m9509a(this.f66305b) || C2201d.m9510b(this.f66305b) || C2201d.m9511c(this.f66305b)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo65675e() {
        FrameLayout frameLayout = (FrameLayout) mo65671a((int) R.id.c18);
        C7573i.m23582a((Object) frameLayout, "musicRegion");
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = (FrameLayout) mo65671a((int) R.id.a7f);
        C7573i.m23582a((Object) frameLayout2, "descRegion");
        frameLayout2.setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) mo65671a((int) R.id.bxv);
        C7573i.m23582a((Object) linearLayout, "menuRegion");
        linearLayout.setVisibility(0);
    }

    /* renamed from: h */
    public final void mo65678h() {
        if (((FrameLayout) mo65671a((int) R.id.c17)) != null) {
            ((FrameLayout) mo65671a((int) R.id.c17)).animate().rotationBy(360.0f).setDuration(8000).setInterpolator(new LinearInterpolator()).withEndAction(new C25142p(this)).start();
        }
    }

    /* renamed from: i */
    public final void mo65679i() {
        ((PeriscopeLayout) mo65671a((int) R.id.c5_)).mo74428c();
        ((MarqueeView) mo65671a((int) R.id.ay)).mo74412b();
        ((FrameLayout) mo65671a((int) R.id.c17)).animate().cancel();
    }

    /* renamed from: j */
    public final void mo65680j() {
        FrameLayout frameLayout = (FrameLayout) mo65671a((int) R.id.c18);
        C7573i.m23582a((Object) frameLayout, "musicRegion");
        frameLayout.setVisibility(8);
        FrameLayout frameLayout2 = (FrameLayout) mo65671a((int) R.id.a7f);
        C7573i.m23582a((Object) frameLayout2, "descRegion");
        frameLayout2.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo65671a((int) R.id.bxv);
        C7573i.m23582a((Object) linearLayout, "menuRegion");
        linearLayout.setVisibility(8);
    }

    /* renamed from: k */
    public final void mo65681k() {
        ((LinearLayout) mo65671a((int) R.id.a1w)).animate().setInterpolator(new LinearInterpolator()).setDuration(200).alpha(0.0f).withEndAction(new C25143q(this)).start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m82701n() {
        /*
            r7 = this;
            r0 = 2131301947(0x7f09163b, float:1.8221966E38)
            android.view.View r1 = r7.mo65671a(r0)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard r1 = (com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyCard) r1
            r1.mo65659b()
            android.view.View r1 = r7.mo65671a(r0)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard r1 = (com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyCard) r1
            com.bytedance.ad.symphony.a.a.d r2 = r7.f66305b
            java.lang.String r3 = r7.f66314k
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$l r4 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$l
            r5 = 240(0xf0, double:1.186E-321)
            r4.<init>(r7, r5)
            kotlin.jvm.a.a r4 = (kotlin.jvm.p357a.C7561a) r4
            r1.mo65658a(r2, r3, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f66311h
            if (r1 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 == 0) goto L_0x0031
            int r1 = r1.getCardInteractionSeconds()
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r1 <= 0) goto L_0x006c
            boolean r1 = r7.m82710w()
            if (r1 == 0) goto L_0x006c
            android.view.View r0 = r7.mo65671a(r0)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard r0 = (com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyCard) r0
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$m r1 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$m
            r1.<init>(r7, r5)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f66311h
            if (r2 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x005a
            int r2 = r2.getCardInteractionSeconds()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            if (r2 != 0) goto L_0x0060
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0060:
            int r2 = r2.intValue()
            long r2 = (long) r2
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.postDelayed(r1, r2)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView.m82701n():void");
    }

    /* renamed from: a */
    public final void mo65672a() {
        this.f66309f = false;
        if (this.f66310g) {
            ((AdDislikeLayout) mo65671a((int) R.id.a9f)).mo65628c();
        }
        m82703p();
        mo64617c();
        mo65679i();
        ((SymphonyCard) mo65671a((int) R.id.df6)).mo65659b();
        ((SymphonyCard) mo65671a((int) R.id.df6)).mo65660c();
        mo65682l();
        C2087d dVar = this.f66305b;
        if (dVar != null) {
            dVar.mo7758a(true);
        }
    }

    /* renamed from: l */
    public final void mo65682l() {
        LinearLayout linearLayout = (LinearLayout) mo65671a((int) R.id.a1w);
        C7573i.m23582a((Object) linearLayout, "contentView");
        linearLayout.setTranslationY((float) C23486n.m77122a(17.0d));
        LinearLayout linearLayout2 = (LinearLayout) mo65671a((int) R.id.a1w);
        C7573i.m23582a((Object) linearLayout2, "contentView");
        linearLayout2.setVisibility(0);
        ((LinearLayout) mo65671a((int) R.id.a1w)).animate().alpha(1.0f).translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(280).start();
    }

    /* renamed from: t */
    private final void m82707t() {
        String str;
        CircleImageView circleImageView = (CircleImageView) mo65671a((int) R.id.av);
        C2087d dVar = this.f66305b;
        if (dVar != null) {
            str = dVar.mo7767g();
        } else {
            str = null;
        }
        C23323e.m76514a((RemoteImageView) circleImageView, str);
        ((ImageView) mo65671a((int) R.id.sb)).setOnTouchListener(new C25150b());
        ((ImageView) mo65671a((int) R.id.sb)).setOnClickListener(new C25127e(this));
        ((ImageView) mo65671a((int) R.id.sa)).setOnTouchListener(new C25150b());
        ((ImageView) mo65671a((int) R.id.sa)).setOnClickListener(new C25128f(this));
        ((ImageView) mo65671a((int) R.id.sd)).setOnTouchListener(new C25150b());
        ((ImageView) mo65671a((int) R.id.sd)).setOnClickListener(new C25129g(this));
        ImageView imageView = (ImageView) mo65671a((int) R.id.sd);
        Object service = ServiceManager.get().getService(IBridgeService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ridgeService::class.java)");
        imageView.setImageResource(((IBridgeService) service).getShareIconResource());
    }

    /* renamed from: b */
    public final void mo64616b() {
        if (this.f66309f && !this.f66306c) {
            LinearLayout linearLayout = (LinearLayout) mo65671a((int) R.id.bx2);
            C7573i.m23582a((Object) linearLayout, "maskAdLayout");
            if (linearLayout.getVisibility() != 0) {
                postDelayed(new C25146s(this), 300);
                return;
            }
            LinearLayout linearLayout2 = (LinearLayout) mo65671a((int) R.id.bx2);
            C7573i.m23582a((Object) linearLayout2, "maskAdLayout");
            linearLayout2.setAlpha(1.0f);
            ((LinearLayout) mo65671a((int) R.id.bx2)).animate().alpha(0.0f).setDuration(150).withEndAction(new C25144r(this, this)).start();
            ((FrameLayout) mo65671a((int) R.id.c18)).animate().alpha(1.0f).setDuration(150).start();
            ((FrameLayout) mo65671a((int) R.id.a7f)).animate().alpha(1.0f).setDuration(150).start();
            ((LinearLayout) mo65671a((int) R.id.bxv)).animate().alpha(1.0f).setDuration(150).start();
        }
    }

    /* renamed from: q */
    private final void m82704q() {
        Boolean bool;
        if (this.f66305b != null) {
            C2087d dVar = this.f66305b;
            if (dVar != null) {
                bool = Boolean.valueOf(dVar.mo7771k());
            } else {
                bool = null;
            }
            if (C7573i.m23585a((Object) bool, (Object) Boolean.valueOf(true))) {
                C2087d dVar2 = this.f66305b;
                if (dVar2 != null) {
                    dVar2.mo7753a((FrameLayout) mo65671a((int) R.id.b2), 1);
                }
                FrameLayout frameLayout = (FrameLayout) mo65671a((int) R.id.b2);
                C7573i.m23582a((Object) frameLayout, "adVideoTypeView");
                frameLayout.setVisibility(0);
            }
            ((FrameLayout) mo65671a((int) R.id.c9l)).removeAllViews();
            C2087d dVar3 = this.f66305b;
            if (dVar3 != null) {
                dVar3.mo7757a(new ViewGroup[]{(FrameLayout) mo65671a((int) R.id.c9l), ((SymphonyCard) mo65671a((int) R.id.df6)).getAddOtherLayout(), (FrameLayout) mo65671a((int) R.id.bx8)});
            }
            C2087d dVar4 = this.f66305b;
            if (dVar4 != null) {
                ViewGroup viewGroup = this;
                DmtTextView dmtTextView = (DmtTextView) mo65671a((int) R.id.au);
                ArrayList arrayList = new ArrayList();
                arrayList.add((CircleImageView) mo65671a((int) R.id.av));
                arrayList.add((DmtTextView) mo65671a((int) R.id.at));
                arrayList.add((DmtTextView) mo65671a((int) R.id.az));
                arrayList.add((DmtTextView) mo65671a((int) R.id.bx0));
                if (m82710w()) {
                    arrayList.add((TextView) mo65671a((int) R.id.t6));
                    arrayList.add((RemoteImageView) mo65671a((int) R.id.t7));
                    arrayList.add((TextView) mo65671a((int) R.id.t8));
                    arrayList.add((TextView) mo65671a((int) R.id.t5));
                    arrayList.add((RemoteImageView) mo65671a((int) R.id.bx1));
                    arrayList.add((DmtTextView) mo65671a((int) R.id.bx3));
                    arrayList.add((AdRatingView) mo65671a((int) R.id.bx4));
                    arrayList.add((DmtTextView) mo65671a((int) R.id.bwz));
                }
                dVar4.mo7754a(viewGroup, dmtTextView, arrayList);
            }
            C2087d dVar5 = this.f66305b;
            if (dVar5 != null) {
                dVar5.mo7755a((C2134b) new C25133k(this));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0125, code lost:
        if (r0.getNativeCardType() == 5) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0116  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m82708u() {
        /*
            r8 = this;
            r0 = 2131299871(0x7f090e1f, float:1.8217756E38)
            android.view.View r0 = r8.mo65671a(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r1.<init>()
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]
            com.bytedance.ad.symphony.a.a.d r4 = r8.f66305b
            r5 = 0
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = r4.mo7767g()
            goto L_0x001c
        L_0x001b:
            r4 = r5
        L_0x001c:
            r6 = 0
            r3[r6] = r4
            java.util.List r3 = kotlin.collections.C7525m.m23466c(r3)
            r1.setUrlList(r3)
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r1)
            r0 = 2131299873(0x7f090e21, float:1.821776E38)
            android.view.View r0 = r8.mo65671a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r0
            java.lang.String r1 = "maskAdName"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.bytedance.ad.symphony.a.a.d r1 = r8.f66305b
            if (r1 == 0) goto L_0x0040
            java.lang.String r1 = r1.mo7764c()
            goto L_0x0041
        L_0x0040:
            r1 = r5
        L_0x0041:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.bytedance.ad.symphony.a.a.d r0 = r8.f66305b
            r1 = 8
            r3 = 2131299874(0x7f090e22, float:1.8217762E38)
            if (r0 == 0) goto L_0x007d
            float r0 = r0.mo7770j()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4 = r0
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r7 = 1082130432(0x40800000, float:4.0)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x0066
            r4 = 1
            goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            if (r4 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r0 = r5
        L_0x006b:
            if (r0 == 0) goto L_0x007d
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            android.view.View r3 = r8.mo65671a(r3)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r3 = (com.p280ss.android.ugc.aweme.commercialize.p1115ad.AdRatingView) r3
            r3.setRatingProgress(r0)
            goto L_0x008b
        L_0x007d:
            android.view.View r0 = r8.mo65671a(r3)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r0 = (com.p280ss.android.ugc.aweme.commercialize.p1115ad.AdRatingView) r0
            java.lang.String r3 = "maskAdRatingView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r0.setVisibility(r1)
        L_0x008b:
            r0 = 2131299878(0x7f090e26, float:1.821777E38)
            android.view.View r0 = r8.mo65671a(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            java.lang.String r3 = "maskOthers"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            int r0 = r0.getChildCount()
            if (r0 != 0) goto L_0x00b0
            r0 = 2131299877(0x7f090e25, float:1.8217768E38)
            android.view.View r0 = r8.mo65671a(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r3 = "maskGroup"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r0.setVisibility(r1)
        L_0x00b0:
            r0 = 2131299869(0x7f090e1d, float:1.8217752E38)
            android.view.View r0 = r8.mo65671a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r0
            java.lang.String r1 = "maskAdDescView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.bytedance.ad.symphony.a.a.d r1 = r8.f66305b
            if (r1 == 0) goto L_0x00c7
            java.lang.String r1 = r1.mo7765d()
            goto L_0x00c8
        L_0x00c7:
            r1 = r5
        L_0x00c8:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            r0 = 2131299879(0x7f090e27, float:1.8217772E38)
            android.view.View r0 = r8.mo65671a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r0
            java.lang.String r1 = "maskTagLabel"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r1 = r8.f66314k
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            r0 = 2131299870(0x7f090e1e, float:1.8217754E38)
            android.view.View r0 = r8.mo65671a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r0
            java.lang.String r1 = "maskAdDownload"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.bytedance.ad.symphony.a.a.d r1 = r8.f66305b
            if (r1 == 0) goto L_0x00f8
            java.lang.String r5 = r1.mo7769i()
        L_0x00f8:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.setText(r5)
            r0 = 2131299872(0x7f090e20, float:1.8217758E38)
            android.view.View r0 = r8.mo65671a(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$b r1 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$b
            r1.<init>(r8)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            boolean r0 = r8.m82710w()
            if (r0 == 0) goto L_0x0128
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f66311h
            if (r0 == 0) goto L_0x0128
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0128
            int r0 = r0.getNativeCardType()
            r1 = 5
            if (r0 != r1) goto L_0x0128
            goto L_0x0129
        L_0x0128:
            r2 = 0
        L_0x0129:
            r8.m82699a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView.m82708u():void");
    }

    /* renamed from: v */
    private final void m82709v() {
        CharSequence charSequence;
        String str;
        DmtTextView dmtTextView = (DmtTextView) mo65671a((int) R.id.au);
        C7573i.m23582a((Object) dmtTextView, "adDescButton");
        C2087d dVar = this.f66305b;
        String str2 = null;
        if (dVar != null) {
            charSequence = dVar.mo7769i();
        } else {
            charSequence = null;
        }
        dmtTextView.setText(charSequence);
        LinearLayout linearLayout = (LinearLayout) mo65671a((int) R.id.b0);
        C7573i.m23582a((Object) linearLayout, "adTagIcon");
        float a = (float) C23486n.m77122a(2.0d);
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        linearLayout.setBackground(new C24510b(a, context.getResources().getColor(R.color.a78)));
        DmtTextView dmtTextView2 = (DmtTextView) mo65671a((int) R.id.b1);
        C7573i.m23582a((Object) dmtTextView2, "adTagLabel");
        dmtTextView2.setText(this.f66314k);
        ((DmtTextView) mo65671a((int) R.id.b1)).setOnClickListener(C25125c.f66321a);
        DmtTextView dmtTextView3 = (DmtTextView) mo65671a((int) R.id.az);
        C7573i.m23582a((Object) dmtTextView3, "adName");
        StringBuilder sb = new StringBuilder("@");
        C2087d dVar2 = this.f66305b;
        if (dVar2 != null) {
            str = dVar2.mo7764c();
        } else {
            str = null;
        }
        sb.append(str);
        dmtTextView3.setText(sb.toString());
        ((DmtTextView) mo65671a((int) R.id.az)).setFontType(C10834d.f29337g);
        DmtTextView dmtTextView4 = (DmtTextView) mo65671a((int) R.id.at);
        C7573i.m23582a((Object) dmtTextView4, "adDesc");
        C2087d dVar3 = this.f66305b;
        if (dVar3 != null) {
            str2 = dVar3.mo7765d();
        }
        dmtTextView4.setText(str2);
        ((DmtTextView) mo65671a((int) R.id.at)).setFontType(C10834d.f29331a);
        ((MarqueeView) mo65671a((int) R.id.ay)).setText(this.f66313j);
        ((DmtTextView) mo65671a((int) R.id.au)).setFontType(C10834d.f29331a);
        DmtTextView dmtTextView5 = (DmtTextView) mo65671a((int) R.id.au);
        C7573i.m23582a((Object) dmtTextView5, "adDescButton");
        float a2 = (float) C23486n.m77122a(2.0d);
        Context context2 = getContext();
        C7573i.m23582a((Object) context2, "context");
        dmtTextView5.setBackground(new C24510b(a2, context2.getResources().getColor(R.color.w0)));
        ((MarqueeView) mo65671a((int) R.id.ay)).setOnClickListener(new C25126d(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01e7, code lost:
        if (r1 == null) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (r4 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ea, code lost:
        if (r4 == null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0165, code lost:
        if (r4 == null) goto L_0x0167;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65674d() {
        /*
            r8 = this;
            r0 = 2131299872(0x7f090e20, float:1.8217758E38)
            android.view.View r0 = r8.mo65671a(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "maskAdLayout"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x027c
            r0 = 2131301947(0x7f09163b, float:1.8221966E38)
            android.view.View r0 = r8.mo65671a(r0)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard r0 = (com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyCard) r0
            boolean r0 = r0.f66288b
            if (r0 == 0) goto L_0x0023
            goto L_0x027c
        L_0x0023:
            boolean r0 = r8.m82710w()
            if (r0 == 0) goto L_0x0215
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f66311h
            if (r0 == 0) goto L_0x0215
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0215
            int r0 = r0.getNativeCardType()
            r1 = 5
            if (r0 != r1) goto L_0x0215
            com.bytedance.ad.symphony.a.a.d r0 = r8.f66305b
            r1 = 0
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r0.mo7764c()
            goto L_0x0045
        L_0x0044:
            r0 = r1
        L_0x0045:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0054
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r0 = 0
            goto L_0x0055
        L_0x0054:
            r0 = 1
        L_0x0055:
            if (r0 == 0) goto L_0x00b9
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            com.bytedance.ad.symphony.a.a.d r4 = r8.f66305b
            if (r4 == 0) goto L_0x006f
            com.bytedance.ad.symphony.e.b r4 = r4.mo7751b()
            if (r4 == 0) goto L_0x006f
            org.json.JSONObject r4 = r4.f7303e
            if (r4 == 0) goto L_0x006f
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x0071
        L_0x006f:
            java.lang.String r4 = ""
        L_0x0071:
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65286h(r4)
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65268a(r3)
            java.lang.String r4 = "background_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65266a(r4)
            java.lang.String r4 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65276b(r4)
            com.bytedance.ad.symphony.a.a.d r4 = r8.f66305b
            if (r4 == 0) goto L_0x00a9
            com.bytedance.ad.symphony.e.b r4 = r4.mo7751b()
            if (r4 == 0) goto L_0x00a9
            java.util.concurrent.ConcurrentHashMap r4 = r4.mo7829a()
            if (r4 == 0) goto L_0x00a9
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = "error_message"
            java.lang.String r7 = "card_name_missing"
            r5.put(r6, r7)
            com.google.gson.e r5 = new com.google.gson.e
            r5.<init>()
            java.lang.String r4 = r5.mo15979b(r4)
            goto L_0x00aa
        L_0x00a9:
            r4 = r1
        L_0x00aa:
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65265a(r4)
            java.lang.String r4 = "card"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65283e(r4)
            r0.mo65278b()
            r0 = 0
            goto L_0x00ba
        L_0x00b9:
            r0 = 1
        L_0x00ba:
            com.bytedance.ad.symphony.a.a.d r4 = r8.f66305b
            if (r4 == 0) goto L_0x00c3
            java.lang.String r4 = r4.mo7765d()
            goto L_0x00c4
        L_0x00c3:
            r4 = r1
        L_0x00c4:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x00d1
            int r4 = r4.length()
            if (r4 != 0) goto L_0x00cf
            goto L_0x00d1
        L_0x00cf:
            r4 = 0
            goto L_0x00d2
        L_0x00d1:
            r4 = 1
        L_0x00d2:
            if (r4 == 0) goto L_0x0135
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            com.bytedance.ad.symphony.a.a.d r4 = r8.f66305b
            if (r4 == 0) goto L_0x00ec
            com.bytedance.ad.symphony.e.b r4 = r4.mo7751b()
            if (r4 == 0) goto L_0x00ec
            org.json.JSONObject r4 = r4.f7303e
            if (r4 == 0) goto L_0x00ec
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x00ee
        L_0x00ec:
            java.lang.String r4 = ""
        L_0x00ee:
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65286h(r4)
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65268a(r3)
            java.lang.String r4 = "background_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65266a(r4)
            java.lang.String r4 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65276b(r4)
            com.bytedance.ad.symphony.a.a.d r4 = r8.f66305b
            if (r4 == 0) goto L_0x0126
            com.bytedance.ad.symphony.e.b r4 = r4.mo7751b()
            if (r4 == 0) goto L_0x0126
            java.util.concurrent.ConcurrentHashMap r4 = r4.mo7829a()
            if (r4 == 0) goto L_0x0126
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = "error_message"
            java.lang.String r7 = "card_title_missing"
            r5.put(r6, r7)
            com.google.gson.e r5 = new com.google.gson.e
            r5.<init>()
            java.lang.String r4 = r5.mo15979b(r4)
            goto L_0x0127
        L_0x0126:
            r4 = r1
        L_0x0127:
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65265a(r4)
            java.lang.String r4 = "card"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65283e(r4)
            r0.mo65278b()
            r0 = 0
        L_0x0135:
            com.bytedance.ad.symphony.a.a.d r4 = r8.f66305b
            if (r4 == 0) goto L_0x013e
            java.lang.String r4 = r4.mo7769i()
            goto L_0x013f
        L_0x013e:
            r4 = r1
        L_0x013f:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x014c
            int r4 = r4.length()
            if (r4 != 0) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r4 = 0
            goto L_0x014d
        L_0x014c:
            r4 = 1
        L_0x014d:
            if (r4 == 0) goto L_0x01b0
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            com.bytedance.ad.symphony.a.a.d r4 = r8.f66305b
            if (r4 == 0) goto L_0x0167
            com.bytedance.ad.symphony.e.b r4 = r4.mo7751b()
            if (r4 == 0) goto L_0x0167
            org.json.JSONObject r4 = r4.f7303e
            if (r4 == 0) goto L_0x0167
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x0169
        L_0x0167:
            java.lang.String r4 = ""
        L_0x0169:
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65286h(r4)
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65268a(r3)
            java.lang.String r4 = "background_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65266a(r4)
            java.lang.String r4 = "show_fail"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65276b(r4)
            com.bytedance.ad.symphony.a.a.d r4 = r8.f66305b
            if (r4 == 0) goto L_0x01a1
            com.bytedance.ad.symphony.e.b r4 = r4.mo7751b()
            if (r4 == 0) goto L_0x01a1
            java.util.concurrent.ConcurrentHashMap r4 = r4.mo7829a()
            if (r4 == 0) goto L_0x01a1
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = "error_message"
            java.lang.String r7 = "card_download_button_missing"
            r5.put(r6, r7)
            com.google.gson.e r5 = new com.google.gson.e
            r5.<init>()
            java.lang.String r4 = r5.mo15979b(r4)
            goto L_0x01a2
        L_0x01a1:
            r4 = r1
        L_0x01a2:
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65265a(r4)
            java.lang.String r4 = "card"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65283e(r4)
            r0.mo65278b()
            r0 = 0
        L_0x01b0:
            if (r0 != 0) goto L_0x01b6
            r8.m82699a(r2)
            goto L_0x0215
        L_0x01b6:
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            com.google.gson.e r2 = new com.google.gson.e
            r2.<init>()
            com.bytedance.ad.symphony.a.a.d r4 = r8.f66305b
            if (r4 == 0) goto L_0x01cd
            com.bytedance.ad.symphony.e.b r4 = r4.mo7751b()
            if (r4 == 0) goto L_0x01cd
            java.util.concurrent.ConcurrentHashMap r1 = r4.mo7829a()
        L_0x01cd:
            java.lang.String r1 = r2.mo15979b(r1)
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65265a(r1)
            com.bytedance.ad.symphony.a.a.d r1 = r8.f66305b
            if (r1 == 0) goto L_0x01e9
            com.bytedance.ad.symphony.e.b r1 = r1.mo7751b()
            if (r1 == 0) goto L_0x01e9
            org.json.JSONObject r1 = r1.f7303e
            if (r1 == 0) goto L_0x01e9
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x01eb
        L_0x01e9:
            java.lang.String r1 = ""
        L_0x01eb:
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65286h(r1)
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65268a(r3)
            java.lang.String r1 = "background_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65266a(r1)
            java.lang.String r1 = "button_show"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65276b(r1)
            r0.mo65278b()
            r0 = 2131299875(0x7f090e23, float:1.8217764E38)
            android.view.View r0 = r8.mo65671a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r0
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$n r1 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$n
            r1.<init>(r8)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x0215:
            boolean r0 = r8.f66310g
            if (r0 == 0) goto L_0x0225
            r0 = 2131297593(0x7f090539, float:1.8213135E38)
            android.view.View r0 = r8.mo65671a(r0)
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout r0 = (com.p280ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout) r0
            r0.mo65628c()
        L_0x0225:
            r0 = 2131297519(0x7f0904ef, float:1.8212985E38)
            android.view.View r0 = r8.mo65671a(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r2 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r2)
            r0.start()
            r0 = 2131299902(0x7f090e3e, float:1.8217819E38)
            android.view.View r0 = r8.mo65671a(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r2)
            r0.start()
            r0 = 2131300026(0x7f090eba, float:1.821807E38)
            android.view.View r0 = r8.mo65671a(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r2)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$o r1 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$o
            r1.<init>(r8)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            android.view.ViewPropertyAnimator r0 = r0.withEndAction(r1)
            r0.start()
            return
        L_0x027c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView.mo65674d():void");
    }

    /* renamed from: a */
    private final void m82699a(boolean z) {
        if (!z) {
            RemoteImageView remoteImageView = (RemoteImageView) mo65671a((int) R.id.bx1);
            C7573i.m23582a((Object) remoteImageView, "maskAdIcon");
            remoteImageView.setVisibility(8);
            DmtTextView dmtTextView = (DmtTextView) mo65671a((int) R.id.bx3);
            C7573i.m23582a((Object) dmtTextView, "maskAdName");
            dmtTextView.setVisibility(8);
            AdRatingView adRatingView = (AdRatingView) mo65671a((int) R.id.bx4);
            C7573i.m23582a((Object) adRatingView, "maskAdRatingView");
            adRatingView.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) mo65671a((int) R.id.bx7);
            C7573i.m23582a((Object) linearLayout, "maskGroup");
            linearLayout.setVisibility(8);
            DmtTextView dmtTextView2 = (DmtTextView) mo65671a((int) R.id.bwz);
            C7573i.m23582a((Object) dmtTextView2, "maskAdDescView");
            dmtTextView2.setVisibility(8);
            Space space = (Space) mo65671a((int) R.id.bx6);
            C7573i.m23582a((Object) space, "maskDivide");
            space.setVisibility(8);
            return;
        }
        RemoteImageView remoteImageView2 = (RemoteImageView) mo65671a((int) R.id.bx1);
        C7573i.m23582a((Object) remoteImageView2, "maskAdIcon");
        remoteImageView2.setVisibility(0);
        DmtTextView dmtTextView3 = (DmtTextView) mo65671a((int) R.id.bx3);
        C7573i.m23582a((Object) dmtTextView3, "maskAdName");
        dmtTextView3.setVisibility(0);
        if (((AdRatingView) mo65671a((int) R.id.bx4)).getRatingProgress() > 0.0f) {
            AdRatingView adRatingView2 = (AdRatingView) mo65671a((int) R.id.bx4);
            C7573i.m23582a((Object) adRatingView2, "maskAdRatingView");
            adRatingView2.setVisibility(0);
        }
        LinearLayout linearLayout2 = (LinearLayout) mo65671a((int) R.id.bx7);
        C7573i.m23582a((Object) linearLayout2, "maskGroup");
        linearLayout2.setVisibility(0);
        DmtTextView dmtTextView4 = (DmtTextView) mo65671a((int) R.id.bwz);
        C7573i.m23582a((Object) dmtTextView4, "maskAdDescView");
        dmtTextView4.setVisibility(0);
        Space space2 = (Space) mo65671a((int) R.id.bx6);
        C7573i.m23582a((Object) space2, "maskDivide");
        space2.setVisibility(0);
    }

    public SymphonyVideoView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f66314k = "Ad";
        this.f66308e = 2;
        LayoutInflater.from(context).inflate(R.layout.ak9, this, true);
        setLayoutParams(new LayoutParams(-1, -1));
        m82700m();
    }

    private /* synthetic */ SymphonyVideoView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }

    /* renamed from: a */
    public final void mo65673a(C2087d dVar, Aweme aweme, String str, String str2, C2134b bVar, C25110b bVar2, int i) {
        C7573i.m23587b(str, "soundDesc");
        C7573i.m23587b(str2, "adLabel");
        this.f66305b = dVar;
        this.f66313j = str;
        this.f66314k = str2;
        this.f66304a = bVar;
        this.f66315l = bVar2;
        this.f66308e = i;
        this.f66311h = aweme;
        this.f66307d = 0;
        m82704q();
        m82701n();
        m82707t();
        m82706s();
        m82709v();
        m82705r();
        m82708u();
        m82702o();
        this.f66309f = true;
        this.f66307d = 0;
        mo64616b();
    }
}
