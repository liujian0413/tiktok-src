package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.p063by.inflate_lib.C2060b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.k */
public final class C2042k implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        if (viewGroup2 != null) {
            LinearLayout linearLayout = new LinearLayout(context2);
            MarginLayoutParams a = C1444a.m7241a(viewGroup2, -1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
            linearLayout.setId(R.id.dm4);
            if (LayoutParams.class.isInstance(a)) {
                ((LayoutParams) a).gravity = 48;
            }
            if (FrameLayout.LayoutParams.class.isInstance(a)) {
                ((FrameLayout.LayoutParams) a).gravity = 48;
            }
            linearLayout.setOrientation(1);
            if (viewGroup2 != null) {
                linearLayout.setLayoutParams(a);
                viewGroup2.addView(linearLayout);
            }
            View view = new View(context2);
            LayoutParams layoutParams = new LayoutParams(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
            view.setBackgroundColor(resources.getColor(R.color.l3));
            view.setId(R.id.dm3);
            view.setLayoutParams(layoutParams);
            if (view.getParent() == null) {
                linearLayout.addView(view);
            }
            FrameLayout frameLayout = new FrameLayout(context2);
            frameLayout.setLayoutParams(new LayoutParams(-1, -2));
            if (frameLayout.getParent() == null) {
                linearLayout.addView(frameLayout);
            }
            AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            if (LayoutParams.class.isInstance(layoutParams2)) {
                ((LayoutParams) layoutParams2).gravity = 51;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
                layoutParams2.gravity = 51;
            }
            appCompatImageView.setImageResource(R.drawable.a5s);
            appCompatImageView.setLayoutParams(layoutParams2);
            if (appCompatImageView.getParent() == null) {
                frameLayout.addView(appCompatImageView);
            }
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            if (LayoutParams.class.isInstance(layoutParams3)) {
                ((LayoutParams) layoutParams3).gravity = 53;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
                layoutParams3.gravity = 53;
            }
            appCompatImageView2.setImageResource(R.drawable.a5t);
            appCompatImageView2.setLayoutParams(layoutParams3);
            if (appCompatImageView2.getParent() == null) {
                frameLayout.addView(appCompatImageView2);
            }
            LinearLayout linearLayout2 = new LinearLayout(context2);
            MarginLayoutParams a2 = C1444a.m7241a(viewGroup2, -1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
            linearLayout2.setId(R.id.nv);
            if (LayoutParams.class.isInstance(a2)) {
                ((LayoutParams) a2).gravity = 80;
            }
            if (FrameLayout.LayoutParams.class.isInstance(a2)) {
                ((FrameLayout.LayoutParams) a2).gravity = 80;
            }
            linearLayout2.setOrientation(1);
            if (viewGroup2 != null) {
                linearLayout2.setLayoutParams(a2);
                viewGroup2.addView(linearLayout2);
            }
            FrameLayout frameLayout2 = new FrameLayout(context2);
            frameLayout2.setLayoutParams(new LayoutParams(-1, -2));
            if (frameLayout2.getParent() == null) {
                linearLayout2.addView(frameLayout2);
            }
            AppCompatImageView appCompatImageView3 = new AppCompatImageView(context2);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            if (LayoutParams.class.isInstance(layoutParams4)) {
                ((LayoutParams) layoutParams4).gravity = 83;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
                layoutParams4.gravity = 83;
            }
            appCompatImageView3.setImageResource(R.drawable.a5u);
            appCompatImageView3.setLayoutParams(layoutParams4);
            if (appCompatImageView3.getParent() == null) {
                frameLayout2.addView(appCompatImageView3);
            }
            AppCompatImageView appCompatImageView4 = new AppCompatImageView(context2);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            if (LayoutParams.class.isInstance(layoutParams5)) {
                ((LayoutParams) layoutParams5).gravity = 85;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
                layoutParams5.gravity = 85;
            }
            appCompatImageView4.setImageResource(R.drawable.a5v);
            appCompatImageView4.setLayoutParams(layoutParams5);
            if (appCompatImageView4.getParent() == null) {
                frameLayout2.addView(appCompatImageView4);
            }
            View view2 = new View(context2);
            LayoutParams layoutParams6 = new LayoutParams(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
            view2.setBackgroundColor(resources.getColor(R.color.l3));
            view2.setId(R.id.nu);
            view2.setLayoutParams(layoutParams6);
            if (view2.getParent() == null) {
                linearLayout2.addView(view2);
            }
            C1444a.m7242a(linearLayout);
            C1444a.m7242a(view);
            C1444a.m7242a(frameLayout);
            C1444a.m7242a(appCompatImageView);
            C1444a.m7242a(appCompatImageView2);
            C1444a.m7242a(linearLayout2);
            C1444a.m7242a(frameLayout2);
            C1444a.m7242a(appCompatImageView3);
            C1444a.m7242a(appCompatImageView4);
            C1444a.m7242a(view2);
            return viewGroup2;
        }
        throw new IllegalStateException("merge标签 container不得为null attach不得为false");
    }
}
