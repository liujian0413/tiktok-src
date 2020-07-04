package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.common.base.C17454q;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gl */
public final class C39965gl implements C18245g<VideoCreation> {

    /* renamed from: a */
    C17454q f103808a = C17454q.m58004b();

    /* renamed from: b */
    File f103809b;

    public final void onFailure(Throwable th) {
    }

    public C39965gl(String str) {
        this.f103809b = new File(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onSuccess(VideoCreation videoCreation) {
        if (this.f103809b.exists()) {
            long a = this.f103808a.mo44941a(TimeUnit.MILLISECONDS);
            float length = ((float) this.f103809b.length()) / ((float) a);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", a);
                jSONObject.put("fileSize", this.f103809b.length());
                jSONObject.put("speed", (double) length);
            } catch (JSONException unused) {
            }
            C6893q.m21452b("aweme_movie_publish_performance", "upload_time", jSONObject);
        }
    }
}
