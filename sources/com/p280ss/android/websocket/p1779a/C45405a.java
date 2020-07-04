package com.p280ss.android.websocket.p1779a;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;

/* renamed from: com.ss.android.websocket.a.a */
public interface C45405a {

    /* renamed from: a */
    public static final MediaType f116918a = MediaType.parse("application/vnd.okhttp.websocket+text; charset=utf-8");

    /* renamed from: b */
    public static final MediaType f116919b = MediaType.parse("application/vnd.okhttp.websocket+binary");

    /* renamed from: a */
    void mo108753a(int i, String str) throws IOException;

    /* renamed from: a */
    void mo108754a(RequestBody requestBody) throws IOException;

    /* renamed from: a */
    void mo108755a(Buffer buffer) throws IOException;
}
