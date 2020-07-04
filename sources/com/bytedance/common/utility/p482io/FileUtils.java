package com.bytedance.common.utility.p482io;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.common.utility.io.FileUtils */
public final class FileUtils {

    /* renamed from: a */
    private static final byte[] f26477a = {71, 73, 70, 56, 55, 97};

    /* renamed from: b */
    private static final byte[] f26478b = {71, 73, 70, 56, 57, 97};

    /* renamed from: c */
    private static final byte[] f26479c = {-1, -40, -1};

    /* renamed from: d */
    private static final byte[] f26480d = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: com.bytedance.common.utility.io.FileUtils$ImageType */
    public enum ImageType {
        UNKNOWN,
        JPG,
        PNG,
        GIF
    }

    /* renamed from: a */
    public static boolean m28673a(File file) {
        if (m28677b(file) == ImageType.GIF) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static InputStream m28670a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            return new FileInputStream(file);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static ImageType m28678b(String str) {
        if (!C6319n.m19593a(str)) {
            return m28677b(new File(str));
        }
        return ImageType.UNKNOWN;
    }

    /* renamed from: c */
    public static boolean m28679c(String str) {
        if (!C6319n.m19593a(str)) {
            return new File(str).exists();
        }
        return false;
    }

    /* renamed from: d */
    public static void m28680d(String str) throws Exception {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m28681e(listFiles[i].getAbsolutePath());
                } else if (listFiles[i].isFile()) {
                    listFiles[i].delete();
                }
            }
        }
    }

    /* renamed from: e */
    private static void m28681e(String str) throws Exception {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m28681e(listFiles[i].getAbsolutePath());
                } else {
                    listFiles[i].delete();
                }
            }
            file.delete();
        }
    }

    /* renamed from: a */
    public static String m28671a(Context context) throws NullPointerException {
        String str;
        if (context != null) {
            try {
                if (context.getFilesDir() != null) {
                    str = context.getFilesDir().getPath();
                } else {
                    StringBuilder sb = new StringBuilder("/data/data/");
                    sb.append(context.getPackageName());
                    sb.append("/files/");
                    File dir = context.getDir(sb.toString(), 0);
                    if (dir != null) {
                        str = dir.getPath();
                    }
                    str = null;
                }
            } catch (Throwable unused) {
            }
            if (!C6319n.m19593a(str)) {
                return str;
            }
            throw new NullPointerException("Cannot Create Files Dir");
        }
        throw new NullPointerException("Context is NUll");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0057 A[SYNTHETIC, Splitter:B:42:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x005d A[SYNTHETIC, Splitter:B:48:0x005d] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.common.utility.p482io.FileUtils.ImageType m28677b(java.io.File r3) {
        /*
            if (r3 == 0) goto L_0x0061
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x0009
            goto L_0x0061
        L_0x0009:
            com.bytedance.common.utility.io.FileUtils$ImageType r0 = com.bytedance.common.utility.p482io.FileUtils.ImageType.UNKNOWN
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            r3 = 8
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r2.read(r3)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            byte[] r1 = f26478b     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            boolean r1 = m28676a(r3, r1)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            if (r1 != 0) goto L_0x0049
            byte[] r1 = f26477a     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            boolean r1 = m28676a(r3, r1)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            if (r1 == 0) goto L_0x0029
            goto L_0x0049
        L_0x0029:
            byte[] r1 = f26479c     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            boolean r1 = m28676a(r3, r1)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            if (r1 == 0) goto L_0x0037
            com.bytedance.common.utility.io.FileUtils$ImageType r3 = com.bytedance.common.utility.p482io.FileUtils.ImageType.JPG     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r2.close()     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            return r3
        L_0x0037:
            byte[] r1 = f26480d     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            boolean r3 = m28676a(r3, r1)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            if (r3 == 0) goto L_0x0045
            com.bytedance.common.utility.io.FileUtils$ImageType r3 = com.bytedance.common.utility.p482io.FileUtils.ImageType.PNG     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r2.close()     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            return r3
        L_0x0045:
            r2.close()     // Catch:{ Exception -> 0x0060 }
            goto L_0x0060
        L_0x0049:
            com.bytedance.common.utility.io.FileUtils$ImageType r3 = com.bytedance.common.utility.p482io.FileUtils.ImageType.GIF     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r2.close()     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            return r3
        L_0x004f:
            r3 = move-exception
            goto L_0x0055
        L_0x0051:
            r1 = r2
            goto L_0x005b
        L_0x0053:
            r3 = move-exception
            r2 = r1
        L_0x0055:
            if (r2 == 0) goto L_0x005a
            r2.close()     // Catch:{ Exception -> 0x005a }
        L_0x005a:
            throw r3
        L_0x005b:
            if (r1 == 0) goto L_0x0060
            r1.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            return r0
        L_0x0061:
            com.bytedance.common.utility.io.FileUtils$ImageType r3 = com.bytedance.common.utility.p482io.FileUtils.ImageType.UNKNOWN
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.p482io.FileUtils.m28677b(java.io.File):com.bytedance.common.utility.io.FileUtils$ImageType");
    }

    /* renamed from: a */
    public static void m28672a(String str, int i) {
        try {
            Class cls = Class.forName("android.os.FileUtils");
            if (cls != null) {
                Method method = cls.getMethod("setPermissions", new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                if (method != null) {
                    ((Integer) method.invoke(null, new Object[]{str, Integer.valueOf(420), Integer.valueOf(-1), Integer.valueOf(-1)})).intValue();
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    private static boolean m28676a(byte[] bArr, byte[] bArr2) {
        boolean z = false;
        if (bArr2 == null) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= bArr2.length) {
                z = true;
                break;
            } else if (bArr[i] != bArr2[i]) {
                break;
            } else {
                i++;
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a A[SYNTHETIC, Splitter:B:21:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0030 A[SYNTHETIC, Splitter:B:27:0x0030] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m28675a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0034
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r4)
            if (r0 != 0) goto L_0x0034
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r5)
            if (r0 == 0) goto L_0x0014
            goto L_0x0034
        L_0x0014:
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
            boolean r3 = m28674a(r2, r4, r5)     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            r2.close()     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            return r3
        L_0x0022:
            r3 = move-exception
            r0 = r2
            goto L_0x0028
        L_0x0025:
            r0 = r2
            goto L_0x002e
        L_0x0027:
            r3 = move-exception
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            throw r3
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            return r1
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.p482io.FileUtils.m28675a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x004d A[SYNTHETIC, Splitter:B:37:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0052 A[SYNTHETIC, Splitter:B:41:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0058 A[SYNTHETIC, Splitter:B:47:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x005d A[SYNTHETIC, Splitter:B:51:0x005d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m28674a(java.io.InputStream r4, java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0056, all -> 0x004a }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0056, all -> 0x004a }
            boolean r5 = r2.exists()     // Catch:{ Exception -> 0x0056, all -> 0x004a }
            if (r5 != 0) goto L_0x001c
            boolean r5 = r2.mkdirs()     // Catch:{ Exception -> 0x0056, all -> 0x004a }
            if (r5 != 0) goto L_0x001c
            if (r4 == 0) goto L_0x001b
            r4.close()     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            return r0
        L_0x001c:
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0056, all -> 0x004a }
            r5.<init>(r2, r6)     // Catch:{ Exception -> 0x0056, all -> 0x004a }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0056, all -> 0x004a }
            r6.<init>(r5)     // Catch:{ Exception -> 0x0056, all -> 0x004a }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
        L_0x002a:
            int r2 = r4.read(r5)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            r3 = -1
            if (r2 == r3) goto L_0x0035
            r6.write(r5, r0, r2)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            goto L_0x002a
        L_0x0035:
            r6.flush()     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            r6.close()     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            r4.close()     // Catch:{ Exception -> 0x0056, all -> 0x004a }
            if (r4 == 0) goto L_0x0043
            r4.close()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            r4 = 1
            return r4
        L_0x0045:
            r5 = move-exception
            r1 = r6
            goto L_0x004b
        L_0x0048:
            r1 = r6
            goto L_0x0056
        L_0x004a:
            r5 = move-exception
        L_0x004b:
            if (r1 == 0) goto L_0x0050
            r1.close()     // Catch:{ Exception -> 0x0050 }
        L_0x0050:
            if (r4 == 0) goto L_0x0055
            r4.close()     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            throw r5
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ Exception -> 0x005b }
        L_0x005b:
            if (r4 == 0) goto L_0x0060
            r4.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.p482io.FileUtils.m28674a(java.io.InputStream, java.lang.String, java.lang.String):boolean");
    }
}
