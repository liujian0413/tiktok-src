package com.squareup.wire;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import okio.BufferedSink;
import okio.ByteString;

public final class ProtoWriter {
    private final BufferedSink sink;

    static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    static int varint32Size(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    static int varint64Size(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public ProtoWriter(BufferedSink bufferedSink) {
        this.sink = bufferedSink;
    }

    public final void writeBytes(ByteString byteString) throws IOException {
        this.sink.write(byteString);
    }

    public final void writeFixed32(int i) throws IOException {
        this.sink.writeIntLe(i);
    }

    public final void writeFixed64(long j) throws IOException {
        this.sink.writeLongLe(j);
    }

    public final void writeString(String str) throws IOException {
        this.sink.writeUtf8(str);
    }

    static int int32Size(int i) {
        if (i >= 0) {
            return varint32Size(i);
        }
        return 10;
    }

    static int tagSize(int i) {
        return varint32Size(makeTag(i, FieldEncoding.VARINT));
    }

    /* access modifiers changed from: 0000 */
    public final void writeSignedVarint32(int i) throws IOException {
        if (i >= 0) {
            writeVarint32(i);
        } else {
            writeVarint64((long) i);
        }
    }

    public final void writeVarint32(int i) throws IOException {
        while ((i & -128) != 0) {
            this.sink.writeByte((i & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            i >>>= 7;
        }
        this.sink.writeByte(i);
    }

    public final void writeVarint64(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.sink.writeByte((((int) j) & 127) | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            j >>>= 7;
        }
        this.sink.writeByte((int) j);
    }

    static int utf8Length(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 128) {
                if (charAt < 2048) {
                    i2 += 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i2 += 3;
                } else if (charAt <= 56319) {
                    int i3 = i + 1;
                    if (i3 < length && str.charAt(i3) >= 56320 && str.charAt(i3) <= 57343) {
                        i2 += 4;
                        i = i3;
                    }
                }
                i++;
            }
            i2++;
            i++;
        }
        return i2;
    }

    private static int makeTag(int i, FieldEncoding fieldEncoding) {
        return (i << 3) | fieldEncoding.value;
    }

    public final void writeTag(int i, FieldEncoding fieldEncoding) throws IOException {
        writeVarint32(makeTag(i, fieldEncoding));
    }
}
