package org.chromium;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.common.utility.reflect.C6322b;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient.ICronetBootFailureChecker;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.ExperimentalCronetEngine;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.RequestFinishedInfo.Listener;
import com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public class CronetClient implements ICronetClient {
    private static ICronetBootFailureChecker sCronetBootFailureChecker = null;
    private static volatile CronetEngine sCronetEngine = null;
    private static volatile Listener sRequestFinishedInfoListener = null;
    private static volatile String sTokenStr = "";

    public long getCostTime(long j, long j2) {
        if (j2 == -1 || j == -1 || j2 > j) {
            return -1;
        }
        return j - j2;
    }

    public String getCronetVersion() {
        return "TTNetVersion:ec14aa9f 2019-12-27 QuicVersion:a93373c9 2019-11-29";
    }

    public static CronetEngine getCronetEngine() {
        if (sCronetEngine != null) {
            return sCronetEngine;
        }
        throw new NullPointerException("Cronet engine is null.");
    }

    private static long getALogFuncAddr() throws Exception {
        return ((Long) C6322b.m19610a(Class.forName("com.bytedance.ttnet.d").newInstance()).mo15160b("getALogFuncAddr").f18556a).longValue();
    }

    public static Map<String, int[]> getGroupRTTEstimates() throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            return ((ExperimentalCronetEngine) sCronetEngine).getGroupRttEstimates();
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public static int[] getNetworkQuality() throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) sCronetEngine;
            return new int[]{experimentalCronetEngine.getTransportRttMs(), experimentalCronetEngine.getHttpRttMs(), experimentalCronetEngine.getDownstreamThroughputKbps()};
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public boolean isCronetHttpURLConnection(HttpURLConnection httpURLConnection) {
        return httpURLConnection instanceof CronetHttpURLConnection;
    }

    public void setCronetBootFailureChecker(ICronetBootFailureChecker iCronetBootFailureChecker) {
        sCronetBootFailureChecker = iCronetBootFailureChecker;
    }

    private long getTime(Date date) {
        if (date == null) {
            return -1;
        }
        return date.getTime();
    }

    private long getValue(Long l) {
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    public static List<InetAddress> dnsLookup(String str) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            return ((ExperimentalCronetEngine) sCronetEngine).dnsLookup(str);
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public static void setAlogFuncAddr(long j) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).setAlogFuncAddr(j);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public static void setEnableURLDispatcher(boolean z) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).setEnableURLDispatcher(z);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public static void setHostResolverRules(String str) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).setHostResolverRules(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public static void setProxy(String str) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).setProxy(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    private void tryCreateRequestFinishedInfoListener(Executor executor) {
        if (sRequestFinishedInfoListener == null) {
            synchronized (CronetClient.class) {
                if (sRequestFinishedInfoListener == null) {
                    sRequestFinishedInfoListener = new Listener(executor) {
                        private long getTime(Date date) {
                            if (date == null) {
                                return -1;
                            }
                            return date.getTime();
                        }

                        public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
                            String str;
                            if (requestFinishedInfo != null) {
                                Metrics metrics = requestFinishedInfo.getMetrics();
                                if (metrics != null) {
                                    String str2 = "";
                                    try {
                                        if (C48317f.m149883a().loggerDebug()) {
                                            try {
                                                if (requestFinishedInfo.getResponseInfo() != null) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(str2);
                                                    sb.append(" http status = ");
                                                    sb.append(requestFinishedInfo.getResponseInfo().getHttpStatusText());
                                                    str2 = sb.toString();
                                                }
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(str2);
                                                sb2.append(" finishedReason = ");
                                                sb2.append(requestFinishedInfo.getFinishedReason());
                                                str = sb2.toString();
                                            } catch (Exception unused) {
                                                str = str2;
                                            }
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(str);
                                            sb3.append(" url = ");
                                            sb3.append(requestFinishedInfo.getUrl());
                                            C48317f.m149883a().loggerD("CronetClient", sb3.toString());
                                            StringBuilder sb4 = new StringBuilder(" dns_cost = ");
                                            sb4.append(CronetClient.this.getCostTime(getTime(metrics.getDnsEnd()), getTime(metrics.getDnsStart())));
                                            sb4.append(" ms ");
                                            String sb5 = sb4.toString();
                                            StringBuilder sb6 = new StringBuilder();
                                            sb6.append(sb5);
                                            sb6.append(" connect_cost = ");
                                            sb6.append(CronetClient.this.getCostTime(getTime(metrics.getConnectEnd()), getTime(metrics.getConnectStart())));
                                            sb6.append(" ms ");
                                            String sb7 = sb6.toString();
                                            StringBuilder sb8 = new StringBuilder();
                                            sb8.append(sb7);
                                            sb8.append(" ssl_cost = ");
                                            sb8.append(CronetClient.this.getCostTime(getTime(metrics.getSslEnd()), getTime(metrics.getSslStart())));
                                            sb8.append(" ms ");
                                            String sb9 = sb8.toString();
                                            StringBuilder sb10 = new StringBuilder();
                                            sb10.append(sb9);
                                            sb10.append(" sending_cost = ");
                                            sb10.append(CronetClient.this.getCostTime(getTime(metrics.getSendingEnd()), getTime(metrics.getSendingStart())));
                                            sb10.append(" ms ");
                                            String sb11 = sb10.toString();
                                            StringBuilder sb12 = new StringBuilder();
                                            sb12.append(sb11);
                                            sb12.append(" push_cost = ");
                                            sb12.append(CronetClient.this.getCostTime(getTime(metrics.getPushEnd()), getTime(metrics.getPushStart())));
                                            sb12.append(" ms ");
                                            String sb13 = sb12.toString();
                                            StringBuilder sb14 = new StringBuilder();
                                            sb14.append(sb13);
                                            sb14.append(" response_cost = ");
                                            sb14.append(CronetClient.this.getCostTime(getTime(metrics.getRequestEnd()), getTime(metrics.getResponseStart())));
                                            sb14.append(" ms ");
                                            String sb15 = sb14.toString();
                                            StringBuilder sb16 = new StringBuilder();
                                            sb16.append(sb15);
                                            sb16.append(" total_cost = ");
                                            sb16.append(metrics.getTotalTimeMs());
                                            sb16.append(" ms ");
                                            String sb17 = sb16.toString();
                                            StringBuilder sb18 = new StringBuilder();
                                            sb18.append(sb17);
                                            sb18.append(" remote_ip = ");
                                            sb18.append(metrics.getPeerAddr());
                                            sb18.append(" : ");
                                            sb18.append(metrics.getPeerPort());
                                            C48317f.m149883a().loggerD("CronetClient", sb18.toString());
                                            try {
                                                if (requestFinishedInfo.getException() != null) {
                                                    StringBuilder sb19 = new StringBuilder(" exception = ");
                                                    sb19.append(requestFinishedInfo.getException().getMessage());
                                                    C48317f.m149883a().loggerD("CronetClient", sb19.toString());
                                                }
                                            } catch (Exception unused2) {
                                            }
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                }
                            }
                        }
                    };
                }
            }
        }
    }

    public static void triggerGetDomain(Context context) {
        try {
            if (C48320i.m149888a(context)) {
                if (C48317f.m149883a().loggerDebug()) {
                    C48317f.m149883a().loggerD("CronetClient", "triggerGetDomain start");
                }
                if (sCronetEngine instanceof ExperimentalCronetEngine) {
                    ((ExperimentalCronetEngine) sCronetEngine).triggerGetDomain();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r5 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r5 != null) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e A[SYNTHETIC, Splitter:B:22:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getProxyConfig(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0066
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x0062, all -> 0x005b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0062, all -> 0x005b }
            r3.<init>()     // Catch:{ Throwable -> 0x0062, all -> 0x005b }
            r3.append(r5)     // Catch:{ Throwable -> 0x0062, all -> 0x005b }
            java.lang.String r5 = "ttnet_config.json"
            r3.append(r5)     // Catch:{ Throwable -> 0x0062, all -> 0x005b }
            java.lang.String r5 = r3.toString()     // Catch:{ Throwable -> 0x0062, all -> 0x005b }
            r2.<init>(r5)     // Catch:{ Throwable -> 0x0062, all -> 0x005b }
            boolean r5 = r2.exists()     // Catch:{ Throwable -> 0x0062, all -> 0x005b }
            if (r5 == 0) goto L_0x0054
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0062, all -> 0x005b }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Throwable -> 0x0062, all -> 0x005b }
            r3.<init>(r2)     // Catch:{ Throwable -> 0x0062, all -> 0x005b }
            r5.<init>(r3)     // Catch:{ Throwable -> 0x0062, all -> 0x005b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0063, all -> 0x0051 }
            r1.<init>()     // Catch:{ Throwable -> 0x0063, all -> 0x0051 }
        L_0x0034:
            java.lang.String r2 = r5.readLine()     // Catch:{ Throwable -> 0x0063, all -> 0x0051 }
            if (r2 == 0) goto L_0x003e
            r1.append(r2)     // Catch:{ Throwable -> 0x0063, all -> 0x0051 }
            goto L_0x0034
        L_0x003e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0063, all -> 0x0051 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0063, all -> 0x0051 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0063, all -> 0x0051 }
            java.lang.String r1 = "ttnet_proxy"
            java.lang.String r3 = ""
            java.lang.String r1 = r2.optString(r1, r3)     // Catch:{ Throwable -> 0x0063, all -> 0x0051 }
            r0 = r1
            goto L_0x0055
        L_0x0051:
            r0 = move-exception
            r1 = r5
            goto L_0x005c
        L_0x0054:
            r5 = r1
        L_0x0055:
            if (r5 == 0) goto L_0x0066
        L_0x0057:
            r5.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x0066
        L_0x005b:
            r0 = move-exception
        L_0x005c:
            if (r1 == 0) goto L_0x0061
            r1.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            throw r0
        L_0x0062:
            r5 = r1
        L_0x0063:
            if (r5 == 0) goto L_0x0066
            goto L_0x0057
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.CronetClient.getProxyConfig(java.lang.String):java.lang.String");
    }

    public static void syncHttpEncryptConfig(Map<String, Object> map) {
        String str;
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    if (C48317f.m149883a().loggerDebug()) {
                        StringBuilder sb = new StringBuilder("syncHttpEncryptConfig start config = ");
                        sb.append(map.toString());
                        C48317f.m149883a().loggerD("CronetClient", sb.toString());
                    }
                    JSONObject jSONObject = new JSONObject();
                    byte[] bArr = (byte[]) map.get("key");
                    byte[] bArr2 = (byte[]) map.get("hmac_key");
                    String str2 = (String) map.get("token");
                    long longValue = ((Long) map.get("expire")).longValue();
                    long longValue2 = ((Long) map.get("request_time")).longValue();
                    int intValue = ((Integer) map.get(C38347c.f99551f)).intValue();
                    if (bArr != null) {
                        if (bArr.length > 0) {
                            if (bArr2 != null) {
                                if (bArr2.length > 0) {
                                    if (TextUtils.isEmpty(str2)) {
                                        if (C48317f.m149883a().loggerDebug()) {
                                            C48317f.m149883a().loggerD("CronetClient", "syncHttpEncryptConfig token is null");
                                        }
                                        return;
                                    } else if (longValue <= 0) {
                                        if (C48317f.m149883a().loggerDebug()) {
                                            C48317f.m149883a().loggerD("CronetClient", "syncHttpEncryptConfig expire <= 0");
                                        }
                                        return;
                                    } else {
                                        jSONObject.put("key", Base64.encodeToString(bArr, 2));
                                        jSONObject.put("hmac_key", Base64.encodeToString(bArr2, 2));
                                        jSONObject.put("token", str2);
                                        jSONObject.put("expire", Long.valueOf(longValue / 3600000).intValue());
                                        jSONObject.put("request_time", longValue2);
                                        jSONObject.put(C38347c.f99551f, intValue);
                                        String jSONObject2 = jSONObject.toString();
                                        if (sCronetEngine instanceof ExperimentalCronetEngine) {
                                            if (C48317f.m149883a().loggerDebug()) {
                                                StringBuilder sb2 = new StringBuilder("syncHttpEncryptConfig send token = ");
                                                sb2.append(jSONObject2);
                                                C48317f.m149883a().loggerD("CronetClient", sb2.toString());
                                            }
                                            ((ExperimentalCronetEngine) sCronetEngine).setToken(jSONObject2);
                                            return;
                                        }
                                        synchronized (CronetClient.class) {
                                            sTokenStr = jSONObject2;
                                        }
                                        if (C48317f.m149883a().loggerDebug()) {
                                            C48317f a = C48317f.m149883a();
                                            String str3 = "CronetClient";
                                            StringBuilder sb3 = new StringBuilder("sCronetEngine = ");
                                            if (sCronetEngine == null) {
                                                str = TEVideoRecorder.FACE_BEAUTY_NULL;
                                            } else {
                                                str = sCronetEngine.toString();
                                            }
                                            sb3.append(str);
                                            a.loggerD(str3, sb3.toString());
                                        }
                                        return;
                                    }
                                }
                            }
                            if (C48317f.m149883a().loggerDebug()) {
                                C48317f.m149883a().loggerD("CronetClient", "syncHttpEncryptConfig hmac_key is null");
                            }
                            return;
                        }
                    }
                    if (C48317f.m149883a().loggerDebug()) {
                        C48317f.m149883a().loggerD("CronetClient", "syncHttpEncryptConfig key is null");
                    }
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        if (C48317f.m149883a().loggerDebug()) {
            C48317f.m149883a().loggerD("CronetClient", "syncHttpEncryptConfig json is null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[SYNTHETIC, Splitter:B:14:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f A[SYNTHETIC, Splitter:B:22:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getConfigFromAssets(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            r1 = 0
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ Throwable -> 0x002c, all -> 0x0024 }
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ Throwable -> 0x002c, all -> 0x0024 }
            int r5 = r4.available()     // Catch:{ Throwable -> 0x002d, all -> 0x0022 }
            byte[] r5 = new byte[r5]     // Catch:{ Throwable -> 0x002d, all -> 0x0022 }
            r4.read(r5)     // Catch:{ Throwable -> 0x002d, all -> 0x0022 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Throwable -> 0x002d, all -> 0x0022 }
            java.lang.String r2 = "UTF-8"
            r1.<init>(r5, r2)     // Catch:{ Throwable -> 0x002d, all -> 0x0022 }
            if (r4 == 0) goto L_0x0020
            r4.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            r0 = r1
            goto L_0x0032
        L_0x0022:
            r5 = move-exception
            goto L_0x0026
        L_0x0024:
            r5 = move-exception
            r4 = r1
        L_0x0026:
            if (r4 == 0) goto L_0x002b
            r4.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            throw r5
        L_0x002c:
            r4 = r1
        L_0x002d:
            if (r4 == 0) goto L_0x0032
            r4.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.CronetClient.getConfigFromAssets(android.content.Context, java.lang.String):java.lang.String");
    }

    public static void doCommand(Context context, String str) {
        try {
            if (C48320i.m149888a(context)) {
                if (TextUtils.isEmpty(str)) {
                    if (C48317f.m149883a().loggerDebug()) {
                        C48317f.m149883a().loggerD("CronetClient", "doCommand json is null");
                    }
                    return;
                }
                if (C48317f.m149883a().loggerDebug()) {
                    StringBuilder sb = new StringBuilder("doCommand start json = ");
                    sb.append(str);
                    C48317f.m149883a().loggerD("CronetClient", sb.toString());
                }
                if (sCronetEngine instanceof ExperimentalCronetEngine) {
                    ((ExperimentalCronetEngine) sCronetEngine).doCommand(str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void getRequestMetrics(HttpURLConnection httpURLConnection, Map<String, Object> map) {
        if (httpURLConnection != null && map != null && (httpURLConnection instanceof CronetHttpURLConnection)) {
            try {
                CronetHttpURLConnection cronetHttpURLConnection = (CronetHttpURLConnection) httpURLConnection;
                RequestFinishedInfo requestFinishedInfo = cronetHttpURLConnection.getRequestFinishedInfo();
                if (!(requestFinishedInfo == null || requestFinishedInfo.getMetrics() == null)) {
                    Metrics metrics = requestFinishedInfo.getMetrics();
                    StringBuilder sb = new StringBuilder();
                    sb.append(metrics.getPeerAddr());
                    sb.append(":");
                    sb.append(metrics.getPeerPort());
                    map.put("remote_ip", sb.toString());
                    map.put("dns_time", Long.valueOf(getCostTime(getTime(metrics.getDnsEnd()), getTime(metrics.getDnsStart()))));
                    map.put("connect_time", Long.valueOf(getCostTime(getTime(metrics.getConnectEnd()), getTime(metrics.getConnectStart()))));
                    map.put("ssl_time", Long.valueOf(getCostTime(getTime(metrics.getSslEnd()), getTime(metrics.getSslStart()))));
                    map.put("send_time", Long.valueOf(getCostTime(getTime(metrics.getSendingEnd()), getTime(metrics.getSendingStart()))));
                    map.put("push_time", Long.valueOf(getCostTime(getTime(metrics.getPushEnd()), getTime(metrics.getPushStart()))));
                    map.put("receive_time", Long.valueOf(getCostTime(getTime(metrics.getRequestEnd()), getTime(metrics.getResponseStart()))));
                    map.put("socket_reused", Boolean.valueOf(metrics.getSocketReused()));
                    map.put(C34943c.f91124t, Long.valueOf(getValue(metrics.getTtfbMs())));
                    map.put("total_time", Long.valueOf(getValue(metrics.getTotalTimeMs())));
                    map.put("send_byte_count", Long.valueOf(getValue(metrics.getSentByteCount())));
                    map.put("received_byte_count", Long.valueOf(getValue(metrics.getReceivedByteCount())));
                    map.put("retry_attempts", Long.valueOf(getValue(metrics.getRetryAttempts())));
                }
                map.put("request_log", cronetHttpURLConnection.getRequestLog());
            } catch (Throwable unused) {
            }
        }
    }

    public static void notifyTNCConfigUpdated(String str, String str2, String str3) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).notifyTNCConfigUpdated(str, str2, str3);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public static void tryStartNetDetect(String[] strArr, int i, int i2) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).tryStartNetDetect(strArr, i, i2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public HttpURLConnection openConnection(Context context, String str, boolean z, String str2, Executor executor) throws IOException {
        try {
            tryCreateCronetEngine(context, false, false, false, z, str2, executor);
            return (HttpURLConnection) sCronetEngine.openConnection(new URL(str));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public void setCronetEngine(Context context, boolean z, boolean z2, boolean z3, boolean z4, String str, Executor executor) {
        tryCreateCronetEngine(context, z, z2, z3, z4, str, executor);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0144 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x017e */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0150 A[SYNTHETIC, Splitter:B:71:0x0150] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0197  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void tryCreateCronetEngine(android.content.Context r6, boolean r7, boolean r8, boolean r9, boolean r10, java.lang.String r11, java.util.concurrent.Executor r12) {
        /*
            r5 = this;
            com.ttnet.org.chromium.net.CronetEngine r0 = sCronetEngine
            if (r0 != 0) goto L_0x01e2
            java.lang.Class<org.chromium.CronetClient> r0 = org.chromium.CronetClient.class
            monitor-enter(r0)
            com.ttnet.org.chromium.net.CronetEngine r1 = sCronetEngine     // Catch:{ all -> 0x01df }
            if (r1 != 0) goto L_0x01cb
            com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient$ICronetBootFailureChecker r1 = sCronetBootFailureChecker     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x01cb
            com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient$ICronetBootFailureChecker r1 = sCronetBootFailureChecker     // Catch:{ all -> 0x01df }
            boolean r1 = r1.isCronetBootFailureExpected()     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x01cb
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r1 = new com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder     // Catch:{ all -> 0x01df }
            r1.<init>(r6)     // Catch:{ all -> 0x01df }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r7 = r1.enableQuic(r7)     // Catch:{ all -> 0x01df }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r7 = r7.enableHttp2(r8)     // Catch:{ all -> 0x01df }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r7 = r7.enableSdch(r9)     // Catch:{ all -> 0x01df }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r7 = r7.enableHttpDns(r10)     // Catch:{ all -> 0x01df }
            r8 = 0
            r10 = 0
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r7 = r7.enableHttpCache(r10, r8)     // Catch:{ all -> 0x01df }
            r1 = 1
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r7 = r7.enableNetworkQualityEstimator(r1)     // Catch:{ all -> 0x01df }
            org.chromium.f r2 = org.chromium.C48317f.m149883a()     // Catch:{ all -> 0x01df }
            boolean r2 = r2.loggerDebug()     // Catch:{ all -> 0x01df }
            if (r2 == 0) goto L_0x0045
            r7.enableVerboseLog()     // Catch:{ all -> 0x01df }
        L_0x0045:
            org.chromium.a r2 = org.chromium.C48312a.m149831a(r6)     // Catch:{ all -> 0x01df }
            r7.setAppInfoProvider(r2)     // Catch:{ all -> 0x01df }
            org.chromium.g r2 = org.chromium.C48318g.m149884a()     // Catch:{ all -> 0x01df }
            r7.setEventListener(r2)     // Catch:{ all -> 0x01df }
            boolean r2 = org.chromium.C48320i.m149888a(r6)     // Catch:{ all -> 0x01df }
            if (r2 == 0) goto L_0x0066
            org.chromium.c r2 = org.chromium.C48314c.m149833a()     // Catch:{ all -> 0x01df }
            r7.setAppMonitorProvider(r2)     // Catch:{ all -> 0x01df }
            org.chromium.g r2 = org.chromium.C48318g.m149884a()     // Catch:{ all -> 0x01df }
            r2.f123372a = r1     // Catch:{ all -> 0x01df }
        L_0x0066:
            boolean r2 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x01df }
            if (r2 != 0) goto L_0x0080
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r2.<init>()     // Catch:{ all -> 0x01df }
            r2.append(r11)     // Catch:{ all -> 0x01df }
            java.lang.String r11 = " cronet/TTNetVersion:ec14aa9f 2019-12-27 QuicVersion:a93373c9 2019-11-29"
            r2.append(r11)     // Catch:{ all -> 0x01df }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x01df }
            r7.setUserAgent(r11)     // Catch:{ all -> 0x01df }
        L_0x0080:
            org.chromium.e r11 = org.chromium.C48316e.m149835a()     // Catch:{ all -> 0x01df }
            java.lang.String r11 = r11.mo121724L()     // Catch:{ all -> 0x01df }
            if (r11 == 0) goto L_0x008d
            r7.setGetDomainDefaultJSON(r11)     // Catch:{ all -> 0x01df }
        L_0x008d:
            java.lang.String r11 = ""
            java.lang.String r2 = r6.getPackageName()     // Catch:{ Throwable -> 0x00b8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00b8 }
            r3.<init>()     // Catch:{ Throwable -> 0x00b8 }
            java.io.File r4 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Throwable -> 0x00b8 }
            java.lang.String r4 = r4.getPath()     // Catch:{ Throwable -> 0x00b8 }
            r3.append(r4)     // Catch:{ Throwable -> 0x00b8 }
            java.lang.String r4 = "/Android/data/"
            r3.append(r4)     // Catch:{ Throwable -> 0x00b8 }
            r3.append(r2)     // Catch:{ Throwable -> 0x00b8 }
            java.lang.String r2 = "/cache/"
            r3.append(r2)     // Catch:{ Throwable -> 0x00b8 }
            java.lang.String r2 = r3.toString()     // Catch:{ Throwable -> 0x00b8 }
            r7.setStoragePath(r2)     // Catch:{ Throwable -> 0x00b9 }
            goto L_0x00b9
        L_0x00b8:
            r2 = r11
        L_0x00b9:
            java.lang.String r11 = "ttnet_config.json"
            java.lang.String r11 = r5.getConfigFromAssets(r6, r11)     // Catch:{ all -> 0x01df }
            boolean r3 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x01df }
            if (r3 != 0) goto L_0x00e9
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00e8 }
            r3.<init>(r11)     // Catch:{ Throwable -> 0x00e8 }
            java.lang.String r11 = "ttnet_proxy"
            java.lang.String r4 = ""
            java.lang.String r11 = r3.optString(r11, r4)     // Catch:{ Throwable -> 0x00e8 }
            boolean r4 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Throwable -> 0x00e8 }
            if (r4 != 0) goto L_0x00db
            r7.setProxyConfig(r11)     // Catch:{ Throwable -> 0x00e8 }
        L_0x00db:
            java.lang.String r11 = "boe_proxy_enabled"
            boolean r11 = r3.optBoolean(r11, r10)     // Catch:{ Throwable -> 0x00e8 }
            if (r11 == 0) goto L_0x00e6
            r7.enableBoeProxy(r1)     // Catch:{ Throwable -> 0x00e6 }
        L_0x00e6:
            r10 = r11
            goto L_0x00e9
        L_0x00e8:
        L_0x00e9:
            if (r10 != 0) goto L_0x0119
            java.io.File r11 = r6.getFilesDir()     // Catch:{ all -> 0x01df }
            java.lang.String r11 = r11.getAbsolutePath()     // Catch:{ all -> 0x01df }
            boolean r3 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x01df }
            if (r3 != 0) goto L_0x0119
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x0119 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0119 }
            r4.<init>()     // Catch:{ Throwable -> 0x0119 }
            r4.append(r11)     // Catch:{ Throwable -> 0x0119 }
            java.lang.String r11 = "/ttnet_boe.flag"
            r4.append(r11)     // Catch:{ Throwable -> 0x0119 }
            java.lang.String r11 = r4.toString()     // Catch:{ Throwable -> 0x0119 }
            r3.<init>(r11)     // Catch:{ Throwable -> 0x0119 }
            boolean r11 = r3.exists()     // Catch:{ Throwable -> 0x0119 }
            if (r11 == 0) goto L_0x0119
            r7.enableBoeProxy(r1)     // Catch:{ Throwable -> 0x0119 }
            r10 = 1
        L_0x0119:
            if (r10 == 0) goto L_0x0139
            org.chromium.e r10 = org.chromium.C48316e.m149835a()     // Catch:{ all -> 0x01df }
            java.lang.String r10 = r10.mo121725M()     // Catch:{ all -> 0x01df }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x01df }
            if (r11 != 0) goto L_0x012c
            r7.setBypassBOEJSON(r10)     // Catch:{ all -> 0x01df }
        L_0x012c:
            java.lang.String r10 = r5.getProxyConfig(r2)     // Catch:{ all -> 0x01df }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x01df }
            if (r11 != 0) goto L_0x0139
            r7.setProxyConfig(r10)     // Catch:{ all -> 0x01df }
        L_0x0139:
            long r10 = getALogFuncAddr()     // Catch:{ Exception -> 0x0144 }
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0144
            r7.setALogFuncAddr(r10)     // Catch:{ Exception -> 0x0144 }
        L_0x0144:
            com.ttnet.org.chromium.net.ExperimentalCronetEngine r7 = r7.build()     // Catch:{ all -> 0x01df }
            sCronetEngine = r7     // Catch:{ all -> 0x01df }
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x01df }
            if (r7 != 0) goto L_0x017e
            java.io.File r7 = new java.io.File     // Catch:{ Throwable -> 0x017e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x017e }
            r8.<init>()     // Catch:{ Throwable -> 0x017e }
            r8.append(r2)     // Catch:{ Throwable -> 0x017e }
            java.lang.String r6 = org.chromium.C48320i.m149889b(r6)     // Catch:{ Throwable -> 0x017e }
            r8.append(r6)     // Catch:{ Throwable -> 0x017e }
            java.lang.String r6 = "_netlog.json"
            r8.append(r6)     // Catch:{ Throwable -> 0x017e }
            java.lang.String r6 = r8.toString()     // Catch:{ Throwable -> 0x017e }
            r7.<init>(r6)     // Catch:{ Throwable -> 0x017e }
            boolean r6 = r7.exists()     // Catch:{ Throwable -> 0x017e }
            if (r6 == 0) goto L_0x017e
            com.ttnet.org.chromium.net.CronetEngine r6 = sCronetEngine     // Catch:{ Throwable -> 0x017e }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine r6 = (com.ttnet.org.chromium.net.ExperimentalCronetEngine) r6     // Catch:{ Throwable -> 0x017e }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ Throwable -> 0x017e }
            r6.startNetLogToFile(r7, r1)     // Catch:{ Throwable -> 0x017e }
        L_0x017e:
            org.chromium.f r6 = org.chromium.C48317f.m149883a()     // Catch:{ all -> 0x01df }
            boolean r6 = r6.loggerDebug()     // Catch:{ all -> 0x01df }
            if (r6 == 0) goto L_0x018d
            r6 = 2
            com.ttnet.org.chromium.base.Logger.setLogLevel(r6)     // Catch:{ all -> 0x01df }
            goto L_0x0191
        L_0x018d:
            r6 = 4
            com.ttnet.org.chromium.base.Logger.setLogLevel(r6)     // Catch:{ all -> 0x01df }
        L_0x0191:
            com.ttnet.org.chromium.net.CronetEngine r6 = sCronetEngine     // Catch:{ all -> 0x01df }
            boolean r6 = r6 instanceof com.ttnet.org.chromium.net.ExperimentalCronetEngine     // Catch:{ all -> 0x01df }
            if (r6 == 0) goto L_0x01cb
            com.ttnet.org.chromium.net.CronetEngine r6 = sCronetEngine     // Catch:{ all -> 0x01df }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine r6 = (com.ttnet.org.chromium.net.ExperimentalCronetEngine) r6     // Catch:{ all -> 0x01df }
            java.lang.String r7 = sTokenStr     // Catch:{ all -> 0x01df }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x01df }
            if (r7 != 0) goto L_0x01cb
            org.chromium.f r7 = org.chromium.C48317f.m149883a()     // Catch:{ all -> 0x01df }
            boolean r7 = r7.loggerDebug()     // Catch:{ all -> 0x01df }
            if (r7 == 0) goto L_0x01c6
            org.chromium.f r7 = org.chromium.C48317f.m149883a()     // Catch:{ all -> 0x01df }
            java.lang.String r8 = "CronetClient"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            java.lang.String r10 = "createCronetEngine send token = "
            r9.<init>(r10)     // Catch:{ all -> 0x01df }
            java.lang.String r10 = sTokenStr     // Catch:{ all -> 0x01df }
            r9.append(r10)     // Catch:{ all -> 0x01df }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01df }
            r7.loggerD(r8, r9)     // Catch:{ all -> 0x01df }
        L_0x01c6:
            java.lang.String r7 = sTokenStr     // Catch:{ all -> 0x01df }
            r6.setToken(r7)     // Catch:{ all -> 0x01df }
        L_0x01cb:
            com.ttnet.org.chromium.net.CronetEngine r6 = sCronetEngine     // Catch:{ all -> 0x01df }
            boolean r6 = r6 instanceof com.ttnet.org.chromium.net.ExperimentalCronetEngine     // Catch:{ all -> 0x01df }
            if (r6 == 0) goto L_0x01dd
            com.ttnet.org.chromium.net.CronetEngine r6 = sCronetEngine     // Catch:{ all -> 0x01df }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine r6 = (com.ttnet.org.chromium.net.ExperimentalCronetEngine) r6     // Catch:{ all -> 0x01df }
            r5.tryCreateRequestFinishedInfoListener(r12)     // Catch:{ all -> 0x01df }
            com.ttnet.org.chromium.net.RequestFinishedInfo$Listener r7 = sRequestFinishedInfoListener     // Catch:{ all -> 0x01df }
            r6.addRequestFinishedListener(r7)     // Catch:{ all -> 0x01df }
        L_0x01dd:
            monitor-exit(r0)     // Catch:{ all -> 0x01df }
            return
        L_0x01df:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01df }
            throw r6
        L_0x01e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.CronetClient.tryCreateCronetEngine(android.content.Context, boolean, boolean, boolean, boolean, java.lang.String, java.util.concurrent.Executor):void");
    }
}
