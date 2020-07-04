package com.p280ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.p089a.p090a.C2214c;
import com.bytedance.android.p089a.p090a.p091a.C2207a;
import com.bytedance.android.p089a.p090a.p096f.C2223a;
import com.bytedance.android.p089a.p090a.p096f.C2223a.C2225a;
import com.bytedance.android.p089a.p090a.p097g.C2227a;
import com.bytedance.android.p089a.p099b.C2236a.C2238a;
import com.bytedance.android.p089a.p099b.p100a.C2239a;
import com.bytedance.android.p089a.p099b.p101b.C2249c;
import com.bytedance.android.p089a.p099b.p101b.C2251d;
import com.bytedance.android.p089a.p099b.p101b.p102a.C2244b;
import com.bytedance.android.p089a.p099b.p101b.p102a.C2244b.C2245a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.C6925d;
import com.p280ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.ao */
public final class C24946ao {

    /* renamed from: a */
    public static final C24946ao f65785a = new C24946ao();

    /* renamed from: b */
    private static String f65786b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.ao$a */
    static final class C24947a implements C6925d {

        /* renamed from: a */
        final /* synthetic */ C2214c f65787a;

        C24947a(C2214c cVar) {
            this.f65787a = cVar;
        }

        public final void change(IESSettingsProxy iESSettingsProxy) {
            C7573i.m23587b(iESSettingsProxy, "it");
            if (C24946ao.m81862c()) {
                this.f65787a.mo7949a(C24946ao.f65785a.mo65229b());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.ao$b */
    static final class C24948b implements C2207a {

        /* renamed from: a */
        public static final C24948b f65788a = new C24948b();

        C24948b() {
        }

        /* renamed from: a */
        public final void mo7935a(String str, JSONObject jSONObject) {
            C6907h.m21525a(str, jSONObject);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.ao$c */
    public static final class C24949c extends C2239a {
        C24949c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.ao$d */
    static final class C24950d implements C2244b {

        /* renamed from: a */
        public static final C24950d f65789a = new C24950d();

        C24950d() {
        }

        /* renamed from: a */
        public final C2251d mo7978a(C2245a aVar) {
            C7573i.m23587b(aVar, "chain");
            C2251d a = aVar.mo7982a(aVar.mo7981a());
            if (a != null) {
                C24946ao.m81861a(a);
            }
            return a;
        }
    }

    private C24946ao() {
    }

    /* renamed from: c */
    public static boolean m81862c() {
        String str = f65786b;
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        return C7634n.m23717a(str, a.getAdTrackerConfig(), false);
    }

    /* renamed from: a */
    public final C2214c mo65228a() {
        C2214c a = C2214c.m9546a();
        C7573i.m23582a((Object) a, "trackerSDK");
        if (!a.mo7951b()) {
            m81860a(C6399b.m19921a());
        }
        return a;
    }

    /* renamed from: d */
    private static JSONObject m81863d() {
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        f65786b = a.getAdTrackerConfig();
        try {
            IESSettingsProxy a2 = C30199h.m98861a();
            C7573i.m23582a((Object) a2, "SettingsReader.get()");
            return new JSONObject(a2.getAdTrackerConfig());
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final C2223a mo65229b() {
        C2223a a = new C2225a().mo7966a(false).mo7968b(C6399b.m19944t()).mo7964a(RawURLGetter.m81766a("other")).mo7965a(m81863d()).mo7967a();
        C7573i.m23582a((Object) a, "AdTrackerSetting.Builder…\n                .build()");
        return a;
    }

    /* renamed from: a */
    private final void m81860a(Context context) {
        C2214c a = C2214c.m9546a();
        a.mo7947a(context, mo65229b());
        SettingsManagerProxy.inst().registerSettingsWatcher(new C24947a(a), false);
        a.mo7948a((C2207a) C24948b.f65788a);
        a.mo7950a((C2227a) new C2238a().mo7974a(true).mo7972a((C2239a) new C24949c()).mo7973a((C2244b) C24950d.f65789a).mo7975a());
    }

    /* renamed from: a */
    public static void m81861a(C2251d dVar) {
        String str;
        C2249c cVar = dVar.f7515e;
        if (cVar != null) {
            str = cVar.f7503b;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            C2249c cVar2 = dVar.f7515e;
            C7573i.m23582a((Object) cVar2, "c2SResponse.request");
            Uri parse = Uri.parse(cVar2.f7503b);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("track_url", parse.toString());
                C7573i.m23582a((Object) parse, "uri");
                jSONObject.put("scheme", parse.getScheme());
                jSONObject.put("host", parse.getHost());
                jSONObject.put("path", parse.getPath());
                jSONObject.put("ref", "track_sdk");
            } catch (JSONException unused) {
            }
            Throwable th = dVar.f7516f;
            if (th != null) {
                try {
                    jSONObject.put("error_message", th.getMessage());
                } catch (JSONException e) {
                    Integer.valueOf(Log.e("TrackSDKHelper", "put track_url failed", e));
                }
            }
            try {
                jSONObject.put("status_code", dVar.f7511a);
            } catch (JSONException unused2) {
            }
            C6877n.m21444a("aweme_third_party_track_url_succeed_rate", dVar.mo7989a() ? 1 : 0, jSONObject);
        }
    }
}
