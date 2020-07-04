package com.bytedance.ttnet.p671c;

import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.C10155h;
import com.bytedance.frameworks.baselib.network.http.parser.C10174c;
import com.bytedance.frameworks.baselib.network.http.util.C10189i;
import com.bytedance.ttnet.C12961d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.c.c */
public final class C12957c {
    /* renamed from: a */
    public static String m37766a(String str, Map<String, String> map, Map<String, List<String>> map2, C12954a aVar) throws Throwable {
        String str2;
        String str3;
        HttpURLConnection httpURLConnection = null;
        if (C6319n.m19593a(str) || !C12959d.m37771a(C12961d.m37772a().mo31461a())) {
            return null;
        }
        try {
            final String a = C10142f.m30097a(str, true);
            final HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(a).openConnection();
            try {
                httpURLConnection2.setRequestMethod("GET");
                httpURLConnection2.setConnectTimeout(C10142f.m30122e());
                httpURLConnection2.setReadTimeout(C10142f.m30123f());
                httpURLConnection2.setInstanceFollowRedirects(true);
                C12959d.m37770a(httpURLConnection2, "Accept-Encoding", "gzip");
                if (aVar.f34299h) {
                    str2 = " HttpsURLConnection";
                } else {
                    str2 = " HttpURLConnection";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(C10142f.m30124g());
                sb.append(str2);
                C12959d.m37770a(httpURLConnection2, "User-Agent", sb.toString());
                int responseCode = httpURLConnection2.getResponseCode();
                aVar.f34292a = responseCode;
                if (!(map2 == null || httpURLConnection2.getHeaderFields() == null)) {
                    map2.putAll(httpURLConnection2.getHeaderFields());
                }
                if (!aVar.f34299h) {
                    aVar.f34296e = httpURLConnection2.getHeaderField("X-SS-SIGN");
                }
                if (responseCode == 200) {
                    InputStream a2 = C12959d.m37769a(httpURLConnection2);
                    boolean equals = "gzip".equals(httpURLConnection2.getHeaderField("Content-Encoding"));
                    String headerField = httpURLConnection2.getHeaderField("Content-Type");
                    boolean a3 = C10174c.m30224a(headerField);
                    Pair a4 = RetrofitUtils.m37893a(headerField);
                    if (a4 == null || a4.second == null || !Charset.isSupported((String) a4.second)) {
                        str3 = null;
                    } else {
                        str3 = (String) a4.second;
                    }
                    if (str3 == null) {
                        str3 = "UTF-8";
                    }
                    int[] iArr = {0};
                    byte[] a5 = C10174c.m30226a(equals, -1, a2, iArr, new C10155h() {
                        /* renamed from: a */
                        public final URI mo24823a() {
                            try {
                                return C10189i.m30260a(a);
                            } catch (RuntimeException unused) {
                                return null;
                            }
                        }

                        /* renamed from: b */
                        public final void mo24824b() {
                            try {
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    if (a5 != null && iArr[0] > 0) {
                        if (iArr[0] <= a5.length) {
                            if (a3) {
                                C10174c.m30222a(a5, iArr[0]);
                            }
                            String str4 = new String(a5, 0, iArr[0], str3);
                            if (httpURLConnection2 != null) {
                                try {
                                    httpURLConnection2.disconnect();
                                } catch (Exception unused) {
                                }
                            }
                            return str4;
                        }
                    }
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused2) {
                        }
                    }
                    return null;
                }
                StringBuilder sb2 = new StringBuilder("err status = ");
                sb2.append(responseCode);
                throw new IOException(sb2.toString());
            } catch (Throwable th) {
                th = th;
                if (httpURLConnection2 != null) {
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
