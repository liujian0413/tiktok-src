package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.lighten.core.C12131l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cc */
public final class C25343cc extends C25236al {
    /* renamed from: a */
    public final void mo29811a(Uri uri, View view, C12131l lVar, Animatable animatable) {
        super.mo29811a(uri, view, lVar, animatable);
        if (view != null && lVar != null) {
            view.getLayoutParams().width = lVar.f32217a;
            view.getLayoutParams().height = lVar.f32218b;
            view.requestLayout();
        }
    }
}
