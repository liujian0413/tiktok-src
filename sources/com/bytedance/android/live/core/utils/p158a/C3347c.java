package com.bytedance.android.live.core.utils.p158a;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.support.p022v4.util.ArrayMap;
import com.bytedance.android.live.base.C2322a;
import com.bytedance.android.live.base.p118b.C2328c;
import com.bytedance.android.live.core.p148d.C3170c;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.facebook.imagepipeline.p721h.C13651a;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.common.util.NetworkUtils;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.utils.a.c */
public class C3347c extends C13651a {

    /* renamed from: a */
    private static ExecutorService f10158a;

    /* renamed from: b */
    private final Map<String, List<String>> f10159b = new ArrayMap();

    /* renamed from: c */
    private int f10160c;

    /* renamed from: d */
    private long f10161d = -1;

    /* renamed from: a */
    private static void m12492a() {
        if (f10158a == null) {
            synchronized (C3347c.class) {
                if (f10158a == null) {
                    f10158a = C3351g.m12496a(1, C3350f.f10166a);
                }
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Thread m12491a(Runnable runnable) {
        return new Thread(runnable, "image-net-requests-monitor");
    }

    /* renamed from: a */
    public final void mo10269a(ImageRequestBuilder imageRequestBuilder) {
        this.f10160c++;
        imageRequestBuilder.mo33470a((C13653c) this);
    }

    public void onRequestCancellation(String str) {
        super.onRequestCancellation(str);
        this.f10159b.remove(str);
    }

    /* renamed from: a */
    static final /* synthetic */ void m12493a(Uri uri, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", uri);
        } catch (JSONException unused) {
        }
        C3172e.m12009c("hotsoon_image_load_error_rate", 0, jSONObject);
        if (j > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("duration", j);
                jSONObject2.put("url", uri);
            } catch (JSONException unused2) {
            }
            C3172e.m12006a("hotsoon_image_load_duration", "hotsoon_image_load", jSONObject2);
            C3172e.m12005a("hotsoon_image_load", "load_time", (float) j);
        }
        C3170c.m11989a(uri.toString(), j);
    }

    /* renamed from: a */
    static final /* synthetic */ void m12494a(Throwable th, ImageRequest imageRequest) {
        Context e = C3358ac.m12528e();
        if (C3351g.m12497a(e)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorDesc", th.toString());
                jSONObject.put("url", imageRequest.mSourceUri);
                jSONObject.put("userId", ((C2328c) C2322a.m9938a(C2328c.class)).mo8147a());
                jSONObject.put("networkType", NetworkUtils.getNetworkAccessType(e));
                C3172e.m12006a("hotsoon_image_load_log", "image_error", jSONObject);
            } catch (Exception unused) {
            }
            C3172e.m12009c("hotsoon_image_load_error_rate", 1, jSONObject);
            C3170c.m11990a(imageRequest.mSourceUri.toString(), th.toString());
        }
    }

    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        super.onProducerFinishWithSuccess(str, str2, map);
        List list = (List) this.f10159b.get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        long j;
        super.onRequestSuccess(imageRequest, str, z);
        List list = (List) this.f10159b.remove(str);
        if (list != null && list.contains("NetworkFetchProducer")) {
            Uri uri = imageRequest.mSourceUri;
            if (this.f10161d > 0) {
                j = SystemClock.elapsedRealtime() - this.f10161d;
                this.f10161d = -1;
            } else {
                j = -1;
            }
            m12492a();
            f10158a.submit(new C3349e(uri, j));
        }
    }

    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        super.onRequestFailure(imageRequest, str, th, z);
        this.f10159b.remove(str);
        int i = this.f10160c - 1;
        this.f10160c = i;
        if (i == 0) {
            m12492a();
            f10158a.submit(new C3348d(th, imageRequest));
        }
    }

    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        super.onRequestStart(imageRequest, obj, str, z);
        this.f10159b.put(str, new LinkedList());
        if (this.f10161d == -1) {
            this.f10161d = SystemClock.elapsedRealtime();
        }
    }
}
