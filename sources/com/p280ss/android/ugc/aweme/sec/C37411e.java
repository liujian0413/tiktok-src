package com.p280ss.android.ugc.aweme.sec;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12464d;
import com.p280ss.android.common.util.NetworkUtils;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* renamed from: com.ss.android.ugc.aweme.sec.e */
public final class C37411e {
    /* renamed from: a */
    public static String m120037a(C12464d dVar) throws IOException {
        String str;
        TypedInput typedInput = dVar.f33122e;
        if (typedInput != null) {
            InputStream in = dVar.f33122e.mo10444in();
            C12461b a = dVar.mo30450a("Content-Type");
            try {
                MediaType parse = MediaType.parse(typedInput.mimeType());
                String str2 = null;
                if (parse != null) {
                    str = parse.toString();
                } else if (a == null) {
                    str = null;
                } else {
                    str = a.f33096b;
                }
                if (str == null) {
                    str = "";
                }
                boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
                if (typedInput.length() > 2147483647L) {
                    return null;
                }
                if (parse != null) {
                    if (parse.charset() != null) {
                        str2 = parse.charset().name();
                    }
                }
                if (str2 == null) {
                    str2 = "UTF-8";
                }
                String response2String = NetworkUtils.response2String(false, testIsSSBinary, 0, in, str2);
                in.reset();
                return response2String;
            } finally {
                in.reset();
            }
        } else {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
    }

    /* renamed from: a */
    public static String m120038a(Response response) throws IOException {
        boolean z;
        String str;
        ResponseBody responseBody = response.body;
        if (responseBody != null) {
            BufferedSource source = response.body.source();
            source.request(Long.MAX_VALUE);
            InputStream inputStream = source.buffer().clone().inputStream();
            String header = response.header("Content-Encoding");
            if (header == null || !"gzip".equalsIgnoreCase(header)) {
                z = false;
            } else {
                z = true;
            }
            try {
                MediaType contentType = responseBody.contentType();
                if (contentType != null) {
                    str = contentType.toString();
                } else {
                    str = response.header("Content-Type");
                }
                if (str == null) {
                    str = "";
                }
                boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
                long contentLength = responseBody.contentLength();
                String str2 = null;
                if (contentLength > 2147483647L) {
                    return null;
                }
                if (contentType != null) {
                    if (contentType.charset() != null) {
                        str2 = contentType.charset().name();
                    }
                }
                if (str2 == null) {
                    str2 = "UTF-8";
                }
                String response2String = NetworkUtils.response2String(z, testIsSSBinary, 0, inputStream, str2);
                NetworkUtils.safeClose(inputStream);
                return response2String;
            } finally {
                NetworkUtils.safeClose(inputStream);
            }
        } else {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
    }
}
