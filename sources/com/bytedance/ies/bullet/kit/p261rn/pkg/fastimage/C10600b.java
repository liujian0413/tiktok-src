package com.bytedance.ies.bullet.kit.p261rn.pkg.fastimage;

import android.support.p022v4.util.ArrayMap;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.fastimage.b */
public final class C10600b implements C13653c {

    /* renamed from: a */
    private final Map<String, List<String>> f28392a = new ArrayMap();

    /* renamed from: b */
    private int f28393b;

    /* renamed from: c */
    private long f28394c = -1;

    public final void onProducerEvent(String str, String str2, String str3) {
    }

    public final void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
    }

    public final void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map) {
    }

    public final void onProducerStart(String str, String str2) {
    }

    public final void onUltimateProducerReached(String str, String str2, boolean z) {
    }

    public final boolean requiresExtraMap(String str) {
        return false;
    }

    public final void onRequestCancellation(String str) {
        this.f28392a.remove(str);
    }

    /* renamed from: a */
    public final void mo25410a(ImageRequestBuilder imageRequestBuilder) {
        this.f28393b++;
        imageRequestBuilder.mo33470a((C13653c) this);
    }

    public final void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        List list = (List) this.f28392a.get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    public final void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        List list = (List) this.f28392a.remove(str);
        if (list != null) {
            list.contains("NetworkFetchProducer");
            if (this.f28394c > 0) {
                System.currentTimeMillis();
                this.f28394c = -1;
            }
        }
    }

    public final void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        this.f28392a.remove(str);
    }

    public final void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        this.f28392a.put(str, new LinkedList());
        if (this.f28394c == -1) {
            this.f28394c = System.currentTimeMillis();
        }
    }
}
