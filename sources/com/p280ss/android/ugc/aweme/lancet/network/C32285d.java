package com.p280ss.android.ugc.aweme.lancet.network;

import android.text.TextUtils;
import com.bytedance.retrofit2.p637a.C12462c;
import com.p280ss.android.ugc.aweme.feed.api.C28216d;
import java.net.HttpURLConnection;
import okhttp3.Response;

/* renamed from: com.ss.android.ugc.aweme.lancet.network.d */
public final class C32285d {
    /* renamed from: a */
    public static int m104808a(C12462c cVar) {
        if (cVar == null) {
            return -1;
        }
        String b = cVar.mo30444b();
        if (TextUtils.isEmpty(b)) {
            return -1;
        }
        if (C28216d.m92755a(b)) {
            return 1;
        }
        if (C28216d.m92756b(b)) {
            return 2;
        }
        return -1;
    }

    /* renamed from: a */
    public static String m104809a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return "";
        }
        String headerField = httpURLConnection.getHeaderField("Bd-Tt-Error-Code");
        if (!TextUtils.isEmpty(headerField)) {
            return headerField;
        }
        String headerField2 = httpURLConnection.getHeaderField("bd-tt-error-code");
        if (!TextUtils.isEmpty(headerField2)) {
            return headerField2;
        }
        return httpURLConnection.getHeaderField("BD-TT-ERROR-CODE");
    }

    /* renamed from: b */
    public static String m104811b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return "";
        }
        String headerField = httpURLConnection.getHeaderField("X-Tt-Logid");
        if (!TextUtils.isEmpty(headerField)) {
            return headerField;
        }
        String headerField2 = httpURLConnection.getHeaderField("x-tt-logid");
        if (!TextUtils.isEmpty(headerField2)) {
            return headerField2;
        }
        return httpURLConnection.getHeaderField("X-TT-LOGID");
    }

    /* renamed from: a */
    public static String m104810a(Response response) {
        if (response == null) {
            return "";
        }
        String header = response.header("Bd-Tt-Error-Code");
        if (!TextUtils.isEmpty(header)) {
            return header;
        }
        String header2 = response.header("bd-tt-error-code");
        if (!TextUtils.isEmpty(header2)) {
            return header2;
        }
        return response.header("BD-TT-ERROR-CODE");
    }

    /* renamed from: b */
    public static String m104812b(Response response) {
        if (response == null) {
            return "";
        }
        String header = response.header("X-Tt-Logid");
        if (!TextUtils.isEmpty(header)) {
            return header;
        }
        String header2 = response.header("x-tt-logid");
        if (!TextUtils.isEmpty(header2)) {
            return header2;
        }
        return response.header("X-TT-LOGID");
    }
}
