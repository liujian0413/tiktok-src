package android.support.p022v4.p025c;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.support.p022v4.content.res.FontResourcesParserCompat;
import android.support.p022v4.graphics.C0725c;
import android.support.p022v4.graphics.C0744g;
import android.support.p022v4.p025c.C0666c.C0671a;
import android.support.p022v4.util.C0894f;
import android.support.p022v4.util.C0903j;
import android.support.p022v4.util.C0904k;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.ttm.player.MediaPlayer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.c.b */
public final class C0658b {

    /* renamed from: a */
    static final C0894f<String, Typeface> f2545a = new C0894f<>(16);

    /* renamed from: b */
    static final Object f2546b = new Object();

    /* renamed from: c */
    static final C0904k<String, ArrayList<C0671a<C0665c>>> f2547c = new C0904k<>();

    /* renamed from: d */
    private static final C0666c f2548d = new C0666c("fonts", 10, VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);

    /* renamed from: e */
    private static final Comparator<byte[]> f2549e = new Comparator<byte[]>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m2852a((byte[]) obj, (byte[]) obj2);
        }

        /* renamed from: a */
        private static int m2852a(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return bArr[i] - bArr2[i];
                }
            }
            return 0;
        }
    };

    /* renamed from: android.support.v4.c.b$a */
    public static class C0663a {

        /* renamed from: a */
        public final int f2557a;

        /* renamed from: b */
        public final C0664b[] f2558b;

        public C0663a(int i, C0664b[] bVarArr) {
            this.f2557a = i;
            this.f2558b = bVarArr;
        }
    }

    /* renamed from: android.support.v4.c.b$b */
    public static class C0664b {

        /* renamed from: a */
        public final Uri f2559a;

        /* renamed from: b */
        public final int f2560b;

        /* renamed from: c */
        public final int f2561c;

        /* renamed from: d */
        public final boolean f2562d;

        /* renamed from: e */
        public final int f2563e;

        public C0664b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f2559a = (Uri) C0903j.m3840a(uri);
            this.f2560b = i;
            this.f2561c = i2;
            this.f2562d = z;
            this.f2563e = i3;
        }
    }

    /* renamed from: android.support.v4.c.b$c */
    static final class C0665c {

        /* renamed from: a */
        final Typeface f2564a;

        /* renamed from: b */
        final int f2565b;

        C0665c(Typeface typeface, int i) {
            this.f2564a = typeface;
            this.f2565b = i;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static C0664b[] m2846a(Context context, C0657a aVar, String str, CancellationSignal cancellationSignal) {
        Cursor query;
        Uri withAppendedId;
        C0657a aVar2 = aVar;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Builder().scheme(C38347c.f99553h).authority(str2).build();
        Uri build2 = new Builder().scheme(C38347c.f99553h).authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            if (VERSION.SDK_INT > 16) {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar2.f2541c}, null, cancellationSignal);
            } else {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar2.f2541c}, null);
            }
            Cursor cursor2 = query;
            if (cursor2 != null && cursor2.getCount() > 0) {
                int columnIndex = cursor2.getColumnIndex("result_code");
                arrayList = new ArrayList();
                int columnIndex2 = cursor2.getColumnIndex("_id");
                int columnIndex3 = cursor2.getColumnIndex("file_id");
                int columnIndex4 = cursor2.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor2.getColumnIndex("font_weight");
                int columnIndex6 = cursor2.getColumnIndex("font_italic");
                while (cursor2.moveToNext()) {
                    int i = columnIndex != -1 ? cursor2.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor2.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, cursor2.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, cursor2.getLong(columnIndex3));
                    }
                    C0664b bVar = new C0664b(withAppendedId, i2, columnIndex5 != -1 ? cursor2.getInt(columnIndex5) : MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, columnIndex6 != -1 && cursor2.getInt(columnIndex6) == 1, i);
                    arrayList.add(bVar);
                }
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            return (C0664b[]) arrayList.toArray(new C0664b[0]);
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static List<byte[]> m2843a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<List<byte[]>> m2842a(C0657a aVar, Resources resources) {
        if (aVar.f2542d != null) {
            return aVar.f2542d;
        }
        return FontResourcesParserCompat.m2950a(resources, aVar.f2543e);
    }

    /* renamed from: a */
    private static boolean m2845a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static C0663a m2840a(Context context, CancellationSignal cancellationSignal, C0657a aVar) throws NameNotFoundException {
        ProviderInfo a = m2838a(context.getPackageManager(), aVar, context.getResources());
        if (a == null) {
            return new C0663a(1, null);
        }
        return new C0663a(0, m2846a(context, aVar, a.authority, null));
    }

    /* renamed from: a */
    private static ProviderInfo m2838a(PackageManager packageManager, C0657a aVar, Resources resources) throws NameNotFoundException {
        String str = aVar.f2539a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            StringBuilder sb = new StringBuilder("No package found for authority: ");
            sb.append(str);
            throw new NameNotFoundException(sb.toString());
        } else if (resolveContentProvider.packageName.equals(aVar.f2540b)) {
            List a = m2843a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f2549e);
            List a2 = m2842a(aVar, resources);
            for (int i = 0; i < a2.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) a2.get(i));
                Collections.sort(arrayList, f2549e);
                if (m2845a(a, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder("Found content provider ");
            sb2.append(str);
            sb2.append(", but package was not ");
            sb2.append(aVar.f2540b);
            throw new NameNotFoundException(sb2.toString());
        }
    }

    /* renamed from: a */
    static C0665c m2841a(Context context, C0657a aVar, int i) {
        try {
            C0663a a = m2840a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a.f2557a == 0) {
                Typeface a2 = C0725c.m3085a(context, null, a.f2558b, i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C0665c(a2, i2);
            }
            if (a.f2557a == 1) {
                i2 = -2;
            }
            return new C0665c(null, i2);
        } catch (NameNotFoundException unused) {
            return new C0665c(null, -1);
        }
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m2844a(Context context, C0664b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0664b bVar : bVarArr) {
            if (bVar.f2563e == 0) {
                Uri uri = bVar.f2559a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C0744g.m3165a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        f2548d.mo2770a((java.util.concurrent.Callable<T>) r1, (android.support.p022v4.p025c.C0666c.C0671a<T>) new android.support.p022v4.p025c.C0658b.C06613<T>());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m2839a(final android.content.Context r2, final android.support.p022v4.p025c.C0657a r3, final android.support.p022v4.content.res.C0700e.C0701a r4, final android.os.Handler r5, boolean r6, int r7, final int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f2544f
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.support.v4.util.f<java.lang.String, android.graphics.Typeface> r1 = f2545a
            java.lang.Object r1 = r1.mo3341a(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x0025
            r4.mo1054a(r1)
        L_0x0025:
            return r1
        L_0x0026:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            android.support.v4.c.b$c r2 = m2841a(r2, r3, r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.f2565b
            if (r3 != 0) goto L_0x003b
            android.graphics.Typeface r3 = r2.f2564a
            r4.mo2847a(r3, r5)
            goto L_0x0040
        L_0x003b:
            int r3 = r2.f2565b
            r4.mo2846a(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.f2564a
            return r2
        L_0x0043:
            android.support.v4.c.b$1 r1 = new android.support.v4.c.b$1
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0057
            android.support.v4.c.c r3 = f2548d     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Object r3 = r3.mo2767a(r1, r7)     // Catch:{ InterruptedException -> 0x0056 }
            android.support.v4.c.b$c r3 = (android.support.p022v4.p025c.C0658b.C0665c) r3     // Catch:{ InterruptedException -> 0x0056 }
            android.graphics.Typeface r3 = r3.f2564a     // Catch:{ InterruptedException -> 0x0056 }
            return r3
        L_0x0056:
            return r2
        L_0x0057:
            if (r4 != 0) goto L_0x005b
            r3 = r2
            goto L_0x0060
        L_0x005b:
            android.support.v4.c.b$2 r3 = new android.support.v4.c.b$2
            r3.<init>(r4, r5)
        L_0x0060:
            java.lang.Object r4 = f2546b
            monitor-enter(r4)
            android.support.v4.util.k<java.lang.String, java.util.ArrayList<android.support.v4.c.c$a<android.support.v4.c.b$c>>> r5 = f2547c     // Catch:{ all -> 0x0095 }
            boolean r5 = r5.containsKey(r0)     // Catch:{ all -> 0x0095 }
            if (r5 == 0) goto L_0x007a
            if (r3 == 0) goto L_0x0078
            android.support.v4.util.k<java.lang.String, java.util.ArrayList<android.support.v4.c.c$a<android.support.v4.c.b$c>>> r5 = f2547c     // Catch:{ all -> 0x0095 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x0095 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0095 }
            r5.add(r3)     // Catch:{ all -> 0x0095 }
        L_0x0078:
            monitor-exit(r4)     // Catch:{ all -> 0x0095 }
            return r2
        L_0x007a:
            if (r3 == 0) goto L_0x0089
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0095 }
            r5.<init>()     // Catch:{ all -> 0x0095 }
            r5.add(r3)     // Catch:{ all -> 0x0095 }
            android.support.v4.util.k<java.lang.String, java.util.ArrayList<android.support.v4.c.c$a<android.support.v4.c.b$c>>> r3 = f2547c     // Catch:{ all -> 0x0095 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0095 }
        L_0x0089:
            monitor-exit(r4)     // Catch:{ all -> 0x0095 }
            android.support.v4.c.c r3 = f2548d
            android.support.v4.c.b$3 r4 = new android.support.v4.c.b$3
            r4.<init>(r0)
            r3.mo2770a(r1, r4)
            return r2
        L_0x0095:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0095 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.p025c.C0658b.m2839a(android.content.Context, android.support.v4.c.a, android.support.v4.content.res.e$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }
}
