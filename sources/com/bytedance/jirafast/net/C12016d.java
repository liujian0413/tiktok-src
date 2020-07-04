package com.bytedance.jirafast.net;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import okio.BufferedSink;

/* renamed from: com.bytedance.jirafast.net.d */
public final class C12016d extends RequestBody {

    /* renamed from: a */
    public C12017a f31953a;

    /* renamed from: b */
    private File f31954b;

    /* renamed from: com.bytedance.jirafast.net.d$a */
    public interface C12017a {
    }

    public final long contentLength() throws IOException {
        return this.f31954b.length();
    }

    public final MediaType contentType() {
        return MediaType.parse("multipart/form-data");
    }

    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        this.f31954b.length();
        byte[] bArr = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(this.f31954b);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    bufferedSink.write(bArr, 0, read);
                } else {
                    return;
                }
            } catch (Exception unused) {
                return;
            } finally {
                fileInputStream.close();
            }
        }
    }

    public C12016d(File file, C12017a aVar) {
        this.f31954b = file;
        this.f31953a = aVar;
    }
}
