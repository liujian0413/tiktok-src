package com.kakao.network.multipart;

import com.C1642a;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Random;

public class MultipartRequestEntity {
    private static final byte[] MULTIPART_CHARS = getAsciiBytes("-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
    private static final Random RANDOM = new Random();
    private final long contentLength;
    private final String contentType = computeContentType("multipart/form-data");
    private final byte[] multipartBoundary = generateMultipartBoundary();
    private final List<Part> parts;

    public long getContentLength() {
        return this.contentLength;
    }

    public String getContentType() {
        return this.contentType;
    }

    private static byte[] generateMultipartBoundary() {
        byte[] bArr = new byte[(RANDOM.nextInt(11) + 30)];
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = MULTIPART_CHARS[RANDOM.nextInt(MULTIPART_CHARS.length)];
        }
        return bArr;
    }

    public void writeRequest(OutputStream outputStream) throws IOException {
        Part.sendParts(outputStream, this.parts, this.multipartBoundary);
    }

    public MultipartRequestEntity(List<Part> list) {
        this.parts = list;
        this.contentLength = Part.getLengthOfParts(list, this.multipartBoundary);
    }

    public static byte[] getAsciiBytes(String str) {
        if (str != null) {
            try {
                return str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("data may not be null");
        }
    }

    private String computeContentType(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!str.endsWith(";")) {
            sb.append(";");
        }
        try {
            sb.append(" boundary=");
            sb.append(new String(this.multipartBoundary, "US-ASCII"));
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] getBytes(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("data may not be null");
        } else if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException("charset may not be null or empty");
        } else {
            try {
                return str.getBytes(str2);
            } catch (UnsupportedEncodingException unused) {
                throw new IllegalArgumentException(C1642a.m8034a("Unsupported encoding: %s", new Object[]{str2}));
            }
        }
    }
}
