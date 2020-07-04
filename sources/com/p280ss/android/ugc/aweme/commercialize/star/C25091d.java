package com.p280ss.android.ugc.aweme.commercialize.star;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f.C33787a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.star.d */
public final class C25091d {

    /* renamed from: a */
    public static final C25091d f66231a = new C25091d();

    /* renamed from: b */
    private static final String f66232b;

    /* renamed from: c */
    private static C25092a f66233c = new C25092a("ad_tcm_schema", f66232b);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.d$a */
    static final class C25092a {

        /* renamed from: a */
        private final String f66234a;

        /* renamed from: a */
        private String m82635a() {
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                String adTcmSchema = a.getFeAnchorAdConf().getAdTcmSchema();
                if (TextUtils.isEmpty(adTcmSchema)) {
                    return this.f66234a;
                }
                C7573i.m23582a((Object) adTcmSchema, "url");
                return adTcmSchema;
            } catch (Exception unused) {
                return this.f66234a;
            }
        }

        public C25092a(String str, String str2) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(str2, "default");
            this.f66234a = str2;
        }

        /* renamed from: a */
        public final void mo65598a(Activity activity, String str) {
            C33787a a = C33786f.m108941a(m82635a());
            if (!TextUtils.isEmpty(str)) {
                String str2 = "anchor_content";
                if (str == null) {
                    C7573i.m23580a();
                }
                a.mo86195a(str2, str);
            }
            C7195s a2 = C7195s.m22438a();
            if (a2 != null) {
                a2.mo18679a(activity, a.mo86194a().toString());
            }
        }
    }

    private C25091d() {
    }

    static {
        String str;
        if (C6399b.m19946v()) {
            str = "aweme://webview/?url=http%3A%2F%2Fm.tiktok.com%2Ffalcon%2Fad%2Ftcm_brand%3Fhide_nav_bar%3D1%26loading_bgcolor%3Dffffff&hide_nav_bar=1&loading_bgcolor=ffffff";
        } else if (C6399b.m19947w()) {
            str = "aweme://webview/?url=http%3A%2F%2Ft.tiktok.com%2Ffalcon%2Fad%2Ftcm_brand%3Fhide_nav_bar%3D1%26loading_bgcolor%3Dffffff&hide_nav_bar=1&loading_bgcolor=ffffff";
        } else {
            str = "";
        }
        f66232b = str;
    }

    /* renamed from: a */
    public static final void m82634a(Activity activity, String str) {
        f66233c.mo65598a(activity, str);
    }
}
