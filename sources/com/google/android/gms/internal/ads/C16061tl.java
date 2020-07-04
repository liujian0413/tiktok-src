package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.C15333p;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.tl */
final class C16061tl implements aeg<C15620dd> {

    /* renamed from: a */
    private final /* synthetic */ boolean f45041a;

    /* renamed from: b */
    private final /* synthetic */ double f45042b;

    /* renamed from: c */
    private final /* synthetic */ boolean f45043c;

    /* renamed from: d */
    private final /* synthetic */ String f45044d;

    /* renamed from: e */
    private final /* synthetic */ int f45045e;

    /* renamed from: f */
    private final /* synthetic */ int f45046f;

    /* renamed from: g */
    private final /* synthetic */ C16055tf f45047g;

    C16061tl(C16055tf tfVar, boolean z, double d, boolean z2, String str, int i, int i2) {
        this.f45047g = tfVar;
        this.f45041a = z;
        this.f45042b = d;
        this.f45043c = z2;
        this.f45044d = str;
        this.f45045e = i;
        this.f45046f = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C15620dd mo39249a(InputStream inputStream) {
        Bitmap bitmap;
        Options options = new Options();
        options.inDensity = (int) (this.f45042b * 160.0d);
        if (!this.f45043c) {
            options.inPreferredConfig = Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            bitmap = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Exception e) {
            acd.m45778b("Error grabbing image.", e);
            bitmap = null;
        }
        if (bitmap == null) {
            this.f45047g.mo41986a(2, this.f45041a);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (C15333p.m44598e() && acd.m45439a()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int allocationByteCount = bitmap.getAllocationByteCount();
            long j = uptimeMillis2 - uptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            acd.m45438a(sb.toString());
        }
        C15620dd ddVar = new C15620dd(new BitmapDrawable(Resources.getSystem(), bitmap), Uri.parse(this.f45044d), this.f45042b, this.f45045e, this.f45046f);
        return ddVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo39248a() {
        this.f45047g.mo41986a(2, this.f45041a);
        return null;
    }
}
