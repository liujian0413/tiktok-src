package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.facebook.AccessToken;
import com.facebook.C13499h;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13090b;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.internal.z */
public final class C13967z {

    /* renamed from: a */
    private static int f36944a = 0;

    /* renamed from: b */
    private static long f36945b = -1;

    /* renamed from: c */
    private static long f36946c = -1;

    /* renamed from: d */
    private static long f36947d = -1;

    /* renamed from: e */
    private static String f36948e = "";

    /* renamed from: f */
    private static String f36949f = "";

    /* renamed from: g */
    private static String f36950g = "NoCarrier";

    /* renamed from: com.facebook.internal.z$a */
    public interface C13970a {
        /* renamed from: a */
        void mo31807a(FacebookException facebookException);

        /* renamed from: a */
        void mo31808a(JSONObject jSONObject);
    }

    /* renamed from: com.facebook.internal.z$b */
    public interface C13971b<T, K> {
        /* renamed from: a */
        K mo33619a(T t);
    }

    /* renamed from: com.facebook.internal.z$c */
    public static class C13972c {

        /* renamed from: a */
        public List<String> f36953a;

        /* renamed from: b */
        public List<String> f36954b;

        /* renamed from: c */
        public List<String> f36955c;

        public C13972c(List<String> list, List<String> list2, List<String> list3) {
            this.f36953a = list;
            this.f36954b = list2;
            this.f36955c = list3;
        }
    }

    /* renamed from: a */
    public static <T> boolean m41250a(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: a */
    public static boolean m41249a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    public static String m41222a(String str, String str2) {
        return m41249a(str) ? str2 : str;
    }

    /* renamed from: a */
    public static <T> Collection<T> m41229a(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    /* renamed from: a */
    public static String m41226a(byte[] bArr) {
        return m41223a("SHA-1", bArr);
    }

    /* renamed from: a */
    private static String m41223a(String str, byte[] bArr) {
        try {
            return m41224a(MessageDigest.getInstance(str), bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m41224a(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString((b >> 0) & 15));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m41237a(Bundle bundle, String str, String str2) {
        if (!m41249a(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    public static void m41236a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            m41237a(bundle, str, uri.toString());
        }
    }

    /* renamed from: a */
    public static boolean m41246a(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, obj.toString());
        }
        return true;
    }

    /* renamed from: a */
    public static void m41239a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m41243a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: a */
    public static Map<String, String> m41234a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            String optString = jSONObject.optString(str);
            if (optString != null) {
                hashMap.put(str, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m41221a(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            m41239a((Closeable) bufferedInputStream);
                            m41239a((Closeable) inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m41239a((Closeable) bufferedInputStream);
                    m41239a((Closeable) inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                m41239a((Closeable) bufferedInputStream);
                m41239a((Closeable) inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            m41239a((Closeable) bufferedInputStream);
            m41239a((Closeable) inputStreamReader);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m41235a(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(split2[0].trim());
                    sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    instance.setCookie(str, sb.toString());
                }
            }
            instance.removeExpiredCookie();
        }
    }

    /* renamed from: a */
    public static void m41242a(String str, String str2, Throwable th) {
        if (C13499h.m39717c()) {
            m41249a(str);
        }
    }

    /* renamed from: a */
    public static <T> boolean m41248a(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return t.equals(t2);
    }

    /* renamed from: a */
    public static String m41225a(JSONObject jSONObject, String str) {
        return jSONObject != null ? jSONObject.optString(str, "") : "";
    }

    /* renamed from: a */
    public static void m41240a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File a : listFiles) {
                        m41240a(a);
                    }
                }
            }
            file.delete();
        }
    }

    /* renamed from: a */
    public static List<String> m41232a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m41245a(JSONObject jSONObject, C13892b bVar, String str, boolean z) throws JSONException {
        if (!(bVar == null || bVar.f36800a == null)) {
            jSONObject.put("attribution", bVar.f36800a);
        }
        if (!(bVar == null || bVar.mo33547a() == null)) {
            jSONObject.put("advertiser_id", bVar.mo33547a());
            jSONObject.put("advertiser_tracking_enabled", !bVar.f36802c);
        }
        if (!(bVar == null || bVar.f36801b == null)) {
            jSONObject.put("installer_package", bVar.f36801b);
        }
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
    }

    /* renamed from: a */
    public static void m41244a(JSONObject jSONObject, Context context) throws JSONException {
        int i;
        Locale locale;
        int i2;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        m41275f(context);
        String packageName = context.getPackageName();
        String str = "";
        int i3 = 0;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i = packageInfo.versionCode;
            try {
                str = packageInfo.versionName;
            } catch (NameNotFoundException unused) {
            }
        } catch (NameNotFoundException unused2) {
            i = -1;
        }
        jSONArray.put(packageName);
        jSONArray.put(i);
        jSONArray.put(str);
        jSONArray.put(VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused3) {
            locale = Locale.getDefault();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        sb.append("_");
        sb.append(locale.getCountry());
        jSONArray.put(sb.toString());
        jSONArray.put(f36948e);
        jSONArray.put(f36950g);
        double d = 0.0d;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i2 = displayMetrics.widthPixels;
                try {
                    try {
                        d = (double) displayMetrics.density;
                    } catch (Exception unused4) {
                    }
                    i3 = displayMetrics.heightPixels;
                } catch (Exception unused5) {
                }
                jSONArray.put(i2);
                jSONArray.put(i3);
                jSONArray.put(new DecimalFormat("#.##").format(d));
                jSONArray.put(m41260c());
                jSONArray.put(f36946c);
                jSONArray.put(f36947d);
                jSONArray.put(f36949f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (Exception unused6) {
        }
        i2 = 0;
        jSONArray.put(i2);
        jSONArray.put(i3);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        jSONArray.put(m41260c());
        jSONArray.put(f36946c);
        jSONArray.put(f36947d);
        jSONArray.put(f36949f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* renamed from: a */
    public static Method m41227a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m41228a(String str, String str2, Class<?>... clsArr) {
        try {
            return m41227a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T, K> List<K> m41231a(List<T> list, C13971b<T, K> bVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T a : list) {
            Object a2 = bVar.mo33619a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Date m41230a(Bundle bundle, String str, Date date) {
        long j;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            try {
                j = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (j == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (j * 1000));
    }

    /* renamed from: a */
    public static void m41238a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    /* renamed from: a */
    public static Map<String, String> m41233a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m41247a(AccessToken accessToken) {
        return accessToken != null && accessToken.equals(AccessToken.m38225a());
    }

    /* renamed from: a */
    public static void m41241a(final String str, final C13970a aVar) {
        JSONObject a = C13965x.m41206a(str);
        if (a != null) {
            aVar.mo31808a(a);
            return;
        }
        C139681 r0 = new C13090b() {
            /* renamed from: a */
            public final void mo31792a(GraphResponse graphResponse) {
                if (graphResponse.f34704d != null) {
                    aVar.mo31807a(graphResponse.f34704d.f34664n);
                    return;
                }
                C13965x.m41207a(str, graphResponse.f34702b);
                aVar.mo31808a(graphResponse.f34702b);
            }
        };
        GraphRequest f = m41273f(str);
        f.mo31789a((C13090b) r0);
        f.mo31790b();
    }

    /* renamed from: e */
    private static boolean m41271e() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: a */
    public static String m41217a() {
        Context g = C13499h.m39721g();
        if (g == null) {
            return null;
        }
        try {
            return g.getPackageManager().getPackageInfo(g.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static void m41266d() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            f36948e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f36949f = timeZone.getID();
        } catch (AssertionError unused) {
        } catch (Exception unused2) {
        }
    }

    /* renamed from: b */
    public static Locale m41255b() {
        try {
            return C13499h.m39721g().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return Locale.getDefault();
        }
    }

    /* renamed from: c */
    private static int m41260c() {
        if (f36944a > 0) {
            return f36944a;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    return Pattern.matches("cpu[0-9]+", str);
                }
            });
            if (listFiles != null) {
                f36944a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f36944a <= 0) {
            f36944a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f36944a;
    }

    /* renamed from: f */
    private static void m41274f() {
        try {
            if (m41271e()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f36947d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f36947d = m41213a((double) f36947d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    private static void m41276g() {
        try {
            if (m41271e()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f36946c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f36946c = m41213a((double) f36946c);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static long m41213a(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: b */
    public static String m41252b(String str) {
        return m41253b("MD5", str);
    }

    /* renamed from: d */
    public static boolean m41267d(Context context) {
        return m41278h(context);
    }

    /* renamed from: c */
    public static String m41262c(String str) {
        if (str == null) {
            return null;
        }
        return m41253b("SHA-256", str);
    }

    /* renamed from: b */
    public static <T> List<T> m41254b(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            T t = tArr[i];
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static String m41261c(Context context) {
        if (context == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        return context.getClass().getSimpleName();
    }

    /* renamed from: e */
    public static JSONObject m41270e(String str) {
        JSONObject a = C13965x.m41206a(str);
        if (a != null) {
            return a;
        }
        GraphResponse a2 = m41273f(str).mo31788a();
        if (a2.f34704d != null) {
            return null;
        }
        return a2.f34702b;
    }

    /* renamed from: f */
    private static GraphRequest m41273f(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        GraphRequest graphRequest = new GraphRequest(null, "me", bundle, HttpMethod.GET, null);
        return graphRequest;
    }

    /* renamed from: g */
    private static void m41277g(Context context) {
        if (f36950g.equals("NoCarrier")) {
            try {
                f36950g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static boolean m41268d(Uri uri) {
        if (uri == null || !"file".equalsIgnoreCase(uri.getScheme())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m41269e(android.net.Uri r9) {
        /*
            r0 = 0
            android.content.Context r1 = com.facebook.C13499h.m39721g()     // Catch:{ all -> 0x0027 }
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ all -> 0x0027 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r9
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "_size"
            int r0 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0025 }
            r9.moveToFirst()     // Catch:{ all -> 0x0025 }
            long r0 = r9.getLong(r0)     // Catch:{ all -> 0x0025 }
            if (r9 == 0) goto L_0x0024
            r9.close()
        L_0x0024:
            return r0
        L_0x0025:
            r0 = move-exception
            goto L_0x002b
        L_0x0027:
            r9 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
        L_0x002b:
            if (r9 == 0) goto L_0x0030
            r9.close()
        L_0x0030:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C13967z.m41269e(android.net.Uri):long");
    }

    /* renamed from: h */
    private static boolean m41278h(Context context) {
        if (VERSION.SDK_INT < 26) {
            return false;
        }
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null || !autofillManager.isAutofillSupported() || !autofillManager.isEnabled()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static C13972c m41251b(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("permission");
            if (optString != null && !optString.equals("installed")) {
                String optString2 = optJSONObject.optString("status");
                if (optString2 != null) {
                    if (optString2.equals("granted")) {
                        arrayList.add(optString);
                    } else if (optString2.equals("declined")) {
                        arrayList2.add(optString);
                    } else if (optString2.equals("expired")) {
                        arrayList3.add(optString);
                    }
                }
            }
        }
        return new C13972c(arrayList, arrayList2, arrayList3);
    }

    /* renamed from: d */
    public static Bundle m41265d(String str) {
        Bundle bundle = new Bundle();
        if (!m41249a(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), URLDecoder.decode(split2[1], "UTF-8"));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        return bundle;
    }

    /* renamed from: e */
    public static boolean m41272e(Context context) {
        if (VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        if (Build.DEVICE == null || !Build.DEVICE.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static void m41275f(Context context) {
        if (f36945b == -1 || System.currentTimeMillis() - f36945b >= 1800000) {
            f36945b = System.currentTimeMillis();
            m41266d();
            m41277g(context);
            m41276g();
            m41274f();
        }
    }

    /* renamed from: b */
    public static Set<String> m41256b(JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    /* renamed from: c */
    public static boolean m41264c(Uri uri) {
        if (uri == null || !C38347c.f99553h.equalsIgnoreCase(uri.getScheme())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m41218a(int i) {
        return new BigInteger(100, new Random()).toString(32);
    }

    /* renamed from: a */
    public static String m41219a(Context context) {
        C13876aa.m40978a((Object) context, "context");
        C13499h.m39703a(context);
        return C13499h.m39725k();
    }

    /* renamed from: b */
    public static void m41258b(Context context) {
        m41235a(context, "facebook.com");
        m41235a(context, ".facebook.com");
        m41235a(context, "https://facebook.com");
        m41235a(context, "https://.facebook.com");
    }

    /* renamed from: a */
    public static String m41220a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    /* renamed from: b */
    public static boolean m41259b(Uri uri) {
        if (uri == null || (!WebKitApi.SCHEME_HTTP.equalsIgnoreCase(uri.getScheme()) && !WebKitApi.SCHEME_HTTPS.equalsIgnoreCase(uri.getScheme()) && !"fbstaging".equalsIgnoreCase(uri.getScheme()))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m41253b(String str, String str2) {
        return m41223a(str, str2.getBytes());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m41212a(java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0023 }
            r1.<init>(r6)     // Catch:{ all -> 0x0023 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0021 }
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0021 }
            r5 = -1
            if (r4 == r5) goto L_0x0018
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0021 }
            int r3 = r3 + r4
            goto L_0x000c
        L_0x0018:
            r1.close()
            if (r6 == 0) goto L_0x0020
            r6.close()
        L_0x0020:
            return r3
        L_0x0021:
            r7 = move-exception
            goto L_0x0025
        L_0x0023:
            r7 = move-exception
            r1 = r0
        L_0x0025:
            if (r1 == 0) goto L_0x002a
            r1.close()
        L_0x002a:
            if (r6 == 0) goto L_0x002f
            r6.close()
        L_0x002f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C13967z.m41212a(java.io.InputStream, java.io.OutputStream):int");
    }

    /* renamed from: c */
    public static JSONArray m41263c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    /* renamed from: b */
    public static JSONObject m41257b(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    /* renamed from: a */
    public static Object m41215a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        } catch (InvocationTargetException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static Uri m41214a(String str, String str2, Bundle bundle) {
        Builder builder = new Builder();
        builder.scheme(WebKitApi.SCHEME_HTTPS);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    /* renamed from: a */
    public static Object m41216a(JSONObject jSONObject, String str, String str2) throws JSONException {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }
}
