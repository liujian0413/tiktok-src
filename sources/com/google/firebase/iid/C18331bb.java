package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.internal.p762d.C16361b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: com.google.firebase.iid.bb */
final class C18331bb {
    C18331bb() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C18332bc mo47243a(Context context, String str) throws C18335e {
        C18332bc c = m60426c(context, str);
        if (c != null) {
            return c;
        }
        return mo47244b(context, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C18332bc mo47244b(Context context, String str) {
        C18332bc bcVar = new C18332bc(C18334d.m60441a(), System.currentTimeMillis());
        C18332bc a = m60414a(context, str, bcVar, true);
        if (a != null && !a.equals(bcVar)) {
            return a;
        }
        m60420a(context, str, bcVar);
        return bcVar;
    }

    /* renamed from: a */
    static void m60419a(Context context) {
        File[] listFiles;
        for (File file : m60425b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: c */
    private final C18332bc m60426c(Context context, String str) throws C18335e {
        try {
            C18332bc d = m60427d(context, str);
            if (d != null) {
                m60420a(context, str, d);
                return d;
            }
            e = null;
            try {
                C18332bc a = m60415a(C7285c.m22838a(context, "com.google.android.gms.appid", 0), str);
                if (a != null) {
                    m60414a(context, str, a, false);
                    return a;
                }
            } catch (C18335e e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (C18335e e2) {
            e = e2;
        }
    }

    /* renamed from: a */
    private static KeyPair m60418a(String str, String str2) throws C18335e {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                throw new C18335e((Exception) e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C18335e((Exception) e2);
        }
    }

    /* JADX INFO: used method not loaded: com.google.firebase.iid.e.<init>(java.lang.Exception):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.firebase.iid.C18335e((java.lang.Exception) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return m60416a(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C18332bc m60427d(android.content.Context r1, java.lang.String r2) throws com.google.firebase.iid.C18335e {
        /*
            r0 = this;
            java.io.File r1 = m60428e(r1, r2)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x000c
            r1 = 0
            return r1
        L_0x000c:
            com.google.firebase.iid.bc r2 = m60416a(r1)     // Catch:{ e | IOException -> 0x0011 }
            return r2
        L_0x0011:
            com.google.firebase.iid.bc r1 = m60416a(r1)     // Catch:{ IOException -> 0x0016 }
            return r1
        L_0x0016:
            r1 = move-exception
            com.google.firebase.iid.e r2 = new com.google.firebase.iid.e
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C18331bb.m60427d(android.content.Context, java.lang.String):com.google.firebase.iid.bc");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|(2:22|23)|24|25|26) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0056 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[SYNTHETIC, Splitter:B:19:0x0056] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:45:0x0081=Splitter:B:45:0x0081, B:16:0x0052=Splitter:B:16:0x0052, B:24:0x0065=Splitter:B:24:0x0065} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.firebase.iid.C18332bc m60414a(android.content.Context r7, java.lang.String r8, com.google.firebase.iid.C18332bc r9, boolean r10) {
        /*
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r1 = "pub"
            java.lang.String r2 = r9.m60431a()
            r0.setProperty(r1, r2)
            java.lang.String r1 = "pri"
            java.lang.String r2 = r9.m60433b()
            r0.setProperty(r1, r2)
            java.lang.String r1 = "cre"
            long r2 = r9.f49816b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.setProperty(r1, r2)
            java.io.File r7 = m60428e(r7, r8)
            r8 = 0
            r7.createNewFile()     // Catch:{ IOException -> 0x0085 }
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0085 }
            java.lang.String r2 = "rw"
            r1.<init>(r7, r2)     // Catch:{ IOException -> 0x0085 }
            java.nio.channels.FileChannel r7 = r1.getChannel()     // Catch:{ Throwable -> 0x007b, all -> 0x0078 }
            r7.lock()     // Catch:{ Throwable -> 0x006c, all -> 0x0069 }
            r2 = 0
            if (r10 == 0) goto L_0x0056
            long r4 = r7.size()     // Catch:{ Throwable -> 0x006c, all -> 0x0069 }
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x0056
            r7.position(r2)     // Catch:{ e | IOException -> 0x0056 }
            com.google.firebase.iid.bc r10 = m60417a(r7)     // Catch:{ e | IOException -> 0x0056 }
            if (r7 == 0) goto L_0x0052
            m60423a(r8, r7)     // Catch:{ Throwable -> 0x007b, all -> 0x0078 }
        L_0x0052:
            m60422a(r8, r1)     // Catch:{ IOException -> 0x0085 }
            return r10
        L_0x0056:
            r7.position(r2)     // Catch:{ Throwable -> 0x006c, all -> 0x0069 }
            java.io.OutputStream r10 = java.nio.channels.Channels.newOutputStream(r7)     // Catch:{ Throwable -> 0x006c, all -> 0x0069 }
            r0.store(r10, r8)     // Catch:{ Throwable -> 0x006c, all -> 0x0069 }
            if (r7 == 0) goto L_0x0065
            m60423a(r8, r7)     // Catch:{ Throwable -> 0x007b, all -> 0x0078 }
        L_0x0065:
            m60422a(r8, r1)     // Catch:{ IOException -> 0x0085 }
            return r9
        L_0x0069:
            r9 = move-exception
            r10 = r8
            goto L_0x0072
        L_0x006c:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x006e }
        L_0x006e:
            r10 = move-exception
            r6 = r10
            r10 = r9
            r9 = r6
        L_0x0072:
            if (r7 == 0) goto L_0x0077
            m60423a(r10, r7)     // Catch:{ Throwable -> 0x007b, all -> 0x0078 }
        L_0x0077:
            throw r9     // Catch:{ Throwable -> 0x007b, all -> 0x0078 }
        L_0x0078:
            r7 = move-exception
            r9 = r8
            goto L_0x0081
        L_0x007b:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x007d }
        L_0x007d:
            r9 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x0081:
            m60422a(r9, r1)     // Catch:{ IOException -> 0x0085 }
            throw r7     // Catch:{ IOException -> 0x0085 }
        L_0x0085:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C18331bb.m60414a(android.content.Context, java.lang.String, com.google.firebase.iid.bc, boolean):com.google.firebase.iid.bc");
    }

    /* renamed from: b */
    private static File m60425b(Context context) {
        File b = C0683b.m2911b(context);
        if (b == null || !b.isDirectory()) {
            return context.getFilesDir();
        }
        return b;
    }

    /* renamed from: e */
    private static File m60428e(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(m60425b(context), str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        m60421a(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.firebase.iid.C18332bc m60416a(java.io.File r9) throws com.google.firebase.iid.C18335e, java.io.IOException {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r9)
            r9 = 0
            java.nio.channels.FileChannel r7 = r0.getChannel()     // Catch:{ Throwable -> 0x0034 }
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1 = r7
            r1.lock(r2, r4, r6)     // Catch:{ Throwable -> 0x0026, all -> 0x0023 }
            com.google.firebase.iid.bc r1 = m60417a(r7)     // Catch:{ Throwable -> 0x0026, all -> 0x0023 }
            if (r7 == 0) goto L_0x001f
            m60423a(r9, r7)     // Catch:{ Throwable -> 0x0034 }
        L_0x001f:
            m60421a(r9, r0)
            return r1
        L_0x0023:
            r1 = move-exception
            r2 = r9
            goto L_0x002c
        L_0x0026:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r2 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
        L_0x002c:
            if (r7 == 0) goto L_0x0031
            m60423a(r2, r7)     // Catch:{ Throwable -> 0x0034 }
        L_0x0031:
            throw r1     // Catch:{ Throwable -> 0x0034 }
        L_0x0032:
            r1 = move-exception
            goto L_0x0036
        L_0x0034:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0032 }
        L_0x0036:
            m60421a(r9, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C18331bb.m60416a(java.io.File):com.google.firebase.iid.bc");
    }

    /* renamed from: a */
    private static C18332bc m60417a(FileChannel fileChannel) throws C18335e, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new C18335e("Invalid properties file");
        }
        try {
            return new C18332bc(m60418a(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new C18335e((Exception) e);
        }
    }

    /* renamed from: a */
    private static C18332bc m60415a(SharedPreferences sharedPreferences, String str) throws C18335e {
        String string = sharedPreferences.getString(C18303aa.m60358a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(C18303aa.m60358a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new C18332bc(m60418a(string, string2), m60424b(sharedPreferences, str));
    }

    /* renamed from: a */
    private static void m60420a(Context context, String str, C18332bc bcVar) {
        SharedPreferences a = C7285c.m22838a(context, "com.google.android.gms.appid", 0);
        try {
            if (bcVar.equals(m60415a(a, str))) {
                return;
            }
        } catch (C18335e unused) {
        }
        Editor edit = a.edit();
        edit.putString(C18303aa.m60358a(str, "|P|"), bcVar.m60431a());
        edit.putString(C18303aa.m60358a(str, "|K|"), bcVar.m60433b());
        edit.putString(C18303aa.m60358a(str, "cre"), String.valueOf(bcVar.f49816b));
        edit.commit();
    }

    /* renamed from: b */
    private static long m60424b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C18303aa.m60358a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static /* synthetic */ void m60423a(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                C16361b.m53327a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m60422a(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                C16361b.m53327a(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m60421a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C16361b.m53327a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }
}
