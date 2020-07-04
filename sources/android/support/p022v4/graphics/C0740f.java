package android.support.p022v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.p022v4.content.res.FontResourcesParserCompat.C0694b;
import android.support.p022v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import android.support.p022v4.p025c.C0658b.C0664b;
import com.p280ss.ttm.player.MediaPlayer;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: android.support.v4.graphics.f */
class C0740f {

    /* renamed from: android.support.v4.graphics.f$a */
    interface C0743a<T> {
        /* renamed from: a */
        boolean mo2946a(T t);

        /* renamed from: b */
        int mo2947b(T t);
    }

    C0740f() {
    }

    /* renamed from: a */
    private C0694b m3147a(FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, int i) {
        return (C0694b) m3148a(fontFamilyFilesResourceEntry.f2650a, i, new C0743a<C0694b>() {
            /* renamed from: a */
            private static int m3157a(C0694b bVar) {
                return bVar.f2655b;
            }

            /* renamed from: b */
            private static boolean m3158b(C0694b bVar) {
                return bVar.f2656c;
            }

            /* renamed from: a */
            public final /* synthetic */ boolean mo2946a(Object obj) {
                return m3158b((C0694b) obj);
            }

            /* renamed from: b */
            public final /* synthetic */ int mo2947b(Object obj) {
                return m3157a((C0694b) obj);
            }
        });
    }

    /* renamed from: a */
    protected static Typeface m3146a(Context context, InputStream inputStream) {
        File a = C0744g.m3163a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0744g.m3169a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0664b mo2945a(C0664b[] bVarArr, int i) {
        return (C0664b) m3148a(bVarArr, i, new C0743a<C0664b>() {
            /* renamed from: a */
            private static int m3153a(C0664b bVar) {
                return bVar.f2561c;
            }

            /* renamed from: b */
            private static boolean m3154b(C0664b bVar) {
                return bVar.f2562d;
            }

            /* renamed from: a */
            public final /* synthetic */ boolean mo2946a(Object obj) {
                return m3154b((C0664b) obj);
            }

            /* renamed from: b */
            public final /* synthetic */ int mo2947b(Object obj) {
                return m3153a((C0664b) obj);
            }
        });
    }

    /* renamed from: a */
    private static <T> T m3148a(T[] tArr, int i, C0743a<T> aVar) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(aVar.mo2947b(t2) - i2) * 2;
            if (aVar.mo2946a(t2) == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (t == null || i4 > i5) {
                t = t2;
                i4 = i5;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo2880a(Context context, FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i) {
        C0694b a = m3147a(fontFamilyFilesResourceEntry, i);
        if (a == null) {
            return null;
        }
        return C0725c.m3084a(context, resources, a.f2659f, a.f2654a, i);
    }

    /* renamed from: a */
    public Typeface mo2879a(Context context, CancellationSignal cancellationSignal, C0664b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo2945a(bVarArr, i).f2559a);
            try {
                Typeface a = m3146a(context, inputStream);
                C0744g.m3167a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C0744g.m3167a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0744g.m3167a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0744g.m3167a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C0744g.m3167a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public Typeface mo2878a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0744g.m3163a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0744g.m3168a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }
}
