package com.p280ss.android.ugc.aweme.shortvideo;

import android.app.Application;
import com.google.common.base.C17462u;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p280ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p280ss.ttuploader.UploadEventManager;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gk */
public final class C39964gk implements C18245g<VideoCreation> {

    /* renamed from: a */
    final String f103803a;

    /* renamed from: b */
    String f103804b;

    /* renamed from: c */
    private UploadSpeedInfo f103805c;

    /* renamed from: d */
    private int f103806d;

    /* renamed from: e */
    private int f103807e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onSuccess(VideoCreation videoCreation) {
        JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
        C6893q.m21444a("upload_error_sdk", 0, C38510bb.m123095a().mo96481a("events", popAllEvents.toString()).mo96482b());
        m127847a(popAllEvents);
    }

    /* renamed from: a */
    private void m127847a(JSONArray jSONArray) {
        if (jSONArray != null) {
            Application application = C35563c.f93238a;
            ArrayList b = C39913g.m127678a().mo99320b();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    jSONObject.put("aweme_sdkextra", b);
                    jSONObject.put("aweme_upload_speed", this.f103805c.getSpeed());
                    jSONObject.put("aweme_video_type", this.f103806d);
                    jSONObject.put("aweme_upload_type", this.f103807e);
                    jSONObject.put("aweme_speed_start", this.f103805c.getStartTime());
                    jSONObject.put("aweme_speed_end", this.f103805c.getEndTime());
                    jSONObject.put("aweme_video_resolution", this.f103804b);
                    AppLog.recordMiscLog(application, "video_upload", jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void onFailure(Throwable th) {
        int a = C38574ce.m123267a(12, th);
        String b = C17462u.m58024b(th);
        JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
        C6893q.m21444a("upload_error_sdk", 1, C38510bb.m123095a().mo96481a("events", popAllEvents.toString()).mo96481a("exception", b).mo96482b());
        C6893q.m21444a("aweme_movie_publish_error_rate_sdk", a, C38510bb.m123095a().mo96481a("exception", b).mo96482b());
        C39913g a2 = C39913g.m127678a();
        StringBuilder sb = new StringBuilder("output file: ");
        sb.append(this.f103803a);
        a2.mo99319a(sb.toString());
        if (this.f103803a != null) {
            C39913g a3 = C39913g.m127678a();
            StringBuilder sb2 = new StringBuilder(" size: ");
            sb2.append(new File(this.f103803a).length());
            a3.mo99319a(sb2.toString());
        } else {
            C39913g.m127678a().mo99319a("output file == null");
        }
        m127847a(popAllEvents);
    }

    public C39964gk(String str, String str2, UploadSpeedInfo uploadSpeedInfo, int i, int i2) {
        this.f103803a = str;
        this.f103804b = str2;
        this.f103805c = uploadSpeedInfo;
        this.f103806d = i;
        this.f103807e = i2;
    }
}
