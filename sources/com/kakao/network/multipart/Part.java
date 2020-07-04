package com.kakao.network.multipart;

import com.kakao.util.helper.log.Logger;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public abstract class Part {
    protected static final byte[] CHARSET_BYTES = MultipartRequestEntity.getAsciiBytes("; charset=");
    protected static final byte[] CONTENT_DISPOSITION_BYTES = MultipartRequestEntity.getAsciiBytes("Content-Disposition: form-data; name=");
    protected static final byte[] CONTENT_TRANSFER_ENCODING_BYTES = MultipartRequestEntity.getAsciiBytes("Content-Transfer-Encoding: ");
    protected static final byte[] CONTENT_TYPE_BYTES = MultipartRequestEntity.getAsciiBytes("Content-Type: ");
    protected static final byte[] CRLF_BYTES = MultipartRequestEntity.getAsciiBytes("\r\n");
    protected static final byte[] EXTRA_BYTES = MultipartRequestEntity.getAsciiBytes("--");
    protected static final byte[] QUOTE_BYTES = MultipartRequestEntity.getAsciiBytes("\"");
    protected final String charsetString;
    protected final String contentTypeString;
    protected final String name;
    protected final String transferEncodingString;

    public String getCharSet() {
        return this.charsetString;
    }

    public String getContentType() {
        return this.contentTypeString;
    }

    public String getName() {
        return this.name;
    }

    public String getTransferEncoding() {
        return this.transferEncodingString;
    }

    /* access modifiers changed from: protected */
    public abstract long lengthOfData();

    /* access modifiers changed from: protected */
    public abstract void sendData(OutputStream outputStream) throws IOException;

    /* access modifiers changed from: protected */
    public long endLength() {
        return (long) CRLF_BYTES.length;
    }

    /* access modifiers changed from: protected */
    public long endOfHeaderLength() {
        return (long) (CRLF_BYTES.length * 2);
    }

    /* access modifiers changed from: protected */
    public long transferEncodingHeaderLength() {
        String str = this.transferEncodingString;
        if (str == null) {
            return 0;
        }
        return ((long) MultipartRequestEntity.getAsciiBytes(str).length) + ((long) CRLF_BYTES.length) + 0 + ((long) CONTENT_TRANSFER_ENCODING_BYTES.length);
    }

    /* access modifiers changed from: protected */
    public long contentTypeHeaderLength() {
        String str = this.contentTypeString;
        if (str == null) {
            return 0;
        }
        long length = ((long) MultipartRequestEntity.getAsciiBytes(str).length) + ((long) CRLF_BYTES.length) + 0 + ((long) CONTENT_TYPE_BYTES.length);
        String str2 = this.charsetString;
        if (str2 != null) {
            return length + ((long) CHARSET_BYTES.length) + ((long) MultipartRequestEntity.getAsciiBytes(str2).length);
        }
        return length;
    }

    /* access modifiers changed from: protected */
    public long dispositionHeaderLength() {
        String str = this.name;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        return ((long) QUOTE_BYTES.length) + ((long) CRLF_BYTES.length) + 0 + ((long) CONTENT_DISPOSITION_BYTES.length) + ((long) QUOTE_BYTES.length) + ((long) MultipartRequestEntity.getAsciiBytes(str).length);
    }

    /* access modifiers changed from: protected */
    public void sendEnd(OutputStream outputStream) throws IOException {
        outputStream.write(CRLF_BYTES);
    }

    /* access modifiers changed from: protected */
    public int startLength(byte[] bArr) {
        return EXTRA_BYTES.length + bArr.length;
    }

    /* access modifiers changed from: protected */
    public void sendEndOfHeader(OutputStream outputStream) throws IOException {
        outputStream.write(CRLF_BYTES);
        outputStream.write(CRLF_BYTES);
    }

    /* access modifiers changed from: protected */
    public void sendDispositionHeader(OutputStream outputStream) throws IOException {
        String str = this.name;
        if (str != null) {
            outputStream.write(CRLF_BYTES);
            outputStream.write(CONTENT_DISPOSITION_BYTES);
            outputStream.write(QUOTE_BYTES);
            outputStream.write(MultipartRequestEntity.getAsciiBytes(str));
            outputStream.write(QUOTE_BYTES);
        }
    }

    /* access modifiers changed from: protected */
    public void sendTransferEncodingHeader(OutputStream outputStream) throws IOException {
        String str = this.transferEncodingString;
        if (str != null) {
            outputStream.write(CRLF_BYTES);
            outputStream.write(CONTENT_TRANSFER_ENCODING_BYTES);
            outputStream.write(MultipartRequestEntity.getAsciiBytes(str));
        }
    }

    public long length(byte[] bArr) {
        long lengthOfData = lengthOfData();
        if (lengthOfData < 0) {
            return -1;
        }
        return lengthOfData + ((long) startLength(bArr)) + dispositionHeaderLength() + contentTypeHeaderLength() + transferEncodingHeaderLength() + endOfHeaderLength() + endLength();
    }

    /* access modifiers changed from: protected */
    public void sendContentTypeHeader(OutputStream outputStream) throws IOException {
        String str = this.contentTypeString;
        if (str != null) {
            outputStream.write(CRLF_BYTES);
            outputStream.write(CONTENT_TYPE_BYTES);
            outputStream.write(MultipartRequestEntity.getAsciiBytes(str));
            String str2 = this.charsetString;
            if (str2 != null) {
                outputStream.write(CHARSET_BYTES);
                outputStream.write(MultipartRequestEntity.getAsciiBytes(str2));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void sendStart(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(EXTRA_BYTES);
        outputStream.write(bArr);
    }

    static long getLengthOfParts(List<Part> list, byte[] bArr) {
        if (list != null) {
            try {
                long j = 0;
                for (Part length : list) {
                    long length2 = length.length(bArr);
                    if (length2 < 0) {
                        return -1;
                    }
                    j += length2;
                }
                return j + ((long) EXTRA_BYTES.length) + ((long) bArr.length) + ((long) EXTRA_BYTES.length) + ((long) CRLF_BYTES.length);
            } catch (Exception e) {
                Logger.m60934e("An exception occurred while getting the length of the parts", (Throwable) e);
                return 0;
            }
        } else {
            throw new IllegalArgumentException("Parts may not be null");
        }
    }

    public static void sendParts(OutputStream outputStream, List<Part> list, byte[] bArr) throws IOException {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Parts may not be null or empty");
        } else if (bArr == null || bArr.length <= 0) {
            throw new IllegalArgumentException("partBoundary may not be empty");
        } else {
            for (Part part : list) {
                part.sendStart(outputStream, bArr);
                part.sendDispositionHeader(outputStream);
                part.sendContentTypeHeader(outputStream);
                part.sendTransferEncodingHeader(outputStream);
                part.sendEndOfHeader(outputStream);
                part.sendData(outputStream);
                part.sendEnd(outputStream);
            }
            outputStream.write(EXTRA_BYTES);
            outputStream.write(bArr);
            outputStream.write(EXTRA_BYTES);
            outputStream.write(CRLF_BYTES);
        }
    }

    protected Part(String str, String str2, String str3, String str4) {
        this.name = str;
        this.contentTypeString = str2;
        this.charsetString = str3;
        this.transferEncodingString = str4;
    }
}
