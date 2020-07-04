package com.kakao.network;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.kakao.network.multipart.MultipartRequestEntity;
import com.kakao.network.multipart.Part;
import com.kakao.util.helper.log.Logger;
import com.p280ss.android.ugc.aweme.lancet.network.C7116a;
import com.p280ss.android.ugc.aweme.lancet.network.C7118e;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

public class KakaoNetworkImpl implements INetwork {
    private static final HostnameVerifier DO_NOT_VERIFY = new HostnameVerifier() {
        public final boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    };
    private String charset = "ISO-8859-1";
    private final Map<String, String> header = new HashMap();
    private final Map<String, String> params = new HashMap();
    private final List<Part> parts = new ArrayList();
    private int statusCode = -1;
    private HttpURLConnection urlConnection = null;

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_UrlConnectionLancet_getInputStream */
        static InputStream m60919xff4d584d(HttpURLConnection httpURLConnection) throws IOException {
            URLConnection uRLConnection = httpURLConnection;
            if (C7118e.m22232a(uRLConnection)) {
                C7116a.m22226a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
            } else if (C7163a.m22363a()) {
                C7116a.m22230b(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
            }
            return httpURLConnection.getInputStream();
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_UrlConnectionLancet_setRequestProperty */
        static void m60920x963129db(HttpURLConnection httpURLConnection, String str, String str2) {
            URLConnection uRLConnection = httpURLConnection;
            if (C7118e.m22232a(uRLConnection)) {
                C7116a.m22226a(uRLConnection.getURL(), str, str2, "");
            } else if (C7163a.m22363a()) {
                C7116a.m22230b(uRLConnection.getURL(), str, str2, "");
            }
            httpURLConnection.setRequestProperty(str, str2);
        }
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void connect() throws IOException {
        try {
            this.statusCode = this.urlConnection.getResponseCode();
        } catch (IOException unused) {
            this.statusCode = this.urlConnection.getResponseCode();
        }
    }

    public void disconnect() {
        this.params.clear();
        this.header.clear();
        this.parts.clear();
        if (this.urlConnection != null) {
            this.urlConnection.disconnect();
        }
        this.statusCode = C34943c.f91127w;
    }

    public byte[] readFully() throws IOException {
        InputStream inputStream = getInputStream(this.urlConnection);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            while (true) {
                int read = inputStream.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return byteArray;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    public void configure() throws IOException {
        MultipartRequestEntity multipartRequestEntity;
        this.urlConnection.setDoInput(true);
        this.urlConnection.setConnectTimeout(5000);
        this.urlConnection.setReadTimeout(VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT);
        int i = 0;
        this.urlConnection.setInstanceFollowRedirects(false);
        _lancet.m60920x963129db(this.urlConnection, "Connection", "keep-alive");
        if (!this.header.isEmpty()) {
            for (String str : this.header.keySet()) {
                _lancet.m60920x963129db(this.urlConnection, str, (String) this.header.get(str));
            }
        }
        String requestMethod = this.urlConnection.getRequestMethod();
        if ("POST".equals(requestMethod) || "PUT".equals(requestMethod)) {
            _lancet.m60920x963129db(this.urlConnection, "Content-Length", "0");
            this.urlConnection.setDoOutput(true);
            String str2 = null;
            if (!this.params.isEmpty()) {
                String postDataString = getPostDataString(this.params);
                i = 0 + postDataString.length();
                str2 = postDataString;
                multipartRequestEntity = null;
            } else if (!this.parts.isEmpty()) {
                multipartRequestEntity = new MultipartRequestEntity(this.parts);
                i = (int) (multipartRequestEntity.getContentLength() + 0);
                _lancet.m60920x963129db(this.urlConnection, "Content-Type", multipartRequestEntity.getContentType());
            } else {
                multipartRequestEntity = null;
            }
            if (i > 0) {
                this.urlConnection.setFixedLengthStreamingMode(i);
                _lancet.m60920x963129db(this.urlConnection, "Content-Length", String.valueOf(i));
            }
            if (str2 != null && !str2.isEmpty()) {
                this.urlConnection.getOutputStream().write(str2.getBytes(this.charset));
            }
            if (multipartRequestEntity != null) {
                multipartRequestEntity.writeRequest(this.urlConnection.getOutputStream());
            }
        }
    }

    public void addPart(Part part) {
        this.parts.add(part);
    }

    private InputStream getInputStream(HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection.getResponseCode() < 400) {
            return _lancet.m60919xff4d584d(httpURLConnection);
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream != null) {
            return errorStream;
        }
        return new ByteArrayInputStream(new byte[0]);
    }

    private String getPostDataString(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(URLEncoder.encode((String) entry.getKey(), this.charset));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue(), this.charset));
        }
        return sb.toString();
    }

    public void addHeader(String str, String str2) {
        this.header.put(str, str2);
    }

    public void addParam(String str, String str2) {
        this.params.put(str, str2);
    }

    public void create(String str, String str2, String str3) throws IOException {
        StringBuilder sb = new StringBuilder("++ url: ");
        sb.append(str);
        Logger.m60925d(sb.toString());
        StringBuilder sb2 = new StringBuilder("++ method: ");
        sb2.append(str2);
        Logger.m60925d(sb2.toString());
        this.charset = str3;
        this.urlConnection = (HttpURLConnection) new URL(str).openConnection(Proxy.NO_PROXY);
        if (str.startsWith(WebKitApi.SCHEME_HTTPS)) {
            ((HttpsURLConnection) this.urlConnection).setHostnameVerifier(DO_NOT_VERIFY);
        }
        this.urlConnection.setRequestMethod(str2);
    }
}
