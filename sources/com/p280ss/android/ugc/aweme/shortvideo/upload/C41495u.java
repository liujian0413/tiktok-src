package com.p280ss.android.ugc.aweme.shortvideo.upload;

import android.app.Application;
import com.google.common.base.C17454q;
import com.google.common.base.C17462u;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.C38574ce;
import com.p280ss.android.ugc.aweme.shortvideo.C39913g;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p280ss.android.ugc.aweme.shortvideo.upload.p1621b.C41444c;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.ttuploader.UploadEventManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.u */
public final class C41495u implements C18245g<VideoCreation> {

    /* renamed from: a */
    final String f107916a;

    /* renamed from: b */
    String f107917b;

    /* renamed from: c */
    private C17454q f107918c = C17454q.m58004b();

    /* renamed from: d */
    private C41444c f107919d;

    /* renamed from: e */
    private UploadSpeedInfo f107920e;

    /* renamed from: f */
    private boolean f107921f;

    /* renamed from: g */
    private int f107922g;

    /* renamed from: h */
    private int f107923h;

    /* renamed from: i */
    private String f107924i;

    /* renamed from: a */
    public final void mo102151a() {
        this.f107921f = true;
    }

    /* renamed from: a */
    private static void m132189a(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("PublishDurationMonitor Upload End ");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        sb.append(str);
        C41530am.m132280a(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onSuccess(VideoCreation videoCreation) {
        m132189a(true);
        JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
        C38510bb a = C38510bb.m123095a().mo96481a("events", popAllEvents.toString());
        if (new File(this.f107916a).exists()) {
            long a2 = this.f107918c.mo44941a(TimeUnit.MILLISECONDS);
            a.mo96478a("speed", Float.valueOf(((float) new File(this.f107916a).length()) / ((float) a2))).mo96480a("duration", Long.valueOf(a2));
        }
        C6907h.m21524a("parallel_publish_result", (Map) C22984d.m75611a().mo59970a("mob_lost_assist", 1).mo59970a("status", 82).mo59973a("publish_id", this.f107924i).f60753a);
        C6893q.m21444a("upload_error_parallel", 0, a.mo96482b());
        m132188a(popAllEvents, "");
    }

    public final void onFailure(Throwable th) {
        m132189a(false);
        int a = C38574ce.m123267a(12, th);
        if (th instanceof UploadException) {
            UploadException uploadException = (UploadException) th;
            if (uploadException.getErrorCode() != 0) {
                a = (int) uploadException.getErrorCode();
            }
        }
        String b = C17462u.m58024b(th);
        JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
        C6893q.m21444a("upload_error_parallel", a, C38510bb.m123095a().mo96481a("events", popAllEvents.toString()).mo96481a("exception", b).mo96482b());
        String arrayList = C41494t.m132184a().mo102150b().toString();
        C6893q.m21444a("aweme_movie_publish_error_rate_parallel", a, C38510bb.m123095a().mo96481a("exception", b).mo96481a("event", arrayList).mo96482b());
        C6907h.m21524a("parallel_publish_result", (Map) C22984d.m75611a().mo59970a("status", a).mo59973a("publish_id", this.f107924i).f60753a);
        C39913g a2 = C39913g.m127678a();
        StringBuilder sb = new StringBuilder("output file: ");
        sb.append(this.f107916a);
        a2.mo99319a(sb.toString());
        if (this.f107916a != null) {
            C39913g a3 = C39913g.m127678a();
            StringBuilder sb2 = new StringBuilder(" size: ");
            sb2.append(new File(this.f107916a).length());
            a3.mo99319a(sb2.toString());
        } else {
            C39913g.m127678a().mo99319a("output file == null");
        }
        m132188a(popAllEvents, arrayList);
    }

    /* renamed from: a */
    private void m132188a(JSONArray jSONArray, String str) {
        if (jSONArray != null) {
            Application application = C35563c.f93238a;
            ArrayList b = C39913g.m127678a().mo99320b();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    jSONObject.put("aweme_sdkextra", b);
                    jSONObject.put("aweme_video_resolution", this.f107917b);
                    jSONObject.put("aweme_video_type", this.f107922g);
                    jSONObject.put("aweme_upload_type", this.f107923h);
                    jSONObject.put("aweme_click_publish", this.f107921f);
                    jSONObject.put("aweme_publish_id", this.f107924i);
                    jSONObject.put("aweme_parallel_log", str);
                    jSONObject.put("aweme_upload_speed", this.f107920e.getSpeed());
                    jSONObject.put("aweme_speed_start", this.f107920e.getStartTime());
                    jSONObject.put("aweme_speed_end", this.f107920e.getEndTime());
                    jSONObject.put("aweme_synthetic_start", this.f107919d.f107815b);
                    jSONObject.put("aweme_synthetic_end", this.f107919d.f107816c);
                    jSONObject.put("aweme_upload_wait_ms", this.f107919d.mo102098b());
                    jSONObject.put("aweme_upload_offset_size_when_synthetic_end", this.f107919d.f107817d);
                    jSONObject.put("aweme_to_upload_size_when_synthetic_end", this.f107919d.f107818e);
                    AppLog.recordMiscLog(application, "video_upload", jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public C41495u(String str, String str2, UploadSpeedInfo uploadSpeedInfo, C41444c cVar, boolean z, int i, int i2, String str3) {
        this.f107916a = str;
        this.f107917b = str2;
        this.f107920e = uploadSpeedInfo;
        this.f107919d = cVar;
        this.f107921f = z;
        this.f107922g = i;
        this.f107923h = i2;
        this.f107924i = str3;
    }
}
