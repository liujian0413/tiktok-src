package com.bytedance.retrofit2.mime;

import java.io.IOException;
import java.io.OutputStream;

public interface TypedOutput {
    String fileName();

    long length();

    String md5Stub();

    String mimeType();

    void writeTo(OutputStream outputStream) throws IOException;
}
