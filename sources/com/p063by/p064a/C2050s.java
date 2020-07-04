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
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarBorderView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.AvatarImageWithLive;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LiveCircleView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.s */
public final class C2050s implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, (int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()), -2);
        if (viewGroup2 != null) {
            relativeLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(relativeLayout);
            }
        }
        SmartAvatarBorderView smartAvatarBorderView = new SmartAvatarBorderView(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        smartAvatarBorderView.setId(R.id.e8m);
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        smartAvatarBorderView.setVisibility(0);
        smartAvatarBorderView.setLayoutParams(layoutParams);
        if (smartAvatarBorderView.getParent() == null) {
            relativeLayout.addView(smartAvatarBorderView);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.b95);
        appCompatImageView.setScaleType(ScaleType.FIT_XY);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(6, R.id.e8m);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(18, R.id.e8m);
        }
        appCompatImageView.setVisibility(8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(8, R.id.e8m);
        }
        appCompatImageView.setImageResource(R.drawable.as0);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(19, R.id.e8m);
        }
        appCompatImageView.setLayoutParams(layoutParams2);
        if (appCompatImageView.getParent() == null) {
            relativeLayout.addView(appCompatImageView);
        }
        AnimationImageView animationImageView = new AnimationImageView(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        animationImageView.setId(R.id.j6);
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        animationImageView.setVisibility(8);
        animationImageView.setLayoutParams(layoutParams3);
        if (animationImageView.getParent() == null) {
            relativeLayout.addView(animationImageView);
        }
        AvatarImageWithLive avatarImageWithLive = new AvatarImageWithLive(context2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        avatarImageWithLive.setId(R.id.e8s);
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        avatarImageWithLive.setVisibility(4);
        avatarImageWithLive.setLayoutParams(layoutParams4);
        if (avatarImageWithLive.getParent() == null) {
            relativeLayout.addView(avatarImageWithLive);
        }
        LiveCircleView liveCircleView = new LiveCircleView(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 50.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.5f, resources.getDisplayMetrics()));
        liveCircleView.setId(R.id.e8o);
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.leftMargin = (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics());
        }
        liveCircleView.setPadding((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        if (MarginLayoutParams.class.isInstance(layoutParams5) && VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.topMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        liveCircleView.setStrokeWidth((int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics()));
        liveCircleView.setVisibility(8);
        liveCircleView.setLayoutParams(layoutParams5);
        if (liveCircleView.getParent() == null) {
            relativeLayout.addView(liveCircleView);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 51.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 45.0f, resources.getDisplayMetrics()));
        remoteImageView.setId(R.id.in);
        remoteImageView.setScaleType(ScaleType.FIT_CENTER);
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.leftMargin = (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6) && VERSION.SDK_INT >= 17) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.topMargin = (int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics());
        }
        remoteImageView.setVisibility(8);
        remoteImageView.setImageResource(R.drawable.icon);
        remoteImageView.setLayoutParams(layoutParams6);
        if (remoteImageView.getParent() == null) {
            relativeLayout.addView(remoteImageView);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        appCompatImageView2.setId(R.id.b99);
        if (MarginLayoutParams.class.isInstance(layoutParams7) && VERSION.SDK_INT >= 17) {
            layoutParams7.setMarginEnd((int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(11, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.topMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        appCompatImageView2.setVisibility(8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(21, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.rightMargin = (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics());
        }
        appCompatImageView2.setLayoutParams(layoutParams7);
        if (appCompatImageView2.getParent() == null) {
            relativeLayout.addView(appCompatImageView2);
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context2);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        relativeLayout2.setId(R.id.anm);
        if (MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.topMargin = (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics());
        }
        relativeLayout2.setLayoutParams(layoutParams8);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2);
        }
        FrameLayout frameLayout = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.addRule(14, -1);
        }
        frameLayout.setLayoutParams(layoutParams9);
        if (frameLayout.getParent() == null) {
            relativeLayout2.addView(frameLayout);
        }
        AnimationImageView animationImageView2 = new AnimationImageView(context2);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        animationImageView2.setId(R.id.anj);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i = 17;
            ((LinearLayout.LayoutParams) layoutParams10).gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.gravity = i;
        }
        animationImageView2.setLayoutParams(layoutParams10);
        if (animationImageView2.getParent() == null) {
            frameLayout.addView(animationImageView2);
        }
        C1444a.m7242a(relativeLayout);
        C1444a.m7242a(smartAvatarBorderView);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(animationImageView);
        C1444a.m7242a(avatarImageWithLive);
        C1444a.m7242a(liveCircleView);
        C1444a.m7242a(remoteImageView);
        C1444a.m7242a(appCompatImageView2);
        C1444a.m7242a(relativeLayout2);
        C1444a.m7242a(frameLayout);
        C1444a.m7242a(animationImageView2);
        return relativeLayout;
    }
}
