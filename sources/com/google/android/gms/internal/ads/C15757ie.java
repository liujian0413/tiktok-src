package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.facebook.appevents.C13192m;
import com.facebook.internal.C13926o;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.internal.C14817bv;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.anf;
import com.google.android.gms.internal.ads.anj;
import com.google.android.gms.internal.ads.anm;
import com.google.android.gms.internal.ads.ano;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38566l;
import com.p280ss.android.ugc.aweme.tools.extract.C42323i;
import java.net.URISyntaxException;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ie */
public final class C15757ie<T extends ane & anf & anj & anm & ano> implements C15742hq<T> {

    /* renamed from: a */
    private final C14817bv f44506a;

    /* renamed from: b */
    private final C16002rg f44507b;

    public C15757ie(C14817bv bvVar, C16002rg rgVar) {
        this.f44506a = bvVar;
        this.f44507b = rgVar;
    }

    /* renamed from: a */
    private static boolean m51064a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* renamed from: b */
    private static int m51065b(Map<String, String> map) {
        String str = (String) map.get(C13926o.f36856a);
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if (C38566l.f100205a.equalsIgnoreCase(str)) {
                return 6;
            }
            if ("c".equalsIgnoreCase(str)) {
                return C14793ay.m42896b().mo39191a();
            }
        }
        return -1;
    }

    /* renamed from: a */
    private final void m51063a(boolean z) {
        if (this.f44507b != null) {
            this.f44507b.mo41934a(z);
        }
    }

    /* renamed from: a */
    static String m51062a(Context context, bdt bdt, String str, View view, Activity activity) {
        if (bdt == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (bdt.mo40537b(parse)) {
                parse = bdt.mo40533a(parse, context, view, activity);
            }
            return parse.toString();
        } catch (zzdh unused) {
            return str;
        } catch (Exception e) {
            C14793ay.m42898d().mo39089a((Throwable) e, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        ane ane = (ane) obj;
        String a = abd.m45356a((String) map.get("u"), ane.getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            acd.m45783e("Action missing from an open GMSG.");
        } else if (this.f44506a != null && !this.f44506a.mo37761b()) {
            this.f44506a.mo37760a(a);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((anf) ane).mo39702B()) {
                acd.m45783e("Cannot expand WebView that is already expanded.");
                return;
            }
            m51063a(false);
            ((anj) ane).mo39811a(m51064a(map), m51065b(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            m51063a(false);
            if (a != null) {
                ((anj) ane).mo39812a(m51064a(map), m51065b(map), a);
            } else {
                ((anj) ane).mo39813a(m51064a(map), m51065b(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if (!"app".equalsIgnoreCase(str) || !"true".equalsIgnoreCase((String) map.get("system_browser"))) {
            m51063a(true);
            String str2 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e) {
                    String str3 = "Error parsing the url: ";
                    String valueOf = String.valueOf(str2);
                    acd.m45778b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), e);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                String uri = data.toString();
                if (!TextUtils.isEmpty(uri)) {
                    try {
                        uri = m51062a(ane.getContext(), ((anm) ane).mo39764z(), uri, ((ano) ane).getView(), ane.mo39466d());
                    } catch (Exception e2) {
                        acd.m45778b("Error occurred while adding signals.", e2);
                        C14793ay.m42898d().mo39089a((Throwable) e2, "OpenGmsgHandler.onGmsg");
                    }
                    try {
                        data = Uri.parse(uri);
                    } catch (Exception e3) {
                        String str4 = "Error parsing the uri: ";
                        String valueOf2 = String.valueOf(uri);
                        acd.m45778b(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), e3);
                        C14793ay.m42898d().mo39089a((Throwable) e3, "OpenGmsgHandler.onGmsg");
                    }
                }
                intent.setData(data);
            }
            if (intent != null) {
                ((anj) ane).mo39808a(new zzc(intent));
                return;
            }
            if (!TextUtils.isEmpty(a)) {
                a = m51062a(ane.getContext(), ((anm) ane).mo39764z(), a, ((ano) ane).getView(), ane.mo39466d());
            }
            anj anj = (anj) ane;
            zzc zzc = new zzc((String) map.get(C42323i.f110089f), a, (String) map.get(C13192m.f34940a), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"));
            anj.mo39808a(zzc);
        } else {
            m51063a(true);
            if (TextUtils.isEmpty(a)) {
                acd.m45783e("Destination url cannot be empty.");
                return;
            }
            try {
                ((anj) ane).mo39808a(new zzc(new C15758if(ane.getContext(), ((anm) ane).mo39764z(), ((ano) ane).getView()).mo41651a(map)));
            } catch (ActivityNotFoundException e4) {
                acd.m45783e(e4.getMessage());
            }
        }
    }
}
