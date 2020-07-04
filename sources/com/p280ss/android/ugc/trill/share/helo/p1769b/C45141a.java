package com.p280ss.android.ugc.trill.share.helo.p1769b;

import android.content.Context;
import com.bytedance.common.utility.C6317k;
import com.bytedance.common.utility.C6317k.C6318a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.opensdk.core.base.C12303a;
import com.bytedance.opensdk.core.base.config.AppConfig;
import com.bytedance.opensdk.core.base.config.C12310a;
import com.bytedance.opensdk.core.base.p627c.C12308a;
import com.bytedance.opensdk.core.p624b.C12302a;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.utils.C43013ch;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C48038d;

/* renamed from: com.ss.android.ugc.trill.share.helo.b.a */
public final class C45141a {

    /* renamed from: a */
    public static final C45141a f115994a = new C45141a();

    /* renamed from: com.ss.android.ugc.trill.share.helo.b.a$a */
    public static final class C45142a implements C12302a {
        C45142a() {
        }

        /* renamed from: a */
        public final void mo30099a(String str, Map<String, String> map) {
            C7573i.m23587b(str, "eventName");
            C7573i.m23587b(map, "params");
            C6907h.m21524a(str, (Map) map);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.b.a$b */
    public static final class C45143b implements C12308a {

        /* renamed from: a */
        final /* synthetic */ C6317k f115995a;

        C45143b(C6317k kVar) {
            this.f115995a = kVar;
        }

        /* renamed from: a */
        public final String mo30111a(String str, Map<String, String> map, Map<String, String> map2) {
            C7573i.m23587b(str, "url");
            C7573i.m23587b(map, "requestHeaderMap");
            C7573i.m23587b(map2, "respHeaderMap");
            return this.f115995a.mo15153a(str, map, null);
        }

        /* renamed from: a */
        public final String mo30110a(String str, String str2, Map<String, String> map, Map<String, String> map2) {
            C7573i.m23587b(str, "url");
            C7573i.m23587b(str2, "body");
            C7573i.m23587b(map, "requestHeaderMap");
            C7573i.m23587b(map2, "respHeaderMap");
            C6317k kVar = this.f115995a;
            byte[] bytes = str2.getBytes(C48038d.f122880a);
            C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return kVar.mo15154a(str, bytes, map, (C6318a) null);
        }
    }

    private C45141a() {
    }

    /* renamed from: a */
    public static void m142317a(Context context) {
        C7573i.m23587b(context, "context");
        if (C6399b.m19946v()) {
            String d = C6789d.m21080d();
            C7573i.m23582a((Object) d, "DeviceRegisterManager.getDeviceId()");
            Locale b = C43013ch.m136515b();
            C7573i.m23582a((Object) b, "LocaleUtils.getCurrentLocale()");
            AppConfig appConfig = new AppConfig(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString(), "http://p16-tiktokcdn-com.akamaized.net/obj/tiktok-obj/1633413036164097.PNG", 1233, "487", "tiktok", d, b);
            AppConfig appConfig2 = appConfig;
            C12310a aVar = new C12310a("awa1298a2d0150f3", "dad736bdd1af7bd7e3edfc29eb8d6e11", appConfig2, new C45143b(C6317k.m19580a()), new C45142a());
            C12303a.f32660a.mo30101a(aVar, context).mo30100a(64206);
        }
    }
}
