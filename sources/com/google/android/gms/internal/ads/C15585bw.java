package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.bw */
public final class C15585bw {

    /* renamed from: A */
    public static final C15573bl<Long> f43727A = C15573bl.m49159a(1, "gads:video:surface_update_min_spacing_ms", 1000);

    /* renamed from: B */
    public static final C15573bl<Boolean> f43728B = C15573bl.m49160a(1, "gads:video:spinner:enabled", Boolean.valueOf(false));

    /* renamed from: C */
    public static final C15573bl<Integer> f43729C = C15573bl.m49158a(1, "gads:video:spinner:scale", 4);

    /* renamed from: D */
    public static final C15573bl<Long> f43730D = C15573bl.m49159a(1, "gads:video:spinner:jank_threshold_ms", 50);

    /* renamed from: E */
    public static final C15573bl<Boolean> f43731E = C15573bl.m49160a(1, "gads:video:aggressive_media_codec_release", Boolean.valueOf(false));

    /* renamed from: F */
    public static final C15573bl<Boolean> f43732F = C15573bl.m49160a(1, "gads:memory_bundle:debug_info", Boolean.valueOf(false));

    /* renamed from: G */
    public static final C15573bl<String> f43733G = C15573bl.m49161a(1, "gads:video:codec_query_mime_types", "");

    /* renamed from: H */
    public static final C15573bl<Integer> f43734H = C15573bl.m49158a(1, "gads:video:codec_query_minimum_version", 16);

    /* renamed from: I */
    public static final C15573bl<String> f43735I = C15573bl.m49161a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");

    /* renamed from: J */
    public static final C15573bl<String> f43736J = C15573bl.m49161a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");

    /* renamed from: K */
    public static final C15573bl<String> f43737K = C15573bl.m49161a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");

    /* renamed from: L */
    public static final C15573bl<String> f43738L = C15573bl.m49161a(1, "gad:mraid:version", "2.0");

    /* renamed from: M */
    public static final C15573bl<Boolean> f43739M = C15573bl.m49160a(1, "gads:mraid:unload", Boolean.valueOf(false));

    /* renamed from: N */
    public static final C15573bl<Boolean> f43740N = C15573bl.m49160a(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));

    /* renamed from: O */
    public static final C15573bl<String> f43741O = C15573bl.m49161a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");

    /* renamed from: P */
    public static final C15573bl<Boolean> f43742P = C15573bl.m49160a(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));

    /* renamed from: Q */
    public static final C15573bl<Boolean> f43743Q = C15573bl.m49160a(0, "gads:enable_content_fetching", Boolean.valueOf(true));

    /* renamed from: R */
    public static final C15573bl<Integer> f43744R = C15573bl.m49158a(0, "gads:content_length_weight", 1);

    /* renamed from: S */
    public static final C15573bl<Integer> f43745S = C15573bl.m49158a(0, "gads:content_age_weight", 1);

    /* renamed from: T */
    public static final C15573bl<Integer> f43746T = C15573bl.m49158a(0, "gads:min_content_len", 11);

    /* renamed from: U */
    public static final C15573bl<Integer> f43747U = C15573bl.m49158a(0, "gads:fingerprint_number", 10);

    /* renamed from: V */
    public static final C15573bl<Integer> f43748V = C15573bl.m49158a(0, "gads:sleep_sec", 10);

    /* renamed from: W */
    public static final C15573bl<Integer> f43749W = C15573bl.m49158a(1, "gads:content_vertical_fingerprint_number", 100);

    /* renamed from: X */
    public static final C15573bl<Integer> f43750X = C15573bl.m49158a(1, "gads:content_vertical_fingerprint_bits", 23);

    /* renamed from: Y */
    public static final C15573bl<Integer> f43751Y = C15573bl.m49158a(1, "gads:content_vertical_fingerprint_ngram", 3);

    /* renamed from: Z */
    public static final C15573bl<String> f43752Z = C15573bl.m49161a(1, "gads:content_fetch_view_tag_id", "googlebot");

    /* renamed from: a */
    public static final C15573bl<String> f43753a = C15573bl.m49161a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html");

    /* renamed from: aA */
    public static final C15573bl<Boolean> f43754aA = C15573bl.m49160a(1, "gads:rewarded:ad_metadata_enabled", Boolean.valueOf(false));

    /* renamed from: aB */
    public static final C15573bl<Boolean> f43755aB = C15573bl.m49160a(1, "gads:rewarded:ssv_custom_data_enabled", Boolean.valueOf(true));

    /* renamed from: aC */
    public static final C15573bl<Long> f43756aC = C15573bl.m49159a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);

    /* renamed from: aD */
    public static final C15573bl<Long> f43757aD = C15573bl.m49159a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: aE */
    public static final C15573bl<Boolean> f43758aE = C15573bl.m49160a(1, "gads:adid_values_in_adrequest:enabled", Boolean.valueOf(false));

    /* renamed from: aF */
    public static final C15573bl<Long> f43759aF = C15573bl.m49159a(1, "gads:adid_values_in_adrequest:timeout", 2000);

    /* renamed from: aG */
    public static final C15573bl<Boolean> f43760aG = C15573bl.m49160a(1, "gads:disable_adid_values_in_ms", Boolean.valueOf(false));

    /* renamed from: aH */
    public static final C15573bl<Long> f43761aH = C15573bl.m49159a(1, "gads:ad_overlay:delay_page_close_timeout_ms", (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);

    /* renamed from: aI */
    public static final C15573bl<Boolean> f43762aI = C15573bl.m49160a(1, "gads:custom_close_blocking:enabled", Boolean.valueOf(false));

    /* renamed from: aJ */
    public static final C15573bl<Boolean> f43763aJ = C15573bl.m49160a(1, "gads:disabling_closable_area:enabled", Boolean.valueOf(false));

    /* renamed from: aK */
    public static final C15573bl<Boolean> f43764aK = C15573bl.m49160a(1, "gads:use_system_ui_for_fullscreen:enabled", Boolean.valueOf(false));

    /* renamed from: aL */
    public static final C15573bl<Boolean> f43765aL = C15573bl.m49160a(1, "gads:ad_overlay:collect_cutout_info:enabled", Boolean.valueOf(false));

    /* renamed from: aM */
    public static final C15573bl<Boolean> f43766aM = C15573bl.m49160a(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));

    /* renamed from: aN */
    public static final C15573bl<Boolean> f43767aN = C15573bl.m49160a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", Boolean.valueOf(false));

    /* renamed from: aO */
    public static final C15573bl<String> f43768aO = C15573bl.m49161a(1, "gads:interstitial_ad_pool:schema", "customTargeting");

    /* renamed from: aP */
    public static final C15573bl<String> f43769aP = C15573bl.m49161a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");

    /* renamed from: aQ */
    public static final C15573bl<Integer> f43770aQ = C15573bl.m49158a(1, "gads:interstitial_ad_pool:max_pools", 3);

    /* renamed from: aR */
    public static final C15573bl<Integer> f43771aR = C15573bl.m49158a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);

    /* renamed from: aS */
    public static final C15573bl<Integer> f43772aS = C15573bl.m49158a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);

    /* renamed from: aT */
    public static final C15573bl<String> f43773aT = C15573bl.m49161a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");

    /* renamed from: aU */
    public static final C15573bl<Integer> f43774aU = C15573bl.m49158a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);

    /* renamed from: aV */
    public static final C15573bl<Integer> f43775aV = C15573bl.m49158a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);

    /* renamed from: aW */
    public static final C15573bl<Long> f43776aW = C15573bl.m49159a(1, "gads:interstitial_ad_pool:discard_thresholds", 0);

    /* renamed from: aX */
    public static final C15573bl<Long> f43777aX = C15573bl.m49159a(1, "gads:interstitial_ad_pool:miss_thresholds", 0);

    /* renamed from: aY */
    public static final C15573bl<Float> f43778aY = C15573bl.m49157a(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);

    /* renamed from: aZ */
    public static final C15573bl<Float> f43779aZ = C15573bl.m49157a(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);

    /* renamed from: aa */
    public static final C15573bl<String> f43780aa = C15573bl.m49161a(1, "gads:content_fetch_exclude_view_tag", "none");

    /* renamed from: ab */
    public static final C15573bl<Boolean> f43781ab = C15573bl.m49160a(1, "gads:content_fetch_disable_get_title_from_webview", Boolean.valueOf(false));

    /* renamed from: ac */
    public static final C15573bl<Boolean> f43782ac = C15573bl.m49160a(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));

    /* renamed from: ad */
    public static final C15573bl<Long> f43783ad = C15573bl.m49159a(0, "gads:app_index:timeout_ms", 1000);

    /* renamed from: ae */
    public static final C15573bl<Boolean> f43784ae = C15573bl.m49160a(0, "gads:ad_key_enabled", Boolean.valueOf(false));

    /* renamed from: af */
    public static final C15573bl<Boolean> f43785af = C15573bl.m49160a(1, "gads:sai:enabled", Boolean.valueOf(true));

    /* renamed from: ag */
    public static final C15573bl<String> f43786ag = C15573bl.m49161a(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");

    /* renamed from: ah */
    public static final C15573bl<String> f43787ah = C15573bl.m49161a(1, "gads:sai:impression_ping_schema_v2", "^[^?]*/adview.*");

    /* renamed from: ai */
    public static final C15573bl<Boolean> f43788ai = C15573bl.m49160a(1, "gads:sai:using_macro:enabled", Boolean.valueOf(false));

    /* renamed from: aj */
    public static final C15573bl<String> f43789aj = C15573bl.m49161a(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");

    /* renamed from: ak */
    public static final C15573bl<Long> f43790ak = C15573bl.m49159a(1, "gads:sai:timeout_ms", -1);

    /* renamed from: al */
    public static final C15573bl<Integer> f43791al = C15573bl.m49158a(1, "gads:sai:scion_thread_pool_size", 5);

    /* renamed from: am */
    public static final C15573bl<Boolean> f43792am = C15573bl.m49160a(1, "gads:sai:app_measurement_enabled", Boolean.valueOf(false));

    /* renamed from: an */
    public static final C15573bl<Boolean> f43793an = C15573bl.m49160a(2, "app_measurement_enabled", Boolean.valueOf(false));

    /* renamed from: ao */
    public static final C15573bl<Boolean> f43794ao = C15573bl.m49160a(1, "gads:sai:force_through_reflection", Boolean.valueOf(true));

    /* renamed from: ap */
    public static final C15573bl<Boolean> f43795ap = C15573bl.m49160a(1, "gads:sai:gmscore_availability_check_disabled", Boolean.valueOf(false));

    /* renamed from: aq */
    public static final C15573bl<Boolean> f43796aq = C15573bl.m49160a(1, "gads:sai:logging_disabled_for_drx", Boolean.valueOf(false));

    /* renamed from: ar */
    public static final C15573bl<Boolean> f43797ar = C15573bl.m49160a(1, "gads:interstitial:app_must_be_foreground:enabled", Boolean.valueOf(false));

    /* renamed from: as */
    public static final C15573bl<Boolean> f43798as = C15573bl.m49160a(1, "gads:interstitial:foreground_report:enabled", Boolean.valueOf(false));

    /* renamed from: at */
    public static final C15573bl<Boolean> f43799at = C15573bl.m49160a(0, "gads:corewebview:adwebview_factory:enable", Boolean.valueOf(false));

    /* renamed from: au */
    public static final C15573bl<Boolean> f43800au = C15573bl.m49160a(0, "gads:corewebview:javascript_engine", Boolean.valueOf(false));

    /* renamed from: av */
    public static final C15573bl<Boolean> f43801av = C15573bl.m49160a(1, "gad:webview:inject_scripts", Boolean.valueOf(false));

    /* renamed from: aw */
    public static final C15573bl<Boolean> f43802aw = C15573bl.m49160a(0, "gads:webview:permission:disabled", Boolean.valueOf(false));

    /* renamed from: ax */
    public static final C15573bl<Boolean> f43803ax = C15573bl.m49160a(1, "gads:webview:error_web_response:enabled", Boolean.valueOf(false));

    /* renamed from: ay */
    public static final C15573bl<Boolean> f43804ay = C15573bl.m49160a(1, "gads:rewarded:adapter_initialization_enabled", Boolean.valueOf(false));

    /* renamed from: az */
    public static final C15573bl<Long> f43805az = C15573bl.m49159a(1, "gads:rewarded:adapter_timeout_ms", 20000);

    /* renamed from: b */
    public static final C15573bl<String> f43806b = C15573bl.m49161a(1, "gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: bA */
    public static final C15573bl<String> f43807bA = C15573bl.m49161a(1, "gads:gestures:pk", "");

    /* renamed from: bB */
    public static final C15573bl<Boolean> f43808bB = C15573bl.m49160a(1, "gads:gestures:bs:enabled", Boolean.valueOf(true));

    /* renamed from: bC */
    public static final C15573bl<Boolean> f43809bC = C15573bl.m49160a(1, "gads:gestures:check_initialization_thread:enabled", Boolean.valueOf(false));

    /* renamed from: bD */
    public static final C15573bl<Boolean> f43810bD = C15573bl.m49160a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", Boolean.valueOf(true));

    /* renamed from: bE */
    public static final C15573bl<Boolean> f43811bE = C15573bl.m49160a(1, "gads:gestures:pds:enabled", Boolean.valueOf(false));

    /* renamed from: bF */
    public static final C15573bl<Boolean> f43812bF = C15573bl.m49160a(1, "gads:gestures:ns:enabled", Boolean.valueOf(false));

    /* renamed from: bG */
    public static final C15573bl<Boolean> f43813bG = C15573bl.m49160a(1, "gads:gestures:vdd:enabled", Boolean.valueOf(false));

    /* renamed from: bH */
    public static final C15573bl<String> f43814bH = C15573bl.m49161a(1, "gads:sdk_core_constants:caps", "");

    /* renamed from: bI */
    public static final C15573bl<Long> f43815bI = C15573bl.m49159a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));

    /* renamed from: bJ */
    public static final C15573bl<Boolean> f43816bJ = C15573bl.m49160a(0, "gads:js_flags:mf", Boolean.valueOf(false));

    /* renamed from: bK */
    public static final C15573bl<Boolean> f43817bK = C15573bl.m49160a(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));

    /* renamed from: bL */
    public static final C15573bl<String> f43818bL = C15573bl.m49161a(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");

    /* renamed from: bM */
    public static final C15573bl<String> f43819bM = C15573bl.m49161a(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: bN */
    public static final C15573bl<Integer> f43820bN = C15573bl.m49158a(1, "gads:native_video_load_timeout", 10);

    /* renamed from: bO */
    public static final C15573bl<Integer> f43821bO = C15573bl.m49158a(1, "gads:omid:native_webview_load_timeout", (int) AdError.SERVER_ERROR_CODE);

    /* renamed from: bP */
    public static final C15573bl<Boolean> f43822bP = C15573bl.m49160a(1, "gads:enable_native_media_aspect_ratio", Boolean.valueOf(true));

    /* renamed from: bQ */
    public static final C15573bl<String> f43823bQ = C15573bl.m49161a(1, "gads:ad_choices_content_description", "Ad Choices Icon");

    /* renamed from: bR */
    public static final C15573bl<Boolean> f43824bR = C15573bl.m49160a(1, "gads:enable_store_active_view_state", Boolean.valueOf(false));

    /* renamed from: bS */
    public static final C15573bl<Boolean> f43825bS = C15573bl.m49160a(1, "gads:enable_singleton_broadcast_receiver", Boolean.valueOf(false));

    /* renamed from: bT */
    public static final C15573bl<Boolean> f43826bT = C15573bl.m49160a(1, "gads:native:media_view_match_parent:enabled", Boolean.valueOf(false));

    /* renamed from: bU */
    public static final C15573bl<Boolean> f43827bU = C15573bl.m49160a(1, "gads:native:count_impression_for_assets", Boolean.valueOf(false));

    /* renamed from: bV */
    public static final C15573bl<Boolean> f43828bV = C15573bl.m49160a(1, "gads:instream_ad:enabled", Boolean.valueOf(true));

    /* renamed from: bW */
    public static final C15573bl<Boolean> f43829bW = C15573bl.m49160a(1, "gads:fluid_ad:use_wrap_content_height", Boolean.valueOf(false));

    /* renamed from: bX */
    public static final C15573bl<Long> f43830bX = C15573bl.m49159a(1, "gads:auto_location_timeout", 2000);

    /* renamed from: bY */
    public static final C15573bl<Boolean> f43831bY = C15573bl.m49160a(1, "gads:fetch_app_settings_using_cld:enabled", Boolean.valueOf(false));

    /* renamed from: bZ */
    public static final C15573bl<Long> f43832bZ = C15573bl.m49159a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);

    /* renamed from: ba */
    public static final C15573bl<Boolean> f43833ba = C15573bl.m49160a(0, "gads:debug_logging_feature:enable", Boolean.valueOf(false));

    /* renamed from: bb */
    public static final C15573bl<Boolean> f43834bb = C15573bl.m49160a(0, "gads:debug_logging_feature:intercept_web_view", Boolean.valueOf(false));

    /* renamed from: bc */
    public static final C15573bl<String> f43835bc = C15573bl.m49161a(1, "gads:spherical_video:vertex_shader", "");

    /* renamed from: bd */
    public static final C15573bl<String> f43836bd = C15573bl.m49161a(1, "gads:spherical_video:fragment_shader", "");

    /* renamed from: be */
    public static final C15573bl<Boolean> f43837be = C15573bl.m49160a(0, "gads:log:verbose_enabled", Boolean.valueOf(false));

    /* renamed from: bf */
    public static final C15573bl<Boolean> f43838bf = C15573bl.m49160a(1, "gads:include_local_global_rectangles", Boolean.valueOf(false));

    /* renamed from: bg */
    public static final C15573bl<Long> f43839bg = C15573bl.m49159a(1, "gads:position_watcher:throttle_ms", 200);

    /* renamed from: bh */
    public static final C15573bl<Long> f43840bh = C15573bl.m49159a(1, "gads:position_watcher:scroll_aware_throttle_ms", 33);

    /* renamed from: bi */
    public static final C15573bl<Boolean> f43841bi = C15573bl.m49160a(1, "gads:position_watcher:enable_scroll_aware_ads", Boolean.valueOf(false));

    /* renamed from: bj */
    public static final C15573bl<Boolean> f43842bj = C15573bl.m49160a(1, "gads:position_watcher:send_scroll_data", Boolean.valueOf(false));

    /* renamed from: bk */
    public static final C15573bl<Long> f43843bk = C15573bl.m49159a(0, "gads:device_info_caching_expiry_ms:expiry", 300000);

    /* renamed from: bl */
    public static final C15573bl<Boolean> f43844bl = C15573bl.m49160a(1, "gads:gen204_signals:enabled", Boolean.valueOf(false));

    /* renamed from: bm */
    public static final C15573bl<Boolean> f43845bm = C15573bl.m49160a(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));

    /* renamed from: bn */
    public static final C15573bl<Long> f43846bn = C15573bl.m49159a(0, "gads:resolve_future:default_timeout_ms", 30000);

    /* renamed from: bo */
    public static final C15573bl<Long> f43847bo = C15573bl.m49159a(0, "gads:ad_loader:timeout_ms", 60000);

    /* renamed from: bp */
    public static final C15573bl<Long> f43848bp = C15573bl.m49159a(0, "gads:rendering:timeout_ms", 60000);

    /* renamed from: bq */
    public static final C15573bl<Boolean> f43849bq = C15573bl.m49160a(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));

    /* renamed from: br */
    public static final C15573bl<Boolean> f43850br = C15573bl.m49160a(1, "gads:gestures:errorlogging:enabled", Boolean.valueOf(false));

    /* renamed from: bs */
    public static final C15573bl<Long> f43851bs = C15573bl.m49159a(1, "gads:gestures:task_timeout", 2000);

    /* renamed from: bt */
    public static final C15573bl<Boolean> f43852bt = C15573bl.m49160a(1, "gads:gestures:asig:enabled", Boolean.valueOf(false));

    /* renamed from: bu */
    public static final C15573bl<Boolean> f43853bu = C15573bl.m49160a(1, "gads:gestures:ans:enabled", Boolean.valueOf(false));

    /* renamed from: bv */
    public static final C15573bl<Boolean> f43854bv = C15573bl.m49160a(1, "gads:gestures:tos:enabled", Boolean.valueOf(false));

    /* renamed from: bw */
    public static final C15573bl<Boolean> f43855bw = C15573bl.m49160a(1, "gads:gestures:brt:enabled", Boolean.valueOf(true));

    /* renamed from: bx */
    public static final C15573bl<Boolean> f43856bx = C15573bl.m49160a(1, "gads:signal:app_permissions:disabled", Boolean.valueOf(false));

    /* renamed from: by */
    public static final C15573bl<Boolean> f43857by = C15573bl.m49160a(1, "gads:gestures:inthex:enabled", Boolean.valueOf(false));

    /* renamed from: bz */
    public static final C15573bl<Boolean> f43858bz = C15573bl.m49160a(1, "gads:gestures:hpk:enabled", Boolean.valueOf(true));

    /* renamed from: c */
    public static final C15573bl<String> f43859c = C15573bl.m49161a(1, "gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: cA */
    public static final C15573bl<Integer> f43860cA = C15573bl.m49158a(1, "gads:drx_debug:timeout_ms", 5000);

    /* renamed from: cB */
    public static final C15573bl<Integer> f43861cB = C15573bl.m49158a(1, "gad:pixel_dp_comparision_multiplier", 1);

    /* renamed from: cC */
    public static final C15573bl<Boolean> f43862cC = C15573bl.m49160a(1, "gad:interstitial_for_multi_window", Boolean.valueOf(false));

    /* renamed from: cD */
    public static final C15573bl<Boolean> f43863cD = C15573bl.m49160a(1, "gad:interstitial_ad_stay_active_in_multi_window", Boolean.valueOf(false));

    /* renamed from: cE */
    public static final C15573bl<Boolean> f43864cE = C15573bl.m49160a(1, "gad:interstitial_multi_window_method", Boolean.valueOf(false));

    /* renamed from: cF */
    public static final C15573bl<Integer> f43865cF = C15573bl.m49158a(1, "gad:interstitial:close_button_padding_dip", 0);

    /* renamed from: cG */
    public static final C15573bl<Boolean> f43866cG = C15573bl.m49160a(1, "gads:clearcut_logging:enabled", Boolean.valueOf(false));

    /* renamed from: cH */
    public static final C15573bl<Boolean> f43867cH = C15573bl.m49160a(1, "gads:clearcut_logging:write_to_file", Boolean.valueOf(false));

    /* renamed from: cI */
    public static final C15573bl<Boolean> f43868cI = C15573bl.m49160a(0, "gad:force_local_ad_request_service:enabled", Boolean.valueOf(false));

    /* renamed from: cJ */
    public static final C15573bl<Boolean> f43869cJ = C15573bl.m49160a(1, "gad:publisher_testing:force_local_request:enabled", Boolean.valueOf(true));

    /* renamed from: cK */
    public static final C15573bl<String> f43870cK = C15573bl.m49161a(1, "gad:publisher_testing:force_local_request:enabled_list", "");

    /* renamed from: cL */
    public static final C15573bl<String> f43871cL = C15573bl.m49161a(1, "gad:publisher_testing:force_local_request:disabled_list", "");

    /* renamed from: cM */
    public static final C15573bl<Boolean> f43872cM = C15573bl.m49160a(0, "gad:force_dynamite_loading_enabled", Boolean.valueOf(false));

    /* renamed from: cN */
    public static final C15573bl<Integer> f43873cN = C15573bl.m49158a(1, "gad:http_redirect_max_count:times", 8);

    /* renamed from: cO */
    public static final C15573bl<Boolean> f43874cO = C15573bl.m49160a(1, "gads:omid:enabled", Boolean.valueOf(false));

    /* renamed from: cP */
    public static final C15573bl<Integer> f43875cP = C15573bl.m49158a(1, "gads:omid:destroy_webview_delay", 1000);

    /* renamed from: cQ */
    public static final C15573bl<Boolean> f43876cQ = C15573bl.m49160a(1, "gads:nonagon:banner:check_dp_size", Boolean.valueOf(false));

    /* renamed from: cR */
    public static final C15573bl<Boolean> f43877cR = C15573bl.m49160a(1, "gads:nonagon:return_last_error_code", Boolean.valueOf(false));

    /* renamed from: cS */
    public static final C15573bl<Boolean> f43878cS = C15573bl.m49160a(1, "gads:nonagon:open_not_loaded_interstitial", Boolean.valueOf(true));

    /* renamed from: cT */
    public static final C15573bl<Boolean> f43879cT = C15573bl.m49160a(1, "gads:signals:doritos:v1:enabled", Boolean.valueOf(false));

    /* renamed from: cU */
    public static final C15573bl<Long> f43880cU = C15573bl.m49159a(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);

    /* renamed from: cV */
    public static final C15573bl<String> f43881cV = C15573bl.m49161a(0, "gads:public_beta:traffic_multiplier", "1.0");

    /* renamed from: cW */
    public static final C15573bl<Integer> f43882cW = C15573bl.m49158a(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);

    /* renamed from: cX */
    public static final C15573bl<Integer> f43883cX = C15573bl.m49158a(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 999);

    /* renamed from: cY */
    public static final C15573bl<Integer> f43884cY = C15573bl.m49158a(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 26);

    /* renamed from: cZ */
    public static final C15573bl<Integer> f43885cZ = C15573bl.m49158a(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 27);

    /* renamed from: ca */
    public static final C15573bl<String> f43886ca = C15573bl.m49161a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");

    /* renamed from: cb */
    public static final C15573bl<String> f43887cb = C15573bl.m49161a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");

    /* renamed from: cc */
    public static final C15573bl<String> f43888cc = C15573bl.m49161a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");

    /* renamed from: cd */
    public static final C15573bl<String> f43889cd = C15573bl.m49161a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");

    /* renamed from: ce */
    public static final C15573bl<String> f43890ce = C15573bl.m49161a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");

    /* renamed from: cf */
    public static final C15573bl<Long> f43891cf = C15573bl.m49159a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000);

    /* renamed from: cg */
    public static final C15573bl<Long> f43892cg = C15573bl.m49159a(1, "gads:parental_controls:timeout", 2000);

    /* renamed from: ch */
    public static final C15573bl<Boolean> f43893ch = C15573bl.m49160a(0, "gads:safe_browsing:debug", Boolean.valueOf(false));

    /* renamed from: ci */
    public static final C15573bl<Boolean> f43894ci = C15573bl.m49160a(1, "gads:cache:bind_on_foreground", Boolean.valueOf(false));

    /* renamed from: cj */
    public static final C15573bl<Boolean> f43895cj = C15573bl.m49160a(1, "gads:cache:bind_on_init", Boolean.valueOf(false));

    /* renamed from: ck */
    public static final C15573bl<Boolean> f43896ck = C15573bl.m49160a(1, "gads:cache:bind_on_request", Boolean.valueOf(false));

    /* renamed from: cl */
    public static final C15573bl<Long> f43897cl = C15573bl.m49159a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: cm */
    public static final C15573bl<Boolean> f43898cm = C15573bl.m49160a(1, "gads:cache:use_cache_data_source", Boolean.valueOf(false));

    /* renamed from: cn */
    public static final C15573bl<Boolean> f43899cn = C15573bl.m49160a(1, "gads:cache:connection_per_read", Boolean.valueOf(false));

    /* renamed from: co */
    public static final C15573bl<Long> f43900co = C15573bl.m49159a(1, "gads:cache:connection_timeout", (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);

    /* renamed from: cp */
    public static final C15573bl<Long> f43901cp = C15573bl.m49159a(1, "gads:cache:read_only_connection_timeout", (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);

    /* renamed from: cq */
    public static final C15573bl<Boolean> f43902cq = C15573bl.m49160a(1, "gads:http_assets_cache:enabled", Boolean.valueOf(false));

    /* renamed from: cr */
    public static final C15573bl<String> f43903cr = C15573bl.m49161a(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* renamed from: cs */
    public static final C15573bl<Integer> f43904cs = C15573bl.m49158a(1, "gads:http_assets_cache:time_out", 100);

    /* renamed from: ct */
    public static final C15573bl<Boolean> f43905ct = C15573bl.m49160a(1, "gads:chrome_custom_tabs_browser:enabled", Boolean.valueOf(false));

    /* renamed from: cu */
    public static final C15573bl<Boolean> f43906cu = C15573bl.m49160a(1, "gads:chrome_custom_tabs:disabled", Boolean.valueOf(false));

    /* renamed from: cv */
    public static final C15573bl<Long> f43907cv = C15573bl.m49159a(1, "gads:debug_hold_gesture:time_millis", 2000);

    /* renamed from: cw */
    public static final C15573bl<String> f43908cw = C15573bl.m49161a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* renamed from: cx */
    public static final C15573bl<String> f43909cx = C15573bl.m49161a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* renamed from: cy */
    public static final C15573bl<String> f43910cy = C15573bl.m49161a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* renamed from: cz */
    public static final C15573bl<String> f43911cz = C15573bl.m49161a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* renamed from: d */
    public static final C15573bl<Boolean> f43912d = C15573bl.m49160a(0, "gads:request_builder:refresh_if_destroyed:enable", Boolean.valueOf(true));

    /* renamed from: dA */
    private static final C15573bl<Boolean> f43913dA = C15573bl.m49160a(1, "gads:new_rewarded_ad:enabled", Boolean.valueOf(true));

    /* renamed from: dB */
    private static final C15573bl<Boolean> f43914dB = C15573bl.m49160a(0, "gads:ad_serving:enabled", Boolean.valueOf(true));

    /* renamed from: dC */
    private static final C15573bl<Boolean> f43915dC = C15573bl.m49160a(1, "gads:impression_optimization_enabled", Boolean.valueOf(false));

    /* renamed from: dD */
    private static final C15573bl<String> f43916dD = C15573bl.m49161a(1, "gads:banner_ad_pool:schema", "customTargeting");

    /* renamed from: dE */
    private static final C15573bl<Integer> f43917dE = C15573bl.m49158a(1, "gads:banner_ad_pool:max_queues", 3);

    /* renamed from: dF */
    private static final C15573bl<Integer> f43918dF = C15573bl.m49158a(1, "gads:banner_ad_pool:max_pools", 3);

    /* renamed from: dG */
    private static final C15573bl<Boolean> f43919dG = C15573bl.m49160a(1, "gads:delay_banner_renderer:enabled", Boolean.valueOf(true));

    /* renamed from: dH */
    private static final C15573bl<Integer> f43920dH = C15573bl.m49158a(1, "gads:heap_wastage:bytes", 0);

    /* renamed from: dI */
    private static final C15573bl<Boolean> f43921dI = C15573bl.m49160a(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));

    /* renamed from: dJ */
    private static final C15573bl<Boolean> f43922dJ = C15573bl.m49160a(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));

    /* renamed from: dK */
    private static final C15573bl<Boolean> f43923dK = C15573bl.m49160a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));

    /* renamed from: dL */
    private static final C15573bl<Long> f43924dL = C15573bl.m49159a(1, "gads:rtb_signal_timeout_ms", 1000);

    /* renamed from: dM */
    private static final C15573bl<Boolean> f43925dM = C15573bl.m49160a(2, "rtb_enabled", Boolean.valueOf(false));

    /* renamed from: dN */
    private static final C15573bl<Boolean> f43926dN = C15573bl.m49160a(1, "gads:rtb_cld:enabled", Boolean.valueOf(false));

    /* renamed from: dO */
    private static final C15573bl<Boolean> f43927dO = C15573bl.m49160a(1, "gads:adapter_initialization:enabled", Boolean.valueOf(false));

    /* renamed from: dP */
    private static final C15573bl<Long> f43928dP = C15573bl.m49159a(1, "gads:adapter_initialization:timeout", 30);

    /* renamed from: dQ */
    private static final C15573bl<Long> f43929dQ = C15573bl.m49159a(1, "gads:adapter_initialization:cld_timeout", 10);

    /* renamed from: dR */
    private static final C15573bl<Boolean> f43930dR = C15573bl.m49160a(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));

    /* renamed from: dS */
    private static final C15573bl<Boolean> f43931dS = C15573bl.m49160a(0, "gads:adid_track_reset_count:enabled", Boolean.valueOf(true));

    /* renamed from: dT */
    private static final C15573bl<String> f43932dT = C15573bl.m49156a(1, "gads:sdk_core_constants:experiment_id");

    /* renamed from: dU */
    private static final C15573bl<Boolean> f43933dU = C15573bl.m49160a(1, "gads:js_flags:disable_phenotype", Boolean.valueOf(false));

    /* renamed from: dV */
    private static final C15573bl<String> f43934dV = C15573bl.m49161a(0, "gads:native:engine_js_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/native_ads.js");

    /* renamed from: dW */
    private static final C15573bl<String> f43935dW = C15573bl.m49161a(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: dX */
    private static final C15573bl<Boolean> f43936dX = C15573bl.m49160a(1, "gads:auto_location_for_coarse_permission", Boolean.valueOf(false));

    /* renamed from: dY */
    private static final C15573bl<String> f43937dY = C15573bl.m49162b(1, "gads:auto_location_for_coarse_permission:experiment_id");

    /* renamed from: dZ */
    private static final C15573bl<String> f43938dZ = C15573bl.m49162b(1, "gads:auto_location_timeout:experiment_id");

    /* renamed from: da */
    public static final C15573bl<Boolean> f43939da = C15573bl.m49160a(1, "gads:consent:shared_preference_reading:enabled", Boolean.valueOf(true));

    /* renamed from: db */
    public static final C15573bl<Boolean> f43940db = C15573bl.m49160a(1, "gads:consent:iab_consent_info:enabled", Boolean.valueOf(true));

    /* renamed from: dc */
    public static final C15573bl<Boolean> f43941dc = C15573bl.m49160a(1, "gads:nativeads:overlay_webview:onclick", Boolean.valueOf(false));

    /* renamed from: dd */
    public static final C15573bl<Integer> f43942dd = C15573bl.m49158a(0, "gads:dynamite_load:fail:sample_rate", (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);

    /* renamed from: de */
    public static final C15573bl<Boolean> f43943de = C15573bl.m49160a(0, "gads:uri_query_to_map_rewrite:enabled", Boolean.valueOf(false));

    /* renamed from: df */
    private static final C15573bl<String> f43944df = C15573bl.m49156a(0, "gads:sdk_core_experiment_id");

    /* renamed from: dg */
    private static final C15573bl<String> f43945dg = C15573bl.m49161a(0, "gads:sdk_core_js_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.js");

    /* renamed from: dh */
    private static final C15573bl<Boolean> f43946dh = C15573bl.m49160a(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));

    /* renamed from: di */
    private static final C15573bl<String> f43947di = C15573bl.m49156a(0, "gads:request_builder:singleton_webview_experiment_id");

    /* renamed from: dj */
    private static final C15573bl<String> f43948dj = C15573bl.m49156a(0, "gads:request_builder:refresh_if_destroyed:experiment_id");

    /* renamed from: dk */
    private static final C15573bl<Boolean> f43949dk = C15573bl.m49160a(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(true));

    /* renamed from: dl */
    private static final C15573bl<String> f43950dl = C15573bl.m49156a(0, "gads:sdk_use_dynamic_module_experiment_id");

    /* renamed from: dm */
    private static final C15573bl<String> f43951dm = C15573bl.m49156a(0, "gads:block_autoclicks_experiment_id");

    /* renamed from: dn */
    private static final C15573bl<String> f43952dn = C15573bl.m49156a(0, "gads:spam_app_context:experiment_id");

    /* renamed from: do */
    private static final C15573bl<Integer> f43953do = C15573bl.m49158a(1, "gads:http_url_connection_factory:timeout_millis", (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);

    /* renamed from: dp */
    private static final C15573bl<String> f43954dp = C15573bl.m49156a(0, "gads:video_stream_cache:experiment_id");

    /* renamed from: dq */
    private static final C15573bl<Float> f43955dq = C15573bl.m49157a(0, "gads:ad_id_app_context:ping_ratio", 0.0f);

    /* renamed from: dr */
    private static final C15573bl<String> f43956dr = C15573bl.m49156a(0, "gads:ad_id_use_shared_preference:experiment_id");

    /* renamed from: ds */
    private static final C15573bl<Boolean> f43957ds = C15573bl.m49160a(0, "gads:ad_id_use_shared_preference:enabled", Boolean.valueOf(false));

    /* renamed from: dt */
    private static final C15573bl<Float> f43958dt = C15573bl.m49157a(0, "gads:ad_id_use_shared_preference:ping_ratio", 0.0f);

    /* renamed from: du */
    private static final C15573bl<Boolean> f43959du = C15573bl.m49160a(0, "gads:ad_id_use_persistent_service:enabled", Boolean.valueOf(false));

    /* renamed from: dv */
    private static final C15573bl<Boolean> f43960dv = C15573bl.m49160a(0, "gads:ad_id:use_ipc:enabled", Boolean.valueOf(false));

    /* renamed from: dw */
    private static final C15573bl<String> f43961dw = C15573bl.m49156a(0, "gads:app_index:experiment_id");

    /* renamed from: dx */
    private static final C15573bl<Integer> f43962dx = C15573bl.m49158a(0, "gads:webview_cache_version", 0);

    /* renamed from: dy */
    private static final C15573bl<String> f43963dy = C15573bl.m49156a(0, "gads:corewebview:experiment_id");

    /* renamed from: dz */
    private static final C15573bl<String> f43964dz = C15573bl.m49162b(0, "gads:pan:experiment_id");

    /* renamed from: e */
    public static final C15573bl<Boolean> f43965e = C15573bl.m49160a(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));

    /* renamed from: eA */
    private static final C15573bl<Integer> f43966eA = C15573bl.m49158a(1, "gads:nonagon:request_timeout:seconds", 60);

    /* renamed from: eB */
    private static final C15573bl<Boolean> f43967eB = C15573bl.m49160a(0, "gads:nonagon:limit_ad_request_connection", Boolean.valueOf(true));

    /* renamed from: eC */
    private static final C15573bl<Boolean> f43968eC = C15573bl.m49160a(1, "gads:nonagon:javascript_ad_request:enabled", Boolean.valueOf(false));

    /* renamed from: eD */
    private static final C15573bl<Boolean> f43969eD = C15573bl.m49160a(1, "gads:nonagon:banner_recursive_renderer", Boolean.valueOf(false));

    /* renamed from: eE */
    private static final C15573bl<Boolean> f43970eE = C15573bl.m49160a(1, "gads:nonagon:service:enabled", Boolean.valueOf(true));

    /* renamed from: eF */
    private static final C15573bl<Boolean> f43971eF = C15573bl.m49160a(1, "gads:signals:ad_id_info:enabled", Boolean.valueOf(false));

    /* renamed from: eG */
    private static final C15573bl<Boolean> f43972eG = C15573bl.m49160a(1, "gads:signals:app_index:enabled", Boolean.valueOf(false));

    /* renamed from: eH */
    private static final C15573bl<Boolean> f43973eH = C15573bl.m49160a(1, "gads:signals:cache:enabled", Boolean.valueOf(false));

    /* renamed from: eI */
    private static final C15573bl<Boolean> f43974eI = C15573bl.m49160a(1, "gads:signals:doritos:enabled", Boolean.valueOf(false));

    /* renamed from: eJ */
    private static final C15573bl<Boolean> f43975eJ = C15573bl.m49160a(1, "gads:signals:doritos:v2:immediate:enabled", Boolean.valueOf(false));

    /* renamed from: eK */
    private static final C15573bl<Boolean> f43976eK = C15573bl.m49160a(1, "gads:signals:location:enabled", Boolean.valueOf(false));

    /* renamed from: eL */
    private static final C15573bl<Boolean> f43977eL = C15573bl.m49160a(1, "gads:signals:network_prediction:enabled", Boolean.valueOf(false));

    /* renamed from: eM */
    private static final C15573bl<Boolean> f43978eM = C15573bl.m49160a(1, "gads:signals:parental_control:enabled", Boolean.valueOf(false));

    /* renamed from: eN */
    private static final C15573bl<Boolean> f43979eN = C15573bl.m49160a(1, "gads:signals:video_decoder:enabled", Boolean.valueOf(false));

    /* renamed from: eO */
    private static final C15573bl<Boolean> f43980eO = C15573bl.m49160a(1, "gads:signals:signals_on_service:enabled", Boolean.valueOf(false));

    /* renamed from: eP */
    private static final C15573bl<Boolean> f43981eP = C15573bl.m49160a(0, "gads:rewarded_sku:enabled", Boolean.valueOf(true));

    /* renamed from: eQ */
    private static final C15573bl<Boolean> f43982eQ = C15573bl.m49160a(0, "gads:rewarded_sku:override_test:enabled", Boolean.valueOf(false));

    /* renamed from: eR */
    private static final C15573bl<Boolean> f43983eR = C15573bl.m49160a(1, "gads:nativeads:image:sample:enabled", Boolean.valueOf(true));

    /* renamed from: eS */
    private static final C15573bl<Integer> f43984eS = C15573bl.m49158a(1, "gads:nativeads:image:sample:pixels", 1048576);

    /* renamed from: eT */
    private static final C15573bl<Boolean> f43985eT = C15573bl.m49160a(0, "gads:service:webview:enable_directory_suffix", Boolean.valueOf(true));

    /* renamed from: eU */
    private static final C15573bl<Boolean> f43986eU = C15573bl.m49160a(1, "gads:offline_signaling:enabled", Boolean.valueOf(false));

    /* renamed from: eV */
    private static final C15573bl<Integer> f43987eV = C15573bl.m49158a(1, "gads:offline_signaling:log_maximum", 100);

    /* renamed from: eW */
    private static final C15573bl<Boolean> f43988eW = C15573bl.m49160a(1, "gads:nativeads:template_signal:enabled", Boolean.valueOf(true));

    /* renamed from: eX */
    private static byte[] f43989eX;

    /* renamed from: ea */
    private static final C15573bl<Long> f43990ea = C15573bl.m49159a(1, "gads:auto_location_interval", -1);

    /* renamed from: eb */
    private static final C15573bl<String> f43991eb = C15573bl.m49162b(1, "gads:auto_location_interval:experiment_id");

    /* renamed from: ec */
    private static final C15573bl<Boolean> f43992ec = C15573bl.m49160a(0, "gads:auto_location_interval:without_thread", Boolean.valueOf(true));

    /* renamed from: ed */
    private static final C15573bl<String> f43993ed = C15573bl.m49156a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");

    /* renamed from: ee */
    private static final C15573bl<Boolean> f43994ee = C15573bl.m49160a(1, "gads:use_manifest_appid_cld:enabled", Boolean.valueOf(false));

    /* renamed from: ef */
    private static final C15573bl<String> f43995ef = C15573bl.m49156a(0, "gads:afs:csa:experiment_id");

    /* renamed from: eg */
    private static final C15573bl<String> f43996eg = C15573bl.m49161a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");

    /* renamed from: eh */
    private static final C15573bl<Long> f43997eh = C15573bl.m49159a(0, "gads:safe_browsing:safety_net:delay_ms", 2000);

    /* renamed from: ei */
    private static final C15573bl<Integer> f43998ei = C15573bl.m49158a(1, "gads:cache:ad_request_timeout_millis", 250);

    /* renamed from: ej */
    private static final C15573bl<Integer> f43999ej = C15573bl.m49158a(1, "gads:cache:max_concurrent_downloads", 10);

    /* renamed from: ek */
    private static final C15573bl<Long> f44000ek = C15573bl.m49159a(1, "gads:cache:javascript_timeout_millis", (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);

    /* renamed from: el */
    private static final C15573bl<String> f44001el = C15573bl.m49156a(0, "gad:dynamite_module:experiment_id");

    /* renamed from: em */
    private static final C15573bl<Boolean> f44002em = C15573bl.m49160a(0, "gads:nonagon:red_button", Boolean.valueOf(false));

    /* renamed from: en */
    private static final C15573bl<Boolean> f44003en = C15573bl.m49160a(1, "gads:nonagon:banner:enabled", Boolean.valueOf(false));

    /* renamed from: eo */
    private static final C15573bl<String> f44004eo = C15573bl.m49161a(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");

    /* renamed from: ep */
    private static final C15573bl<Boolean> f44005ep = C15573bl.m49160a(1, "gads:nonagon:interstitial:enabled", Boolean.valueOf(false));

    /* renamed from: eq */
    private static final C15573bl<String> f44006eq = C15573bl.m49161a(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");

    /* renamed from: er */
    private static final C15573bl<Boolean> f44007er = C15573bl.m49160a(1, "gads:nonagon:rewardedvideo:enabled", Boolean.valueOf(false));

    /* renamed from: es */
    private static final C15573bl<Boolean> f44008es = C15573bl.m49160a(1, "gads:nonagon:mobile_ads_setting_manager:enabled", Boolean.valueOf(false));

    /* renamed from: et */
    private static final C15573bl<String> f44009et = C15573bl.m49161a(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");

    /* renamed from: eu */
    private static final C15573bl<Boolean> f44010eu = C15573bl.m49160a(1, "gads:nonagon:nativead:enabled", Boolean.valueOf(false));

    /* renamed from: ev */
    private static final C15573bl<String> f44011ev = C15573bl.m49161a(1, "gads:nonagon:nativead:app_name", "(?!)");

    /* renamed from: ew */
    private static final C15573bl<Boolean> f44012ew = C15573bl.m49160a(1, "gads:nonagon:rewarded:load_multiple_ads", Boolean.valueOf(true));

    /* renamed from: ex */
    private static final C15573bl<Boolean> f44013ex = C15573bl.m49160a(1, "gads:nonagon:return_no_fill_error_code", Boolean.valueOf(false));

    /* renamed from: ey */
    private static final C15573bl<Boolean> f44014ey = C15573bl.m49160a(1, "gads:nonagon:continue_on_no_fill", Boolean.valueOf(false));

    /* renamed from: ez */
    private static final C15573bl<Boolean> f44015ez = C15573bl.m49160a(1, "gads:nonagon:separate_timeout:enabled", Boolean.valueOf(false));

    /* renamed from: f */
    public static final C15573bl<Boolean> f44016f = C15573bl.m49160a(0, "gads:report_dynamite_crash_in_background_thread", Boolean.valueOf(false));

    /* renamed from: g */
    public static final C15573bl<Boolean> f44017g = C15573bl.m49160a(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));

    /* renamed from: h */
    public static final C15573bl<String> f44018h = C15573bl.m49161a(0, "gads:sdk_crash_report_class_prefix", "com.google.");

    /* renamed from: i */
    public static final C15573bl<Float> f44019i = C15573bl.m49157a(1, "gads:trapped_exception_sample_rate", 0.01f);

    /* renamed from: j */
    public static final C15573bl<String> f44020j = C15573bl.m49161a(1, "gads:video_exo_player:version", "3");

    /* renamed from: k */
    public static final C15573bl<Integer> f44021k = C15573bl.m49158a(1, "gads:video_exo_player:connect_timeout", 8000);

    /* renamed from: l */
    public static final C15573bl<Integer> f44022l = C15573bl.m49158a(1, "gads:video_exo_player:read_timeout", 8000);

    /* renamed from: m */
    public static final C15573bl<Integer> f44023m = C15573bl.m49158a(1, "gads:video_exo_player:loading_check_interval", 1048576);

    /* renamed from: n */
    public static final C15573bl<Integer> f44024n = C15573bl.m49158a(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);

    /* renamed from: o */
    public static final C15573bl<Integer> f44025o = C15573bl.m49158a(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);

    /* renamed from: p */
    public static final C15573bl<Integer> f44026p = C15573bl.m49158a(1, "gads:video_exo_player_socket_receive_buffer_size", 0);

    /* renamed from: q */
    public static final C15573bl<Integer> f44027q = C15573bl.m49158a(1, "gads:video_stream_cache:limit_count", 5);

    /* renamed from: r */
    public static final C15573bl<Integer> f44028r = C15573bl.m49158a(1, "gads:video_stream_cache:limit_space", 8388608);

    /* renamed from: s */
    public static final C15573bl<Integer> f44029s = C15573bl.m49158a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);

    /* renamed from: t */
    public static final C15573bl<Long> f44030t = C15573bl.m49159a(1, "gads:video_stream_cache:limit_time_sec", 300);

    /* renamed from: u */
    public static final C15573bl<Long> f44031u = C15573bl.m49159a(1, "gads:video_stream_cache:notify_interval_millis", 125);

    /* renamed from: v */
    public static final C15573bl<Integer> f44032v = C15573bl.m49158a(1, "gads:video_stream_cache:connect_timeout_millis", (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);

    /* renamed from: w */
    public static final C15573bl<Boolean> f44033w = C15573bl.m49160a(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));

    /* renamed from: x */
    public static final C15573bl<String> f44034x = C15573bl.m49161a(1, "gads:video:metric_frame_hash_times", "");

    /* renamed from: y */
    public static final C15573bl<Long> f44035y = C15573bl.m49159a(1, "gads:video:metric_frame_hash_time_leniency", 500);

    /* renamed from: z */
    public static final C15573bl<Boolean> f44036z = C15573bl.m49160a(1, "gads:video:force_watermark", Boolean.valueOf(false));

    /* renamed from: a */
    public static void m50188a(Context context) {
        aet.m45702a(context, new C15586bx(context));
        int intValue = ((Integer) bym.m50299d().mo41272a(f43920dH)).intValue();
        if (intValue > 0 && f43989eX == null) {
            f43989eX = new byte[intValue];
        }
    }

    /* renamed from: a */
    public static void m50189a(Context context, int i, JSONObject jSONObject) {
        Editor edit = C7285c.m22838a(context, "google_ads_flags", 0).edit();
        bym.m50298c().mo41182a(edit, 1, jSONObject);
        edit.commit();
    }

    /* renamed from: a */
    public static List<String> m50187a() {
        return bym.m50298c().mo41181a();
    }

    /* renamed from: b */
    public static List<String> m50190b() {
        return bym.m50298c().mo41184b();
    }
}
