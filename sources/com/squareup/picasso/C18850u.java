package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.u */
public abstract class C18850u {

    /* renamed from: com.squareup.picasso.u$a */
    public static final class C18851a {

        /* renamed from: a */
        public final LoadedFrom f50837a;

        /* renamed from: b */
        public final Bitmap f50838b;

        /* renamed from: c */
        public final InputStream f50839c;

        /* renamed from: d */
        public final int f50840d;

        public C18851a(Bitmap bitmap, LoadedFrom loadedFrom) {
            this((Bitmap) C18807ad.m61432a(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        public C18851a(InputStream inputStream, LoadedFrom loadedFrom) {
            this(null, (InputStream) C18807ad.m61432a(inputStream, "stream == null"), loadedFrom, 0);
        }

        C18851a(Bitmap bitmap, InputStream inputStream, LoadedFrom loadedFrom, int i) {
            boolean z;
            boolean z2 = false;
            if (bitmap != null) {
                z = true;
            } else {
                z = false;
            }
            if (inputStream != null) {
                z2 = true;
            }
            if (z2 ^ z) {
                this.f50838b = bitmap;
                this.f50839c = inputStream;
                this.f50837a = (LoadedFrom) C18807ad.m61432a(loadedFrom, "loadedFrom == null");
                this.f50840d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo50059a() {
        return 0;
    }

    /* renamed from: a */
    public abstract C18851a mo50005a(C18846s sVar, int i) throws IOException;

    /* renamed from: a */
    public abstract boolean mo50006a(C18846s sVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo50060a(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo50061b() {
        return false;
    }

    /* renamed from: a */
    static boolean m61579a(Options options) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    static Options m61580c(C18846s sVar) {
        boolean z;
        boolean d = sVar.mo50072d();
        if (sVar.f50807q != null) {
            z = true;
        } else {
            z = false;
        }
        Options options = null;
        if (d || z) {
            options = new Options();
            options.inJustDecodeBounds = d;
            if (z) {
                options.inPreferredConfig = sVar.f50807q;
            }
        }
        return options;
    }

    /* renamed from: a */
    static void m61578a(int i, int i2, Options options, C18846s sVar) {
        m61577a(i, i2, options.outWidth, options.outHeight, options, sVar);
    }

    /* renamed from: a */
    static void m61577a(int i, int i2, int i3, int i4, Options options, C18846s sVar) {
        int i5;
        if (i4 <= i2 && i3 <= i) {
            i5 = 1;
        } else if (i2 == 0) {
            i5 = (int) Math.floor((double) (((float) i3) / ((float) i)));
        } else if (i == 0) {
            i5 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
        } else {
            int floor = (int) Math.floor((double) (((float) i4) / ((float) i2)));
            int floor2 = (int) Math.floor((double) (((float) i3) / ((float) i)));
            if (sVar.f50801k) {
                i5 = Math.max(floor, floor2);
            } else {
                i5 = Math.min(floor, floor2);
            }
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }
}
