package com.p280ss.android.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.p482io.FileUtils;
import com.p280ss.android.common.util.C6773c;
import com.p280ss.android.common.util.C6775g;
import com.p280ss.android.download.p856a.C19362d;
import com.p280ss.android.download.p856a.C19362d.C19363a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import p1896pl.droidsonroids.gif.C48425a;

/* renamed from: com.ss.android.image.k */
public final class C19602k {

    /* renamed from: a */
    C19363a<String, String, String, Void, Object> f53037a;

    /* renamed from: b */
    C19362d<String, String, String, Void, Object> f53038b;

    /* renamed from: c */
    final Context f53039c;

    /* renamed from: d */
    final C6775g f53040d;

    /* renamed from: e */
    final C6773c<String> f53041e;

    /* renamed from: f */
    final C6813b f53042f;

    /* renamed from: g */
    final C19604a f53043g;

    /* renamed from: h */
    boolean f53044h;

    /* renamed from: com.ss.android.image.k$a */
    public interface C19604a {
        /* renamed from: a */
        void mo51794a(String str, Object obj);
    }

    /* renamed from: a */
    public final void mo51789a() {
        this.f53044h = true;
        this.f53038b.mo51330d();
    }

    /* renamed from: b */
    public final void mo51792b() {
        this.f53038b.mo51329c();
    }

    /* renamed from: c */
    public final void mo51793c() {
        this.f53044h = false;
        this.f53038b.mo51328b();
        if (this.f53040d != null) {
            this.f53040d.mo16567a();
        }
    }

    /* renamed from: b */
    private static C48425a m64555b(String str) {
        try {
            return new C48425a(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Bitmap m64554a(String str) {
        try {
            Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(str, -1);
            if (bitmapFromSD == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapFromSD.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
            bitmapFromSD.recycle();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            Options options = new Options();
            options.inPurgeable = true;
            options.inPreferredConfig = Config.RGB_565;
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51790a(String str, Object obj) {
        if (this.f53044h && this.f53043g != null) {
            this.f53043g.mo51794a(str, obj);
        }
    }

    /* renamed from: a */
    public final void mo51791a(String str, String str2) {
        if (this.f53044h) {
            String a = C6306c.m19561a(str);
            if (a == null) {
                this.f53043g.mo51794a(str, null);
            } else {
                this.f53038b.mo51326a(a, str, str2, null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo51788a(String str, String str2, String str3) {
        try {
            String c = this.f53042f.mo16652c(str);
            String e = this.f53042f.mo16654e(str);
            File file = new File(c);
            File file2 = new File(c);
            boolean z = false;
            if (file.isFile() || file2.isFile()) {
                z = true;
            }
            if (!z) {
                String a = this.f53042f.mo16647a(str);
                String b = C6813b.m21186b(str);
                String str4 = str2;
                String str5 = str3;
                z = C19589e.m64525a(this.f53039c, -1, str4, str5, a, this.f53042f.mo16653d(str), b, this.f53041e, this.f53040d);
            }
            if (z) {
                File file3 = new File(c);
                if (!file3.isFile()) {
                    file3 = new File(e);
                    c = e;
                }
                if (!file3.isFile() || !FileUtils.m28673a(file3)) {
                    return m64554a(c);
                }
                return m64555b(c);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public C19602k(Context context, C6775g gVar, C6813b bVar, C6773c<String> cVar, C19604a aVar) {
        this(context, gVar, bVar, cVar, aVar, 16, 2);
    }

    private C19602k(Context context, C6775g gVar, C6813b bVar, C6773c<String> cVar, C19604a aVar, int i, int i2) {
        this.f53039c = context.getApplicationContext();
        this.f53040d = gVar;
        this.f53042f = bVar;
        this.f53043g = aVar;
        this.f53041e = cVar;
        this.f53037a = new C19363a<String, String, String, Void, Object>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Object mo51335a(String str, String str2, String str3) {
                return C19602k.this.mo51788a(str, str2, str3);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo51336a(String str, String str2, String str3, Void voidR, Object obj) {
                C19602k.this.mo51790a(str2, obj);
            }
        };
        this.f53038b = new C19362d<>(16, 2, this.f53037a);
        this.f53044h = true;
    }
}
