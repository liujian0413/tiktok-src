package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.Util;
import okio.ByteString;

public final class Http2 {
    static final String[] BINARY = new String[256];
    static final ByteString CONNECTION_PREFACE = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    static final String[] FLAGS = new String[64];
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    private Http2() {
    }

    static {
        for (int i = 0; i < BINARY.length; i++) {
            BINARY[i] = Util.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        FLAGS[0] = "";
        FLAGS[1] = "END_STREAM";
        int[] iArr = {1};
        FLAGS[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            String[] strArr = FLAGS;
            int i4 = i3 | 8;
            StringBuilder sb = new StringBuilder();
            sb.append(FLAGS[i3]);
            sb.append("|PADDED");
            strArr[i4] = sb.toString();
        }
        FLAGS[4] = "END_HEADERS";
        FLAGS[32] = "PRIORITY";
        FLAGS[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                String[] strArr2 = FLAGS;
                int i9 = i8 | i6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(FLAGS[i8]);
                sb2.append('|');
                sb2.append(FLAGS[i6]);
                strArr2[i9] = sb2.toString();
                String[] strArr3 = FLAGS;
                int i10 = i9 | 8;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(FLAGS[i8]);
                sb3.append('|');
                sb3.append(FLAGS[i6]);
                sb3.append("|PADDED");
                strArr3[i10] = sb3.toString();
            }
        }
        for (int i11 = 0; i11 < FLAGS.length; i11++) {
            if (FLAGS[i11] == null) {
                FLAGS[i11] = BINARY[i11];
            }
        }
    }

    static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(Util.format(str, objArr));
    }

    static IOException ioException(String str, Object... objArr) throws IOException {
        throw new IOException(Util.format(str, objArr));
    }

    static String formatFlags(byte b, byte b2) {
        String str;
        if (b2 == 0) {
            return "";
        }
        switch (b) {
            case 2:
            case 3:
            case 7:
            case 8:
                return BINARY[b2];
            case 4:
            case 6:
                if (b2 == 1) {
                    return "ACK";
                }
                return BINARY[b2];
            default:
                if (b2 < FLAGS.length) {
                    str = FLAGS[b2];
                } else {
                    str = BINARY[b2];
                }
                if (b == 5 && (b2 & 4) != 0) {
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
                if (b != 0 || (b2 & 32) == 0) {
                    return str;
                }
                return str.replace("PRIORITY", "COMPRESSED");
        }
    }

    static String frameLog(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String str2;
        if (b < FRAME_NAMES.length) {
            str = FRAME_NAMES[b];
        } else {
            str = Util.format("0x%02x", Byte.valueOf(b));
        }
        String formatFlags = formatFlags(b, b2);
        String str3 = "%s 0x%08x %5d %-13s %s";
        Object[] objArr = new Object[5];
        if (z) {
            str2 = "<<";
        } else {
            str2 = ">>";
        }
        objArr[0] = str2;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = str;
        objArr[4] = formatFlags;
        return Util.format(str3, objArr);
    }
}
