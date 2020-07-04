package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p022v4.util.C0894f;
import com.google.android.gms.common.internal.C15230c;
import com.google.android.gms.internal.base.zak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f39282a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static HashSet<Uri> f39283b = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f39284c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Handler f39285d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ExecutorService f39286e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C15187b f39287f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zak f39288g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Map<C15190a, ImageReceiver> f39289h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Map<Uri, ImageReceiver> f39290i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Map<Uri, Long> f39291j;

    final class ImageReceiver extends ResultReceiver {

        /* renamed from: a */
        private final Uri f39292a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ArrayList<C15190a> f39293b;

        /* renamed from: c */
        private final /* synthetic */ ImageManager f39294c;

        public final void onReceiveResult(int i, Bundle bundle) {
            this.f39294c.f39286e.execute(new C15188c(this.f39292a, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    public interface C15186a {
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    static final class C15187b extends C0894f<C15191b, Bitmap> {
        /* renamed from: b */
        public final /* synthetic */ int mo3346b(Object obj, Object obj2) {
            Bitmap bitmap = (Bitmap) obj2;
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    final class C15188c implements Runnable {

        /* renamed from: a */
        private final Uri f39295a;

        /* renamed from: b */
        private final ParcelFileDescriptor f39296b;

        public C15188c(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.f39295a = uri;
            this.f39296b = parcelFileDescriptor;
        }

        public final void run() {
            boolean z;
            Bitmap bitmap;
            C15230c.m44253b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            boolean z2 = false;
            Bitmap bitmap2 = null;
            if (this.f39296b != null) {
                try {
                    bitmap2 = BitmapFactory.decodeFileDescriptor(this.f39296b.getFileDescriptor());
                } catch (OutOfMemoryError unused) {
                    z2 = true;
                }
                try {
                    this.f39296b.close();
                } catch (IOException unused2) {
                }
                z = z2;
                bitmap = bitmap2;
            } else {
                bitmap = null;
                z = false;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Handler g = ImageManager.this.f39285d;
            C15189d dVar = new C15189d(this.f39295a, bitmap, z, countDownLatch);
            g.post(dVar);
            try {
                countDownLatch.await();
            } catch (InterruptedException unused3) {
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$d */
    final class C15189d implements Runnable {

        /* renamed from: a */
        private final Uri f39298a;

        /* renamed from: b */
        private final Bitmap f39299b;

        /* renamed from: c */
        private final CountDownLatch f39300c;

        /* renamed from: d */
        private boolean f39301d;

        public C15189d(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.f39298a = uri;
            this.f39299b = bitmap;
            this.f39301d = z;
            this.f39300c = countDownLatch;
        }

        public final void run() {
            C15230c.m44252a("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.f39299b != null;
            if (ImageManager.this.f39287f != null) {
                if (this.f39301d) {
                    ImageManager.this.f39287f.mo3343a();
                    System.gc();
                    this.f39301d = false;
                    ImageManager.this.f39285d.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.f39287f.mo3342a(new C15191b(this.f39298a), this.f39299b);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f39290i.remove(this.f39298a);
            if (imageReceiver != null) {
                ArrayList a = imageReceiver.f39293b;
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    C15190a aVar = (C15190a) a.get(i);
                    if (z) {
                        aVar.mo38491a(ImageManager.this.f39284c, this.f39299b, false);
                    } else {
                        ImageManager.this.f39291j.put(this.f39298a, Long.valueOf(SystemClock.elapsedRealtime()));
                        aVar.mo38492a(ImageManager.this.f39284c, ImageManager.this.f39288g, false);
                    }
                    if (!(aVar instanceof C15192c)) {
                        ImageManager.this.f39289h.remove(aVar);
                    }
                }
            }
            this.f39300c.countDown();
            synchronized (ImageManager.f39282a) {
                ImageManager.f39283b.remove(this.f39298a);
            }
        }
    }
}
