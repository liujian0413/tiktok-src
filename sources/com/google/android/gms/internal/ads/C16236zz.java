package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.zz */
final class C16236zz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Bitmap f45499a;

    /* renamed from: b */
    private final /* synthetic */ C16232zv f45500b;

    C16236zz(C16232zv zvVar, Bitmap bitmap) {
        this.f45500b = zvVar;
        this.f45499a = bitmap;
    }

    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f45499a.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.f45500b.f45492l) {
            this.f45500b.f45483c.f41397i = new bcd();
            this.f45500b.f45483c.f41397i.f41421e = byteArrayOutputStream.toByteArray();
            this.f45500b.f45483c.f41397i.f41420d = "image/png";
            this.f45500b.f45483c.f41397i.f41419c = Integer.valueOf(1);
        }
    }
}
