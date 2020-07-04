package com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.C25330a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.C25337b;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.a.a */
public final class C25332a {

    /* renamed from: a */
    public static final C25332a f66718a = new C25332a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.a.a$a */
    public static final class C25333a {

        /* renamed from: a */
        public Long f66719a;

        /* renamed from: b */
        public String f66720b;

        /* renamed from: c */
        public String f66721c;

        /* renamed from: d */
        public String f66722d;

        /* renamed from: e */
        public int f66723e;

        public C25333a() {
            this(null, null, null, null, 0, 31, null);
        }

        public C25333a(Long l, String str, String str2, String str3) {
            this(l, str, str2, str3, 0, 16, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C25333a) {
                    C25333a aVar = (C25333a) obj;
                    if (C7573i.m23585a((Object) this.f66719a, (Object) aVar.f66719a) && C7573i.m23585a((Object) this.f66720b, (Object) aVar.f66720b) && C7573i.m23585a((Object) this.f66721c, (Object) aVar.f66721c) && C7573i.m23585a((Object) this.f66722d, (Object) aVar.f66722d)) {
                        if (this.f66723e == aVar.f66723e) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            Long l = this.f66719a;
            int i = 0;
            int hashCode = (l != null ? l.hashCode() : 0) * 31;
            String str = this.f66720b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f66721c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f66722d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return ((hashCode3 + i) * 31) + Integer.hashCode(this.f66723e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdWebUrlData(creativeId=");
            sb.append(this.f66719a);
            sb.append(", logExtra=");
            sb.append(this.f66720b);
            sb.append(", downloadUrl=");
            sb.append(this.f66721c);
            sb.append(", adType=");
            sb.append(this.f66722d);
            sb.append(", adSystemOrigin=");
            sb.append(this.f66723e);
            sb.append(")");
            return sb.toString();
        }

        private C25333a(Long l, String str, String str2, String str3, int i) {
            this.f66719a = l;
            this.f66720b = str;
            this.f66721c = str2;
            this.f66722d = str3;
            this.f66723e = i;
        }

        public /* synthetic */ C25333a(Long l, String str, String str2, String str3, int i, int i2, C7571f fVar) {
            String str4;
            String str5;
            String str6;
            if ((i2 & 1) != 0) {
                l = Long.valueOf(0);
            }
            if ((i2 & 2) != 0) {
                str4 = null;
            } else {
                str4 = str;
            }
            if ((i2 & 4) != 0) {
                str5 = null;
            } else {
                str5 = str2;
            }
            if ((i2 & 8) != 0) {
                str6 = null;
            } else {
                str6 = str3;
            }
            this(l, str4, str5, str6, 0);
        }
    }

    private C25332a() {
    }

    /* renamed from: a */
    private static boolean m83257a(String str, Context context, Aweme aweme) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        Uri parse = Uri.parse(str);
        if (!C6399b.m19944t()) {
            return false;
        }
        C7573i.m23582a((Object) parse, "uri");
        if (C7573i.m23585a((Object) parse.getScheme(), (Object) "market")) {
            if (!C25337b.m83261a(context)) {
                C25330a.m83246a(context, aweme, str);
                C10761a.m31399c(context, (int) R.string.e3).mo25750a();
            } else if (C25337b.m83262a(context, parse)) {
                C25330a.m83248b(context, aweme, str);
            }
            return true;
        } else if (C25337b.m83265a(parse)) {
            if (!C25337b.m83261a(context)) {
                return false;
            }
            if (C25337b.m83266b(context, parse)) {
                C25330a.m83248b(context, aweme, str);
            }
            return true;
        } else if (C25371n.m83464a(parse)) {
            if (!C25330a.m83251c(context, parse)) {
                return false;
            }
            if (C25330a.m83247a(context, parse)) {
                C25330a.m83248b(context, aweme, str);
            }
            return true;
        } else if (C25330a.m83252d(context, parse)) {
            if (C25330a.m83249b(context, parse)) {
                C25330a.m83248b(context, aweme, str);
            }
            return true;
        } else {
            if (!(!C7573i.m23585a((Object) C22909c.f60637a, (Object) parse.getScheme())) || !(!C7573i.m23585a((Object) C22909c.f60639c, (Object) parse.getScheme()))) {
                C22912d.f60645e.mo59887a(context, str, (String) null);
            } else {
                C25330a.m83246a(context, aweme, str);
            }
            C10761a.m31399c(context, (int) R.string.e3).mo25750a();
            return true;
        }
    }

    /* renamed from: a */
    public static final boolean m83256a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2, C25333a aVar) {
        CharSequence charSequence;
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (map != null && (!map.isEmpty())) {
            C19290j jVar = new C19290j(str);
            for (Entry entry : map.entrySet()) {
                jVar.mo51188a((String) entry.getKey(), (String) entry.getValue());
            }
            str = jVar.mo51184a();
        }
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        Uri data = intent.getData();
        Integer num = null;
        if (data != null) {
            charSequence = data.getQueryParameter("launch_mode");
        } else {
            charSequence = null;
        }
        if (!TextUtils.equals(charSequence, "standard")) {
            intent.setFlags(268435456);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("title", str2);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("hide_nav_bar", z);
        intent.putExtra("bundle_forbidden_jump", true);
        intent.putExtra("use_ordinary_web", z2);
        if (aVar != null) {
            if (!TextUtils.isEmpty(aVar.f66720b)) {
                intent.putExtra("bundle_download_app_log_extra", aVar.f66720b);
            }
            Long l = aVar.f66719a;
            if (l == null || l.longValue() != 0) {
                intent.putExtra("ad_id", aVar.f66719a);
                intent.putExtra("ad_type", aVar.f66722d);
                intent.putExtra("ad_system_origin", aVar.f66723e);
                intent.putExtra("aweme_creative_id", String.valueOf(aVar.f66719a));
            }
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl jsActlogUrl = inst.getJsActlogUrl();
            C7573i.m23582a((Object) jsActlogUrl, "SharePrefCache.inst().jsActlogUrl");
            String str3 = (String) jsActlogUrl.mo59877d();
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("ad_js_url", str3);
            }
            if (!TextUtils.isEmpty(aVar.f66721c)) {
                intent.putExtra("bundle_download_url", aVar.f66721c);
                intent.putExtra("bundle_is_from_app_ad", true);
                if (map != null) {
                    String str4 = (String) map.get("aweme_package_name");
                    String str5 = (String) map.get("bundle_app_ad_from");
                    if (str5 != null) {
                        num = Integer.valueOf(Integer.parseInt(str5));
                    }
                    intent.putExtra("bundle_app_ad_from", num);
                    intent.putExtra("aweme_package_name", str4);
                    if (num != null && num.intValue() == 6) {
                        intent.putExtra("bundle_is_from_comment_app_ad", true);
                    }
                }
            }
        }
        return C25371n.m83445a(context, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0200, code lost:
        if (r5 == null) goto L_0x0202;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m83255a(android.content.Context r25, com.p280ss.android.ugc.aweme.feed.model.Aweme r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, int r31) {
        /*
            r0 = r25
            r1 = r26
            r2 = r31
            r3 = 0
            if (r0 != 0) goto L_0x000a
            return r3
        L_0x000a:
            if (r1 != 0) goto L_0x000d
            return r3
        L_0x000d:
            boolean r4 = r26.isAd()
            if (r4 != 0) goto L_0x0014
            return r3
        L_0x0014:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r26.getAwemeRawAd()
            r5 = 1
            if (r27 != 0) goto L_0x0026
            if (r4 != 0) goto L_0x0020
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0020:
            java.lang.String r6 = r4.getWebUrl()
            r7 = 1
            goto L_0x0029
        L_0x0026:
            r6 = r27
            r7 = 0
        L_0x0029:
            if (r6 != 0) goto L_0x002f
            java.lang.String r6 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83161j(r26)
        L_0x002f:
            if (r6 != 0) goto L_0x0032
            return r3
        L_0x0032:
            android.net.Uri.parse(r6)
            boolean r8 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83156e(r26)
            if (r8 != 0) goto L_0x0041
            boolean r8 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83157f(r26)
            if (r8 == 0) goto L_0x0048
        L_0x0041:
            boolean r8 = m83257a(r6, r0, r1)
            if (r8 == 0) goto L_0x0048
            return r5
        L_0x0048:
            if (r28 != 0) goto L_0x0054
            if (r4 != 0) goto L_0x004f
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x004f:
            java.lang.String r8 = r4.getWebTitle()
            goto L_0x0056
        L_0x0054:
            r8 = r28
        L_0x0056:
            if (r4 != 0) goto L_0x005b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x005b:
            java.lang.Long r9 = r4.getCreativeId()
            java.lang.Long r10 = r4.getGroupId()
            java.lang.String r11 = r4.getLogExtra()
            java.lang.String r12 = r4.getDownloadUrl()
            java.lang.String r13 = ""
            org.json.JSONObject r13 = com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82274s(r0, r1, r13)
            java.lang.String r14 = r4.getPackageName()
            java.lang.String r15 = r4.getQuickAppUrl()
            r16 = r6
            java.lang.CharSequence r16 = (java.lang.CharSequence) r16
            boolean r16 = android.text.TextUtils.isEmpty(r16)
            if (r16 == 0) goto L_0x0084
            return r3
        L_0x0084:
            if (r30 == 0) goto L_0x0089
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82265p(r25, r26)
        L_0x0089:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r5 = com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r3.<init>(r0, r5)
            android.net.Uri r5 = android.net.Uri.parse(r6)
            r3.setData(r5)
            r5 = r8
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x00a8
            boolean r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r5 == 0) goto L_0x00a8
            java.lang.String r8 = " "
        L_0x00a8:
            r5 = r8
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00b7
            java.lang.String r5 = "title"
            r3.putExtra(r5, r8)
            goto L_0x00c4
        L_0x00b7:
            java.lang.String r5 = "title"
            java.lang.String r6 = " "
            r3.putExtra(r5, r6)
            java.lang.String r5 = "use_webview_title"
            r6 = 1
            r3.putExtra(r5, r6)
        L_0x00c4:
            java.lang.String r5 = "show_report"
            boolean r6 = r4.isReportEnable()
            r3.putExtra(r5, r6)
            r5 = r11
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00db
            java.lang.String r5 = "bundle_download_app_log_extra"
            r3.putExtra(r5, r11)
        L_0x00db:
            java.lang.String r5 = "bundle_app_ad_from"
            r3.putExtra(r5, r2)
            r5 = 0
            if (r9 != 0) goto L_0x00e5
            goto L_0x00ed
        L_0x00e5:
            long r17 = r9.longValue()
            int r8 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x011a
        L_0x00ed:
            java.lang.String r8 = "ad_id"
            java.lang.String r11 = "creativeId"
            kotlin.jvm.internal.C7573i.m23582a(r9, r11)
            long r5 = r9.longValue()
            r3.putExtra(r8, r5)
            java.lang.String r5 = "ad_type"
            java.lang.String r6 = r4.getType()
            r3.putExtra(r5, r6)
            java.lang.String r5 = "ad_system_origin"
            int r6 = r4.getSystemOrigin()
            r3.putExtra(r5, r6)
            java.lang.String r5 = "bundle_download_app_extra"
            long r17 = r9.longValue()
            java.lang.String r6 = java.lang.String.valueOf(r17)
            r3.putExtra(r5, r6)
        L_0x011a:
            com.ss.android.ugc.aweme.app.SharePrefCache r5 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r6 = "SharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            com.ss.android.ugc.aweme.app.bl r5 = r5.getJsActlogUrl()
            java.lang.String r6 = "SharePrefCache.inst().jsActlogUrl"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.lang.Object r5 = r5.mo59877d()
            java.lang.String r5 = (java.lang.String) r5
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0140
            java.lang.String r6 = "ad_js_url"
            r3.putExtra(r6, r5)
        L_0x0140:
            java.lang.String r5 = "bundle_disable_download_dialog"
            boolean r6 = r4.isDisableDownloadDialog()
            r3.putExtra(r5, r6)
            r5 = r12
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01f8
            java.lang.String r5 = "bundle_is_from_app_ad"
            r6 = 1
            r3.putExtra(r5, r6)
            java.lang.String r5 = "bundle_download_url"
            r3.putExtra(r5, r12)
            java.lang.String r5 = "aweme_package_name"
            r3.putExtra(r5, r14)
            java.lang.String r5 = "bundle_ad_quick_app_url"
            r3.putExtra(r5, r15)
            java.lang.String r5 = "bundle_download_app_name"
            java.lang.String r8 = r4.getAppName()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != r6) goto L_0x017a
            java.lang.String r6 = r4.getWebTitle()
            goto L_0x0180
        L_0x017a:
            if (r8 != 0) goto L_0x01f2
            java.lang.String r6 = r4.getAppName()
        L_0x0180:
            r3.putExtra(r5, r6)
            java.lang.String r5 = "bundle_download_mode"
            int r6 = r4.getDownloadMode()
            r3.putExtra(r5, r6)
            java.lang.String r5 = "bundle_link_mode"
            int r6 = r4.getLinkMode()
            r3.putExtra(r5, r6)
            java.lang.String r5 = "bundle_support_multiple_download"
            boolean r6 = r4.isSupportMultiple()
            r3.putExtra(r5, r6)
            java.lang.String r5 = "bundle_web_url"
            java.lang.String r6 = r4.getWebUrl()
            r3.putExtra(r5, r6)
            java.lang.String r5 = "bundle_web_title"
            java.lang.String r6 = r4.getWebTitle()
            r3.putExtra(r5, r6)
            java.lang.String r5 = r4.getOpenUrl()
            boolean r6 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83361c(r5)
            if (r6 == 0) goto L_0x01ec
            java.lang.String r6 = com.p280ss.android.ugc.aweme.commercialize.p1114a.C24504a.C24505a.f64678a
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            r8 = 5
            if (r2 != r8) goto L_0x01ce
            java.lang.String r2 = "tag"
            java.lang.String r8 = "result_ad"
            r6.appendQueryParameter(r2, r8)
        L_0x01ce:
            java.lang.String r2 = "openUrl"
            kotlin.jvm.internal.C7573i.m23582a(r5, r2)
            java.lang.String r20 = "__back_url__"
            java.lang.String r2 = r6.toString()
            java.lang.String r6 = "backUrlBuilder.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r6)
            r22 = 0
            r23 = 4
            r24 = 0
            r19 = r5
            r21 = r2
            java.lang.String r5 = kotlin.text.C7634n.m23711a(r19, r20, r21, false)
        L_0x01ec:
            java.lang.String r2 = "bundle_open_url"
            r3.putExtra(r2, r5)
            goto L_0x01f8
        L_0x01f2:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01f8:
            java.lang.String r2 = "aweme_json_extra"
            if (r13 == 0) goto L_0x0202
            java.lang.String r5 = r13.toString()
            if (r5 != 0) goto L_0x0204
        L_0x0202:
            java.lang.String r5 = ""
        L_0x0204:
            r3.putExtra(r2, r5)
            if (r10 == 0) goto L_0x0221
            long r5 = r10.longValue()
            r11 = 0
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0223
            java.lang.String r2 = "aweme_group_id"
            long r5 = r10.longValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.putExtra(r2, r5)
            goto L_0x0223
        L_0x0221:
            r11 = 0
        L_0x0223:
            long r5 = r9.longValue()
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0238
            java.lang.String r2 = "aweme_creative_id"
            long r5 = r9.longValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.putExtra(r2, r5)
        L_0x0238:
            r2 = r14
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0246
            java.lang.String r2 = "aweme_package_name"
            r3.putExtra(r2, r14)
        L_0x0246:
            boolean r2 = r4.isUseDefaultColor()
            if (r2 == 0) goto L_0x025d
            java.lang.String r2 = "bundle_webview_background"
            android.content.res.Resources r5 = r25.getResources()
            r6 = 2131100871(0x7f0604c7, float:1.7814136E38)
            int r5 = r5.getColor(r6)
            r3.putExtra(r2, r5)
            goto L_0x0263
        L_0x025d:
            java.lang.String r2 = "bundle_webview_background"
            r5 = -1
            r3.putExtra(r2, r5)
        L_0x0263:
            java.lang.String r2 = "aweme_id"
            java.lang.String r5 = r26.getAid()
            r3.putExtra(r2, r5)
            java.lang.String r2 = "owner_id"
            java.lang.String r5 = r26.getAuthorUid()
            r3.putExtra(r2, r5)
            java.lang.String r2 = "bundle_forbidden_jump"
            r5 = 1
            r3.putExtra(r2, r5)
            java.lang.String r2 = "use_ordinary_web"
            r5 = r29
            r3.putExtra(r2, r5)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r2)
            com.ss.android.ugc.aweme.commercialize.feed.preload.PreloadData r2 = r4.getPreloadData()
            if (r2 == 0) goto L_0x0296
            java.lang.String r5 = "preload_site_id"
            java.lang.String r2 = r2.getSiteId()
            r3.putExtra(r5, r2)
        L_0x0296:
            int r2 = r4.getPreloadWeb()
            java.lang.String r5 = "preload_web_status"
            r3.putExtra(r5, r2)
            java.lang.String r2 = "preload_is_web_url"
            r3.putExtra(r2, r7)
            java.lang.String r2 = "web_type"
            int r5 = r4.getWebType()
            r3.putExtra(r2, r5)
            java.lang.String r2 = "enable_web_report"
            boolean r5 = r4.isEnableWebReport()
            r3.putExtra(r2, r5)
            java.lang.String r2 = "webview_progress_bar"
            int r4 = r4.getWebviewProgressBar()
            r6 = 1
            if (r4 != r6) goto L_0x02c0
            goto L_0x02c1
        L_0x02c0:
            r6 = 0
        L_0x02c1:
            r3.putExtra(r2, r6)
            com.p280ss.android.ugc.aweme.commercialize.utils.C25252aw.m83005a(r26)
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83445a(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a.C25332a.m83255a(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean, boolean, int):boolean");
    }
}
