package com.kakao.network.multipart;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilePart extends Part {
    private static final byte[] FILE_NAME_BYTES = MultipartRequestEntity.getAsciiBytes("; filename=");
    private final File content;

    /* access modifiers changed from: protected */
    public long lengthOfData() {
        if (this.content != null) {
            return this.content.length();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public long dispositionHeaderLength() {
        String name = this.content.getName();
        long dispositionHeaderLength = super.dispositionHeaderLength();
        if (name != null) {
            return dispositionHeaderLength + ((long) FILE_NAME_BYTES.length) + ((long) QUOTE_BYTES.length) + ((long) MultipartRequestEntity.getAsciiBytes(name).length) + ((long) QUOTE_BYTES.length);
        }
        return dispositionHeaderLength;
    }

    /* access modifiers changed from: protected */
    public void sendData(OutputStream outputStream) throws IOException {
        InputStream inputStream;
        if (lengthOfData() != 0) {
            byte[] bArr = new byte[4096];
            if (this.content != null) {
                inputStream = new FileInputStream(this.content);
            } else {
                inputStream = new ByteArrayInputStream(new byte[0]);
            }
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read >= 0) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        return;
                    }
                } finally {
                    inputStream.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void sendDispositionHeader(OutputStream outputStream) throws IOException {
        super.sendDispositionHeader(outputStream);
        String name = this.content.getName();
        if (name != null) {
            outputStream.write(FILE_NAME_BYTES);
            outputStream.write(QUOTE_BYTES);
            outputStream.write(MultipartRequestEntity.getAsciiBytes(name));
            outputStream.write(QUOTE_BYTES);
        }
    }

    public FilePart(String str, File file) {
        this(str, file, "application/octet-stream", "ISO-8859-1", "binary");
    }

    public FilePart(String str, File file, String str2, String str3, String str4) {
        if (str2 == null || str2.isEmpty()) {
            str2 = "application/octet-stream";
        }
        if (str3 == null || str3.isEmpty()) {
            str3 = "ISO-8859-1";
        }
        if (str4 == null || str4.isEmpty()) {
            str4 = "binary";
        }
        super(str, str2, str3, str4);
        this.content = file;
    }
}
