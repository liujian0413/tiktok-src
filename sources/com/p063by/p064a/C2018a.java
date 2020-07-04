package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p063by.inflate_lib.C2058a;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager;
import com.p280ss.android.ugc.aweme.feed.p1238ui.DisLikeAwemeLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.a */
public final class C2018a implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, -1);
        frameLayout.setId(R.id.ase);
        if (viewGroup2 != null) {
            frameLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(frameLayout);
            }
        }
        ScrollableViewPager scrollableViewPager = new ScrollableViewPager(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        scrollableViewPager.setId(R.id.edp);
        scrollableViewPager.setLayoutParams(layoutParams);
        if (scrollableViewPager.getParent() == null) {
            frameLayout.addView(scrollableViewPager);
        }
        DisLikeAwemeLayout disLikeAwemeLayout = new DisLikeAwemeLayout(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        disLikeAwemeLayout.setId(R.id.a9j);
        disLikeAwemeLayout.setVisibility(8);
        disLikeAwemeLayout.setLayoutParams(layoutParams2);
        if (disLikeAwemeLayout.getParent() == null) {
            frameLayout.addView(disLikeAwemeLayout);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout2.setId(R.id.dce);
        frameLayout2.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingTop(), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
        frameLayout2.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingTop(), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 8388659;
        }
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
        frameLayout2.setLayoutParams(layoutParams3);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 51;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 51;
        }
        appCompatImageView.setImageResource(R.drawable.a5s);
        appCompatImageView.setLayoutParams(layoutParams4);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 53;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 53;
        }
        appCompatImageView2.setImageResource(R.drawable.a5t);
        appCompatImageView2.setLayoutParams(layoutParams5);
        if (appCompatImageView2.getParent() == null) {
            frameLayout.addView(appCompatImageView2);
        }
        View a2 = C2058a.m9123a(context2, R.layout.hq, frameLayout, false, R.layout.activity_main);
        if (!(a2 == null || a2 == frameLayout)) {
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
            a2.setVisibility(8);
            a2.setLayoutParams(layoutParams6);
            if (a2.getParent() == null) {
                frameLayout.addView(a2);
            }
        }
        View a3 = C2058a.m9123a(context2, R.layout.fm, frameLayout, false, R.layout.activity_main);
        if (!(a3 == null || a3 == frameLayout)) {
            a3.setLayoutParams(new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 295.0f, resources.getDisplayMetrics())));
            if (a3.getParent() == null) {
                frameLayout.addView(a3);
            }
        }
        ViewStub viewStub = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.af, typedValue, true);
        viewStub.setLayoutResource(typedValue.resourceId);
        viewStub.setId(R.id.bw);
        viewStub.setLayoutParams(layoutParams7);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub);
        }
        C1444a.m7242a(frameLayout);
        C1444a.m7242a(scrollableViewPager);
        C1444a.m7242a(disLikeAwemeLayout);
        C1444a.m7242a(frameLayout2);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(appCompatImageView2);
        C1444a.m7242a(a2);
        C1444a.m7242a(a3);
        C1444a.m7242a(viewStub);
        return frameLayout;
    }
}
