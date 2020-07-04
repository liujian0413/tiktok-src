package com.google.android.gms.internal.measurement;

import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;

/* renamed from: com.google.android.gms.internal.measurement.az */
public final class C16406az {

    /* renamed from: A */
    public static C16408ba<Long> f45900A = C16408ba.m53466a("analytics.service_client.idle_disconnect_millis", 10000, 10000);

    /* renamed from: B */
    public static C16408ba<Long> f45901B = C16408ba.m53466a("analytics.service_client.connect_timeout_millis", (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION, (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);

    /* renamed from: C */
    public static C16408ba<Long> f45902C = C16408ba.m53466a("analytics.service_client.reconnect_throttle_millis", 1800000, 1800000);

    /* renamed from: D */
    public static C16408ba<Long> f45903D = C16408ba.m53466a("analytics.monitoring.sample_period_millis", 86400000, 86400000);

    /* renamed from: E */
    public static C16408ba<Long> f45904E = C16408ba.m53466a("analytics.initialization_warning_threshold", (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION, (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);

    /* renamed from: F */
    public static C16408ba<Boolean> f45905F = C16408ba.m53468a("analytics.gcm_task_service", false, false);

    /* renamed from: G */
    private static C16408ba<Boolean> f45906G = C16408ba.m53468a("analytics.service_enabled", false, false);

    /* renamed from: H */
    private static C16408ba<Long> f45907H = C16408ba.m53466a("analytics.max_tokens", 60, 60);

    /* renamed from: I */
    private static C16408ba<Float> f45908I = C16408ba.m53464a("analytics.tokens_per_sec", 0.5f, 0.5f);

    /* renamed from: J */
    private static C16408ba<Integer> f45909J = C16408ba.m53465a("analytics.max_stored_hits_per_app", (int) AdError.SERVER_ERROR_CODE, (int) AdError.SERVER_ERROR_CODE);

    /* renamed from: K */
    private static C16408ba<Long> f45910K = C16408ba.m53466a("analytics.min_local_dispatch_millis", 120000, 120000);

    /* renamed from: L */
    private static C16408ba<Long> f45911L = C16408ba.m53466a("analytics.max_local_dispatch_millis", 7200000, 7200000);

    /* renamed from: M */
    private static C16408ba<Integer> f45912M = C16408ba.m53465a("analytics.max_hits_per_request.k", 20, 20);

    /* renamed from: N */
    private static C16408ba<Long> f45913N = C16408ba.m53466a("analytics.service_monitor_interval", 86400000, 86400000);

    /* renamed from: O */
    private static C16408ba<String> f45914O;

    /* renamed from: P */
    private static C16408ba<Integer> f45915P = C16408ba.m53465a("analytics.first_party_experiment_variant", 0, 0);

    /* renamed from: Q */
    private static C16408ba<Long> f45916Q = C16408ba.m53466a("analytics.service_client.second_connect_delay_millis", (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION, (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);

    /* renamed from: R */
    private static C16408ba<Long> f45917R = C16408ba.m53466a("analytics.service_client.unexpected_reconnect_millis", 60000, 60000);

    /* renamed from: a */
    public static C16408ba<Boolean> f45918a = C16408ba.m53468a("analytics.service_client_enabled", true, true);

    /* renamed from: b */
    public static C16408ba<String> f45919b = C16408ba.m53467a("analytics.log_tag", "GAv4", "GAv4-SVC");

    /* renamed from: c */
    public static C16408ba<Integer> f45920c = C16408ba.m53465a("analytics.max_stored_hits", (int) AdError.SERVER_ERROR_CODE, 20000);

    /* renamed from: d */
    public static C16408ba<Integer> f45921d = C16408ba.m53465a("analytics.max_stored_properties_per_app", 100, 100);

    /* renamed from: e */
    public static C16408ba<Long> f45922e = C16408ba.m53466a("analytics.local_dispatch_millis", 1800000, 120000);

    /* renamed from: f */
    public static C16408ba<Long> f45923f = C16408ba.m53466a("analytics.initial_local_dispatch_millis", (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION, (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);

    /* renamed from: g */
    public static C16408ba<Long> f45924g = C16408ba.m53466a("analytics.dispatch_alarm_millis", 7200000, 7200000);

    /* renamed from: h */
    public static C16408ba<Long> f45925h = C16408ba.m53466a("analytics.max_dispatch_alarm_millis", 32400000, 32400000);

    /* renamed from: i */
    public static C16408ba<Integer> f45926i = C16408ba.m53465a("analytics.max_hits_per_dispatch", 20, 20);

    /* renamed from: j */
    public static C16408ba<Integer> f45927j = C16408ba.m53465a("analytics.max_hits_per_batch", 20, 20);

    /* renamed from: k */
    public static C16408ba<String> f45928k;

    /* renamed from: l */
    public static C16408ba<String> f45929l;

    /* renamed from: m */
    public static C16408ba<String> f45930m;

    /* renamed from: n */
    public static C16408ba<String> f45931n;

    /* renamed from: o */
    public static C16408ba<Integer> f45932o = C16408ba.m53465a("analytics.max_get_length", 2036, 2036);

    /* renamed from: p */
    public static C16408ba<String> f45933p = C16408ba.m53467a("analytics.batching_strategy.k", zzbn.BATCH_BY_COUNT.name(), zzbn.BATCH_BY_COUNT.name());

    /* renamed from: q */
    public static C16408ba<String> f45934q;

    /* renamed from: r */
    public static C16408ba<Integer> f45935r = C16408ba.m53465a("analytics.max_hit_length.k", (int) VideoCacheReadBuffersizeExperiment.DEFAULT, (int) VideoCacheReadBuffersizeExperiment.DEFAULT);

    /* renamed from: s */
    public static C16408ba<Integer> f45936s = C16408ba.m53465a("analytics.max_post_length.k", (int) VideoCacheReadBuffersizeExperiment.DEFAULT, (int) VideoCacheReadBuffersizeExperiment.DEFAULT);

    /* renamed from: t */
    public static C16408ba<Integer> f45937t = C16408ba.m53465a("analytics.max_batch_post_length", (int) VideoCacheReadBuffersizeExperiment.DEFAULT, (int) VideoCacheReadBuffersizeExperiment.DEFAULT);

    /* renamed from: u */
    public static C16408ba<String> f45938u;

    /* renamed from: v */
    public static C16408ba<Integer> f45939v = C16408ba.m53465a("analytics.batch_retry_interval.seconds.k", 3600, 3600);

    /* renamed from: w */
    public static C16408ba<Integer> f45940w = C16408ba.m53465a("analytics.http_connection.connect_timeout_millis", 60000, 60000);

    /* renamed from: x */
    public static C16408ba<Integer> f45941x = C16408ba.m53465a("analytics.http_connection.read_timeout_millis", 61000, 61000);

    /* renamed from: y */
    public static C16408ba<Long> f45942y = C16408ba.m53466a("analytics.campaigns.time_limit", 86400000, 86400000);

    /* renamed from: z */
    public static C16408ba<Boolean> f45943z = C16408ba.m53468a("analytics.test.disable_receiver", false, false);

    static {
        String str = "http://www.google-analytics.com";
        f45928k = C16408ba.m53467a("analytics.insecure_host", str, str);
        String str2 = "https://ssl.google-analytics.com";
        f45929l = C16408ba.m53467a("analytics.secure_host", str2, str2);
        String str3 = "/collect";
        f45930m = C16408ba.m53467a("analytics.simple_endpoint", str3, str3);
        String str4 = "/batch";
        f45931n = C16408ba.m53467a("analytics.batching_endpoint", str4, str4);
        String name = zzbt.GZIP.name();
        f45934q = C16408ba.m53467a("analytics.compression_strategy.k", name, name);
        String str5 = "404,502";
        f45938u = C16408ba.m53467a("analytics.fallback_responses.k", str5, str5);
        String str6 = "";
        f45914O = C16408ba.m53467a("analytics.first_party_experiment_id", str6, str6);
    }
}
