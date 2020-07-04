package com.bytedance.apm.agent.instrumentation.interceptor;

import android.text.TextUtils;
import com.bytedance.apm.p241f.p242a.C6195c;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;

public class AddHeaderInterceptor implements Interceptor {
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Builder newBuilder = request.newBuilder();
        if (TextUtils.isEmpty(request.header("x-tt-trace-log")) && C6195c.m19233b().f18248c && C6195c.m19233b().f18247b == 1) {
            newBuilder.addHeader("x-tt-trace-log", "01");
        }
        return chain.proceed(newBuilder.build());
    }
}
