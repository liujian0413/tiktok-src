package com.p280ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.ugc.aweme.app.C22909c.C22910a;
import com.p280ss.android.ugc.aweme.app.p1037j.C22998a;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.net.URLDecoder;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.app.d */
public final class C22912d {

    /* renamed from: a */
    public static final String f60641a = f60641a;

    /* renamed from: b */
    public static final String f60642b = f60642b;

    /* renamed from: c */
    public static final String f60643c = f60643c;

    /* renamed from: d */
    public static final String f60644d = f60644d;

    /* renamed from: e */
    public static final C22913a f60645e = new C22913a(null);

    /* renamed from: com.ss.android.ugc.aweme.app.d$a */
    public static final class C22913a {
        private C22913a() {
        }

        /* renamed from: a */
        private static String m75408a() {
            return C22912d.f60641a;
        }

        /* renamed from: b */
        private static String m75411b() {
            return C22912d.f60642b;
        }

        /* renamed from: c */
        private static String m75413c() {
            return C22912d.f60643c;
        }

        /* renamed from: d */
        private static String m75414d() {
            return C22912d.f60644d;
        }

        public /* synthetic */ C22913a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private boolean m75409a(String str) {
            return m75410a(str, false);
        }

        /* renamed from: b */
        private boolean m75412b(String str) {
            C7573i.m23587b(str, "url");
            try {
                Uri parse = Uri.parse(str);
                if (parse == null || !m75409a(parse.getQueryParameter("hide_more"))) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: a */
        private static boolean m75410a(String str, boolean z) {
            if (C6319n.m19593a(str)) {
                return false;
            }
            return C7573i.m23585a((Object) "1", (Object) str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x00f5 A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x010f A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0116 A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x011d A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0124 A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0135 A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x014b A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x014c A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0153 A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0159 A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0171 A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0182 A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0193 A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01a4 A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01da A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01eb A[Catch:{ Exception -> 0x0203 }] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01fc A[Catch:{ Exception -> 0x0203 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent mo59885a(android.content.Context r14, android.net.Uri r15) {
            /*
                r13 = this;
                r0 = 0
                if (r15 != 0) goto L_0x0004
                return r0
            L_0x0004:
                android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0203 }
                r1.<init>()     // Catch:{ Exception -> 0x0203 }
                java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r2 = com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
                r1.setClass(r14, r2)     // Catch:{ Exception -> 0x0203 }
                java.lang.String r14 = "url"
                java.lang.String r14 = r15.getQueryParameter(r14)     // Catch:{ Exception -> 0x0203 }
                if (r14 == 0) goto L_0x0202
                r2 = r14
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x0203 }
                int r2 = r2.length()     // Catch:{ Exception -> 0x0203 }
                r3 = 0
                r4 = 1
                if (r2 <= 0) goto L_0x0023
                r2 = 1
                goto L_0x0024
            L_0x0023:
                r2 = 0
            L_0x0024:
                if (r2 == r4) goto L_0x0028
                goto L_0x0202
            L_0x0028:
                r2 = r13
                com.ss.android.ugc.aweme.app.d$a r2 = (com.p280ss.android.ugc.aweme.app.C22912d.C22913a) r2     // Catch:{ Exception -> 0x0203 }
                java.lang.String r5 = "rotate"
                java.lang.String r5 = r15.getQueryParameter(r5)     // Catch:{ Exception -> 0x0203 }
                boolean r2 = r2.m75409a(r5)     // Catch:{ Exception -> 0x0203 }
                r5 = r13
                com.ss.android.ugc.aweme.app.d$a r5 = (com.p280ss.android.ugc.aweme.app.C22912d.C22913a) r5     // Catch:{ Exception -> 0x0203 }
                java.lang.String r6 = "no_hw"
                java.lang.String r6 = r15.getQueryParameter(r6)     // Catch:{ Exception -> 0x0203 }
                boolean r5 = r5.m75409a(r6)     // Catch:{ Exception -> 0x0203 }
                r6 = r13
                com.ss.android.ugc.aweme.app.d$a r6 = (com.p280ss.android.ugc.aweme.app.C22912d.C22913a) r6     // Catch:{ Exception -> 0x0203 }
                java.lang.String r7 = "hide_more"
                java.lang.String r7 = r15.getQueryParameter(r7)     // Catch:{ Exception -> 0x0203 }
                boolean r6 = r6.m75409a(r7)     // Catch:{ Exception -> 0x0203 }
                r7 = r13
                com.ss.android.ugc.aweme.app.d$a r7 = (com.p280ss.android.ugc.aweme.app.C22912d.C22913a) r7     // Catch:{ Exception -> 0x0203 }
                java.lang.String r8 = "hide_bar"
                java.lang.String r8 = r15.getQueryParameter(r8)     // Catch:{ Exception -> 0x0203 }
                boolean r7 = r7.m75409a(r8)     // Catch:{ Exception -> 0x0203 }
                r8 = r13
                com.ss.android.ugc.aweme.app.d$a r8 = (com.p280ss.android.ugc.aweme.app.C22912d.C22913a) r8     // Catch:{ Exception -> 0x0203 }
                java.lang.String r9 = "hide_status_bar"
                java.lang.String r9 = r15.getQueryParameter(r9)     // Catch:{ Exception -> 0x0203 }
                boolean r8 = r8.m75409a(r9)     // Catch:{ Exception -> 0x0203 }
                r9 = r13
                com.ss.android.ugc.aweme.app.d$a r9 = (com.p280ss.android.ugc.aweme.app.C22912d.C22913a) r9     // Catch:{ Exception -> 0x0203 }
                java.lang.String r10 = "hide_nav_bar"
                java.lang.String r10 = r15.getQueryParameter(r10)     // Catch:{ Exception -> 0x0203 }
                boolean r9 = r9.m75409a(r10)     // Catch:{ Exception -> 0x0203 }
                r10 = r13
                com.ss.android.ugc.aweme.app.d$a r10 = (com.p280ss.android.ugc.aweme.app.C22912d.C22913a) r10     // Catch:{ Exception -> 0x0203 }
                java.lang.String r11 = "hide_more"
                java.lang.String r11 = r15.getQueryParameter(r11)     // Catch:{ Exception -> 0x0203 }
                boolean r10 = r10.m75409a(r11)     // Catch:{ Exception -> 0x0203 }
                if (r7 != 0) goto L_0x0087
                if (r9 == 0) goto L_0x008c
            L_0x0087:
                java.lang.String r7 = "hide_nav_bar"
                r1.putExtra(r7, r4)     // Catch:{ Exception -> 0x0203 }
            L_0x008c:
                if (r8 == 0) goto L_0x0093
                java.lang.String r7 = "hide_status_bar"
                r1.putExtra(r7, r4)     // Catch:{ Exception -> 0x0203 }
            L_0x0093:
                java.lang.String r7 = "ad_id"
                java.lang.String r7 = r15.getQueryParameter(r7)     // Catch:{ Exception -> 0x0203 }
                boolean r8 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ Exception -> 0x0203 }
                if (r8 != 0) goto L_0x00a8
                java.lang.String r8 = "ad_id"
                long r11 = java.lang.Long.parseLong(r7)     // Catch:{ Exception -> 0x00a8 }
                r1.putExtra(r8, r11)     // Catch:{ Exception -> 0x00a8 }
            L_0x00a8:
                java.lang.String r7 = "adinfojson"
                java.lang.String r7 = r15.getQueryParameter(r7)     // Catch:{ Exception -> 0x0203 }
                boolean r8 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ Exception -> 0x0203 }
                if (r8 != 0) goto L_0x00df
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0203 }
                r8.<init>(r7)     // Catch:{ Exception -> 0x0203 }
                java.lang.String r7 = "cid"
                java.lang.String r7 = r8.getString(r7)     // Catch:{ Exception -> 0x0203 }
                java.lang.String r9 = "log_extra"
                java.lang.String r8 = r8.getString(r9)     // Catch:{ Exception -> 0x0203 }
                boolean r9 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ Exception -> 0x0203 }
                if (r9 != 0) goto L_0x00d4
                java.lang.String r9 = "ad_id"
                long r11 = java.lang.Long.parseLong(r7)     // Catch:{ Exception -> 0x0203 }
                r1.putExtra(r9, r11)     // Catch:{ Exception -> 0x0203 }
            L_0x00d4:
                boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r8)     // Catch:{ Exception -> 0x0203 }
                if (r7 != 0) goto L_0x00df
                java.lang.String r7 = "bundle_download_app_log_extra"
                r1.putExtra(r7, r8)     // Catch:{ Exception -> 0x0203 }
            L_0x00df:
                java.lang.String r7 = "http://"
                boolean r7 = kotlin.text.C7634n.m23721b(r14, r7, r4)     // Catch:{ Exception -> 0x0203 }
                if (r7 != 0) goto L_0x00f2
                java.lang.String r7 = "https://"
                boolean r7 = kotlin.text.C7634n.m23721b(r14, r7, r4)     // Catch:{ Exception -> 0x0203 }
                if (r7 == 0) goto L_0x00f0
                goto L_0x00f2
            L_0x00f0:
                r7 = 0
                goto L_0x00f3
            L_0x00f2:
                r7 = 1
            L_0x00f3:
                if (r7 != 0) goto L_0x00fb
                java.lang.String r7 = "UTF-8"
                java.lang.String r14 = java.net.URLDecoder.decode(r14, r7)     // Catch:{ Exception -> 0x0203 }
            L_0x00fb:
                android.net.Uri r7 = android.net.Uri.parse(r14)     // Catch:{ Exception -> 0x0203 }
                r1.setData(r7)     // Catch:{ Exception -> 0x0203 }
                java.lang.String r7 = "swipe_mode"
                r8 = 2
                r1.putExtra(r7, r8)     // Catch:{ Exception -> 0x0203 }
                java.lang.String r7 = "show_toolbar"
                r1.putExtra(r7, r4)     // Catch:{ Exception -> 0x0203 }
                if (r2 == 0) goto L_0x0114
                java.lang.String r2 = "orientation"
                r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x0203 }
            L_0x0114:
                if (r5 == 0) goto L_0x011b
                java.lang.String r2 = "bundle_no_hw_acceleration"
                r1.putExtra(r2, r5)     // Catch:{ Exception -> 0x0203 }
            L_0x011b:
                if (r6 == 0) goto L_0x0122
                java.lang.String r2 = "hide_more"
                r1.putExtra(r2, r6)     // Catch:{ Exception -> 0x0203 }
            L_0x0122:
                if (r10 == 0) goto L_0x0129
                java.lang.String r2 = "hide_more"
                r1.putExtra(r2, r10)     // Catch:{ Exception -> 0x0203 }
            L_0x0129:
                java.lang.String r2 = "title"
                java.lang.String r2 = r15.getQueryParameter(r2)     // Catch:{ Exception -> 0x0203 }
                boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)     // Catch:{ Exception -> 0x0203 }
                if (r3 == 0) goto L_0x013f
                android.net.Uri r14 = android.net.Uri.parse(r14)     // Catch:{ Exception -> 0x0203 }
                java.lang.String r2 = "title"
                java.lang.String r2 = r14.getQueryParameter(r2)     // Catch:{ Exception -> 0x0203 }
            L_0x013f:
                java.lang.String r14 = "title_extra"
                java.lang.String r14 = r15.getQueryParameter(r14)     // Catch:{ Exception -> 0x0203 }
                boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r14)     // Catch:{ Exception -> 0x0203 }
                if (r3 != 0) goto L_0x014c
                goto L_0x014d
            L_0x014c:
                r14 = r2
            L_0x014d:
                boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r14)     // Catch:{ Exception -> 0x0203 }
                if (r2 != 0) goto L_0x0159
                java.lang.String r2 = "title"
                r1.putExtra(r2, r14)     // Catch:{ Exception -> 0x0203 }
                goto L_0x0165
            L_0x0159:
                java.lang.String r14 = "title"
                java.lang.String r2 = " "
                r1.putExtra(r14, r2)     // Catch:{ Exception -> 0x0203 }
                java.lang.String r14 = "use_webview_title"
                r1.putExtra(r14, r4)     // Catch:{ Exception -> 0x0203 }
            L_0x0165:
                java.lang.String r14 = "gd_label"
                java.lang.String r14 = r15.getQueryParameter(r14)     // Catch:{ Exception -> 0x0203 }
                boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r14)     // Catch:{ Exception -> 0x0203 }
                if (r2 != 0) goto L_0x0176
                java.lang.String r2 = "gd_label"
                r1.putExtra(r2, r14)     // Catch:{ Exception -> 0x0203 }
            L_0x0176:
                java.lang.String r14 = "gd_ext_json"
                java.lang.String r14 = r15.getQueryParameter(r14)     // Catch:{ Exception -> 0x0203 }
                boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r14)     // Catch:{ Exception -> 0x0203 }
                if (r2 != 0) goto L_0x0187
                java.lang.String r2 = "gd_ext_json"
                r1.putExtra(r2, r14)     // Catch:{ Exception -> 0x0203 }
            L_0x0187:
                java.lang.String r14 = "webview_track_key"
                java.lang.String r14 = r15.getQueryParameter(r14)     // Catch:{ Exception -> 0x0203 }
                boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r14)     // Catch:{ Exception -> 0x0203 }
                if (r2 != 0) goto L_0x0198
                java.lang.String r2 = "webview_track_key"
                r1.putExtra(r2, r14)     // Catch:{ Exception -> 0x0203 }
            L_0x0198:
                java.lang.String r14 = "wap_headers"
                java.lang.String r14 = r15.getQueryParameter(r14)     // Catch:{ Exception -> 0x0203 }
                boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r14)     // Catch:{ Exception -> 0x0203 }
                if (r2 != 0) goto L_0x01a9
                java.lang.String r2 = "wap_headers"
                r1.putExtra(r2, r14)     // Catch:{ Exception -> 0x0203 }
            L_0x01a9:
                java.lang.String r14 = "bundle_auto_play_audio"
                r2 = r13
                com.ss.android.ugc.aweme.app.d$a r2 = (com.p280ss.android.ugc.aweme.app.C22912d.C22913a) r2     // Catch:{ Exception -> 0x0203 }
                java.lang.String r3 = "auto_play_bgm"
                java.lang.String r3 = r15.getQueryParameter(r3)     // Catch:{ Exception -> 0x0203 }
                boolean r2 = r2.m75409a(r3)     // Catch:{ Exception -> 0x0203 }
                r1.putExtra(r14, r2)     // Catch:{ Exception -> 0x0203 }
                java.lang.String r14 = "show_load_dialog"
                r2 = r13
                com.ss.android.ugc.aweme.app.d$a r2 = (com.p280ss.android.ugc.aweme.app.C22912d.C22913a) r2     // Catch:{ Exception -> 0x0203 }
                java.lang.String r3 = "hide_loading"
                java.lang.String r3 = r15.getQueryParameter(r3)     // Catch:{ Exception -> 0x0203 }
                boolean r2 = r2.m75409a(r3)     // Catch:{ Exception -> 0x0203 }
                r2 = r2 ^ r4
                r1.putExtra(r14, r2)     // Catch:{ Exception -> 0x0203 }
                java.lang.String r14 = "status_bar_color"
                java.lang.String r14 = r15.getQueryParameter(r14)     // Catch:{ Exception -> 0x0203 }
                boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r14)     // Catch:{ Exception -> 0x0203 }
                if (r2 != 0) goto L_0x01df
                java.lang.String r2 = "status_bar_color"
                r1.putExtra(r2, r14)     // Catch:{ Exception -> 0x0203 }
            L_0x01df:
                java.lang.String r14 = "load_no_cache"
                java.lang.String r14 = r15.getQueryParameter(r14)     // Catch:{ Exception -> 0x0203 }
                boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r14)     // Catch:{ Exception -> 0x0203 }
                if (r2 != 0) goto L_0x01f0
                java.lang.String r2 = "load_no_cache"
                r1.putExtra(r2, r14)     // Catch:{ Exception -> 0x0203 }
            L_0x01f0:
                java.lang.String r14 = "add_common"
                java.lang.String r14 = r15.getQueryParameter(r14)     // Catch:{ Exception -> 0x0203 }
                boolean r15 = com.bytedance.common.utility.C6319n.m19593a(r14)     // Catch:{ Exception -> 0x0203 }
                if (r15 != 0) goto L_0x0201
                java.lang.String r15 = "add_common"
                r1.putExtra(r15, r14)     // Catch:{ Exception -> 0x0203 }
            L_0x0201:
                return r1
            L_0x0202:
                return r0
            L_0x0203:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.C22912d.C22913a.mo59885a(android.content.Context, android.net.Uri):android.content.Intent");
        }

        /* renamed from: a */
        public final Intent mo59886a(Context context, Uri uri, boolean z) {
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            String str;
            String str2;
            Context context2 = context;
            Uri uri2 = uri;
            C7573i.m23587b(context2, "context");
            if (uri2 == null) {
                return null;
            }
            try {
                Intent intent = new Intent(context2, CrossPlatformActivity.class);
                String queryParameter = uri2.getQueryParameter("url");
                if (C6319n.m19593a(queryParameter)) {
                    return null;
                }
                String decode = URLDecoder.decode(queryParameter, "UTF-8");
                Uri parse = Uri.parse(decode);
                if (parse == null) {
                    z2 = false;
                } else {
                    z2 = m75409a(parse.getQueryParameter("rotate"));
                }
                if (parse == null) {
                    z3 = false;
                } else {
                    z3 = m75409a(parse.getQueryParameter("no_hw"));
                }
                if (parse == null) {
                    z4 = false;
                } else {
                    z4 = m75409a(parse.getQueryParameter("hide_more"));
                }
                if (parse == null) {
                    z5 = false;
                } else {
                    z5 = m75409a(parse.getQueryParameter("hide_bar"));
                }
                if (parse == null) {
                    z6 = false;
                } else {
                    z6 = m75409a(parse.getQueryParameter("hide_status_bar"));
                }
                if (parse == null) {
                    z7 = false;
                } else {
                    z7 = m75409a(parse.getQueryParameter("hide_nav_bar"));
                }
                if (parse == null) {
                    z8 = false;
                } else {
                    z8 = m75409a(parse.getQueryParameter("hide_more"));
                }
                if (parse != null) {
                    str = parse.getQueryParameter("previous_page");
                } else {
                    str = null;
                }
                if (parse != null) {
                    str2 = parse.getQueryParameter("backurl");
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra("backurl", str2);
                }
                C22913a aVar = this;
                C7573i.m23582a((Object) decode, "url");
                boolean b = z8 | aVar.m75412b(decode);
                if (!TextUtils.isEmpty(str)) {
                    intent.putExtra("enter_from", str);
                }
                if (z5 || z7) {
                    intent.putExtra("hide_nav_bar", true);
                }
                if (z6) {
                    intent.putExtra("hide_status_bar", true);
                }
                String queryParameter2 = parse.getQueryParameter("ad_id");
                if (!C6319n.m19593a(queryParameter2)) {
                    try {
                        intent.putExtra("ad_id", Long.parseLong(queryParameter2));
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    String a = C22998a.m75641a(decode, "push");
                    if (!C7573i.m23585a((Object) decode, (Object) a)) {
                        intent.putExtra("safeTemplate", true);
                    }
                    decode = a;
                }
                intent.setData(Uri.parse(decode));
                intent.putExtra("swipe_mode", 2);
                intent.putExtra("show_toolbar", true);
                if (z2) {
                    intent.putExtra("orientation", 0);
                }
                if (z3) {
                    intent.putExtra("bundle_no_hw_acceleration", z3);
                }
                if (z4) {
                    intent.putExtra("hide_more", z4);
                }
                if (!b) {
                    intent.putExtra("hide_more", b);
                }
                String queryParameter3 = parse.getQueryParameter("title");
                if (C6319n.m19593a(queryParameter3)) {
                    queryParameter3 = Uri.parse(decode).getQueryParameter("title");
                }
                String queryParameter4 = parse.getQueryParameter("title_extra");
                if (C6319n.m19593a(queryParameter4)) {
                    queryParameter4 = queryParameter3;
                }
                if (!C6319n.m19593a(queryParameter4)) {
                    intent.putExtra("title", queryParameter4);
                } else {
                    intent.putExtra("title", " ");
                    intent.putExtra("use_webview_title", true);
                }
                String queryParameter5 = parse.getQueryParameter("gd_label");
                if (!C6319n.m19593a(queryParameter5)) {
                    intent.putExtra("gd_label", queryParameter5);
                }
                String queryParameter6 = parse.getQueryParameter("gd_ext_json");
                if (!C6319n.m19593a(queryParameter6)) {
                    intent.putExtra("gd_ext_json", queryParameter6);
                }
                String queryParameter7 = parse.getQueryParameter("webview_track_key");
                if (!C6319n.m19593a(queryParameter7)) {
                    intent.putExtra("webview_track_key", queryParameter7);
                }
                String queryParameter8 = parse.getQueryParameter("wap_headers");
                if (!C6319n.m19593a(queryParameter8)) {
                    intent.putExtra("wap_headers", queryParameter8);
                }
                intent.putExtra("bundle_auto_play_audio", m75409a(parse.getQueryParameter("auto_play_bgm")));
                intent.putExtra("show_load_dialog", !m75409a(parse.getQueryParameter("hide_loading")));
                return intent;
            } catch (Exception unused2) {
                return null;
            }
        }

        /* renamed from: a */
        public final boolean mo59887a(Context context, String str, String str2) {
            boolean z = false;
            if (context == null) {
                return false;
            }
            try {
                if (!C6319n.m19593a(str)) {
                    Uri parse = Uri.parse(str);
                    if (C19929d.m65759a(str)) {
                        try {
                            if (C6399b.m19944t() && ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).tryOpenPolarisPage(context, str)) {
                                return true;
                            }
                            Intent intent = new Intent(context, CrossPlatformActivity.class);
                            intent.setData(parse);
                            intent.putExtra("swipe_mode", 2);
                            context.startActivity(intent);
                            return true;
                        } catch (Exception unused) {
                            z = true;
                        }
                    } else {
                        C7573i.m23582a((Object) parse, "uri");
                        String scheme = parse.getScheme();
                        C22910a aVar = C22909c.f60640d;
                        C7573i.m23582a((Object) scheme, "scheme");
                        boolean b = aVar.mo59884b(scheme);
                        String host = parse.getHost();
                        if (b && C7573i.m23585a((Object) m75408a(), (Object) host)) {
                            Intent a = mo59885a(context, parse);
                            if (a != null) {
                                a.putExtra("swipe_mode", 2);
                            }
                            if (a != null) {
                                context.startActivity(a);
                            }
                            return true;
                        } else if (!b) {
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setData(parse);
                            if (C6776h.m20944a(context, intent2)) {
                                intent2.putExtra(m75411b(), str);
                                context.startActivity(intent2);
                                return true;
                            } else if (C7634n.m23721b(scheme, C22910a.m75393a(), false)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(m75414d());
                                sb.append(scheme);
                                Intent intent3 = new Intent(sb.toString());
                                if (C6776h.m20944a(context, intent3)) {
                                    intent3.putExtra(m75411b(), str);
                                    context.startActivity(intent3);
                                    return true;
                                }
                            }
                        } else if (C19936f.m65765a() != null) {
                            Intent intent4 = new Intent(context, AwemeAppData.m74900i());
                            intent4.setData(parse);
                            intent4.putExtra(m75413c(), true);
                            context.startActivity(intent4);
                            return true;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.app.AwemeAppData");
                        }
                    }
                }
                if (!C6319n.m19593a(str2) && C6776h.m20948b(context, str2)) {
                    context.startActivity(C6776h.m20941a(context, str2));
                    return true;
                }
            } catch (Exception unused2) {
            }
            return z;
        }
    }

    /* renamed from: a */
    public static final Intent m75406a(Context context, Uri uri, boolean z) {
        return f60645e.mo59886a(context, uri, z);
    }
}
