package com.p280ss.android.ugc.aweme.photo;

import android.app.Application;
import com.google.common.base.C17462u;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C38574ce;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p280ss.ttuploader.UploadEventManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photo.t */
public final class C34818t implements C18245g<VideoCreation> {

    /* renamed from: a */
    private int f90807a;

    /* renamed from: b */
    private int f90808b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onSuccess(VideoCreation videoCreation) {
        m112296a(UploadEventManager.instance.popAllImageEvents());
    }

    /* renamed from: a */
    private void m112296a(JSONArray jSONArray) {
        if (jSONArray != null) {
            Application application = C35563c.f93238a;
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    jSONObject.put("aweme_video_type", this.f90807a);
                    jSONObject.put("aweme_upload_type", this.f90808b);
                    AppLog.recordMiscLog(application, "image_upload", jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void onFailure(Throwable th) {
        int a = C38574ce.m123267a(12, th);
        String b = C17462u.m58024b(th);
        JSONArray popAllImageEvents = UploadEventManager.instance.popAllImageEvents();
        C6893q.m21452b("aweme_photo_publish_log", "upload_error_sdk", C6869c.m21381a().mo16887a("events", popAllImageEvents.toString()).mo16887a("exception", b).mo16888b());
        C6893q.m21444a("aweme_photo_publish_error_rate", a, C6869c.m21381a().mo16887a("events", popAllImageEvents.toString()).mo16887a("exception", b).mo16888b());
        m112296a(popAllImageEvents);
    }

    public C34818t(int i, int i2) {
        this.f90807a = i;
        this.f90808b = i2;
    }
}
