package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.CustomInterceptTouchEventFrameLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.FlippableViewPager;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.MainTabStrip;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.m */
public final class C2044m implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        int i2;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, -1);
        frameLayout.setId(R.id.amt);
        if (viewGroup2 != null) {
            frameLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(frameLayout);
            }
        }
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        swipeRefreshLayout.setId(R.id.d9v);
        swipeRefreshLayout.setLayoutParams(layoutParams);
        if (swipeRefreshLayout.getParent() == null) {
            frameLayout.addView(swipeRefreshLayout);
        }
        CustomInterceptTouchEventFrameLayout customInterceptTouchEventFrameLayout = new CustomInterceptTouchEventFrameLayout(context2);
        MarginLayoutParams a2 = C1444a.m7241a(swipeRefreshLayout, -1, -1);
        customInterceptTouchEventFrameLayout.setId(R.id.am7);
        customInterceptTouchEventFrameLayout.setLayoutParams(a2);
        if (customInterceptTouchEventFrameLayout.getParent() == null) {
            swipeRefreshLayout.addView(customInterceptTouchEventFrameLayout);
        }
        FlippableViewPager flippableViewPager = new FlippableViewPager(context2);
        MarginLayoutParams a3 = C1444a.m7241a(customInterceptTouchEventFrameLayout, -1, -1);
        flippableViewPager.setId(R.id.edp);
        flippableViewPager.setLayoutParams(a3);
        if (flippableViewPager.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(flippableViewPager);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        MarginLayoutParams a4 = C1444a.m7241a(customInterceptTouchEventFrameLayout, -1, -2);
        appCompatImageView.setId(R.id.dkk);
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageResource(R.drawable.u4);
        appCompatImageView.setLayoutParams(a4);
        if (appCompatImageView.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(appCompatImageView);
        }
        ViewStub viewStub = new ViewStub(context2);
        MarginLayoutParams a5 = C1444a.m7241a(customInterceptTouchEventFrameLayout, (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.a_k, typedValue, true);
        viewStub.setLayoutResource(typedValue.resourceId);
        viewStub.setId(R.id.ef4);
        if (MarginLayoutParams.class.isInstance(a5)) {
            a5.topMargin = (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics());
        }
        viewStub.setLayoutParams(a5);
        if (viewStub.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(viewStub);
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        MarginLayoutParams a6 = C1444a.m7241a(customInterceptTouchEventFrameLayout, -1, -1);
        linearLayout.setId(R.id.dk2);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(a6);
        if (linearLayout.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(linearLayout);
        }
        View view = new View(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view.setId(R.id.dal);
        view.setLayoutParams(layoutParams2);
        if (view.getParent() == null) {
            linearLayout.addView(view);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        frameLayout2.setId(R.id.cv5);
        frameLayout2.setLayoutParams(layoutParams3);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2);
        }
        MainTabStrip mainTabStrip = new MainTabStrip(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        mainTabStrip.setBackgroundColor(resources.getColor(R.color.ayd));
        mainTabStrip.setId(R.id.c_3);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 17;
        }
        mainTabStrip.setLayoutParams(layoutParams4);
        if (mainTabStrip.getParent() == null) {
            frameLayout2.addView(mainTabStrip);
        }
        View view2 = new View(context2);
        MainTabStrip mainTabStrip2 = mainTabStrip;
        View view3 = view;
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        view2.setBackgroundResource(R.drawable.on);
        view2.setId(R.id.bwo);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 80;
        }
        view2.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.bottomMargin = (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        view2.setLayoutParams(layoutParams5);
        if (view2.getParent() == null) {
            frameLayout2.addView(view2);
        }
        ViewStub viewStub2 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        viewStub2.setId(R.id.bwl);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 8388629;
        }
        viewStub2.setLayoutParams(layoutParams6);
        if (viewStub2.getParent() == null) {
            frameLayout2.addView(viewStub2);
        }
        ViewStub viewStub3 = new ViewStub(context2);
        ViewStub viewStub4 = viewStub2;
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        viewStub3.setLayoutResource(R.layout.b4l);
        viewStub3.setId(R.id.dgx);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i = 17;
            layoutParams7.gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((FrameLayout.LayoutParams) layoutParams7).gravity = i;
        }
        viewStub3.setLayoutParams(layoutParams7);
        if (viewStub3.getParent() == null) {
            linearLayout.addView(viewStub3);
        }
        FrameLayout frameLayout3 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout3.setId(R.id.am5);
        frameLayout3.setLayoutParams(layoutParams8);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3);
        }
        View view4 = new View(context2);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.mz));
        view4.setBackgroundColor(resources.getColor(R.color.a87));
        view4.setId(R.id.e_i);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i2 = 80;
            ((LinearLayout.LayoutParams) layoutParams9).gravity = 80;
        } else {
            i2 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.gravity = i2;
        }
        view4.setVisibility(8);
        view4.setLayoutParams(layoutParams9);
        if (view4.getParent() == null) {
            frameLayout.addView(view4);
        }
        C1444a.m7242a(frameLayout);
        C1444a.m7242a(swipeRefreshLayout);
        C1444a.m7242a(customInterceptTouchEventFrameLayout);
        C1444a.m7242a(flippableViewPager);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(viewStub);
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(view3);
        C1444a.m7242a(frameLayout2);
        C1444a.m7242a(mainTabStrip2);
        C1444a.m7242a(view2);
        C1444a.m7242a(viewStub4);
        C1444a.m7242a(viewStub3);
        C1444a.m7242a(frameLayout3);
        C1444a.m7242a(view4);
        return frameLayout;
    }
}
