package com.google.android.gms.internal.ads;

import com.C1642a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.nio.ByteBuffer;

final class bav extends bau {
    bav() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo40459a(int i, byte[] bArr, int i2, int i3) {
        while (r9 < i3 && bArr[r9] >= 0) {
            i2 = r9 + 1;
        }
        if (r9 >= i3) {
            return 0;
        }
        while (r9 < i3) {
            int i4 = r9 + 1;
            byte b = bArr[r9];
            if (b < 0) {
                if (b < -32) {
                    if (i4 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        r9 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (b < -16) {
                    if (i4 >= i3 - 1) {
                        return bas.m48233d(bArr, i4, i3);
                    }
                    int i5 = i4 + 1;
                    byte b2 = bArr[i4];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        r9 = i5 + 1;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                } else if (i4 >= i3 - 2) {
                    return bas.m48233d(bArr, i4, i3);
                } else {
                    int i6 = i4 + 1;
                    byte b3 = bArr[i4];
                    if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                        int i7 = i6 + 1;
                        if (bArr[i6] <= -65) {
                            i4 = i7 + 1;
                            if (bArr[i7] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            r9 = i4;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo40463b(byte[] bArr, int i, int i2) throws zzcdx {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (r13 < i3) {
                byte b = bArr[r13];
                if (!bat.m48245d(b)) {
                    break;
                }
                i = r13 + 1;
                int i5 = i4 + 1;
                bat.m48242b(b, cArr, i4);
                i4 = i5;
            }
            int i6 = i4;
            while (r13 < i3) {
                int i7 = r13 + 1;
                byte b2 = bArr[r13];
                if (bat.m48245d(b2)) {
                    int i8 = i6 + 1;
                    bat.m48242b(b2, cArr, i6);
                    while (i7 < i3) {
                        byte b3 = bArr[i7];
                        if (!bat.m48245d(b3)) {
                            break;
                        }
                        i7++;
                        int i9 = i8 + 1;
                        bat.m48242b(b3, cArr, i8);
                        i8 = i9;
                    }
                    r13 = i7;
                    i6 = i8;
                } else if (bat.m48246e(b2)) {
                    if (i7 < i3) {
                        int i10 = i7 + 1;
                        int i11 = i6 + 1;
                        bat.m48241b(b2, bArr[i7], cArr, i6);
                        r13 = i10;
                        i6 = i11;
                    } else {
                        throw zzcdx.zzaub();
                    }
                } else if (bat.m48247f(b2)) {
                    if (i7 < i3 - 1) {
                        int i12 = i7 + 1;
                        int i13 = i12 + 1;
                        int i14 = i6 + 1;
                        bat.m48240b(b2, bArr[i7], bArr[i12], cArr, i6);
                        r13 = i13;
                        i6 = i14;
                    } else {
                        throw zzcdx.zzaub();
                    }
                } else if (i7 < i3 - 2) {
                    int i15 = i7 + 1;
                    byte b4 = bArr[i7];
                    int i16 = i15 + 1;
                    int i17 = i16 + 1;
                    int i18 = i6 + 1;
                    bat.m48239b(b2, b4, bArr[i15], bArr[i16], cArr, i6);
                    r13 = i17;
                    i6 = i18 + 1;
                } else {
                    throw zzcdx.zzaub();
                }
            }
            return new String(cArr, 0, i6);
        }
        throw new ArrayIndexOutOfBoundsException(C1642a.m8034a("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo40460a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int length = charSequence.length();
        int i4 = i2 + i;
        int i5 = 0;
        while (i5 < length) {
            int i6 = i5 + i;
            if (i6 >= i4) {
                break;
            }
            char charAt = charSequence.charAt(i5);
            if (charAt >= 128) {
                break;
            }
            bArr[i6] = (byte) charAt;
            i5++;
        }
        if (i5 == length) {
            return i + length;
        }
        int i7 = i + i5;
        while (i5 < length) {
            char charAt2 = charSequence.charAt(i5);
            if (charAt2 < 128 && i7 < i4) {
                i3 = i7 + 1;
                bArr[i7] = (byte) charAt2;
            } else if (charAt2 < 2048 && i7 <= i4 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                i7 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 & '?') | 128);
                i5++;
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i7 <= i4 - 3) {
                int i9 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 12) | 480);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((charAt2 >>> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                i3 = i10 + 1;
                bArr[i10] = (byte) ((charAt2 & '?') | 128);
            } else if (i7 <= i4 - 4) {
                int i11 = i5 + 1;
                if (i11 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i11);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i12 = i7 + 1;
                        bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) (((codePoint >>> 12) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 6) & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                        i7 = i14 + 1;
                        bArr[i14] = (byte) ((codePoint & 63) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                        i5 = i11;
                        i5++;
                    } else {
                        i5 = i11;
                    }
                }
                throw new baw(i5 - 1, length);
            } else {
                if (55296 <= charAt2 && charAt2 <= 57343) {
                    int i15 = i5 + 1;
                    if (i15 == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i15))) {
                        throw new baw(i5, length);
                    }
                }
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i7);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            i7 = i3;
            i5++;
        }
        return i7;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40461a(CharSequence charSequence, ByteBuffer byteBuffer) {
        m48249b(charSequence, byteBuffer);
    }
}
