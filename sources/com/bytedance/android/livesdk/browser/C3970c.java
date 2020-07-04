package com.bytedance.android.livesdk.browser;

import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.core.setting.C3340n;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.browser.c */
public interface C3970c {

    /* renamed from: a */
    public static final C3338l<List<String>> f11816a = new C3340n("live_safe_domain_list", new ArrayList());

    /* renamed from: b */
    public static final C3338l<List<String>> f11817b = new C3338l<>("hotsoon_safe_host_list", new ArrayList());

    /* renamed from: c */
    public static final C3338l<Integer> f11818c = new C3338l<>("force_js_permission", Integer.valueOf(-1));

    /* renamed from: d */
    public static final C3338l<Boolean> f11819d = new C3338l<>("allow_html_video", Boolean.valueOf(true));

    /* renamed from: e */
    public static final C3338l<Long> f11820e = new C3338l<>("wap_load_time_limit_wifi", Long.valueOf(-1));

    /* renamed from: f */
    public static final C3338l<Long> f11821f = new C3338l<>("wap_load_time_limit_mobile", Long.valueOf(-1));

    /* renamed from: g */
    public static final C3338l<Integer> f11822g = new C3338l<>("webview_destroy_mode", Integer.valueOf(-1));

    /* renamed from: h */
    public static final C3338l<String> f11823h = new C3340n("js_actlog_url", "");

    /* renamed from: i */
    public static final C3338l<Boolean> f11824i = new C3338l<>("enable_webview_debugging", Boolean.valueOf(false), "webview debug");

    /* renamed from: j */
    public static final C3338l<String> f11825j = new C3338l<>("advert_cooperation_url", "https://www.chengzijianzhan.com/tetris/page/1614465171474436/");
}
