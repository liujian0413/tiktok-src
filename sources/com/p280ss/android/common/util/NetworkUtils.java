package com.p280ss.android.common.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.CookieManager;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.common.p852c.C19273a;
import com.p280ss.android.common.p852c.C19279b;
import com.p280ss.android.common.p852c.C19280c;
import com.p280ss.android.common.p852c.C19281d;
import com.p280ss.android.common.p852c.p853a.C19274a;
import com.p280ss.android.http.legacy.C19568b;
import com.p280ss.android.http.legacy.C19572d;
import com.p280ss.android.http.legacy.C6809a;
import com.p280ss.android.http.legacy.client.p297a.C19571b;
import com.p280ss.android.http.legacy.p296a.C19561a;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.http.legacy.p296a.C6810f;
import com.p280ss.android.http.legacy.p875b.C19569a;
import com.p280ss.android.http.legacy.p877d.C19573a;
import com.p280ss.android.p294e.C6806b;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.SSLException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.util.NetworkUtils */
public class NetworkUtils {
    private static int isForceHttps = 1;
    private static volatile boolean mAllowKeepAlive = true;
    private static volatile long mLocalTime = -1;
    private static volatile long mServerTime = -1;
    private static C6764c sApiInterceptor = null;
    private static C6766a sApiLibSelector = null;
    private static C6763b sApiProcessHook = null;
    private static Context sAppContext = null;
    private static C6767d sCommandListener = null;
    private static final Object sCookieLock = new Object();
    private static volatile boolean sCookieMgrInited = false;
    private static volatile boolean sHasRebuildSsl = false;
    private static C6769f sMonitorProcessHook = null;
    private static ArrayList<String> sNoHttpWhiteList = new ArrayList<>();
    private static volatile C6771h sServerTimeFromResponse = null;
    private static String sShareCookieHost = ".snssdk.com";
    private static volatile int sUseDnsMapping = -1;
    private static String sUserAgent = null;

    /* renamed from: com.ss.android.common.util.NetworkUtils$b */
    public interface C6763b {
        /* renamed from: a */
        String mo16552a(String str, boolean z);

        /* renamed from: a */
        void mo16553a();

        /* renamed from: a */
        void mo16554a(List<C19565e> list, boolean z);
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$c */
    public interface C6764c {
        String filterUrl(String str);

        List<String> getShareCookie(CookieManager cookieManager, String str);

        List<String> getShareCookieHostList(String str);

        String tryDnsMapping(String str, String[] strArr);
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$CompressType */
    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private CompressType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$NetworkType */
    public enum NetworkType {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        private NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$a */
    public interface C6766a {
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$d */
    public interface C6767d {
        /* renamed from: a */
        String mo16556a();

        /* renamed from: a */
        void mo16557a(List<String> list);
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$e */
    public static class C6768e {

        /* renamed from: a */
        public String f19266a;
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$f */
    public interface C6769f {
        /* renamed from: a */
        void mo16558a(long j, long j2, String str, String str2, C6768e eVar);

        /* renamed from: a */
        void mo16559a(long j, long j2, String str, String str2, C6768e eVar, Throwable th);
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$g */
    public interface C6770g {
        /* renamed from: a */
        URI mo16560a();

        /* renamed from: b */
        void mo16561b();
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$h */
    public interface C6771h {
        /* renamed from: a */
        long mo16562a(String str);
    }

    public static String filterUrl(String str) {
        return C19289f.m63208a(str);
    }

    public static boolean getAllowKeepAlive() {
        return mAllowKeepAlive;
    }

    public static C6764c getApiRequestInterceptor() {
        return sApiInterceptor;
    }

    public static Context getAppContext() {
        return sAppContext;
    }

    public static C6767d getCommandListener() {
        return sCommandListener;
    }

    public static boolean getHasRebuildSsl() {
        return sHasRebuildSsl;
    }

    public static int getIsForceHttps() {
        return isForceHttps;
    }

    public static int getServerTime() {
        return C19289f.m63207a();
    }

    public static String getShareCookieHost() {
        return sShareCookieHost;
    }

    public static String getUserAgent() {
        return sUserAgent;
    }

    public static void handleTimeStampFromResponse(String str) {
    }

    public static String executeGet(int i, String str) throws Exception {
        return executeGet(0, i, str, true, true);
    }

    public static String executeGet(int i, String str, int i2, int i3) throws Exception {
        return executeGet(0, i, str, true, true, null, (C6810f) null, true);
    }

    public static String executeGet(int i, String str, boolean z) throws Exception {
        return executeGet(0, i, str, z, true);
    }

    public static String executeGet(int i, String str, boolean z, boolean z2) throws Exception {
        return executeGet(0, i, str, z, z2, null, (C6810f) null, true);
    }

    public static String executeGet(int i, String str, boolean z, boolean z2, List<C6809a> list, C6810f fVar, boolean z3) throws Exception {
        return executeGet(0, i, str, z, z2, list, fVar, z3);
    }

    public static String executeGet(int i, String str, List<C19565e> list) throws Exception {
        return executeGet(0, i, str, true, true, list);
    }

    public static String executeGet(int i, String str, int i2, int i3, List<C19565e> list) throws Exception {
        return executeGet(0, i, str, true, true, null, null, true, list);
    }

    public static String executeGet(int i, String str, boolean z, List<C19565e> list) throws Exception {
        return executeGet(0, i, str, z, true, list);
    }

    public static String executeGet(int i, String str, boolean z, boolean z2, List<C19565e> list) throws Exception {
        return executeGet(0, i, str, z, z2, null, null, true, list);
    }

    public static String executeGet(int i, String str, boolean z, boolean z2, List<C6809a> list, C6810f fVar, boolean z3, List<C19565e> list2) throws Exception {
        return executeGet(0, i, str, z, z2, list, fVar, z3, list2);
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2, List<C6809a> list, C6810f fVar, boolean z3, List<C19565e> list2) throws Exception {
        String str2 = str;
        try {
            return executeGetRetry(i, i2, addGetRetryCountParam(filterUrl(str), "no_retry"), z, list, fVar, z3, list2, z2);
        } catch (Exception e) {
            if (TextUtils.isEmpty(str) || !str.startsWith(WebKitApi.SCHEME_HTTPS) || (!(e instanceof SSLException) && !(e instanceof GeneralSecurityException))) {
                return executeGetRetry(i, i2, addGetRetryCountParam(filterUrl(str), "first_retry"), z, list, fVar, z3, list2, z2);
            } else if (!isHitWhiteList(str)) {
                return executeGetRetry(i, i2, addGetRetryCountParam(str, "retry_http"), z, list, fVar, z3, list2, z2);
            } else {
                return executeGetRetry(i, i2, addGetRetryCountParam(filterUrl(str), "first_retry"), z, list, fVar, z3, list2, z2);
            }
        }
    }

    public static String executePost(int i, String str, List<C19565e> list, C19281d[] dVarArr) throws Exception {
        return executePost(0, i, str, list, dVarArr);
    }

    public static String executePost(String str, JSONObject jSONObject, String str2, List<C6809a> list) throws Exception {
        byte[] bytes;
        if (str2 == null || !str2.startsWith("application/json")) {
            ArrayList arrayList = new ArrayList();
            jsonObjectToBasicNameValuePairs(arrayList, jSONObject, "");
            return executePost(0, 0, str, (List<C19565e>) arrayList, (C19281d[]) null, list);
        }
        if (jSONObject == null) {
            bytes = null;
        } else {
            bytes = jSONObject.toString().getBytes("UTF-8");
        }
        return executePost(-1, str, bytes, CompressType.GZIP, str2, list);
    }

    public static String executePost(int i, String str, byte[] bArr, CompressType compressType, String str2) throws Exception {
        return executePost(i, str, bArr, compressType, str2, null);
    }

    public static String executePost(int i, String str, byte[] bArr, CompressType compressType, String str2, List<C6809a> list) throws Exception {
        if (str == null) {
            return null;
        }
        return execute("post", i, addCommonParams(str, true), bArr, compressType, str2, list);
    }

    public static boolean getUseDnsMapping() {
        if (sUseDnsMapping > 0) {
            return true;
        }
        return false;
    }

    public static int getServerTime$___twin___() {
        long currentTimeMillis = System.currentTimeMillis();
        if (mServerTime > 0) {
            currentTimeMillis = (mServerTime + System.currentTimeMillis()) - mLocalTime;
        }
        return (int) (currentTimeMillis / 1000);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.CookieManager tryNecessaryInit() {
        /*
            java.lang.Object r0 = sCookieLock
            monitor-enter(r0)
            boolean r1 = sCookieMgrInited     // Catch:{ all -> 0x0025 }
            r2 = 1
            if (r1 != 0) goto L_0x000f
            r3 = 1500(0x5dc, double:7.41E-321)
            java.lang.Thread.sleep(r3)     // Catch:{ Exception -> 0x000d }
        L_0x000d:
            sCookieMgrInited = r2     // Catch:{ all -> 0x0025 }
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            com.ss.android.common.util.NetworkUtils$b r0 = sApiProcessHook
            if (r0 == 0) goto L_0x0017
            r0.mo16553a()
        L_0x0017:
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            boolean r1 = r0.acceptCookie()
            if (r1 != 0) goto L_0x0024
            r0.setAcceptCookie(r2)
        L_0x0024:
            return r0
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.util.NetworkUtils.tryNecessaryInit():android.webkit.CookieManager");
    }

    public static void setAllowKeepAlive(boolean z) {
        mAllowKeepAlive = z;
    }

    public static void setApiLibrarySelector(C6766a aVar) {
        sApiLibSelector = aVar;
    }

    public static void setApiProcessHook(C6763b bVar) {
        sApiProcessHook = bVar;
    }

    public static void setApiRequestInterceptor(C6764c cVar) {
        sApiInterceptor = cVar;
    }

    public static void setAppContext(Context context) {
        sAppContext = context;
    }

    public static void setCommandListener(C6767d dVar) {
        sCommandListener = dVar;
    }

    public static void setHasRebuildSsl(boolean z) {
        sHasRebuildSsl = z;
    }

    public static void setIsForceHttps(int i) {
        isForceHttps = i;
    }

    public static void setMonitorProcessHook(C6769f fVar) {
        sMonitorProcessHook = fVar;
    }

    public static void setNoHttpWhiteList(ArrayList<String> arrayList) {
        sNoHttpWhiteList = arrayList;
    }

    public static void setServerTimeFromResponse(C6771h hVar) {
        sServerTimeFromResponse = hVar;
    }

    public static void setShareCookieHost(String str) {
        sShareCookieHost = str;
    }

    public static void setUseDnsMapping(int i) {
        sUseDnsMapping = i;
    }

    public static void safeClose(Closeable closeable) {
        safeClose(closeable, null);
    }

    public static String filterUrl$___twin___(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        C6764c cVar = sApiInterceptor;
        if (cVar != null) {
            str = cVar.filterUrl(str);
        }
        return str;
    }

    public static String getNetworkAccessType(Context context) {
        return getNetworkAccessType(getNetworkType(context));
    }

    public static List<String> getShareCookieHostList(String str) {
        C6764c cVar = sApiInterceptor;
        if (cVar != null) {
            return cVar.getShareCookieHostList(str);
        }
        return null;
    }

    public static void setTimeout(URLConnection uRLConnection) {
        if (uRLConnection != null) {
            uRLConnection.setConnectTimeout(IAVService.MUSIC_LENGTH_FOR_COPYRIGHT);
            uRLConnection.setReadTimeout(IAVService.MUSIC_LENGTH_FOR_COPYRIGHT);
        }
    }

    public static void setUserAgent(HttpParams httpParams) {
        String str = sUserAgent;
        if (!TextUtils.isEmpty(str)) {
            C19569a.m64474a(httpParams, str);
        }
    }

    public static String getEtag(C6810f fVar) {
        if (fVar == null) {
            return null;
        }
        C6809a b = fVar.mo16641b("ETag");
        if (b != null) {
            return b.mo16636b();
        }
        return null;
    }

    public static String getLastModified(C6810f fVar) {
        if (fVar == null) {
            return null;
        }
        C6809a b = fVar.mo16641b("Last-Modified");
        if (b != null) {
            return b.mo16636b();
        }
        return null;
    }

    public static String getMacAddress(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getMacAddress();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String getNetworkOperatorCode(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
        } catch (Exception unused) {
            return "unkown";
        }
    }

    public static boolean isMobile(Context context) {
        NetworkType networkType = getNetworkType(context);
        if (NetworkType.MOBILE_2G == networkType || NetworkType.MOBILE_3G == networkType || NetworkType.MOBILE_4G == networkType || NetworkType.MOBILE == networkType) {
            return true;
        }
        return false;
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean testIsSSBinary(String str) {
        if (str == null) {
            return false;
        }
        int indexOf = str.indexOf("application/octet-stream");
        if (indexOf >= 0) {
            indexOf = str.indexOf("ssmix=", indexOf + 24);
        }
        if (indexOf > 0) {
            return true;
        }
        return false;
    }

    public static long extractMaxAge(C6810f fVar) {
        if (fVar == null) {
            return -1;
        }
        C6809a b = fVar.mo16641b("Cache-Control");
        if (b == null) {
            return -1;
        }
        try {
            C19568b[] c = b.mo16637c();
            if (c != null) {
                for (C19568b bVar : c) {
                    if ("max-age".equals(bVar.mo51713a())) {
                        String b2 = bVar.mo51714b();
                        if (b2 != null) {
                            return Long.parseLong(b2);
                        }
                        return -1;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public static String getNetworkAccessType(NetworkType networkType) {
        String str = "";
        try {
            switch (networkType) {
                case WIFI:
                    return "wifi";
                case MOBILE_2G:
                    return "2g";
                case MOBILE_3G:
                    return "3g";
                case MOBILE_4G:
                    return "4g";
                case MOBILE:
                    str = "mobile";
                    break;
            }
        } catch (Exception unused) {
        }
        return str;
    }

    private static boolean isHitWhiteList(String str) {
        if (isForceHttps == 1) {
            return true;
        }
        if (TextUtils.isEmpty(str) || sNoHttpWhiteList == null || sNoHttpWhiteList.isEmpty()) {
            return false;
        }
        Iterator it = sNoHttpWhiteList.iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWifi(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    if (1 == activeNetworkInfo.getType()) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Pair<String, String> parseContentType(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        C19568b[] c = new C19561a("Content-Type", str).mo16637c();
        if (c.length == 0) {
            return null;
        }
        int i = 0;
        C19568b bVar = c[0];
        String a = bVar.mo51713a();
        C19572d[] c2 = bVar.mo51715c();
        if (c2 != null) {
            int length = c2.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                C19572d dVar = c2[i];
                if ("charset".equalsIgnoreCase(dVar.mo51722a())) {
                    str2 = dVar.mo51723b();
                    break;
                }
                i++;
            }
        }
        return new Pair<>(a, str2);
    }

    public static void setDefaultUserAgent(String str) {
        if (str != null) {
            try {
                char[] charArray = str.toCharArray();
                int length = charArray.length;
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    if (charArray[i] < ' ' || charArray[i] > '~') {
                        charArray[i] = '?';
                        z = true;
                    }
                }
                if (z) {
                    str = new String(charArray);
                }
            } catch (Exception unused) {
            }
        }
        sUserAgent = str;
    }

    public static NetworkType getNetworkType(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return NetworkType.WIFI;
                    }
                    if (type != 0) {
                        return NetworkType.MOBILE;
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return NetworkType.MOBILE_2G;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return NetworkType.MOBILE_3G;
                        case 13:
                            return NetworkType.MOBILE_4G;
                        default:
                            return NetworkType.MOBILE;
                    }
                }
            }
            return NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkType.MOBILE;
        }
    }

    public static void handleTimeStampFromResponse$___twin___(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (sServerTimeFromResponse != null) {
                long a = sServerTimeFromResponse.mo16562a(str);
                if (a > 0) {
                    mServerTime = a;
                    mLocalTime = System.currentTimeMillis();
                }
                return;
            }
            try {
                long optLong = ((JSONObject) new JSONObject(str).get("extra")).optLong("now", -1);
                if (optLong >= 0) {
                    mServerTime = optLong;
                    mLocalTime = System.currentTimeMillis();
                }
            } catch (Exception unused) {
            }
        }
    }

    private static void putCommonParams(List<C19565e> list, boolean z) {
        C6763b bVar = sApiProcessHook;
        if (bVar != null) {
            bVar.mo16554a(list, z);
        }
    }

    public static String addCommonParams(String str, boolean z) {
        C6763b bVar = sApiProcessHook;
        if (bVar != null) {
            return bVar.mo16552a(str, z);
        }
        return str;
    }

    public static byte[] downloadFile(int i, String str) throws Exception {
        C19279b a = C19273a.m63155a();
        if (a != null) {
            return a.mo26329a(i, str);
        }
        return null;
    }

    public static List<String> getShareCookie(CookieManager cookieManager, String str) {
        C6764c cVar = sApiInterceptor;
        if (cVar != null) {
            return cVar.getShareCookie(cookieManager, str);
        }
        return null;
    }

    private static void safeClose(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    private static String addGetRetryCountParam(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        C19290j jVar = new C19290j(str);
        jVar.mo51188a("retry_type", str2);
        return jVar.toString();
    }

    private static List<C19565e> addPostRetryCountParam(List<C19565e> list, String str) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(new C19565e("retry_type", str));
        return list;
    }

    private static String joinCommonParams(String str, List<C19565e> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(C19571b.m64477a(list, "UTF-8"));
        return sb.toString();
    }

    public static String tryDnsMapping(String str, String[] strArr) {
        NetworkType networkType;
        int i;
        if (sUseDnsMapping <= 0 || strArr == null || strArr.length <= 0) {
            return str;
        }
        if (str != null && str.startsWith("https://")) {
            return str;
        }
        if (sAppContext != null) {
            networkType = getNetworkType(sAppContext.getApplicationContext());
        } else {
            networkType = null;
        }
        if (networkType == null) {
            return str;
        }
        switch (networkType) {
            case WIFI:
                i = 1;
                break;
            case MOBILE_2G:
            case MOBILE:
                i = 4;
                break;
            case MOBILE_3G:
            case MOBILE_4G:
                i = 2;
                break;
            default:
                i = 0;
                break;
        }
        if ((i & sUseDnsMapping) == 0) {
            return str;
        }
        C6764c cVar = sApiInterceptor;
        if (cVar == null) {
            return str;
        }
        String tryDnsMapping = cVar.tryDnsMapping(str, strArr);
        if (!TextUtils.isEmpty(tryDnsMapping)) {
            return tryDnsMapping;
        }
        strArr[0] = null;
        return str;
    }

    public static String executeGet(int i, int i2, String str) throws Exception {
        return executeGet(i, i2, str, true, true);
    }

    public static void handleApiOk(String str, long j, C6768e eVar) {
        TextUtils.isEmpty(str);
        C6806b.m21144a().mo16631b(str);
    }

    public static void addCacheValidationHeaders(List<C6809a> list, String str, String str2) {
        if (list != null) {
            if (!TextUtils.isEmpty(str)) {
                list.add(new C19561a("If-None-Match", str));
            }
            if (!TextUtils.isEmpty(str2)) {
                list.add(new C19561a("If-Modified-Since", str2));
            }
        }
    }

    private static String decodeSSBinary(byte[] bArr, int i, String str) throws IOException {
        if (bArr == null || i <= 0) {
            return null;
        }
        byte[] bArr2 = {-99, -114, Byte.MAX_VALUE, 90};
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % 4]);
        }
        return new String(bArr, 0, i, str);
    }

    private static void jsonObjectToBasicNameValuePairs(List<C19565e> list, JSONObject jSONObject, String str) throws JSONException {
        String str2;
        String str3;
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str4 = (String) keys.next();
                if (TextUtils.isEmpty(str)) {
                    str2 = str4;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("[");
                    sb.append(str4);
                    sb.append("]");
                    str2 = sb.toString();
                }
                Object obj = jSONObject.get(str4);
                if (obj instanceof JSONObject) {
                    jsonObjectToBasicNameValuePairs(list, (JSONObject) obj, str2);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        jsonObjectToBasicNameValuePairs(list, jSONArray.getJSONObject(i), str2);
                    }
                } else {
                    if (obj == null) {
                        str3 = "";
                    } else {
                        str3 = obj.toString();
                    }
                    list.add(new C19565e(str2, str3));
                }
            }
        }
    }

    public static byte[] stream2ByteArray(int i, InputStream inputStream, long j) throws IOException {
        if (inputStream == null) {
            return null;
        }
        if (j > 2147483647L) {
            inputStream.close();
            return null;
        }
        if (j < 0) {
            j = 4096;
        } else if (j > ((long) i)) {
            inputStream.close();
            return null;
        }
        try {
            C19573a aVar = new C19573a((int) j);
            byte[] bArr = new byte[4096];
            int i2 = 0;
            do {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    aVar.mo51732a(bArr, 0, read);
                    i2 += read;
                } else {
                    byte[] a = aVar.mo51733a();
                    inputStream.close();
                    return a;
                }
            } while (i2 <= i);
            return null;
        } finally {
            inputStream.close();
        }
    }

    public static String executePost(int i, String str, C19274a aVar) throws Exception {
        return executePost(0, i, str, aVar, (C19281d[]) null);
    }

    public static String executePost(int i, String str, List<C19565e> list) throws Exception {
        return executePost(0, i, str, list, (C19281d[]) null);
    }

    public static String executePost(int i, int i2, String str, C19274a aVar) throws Exception {
        return executePost(i, i2, str, aVar, (C19281d[]) null);
    }

    public static String executePost(int i, int i2, String str, List<C19565e> list) throws Exception {
        return executePost(i, i2, str, list, (C19281d[]) null);
    }

    public static void handleApiError(String str, Throwable th, long j, C6768e eVar) {
        if (!TextUtils.isEmpty(str) && th != null) {
            C6806b.m21144a().mo16630a(str, new Exception(th));
        }
    }

    public static String postFile(int i, String str, String str2, String str3) throws Exception {
        C19274a aVar = new C19274a();
        aVar.mo51160a(str2, new File(str3));
        return executePost(0, i, str, aVar);
    }

    public static String executeGet(int i, int i2, String str, List<C19565e> list) throws Exception {
        return executeGet(i, i2, str, true, true, list);
    }

    public static String executePut(String str, JSONObject jSONObject, String str2, List<C6809a> list) throws Exception {
        byte[] bytes;
        if (str2 == null || !str2.startsWith("application/json")) {
            ArrayList arrayList = new ArrayList();
            jsonObjectToBasicNameValuePairs(arrayList, jSONObject, "");
            return executePut(0, 0, str, (List<C19565e>) arrayList, (C19281d[]) null, list);
        }
        if (jSONObject == null) {
            bytes = null;
        } else {
            bytes = jSONObject.toString().getBytes("UTF-8");
        }
        return executePut(-1, str, bytes, CompressType.GZIP, str2, list);
    }

    public static String executeGet(int i, int i2, String str, boolean z) throws Exception {
        return executeGet(i, i2, str, z, true);
    }

    public static String executePost(int i, String str, C19274a aVar, C19281d[] dVarArr) throws Exception {
        return executePost(0, i, str, aVar, dVarArr);
    }

    public static String executeGet(int i, int i2, String str, int i3, int i4) throws Exception {
        return executeGet(i, i2, str, true, true, null, (C6810f) null, true);
    }

    public static String executePostFile(int i, int i2, String str, C19274a aVar, List<C19565e> list) throws Exception {
        return executePostFile(i, i2, str, aVar, null, list);
    }

    public static String executePostRetry(int i, int i2, String str, List<C19565e> list, C19281d[] dVarArr) throws Exception {
        return executePostRetry(i, i2, str, list, dVarArr, null);
    }

    public static String executeDelete(int i, int i2, String str, List<C6809a> list, List<C19565e> list2) throws Exception {
        if (str == null) {
            return null;
        }
        String addCommonParams = addCommonParams(str, true);
        C19280c b = C19273a.m63156b();
        if (b != null) {
            addCommonParams = b.mo51165a(addCommonParams, list2, true);
        }
        C19279b a = C19273a.m63155a();
        if (a != null) {
            return a.mo26349a(i, i2, addCommonParams, list);
        }
        return null;
    }

    public static String executePost(int i, int i2, String str, List<C19565e> list, C19281d[] dVarArr) throws Exception {
        return executePost(i, i2, str, list, dVarArr, null);
    }

    public static void monitorApiSample(long j, long j2, String str, String str2, C6768e eVar) {
        C6769f fVar = sMonitorProcessHook;
        if (!TextUtils.isEmpty(str) && j > 0 && fVar != null) {
            fVar.mo16558a(j, j2, str, str2, eVar);
        }
    }

    public static String postFile(int i, String str, String str2, String str3, List<C19565e> list) throws Exception {
        C19274a aVar = new C19274a();
        aVar.mo51160a(str2, new File(str3));
        return executePostFile(0, i, str, aVar, list);
    }

    public static String executePost(int i, int i2, String str, C19274a aVar, C19281d[] dVarArr) throws Exception {
        String filterUrl = filterUrl(str);
        try {
            return executePostRetry(i, i2, filterUrl, aVar, dVarArr, addPostRetryCountParam(null, "no_retry"), true);
        } catch (Exception e) {
            if (TextUtils.isEmpty(filterUrl) || !filterUrl.startsWith(WebKitApi.SCHEME_HTTPS) || (!(e instanceof SSLException) && !(e instanceof GeneralSecurityException))) {
                return executePostRetry(i, i2, filterUrl(filterUrl), aVar, dVarArr, addPostRetryCountParam(null, "first_retry"), false);
            }
            return executePostRetry(i, i2, filterUrl, aVar, dVarArr, addPostRetryCountParam(null, "retry_http"), false);
        }
    }

    public static String executeGet(int i, int i2, String str, boolean z, List<C19565e> list) throws Exception {
        return executeGet(i, i2, str, z, true, list);
    }

    public static String response2String(boolean z, boolean z2, int i, InputStream inputStream, String str) throws IOException {
        int i2;
        if (i <= 0) {
            i = 5242880;
        }
        if (i < 1048576) {
            i = 1048576;
        }
        if (inputStream == null) {
            return null;
        }
        if (str == null) {
            str = "UTF-8";
        }
        if (z) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } catch (EOFException e) {
                if (!z || i2 <= 0) {
                    throw e;
                }
            } catch (IOException e2) {
                String message = e2.getMessage();
                if (z && i2 > 0) {
                    if (!"CRC mismatch".equals(message)) {
                        if ("Size mismatch".equals(message)) {
                        }
                    }
                }
                throw e2;
            } catch (Throwable th) {
                safeClose(inputStream);
                throw th;
            }
        }
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        i2 = 0;
        while (true) {
            if (i2 + 4096 > bArr.length) {
                byte[] bArr2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                bArr = bArr2;
            }
            int read = inputStream.read(bArr, i2, 4096);
            if (read <= 0) {
                break;
            }
            i2 += read;
            if (i > 0 && i2 > i) {
                safeClose(inputStream);
                return null;
            }
        }
        if (i2 <= 0) {
            safeClose(inputStream);
            return null;
        } else if (z2) {
            String decodeSSBinary = decodeSSBinary(bArr, i2, str);
            safeClose(inputStream);
            return decodeSSBinary;
        } else {
            String str2 = new String(bArr, 0, i2, str);
            safeClose(inputStream);
            return str2;
        }
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2) throws Exception {
        return executeGet(i, i2, str, z, z2, null, (C6810f) null, true);
    }

    public static String executePut(int i, int i2, String str, List<C19565e> list, C19281d[] dVarArr, List<C6809a> list2) throws Exception {
        return execute("put", i, i2, str, list, dVarArr, list2);
    }

    public static String executePutRetry(int i, int i2, String str, List<C19565e> list, C19281d[] dVarArr, List<C6809a> list2) throws Exception {
        return executetRetry("put", i, i2, str, list, dVarArr, list2);
    }

    public static String executeGet(int i, int i2, String str, int i3, int i4, List<C19565e> list) throws Exception {
        return executeGet(i, i2, str, true, true, null, null, true, list);
    }

    public static String executePostRetry(int i, int i2, String str, List<C19565e> list, C19281d[] dVarArr, List<C6809a> list2) throws Exception {
        return executetRetry("post", i, i2, str, list, dVarArr, list2);
    }

    public static String executePut(int i, String str, byte[] bArr, CompressType compressType, String str2, List<C6809a> list) throws Exception {
        if (str == null) {
            return null;
        }
        return execute("put", i, addCommonParams(str, true), bArr, compressType, str2, list);
    }

    public static void monitorApiError(long j, long j2, String str, String str2, C6768e eVar, Throwable th) {
        if (!TextUtils.isEmpty(str) && th != null) {
            C6769f fVar = sMonitorProcessHook;
            if (fVar != null) {
                fVar.mo16559a(j, j2, str, str2, eVar, th);
            }
        }
    }

    public static String executePost(int i, int i2, String str, List<C19565e> list, C19281d[] dVarArr, List<C6809a> list2) throws Exception {
        return execute("post", i, i2, str, list, dVarArr, list2);
    }

    public static String executePostFile(int i, int i2, String str, C19274a aVar, C19281d[] dVarArr, List<C19565e> list) throws Exception {
        String filterUrl = filterUrl(str);
        try {
            return executePostFileRetry(i, i2, filterUrl, aVar, dVarArr, addPostRetryCountParam(list, "no_retry"), true);
        } catch (Exception e) {
            if (TextUtils.isEmpty(filterUrl) || !filterUrl.startsWith(WebKitApi.SCHEME_HTTPS) || (!(e instanceof SSLException) && !(e instanceof GeneralSecurityException))) {
                return executePostFileRetry(i, i2, filterUrl(filterUrl), aVar, dVarArr, addPostRetryCountParam(list, "first_retry"), false);
            }
            return executePostFileRetry(i, i2, filterUrl, aVar, dVarArr, addPostRetryCountParam(list, "retry_http"), false);
        }
    }

    public static String postFile(int i, String str, String str2, String str3, Map<String, String> map, C19281d[] dVarArr) throws Exception {
        C19274a aVar = new C19274a();
        aVar.mo51160a(str2, new File(str3));
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                aVar.mo51161a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return executePost(0, i, str, aVar, dVarArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String executePost(int r7, int r8, java.lang.String r9, byte[] r10, com.p280ss.android.common.util.NetworkUtils.CompressType r11, java.lang.String r12) throws java.lang.Exception {
        /*
            java.lang.String r3 = filterUrl(r9)
            r9 = 0
            if (r3 != 0) goto L_0x0008
            return r9
        L_0x0008:
            r0 = 0
            if (r10 != 0) goto L_0x000d
            byte[] r10 = new byte[r0]
        L_0x000d:
            int r1 = r10.length
            com.ss.android.common.util.NetworkUtils$CompressType r2 = com.p280ss.android.common.util.NetworkUtils.CompressType.GZIP
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 != r11) goto L_0x0036
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream
            r11.<init>(r4)
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream
            r0.<init>(r11)
            r0.write(r10)     // Catch:{ Throwable -> 0x0032, all -> 0x002d }
            r0.close()
            byte[] r10 = r11.toByteArray()
            java.lang.String r11 = "gzip"
        L_0x002a:
            r4 = r10
            r5 = r11
            goto L_0x006a
        L_0x002d:
            r7 = move-exception
            r0.close()
            throw r7
        L_0x0032:
            r0.close()
            return r9
        L_0x0036:
            com.ss.android.common.util.NetworkUtils$CompressType r2 = com.p280ss.android.common.util.NetworkUtils.CompressType.DEFLATER
            if (r2 != r11) goto L_0x0068
            r11 = 128(0x80, float:1.794E-43)
            if (r1 <= r11) goto L_0x0068
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream
            r11.<init>(r4)
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            r1.<init>()
            r1.setInput(r10)
            r1.finish()
            byte[] r10 = new byte[r4]
        L_0x0050:
            boolean r2 = r1.finished()
            if (r2 != 0) goto L_0x005e
            int r2 = r1.deflate(r10)
            r11.write(r10, r0, r2)
            goto L_0x0050
        L_0x005e:
            r1.end()
            byte[] r10 = r11.toByteArray()
            java.lang.String r11 = "deflate"
            goto L_0x002a
        L_0x0068:
            r5 = r9
            r4 = r10
        L_0x006a:
            com.ss.android.common.c.b r0 = com.p280ss.android.common.p852c.C19273a.m63155a()
            if (r0 == 0) goto L_0x0078
            r1 = r7
            r2 = r8
            r6 = r12
            java.lang.String r7 = r0.mo26324a(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x0078:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.util.NetworkUtils.executePost(int, int, java.lang.String, byte[], com.ss.android.common.util.NetworkUtils$CompressType, java.lang.String):java.lang.String");
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2, List<C19565e> list) throws Exception {
        return executeGet(i, i2, str, z, z2, null, null, true, list);
    }

    public static String executePostFileRetry(int i, int i2, String str, C19274a aVar, C19281d[] dVarArr, List<C19565e> list, boolean z) throws Exception {
        String filterUrl = filterUrl(str);
        if (filterUrl == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        putCommonParams(arrayList, true);
        String joinCommonParams = joinCommonParams(filterUrl, arrayList);
        list.addAll(arrayList);
        C19279b a = C19273a.m63155a();
        if (a != null) {
            return a.mo26321a(i, i2, joinCommonParams, list, aVar, dVarArr);
        }
        return null;
    }

    public static String executePostRetry(int i, int i2, String str, C19274a aVar, C19281d[] dVarArr, List<C19565e> list, boolean z) throws Exception {
        String filterUrl = filterUrl(str);
        if (filterUrl == null) {
            return null;
        }
        putCommonParams(list, true);
        String joinCommonParams = joinCommonParams(filterUrl, list);
        C19279b a = C19273a.m63155a();
        if (a != null) {
            return a.mo26321a(i, i2, joinCommonParams, list, aVar, dVarArr);
        }
        return null;
    }

    public static String postData(int i, String str, String str2, byte[] bArr, String str3, Map<String, String> map, C19281d[] dVarArr) throws Exception {
        C19274a aVar = new C19274a();
        aVar.mo51162a(str2, bArr, str3);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                aVar.mo51161a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return executePost(0, i, str, aVar, dVarArr);
    }

    public static String uploadFile(int i, String str, String str2, String str3, C19288d dVar, long j, C19281d[] dVarArr) throws Exception {
        String filterUrl = filterUrl(str);
        if (filterUrl == null || TextUtils.isEmpty(str3)) {
            return null;
        }
        String str4 = str3;
        File file = new File(str3);
        C19274a aVar = new C19274a();
        String str5 = str2;
        aVar.mo51160a(str2, file);
        ArrayList arrayList = new ArrayList();
        putCommonParams(arrayList, true);
        String joinCommonParams = joinCommonParams(filterUrl, arrayList);
        C19279b a = C19273a.m63155a();
        if (a != null) {
            return a.mo26326a(i, joinCommonParams, aVar, dVar, j, dVarArr);
        }
        return null;
    }

    private static String execute(String str, int i, int i2, String str2, List<C19565e> list, C19281d[] dVarArr, List<C6809a> list2) throws Exception {
        String filterUrl = filterUrl(str2);
        try {
            return executetRetry(str, i, i2, filterUrl, addPostRetryCountParam(list, "no_retry"), dVarArr, list2);
        } catch (Exception unused) {
            if (TextUtils.isEmpty(filterUrl) || !filterUrl.startsWith(WebKitApi.SCHEME_HTTPS)) {
                return executetRetry(str, i, i2, filterUrl(filterUrl), addPostRetryCountParam(list, "first_retry"), dVarArr, list2);
            } else if (!isHitWhiteList(filterUrl)) {
                return executetRetry(str, i, i2, filterUrl, addPostRetryCountParam(list, "retry_http"), dVarArr, list2);
            } else {
                return executetRetry(str, i, i2, filterUrl(filterUrl), addPostRetryCountParam(list, "first_retry"), dVarArr, list2);
            }
        }
    }

    private static String executetRetry(String str, int i, int i2, String str2, List<C19565e> list, C19281d[] dVarArr, List<C6809a> list2) throws Exception {
        if (str2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if ("get".equals(str)) {
            throw new RuntimeException("executetRetry不支持get");
        } else if (!"delete".equals(str)) {
            ArrayList arrayList = new ArrayList();
            putCommonParams(arrayList, true);
            String joinCommonParams = joinCommonParams(str2, arrayList);
            list.addAll(arrayList);
            C19280c b = C19273a.m63156b();
            if (b != null) {
                joinCommonParams = b.mo51165a(joinCommonParams, list, false);
            }
            String str3 = joinCommonParams;
            C19279b a = C19273a.m63155a();
            if (a == null) {
                return null;
            }
            if ("put".equals(str)) {
                return a.mo26351b(i, i2, str3, list, true, dVarArr, list2);
            }
            return a.mo26323a(i, i2, str3, list, true, dVarArr, list2);
        } else {
            throw new RuntimeException("executetRetry不支持delete");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String execute(java.lang.String r9, int r10, java.lang.String r11, byte[] r12, com.p280ss.android.common.util.NetworkUtils.CompressType r13, java.lang.String r14, java.util.List<com.p280ss.android.http.legacy.C6809a> r15) throws java.lang.Exception {
        /*
            java.lang.String r0 = "get"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x00ab
            java.lang.String r0 = "delete"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r4 = filterUrl(r11)
            r11 = 0
            if (r4 == 0) goto L_0x00a2
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x001f
            goto L_0x00a2
        L_0x001f:
            r0 = 0
            if (r12 != 0) goto L_0x0024
            byte[] r12 = new byte[r0]
        L_0x0024:
            int r1 = r12.length
            com.ss.android.common.util.NetworkUtils$CompressType r2 = com.p280ss.android.common.util.NetworkUtils.CompressType.GZIP
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r2 != r13) goto L_0x004d
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream
            r13.<init>(r3)
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream
            r0.<init>(r13)
            r0.write(r12)     // Catch:{ Throwable -> 0x0049, all -> 0x0044 }
            r0.close()
            byte[] r12 = r13.toByteArray()
            java.lang.String r13 = "gzip"
        L_0x0041:
            r5 = r12
            r6 = r13
            goto L_0x0081
        L_0x0044:
            r9 = move-exception
            r0.close()
            throw r9
        L_0x0049:
            r0.close()
            return r11
        L_0x004d:
            com.ss.android.common.util.NetworkUtils$CompressType r2 = com.p280ss.android.common.util.NetworkUtils.CompressType.DEFLATER
            if (r2 != r13) goto L_0x007f
            r13 = 128(0x80, float:1.794E-43)
            if (r1 <= r13) goto L_0x007f
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream
            r13.<init>(r3)
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            r1.<init>()
            r1.setInput(r12)
            r1.finish()
            byte[] r12 = new byte[r3]
        L_0x0067:
            boolean r2 = r1.finished()
            if (r2 != 0) goto L_0x0075
            int r2 = r1.deflate(r12)
            r13.write(r12, r0, r2)
            goto L_0x0067
        L_0x0075:
            r1.end()
            byte[] r12 = r13.toByteArray()
            java.lang.String r13 = "deflate"
            goto L_0x0041
        L_0x007f:
            r6 = r11
            r5 = r12
        L_0x0081:
            com.ss.android.common.c.b r1 = com.p280ss.android.common.p852c.C19273a.m63155a()
            if (r1 == 0) goto L_0x00a1
            java.lang.String r11 = "put"
            boolean r9 = r11.equals(r9)
            if (r9 == 0) goto L_0x0098
            r2 = 0
            r3 = r10
            r7 = r14
            r8 = r15
            java.lang.String r9 = r1.mo26352b(r2, r3, r4, r5, r6, r7, r8)
            return r9
        L_0x0098:
            r2 = 0
            r3 = r10
            r7 = r14
            r8 = r15
            java.lang.String r9 = r1.mo26325a(r2, r3, r4, r5, r6, r7, r8)
            return r9
        L_0x00a1:
            return r11
        L_0x00a2:
            return r11
        L_0x00a3:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "此方法不支持delete"
            r9.<init>(r10)
            throw r9
        L_0x00ab:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "此方法不支持get"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.util.NetworkUtils.execute(java.lang.String, int, java.lang.String, byte[], com.ss.android.common.util.NetworkUtils$CompressType, java.lang.String, java.util.List):java.lang.String");
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2, List<C6809a> list, C6810f fVar, boolean z3) throws Exception {
        return executeGet(i, i2, str, z, z2, list, fVar, z3, null);
    }

    public static String executeGetRetry(int i, int i2, String str, boolean z, List<C6809a> list, C6810f fVar, boolean z2, List<C19565e> list2, boolean z3) throws Exception {
        boolean z4;
        String str2 = str;
        if (str2 == null) {
            return null;
        }
        if (z3) {
            str2 = addCommonParams(str, true);
        }
        if (!mAllowKeepAlive) {
            z4 = false;
        } else {
            z4 = z;
        }
        C19280c b = C19273a.m63156b();
        if (b != null) {
            str2 = b.mo51165a(str2, list2, true);
        }
        String str3 = str2;
        C19279b a = C19273a.m63155a();
        if (a != null) {
            return a.mo26322a(i, i2, str3, list, z4, true, fVar, z2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0152, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0153, code lost:
        r1 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0162, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0163, code lost:
        r5 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r5.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (android.text.TextUtils.isEmpty(r31) != false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r0 = new java.io.File(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r0.exists() == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        r0.mkdirs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        r0 = java.io.File.createTempFile("tempimage", ".tmp", new java.io.File(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x010c, code lost:
        r25.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x010f, code lost:
        if (r15 <= 0) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r14.seek(0);
        r1 = new java.io.FileOutputStream(new java.io.File(r6, r32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r2 = r14.read(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0126, code lost:
        if (r2 == -1) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0128, code lost:
        r1.write(r0, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x012d, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0131, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0132, code lost:
        r13 = r1;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0138, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0139, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r5.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0141, code lost:
        safeClose(null, "close instream exception ");
        safeClose(null, "close outstream exception ");
        safeClose(null, "close random file exception ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0151, code lost:
        return true;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x002d, B:18:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0176 A[SYNTHETIC, Splitter:B:113:0x0176] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean stream2File(java.io.InputStream r25, long r26, com.p280ss.android.common.util.NetworkUtils.C6770g r28, int r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, com.p280ss.android.common.util.C6773c<java.lang.String> r33, java.lang.String r34, com.p280ss.android.common.util.C6775g r35) throws java.lang.Exception {
        /*
            r1 = r25
            r2 = r26
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            if (r1 != 0) goto L_0x0014
            return r10
        L_0x0014:
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r13 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x015c
            r11 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0025
            r2 = 4096(0x1000, double:2.0237E-320)
            goto L_0x0033
        L_0x0025:
            if (r4 <= 0) goto L_0x0033
            long r14 = (long) r4
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            com.ss.android.common.util.DownloadFileTooLargeException r0 = new com.ss.android.common.util.DownloadFileTooLargeException     // Catch:{ all -> 0x0162 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x0162 }
            throw r0     // Catch:{ all -> 0x0162 }
        L_0x0033:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0162 }
            r0.<init>(r5)     // Catch:{ all -> 0x0162 }
            boolean r14 = r0.exists()     // Catch:{ all -> 0x0162 }
            if (r14 != 0) goto L_0x0041
            r0.mkdirs()     // Catch:{ all -> 0x0162 }
        L_0x0041:
            java.lang.String r0 = "tempimage"
            java.lang.String r14 = ".tmp"
            java.io.File r15 = new java.io.File     // Catch:{ IOException -> 0x0051 }
            r15.<init>(r5)     // Catch:{ IOException -> 0x0051 }
            java.io.File r0 = java.io.File.createTempFile(r0, r14, r15)     // Catch:{ IOException -> 0x0051 }
            r6 = r5
        L_0x004f:
            r5 = r0
            goto L_0x007a
        L_0x0051:
            r0 = move-exception
            boolean r14 = android.text.TextUtils.isEmpty(r31)     // Catch:{ all -> 0x0162 }
            if (r14 != 0) goto L_0x015b
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x0162 }
            if (r5 != 0) goto L_0x015b
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0162 }
            r0.<init>(r6)     // Catch:{ all -> 0x0162 }
            boolean r5 = r0.exists()     // Catch:{ all -> 0x0162 }
            if (r5 != 0) goto L_0x006c
            r0.mkdirs()     // Catch:{ all -> 0x0162 }
        L_0x006c:
            java.lang.String r0 = "tempimage"
            java.lang.String r5 = ".tmp"
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x0162 }
            r14.<init>(r6)     // Catch:{ all -> 0x0162 }
            java.io.File r0 = java.io.File.createTempFile(r0, r5, r14)     // Catch:{ all -> 0x0162 }
            goto L_0x004f
        L_0x007a:
            if (r5 != 0) goto L_0x0091
            java.lang.String r0 = "close instream exception "
            safeClose(r1, r0)
            java.lang.String r0 = "close outstream exception "
            safeClose(r13, r0)
            java.lang.String r0 = "close random file exception "
            safeClose(r13, r0)
            if (r5 == 0) goto L_0x0090
            r5.delete()     // Catch:{ Exception -> 0x0090 }
        L_0x0090:
            return r10
        L_0x0091:
            java.io.RandomAccessFile r14 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = "rw"
            r14.<init>(r5, r0)     // Catch:{ all -> 0x0158 }
            r14.setLength(r11)     // Catch:{ all -> 0x0156 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0156 }
            r16 = r11
            r15 = 0
        L_0x00a2:
            int r11 = r1.read(r0)     // Catch:{ all -> 0x0156 }
            r12 = -1
            if (r11 == r12) goto L_0x010c
            if (r9 == 0) goto L_0x00cf
            boolean r12 = r9.f19289a     // Catch:{ all -> 0x0156 }
            if (r12 == 0) goto L_0x00cf
            if (r28 == 0) goto L_0x00b7
            r28.mo16560a()     // Catch:{ all -> 0x0156 }
            r28.mo16561b()     // Catch:{ all -> 0x0156 }
        L_0x00b7:
            r14.close()     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "close instream exception "
            safeClose(r1, r0)
            java.lang.String r0 = "close outstream exception "
            safeClose(r13, r0)
            java.lang.String r0 = "close random file exception "
            safeClose(r13, r0)
            if (r5 == 0) goto L_0x00ce
            r5.delete()     // Catch:{ Exception -> 0x00ce }
        L_0x00ce:
            return r10
        L_0x00cf:
            int r15 = r15 + r11
            if (r4 <= 0) goto L_0x00de
            if (r15 > r4) goto L_0x00d5
            goto L_0x00de
        L_0x00d5:
            r14.close()     // Catch:{ all -> 0x0156 }
            com.ss.android.common.util.DownloadFileTooLargeException r0 = new com.ss.android.common.util.DownloadFileTooLargeException     // Catch:{ all -> 0x0158 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x0158 }
            throw r0     // Catch:{ all -> 0x0158 }
        L_0x00de:
            r14.write(r0, r10, r11)     // Catch:{ all -> 0x0156 }
            if (r7 == 0) goto L_0x010a
            if (r8 == 0) goto L_0x010a
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0156 }
            r11 = 0
            long r20 = r18 - r16
            r22 = 500(0x1f4, double:2.47E-321)
            int r11 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r11 < 0) goto L_0x010a
            long r10 = (long) r15     // Catch:{ all -> 0x0156 }
            int r16 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r16 < 0) goto L_0x00fd
            int r10 = r15 * 100
            long r10 = (long) r10     // Catch:{ all -> 0x0156 }
            long r10 = r10 / r2
            int r10 = (int) r10     // Catch:{ all -> 0x0156 }
            goto L_0x00ff
        L_0x00fd:
            r10 = 80
        L_0x00ff:
            r11 = 99
            if (r10 < r11) goto L_0x0105
            r10 = 99
        L_0x0105:
            r7.mo16566a(r10, r8)     // Catch:{ all -> 0x0156 }
            r16 = r18
        L_0x010a:
            r10 = 0
            goto L_0x00a2
        L_0x010c:
            r25.close()     // Catch:{ all -> 0x0156 }
            if (r15 <= 0) goto L_0x013b
            r1 = 0
            r14.seek(r1)     // Catch:{ all -> 0x0138 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0138 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0138 }
            r3 = r32
            r2.<init>(r6, r3)     // Catch:{ all -> 0x0138 }
            r1.<init>(r2)     // Catch:{ all -> 0x0138 }
        L_0x0122:
            int r2 = r14.read(r0)     // Catch:{ all -> 0x0131 }
            if (r2 == r12) goto L_0x012d
            r3 = 0
            r1.write(r0, r3, r2)     // Catch:{ all -> 0x0131 }
            goto L_0x0122
        L_0x012d:
            r1.close()     // Catch:{ all -> 0x0131 }
            goto L_0x013b
        L_0x0131:
            r0 = move-exception
            r24 = r13
            r13 = r1
            r1 = r24
            goto L_0x0165
        L_0x0138:
            r0 = move-exception
            r1 = r13
            goto L_0x0165
        L_0x013b:
            r14.close()     // Catch:{ all -> 0x0138 }
            r5.delete()     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = "close instream exception "
            safeClose(r13, r0)
            java.lang.String r0 = "close outstream exception "
            safeClose(r13, r0)
            java.lang.String r0 = "close random file exception "
            safeClose(r13, r0)
            r0 = 1
            return r0
        L_0x0152:
            r0 = move-exception
            r1 = r13
            r14 = r1
            goto L_0x0165
        L_0x0156:
            r0 = move-exception
            goto L_0x0165
        L_0x0158:
            r0 = move-exception
            r14 = r13
            goto L_0x0165
        L_0x015b:
            throw r0     // Catch:{ all -> 0x0162 }
        L_0x015c:
            com.ss.android.common.util.DownloadFileTooLargeException r0 = new com.ss.android.common.util.DownloadFileTooLargeException     // Catch:{ all -> 0x0162 }
            r0.<init>(r4, r11)     // Catch:{ all -> 0x0162 }
            throw r0     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            r5 = r13
            r14 = r5
        L_0x0165:
            java.lang.String r2 = "close instream exception "
            safeClose(r1, r2)
            java.lang.String r1 = "close outstream exception "
            safeClose(r13, r1)
            java.lang.String r1 = "close random file exception "
            safeClose(r14, r1)
            if (r5 == 0) goto L_0x0179
            r5.delete()     // Catch:{ Exception -> 0x0179 }
        L_0x0179:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.util.NetworkUtils.stream2File(java.io.InputStream, long, com.ss.android.common.util.NetworkUtils$g, int, java.lang.String, java.lang.String, java.lang.String, com.ss.android.common.util.c, java.lang.String, com.ss.android.common.util.g):boolean");
    }

    public static boolean downloadFile(int i, String str, String str2, String str3, String str4, C6773c<String> cVar, String str5, C6775g gVar, List<C19565e> list, String[] strArr, int[] iArr) throws Exception {
        C19279b a = C19273a.m63155a();
        if (a != null) {
            return a.mo26327a(i, str, str2, str3, str4, cVar, str5, gVar, list, strArr, iArr);
        }
        return false;
    }

    public static boolean downloadVideo(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, C6773c<String> cVar, String str2, C6775g gVar, List<C19565e> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) throws Exception {
        C19279b a = C19273a.m63155a();
        if (a != null) {
            return a.mo26328a(i, str, stringBuffer, stringBuffer2, stringBuffer3, cVar, str2, gVar, list, strArr, iArr, redirectHandler);
        }
        return false;
    }
}
