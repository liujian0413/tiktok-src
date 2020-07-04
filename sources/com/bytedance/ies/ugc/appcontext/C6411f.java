package com.bytedance.ies.ugc.appcontext;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.ies.ugc.appcontext.C6399b.C6400a;
import com.bytedance.ies.ugc.appcontext.C6399b.C6402c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.ugc.appcontext.f */
public final class C6411f {
    /* renamed from: a */
    public static final C6402c m19999a(Context context) {
        PackageInfo packageInfo;
        C7573i.m23587b(context, "context");
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception unused) {
            packageInfo = null;
        }
        long j = -1;
        String str = "";
        if (packageInfo != null) {
            str = packageInfo.versionName;
            C7573i.m23582a((Object) str, "packageInfo.versionName");
            j = (long) packageInfo.versionCode;
        }
        return new C6402c(j, str);
    }

    /* renamed from: b */
    public static final C6400a m20001b(Context context) {
        String str;
        long j;
        C7573i.m23587b(context, "context");
        String p = C6399b.m19940p();
        long o = C6399b.m19939o();
        try {
            String a = C6412g.m20003a(context, "SS_VERSION_NAME");
            C7573i.m23582a((Object) a, "ManifestReader.getString…ntext, \"SS_VERSION_NAME\")");
            str = a;
        } catch (Throwable unused) {
            str = p;
        }
        try {
            o = (long) C6412g.m20004b(context, "SS_VERSION_CODE");
        } catch (Throwable unused2) {
        }
        try {
            j = (long) C6412g.m20004b(context, "UPDATE_VERSION_CODE");
        } catch (Throwable unused3) {
            j = -1;
        }
        C6400a aVar = new C6400a(o, str, j);
        return aVar;
    }

    /* renamed from: a */
    public static final String m20000a(Context context, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "keyName");
        try {
            return C6410e.m19992a(context).mo15357a(str, "");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ac, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b2 A[SYNTHETIC, Splitter:B:41:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b9 A[SYNTHETIC, Splitter:B:49:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f9 A[EDGE_INSN: B:83:0x00f9->B:77:0x00f9 ?: BREAK  
    EDGE_INSN: B:83:0x00f9->B:77:0x00f9 ?: BREAK  
    EDGE_INSN: B:83:0x00f9->B:77:0x00f9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f9 A[EDGE_INSN: B:83:0x00f9->B:77:0x00f9 ?: BREAK  
    EDGE_INSN: B:83:0x00f9->B:77:0x00f9 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m20002b(android.content.Context r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            java.lang.String r0 = "channel"
            kotlin.jvm.internal.C7573i.m23587b(r10, r0)
            java.lang.String r0 = "2345"
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r10)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            return r2
        L_0x0016:
            java.lang.String r0 = "META-INF/channel_"
            r3 = 0
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo()     // Catch:{ Exception -> 0x00b6, all -> 0x00ae }
            java.lang.String r9 = r9.sourceDir     // Catch:{ Exception -> 0x00b6, all -> 0x00ae }
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x00b6, all -> 0x00ae }
            r4.<init>(r9)     // Catch:{ Exception -> 0x00b6, all -> 0x00ae }
            java.util.Enumeration r9 = r4.entries()     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
        L_0x0028:
            boolean r5 = r9.hasMoreElements()     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            if (r5 == 0) goto L_0x00a7
            java.lang.Object r5 = r9.nextElement()     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            java.lang.String r6 = "entry"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            java.lang.String r6 = "entry.name"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            if (r6 == 0) goto L_0x004c
            goto L_0x006b
        L_0x004c:
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x006b, all -> 0x00ac }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006b, all -> 0x00ac }
            java.lang.String r8 = ".."
            r7.<init>(r8)     // Catch:{ Exception -> 0x006b, all -> 0x00ac }
            java.lang.String r8 = java.io.File.separator     // Catch:{ Exception -> 0x006b, all -> 0x00ac }
            r7.append(r8)     // Catch:{ Exception -> 0x006b, all -> 0x00ac }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x006b, all -> 0x00ac }
            kotlin.text.Regex r8 = new kotlin.text.Regex     // Catch:{ Exception -> 0x006b, all -> 0x00ac }
            r8.<init>(r7)     // Catch:{ Exception -> 0x006b, all -> 0x00ac }
            java.lang.String r7 = ""
            java.lang.String r6 = r8.replace(r6, r7)     // Catch:{ Exception -> 0x006b, all -> 0x00ac }
            r5 = r6
        L_0x006b:
            r6 = 2
            boolean r7 = kotlin.text.C7634n.m23722b(r5, r0, r3, r6, r2)     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            if (r7 == 0) goto L_0x0028
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            java.lang.String r9 = "_"
            kotlin.text.Regex r0 = new kotlin.text.Regex     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            r0.<init>(r9)     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            r9 = 4
            java.util.List r9 = r0.split(r5, r9)     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            if (r9 == 0) goto L_0x009f
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            java.lang.Object[] r9 = r9.toArray(r0)     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            if (r9 == 0) goto L_0x0097
            java.lang.String[] r9 = (java.lang.String[]) r9     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            if (r9 == 0) goto L_0x00a7
            int r0 = r9.length     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            r5 = 3
            if (r0 < r5) goto L_0x00a7
            r9 = r9[r6]     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            goto L_0x00a8
        L_0x0097:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r9.<init>(r0)     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            throw r9     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
        L_0x009f:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            java.lang.String r0 = "null cannot be cast to non-null type java.util.Collection<T>"
            r9.<init>(r0)     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
            throw r9     // Catch:{ Exception -> 0x00b7, all -> 0x00ac }
        L_0x00a7:
            r9 = r2
        L_0x00a8:
            r4.close()     // Catch:{ Exception -> 0x00bd }
            goto L_0x00bd
        L_0x00ac:
            r9 = move-exception
            goto L_0x00b0
        L_0x00ae:
            r9 = move-exception
            r4 = r2
        L_0x00b0:
            if (r4 == 0) goto L_0x00b5
            r4.close()     // Catch:{ Exception -> 0x00b5 }
        L_0x00b5:
            throw r9
        L_0x00b6:
            r4 = r2
        L_0x00b7:
            if (r4 == 0) goto L_0x00bc
            r4.close()     // Catch:{ Exception -> 0x00bc }
        L_0x00bc:
            r9 = r2
        L_0x00bd:
            if (r9 == 0) goto L_0x0110
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x0110
            int r0 = r9.length()
            r4 = 50
            if (r0 >= r4) goto L_0x0110
            int r0 = r9.length()
            r4 = 0
        L_0x00d2:
            if (r4 >= r0) goto L_0x00f9
            char r5 = r9.charAt(r4)
            r6 = 97
            if (r5 < r6) goto L_0x00e0
            r6 = 122(0x7a, float:1.71E-43)
            if (r5 <= r6) goto L_0x00f6
        L_0x00e0:
            r6 = 65
            if (r5 < r6) goto L_0x00e8
            r6 = 90
            if (r5 <= r6) goto L_0x00f6
        L_0x00e8:
            r6 = 48
            if (r5 < r6) goto L_0x00f0
            r6 = 57
            if (r5 <= r6) goto L_0x00f6
        L_0x00f0:
            r6 = 45
            if (r5 == r6) goto L_0x00f6
            r1 = 0
            goto L_0x00f9
        L_0x00f6:
            int r4 = r4 + 1
            goto L_0x00d2
        L_0x00f9:
            if (r1 == 0) goto L_0x0110
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = "_"
            r0.append(r10)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L_0x0110:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.appcontext.C6411f.m20002b(android.content.Context, java.lang.String):java.lang.String");
    }
}
