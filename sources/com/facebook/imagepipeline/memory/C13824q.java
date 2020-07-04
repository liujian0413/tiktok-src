package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.memory.MemoryTrimType;

/* renamed from: com.facebook.imagepipeline.memory.q */
public final class C13824q implements C13806c {

    /* renamed from: a */
    protected final C13798aa<Bitmap> f36671a = new C13807d();

    /* renamed from: b */
    private final int f36672b;

    /* renamed from: c */
    private int f36673c;

    /* renamed from: d */
    private final C13804ae f36674d;

    /* renamed from: e */
    private int f36675e;

    /* renamed from: d */
    private Bitmap m40813d(int i) {
        return Bitmap.createBitmap(1, i, Config.ALPHA_8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void mo32582a(Bitmap bitmap) {
        int b = this.f36671a.mo33424b(bitmap);
        if (b <= this.f36673c) {
            this.f36671a.mo33423a(bitmap);
            this.f36675e += b;
        }
    }

    /* renamed from: b */
    private synchronized void m40811b(int i) {
        while (this.f36675e > i) {
            Bitmap bitmap = (Bitmap) this.f36671a.mo33421a();
            if (bitmap == null) {
                break;
            }
            this.f36675e -= this.f36671a.mo33424b(bitmap);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized Bitmap mo32581a(int i) {
        if (this.f36675e > this.f36672b) {
            m40811b(this.f36672b);
        }
        Bitmap bitmap = (Bitmap) this.f36671a.mo33422a(i);
        if (bitmap != null) {
            this.f36675e -= this.f36671a.mo33424b(bitmap);
            return bitmap;
        }
        return m40813d(i);
    }

    /* renamed from: a */
    public final void mo32580a(MemoryTrimType memoryTrimType) {
        double d = (double) this.f36672b;
        double suggestedTrimRatio = 1.0d - memoryTrimType.getSuggestedTrimRatio();
        Double.isNaN(d);
        m40811b((int) (d * suggestedTrimRatio));
    }

    public C13824q(int i, int i2, C13804ae aeVar) {
        this.f36672b = i;
        this.f36673c = i2;
        this.f36674d = aeVar;
    }
}
