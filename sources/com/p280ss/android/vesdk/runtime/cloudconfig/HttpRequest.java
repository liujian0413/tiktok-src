package com.p280ss.android.vesdk.runtime.cloudconfig;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

/* renamed from: com.ss.android.vesdk.runtime.cloudconfig.HttpRequest */
public final class HttpRequest {

    /* renamed from: f */
    private static final String[] f116807f = new String[0];

    /* renamed from: g */
    private static C45349b f116808g = C45349b.f116827a;

    /* renamed from: a */
    public boolean f116809a = true;

    /* renamed from: b */
    public int f116810b = VideoCacheReadBuffersizeExperiment.DEFAULT;

    /* renamed from: c */
    public long f116811c = -1;

    /* renamed from: d */
    public long f116812d;

    /* renamed from: e */
    public C45353e f116813e = C45353e.f116829a;

    /* renamed from: h */
    private HttpURLConnection f116814h;

    /* renamed from: i */
    private final URL f116815i;

    /* renamed from: j */
    private final String f116816j;

    /* renamed from: k */
    private C45352d f116817k;

    /* renamed from: l */
    private boolean f116818l;

    /* renamed from: m */
    private boolean f116819m;

    /* renamed from: n */
    private String f116820n;

    /* renamed from: o */
    private int f116821o;

    /* renamed from: com.ss.android.vesdk.runtime.cloudconfig.HttpRequest$HttpRequestException */
    public static class HttpRequestException extends RuntimeException {
        private static final long serialVersionUID = -1170466989781746231L;

        public IOException getCause() {
            return (IOException) super.getCause();
        }

        public HttpRequestException(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: com.ss.android.vesdk.runtime.cloudconfig.HttpRequest$a */
    protected static abstract class C45348a<V> extends C45351c<V> {

        /* renamed from: a */
        private final Closeable f116825a;

        /* renamed from: b */
        private final boolean f116826b;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo108569b() throws IOException {
            if (this.f116825a instanceof Flushable) {
                ((Flushable) this.f116825a).flush();
            }
            if (this.f116826b) {
                try {
                    this.f116825a.close();
                } catch (IOException unused) {
                }
            } else {
                this.f116825a.close();
            }
        }

        protected C45348a(Closeable closeable, boolean z) {
            this.f116825a = closeable;
            this.f116826b = z;
        }
    }

    /* renamed from: com.ss.android.vesdk.runtime.cloudconfig.HttpRequest$b */
    public interface C45349b {

        /* renamed from: a */
        public static final C45349b f116827a = new C45349b() {
            /* renamed from: a */
            public final HttpURLConnection mo108570a(URL url) throws IOException {
                return (HttpURLConnection) url.openConnection();
            }

            /* renamed from: a */
            public final HttpURLConnection mo108571a(URL url, Proxy proxy) throws IOException {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        };

        /* renamed from: a */
        HttpURLConnection mo108570a(URL url) throws IOException;

        /* renamed from: a */
        HttpURLConnection mo108571a(URL url, Proxy proxy) throws IOException;
    }

    /* renamed from: com.ss.android.vesdk.runtime.cloudconfig.HttpRequest$c */
    protected static abstract class C45351c<V> implements Callable<V> {
        protected C45351c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract V mo108567a() throws HttpRequestException, IOException;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo108569b() throws IOException;

        public V call() throws HttpRequestException {
            boolean z = true;
            try {
                V a = mo108567a();
                try {
                    mo108569b();
                    return a;
                } catch (IOException e) {
                    throw new HttpRequestException(e);
                }
            } catch (HttpRequestException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new HttpRequestException(e3);
            } catch (Throwable th) {
                th = th;
                mo108569b();
                throw th;
            }
        }
    }

    /* renamed from: com.ss.android.vesdk.runtime.cloudconfig.HttpRequest$d */
    public static class C45352d extends BufferedOutputStream {

        /* renamed from: a */
        public final CharsetEncoder f116828a;

        /* renamed from: a */
        public final C45352d mo108573a(String str) throws IOException {
            ByteBuffer encode = this.f116828a.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    /* renamed from: com.ss.android.vesdk.runtime.cloudconfig.HttpRequest$e */
    public interface C45353e {

        /* renamed from: a */
        public static final C45353e f116829a = new C45353e() {
        };
    }

    /* renamed from: a */
    private static StringBuilder m143324a(String str, StringBuilder sb) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            sb.append('/');
        }
        return sb;
    }

    /* renamed from: a */
    private static List<Object> m143325a(Object obj) {
        if (obj instanceof Object[]) {
            return Arrays.asList((Object[]) obj);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                arrayList.add(Integer.valueOf(iArr[i]));
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length2 = zArr.length;
            while (i < length2) {
                arrayList.add(Boolean.valueOf(zArr[i]));
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            while (i < length3) {
                arrayList.add(Long.valueOf(jArr[i]));
                i++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length4 = fArr.length;
            while (i < length4) {
                arrayList.add(Float.valueOf(fArr[i]));
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length5 = dArr.length;
            while (i < length5) {
                arrayList.add(Double.valueOf(dArr[i]));
                i++;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length6 = sArr.length;
            while (i < length6) {
                arrayList.add(Short.valueOf(sArr[i]));
                i++;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length7 = bArr.length;
            while (i < length7) {
                arrayList.add(Byte.valueOf(bArr[i]));
                i++;
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length8 = cArr.length;
            while (i < length8) {
                arrayList.add(Character.valueOf(cArr[i]));
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final String mo108565a() throws HttpRequestException {
        return m143327b(m143339i());
    }

    /* renamed from: j */
    private String m143340j() {
        return m143331c("Content-Encoding");
    }

    /* renamed from: k */
    private int m143341k() {
        return m143333d("Content-Length");
    }

    /* renamed from: d */
    private HttpURLConnection m143334d() {
        if (this.f116814h == null) {
            this.f116814h = m143332c();
        }
        return this.f116814h;
    }

    /* renamed from: g */
    private BufferedInputStream m143337g() throws HttpRequestException {
        return new BufferedInputStream(m143338h(), this.f116810b);
    }

    /* renamed from: i */
    private String m143339i() {
        return m143322a("Content-Type", "charset");
    }

    /* renamed from: m */
    private HttpRequest m143343m() throws HttpRequestException {
        try {
            return m143342l();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: n */
    private URL m143344n() {
        return m143334d().getURL();
    }

    /* renamed from: o */
    private String m143345o() {
        return m143334d().getRequestMethod();
    }

    /* renamed from: e */
    private int m143335e() throws HttpRequestException {
        try {
            m143342l();
            return m143334d().getResponseCode();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: f */
    private ByteArrayOutputStream m143336f() {
        int k = m143341k();
        if (k > 0) {
            return new ByteArrayOutputStream(k);
        }
        return new ByteArrayOutputStream();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m143345o());
        sb.append(' ');
        sb.append(m143344n());
        return sb.toString();
    }

    /* renamed from: c */
    private HttpURLConnection m143332c() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.f116820n != null) {
                httpURLConnection = f116808g.mo108571a(this.f116815i, m143330b());
            } else {
                httpURLConnection = f116808g.mo108570a(this.f116815i);
            }
            httpURLConnection.setRequestMethod(this.f116816j);
            return httpURLConnection;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: l */
    private HttpRequest m143342l() throws IOException {
        m143316a((C45353e) null);
        if (this.f116817k == null) {
            return this;
        }
        if (this.f116818l) {
            this.f116817k.mo108573a("\r\n--00content0boundary00--\r\n");
        }
        if (this.f116809a) {
            try {
                this.f116817k.close();
            } catch (IOException unused) {
            }
        } else {
            this.f116817k.close();
        }
        this.f116817k = null;
        return this;
    }

    /* renamed from: h */
    private InputStream m143338h() throws HttpRequestException {
        InputStream inputStream;
        if (m143335e() < 400) {
            try {
                inputStream = C45356b.m143361a(m143334d());
            } catch (IOException e) {
                throw new HttpRequestException(e);
            }
        } else {
            inputStream = m143334d().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = C45356b.m143361a(m143334d());
                } catch (IOException e2) {
                    if (m143341k() <= 0) {
                        inputStream = new ByteArrayInputStream(new byte[0]);
                    } else {
                        throw new HttpRequestException(e2);
                    }
                }
            }
        }
        if (!this.f116819m || !"gzip".equals(m143340j())) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e3) {
            throw new HttpRequestException(e3);
        }
    }

    /* renamed from: b */
    private Proxy m143330b() {
        return new Proxy(Type.HTTP, new InetSocketAddress(this.f116820n, this.f116821o));
    }

    /* renamed from: a */
    private HttpRequest m143316a(C45353e eVar) {
        this.f116813e = C45353e.f116829a;
        return this;
    }

    /* renamed from: b */
    private static HttpRequest m143326b(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "GET");
    }

    /* renamed from: d */
    private int m143333d(String str) throws HttpRequestException {
        return m143315a(str, -1);
    }

    /* renamed from: c */
    private String m143331c(String str) throws HttpRequestException {
        m143343m();
        return m143334d().getHeaderField(str);
    }

    /* renamed from: b */
    private String m143327b(String str) throws HttpRequestException {
        ByteArrayOutputStream f = m143336f();
        try {
            m143317a((InputStream) m143337g(), (OutputStream) f);
            return f.toString(m143321a(str));
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: a */
    private static String m143319a(CharSequence charSequence) throws HttpRequestException {
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(host);
                sb.append(':');
                sb.append(Integer.toString(port));
                host = sb.toString();
            }
            try {
                URI uri = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), null);
                String aSCIIString = uri.toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0) {
                    return aSCIIString;
                }
                int i = indexOf + 1;
                if (i >= aSCIIString.length()) {
                    return aSCIIString;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aSCIIString.substring(0, i));
                sb2.append(aSCIIString.substring(i).replace("+", "%2B"));
                return sb2.toString();
            } catch (URISyntaxException e) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e);
                throw new HttpRequestException(iOException);
            }
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    /* renamed from: a */
    private static String m143321a(String str) {
        if (str == null || str.length() <= 0) {
            return "UTF-8";
        }
        return str;
    }

    /* renamed from: a */
    private int m143315a(String str, int i) throws HttpRequestException {
        m143343m();
        return m143334d().getHeaderFieldInt(str, -1);
    }

    /* renamed from: a */
    private HttpRequest m143317a(InputStream inputStream, OutputStream outputStream) throws IOException {
        final InputStream inputStream2 = inputStream;
        final OutputStream outputStream2 = outputStream;
        C453471 r0 = new C45348a<HttpRequest>(inputStream, this.f116809a) {
            /* access modifiers changed from: private */
            /* renamed from: c */
            public HttpRequest mo108567a() throws IOException {
                byte[] bArr = new byte[HttpRequest.this.f116810b];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        return HttpRequest.this;
                    }
                    outputStream2.write(bArr, 0, read);
                    HttpRequest.this.f116812d += (long) read;
                }
            }
        };
        return (HttpRequest) r0.call();
    }

    private HttpRequest(CharSequence charSequence, String str) throws HttpRequestException {
        try {
            this.f116815i = new URL(charSequence.toString());
            this.f116816j = str;
        } catch (MalformedURLException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: b */
    private static StringBuilder m143329b(String str, StringBuilder sb) {
        int indexOf = str.indexOf(63);
        int length = sb.length() - 1;
        if (indexOf == -1) {
            sb.append('?');
        } else if (indexOf < length && str.charAt(length) != '&') {
            sb.append('&');
        }
        return sb;
    }

    /* renamed from: a */
    private static String m143320a(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return charSequence2;
        }
        StringBuilder sb = new StringBuilder(charSequence2);
        m143324a(charSequence2, sb);
        m143329b(charSequence2, sb);
        Iterator it = map.entrySet().iterator();
        Entry entry = (Entry) it.next();
        m143323a((Object) entry.getKey().toString(), entry.getValue(), sb);
        while (it.hasNext()) {
            sb.append('&');
            Entry entry2 = (Entry) it.next();
            m143323a((Object) entry2.getKey().toString(), entry2.getValue(), sb);
        }
        return sb.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f A[SYNTHETIC] */
    /* renamed from: b */
    private static java.lang.String m143328b(java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0071
            int r1 = r8.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x0071
        L_0x000a:
            int r1 = r8.length()
            r2 = 59
            int r3 = r8.indexOf(r2)
            r4 = 1
            int r3 = r3 + r4
            if (r3 == 0) goto L_0x0070
            if (r3 != r1) goto L_0x001b
            goto L_0x0070
        L_0x001b:
            int r5 = r8.indexOf(r2, r3)
            r6 = -1
            if (r5 != r6) goto L_0x0023
        L_0x0022:
            r5 = r1
        L_0x0023:
            if (r3 >= r5) goto L_0x006f
            r7 = 61
            int r7 = r8.indexOf(r7, r3)
            if (r7 == r6) goto L_0x0066
            if (r7 >= r5) goto L_0x0066
            java.lang.String r3 = r8.substring(r3, r7)
            java.lang.String r3 = r3.trim()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0066
            int r7 = r7 + 1
            java.lang.String r3 = r8.substring(r7, r5)
            java.lang.String r3 = r3.trim()
            int r7 = r3.length()
            if (r7 == 0) goto L_0x0066
            r8 = 2
            if (r7 <= r8) goto L_0x0065
            r8 = 0
            char r8 = r3.charAt(r8)
            r9 = 34
            if (r9 != r8) goto L_0x0065
            int r7 = r7 - r4
            char r8 = r3.charAt(r7)
            if (r9 != r8) goto L_0x0065
            java.lang.String r8 = r3.substring(r4, r7)
            return r8
        L_0x0065:
            return r3
        L_0x0066:
            int r3 = r5 + 1
            int r5 = r8.indexOf(r2, r3)
            if (r5 != r6) goto L_0x0023
            goto L_0x0022
        L_0x006f:
            return r0
        L_0x0070:
            return r0
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.runtime.cloudconfig.HttpRequest.m143328b(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private String m143322a(String str, String str2) {
        return m143328b(m143331c(str), str2);
    }

    /* renamed from: a */
    public static HttpRequest m143318a(CharSequence charSequence, Map<?, ?> map, boolean z) {
        return m143326b((CharSequence) m143319a((CharSequence) m143320a(charSequence, map)));
    }

    /* renamed from: a */
    private static StringBuilder m143323a(Object obj, Object obj2, StringBuilder sb) {
        if (obj2 != null && obj2.getClass().isArray()) {
            obj2 = m143325a(obj2);
        }
        if (obj2 instanceof Iterable) {
            Iterator it = ((Iterable) obj2).iterator();
            while (it.hasNext()) {
                sb.append(obj);
                sb.append("[]=");
                Object next = it.next();
                if (next != null) {
                    sb.append(next);
                }
                if (it.hasNext()) {
                    sb.append("&");
                }
            }
        } else {
            sb.append(obj);
            sb.append("=");
            if (obj2 != null) {
                sb.append(obj2);
            }
        }
        return sb;
    }
}
