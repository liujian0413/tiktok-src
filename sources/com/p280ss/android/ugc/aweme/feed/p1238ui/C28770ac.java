package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ac */
public final class C28770ac implements C13401d<C13648f> {

    /* renamed from: a */
    private View f75882a;

    /* renamed from: b */
    private Context f75883b;

    public final void onFailure(String str, Throwable th) {
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
    }

    public final void onRelease(String str) {
    }

    public final void onSubmit(String str, Object obj) {
    }

    public C28770ac(View view, Context context) {
        this.f75882a = view;
        this.f75883b = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
        if (fVar != null) {
            LayoutParams layoutParams = this.f75882a.getLayoutParams();
            int width = (int) (((float) fVar.getWidth()) * (((float) layoutParams.height) / ((float) fVar.getHeight())));
            if (width != layoutParams.width) {
                layoutParams.width = width;
                this.f75882a.setLayoutParams(layoutParams);
            }
        }
    }
}
