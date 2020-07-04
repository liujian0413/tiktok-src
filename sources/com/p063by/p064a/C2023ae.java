package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PressFadeFrameLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.ae */
public final class C2023ae implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        PressFadeFrameLayout pressFadeFrameLayout = new PressFadeFrameLayout(context);
        LayoutParams a = C1444a.m7241a(viewGroup, -1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        pressFadeFrameLayout.setId(R.id.bj4);
        pressFadeFrameLayout.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), pressFadeFrameLayout.getPaddingTop(), pressFadeFrameLayout.getPaddingRight(), pressFadeFrameLayout.getPaddingBottom());
        pressFadeFrameLayout.setPadding(pressFadeFrameLayout.getPaddingLeft(), pressFadeFrameLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), pressFadeFrameLayout.getPaddingBottom());
        pressFadeFrameLayout.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), pressFadeFrameLayout.getPaddingTop(), pressFadeFrameLayout.getPaddingRight(), pressFadeFrameLayout.getPaddingBottom());
        pressFadeFrameLayout.setPadding(pressFadeFrameLayout.getPaddingLeft(), pressFadeFrameLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), pressFadeFrameLayout.getPaddingBottom());
        if (MarginLayoutParams.class.isInstance(a)) {
            ((MarginLayoutParams) a).topMargin = (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(a)) {
            ((MarginLayoutParams) a).bottomMargin = (int) TypedValue.applyDimension(1, 12.5f, resources.getDisplayMetrics());
        }
        pressFadeFrameLayout.setVisibility(8);
        if (viewGroup != null) {
            pressFadeFrameLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(pressFadeFrameLayout);
            }
        }
        RemoteImageView remoteImageView = new RemoteImageView(context);
        MarginLayoutParams a2 = C1444a.m7241a(pressFadeFrameLayout, -1, -1);
        remoteImageView.setBackgroundColor(resources.getColor(R.color.a4l));
        remoteImageView.setId(R.id.azr);
        ((C13438a) remoteImageView.getHierarchy()).mo32896a(C13423b.f35599g);
        ((C13438a) remoteImageView.getHierarchy()).mo32900b(resources.getDrawable(R.color.a4l));
        remoteImageView.setLayoutParams(a2);
        if (remoteImageView.getParent() == null) {
            pressFadeFrameLayout.addView(remoteImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        MarginLayoutParams a3 = C1444a.m7241a(pressFadeFrameLayout, -2, -2);
        dmtTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView.setTextSize(1, 14.0f);
        dmtTextView.setId(R.id.dzy);
        if (MarginLayoutParams.class.isInstance(a3)) {
            a3.leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(a3) && VERSION.SDK_INT >= 17) {
            a3.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(a3) && VERSION.SDK_INT >= 17) {
            a3.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = 16;
        }
        if (MarginLayoutParams.class.isInstance(a3)) {
            a3.rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        dmtTextView.setTextColor(resources.getColorStateList(R.color.a4z));
        dmtTextView.setLayoutParams(a3);
        if (dmtTextView.getParent() == null) {
            pressFadeFrameLayout.addView(dmtTextView);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        MarginLayoutParams a4 = C1444a.m7241a(pressFadeFrameLayout, -2, -2);
        appCompatImageView.setId(R.id.azq);
        if (MarginLayoutParams.class.isInstance(a4) && VERSION.SDK_INT >= 17) {
            a4.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(a4)) {
            ((LinearLayout.LayoutParams) a4).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a4)) {
            ((FrameLayout.LayoutParams) a4).gravity = 8388629;
        }
        appCompatImageView.setImageResource(R.drawable.bdw);
        if (MarginLayoutParams.class.isInstance(a4)) {
            a4.rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        appCompatImageView.setLayoutParams(a4);
        if (appCompatImageView.getParent() == null) {
            pressFadeFrameLayout.addView(appCompatImageView);
        }
        C1444a.m7242a(pressFadeFrameLayout);
        C1444a.m7242a(remoteImageView);
        C1444a.m7242a(dmtTextView);
        C1444a.m7242a(appCompatImageView);
        return pressFadeFrameLayout;
    }
}
