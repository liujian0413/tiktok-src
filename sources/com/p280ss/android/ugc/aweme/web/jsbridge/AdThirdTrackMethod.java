package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod */
public final class AdThirdTrackMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C43450a f112536a = new C43450a(null);

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod$a */
    public static final class C43450a {
        private C43450a() {
        }

        public /* synthetic */ C43450a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod$b */
    static final class C43451b implements C24939aj {

        /* renamed from: a */
        final /* synthetic */ String f112537a;

        /* renamed from: b */
        final /* synthetic */ String f112538b;

        /* renamed from: c */
        final /* synthetic */ String f112539c;

        /* renamed from: d */
        final /* synthetic */ String f112540d;

        /* renamed from: e */
        final /* synthetic */ long f112541e;

        C43451b(String str, String str2, String str3, String str4, long j) {
            this.f112537a = str;
            this.f112538b = str2;
            this.f112539c = str3;
            this.f112540d = str4;
            this.f112541e = j;
        }

        /* renamed from: a */
        public final void mo63403a(String str, String str2, long j) {
            if (C6399b.m19944t()) {
                C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g(this.f112537a).mo65280c(this.f112538b).mo65282d(this.f112539c).mo65286h(this.f112540d).mo65281c();
            } else {
                C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g(this.f112537a).mo65280c(this.f112538b).mo65286h(this.f112540d).mo65279c(Long.valueOf(this.f112541e)).mo65270a(C6399b.m19921a());
            }
        }
    }

    public AdThirdTrackMethod() {
        this(null, 1, null);
    }

    public AdThirdTrackMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        long j;
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("track_url_list");
            String optString = jSONObject.optString("track_label");
            String optString2 = jSONObject.optString("creative_id");
            String optString3 = jSONObject.optString("log_extra");
            String optString4 = jSONObject.optString("ad_id");
            String optString5 = jSONObject.optString("group_id");
            if (optJSONArray != null && optJSONArray.length() > 0 && !TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                List arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString6 = optJSONArray.optString(i);
                    C7573i.m23582a((Object) optString6, "trackUrlListArr.optString(i)");
                    arrayList.add(optString6);
                }
                try {
                    C7573i.m23582a((Object) optString4, "adId");
                    j = Long.parseLong(optString4);
                } catch (Exception unused) {
                    j = 0;
                }
                C43451b bVar = new C43451b(optString, optString2, optString5, optString3, j);
                C24962g.m81954a((C24939aj) bVar, (Collection<String>) arrayList, true);
            }
        }
    }

    private /* synthetic */ AdThirdTrackMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
