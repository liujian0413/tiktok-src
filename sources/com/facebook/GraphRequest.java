package com.facebook;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import com.C1642a;
import com.facebook.C14064l.C14065a;
import com.facebook.C14064l.C14066b;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13946r;
import com.facebook.internal.C13949t;
import com.facebook.internal.C13966y;
import com.facebook.internal.C13967z;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GraphRequest {

    /* renamed from: a */
    public static final String f34668a = "GraphRequest";

    /* renamed from: b */
    public static final String f34669b;

    /* renamed from: o */
    private static String f34670o;

    /* renamed from: p */
    private static Pattern f34671p = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* renamed from: r */
    private static volatile String f34672r;

    /* renamed from: c */
    public AccessToken f34673c;

    /* renamed from: d */
    public HttpMethod f34674d;

    /* renamed from: e */
    public String f34675e;

    /* renamed from: f */
    public JSONObject f34676f;

    /* renamed from: g */
    public String f34677g;

    /* renamed from: h */
    public String f34678h;

    /* renamed from: i */
    public boolean f34679i;

    /* renamed from: j */
    public Bundle f34680j;

    /* renamed from: k */
    public C13090b f34681k;

    /* renamed from: l */
    public Object f34682l;

    /* renamed from: m */
    public String f34683m;

    /* renamed from: n */
    public boolean f34684n;

    /* renamed from: q */
    private String f34685q;

    /* renamed from: com.facebook.GraphRequest$1 */
    static class C130841 implements C13090b {
        /* renamed from: a */
        public final void mo31792a(GraphResponse graphResponse) {
        }
    }

    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Creator<ParcelableResourceWithMimeType> CREATOR = new Creator<ParcelableResourceWithMimeType>() {
            /* renamed from: a */
            private static ParcelableResourceWithMimeType[] m38298a(int i) {
                return new ParcelableResourceWithMimeType[i];
            }

            /* renamed from: a */
            private static ParcelableResourceWithMimeType m38297a(Parcel parcel) {
                return new ParcelableResourceWithMimeType(parcel, (C130841) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m38297a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m38298a(i);
            }
        };

        /* renamed from: a */
        public final String f34692a;

        /* renamed from: b */
        public final RESOURCE f34693b;

        public int describeContents() {
            return 1;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f34692a = parcel.readString();
            this.f34693b = parcel.readParcelable(C13499h.m39721g().getClassLoader());
        }

        /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, C130841 r2) {
            this(parcel);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.f34692a = str;
            this.f34693b = resource;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f34692a);
            parcel.writeParcelable(this.f34693b, i);
        }
    }

    /* renamed from: com.facebook.GraphRequest$a */
    static class C13089a {

        /* renamed from: a */
        public final GraphRequest f34694a;

        /* renamed from: b */
        public final Object f34695b;

        public C13089a(GraphRequest graphRequest, Object obj) {
            this.f34694a = graphRequest;
            this.f34695b = obj;
        }
    }

    /* renamed from: com.facebook.GraphRequest$b */
    public interface C13090b {
        /* renamed from: a */
        void mo31792a(GraphResponse graphResponse);
    }

    /* renamed from: com.facebook.GraphRequest$c */
    interface C13091c {
        /* renamed from: a */
        void mo31794a(String str, String str2) throws IOException;
    }

    /* renamed from: com.facebook.GraphRequest$d */
    public interface C13092d extends C13090b {
    }

    /* renamed from: com.facebook.GraphRequest$e */
    static class C13093e implements C13091c {

        /* renamed from: a */
        private final OutputStream f34696a;

        /* renamed from: b */
        private final C13949t f34697b;

        /* renamed from: c */
        private boolean f34698c = true;

        /* renamed from: d */
        private boolean f34699d;

        /* renamed from: a */
        public final void mo31799a(String str, Object obj, GraphRequest graphRequest) throws IOException {
            if (this.f34696a instanceof C14477s) {
                ((C14477s) this.f34696a).mo33918a(graphRequest);
            }
            if (GraphRequest.m38272a(obj)) {
                mo31794a(str, GraphRequest.m38277b(obj));
            } else if (obj instanceof Bitmap) {
                m38302a(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                m38306a(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                m38303a(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                m38304a(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                RESOURCE resource = parcelableResourceWithMimeType.f34693b;
                String str2 = parcelableResourceWithMimeType.f34692a;
                if (resource instanceof ParcelFileDescriptor) {
                    m38304a(str, (ParcelFileDescriptor) resource, str2);
                } else if (resource instanceof Uri) {
                    m38303a(str, (Uri) resource, str2);
                } else {
                    throw m38301a();
                }
            } else {
                throw m38301a();
            }
        }

        /* renamed from: a */
        public final void mo31800a(String str, JSONArray jSONArray, Collection<GraphRequest> collection) throws IOException, JSONException {
            if (!(this.f34696a instanceof C14477s)) {
                mo31794a(str, jSONArray.toString());
                return;
            }
            C14477s sVar = (C14477s) this.f34696a;
            m38305a(str, (String) null, (String) null);
            m38307a("[", new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                sVar.mo33918a(graphRequest);
                if (i > 0) {
                    m38307a(",%s", jSONObject.toString());
                } else {
                    m38307a("%s", jSONObject.toString());
                }
                i++;
            }
            m38307a("]", new Object[0]);
            if (this.f34697b != null) {
                C13949t tVar = this.f34697b;
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                tVar.mo33603a(sb.toString(), (Object) jSONArray.toString());
            }
        }

        /* renamed from: a */
        public final void mo31794a(String str, String str2) throws IOException {
            m38305a(str, (String) null, (String) null);
            m38309b("%s", str2);
            m38308b();
            if (this.f34697b != null) {
                C13949t tVar = this.f34697b;
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                tVar.mo33603a(sb.toString(), (Object) str2);
            }
        }

        /* renamed from: a */
        private static RuntimeException m38301a() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: b */
        private void m38308b() throws IOException {
            if (!this.f34699d) {
                m38309b("--%s", GraphRequest.f34669b);
                return;
            }
            this.f34696a.write("&".getBytes());
        }

        /* renamed from: b */
        private void m38309b(String str, Object... objArr) throws IOException {
            m38307a(str, objArr);
            if (!this.f34699d) {
                m38307a("\r\n", new Object[0]);
            }
        }

        /* renamed from: a */
        private void m38302a(String str, Bitmap bitmap) throws IOException {
            m38305a(str, str, "image/png");
            bitmap.compress(CompressFormat.PNG, 100, this.f34696a);
            m38309b("", new Object[0]);
            m38308b();
            if (this.f34697b != null) {
                C13949t tVar = this.f34697b;
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                tVar.mo33603a(sb.toString(), (Object) "<Image>");
            }
        }

        /* renamed from: a */
        private void m38306a(String str, byte[] bArr) throws IOException {
            m38305a(str, str, "content/unknown");
            this.f34696a.write(bArr);
            m38309b("", new Object[0]);
            m38308b();
            if (this.f34697b != null) {
                C13949t tVar = this.f34697b;
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                tVar.mo33603a(sb.toString(), (Object) C1642a.m8035a(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
        }

        /* renamed from: a */
        private void m38307a(String str, Object... objArr) throws IOException {
            if (!this.f34699d) {
                if (this.f34698c) {
                    this.f34696a.write("--".getBytes());
                    this.f34696a.write(GraphRequest.f34669b.getBytes());
                    this.f34696a.write("\r\n".getBytes());
                    this.f34698c = false;
                }
                this.f34696a.write(C1642a.m8034a(str, objArr).getBytes());
                return;
            }
            this.f34696a.write(URLEncoder.encode(C1642a.m8035a(Locale.US, str, objArr), "UTF-8").getBytes());
        }

        public C13093e(OutputStream outputStream, C13949t tVar, boolean z) {
            this.f34696a = outputStream;
            this.f34697b = tVar;
            this.f34699d = z;
        }

        /* renamed from: a */
        private void m38303a(String str, Uri uri, String str2) throws IOException {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m38305a(str, str, str2);
            if (this.f34696a instanceof C14156q) {
                ((C14156q) this.f34696a).mo33917a(C13967z.m41269e(uri));
                i = 0;
            } else {
                i = C13967z.m41212a(C13499h.m39721g().getContentResolver().openInputStream(uri), this.f34696a) + 0;
            }
            m38309b("", new Object[0]);
            m38308b();
            if (this.f34697b != null) {
                C13949t tVar = this.f34697b;
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                tVar.mo33603a(sb.toString(), (Object) C1642a.m8035a(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        private void m38304a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m38305a(str, str, str2);
            if (this.f34696a instanceof C14156q) {
                ((C14156q) this.f34696a).mo33917a(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = C13967z.m41212a((InputStream) new AutoCloseInputStream(parcelFileDescriptor), this.f34696a) + 0;
            }
            m38309b("", new Object[0]);
            m38308b();
            if (this.f34697b != null) {
                C13949t tVar = this.f34697b;
                StringBuilder sb = new StringBuilder("    ");
                sb.append(str);
                tVar.mo33603a(sb.toString(), (Object) C1642a.m8035a(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        private void m38305a(String str, String str2, String str3) throws IOException {
            if (!this.f34699d) {
                m38307a("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    m38307a("; filename=\"%s\"", str2);
                }
                m38309b("", new Object[0]);
                if (str3 != null) {
                    m38309b("%s: %s", "Content-Type", str3);
                }
                m38309b("", new Object[0]);
                return;
            }
            this.f34696a.write(C1642a.m8034a("%s=", new Object[]{str}).getBytes());
        }
    }

    /* renamed from: a */
    private void m38263a(HttpMethod httpMethod) {
        if (this.f34685q == null || httpMethod == HttpMethod.GET) {
            if (httpMethod == null) {
                httpMethod = HttpMethod.GET;
            }
            this.f34674d = httpMethod;
            return;
        }
        throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    }

    /* renamed from: a */
    public final void mo31789a(final C13090b bVar) {
        if (C13499h.m39715b(LoggingBehavior.GRAPH_API_DEBUG_INFO) || C13499h.m39715b(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.f34681k = new C13090b() {
                /* renamed from: a */
                public final void mo31792a(GraphResponse graphResponse) {
                    JSONObject jSONObject;
                    JSONArray jSONArray;
                    String str;
                    String str2;
                    String str3;
                    JSONObject jSONObject2 = graphResponse.f34702b;
                    if (jSONObject2 != null) {
                        jSONObject = jSONObject2.optJSONObject("__debug__");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        jSONArray = jSONObject.optJSONArray("messages");
                    } else {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                str = optJSONObject.optString("message");
                            } else {
                                str = null;
                            }
                            if (optJSONObject != null) {
                                str2 = optJSONObject.optString("type");
                            } else {
                                str2 = null;
                            }
                            if (optJSONObject != null) {
                                str3 = optJSONObject.optString("link");
                            } else {
                                str3 = null;
                            }
                            if (!(str == null || str2 == null)) {
                                LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                                if (str2.equals("warning")) {
                                    loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                                }
                                if (!C13967z.m41249a(str3)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str);
                                    sb.append(" Link: ");
                                    sb.append(str3);
                                    str = sb.toString();
                                }
                                C13949t.m41130a(loggingBehavior, GraphRequest.f34668a, str);
                            }
                        }
                    }
                    if (bVar != null) {
                        bVar.mo31792a(graphResponse);
                    }
                }
            };
        } else {
            this.f34681k = bVar;
        }
    }

    /* renamed from: a */
    private static List<GraphResponse> m38260a(GraphRequest... graphRequestArr) {
        C13876aa.m40978a((Object) graphRequestArr, "requests");
        return m38259a((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    /* renamed from: a */
    private static void m38266a(final C14064l lVar, List<GraphResponse> list) {
        int size = lVar.size();
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            GraphRequest a = lVar.get(i);
            if (a.f34681k != null) {
                arrayList.add(new Pair(a.f34681k, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            C130863 r7 = new Runnable() {
                public final void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((C13090b) pair.first).mo31792a((GraphResponse) pair.second);
                    }
                    for (C14065a a : lVar.f37146e) {
                        a.mo32389a(lVar);
                    }
                }
            };
            Handler handler = lVar.f37142a;
            if (handler == null) {
                r7.run();
                return;
            }
            handler.post(r7);
        }
    }

    /* renamed from: a */
    private void m38270a(JSONArray jSONArray, Map<String, C13089a> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        if (this.f34677g != null) {
            jSONObject.put("name", this.f34677g);
            jSONObject.put("omit_response_on_success", this.f34679i);
        }
        if (this.f34678h != null) {
            jSONObject.put("depends_on", this.f34678h);
        }
        String d = m38282d();
        jSONObject.put("relative_url", d);
        jSONObject.put("method", this.f34674d);
        if (this.f34673c != null) {
            C13949t.m41132a(this.f34673c.f34627e);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f34680j.keySet()) {
            Object obj = this.f34680j.get(str);
            if (m38281c(obj)) {
                String a = C1642a.m8035a(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(a);
                map.put(a, new C13089a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f34676f != null) {
            final ArrayList arrayList2 = new ArrayList();
            m38271a(this.f34676f, d, (C13091c) new C13091c() {
                /* renamed from: a */
                public final void mo31794a(String str, String str2) throws IOException {
                    arrayList2.add(C1642a.m8035a(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, "UTF-8")}));
                }
            });
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: a */
    private static void m38268a(HttpURLConnection httpURLConnection, boolean z) {
        if (z) {
            C13973j.m41283a(httpURLConnection, "Content-Type", "application/x-www-form-urlencoded");
            C13973j.m41283a(httpURLConnection, "Content-Encoding", "gzip");
            return;
        }
        C13973j.m41283a(httpURLConnection, "Content-Type", m38288g());
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r14v5, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: type inference failed for: r14v9, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARNING: type inference failed for: r14v10 */
    /* JADX WARNING: type inference failed for: r14v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m38265a(com.facebook.C14064l r13, java.net.HttpURLConnection r14) throws java.io.IOException, org.json.JSONException {
        /*
            com.facebook.internal.t r6 = new com.facebook.internal.t
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.REQUESTS
            java.lang.String r1 = "Request"
            r6.<init>(r0, r1)
            int r2 = r13.size()
            boolean r5 = m38285e(r13)
            r0 = 0
            r1 = 1
            if (r2 != r1) goto L_0x001c
            com.facebook.GraphRequest r3 = r13.get(r0)
            com.facebook.HttpMethod r3 = r3.f34674d
            goto L_0x001e
        L_0x001c:
            com.facebook.HttpMethod r3 = com.facebook.HttpMethod.POST
        L_0x001e:
            java.lang.String r4 = r3.name()
            r14.setRequestMethod(r4)
            m38268a(r14, r5)
            java.net.URL r4 = r14.getURL()
            java.lang.String r7 = "Request:\n"
            r6.mo33604b(r7)
            java.lang.String r7 = "Id"
            java.lang.String r8 = r13.f37145d
            r6.mo33603a(r7, r8)
            java.lang.String r7 = "URL"
            r6.mo33603a(r7, r4)
            java.lang.String r7 = "Method"
            java.lang.String r8 = r14.getRequestMethod()
            r6.mo33603a(r7, r8)
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = "User-Agent"
            java.lang.String r8 = r14.getRequestProperty(r8)
            r6.mo33603a(r7, r8)
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = "Content-Type"
            java.lang.String r8 = r14.getRequestProperty(r8)
            r6.mo33603a(r7, r8)
            int r7 = r13.f37144c
            r14.setConnectTimeout(r7)
            int r7 = r13.f37144c
            r14.setReadTimeout(r7)
            com.facebook.HttpMethod r7 = com.facebook.HttpMethod.POST
            if (r3 != r7) goto L_0x006b
            r0 = 1
        L_0x006b:
            if (r0 != 0) goto L_0x0071
            r6.mo33602a()
            return
        L_0x0071:
            r14.setDoOutput(r1)
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00be }
            java.io.OutputStream r14 = r14.getOutputStream()     // Catch:{ all -> 0x00be }
            r1.<init>(r14)     // Catch:{ all -> 0x00be }
            if (r5 == 0) goto L_0x0089
            java.util.zip.GZIPOutputStream r14 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0086 }
            r14.<init>(r1)     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r13 = move-exception
            r14 = r1
            goto L_0x00c0
        L_0x0089:
            r14 = r1
        L_0x008a:
            boolean r0 = m38283d(r13)     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00ae
            com.facebook.q r0 = new com.facebook.q     // Catch:{ all -> 0x00bc }
            android.os.Handler r1 = r13.f37142a     // Catch:{ all -> 0x00bc }
            r0.<init>(r1)     // Catch:{ all -> 0x00bc }
            r8 = 0
            r7 = r13
            r9 = r2
            r10 = r4
            r11 = r0
            r12 = r5
            m38264a(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00bc }
            int r1 = r0.f37408b     // Catch:{ all -> 0x00bc }
            java.util.Map<com.facebook.GraphRequest, com.facebook.t> r10 = r0.f37407a     // Catch:{ all -> 0x00bc }
            com.facebook.r r0 = new com.facebook.r     // Catch:{ all -> 0x00bc }
            long r11 = (long) r1     // Catch:{ all -> 0x00bc }
            r7 = r0
            r8 = r14
            r9 = r13
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x00bc }
            r14 = r0
        L_0x00ae:
            r0 = r13
            r1 = r6
            r3 = r4
            r4 = r14
            m38264a(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00bc }
            r14.close()
            r6.mo33602a()
            return
        L_0x00bc:
            r13 = move-exception
            goto L_0x00c0
        L_0x00be:
            r13 = move-exception
            r14 = r0
        L_0x00c0:
            if (r14 == 0) goto L_0x00c5
            r14.close()
        L_0x00c5:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m38265a(com.facebook.l, java.net.HttpURLConnection):void");
    }

    /* renamed from: a */
    private static void m38264a(C14064l lVar, C13949t tVar, int i, URL url, OutputStream outputStream, boolean z) throws IOException, JSONException {
        C13093e eVar = new C13093e(outputStream, tVar, z);
        if (i == 1) {
            GraphRequest a = lVar.get(0);
            HashMap hashMap = new HashMap();
            for (String str : a.f34680j.keySet()) {
                Object obj = a.f34680j.get(str);
                if (m38281c(obj)) {
                    hashMap.put(str, new C13089a(a, obj));
                }
            }
            if (tVar != null) {
                tVar.mo33604b("  Parameters:\n");
            }
            m38261a(a.f34680j, eVar, a);
            if (tVar != null) {
                tVar.mo33604b("  Attachments:\n");
            }
            m38269a((Map<String, C13089a>) hashMap, eVar);
            if (a.f34676f != null) {
                m38271a(a.f34676f, url.getPath(), (C13091c) eVar);
            }
            return;
        }
        String g = m38289g(lVar);
        if (!C13967z.m41249a(g)) {
            eVar.mo31794a("batch_app_id", g);
            HashMap hashMap2 = new HashMap();
            m38262a(eVar, (Collection<GraphRequest>) lVar, (Map<String, C13089a>) hashMap2);
            if (tVar != null) {
                tVar.mo33604b("  Attachments:\n");
            }
            m38269a((Map<String, C13089a>) hashMap2, eVar);
            return;
        }
        throw new FacebookException("App ID was not specified at the request or Settings.");
    }

    /* renamed from: a */
    private static boolean m38273a(String str) {
        Matcher matcher = f34671p.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
        }
        if (str.startsWith("me/") || str.startsWith("/me/")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m38271a(org.json.JSONObject r6, java.lang.String r7, com.facebook.GraphRequest.C13091c r8) throws java.io.IOException {
        /*
            boolean r0 = m38273a(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = ":"
            int r0 = r7.indexOf(r0)
            java.lang.String r3 = "?"
            int r7 = r7.indexOf(r3)
            r3 = 3
            if (r0 <= r3) goto L_0x001e
            r3 = -1
            if (r7 == r3) goto L_0x001c
            if (r0 >= r7) goto L_0x001e
        L_0x001c:
            r7 = 1
            goto L_0x001f
        L_0x001e:
            r7 = 0
        L_0x001f:
            java.util.Iterator r0 = r6.keys()
        L_0x0023:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.opt(r3)
            if (r7 == 0) goto L_0x003f
            java.lang.String r5 = "image"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            m38267a(r3, r4, r8, r5)
            goto L_0x0023
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m38271a(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$c):void");
    }

    /* renamed from: a */
    private static void m38267a(String str, Object obj, C13091c cVar, boolean z) throws IOException {
        Class cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    m38267a(C1642a.m8034a("%s[%s]", new Object[]{str, str2}), jSONObject.opt(str2), cVar, z);
                }
            } else if (jSONObject.has("id")) {
                m38267a(str, (Object) jSONObject.optString("id"), cVar, z);
            } else if (jSONObject.has("url")) {
                m38267a(str, (Object) jSONObject.optString("url"), cVar, z);
            } else {
                if (jSONObject.has("fbsdk:create_object")) {
                    m38267a(str, (Object) jSONObject.toString(), cVar, z);
                }
            }
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                m38267a(C1642a.m8035a(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i)}), jSONArray.opt(i), cVar, z);
            }
        } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            cVar.mo31794a(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            cVar.mo31794a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        }
    }

    /* renamed from: a */
    private static void m38261a(Bundle bundle, C13093e eVar, GraphRequest graphRequest) throws IOException {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (m38272a(obj)) {
                eVar.mo31799a(str, obj, graphRequest);
            }
        }
    }

    /* renamed from: a */
    private static void m38269a(Map<String, C13089a> map, C13093e eVar) throws IOException {
        for (String str : map.keySet()) {
            C13089a aVar = (C13089a) map.get(str);
            if (m38281c(aVar.f34695b)) {
                eVar.mo31799a(str, aVar.f34695b, aVar.f34694a);
            }
        }
    }

    /* renamed from: a */
    private static void m38262a(C13093e eVar, Collection<GraphRequest> collection, Map<String, C13089a> map) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest a : collection) {
            a.m38270a(jSONArray, map);
        }
        eVar.mo31800a("batch", jSONArray, collection);
    }

    /* renamed from: a */
    public static boolean m38272a(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* renamed from: a */
    public final GraphResponse mo31788a() {
        return m38254a(this);
    }

    public GraphRequest() {
        this(null, null, null, null, null);
    }

    /* renamed from: g */
    private static String m38288g() {
        return C1642a.m8034a("multipart/form-data; boundary=%s", new Object[]{f34669b});
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        f34669b = sb.toString();
    }

    /* renamed from: f */
    private String m38286f() {
        if (f34671p.matcher(this.f34675e).matches()) {
            return this.f34675e;
        }
        return C1642a.m8034a("%s/%s", new Object[]{this.f34683m, this.f34675e});
    }

    /* renamed from: h */
    private static String m38290h() {
        if (f34672r == null) {
            f34672r = C1642a.m8034a("%s.%s", new Object[]{"FBAndroidSDK", "5.5.2"});
            String a = C13946r.m41123a();
            if (!C13967z.m41249a(a)) {
                f34672r = C1642a.m8035a(Locale.ROOT, "%s/%s", new Object[]{f34672r, a});
            }
        }
        return f34672r;
    }

    /* renamed from: d */
    private String m38282d() {
        if (this.f34685q == null) {
            String a = C1642a.m8034a("%s/%s", new Object[]{C13966y.m41209b(), m38286f()});
            m38280c();
            Uri parse = Uri.parse(m38255a(a, Boolean.valueOf(true)));
            return C1642a.m8034a("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
        }
        throw new FacebookException("Can't override URL for a batch request");
    }

    /* renamed from: e */
    private String m38284e() {
        String str;
        if (this.f34685q != null) {
            return this.f34685q.toString();
        }
        if (this.f34674d != HttpMethod.POST || this.f34675e == null || !this.f34675e.endsWith("/videos")) {
            str = C13966y.m41209b();
        } else {
            str = C13966y.m41210c();
        }
        String a = C1642a.m8034a("%s/%s", new Object[]{str, m38286f()});
        m38280c();
        return m38255a(a, Boolean.valueOf(false));
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("{Request: ");
        sb.append(" accessToken: ");
        if (this.f34673c == null) {
            obj = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            obj = this.f34673c;
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f34675e);
        sb.append(", graphObject: ");
        sb.append(this.f34676f);
        sb.append(", httpMethod: ");
        sb.append(this.f34674d);
        sb.append(", parameters: ");
        sb.append(this.f34680j);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: c */
    private void m38280c() {
        if (this.f34673c != null) {
            if (!this.f34680j.containsKey("access_token")) {
                String str = this.f34673c.f34627e;
                C13949t.m41132a(str);
                this.f34680j.putString("access_token", str);
            }
        } else if (!this.f34684n && !this.f34680j.containsKey("access_token")) {
            String k = C13499h.m39725k();
            String m = C13499h.m39727m();
            if (!C13967z.m41249a(k) && !C13967z.m41249a(m)) {
                StringBuilder sb = new StringBuilder();
                sb.append(k);
                sb.append("|");
                sb.append(m);
                this.f34680j.putString("access_token", sb.toString());
            }
        }
        this.f34680j.putString("sdk", "android");
        this.f34680j.putString("format", "json");
        if (C13499h.m39715b(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            this.f34680j.putString("debug", "info");
            return;
        }
        if (C13499h.m39715b(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.f34680j.putString("debug", "warning");
        }
    }

    /* renamed from: b */
    public final C13980k mo31790b() {
        return m38276b(this);
    }

    /* renamed from: b */
    private static C13980k m38275b(Collection<GraphRequest> collection) {
        return m38274b(new C14064l(collection));
    }

    /* renamed from: b */
    public static C13980k m38274b(C14064l lVar) {
        C13876aa.m40980a((Collection<T>) lVar, "requests");
        C13980k kVar = new C13980k(lVar);
        kVar.executeOnExecutor(C13499h.m39719e(), new Void[0]);
        return kVar;
    }

    /* renamed from: c */
    private static boolean m38281c(Object obj) {
        if ((obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static GraphResponse m38254a(GraphRequest graphRequest) {
        List a = m38260a(graphRequest);
        if (a != null && a.size() == 1) {
            return (GraphResponse) a.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    /* renamed from: b */
    private static C13980k m38276b(GraphRequest... graphRequestArr) {
        C13876aa.m40978a((Object) graphRequestArr, "requests");
        return m38275b((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    /* renamed from: d */
    private static boolean m38283d(C14064l lVar) {
        for (C14065a aVar : lVar.f37146e) {
            if (aVar instanceof C14066b) {
                return true;
            }
        }
        Iterator it = lVar.iterator();
        while (it.hasNext()) {
            if (((GraphRequest) it.next()).f34681k instanceof C13092d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m38285e(C14064l lVar) {
        Iterator it = lVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            Iterator it2 = graphRequest.f34680j.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (m38281c(graphRequest.f34680j.get((String) it2.next()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: g */
    private static String m38289g(C14064l lVar) {
        if (!C13967z.m41249a(lVar.f37147f)) {
            return lVar.f37147f;
        }
        Iterator it = lVar.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = ((GraphRequest) it.next()).f34673c;
            if (accessToken != null) {
                String str = accessToken.f34630h;
                if (str != null) {
                    return str;
                }
            }
        }
        if (!C13967z.m41249a(f34670o)) {
            return f34670o;
        }
        return C13499h.m39725k();
    }

    /* renamed from: b */
    public static String m38277b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    /* renamed from: c */
    private static HttpURLConnection m38279c(C14064l lVar) {
        URL url;
        m38287f(lVar);
        try {
            if (lVar.size() == 1) {
                url = new URL(lVar.get(0).m38284e());
            } else {
                url = new URL(C13966y.m41209b());
            }
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection a = m38256a(url);
                try {
                    m38265a(lVar, a);
                    return a;
                } catch (IOException | JSONException e) {
                    e = e;
                    httpURLConnection = a;
                    C13967z.m41243a((URLConnection) httpURLConnection);
                    throw new FacebookException("could not construct request body", e);
                }
            } catch (IOException | JSONException e2) {
                e = e2;
                C13967z.m41243a((URLConnection) httpURLConnection);
                throw new FacebookException("could not construct request body", e);
            }
        } catch (MalformedURLException e3) {
            throw new FacebookException("could not construct URL for request", (Throwable) e3);
        }
    }

    /* renamed from: f */
    private static void m38287f(C14064l lVar) {
        Iterator it = lVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            if (HttpMethod.GET.equals(graphRequest.f34674d) && m38278b(graphRequest)) {
                Bundle bundle = graphRequest.f34680j;
                if (!bundle.containsKey("fields") || C13967z.m41249a(bundle.getString("fields"))) {
                    C13949t.m41129a(LoggingBehavior.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", graphRequest.f34675e);
                }
            }
        }
    }

    /* renamed from: a */
    private static HttpURLConnection m38256a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        C13973j.m41283a(httpURLConnection, "User-Agent", m38290h());
        C13973j.m41283a(httpURLConnection, "Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* renamed from: b */
    private static boolean m38278b(GraphRequest graphRequest) {
        String str = graphRequest.f34683m;
        if (C13967z.m41249a(str)) {
            return true;
        }
        if (str.startsWith("v")) {
            str = str.substring(1);
        }
        String[] split = str.split("\\.");
        if ((split.length < 2 || Integer.parseInt(split[0]) <= 2) && (Integer.parseInt(split[0]) < 2 || Integer.parseInt(split[1]) < 4)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static List<GraphResponse> m38257a(C14064l lVar) {
        C13876aa.m40980a((Collection<T>) lVar, "requests");
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection c = m38279c(lVar);
            try {
                List<GraphResponse> a = m38258a(c, lVar);
                C13967z.m41243a((URLConnection) c);
                return a;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = c;
                C13967z.m41243a((URLConnection) httpURLConnection);
                throw th;
            }
        } catch (Exception e) {
            List<GraphResponse> a2 = GraphResponse.m38318a(lVar.f37143b, (HttpURLConnection) null, new FacebookException((Throwable) e));
            m38266a(lVar, a2);
            C13967z.m41243a((URLConnection) null);
            return a2;
        } catch (Throwable th2) {
            th = th2;
            C13967z.m41243a((URLConnection) httpURLConnection);
            throw th;
        }
    }

    /* renamed from: a */
    private static List<GraphResponse> m38259a(Collection<GraphRequest> collection) {
        return m38257a(new C14064l(collection));
    }

    /* renamed from: a */
    private String m38255a(String str, Boolean bool) {
        if (!bool.booleanValue() && this.f34674d == HttpMethod.POST) {
            return str;
        }
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f34680j.keySet()) {
            Object obj = this.f34680j.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (m38272a(obj)) {
                buildUpon.appendQueryParameter(str2, m38277b(obj).toString());
            } else if (this.f34674d == HttpMethod.GET) {
                throw new IllegalArgumentException(C1642a.m8035a(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    /* renamed from: a */
    public static List<GraphResponse> m38258a(HttpURLConnection httpURLConnection, C14064l lVar) {
        List<GraphResponse> a = GraphResponse.m38316a(httpURLConnection, lVar);
        C13967z.m41243a((URLConnection) httpURLConnection);
        int size = lVar.size();
        if (size == a.size()) {
            m38266a(lVar, a);
            C13196b.m38575a().mo32387d();
            return a;
        }
        throw new FacebookException(C1642a.m8035a(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(a.size()), Integer.valueOf(size)}));
    }

    /* renamed from: a */
    public static GraphRequest m38252a(AccessToken accessToken, String str, C13090b bVar) {
        GraphRequest graphRequest = new GraphRequest(null, str, null, null, null);
        return graphRequest;
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod) {
        this(accessToken, str, bundle, httpMethod, null);
    }

    /* renamed from: a */
    public static GraphRequest m38253a(AccessToken accessToken, String str, JSONObject jSONObject, C13090b bVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, null, HttpMethod.POST, bVar);
        graphRequest.f34676f = jSONObject;
        return graphRequest;
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, C13090b bVar) {
        this(accessToken, str, bundle, httpMethod, bVar, null);
    }

    private GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, C13090b bVar, String str2) {
        this.f34679i = true;
        this.f34673c = accessToken;
        this.f34675e = str;
        this.f34683m = null;
        mo31789a(bVar);
        m38263a(httpMethod);
        if (bundle != null) {
            this.f34680j = new Bundle(bundle);
        } else {
            this.f34680j = new Bundle();
        }
        if (this.f34683m == null) {
            this.f34683m = C13499h.m39722h();
        }
    }
}
