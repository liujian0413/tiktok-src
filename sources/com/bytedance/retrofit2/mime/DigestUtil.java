package com.bytedance.retrofit2.mime;

import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.InputStream;
import java.security.MessageDigest;

public class DigestUtil {
    private static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String md5Hex(byte[] bArr) {
        try {
            return new String(encodeHex(MessageDigest.getInstance("MD5").digest(bArr), DIGITS_UPPER));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String md5Hex(InputStream inputStream) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            int read = inputStream.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
            while (read >= 0) {
                instance.update(bArr, 0, read);
                read = inputStream.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
            }
            return new String(encodeHex(instance.digest(), DIGITS_UPPER));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static char[] encodeHex(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }
}
