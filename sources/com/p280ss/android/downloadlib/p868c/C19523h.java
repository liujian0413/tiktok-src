package com.p280ss.android.downloadlib.p868c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p280ss.android.download.api.p857a.C19380i;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.downloadlib.activity.TTDelegateActivity;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.addownload.exception.OpenAppException;
import com.p280ss.android.downloadlib.addownload.p864b.C19465d;
import com.p280ss.android.p848c.p849a.p851b.C19236a;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.ugc.aweme.app.C22912d;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.c.h */
public final class C19523h {

    /* renamed from: a */
    static final char[] f52814a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private static Object[] f52815b = new Object[0];

    /* renamed from: c */
    private static Object[] f52816c = new Object[73];

    /* renamed from: a */
    private static String m64310a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f52814a[b >> 4];
                i4 = i6 + 1;
                cArr[i6] = f52814a[b & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static boolean m64325a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new File(str).exists();
        }
        return false;
    }

    /* renamed from: a */
    public static void m64316a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!(jSONObject == null || jSONObject2 == null)) {
            try {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    jSONObject2.put(str, jSONObject.get(str));
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    private static boolean m64319a(Context context, Intent intent) {
        try {
            List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m64320a(Context context, String str) {
        if (context == null) {
            context = C19491j.m64206a();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m64318a(int i, int i2, String str, String str2) {
        if (i2 == 0 && TextUtils.isEmpty(str2)) {
            return true;
        }
        if ((i2 <= 0 || i < i2) && m64303a(str, str2) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m64322a(C19236a aVar) {
        if (aVar == null) {
            return false;
        }
        return m64305a(aVar.f52026e, aVar.f52027f, aVar.f52028g).mo51536a();
    }

    /* renamed from: a */
    public static boolean m64323a(C19387c cVar) {
        if (cVar == null) {
            return false;
        }
        return m64305a(cVar.mo51010s(), cVar.mo51006o(), cVar.mo51007p()).mo51536a();
    }

    /* renamed from: a */
    public static boolean m64321a(Context context, String str, String str2) {
        PackageInfo packageInfo;
        boolean z = false;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0);
                if (packageArchiveInfo == null || !packageArchiveInfo.packageName.equals(str2)) {
                    return false;
                }
                int i = packageArchiveInfo.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
                } catch (NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    if (i == packageInfo.versionCode) {
                        z = true;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return z;
    }

    /* renamed from: a */
    public static void m64313a(Context context, Uri uri) throws OpenAppException {
        if (context == null || uri == null || !"market".equals(uri.getScheme())) {
            throw new OpenAppException(4);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (m64319a(context, intent)) {
                String e = C19521f.m64300e();
                if (m64320a(context, e) && !C19521f.m64299d()) {
                    intent.setPackage(e);
                }
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                throw new OpenAppException(3, 0);
            }
            throw new OpenAppException(4, 1);
        } catch (Exception e2) {
            if (e2 instanceof OpenAppException) {
                throw e2;
            }
            throw new OpenAppException(4, 0);
        }
    }

    /* renamed from: a */
    public static void m64315a(Context context, String str, C19387c cVar) throws OpenAppException {
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                m64314a(context, cVar);
            } else {
                m64333d(context, str);
            }
            throw new OpenAppException(0);
        }
        throw new OpenAppException(0);
    }

    /* renamed from: a */
    private static void m64314a(Context context, C19387c cVar) throws OpenAppException {
        if (context == null) {
            throw new OpenAppException(0);
        } else if (m64323a(cVar)) {
            Intent g = m64337g(context, cVar.mo51010s());
            if (g == null) {
                throw new OpenAppException(0);
            }
            g.putExtra("START_ONLY_FOR_ANDROID", true);
            try {
                context.startActivity(g);
                throw new OpenAppException(2, 0);
            } catch (Exception unused) {
                throw new OpenAppException(0);
            }
        } else {
            throw new OpenAppException(0);
        }
    }

    /* renamed from: a */
    public static byte[] m64326a(byte[] bArr, byte[] bArr2, String str) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
        Mac instance = Mac.getInstance(str);
        instance.init(secretKeySpec);
        return instance.doFinal(bArr);
    }

    /* renamed from: a */
    public static boolean m64324a(BaseException baseException) {
        int errorCode = baseException.getErrorCode();
        String message = baseException.getMessage();
        return errorCode == 1006 || ((errorCode == 1023 || errorCode == 1039 || errorCode == 1040) && !TextUtils.isEmpty(message) && message.contains("ENOSPC (No space left on device)"));
    }

    /* renamed from: a */
    public static void m64312a(Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static boolean m64317a() {
        String str = Build.MODEL;
        String optString = C19491j.m64228i().optString("need_clear_task_reset_list", "");
        if (!TextUtils.isEmpty(optString)) {
            String[] split = optString.split(",");
            if (split != null) {
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static JSONObject m64311a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        m64316a(jSONObject, jSONObject2);
        return jSONObject2;
    }

    /* renamed from: c */
    public static boolean m64332c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.startsWith("http://ad.toutiao.com/advertiser_package/") && !str.startsWith("https://ad.toutiao.com/advertiser_package/")) {
            return m64334d(str);
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m64334d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.startsWith("http://lf3-ttcdn-tos.pstatp.com/") && !str.startsWith("https://lf3-ttcdn-tos.pstatp.com/")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T> T m64306a(T... tArr) {
        for (int i = 0; i < 2; i++) {
            T t = tArr[i];
            if (t != null) {
                return t;
            }
        }
        throw new IllegalArgumentException("args is null");
    }

    /* renamed from: b */
    public static boolean m64330b(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0030 A[SYNTHETIC, Splitter:B:21:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0037 A[SYNTHETIC, Splitter:B:29:0x0037] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m64307a(java.io.File r6) {
        /*
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ Exception -> 0x0034, all -> 0x002c }
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0034, all -> 0x002c }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0034, all -> 0x002c }
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r6]     // Catch:{ Exception -> 0x0035, all -> 0x002a }
        L_0x0013:
            r4 = 0
            int r5 = r2.read(r3, r4, r6)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            if (r5 <= 0) goto L_0x001e
            r1.update(r3, r4, r5)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            goto L_0x0013
        L_0x001e:
            byte[] r6 = r1.digest()     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            java.lang.String r6 = m64309a(r6)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            r2.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            return r6
        L_0x002a:
            r6 = move-exception
            goto L_0x002e
        L_0x002c:
            r6 = move-exception
            r2 = r0
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            r2.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            throw r6
        L_0x0034:
            r2 = r0
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.downloadlib.p868c.C19523h.m64307a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    private static String m64309a(byte[] bArr) {
        if (bArr != null) {
            return m64310a(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    /* renamed from: a */
    public static long m64304a(JSONObject jSONObject, String str) {
        long j;
        if (jSONObject == null) {
            return 0;
        }
        try {
            j = Long.valueOf(jSONObject.optString(str)).longValue();
        } catch (Exception unused) {
            j = 0;
        }
        return j;
    }

    /* renamed from: b */
    private static boolean m64328b(Context context, Intent intent) {
        if (context == null) {
            context = C19491j.m64206a();
        }
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static void m64331c(Context context, String str) throws OpenAppException {
        if (context == null || TextUtils.isEmpty(str)) {
            throw new OpenAppException(4);
        } else if (!C19521f.m64299d() || !m64320a(context, "com.sec.android.app.samsungapps")) {
            StringBuilder sb = new StringBuilder("market://details?id=");
            sb.append(str);
            m64313a(context, Uri.parse(sb.toString()));
        } else {
            m64338h(context, str);
        }
    }

    /* renamed from: e */
    public static boolean m64335e(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addFlags(268435456);
            intent.putExtra(C22912d.f60642b, str);
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
        return true;
    }

    /* renamed from: f */
    public static String m64336f(Context context, String str) {
        String str2 = "";
        if (context == null || TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0);
                if (packageArchiveInfo == null) {
                    return str2;
                }
                str2 = packageArchiveInfo.packageName;
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    /* renamed from: g */
    private static Intent m64337g(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    /* renamed from: h */
    private static void m64338h(Context context, String str) throws OpenAppException {
        try {
            StringBuilder sb = new StringBuilder("http://www.samsungapps.com/appquery/appDetail.as?appId=");
            sb.append(str);
            Uri parse = Uri.parse(sb.toString());
            Intent intent = new Intent();
            intent.setClassName("com.sec.android.app.samsungapps", "com.sec.android.app.samsungapps.Main");
            intent.setData(parse);
            context.startActivity(intent);
            throw new OpenAppException(3, 0);
        } catch (Exception e) {
            if (e instanceof OpenAppException) {
                throw e;
            }
            throw new OpenAppException(4, 0);
        }
    }

    /* renamed from: i */
    private static void m64339i(Context context, String str) throws OpenAppException {
        if (context == null) {
            throw new OpenAppException(0);
        } else if (m64320a(context, str)) {
            Intent g = m64337g(context, str);
            if (g == null) {
                throw new OpenAppException(0);
            }
            g.putExtra("START_ONLY_FOR_ANDROID", true);
            try {
                context.startActivity(g);
                throw new OpenAppException(2, 0);
            } catch (Exception unused) {
                throw new OpenAppException(0);
            }
        } else {
            throw new OpenAppException(0);
        }
    }

    /* renamed from: a */
    public static int m64303a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    if (str.equals(str2)) {
                        return 0;
                    }
                    String[] split = str.split("\\.");
                    String[] split2 = str2.split("\\.");
                    int min = Math.min(split.length, split2.length);
                    int i = 0;
                    int i2 = 0;
                    while (i < min) {
                        i2 = Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
                        if (i2 != 0) {
                            break;
                        }
                        i++;
                    }
                    if (i2 == 0) {
                        for (int i3 = i; i3 < split.length; i3++) {
                            if (Integer.parseInt(split[i3]) > 0) {
                                return 1;
                            }
                        }
                        while (i < split2.length) {
                            if (Integer.parseInt(split2[i]) > 0) {
                                return -1;
                            }
                            i++;
                        }
                        return 0;
                    } else if (i2 > 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
            return -2;
        } catch (Exception unused) {
            return -2;
        }
    }

    /* renamed from: b */
    public static boolean m64329b(Context context, String str) {
        PackageInfo packageInfo;
        boolean z = false;
        if (context == null || str == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0);
                if (packageArchiveInfo == null) {
                    return false;
                }
                String str2 = packageArchiveInfo.packageName;
                int i = packageArchiveInfo.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
                } catch (NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    if (i <= packageInfo.versionCode) {
                        z = true;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return z;
    }

    /* renamed from: d */
    public static void m64333d(Context context, String str) throws OpenAppException {
        if (context != null) {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addFlags(268435456);
            if (m64328b(context, intent)) {
                if (C19491j.m64228i().optInt("open_url_mode") == 0 && C19491j.m64230k() != null && C19491j.m64230k().mo51355a() && VERSION.SDK_INT < 29) {
                    TTDelegateActivity.m63988a(str);
                } else if (C19491j.m64228i().optInt("open_url_mode") != 1 || VERSION.SDK_INT < 26 || VERSION.SDK_INT >= 29) {
                    intent.putExtra(C22912d.f60642b, str);
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context.startActivity(intent);
                } else {
                    TTDelegateActivity.m63988a(str);
                }
                throw new OpenAppException(1, 0);
            }
            throw new OpenAppException(0);
        }
        throw new OpenAppException(0);
    }

    /* renamed from: a */
    public static String m64308a(String str, int i) {
        if (i == 0) {
            return "";
        }
        if (TextUtils.isEmpty(str) || str.length() <= i) {
            return str;
        }
        return str.substring(0, i);
    }

    /* renamed from: b */
    public static void m64327b(Context context, String str, String str2) throws OpenAppException {
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                m64339i(context, str2);
            } else {
                m64333d(context, str);
            }
            throw new OpenAppException(0);
        }
        throw new OpenAppException(0);
    }

    /* renamed from: a */
    public static C19465d m64305a(String str, int i, String str2) {
        C19465d dVar = new C19465d();
        if (TextUtils.isEmpty(str)) {
            return dVar;
        }
        try {
            PackageInfo packageInfo = C19491j.m64206a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                dVar.mo51535a(C19465d.f52707b);
                C19380i h = C19491j.m64227h();
                if (h != null && h.mo51366a() && !m64318a(packageInfo.versionCode, i, packageInfo.versionName, str2)) {
                    dVar.mo51535a(C19465d.f52708c);
                }
            }
        } catch (Exception unused) {
        }
        return dVar;
    }
}
