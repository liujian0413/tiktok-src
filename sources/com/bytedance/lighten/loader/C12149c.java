package com.bytedance.lighten.loader;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.lighten.core.C12131l;
import com.bytedance.lighten.core.C12138q;
import com.bytedance.lighten.core.p612c.C12112j;
import com.facebook.drawee.controller.C13400c;
import com.facebook.imagepipeline.p720g.C13643a;
import com.facebook.imagepipeline.p720g.C13648f;

/* renamed from: com.bytedance.lighten.loader.c */
final class C12149c extends C13400c<C13648f> {

    /* renamed from: a */
    public C12112j f32369a;

    /* renamed from: b */
    public boolean f32370b;

    /* renamed from: c */
    public boolean f32371c;

    /* renamed from: d */
    private SmartImageView f32372d;

    /* renamed from: e */
    private Uri f32373e;

    /* renamed from: f */
    private C13643a f32374f;

    /* renamed from: g */
    private C12138q f32375g;

    C12149c() {
    }

    public final void onRelease(String str) {
        super.onRelease(str);
        if (this.f32369a != null) {
            this.f32369a.mo29801a(this.f32373e);
        }
        this.f32370b = false;
        this.f32371c = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29880a(C12138q qVar) {
        this.f32375g = qVar;
        this.f32372d = (SmartImageView) qVar.f32262D;
        this.f32369a = qVar.f32264F;
        if (qVar.f32271M == null || qVar.f32271M.mo29784a()) {
            this.f32373e = qVar.f32273a;
        } else {
            this.f32373e = Uri.parse((String) qVar.f32271M.f32193a.get(0));
        }
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
        super.onIntermediateImageFailed(str, th);
        this.f32370b = false;
        this.f32371c = false;
    }

    public final void onSubmit(String str, Object obj) {
        if (this.f32369a != null) {
            this.f32369a.mo29802a(this.f32373e, this.f32372d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onIntermediateImageSet(String str, C13648f fVar) {
        super.onIntermediateImageSet(str, fVar);
        if (!(this.f32369a == null || fVar == null)) {
            new C12131l(fVar.getWidth(), fVar.getHeight());
        }
        this.f32370b = false;
        this.f32371c = false;
    }

    public final void onFailure(String str, Throwable th) {
        if (this.f32369a != null) {
            this.f32369a.mo29812a(this.f32373e, this.f32372d, th);
        }
        this.f32370b = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
        boolean z = fVar instanceof C13643a;
        if (z) {
            this.f32374f = (C13643a) fVar;
        }
        boolean z2 = true;
        this.f32371c = true;
        if (animatable == null) {
            z2 = false;
        }
        this.f32370b = z2;
        if (this.f32369a != null) {
            if (fVar != null) {
                this.f32369a.mo29811a(this.f32373e, this.f32372d, new C12131l(fVar.getWidth(), fVar.getHeight()), animatable);
            } else {
                this.f32369a.mo29811a(this.f32373e, this.f32372d, null, animatable);
            }
        }
        if (this.f32374f != null && this.f32375g.f32267I && !TextUtils.isEmpty(this.f32372d.getAnimPreviewFrameCacheKey()) && C12143a.m35367b().mo29873a(this.f32372d.getAnimPreviewFrameCacheKey()) == null && z) {
            C12143a.m35367b().mo29875a(this.f32372d.getAnimPreviewFrameCacheKey(), this.f32374f);
        }
        if (this.f32370b && this.f32375g.f32275c) {
            this.f32372d.mo29861b();
        }
    }
}
