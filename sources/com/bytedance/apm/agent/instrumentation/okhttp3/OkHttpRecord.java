package com.bytedance.apm.agent.instrumentation.okhttp3;

import com.bytedance.apm.C6174c;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.Version;
import org.json.JSONObject;

public class OkHttpRecord {
    public List<DnsInfo> addressList = new ArrayList();
    public HeaderRequest headerRequest = new HeaderRequest();
    public OtherInfo otherInfo = new OtherInfo();
    public JSONObject recordJson = new JSONObject();
    public RecordResponse recordResponse = new RecordResponse();
    public SocketInfo socketInfo = new SocketInfo();
    public DetailedDuration timeDetailedDuration = new DetailedDuration();
    public TimeRequest timeRequest = new TimeRequest();

    public static class DetailedDuration {
        public String body_recv;
        public boolean cdn_hit_cache;
        public String dns;
        public int edge;
        public String header_recv;
        public int inner;
        public int origin;
        public String proxy;
        public int rtt;
        public String send;
        public String ssl;
        public String tcp;
        public int ttfb;
    }

    public static class DnsInfo {
        public String address;
    }

    public static class HeaderRequest {
        public List<String> serverTimings = new ArrayList();
        public String x_tt_content_encoding;
        public String x_tt_trace_host;
        public String x_tt_trace_id;
        public String x_tt_trace_tag;
    }

    public static class OtherInfo {
        public boolean is_main_process = C6174c.m19145c();
        public String libcore = "okhttp";
        public String version = Version.userAgent();
    }

    public class RecordResponse {
        public int code;
        public boolean network_accessed;
        public long received_bytes;
        public long sent_bytes;
        public boolean via_Proxy;

        public RecordResponse() {
        }
    }

    public static class SocketInfo {
        public String remote;
    }

    public static class TimeRequest {
        public long duration;
        public long request_sent_time;
        public long response_recv_time;
        public long start_time;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void fillSocketInfo() {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "remote"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$SocketInfo r2 = r3.socketInfo     // Catch:{ JSONException -> 0x000e }
            java.lang.String r2 = r2.remote     // Catch:{ JSONException -> 0x000e }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x000e }
        L_0x000e:
            org.json.JSONObject r1 = r3.recordJson     // Catch:{ JSONException -> 0x0016 }
            java.lang.String r2 = "socket"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x0016 }
            return
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord.fillSocketInfo():void");
    }

    public String toString() {
        fillDnsInfo();
        fillSocketInfo();
        fillResponse();
        dealTime();
        dealOther();
        dealHeader();
        return this.recordJson.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void dealOther() {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "libcore"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$OtherInfo r2 = r3.otherInfo     // Catch:{ JSONException -> 0x0020 }
            java.lang.String r2 = r2.libcore     // Catch:{ JSONException -> 0x0020 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0020 }
            java.lang.String r1 = "version"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$OtherInfo r2 = r3.otherInfo     // Catch:{ JSONException -> 0x0020 }
            java.lang.String r2 = r2.version     // Catch:{ JSONException -> 0x0020 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0020 }
            java.lang.String r1 = "is_main_process"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$OtherInfo r2 = r3.otherInfo     // Catch:{ JSONException -> 0x0020 }
            boolean r2 = r2.is_main_process     // Catch:{ JSONException -> 0x0020 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0020 }
        L_0x0020:
            org.json.JSONObject r1 = r3.recordJson     // Catch:{ JSONException -> 0x0028 }
            java.lang.String r2 = "other"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x0028 }
            return
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord.dealOther():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|(6:2|(2:5|3)|14|6|7|8)|9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void fillDnsInfo() {
        /*
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.List<com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DnsInfo> r1 = r4.addressList
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x002f
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List<com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DnsInfo> r2 = r4.addressList
            java.util.Iterator r2 = r2.iterator()
        L_0x0018:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002a
            java.lang.Object r3 = r2.next()
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DnsInfo r3 = (com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord.DnsInfo) r3
            java.lang.String r3 = r3.address
            r1.put(r3)
            goto L_0x0018
        L_0x002a:
            java.lang.String r2 = "address_list"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x002f }
        L_0x002f:
            org.json.JSONObject r1 = r4.recordJson     // Catch:{ JSONException -> 0x0037 }
            java.lang.String r2 = "dns"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x0037 }
            return
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord.fillDnsInfo():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void fillResponse() {
        /*
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "code"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$RecordResponse r2 = r4.recordResponse     // Catch:{ JSONException -> 0x0032 }
            int r2 = r2.code     // Catch:{ JSONException -> 0x0032 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r1 = "sent_bytes"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$RecordResponse r2 = r4.recordResponse     // Catch:{ JSONException -> 0x0032 }
            long r2 = r2.sent_bytes     // Catch:{ JSONException -> 0x0032 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r1 = "received_bytes"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$RecordResponse r2 = r4.recordResponse     // Catch:{ JSONException -> 0x0032 }
            long r2 = r2.received_bytes     // Catch:{ JSONException -> 0x0032 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r1 = "via_proxy"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$RecordResponse r2 = r4.recordResponse     // Catch:{ JSONException -> 0x0032 }
            boolean r2 = r2.via_Proxy     // Catch:{ JSONException -> 0x0032 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r1 = "network_accessed"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$RecordResponse r2 = r4.recordResponse     // Catch:{ JSONException -> 0x0032 }
            boolean r2 = r2.network_accessed     // Catch:{ JSONException -> 0x0032 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0032 }
        L_0x0032:
            org.json.JSONObject r1 = r4.recordJson     // Catch:{ JSONException -> 0x003a }
            java.lang.String r2 = "response"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x003a }
            return
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord.fillResponse():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|(2:5|3)|12|6|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x004b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void dealHeader() {
        /*
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "x-tt-content-encoding"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$HeaderRequest r2 = r4.headerRequest     // Catch:{ JSONException -> 0x004b }
            java.lang.String r2 = r2.x_tt_content_encoding     // Catch:{ JSONException -> 0x004b }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x004b }
            java.lang.String r1 = "x-tt-trace-host"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$HeaderRequest r2 = r4.headerRequest     // Catch:{ JSONException -> 0x004b }
            java.lang.String r2 = r2.x_tt_trace_host     // Catch:{ JSONException -> 0x004b }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x004b }
            java.lang.String r1 = "x-tt-trace-id"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$HeaderRequest r2 = r4.headerRequest     // Catch:{ JSONException -> 0x004b }
            java.lang.String r2 = r2.x_tt_trace_id     // Catch:{ JSONException -> 0x004b }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x004b }
            java.lang.String r1 = "x-tt-trace-tag"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$HeaderRequest r2 = r4.headerRequest     // Catch:{ JSONException -> 0x004b }
            java.lang.String r2 = r2.x_tt_trace_tag     // Catch:{ JSONException -> 0x004b }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x004b }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x004b }
            r1.<init>()     // Catch:{ JSONException -> 0x004b }
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$HeaderRequest r2 = r4.headerRequest     // Catch:{ JSONException -> 0x004b }
            java.util.List<java.lang.String> r2 = r2.serverTimings     // Catch:{ JSONException -> 0x004b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x004b }
        L_0x0036:
            boolean r3 = r2.hasNext()     // Catch:{ JSONException -> 0x004b }
            if (r3 == 0) goto L_0x0046
            java.lang.Object r3 = r2.next()     // Catch:{ JSONException -> 0x004b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x004b }
            r1.put(r3)     // Catch:{ JSONException -> 0x004b }
            goto L_0x0036
        L_0x0046:
            java.lang.String r2 = "server-timing"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x004b }
        L_0x004b:
            org.json.JSONObject r1 = r4.recordJson     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r2 = "header"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x0053 }
            return
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord.dealHeader():void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0073 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void dealTime() {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "duration"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$TimeRequest r3 = r5.timeRequest     // Catch:{ JSONException -> 0x0033 }
            long r3 = r3.duration     // Catch:{ JSONException -> 0x0033 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r2 = "request_sent_time"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$TimeRequest r3 = r5.timeRequest     // Catch:{ JSONException -> 0x0033 }
            long r3 = r3.request_sent_time     // Catch:{ JSONException -> 0x0033 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r2 = "response_recv_time"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$TimeRequest r3 = r5.timeRequest     // Catch:{ JSONException -> 0x0033 }
            long r3 = r3.response_recv_time     // Catch:{ JSONException -> 0x0033 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r2 = "start_time"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$TimeRequest r3 = r5.timeRequest     // Catch:{ JSONException -> 0x0033 }
            long r3 = r3.start_time     // Catch:{ JSONException -> 0x0033 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r2 = "request"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0033 }
        L_0x0033:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "edge"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r3 = r5.timeDetailedDuration     // Catch:{ JSONException -> 0x0073 }
            int r3 = r3.edge     // Catch:{ JSONException -> 0x0073 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0073 }
            java.lang.String r2 = "ttfb"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r3 = r5.timeDetailedDuration     // Catch:{ JSONException -> 0x0073 }
            int r3 = r3.ttfb     // Catch:{ JSONException -> 0x0073 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0073 }
            java.lang.String r2 = "rtt"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r3 = r5.timeDetailedDuration     // Catch:{ JSONException -> 0x0073 }
            int r3 = r3.rtt     // Catch:{ JSONException -> 0x0073 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0073 }
            java.lang.String r2 = "inner"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r3 = r5.timeDetailedDuration     // Catch:{ JSONException -> 0x0073 }
            int r3 = r3.inner     // Catch:{ JSONException -> 0x0073 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0073 }
            java.lang.String r2 = "cdn_hit_cache"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r3 = r5.timeDetailedDuration     // Catch:{ JSONException -> 0x0073 }
            boolean r3 = r3.cdn_hit_cache     // Catch:{ JSONException -> 0x0073 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0073 }
            java.lang.String r2 = "origin"
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r3 = r5.timeDetailedDuration     // Catch:{ JSONException -> 0x0073 }
            int r3 = r3.origin     // Catch:{ JSONException -> 0x0073 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0073 }
            java.lang.String r2 = "detailed_duration"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0073 }
        L_0x0073:
            org.json.JSONObject r1 = r5.recordJson     // Catch:{ JSONException -> 0x007b }
            java.lang.String r2 = "timing"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x007b }
            return
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord.dealTime():void");
    }
}
