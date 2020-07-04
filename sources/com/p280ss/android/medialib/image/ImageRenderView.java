package com.p280ss.android.medialib.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p280ss.android.medialib.image.C19743b.C19745a;
import com.p280ss.android.medialib.image.C19743b.C19746b;

/* renamed from: com.ss.android.medialib.image.ImageRenderView */
public class ImageRenderView extends GLTextureView {

    /* renamed from: k */
    C19743b f53548k;

    /* renamed from: com.ss.android.medialib.image.ImageRenderView$a */
    public interface C19741a {
        /* renamed from: a */
        void mo52500a(boolean z);
    }

    /* renamed from: b */
    public final void mo52431b() {
        super.mo52431b();
        mo52430a(new Runnable() {
            public final void run() {
                ImageRenderView.this.f53548k.mo52504a();
            }
        });
    }

    /* renamed from: d */
    private void m65083d() {
        setEGLContextClientVersion(2);
        this.f53548k = new C19743b();
        setRenderer(this.f53548k);
        setRenderMode(0);
    }

    public ImageRenderView(Context context) {
        super(context);
        m65083d();
    }

    public void setDrawFrameCallback(C19746b bVar) {
        this.f53548k.f53564a = bVar;
    }

    /* renamed from: a */
    public final float mo52488a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        return this.f53548k.mo52503a(str);
    }

    public void setImage(Bitmap bitmap) {
        if (bitmap != null) {
            this.f53548k.mo52506a(bitmap);
            mo52429a();
        }
    }

    public void setIntensity(float f) {
        this.f53548k.mo52505a(f);
        mo52429a();
    }

    public void setImage(String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile != null) {
            this.f53548k.mo52506a(decodeFile);
            mo52429a();
        }
    }

    public ImageRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65083d();
    }

    /* renamed from: a */
    public final void mo52489a(String str, float f) {
        if (f < 0.0f) {
            f = -1.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f53548k.mo52511b(str, f);
        mo52429a();
    }

    /* renamed from: b */
    public final void mo52493b(String str, float f) {
        this.f53548k.mo52508a(str, f);
        mo52429a();
    }

    /* renamed from: a */
    public final void mo52490a(final String str, final CompressFormat compressFormat, final C19741a aVar) {
        this.f53548k.mo52507a((C19745a) new C19745a() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0031 A[SYNTHETIC, Splitter:B:21:0x0031] */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x0038  */
            /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo52499a(int r3, int r4, java.nio.ByteBuffer r5) {
                /*
                    r2 = this;
                    android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                    android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r0)
                    r3.copyPixelsFromBuffer(r5)
                    r4 = 0
                    java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
                    java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
                    java.lang.String r1 = r3     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
                    r0.<init>(r1)     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
                    r5.<init>(r0)     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
                    android.graphics.Bitmap$CompressFormat r4 = r4     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
                    r0 = 80
                    r3.compress(r4, r0, r5)     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
                    r3 = 1
                    r5.close()     // Catch:{ IOException -> 0x0034 }
                    goto L_0x0034
                L_0x0022:
                    r3 = move-exception
                    r4 = r5
                    goto L_0x0028
                L_0x0025:
                    r4 = r5
                    goto L_0x002e
                L_0x0027:
                    r3 = move-exception
                L_0x0028:
                    if (r4 == 0) goto L_0x002d
                    r4.close()     // Catch:{ IOException -> 0x002d }
                L_0x002d:
                    throw r3
                L_0x002e:
                    r3 = 0
                    if (r4 == 0) goto L_0x0034
                    r4.close()     // Catch:{ IOException -> 0x0034 }
                L_0x0034:
                    com.ss.android.medialib.image.ImageRenderView$a r4 = r5
                    if (r4 == 0) goto L_0x003d
                    com.ss.android.medialib.image.ImageRenderView$a r4 = r5
                    r4.mo52500a(r3)
                L_0x003d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.image.ImageRenderView.C197402.mo52499a(int, int, java.nio.ByteBuffer):void");
            }
        });
        mo52429a();
    }

    /* renamed from: a */
    public final void mo52491a(String str, String str2, float f) {
        this.f53548k.mo52509a(str, str2, f);
        mo52429a();
    }

    /* renamed from: a */
    public final void mo52492a(String str, String str2, float f, float f2, float f3) {
        float f4;
        float f5;
        if (f2 < 0.0f) {
            f2 = -1.0f;
        }
        if (f3 < 0.0f) {
            f3 = -1.0f;
        }
        if (f2 > 1.0f) {
            f4 = 1.0f;
        } else {
            f4 = f2;
        }
        if (f3 > 1.0f) {
            f5 = 1.0f;
        } else {
            f5 = f3;
        }
        this.f53548k.mo52510a(str, str2, f, f4, f5);
        mo52429a();
    }
}
