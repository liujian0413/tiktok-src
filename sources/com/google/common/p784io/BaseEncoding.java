package com.google.common.p784io;

import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.math.C18119c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: com.google.common.io.BaseEncoding */
public abstract class BaseEncoding {

    /* renamed from: a */
    private static final BaseEncoding f49434a = new C18099c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));

    /* renamed from: b */
    private static final BaseEncoding f49435b = new C18099c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));

    /* renamed from: c */
    private static final BaseEncoding f49436c = new C18100d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));

    /* renamed from: d */
    private static final BaseEncoding f49437d = new C18100d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));

    /* renamed from: e */
    private static final BaseEncoding f49438e = new C18098b("base16()", "0123456789ABCDEF");

    /* renamed from: com.google.common.io.BaseEncoding$DecodingException */
    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }

        DecodingException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$a */
    static final class C18097a {

        /* renamed from: a */
        public final char[] f49439a;

        /* renamed from: b */
        final int f49440b;

        /* renamed from: c */
        final int f49441c;

        /* renamed from: d */
        final int f49442d;

        /* renamed from: e */
        final int f49443e;

        /* renamed from: f */
        private final String f49444f;

        /* renamed from: g */
        private final byte[] f49445g;

        /* renamed from: h */
        private final boolean[] f49446h;

        public final String toString() {
            return this.f49444f;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f49439a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final char mo46715a(int i) {
            return this.f49439a[i];
        }

        /* renamed from: a */
        public final boolean mo46716a(char c) {
            if (c >= this.f49445g.length || this.f49445g[c] == -1) {
                return false;
            }
            return true;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C18097a)) {
                return false;
            }
            return Arrays.equals(this.f49439a, ((C18097a) obj).f49439a);
        }

        C18097a(String str, char[] cArr) {
            boolean z;
            boolean z2;
            this.f49444f = (String) C17439m.m57962a(str);
            this.f49439a = (char[]) C17439m.m57962a(cArr);
            try {
                this.f49441c = C18119c.m59888a(cArr.length, RoundingMode.UNNECESSARY);
                int min = Math.min(8, Integer.lowestOneBit(this.f49441c));
                try {
                    this.f49442d = 8 / min;
                    this.f49443e = this.f49441c / min;
                    this.f49440b = cArr.length - 1;
                    byte[] bArr = new byte[PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH];
                    Arrays.fill(bArr, -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        if (c < 128) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C17439m.m57970a(z, "Non-ASCII character: %s", c);
                        if (bArr[c] == -1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C17439m.m57970a(z2, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.f49445g = bArr;
                    boolean[] zArr = new boolean[this.f49442d];
                    for (int i2 = 0; i2 < this.f49443e; i2++) {
                        zArr[C18119c.m59887a(i2 * 8, this.f49441c, RoundingMode.CEILING)] = true;
                    }
                    this.f49446h = zArr;
                } catch (ArithmeticException e) {
                    StringBuilder sb = new StringBuilder("Illegal alphabet ");
                    sb.append(new String(cArr));
                    throw new IllegalArgumentException(sb.toString(), e);
                }
            } catch (ArithmeticException e2) {
                StringBuilder sb2 = new StringBuilder("Illegal alphabet length ");
                sb2.append(cArr.length);
                throw new IllegalArgumentException(sb2.toString(), e2);
            }
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$b */
    static final class C18098b extends C18100d {

        /* renamed from: a */
        final char[] f49447a;

        private C18098b(C18097a aVar) {
            boolean z;
            super(aVar, null);
            this.f49447a = new char[512];
            if (aVar.f49439a.length == 16) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57968a(z);
            for (int i = 0; i < 256; i++) {
                this.f49447a[i] = aVar.mo46715a(i >>> 4);
                this.f49447a[i | 256] = aVar.mo46715a(i & 15);
            }
        }

        C18098b(String str, String str2) {
            this(new C18097a(str, str2.toCharArray()));
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$c */
    static final class C18099c extends C18100d {
        private C18099c(C18097a aVar, Character ch) {
            boolean z;
            super(aVar, ch);
            if (aVar.f49439a.length == 64) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57968a(z);
        }

        C18099c(String str, String str2, Character ch) {
            this(new C18097a(str, str2.toCharArray()), ch);
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$d */
    static class C18100d extends BaseEncoding {

        /* renamed from: b */
        final C18097a f49448b;

        /* renamed from: c */
        final Character f49449c;

        public int hashCode() {
            return this.f49448b.hashCode() ^ C17434j.m57954a(this.f49449c);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f49448b.toString());
            if (8 % this.f49448b.f49441c != 0) {
                if (this.f49449c == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f49449c);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C18100d)) {
                return false;
            }
            C18100d dVar = (C18100d) obj;
            if (!this.f49448b.equals(dVar.f49448b) || !C17434j.m57955a(this.f49449c, dVar.f49449c)) {
                return false;
            }
            return true;
        }

        C18100d(C18097a aVar, Character ch) {
            boolean z;
            this.f49448b = (C18097a) C17439m.m57962a(aVar);
            if (ch == null || !aVar.mo46716a(ch.charValue())) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57976a(z, "Padding character %s was already in alphabet", (Object) ch);
            this.f49449c = ch;
        }

        C18100d(String str, String str2, Character ch) {
            this(new C18097a(str, str2.toCharArray()), ch);
        }
    }

    BaseEncoding() {
    }
}
