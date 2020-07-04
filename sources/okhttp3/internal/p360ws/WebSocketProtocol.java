package okhttp3.internal.p360ws;

import okio.Buffer.UnsafeCursor;
import okio.ByteString;

/* renamed from: okhttp3.internal.ws.WebSocketProtocol */
public final class WebSocketProtocol {
    private WebSocketProtocol() {
        throw new AssertionError("No instances.");
    }

    static void validateCloseCode(int i) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (closeCodeExceptionMessage != null) {
            throw new IllegalArgumentException(closeCodeExceptionMessage);
        }
    }

    public static String acceptHeader(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        return ByteString.encodeUtf8(sb.toString()).sha1().base64();
    }

    static String closeCodeExceptionMessage(int i) {
        if (i < 1000 || i >= 5000) {
            StringBuilder sb = new StringBuilder("Code must be in range [1000,5000): ");
            sb.append(i);
            return sb.toString();
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder("Code ");
            sb2.append(i);
            sb2.append(" is reserved and may not be used.");
            return sb2.toString();
        }
    }

    static void toggleMask(UnsafeCursor unsafeCursor, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = unsafeCursor.data;
            int i2 = unsafeCursor.start;
            int i3 = unsafeCursor.end;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
        } while (unsafeCursor.next() != -1);
    }
}
