package com.p280ss.android.ugc.aweme.shortvideo;

import com.facebook.common.internal.C13315l;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41460n;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import java.io.File;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.an */
public final class C38453an implements C18245g<C38455ap> {

    /* renamed from: a */
    private C41460n f99968a;

    /* renamed from: b */
    private String f99969b;

    /* renamed from: c */
    private boolean f99970c;

    /* renamed from: d */
    private boolean f99971d;

    /* renamed from: e */
    private String f99972e;

    /* renamed from: f */
    private int f99973f;

    public final void onFailure(Throwable th) {
        C41530am.m132280a("PublishDurationMonitor CreateAweme End failed");
        int a = C38574ce.m123267a(13, th);
        JSONObject b = C6869c.m21381a().mo16887a("exception", C13315l.m38963c(th)).mo16885a("videoLength", Integer.valueOf(this.f99973f)).mo16888b();
        if (this.f99971d) {
            C6893q.m21444a("aweme_review_video_fast_publish_error_rate", a, b);
        }
        if (this.f99970c) {
            C6893q.m21444a("aweme_mv_publish_error_rate", a, b);
        }
        C6893q.m21444a("aweme_movie_publish_error_rate_parallel", a, b);
        C6907h.m21524a("parallel_publish_result", (Map) C22984d.m75611a().mo59970a("status", a).mo59973a("publish_id", this.f99972e).f60753a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onSuccess(C38455ap apVar) {
        C41530am.m132280a("PublishDurationMonitor CreateAweme End success");
        StringBuilder sb = new StringBuilder();
        sb.append(C36964i.m118920a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C36964i.m118926b());
        JSONObject b = C6869c.m21381a().mo16887a("enableHardRecord", sb.toString()).mo16887a("enableHardSynthetic", sb2.toString()).mo16885a("videoLength", Integer.valueOf(this.f99973f)).mo16888b();
        if (this.f99971d) {
            C6893q.m21444a("aweme_review_video_fast_publish_error_rate", 0, b);
        }
        if (this.f99970c) {
            C6893q.m21444a("aweme_mv_publish_error_rate", 0, b);
        }
        C6893q.m21444a("aweme_movie_publish_error_rate_parallel", 0, b);
        C6907h.m21524a("parallel_publish_result", (Map) C22984d.m75611a().mo59970a("status", 0).mo59973a("publish_id", this.f99972e).f60753a);
        this.f99968a.mo102127a(new File(this.f99969b).length());
    }

    C38453an(C41460n nVar, String str, boolean z, boolean z2, String str2, int i) {
        this.f99968a = nVar;
        this.f99969b = str;
        this.f99970c = z;
        this.f99971d = z2;
        this.f99972e = str2;
        this.f99973f = i;
    }
}
