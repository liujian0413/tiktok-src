package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.google.android.gms.common.C15167c;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.internal.measurement.C16514ew;
import com.google.android.gms.internal.measurement.C16525fg;
import com.google.android.gms.internal.measurement.C16526fh;
import com.google.android.gms.internal.measurement.C16532fn;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.h */
public final class C16942h {

    /* renamed from: A */
    public static C16943a<Long> f47380A = C16943a.m56214a("measurement.upload.window_interval", 3600000, 3600000);

    /* renamed from: B */
    public static C16943a<Long> f47381B = C16943a.m56214a("measurement.upload.interval", 3600000, 3600000);

    /* renamed from: C */
    public static C16943a<Long> f47382C = C16943a.m56214a("measurement.upload.realtime_upload_interval", 10000, 10000);

    /* renamed from: D */
    public static C16943a<Long> f47383D = C16943a.m56214a("measurement.upload.debug_upload_interval", 1000, 1000);

    /* renamed from: E */
    public static C16943a<Long> f47384E = C16943a.m56214a("measurement.upload.minimum_delay", 500, 500);

    /* renamed from: F */
    public static C16943a<Long> f47385F = C16943a.m56214a("measurement.alarm_manager.minimum_interval", 60000, 60000);

    /* renamed from: G */
    public static C16943a<Long> f47386G = C16943a.m56214a("measurement.upload.stale_data_deletion_interval", 86400000, 86400000);

    /* renamed from: H */
    public static C16943a<Long> f47387H = C16943a.m56214a("measurement.upload.refresh_blacklisted_config_interval", 604800000, 604800000);

    /* renamed from: I */
    public static C16943a<Long> f47388I = C16943a.m56214a("measurement.upload.initial_upload_delay_time", (long) C40413c.f105051b, (long) C40413c.f105051b);

    /* renamed from: J */
    public static C16943a<Long> f47389J = C16943a.m56214a("measurement.upload.retry_time", 1800000, 1800000);

    /* renamed from: K */
    public static C16943a<Integer> f47390K = C16943a.m56213a("measurement.upload.retry_count", 6, 6);

    /* renamed from: L */
    public static C16943a<Long> f47391L = C16943a.m56214a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);

    /* renamed from: M */
    public static C16943a<Integer> f47392M = C16943a.m56213a("measurement.lifetimevalue.max_currency_tracked", 4, 4);

    /* renamed from: N */
    public static C16943a<Integer> f47393N = C16943a.m56213a("measurement.audience.filter_result_max_count", (int) C34943c.f91127w, (int) C34943c.f91127w);

    /* renamed from: O */
    public static C16943a<Long> f47394O = C16943a.m56214a("measurement.service_client.idle_disconnect_millis", (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION, (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);

    /* renamed from: P */
    public static C16943a<Boolean> f47395P = C16943a.m56216a("measurement.test.boolean_flag", false, false);

    /* renamed from: Q */
    public static C16943a<String> f47396Q;

    /* renamed from: R */
    public static C16943a<Long> f47397R = C16943a.m56214a("measurement.test.long_flag", -1, -1);

    /* renamed from: S */
    public static C16943a<Integer> f47398S = C16943a.m56213a("measurement.test.int_flag", -2, -2);

    /* renamed from: T */
    public static C16943a<Double> f47399T = C16943a.m56212a("measurement.test.double_flag", -3.0d, -3.0d);

    /* renamed from: U */
    public static C16943a<Integer> f47400U = C16943a.m56213a("measurement.experiment.max_ids", 50, 50);

    /* renamed from: V */
    public static C16943a<Boolean> f47401V = C16943a.m56216a("measurement.lifetimevalue.user_engagement_tracking_enabled", true, true);

    /* renamed from: W */
    public static C16943a<Boolean> f47402W = C16943a.m56216a("measurement.audience.complex_param_evaluation", true, true);

    /* renamed from: X */
    public static C16943a<Boolean> f47403X = C16943a.m56216a("measurement.validation.internal_limits_internal_event_params", false, false);

    /* renamed from: Y */
    public static C16943a<Boolean> f47404Y = C16943a.m56216a("measurement.quality.unsuccessful_update_retry_counter", true, true);

    /* renamed from: Z */
    public static C16943a<Boolean> f47405Z = C16943a.m56216a("measurement.iid.disable_on_collection_disabled", true, true);

    /* renamed from: a */
    static C16928es f47406a;

    /* renamed from: aA */
    private static C16943a<Boolean> f47407aA = C16943a.m56216a("measurement.log_upgrades_enabled", false, false);

    /* renamed from: aa */
    public static C16943a<Boolean> f47408aa = C16943a.m56216a("measurement.app_launch.call_only_when_enabled", true, true);

    /* renamed from: ab */
    public static C16943a<Boolean> f47409ab = C16943a.m56216a("measurement.run_on_worker_inline", true, false);

    /* renamed from: ac */
    public static C16943a<Boolean> f47410ac = C16943a.m56216a("measurement.audience.dynamic_filters", true, true);

    /* renamed from: ad */
    public static C16943a<Boolean> f47411ad = C16943a.m56216a("measurement.reset_analytics.persist_time", false, false);

    /* renamed from: ae */
    public static C16943a<Boolean> f47412ae = C16943a.m56216a("measurement.validation.value_and_currency_params", false, false);

    /* renamed from: af */
    public static C16943a<Boolean> f47413af = C16943a.m56216a("measurement.sampling.time_zone_offset_enabled", false, false);

    /* renamed from: ag */
    public static C16943a<Boolean> f47414ag = C16943a.m56216a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", false, false);

    /* renamed from: ah */
    public static C16943a<Boolean> f47415ah = C16943a.m56216a("measurement.fetch_config_with_admob_app_id", true, true);

    /* renamed from: ai */
    public static C16943a<Boolean> f47416ai = C16943a.m56216a("measurement.sessions.session_id_enabled", false, false);

    /* renamed from: aj */
    public static C16943a<Boolean> f47417aj = C16943a.m56216a("measurement.sessions.session_number_enabled", false, false);

    /* renamed from: ak */
    public static C16943a<Boolean> f47418ak = C16943a.m56216a("measurement.sessions.immediate_start_enabled", false, false);

    /* renamed from: al */
    public static C16943a<Boolean> f47419al = C16943a.m56216a("measurement.sessions.background_sessions_enabled", false, false);

    /* renamed from: am */
    public static C16943a<Boolean> f47420am = C16943a.m56216a("measurement.collection.firebase_global_collection_flag_enabled", true, true);

    /* renamed from: an */
    public static C16943a<Boolean> f47421an = C16943a.m56216a("measurement.collection.efficient_engagement_reporting_enabled", false, false);

    /* renamed from: ao */
    public static C16943a<Boolean> f47422ao = C16943a.m56216a("measurement.collection.redundant_engagement_removal_enabled", false, false);

    /* renamed from: ap */
    public static C16943a<Boolean> f47423ap = C16943a.m56216a("measurement.remove_app_instance_id_cache_enabled", true, true);

    /* renamed from: aq */
    public static C16943a<Boolean> f47424aq = C16943a.m56216a("measurement.collection.init_params_control_enabled", true, true);

    /* renamed from: ar */
    public static C16943a<Boolean> f47425ar = C16943a.m56216a("measurement.upload.disable_is_uploader", false, false);

    /* renamed from: as */
    public static C16943a<Boolean> f47426as = C16943a.m56216a("measurement.experiment.enable_experiment_reporting", false, false);

    /* renamed from: at */
    public static C16943a<Boolean> f47427at = C16943a.m56216a("measurement.collection.log_event_and_bundle_v2", true, true);

    /* renamed from: au */
    public static C16943a<Boolean> f47428au = C16943a.m56216a("measurement.collection.null_empty_event_name_fix", true, true);
    /* access modifiers changed from: private */

    /* renamed from: av */
    public static final C16532fn f47429av = new C16532fn(C16525fg.m53847a("com.google.android.gms.measurement"));

    /* renamed from: aw */
    private static volatile C16825ay f47430aw;

    /* renamed from: ax */
    private static Boolean f47431ax;

    /* renamed from: ay */
    private static C16943a<Boolean> f47432ay = C16943a.m56216a("measurement.log_third_party_store_events_enabled", false, false);

    /* renamed from: az */
    private static C16943a<Boolean> f47433az = C16943a.m56216a("measurement.log_installs_enabled", false, false);

    /* renamed from: b */
    static List<C16943a<Integer>> f47434b = new ArrayList();

    /* renamed from: c */
    static List<C16943a<Long>> f47435c = new ArrayList();

    /* renamed from: d */
    static List<C16943a<Boolean>> f47436d = new ArrayList();

    /* renamed from: e */
    static List<C16943a<String>> f47437e = new ArrayList();

    /* renamed from: f */
    static List<C16943a<Double>> f47438f = new ArrayList();

    /* renamed from: g */
    public static C16943a<Boolean> f47439g = C16943a.m56216a("measurement.log_androidId_enabled", false, false);

    /* renamed from: h */
    public static C16943a<Boolean> f47440h = C16943a.m56216a("measurement.upload_dsid_enabled", false, false);

    /* renamed from: i */
    public static C16943a<String> f47441i = C16943a.m56215a("measurement.log_tag", "FA", "FA-SVC");

    /* renamed from: j */
    public static C16943a<Long> f47442j = C16943a.m56214a("measurement.ad_id_cache_time", 10000, 10000);

    /* renamed from: k */
    public static C16943a<Long> f47443k = C16943a.m56214a("measurement.monitoring.sample_period_millis", 86400000, 86400000);

    /* renamed from: l */
    public static C16943a<Long> f47444l = C16943a.m56214a("measurement.config.cache_time", 86400000, 3600000);

    /* renamed from: m */
    public static C16943a<String> f47445m;

    /* renamed from: n */
    public static C16943a<String> f47446n;

    /* renamed from: o */
    public static C16943a<Integer> f47447o = C16943a.m56213a("measurement.upload.max_bundles", 100, 100);

    /* renamed from: p */
    public static C16943a<Integer> f47448p = C16943a.m56213a("measurement.upload.max_batch_size", 65536, 65536);

    /* renamed from: q */
    public static C16943a<Integer> f47449q = C16943a.m56213a("measurement.upload.max_bundle_size", 65536, 65536);

    /* renamed from: r */
    public static C16943a<Integer> f47450r = C16943a.m56213a("measurement.upload.max_events_per_bundle", 1000, 1000);

    /* renamed from: s */
    public static C16943a<Integer> f47451s = C16943a.m56213a("measurement.upload.max_events_per_day", 100000, 100000);

    /* renamed from: t */
    public static C16943a<Integer> f47452t = C16943a.m56213a("measurement.upload.max_error_events_per_day", 1000, 1000);

    /* renamed from: u */
    public static C16943a<Integer> f47453u = C16943a.m56213a("measurement.upload.max_public_events_per_day", 50000, 50000);

    /* renamed from: v */
    public static C16943a<Integer> f47454v = C16943a.m56213a("measurement.upload.max_conversions_per_day", (int) VETransitionFilterParam.TransitionDuration_DEFAULT, (int) VETransitionFilterParam.TransitionDuration_DEFAULT);

    /* renamed from: w */
    public static C16943a<Integer> f47455w = C16943a.m56213a("measurement.upload.max_realtime_events_per_day", 10, 10);

    /* renamed from: x */
    public static C16943a<Integer> f47456x = C16943a.m56213a("measurement.store.max_stored_events_per_app", 100000, 100000);

    /* renamed from: y */
    public static C16943a<String> f47457y;

    /* renamed from: z */
    public static C16943a<Long> f47458z = C16943a.m56214a("measurement.upload.backoff_period", 43200000, 43200000);

    /* renamed from: com.google.android.gms.measurement.internal.h$a */
    public static final class C16943a<V> {

        /* renamed from: a */
        public final String f47459a;

        /* renamed from: b */
        private C16526fh<V> f47460b;

        /* renamed from: c */
        private final V f47461c;

        /* renamed from: d */
        private final V f47462d;

        /* renamed from: e */
        private volatile V f47463e;

        private C16943a(String str, V v, V v2) {
            this.f47459a = str;
            this.f47462d = v;
            this.f47461c = v2;
        }

        /* renamed from: a */
        static C16943a<Boolean> m56216a(String str, boolean z, boolean z2) {
            C16943a<Boolean> aVar = new C16943a<>(str, Boolean.valueOf(z), Boolean.valueOf(z2));
            C16942h.f47436d.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C16943a<String> m56215a(String str, String str2, String str3) {
            C16943a<String> aVar = new C16943a<>(str, str2, str3);
            C16942h.f47437e.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C16943a<Long> m56214a(String str, long j, long j2) {
            C16943a<Long> aVar = new C16943a<>(str, Long.valueOf(j), Long.valueOf(j2));
            C16942h.f47435c.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C16943a<Integer> m56213a(String str, int i, int i2) {
            C16943a<Integer> aVar = new C16943a<>(str, Integer.valueOf(i), Integer.valueOf(i2));
            C16942h.f47434b.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C16943a<Double> m56212a(String str, double d, double d2) {
            C16943a<Double> aVar = new C16943a<>(str, Double.valueOf(-3.0d), Double.valueOf(-3.0d));
            C16942h.f47438f.add(aVar);
            return aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static void m56218c() {
            synchronized (C16943a.class) {
                for (C16943a aVar : C16942h.f47436d) {
                    aVar.f47460b = C16942h.f47429av.mo42722a(aVar.f47459a, ((Boolean) aVar.f47462d).booleanValue());
                }
                for (C16943a aVar2 : C16942h.f47437e) {
                    aVar2.f47460b = C16942h.f47429av.mo42721a(aVar2.f47459a, (String) aVar2.f47462d);
                }
                for (C16943a aVar3 : C16942h.f47435c) {
                    aVar3.f47460b = C16942h.f47429av.mo42720a(aVar3.f47459a, ((Long) aVar3.f47462d).longValue());
                }
                for (C16943a aVar4 : C16942h.f47434b) {
                    aVar4.f47460b = C16942h.f47429av.mo42719a(aVar4.f47459a, ((Integer) aVar4.f47462d).intValue());
                }
                for (C16943a aVar5 : C16942h.f47438f) {
                    aVar5.f47460b = C16942h.f47429av.mo42718a(aVar5.f47459a, ((Double) aVar5.f47462d).doubleValue());
                }
            }
        }

        /* renamed from: d */
        private static void m56219d() {
            synchronized (C16943a.class) {
                if (!C16928es.m56086a()) {
                    try {
                        for (C16943a aVar : C16942h.f47436d) {
                            aVar.f47463e = aVar.f47460b.mo42717b();
                        }
                        for (C16943a aVar2 : C16942h.f47437e) {
                            aVar2.f47463e = aVar2.f47460b.mo42717b();
                        }
                        for (C16943a aVar3 : C16942h.f47435c) {
                            aVar3.f47463e = aVar3.f47460b.mo42717b();
                        }
                        for (C16943a aVar4 : C16942h.f47434b) {
                            aVar4.f47463e = aVar4.f47460b.mo42717b();
                        }
                        for (C16943a aVar5 : C16942h.f47438f) {
                            aVar5.f47463e = aVar5.f47460b.mo42717b();
                        }
                    } catch (SecurityException e) {
                        C16942h.m56211a((Exception) e);
                    }
                } else {
                    throw new IllegalStateException("Tried to refresh flag cache on main thread or on package side.");
                }
            }
        }

        /* renamed from: a */
        public final V mo44132a() {
            if (C16942h.f47406a == null) {
                return this.f47462d;
            }
            if (C16928es.m56086a()) {
                return this.f47463e == null ? this.f47462d : this.f47463e;
            }
            m56219d();
            try {
                return this.f47460b.mo42717b();
            } catch (SecurityException e) {
                C16942h.m56211a((Exception) e);
                return this.f47460b.f46308a;
            }
        }

        /* renamed from: a */
        public final V mo44133a(V v) {
            if (v != null) {
                return v;
            }
            if (C16942h.f47406a == null) {
                return this.f47462d;
            }
            if (C16928es.m56086a()) {
                return this.f47463e == null ? this.f47462d : this.f47463e;
            }
            m56219d();
            try {
                return this.f47460b.mo42717b();
            } catch (SecurityException e) {
                C16942h.m56211a((Exception) e);
                return this.f47460b.f46308a;
            }
        }
    }

    /* renamed from: a */
    public static Map<String, String> m56208a(Context context) {
        return C16514ew.m53825a(context.getContentResolver(), C16525fg.m53847a("com.google.android.gms.measurement")).mo42708a();
    }

    /* renamed from: a */
    static void m56209a(C16825ay ayVar) {
        f47430aw = ayVar;
    }

    /* renamed from: a */
    static void m56211a(Exception exc) {
        if (f47430aw != null) {
            Context m = f47430aw.mo43581m();
            if (f47431ax == null) {
                f47431ax = Boolean.valueOf(C15167c.getInstance().isGooglePlayServicesAvailable(m, C15181e.f39276b) == 0);
            }
            if (f47431ax.booleanValue()) {
                f47430aw.mo43585q().f47487a.mo44161a("Got Exception on PhenotypeFlag.get on Play device", exc);
            }
        }
    }

    /* renamed from: a */
    static void m56210a(C16928es esVar) {
        f47406a = esVar;
        C16943a.m56218c();
    }

    static {
        String str = WebKitApi.SCHEME_HTTPS;
        f47445m = C16943a.m56215a("measurement.config.url_scheme", str, str);
        String str2 = "app-measurement.com";
        f47446n = C16943a.m56215a("measurement.config.url_authority", str2, str2);
        String str3 = "https://app-measurement.com/a";
        f47457y = C16943a.m56215a("measurement.upload.url", str3, str3);
        String str4 = "---";
        f47396Q = C16943a.m56215a("measurement.test.string_flag", str4, str4);
    }
}
