package com.fasterxml.jackson.core.p737io;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fasterxml.jackson.core.io.f */
public final class C14677f extends C14672a {

    /* renamed from: g */
    protected final boolean f37953g;

    /* renamed from: h */
    protected char f37954h;

    /* renamed from: i */
    protected int f37955i;

    /* renamed from: j */
    protected int f37956j;

    /* renamed from: k */
    protected final boolean f37957k;

    public final /* bridge */ /* synthetic */ void close() throws IOException {
        super.close();
    }

    public final /* bridge */ /* synthetic */ int read() throws IOException {
        return super.read();
    }

    /* renamed from: a */
    private boolean m42464a(int i) throws IOException {
        int i2;
        int i3;
        this.f37956j += this.f37922e - i;
        if (i > 0) {
            if (this.f37921d > 0) {
                for (int i4 = 0; i4 < i; i4++) {
                    byte[] bArr = this.f37920c;
                    bArr[i4] = bArr[this.f37921d + i4];
                }
                this.f37921d = 0;
            }
            this.f37922e = i;
        } else {
            this.f37921d = 0;
            if (this.f37919b == null) {
                i3 = -1;
            } else {
                i3 = this.f37919b.read(this.f37920c);
            }
            if (i3 <= 0) {
                this.f37922e = 0;
                if (i3 < 0) {
                    if (this.f37957k) {
                        mo37191a();
                    }
                    return false;
                }
                m42434b();
            }
            this.f37922e = i3;
        }
        while (this.f37922e < 4) {
            if (this.f37919b == null) {
                i2 = -1;
            } else {
                i2 = this.f37919b.read(this.f37920c, this.f37922e, this.f37920c.length - this.f37922e);
            }
            if (i2 <= 0) {
                if (i2 < 0) {
                    if (this.f37957k) {
                        mo37191a();
                    }
                    m42462a(this.f37922e, 4);
                }
                m42434b();
            }
            this.f37922e += i2;
        }
        return true;
    }

    /* renamed from: a */
    private void m42462a(int i, int i2) throws IOException {
        int i3 = this.f37956j + i;
        int i4 = this.f37955i;
        StringBuilder sb = new StringBuilder("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ");
        sb.append(i);
        sb.append(", needed 4");
        sb.append(", at char #");
        sb.append(i4);
        sb.append(", byte #");
        sb.append(i3);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    /* renamed from: a */
    private void m42463a(int i, int i2, String str) throws IOException {
        int i3 = (this.f37956j + this.f37921d) - 1;
        int i4 = this.f37955i + i2;
        StringBuilder sb = new StringBuilder("Invalid UTF-32 character 0x");
        sb.append(Integer.toHexString(i));
        sb.append(str);
        sb.append(" at char #");
        sb.append(i4);
        sb.append(", byte #");
        sb.append(i3);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte b;
        if (this.f37920c == null) {
            return -1;
        }
        if (i2 <= 0) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            m42433a(cArr, i, i2);
        }
        int i5 = i2 + i;
        if (this.f37954h != 0) {
            i3 = i + 1;
            cArr[i] = this.f37954h;
            this.f37954h = 0;
        } else {
            int i6 = this.f37922e - this.f37921d;
            if (i6 < 4 && !m42464a(i6)) {
                return -1;
            }
            i3 = i;
        }
        while (true) {
            if (i3 >= i5) {
                i4 = i3;
                break;
            }
            int i7 = this.f37921d;
            if (this.f37953g) {
                b = (this.f37920c[i7 + 3] & 255) | (this.f37920c[i7] << 24) | ((this.f37920c[i7 + 1] & 255) << 16) | ((this.f37920c[i7 + 2] & 255) << 8);
            } else {
                b = (this.f37920c[i7 + 3] << 24) | (this.f37920c[i7] & 255) | ((this.f37920c[i7 + 1] & 255) << 8) | ((this.f37920c[i7 + 2] & 255) << 16);
            }
            this.f37921d += 4;
            if (b > 65535) {
                if (b > 1114111) {
                    int i8 = i3 - i;
                    StringBuilder sb = new StringBuilder("(above ");
                    sb.append(Integer.toHexString(1114111));
                    sb.append(") ");
                    m42463a(b, i8, sb.toString());
                }
                int i9 = b - 65536;
                i4 = i3 + 1;
                cArr[i3] = (char) ((i9 >> 10) + 55296);
                b = (i9 & 1023) | 56320;
                if (i4 >= i5) {
                    this.f37954h = (char) b;
                    break;
                }
                i3 = i4;
            }
            i4 = i3 + 1;
            cArr[i3] = (char) b;
            if (this.f37921d >= this.f37922e) {
                break;
            }
            i3 = i4;
        }
        int i10 = i4 - i;
        this.f37955i += i10;
        return i10;
    }

    public C14677f(C14674c cVar, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        boolean z2;
        super(cVar, inputStream, bArr, i, i2);
        this.f37953g = z;
        if (inputStream != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f37957k = z2;
    }
}
