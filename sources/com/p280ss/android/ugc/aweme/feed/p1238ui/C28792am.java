package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.arch.lifecycle.C0053p;
import android.support.p022v4.content.C0683b;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.am */
public final class C28792am extends C28894e implements C0053p<C23083a> {

    /* renamed from: a */
    public View f75937a;

    /* renamed from: b */
    private TextView f75938b;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.am$a */
    public static final class C28793a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C28792am f75939a;

        public final void onClick(View view) {
            C7573i.m23587b(view, "widget");
        }

        C28793a(C28792am amVar) {
            this.f75939a = amVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C7573i.m23587b(textPaint, "ds");
            textPaint.setColor(C0683b.m2912c(this.f75939a.f76175m, R.color.a4s));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.am$b */
    static final class C28794b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28792am f75940a;

        C28794b(C28792am amVar) {
            this.f75940a = amVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
            if (r2 == null) goto L_0x0017;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            if (r2 == null) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r4) {
            /*
                r3 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r4)
                java.lang.String r4 = "click_similar_reduce"
                com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r1 = "group_id"
                com.ss.android.ugc.aweme.feed.ui.am r2 = r3.f75940a
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f76169g
                if (r2 == 0) goto L_0x0017
                java.lang.String r2 = r2.getAid()
                if (r2 != 0) goto L_0x0019
            L_0x0017:
                java.lang.String r2 = ""
            L_0x0019:
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "author_id"
                com.ss.android.ugc.aweme.feed.ui.am r2 = r3.f75940a
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f76169g
                if (r2 == 0) goto L_0x002b
                java.lang.String r2 = r2.getAuthorUid()
                if (r2 != 0) goto L_0x002d
            L_0x002b:
                java.lang.String r2 = ""
            L_0x002d:
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "enter_from"
                com.ss.android.ugc.aweme.feed.ui.am r2 = r3.f75940a
                java.lang.String r2 = r2.f76170h
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r0)
                com.ss.android.ugc.aweme.feed.ui.am r4 = r3.f75940a
                android.content.Context r4 = r4.f76175m
                r0 = 2131822709(0x7f110875, float:1.9278197E38)
                com.bytedance.ies.dmt.ui.c.a r4 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r4, r0)
                r4.mo25750a()
                com.ss.android.ugc.aweme.feed.event.e r4 = new com.ss.android.ugc.aweme.feed.event.e
                com.ss.android.ugc.aweme.feed.ui.am r0 = r3.f75940a
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f76169g
                r4.<init>(r0)
                com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28792am.C28794b.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.am$c */
    static final class C28795c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28792am f75941a;

        C28795c(C28792am amVar) {
            this.f75941a = amVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
            if (r2 == null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
            if (r2 == null) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r4) {
            /*
                r3 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r4)
                com.ss.android.ugc.aweme.feed.ui.am r4 = r3.f75941a
                android.view.View r4 = r4.f75937a
                if (r4 == 0) goto L_0x000e
                r0 = 8
                r4.setVisibility(r0)
            L_0x000e:
                java.lang.String r4 = "close_similar_reduce"
                com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r1 = "group_id"
                com.ss.android.ugc.aweme.feed.ui.am r2 = r3.f75941a
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f76169g
                if (r2 == 0) goto L_0x0022
                java.lang.String r2 = r2.getAid()
                if (r2 != 0) goto L_0x0024
            L_0x0022:
                java.lang.String r2 = ""
            L_0x0024:
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "author_id"
                com.ss.android.ugc.aweme.feed.ui.am r2 = r3.f75941a
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f76169g
                if (r2 == 0) goto L_0x0036
                java.lang.String r2 = r2.getAuthorUid()
                if (r2 != 0) goto L_0x0038
            L_0x0036:
                java.lang.String r2 = ""
            L_0x0038:
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "enter_from"
                com.ss.android.ugc.aweme.feed.ui.am r2 = r3.f75941a
                java.lang.String r2 = r2.f76170h
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28792am.C28795c.onClick(android.view.View):void");
        }
    }

    /* renamed from: a */
    public final void mo72018a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
    }

    public C28792am(View view) {
        C7573i.m23587b(view, "rootView");
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        C7573i.m23587b(view, "view");
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.ahg));
            this.f75937a = view.findViewById(R.id.cwn);
            this.f75938b = (TextView) view.findViewById(R.id.kh);
            view.findViewById(R.id.x_).setOnClickListener(new C28795c(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r3 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if (r3 == null) goto L_0x005a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72021a(com.p280ss.android.ugc.aweme.feed.model.VideoItemParams r5) {
        /*
            r4 = this;
            super.mo72021a(r5)
            android.view.View r5 = r4.f75937a
            if (r5 == 0) goto L_0x000c
            r0 = 8
            r5.setVisibility(r0)
        L_0x000c:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r4.f76169g
            if (r5 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.feed.model.BannerTip r5 = r5.getBannerTip()
            if (r5 != 0) goto L_0x0018
            goto L_0x00ba
        L_0x0018:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f76169g
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.shouldShowReviewStatus()
            r1 = 1
            if (r0 != r1) goto L_0x0024
            return
        L_0x0024:
            java.lang.String r0 = r4.f76170h
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f76169g
            boolean r0 = com.p280ss.android.ugc.aweme.feed.p1234j.C28478a.m93584a(r0, r1)
            if (r0 == 0) goto L_0x00b9
            android.view.View r0 = r4.f75937a
            if (r0 == 0) goto L_0x0036
            r1 = 0
            r0.setVisibility(r1)
        L_0x0036:
            java.lang.String r0 = "show_similar_reduce"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r4.f76169g
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = r3.getAid()
            if (r3 != 0) goto L_0x004a
        L_0x0048:
            java.lang.String r3 = ""
        L_0x004a:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r4.f76169g
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = r3.getAuthorUid()
            if (r3 != 0) goto L_0x005c
        L_0x005a:
            java.lang.String r3 = ""
        L_0x005c:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r4.f76170h
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.getBannerTxt()
            r1.append(r2)
            java.lang.String r2 = r5.getLinkTxt()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.<init>(r1)
            com.ss.android.ugc.aweme.feed.ui.am$a r1 = new com.ss.android.ugc.aweme.feed.ui.am$a
            r1.<init>(r4)
            java.lang.String r5 = r5.getBannerTxt()
            int r5 = r5.length()
            int r2 = r0.length()
            r3 = 17
            r0.setSpan(r1, r5, r2, r3)
            android.widget.TextView r5 = r4.f75938b
            if (r5 == 0) goto L_0x00aa
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.setText(r0)
        L_0x00aa:
            android.view.View r5 = r4.f75937a
            if (r5 == 0) goto L_0x00b9
            com.ss.android.ugc.aweme.feed.ui.am$b r0 = new com.ss.android.ugc.aweme.feed.ui.am$b
            r0.<init>(r4)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.setOnClickListener(r0)
            return
        L_0x00b9:
            return
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28792am.mo72021a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }
}
