package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.google.common.base.C17462u;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.C38574ce;
import com.p280ss.android.ugc.aweme.shortvideo.C39961gh;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.k */
public final class C41456k implements C18245g<VideoCreation> {

    /* renamed from: a */
    private String f107842a;

    /* renamed from: b */
    private int f107843b;

    /* renamed from: b */
    private static String m132110b(VideoCreation videoCreation) {
        if (!(videoCreation instanceof C39961gh)) {
            return "";
        }
        C39961gh ghVar = (C39961gh) videoCreation;
        if (ghVar.f103779a == null) {
            return "";
        }
        return ghVar.f103779a.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onSuccess(VideoCreation videoCreation) {
        C6893q.m21444a("fetch_upload_parameters_error_parallel", 0, (JSONObject) null);
        C6907h.m21524a("parallel_publish_result", (Map) C22984d.m75611a().mo59970a("mob_lost_assist", 1).mo59970a("status", 81).mo59973a("auth_key", m132110b(videoCreation)).mo59973a("publish_id", this.f107842a).f60753a);
    }

    public final void onFailure(Throwable th) {
        int a = C38574ce.m123267a(11, th);
        String b = C17462u.m58024b(th);
        C6893q.m21444a("fetch_upload_parameters_error_parallel", 1, C38510bb.m123095a().mo96481a("exception", b).mo96479a("videoLength", Integer.valueOf(this.f107843b)).mo96482b());
        C6893q.m21444a("aweme_movie_publish_error_rate_parallel", a, C38510bb.m123095a().mo96481a("exception", b).mo96482b());
        C6907h.m21524a("parallel_publish_result", (Map) C22984d.m75611a().mo59970a("status", a).mo59973a("publish_id", this.f107842a).f60753a);
    }

    public C41456k(String str, int i) {
        this.f107842a = str;
        this.f107843b = i;
        C6893q.m21444a("aweme_movie_publish_error_rate_parallel", -1, (JSONObject) null);
        C6907h.m21524a("parallel_publish_result", (Map) C22984d.m75611a().mo59970a("status", -1).mo59973a("publish_id", str).f60753a);
    }
}
