package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.arch.lifecycle.C0053p;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ce */
public final class C28874ce extends C28894e implements C0053p<C23083a> {

    /* renamed from: a */
    private DmtTextView f76130a;

    /* renamed from: a */
    public final void mo72018a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
    }

    public C28874ce(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.layout_video_post_time);
        if (view instanceof FrameLayout) {
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.leftMargin = C23486n.m77122a(4.0d);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(C23486n.m77122a(4.0d));
            }
            ((FrameLayout) view).addView(view2, layoutParams);
        }
        C7573i.m23582a((Object) view2, "contentView");
        DmtTextView dmtTextView = (DmtTextView) view2.findViewById(R.id.dzt);
        C7573i.m23582a((Object) dmtTextView, "contentView.tv_post_time");
        this.f76130a = dmtTextView;
        if (VERSION.SDK_INT >= 17) {
            DmtTextView dmtTextView2 = this.f76130a;
            if (dmtTextView2 == null) {
                C7573i.m23583a("mPlayCountView");
            }
            dmtTextView2.setTextDirection(2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72021a(com.p280ss.android.ugc.aweme.feed.model.VideoItemParams r7) {
        /*
            r6 = this;
            super.mo72021a(r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r6.f76169g
            if (r7 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r7 = r7.getStatistics()
            if (r7 == 0) goto L_0x0017
            int r7 = r7.getPlayCount()
            long r0 = (long) r7
            java.lang.String r7 = com.p280ss.android.ugc.aweme.i18n.C30537o.m99738a(r0)
            goto L_0x0018
        L_0x0017:
            r7 = 0
        L_0x0018:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.isAd()
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f76169g
            r3 = 1
            if (r2 == 0) goto L_0x002d
            boolean r2 = r2.isDelete()
            goto L_0x002e
        L_0x002d:
            r2 = 1
        L_0x002e:
            r4 = r7
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x003c
            int r4 = r4.length()
            if (r4 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r4 = 0
            goto L_0x003d
        L_0x003c:
            r4 = 1
        L_0x003d:
            if (r4 != 0) goto L_0x008b
            if (r0 != 0) goto L_0x008b
            if (r2 != 0) goto L_0x008b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.f76130a
            if (r0 != 0) goto L_0x004c
            java.lang.String r2 = "mPlayCountView"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x004c:
            r0.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.f76130a
            if (r0 != 0) goto L_0x0058
            java.lang.String r2 = "mPlayCountView"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0058:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "· "
            r2.<init>(r4)
            android.content.Context r4 = r6.f76175m
            r5 = 2131821506(0x7f1103c2, float:1.9275757E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "mContext.getString(R.string.challenge_view_count)"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r1] = r7
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r5, r3)
            java.lang.String r7 = com.C1642a.m8034a(r4, r7)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C7573i.m23582a(r7, r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r0.setText(r7)
            return
        L_0x008b:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r6.f76130a
            if (r7 != 0) goto L_0x0094
            java.lang.String r0 = "mPlayCountView"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0094:
            r0 = 8
            r7.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28874ce.mo72021a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }
}
