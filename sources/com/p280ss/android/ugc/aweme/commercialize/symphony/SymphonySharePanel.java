package com.p280ss.android.ugc.aweme.commercialize.symphony;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p073ad.symphony.p074a.p075a.C2087d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel */
public final class SymphonySharePanel extends BottomSheetDialog {

    /* renamed from: b */
    public final Activity f66296b;

    /* renamed from: c */
    private final C2087d f66297c;

    /* renamed from: d */
    private final Aweme f66298d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel$a */
    static final class C25120a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonySharePanel f66299a;

        C25120a(SymphonySharePanel symphonySharePanel) {
            this.f66299a = symphonySharePanel;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f66299a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel$b */
    static final class C25121b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonySharePanel f66300a;

        /* renamed from: b */
        final /* synthetic */ Aweme f66301b;

        /* renamed from: c */
        final /* synthetic */ C2087d f66302c;

        /* renamed from: d */
        final /* synthetic */ HashMap f66303d;

        C25121b(SymphonySharePanel symphonySharePanel, Aweme aweme, C2087d dVar, HashMap hashMap) {
            this.f66300a = symphonySharePanel;
            this.f66301b = aweme;
            this.f66302c = dVar;
            this.f66303d = hashMap;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x008f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r7) {
            /*
                r6 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r7)
                com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f66301b
                if (r7 == 0) goto L_0x00b9
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel r7 = r6.f66300a
                android.app.Activity r7 = r7.f66296b
                android.net.Uri$Builder r0 = new android.net.Uri$Builder
                r0.<init>()
                java.lang.String r1 = "is_symphony"
                java.lang.String r2 = "1"
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
                java.lang.String r1 = "ad_provider_id"
                com.bytedance.ad.symphony.a.a.d r2 = r6.f66302c
                r3 = 0
                if (r2 == 0) goto L_0x002c
                com.bytedance.ad.symphony.e.b r2 = r2.mo7751b()
                if (r2 == 0) goto L_0x002c
                int r2 = r2.f7301c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x002d
            L_0x002c:
                r2 = r3
            L_0x002d:
                java.lang.String r2 = java.lang.String.valueOf(r2)
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
                java.lang.String r1 = "ad_placement_id"
                com.bytedance.ad.symphony.a.a.d r2 = r6.f66302c
                if (r2 == 0) goto L_0x0044
                com.bytedance.ad.symphony.e.b r2 = r2.mo7751b()
                if (r2 == 0) goto L_0x0044
                java.lang.String r2 = r2.f7299a
                goto L_0x0045
            L_0x0044:
                r2 = r3
            L_0x0045:
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
                java.lang.String r1 = "sdk_image_url"
                com.bytedance.ad.symphony.a.a.d r2 = r6.f66302c
                if (r2 == 0) goto L_0x0054
                java.lang.String r2 = r2.mo7766e()
                goto L_0x0055
            L_0x0054:
                r2 = r3
            L_0x0055:
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
                java.lang.String r1 = "sdk_icon_url"
                com.bytedance.ad.symphony.a.a.d r2 = r6.f66302c
                if (r2 == 0) goto L_0x0064
                java.lang.String r2 = r2.mo7767g()
                goto L_0x0065
            L_0x0064:
                r2 = r3
            L_0x0065:
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
                java.lang.String r1 = "sdk_title"
                com.bytedance.ad.symphony.a.a.d r2 = r6.f66302c
                if (r2 == 0) goto L_0x0074
                java.lang.String r2 = r2.mo7764c()
                goto L_0x0075
            L_0x0074:
                r2 = r3
            L_0x0075:
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
                java.lang.String r1 = "sdk_description"
                com.bytedance.ad.symphony.a.a.d r2 = r6.f66302c
                if (r2 == 0) goto L_0x0084
                java.lang.String r2 = r2.mo7765d()
                goto L_0x0085
            L_0x0084:
                r2 = r3
            L_0x0085:
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
                java.lang.String r1 = "sdk_cta"
                com.bytedance.ad.symphony.a.a.d r2 = r6.f66302c
                if (r2 == 0) goto L_0x0093
                java.lang.String r3 = r2.mo7769i()
            L_0x0093:
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r3)
                java.lang.String r1 = "Uri.Builder().appendQuer… iNativeAd?.callToAction)"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.f66301b
                java.lang.String r2 = "symphony"
                java.lang.String r3 = "ad"
                com.google.gson.e r4 = new com.google.gson.e
                r4.<init>()
                java.util.HashMap r5 = r6.f66303d
                java.lang.String r4 = r4.mo15979b(r5)
                java.lang.String r5 = "Gson().toJson(extraMap)"
                kotlin.jvm.internal.C7573i.m23582a(r4, r5)
                android.net.Uri$Builder r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25244aq.m82986a(r0, r1, r2, r3, r4)
                com.p280ss.android.ugc.aweme.report.C37196b.m119559a(r7, r0)
            L_0x00b9:
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel r7 = r6.f66300a
                r7.dismiss()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel.C25121b.onClick(android.view.View):void");
        }
    }

    /* renamed from: c */
    private final void m82697c() {
        ((DmtTextView) findViewById(R.id.sp)).setOnClickListener(new C25120a(this));
    }

    /* renamed from: d */
    private final void m82698d() {
        int b = C9738o.m28709b((Context) getOwnerActivity()) - C9738o.m28717e(getContext());
        Window window = getWindow();
        if (window != null) {
            if (b == 0) {
                b = -1;
            }
            window.setLayout(-1, b);
            window.setGravity(80);
            LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            window.setAttributes(attributes);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setOwnerActivity(this.f66296b);
        setContentView((int) R.layout.l9);
        m82696a(this.f66297c, this.f66298d);
        m82697c();
        m82698d();
        setCanceledOnTouchOutside(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r3 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r3 == null) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m82696a(com.bytedance.p073ad.symphony.p074a.p075a.C2087d r7, com.p280ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "log_extra"
            if (r7 == 0) goto L_0x001c
            com.bytedance.ad.symphony.e.b r3 = r7.mo7751b()
            if (r3 == 0) goto L_0x001c
            org.json.JSONObject r3 = r3.f7303e
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x001e
        L_0x001c:
            java.lang.String r3 = ""
        L_0x001e:
            r1.put(r2, r3)
            java.lang.String r2 = "cid"
            if (r8 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r8.getAwemeRawAd()
            if (r3 == 0) goto L_0x0031
            java.lang.String r3 = r3.getCreativeIdStr()
            if (r3 != 0) goto L_0x0033
        L_0x0031:
            java.lang.String r3 = ""
        L_0x0033:
            r1.put(r2, r3)
            r1 = 2131301948(0x7f09163c, float:1.8221968E38)
            android.view.View r1 = r6.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.content.Context r2 = r6.getContext()
            r3 = 2131826227(0x7f111633, float:1.9285332E38)
            r4 = 2131232859(0x7f08085b, float:1.808184E38)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel$b r5 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel$b
            r5.<init>(r6, r8, r7, r0)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            com.ss.android.ugc.aweme.share.seconditem.ShareItemView r7 = com.p280ss.android.ugc.aweme.share.seconditem.ShareItemView.m122195a(r2, r3, r4, r5)
            android.view.View r7 = (android.view.View) r7
            r1.addView(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel.m82696a(com.bytedance.ad.symphony.a.a.d, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public SymphonySharePanel(Activity activity, C2087d dVar, Aweme aweme) {
        C7573i.m23587b(activity, "activity");
        super(activity, R.style.t3);
        this.f66296b = activity;
        this.f66297c = dVar;
        this.f66298d = aweme;
    }
}
