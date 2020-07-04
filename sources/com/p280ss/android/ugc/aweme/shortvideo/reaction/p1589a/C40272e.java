package com.p280ss.android.ugc.aweme.shortvideo.reaction.p1589a;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.common.internal.C13315l;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22983b;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.e */
public class C40272e {

    /* renamed from: b */
    public static final C40273a f104624b = new C40273a(null);

    /* renamed from: a */
    private long f104625a;

    /* renamed from: c */
    private final String f104626c;

    /* renamed from: d */
    private final String f104627d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.e$a */
    public static final class C40273a {
        private C40273a() {
        }

        public /* synthetic */ C40273a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public void mo99264a(int i, long j, long j2) {
    }

    /* renamed from: a */
    public final void mo100067a() {
        this.f104625a = System.currentTimeMillis();
    }

    public C40272e(String str, String str2) {
        this.f104626c = str;
        this.f104627d = str2;
    }

    /* renamed from: a */
    public void mo99266a(String str, String str2) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "fullFilePath");
        if (C40274f.m128672a(C6399b.m19921a())) {
            C6877n.m21444a("aweme_download_error_rate", 0, new C6869c().mo16886a("duration", Long.valueOf(System.currentTimeMillis() - this.f104625a)).mo16882a("tools_use_downloader", Boolean.valueOf(true)).mo16887a("from", this.f104627d).mo16888b());
        }
    }

    /* renamed from: a */
    public void mo99265a(Exception exc, String str, Integer num) {
        int i;
        String str2;
        if (C40274f.m128672a(C6399b.m19921a())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.f104626c);
                jSONObject.put("from", this.f104627d);
                jSONObject.put("tools_use_downloader", true);
                String str3 = "exception";
                if (exc == null) {
                    str2 = "null exception";
                } else {
                    str2 = C13315l.m38963c(exc);
                }
                jSONObject.put(str3, str2);
            } catch (JSONException unused) {
            }
            C6877n.m21444a("aweme_download_error_rate", 1, jSONObject);
        }
        String str4 = "aweme_movie_download_log";
        String str5 = "";
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        C22983b.m75609a(str4, str5, str, i, this.f104626c, this.f104627d);
    }
}
