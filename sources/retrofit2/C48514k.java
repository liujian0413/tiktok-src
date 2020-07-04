package retrofit2;

import java.io.IOException;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.MultipartBody.Part;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;

/* renamed from: retrofit2.k */
final class C48514k {

    /* renamed from: b */
    private static final char[] f123650b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public RequestBody f123651a;

    /* renamed from: c */
    private final String f123652c;

    /* renamed from: d */
    private final HttpUrl f123653d;

    /* renamed from: e */
    private String f123654e;

    /* renamed from: f */
    private Builder f123655f;

    /* renamed from: g */
    private final Request.Builder f123656g = new Request.Builder();

    /* renamed from: h */
    private MediaType f123657h;

    /* renamed from: i */
    private final boolean f123658i;

    /* renamed from: j */
    private MultipartBody.Builder f123659j;

    /* renamed from: k */
    private FormBody.Builder f123660k;

    /* renamed from: retrofit2.k$a */
    static class C48515a extends RequestBody {

        /* renamed from: a */
        private final RequestBody f123661a;

        /* renamed from: b */
        private final MediaType f123662b;

        public final MediaType contentType() {
            return this.f123662b;
        }

        public final long contentLength() throws IOException {
            return this.f123661a.contentLength();
        }

        public final void writeTo(BufferedSink bufferedSink) throws IOException {
            this.f123661a.writeTo(bufferedSink);
        }

        C48515a(RequestBody requestBody, MediaType mediaType) {
            this.f123661a = requestBody;
            this.f123662b = mediaType;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Request mo123299a() {
        HttpUrl httpUrl;
        Builder builder = this.f123655f;
        if (builder != null) {
            httpUrl = builder.build();
        } else {
            httpUrl = this.f123653d.resolve(this.f123654e);
            if (httpUrl == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.f123653d);
                sb.append(", Relative: ");
                sb.append(this.f123654e);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        RequestBody requestBody = this.f123651a;
        if (requestBody == null) {
            if (this.f123660k != null) {
                requestBody = this.f123660k.build();
            } else if (this.f123659j != null) {
                requestBody = this.f123659j.build();
            } else if (this.f123658i) {
                requestBody = RequestBody.create((MediaType) null, new byte[0]);
            }
        }
        MediaType mediaType = this.f123657h;
        if (mediaType != null) {
            if (requestBody != null) {
                requestBody = new C48515a(requestBody, mediaType);
            } else {
                this.f123656g.addHeader("Content-Type", mediaType.toString());
            }
        }
        return this.f123656g.url(httpUrl).method(this.f123652c, requestBody).build();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo123300a(Object obj) {
        this.f123654e = obj.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo123304a(Part part) {
        this.f123659j.addPart(part);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo123303a(Headers headers, RequestBody requestBody) {
        this.f123659j.addPart(headers, requestBody);
    }

    /* renamed from: a */
    private static String m150252a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i);
                m150253a(buffer, str, i, length, z);
                return buffer.readUtf8();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo123301a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            MediaType parse = MediaType.parse(str2);
            if (parse != null) {
                this.f123657h = parse;
                return;
            }
            StringBuilder sb = new StringBuilder("Malformed content type: ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f123656g.addHeader(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo123306c(String str, String str2, boolean z) {
        if (z) {
            this.f123660k.addEncoded(str, str2);
        } else {
            this.f123660k.add(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo123305b(String str, String str2, boolean z) {
        if (this.f123654e != null) {
            this.f123655f = this.f123653d.newBuilder(this.f123654e);
            if (this.f123655f != null) {
                this.f123654e = null;
            } else {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.f123653d);
                sb.append(", Relative: ");
                sb.append(this.f123654e);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (z) {
            this.f123655f.addEncodedQueryParameter(str, str2);
        } else {
            this.f123655f.addQueryParameter(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo123302a(String str, String str2, boolean z) {
        if (this.f123654e != null) {
            String str3 = this.f123654e;
            StringBuilder sb = new StringBuilder("{");
            sb.append(str);
            sb.append("}");
            this.f123654e = str3.replace(sb.toString(), m150252a(str2, z));
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private static void m150253a(Buffer buffer, String str, int i, int i2, boolean z) {
        Buffer buffer2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(codePointAt);
                    while (!buffer2.exhausted()) {
                        byte readByte = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        buffer.writeByte((int) f123650b[(readByte >> 4) & 15]);
                        buffer.writeByte((int) f123650b[readByte & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    C48514k(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f123652c = str;
        this.f123653d = httpUrl;
        this.f123654e = str2;
        this.f123657h = mediaType;
        this.f123658i = z;
        if (headers != null) {
            this.f123656g.headers(headers);
        }
        if (z2) {
            this.f123660k = new FormBody.Builder();
            return;
        }
        if (z3) {
            this.f123659j = new MultipartBody.Builder();
            this.f123659j.setType(MultipartBody.FORM);
        }
    }
}
