package com.bytedance.ies.p555c;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.p555c.p556a.C10711b;
import com.bytedance.ies.p555c.p557b.C10714a;
import com.bytedance.ies.p555c.p558c.C10717a.C10719b;
import com.bytedance.ies.p555c.p559d.C10721a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.c.a */
public final class C10702a {

    /* renamed from: d */
    public static String f28600d;

    /* renamed from: e */
    public static String f28601e;

    /* renamed from: f */
    public static String f28602f;

    /* renamed from: g */
    public static Context f28603g;

    /* renamed from: a */
    public List<Pattern> f28604a;

    /* renamed from: b */
    public String[] f28605b;

    /* renamed from: c */
    public boolean f28606c = true;

    /* renamed from: h */
    private AssetManager f28607h;

    /* renamed from: i */
    private C10713b f28608i = new C10713b() {
        /* renamed from: a */
        public final boolean mo25528a(String str) {
            return true;
        }
    };

    /* renamed from: a */
    public final String mo25588a() {
        if (this.f28605b == null || this.f28605b.length == 0) {
            return null;
        }
        return this.f28605b[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.webkit.WebResourceResponse mo25584a(android.webkit.WebView r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            java.util.List<java.util.regex.Pattern> r1 = r4.f28604a     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            if (r1 == 0) goto L_0x003b
            boolean r1 = r4.f28606c     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            if (r1 == 0) goto L_0x003b
            java.util.List<java.util.regex.Pattern> r1 = r4.f28604a     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            if (r1 != 0) goto L_0x003b
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            if (r1 == 0) goto L_0x0019
            goto L_0x003b
        L_0x0019:
            android.util.Pair r1 = r4.m31268b(r5, r6)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            java.lang.Object r2 = r1.first     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            android.webkit.WebResourceResponse r2 = (android.webkit.WebResourceResponse) r2     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            if (r2 != 0) goto L_0x0039
            java.lang.Object r3 = r1.second     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            com.bytedance.ies.c.c.a$b r3 = (com.bytedance.ies.p555c.p558c.C10717a.C10719b) r3     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            r3.f28658m = r0     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            java.lang.Object r3 = r1.second     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            com.bytedance.ies.c.c.a$b r3 = (com.bytedance.ies.p555c.p558c.C10717a.C10719b) r3     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            java.lang.String r3 = r3.f28653h     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            if (r3 == 0) goto L_0x0039
            java.lang.Object r1 = r1.second     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            com.bytedance.ies.c.c.a$b r1 = (com.bytedance.ies.p555c.p558c.C10717a.C10719b) r1     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            r3 = 5
            r4.mo25590a(r1, r5, r6, r3)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
        L_0x0039:
            monitor-exit(r4)
            return r2
        L_0x003b:
            monitor-exit(r4)
            return r0
        L_0x003d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0040:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p555c.C10702a.mo25584a(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    public final void mo25590a(C10719b bVar, WebView webView, String str, int i) {
        if (VERSION.SDK_INT < 19 || webView == null || i < 0) {
            mo25589a(bVar);
            return;
        }
        final WebView webView2 = webView;
        final String str2 = str;
        final C10719b bVar2 = bVar;
        final int i2 = i;
        C107042 r2 = new Runnable() {
            public final void run() {
                try {
                    WebView webView = webView2;
                    StringBuilder sb = new StringBuilder("JSON.stringify(window.performance.getEntriesByName('");
                    sb.append(str2);
                    sb.append("'))");
                    webView.evaluateJavascript(sb.toString(), new ValueCallback<String>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void onReceiveValue(String str) {
                            C10702a.this.mo25591a(bVar2, webView2, str2, str, i2);
                        }
                    });
                } catch (Exception unused) {
                }
            }
        };
        webView.postDelayed(r2, 2000);
    }

    /* renamed from: a */
    public final void mo25591a(C10719b bVar, WebView webView, String str, String str2, int i) {
        C10721a a = C10721a.m31298a();
        final String str3 = str2;
        final C10719b bVar2 = bVar;
        final WebView webView2 = webView;
        final String str4 = str;
        final int i2 = i;
        C107063 r1 = new Runnable() {
            public final void run() {
                try {
                    String replaceAll = str3.replaceAll("\\\\\"", "\"");
                    JSONObject jSONObject = (JSONObject) new JSONArray(replaceAll.substring(1, replaceAll.length() - 1)).get(0);
                    long j = jSONObject.getLong("startTime");
                    long j2 = jSONObject.getLong("responseEnd");
                    bVar2.f28657l = Long.valueOf(j2 - j);
                    C10702a.this.mo25589a(bVar2);
                } catch (JSONException unused) {
                    C10702a.this.mo25590a(bVar2, webView2, str4, i2 - 1);
                }
            }
        };
        a.mo25614a(r1);
    }

    /* renamed from: a */
    public final void mo25589a(final C10719b bVar) {
        if (f28603g != null) {
            C10721a.m31298a().mo25614a(new Runnable() {
                public final void run() {
                    C10714a.m31287a(C10702a.f28603g).mo25599a(C10702a.f28601e, C10702a.f28602f, bVar);
                }
            });
        }
    }

    /* renamed from: a */
    private void m31264a(final C10719b bVar, WebResourceResponse webResourceResponse) {
        if (webResourceResponse != null) {
            InputStream data = webResourceResponse.getData();
            if (data != null) {
                webResourceResponse.setData(new C10716c(data) {
                    public final void close() throws IOException {
                        super.close();
                        bVar.mo25612a(true);
                        C10702a.this.mo25589a(bVar);
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo25597a(IOException iOException) {
                        super.mo25597a(iOException);
                        bVar.f28654i = "101";
                        bVar.f28655j = iOException.getMessage();
                        bVar.mo25612a(false);
                        C10702a.this.mo25589a(bVar);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private String[] m31267a(Pattern pattern) {
        String a = C10720d.m31296a().mo25613a(pattern.toString());
        if (TextUtils.isEmpty(a)) {
            return this.f28605b;
        }
        return new String[]{a};
    }

    /* renamed from: a */
    private void m31265a(String... strArr) {
        this.f28605b = strArr;
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                if (!str.endsWith("/")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("/");
                    strArr[i] = sb.toString();
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m31266a(String str, String str2) {
        if (this.f28608i == null) {
            return true;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2.split("/")[0]);
            String sb2 = sb.toString();
            if (m31271d(sb2) != null) {
                return true;
            }
            return this.f28608i.mo25528a(sb2);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static void m31269b(String str) {
        f28601e = str;
    }

    /* renamed from: c */
    private static void m31270c(String str) {
        f28602f = str;
    }

    /* renamed from: a */
    public final C10702a mo25585a(C10713b bVar) {
        this.f28608i = bVar;
        return this;
    }

    /* renamed from: a */
    public final C10702a mo25586a(List<Pattern> list) {
        this.f28604a = list;
        return this;
    }

    /* renamed from: a */
    public final C10702a mo25587a(boolean z) {
        this.f28606c = z;
        return this;
    }

    private C10702a(Context context) {
        if (context != null) {
            f28603g = context;
            this.f28607h = context.getAssets();
        }
    }

    /* renamed from: d */
    private static String m31271d(String str) {
        try {
            URI create = URI.create(str);
            if ("asset".equals(create.getScheme())) {
                String path = create.getPath();
                if (path.startsWith("/")) {
                    return path.substring(1);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static String m31263a(String str) {
        if (str.endsWith(".js")) {
            return "application/x-javascript";
        }
        if (str.endsWith(".css")) {
            return "text/css";
        }
        if (str.endsWith(".html")) {
            return "text/html";
        }
        if (str.endsWith(".ico")) {
            return "image/x-icon";
        }
        if (str.endsWith(".jpeg") || str.endsWith(".jpg")) {
            return "image/jpeg";
        }
        if (str.endsWith(".png")) {
            return "image/png";
        }
        if (str.endsWith(".gif")) {
            return "image/gif";
        }
        if (str.endsWith(".woff")) {
            return "font/woff";
        }
        if (str.endsWith(".svg")) {
            return "image/svg+xml";
        }
        if (str.endsWith(".ttf")) {
            return "font/ttf";
        }
        return "";
    }

    /* renamed from: b */
    private Pair<WebResourceResponse, C10719b> m31268b(final WebView webView, String str) {
        String str2;
        final C10719b bVar = new C10719b();
        bVar.mo25610a(str);
        if (webView != null) {
            webView.post(new Runnable() {
                public final void run() {
                    try {
                        bVar.f28661p = webView.getUrl();
                    } catch (Exception unused) {
                    }
                }
            });
        }
        for (int i = 0; i < this.f28604a.size(); i++) {
            Pattern pattern = (Pattern) this.f28604a.get(i);
            if (pattern != null) {
                WebResourceResponse a = m31259a(pattern, str, bVar);
                if (a != null) {
                    m31264a(bVar, a);
                    return new Pair<>(a, bVar);
                }
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    bVar.f28653h = pattern.pattern();
                    int indexOf = str.indexOf("?");
                    int indexOf2 = str.indexOf("#");
                    int min = Math.min(indexOf, indexOf2);
                    if (min == -1) {
                        min = Math.max(indexOf, indexOf2);
                    }
                    if (min != -1) {
                        str2 = str.substring(matcher.end(), min);
                    } else {
                        str2 = str.substring(matcher.end());
                    }
                    if (str2.endsWith("/")) {
                        str2 = str2.substring(0, str2.length() - 1);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        WebResourceResponse a2 = m31258a(str, str2, m31267a(pattern), bVar);
                        if (a2 != null) {
                            StringBuilder sb = new StringBuilder("path:");
                            sb.append(str2);
                            C10711b.m31285b(str, sb.toString());
                            m31264a(bVar, a2);
                        } else {
                            C10711b.m31284a(str, "未找到本地资源");
                            bVar.f28654i = "100";
                            bVar.mo25612a(false);
                        }
                        return new Pair<>(a2, bVar);
                    }
                } else {
                    continue;
                }
            }
        }
        bVar.f28654i = "100";
        bVar.mo25612a(false);
        return new Pair<>(null, bVar);
    }

    /* renamed from: a */
    private InputStream m31262a(String[] strArr, String str) {
        String str2;
        if (strArr.length <= 1) {
            return null;
        }
        for (String a : strArr) {
            if (!m31266a(str, a)) {
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(strArr[i]);
            String sb3 = sb2.toString();
            String d = m31271d(sb3);
            if (d != null) {
                try {
                    arrayList.add(this.f28607h.open(d));
                } catch (Exception unused) {
                    return null;
                }
            } else {
                sb.append(sb3);
                if (i != strArr.length - 1) {
                    str2 = ",";
                } else {
                    str2 = "";
                }
                sb.append(str2);
                try {
                    arrayList.add(new FileInputStream(new File(sb3)));
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    /* renamed from: a */
    private static WebResourceResponse m31257a(String str, String str2, InputStream inputStream) {
        WebResourceResponse webResourceResponse;
        if (inputStream != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Access-Control-Allow-Origin", "*");
                if (VERSION.SDK_INT < 21 || !"font/ttf".equals(str)) {
                    webResourceResponse = new WebResourceResponse(str, str2, inputStream);
                    if (VERSION.SDK_INT >= 21) {
                        webResourceResponse.setResponseHeaders(hashMap);
                    } else {
                        try {
                            Field field = webResourceResponse.getClass().getField("mResponseHeaders");
                            field.setAccessible(true);
                            field.set(webResourceResponse, hashMap);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    webResourceResponse = new WebResourceResponse(str, str2, C34943c.f91127w, "OK", hashMap, inputStream);
                }
                return webResourceResponse;
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private WebResourceResponse m31259a(Pattern pattern, String str, C10719b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(pattern.pattern());
        sb.append("??");
        Matcher matcher = Pattern.compile(sb.toString()).matcher(str);
        if (matcher.find()) {
            bVar.f28653h = pattern.pattern();
            int indexOf = str.indexOf("??");
            if (indexOf > 0) {
                String substring = str.substring(matcher.end() + 1, indexOf);
                String[] split = str.substring(indexOf + 2).split(",");
                if (split.length > 1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(substring);
                    sb2.append(split[0]);
                    split[0] = sb2.toString();
                    String a = m31263a(split[0]);
                    for (int i = 1; i < split.length; i++) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(substring);
                        sb3.append(split[i]);
                        split[i] = sb3.toString();
                        if (!TextUtils.equals(m31263a(split[i]), a)) {
                            return null;
                        }
                    }
                    String[] a2 = m31267a(pattern);
                    if (a2 == null) {
                        return null;
                    }
                    for (String str2 : a2) {
                        InputStream a3 = m31262a(split, str2);
                        if (a3 != null) {
                            WebResourceResponse a4 = m31257a(a, "", a3);
                            if (a4 != null) {
                                bVar.f28658m = str2;
                                bVar.mo25611a(str2, split[0]);
                            }
                            return a4;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.InputStream m31261a(java.lang.String r6, java.lang.String[] r7, com.bytedance.ies.p555c.p558c.C10717a.C10719b r8) {
        /*
            r5 = this;
            int r0 = r7.length
            r1 = 0
        L_0x0002:
            if (r1 >= r0) goto L_0x003b
            r2 = r7[r1]
            r8.f28658m = r2
            r8.mo25611a(r2, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = m31271d(r3)
            if (r4 == 0) goto L_0x0027
            android.content.res.AssetManager r2 = r5.f28607h     // Catch:{ Exception -> 0x0038 }
            java.io.InputStream r2 = r2.open(r4)     // Catch:{ Exception -> 0x0038 }
            return r2
        L_0x0027:
            boolean r2 = r5.m31266a(r2, r6)
            if (r2 == 0) goto L_0x0038
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{  }
            java.io.File r4 = new java.io.File     // Catch:{  }
            r4.<init>(r3)     // Catch:{  }
            r2.<init>(r4)     // Catch:{  }
            return r2
        L_0x0038:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x003b:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p555c.C10702a.m31261a(java.lang.String, java.lang.String[], com.bytedance.ies.c.c.a$b):java.io.InputStream");
    }

    /* renamed from: a */
    public static C10702a m31260a(Context context, String str, String str2, String... strArr) {
        C10702a aVar = new C10702a(context.getApplicationContext());
        aVar.m31265a(strArr);
        m31269b(str);
        m31270c(str2);
        return aVar;
    }

    /* renamed from: a */
    private synchronized WebResourceResponse m31258a(String str, String str2, String[] strArr, C10719b bVar) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && this.f28606c) {
            if (strArr != null) {
                return m31257a(m31263a(str2), "", m31261a(str2, strArr, bVar));
            }
        }
        return null;
    }
}
