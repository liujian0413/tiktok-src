package com.p280ss.video.rtc.base.net;

import com.google.gson.C6600e;
import com.google.gson.C6607f;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.Call;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okio.Buffer;

/* renamed from: com.ss.video.rtc.base.net.RtcNet */
public class RtcNet {
    private static HashMap<String, WeakReference<Call>> callStorage = new HashMap<>();
    private static C6600e gson = new C6607f().mo15992f();

    /* renamed from: com.ss.video.rtc.base.net.RtcNet$HttpCallBack */
    public interface HttpCallBack<T> {
        void onError(RequestErrTime requestErrTime, Exception exc, String str, int i);

        void onResponse(T t, String str);

        void onUUIDGen(String str);
    }

    /* renamed from: com.ss.video.rtc.base.net.RtcNet$RequestErrTime */
    public enum RequestErrTime {
        ON_BUILD_REQUEST,
        ON_EXECUTE_REQUEST,
        ON_HANDLE_RESPONSE
    }

    public static String toJson(Object obj) {
        return gson.mo15979b(obj);
    }

    private static String buildUrl(RtcNetBaseRequestModel rtcNetBaseRequestModel) {
        Builder newBuilder = HttpUrl.parse(rtcNetBaseRequestModel.getRequestUrl()).newBuilder();
        setQueryParameter(newBuilder, rtcNetBaseRequestModel);
        return newBuilder.build().toString();
    }

    private static String bodyToString(Request request) {
        try {
            Request build = request.newBuilder().build();
            Buffer buffer = new Buffer();
            if (build.body == null) {
                return "";
            }
            build.body.writeTo(buffer);
            return buffer.readUtf8();
        } catch (IOException unused) {
            return "has exception when get body.";
        }
    }

    public static void cancelRequest(String str) {
        if (callStorage.containsKey(str)) {
            Call call = (Call) ((WeakReference) callStorage.get(str)).get();
            if (call != null) {
                call.cancel();
            }
            callStorage.remove(str);
        }
    }

    private static String convertWithIteration(Map<String, String> map) {
        StringBuilder sb = new StringBuilder("{");
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
                sb.append(", ");
            }
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("}");
        return sb.toString();
    }

    private static void setCustomDnsReslov(OkHttpClient.Builder builder, RtcNetBaseRequestModel rtcNetBaseRequestModel) {
        builder.dns(new RtcNet$$Lambda$0(rtcNetBaseRequestModel));
    }

    static final /* synthetic */ List lambda$setCustomDnsReslov$0$RtcNet(RtcNetBaseRequestModel rtcNetBaseRequestModel, String str) throws UnknownHostException {
        try {
            List customDnsReslov = rtcNetBaseRequestModel.setCustomDnsReslov(str);
            if (customDnsReslov == null) {
                return Dns.SYSTEM.lookup(str);
            }
            rtcNetBaseRequestModel.setCallDnsLog(str, ((InetAddress) customDnsReslov.get(0)).getHostAddress());
            return customDnsReslov;
        } catch (IOException unused) {
            return Dns.SYSTEM.lookup(str);
        }
    }

    private static void setHeaderParameter(Request.Builder builder, RtcNetBaseRequestModel rtcNetBaseRequestModel) {
        rtcNetBaseRequestModel.setHeaderParameter();
        for (Entry entry : rtcNetBaseRequestModel.getRequestHeader().entrySet()) {
            builder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
    }

    private static void setQueryParameter(Builder builder, RtcNetBaseRequestModel rtcNetBaseRequestModel) {
        rtcNetBaseRequestModel.setQueryParameter();
        for (Entry entry : rtcNetBaseRequestModel.getQueryParameter().entrySet()) {
            builder.addQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e5, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e8, code lost:
        if (r2 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00eb, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ec, code lost:
        r2.onError(com.p280ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_HANDLE_RESPONSE, r0, com.C1642a.m8034a("JsonSyntaxException, URL = %s, Header = %s, QueryParams = %s, Body = %s", new java.lang.Object[]{r16.getRequestUrl(), convertWithIteration(r16.getRequestHeader()), convertWithIteration(r16.getQueryParameter()), bodyToString(r7)}), -1);
        cancelRequest(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0123, code lost:
        cancelRequest(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0126, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0127, code lost:
        r2.onError(com.p280ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_EXECUTE_REQUEST, r0, com.C1642a.m8034a("IOException, URL = %s, Header = %s, QueryParams = %s, Body = %s", new java.lang.Object[]{r16.getRequestUrl(), convertWithIteration(r16.getRequestHeader()), convertWithIteration(r16.getQueryParameter()), bodyToString(r7)}), -1);
        cancelRequest(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0159, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e7 A[ExcHandler: JsonSyntaxException (r0v6 'e' com.google.gson.JsonSyntaxException A[CUSTOM_DECLARE]), Splitter:B:12:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T request(com.p280ss.video.rtc.base.net.RtcNetBaseRequestModel r16, com.p280ss.video.rtc.base.net.RtcNet.HttpCallBack<T> r17) {
        /*
            r1 = r16
            r2 = r17
            r3 = -1
            r4 = 0
            okhttp3.RequestBody r0 = r16.getRequestBody()     // Catch:{ Exception -> 0x000b }
            goto L_0x0017
        L_0x000b:
            r0 = move-exception
            r5 = r0
            if (r2 == 0) goto L_0x0016
            com.ss.video.rtc.base.net.RtcNet$RequestErrTime r0 = com.p280ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_BUILD_REQUEST
            java.lang.String r6 = "Error on build request"
            r2.onError(r0, r5, r6, r3)
        L_0x0016:
            r0 = r4
        L_0x0017:
            okhttp3.Request$Builder r5 = new okhttp3.Request$Builder
            r5.<init>()
            java.lang.String r6 = buildUrl(r16)
            okhttp3.Request$Builder r5 = r5.url(r6)
            java.lang.String r6 = r16.getRequestMethod()
            okhttp3.Request$Builder r0 = r5.method(r6, r0)
            okhttp3.OkHttpClient$Builder r5 = new okhttp3.OkHttpClient$Builder
            r5.<init>()
            int r6 = r16.connectTimeout()
            long r6 = (long) r6
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            r5.connectTimeout(r6, r8)
            setHeaderParameter(r0, r1)
            setCustomDnsReslov(r5, r1)
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            okhttp3.Request r7 = r0.build()
            okhttp3.OkHttpClient r0 = r5.build()
            okhttp3.Call r0 = r0.newCall(r7)
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<okhttp3.Call>> r5 = callStorage
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            r8.<init>(r0)
            r5.put(r6, r8)
            if (r2 == 0) goto L_0x0064
            r2.onUUIDGen(r6)
        L_0x0064:
            r5 = 3
            r8 = 2
            r9 = 1
            r10 = 4
            r11 = 0
            okhttp3.Response r0 = r0.execute()     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            if (r2 != 0) goto L_0x0073
            cancelRequest(r6)     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            return r4
        L_0x0073:
            int r12 = r0.code     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            r13 = 200(0xc8, float:2.8E-43)
            if (r12 != r13) goto L_0x00ab
            okhttp3.ResponseBody r12 = r0.body     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            if (r12 == 0) goto L_0x00a1
            okhttp3.ResponseBody r0 = r0.body     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            java.lang.String r0 = r0.string()     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            java.lang.Class r12 = r17.getClass()     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            java.lang.reflect.Type[] r12 = r12.getGenericInterfaces()     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            r12 = r12[r11]     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            java.lang.reflect.Type[] r12 = r12.getActualTypeArguments()     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            r12 = r12[r11]     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            java.lang.Class r12 = (java.lang.Class) r12     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            com.google.gson.e r13 = gson     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            java.lang.Object r12 = r13.mo15974a(r0, r12)     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            r2.onResponse(r12, r0)     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            goto L_0x00a7
        L_0x00a1:
            java.lang.String r0 = ""
            r2.onResponse(r4, r0)     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            r12 = r4
        L_0x00a7:
            cancelRequest(r6)     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            return r12
        L_0x00ab:
            java.lang.String r0 = r16.getRequestUrl()     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            java.util.HashMap r13 = r16.getRequestHeader()     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            java.lang.String r13 = convertWithIteration(r13)     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            java.util.HashMap r14 = r16.getQueryParameter()     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            java.lang.String r14 = convertWithIteration(r14)     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            java.lang.String r15 = bodyToString(r7)     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            java.lang.String r3 = "Response Error, URL = %s, ErrorCode = %s, Header = %s, QueryParams = %s, Body = %s"
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00e4, JsonSyntaxException -> 0x00e7 }
            r4[r11] = r0     // Catch:{ IOException -> 0x00e4, JsonSyntaxException -> 0x00e7 }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ IOException -> 0x00e4, JsonSyntaxException -> 0x00e7 }
            r4[r9] = r0     // Catch:{ IOException -> 0x00e4, JsonSyntaxException -> 0x00e7 }
            r4[r8] = r13     // Catch:{ IOException -> 0x00e4, JsonSyntaxException -> 0x00e7 }
            r4[r5] = r14     // Catch:{ IOException -> 0x00e4, JsonSyntaxException -> 0x00e7 }
            r4[r10] = r15     // Catch:{ IOException -> 0x00e4, JsonSyntaxException -> 0x00e7 }
            java.lang.String r0 = com.C1642a.m8034a(r3, r4)     // Catch:{ IOException -> 0x00e4, JsonSyntaxException -> 0x00e7 }
            com.ss.video.rtc.base.net.RtcNet$RequestErrTime r3 = com.p280ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_HANDLE_RESPONSE     // Catch:{ IOException -> 0x00e4, JsonSyntaxException -> 0x00e7 }
            r4 = 0
            r2.onError(r3, r4, r0, r12)     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            cancelRequest(r6)     // Catch:{ IOException -> 0x011f, JsonSyntaxException -> 0x00e7 }
            return r4
        L_0x00e4:
            r0 = move-exception
            r3 = 0
            goto L_0x0121
        L_0x00e7:
            r0 = move-exception
            if (r2 != 0) goto L_0x00ec
            r3 = 0
            return r3
        L_0x00ec:
            java.lang.String r3 = r16.getRequestUrl()
            java.util.HashMap r4 = r16.getRequestHeader()
            java.lang.String r4 = convertWithIteration(r4)
            java.util.HashMap r1 = r16.getQueryParameter()
            java.lang.String r1 = convertWithIteration(r1)
            java.lang.String r7 = bodyToString(r7)
            java.lang.String r12 = "JsonSyntaxException, URL = %s, Header = %s, QueryParams = %s, Body = %s"
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r11] = r3
            r10[r9] = r4
            r10[r8] = r1
            r10[r5] = r7
            java.lang.String r1 = com.C1642a.m8034a(r12, r10)
            com.ss.video.rtc.base.net.RtcNet$RequestErrTime r3 = com.p280ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_HANDLE_RESPONSE
            r4 = -1
            r2.onError(r3, r0, r1, r4)
            cancelRequest(r6)
            r3 = 0
            return r3
        L_0x011f:
            r0 = move-exception
            r3 = r4
        L_0x0121:
            if (r2 != 0) goto L_0x0127
            cancelRequest(r6)
            return r3
        L_0x0127:
            java.lang.String r3 = r16.getRequestUrl()
            java.util.HashMap r4 = r16.getRequestHeader()
            java.lang.String r4 = convertWithIteration(r4)
            java.util.HashMap r1 = r16.getQueryParameter()
            java.lang.String r1 = convertWithIteration(r1)
            java.lang.String r7 = bodyToString(r7)
            java.lang.String r12 = "IOException, URL = %s, Header = %s, QueryParams = %s, Body = %s"
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r11] = r3
            r10[r9] = r4
            r10[r8] = r1
            r10[r5] = r7
            java.lang.String r1 = com.C1642a.m8034a(r12, r10)
            com.ss.video.rtc.base.net.RtcNet$RequestErrTime r3 = com.p280ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_EXECUTE_REQUEST
            r4 = -1
            r2.onError(r3, r0, r1, r4)
            cancelRequest(r6)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.video.rtc.base.net.RtcNet.request(com.ss.video.rtc.base.net.RtcNetBaseRequestModel, com.ss.video.rtc.base.net.RtcNet$HttpCallBack):java.lang.Object");
    }
}
