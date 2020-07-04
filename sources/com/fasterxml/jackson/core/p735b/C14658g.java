package com.fasterxml.jackson.core.p735b;

import com.fasterxml.jackson.core.C14668d;
import com.fasterxml.jackson.core.C14670f;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.p737io.C14673b;
import com.fasterxml.jackson.core.p737io.C14674c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.fasterxml.jackson.core.b.g */
public final class C14658g extends C14654c {

    /* renamed from: m */
    static final byte[] f37853m = C14673b.m42441e();

    /* renamed from: v */
    private static final byte[] f37854v = {110, 117, 108, 108};

    /* renamed from: w */
    private static final byte[] f37855w = {116, 114, 117, 101};

    /* renamed from: x */
    private static final byte[] f37856x = {102, 97, 108, 115, 101};

    /* renamed from: n */
    protected final OutputStream f37857n;

    /* renamed from: o */
    protected byte[] f37858o;

    /* renamed from: p */
    protected int f37859p;

    /* renamed from: q */
    protected final int f37860q;

    /* renamed from: r */
    protected final int f37861r;

    /* renamed from: s */
    protected char[] f37862s;

    /* renamed from: t */
    protected final int f37863t;

    /* renamed from: u */
    protected boolean f37864u = true;

    /* renamed from: d */
    private void m42394d() throws IOException {
        int i = this.f37859p;
        if (i > 0) {
            this.f37859p = 0;
            this.f37857n.write(this.f37858o, 0, i);
        }
    }

    /* renamed from: a */
    public final void mo37147a() {
        byte[] bArr = this.f37858o;
        if (bArr != null && this.f37864u) {
            this.f37858o = null;
            this.f37837h.mo37197b(bArr);
        }
        char[] cArr = this.f37862s;
        if (cArr != null) {
            this.f37862s = null;
            this.f37837h.mo37198b(cArr);
        }
    }

    public final void flush() throws IOException {
        m42394d();
        if (this.f37857n != null && mo37138a(Feature.FLUSH_PASSED_TO_STREAM)) {
            this.f37857n.flush();
        }
    }

    /* renamed from: b */
    private void m42391b() throws IOException, JsonGenerationException {
        if (!this.f37806e.mo37151a()) {
            StringBuilder sb = new StringBuilder("Current context not an ARRAY but ");
            sb.append(this.f37806e.mo37153c());
            m42362b(sb.toString());
        }
        if (this.f37796a != null) {
            this.f37796a.writeEndArray(this, this.f37806e.mo37154d());
        } else {
            if (this.f37859p >= this.f37860q) {
                m42394d();
            }
            byte[] bArr = this.f37858o;
            int i = this.f37859p;
            this.f37859p = i + 1;
            bArr[i] = 93;
        }
        this.f37806e = this.f37806e.f37846c;
    }

    /* renamed from: c */
    private void m42393c() throws IOException, JsonGenerationException {
        if (!this.f37806e.mo37152b()) {
            StringBuilder sb = new StringBuilder("Current context not an object but ");
            sb.append(this.f37806e.mo37153c());
            m42362b(sb.toString());
        }
        if (this.f37796a != null) {
            this.f37796a.writeEndObject(this, this.f37806e.mo37154d());
        } else {
            if (this.f37859p >= this.f37860q) {
                m42394d();
            }
            byte[] bArr = this.f37858o;
            int i = this.f37859p;
            this.f37859p = i + 1;
            bArr[i] = 125;
        }
        this.f37806e = this.f37806e.f37846c;
    }

    public final void close() throws IOException {
        super.close();
        if (this.f37858o != null && mo37138a(Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                C14656e eVar = this.f37806e;
                if (!eVar.mo37151a()) {
                    if (!eVar.mo37152b()) {
                        break;
                    }
                    m42393c();
                } else {
                    m42391b();
                }
            }
        }
        m42394d();
        if (this.f37857n != null) {
            if (this.f37837h.f37935c || mo37138a(Feature.AUTO_CLOSE_TARGET)) {
                this.f37857n.close();
            } else if (mo37138a(Feature.FLUSH_PASSED_TO_STREAM)) {
                this.f37857n.flush();
            }
        }
        mo37147a();
    }

    /* renamed from: b */
    public final void mo37102b(C14670f fVar) throws IOException, JsonGenerationException {
        byte[] asUnquotedUTF8 = fVar.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            m42389a(asUnquotedUTF8);
        }
    }

    /* renamed from: a */
    private final void m42389a(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f37859p + length > this.f37860q) {
            m42394d();
            if (length > 512) {
                this.f37857n.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f37858o, this.f37859p, length);
        this.f37859p += length;
    }

    /* renamed from: a */
    public final void mo37099a(char c) throws IOException, JsonGenerationException {
        if (this.f37859p + 3 >= this.f37860q) {
            m42394d();
        }
        byte[] bArr = this.f37858o;
        if (c <= 127) {
            int i = this.f37859p;
            this.f37859p = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 2048) {
            int i2 = this.f37859p;
            this.f37859p = i2 + 1;
            bArr[i2] = (byte) ((c >> 6) | 192);
            int i3 = this.f37859p;
            this.f37859p = i3 + 1;
            bArr[i3] = (byte) ((c & '?') | 128);
        } else {
            m42387a(c, null, 0, 0);
        }
    }

    /* renamed from: a */
    public final void mo37100a(String str) throws IOException, JsonGenerationException {
        int length = str.length();
        int i = 0;
        while (length > 0) {
            char[] cArr = this.f37862s;
            int length2 = cArr.length;
            if (length < length2) {
                length2 = length;
            }
            int i2 = i + length2;
            str.getChars(i, i2, cArr, 0);
            mo37101a(cArr, 0, length2);
            length -= length2;
            i = i2;
        }
    }

    /* renamed from: b */
    private int m42390b(int i, int i2) throws IOException {
        if (i2 < 56320 || i2 > 57343) {
            StringBuilder sb = new StringBuilder("Incomplete surrogate pair: first char 0x");
            sb.append(Integer.toHexString(i));
            sb.append(", second 0x");
            sb.append(Integer.toHexString(i2));
            m42362b(sb.toString());
        }
        return ((i - 55296) << 10) + 65536 + (i2 - 56320);
    }

    /* renamed from: a */
    private void m42388a(int i, int i2) throws IOException {
        int b = m42390b(i, i2);
        if (this.f37859p + 4 > this.f37860q) {
            m42394d();
        }
        byte[] bArr = this.f37858o;
        int i3 = this.f37859p;
        this.f37859p = i3 + 1;
        bArr[i3] = (byte) ((b >> 18) | 240);
        int i4 = this.f37859p;
        this.f37859p = i4 + 1;
        bArr[i4] = (byte) (((b >> 12) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        int i5 = this.f37859p;
        this.f37859p = i5 + 1;
        bArr[i5] = (byte) (((b >> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        int i6 = this.f37859p;
        this.f37859p = i6 + 1;
        bArr[i6] = (byte) ((b & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if ((r6.f37859p + 3) < r6.f37860q) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        m42394d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r2 = r8 + 1;
        r8 = r7[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r8 >= 2048) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r4 = r6.f37859p;
        r6.f37859p = r4 + 1;
        r1[r4] = (byte) ((r8 >> 6) | 192);
        r4 = r6.f37859p;
        r6.f37859p = r4 + 1;
        r1[r4] = (byte) ((r8 & '?') | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        m42387a(r8, r7, r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r8 = r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m42392b(char[] r7, int r8, int r9) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r6 = this;
            int r0 = r6.f37860q
            byte[] r1 = r6.f37858o
        L_0x0004:
            if (r8 >= r9) goto L_0x0053
        L_0x0006:
            char r2 = r7[r8]
            r3 = 128(0x80, float:1.794E-43)
            if (r2 >= r3) goto L_0x0021
            int r3 = r6.f37859p
            if (r3 < r0) goto L_0x0013
            r6.m42394d()
        L_0x0013:
            int r3 = r6.f37859p
            int r4 = r3 + 1
            r6.f37859p = r4
            byte r2 = (byte) r2
            r1[r3] = r2
            int r8 = r8 + 1
            if (r8 >= r9) goto L_0x0053
            goto L_0x0006
        L_0x0021:
            int r2 = r6.f37859p
            int r2 = r2 + 3
            int r4 = r6.f37860q
            if (r2 < r4) goto L_0x002c
            r6.m42394d()
        L_0x002c:
            int r2 = r8 + 1
            char r8 = r7[r8]
            r4 = 2048(0x800, float:2.87E-42)
            if (r8 >= r4) goto L_0x004e
            int r4 = r6.f37859p
            int r5 = r4 + 1
            r6.f37859p = r5
            int r5 = r8 >> 6
            r5 = r5 | 192(0xc0, float:2.69E-43)
            byte r5 = (byte) r5
            r1[r4] = r5
            int r4 = r6.f37859p
            int r5 = r4 + 1
            r6.f37859p = r5
            r8 = r8 & 63
            r8 = r8 | r3
            byte r8 = (byte) r8
            r1[r4] = r8
            goto L_0x0051
        L_0x004e:
            r6.m42387a(r8, r7, r2, r9)
        L_0x0051:
            r8 = r2
            goto L_0x0004
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p735b.C14658g.m42392b(char[], int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r0 = r6 + 1;
        r6 = r5[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r6 >= 2048) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r1 = r4.f37858o;
        r2 = r4.f37859p;
        r4.f37859p = r2 + 1;
        r1[r2] = (byte) ((r6 >> 6) | 192);
        r1 = r4.f37858o;
        r2 = r4.f37859p;
        r4.f37859p = r2 + 1;
        r1[r2] = (byte) ((r6 & '?') | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        m42387a(r6, r5, r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        r6 = r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37101a(char[] r5, int r6, int r7) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r4 = this;
            int r0 = r7 + r7
            int r0 = r0 + r7
            int r1 = r4.f37859p
            int r1 = r1 + r0
            int r2 = r4.f37860q
            r3 = 0
            if (r1 <= r2) goto L_0x0016
            int r1 = r4.f37860q
            if (r1 >= r0) goto L_0x0013
            r4.m42392b(r5, r3, r7)
            return
        L_0x0013:
            r4.m42394d()
        L_0x0016:
            int r7 = r7 + r3
        L_0x0017:
            if (r6 >= r7) goto L_0x005b
        L_0x0019:
            char r0 = r5[r6]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L_0x002f
            byte[] r1 = r4.f37858o
            int r2 = r4.f37859p
            int r3 = r2 + 1
            r4.f37859p = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r6 = r6 + 1
            if (r6 >= r7) goto L_0x005b
            goto L_0x0019
        L_0x002f:
            int r0 = r6 + 1
            char r6 = r5[r6]
            r1 = 2048(0x800, float:2.87E-42)
            if (r6 >= r1) goto L_0x0056
            byte[] r1 = r4.f37858o
            int r2 = r4.f37859p
            int r3 = r2 + 1
            r4.f37859p = r3
            int r3 = r6 >> 6
            r3 = r3 | 192(0xc0, float:2.69E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            byte[] r1 = r4.f37858o
            int r2 = r4.f37859p
            int r3 = r2 + 1
            r4.f37859p = r3
            r6 = r6 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            r1[r2] = r6
            goto L_0x0059
        L_0x0056:
            r4.m42387a(r6, r5, r0, r7)
        L_0x0059:
            r6 = r0
            goto L_0x0017
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p735b.C14658g.mo37101a(char[], int, int):void");
    }

    public C14658g(C14674c cVar, int i, C14668d dVar, OutputStream outputStream) {
        super(cVar, i, dVar);
        this.f37857n = outputStream;
        this.f37858o = cVar.mo37201c();
        this.f37860q = this.f37858o.length;
        this.f37861r = this.f37860q >> 3;
        this.f37862s = cVar.mo37203e();
        this.f37863t = this.f37862s.length;
        if (mo37138a(Feature.ESCAPE_NON_ASCII)) {
            mo37096a(127);
        }
    }

    /* renamed from: a */
    private int m42387a(int i, char[] cArr, int i2, int i3) throws IOException {
        if (i < 55296 || i > 57343) {
            byte[] bArr = this.f37858o;
            int i4 = this.f37859p;
            this.f37859p = i4 + 1;
            bArr[i4] = (byte) ((i >> 12) | 224);
            int i5 = this.f37859p;
            this.f37859p = i5 + 1;
            bArr[i5] = (byte) (((i >> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            int i6 = this.f37859p;
            this.f37859p = i6 + 1;
            bArr[i6] = (byte) ((i & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            return i2;
        }
        if (i2 >= i3) {
            m42362b("Split surrogate on writeRaw() input (last character)");
        }
        m42388a(i, cArr[i2]);
        return i2 + 1;
    }
}
