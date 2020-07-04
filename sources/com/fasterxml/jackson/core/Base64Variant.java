package com.fasterxml.jackson.core;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.Serializable;
import java.util.Arrays;

public final class Base64Variant implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient int[] _asciiToBase64;
    private final transient byte[] _base64ToAsciiB;
    private final transient char[] _base64ToAsciiC;
    protected final transient int _maxLineLength;
    protected final String _name;
    protected final transient char _paddingChar;
    protected final transient boolean _usesPadding;

    public final int getMaxLineLength() {
        return this._maxLineLength;
    }

    public final String getName() {
        return this._name;
    }

    public final byte getPaddingByte() {
        return (byte) this._paddingChar;
    }

    public final char getPaddingChar() {
        return this._paddingChar;
    }

    public final String toString() {
        return this._name;
    }

    public final boolean usesPadding() {
        return this._usesPadding;
    }

    /* access modifiers changed from: protected */
    public final Object readResolve() {
        return C14646a.m42361a(this._name);
    }

    public final String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public final byte encodeBase64BitsAsByte(int i) {
        return this._base64ToAsciiB[i];
    }

    public final char encodeBase64BitsAsChar(int i) {
        return this._base64ToAsciiC[i];
    }

    public final boolean usesPaddingChar(char c) {
        if (c == this._paddingChar) {
            return true;
        }
        return false;
    }

    public final int decodeBase64Byte(byte b) {
        if (b <= Byte.MAX_VALUE) {
            return this._asciiToBase64[b];
        }
        return -1;
    }

    public final int decodeBase64Char(char c) {
        if (c <= 127) {
            return this._asciiToBase64[c];
        }
        return -1;
    }

    public final boolean usesPaddingChar(int i) {
        if (i == this._paddingChar) {
            return true;
        }
        return false;
    }

    public final int decodeBase64Char(int i) {
        if (i <= 127) {
            return this._asciiToBase64[i];
        }
        return -1;
    }

    public final String encode(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append('\"');
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i = 0;
        int i2 = length - 3;
        while (i <= i2) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            encodeBase64Chunk(sb, (((bArr[i] << 8) | (bArr[i3] & 255)) << 8) | (bArr[i4] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb.append('\\');
                sb.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
            i = i5;
        }
        int i6 = length - i;
        if (i6 > 0) {
            int i7 = i + 1;
            int i8 = bArr[i] << 16;
            if (i6 == 2) {
                i8 |= (bArr[i7] & 255) << 8;
            }
            encodeBase64Partial(sb, i8, i6);
        }
        if (z) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public final void encodeBase64Chunk(StringBuilder sb, int i) {
        sb.append(this._base64ToAsciiC[(i >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i >> 12) & 63]);
        sb.append(this._base64ToAsciiC[(i >> 6) & 63]);
        sb.append(this._base64ToAsciiC[i & 63]);
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i) {
        this(base64Variant, str, base64Variant._usesPadding, base64Variant._paddingChar, i);
    }

    public final int encodeBase64Chunk(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = this._base64ToAsciiB[(i >> 18) & 63];
        int i4 = i3 + 1;
        bArr[i3] = this._base64ToAsciiB[(i >> 12) & 63];
        int i5 = i4 + 1;
        bArr[i4] = this._base64ToAsciiB[(i >> 6) & 63];
        int i6 = i5 + 1;
        bArr[i5] = this._base64ToAsciiB[i & 63];
        return i6;
    }

    public final void encodeBase64Partial(StringBuilder sb, int i, int i2) {
        char c;
        sb.append(this._base64ToAsciiC[(i >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i >> 12) & 63]);
        if (this._usesPadding) {
            if (i2 == 2) {
                c = this._base64ToAsciiC[(i >> 6) & 63];
            } else {
                c = this._paddingChar;
            }
            sb.append(c);
            sb.append(this._paddingChar);
            return;
        }
        if (i2 == 2) {
            sb.append(this._base64ToAsciiC[(i >> 6) & 63]);
        }
    }

    public final int encodeBase64Chunk(int i, char[] cArr, int i2) {
        int i3 = i2 + 1;
        cArr[i2] = this._base64ToAsciiC[(i >> 18) & 63];
        int i4 = i3 + 1;
        cArr[i3] = this._base64ToAsciiC[(i >> 12) & 63];
        int i5 = i4 + 1;
        cArr[i4] = this._base64ToAsciiC[(i >> 6) & 63];
        int i6 = i5 + 1;
        cArr[i5] = this._base64ToAsciiC[i & 63];
        return i6;
    }

    public final int encodeBase64Partial(int i, int i2, byte[] bArr, int i3) {
        byte b;
        int i4 = i3 + 1;
        bArr[i3] = this._base64ToAsciiB[(i >> 18) & 63];
        int i5 = i4 + 1;
        bArr[i4] = this._base64ToAsciiB[(i >> 12) & 63];
        if (this._usesPadding) {
            byte b2 = (byte) this._paddingChar;
            int i6 = i5 + 1;
            if (i2 == 2) {
                b = this._base64ToAsciiB[(i >> 6) & 63];
            } else {
                b = b2;
            }
            bArr[i5] = b;
            int i7 = i6 + 1;
            bArr[i6] = b2;
            return i7;
        } else if (i2 != 2) {
            return i5;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = this._base64ToAsciiB[(i >> 6) & 63];
            return i8;
        }
    }

    public final int encodeBase64Partial(int i, int i2, char[] cArr, int i3) {
        char c;
        int i4 = i3 + 1;
        cArr[i3] = this._base64ToAsciiC[(i >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = this._base64ToAsciiC[(i >> 12) & 63];
        if (this._usesPadding) {
            int i6 = i5 + 1;
            if (i2 == 2) {
                c = this._base64ToAsciiC[(i >> 6) & 63];
            } else {
                c = this._paddingChar;
            }
            cArr[i5] = c;
            int i7 = i6 + 1;
            cArr[i6] = this._paddingChar;
            return i7;
        } else if (i2 != 2) {
            return i5;
        } else {
            int i8 = i5 + 1;
            cArr[i5] = this._base64ToAsciiC[(i >> 6) & 63];
            return i8;
        }
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, int i) {
        this._asciiToBase64 = new int[PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH];
        this._base64ToAsciiC = new char[64];
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        byte[] bArr = base64Variant._base64ToAsciiB;
        System.arraycopy(bArr, 0, this._base64ToAsciiB, 0, bArr.length);
        char[] cArr = base64Variant._base64ToAsciiC;
        System.arraycopy(cArr, 0, this._base64ToAsciiC, 0, cArr.length);
        int[] iArr = base64Variant._asciiToBase64;
        System.arraycopy(iArr, 0, this._asciiToBase64, 0, iArr.length);
        this._usesPadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
    }

    public Base64Variant(String str, String str2, boolean z, char c, int i) {
        this._asciiToBase64 = new int[PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH];
        this._base64ToAsciiC = new char[64];
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        this._usesPadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
        int length = str2.length();
        if (length == 64) {
            str2.getChars(0, length, this._base64ToAsciiC, 0);
            Arrays.fill(this._asciiToBase64, -1);
            for (int i2 = 0; i2 < length; i2++) {
                char c2 = this._base64ToAsciiC[i2];
                this._base64ToAsciiB[i2] = (byte) c2;
                this._asciiToBase64[c2] = i2;
            }
            if (z) {
                this._asciiToBase64[c] = -2;
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Base64Alphabet length must be exactly 64 (was ");
        sb.append(length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
