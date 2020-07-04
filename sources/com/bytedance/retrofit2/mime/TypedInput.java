package com.bytedance.retrofit2.mime;

import java.io.IOException;
import java.io.InputStream;

public interface TypedInput {
    /* renamed from: in */
    InputStream mo10444in() throws IOException;

    long length() throws IOException;

    String mimeType();
}
