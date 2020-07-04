package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.util.JsonWriter;
import com.google.android.gms.common.util.C15320c;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.common.util.C15325h;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

@C6505uv
public final class afg {

    /* renamed from: a */
    private static Object f40144a = new Object();

    /* renamed from: b */
    private static boolean f40145b = false;

    /* renamed from: c */
    private static boolean f40146c = false;

    /* renamed from: d */
    private static C15322e f40147d = C15325h.m44574d();

    /* renamed from: e */
    private static final Set<String> f40148e = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: f */
    private final List<String> f40149f;

    public afg() {
        this(null);
    }

    public afg(String str) {
        List<String> list;
        if (!m45762c()) {
            list = new ArrayList<>();
        } else {
            String uuid = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String str2 = "network_request_";
                String valueOf = String.valueOf(uuid);
                strArr[0] = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                list = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String str3 = "ad_request_";
                String valueOf2 = String.valueOf(str);
                strArr2[0] = valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3);
                String str4 = "network_request_";
                String valueOf3 = String.valueOf(uuid);
                strArr2[1] = valueOf3.length() != 0 ? str4.concat(valueOf3) : new String(str4);
                list = Arrays.asList(strArr2);
            }
        }
        this.f40149f = list;
    }

    /* renamed from: a */
    public final void mo39280a(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (m45762c()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            m45758b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    /* renamed from: a */
    public final void mo39278a(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (m45762c()) {
            m45758b(str, str2, map, bArr);
        }
    }

    /* renamed from: b */
    private final void m45758b(String str, String str2, Map<String, ?> map, byte[] bArr) {
        m45752a("onNetworkRequest", (afl) new afh(str, str2, map, bArr));
    }

    /* renamed from: a */
    public final void mo39279a(HttpURLConnection httpURLConnection, int i) {
        String str;
        if (m45762c()) {
            m45759b(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String str2 = "Can not get error message from error HttpURLConnection\n";
                    String valueOf = String.valueOf(e.getMessage());
                    afm.m45783e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    str = null;
                }
                m45757b(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo39281a(Map<String, ?> map, int i) {
        if (m45762c()) {
            m45759b(map, i);
            if (i < 200 || i >= 300) {
                m45757b(null);
            }
        }
    }

    /* renamed from: b */
    private final void m45759b(Map<String, ?> map, int i) {
        m45752a("onNetworkResponse", (afl) new afi(i, map));
    }

    /* renamed from: a */
    public final void mo39277a(String str) {
        if (m45762c() && str != null) {
            mo39282a(str.getBytes());
        }
    }

    /* renamed from: a */
    public final void mo39282a(byte[] bArr) {
        m45752a("onNetworkResponseBody", (afl) new afj(bArr));
    }

    /* renamed from: b */
    private final void m45757b(String str) {
        m45752a("onNetworkRequestError", (afl) new afk(str));
    }

    /* renamed from: a */
    private static void m45750a(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                if (!f40148e.contains(str)) {
                    if (!(entry.getValue() instanceof List)) {
                        if (!(entry.getValue() instanceof String)) {
                            afm.m45779c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) entry.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String str2 : (List) entry.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(str2);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: a */
    private final void m45752a(String str, afl afl) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f40147d.mo38684a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f40149f) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            afl.mo39283a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            afm.m45778b("unable to log", e);
        }
        m45761c(stringWriter.toString());
    }

    /* renamed from: c */
    private static synchronized void m45761c(String str) {
        synchronized (afg.class) {
            afm.m45781d("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String str2 = "GMA Debug CONTENT ";
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                afm.m45781d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                i = i2;
            }
            afm.m45781d("GMA Debug FINISH");
        }
    }

    /* renamed from: a */
    public static void m45748a() {
        synchronized (f40144a) {
            f40145b = false;
            f40146c = false;
            afm.m45783e("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: a */
    public static void m45754a(boolean z) {
        synchronized (f40144a) {
            f40145b = true;
            f40146c = z;
        }
    }

    /* renamed from: b */
    public static boolean m45760b() {
        boolean z;
        synchronized (f40144a) {
            z = f40145b;
        }
        return z;
    }

    /* renamed from: c */
    public static boolean m45762c() {
        boolean z;
        synchronized (f40144a) {
            z = f40145b && f40146c;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m45756a(Context context) {
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43833ba)).booleanValue()) {
            return false;
        }
        try {
            if (Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            afm.m45780c("Fail to determine debug setting.", e);
            return false;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m45751a(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    static final /* synthetic */ void m45755a(byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a = C15320c.m44559a(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(a);
        } else {
            String a2 = afb.m45724a(a);
            if (a2 != null) {
                jsonWriter.name("bodydigest").value(a2);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    static final /* synthetic */ void m45749a(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        m45750a(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    static final /* synthetic */ void m45753a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m45750a(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(C15320c.m44559a(bArr));
        }
        jsonWriter.endObject();
    }
}
