package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p063by.inflate_lib.C2058a;
import com.p063by.inflate_lib.C2060b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.i */
public final class C2040i implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutParams a = C1444a.m7241a(viewGroup, -1, -1);
        frameLayout.setId(R.id.ajj);
        if (viewGroup != null) {
            frameLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(frameLayout);
            }
        }
        View a2 = C2058a.m9123a(context, R.layout.o4, frameLayout, false, R.layout.fragment_feed);
        if (!(a2 == null || a2 == frameLayout)) {
            a2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (a2.getParent() == null) {
                frameLayout.addView(a2);
            }
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        constraintLayout.setId(R.id.a8_);
        constraintLayout.setLayoutParams(layoutParams);
        if (constraintLayout.getParent() == null) {
            frameLayout.addView(constraintLayout);
        }
        View a3 = C2058a.m9123a(context, R.layout.a74, frameLayout, false, R.layout.fragment_feed);
        if (!(a3 == null || a3 == frameLayout)) {
            a3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (a3.getParent() == null) {
                frameLayout.addView(a3);
            }
        }
        ViewStub viewStub = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setLayoutResource(R.layout.a9d);
        viewStub.setId(R.id.dcg);
        viewStub.setInflatedId(R.id.c3y);
        viewStub.setLayoutParams(layoutParams2);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()));
        frameLayout2.setId(R.id.eb3);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 80;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.bottomMargin = (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics());
        }
        frameLayout2.setLayoutParams(layoutParams3);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 180.0f, resources.getDisplayMetrics()), -2);
        frameLayout3.setId(R.id.eb4);
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) resources.getDimension(R.dimen.xc);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 80;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.bottomMargin = (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics());
        }
        frameLayout3.setLayoutParams(layoutParams4);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3);
        }
        C1444a.m7242a(frameLayout);
        C1444a.m7242a(a2);
        C1444a.m7242a(constraintLayout);
        C1444a.m7242a(a3);
        C1444a.m7242a(viewStub);
        C1444a.m7242a(frameLayout2);
        C1444a.m7242a(frameLayout3);
        return frameLayout;
    }
}
