package com.bytedance.jirafast.utils;

import com.C1642a;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
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
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

public final class JIRAHttpRequest {

    /* renamed from: f */
    private static final String[] f32102f = new String[0];

    /* renamed from: g */
    private static C12062c f32103g = C12062c.f32123a;

    /* renamed from: a */
    public boolean f32104a = true;

    /* renamed from: b */
    public int f32105b = VideoCacheReadBuffersizeExperiment.DEFAULT;

    /* renamed from: c */
    public long f32106c = -1;

    /* renamed from: d */
    public long f32107d;

    /* renamed from: e */
    public C12066f f32108e = C12066f.f32125a;

    /* renamed from: h */
    private HttpURLConnection f32109h;

    /* renamed from: i */
    private final URL f32110i;

    /* renamed from: j */
    private final String f32111j;

    /* renamed from: k */
    private C12065e f32112k;

    /* renamed from: l */
    private boolean f32113l;

    /* renamed from: m */
    private boolean f32114m;

    /* renamed from: n */
    private String f32115n;

    /* renamed from: o */
    private int f32116o;

    public static class HttpRequestException extends RuntimeException {
        private static final long serialVersionUID = -1170466989781746231L;

        public IOException getCause() {
            return (IOException) super.getCause();
        }

        public HttpRequestException(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: com.bytedance.jirafast.utils.JIRAHttpRequest$a */
    public static class C12060a {

        /* renamed from: a */
        private static final byte[] f32120a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: a */
        private static String m35182a(byte[] bArr) {
            return m35183a(bArr, 0, bArr.length);
        }

        /* renamed from: a */
        public static String m35181a(String str) {
            byte[] bArr;
            try {
                bArr = str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                bArr = str.getBytes();
            }
            return m35182a(bArr);
        }

        /* renamed from: a */
        private static String m35183a(byte[] bArr, int i, int i2) {
            byte[] b = m35185b(bArr, 0, i2);
            try {
                return new String(b, "US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                return new String(b);
            }
        }

        /* renamed from: b */
        private static byte[] m35185b(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw new NullPointerException("Cannot serialize a null array.");
            } else if (i < 0) {
                StringBuilder sb = new StringBuilder("Cannot have negative offset: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (i2 < 0) {
                StringBuilder sb2 = new StringBuilder("Cannot have length offset: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            } else if (i + i2 <= bArr.length) {
                int i3 = 4;
                int i4 = (i2 / 3) * 4;
                if (i2 % 3 <= 0) {
                    i3 = 0;
                }
                byte[] bArr2 = new byte[(i4 + i3)];
                int i5 = i2 - 2;
                int i6 = 0;
                int i7 = 0;
                while (i6 < i5) {
                    m35184a(bArr, i6 + i, 3, bArr2, i7);
                    i6 += 3;
                    i7 += 4;
                }
                if (i6 < i2) {
                    m35184a(bArr, i + i6, i2 - i6, bArr2, i7);
                    i7 += 4;
                }
                if (i7 > bArr2.length - 1) {
                    return bArr2;
                }
                byte[] bArr3 = new byte[i7];
                System.arraycopy(bArr2, 0, bArr3, 0, i7);
                return bArr3;
            } else {
                throw new IllegalArgumentException(C1642a.m8034a("Cannot have offset of %d and length of %d with array of length %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)}));
            }
        }

        /* renamed from: a */
        private static byte[] m35184a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            int i4;
            int i5;
            byte[] bArr3 = f32120a;
            int i6 = 0;
            if (i2 > 0) {
                i4 = (bArr[i] << 24) >>> 8;
            } else {
                i4 = 0;
            }
            if (i2 > 1) {
                i5 = (bArr[i + 1] << 24) >>> 16;
            } else {
                i5 = 0;
            }
            int i7 = i4 | i5;
            if (i2 > 2) {
                i6 = (bArr[i + 2] << 24) >>> 24;
            }
            int i8 = i7 | i6;
            switch (i2) {
                case 1:
                    bArr2[i3] = bArr3[i8 >>> 18];
                    bArr2[i3 + 1] = bArr3[(i8 >>> 12) & 63];
                    bArr2[i3 + 2] = 61;
                    bArr2[i3 + 3] = 61;
                    return bArr2;
                case 2:
                    bArr2[i3] = bArr3[i8 >>> 18];
                    bArr2[i3 + 1] = bArr3[(i8 >>> 12) & 63];
                    bArr2[i3 + 2] = bArr3[(i8 >>> 6) & 63];
                    bArr2[i3 + 3] = 61;
                    return bArr2;
                case 3:
                    bArr2[i3] = bArr3[i8 >>> 18];
                    bArr2[i3 + 1] = bArr3[(i8 >>> 12) & 63];
                    bArr2[i3 + 2] = bArr3[(i8 >>> 6) & 63];
                    bArr2[i3 + 3] = bArr3[i8 & 63];
                    return bArr2;
                default:
                    return bArr2;
            }
        }
    }

    /* renamed from: com.bytedance.jirafast.utils.JIRAHttpRequest$b */
    protected static abstract class C12061b<V> extends C12064d<V> {

        /* renamed from: a */
        private final Closeable f32121a;

        /* renamed from: b */
        private final boolean f32122b;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo29737b() throws IOException {
            if (this.f32121a instanceof Flushable) {
                ((Flushable) this.f32121a).flush();
            }
            if (this.f32122b) {
                try {
                    this.f32121a.close();
                } catch (IOException unused) {
                }
            } else {
                this.f32121a.close();
            }
        }

        protected C12061b(Closeable closeable, boolean z) {
            this.f32121a = closeable;
            this.f32122b = z;
        }
    }

    /* renamed from: com.bytedance.jirafast.utils.JIRAHttpRequest$c */
    public interface C12062c {

        /* renamed from: a */
        public static final C12062c f32123a = new C12062c() {
            /* renamed from: a */
            public final HttpURLConnection mo29738a(URL url) throws IOException {
                return (HttpURLConnection) url.openConnection();
            }

            /* renamed from: a */
            public final HttpURLConnection mo29739a(URL url, Proxy proxy) throws IOException {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        };

        /* renamed from: a */
        HttpURLConnection mo29738a(URL url) throws IOException;

        /* renamed from: a */
        HttpURLConnection mo29739a(URL url, Proxy proxy) throws IOException;
    }

    /* renamed from: com.bytedance.jirafast.utils.JIRAHttpRequest$d */
    protected static abstract class C12064d<V> implements Callable<V> {
        protected C12064d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract V mo29735a() throws HttpRequestException, IOException;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo29737b() throws IOException;

        public V call() throws HttpRequestException {
            boolean z = true;
            try {
                V a = mo29735a();
                try {
                    mo29737b();
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
                mo29737b();
                throw th;
            }
        }
    }

    /* renamed from: com.bytedance.jirafast.utils.JIRAHttpRequest$e */
    public static class C12065e extends BufferedOutputStream {

        /* renamed from: a */
        public final CharsetEncoder f32124a;

        /* renamed from: a */
        public final C12065e mo29741a(String str) throws IOException {
            ByteBuffer encode = this.f32124a.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }

        public C12065e(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.f32124a = Charset.forName(JIRAHttpRequest.m35135a(str)).newEncoder();
        }
    }

    /* renamed from: com.bytedance.jirafast.utils.JIRAHttpRequest$f */
    public interface C12066f {

        /* renamed from: a */
        public static final C12066f f32125a = new C12066f() {
        };
    }

    /* renamed from: a */
    public static String m35135a(String str) {
        return (str == null || str.length() <= 0) ? "UTF-8" : str;
    }

    /* renamed from: a */
    private static StringBuilder m35137a(String str, StringBuilder sb) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            sb.append('/');
        }
        return sb;
    }

    /* renamed from: a */
    private static StringBuilder m35136a(Object obj, Object obj2, StringBuilder sb) {
        if (obj2 != null && obj2.getClass().isArray()) {
            obj2 = m35138a(obj2);
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

    /* renamed from: a */
    private static List<Object> m35138a(Object obj) {
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
    public final int mo29721a() throws HttpRequestException {
        try {
            m35160q();
            return m35153j().getResponseCode();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: a */
    public final JIRAHttpRequest mo29723a(String str, String str2) {
        C12078h.m35231a(m35153j(), str, str2);
        return this;
    }

    /* renamed from: a */
    public final JIRAHttpRequest mo29722a(int i) {
        m35153j().setFixedLengthStreamingMode(i);
        return this;
    }

    /* renamed from: a */
    public final JIRAHttpRequest mo29724a(String str, String str2, String str3, File file) throws HttpRequestException {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            m35127a(file.length());
            return m35133a(str, str2, str3, (InputStream) bufferedInputStream);
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: o */
    private String m35158o() {
        return m35142c("Content-Encoding");
    }

    /* renamed from: p */
    private int m35159p() {
        return m35143d("Content-Length");
    }

    /* renamed from: j */
    private HttpURLConnection m35153j() {
        if (this.f32109h == null) {
            this.f32109h = m35152i();
        }
        return this.f32109h;
    }

    /* renamed from: l */
    private BufferedInputStream m35155l() throws HttpRequestException {
        return new BufferedInputStream(m35156m(), this.f32105b);
    }

    /* renamed from: n */
    private String m35157n() {
        return m35145d("Content-Type", "charset");
    }

    /* renamed from: r */
    private JIRAHttpRequest m35161r() throws HttpRequestException {
        try {
            return m35160q();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: u */
    private URL m35164u() {
        return m35153j().getURL();
    }

    /* renamed from: v */
    private String m35165v() {
        return m35153j().getRequestMethod();
    }

    /* renamed from: b */
    public final boolean mo29726b() throws HttpRequestException {
        if (200 == mo29721a()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final JIRAHttpRequest mo29731e() {
        m35153j().disconnect();
        return this;
    }

    /* renamed from: f */
    public final String mo29732f() throws HttpRequestException {
        return m35140b(m35157n());
    }

    /* renamed from: g */
    public final JIRAHttpRequest mo29733g() {
        return m35150g("application/json");
    }

    /* renamed from: h */
    private Proxy m35151h() {
        return new Proxy(Type.HTTP, new InetSocketAddress(this.f32115n, this.f32116o));
    }

    /* renamed from: k */
    private ByteArrayOutputStream m35154k() {
        int p = m35159p();
        if (p > 0) {
            return new ByteArrayOutputStream(p);
        }
        return new ByteArrayOutputStream();
    }

    /* renamed from: t */
    private JIRAHttpRequest m35163t() throws IOException {
        if (!this.f32113l) {
            this.f32113l = true;
            m35148f("multipart/form-data; boundary=00content0boundary00").m35162s();
            this.f32112k.mo29741a("--00content0boundary00\r\n");
        } else {
            this.f32112k.mo29741a("\r\n--00content0boundary00\r\n");
        }
        return this;
    }

    /* renamed from: d */
    public final boolean mo29730d() throws HttpRequestException {
        if (400 == mo29721a()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m35165v());
        sb.append(' ');
        sb.append(m35164u());
        return sb.toString();
    }

    /* renamed from: i */
    private HttpURLConnection m35152i() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.f32115n != null) {
                httpURLConnection = f32103g.mo29739a(this.f32110i, m35151h());
            } else {
                httpURLConnection = f32103g.mo29738a(this.f32110i);
            }
            httpURLConnection.setRequestMethod(this.f32111j);
            return httpURLConnection;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: q */
    private JIRAHttpRequest m35160q() throws IOException {
        m35128a((C12066f) null);
        if (this.f32112k == null) {
            return this;
        }
        if (this.f32113l) {
            this.f32112k.mo29741a("\r\n--00content0boundary00--\r\n");
        }
        if (this.f32104a) {
            try {
                this.f32112k.close();
            } catch (IOException unused) {
            }
        } else {
            this.f32112k.close();
        }
        this.f32112k = null;
        return this;
    }

    /* renamed from: s */
    private JIRAHttpRequest m35162s() throws IOException {
        if (this.f32112k != null) {
            return this;
        }
        m35153j().setDoOutput(true);
        this.f32112k = new C12065e(m35153j().getOutputStream(), m35147e(m35153j().getRequestProperty("Content-Type"), "charset"), this.f32105b);
        return this;
    }

    /* renamed from: m */
    private InputStream m35156m() throws HttpRequestException {
        InputStream inputStream;
        if (mo29721a() < 400) {
            try {
                inputStream = C12078h.m35230a(m35153j());
            } catch (IOException e) {
                throw new HttpRequestException(e);
            }
        } else {
            inputStream = m35153j().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = C12078h.m35230a(m35153j());
                } catch (IOException e2) {
                    if (m35159p() <= 0) {
                        inputStream = new ByteArrayInputStream(new byte[0]);
                    } else {
                        throw new HttpRequestException(e2);
                    }
                }
            }
        }
        if (!this.f32114m || !"gzip".equals(m35158o())) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e3) {
            throw new HttpRequestException(e3);
        }
    }

    /* renamed from: c */
    public final boolean mo29729c() throws HttpRequestException {
        if (201 == mo29721a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private JIRAHttpRequest m35128a(C12066f fVar) {
        this.f32108e = C12066f.f32125a;
        return this;
    }

    /* renamed from: b */
    public static JIRAHttpRequest m35139b(CharSequence charSequence) throws HttpRequestException {
        return new JIRAHttpRequest(charSequence, "POST");
    }

    /* renamed from: d */
    private int m35143d(String str) throws HttpRequestException {
        return m35126a(str, -1);
    }

    /* renamed from: e */
    private JIRAHttpRequest m35146e(String str) {
        return mo29723a("Authorization", str);
    }

    /* renamed from: f */
    private JIRAHttpRequest m35148f(String str) {
        return mo29728c(str, null);
    }

    /* renamed from: g */
    private JIRAHttpRequest m35150g(String str) {
        return mo29723a("Accept", str);
    }

    /* renamed from: c */
    private String m35142c(String str) throws HttpRequestException {
        m35161r();
        return m35153j().getHeaderField(str);
    }

    /* renamed from: a */
    private JIRAHttpRequest m35127a(long j) {
        if (this.f32106c == -1) {
            this.f32106c = 0;
        }
        this.f32106c += j;
        return this;
    }

    /* renamed from: b */
    private String m35140b(String str) throws HttpRequestException {
        ByteArrayOutputStream k = m35154k();
        try {
            m35129a((InputStream) m35155l(), (OutputStream) k);
            return k.toString(m35135a(str));
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: c */
    public final JIRAHttpRequest mo29727c(CharSequence charSequence) throws HttpRequestException {
        try {
            m35162s();
            this.f32112k.mo29741a(charSequence.toString());
            return this;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: a */
    public static JIRAHttpRequest m35130a(CharSequence charSequence) throws HttpRequestException {
        return new JIRAHttpRequest(charSequence, "GET");
    }

    /* renamed from: d */
    private static String m35144d(CharSequence charSequence) throws HttpRequestException {
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
    private int m35126a(String str, int i) throws HttpRequestException {
        m35161r();
        return m35153j().getHeaderFieldInt(str, -1);
    }

    /* renamed from: d */
    private String m35145d(String str, String str2) {
        return m35147e(m35142c(str), str2);
    }

    /* renamed from: f */
    private JIRAHttpRequest m35149f(String str, String str2) throws HttpRequestException {
        return mo29727c((CharSequence) str).mo29727c((CharSequence) ": ").mo29727c((CharSequence) str2).mo29727c((CharSequence) "\r\n");
    }

    private JIRAHttpRequest(CharSequence charSequence, String str) throws HttpRequestException {
        try {
            this.f32110i = new URL(charSequence.toString());
            this.f32111j = str;
        } catch (MalformedURLException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: a */
    private JIRAHttpRequest m35129a(InputStream inputStream, OutputStream outputStream) throws IOException {
        final InputStream inputStream2 = inputStream;
        final OutputStream outputStream2 = outputStream;
        C120591 r0 = new C12061b<JIRAHttpRequest>(inputStream, this.f32104a) {
            /* access modifiers changed from: private */
            /* renamed from: c */
            public JIRAHttpRequest mo29735a() throws IOException {
                byte[] bArr = new byte[JIRAHttpRequest.this.f32105b];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        return JIRAHttpRequest.this;
                    }
                    outputStream2.write(bArr, 0, read);
                    JIRAHttpRequest.this.f32107d += (long) read;
                }
            }
        };
        return (JIRAHttpRequest) r0.call();
    }

    /* renamed from: b */
    private static StringBuilder m35141b(String str, StringBuilder sb) {
        int indexOf = str.indexOf(63);
        int length = sb.length() - 1;
        if (indexOf == -1) {
            sb.append('?');
        } else if (indexOf < length && str.charAt(length) != '&') {
            sb.append('&');
        }
        return sb;
    }

    /* renamed from: c */
    public final JIRAHttpRequest mo29728c(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return mo29723a("Content-Type", str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; charset=");
        sb.append(str2);
        return mo29723a("Content-Type", sb.toString());
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
    /* renamed from: e */
    private static java.lang.String m35147e(java.lang.String r8, java.lang.String r9) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.utils.JIRAHttpRequest.m35147e(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public final JIRAHttpRequest mo29725b(String str, String str2) {
        StringBuilder sb = new StringBuilder("Basic ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(':');
        sb2.append(str2);
        sb.append(C12060a.m35181a(sb2.toString()));
        return m35146e(sb.toString());
    }

    /* renamed from: a */
    private static String m35134a(CharSequence charSequence, Object... objArr) {
        String charSequence2 = charSequence.toString();
        if (objArr == null || objArr.length == 0) {
            return charSequence2;
        }
        if (objArr.length % 2 == 0) {
            StringBuilder sb = new StringBuilder(charSequence2);
            m35137a(charSequence2, sb);
            m35141b(charSequence2, sb);
            m35136a(objArr[0], objArr[1], sb);
            for (int i = 2; i < objArr.length; i += 2) {
                sb.append('&');
                m35136a(objArr[i], objArr[i + 1], sb);
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Must specify an even number of parameter names/values");
    }

    /* renamed from: a */
    public static JIRAHttpRequest m35131a(CharSequence charSequence, boolean z, Object... objArr) {
        return m35130a((CharSequence) m35144d((CharSequence) m35134a(charSequence, objArr)));
    }

    /* renamed from: a */
    private JIRAHttpRequest m35132a(String str, String str2, String str3) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(str);
        if (str2 != null) {
            sb.append("\"; filename=\"");
            sb.append(str2);
        }
        sb.append('\"');
        m35149f("Content-Disposition", sb.toString());
        if (str3 != null) {
            m35149f("Content-Type", str3);
        }
        return mo29727c((CharSequence) "\r\n");
    }

    /* renamed from: a */
    private JIRAHttpRequest m35133a(String str, String str2, String str3, InputStream inputStream) throws HttpRequestException {
        try {
            m35163t();
            m35132a(str, str2, str3);
            m35129a(inputStream, (OutputStream) this.f32112k);
            return this;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }
}
