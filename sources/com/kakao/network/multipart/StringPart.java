package com.kakao.network.multipart;

import java.io.IOException;
import java.io.OutputStream;

public class StringPart extends Part {
    private byte[] content;
    private final String value;

    /* access modifiers changed from: protected */
    public long lengthOfData() {
        return (long) getContent().length;
    }

    private byte[] getContent() {
        if (this.content == null) {
            this.content = MultipartRequestEntity.getBytes(this.value, this.charsetString);
        }
        return this.content;
    }

    /* access modifiers changed from: protected */
    public void sendData(OutputStream outputStream) throws IOException {
        outputStream.write(getContent());
    }

    public StringPart(String str, String str2) {
        this(str, str2, "text/plain", "UTF-8", "8bit");
    }

    public StringPart(String str, String str2, String str3, String str4, String str5) {
        if (str3 == null || str3.isEmpty()) {
            str3 = "text/plain";
        }
        if (str4 == null || str4.isEmpty()) {
            str4 = "UTF-8";
        }
        if (str5 == null || str5.isEmpty()) {
            str5 = "8bit";
        }
        super(str, str3, str4, str5);
        this.value = str2;
    }
}
