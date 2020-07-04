package com.bytedance.lighten.loader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.lighten.core.C12127h;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12138q;
import com.bytedance.lighten.core.CircleOptions;
import com.bytedance.lighten.core.CircleOptions.C12090b;
import com.bytedance.lighten.core.ScaleType;
import com.bytedance.lighten.core.p612c.C12103a;
import com.bytedance.lighten.core.p612c.C12112j;
import com.facebook.common.references.C13326a;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.drawable.C13420o;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.ref.WeakReference;

public class SmartImageView extends SimpleDraweeView implements C12127h, C12128i {

    /* renamed from: a */
    private WeakReference<C12103a> f32351a;

    /* renamed from: b */
    private C12149c f32352b;

    /* renamed from: c */
    private C12138q f32353c;

    /* renamed from: d */
    private String f32354d;

    /* renamed from: e */
    private C13326a<Bitmap> f32355e;

    /* renamed from: f */
    private boolean f32356f;

    /* renamed from: g */
    private boolean f32357g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29857a() {
    }

    /* access modifiers changed from: 0000 */
    public String getAnimPreviewFrameCacheKey() {
        return this.f32354d;
    }

    public C12127h getSmartHierarchy() {
        return this;
    }

    /* renamed from: c */
    public final void mo29862c() {
        if (getController() != null) {
            Animatable j = getController().mo32721j();
            if (j != null && j.isRunning()) {
                j.stop();
                if (!(this.f32351a == null || this.f32351a.get() == null)) {
                    this.f32351a.get();
                }
            }
        }
    }

    /* renamed from: d */
    private void m35361d() {
        ((C13438a) getHierarchy()).mo32907e((Drawable) null);
        this.f32355e = C12143a.m35367b().mo29873a(this.f32354d);
        if (this.f32355e != null && this.f32355e.mo32614d()) {
            Bitmap bitmap = (Bitmap) this.f32355e.mo32609a();
            if (!bitmap.isRecycled()) {
                ((C13438a) getHierarchy()).mo32907e((Drawable) new C13420o(new BitmapDrawable(bitmap), C13423b.f35599g));
                return;
            }
            ((C13438a) getHierarchy()).mo32907e((Drawable) null);
        }
    }

    /* renamed from: b */
    public final void mo29861b() {
        if (getController() != null && this.f32352b != null && this.f32356f && this.f32352b.f32370b && this.f32357g) {
            Animatable j = getController().mo32721j();
            if (j != null && !j.isRunning()) {
                j.start();
                if (!(this.f32351a == null || this.f32351a.get() == null)) {
                    ((C12103a) this.f32351a.get()).mo29800a();
                }
            }
        }
    }

    public void setAttached(boolean z) {
        this.f32356f = z;
    }

    public void setUserVisibleHint(boolean z) {
        this.f32357g = z;
    }

    public SmartImageView(Context context) {
        super(context);
        mo29857a();
    }

    public void setAnimationListener(C12103a aVar) {
        this.f32351a = new WeakReference<>(aVar);
    }

    public void setActualImageScaleType(ScaleType scaleType) {
        if (scaleType != null) {
            ((C13438a) getHierarchy()).mo32896a(C12187v.m35444a(scaleType));
        }
    }

    public void setImageDisplayListener(C12112j jVar) {
        if (this.f32352b != null) {
            this.f32352b.f32369a = jVar;
        }
    }

    public void setPlaceholderImage(int i) {
        if (i > 0) {
            ((C13438a) getHierarchy()).mo32898b(i);
        }
    }

    public void setPlaceholderImage(Drawable drawable) {
        ((C13438a) getHierarchy()).mo32900b(drawable);
    }

    private void setController(ImageRequest imageRequest) {
        boolean z;
        C13382e eVar = (C13382e) ((C13382e) C13380c.m39166a().mo32729b(getController())).mo32751c(this.f32353c.f32275c);
        if (this.f32353c.f32269K > 0) {
            z = true;
        } else {
            z = false;
        }
        C13382e eVar2 = (C13382e) ((C13382e) eVar.mo32745a(z)).mo32748b(imageRequest);
        if (!TextUtils.isEmpty(this.f32353c.f32259A)) {
            eVar2.mo32744a((Object) this.f32353c.f32259A);
        }
        if (this.f32352b != null) {
            this.f32352b.mo29880a(this.f32353c);
            eVar2.mo32743a((C13401d<? super INFO>) this.f32352b);
        } else {
            this.f32352b = new C12149c();
            this.f32352b.mo29880a(this.f32353c);
            eVar2.mo32743a((C13401d<? super INFO>) this.f32352b);
        }
        setController(eVar2.mo32730f());
    }

    /* renamed from: a */
    public void mo29858a(C12138q qVar) {
        this.f32353c = qVar;
        if (qVar.f32267I) {
            if (qVar.f32271M == null || qVar.f32271M.mo29784a()) {
                this.f32354d = qVar.f32273a.toString();
            } else {
                this.f32354d = (String) qVar.f32271M.f32193a.get(0);
            }
            m35361d();
        }
        if (qVar.f32271M == null || qVar.f32271M.mo29784a()) {
            setController(C12166p.m35408a(qVar, qVar.f32273a));
        } else {
            setController(C12166p.m35414b(qVar));
        }
    }

    public void setCircleOptions(CircleOptions circleOptions) {
        RoundingParams roundingParams;
        if (circleOptions != null) {
            if (((C13438a) getHierarchy()).f35619a != null) {
                roundingParams = ((C13438a) getHierarchy()).f35619a;
            } else {
                roundingParams = new RoundingParams();
            }
            if (circleOptions.f32175g != null) {
                C12090b bVar = circleOptions.f32175g;
                roundingParams.mo32880a(bVar.f32185a, bVar.f32186b, bVar.f32187c, bVar.f32188d);
            }
            roundingParams.mo32884a(circleOptions.f32172d);
            roundingParams.mo32879a(circleOptions.f32173e);
            roundingParams.mo32886c(circleOptions.f32169a);
            roundingParams.mo32885b(circleOptions.f32170b);
            roundingParams.mo32881a(circleOptions.f32171c);
            roundingParams.mo32887d(circleOptions.f32174f);
            roundingParams.mo32883a(C12190x.m35446a(circleOptions.f32176h));
            ((C13438a) getHierarchy()).mo32897a(roundingParams);
        }
    }

    private void setController(ImageRequest[] imageRequestArr) {
        boolean z;
        if (imageRequestArr.length != 0) {
            C13382e eVar = (C13382e) ((C13382e) C13380c.m39166a().mo32729b(getController())).mo32751c(this.f32353c.f32275c);
            if (this.f32353c.f32269K > 0) {
                z = true;
            } else {
                z = false;
            }
            C13382e eVar2 = (C13382e) ((C13382e) ((C13382e) eVar.mo32745a(z)).mo32744a((Object) this.f32353c.f32259A)).mo32746a((REQUEST[]) imageRequestArr);
            if (!TextUtils.isEmpty(this.f32353c.f32259A)) {
                eVar2.mo32744a((Object) this.f32353c.f32259A);
            }
            if (this.f32352b != null) {
                this.f32352b.mo29880a(this.f32353c);
                eVar2.mo32743a((C13401d<? super INFO>) this.f32352b);
            } else {
                this.f32352b = new C12149c();
                this.f32352b.mo29880a(this.f32353c);
                eVar2.mo32743a((C13401d<? super INFO>) this.f32352b);
            }
            setController(eVar2.mo32730f());
        }
    }

    public SmartImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo29857a();
    }

    public SmartImageView(Context context, C13438a aVar) {
        super(context, aVar);
        setHierarchy(aVar);
        mo29857a();
    }

    public SmartImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo29857a();
    }
}
