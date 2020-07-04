package com.facebook.imagepipeline.p720g;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.common.internal.C13307g;
import com.facebook.common.references.C13326a;
import com.facebook.common.references.C13329c;
import com.facebook.imageutils.C13844a;

/* renamed from: com.facebook.imagepipeline.g.d */
public final class C13646d extends C13644b {

    /* renamed from: a */
    public final int f36253a;

    /* renamed from: b */
    public final int f36254b;

    /* renamed from: c */
    private C13326a<Bitmap> f36255c;

    /* renamed from: d */
    private volatile Bitmap f36256d;

    /* renamed from: e */
    private final C13650h f36257e;

    /* renamed from: d */
    public final Bitmap mo33265d() {
        return this.f36256d;
    }

    /* renamed from: e */
    public final C13650h mo33266e() {
        return this.f36257e;
    }

    /* renamed from: b */
    public final int mo33259b() {
        return C13844a.m40886a(this.f36256d);
    }

    /* renamed from: g */
    private synchronized C13326a<Bitmap> m40229g() {
        C13326a<Bitmap> aVar;
        aVar = this.f36255c;
        this.f36255c = null;
        this.f36256d = null;
        return aVar;
    }

    public final void close() {
        C13326a g = m40229g();
        if (g != null) {
            g.close();
        }
    }

    /* renamed from: f */
    public final synchronized C13326a<Bitmap> mo33268f() {
        return C13326a.m39000b(this.f36255c);
    }

    /* renamed from: a */
    public final synchronized boolean mo33258a() {
        boolean z;
        if (this.f36255c == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final int getHeight() {
        if (this.f36253a % NormalGiftView.ALPHA_180 != 0 || this.f36254b == 5 || this.f36254b == 7) {
            return m40227a(this.f36256d);
        }
        return m40228b(this.f36256d);
    }

    public final int getWidth() {
        if (this.f36253a % NormalGiftView.ALPHA_180 != 0 || this.f36254b == 5 || this.f36254b == 7) {
            return m40228b(this.f36256d);
        }
        return m40227a(this.f36256d);
    }

    /* renamed from: a */
    private static int m40227a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* renamed from: b */
    private static int m40228b(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public C13646d(C13326a<Bitmap> aVar, C13650h hVar, int i) {
        this(aVar, hVar, 0, 0);
    }

    public C13646d(Bitmap bitmap, C13329c<Bitmap> cVar, C13650h hVar, int i) {
        this(bitmap, cVar, hVar, 0, 0);
    }

    public C13646d(C13326a<Bitmap> aVar, C13650h hVar, int i, int i2) {
        this.f36255c = (C13326a) C13307g.m38940a(aVar.mo32611c());
        this.f36256d = (Bitmap) this.f36255c.mo32609a();
        this.f36257e = hVar;
        this.f36253a = i;
        this.f36254b = i2;
    }

    private C13646d(Bitmap bitmap, C13329c<Bitmap> cVar, C13650h hVar, int i, int i2) {
        this.f36256d = (Bitmap) C13307g.m38940a(bitmap);
        this.f36255c = C13326a.m38996a(this.f36256d, (C13329c) C13307g.m38940a(cVar));
        this.f36257e = hVar;
        this.f36253a = i;
        this.f36254b = 0;
    }
}
