package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.support.p022v4.app.C0608j;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.C23018p;
import com.p280ss.android.ugc.aweme.commerce.model.CommerceActivityStruct;
import com.p280ss.android.ugc.aweme.commercialize.C24558c;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.p1114a.C24504a.C24505a;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24560b;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24565f;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24566g;
import com.p280ss.android.ugc.aweme.commercialize.p1121d.C24613b;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25203e;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.C25337b;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.C25338c;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.C25340d;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a.C25332a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a.C25332a.C25333a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a.C25334b;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a.C25336d;
import com.p280ss.android.ugc.aweme.commercialize.views.AdLightWebPageView;
import com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.C25627b;
import com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.C25627b.C25628a;
import com.p280ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.p280ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p280ss.android.ugc.aweme.feed.model.StarAtlasLink;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.miniapp.utils.C33419c;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.qrcode.p1498d.C37073c;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.n */
public final class C25371n {

    /* renamed from: a */
    private static final String[] f66779a = {"webcast_room"};

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.n$a */
    public interface C25372a {
        /* renamed from: a */
        void mo61517a(boolean z);
    }

    /* renamed from: a */
    private static boolean m83441a(int i) {
        return (i == 22 || i == 23 || i == 24) ? false : true;
    }

    /* renamed from: a */
    public static boolean m83454a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C25337b.m83266b(context, Uri.parse(str));
    }

    /* renamed from: a */
    public static boolean m83443a(Context context) {
        return C25337b.m83261a(context);
    }

    /* renamed from: a */
    public static boolean m83446a(Context context, Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return m83471b(context, aweme.getAwemeRawAd().getPackageName());
    }

    /* renamed from: a */
    public static boolean m83464a(Uri uri) {
        return uri != null && (TextUtils.equals(WebKitApi.SCHEME_HTTP, uri.getScheme()) || TextUtils.equals(WebKitApi.SCHEME_HTTPS, uri.getScheme()));
    }

    /* renamed from: a */
    public static boolean m83457a(Context context, String str, Aweme aweme, boolean z) {
        return m83458a(context, str, aweme, z, true);
    }

    /* renamed from: a */
    public static boolean m83458a(Context context, String str, Aweme aweme, boolean z, boolean z2) {
        if (context == null || aweme == null || !aweme.isAd() || TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            return false;
        }
        Uri build = parse.buildUpon().appendQueryParameter("source_aid", aweme.getAid()).build();
        String lowerCase = build.getScheme().toLowerCase();
        if (m83482d(str) && aweme.getAwemeRawAd() != null) {
            build = build.buildUpon().appendQueryParameter("creative_id", aweme.getAwemeRawAd().getCreativeIdStr()).appendQueryParameter("log_extra", aweme.getAwemeRawAd().getLogExtra()).build();
            str = build.toString();
        }
        if (m83486e(lowerCase)) {
            C25340d.m83270a(str);
            C22912d.f60645e.mo59887a(context, str, (String) null);
            C24976t.m82079a(str);
            return true;
        } else if (z) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(build);
            if (!C6776h.m20944a(context, intent)) {
                return false;
            }
            if (str.contains("__back_url__")) {
                str = str.replace("__back_url__", Uri.encode(C24505a.f64678a));
                intent.setData(Uri.parse(str));
                C1592h.m7853a((Callable<TResult>) new C25373o<TResult>(aweme));
            }
            intent.putExtra(C22912d.f60642b, str);
            intent.addFlags(268435456);
            if (!m83445a(context, intent)) {
                return false;
            }
            boolean an = C25352e.m83342an(aweme);
            if (z2 && !an) {
                C24976t.m82253m(context, aweme);
                m83440a((C25372a) new C25374p(context, aweme));
            }
            return true;
        }
    }

    /* renamed from: a */
    public static void m83440a(C25372a aVar) {
        C1592h.m7848a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo6875a((C1591g<TResult, TContinuationResult>) new C25375q<TResult,TContinuationResult>(aVar));
    }

    /* renamed from: a */
    public static boolean m83463a(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C33447f.m108191d(str)) {
            C7167b.m22380b().mo18647a().openMiniApp(context, str, new C33472a().mo85790a());
            return true;
        }
        if (str.contains("__back_url__")) {
            str = str.replace("__back_url__", Uri.encode(C24505a.f64678a));
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        if (m83486e(scheme.toLowerCase())) {
            C25340d.m83270a(str);
            C22912d.f60645e.mo59887a(context, str, (String) null);
            return true;
        } else if (C37073c.m119203c(str)) {
            C7195s.m22438a().mo18682a(str);
            return true;
        } else if (z) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (!C6776h.m20944a(context, intent)) {
                return false;
            }
            intent.putExtra(C22912d.f60642b, str);
            if (!m83445a(context, intent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m83466a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (m83486e(Uri.parse(str).getScheme()) || C37073c.m119203c(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m83450a(Context context, Aweme aweme, String str, String str2) {
        return m83451a(context, aweme, str, str2, aweme == null || (aweme.isAd() && aweme.getAwemeRawAd().isUseOrdinaryWeb()));
    }

    /* renamed from: a */
    private static boolean m83451a(Context context, Aweme aweme, String str, String str2, boolean z) {
        return m83452a(context, aweme, str, str2, z, true);
    }

    /* renamed from: a */
    private static boolean m83452a(Context context, Aweme aweme, String str, String str2, boolean z, boolean z2) {
        return m83453a(context, aweme, str, str2, z, true, 1);
    }

    /* renamed from: a */
    public static boolean m83453a(Context context, Aweme aweme, String str, String str2, boolean z, boolean z2, int i) {
        return C25332a.m83255a(context, aweme, str, str2, z, z2, i);
    }

    /* renamed from: a */
    public static boolean m83459a(Context context, String str, String str2) {
        return m83460a(context, str, str2, false, null);
    }

    /* renamed from: a */
    public static boolean m83460a(Context context, String str, String str2, boolean z, Map<String, String> map) {
        return m83461a(context, str, str2, z, map, true);
    }

    /* renamed from: a */
    private static boolean m83461a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2) {
        return m83462a(context, str, str2, z, map, z2, (C25333a) null);
    }

    /* renamed from: a */
    public static boolean m83462a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2, C25333a aVar) {
        return C25332a.m83256a(context, str, str2, z, map, z2, aVar);
    }

    /* renamed from: a */
    public static boolean m83442a(Activity activity, Aweme aweme, C0608j jVar, int i) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return m83456a((Context) activity, aweme.getAwemeRawAd().getFormUrl(), aweme, i);
    }

    /* renamed from: a */
    public static boolean m83456a(Context context, String str, Aweme aweme, int i) {
        return C25334b.m83258a(context, str, aweme, i);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m83449a(android.content.Context r7, com.p280ss.android.ugc.aweme.feed.model.Aweme r8, com.p280ss.android.ugc.aweme.commercialize.feed.C24723e r9, int r10, com.p280ss.android.ugc.aweme.commercialize.p1121d.C24613b r11) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            if (r8 != 0) goto L_0x0007
            return r0
        L_0x0007:
            boolean r1 = r8.isAd()
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            if (r9 != 0) goto L_0x0015
            com.ss.android.ugc.aweme.commercialize.feed.e r9 = new com.ss.android.ugc.aweme.commercialize.feed.e
            r9.<init>()
        L_0x0015:
            r9.mo64699a(r7, r8)
            boolean r1 = r9.mo64705a()
            if (r1 != 0) goto L_0x001f
            return r0
        L_0x001f:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r8.getAwemeRawAd()
            java.lang.String r1 = r1.getType()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x002e
            return r0
        L_0x002e:
            boolean r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            r3 = 5
            r4 = 4
            r5 = 1
            if (r2 == 0) goto L_0x003f
            java.lang.String r2 = "app"
            boolean r2 = android.text.TextUtils.equals(r1, r2)
            if (r2 != 0) goto L_0x005a
        L_0x003f:
            if (r10 == r5) goto L_0x010a
            r2 = 34
            if (r10 == r2) goto L_0x010a
            r2 = 18
            if (r10 == r2) goto L_0x010a
            if (r10 == r4) goto L_0x010a
            r2 = 22
            if (r10 == r2) goto L_0x010a
            if (r10 == r3) goto L_0x010a
            r2 = 23
            if (r10 == r2) goto L_0x010a
            r2 = 7
            if (r10 != r2) goto L_0x005a
            goto L_0x010a
        L_0x005a:
            r2 = 11
            if (r10 == r2) goto L_0x0105
            r2 = 14
            if (r10 == r2) goto L_0x0105
            r2 = 12
            if (r10 == r2) goto L_0x0105
            r2 = 13
            if (r10 == r2) goto L_0x0105
            r2 = 15
            if (r10 == r2) goto L_0x0105
            r2 = 27
            if (r10 == r2) goto L_0x0105
            r2 = 30
            if (r10 == r2) goto L_0x0105
            r2 = 28
            if (r10 == r2) goto L_0x0105
            r2 = 29
            if (r10 == r2) goto L_0x0105
            r2 = 31
            if (r10 == r2) goto L_0x0105
            r2 = 20
            if (r10 == r2) goto L_0x0105
            r2 = 19
            if (r10 == r2) goto L_0x0105
            r2 = 21
            if (r10 != r2) goto L_0x0090
            goto L_0x0105
        L_0x0090:
            r2 = -1
            int r6 = r1.hashCode()
            switch(r6) {
                case -1354573786: goto L_0x00d5;
                case 96801: goto L_0x00cb;
                case 117588: goto L_0x00c1;
                case 3083120: goto L_0x00b7;
                case 3148996: goto L_0x00ad;
                case 957829685: goto L_0x00a3;
                case 1893962841: goto L_0x0099;
                default: goto L_0x0098;
            }
        L_0x0098:
            goto L_0x00df
        L_0x0099:
            java.lang.String r3 = "redpacket"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00df
            r1 = 4
            goto L_0x00e0
        L_0x00a3:
            java.lang.String r4 = "counsel"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00df
            r1 = 5
            goto L_0x00e0
        L_0x00ad:
            java.lang.String r3 = "form"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00df
            r1 = 3
            goto L_0x00e0
        L_0x00b7:
            java.lang.String r3 = "dial"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00df
            r1 = 2
            goto L_0x00e0
        L_0x00c1:
            java.lang.String r3 = "web"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00df
            r1 = 0
            goto L_0x00e0
        L_0x00cb:
            java.lang.String r3 = "app"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00df
            r1 = 1
            goto L_0x00e0
        L_0x00d5:
            java.lang.String r3 = "coupon"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00df
            r1 = 6
            goto L_0x00e0
        L_0x00df:
            r1 = -1
        L_0x00e0:
            switch(r1) {
                case 0: goto L_0x0100;
                case 1: goto L_0x00fc;
                case 2: goto L_0x00f8;
                case 3: goto L_0x00f3;
                case 4: goto L_0x00ee;
                case 5: goto L_0x00e9;
                case 6: goto L_0x00e4;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            return r0
        L_0x00e4:
            boolean r7 = m83475c(r7, r8, r9, r10)
            return r7
        L_0x00e9:
            boolean r7 = m83448a(r7, r8, r9, r10)
            return r7
        L_0x00ee:
            boolean r7 = m83488f(r7, r8, r9, r10)
            return r7
        L_0x00f3:
            boolean r7 = m83485e(r7, r8, r9, r10)
            return r7
        L_0x00f8:
            m83480d(r7, r8, r9, r10)
            return r0
        L_0x00fc:
            m83467b(r7, r8, r9, r10, r11)
            return r0
        L_0x0100:
            boolean r7 = m83469b(r7, r8, r9, r10)
            return r7
        L_0x0105:
            boolean r7 = m83469b(r7, r8, r9, r10)
            return r7
        L_0x010a:
            boolean r7 = m83469b(r7, r8, r9, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83449a(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.commercialize.feed.e, int, com.ss.android.ugc.aweme.commercialize.d.b):boolean");
    }

    /* renamed from: a */
    private static boolean m83448a(Context context, Aweme aweme, C24723e eVar, int i) {
        eVar.mo64706a(i);
        if (!aweme.isAd() || !m83451a(context, aweme, aweme.getAwemeRawAd().getConsultUrl(), aweme.getAwemeRawAd().getWebTitle(), true)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m83444a(Context context, int i) {
        return m83493h(context, PreRenderWebViewBusiness.m85052a(i));
    }

    /* renamed from: a */
    public static boolean m83465a(C25627b bVar) {
        if (bVar == null || bVar.f67496a == null || bVar.f67497b == null) {
            return false;
        }
        int i = bVar.f67499d;
        if (((i == 7 || i == 8) && m83472b(bVar)) || m83477c(bVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m83447a(Context context, Aweme aweme, int i) {
        if (context == null || aweme == null) {
            return false;
        }
        return m83465a(new C25628a().mo66449a(context).mo66450a(aweme.getAwemeRawAd()).mo66453b(i).mo66452a());
    }

    /* renamed from: a */
    public static void m83439a(Context context, String str, String str2, String str3) {
        if (!m83463a(context, str2, false)) {
            m83459a(context, str, str3);
        }
    }

    /* renamed from: a */
    public static void m83438a(Context context, StarAtlasLink starAtlasLink, Aweme aweme, boolean z) {
        if (context != null && starAtlasLink != null) {
            String openUrl = starAtlasLink.getOpenUrl();
            if (!TextUtils.isEmpty(starAtlasLink.getOpenUrl()) && C33447f.m108191d(openUrl)) {
                StringBuilder sb = new StringBuilder();
                sb.append(openUrl);
                sb.append("&schema_from=ad_link");
                String sb2 = sb.toString();
                if (z) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("&position=comment_page");
                    openUrl = sb3.toString();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb2);
                    sb4.append("&position=in_video_tag");
                    openUrl = sb4.toString();
                }
            }
            if (!m83463a(context, openUrl, false) && !C6399b.m19944t()) {
                m83459a(context, starAtlasLink.getWebUrl(), (String) null);
            }
        }
    }

    /* renamed from: a */
    public static boolean m83455a(Context context, String str, int i) {
        if (!C7163a.m22363a() || i != 1 || TextUtils.isEmpty(str)) {
            return false;
        }
        Aweme aweme = new Aweme();
        aweme.setAid("333333");
        User user = new User();
        user.setUid("555555");
        aweme.setAuthor(user);
        aweme.setAd(true);
        AwemeRawAd awemeRawAd = new AwemeRawAd();
        awemeRawAd.setAdId(Long.valueOf(111111));
        awemeRawAd.setCreativeId(Long.valueOf(222222));
        awemeRawAd.setGroupId(Long.valueOf(333333));
        awemeRawAd.setWebUrl(str);
        awemeRawAd.setWebTitle("广告落地页预览");
        awemeRawAd.setLogExtra("{\"ad_price\":\"W4TIUQABX3hbhMhRAAFfePDQH8YqAQbTcEzyvg\",\"convert_id\":0,\"orit\":40001,\"req_id\":\"20180828115808010015077103721B7D\",\"rit\":40001}");
        aweme.setAwemeRawAd(awemeRawAd);
        m83474c(context, aweme);
        return true;
    }

    /* renamed from: a */
    public static boolean m83445a(Context context, Intent intent) {
        if (context == null || intent == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException | SecurityException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m83429a(Aweme aweme) throws Exception {
        try {
            C24558c.m80613a().f64800a = aweme;
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m83472b(C25627b bVar) {
        if (bVar == null || bVar.f67496a == null || bVar.f67497b == null || !(bVar.f67496a instanceof Activity) || !AdPopUpWebPageWidget.m84242a(bVar.f67497b) || !AdPopUpWebPageWidget.m84241a(bVar)) {
            return false;
        }
        C42961az.m136380a(new C24560b(1));
        return true;
    }

    /* renamed from: c */
    private static boolean m83477c(C25627b bVar) {
        if (bVar == null || bVar.f67496a == null || bVar.f67497b == null || !(bVar.f67496a instanceof Activity) || !AdPopUpWebPageWidget.m84243a(bVar.f67497b, bVar.f67500e) || !AdPopUpWebPageWidget.m84241a(bVar)) {
            return false;
        }
        C42961az.m136380a(new C24560b(1));
        return true;
    }

    /* renamed from: d */
    private static boolean m83482d(String str) {
        if (str == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            for (String equals : f66779a) {
                if (TextUtils.equals(equals, parse.getHost())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m83486e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.equals(C22909c.f60637a, lowerCase) || TextUtils.equals(C22909c.f60639c, lowerCase)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m83473b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return false;
        }
        String lowerCase = parse.getScheme().toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        if (m83486e(lowerCase)) {
            return true;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        return C6776h.m20944a((Context) AwemeApplication.m21341a(), intent);
    }

    /* renamed from: c */
    public static boolean m83478c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return false;
        }
        String lowerCase = parse.getScheme().toLowerCase();
        if (TextUtils.isEmpty(lowerCase) || m83486e(lowerCase)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        return C6776h.m20944a((Context) AwemeApplication.m21341a(), intent);
    }

    /* renamed from: d */
    public static void m83481d(Context context, String str) {
        C25336d.m83260a(context, str);
    }

    /* renamed from: b */
    public static boolean m83468b(Context context, Aweme aweme) {
        return m83470b(context, aweme, false);
    }

    /* renamed from: c */
    public static void m83474c(Context context, Aweme aweme) {
        m83450a(context, aweme, (String) null, (String) null);
    }

    /* renamed from: b */
    public static boolean m83471b(Context context, String str) {
        if (!C6399b.m19944t()) {
            return false;
        }
        return C25337b.m83264a(context, str);
    }

    /* renamed from: e */
    public static boolean m83484e(Context context, Aweme aweme) {
        if (context != null && C25352e.m83345aq(aweme)) {
            return m83489f(context, aweme.getAwemeRawAd().getWebUrl());
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m83493h(Context context, String str) {
        if (!(context instanceof Activity) || !AdLightWebPageView.m83597a((Activity) context, str)) {
            return false;
        }
        C42961az.m136380a(new C24560b(1));
        return true;
    }

    /* renamed from: a */
    static final /* synthetic */ Void m83430a(C25372a aVar, C1592h hVar) throws Exception {
        boolean z;
        if (C23018p.m75672a().mo59989b() || System.currentTimeMillis() - C23018p.m75672a().mo59992e() < DouPlusShareGuideExperiment.MIN_VALID_DURATION) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo61517a(z);
        return null;
    }

    /* renamed from: c */
    public static boolean m83476c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder("tel:");
        sb.append(Uri.encode(str));
        return m83445a(context, new Intent("android.intent.action.DIAL", Uri.parse(sb.toString())));
    }

    /* renamed from: d */
    public static void m83479d(Context context, Aweme aweme) {
        if (context != null && aweme != null && aweme.getAwemeRawAd() != null) {
            String phoneNumber = aweme.getAwemeRawAd().getPhoneNumber();
            if (!TextUtils.isEmpty(phoneNumber)) {
                StringBuilder sb = new StringBuilder("tel:");
                sb.append(phoneNumber);
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(sb.toString()));
                intent.setFlags(268435456);
                m83445a(context, intent);
            }
        }
    }

    /* renamed from: e */
    public static void m83483e(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("mailto:");
            sb.append(str);
            m83445a(context, new Intent("android.intent.action.SENDTO", Uri.parse(sb.toString())));
        }
    }

    /* renamed from: f */
    public static boolean m83489f(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return m83445a(context, Intent.createChooser(intent, ""));
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m83491g(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        String path = Uri.parse(str).getPath();
        if (TextUtils.isEmpty(path) || !C6399b.m19944t() || !path.endsWith(".apk")) {
            return false;
        }
        if (!m83489f(context, str)) {
            C10761a.m31403c(context, context.getString(R.string.cjm)).mo25750a();
        }
        return true;
    }

    /* renamed from: h */
    private static void m83492h(Context context, Aweme aweme) {
        if (aweme != null && aweme.isAd() && !m83457a(context, aweme.getAwemeRawAd().getRedOpenUrl(), aweme, true) && !C33419c.m108078a(context, aweme)) {
            m83451a(context, aweme, aweme.getAwemeRawAd().getRedUrl(), (String) null, aweme.getAwemeRawAd().isUseOrdinaryWeb());
        }
    }

    /* renamed from: f */
    public static boolean m83487f(Context context, Aweme aweme) {
        boolean z;
        if (context == null || aweme == null || aweme.getSpecialSticker() == null) {
            return false;
        }
        String openUrl = aweme.getSpecialSticker().getOpenUrl();
        if (!TextUtils.isEmpty(openUrl)) {
            return m83463a(context, openUrl, false);
        }
        String linkUrl = aweme.getSpecialSticker().getLinkUrl();
        if (C25352e.m83221d(aweme)) {
            z = aweme.getAwemeRawAd().isUseOrdinaryWeb();
        } else {
            z = true;
        }
        return m83461a(context, linkUrl, aweme.getSpecialSticker().getTitle(), false, null, z);
    }

    /* renamed from: g */
    public static boolean m83490g(Context context, Aweme aweme) {
        if (aweme.getActivityPendant() == null) {
            return false;
        }
        CommerceActivityStruct activityPendant = aweme.getActivityPendant();
        if (!TextUtils.isEmpty(activityPendant.getJumpOpenUrl()) && m83463a(context, activityPendant.getJumpOpenUrl(), false)) {
            return true;
        }
        if (TextUtils.isEmpty(activityPendant.getJumpWebUrl())) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            return m83462a(context, activityPendant.getJumpWebUrl(), activityPendant.getTitle(), false, null, awemeRawAd.isUseOrdinaryWeb(), new C25333a(awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), awemeRawAd.getDownloadUrl(), awemeRawAd.getType()));
        }
        return m83461a(context, activityPendant.getJumpWebUrl(), activityPendant.getTitle(), false, null, false);
    }

    /* renamed from: b */
    private static boolean m83470b(Context context, Aweme aweme, boolean z) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return m83457a(context, aweme.getAwemeRawAd().getOpenUrl(), aweme, false);
    }

    /* renamed from: a */
    public static void m83433a(Context context, Aweme aweme, String str) {
        new C10741a(context).mo25657b((int) R.string.e7).mo25650a((int) R.string.afn, (OnClickListener) new C25376r(context, aweme, str)).mo25658b((int) R.string.w_, (OnClickListener) new C25377s(context, aweme)).mo25656a().mo25637a();
        C24976t.m82277t(context, aweme);
    }

    /* renamed from: a */
    public static void m83435a(Context context, Aweme aweme, Map<String, String> map) {
        if (C25352e.m83231n(aweme)) {
            C24976t.m82196d(context, aweme, map);
            C24976t.m82055a(context, aweme, (String) null, map);
            if (!C25352e.m83229l(aweme).getSplashInfo().isEnableSplashOpen()) {
                m83450a(context, aweme, (String) null, (String) null);
            } else if (!m83468b(context, aweme)) {
                IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
                if (iPluginService == null || !C6861a.m21337f().isLogin() || !iPluginService.mo26457a("com.ss.android.ugc.aweme.miniapp") || !C33419c.m108078a(context, aweme)) {
                    m83450a(context, aweme, (String) null, (String) null);
                }
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m83436a(Context context, Aweme aweme, boolean z) {
        if (z) {
            C24976t.m82257n(context, aweme);
        } else {
            C24976t.m82261o(context, aweme);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m83432a(Context context, Aweme aweme, DialogInterface dialogInterface, int i) {
        C24976t.m82281u(context, aweme);
        dialogInterface.dismiss();
    }

    /* renamed from: f */
    private static boolean m83488f(Context context, Aweme aweme, C24723e eVar, int i) {
        eVar.mo64706a(i);
        m83492h(context, aweme);
        return false;
    }

    /* renamed from: a */
    public static void m83431a(Context context, LinkData linkData, Aweme aweme, boolean z) {
        if (context != null && linkData != null) {
            if (!(linkData == null || !m83482d(linkData.openUrl) || aweme.getAwemeRawAd() == null)) {
                linkData.openUrl = Uri.parse(linkData.openUrl).buildUpon().appendQueryParameter("creative_id", aweme.getAwemeRawAd().getCreativeIdStr()).appendQueryParameter("log_extra", aweme.getAwemeRawAd().getLogExtra()).build().toString();
            }
            C25203e.m82890a(context, linkData, aweme, z);
        }
    }

    /* renamed from: b */
    private static boolean m83469b(Context context, Aweme aweme, C24723e eVar, int i) {
        boolean z;
        if (m83484e(context, aweme)) {
            eVar.mo64706a(i);
            return true;
        } else if (!eVar.mo64706a(i) || eVar.mo64708c() || !m83441a(i)) {
            if (C25338c.m83267a(context, aweme) || m83468b(context, aweme) || C33419c.m108078a(context, aweme)) {
                return false;
            }
            if (m83447a(context, aweme, i) || m83444a(context, i)) {
                return true;
            }
            if (i == 34) {
                if (aweme == null || (aweme.isAd() && aweme.getAwemeRawAd().isUseOrdinaryWeb())) {
                    z = true;
                } else {
                    z = false;
                }
                m83453a(context, aweme, (String) null, (String) null, z, true, 5);
            } else {
                m83474c(context, aweme);
            }
            return false;
        } else if (m83447a(context, aweme, i) || m83444a(context, i)) {
            return true;
        } else {
            C25340d.m83268a(context);
            return true;
        }
    }

    /* renamed from: c */
    private static boolean m83475c(Context context, Aweme aweme, C24723e eVar, int i) {
        boolean a = eVar.mo64706a(i);
        if ((i == 2 || i == 6 || i == 3 || i == 8) && C25352e.m83328a(C25352e.m83204F(aweme))) {
            C42961az.m136380a(new C24565f(aweme, i));
            if (i == 6) {
                return true;
            }
            return false;
        } else if (a && !eVar.mo64708c()) {
            C25340d.m83268a(context);
            return true;
        } else if (m83468b(context, aweme) || C33419c.m108078a(context, aweme)) {
            return false;
        } else {
            m83474c(context, aweme);
            return false;
        }
    }

    /* renamed from: d */
    private static void m83480d(Context context, Aweme aweme, C24723e eVar, int i) {
        eVar.mo64706a(i);
        if (TextUtils.isEmpty(aweme.getAwemeRawAd().getPhoneKey()) || !(context instanceof Activity)) {
            m83479d(context, aweme);
            return;
        }
        C25280bm.m83074a().mo65890a((Activity) context, aweme, C24976t.m82024a(i));
    }

    /* renamed from: e */
    private static boolean m83485e(Context context, Aweme aweme, C24723e eVar, int i) {
        eVar.mo64706a(i);
        if (i == 3 || i == 4 || i == 22 || i == 5 || i == 23 || i == 6) {
            if ((eVar.mo64708c() && m83468b(context, aweme)) || C33419c.m108078a(context, aweme)) {
                return false;
            }
            if (m83447a(context, aweme, i) || m83444a(context, i)) {
                return true;
            }
            m83474c(context, aweme);
            return false;
        } else if (m83447a(context, aweme, i) || m83444a(context, i)) {
            return true;
        } else {
            C42961az.m136380a(new C24566g(aweme, i));
            return true;
        }
    }

    /* renamed from: a */
    public static void m83437a(Context context, NationalTaskLink nationalTaskLink, Aweme aweme, boolean z) {
        if (context != null && nationalTaskLink != null) {
            String openUrl = nationalTaskLink.getOpenUrl();
            if (!TextUtils.isEmpty(nationalTaskLink.getOpenUrl()) && C33447f.m108191d(openUrl)) {
                StringBuilder sb = new StringBuilder();
                sb.append(openUrl);
                sb.append("&schema_from=ad_link");
                String sb2 = sb.toString();
                if (z) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("&position=comment_page");
                    openUrl = sb3.toString();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb2);
                    sb4.append("&position=in_video_tag");
                    openUrl = sb4.toString();
                }
            }
            if (!m83463a(context, openUrl, false) && !C6399b.m19944t()) {
                m83459a(context, nationalTaskLink.getWebUrl(), (String) null);
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m83434a(Context context, Aweme aweme, String str, DialogInterface dialogInterface, int i) {
        m83468b(context, aweme);
        C24976t.m82284v(context, aweme);
        C24976t.m82204e(context, aweme, str);
        dialogInterface.dismiss();
    }

    /* renamed from: b */
    private static void m83467b(Context context, Aweme aweme, C24723e eVar, int i, C24613b bVar) {
        eVar.mo64706a(i);
        if ((eVar.mo64708c() && m83468b(context, aweme)) || C33419c.m108078a(context, aweme)) {
            return;
        }
        if (C25329c.m83210L(aweme) && m83444a(context, i)) {
            return;
        }
        if (C6399b.m19944t()) {
            m83446a(context, aweme);
        } else {
            bVar.mo58895a();
        }
    }
}
