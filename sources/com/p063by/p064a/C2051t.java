package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p029v7.widget.AppCompatImageView;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.FollowFeedTagGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.t */
public final class C2051t implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        LinearLayout linearLayout;
        int i2;
        DmtTextView dmtTextView;
        int i3;
        AppCompatImageView appCompatImageView;
        float f;
        DmtTextView dmtTextView2;
        int i4;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout2 = new LinearLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, -1);
        linearLayout2.setGravity(80);
        linearLayout2.setOrientation(1);
        if (viewGroup2 != null) {
            linearLayout2.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(linearLayout2);
            }
        }
        LinearLayout linearLayout3 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout3.setId(R.id.cfd);
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(layoutParams);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3);
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        linearLayout4.setId(R.id.cfc);
        linearLayout4.setGravity(16);
        linearLayout4.setOrientation(0);
        linearLayout4.setLayoutParams(layoutParams2);
        if (linearLayout4.getParent() == null) {
            linearLayout3.addView(linearLayout4);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        remoteImageView.setId(R.id.b_z);
        remoteImageView.setScaleType(ScaleType.CENTER_CROP);
        remoteImageView.setImageResource(R.drawable.aet);
        remoteImageView.setLayoutParams(layoutParams3);
        if (remoteImageView.getParent() == null) {
            linearLayout4.addView(remoteImageView);
        }
        FollowFeedTagGroup followFeedTagGroup = new FollowFeedTagGroup(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 16;
        }
        followFeedTagGroup.setLayoutParams(layoutParams4);
        if (followFeedTagGroup.getParent() == null) {
            linearLayout4.addView(followFeedTagGroup);
        }
        DmtTextView dmtTextView3 = new DmtTextView(context2);
        MarginLayoutParams a2 = C1444a.m7241a(followFeedTagGroup, -2, (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        dmtTextView3.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView3.setTextSize(1, 13.0f);
        dmtTextView3.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), dmtTextView3.getPaddingTop(), dmtTextView3.getPaddingRight(), dmtTextView3.getPaddingBottom());
        dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), dmtTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), dmtTextView3.getPaddingBottom());
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = 16;
        }
        dmtTextView3.setTextColor(resources.getColorStateList(R.color.l8));
        dmtTextView3.setId(R.id.buk);
        dmtTextView3.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), dmtTextView3.getPaddingTop(), dmtTextView3.getPaddingRight(), dmtTextView3.getPaddingBottom());
        dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), dmtTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), dmtTextView3.getPaddingBottom());
        dmtTextView3.setEllipsize(TruncateAt.END);
        dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), dmtTextView3.getPaddingTop(), dmtTextView3.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.4f, resources.getDisplayMetrics()));
        dmtTextView3.setMaxLines(1);
        dmtTextView3.setGravity(17);
        dmtTextView3.setLayoutParams(a2);
        if (dmtTextView3.getParent() == null) {
            followFeedTagGroup.addView(dmtTextView3);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        MarginLayoutParams a3 = C1444a.m7241a(followFeedTagGroup, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        appCompatImageView2.setId(R.id.a9y);
        if (MarginLayoutParams.class.isInstance(a3)) {
            a3.leftMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(a3) && VERSION.SDK_INT >= 17) {
            a3.setMarginStart((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(a3) && VERSION.SDK_INT >= 17) {
            a3.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = 16;
        }
        appCompatImageView2.setBackgroundColor(resources.getColor(R.color.a5x));
        if (MarginLayoutParams.class.isInstance(a3)) {
            a3.rightMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        appCompatImageView2.setLayoutParams(a3);
        if (appCompatImageView2.getParent() == null) {
            followFeedTagGroup.addView(appCompatImageView2);
        }
        DmtTextView dmtTextView4 = new DmtTextView(context2);
        MarginLayoutParams a4 = C1444a.m7241a(followFeedTagGroup, -2, -2);
        dmtTextView4.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView4.setTextSize(1, 11.0f);
        dmtTextView4.setId(R.id.e7h);
        dmtTextView4.setEllipsize(TruncateAt.END);
        dmtTextView4.setMaxLines(1);
        if (LinearLayout.LayoutParams.class.isInstance(a4)) {
            ((LinearLayout.LayoutParams) a4).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a4)) {
            ((FrameLayout.LayoutParams) a4).gravity = 16;
        }
        dmtTextView4.setTextColor(resources.getColorStateList(R.color.a5h));
        dmtTextView4.setLayoutParams(a4);
        if (dmtTextView4.getParent() == null) {
            followFeedTagGroup.addView(dmtTextView4);
        }
        DmtTextView dmtTextView5 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView5.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView5.setTextSize(1, 11.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.leftMargin = (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams5) && VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        dmtTextView5.setTextColor(resources.getColorStateList(R.color.a5h));
        dmtTextView5.setId(R.id.w4);
        dmtTextView5.setEllipsize(TruncateAt.END);
        DmtTextView dmtTextView6 = dmtTextView4;
        AppCompatImageView appCompatImageView3 = appCompatImageView2;
        dmtTextView5.setPadding(dmtTextView5.getPaddingLeft(), dmtTextView5.getPaddingTop(), dmtTextView5.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        dmtTextView5.setMaxLines(1);
        dmtTextView5.setGravity(17);
        dmtTextView5.setVisibility(8);
        dmtTextView5.setLayoutParams(layoutParams5);
        if (dmtTextView5.getParent() == null) {
            linearLayout3.addView(dmtTextView5);
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        linearLayout5.setId(R.id.cfb);
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.leftMargin = (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6) && VERSION.SDK_INT >= 17) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.topMargin = (int) TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics());
        }
        linearLayout5.setGravity(16);
        linearLayout5.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.bottomMargin = (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics());
        }
        linearLayout5.setOrientation(0);
        linearLayout5.setLayoutParams(layoutParams6);
        if (linearLayout5.getParent() == null) {
            linearLayout3.addView(linearLayout5);
        }
        FollowFeedTagGroup followFeedTagGroup2 = new FollowFeedTagGroup(context2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        followFeedTagGroup2.setId(R.id.ch8);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i = 16;
            layoutParams7.gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((FrameLayout.LayoutParams) layoutParams7).gravity = i;
        }
        followFeedTagGroup2.setLayoutParams(layoutParams7);
        if (followFeedTagGroup2.getParent() == null) {
            linearLayout5.addView(followFeedTagGroup2);
        }
        DmtTextView dmtTextView7 = new DmtTextView(context2);
        MarginLayoutParams a5 = C1444a.m7241a(followFeedTagGroup2, -2, -1);
        dmtTextView7.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView7.setTextSize(1, 11.0f);
        dmtTextView7.setId(R.id.w3);
        dmtTextView7.setEllipsize(TruncateAt.END);
        dmtTextView7.setMaxLines(1);
        if (!MarginLayoutParams.class.isInstance(a5) || VERSION.SDK_INT < 17) {
            linearLayout = linearLayout5;
            i2 = 1;
        } else {
            linearLayout = linearLayout5;
            i2 = 1;
            a5.setMarginEnd((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(a5)) {
            a5.rightMargin = (int) TypedValue.applyDimension(i2, 7.0f, resources.getDisplayMetrics());
        }
        dmtTextView7.setTextColor(resources.getColorStateList(R.color.a1y));
        dmtTextView7.setLayoutParams(a5);
        if (dmtTextView7.getParent() == null) {
            followFeedTagGroup2.addView(dmtTextView7);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context2);
        MarginLayoutParams a6 = C1444a.m7241a(followFeedTagGroup2, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        appCompatImageView4.setId(R.id.a9q);
        if (!MarginLayoutParams.class.isInstance(a6) || VERSION.SDK_INT < 17) {
            dmtTextView = dmtTextView7;
        } else {
            dmtTextView = dmtTextView7;
            a6.setMarginEnd((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(a6)) {
            i3 = 16;
            ((LinearLayout.LayoutParams) a6).gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a6)) {
            ((FrameLayout.LayoutParams) a6).gravity = i3;
        }
        appCompatImageView4.setBackgroundColor(resources.getColor(R.color.a1z));
        if (MarginLayoutParams.class.isInstance(a6)) {
            a6.rightMargin = (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        appCompatImageView4.setLayoutParams(a6);
        if (appCompatImageView4.getParent() == null) {
            followFeedTagGroup2.addView(appCompatImageView4);
        }
        DmtTextView dmtTextView8 = new DmtTextView(context2);
        MarginLayoutParams a7 = C1444a.m7241a(followFeedTagGroup2, -2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        dmtTextView8.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView8.setTextSize(1, 11.0f);
        dmtTextView8.setId(R.id.b3d);
        dmtTextView8.setEllipsize(TruncateAt.END);
        dmtTextView8.setMaxLines(1);
        if (!MarginLayoutParams.class.isInstance(a7) || VERSION.SDK_INT < 17) {
            appCompatImageView = appCompatImageView4;
            f = 5.0f;
        } else {
            appCompatImageView = appCompatImageView4;
            f = 5.0f;
            a7.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(a7)) {
            a7.rightMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        dmtTextView8.setTextColor(resources.getColorStateList(R.color.a1y));
        dmtTextView8.setLayoutParams(a7);
        if (dmtTextView8.getParent() == null) {
            followFeedTagGroup2.addView(dmtTextView8);
        }
        LinearLayout linearLayout6 = new LinearLayout(context2);
        MarginLayoutParams a8 = C1444a.m7241a(followFeedTagGroup2, -2, -2);
        linearLayout6.setId(R.id.a40);
        if (!MarginLayoutParams.class.isInstance(a8) || VERSION.SDK_INT < 17) {
            dmtTextView2 = dmtTextView8;
        } else {
            dmtTextView2 = dmtTextView8;
            a8.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        linearLayout6.setOrientation(0);
        if (MarginLayoutParams.class.isInstance(a8)) {
            a8.rightMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        linearLayout6.setLayoutParams(a8);
        if (linearLayout6.getParent() == null) {
            followFeedTagGroup2.addView(linearLayout6);
        }
        DmtTextView dmtTextView9 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView9.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView9.setTextSize(1, 11.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.leftMargin = (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        dmtTextView9.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), dmtTextView9.getPaddingTop(), dmtTextView9.getPaddingRight(), dmtTextView9.getPaddingBottom());
        dmtTextView9.setMaxWidth((int) TypedValue.applyDimension(1, 215.0f, resources.getDisplayMetrics()));
        if (MarginLayoutParams.class.isInstance(layoutParams8) && VERSION.SDK_INT >= 17) {
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams8)) {
            i4 = 1;
            layoutParams8.bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            i4 = 1;
        }
        dmtTextView9.setTextColor(resources.getColorStateList(R.color.a71));
        dmtTextView9.setId(R.id.duh);
        dmtTextView9.setPadding((int) TypedValue.applyDimension(i4, 5.0f, resources.getDisplayMetrics()), dmtTextView9.getPaddingTop(), dmtTextView9.getPaddingRight(), dmtTextView9.getPaddingBottom());
        dmtTextView9.setEllipsize(TruncateAt.END);
        dmtTextView9.setMaxLines(1);
        if (MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.topMargin = (int) TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics());
        }
        dmtTextView9.setVisibility(8);
        dmtTextView9.setLayoutParams(layoutParams8);
        if (dmtTextView9.getParent() == null) {
            linearLayout3.addView(dmtTextView9);
        }
        C1444a.m7242a(linearLayout2);
        C1444a.m7242a(linearLayout3);
        C1444a.m7242a(linearLayout4);
        C1444a.m7242a(remoteImageView);
        C1444a.m7242a(followFeedTagGroup);
        C1444a.m7242a(dmtTextView3);
        C1444a.m7242a(appCompatImageView3);
        C1444a.m7242a(dmtTextView6);
        C1444a.m7242a(dmtTextView5);
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(followFeedTagGroup2);
        C1444a.m7242a(dmtTextView);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(dmtTextView2);
        C1444a.m7242a(linearLayout6);
        C1444a.m7242a(dmtTextView9);
        return linearLayout2;
    }
}
