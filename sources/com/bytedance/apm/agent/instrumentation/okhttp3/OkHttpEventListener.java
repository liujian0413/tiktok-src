package com.bytedance.apm.agent.instrumentation.okhttp3;

import com.bytedance.apm.C6174c;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord.DnsInfo;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord.RecordResponse;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord.SocketInfo;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.util.C6294k;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

public class OkHttpEventListener extends EventListener {
    private static String sIgnoreMonitorLabel;
    private boolean needToDeal = true;
    private OkHttpRecord okHttpRecord;
    public EventListener originListener;
    private long requestHeadersEndTime;
    private String url;

    private void record() {
        if (this.needToDeal) {
            this.okHttpRecord.timeRequest.duration = System.currentTimeMillis() - this.okHttpRecord.timeRequest.start_time;
            try {
                JSONObject jSONObject = new JSONObject(this.okHttpRecord.toString());
                jSONObject.put("net_consume_type", "okhttp");
                jSONObject.put("timing_totalSendBytes", this.okHttpRecord.recordResponse.sent_bytes);
                jSONObject.put("timing_totalReceivedBytes", this.okHttpRecord.recordResponse.received_bytes);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("request_log", jSONObject);
                MonitorTool.monitorSLA(this.okHttpRecord.timeRequest.duration, this.okHttpRecord.timeRequest.start_time, this.url, "", "", this.okHttpRecord.recordResponse.code, jSONObject2);
            } catch (JSONException unused) {
            }
        }
    }

    public static void setIgnoreMonitorLabel(String str) {
        sIgnoreMonitorLabel = str;
    }

    public OkHttpEventListener(EventListener eventListener) {
        this.originListener = eventListener;
        this.okHttpRecord = new OkHttpRecord();
    }

    public void callEnd(Call call) {
        super.callEnd(call);
        if (this.originListener != null) {
            this.originListener.callEnd(call);
        }
        record();
    }

    public void requestBodyStart(Call call) {
        super.requestBodyStart(call);
        if (this.originListener != null) {
            this.originListener.requestBodyStart(call);
        }
    }

    public void responseBodyStart(Call call) {
        super.responseBodyStart(call);
        if (this.originListener != null) {
            this.originListener.responseBodyStart(call);
        }
    }

    public void secureConnectStart(Call call) {
        super.secureConnectStart(call);
        if (this.originListener != null) {
            this.originListener.secureConnectStart(call);
        }
    }

    public void callStart(Call call) {
        super.callStart(call);
        if (this.originListener != null) {
            this.originListener.callStart(call);
        }
        this.okHttpRecord.timeRequest.start_time = System.currentTimeMillis();
    }

    public void requestHeadersStart(Call call) {
        super.requestHeadersStart(call);
        if (this.originListener != null) {
            this.originListener.requestHeadersStart(call);
        }
        this.okHttpRecord.timeRequest.request_sent_time = System.currentTimeMillis();
    }

    public void responseHeadersStart(Call call) {
        super.responseHeadersStart(call);
        this.okHttpRecord.timeDetailedDuration.ttfb = (int) (System.currentTimeMillis() - this.requestHeadersEndTime);
        if (this.originListener != null) {
            this.originListener.responseHeadersStart(call);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeRequest.response_recv_time = System.currentTimeMillis();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void dealSpecialHeader(okhttp3.Response r12) {
        /*
            r11 = this;
            java.lang.String r0 = "server-timing"
            java.util.List r12 = r12.headers(r0)
            java.util.Iterator r12 = r12.iterator()
        L_0x000a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x014e
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x001d
            return
        L_0x001d:
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r1 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$HeaderRequest r1 = r1.headerRequest
            java.util.List<java.lang.String> r1 = r1.serverTimings
            r1.add(r0)
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x002f:
            if (r3 >= r1) goto L_0x000a
            r4 = r0[r3]
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x014a
            java.lang.String r5 = ";"
            boolean r5 = r4.contains(r5)
            if (r5 == 0) goto L_0x014a
            java.lang.String r5 = ";"
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            r6 = 2
            if (r5 < r6) goto L_0x014a
            r5 = r4[r2]
            java.lang.String r7 = " "
            java.lang.String r8 = ""
            java.lang.String r5 = r5.replace(r7, r8)
            r7 = 1
            r4 = r4[r7]
            java.lang.String r8 = " "
            java.lang.String r9 = ""
            java.lang.String r4 = r4.replace(r8, r9)
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 != 0) goto L_0x014a
            r8 = -1
            int r9 = r5.hashCode()
            r10 = -1008619738(0xffffffffc3e1af26, float:-451.36835)
            if (r9 == r10) goto L_0x009e
            r10 = -138105374(0xfffffffff7c4ade2, float:-7.9782574E33)
            if (r9 == r10) goto L_0x0094
            r10 = 3108285(0x2f6dbd, float:4.355635E-39)
            if (r9 == r10) goto L_0x008a
            r10 = 100355670(0x5fb4e56, float:2.3632703E-35)
            if (r9 == r10) goto L_0x0080
            goto L_0x00a8
        L_0x0080:
            java.lang.String r9 = "inner"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x00a8
            r5 = 3
            goto L_0x00a9
        L_0x008a:
            java.lang.String r9 = "edge"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x00a8
            r5 = 1
            goto L_0x00a9
        L_0x0094:
            java.lang.String r9 = "cdn-cache"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x00a8
            r5 = 0
            goto L_0x00a9
        L_0x009e:
            java.lang.String r9 = "origin"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x00a8
            r5 = 2
            goto L_0x00a9
        L_0x00a8:
            r5 = -1
        L_0x00a9:
            switch(r5) {
                case 0: goto L_0x0121;
                case 1: goto L_0x00fb;
                case 2: goto L_0x00d5;
                case 3: goto L_0x00ae;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x014a
        L_0x00ae:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x014a
            java.lang.String r5 = "="
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            if (r5 < r6) goto L_0x014a
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r5 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r5 = r5.timeDetailedDuration
            r6 = r4[r7]
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x00d0
            r4 = r4[r7]
            int r4 = java.lang.Integer.parseInt(r4)
            goto L_0x00d1
        L_0x00d0:
            r4 = 0
        L_0x00d1:
            r5.inner = r4
            goto L_0x014a
        L_0x00d5:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x014a
            java.lang.String r5 = "="
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            if (r5 < r6) goto L_0x014a
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r5 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r5 = r5.timeDetailedDuration
            r6 = r4[r7]
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x00f7
            r4 = r4[r7]
            int r4 = java.lang.Integer.parseInt(r4)
            goto L_0x00f8
        L_0x00f7:
            r4 = 0
        L_0x00f8:
            r5.origin = r4
            goto L_0x014a
        L_0x00fb:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x014a
            java.lang.String r5 = "="
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            if (r5 < r6) goto L_0x014a
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r5 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r5 = r5.timeDetailedDuration
            r6 = r4[r7]
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x011d
            r4 = r4[r7]
            int r4 = java.lang.Integer.parseInt(r4)
            goto L_0x011e
        L_0x011d:
            r4 = 0
        L_0x011e:
            r5.edge = r4
            goto L_0x014a
        L_0x0121:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x014a
            java.lang.String r5 = "="
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            if (r5 < r6) goto L_0x014a
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r5 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r5 = r5.timeDetailedDuration
            r6 = r4[r7]
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0147
            r4 = r4[r7]
            java.lang.String r6 = "hit"
            boolean r4 = r4.equalsIgnoreCase(r6)
            if (r4 == 0) goto L_0x0147
            goto L_0x0148
        L_0x0147:
            r7 = 0
        L_0x0148:
            r5.cdn_hit_cache = r7
        L_0x014a:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x014e:
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r12 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r12 = r12.timeDetailedDuration
            int r12 = r12.ttfb
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r0 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r0 = r0.timeDetailedDuration
            int r0 = r0.edge
            int r12 = r12 - r0
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r0 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r0 = r0.timeDetailedDuration
            int r0 = r0.origin
            int r12 = r12 - r0
            if (r12 <= 0) goto L_0x016a
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r0 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r0 = r0.timeDetailedDuration
            r0.rtt = r12
        L_0x016a:
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r12 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r12 = r12.timeDetailedDuration
            int r12 = r12.origin
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r0 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r0 = r0.timeDetailedDuration
            int r0 = r0.inner
            int r12 = r12 - r0
            if (r12 <= 0) goto L_0x017f
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r0 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r0 = r0.timeDetailedDuration
            r0.origin = r12
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpEventListener.dealSpecialHeader(okhttp3.Response):void");
    }

    public void callFailed(Call call, IOException iOException) {
        super.callFailed(call, iOException);
        if (this.originListener != null) {
            this.originListener.callFailed(call, iOException);
        }
        record();
    }

    public void connectionAcquired(Call call, Connection connection) {
        super.connectionAcquired(call, connection);
        if (this.originListener != null) {
            this.originListener.connectionAcquired(call, connection);
        }
    }

    public void connectionReleased(Call call, Connection connection) {
        super.connectionReleased(call, connection);
        if (this.originListener != null) {
            this.originListener.connectionReleased(call, connection);
        }
    }

    public void dnsStart(Call call, String str) {
        super.dnsStart(call, str);
        if (this.originListener != null) {
            this.originListener.dnsStart(call, str);
        }
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        super.secureConnectEnd(call, handshake);
        if (this.originListener != null) {
            this.originListener.secureConnectEnd(call, handshake);
        }
    }

    public void requestBodyEnd(Call call, long j) {
        super.requestBodyEnd(call, j);
        if (this.originListener != null) {
            this.originListener.requestBodyEnd(call, j);
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.sent_bytes += j;
        }
    }

    public void responseBodyEnd(Call call, long j) {
        super.responseBodyEnd(call, j);
        if (this.originListener != null) {
            this.originListener.responseBodyEnd(call, j);
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.received_bytes += j;
        }
    }

    public void requestHeadersEnd(Call call, Request request) {
        this.requestHeadersEndTime = System.currentTimeMillis();
        super.requestHeadersEnd(call, request);
        if (this.originListener != null) {
            this.originListener.requestHeadersEnd(call, request);
        }
        String header = request.header("User-Agent");
        if (!(sIgnoreMonitorLabel == null || header == null || !header.contains(sIgnoreMonitorLabel))) {
            this.needToDeal = false;
        }
        this.okHttpRecord.recordResponse.sent_bytes += request.headers.byteCount();
        this.url = request.url.toString();
    }

    public void responseHeadersEnd(Call call, Response response) {
        super.responseHeadersEnd(call, response);
        if (this.originListener != null) {
            this.originListener.responseHeadersEnd(call, response);
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.code = response.code;
            this.okHttpRecord.recordResponse.received_bytes += response.headers.byteCount();
            this.okHttpRecord.recordResponse.network_accessed = C6294k.m19530b(C6174c.m19129a());
            this.okHttpRecord.headerRequest.x_tt_trace_id = response.header("x-tt-trace-id", "");
            this.okHttpRecord.headerRequest.x_tt_trace_host = response.header("x-tt-trace-host", "");
            this.okHttpRecord.headerRequest.x_tt_trace_tag = response.header("x-tt-trace-tag", "");
            this.okHttpRecord.headerRequest.x_tt_content_encoding = response.header("x-tt-content-encoding", "");
            try {
                dealSpecialHeader(response);
            } catch (Exception unused) {
            }
        }
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(call, inetSocketAddress, proxy);
        if (this.originListener != null) {
            this.originListener.connectStart(call, inetSocketAddress, proxy);
        }
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        super.dnsEnd(call, str, list);
        if (this.originListener != null) {
            this.originListener.dnsEnd(call, str, list);
        }
        if (list != null && list.size() > 0) {
            for (InetAddress inetAddress : list) {
                DnsInfo dnsInfo = new DnsInfo();
                dnsInfo.address = inetAddress.getHostAddress();
                this.okHttpRecord.addressList.add(dnsInfo);
            }
        }
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        boolean z;
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        if (this.originListener != null) {
            this.originListener.connectEnd(call, inetSocketAddress, proxy, protocol);
        }
        RecordResponse recordResponse = this.okHttpRecord.recordResponse;
        if (proxy.address() != null) {
            z = true;
        } else {
            z = false;
        }
        recordResponse.via_Proxy = z;
        if (inetSocketAddress != null && inetSocketAddress.getAddress() != null) {
            SocketInfo socketInfo = this.okHttpRecord.socketInfo;
            StringBuilder sb = new StringBuilder();
            sb.append(inetSocketAddress.getAddress().getHostAddress());
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
            socketInfo.remote = sb.toString();
        }
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        if (this.originListener != null) {
            this.originListener.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        }
    }
}
