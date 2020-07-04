package com.p280ss.android.ugc.aweme.commercialize.feed.preload;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.geckoclient.C10873f;
import com.bytedance.ies.geckoclient.model.C10903d;
import com.bytedance.ies.geckoclient.model.C10909j;
import com.bytedance.ies.geckoclient.p569c.C10850a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.utils.C42983bo;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.preload.b */
public final class C24736b implements C24735a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f65175a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C24736b.class), "commonChannel", "getCommonChannel()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C24736b f65176b = new C24736b();

    /* renamed from: c */
    private static final C7541d f65177c = C7546e.m23569a(C24737a.f65180a);

    /* renamed from: d */
    private static final HashMap<String, C24740d> f65178d = new HashMap<>();

    /* renamed from: e */
    private static final HashMap<String, C24739c> f65179e = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.preload.b$a */
    static final class C24737a extends Lambda implements C7561a<List<? extends String>> {

        /* renamed from: a */
        public static final C24737a f65180a = new C24737a();

        C24737a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m81228a();
        }

        /* renamed from: a */
        private static List<String> m81228a() {
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                AdLandingPageConfig adLandingPageConfig = a.getAdLandingPageConfig();
                C7573i.m23582a((Object) adLandingPageConfig, "SettingsReader.get().adLandingPageConfig");
                return adLandingPageConfig.getAdLandingPagePreloadCommonChannel();
            } catch (NullValueException unused) {
                return C7525m.m23461a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.preload.b$b */
    public static final class C24738b implements C10850a {
        C24738b() {
        }

        /* renamed from: a */
        public final void mo26174a() {
        }

        /* renamed from: a */
        public final void mo26175a(String str, Exception exc) {
        }
    }

    private C24736b() {
    }

    /* renamed from: a */
    private final List<String> m81216a() {
        return (List) f65177c.getValue();
    }

    /* renamed from: a */
    public final void mo64732a(List<? extends C10903d> list, boolean z) {
        Collection collection = list;
        if (!(collection == null || collection.isEmpty())) {
            for (C10903d dVar : list) {
                if (m81216a().contains(dVar.f29508c)) {
                    HashMap hashMap = new HashMap();
                    Map map = hashMap;
                    map.put("site_id", "common");
                    map.put("response_status", Integer.valueOf(m81218b(dVar, z)));
                    C24958f.m81905a().mo65276b("ad_landing_channel_query").mo65266a("ad_wap_stat").mo65265a((Object) hashMap).mo65278b();
                    return;
                }
                C24740d dVar2 = (C24740d) f65178d.get(dVar.f29508c);
                if (dVar2 != null) {
                    HashMap hashMap2 = new HashMap();
                    Map map2 = hashMap2;
                    map2.put("site_id", dVar2.f65186c);
                    map2.put("response_status", Integer.valueOf(m81218b(dVar, z)));
                    C24958f.m81905a().mo65276b("ad_landing_channel_query").mo65266a("ad_wap_stat").mo65264a(Long.valueOf(dVar2.f65187d)).mo65286h(dVar2.f65188e).mo65265a((Object) hashMap2).mo65278b();
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private static C10873f m81219b() {
        return C42983bo.m136468d();
    }

    /* renamed from: c */
    private static C10873f m81220c() {
        return C42983bo.m136460b();
    }

    /* renamed from: a */
    private static long m81215a(C10903d dVar) {
        C10909j jVar = dVar.f29515j;
        C7573i.m23582a((Object) jVar, "geckoPackage.updatePackage");
        return jVar.f29544e;
    }

    /* renamed from: a */
    public static void m81217a(String str) {
        if (str != null) {
            HashMap hashMap = new HashMap();
            if (C7634n.m23721b(str, "ad_landing_", false)) {
                str = C7634n.m23711a(str, "ad_landing_", "", false);
            }
            hashMap.put("site_id", str);
            C24958f.m81905a().mo65276b("ad_landing_cache_clear").mo65266a("ad_wap_stat").mo65265a((Object) hashMap).mo65278b();
        }
    }

    /* renamed from: b */
    public final int mo64733b(String str) {
        boolean z;
        C7573i.m23587b(str, "siteId");
        C10873f b = m81219b();
        if (b == null) {
            return 0;
        }
        C10873f c = m81220c();
        if (c != null) {
            z = c.mo26224b("shadow_landing");
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder("ad_landing_");
        sb.append(str);
        boolean b2 = b.mo26224b(sb.toString());
        if (z && b2) {
            return 3;
        }
        if (z && !b2) {
            return 1;
        }
        if (z || !b2) {
            return 0;
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo64727a(List<? extends Aweme> list) {
        boolean z;
        if (!list.isEmpty()) {
            ObjectRef objectRef = new ObjectRef();
            for (Aweme aweme : list) {
                if (aweme != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        PreloadData preloadData = awemeRawAd.getPreloadData();
                        if (preloadData != null) {
                            String siteId = preloadData.getSiteId();
                            if (siteId != null) {
                                if (siteId.length() > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z && awemeRawAd.getPreloadWeb() == 4) {
                                    StringBuilder sb = new StringBuilder("ad_landing_");
                                    sb.append(awemeRawAd.getPreloadData().getSiteId());
                                    objectRef.element = sb.toString();
                                    C10873f b = m81219b();
                                    if (b != null) {
                                        b.mo26221a((String) objectRef.element, (C10850a) new C24738b());
                                    }
                                    Map map = f65178d;
                                    String str = (String) objectRef.element;
                                    String siteId2 = awemeRawAd.getPreloadData().getSiteId();
                                    if (siteId2 == null) {
                                        C7573i.m23580a();
                                    }
                                    Long creativeId = awemeRawAd.getCreativeId();
                                    C7573i.m23582a((Object) creativeId, "it.creativeId");
                                    map.put(str, new C24740d(siteId2, creativeId.longValue(), awemeRawAd.getLogExtra()));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static int m81218b(C10903d dVar, boolean z) {
        if (dVar.f29515j != null && z) {
            return 1;
        }
        if (dVar.f29506a == 0) {
            return 0;
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo64730a(C10903d dVar, boolean z) {
        if (dVar != null) {
            if (m81216a().contains(dVar.f29508c)) {
                String str = dVar.f29508c;
                C7573i.m23582a((Object) str, "geckoPackage.channel");
                C24740d dVar2 = new C24740d(str, 0, null, 6, null);
                dVar2.f65184a = System.currentTimeMillis();
                Map map = f65178d;
                String str2 = dVar.f29508c;
                C7573i.m23582a((Object) str2, "geckoPackage.channel");
                map.put(str2, dVar2);
                HashMap hashMap = new HashMap();
                dVar2.f65185b = z;
                hashMap.put("is_diff", Integer.valueOf(dVar2.f65185b));
                C24958f.m81905a().mo65276b("ad_landing_common_download_start").mo65266a("ad_wap_stat").mo65265a((Object) hashMap).mo65278b();
                return;
            }
            C24740d dVar3 = (C24740d) f65178d.get(dVar.f29508c);
            if (dVar3 != null) {
                dVar3.f65184a = System.currentTimeMillis();
                HashMap hashMap2 = new HashMap();
                dVar3.f65185b = z ? 1 : 0;
                Map map2 = hashMap2;
                map2.put("is_diff", Integer.valueOf(dVar3.f65185b));
                map2.put("site_id", dVar3.f65186c);
                C24958f.m81905a().mo65276b("ad_landing_channel_download_start").mo65266a("ad_wap_stat").mo65264a(Long.valueOf(dVar3.f65187d)).mo65286h(dVar3.f65188e).mo65265a((Object) hashMap2).mo65278b();
            }
        }
    }

    /* renamed from: a */
    public final void mo64728a(int i, C10903d dVar) {
        if (dVar != null) {
            if (m81216a().contains(dVar.f29508c)) {
                C24740d dVar2 = (C24740d) f65178d.get(dVar.f29508c);
                if (dVar2 != null) {
                    C7573i.m23582a((Object) dVar2, "downloadMsgMap[geckoPackage.channel] ?: return");
                    HashMap hashMap = new HashMap();
                    Map map = hashMap;
                    map.put("download_status", Integer.valueOf(1));
                    map.put("is_diff", Integer.valueOf(dVar2.f65185b));
                    map.put("download_duration", Long.valueOf(System.currentTimeMillis() - dVar2.f65184a));
                    map.put("download_size", Long.valueOf(m81215a(dVar)));
                    map.put("package_id", Integer.valueOf(i));
                    C24958f.m81905a().mo65276b("ad_landing_common_download_finish").mo65266a("ad_wap_stat").mo65265a((Object) hashMap).mo65278b();
                    f65178d.remove(dVar.f29508c);
                } else {
                    return;
                }
            }
            C24740d dVar3 = (C24740d) f65178d.get(dVar.f29508c);
            if (dVar3 != null) {
                HashMap hashMap2 = new HashMap();
                Map map2 = hashMap2;
                map2.put("download_status", Integer.valueOf(1));
                map2.put("is_diff", Integer.valueOf(dVar3.f65185b));
                map2.put("site_id", dVar3.f65186c);
                map2.put("download_duration", Long.valueOf(System.currentTimeMillis() - dVar3.f65184a));
                map2.put("download_size", Long.valueOf(m81215a(dVar)));
                map2.put("package_id", Integer.valueOf(i));
                C24958f.m81905a().mo65276b("ad_landing_channel_download_finish").mo65266a("ad_wap_stat").mo65264a(Long.valueOf(dVar3.f65187d)).mo65286h(dVar3.f65188e).mo65265a((Object) hashMap2).mo65278b();
                f65178d.remove(dVar.f29508c);
            }
        }
    }

    /* renamed from: a */
    public final void mo64731a(String str, int i, int i2) {
        boolean z;
        CharSequence charSequence = str;
        int i3 = 0;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            HashMap hashMap = new HashMap();
            Map map = hashMap;
            map.put("site_id", str);
            C24739c cVar = (C24739c) f65179e.get(str);
            if (cVar != null) {
                cVar.f65183c = System.currentTimeMillis();
                map.put("webview_init_duration", Long.valueOf(cVar.f65183c - cVar.f65182b));
            }
            map.put("is_web_url", Integer.valueOf(i2));
            String str2 = "preload_status";
            if (i == 4) {
                i3 = mo64733b(str);
            }
            map.put(str2, Integer.valueOf(i3));
            C24958f.m81905a().mo65276b("ad_landing_webview_init").mo65266a("ad_wap_stat").mo65265a((Object) hashMap).mo65278b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0063, code lost:
        if (r4 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e5, code lost:
        if (r12 == null) goto L_0x00e7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64729a(int r10, com.bytedance.ies.geckoclient.model.C10903d r11, java.lang.Exception r12) {
        /*
            r9 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.List r0 = r9.m81216a()
            java.lang.String r1 = r11.f29508c
            boolean r0 = r0.contains(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0091
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.preload.d> r0 = f65178d
            java.lang.String r2 = r11.f29508c
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.aweme.commercialize.feed.preload.d r0 = (com.p280ss.android.ugc.aweme.commercialize.feed.preload.C24740d) r0
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            java.lang.String r2 = "downloadMsgMap[geckoPackage.channel] ?: return"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "download_status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r3.put(r4, r5)
            java.lang.String r4 = "is_diff"
            int r5 = r0.f65185b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.put(r4, r5)
            java.lang.String r4 = "download_duration"
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f65184a
            long r5 = r5 - r7
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r3.put(r4, r0)
            java.lang.String r0 = "download_size"
            long r4 = m81215a(r11)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.put(r0, r4)
            java.lang.String r0 = "download_fail_reason"
            if (r12 == 0) goto L_0x0065
            java.lang.String r4 = r12.getMessage()
            if (r4 != 0) goto L_0x0067
        L_0x0065:
            java.lang.String r4 = ""
        L_0x0067:
            r3.put(r0, r4)
            java.lang.String r0 = "package_id"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3.put(r0, r4)
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            java.lang.String r3 = "ad_landing_common_download_finish"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65276b(r3)
            java.lang.String r3 = "ad_wap_stat"
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65266a(r3)
            com.ss.android.ugc.aweme.commercialize.log.f$b r0 = r0.mo65265a(r2)
            r0.mo65278b()
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.preload.d> r0 = f65178d
            java.lang.String r2 = r11.f29508c
            r0.remove(r2)
        L_0x0091:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.preload.d> r0 = f65178d
            java.lang.String r2 = r11.f29508c
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.aweme.commercialize.feed.preload.d r0 = (com.p280ss.android.ugc.aweme.commercialize.feed.preload.C24740d) r0
            if (r0 == 0) goto L_0x0124
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "download_status"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r4, r1)
            java.lang.String r1 = "is_diff"
            int r4 = r0.f65185b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r1, r4)
            java.lang.String r1 = "site_id"
            java.lang.String r4 = r0.f65186c
            r3.put(r1, r4)
            java.lang.String r1 = "download_duration"
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r0.f65184a
            long r4 = r4 - r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.put(r1, r4)
            java.lang.String r1 = "download_size"
            long r4 = m81215a(r11)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.put(r1, r4)
            java.lang.String r1 = "download_fail_reason"
            if (r12 == 0) goto L_0x00e7
            java.lang.String r12 = r12.getMessage()
            if (r12 != 0) goto L_0x00e9
        L_0x00e7:
            java.lang.String r12 = ""
        L_0x00e9:
            r3.put(r1, r12)
            java.lang.String r12 = "package_id"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r3.put(r12, r10)
            com.ss.android.ugc.aweme.commercialize.log.f$b r10 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()
            java.lang.String r12 = "ad_landing_channel_download_finish"
            com.ss.android.ugc.aweme.commercialize.log.f$b r10 = r10.mo65276b(r12)
            java.lang.String r12 = "ad_wap_stat"
            com.ss.android.ugc.aweme.commercialize.log.f$b r10 = r10.mo65266a(r12)
            long r3 = r0.f65187d
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            com.ss.android.ugc.aweme.commercialize.log.f$b r10 = r10.mo65264a(r12)
            java.lang.String r12 = r0.f65188e
            com.ss.android.ugc.aweme.commercialize.log.f$b r10 = r10.mo65286h(r12)
            com.ss.android.ugc.aweme.commercialize.log.f$b r10 = r10.mo65265a(r2)
            r10.mo65278b()
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.preload.d> r10 = f65178d
            java.lang.String r11 = r11.f29508c
            r10.remove(r11)
            return
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.feed.preload.C24736b.mo64729a(int, com.bytedance.ies.geckoclient.model.d, java.lang.Exception):void");
    }
}
