package com.p280ss.android.ugc.aweme.poi.p1472rn;

import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29893a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33253ax;
import com.p280ss.android.ugc.aweme.metrics.C33254ay;
import com.p280ss.android.ugc.aweme.metrics.C33255az;
import com.p280ss.android.ugc.aweme.metrics.C33259d;
import com.p280ss.android.ugc.aweme.newfollow.util.C34199d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.poi.rn.b */
public final class C35223b {

    /* renamed from: b */
    public static final C35224a f92232b = new C35224a(null);

    /* renamed from: a */
    public final Aweme f92233a;

    /* renamed from: c */
    private final String f92234c = "VideoPlayInfo";

    /* renamed from: d */
    private long f92235d = -1;

    /* renamed from: e */
    private boolean f92236e;

    /* renamed from: com.ss.android.ugc.aweme.poi.rn.b$a */
    public static final class C35224a {
        private C35224a() {
        }

        public /* synthetic */ C35224a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m113636a(Aweme aweme) {
            if (aweme != null) {
                C6907h.onEvent(MobClick.obtain().setEventName("click").setLabelName("video_play").setValue(aweme.getAid()));
            }
        }

        /* renamed from: b */
        public static void m113637b(Aweme aweme) {
            C7573i.m23587b(aweme, "aweme");
            C6907h.onEvent(MobClick.obtain().setEventName("click").setLabelName("video_pause").setValue(aweme.getAid()));
        }

        /* renamed from: a */
        public static String m113635a(String str, Map<String, String> map) {
            C7573i.m23587b(str, "key");
            if (map == null || !map.containsKey(str) || TextUtils.isEmpty((CharSequence) map.get(str))) {
                return "";
            }
            return (String) map.get(str);
        }

        /* renamed from: a */
        public final void mo89663a(Aweme aweme, Map<String, String> map) {
            String str;
            String str2;
            Map<String, String> map2;
            if (aweme != null) {
                String a = m113635a("enter_from", map);
                C33254ay ayVar = new C33254ay();
                if (a == null) {
                    str = "";
                } else {
                    str = a;
                }
                C33254ay f = ayVar.mo85197a(str).mo85071g(aweme);
                if (C34199d.m110410h()) {
                    str2 = "1";
                } else {
                    str2 = "";
                }
                C33259d a2 = f.mo85204c(str2).mo85246a((Map<String, String>) C29893a.m97889b(aweme, C29893a.m97882a()));
                if (map == null) {
                    map2 = new HashMap<>();
                } else {
                    map2 = map;
                }
                a2.mo85246a(map2).mo85252e();
                C6869c a3 = C6869c.m21381a();
                C29893a.m97888b(a3, aweme, a);
                C29893a.m97881a(a3, aweme, C29893a.m97882a());
                if (C34199d.m110410h()) {
                    a3.mo16885a("is_auto_play", Integer.valueOf(1));
                }
                if (C7634n.m23717a("poi_page", a, true)) {
                    String a4 = m113635a("poi_id", map);
                    if (!TextUtils.isEmpty(a4)) {
                        a3.mo16887a("poi_id", a4);
                        String a5 = m113635a("poi_label_type", map);
                        if (!TextUtils.isEmpty(a5)) {
                            a3.mo16887a("poi_type", a5);
                        }
                    }
                }
                a3.mo16887a("enter_from", a);
                C6907h.onEvent(MobClick.obtain().setEventName("video_play").setLabelName("finish").setValue(aweme.getAid()).setJsonObject(a3.mo16888b()));
            }
        }
    }

    /* renamed from: a */
    public final void mo89660a() {
        if (this.f92235d == -1) {
            this.f92235d = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final void mo89662b(Map<String, String> map) {
        if (!this.f92236e) {
            this.f92236e = true;
            m113631a(this.f92233a, map);
        }
    }

    public C35223b(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        this.f92233a = aweme;
    }

    /* renamed from: a */
    public final void mo89661a(Map<String, String> map) {
        if (this.f92235d != -1) {
            m113630a(this.f92233a, System.currentTimeMillis() - this.f92235d, map);
            this.f92235d = -1;
        }
    }

    /* renamed from: a */
    private static void m113631a(Aweme aweme, Map<String, String> map) {
        String str;
        String str2;
        Map<String, String> map2;
        if (aweme != null) {
            String a = C35224a.m113635a("enter_from", map);
            C33253ax axVar = new C33253ax();
            if (a == null) {
                str = "";
            } else {
                str = a;
            }
            C33253ax f = axVar.mo85164a(str).mo85071g(aweme);
            if (C34199d.m110410h()) {
                str2 = "1";
            } else {
                str2 = "";
            }
            C33259d a2 = f.mo85177f(str2).mo85166a(false).mo85246a((Map<String, String>) C29893a.m97889b(aweme, C29893a.m97882a()));
            if (map == null) {
                map2 = new HashMap<>();
            } else {
                map2 = map;
            }
            a2.mo85246a(map2).mo85252e();
            C6869c a3 = C6869c.m21381a();
            C29893a.m97888b(a3, aweme, a);
            C29893a.m97881a(a3, aweme, C29893a.m97882a());
            if (C34199d.m110410h()) {
                a3.mo16885a("is_auto_play", Integer.valueOf(1));
            }
            if (C7634n.m23717a("poi_page", a, true)) {
                String a4 = C35224a.m113635a("poi_id", map);
                if (!TextUtils.isEmpty(a4)) {
                    a3.mo16887a("poi_id", a4);
                    String a5 = C35224a.m113635a("poi_label_type", map);
                    if (!TextUtils.isEmpty(a5)) {
                        a3.mo16887a("poi_type", a5);
                    }
                }
            }
            a3.mo16885a("enter_fullscreen", Integer.valueOf(0));
            C6907h.onEvent(MobClick.obtain().setEventName("video_play").setLabelName(a).setValue(aweme.getAid()).setJsonObject(a3.mo16888b()));
        }
    }

    /* renamed from: a */
    private final void m113630a(Aweme aweme, long j, Map<String, String> map) {
        String str;
        String str2;
        Map<String, String> map2;
        if (aweme != null) {
            C7573i.m23582a((Object) C1642a.m8034a("sendLeaveAutoVideoPlayPage: aid=%s, playTime=%d", Arrays.copyOf(new Object[]{aweme.getAid(), Long.valueOf(j)}, 2)), "java.lang.String.format(format, *args)");
            String a = C35224a.m113635a("enter_from", map);
            C33255az azVar = new C33255az();
            if (a == null) {
                str = "";
            } else {
                str = a;
            }
            C33255az f = azVar.mo85221a(str).mo85071g(aweme);
            if (C34199d.m110410h()) {
                str2 = "1";
            } else {
                str2 = "";
            }
            C33259d a2 = f.mo85225c(str2).mo85218a(j).mo85222a(false).mo85227e(C33230ac.m107219c(aweme)).mo85246a((Map<String, String>) C29893a.m97889b(aweme, C29893a.m97882a()));
            if (map == null) {
                map2 = new HashMap<>();
            } else {
                map2 = map;
            }
            a2.mo85246a(map2).mo85252e();
            C6869c a3 = C6869c.m21381a().mo16885a("enter_fullscreen", Integer.valueOf(0));
            C29893a.m97888b(a3, aweme, a);
            C29893a.m97881a(a3, aweme, C29893a.m97882a());
            if (C34199d.m110410h()) {
                a3.mo16885a("is_auto_play", Integer.valueOf(1));
            }
            if (C7634n.m23717a("poi_page", a, true)) {
                String a4 = C35224a.m113635a("poi_id", map);
                if (!TextUtils.isEmpty(a4)) {
                    a3.mo16887a("poi_id", a4);
                    String a5 = C35224a.m113635a("poi_label_type", map);
                    if (!TextUtils.isEmpty(a5)) {
                        a3.mo16887a("poi_type", a5);
                    }
                }
            }
            C6907h.onEvent(MobClick.obtain().setEventName("play_time").setLabelName(a).setValue(aweme.getAid()).setExtValueLong(j).setJsonObject(a3.mo16888b()));
        }
    }
}
