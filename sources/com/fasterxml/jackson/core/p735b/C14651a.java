package com.fasterxml.jackson.core.p735b;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.fasterxml.jackson.core.C14668d;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.C14671a;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.p736c.C14662a;
import com.fasterxml.jackson.core.p736c.C14665b;
import com.fasterxml.jackson.core.p737io.C14674c;
import com.fasterxml.jackson.core.p737io.C14676e;
import com.fasterxml.jackson.core.p737io.C14677f;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: com.fasterxml.jackson.core.b.a */
public final class C14651a {

    /* renamed from: a */
    protected final C14674c f37825a;

    /* renamed from: b */
    protected final InputStream f37826b;

    /* renamed from: c */
    protected final byte[] f37827c;

    /* renamed from: d */
    protected int f37828d;

    /* renamed from: e */
    protected boolean f37829e = true;

    /* renamed from: f */
    protected int f37830f;

    /* renamed from: g */
    private int f37831g;

    /* renamed from: h */
    private int f37832h;

    /* renamed from: i */
    private final boolean f37833i;

    /* renamed from: b */
    private Reader m42374b() throws IOException {
        JsonEncoding jsonEncoding = this.f37825a.f37934b;
        switch (jsonEncoding) {
            case UTF32_BE:
            case UTF32_LE:
                C14677f fVar = new C14677f(this.f37825a, this.f37826b, this.f37827c, this.f37831g, this.f37832h, this.f37825a.f37934b.isBigEndian());
                return fVar;
            case UTF16_BE:
            case UTF16_LE:
            case UTF8:
                InputStream inputStream = this.f37826b;
                if (inputStream == 0) {
                    inputStream = new ByteArrayInputStream(this.f37827c, this.f37831g, this.f37832h);
                } else if (this.f37831g < this.f37832h) {
                    C14676e eVar = new C14676e(this.f37825a, inputStream, this.f37827c, this.f37831g, this.f37832h);
                    inputStream = eVar;
                }
                return new InputStreamReader(inputStream, jsonEncoding.getJavaName());
            default:
                throw new RuntimeException("Internal error");
        }
    }

    /* renamed from: a */
    private JsonEncoding m42368a() throws IOException, JsonParseException {
        JsonEncoding jsonEncoding;
        boolean z = true;
        if (m42377d(4)) {
            byte b = (this.f37827c[this.f37831g] << 24) | ((this.f37827c[this.f37831g + 1] & 255) << 16) | ((this.f37827c[this.f37831g + 2] & 255) << 8) | (this.f37827c[this.f37831g + 3] & 255);
            if (!m42372a((int) b) && !m42375b((int) b)) {
                z = m42376c(b >>> 16);
            }
        } else if (!m42377d(2) || !m42376c(((this.f37827c[this.f37831g] & 255) << 8) | (this.f37827c[this.f37831g + 1] & 255))) {
            z = false;
        }
        if (!z) {
            jsonEncoding = JsonEncoding.UTF8;
        } else {
            int i = this.f37830f;
            if (i != 4) {
                switch (i) {
                    case 1:
                        jsonEncoding = JsonEncoding.UTF8;
                        break;
                    case 2:
                        if (!this.f37829e) {
                            jsonEncoding = JsonEncoding.UTF16_LE;
                            break;
                        } else {
                            jsonEncoding = JsonEncoding.UTF16_BE;
                            break;
                        }
                    default:
                        throw new RuntimeException("Internal error");
                }
            } else if (this.f37829e) {
                jsonEncoding = JsonEncoding.UTF32_BE;
            } else {
                jsonEncoding = JsonEncoding.UTF32_LE;
            }
        }
        this.f37825a.f37934b = jsonEncoding;
        return jsonEncoding;
    }

    /* renamed from: b */
    private static int m42373b(C14671a aVar) throws IOException {
        if (!aVar.mo37167a()) {
            return -1;
        }
        return m42367a(aVar, aVar.mo37168b());
    }

    /* renamed from: c */
    private boolean m42376c(int i) {
        if ((65280 & i) == 0) {
            this.f37829e = true;
        } else if ((i & NormalGiftView.ALPHA_255) != 0) {
            return false;
        } else {
            this.f37829e = false;
        }
        this.f37830f = 2;
        return true;
    }

    /* renamed from: b */
    private boolean m42375b(int i) throws IOException {
        if ((i >> 8) == 0) {
            this.f37829e = true;
        } else if ((16777215 & i) == 0) {
            this.f37829e = false;
        } else if ((-16711681 & i) == 0) {
            m42371a("3412");
        } else if ((i & -65281) != 0) {
            return false;
        } else {
            m42371a("2143");
        }
        this.f37830f = 4;
        return true;
    }

    /* renamed from: d */
    private boolean m42377d(int i) throws IOException {
        int i2;
        int i3 = this.f37832h - this.f37831g;
        while (i3 < i) {
            if (this.f37826b == null) {
                i2 = -1;
            } else {
                i2 = this.f37826b.read(this.f37827c, this.f37832h, this.f37827c.length - this.f37832h);
            }
            if (i2 <= 0) {
                return false;
            }
            this.f37832h += i2;
            i3 += i2;
        }
        return true;
    }

    /* renamed from: a */
    private static void m42371a(String str) throws IOException {
        StringBuilder sb = new StringBuilder("Unsupported UCS-4 endianness (");
        sb.append(str);
        sb.append(") detected");
        throw new CharConversionException(sb.toString());
    }

    /* renamed from: a */
    public static MatchStrength m42369a(C14671a aVar) throws IOException {
        if (!aVar.mo37167a()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte b = aVar.mo37168b();
        if (b == -17) {
            if (!aVar.mo37167a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (aVar.mo37168b() != -69) {
                return MatchStrength.NO_MATCH;
            }
            if (!aVar.mo37167a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (aVar.mo37168b() != -65) {
                return MatchStrength.NO_MATCH;
            }
            if (!aVar.mo37167a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            b = aVar.mo37168b();
        }
        int a = m42367a(aVar, b);
        if (a < 0) {
            return MatchStrength.INCONCLUSIVE;
        }
        if (a == 123) {
            int b2 = m42373b(aVar);
            if (b2 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (b2 == 34 || b2 == 125) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.NO_MATCH;
        } else if (a == 91) {
            int b3 = m42373b(aVar);
            if (b3 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (b3 == 93 || b3 == 91) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.SOLID_MATCH;
        } else {
            MatchStrength matchStrength = MatchStrength.WEAK_MATCH;
            if (a == 34) {
                return matchStrength;
            }
            if (a <= 57 && a >= 48) {
                return matchStrength;
            }
            if (a == 45) {
                int b4 = m42373b(aVar);
                if (b4 < 0) {
                    return MatchStrength.INCONCLUSIVE;
                }
                if (b4 > 57 || b4 < 48) {
                    return MatchStrength.NO_MATCH;
                }
                return matchStrength;
            } else if (a == 110) {
                return m42370a(aVar, "ull", matchStrength);
            } else {
                if (a == 116) {
                    return m42370a(aVar, "rue", matchStrength);
                }
                if (a == 102) {
                    return m42370a(aVar, "alse", matchStrength);
                }
                return MatchStrength.NO_MATCH;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m42372a(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = -16842752(0xfffffffffeff0000, float:-1.6947657E38)
            r1 = 65534(0xfffe, float:9.1833E-41)
            r2 = 65279(0xfeff, float:9.1475E-41)
            r3 = 0
            r4 = 1
            if (r7 == r0) goto L_0x0030
            r0 = -131072(0xfffffffffffe0000, float:NaN)
            r5 = 4
            if (r7 == r0) goto L_0x0026
            if (r7 == r2) goto L_0x001c
            if (r7 == r1) goto L_0x0016
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "2143"
            m42371a(r0)
            goto L_0x0030
        L_0x001c:
            r6.f37829e = r4
            int r7 = r6.f37831g
            int r7 = r7 + r5
            r6.f37831g = r7
            r6.f37830f = r5
            return r4
        L_0x0026:
            int r7 = r6.f37831g
            int r7 = r7 + r5
            r6.f37831g = r7
            r6.f37830f = r5
            r6.f37829e = r3
            return r4
        L_0x0030:
            java.lang.String r0 = "3412"
            m42371a(r0)
        L_0x0035:
            int r0 = r7 >>> 16
            r5 = 2
            if (r0 != r2) goto L_0x0044
            int r7 = r6.f37831g
            int r7 = r7 + r5
            r6.f37831g = r7
            r6.f37830f = r5
            r6.f37829e = r4
            return r4
        L_0x0044:
            if (r0 != r1) goto L_0x0050
            int r7 = r6.f37831g
            int r7 = r7 + r5
            r6.f37831g = r7
            r6.f37830f = r5
            r6.f37829e = r3
            return r4
        L_0x0050:
            int r7 = r7 >>> 8
            r0 = 15711167(0xefbbbf, float:2.2016034E-38)
            if (r7 != r0) goto L_0x0062
            int r7 = r6.f37831g
            int r7 = r7 + 3
            r6.f37831g = r7
            r6.f37830f = r4
            r6.f37829e = r4
            return r4
        L_0x0062:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p735b.C14651a.m42372a(int):boolean");
    }

    public C14651a(C14674c cVar, InputStream inputStream) {
        this.f37825a = cVar;
        this.f37826b = inputStream;
        this.f37827c = cVar.mo37199b();
        this.f37831g = 0;
        this.f37832h = 0;
        this.f37828d = 0;
        this.f37833i = true;
    }

    /* renamed from: a */
    private static int m42367a(C14671a aVar, byte b) throws IOException {
        while (true) {
            byte b2 = b & 255;
            if (b2 != 32 && b2 != 13 && b2 != 10 && b2 != 9) {
                return b2;
            }
            if (!aVar.mo37167a()) {
                return -1;
            }
            b = aVar.mo37168b();
        }
    }

    /* renamed from: a */
    private static MatchStrength m42370a(C14671a aVar, String str, MatchStrength matchStrength) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!aVar.mo37167a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (aVar.mo37168b() != str.charAt(i)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    public C14651a(C14674c cVar, byte[] bArr, int i, int i2) {
        this.f37825a = cVar;
        this.f37827c = bArr;
        this.f37831g = i;
        this.f37832h = i2 + i;
        this.f37828d = -i;
    }

    /* renamed from: a */
    public final JsonParser mo37144a(int i, C14668d dVar, C14662a aVar, C14665b bVar, boolean z, boolean z2) throws IOException, JsonParseException {
        boolean z3 = z;
        if (m42368a() != JsonEncoding.UTF8 || !z3) {
            boolean z4 = z2;
            C14657f fVar = new C14657f(this.f37825a, i, m42374b(), dVar, bVar.mo37158a(z, z2));
            return fVar;
        }
        int i2 = i;
        C14668d dVar2 = dVar;
        C14659h hVar = new C14659h(this.f37825a, i2, this.f37826b, dVar2, aVar.mo37156a(z3, z2), this.f37827c, this.f37831g, this.f37832h, this.f37833i);
        return hVar;
    }
}
