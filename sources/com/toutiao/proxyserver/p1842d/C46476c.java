package com.toutiao.proxyserver.p1842d;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.toutiao.proxyserver.C46506n;
import com.toutiao.proxyserver.C46534r;
import com.toutiao.proxyserver.RequestException;
import com.toutiao.proxyserver.net.C46513c;
import com.toutiao.proxyserver.net.C46514d;
import com.toutiao.proxyserver.net.C46517e;
import com.toutiao.proxyserver.p1839a.C46454b;
import com.toutiao.proxyserver.p1840b.C46461a;
import com.toutiao.proxyserver.p1840b.C46463c;
import com.toutiao.proxyserver.p1841c.C46470c;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.toutiao.proxyserver.d.c */
public final class C46476c {

    /* renamed from: a */
    public static final Charset f119755a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Handler f119756b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final ExecutorService f119757c;

    /* renamed from: c */
    public static String m146134c(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static void m146122a(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m146123a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:1|2|3|4|5) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0009 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m146120a(java.io.RandomAccessFile r1) {
        /*
            if (r1 == 0) goto L_0x000d
            java.io.FileDescriptor r0 = r1.getFD()     // Catch:{ Throwable -> 0x0009 }
            r0.sync()     // Catch:{ Throwable -> 0x0009 }
        L_0x0009:
            r1.close()     // Catch:{ Throwable -> 0x000d }
            return
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p1842d.C46476c.m146120a(java.io.RandomAccessFile):void");
    }

    /* renamed from: a */
    public static boolean m146127a(String str) {
        return str != null && (str.startsWith("http://") || str.startsWith("https://"));
    }

    /* renamed from: a */
    public static List<String> m146116a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (m146127a(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m146118a(C46517e eVar, boolean z, boolean z2) throws RequestException {
        if (eVar == null) {
            C46470c.m146089d("TAG_PROXY_Response", "response null");
            throw new RequestException("response null", 10);
        } else if (!eVar.mo115670a()) {
            StringBuilder sb = new StringBuilder("response code: ");
            sb.append(eVar.f119848b);
            C46470c.m146089d("TAG_PROXY_Response", sb.toString());
            final JSONObject a = m146117a(eVar, eVar.f119847a);
            if (eVar.f119848b == 416) {
                final C46506n b = C46534r.m146269b();
                if (b != null) {
                    m146132b((Runnable) new Runnable() {
                        public final void run() {
                            b.mo105065a(a);
                        }
                    });
                }
            }
            StringBuilder sb2 = new StringBuilder("response code: ");
            sb2.append(eVar.f119848b);
            sb2.append(" Error extra: ");
            sb2.append(a.toString());
            throw new RequestException(sb2.toString(), eVar.f119848b);
        } else {
            String a2 = eVar.mo115668a("Content-Type");
            if (!m146137f(a2)) {
                StringBuilder sb3 = new StringBuilder("Content-Type: ");
                sb3.append(a2);
                sb3.append(", url: ");
                sb3.append(eVar.f119847a.f119835a);
                C46470c.m146089d("TAG_PROXY_Response", sb3.toString());
                String str = null;
                if (m146138g(a2)) {
                    str = m146115a(eVar.mo115674d());
                    int length = str.length();
                    int i = VETransitionFilterParam.TransitionDuration_DEFAULT;
                    if (length <= 500) {
                        i = str.length();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        str = str.substring(0, i - 1);
                    }
                }
                StringBuilder sb4 = new StringBuilder("Content-Type: ");
                sb4.append(a2);
                sb4.append(", extra:");
                sb4.append(str);
                sb4.append(", url: ");
                sb4.append(eVar.f119847a.f119835a);
                throw new RequestException(sb4.toString(), 11);
            }
            int a3 = m146108a(eVar);
            if (a3 > 0) {
                if (z) {
                    if (!"http/1.0".equalsIgnoreCase(eVar.mo115671b())) {
                        String a4 = eVar.mo115668a("Accept-Ranges");
                        if (eVar.f119848b != 206 && (a4 == null || !a4.contains("bytes"))) {
                            StringBuilder sb5 = new StringBuilder("Accept-Ranges: ");
                            sb5.append(a4);
                            sb5.append(", url: ");
                            sb5.append(eVar.f119847a.f119835a);
                            C46470c.m146089d("TAG_PROXY_Response", sb5.toString());
                            StringBuilder sb6 = new StringBuilder("Accept-Ranges: ");
                            sb6.append(a4);
                            sb6.append(", url: ");
                            sb6.append(eVar.f119847a.f119835a);
                            throw new RequestException(sb6.toString(), 14);
                        }
                    } else {
                        throw new RequestException("http/1.0 do not support range request.", 13);
                    }
                }
                if (z2 && eVar.mo115674d() == null) {
                    C46470c.m146089d("TAG_PROXY_Response", "response body null");
                    throw new RequestException("response body null", 10);
                }
                return;
            }
            StringBuilder sb7 = new StringBuilder("Content-Length: ");
            sb7.append(a3);
            C46470c.m146089d("TAG_PROXY_Response", sb7.toString());
            StringBuilder sb8 = new StringBuilder("Content-Length: ");
            sb8.append(a3);
            throw new RequestException(sb8.toString(), 12);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m146115a(java.io.InputStream r4) {
        /*
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r4)
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x000f:
            java.lang.String r2 = r0.readLine()     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            if (r2 == 0) goto L_0x002a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            r3.<init>()     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            r3.append(r2)     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            r1.append(r2)     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            goto L_0x000f
        L_0x002a:
            r4.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0033
        L_0x002e:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            throw r0
        L_0x0033:
            java.lang.String r4 = r1.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p1842d.C46476c.m146115a(java.io.InputStream):java.lang.String");
    }

    /* renamed from: a */
    private static JSONObject m146117a(C46517e eVar, C46514d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Range", dVar.mo115659a("Range"));
            jSONObject.put("Vpwp-Type", dVar.mo115659a("Vpwp-Type"));
            jSONObject.put("Vpwp-Mp-Range", dVar.mo115659a("Vpwp-Mp-Range"));
            jSONObject.put("Content-Range", eVar.mo115668a("Content-Range"));
            jSONObject.put("Content-Type", eVar.mo115668a("Content-Type"));
            jSONObject.put("Content-Length", eVar.mo115668a("Content-Length"));
            jSONObject.put("url", eVar.f119847a.f119835a);
            String a = dVar.mo115659a("Vpwp-Key");
            jSONObject.put("Vpwp-Key", a);
            int b = m146128b(dVar.mo115659a("Vpwp-Flag"));
            if (b != 1) {
                b = 0;
            }
            C46463c g = C46534r.m146275g();
            if (g != null) {
                C46461a a2 = g.mo115584a(a, b);
                if (a2 != null) {
                    jSONObject.put("DB-Content-Type", a2.f119726b);
                    jSONObject.put("DB-Content-Length", a2.f119727c);
                    jSONObject.put("DB-extra", a2.f119729e);
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m146121a(Runnable runnable) {
        if (m146133b()) {
            f119757c.execute(runnable);
            C46470c.m146087c("TAG_PROXY_UTIL", "invoke in pool thread");
            return;
        }
        runnable.run();
        C46470c.m146087c("TAG_PROXY_UTIL", "invoke calling thread");
    }

    /* renamed from: a */
    public static void m146124a(List<C46513c> list) {
        if (list != null) {
            C46470c.m146085b("TAG_PROXY_PRE_FILTER", list.toString());
            m146125a(list, "Host");
            m146125a(list, "Keep-Alive");
            List<C46513c> b = m146131b(list, "Connection");
            if (b != null && !b.isEmpty()) {
                for (C46513c cVar : b) {
                    List<String> h = m146139h(cVar.f119834b);
                    if (h != null) {
                        for (String a : h) {
                            m146125a(list, a);
                        }
                    }
                }
            }
            m146125a(list, "Connection");
            List<C46513c> b2 = m146131b(list, "Proxy-Connection");
            if (b2 != null && !b2.isEmpty()) {
                for (C46513c cVar2 : b2) {
                    List<String> h2 = m146139h(cVar2.f119834b);
                    if (h2 != null) {
                        for (String a2 : h2) {
                            m146125a(list, a2);
                        }
                    }
                }
            }
            m146125a(list, "Proxy-Connection");
            C46470c.m146085b("TAG_PROXY_PRE_FILTER", list.toString());
        }
    }

    /* renamed from: a */
    private static void m146125a(List<C46513c> list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C46513c) it.next()).f119833a.equalsIgnoreCase(str)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public static void m146126a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    private static boolean m146133b() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f119757c = threadPoolExecutor;
    }

    /* renamed from: a */
    public static int m146107a() {
        if (VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists()) {
                File[] listFiles = file.listFiles(new FilenameFilter() {

                    /* renamed from: a */
                    private Pattern f119758a = Pattern.compile("^cpu[0-9]+$");

                    public final boolean accept(File file, String str) {
                        return this.f119758a.matcher(str).matches();
                    }
                });
                if (listFiles != null) {
                    return Math.max(listFiles.length, 1);
                }
                return 1;
            }
        } catch (Throwable unused) {
        }
        return 1;
    }

    /* renamed from: a */
    public static void m146119a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static int m146128b(String str) {
        return m146109a(str, 0);
    }

    /* renamed from: b */
    public static void m146132b(Runnable runnable) {
        if (m146133b()) {
            runnable.run();
        } else {
            f119756b.post(runnable);
        }
    }

    /* renamed from: g */
    private static boolean m146138g(String str) {
        if (str == null || !str.startsWith("text/")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m146137f(String str) {
        if (str == null || (!str.startsWith("video/") && !"application/octet-stream".equals(str) && !"binary/octet-stream".equals(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m146130b(List<C46513c> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (C46513c cVar : list) {
            sb.append(cVar.f119833a);
            sb.append(": ");
            sb.append(cVar.f119834b);
            sb.append("\r\n");
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m146135d(String str) {
        int length = str.length();
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127) {
                if (sb == null) {
                    sb = new StringBuilder(str.substring(0, i));
                }
            } else if (sb != null) {
                sb.append(charAt);
            }
        }
        if (sb == null) {
            return str;
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static String m146136e(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt > 31 || charAt == 9) && charAt < 127) {
                if (sb != null) {
                    sb.append(charAt);
                }
            } else if (sb == null) {
                sb = new StringBuilder(str.substring(0, i));
            }
        }
        if (sb == null) {
            return str;
        }
        return sb.toString();
    }

    /* renamed from: h */
    private static List<String> m146139h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!TextUtils.isEmpty(str2)) {
                String trim = str2.trim();
                if (!TextUtils.isEmpty(trim)) {
                    arrayList.add(trim);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m146108a(C46517e eVar) {
        if (eVar == null) {
            return -1;
        }
        if (eVar.f119848b == 200) {
            return m146109a(eVar.mo115668a("Content-Length"), -1);
        }
        if (eVar.f119848b == 206) {
            String a = eVar.mo115668a("Content-Range");
            if (!TextUtils.isEmpty(a)) {
                int lastIndexOf = a.lastIndexOf("/");
                if (lastIndexOf >= 0 && lastIndexOf < a.length() - 1) {
                    return m146109a(a.substring(lastIndexOf + 1), -1);
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static int m146109a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: b */
    private static String m146129b(int i, int i2) {
        if (i >= 0 && i2 > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("-");
            sb.append(i2);
            return sb.toString();
        } else if (i > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append("-");
            return sb2.toString();
        } else if (i >= 0 || i2 <= 0) {
            return null;
        } else {
            StringBuilder sb3 = new StringBuilder("-");
            sb3.append(i2);
            return sb3.toString();
        }
    }

    /* renamed from: b */
    private static List<C46513c> m146131b(List<C46513c> list, String str) {
        ArrayList arrayList = null;
        for (C46513c cVar : list) {
            if (cVar.f119833a.equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m146112a(int i, int i2) {
        String b = m146129b(i, i2);
        if (b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("bytes=");
        sb.append(b);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m146113a(C46461a aVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (i <= 0) {
            sb.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb.append("Accept-Ranges: bytes\r\n");
        sb.append("Content-Type: ");
        sb.append(aVar.f119726b);
        sb.append("\r\n");
        if (i <= 0) {
            sb.append("Content-Length: ");
            sb.append(aVar.f119727c);
            sb.append("\r\n");
        } else {
            sb.append("Content-Range: bytes ");
            sb.append(i);
            sb.append("-");
            sb.append(aVar.f119727c - 1);
            sb.append("/");
            sb.append(aVar.f119727c);
            sb.append("\r\n");
            sb.append("Content-Length: ");
            sb.append(aVar.f119727c - i);
            sb.append("\r\n");
        }
        sb.append("Connection: close\r\n");
        sb.append("\r\n");
        String sb2 = sb.toString();
        C46470c.m146085b("TAG_PROXY_WRITE_TO_MP", sb2);
        return sb2;
    }

    /* renamed from: a */
    public static String m146114a(C46517e eVar, int i) {
        if (eVar == null || !eVar.mo115670a()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.mo115671b().toUpperCase());
        sb.append(' ');
        sb.append(eVar.f119848b);
        sb.append(' ');
        sb.append(eVar.mo115672c());
        sb.append("\r\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.mo115671b().toUpperCase());
        sb2.append(" ");
        sb2.append(eVar.f119848b);
        sb2.append(" ");
        sb2.append(eVar.mo115672c());
        C46470c.m146085b("TAG_PROXY_headers", sb2.toString());
        List<C46513c> list = eVar.f119849c;
        m146124a(list);
        boolean z = true;
        for (C46513c cVar : list) {
            String str = cVar.f119833a;
            String str2 = cVar.f119834b;
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
            sb.append("\r\n");
            if ("Content-Range".equalsIgnoreCase(str) || ("Accept-Ranges".equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                z = false;
            }
        }
        if (z) {
            int a = m146108a(eVar);
            if (a > 0) {
                sb.append("Content-Range: bytes ");
                sb.append(Math.max(i, 0));
                sb.append("-");
                sb.append(a - 1);
                sb.append("/");
                sb.append(a);
                sb.append("\r\n");
            }
        }
        sb.append("Connection: close\r\n");
        sb.append("\r\n");
        String sb3 = sb.toString();
        C46470c.m146085b("TAG_PROXY_WRITE_TO_MP", sb3);
        return sb3;
    }

    /* renamed from: a */
    public static C46454b m146110a(String str, String str2, int i, long j) {
        C46454b bVar = new C46454b();
        bVar.f119701a = str;
        bVar.f119702b = str2;
        bVar.f119703c = i;
        bVar.f119704d = (int) j;
        return bVar;
    }

    /* renamed from: a */
    public static C46461a m146111a(C46517e eVar, C46463c cVar, String str, int i) {
        String str2;
        C46461a a = cVar.mo115584a(str, i);
        if (a == null) {
            int a2 = m146108a(eVar);
            String a3 = eVar.mo115668a("Content-Type");
            if (a2 > 0 && !TextUtils.isEmpty(a3)) {
                String str3 = eVar.f119847a.f119835a;
                String b = m146130b(eVar.f119847a.f119837c);
                String b2 = m146130b(eVar.f119849c);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestUrl", str3);
                    jSONObject.put("requestHeaders", b);
                    jSONObject.put("responseHeaders", b2);
                    str2 = jSONObject.toString();
                } catch (Throwable unused) {
                    str2 = "";
                }
                C46461a aVar = new C46461a(str, a3, a2, i, str2);
                cVar.mo115586a(aVar);
                return aVar;
            }
        }
        return a;
    }
}
