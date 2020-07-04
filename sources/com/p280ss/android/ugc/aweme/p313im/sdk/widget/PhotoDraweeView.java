package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView.ScaleType;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.view.C13445b;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import p1904uk.p1905co.senab.photoview.PhotoView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView */
public class PhotoDraweeView extends PhotoView {

    /* renamed from: a */
    private C13445b<C13438a> f83641a;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f83641a.mo32934b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f83641a.mo32935c();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.f83641a.mo32934b();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f83641a.mo32935c();
    }

    public PhotoDraweeView(Context context) {
        this(context, null);
    }

    public void setProgressBarImage(Drawable drawable) {
        ((C13438a) this.f83641a.mo32936d()).mo32906d(drawable);
    }

    /* renamed from: a */
    private void m103905a(Context context) {
        if (this.f83641a == null) {
            this.f83641a = C13445b.m39493a(new C13439b(getResources()).mo32908a(), context);
        }
        setScaleType(ScaleType.CENTER_CROP);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f83641a.mo32933a(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        if (drawable == ((C13438a) this.f83641a.mo32936d()).mo32722a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private C13401d<C13648f> m103904a(final ImageRequest[] imageRequestArr, final C13401d<C13648f> dVar) {
        return new C13400c<C13648f>() {
            public final void onFailure(String str, Throwable th) {
                super.onFailure(str, th);
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            }

            public final void onSubmit(String str, Object obj) {
                super.onSubmit(str, obj);
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onFinalImageSet(java.lang.String r8, com.facebook.imagepipeline.p720g.C13648f r9, android.graphics.drawable.Animatable r10) {
                /*
                    r7 = this;
                    super.onFinalImageSet(r8, r9, r10)
                    com.facebook.imagepipeline.d.i r0 = com.facebook.drawee.backends.pipeline.C13380c.m39172c()
                    r1 = 0
                    com.facebook.imagepipeline.request.ImageRequest[] r2 = r2     // Catch:{ all -> 0x0063 }
                    int r3 = r2.length     // Catch:{ all -> 0x0063 }
                    r4 = 0
                    r5 = r1
                L_0x000d:
                    if (r4 >= r3) goto L_0x002f
                    r6 = r2[r4]     // Catch:{ all -> 0x002d }
                    com.facebook.datasource.c r6 = r0.mo33172a(r6, r1)     // Catch:{ all -> 0x002d }
                    if (r6 == 0) goto L_0x0029
                    java.lang.Object r5 = r6.mo32641d()     // Catch:{ all -> 0x0026 }
                    if (r5 == 0) goto L_0x0029
                    java.lang.Object r0 = r6.mo32641d()     // Catch:{ all -> 0x0026 }
                    com.facebook.common.references.a r0 = (com.facebook.common.references.C13326a) r0     // Catch:{ all -> 0x0026 }
                    r1 = r0
                    r5 = r6
                    goto L_0x002f
                L_0x0026:
                    r8 = move-exception
                    r5 = r6
                    goto L_0x0065
                L_0x0029:
                    int r4 = r4 + 1
                    r5 = r6
                    goto L_0x000d
                L_0x002d:
                    r8 = move-exception
                    goto L_0x0065
                L_0x002f:
                    if (r1 != 0) goto L_0x003a
                    if (r5 == 0) goto L_0x0036
                    r5.mo32644g()
                L_0x0036:
                    com.facebook.common.references.C13326a.m39001c(r1)
                    return
                L_0x003a:
                    java.lang.Object r0 = r1.mo32609a()     // Catch:{ all -> 0x002d }
                    com.facebook.imagepipeline.g.c r0 = (com.facebook.imagepipeline.p720g.C13645c) r0     // Catch:{ all -> 0x002d }
                    boolean r2 = r0 instanceof com.facebook.imagepipeline.p720g.C13646d     // Catch:{ all -> 0x002d }
                    if (r2 == 0) goto L_0x005a
                    com.facebook.imagepipeline.g.d r0 = (com.facebook.imagepipeline.p720g.C13646d) r0     // Catch:{ all -> 0x002d }
                    android.graphics.Bitmap r0 = r0.mo33265d()     // Catch:{ all -> 0x002d }
                    if (r0 == 0) goto L_0x005a
                    com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView r2 = com.p280ss.android.ugc.aweme.p313im.sdk.widget.PhotoDraweeView.this     // Catch:{ all -> 0x002d }
                    r2.setImageBitmap(r0)     // Catch:{ all -> 0x002d }
                    com.facebook.drawee.controller.d r0 = r3     // Catch:{ all -> 0x002d }
                    if (r0 == 0) goto L_0x005a
                    com.facebook.drawee.controller.d r0 = r3     // Catch:{ all -> 0x002d }
                    r0.onFinalImageSet(r8, r9, r10)     // Catch:{ all -> 0x002d }
                L_0x005a:
                    if (r5 == 0) goto L_0x005f
                    r5.mo32644g()
                L_0x005f:
                    com.facebook.common.references.C13326a.m39001c(r1)
                    return
                L_0x0063:
                    r8 = move-exception
                    r5 = r1
                L_0x0065:
                    if (r5 == 0) goto L_0x006a
                    r5.mo32644g()
                L_0x006a:
                    com.facebook.common.references.C13326a.m39001c(r1)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.widget.PhotoDraweeView.C319841.onFinalImageSet(java.lang.String, com.facebook.imagepipeline.g.f, android.graphics.drawable.Animatable):void");
            }
        };
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m103905a(context);
    }

    /* renamed from: a */
    public final void mo82896a(UrlModel urlModel, C13596d dVar, C13401d<C13648f> dVar2) {
        ImageRequest[] a = C23323e.m76522a(urlModel, (C13596d) null, (C13842b) null);
        if (a != null && a.length != 0) {
            C13382e eVar = (C13382e) ((C13382e) C13380c.m39166a().mo32729b(this.f83641a.f35652b)).mo32746a((REQUEST[]) a);
            eVar.mo32743a(m103904a(a, null));
            this.f83641a.mo32931a((C13386a) eVar.mo32730f());
        }
    }
}
