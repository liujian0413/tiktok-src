package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.internal.C13307g;
import com.facebook.common.references.C13329c;
import com.facebook.imageutils.C13844a;

/* renamed from: com.facebook.imagepipeline.memory.a */
public final class C13796a {

    /* renamed from: a */
    public final C13329c<Bitmap> f36603a;

    /* renamed from: b */
    private int f36604b;

    /* renamed from: c */
    private long f36605c;

    /* renamed from: d */
    private final int f36606d;

    /* renamed from: e */
    private final int f36607e;

    /* renamed from: a */
    public final synchronized int mo33415a() {
        return this.f36604b;
    }

    /* renamed from: b */
    public final synchronized long mo33417b() {
        return this.f36605c;
    }

    /* renamed from: c */
    public final synchronized int mo33419c() {
        return this.f36606d;
    }

    /* renamed from: d */
    public final synchronized int mo33420d() {
        return this.f36607e;
    }

    /* renamed from: a */
    public final synchronized boolean mo33416a(Bitmap bitmap) {
        int a = C13844a.m40886a(bitmap);
        if (this.f36604b < this.f36606d) {
            long j = (long) a;
            if (this.f36605c + j <= ((long) this.f36607e)) {
                this.f36604b++;
                this.f36605c += j;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized void mo33418b(Bitmap bitmap) {
        boolean z;
        boolean z2;
        int a = C13844a.m40886a(bitmap);
        if (this.f36604b > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38944a(z, (Object) "No bitmaps registered.");
        long j = (long) a;
        if (j <= this.f36605c) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13307g.m38945a(z2, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(a), Long.valueOf(this.f36605c));
        this.f36605c -= j;
        this.f36604b--;
    }

    public C13796a(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        if (i2 > 0) {
            z2 = true;
        }
        C13307g.m38943a(z2);
        this.f36606d = i;
        this.f36607e = i2;
        this.f36603a = new C13329c<Bitmap>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo32582a(Bitmap bitmap) {
                try {
                    C13796a.this.mo33418b(bitmap);
                } finally {
                    bitmap.recycle();
                }
            }
        };
    }
}
