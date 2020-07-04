package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import com.bytedance.common.utility.C9738o;
import com.facebook.drawee.controller.C13401d;
import com.facebook.fresco.animation.p707c.C13480a;
import com.facebook.fresco.animation.p707c.p708a.C13483a;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a */
public class C25174a implements C13401d<C13648f> {

    /* renamed from: a */
    private boolean f66428a;

    /* renamed from: b */
    private RemoteImageView f66429b;

    public void onFailure(String str, Throwable th) {
    }

    public void onIntermediateImageFailed(String str, Throwable th) {
    }

    public /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
    }

    public void onRelease(String str) {
    }

    public void onSubmit(String str, Object obj) {
    }

    public C25174a(boolean z, RemoteImageView remoteImageView) {
        this.f66428a = z;
        this.f66429b = remoteImageView;
    }

    /* renamed from: a */
    public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
        if (animatable != null) {
            ValueAnimator a = C13483a.m39662a((C13480a) animatable);
            a.setRepeatCount(-1);
            a.start();
            if (this.f66428a && fVar != null) {
                this.f66429b.getLayoutParams().width = C9738o.m28691a(this.f66429b.getContext());
                this.f66429b.getLayoutParams().height = -2;
                this.f66429b.setAspectRatio(((float) fVar.getWidth()) / ((float) fVar.getHeight()));
            }
        }
    }
}
