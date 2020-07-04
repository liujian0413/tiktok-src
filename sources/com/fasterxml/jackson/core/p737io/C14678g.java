package com.fasterxml.jackson.core.p737io;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* renamed from: com.fasterxml.jackson.core.io.g */
public final class C14678g extends Writer {

    /* renamed from: a */
    protected final C14674c f37958a;

    /* renamed from: b */
    OutputStream f37959b;

    /* renamed from: c */
    byte[] f37960c;

    /* renamed from: d */
    final int f37961d = (this.f37960c.length - 4);

    /* renamed from: e */
    int f37962e = 0;

    /* renamed from: f */
    int f37963f;

    public final void flush() throws IOException {
        if (this.f37959b != null) {
            if (this.f37962e > 0) {
                this.f37959b.write(this.f37960c, 0, this.f37962e);
                this.f37962e = 0;
            }
            this.f37959b.flush();
        }
    }

    public final void close() throws IOException {
        if (this.f37959b != null) {
            if (this.f37962e > 0) {
                this.f37959b.write(this.f37960c, 0, this.f37962e);
                this.f37962e = 0;
            }
            OutputStream outputStream = this.f37959b;
            this.f37959b = null;
            byte[] bArr = this.f37960c;
            if (bArr != null) {
                this.f37960c = null;
                this.f37958a.mo37197b(bArr);
            }
            outputStream.close();
            int i = this.f37963f;
            this.f37963f = 0;
            if (i > 0) {
                m42466b(i);
            }
        }
    }

    public final Writer append(char c) throws IOException {
        write((int) c);
        return this;
    }

    public final void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    public final void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    /* renamed from: a */
    private int m42465a(int i) throws IOException {
        int i2 = this.f37963f;
        this.f37963f = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - 55296) << 10) + 65536 + (i - 56320);
        }
        StringBuilder sb = new StringBuilder("Broken surrogate pair: first char 0x");
        sb.append(Integer.toHexString(i2));
        sb.append(", second 0x");
        sb.append(Integer.toHexString(i));
        sb.append("; illegal combination");
        throw new IOException(sb.toString());
    }

    /* renamed from: b */
    private static void m42466b(int i) throws IOException {
        if (i > 1114111) {
            StringBuilder sb = new StringBuilder("Illegal character point (0x");
            sb.append(Integer.toHexString(i));
            sb.append(") to output; max is 0x10FFFF as per RFC 4627");
            throw new IOException(sb.toString());
        } else if (i < 55296) {
            StringBuilder sb2 = new StringBuilder("Illegal character point (0x");
            sb2.append(Integer.toHexString(i));
            sb2.append(") to output");
            throw new IOException(sb2.toString());
        } else if (i <= 56319) {
            StringBuilder sb3 = new StringBuilder("Unmatched first part of surrogate pair (0x");
            sb3.append(Integer.toHexString(i));
            sb3.append(")");
            throw new IOException(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder("Unmatched second part of surrogate pair (0x");
            sb4.append(Integer.toHexString(i));
            sb4.append(")");
            throw new IOException(sb4.toString());
        }
    }

    public final void write(int i) throws IOException {
        int i2;
        if (this.f37963f > 0) {
            i = m42465a(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                m42466b(i);
            }
            this.f37963f = i;
            return;
        }
        if (this.f37962e >= this.f37961d) {
            this.f37959b.write(this.f37960c, 0, this.f37962e);
            this.f37962e = 0;
        }
        if (i < 128) {
            byte[] bArr = this.f37960c;
            int i3 = this.f37962e;
            this.f37962e = i3 + 1;
            bArr[i3] = (byte) i;
            return;
        }
        int i4 = this.f37962e;
        if (i < 2048) {
            int i5 = i4 + 1;
            this.f37960c[i4] = (byte) ((i >> 6) | 192);
            i2 = i5 + 1;
            this.f37960c[i5] = (byte) ((i & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        } else if (i <= 65535) {
            int i6 = i4 + 1;
            this.f37960c[i4] = (byte) ((i >> 12) | 224);
            int i7 = i6 + 1;
            this.f37960c[i6] = (byte) (((i >> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            int i8 = i7 + 1;
            this.f37960c[i7] = (byte) ((i & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            i2 = i8;
        } else {
            if (i > 1114111) {
                m42466b(i);
            }
            int i9 = i4 + 1;
            this.f37960c[i4] = (byte) ((i >> 18) | 240);
            int i10 = i9 + 1;
            this.f37960c[i9] = (byte) (((i >> 12) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            int i11 = i10 + 1;
            this.f37960c[i10] = (byte) (((i >> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            i2 = i11 + 1;
            this.f37960c[i11] = (byte) ((i & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        this.f37962e = i2;
    }

    public C14678g(C14674c cVar, OutputStream outputStream) {
        this.f37958a = cVar;
        this.f37959b = outputStream;
        this.f37960c = cVar.mo37201c();
    }

    public final void write(String str, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write((int) str.charAt(i));
            }
            return;
        }
        if (this.f37963f > 0) {
            int i3 = i + 1;
            i2--;
            write(m42465a(str.charAt(i)));
            i = i3;
        }
        int i4 = this.f37962e;
        byte[] bArr = this.f37960c;
        int i5 = this.f37961d;
        int i6 = i2 + r9;
        while (r9 < i6) {
            if (i4 >= i5) {
                this.f37959b.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = r9 + 1;
            char charAt = str.charAt(r9);
            if (charAt < 128) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) charAt;
                int i9 = i6 - i7;
                int i10 = i5 - i8;
                if (i9 > i10) {
                    i9 = i10;
                }
                int i11 = i9 + i7;
                i4 = i8;
                while (true) {
                    if (i7 >= i11) {
                        break;
                    }
                    int i12 = i7 + 1;
                    char charAt2 = str.charAt(i7);
                    if (charAt2 >= 128) {
                        charAt = charAt2;
                        i7 = i12;
                        break;
                    }
                    int i13 = i4 + 1;
                    bArr[i4] = (byte) charAt2;
                    i7 = i12;
                    i4 = i13;
                }
                r9 = i7;
            }
            if (charAt >= 2048) {
                if (charAt >= 55296 && charAt <= 57343) {
                    if (charAt > 56319) {
                        this.f37962e = i4;
                        m42466b(charAt);
                    }
                    this.f37963f = charAt;
                    if (i7 >= i6) {
                        break;
                    }
                    r9 = i7 + 1;
                    int a = m42465a(str.charAt(i7));
                    if (a > 1114111) {
                        this.f37962e = i4;
                        m42466b(a);
                    }
                    int i14 = i4 + 1;
                    bArr[i4] = (byte) ((a >> 18) | 240);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((a >> 12) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) (((a >> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    i4 = i16 + 1;
                    bArr[i16] = (byte) ((a & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                } else {
                    int i17 = i4 + 1;
                    bArr[i4] = (byte) ((charAt >> 12) | 224);
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) (((charAt >> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    int i19 = i18 + 1;
                    bArr[i18] = (byte) ((charAt & '?') | 128);
                    r9 = i7;
                    i4 = i19;
                }
            } else {
                int i20 = i4 + 1;
                bArr[i4] = (byte) ((charAt >> 6) | 192);
                i4 = i20 + 1;
                bArr[i20] = (byte) ((charAt & '?') | 128);
                r9 = i7;
            }
        }
        this.f37962e = i4;
    }

    public final void write(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write((int) cArr[i]);
            }
            return;
        }
        if (this.f37963f > 0) {
            int i3 = i + 1;
            i2--;
            write(m42465a(cArr[i]));
            i = i3;
        }
        int i4 = this.f37962e;
        byte[] bArr = this.f37960c;
        int i5 = this.f37961d;
        int i6 = i2 + r9;
        while (r9 < i6) {
            if (i4 >= i5) {
                this.f37959b.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = r9 + 1;
            char c = cArr[r9];
            if (c < 128) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) c;
                int i9 = i6 - i7;
                int i10 = i5 - i8;
                if (i9 > i10) {
                    i9 = i10;
                }
                int i11 = i9 + i7;
                i4 = i8;
                while (true) {
                    if (i7 >= i11) {
                        break;
                    }
                    int i12 = i7 + 1;
                    char c2 = cArr[i7];
                    if (c2 >= 128) {
                        c = c2;
                        i7 = i12;
                        break;
                    }
                    int i13 = i4 + 1;
                    bArr[i4] = (byte) c2;
                    i7 = i12;
                    i4 = i13;
                }
            }
            if (c >= 2048) {
                if (c >= 55296 && c <= 57343) {
                    if (c > 56319) {
                        this.f37962e = i4;
                        m42466b(c);
                    }
                    this.f37963f = c;
                    if (i7 >= i6) {
                        break;
                    }
                    r9 = i7 + 1;
                    int a = m42465a(cArr[i7]);
                    if (a > 1114111) {
                        this.f37962e = i4;
                        m42466b(a);
                    }
                    int i14 = i4 + 1;
                    bArr[i4] = (byte) ((a >> 18) | 240);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((a >> 12) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) (((a >> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    i4 = i16 + 1;
                    bArr[i16] = (byte) ((a & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                } else {
                    int i17 = i4 + 1;
                    bArr[i4] = (byte) ((c >> 12) | 224);
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) (((c >> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    int i19 = i18 + 1;
                    bArr[i18] = (byte) ((c & '?') | 128);
                    r9 = i7;
                    i4 = i19;
                }
            } else {
                int i20 = i4 + 1;
                bArr[i4] = (byte) ((c >> 6) | 192);
                i4 = i20 + 1;
                bArr[i20] = (byte) ((c & '?') | 128);
                r9 = i7;
            }
        }
        this.f37962e = i4;
    }
}
