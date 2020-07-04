package com.p280ss.android.ugc.aweme.poi.preview.p1466a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.common.utility.C6319n;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p717d.C13606i;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.poi.preview.C35142b;
import com.p280ss.android.ugc.aweme.poi.preview.p1466a.C35139c.C35140a;
import com.p280ss.android.ugc.aweme.poi.preview.p1466a.C35139c.C35141b;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.C35166h;
import com.p280ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import com.p280ss.android.ugc.aweme.utils.C42967ba;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.a.a */
public final class C35136a implements C35139c {
    /* renamed from: a */
    public final boolean mo89427a(String str) {
        return C23323e.m76518a(Uri.parse(str));
    }

    /* renamed from: a */
    public final Drawable mo89423a(String str, C35166h hVar) {
        String str2;
        String a = C23323e.m76500a(str);
        if (!C6319n.m19593a(a)) {
            try {
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(a, options);
                float b = (float) C35142b.m113367b();
                if (((float) options.outWidth) <= b || ((float) options.outHeight) <= b) {
                    return BitmapDrawable.createFromPath(a);
                }
                options.inSampleSize = m113349a(options.outWidth, options.outHeight, b, b);
                options.inJustDecodeBounds = false;
                if (hVar != null) {
                    str2 = hVar.f91992w;
                } else {
                    str2 = "";
                }
                m113350a(str2, str, options.outWidth, options.outHeight);
                return new BitmapDrawable(BitmapFactory.decodeFile(a, options));
            } catch (Exception | OutOfMemoryError unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo89426a(String str, C35166h hVar, C35141b bVar) {
        C23323e.m76501a(new UrlModel(), 0, 0, (C23319b<Bitmap>) new C35138b<Bitmap>(this, bVar, hVar, str));
    }

    /* renamed from: a */
    public final Bitmap mo89422a(Bitmap bitmap, String str, String str2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float b = (float) C35142b.m113367b();
        float f = (float) width;
        if (f > b) {
            float f2 = (float) height;
            if (f2 > b) {
                float max = Math.max(f / b, f2 / b);
                Matrix matrix = new Matrix();
                float f3 = 1.0f / max;
                matrix.setScale(f3, f3);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                m113350a(str, str2, width, height);
                return createBitmap;
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    private static int m113349a(int i, int i2, float f, float f2) {
        float min = Math.min(((float) i) / f, ((float) i2) / f2);
        float f3 = 1.0f;
        while (true) {
            float f4 = 2.0f * f3;
            if (f4 > min) {
                return (int) f3;
            }
            f3 = f4;
        }
    }

    /* renamed from: a */
    private static void m113350a(String str, String str2, int i, int i2) {
        C42967ba a = C42967ba.m136396a();
        a.mo104680a("item_id", str);
        a.mo104680a("url", str2);
        a.mo104679a("width", Integer.valueOf(i));
        a.mo104679a("height", Integer.valueOf(i2));
        C6877n.m21407a("poi_log", "poi_preview", a.mo104681b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89424a(C35141b bVar, C35166h hVar, String str, Bitmap bitmap) {
        String str2;
        if (bVar != null) {
            if (bitmap == null || bitmap.isRecycled()) {
                bVar.mo89430a(null);
                return;
            }
            if (hVar != null) {
                str2 = hVar.f91992w;
            } else {
                str2 = "";
            }
            bVar.mo89430a(new BitmapDrawable(mo89422a(bitmap, str2, str)));
        }
    }

    /* renamed from: a */
    public final void mo89425a(String str, ImageView imageView, Drawable drawable, C35166h hVar, C35140a aVar) {
        C13606i c = C13380c.m39172c();
        ImageRequest b = ImageRequestBuilder.m40865a(Uri.parse(str)).mo33476b();
        final C13346c a = c.mo33172a(b, (Object) null);
        TransferImage transferImage = (TransferImage) imageView;
        C13382e eVar = (C13382e) ((C13382e) C13380c.m39166a().mo32748b(b)).mo32729b(transferImage.getController());
        final C35140a aVar2 = aVar;
        final ImageView imageView2 = imageView;
        final C35166h hVar2 = hVar;
        final String str2 = str;
        final Drawable drawable2 = drawable;
        C351371 r3 = new C13400c<C13648f>() {
            public final void onSubmit(String str, Object obj) {
                if (aVar2 != null) {
                    aVar2.mo89428a();
                }
            }

            public final void onFailure(String str, Throwable th) {
                if (drawable2 != null) {
                    imageView2.setImageDrawable(drawable2);
                    imageView2.setScaleType(ScaleType.FIT_CENTER);
                }
                if (aVar2 != null) {
                    aVar2.mo89429a(0);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                C13326a aVar;
                Throwable th;
                String str2;
                try {
                    aVar = (C13326a) a.mo32641d();
                    if (aVar != null) {
                        try {
                            C13645c cVar = (C13645c) aVar.mo32609a();
                            if (cVar != null && (cVar instanceof C13646d)) {
                                Bitmap d = ((C13646d) cVar).mo33265d();
                                if (d != null) {
                                    ImageView imageView = imageView2;
                                    C35136a aVar2 = C35136a.this;
                                    if (hVar2 != null) {
                                        str2 = hVar2.f91992w;
                                    } else {
                                        str2 = "";
                                    }
                                    imageView.setImageBitmap(aVar2.mo89422a(d, str2, str2));
                                    imageView2.setScaleType(ScaleType.FIT_CENTER);
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
                    if (aVar2 != null) {
                        aVar2.mo89429a(1);
                    }
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    aVar = null;
                    th = th4;
                    a.mo32644g();
                    C13326a.m39001c(aVar);
                    throw th;
                }
            }
        };
        transferImage.setController(((C13382e) eVar.mo32743a((C13401d<? super INFO>) r3)).mo32730f());
    }
}
