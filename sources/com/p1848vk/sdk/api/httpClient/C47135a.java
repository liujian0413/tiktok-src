package com.p1848vk.sdk.api.httpClient;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.C1642a;
import com.p1848vk.sdk.C47106a;
import com.p1848vk.sdk.C47218d;
import com.p1848vk.sdk.api.VKParameters;
import com.p1848vk.sdk.api.VKRequest;
import com.p1848vk.sdk.api.model.VKAttachments;
import com.p1848vk.sdk.p1849a.C47109c;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;

/* renamed from: com.vk.sdk.api.httpClient.a */
public final class C47135a {

    /* renamed from: a */
    public static final ExecutorService f120947a = C47144d.m147392a();

    /* renamed from: b */
    private static final ExecutorService f120948b = C47144d.m147393a(3);

    /* renamed from: com.vk.sdk.api.httpClient.a$a */
    public static class C47139a {

        /* renamed from: a */
        public URL f120951a;

        /* renamed from: b */
        public int f120952b = 20000;

        /* renamed from: c */
        public List<Pair<String, String>> f120953c;

        /* renamed from: d */
        public C47154i f120954d;

        /* renamed from: e */
        public Map<String, String> f120955e;

        /* renamed from: f */
        public boolean f120956f;

        /* renamed from: g */
        public HttpURLConnection f120957g;

        /* renamed from: a */
        public final void mo118427a() {
            if (this.f120957g != null) {
                this.f120957g.disconnect();
            }
            this.f120956f = true;
        }

        /* renamed from: c */
        private String m147385c() throws UnsupportedEncodingException {
            if (this.f120953c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.f120953c.size());
            for (Pair pair : this.f120953c) {
                if (!(pair.first == null || pair.second == null)) {
                    arrayList.add(C1642a.m8034a("%s=%s", new Object[]{URLEncoder.encode((String) pair.first, "UTF-8"), URLEncoder.encode((String) pair.second, "UTF-8")}));
                }
            }
            return TextUtils.join("&", arrayList);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final HttpURLConnection mo118429b() throws IOException {
            this.f120957g = (HttpURLConnection) this.f120951a.openConnection();
            this.f120957g.setReadTimeout(this.f120952b);
            this.f120957g.setConnectTimeout(this.f120952b + 5000);
            this.f120957g.setRequestMethod("POST");
            this.f120957g.setUseCaches(false);
            this.f120957g.setDoInput(true);
            this.f120957g.setDoOutput(true);
            try {
                Context a = C47218d.m147673a();
                if (a != null) {
                    PackageManager packageManager = a.getPackageManager();
                    if (packageManager != null) {
                        PackageInfo packageInfo = packageManager.getPackageInfo(a.getPackageName(), 0);
                        C47142b.m147389a(this.f120957g, "User-Agent", C1642a.m8035a(Locale.US, "%s/%s (%s; Android %d; Scale/%.2f; VK SDK %s; %s)", new Object[]{C47109c.m147304a(a), packageInfo.versionName, Build.MODEL, Integer.valueOf(VERSION.SDK_INT), Float.valueOf(a.getResources().getDisplayMetrics().density), "1.6.9", packageInfo.packageName}));
                    }
                }
            } catch (Exception unused) {
            }
            C47142b.m147389a(this.f120957g, "Connection", "Keep-Alive");
            if (this.f120955e != null) {
                for (Entry entry : this.f120955e.entrySet()) {
                    C47142b.m147390b(this.f120957g, (String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (this.f120954d != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f120954d.mo118440a());
                C47142b.m147390b(this.f120957g, "Content-length", sb.toString());
                Pair b = this.f120954d.mo118442b();
                C47142b.m147390b(this.f120957g, (String) b.first, (String) b.second);
            }
            OutputStream outputStream = this.f120957g.getOutputStream();
            m147384a(outputStream);
            outputStream.close();
            this.f120957g.connect();
            return this.f120957g;
        }

        public C47139a(String str) {
            if (str != null) {
                try {
                    this.f120951a = new URL(str);
                } catch (MalformedURLException unused) {
                }
            }
        }

        /* renamed from: a */
        private void m147384a(OutputStream outputStream) throws IOException {
            if (this.f120954d != null) {
                this.f120954d.mo118441a(outputStream);
                return;
            }
            String c = m147385c();
            if (c != null && c.length() > 0) {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                bufferedWriter.write(c);
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo118428a(VKParameters vKParameters) {
            String str;
            ArrayList arrayList = new ArrayList(vKParameters.size());
            for (Entry entry : vKParameters.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof VKAttachments) {
                    arrayList.add(new Pair(entry.getKey(), ((VKAttachments) value).mo118610a()));
                } else if (value instanceof Collection) {
                    arrayList.add(new Pair(entry.getKey(), TextUtils.join(",", (Collection) value)));
                } else {
                    Object key = entry.getKey();
                    if (value == null) {
                        str = null;
                    } else {
                        str = String.valueOf(value);
                    }
                    arrayList.add(new Pair(key, str));
                }
            }
            this.f120953c = arrayList;
        }
    }

    /* renamed from: com.vk.sdk.api.httpClient.a$b */
    public interface C47140b {
    }

    /* renamed from: com.vk.sdk.api.httpClient.a$c */
    public static class C47141c {

        /* renamed from: a */
        public final int f120958a;

        /* renamed from: b */
        public final long f120959b;

        /* renamed from: c */
        public Map<String, String> f120960c;

        /* renamed from: d */
        public final byte[] f120961d;

        public C47141c(HttpURLConnection httpURLConnection, C47140b bVar) throws IOException {
            this.f120958a = httpURLConnection.getResponseCode();
            this.f120959b = (long) httpURLConnection.getContentLength();
            if (httpURLConnection.getHeaderFields() != null) {
                this.f120960c = new HashMap();
                for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
                    this.f120960c.put(entry.getKey(), TextUtils.join(",", (Iterable) entry.getValue()));
                }
            }
            InputStream a = C47143c.m147391a(httpURLConnection);
            if (this.f120960c != null) {
                String str = (String) this.f120960c.get("Content-Encoding");
                if (str != null && str.equalsIgnoreCase("gzip")) {
                    a = new GZIPInputStream(a);
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            while (true) {
                int read = a.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    a.close();
                    byteArrayOutputStream.flush();
                    this.f120961d = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static Map<String, String> m147381a() {
        return new HashMap<String, String>() {
            private static final long serialVersionUID = 200199014417610665L;

            {
                put("Accept-Encoding", "gzip");
            }
        };
    }

    /* renamed from: a */
    public static C47141c m147380a(C47139a aVar) throws IOException {
        C47141c cVar = new C47141c(aVar.mo118429b(), null);
        if (aVar.f120956f) {
            return null;
        }
        return cVar;
    }

    /* renamed from: a */
    public static C47139a m147378a(VKRequest vKRequest) {
        String str;
        C47106a b = C47106a.m147288b();
        Locale locale = Locale.US;
        String str2 = "http%s://api.vk.com/method/%s";
        Object[] objArr = new Object[2];
        if (vKRequest.f120902k || (b != null && b.f120887e)) {
            str = "s";
        } else {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = vKRequest.f120893b;
        C47139a aVar = new C47139a(C1642a.m8035a(locale, str2, objArr));
        aVar.f120955e = m147381a();
        aVar.mo118428a(vKRequest.mo118395c());
        return aVar;
    }

    /* renamed from: a */
    public static void m147382a(final VKAbstractOperation vKAbstractOperation) {
        f120948b.execute(new Runnable() {
            public final void run() {
                vKAbstractOperation.mo118420a(C47135a.f120947a);
            }
        });
    }

    /* renamed from: a */
    public static void m147383a(final C47145e eVar) {
        f120948b.execute(new Runnable() {
            public final void run() {
                eVar.f120962a.mo118427a();
            }
        });
    }

    /* renamed from: a */
    public static C47139a m147379a(String str, File... fileArr) {
        C47139a aVar = new C47139a(str);
        aVar.f120954d = new C47154i(fileArr);
        return aVar;
    }
}
