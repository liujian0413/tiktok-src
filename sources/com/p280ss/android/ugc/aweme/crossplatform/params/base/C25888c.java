package com.p280ss.android.ugc.aweme.crossplatform.params.base;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.newmedia.eplatform.C19932a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25833b;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25883a;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25884b;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25896d;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25897e;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25898f;
import com.p280ss.android.ugc.aweme.crossplatform.params.DynamicType;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.params.base.c */
final class C25888c extends C25886b {

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.params.base.c$a */
    static final class C25889a {

        /* renamed from: a */
        public C25883a f68478a;

        /* renamed from: b */
        public C25896d f68479b;

        /* renamed from: c */
        public C25897e f68480c;

        /* renamed from: d */
        public C25898f f68481d;

        /* renamed from: e */
        public C25884b f68482e;

        C25889a() {
        }

        /* renamed from: a */
        public final C25886b mo67270a() {
            C25886b bVar = new C25886b();
            bVar.f68473a = this.f68478a;
            bVar.f68475c = this.f68479b;
            bVar.f68476d = this.f68480c;
            bVar.f68477e = this.f68481d;
            bVar.f68474b = this.f68482e;
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.params.base.c$b */
    public static final class C25890b {
        /* renamed from: b */
        private static C25898f m85161b(Bundle bundle) {
            C25898f fVar = new C25898f();
            fVar.f68532a = bundle.getString("load_no_cache");
            return fVar;
        }

        /* renamed from: a */
        public static C25886b m85158a(Bundle bundle) {
            C25889a aVar = new C25889a();
            aVar.f68478a = m85162c(bundle);
            if (aVar.f68478a.f68428a.intValue() == 2) {
                aVar.f68479b = m85163d(bundle);
            }
            aVar.f68482e = m85157a(bundle, aVar.f68478a);
            aVar.f68480c = m85160b(bundle, aVar.f68478a);
            aVar.f68481d = m85161b(bundle);
            return aVar.mo67270a();
        }

        /* renamed from: d */
        private static C25896d m85163d(Bundle bundle) {
            C25896d dVar = new C25896d();
            dVar.f68490a = bundle.getString("channel_name");
            dVar.f68492c = bundle.getString("bundle_name");
            dVar.f68494e = bundle.getString("module_name");
            dVar.mo67274a(bundle.getString("force_h5"));
            dVar.f68496g = bundle.getString("fallback_url");
            dVar.f68497h = bundle.getString("dev");
            dVar.f68498i = bundle.getString("rn_bundle_url");
            dVar.f68499j = bundle.getString("rn_schema");
            String string = bundle.getString("dynamic");
            dVar.f68500k = TextUtils.equals(string, "1");
            try {
                dVar.mo67273a(DynamicType.parse(Integer.parseInt(string)));
            } catch (NumberFormatException unused) {
            }
            dVar.f68493d = bundle.getString("bundle");
            dVar.f68491b = bundle.getString("channel");
            dVar.f68503n = TextUtils.equals(bundle.getString("need_share_bridge"), "1");
            dVar.f68504o = bundle.getString("hybrid_report_source");
            String string2 = bundle.getString("a_surl");
            if (!TextUtils.isEmpty(string2)) {
                dVar.f68502m = string2;
            } else {
                Map a = C25891d.m85164b().mo67271a();
                String a2 = dVar.mo67272a();
                if (a != null && !TextUtils.isEmpty(a2) && a.containsKey(a2)) {
                    dVar.f68502m = (String) a.get(a2);
                }
            }
            return dVar;
        }

        /* renamed from: c */
        private static C25883a m85162c(Bundle bundle) {
            int i;
            String str;
            boolean z;
            C25883a aVar = new C25883a();
            if (!TextUtils.isEmpty(bundle.getString("rn_schema"))) {
                i = 2;
            } else {
                i = 1;
            }
            aVar.f68428a = Integer.valueOf(i);
            aVar.f68429b = bundle;
            String a = m85159a(bundle.getString("url"), bundle);
            if (TextUtils.isEmpty(a)) {
                str = "";
            } else {
                str = a.trim();
            }
            aVar.f68430c = str;
            Uri parse = Uri.parse(aVar.f68430c);
            aVar.f68431d = bundle.getBoolean("safeTemplate", false);
            if (aVar.f68431d && parse.isHierarchical()) {
                String decode = Uri.decode(parse.getQueryParameter("target"));
                if (!TextUtils.isEmpty(decode)) {
                    Builder buildUpon = parse.buildUpon();
                    Uri parse2 = Uri.parse(decode);
                    Set<String> queryParameterNames = parse2.getQueryParameterNames();
                    if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                        for (String str2 : queryParameterNames) {
                            if (!"target".equals(str2)) {
                                buildUpon.appendQueryParameter(str2, parse2.getQueryParameter(str2));
                            }
                        }
                    }
                    aVar.f68430c = buildUpon.build().toString();
                }
            }
            if (parse.isHierarchical()) {
                z = C25833b.m84962a(parse.getQueryParameter("auto_play_bgm"));
            } else {
                z = false;
            }
            aVar.f68434g = bundle.getBoolean("bundle_auto_play_audio", z);
            aVar.f68432e = C25833b.m84954a(C25833b.m84964b(aVar.f68430c), bundle, "group_id");
            aVar.f68433f = bundle.getString("enter_from");
            aVar.f68436i = bundle.getBoolean("from_notification", false);
            aVar.f68437j = bundle.getString("aweme_id", "");
            aVar.f68438k = bundle.getBoolean("control_request_url", false);
            if (parse.isHierarchical()) {
                aVar.f68439l = C25833b.m84962a(parse.getQueryParameter("no_hw"));
            }
            if (!aVar.f68439l) {
                aVar.f68439l = false;
            }
            aVar.mo67263a(bundle.getString("owner_id", ""));
            return aVar;
        }

        /* renamed from: a */
        private static String m85159a(String str, Bundle bundle) {
            boolean z;
            if (str == null) {
                return null;
            }
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return str;
            }
            if (TextUtils.equals("1", parse.getQueryParameter("append_common_params")) || TextUtils.equals("1", bundle.getString("add_common"))) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sb = new StringBuilder(str);
            if (z) {
                AppLog.appendCommonParams(sb, false);
            }
            return sb.toString();
        }

        /* renamed from: a */
        private static C25884b m85157a(Bundle bundle, C25883a aVar) {
            Uri uri;
            String str = aVar.f68430c;
            if (!TextUtils.isEmpty(str)) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            Uri uri2 = uri;
            C25884b bVar = new C25884b();
            bVar.f68444D = (String) C25833b.m84951a(uri2, "commerce_enter_from", String.class, "");
            bVar.f68446a = bundle.getLong("ad_id", 0);
            if (bVar.f68446a <= 0) {
                Long l = (Long) C25833b.m84951a(uri2, "cid", Long.class, Long.valueOf(0));
                Long l2 = (Long) C25833b.m84951a(uri2, "ad_id", Long.class, Long.valueOf(0));
                if (l.longValue() > 0) {
                    bVar.f68446a = l.longValue();
                } else if (l2.longValue() > 0) {
                    bVar.f68446a = l2.longValue();
                }
            }
            bVar.f68447b = bundle.getString("ad_type", "");
            bVar.f68448c = bundle.getInt("ad_system_origin", 0);
            bVar.f68449d = bundle.getBoolean("bundle_is_from_app_ad", false);
            bVar.f68471z = bundle.getBoolean("bundle_is_from_comment_app_ad", false);
            bVar.f68450e = bundle.getString("bundle_download_url");
            bVar.f68464s = bundle.getString("bundle_ad_quick_app_url");
            bVar.f68451f = bundle.getString("bundle_download_app_name");
            bVar.f68452g = bundle.getString("aweme_package_name");
            bVar.f68453h = bundle.getString("bundle_download_app_extra");
            bVar.f68454i = (String) C25833b.m84949a(uri2, "log_extra", bundle, "bundle_download_app_log_extra", String.class, "");
            bVar.f68442B = bundle.getString("has_ad_info_json");
            bVar.f68443C = bundle.getString("ad_info_json");
            bVar.f68455j = bundle.getString("gd_label");
            bVar.f68456k = bundle.getString("gd_ext_json");
            bVar.f68460o = bundle.getBoolean("bundle_forbidden_jump", false);
            boolean z = true;
            bVar.f68457l = bundle.getBoolean("bundle_disable_download_dialog", true);
            bVar.f68458m = bundle.getString("aweme_creative_id");
            bVar.f68459n = bundle.getBoolean("bundle_show_download_status_bar", true);
            if (bVar.f68446a <= 0 && TextUtils.isEmpty(bVar.f68455j)) {
                z = false;
            }
            bVar.f68461p = z;
            String string = bundle.getString("ad_js_url");
            if (bVar.f68446a > 0 && TextUtils.isEmpty(string)) {
                string = (String) SharePrefCache.inst().getJsActlogUrl().mo59877d();
            }
            bVar.f68462q = string;
            bVar.f68463r = bundle.getString("dou_plus_fail_monitor_url");
            bVar.f68465t = bundle.getString("preload_site_id");
            bVar.f68466u = bundle.getInt("preload_web_status");
            bVar.f68467v = bundle.getInt("preload_is_web_url");
            bVar.f68468w = C19932a.m65763a(aVar.f68430c);
            bVar.f68469x = bundle.getInt("web_type");
            bVar.f68470y = bundle.getString("quick_shop_enter_from");
            bVar.f68441A = bundle.getBoolean("enable_web_report", false);
            bVar.f68445E = bundle.getBoolean("bundle_enable_open_browser_to_download_apk", false);
            return bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0121  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.p280ss.android.ugc.aweme.crossplatform.params.C25897e m85160b(android.os.Bundle r6, com.p280ss.android.ugc.aweme.crossplatform.params.C25883a r7) {
            /*
                com.ss.android.ugc.aweme.crossplatform.params.e r0 = new com.ss.android.ugc.aweme.crossplatform.params.e
                r0.<init>()
                java.lang.String r1 = r7.f68430c
                android.net.Uri r1 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84964b(r1)
                java.lang.String r2 = "use_ordinary_web"
                r3 = 1
                boolean r2 = r6.getBoolean(r2, r3)
                r4 = 0
                if (r2 != 0) goto L_0x0016
                goto L_0x0029
            L_0x0016:
                if (r1 == 0) goto L_0x002e
                java.lang.String r2 = "immersive_mode"
                java.lang.String r2 = r1.getQueryParameter(r2)
                if (r2 == 0) goto L_0x002b
                java.lang.String r5 = "0"
                boolean r2 = android.text.TextUtils.equals(r2, r5)
                if (r2 == 0) goto L_0x0029
                goto L_0x002b
            L_0x0029:
                r2 = 0
                goto L_0x002c
            L_0x002b:
                r2 = 1
            L_0x002c:
                r0.f68517l = r2
            L_0x002e:
                if (r1 == 0) goto L_0x0038
                java.lang.String r2 = "topbar_type"
                java.lang.String r2 = r1.getQueryParameter(r2)
                r0.f68518m = r2
            L_0x0038:
                java.lang.String r2 = "need_bottom_out"
                boolean r2 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84966b(r1, r6, r2, r4)
                r0.f68516k = r2
                boolean r2 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
                r0.f68524s = r2
                java.lang.String r2 = "bundle_nav_bar_status_padding"
                boolean r2 = r6.getBoolean(r2, r4)
                r0.f68519n = r2
                java.lang.String r2 = "hide_more"
                boolean r2 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84959a(r1, r6, r2, r3)
                r0.f68507b = r2
                java.lang.String r7 = r7.f68430c
                android.net.Uri r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84964b(r7)
                java.lang.String r2 = "nav_btn_type"
                int r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84963b(r7, r6, r2)
                r0.f68531z = r7
                java.lang.String r7 = "show_report"
                boolean r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84959a(r1, r6, r7, r4)
                r0.f68508c = r7
                java.lang.String r7 = "hide_loading"
                boolean r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84959a(r1, r6, r7, r4)
                if (r7 != 0) goto L_0x007c
                java.lang.String r7 = "show_load_dialog"
                boolean r7 = r6.getBoolean(r7, r3)
                if (r7 != 0) goto L_0x007e
            L_0x007c:
                r0.f68530y = r4
            L_0x007e:
                java.lang.String r7 = "title"
                java.lang.String r7 = r6.getString(r7)
                r0.f68509d = r7
                java.lang.String r7 = r0.f68509d
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 == 0) goto L_0x0096
                java.lang.String r7 = "bundle_web_title"
                java.lang.String r7 = r6.getString(r7)
                r0.f68509d = r7
            L_0x0096:
                java.lang.String r7 = r0.f68509d
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 == 0) goto L_0x00a8
                if (r1 == 0) goto L_0x00a8
                java.lang.String r7 = "title"
                java.lang.String r7 = r1.getQueryParameter(r7)
                r0.f68509d = r7
            L_0x00a8:
                java.lang.String r7 = "use_webview_title"
                boolean r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84959a(r1, r6, r7, r4)
                r0.f68526u = r7
                java.lang.String r7 = "nav_bar_color"
                int r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84967c(r1, r6, r7)
                r0.f68510e = r7
                java.lang.String r7 = "loading_bgcolor"
                int r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84967c(r1, r6, r7)
                r0.f68511f = r7
                java.lang.String r7 = "title_color"
                int r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84967c(r1, r6, r7)
                r0.f68512g = r7
                java.lang.String r7 = "web_type"
                int r7 = r6.getInt(r7)
                r2 = 2
                if (r7 != r3) goto L_0x00d6
                r0.f68528w = r2
                r0.f68527v = r3
                goto L_0x00f7
            L_0x00d6:
                if (r1 == 0) goto L_0x00f7
                java.lang.String r7 = "disable_pop_gesture"
                java.lang.String r7 = r1.getQueryParameter(r7)
                java.lang.String r5 = "0"
                boolean r5 = android.text.TextUtils.equals(r7, r5)
                if (r5 == 0) goto L_0x00eb
                r0.f68528w = r2
                r0.f68527v = r3
                goto L_0x00f7
            L_0x00eb:
                java.lang.String r2 = "1"
                boolean r7 = android.text.TextUtils.equals(r7, r2)
                if (r7 == 0) goto L_0x00f7
                r0.f68528w = r4
                r0.f68527v = r4
            L_0x00f7:
                int r7 = r0.f68510e
                r2 = -2
                if (r7 == r2) goto L_0x0100
                int r7 = r0.f68510e
                r0.f68511f = r7
            L_0x0100:
                java.lang.String r7 = "show_closeall"
                boolean r7 = r6.getBoolean(r7, r4)
                r0.f68513h = r7
                java.lang.String r7 = "show_more_button"
                boolean r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84959a(r1, r6, r7, r4)
                r0.f68514i = r7
                java.lang.String r7 = "copy_link_action"
                boolean r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84959a(r1, r6, r7, r4)
                r0.f68515j = r7
                int r7 = r0.f68511f
                if (r7 == r2) goto L_0x0121
                int r7 = r0.f68511f
                r0.f68529x = r7
                goto L_0x0136
            L_0x0121:
                android.content.Context r7 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
                android.content.res.Resources r7 = r7.getResources()
                r2 = 2131100871(0x7f0604c7, float:1.7814136E38)
                int r7 = r7.getColor(r2)
                int r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84944a(r1, r6, r7)
                r0.f68529x = r7
            L_0x0136:
                java.lang.String r7 = "should_full_screen"
                boolean r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84959a(r1, r6, r7, r4)
                r0.f68520o = r7
                java.lang.String r7 = "hide_nav_bar"
                boolean r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84959a(r1, r6, r7, r4)
                r0.f68521p = r7
                java.lang.String r7 = "hide_status_bar"
                boolean r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84959a(r1, r6, r7, r4)
                r0.f68522q = r7
                java.lang.String r7 = "status_bar_color"
                int r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84967c(r1, r6, r7)
                r0.f68523r = r7
                java.lang.String r7 = "status_font_dark"
                boolean r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
                boolean r7 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84959a(r1, r6, r7, r2)
                r0.f68506a = r7
                java.lang.String r7 = "show_not_official_content_warning"
                boolean r7 = r6.getBoolean(r7, r4)
                r0.f68525t = r7
                java.lang.String r7 = "webview_progress_bar"
                boolean r6 = com.p280ss.android.ugc.aweme.crossplatform.base.C25833b.m84959a(r1, r6, r7, r4)
                r0.f68505A = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.params.base.C25888c.C25890b.m85160b(android.os.Bundle, com.ss.android.ugc.aweme.crossplatform.params.a):com.ss.android.ugc.aweme.crossplatform.params.e");
        }
    }
}
