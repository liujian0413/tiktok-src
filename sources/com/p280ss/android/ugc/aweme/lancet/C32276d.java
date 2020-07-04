package com.p280ss.android.ugc.aweme.lancet;

import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import bolts.C1592h;
import com.bytedance.framwork.core.monitor.C6379c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p280ss.android.ugc.aweme.base.C6893q;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.lancet.d */
public final class C32276d implements C13401d<C13648f> {

    /* renamed from: a */
    public ImageRequest f84340a;

    /* renamed from: b */
    private C13401d f84341b;

    /* renamed from: c */
    private boolean f84342c;

    public final void onRelease(String str) {
        if (this.f84341b != null) {
            this.f84341b.onRelease(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onIntermediateImageSet(String str, C13648f fVar) {
        if (this.f84341b != null) {
            this.f84341b.onIntermediateImageSet(str, fVar);
        }
    }

    public final void onFailure(String str, Throwable th) {
        if (this.f84341b != null) {
            this.f84341b.onFailure(str, th);
        }
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
        if (this.f84341b != null) {
            this.f84341b.onIntermediateImageFailed(str, th);
        }
    }

    public final void onSubmit(String str, Object obj) {
        if (this.f84341b != null) {
            this.f84341b.onSubmit(str, obj);
        }
    }

    public C32276d(C13401d dVar, Object obj) {
        ImageRequest imageRequest;
        this.f84341b = dVar;
        if (obj != null) {
            if (obj instanceof ImageRequest) {
                imageRequest = (ImageRequest) obj;
            } else {
                ImageRequest[] imageRequestArr = (ImageRequest[]) obj;
                if (imageRequestArr.length > 0) {
                    imageRequest = imageRequestArr[0];
                } else {
                    imageRequest = null;
                }
            }
            this.f84340a = imageRequest;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onFinalImageSet(String str, final C13648f fVar, Animatable animatable) {
        if (!this.f84342c) {
            this.f84342c = true;
            if (C6379c.m19831b("fresco_big_image_not_compress")) {
                C1592h.m7853a((Callable<TResult>) new Callable<Object>() {
                    public final Object call() throws Exception {
                        int i;
                        if (!(C32276d.this.f84340a == null || C32276d.this.f84340a.mSourceUri == null)) {
                            int width = fVar.getWidth();
                            int height = fVar.getHeight();
                            Uri uri = C32276d.this.f84340a.mSourceUri;
                            int i2 = -1;
                            if (C32276d.this.f84340a.mResizeOptions != null) {
                                i2 = C32276d.this.f84340a.mResizeOptions.f36025b;
                                i = C32276d.this.f84340a.mResizeOptions.f36024a;
                            } else {
                                i = -1;
                            }
                            if (C32276d.this.f84340a.mImageDecodeOptions != null) {
                                Config config = C32276d.this.f84340a.mImageDecodeOptions.f36009h;
                            }
                            if (width > 900 || height > 1000) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("image_width", fVar.getWidth());
                                    jSONObject.put("image_height", fVar.getHeight());
                                    jSONObject.put("image_url", C32276d.this.f84340a.mSourceUri.toString());
                                    jSONObject.put("bitmap_config", C32276d.this.f84340a.mImageDecodeOptions.f36009h);
                                    jSONObject.put("resize_width", i);
                                    jSONObject.put("resize_height", i2);
                                    C6893q.m21447a("fresco_big_image_not_compress", jSONObject);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        return null;
                    }
                });
            }
        }
        if (this.f84341b != null && this.f84341b != this) {
            this.f84341b.onFinalImageSet(str, fVar, animatable);
        }
    }
}
