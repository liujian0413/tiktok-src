package com.zhihu.matisse.internal.p1856ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.view.C13445b;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.ImageRequest;
import p1874it.sephiroth.android.library.imagezoom.ImageViewTouch;

/* renamed from: com.zhihu.matisse.internal.ui.widget.DraweeViewTouch */
public class DraweeViewTouch extends ImageViewTouch {

    /* renamed from: A */
    private C13445b f121545A;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f121545A.mo32934b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f121545A.mo32935c();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.f121545A.mo32934b();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f121545A.mo32935c();
    }

    public DraweeViewTouch(Context context) {
        super(context);
        m147905a(context);
    }

    /* renamed from: a */
    private void m147905a(Context context) {
        if (this.f121545A == null) {
            this.f121545A = C13445b.m39493a(new C13439b(getResources()).mo32908a(), context);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f121545A.mo32938f() || !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setImageRequest(ImageRequest imageRequest) {
        final C13346c a = C13380c.m39172c().mo33172a(imageRequest, (Object) null);
        this.f121545A.mo32931a((C13386a) ((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32729b(this.f121545A.f35652b)).mo32748b(imageRequest)).mo32743a((C13401d<? super INFO>) new C13400c<C13648f>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                C13326a aVar;
                Throwable th;
                super.onFinalImageSet(str, fVar, animatable);
                try {
                    aVar = (C13326a) a.mo32641d();
                    if (aVar != null) {
                        try {
                            C13645c cVar = (C13645c) aVar.mo32609a();
                            if (cVar instanceof C13646d) {
                                Bitmap d = ((C13646d) cVar).mo33265d();
                                if (d != null) {
                                    DraweeViewTouch.this.setImageBitmap(d);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            a.mo32644g();
                            C13326a.m39001c(aVar);
                            throw th;
                        }
                    }
                    a.mo32644g();
                    C13326a.m39001c(aVar);
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    aVar = null;
                    th = th4;
                    a.mo32644g();
                    C13326a.m39001c(aVar);
                    throw th;
                }
            }
        })).mo32730f());
    }

    public DraweeViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m147905a(context);
    }

    public DraweeViewTouch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m147905a(context);
    }
}
