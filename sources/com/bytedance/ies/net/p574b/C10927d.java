package com.bytedance.ies.net.p574b;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* renamed from: com.bytedance.ies.net.b.d */
public final class C10927d extends RequestBody {

    /* renamed from: a */
    RequestBody f29590a;

    public final MediaType contentType() {
        return this.f29590a.contentType();
    }

    public C10927d(RequestBody requestBody) {
        if (requestBody != null) {
            this.f29590a = requestBody;
            return;
        }
        throw new NullPointerException("requestBody == null");
    }

    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        this.f29590a.writeTo(bufferedSink);
        bufferedSink.flush();
    }
}
