package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.C12143a;
import com.facebook.common.references.C13326a;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.drawable.C13420o;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.imagepipeline.p720g.C13643a;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.p1066b.C23462a;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AnimatedImageView */
public class AnimatedImageView extends RemoteImageView {

    /* renamed from: a */
    public C23402a f61617a;

    /* renamed from: b */
    public boolean f61618b;

    /* renamed from: c */
    public boolean f61619c;

    /* renamed from: d */
    protected C13401d<C13648f> f61620d = new C13400c<C13648f>() {
        public final void onRelease(String str) {
            super.onRelease(str);
            AnimatedImageView.this.f61619c = false;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onIntermediateImageSet(String str, C13648f fVar) {
            super.onIntermediateImageSet(str, fVar);
            AnimatedImageView.this.f61619c = false;
        }

        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            AnimatedImageView.this.f61619c = false;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            String url = AnimatedImageView.this.getUrl();
            if (!TextUtils.isEmpty(url) && C12143a.m35367b().mo29873a(url) == null && (fVar instanceof C13643a)) {
                C12143a.m35367b().mo29875a(url, (C13643a) fVar);
            }
            if (animatable != null) {
                AnimatedImageView.this.f61619c = true;
                if (AnimatedImageView.this.f61618b) {
                    AnimatedImageView.this.mo60861b();
                }
            } else {
                AnimatedImageView.this.f61619c = false;
            }
        }
    };

    /* renamed from: e */
    private WeakReference<C23462a> f61621e;

    /* renamed from: f */
    private C13326a<Bitmap> f61622f;

    /* renamed from: g */
    private UrlModel f61623g;

    /* renamed from: h */
    private boolean f61624h;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AnimatedImageView$a */
    public interface C23402a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16940a() {
    }

    public C13401d<C13648f> getControllerListener() {
        return this.f61620d;
    }

    /* renamed from: b */
    public final void mo60861b() {
        if (getController() != null && this.f61618b && this.f61619c && this.f61624h) {
            Animatable j = getController().mo32721j();
            if (j != null && !j.isRunning()) {
                j.start();
                if (!(this.f61621e == null || this.f61621e.get() == null)) {
                    this.f61621e.get();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo60862c() {
        if (getController() != null) {
            Animatable j = getController().mo32721j();
            if (j != null && j.isRunning()) {
                j.stop();
                if (!(this.f61621e == null || this.f61621e.get() == null)) {
                    this.f61621e.get();
                }
            }
        }
    }

    public String getUrl() {
        if (this.f61623g == null || this.f61623g.getUrlList() == null || this.f61623g.getUrlList().size() == 0) {
            return "";
        }
        return (String) this.f61623g.getUrlList().get(0);
    }

    public void setAttached(boolean z) {
        this.f61618b = z;
    }

    public void setImageLoadFinishListener(C23402a aVar) {
        this.f61617a = aVar;
    }

    public void setUserVisibleHint(boolean z) {
        this.f61624h = z;
    }

    public void setAnimationListener(C23462a aVar) {
        this.f61621e = new WeakReference<>(aVar);
    }

    public AnimatedImageView(Context context) {
        super(context);
        mo16940a();
    }

    /* renamed from: a */
    public final void mo60860a(UrlModel urlModel) {
        if (urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            this.f61623g = urlModel;
            ((C13438a) getHierarchy()).mo32907e((Drawable) null);
            this.f61622f = C12143a.m35367b().mo29873a(getUrl());
            if (this.f61622f != null && this.f61622f.mo32614d()) {
                Bitmap bitmap = (Bitmap) this.f61622f.mo32609a();
                if (!bitmap.isRecycled()) {
                    ((C13438a) getHierarchy()).mo32907e((Drawable) new C13420o(new BitmapDrawable(bitmap), C13423b.f35599g));
                    return;
                }
                ((C13438a) getHierarchy()).mo32907e((Drawable) null);
            }
        }
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo16940a();
    }

    public AnimatedImageView(Context context, C13438a aVar) {
        super(context, aVar);
        mo16940a();
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo16940a();
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo16940a();
    }
}
