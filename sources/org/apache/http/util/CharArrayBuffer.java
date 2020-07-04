package org.apache.http.util;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import org.apache.http.protocol.HTTP;

public final class CharArrayBuffer {
    private char[] buffer;
    private int len;

    public final char[] buffer() {
        return this.buffer;
    }

    public final void clear() {
        this.len = 0;
    }

    public final int length() {
        return this.len;
    }

    public final String toString() {
        return new String(this.buffer, 0, this.len);
    }

    public final void append(Object obj) {
        append(String.valueOf(obj));
    }

    public final char charAt(int i) {
        return this.buffer[i];
    }

    public final int indexOf(int i) {
        return indexOf(i, 0, this.len);
    }

    public CharArrayBuffer(int i) {
        if (i >= 0) {
            this.buffer = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    private void expand(int i) {
        char[] cArr = new char[Math.max(this.buffer.length << 1, i)];
        System.arraycopy(this.buffer, 0, cArr, 0, this.len);
        this.buffer = cArr;
    }

    public final void append(char c) {
        int i = this.len + 1;
        if (i > this.buffer.length) {
            expand(i);
        }
        this.buffer[this.len] = c;
        this.len = i;
    }

    public final void ensureCapacity(int i) {
        if (i > 0 && i > this.buffer.length - this.len) {
            expand(this.len + i);
        }
    }

    public final void append(String str) {
        if (str == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        int length = str.length();
        int i = this.len + length;
        if (i > this.buffer.length) {
            expand(i);
        }
        str.getChars(0, length, this.buffer, this.len);
        this.len = i;
    }

    public final String substring(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.len) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            return new String(this.buffer, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public final String substringTrimmed(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.len) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            while (i < i2 && HTTP.isWhitespace(this.buffer[i])) {
                i++;
            }
            while (i2 > i && HTTP.isWhitespace(this.buffer[i2 - 1])) {
                i2--;
            }
            return new String(this.buffer, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public final void append(ByteArrayBuffer byteArrayBuffer, int i, int i2) {
        if (byteArrayBuffer != null) {
            append(byteArrayBuffer.buffer(), i, i2);
        }
    }

    public final int indexOf(int i, int i2, int i3) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.len) {
            i3 = this.len;
        }
        if (i2 > i3) {
            return -1;
        }
        while (i2 < i3) {
            if (this.buffer[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final void append(CharArrayBuffer charArrayBuffer, int i, int i2) {
        if (charArrayBuffer != null) {
            append(charArrayBuffer.buffer, i, i2);
        }
    }

    public final void append(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i <= bArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= bArr.length) {
                    if (i2 != 0) {
                        int i4 = this.len;
                        int i5 = i2 + i4;
                        if (i5 > this.buffer.length) {
                            expand(i5);
                        }
                        while (i4 < i5) {
                            this.buffer[i4] = (char) (bArr[i] & 255);
                            i++;
                            i4++;
                        }
                        this.len = i5;
                        return;
                    }
                    return;
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void append(char[] cArr, int i, int i2) {
        if (cArr != null) {
            if (i >= 0 && i <= cArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= cArr.length) {
                    if (i2 != 0) {
                        int i4 = this.len + i2;
                        if (i4 > this.buffer.length) {
                            expand(i4);
                        }
                        System.arraycopy(cArr, i, this.buffer, this.len, i2);
                        this.len = i4;
                        return;
                    }
                    return;
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }
}
