package com.p280ss.android.ugc.aweme.splash;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.p817ad.splash.C19142i;
import com.p280ss.android.p817ad.splash.C19142i.C19145b;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.p1114a.C24504a.C24505a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.p1685ug.poloris.C42722c;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.splash.n */
public final class C41752n {
    /* renamed from: a */
    static boolean m132949a(Context context, C19142i iVar, C41746k kVar) {
        if (iVar == null) {
            return false;
        }
        List<C19145b> list = iVar.f51741j;
        if (C6307b.m19566a((Collection<T>) list)) {
            return false;
        }
        for (C19145b bVar : list) {
            if (bVar != null) {
                String str = bVar.f51752a;
                int i = bVar.f51753b;
                if (!TextUtils.isEmpty(str)) {
                    long j = iVar.f51732a;
                    String str2 = iVar.f51734c;
                    switch (i) {
                        case 1:
                        case 3:
                        case 4:
                            m132950a(context, str, Long.valueOf(j), str2, kVar);
                            return true;
                        case 2:
                            if (!m132951a(context, str, iVar.f51738g, Long.valueOf(j), str2)) {
                                break;
                            } else {
                                return true;
                            }
                        case 5:
                            if (!C7167b.m22380b().mo18647a().openMiniApp(context, str, new C33472a().mo85792c("025002").mo85790a())) {
                                break;
                            } else {
                                return true;
                            }
                        default:
                            if (C19929d.m65759a(str)) {
                                if (!m132951a(context, str, iVar.f51738g, Long.valueOf(j), str2)) {
                                    break;
                                } else {
                                    return true;
                                }
                            } else {
                                m132950a(context, str, Long.valueOf(j), str2, kVar);
                                return true;
                            }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m132950a(Context context, String str, Long l, String str2, C41746k kVar) {
        String str3;
        if (C42722c.m135620a(context, str, "splash")) {
            return true;
        }
        String scheme = Uri.parse(str).getScheme();
        if (!C22909c.f60637a.equalsIgnoreCase(scheme) && !C22909c.f60639c.equalsIgnoreCase(scheme)) {
            C24976t.m82143b(context, l.longValue(), str2);
        }
        if (str.contains("__back_url__")) {
            str3 = str.replace("__back_url__", Uri.encode(C24505a.f64678a));
        } else {
            str3 = str;
        }
        C19290j jVar = new C19290j(str3);
        if (C22909c.f60640d.mo59884b(str)) {
            jVar.mo51188a("url", str);
        }
        if (str.startsWith("sslocal://user/profile/")) {
            jVar.mo51188a("enter_from", "open_screen_ad");
        }
        if (C33447f.m108191d(str)) {
            jVar.mo51188a("schema_from", "splash");
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.equals(host, "challenge")) {
            jVar.mo51188a("enter_from", "splash");
        }
        if (TextUtils.equals(host, "stickers")) {
            int lastIndexOf = str.lastIndexOf("/") + 1;
            if (lastIndexOf < str.length()) {
                C6907h.m21524a("enter_prop_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "splash_ad").mo59973a("prop_id", str.substring(lastIndexOf)).f60753a);
            }
        }
        kVar.mo102524a(context, jVar.mo51184a());
        return true;
    }

    /* renamed from: a */
    private static boolean m132951a(Context context, String str, String str2, Long l, String str3) {
        C24976t.m82036a(context, l.longValue(), str3);
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        if (C6399b.m19944t()) {
            if (TextUtils.isEmpty(str2)) {
                intent.putExtra("title", " ");
            } else {
                intent.putExtra("title", str2);
            }
        } else if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("title", str2);
        }
        intent.putExtra("bundle_forbidden_jump", true);
        intent.putExtra("ad_id", l);
        intent.putExtra("bundle_download_app_log_extra", str3);
        intent.putExtra("bundle_webview_background", context.getResources().getColor(R.color.aye));
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("openSplashScheme: url = ");
            sb.append(str);
            sb.append(" e = ");
            sb.append(e.toString());
            C42880h.m136156a(sb.toString());
            C6921a.m21559a((Throwable) e);
            return false;
        }
    }
}
