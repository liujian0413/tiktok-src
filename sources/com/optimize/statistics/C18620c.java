package com.optimize.statistics;

import android.text.TextUtils;
import android.util.Log;
import com.C1642a;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.ttnet.C12947b;
import com.bytedance.ttnet.p671c.C12955b;
import com.facebook.common.p686c.C13286a;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.p725l.C13783b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.net.C14126c;
import com.facebook.net.C14134d;
import com.facebook.net.C14138f;
import com.facebook.net.C14139g;
import com.facebook.net.RetryInterceptManager;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.p1783b.p1784a.C45771a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.optimize.statistics.c */
public final class C18620c implements C13653c {

    /* renamed from: c */
    private static ExecutorService f50310c = C18627d.m61096a(1, new ThreadFactory() {
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "fresco-trace-monitor");
        }
    });

    /* renamed from: a */
    public ConcurrentHashMap<String, C18626a> f50311a;

    /* renamed from: b */
    public C14134d f50312b;

    /* renamed from: com.optimize.statistics.c$a */
    class C18626a {

        /* renamed from: a */
        String f50326a;

        /* renamed from: b */
        long f50327b;

        /* renamed from: c */
        Map<String, Long> f50328c = new HashMap();

        /* renamed from: d */
        JSONObject f50329d;

        /* renamed from: e */
        Object f50330e;

        C18626a() {
        }
    }

    public final void onProducerEvent(String str, String str2, String str3) {
    }

    public final void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
    }

    public final boolean requiresExtraMap(String str) {
        return true;
    }

    public C18620c() {
        this(false);
    }

    /* renamed from: a */
    private static long m61084a() {
        return System.currentTimeMillis();
    }

    public final void onRequestCancellation(final String str) {
        final long a = m61084a();
        f50310c.submit(new Runnable() {
            public final void run() {
                C18620c.this.mo48812a(str, a);
            }
        });
    }

    private C18620c(boolean z) {
        this.f50312b = new C14134d() {
            /* renamed from: a */
            public final void mo33891a(long j, long j2, C14139g gVar, C12955b bVar, Throwable th, JSONObject jSONObject) {
                m61093c(j, j2, gVar, bVar, th, jSONObject);
            }

            /* renamed from: b */
            public final void mo33892b(long j, long j2, C14139g gVar, C12955b bVar, Throwable th, JSONObject jSONObject) {
                m61093c(j, j2, gVar, bVar, null, jSONObject);
            }

            /* renamed from: c */
            private void m61093c(long j, long j2, C14139g gVar, C12955b bVar, Throwable th, JSONObject jSONObject) {
                long j3;
                Object remove = jSONObject.remove("requestId");
                Object remove2 = jSONObject.remove("retryCount");
                Object remove3 = jSONObject.remove("queue_time");
                Object remove4 = jSONObject.remove("fetch_time");
                try {
                    if (remove instanceof String) {
                        String str = (String) remove;
                        if (!TextUtils.isEmpty(str)) {
                            int i = -1;
                            if (remove2 instanceof Integer) {
                                i = ((Integer) remove2).intValue();
                            }
                            long j4 = -1;
                            if (remove3 instanceof Long) {
                                j3 = ((Long) remove3).longValue();
                            } else {
                                j3 = -1;
                            }
                            if (remove4 instanceof Long) {
                                j4 = ((Long) remove4).longValue();
                            }
                            C18626a aVar = (C18626a) C18620c.this.f50311a.get(str);
                            if (aVar != null) {
                                JSONObject jSONObject2 = aVar.f50329d;
                                jSONObject2.put("is_request_network", true);
                                jSONObject2.put("http_status", jSONObject.optInt("http_status", 0));
                                jSONObject2.put("retry_count", i);
                                jSONObject2.put("queue_duration", j3);
                                jSONObject2.put("download_duration", j4);
                                C18620c.m61087a(bVar, jSONObject2);
                                C18620c.m61088a(gVar, jSONObject2);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        };
        this.f50311a = new ConcurrentHashMap<>();
        C14126c.m41719a(this.f50312b);
    }

    /* renamed from: a */
    private static boolean m61089a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.contains("Canceled") || str.contains("canceled")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static long m61085a(Long l, long j) {
        if (l != null) {
            return j - l.longValue();
        }
        return -1;
    }

    /* renamed from: a */
    private static String m61086a(String str, Object... objArr) {
        return C1642a.m8035a(null, str, objArr);
    }

    public final void onProducerStart(String str, String str2) {
        long a = m61084a();
        C18626a aVar = (C18626a) this.f50311a.get(str);
        if (aVar != null) {
            StringBuilder sb = new StringBuilder(str);
            Map<String, Long> map = aVar.f50328c;
            sb.append(str2);
            map.put(sb.toString(), Long.valueOf(a));
            JSONObject jSONObject = aVar.f50329d;
            if (jSONObject != null) {
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject("image_monitor_data");
                    if (optJSONObject != null) {
                        optJSONObject.put(str2, new JSONObject());
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m61088a(C14139g gVar, JSONObject jSONObject) {
        String str = "";
        String str2 = "";
        try {
            if (gVar.f37365a != null) {
                C12461b a = gVar.f37365a.f33301a.mo30450a("Nw-Session-Trace");
                C12461b a2 = gVar.f37365a.f33301a.mo30450a("x-net-info.remoteaddr");
                if (a != null) {
                    str = gVar.f37365a.f33301a.mo30450a("Nw-Session-Trace").f33096b;
                }
                if (a2 != null) {
                    str2 = gVar.f37365a.f33301a.mo30450a("x-net-info.remoteaddr").f33096b;
                }
            } else if (gVar.f37366b != null) {
                str = gVar.f37366b.header("Nw-Session-Trace");
                str2 = gVar.f37366b.header("x-snssdk.remoteaddr");
            }
            String str3 = "nw-session-trace";
            if (str == null) {
                str = "";
            }
            jSONObject.put(str3, str);
            String str4 = "server_ip";
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put(str4, str2);
        } catch (Exception e) {
            if (C18630g.m61102a()) {
                new StringBuilder("packageResponseHeader ").append(Log.getStackTraceString(e));
            }
        }
    }

    /* renamed from: a */
    protected static void m61087a(C12955b bVar, JSONObject jSONObject) {
        if (bVar != null && jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("requestStart", bVar.f27502e);
                jSONObject2.put("responseBack", bVar.f27503f);
                jSONObject2.put("completeReadResponse", bVar.f27504g);
                jSONObject2.put("requestEnd", bVar.f27505h);
                jSONObject2.put("recycleCount", bVar.f27506i);
                if (bVar.f27519v == 0) {
                    jSONObject2.put("timing_dns", bVar.f27507j);
                    jSONObject2.put("timing_connect", bVar.f27508k);
                    jSONObject2.put("timing_ssl", bVar.f27509l);
                    jSONObject2.put("timing_send", bVar.f27510m);
                    jSONObject2.put("timing_wait", bVar.f27514q);
                    jSONObject2.put("timing_receive", bVar.f27512o);
                    jSONObject2.put("timing_total", bVar.f27515r);
                    jSONObject2.put("timing_isSocketReused", bVar.f27513p);
                    jSONObject2.put("timing_totalSendBytes", bVar.f27516s);
                    jSONObject2.put("timing_totalReceivedBytes", bVar.f27517t);
                    jSONObject2.put("timing_remoteIP", bVar.f27498a);
                    jSONObject2.put("request_log", bVar.f27521x);
                }
                if (bVar.f27522y != null) {
                    jSONObject2.put("req_info", bVar.f27522y);
                }
                jSONObject2.put("download", bVar.f27523z);
                jSONObject.put("net_timing_detail", jSONObject2);
                if (C12947b.m37743a()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
            } catch (JSONException e) {
                if (C18630g.m61102a()) {
                    new StringBuilder("packageRequestParameters ").append(Log.getStackTraceString(e));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo48812a(String str, long j) {
        C18626a aVar = (C18626a) this.f50311a.remove(str);
        if (aVar != null && C18619b.m61083c()) {
            Object[] objArr = {Long.valueOf(j), str, Long.valueOf(m61085a(Long.valueOf(aVar.f50327b), j))};
            C45771a.m143707b("Fresco", m61086a("time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", objArr));
        }
    }

    public final void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        final long a = m61084a();
        ExecutorService executorService = f50310c;
        final ImageRequest imageRequest2 = imageRequest;
        final String str2 = str;
        C186233 r0 = new Runnable() {
            public final void run() {
                C18620c.this.mo48810a(imageRequest2, str2, a);
            }
        };
        executorService.submit(r0);
    }

    public final void onUltimateProducerReached(String str, String str2, boolean z) {
        C18626a aVar = (C18626a) this.f50311a.get(str);
        if (aVar != null) {
            JSONObject jSONObject = aVar.f50329d;
            if (jSONObject != null) {
                try {
                    jSONObject.getJSONObject("image_monitor_data").put("image_origin", C18628e.m61098a(str2));
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo48810a(ImageRequest imageRequest, String str, long j) {
        boolean z;
        if (C13783b.m40665b()) {
            C13783b.m40664a("FrescoMonitor#onImageLoaded");
        }
        C18626a aVar = (C18626a) this.f50311a.remove(str);
        if (aVar != null) {
            JSONObject jSONObject = aVar.f50329d;
            if (!C18619b.m61078a()) {
                z = jSONObject.optBoolean("is_request_network", false);
            } else if (imageRequest.mSourceUriType == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    if (aVar.f50330e instanceof String) {
                        jSONObject.put("scene_tag", aVar.f50330e);
                    }
                    jSONObject.put("duration", m61085a(Long.valueOf(aVar.f50327b), j));
                    jSONObject.put("load_status", "success");
                    jSONObject.put("timestamp", Long.valueOf(aVar.f50327b));
                    jSONObject.put("log_type", "image_monitor_v2");
                    jSONObject.put("log_version", 1);
                    jSONObject.put("uri", imageRequest.mSourceUri.toString());
                    jSONObject.put("image_sdk_version", "1.12.5-douyin-rc.30");
                    jSONObject.put("retry_open", RetryInterceptManager.m41704a().mo33882b() ? 1 : 0);
                    JSONObject optJSONObject = jSONObject.optJSONObject("image_monitor_data");
                    if (optJSONObject != null) {
                        optJSONObject.put("image_status", 0);
                        if (optJSONObject.opt("image_origin") == null) {
                            optJSONObject.put("image_origin", 7);
                        }
                        optJSONObject.put("disk_cache_type", C18628e.m61097a(imageRequest.mCacheChoice));
                    }
                } catch (JSONException unused) {
                }
                C18619b.m61077a(true, str, jSONObject);
            }
            if (jSONObject.optBoolean("is_request_network", false) && C18619b.m61083c()) {
                Object[] objArr = {Long.valueOf(j), imageRequest.mSourceUri.toString(), str, Long.valueOf(m61085a(Long.valueOf(aVar.f50327b), j)), jSONObject.optString("scene_tag")};
                C45771a.m143707b("Fresco", m61086a("time %d: onRequestSuccess: {url: %s, requestId: %s, elapsedTime: %d ms, scene_tag: %s}", objArr));
            }
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    public final void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        JSONObject jSONObject;
        String str3;
        long a = m61084a();
        C18626a aVar = (C18626a) this.f50311a.get(str);
        if (aVar != null) {
            Map<String, Long> map2 = aVar.f50328c;
            if (!map2.isEmpty()) {
                StringBuilder sb = new StringBuilder(str);
                sb.append(str2);
                Long l = (Long) map2.remove(sb.toString());
                JSONObject jSONObject2 = aVar.f50329d;
                if (jSONObject2 != null) {
                    try {
                        jSONObject = jSONObject2.optJSONObject("image_monitor_data");
                        if (jSONObject != null) {
                            try {
                                JSONObject optJSONObject = jSONObject.optJSONObject(str2);
                                if (optJSONObject != null) {
                                    optJSONObject.put("producer_start", l.longValue() - Long.valueOf(aVar.f50327b).longValue());
                                    optJSONObject.put("producer_end", a - aVar.f50327b);
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (map != null) {
                        if ("NetworkFetchProducer".equals(str2)) {
                            try {
                                long parseLong = Long.parseLong((String) map.get("content_length"));
                                jSONObject2.put("content_length", parseLong);
                                long parseLong2 = Long.parseLong((String) map.get("image_size"));
                                jSONObject2.put("file_size", parseLong2);
                                String str4 = "file_consistent";
                                if (parseLong == parseLong2) {
                                    str3 = "1";
                                } else {
                                    str3 = "0";
                                }
                                jSONObject2.put(str4, str3);
                                jSONObject2.put("hit_cdn_cache", map.get("hit_cdn_cache"));
                            } catch (NumberFormatException | JSONException unused3) {
                            }
                            return;
                        }
                        if ("DecodeProducer".equals(str2)) {
                            try {
                                String str5 = (String) map.get("requestedImageSize");
                                if ("unknown".equals(str5)) {
                                    str5 = "0x0";
                                }
                                jSONObject2.put("intended_image_size", str5);
                                String str6 = (String) map.get("encodedImageSize");
                                if ("-1x-1".equals(str6) || "unknown".equals(str6)) {
                                    str6 = (String) map.get("bitmapSize");
                                }
                                jSONObject2.put("applied_image_size", str6);
                                jSONObject2.put("decode_duration", a - l.longValue());
                                jSONObject2.put("image_type", map.get("imageFormat"));
                                if (jSONObject != null) {
                                    jSONObject.put("decode_queue_duration", Long.parseLong((String) map.get("queueTime")));
                                }
                            } catch (JSONException unused4) {
                            } catch (NumberFormatException unused5) {
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        final long a = m61084a();
        ExecutorService executorService = f50310c;
        final ImageRequest imageRequest2 = imageRequest;
        final String str2 = str;
        final Throwable th2 = th;
        C186244 r0 = new Runnable() {
            public final void run() {
                C18620c.this.mo48811a(imageRequest2, str2, a, th2);
            }
        };
        executorService.submit(r0);
    }

    public final void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        long a = m61084a();
        if (C13783b.m40665b()) {
            C13783b.m40664a("FrescoMonitor#onRequestStart");
        }
        C18626a aVar = new C18626a();
        aVar.f50326a = str;
        aVar.f50327b = a;
        aVar.f50330e = obj;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            if (C18619b.m61080b()) {
                try {
                    jSONObject.put("image_monitor_data", new JSONObject());
                } catch (JSONException unused) {
                }
            }
            aVar.f50329d = jSONObject;
        }
        this.f50311a.put(str, aVar);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    public final void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map) {
        String str3;
        long a = m61084a();
        C18626a aVar = (C18626a) this.f50311a.get(str);
        if (aVar != null) {
            JSONObject jSONObject = aVar.f50329d;
            if (jSONObject != null) {
                if (map == null) {
                    map = new HashMap<>();
                    map.put("image_size", "-1");
                    map.put("queue_time", "-1");
                    map.put("fetch_time", "-1");
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("image_monitor_data");
                if ("NetworkFetchProducer".equals(str2)) {
                    try {
                        jSONObject.put("fail_phase", "download");
                        jSONObject.put("download_duration", -1);
                        long parseLong = Long.parseLong((String) map.get("content_length"));
                        jSONObject.put("content_length", parseLong);
                        long parseLong2 = Long.parseLong((String) map.get("image_size"));
                        jSONObject.put("file_size", parseLong2);
                        String str4 = "file_consistent";
                        if (parseLong == parseLong2) {
                            str3 = "1";
                        } else {
                            str3 = "0";
                        }
                        jSONObject.put(str4, str3);
                        jSONObject.put("queue_duration", Long.parseLong((String) map.get("queue_time")));
                    } catch (NumberFormatException | JSONException unused) {
                    }
                } else if ("DecodeProducer".equals(str2)) {
                    jSONObject.put("fail_phase", "decode");
                    jSONObject.put("download_duration", Long.parseLong((String) map.get("fetch_time")));
                    if (optJSONObject != null) {
                        optJSONObject.put("decode_queue_duration", Long.parseLong((String) map.get("queueTime")));
                    }
                }
                StringBuilder sb = new StringBuilder(str);
                Map<String, Long> map2 = aVar.f50328c;
                if (!map2.isEmpty()) {
                    sb.append(str2);
                    Long l = (Long) map2.remove(sb.toString());
                    if (C18619b.m61083c()) {
                        String th2 = th.toString();
                        String a2 = m61086a("time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", Long.valueOf(a), str, str2, Long.valueOf(m61085a(l, a)), map, th2);
                        if (m61089a(th2)) {
                            C45771a.m143712e("Fresco", a2);
                        } else {
                            C45771a.m143708b("Fresco", a2, th);
                        }
                        C13286a.m38861c("Fresco", a2, th);
                    }
                    if (optJSONObject != null) {
                        try {
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject(str2);
                            if (optJSONObject2 != null) {
                                optJSONObject2.put("producer_start", l.longValue() - Long.valueOf(aVar.f50327b).longValue());
                                optJSONObject2.put("producer_end", a - aVar.f50327b);
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo48811a(ImageRequest imageRequest, String str, long j, Throwable th) {
        boolean z;
        String str2;
        int i;
        boolean z2;
        if (C13783b.m40665b()) {
            C13783b.m40664a("FrescoMonitor#onRequestFailure");
        }
        C18626a aVar = (C18626a) this.f50311a.remove(str);
        if (aVar != null) {
            JSONObject jSONObject = aVar.f50329d;
            if (!C18619b.m61078a()) {
                z = jSONObject.optBoolean("is_request_network", false);
            } else if (imageRequest.mSourceUriType == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int a = C18628e.m61099a(th);
                if (th == null) {
                    i = C34943c.f91127w;
                } else {
                    i = C14138f.m41742a(th, null);
                }
                try {
                    if (aVar.f50330e instanceof String) {
                        jSONObject.put("scene_tag", aVar.f50330e);
                    }
                    jSONObject.put("load_status", "fail");
                    jSONObject.put("duration", m61085a(Long.valueOf(aVar.f50327b), j));
                    jSONObject.put("err_code", i);
                    jSONObject.put("err_desc", Log.getStackTraceString(th));
                    jSONObject.put("timestamp", Long.valueOf(aVar.f50327b));
                    jSONObject.put("log_type", "image_monitor_v2");
                    jSONObject.put("log_version", 1);
                    jSONObject.put("uri", imageRequest.mSourceUri.toString());
                    jSONObject.put("image_sdk_version", "1.12.5-douyin-rc.30");
                    jSONObject.put("retry_open", RetryInterceptManager.m41704a().mo33882b() ? 1 : 0);
                    JSONObject optJSONObject = jSONObject.optJSONObject("image_monitor_data");
                    if (optJSONObject != null) {
                        optJSONObject.put("image_status", a);
                        String str3 = "image_load_error_code";
                        if (i != 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        optJSONObject.put(str3, C18628e.m61100a(th, z2));
                        optJSONObject.put("disk_cache_type", C18628e.m61097a(imageRequest.mCacheChoice));
                    }
                } catch (JSONException unused) {
                }
                C18619b.m61077a(false, str, jSONObject);
            }
            if (C18619b.m61083c()) {
                if (th != null) {
                    str2 = th.toString();
                } else {
                    str2 = "";
                }
                String a2 = m61086a("time %d: onRequestFailure: {url: %s, requestId: %s, elapsedTime: %d ms, throwable: %s, scene_tag: %s}", Long.valueOf(j), imageRequest.mSourceUri.toString(), str, Long.valueOf(m61085a(Long.valueOf(aVar.f50327b), j)), str2, jSONObject.optString("scene_tag"));
                if (!m61089a(str2)) {
                    C45771a.m143708b("Fresco", a2, th);
                }
            }
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }
}
