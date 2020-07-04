package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.common.utility.C9738o;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.views.WrapContentRemoteImageView */
public class WrapContentRemoteImageView extends RemoteImageView {

    /* renamed from: a */
    private final C13401d f112318a;

    /* renamed from: a */
    public final void mo16940a() {
        super.mo16940a();
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    float aspectRatio = WrapContentRemoteImageView.this.getAspectRatio();
                    float height = (float) WrapContentRemoteImageView.this.getHeight();
                    float width = (float) WrapContentRemoteImageView.this.getWidth();
                    if (height != 0.0f) {
                        float f = height * aspectRatio;
                        float f2 = (width - f) / 2.0f;
                        outline.setRoundRect((int) f2, 0, (int) (f2 + f), WrapContentRemoteImageView.this.getBottom(), C9738o.m28708b(WrapContentRemoteImageView.this.getContext(), 4.3f));
                    }
                }
            });
            setClipToOutline(true);
        }
    }

    public WrapContentRemoteImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo105228a(C13648f fVar) {
        if (VERSION.SDK_INT < 21) {
            getLayoutParams().width = (getLayoutParams().height * fVar.getWidth()) / fVar.getHeight();
            requestLayout();
        } else if (fVar != null) {
            setAspectRatio(((float) fVar.getWidth()) / ((float) fVar.getHeight()));
            if (VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
        }
    }

    /* renamed from: b */
    public final void mo105230b(C13648f fVar) {
        if (VERSION.SDK_INT < 21) {
            getLayoutParams().height = (getLayoutParams().width * fVar.getHeight()) / fVar.getWidth();
            requestLayout();
        } else if (fVar != null) {
            setAspectRatio(((float) fVar.getWidth()) / ((float) fVar.getHeight()));
            if (VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
        }
    }

    public WrapContentRemoteImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setImageURI(Uri uri, Object obj) {
        setController(((C13382e) ((C13382e) ((C13382e) ((C13382e) getControllerBuilder()).mo32743a(this.f112318a)).mo32744a(obj)).mo32713b(uri).mo32729b(getController())).mo32730f());
    }

    public WrapContentRemoteImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f112318a = new C13400c<C13648f>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onIntermediateImageSet(String str, C13648f fVar) {
                WrapContentRemoteImageView.this.mo105228a(fVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                WrapContentRemoteImageView.this.mo105228a(fVar);
            }
        };
    }

    /* renamed from: a */
    public final void mo105229a(String str, Object obj, C13401d<C13648f> dVar) {
        Uri uri;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        setController(((C13382e) ((C13382e) ((C13382e) ((C13382e) getControllerBuilder()).mo32743a(dVar)).mo32744a((Object) null)).mo32713b(uri).mo32729b(getController())).mo32730f());
    }
}
