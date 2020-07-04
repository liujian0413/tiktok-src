package org.apache.http.util;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;

public final class EntityUtils {
    /* JADX INFO: finally extract failed */
    public static byte[] toByteArray(HttpEntity httpEntity) throws IOException {
        if (httpEntity != null) {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                return new byte[0];
            }
            if (httpEntity.getContentLength() <= 2147483647L) {
                int contentLength = (int) httpEntity.getContentLength();
                if (contentLength < 0) {
                    contentLength = 4096;
                }
                ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(contentLength);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = content.read(bArr);
                        if (read != -1) {
                            byteArrayBuffer.append(bArr, 0, read);
                        } else {
                            content.close();
                            return byteArrayBuffer.toByteArray();
                        }
                    }
                } catch (Throwable th) {
                    content.close();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
            }
        } else {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
    }
}
