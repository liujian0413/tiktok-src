package com.bytedance.retrofit2;

import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p637a.C12461b;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public final class RequestBuilder {

    /* renamed from: l */
    private static final char[] f33060l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public String f33061a;

    /* renamed from: b */
    public String f33062b;

    /* renamed from: c */
    public String f33063c;

    /* renamed from: d */
    public List<C12461b> f33064d;

    /* renamed from: e */
    public TypedOutput f33065e;

    /* renamed from: f */
    public int f33066f;

    /* renamed from: g */
    public String f33067g;

    /* renamed from: h */
    public boolean f33068h;

    /* renamed from: i */
    public int f33069i;

    /* renamed from: j */
    public boolean f33070j;

    /* renamed from: k */
    public Object f33071k;

    /* renamed from: m */
    private final C12479h f33072m;

    /* renamed from: n */
    private StringBuilder f33073n;

    /* renamed from: o */
    private String f33074o;

    /* renamed from: p */
    private final boolean f33075p;

    /* renamed from: q */
    private final FormUrlEncodedTypedOutput f33076q;

    /* renamed from: r */
    private final MultipartTypedOutput f33077r;

    static class MimeOverridingTypedOutput implements TypedOutput {
        private final TypedOutput delegate;
        private final String mimeType;

        public String mimeType() {
            return this.mimeType;
        }

        public String fileName() {
            return this.delegate.fileName();
        }

        public long length() {
            return this.delegate.length();
        }

        public String md5Stub() {
            return this.delegate.md5Stub();
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            this.delegate.writeTo(outputStream);
        }

        MimeOverridingTypedOutput(TypedOutput typedOutput, String str) {
            this.delegate = typedOutput;
            this.mimeType = str;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30405a(Object obj) {
        if (obj != null) {
            this.f33063c = obj.toString();
            return;
        }
        throw new NullPointerException("@Url parameter is null.");
    }

    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.bytedance.retrofit2.mime.TypedOutput] */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.bytedance.retrofit2.RequestBuilder$MimeOverridingTypedOutput] */
    /* JADX WARNING: type inference failed for: r12v26 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.p637a.C12462c mo30404a(com.bytedance.retrofit2.C12488k r12) {
        /*
            r11 = this;
            com.bytedance.retrofit2.mime.MultipartTypedOutput r12 = r11.f33077r
            if (r12 == 0) goto L_0x0015
            com.bytedance.retrofit2.mime.MultipartTypedOutput r12 = r11.f33077r
            int r12 = r12.getPartCount()
            if (r12 == 0) goto L_0x000d
            goto L_0x0015
        L_0x000d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Multipart requests must contain at least one part."
            r12.<init>(r0)
            throw r12
        L_0x0015:
            com.bytedance.retrofit2.h r12 = r11.f33072m
            java.lang.String r12 = r12.mo30460a()
            boolean r0 = com.bytedance.retrofit2.C12511o.m36353b()
            if (r0 == 0) goto L_0x0099
            okhttp3.HttpUrl r0 = okhttp3.HttpUrl.parse(r12)
            if (r0 == 0) goto L_0x007b
            java.lang.String r1 = r0.encodedPath()
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r0.encodedPath()
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0049
            java.lang.String r1 = "/"
            java.lang.String r2 = r11.f33063c
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0049
            java.lang.String r0 = r11.f33063c
            java.lang.StringBuilder r12 = m36220c(r12, r0)
            goto L_0x00f6
        L_0x0049:
            java.lang.String r12 = r11.f33063c
            okhttp3.HttpUrl r12 = r0.resolve(r12)
            if (r12 == 0) goto L_0x005d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
        L_0x005a:
            r12 = r0
            goto L_0x00f6
        L_0x005d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Malformed URL. Base: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", Relative: "
            r1.append(r0)
            java.lang.String r0 = r11.f33063c
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.<init>(r0)
            throw r12
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Malformed URL. Base: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", Relative: "
            r1.append(r0)
            java.lang.String r0 = r11.f33063c
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.<init>(r0)
            throw r12
        L_0x0099:
            java.net.URI r0 = java.net.URI.create(r12)     // Catch:{ Throwable -> 0x00cf }
            java.lang.String r1 = r0.getPath()     // Catch:{ Throwable -> 0x00cf }
            if (r1 == 0) goto L_0x00be
            java.lang.String r1 = r0.getPath()     // Catch:{ Throwable -> 0x00cf }
            int r1 = r1.length()     // Catch:{ Throwable -> 0x00cf }
            if (r1 <= 0) goto L_0x00be
            java.lang.String r1 = "/"
            java.lang.String r2 = r11.f33063c     // Catch:{ Throwable -> 0x00cf }
            boolean r1 = r1.equals(r2)     // Catch:{ Throwable -> 0x00cf }
            if (r1 == 0) goto L_0x00be
            java.lang.String r0 = r11.f33063c     // Catch:{ Throwable -> 0x00cf }
            java.lang.StringBuilder r0 = m36220c(r12, r0)     // Catch:{ Throwable -> 0x00cf }
            goto L_0x005a
        L_0x00be:
            java.lang.String r1 = r11.f33063c     // Catch:{ Throwable -> 0x00cf }
            java.net.URI r0 = r0.resolve(r1)     // Catch:{ Throwable -> 0x00cf }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00cf }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x00cf }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x00cf }
            r12 = r1
            goto L_0x00f6
        L_0x00cf:
            java.lang.String r0 = r11.f33063c
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = r11.f33063c
            java.lang.String r1 = "http://"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = r11.f33063c
            java.lang.String r1 = "https://"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x00f0
        L_0x00e8:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = r11.f33063c
            r12.<init>(r0)
            goto L_0x00f6
        L_0x00f0:
            java.lang.String r0 = r11.f33063c
            java.lang.StringBuilder r12 = m36220c(r12, r0)
        L_0x00f6:
            java.lang.StringBuilder r0 = r11.f33073n
            if (r0 == 0) goto L_0x0118
            r1 = 0
            char r2 = r0.charAt(r1)
            r3 = 63
            if (r3 != r2) goto L_0x0115
            java.lang.String r2 = r11.f33063c
            if (r2 == 0) goto L_0x0115
            java.lang.String r2 = r11.f33063c
            int r2 = r2.indexOf(r3)
            r3 = -1
            if (r2 == r3) goto L_0x0115
            r2 = 38
            r0.setCharAt(r1, r2)
        L_0x0115:
            r12.append(r0)
        L_0x0118:
            java.lang.String r12 = r12.toString()
            r11.f33062b = r12
            com.bytedance.retrofit2.mime.TypedOutput r12 = r11.f33065e
            java.util.List<com.bytedance.retrofit2.a.b> r0 = r11.f33064d
            java.lang.String r1 = r11.f33074o
            if (r1 == 0) goto L_0x0145
            if (r12 == 0) goto L_0x0132
            com.bytedance.retrofit2.RequestBuilder$MimeOverridingTypedOutput r1 = new com.bytedance.retrofit2.RequestBuilder$MimeOverridingTypedOutput
            java.lang.String r2 = r11.f33074o
            r1.<init>(r12, r2)
            r3 = r0
            r12 = r1
            goto L_0x0146
        L_0x0132:
            com.bytedance.retrofit2.a.b r1 = new com.bytedance.retrofit2.a.b
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = r11.f33074o
            r1.<init>(r2, r3)
            if (r0 != 0) goto L_0x0142
            java.util.List r0 = java.util.Collections.singletonList(r1)
            goto L_0x0145
        L_0x0142:
            r0.add(r1)
        L_0x0145:
            r3 = r0
        L_0x0146:
            if (r12 != 0) goto L_0x015c
            java.lang.String r0 = r11.f33061a
            boolean r0 = com.bytedance.retrofit2.C12536v.m36438a(r0)
            if (r0 == 0) goto L_0x015c
            com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput r12 = new com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput
            r12.<init>()
            java.lang.String r0 = "body"
            java.lang.String r1 = "null"
            r12.addField(r0, r1)
        L_0x015c:
            r4 = r12
            com.bytedance.retrofit2.a.c r12 = new com.bytedance.retrofit2.a.c
            java.lang.String r1 = r11.f33061a
            java.lang.String r2 = r11.f33062b
            int r5 = r11.f33066f
            boolean r6 = r11.f33068h
            int r7 = r11.f33069i
            boolean r8 = r11.f33070j
            java.lang.Object r9 = r11.f33071k
            java.lang.String r10 = r11.f33067g
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.RequestBuilder.mo30404a(com.bytedance.retrofit2.k):com.bytedance.retrofit2.a.c");
    }

    /* renamed from: a */
    public final void mo30406a(String str, TypedOutput typedOutput) {
        this.f33077r.addPart(str, typedOutput);
    }

    /* renamed from: c */
    private static StringBuilder m36220c(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (str.endsWith("/")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(str2);
        return sb;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30407a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null.");
        } else if ("Content-Type".equalsIgnoreCase(str)) {
            this.f33074o = str2;
        } else {
            List list = this.f33064d;
            if (list == null) {
                list = new ArrayList(2);
                this.f33064d = list;
            }
            list.add(new C12461b(str, str2));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo30410b(String str, String str2) {
        if (this.f33061a != null) {
            String str3 = this.f33061a;
            StringBuilder sb = new StringBuilder("{");
            sb.append(str);
            sb.append("}");
            this.f33061a = str3.replace(sb.toString(), str2);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final void mo30408a(String str, String str2, TypedOutput typedOutput) {
        this.f33077r.addPart(str, str2, typedOutput);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo30412c(String str, String str2, boolean z) {
        this.f33076q.addField(str, z, str2.toString(), z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo30411b(String str, String str2, boolean z) {
        char c;
        if (str != null) {
            try {
                StringBuilder sb = this.f33073n;
                if (sb == null) {
                    sb = new StringBuilder();
                    this.f33073n = sb;
                }
                if (sb.length() > 0) {
                    c = '&';
                } else {
                    c = '?';
                }
                sb.append(c);
                if (z) {
                    str = URLEncoder.encode(str, "UTF-8");
                }
                if (z) {
                    str2 = URLEncoder.encode(str2, "UTF-8");
                }
                if (str2 != null) {
                    if (!str2.isEmpty()) {
                        sb.append(str);
                        sb.append('=');
                        sb.append(str2);
                        return;
                    }
                }
                sb.append(str);
            } catch (UnsupportedEncodingException e) {
                StringBuilder sb2 = new StringBuilder("Unable to convert query parameter \"");
                sb2.append(str);
                sb2.append("\" value to UTF-8: ");
                sb2.append(str2);
                throw new RuntimeException(sb2.toString(), e);
            }
        } else {
            throw new IllegalArgumentException("Query param name must not be null.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30409a(String str, String str2, boolean z) {
        if (this.f33063c == null) {
            throw new AssertionError();
        } else if (str == null) {
            throw new IllegalArgumentException("Path replacement name must not be null.");
        } else if (str2 == null) {
            StringBuilder sb = new StringBuilder("Path replacement \"");
            sb.append(str);
            sb.append("\" value must not be null.");
            throw new IllegalArgumentException(sb.toString());
        } else if (z) {
            try {
                String replace = URLEncoder.encode(String.valueOf(str2), "UTF-8").replace("+", "%20");
                String str3 = this.f33063c;
                StringBuilder sb2 = new StringBuilder("{");
                sb2.append(str);
                sb2.append("}");
                this.f33063c = str3.replace(sb2.toString(), replace);
            } catch (UnsupportedEncodingException e) {
                StringBuilder sb3 = new StringBuilder("Unable to convert path parameter \"");
                sb3.append(str);
                sb3.append("\" value to UTF-8:");
                sb3.append(str2);
                throw new RuntimeException(sb3.toString(), e);
            }
        } else {
            String str4 = this.f33063c;
            StringBuilder sb4 = new StringBuilder("{");
            sb4.append(str);
            sb4.append("}");
            this.f33063c = str4.replace(sb4.toString(), String.valueOf(str2));
        }
    }

    RequestBuilder(String str, C12479h hVar, String str2, List<C12461b> list, String str3, int i, boolean z, int i2, boolean z2, Object obj, boolean z3, boolean z4, boolean z5, String str4) {
        this.f33061a = str;
        this.f33072m = hVar;
        this.f33063c = str2;
        this.f33074o = str3;
        this.f33066f = i;
        this.f33068h = z;
        this.f33069i = i2;
        this.f33070j = z2;
        this.f33071k = obj;
        this.f33075p = z3;
        this.f33064d = list;
        this.f33067g = str4;
        if (z4) {
            this.f33076q = new FormUrlEncodedTypedOutput();
            this.f33077r = null;
            this.f33065e = this.f33076q;
        } else if (z5) {
            this.f33076q = null;
            this.f33077r = new MultipartTypedOutput();
            this.f33065e = this.f33077r;
        } else {
            this.f33076q = null;
            this.f33077r = null;
        }
    }
}
