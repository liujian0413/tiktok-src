package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p063by.inflate_lib.C2060b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.u */
public final class C2052u implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutParams a = C1444a.m7241a(viewGroup, -1, -1);
        if (viewGroup != null) {
            frameLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(frameLayout);
            }
        }
        ViewStub viewStub = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 150.0f, resources.getDisplayMetrics()), -2);
        viewStub.setLayoutResource(R.layout.aak);
        viewStub.setId(R.id.dcd);
        viewStub.setInflatedId(R.id.b9g);
        viewStub.setLayoutParams(layoutParams);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub);
        }
        ViewStub viewStub2 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        viewStub2.setLayoutResource(R.layout.a5u);
        viewStub2.setId(R.id.dcc);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        viewStub2.setInflatedId(R.id.br7);
        viewStub2.setLayoutParams(layoutParams2);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2);
        }
        ViewStub viewStub3 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        viewStub3.setLayoutResource(R.layout.a43);
        viewStub3.setId(R.id.dcf);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 17;
        }
        viewStub3.setInflatedId(R.id.bcv);
        viewStub3.setLayoutParams(layoutParams3);
        if (viewStub3.getParent() == null) {
            frameLayout.addView(viewStub3);
        }
        ViewStub viewStub4 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        viewStub4.setLayoutResource(R.layout.md);
        viewStub4.setId(R.id.dch);
        viewStub4.setInflatedId(R.id.ajb);
        viewStub4.setLayoutParams(layoutParams4);
        if (viewStub4.getParent() == null) {
            frameLayout.addView(viewStub4);
        }
        ViewStub viewStub5 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        viewStub5.setLayoutResource(R.layout.mh);
        viewStub5.setId(R.id.dcr);
        viewStub5.setInflatedId(R.id.bbv);
        viewStub5.setLayoutParams(layoutParams5);
        if (viewStub5.getParent() == null) {
            frameLayout.addView(viewStub5);
        }
        ViewStub viewStub6 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        viewStub6.setLayoutResource(R.layout.mg);
        viewStub6.setId(R.id.dcq);
        viewStub6.setInflatedId(R.id.bbu);
        viewStub6.setLayoutParams(layoutParams6);
        if (viewStub6.getParent() == null) {
            frameLayout.addView(viewStub6);
        }
        ViewStub viewStub7 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        viewStub7.setLayoutResource(R.layout.ak7);
        viewStub7.setId(R.id.dct);
        viewStub7.setInflatedId(R.id.bbv);
        viewStub7.setLayoutParams(layoutParams7);
        if (viewStub7.getParent() == null) {
            frameLayout.addView(viewStub7);
        }
        C1444a.m7242a(frameLayout);
        C1444a.m7242a(viewStub);
        C1444a.m7242a(viewStub2);
        C1444a.m7242a(viewStub3);
        C1444a.m7242a(viewStub4);
        C1444a.m7242a(viewStub5);
        C1444a.m7242a(viewStub6);
        C1444a.m7242a(viewStub7);
        return frameLayout;
    }
}
