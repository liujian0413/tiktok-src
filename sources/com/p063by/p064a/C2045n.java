package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.p029v7.widget.AppCompatImageView;
import android.support.p029v7.widget.AppCompatTextView;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.p063by.inflate_lib.C2058a;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.VideoSeekBar;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.MainBottomTabView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.n */
public final class C2045n implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        int i2;
        int i3;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FragmentTabHost fragmentTabHost = new FragmentTabHost(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, -1);
        fragmentTabHost.setId(R.id.bwn);
        if (viewGroup2 != null) {
            fragmentTabHost.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(fragmentTabHost);
            }
        }
        FrameLayout frameLayout = new FrameLayout(context2);
        MarginLayoutParams a2 = C1444a.m7241a(fragmentTabHost, -1, -1);
        frameLayout.setBackgroundDrawable(null);
        frameLayout.setId(R.id.bwj);
        frameLayout.setLayoutParams(a2);
        if (frameLayout.getParent() == null) {
            fragmentTabHost.addView(frameLayout);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout2.setId(R.id.dfc);
        frameLayout2.setLayoutParams(layoutParams);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2);
        }
        View view = new View(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        view.setBackgroundColor(resources.getColor(R.color.z6));
        view.setId(R.id.oc);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 80;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        }
        view.setLayoutParams(layoutParams2);
        if (view.getParent() == null) {
            frameLayout.addView(view);
        }
        ViewStub viewStub = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.hs, typedValue, true);
        viewStub.setLayoutResource(typedValue.resourceId);
        viewStub.setId(R.id.a3y);
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 8388693;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.bottomMargin = (int) TypedValue.applyDimension(1, 45.0f, resources.getDisplayMetrics());
        }
        viewStub.setLayoutParams(layoutParams3);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub);
        }
        MainBottomTabView mainBottomTabView = new MainBottomTabView(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.mz));
        mainBottomTabView.setId(R.id.bwi);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 80;
        }
        mainBottomTabView.setLayoutParams(layoutParams4);
        if (mainBottomTabView.getParent() == null) {
            frameLayout.addView(mainBottomTabView);
        }
        VideoSeekBar videoSeekBar = new VideoSeekBar(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        videoSeekBar.setId(R.id.ebh);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 80;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.bottomMargin = (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics());
        }
        videoSeekBar.setVisibility(8);
        videoSeekBar.setLayoutParams(layoutParams5);
        if (videoSeekBar.getParent() == null) {
            frameLayout.addView(videoSeekBar);
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        linearLayout.setId(R.id.ebi);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 81;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.bottomMargin = (int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics());
        }
        linearLayout.setVisibility(8);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams6);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        appCompatTextView.setId(R.id.a5k);
        appCompatTextView.setTextSize(1, 24.0f);
        appCompatTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.aze));
        appCompatTextView.setLayoutParams(layoutParams7);
        if (appCompatTextView.getParent() == null) {
            linearLayout.addView(appCompatTextView);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        AppCompatTextView appCompatTextView2 = appCompatTextView;
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.5f, resources.getDisplayMetrics()));
        if (MarginLayoutParams.class.isInstance(layoutParams8) && VERSION.SDK_INT >= 17) {
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 11.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams8) && VERSION.SDK_INT >= 17) {
            layoutParams8.setMarginEnd((int) TypedValue.applyDimension(1, 11.5f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = 16;
        }
        appCompatImageView.setImageResource(R.drawable.alv);
        appCompatImageView.setLayoutParams(layoutParams8);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView);
        }
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        appCompatTextView3.setId(R.id.dn5);
        appCompatTextView3.setTextSize(1, 24.0f);
        appCompatTextView3.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        appCompatTextView3.setTextColor(resources.getColorStateList(R.color.az7));
        appCompatTextView3.setLayoutParams(layoutParams9);
        if (appCompatTextView3.getParent() == null) {
            linearLayout.addView(appCompatTextView3);
        }
        ViewStub viewStub2 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
        viewStub2.setLayoutResource(R.layout.mh);
        viewStub2.setId(R.id.dcr);
        viewStub2.setInflatedId(R.id.bbv);
        viewStub2.setLayoutParams(layoutParams10);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2);
        }
        View view2 = new View(context2);
        ViewStub viewStub3 = viewStub2;
        AppCompatTextView appCompatTextView4 = appCompatTextView3;
        AppCompatImageView appCompatImageView2 = appCompatImageView;
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 178.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 127.5f, resources.getDisplayMetrics()));
        view2.setId(R.id.bnq);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            i = 81;
            ((LinearLayout.LayoutParams) layoutParams11).gravity = 81;
        } else {
            i = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = i;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.bottomMargin = (int) resources.getDimension(R.dimen.my);
        }
        view2.setVisibility(8);
        view2.setLayoutParams(layoutParams11);
        if (view2.getParent() == null) {
            frameLayout.addView(view2);
        }
        ViewStub viewStub4 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-2, -2);
        TypedValue typedValue2 = new TypedValue();
        View view3 = view2;
        context.getTheme().resolveAttribute(R.attr.vn, typedValue2, true);
        viewStub4.setLayoutResource(typedValue2.resourceId);
        viewStub4.setId(R.id.s0);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i2 = 81;
            ((LinearLayout.LayoutParams) layoutParams12).gravity = 81;
        } else {
            i2 = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.gravity = i2;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.bottomMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        }
        viewStub4.setLayoutParams(layoutParams12);
        if (viewStub4.getParent() == null) {
            frameLayout.addView(viewStub4);
        }
        ViewStub viewStub5 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-2, -2);
        TypedValue typedValue3 = new TypedValue();
        ViewStub viewStub6 = viewStub4;
        context.getTheme().resolveAttribute(R.attr.vo, typedValue3, true);
        viewStub5.setLayoutResource(typedValue3.resourceId);
        viewStub5.setId(R.id.rz);
        if (MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.leftMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams13) && VERSION.SDK_INT >= 17) {
            layoutParams13.setMarginStart((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            ((LinearLayout.LayoutParams) layoutParams13).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.gravity = 8388691;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.bottomMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        }
        viewStub5.setLayoutParams(layoutParams13);
        if (viewStub5.getParent() == null) {
            frameLayout.addView(viewStub5);
        }
        View a3 = C2058a.m9123a(context2, R.layout.akq, frameLayout, false, 0);
        if (!(a3 == null || a3 == frameLayout)) {
            FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -2);
            if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
                i3 = 80;
                ((LinearLayout.LayoutParams) layoutParams14).gravity = 80;
            } else {
                i3 = 80;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
                layoutParams14.gravity = i3;
            }
            a3.setVisibility(8);
            a3.setLayoutParams(layoutParams14);
            if (a3.getParent() == null) {
                frameLayout.addView(a3);
            }
        }
        View view4 = new View(context2);
        MarginLayoutParams a4 = C1444a.m7241a(fragmentTabHost, -1, -1);
        view4.setBackgroundColor(Color.parseColor("#111111"));
        view4.setId(R.id.efa);
        view4.setVisibility(8);
        view4.setAlpha(0.0f);
        view4.setLayoutParams(a4);
        if (view4.getParent() == null) {
            fragmentTabHost.addView(view4);
        }
        C1444a.m7242a(fragmentTabHost);
        C1444a.m7242a(frameLayout);
        C1444a.m7242a(frameLayout2);
        C1444a.m7242a(view);
        C1444a.m7242a(viewStub);
        C1444a.m7242a(mainBottomTabView);
        C1444a.m7242a(videoSeekBar);
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(appCompatTextView2);
        C1444a.m7242a(appCompatImageView2);
        C1444a.m7242a(appCompatTextView4);
        C1444a.m7242a(viewStub3);
        C1444a.m7242a(view3);
        C1444a.m7242a(viewStub6);
        C1444a.m7242a(viewStub5);
        C1444a.m7242a(a3);
        C1444a.m7242a(view4);
        return fragmentTabHost;
    }
}
