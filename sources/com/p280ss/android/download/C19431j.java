package com.p280ss.android.download;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.SystemClock;
import android.webkit.MimeTypeMap;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.download.j */
public final class C19431j {

    /* renamed from: a */
    public static Random f52610a = new Random(SystemClock.uptimeMillis());

    /* renamed from: b */
    private static final Pattern f52611b = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");

    /* renamed from: c */
    private static final Object f52612c = new Object();

    /* renamed from: d */
    private static C19433l f52613d;

    /* renamed from: e */
    private static C19432k f52614e;

    /* renamed from: a */
    public static C19432k m63881a() {
        return f52614e;
    }

    /* renamed from: a */
    static boolean m63890a(String str, File file) {
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            String[] strArr = {file.getCanonicalPath(), Environment.getDownloadCacheDirectory().getCanonicalPath(), Environment.getExternalStorageDirectory().getCanonicalPath()};
            for (int i = 0; i < 3; i++) {
                if (canonicalPath.startsWith(strArr[i])) {
                    return true;
                }
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m63894c() {
        if (f52613d != null) {
            return f52613d.mo51468b();
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m63893b() {
        if (f52613d != null) {
            return f52613d.mo51465a();
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m63889a(Context context) {
        if (f52613d != null) {
            return f52613d.mo51466a(context);
        }
        return true;
    }

    /* renamed from: b */
    public static C11030a m63891b(Context context) {
        if (f52613d != null) {
            return f52613d.mo51467b(context);
        }
        return null;
    }

    /* renamed from: a */
    private static String m63884a(String str) {
        try {
            Matcher matcher = f52611b.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (IllegalStateException unused) {
        }
        return null;
    }

    /* renamed from: b */
    private static String m63892b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < 0 || charAt > 31) && charAt != '\"' && charAt != '*' && charAt != '/' && charAt != ':' && charAt != '<' && charAt != '>' && charAt != '?' && charAt != '\\' && charAt != '|' && charAt != 127) {
                stringBuffer.append(charAt);
                z = false;
            } else if (!z) {
                stringBuffer.append('_');
                z = true;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private static String m63888a(String str, boolean z) {
        String str2;
        if (str != null) {
            str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
            if (str2 != null) {
                StringBuilder sb = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(str2);
                str2 = sb.toString();
            }
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        if (str == null || !str.toLowerCase().startsWith("text/")) {
            if (z) {
                return ".bin";
            }
            return str2;
        } else if (str.equalsIgnoreCase("text/html")) {
            return ".html";
        } else {
            if (z) {
                return ".txt";
            }
            return str2;
        }
    }

    /* renamed from: a */
    private static String m63882a(int i, String str, String str2, boolean z) throws C19436o {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String sb2 = sb.toString();
        if (!new File(sb2).exists() && !z) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("-");
        String sb4 = sb3.toString();
        int i2 = 1;
        for (int i3 = 1; i3 < 1000000000; i3 *= 10) {
            for (int i4 = 0; i4 < 9; i4++) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append(i2);
                sb5.append(str2);
                String sb6 = sb5.toString();
                if (!new File(sb6).exists()) {
                    return sb6;
                }
                i2 += f52610a.nextInt(i3) + 1;
            }
        }
        throw new C19436o(492, "failed to generate an unused filename on internal download storage");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m63885a(java.lang.String r1, int r2, java.lang.String r3, int r4) {
        /*
            if (r1 == 0) goto L_0x001e
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            int r0 = r4 + 1
            java.lang.String r0 = r3.substring(r0)
            java.lang.String r2 = r2.getMimeTypeFromExtension(r0)
            if (r2 == 0) goto L_0x0018
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 != 0) goto L_0x001e
        L_0x0018:
            r2 = 0
            java.lang.String r1 = m63888a(r1, r2)
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = r3.substring(r4)
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.C19431j.m63885a(java.lang.String, int, java.lang.String, int):java.lang.String");
    }

    /* renamed from: a */
    private static String m63886a(String str, String str2, int i, File file) throws C19436o {
        boolean z;
        String str3;
        String a;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf < str.lastIndexOf(47)) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            if (z) {
                str3 = "";
            } else {
                str3 = str.substring(lastIndexOf);
                str = str.substring(0, lastIndexOf);
            }
        } else if (z) {
            str3 = m63888a(str2, true);
        } else {
            str3 = m63885a(str2, i, str, lastIndexOf);
            str = str.substring(0, lastIndexOf);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str3);
        boolean equalsIgnoreCase = "recovery".equalsIgnoreCase(sb.toString());
        if (file != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.getPath());
            sb2.append(File.separator);
            sb2.append(str);
            str = sb2.toString();
        }
        synchronized (f52612c) {
            a = m63882a(i, str, str3, equalsIgnoreCase);
            try {
                File file2 = new File(a);
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file2.createNewFile();
            } catch (IOException e) {
                StringBuilder sb3 = new StringBuilder("Failed to create target file ");
                sb3.append(a);
                throw new C19436o(492, sb3.toString(), e);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static String m63887a(String str, String str2, String str3, String str4, int i) {
        if (str2 == null || str2.endsWith("/")) {
            str2 = null;
        } else {
            int lastIndexOf = str2.lastIndexOf(47) + 1;
            if (lastIndexOf > 0) {
                str2 = str2.substring(lastIndexOf);
            }
        }
        if (str2 == null && str3 != null) {
            str2 = m63884a(str3);
            if (str2 != null) {
                int lastIndexOf2 = str2.lastIndexOf(47) + 1;
                if (lastIndexOf2 > 0) {
                    str2 = str2.substring(lastIndexOf2);
                }
            }
        }
        if (str2 == null && str4 != null) {
            String decode = Uri.decode(str4);
            if (decode != null && !decode.endsWith("/") && decode.indexOf(63) < 0) {
                int lastIndexOf3 = decode.lastIndexOf(47) + 1;
                if (lastIndexOf3 > 0) {
                    str2 = decode.substring(lastIndexOf3);
                } else {
                    str2 = decode;
                }
            }
        }
        if (str2 == null) {
            String decode2 = Uri.decode(str);
            if (decode2 != null && !decode2.endsWith("/") && decode2.indexOf(63) < 0) {
                int lastIndexOf4 = decode2.lastIndexOf(47) + 1;
                if (lastIndexOf4 > 0) {
                    str2 = decode2.substring(lastIndexOf4);
                }
            }
        }
        if (str2 == null) {
            str2 = "downloadfile";
        }
        return m63892b(str2);
    }

    /* renamed from: a */
    static String m63883a(Context context, String str, String str2, String str3, String str4, String str5, int i, long j, C19437p pVar) throws C19436o {
        String str6;
        if (j < 0) {
            j = 0;
        }
        File file = null;
        if (i == 1) {
            str6 = Uri.parse(str2).getPath();
        } else {
            file = pVar.mo51476a(str5, i, j);
            str6 = m63887a(str, str2, str3, str4, i);
        }
        pVar.mo51480b(i, str6, j);
        return m63886a(str6, str5, i, file);
    }
}
