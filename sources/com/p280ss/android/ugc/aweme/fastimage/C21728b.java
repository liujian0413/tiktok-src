package com.p280ss.android.ugc.aweme.fastimage;

import android.net.Uri;
import android.support.p022v4.util.ArrayMap;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.framework.ReactInstance;
import com.p280ss.android.ugc.aweme.framework.p1273b.C29950a;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.fastimage.b */
public final class C21728b implements C13653c {

    /* renamed from: a */
    private final Map<String, List<String>> f58175a = new ArrayMap();

    /* renamed from: b */
    private int f58176b;

    /* renamed from: c */
    private long f58177c = -1;

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
        this.f58175a.remove(str);
    }

    /* renamed from: a */
    public final void mo58003a(ImageRequestBuilder imageRequestBuilder) {
        this.f58176b++;
        imageRequestBuilder.mo33470a((C13653c) this);
    }

    public final void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        List list = (List) this.f58175a.get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    public final void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        String str2;
        List list = (List) this.f58175a.remove(str);
        if (list != null) {
            boolean contains = list.contains("NetworkFetchProducer");
            Uri uri = imageRequest.mSourceUri;
            if (this.f58177c > 0) {
                System.currentTimeMillis();
                this.f58177c = -1;
            }
            if (ReactInstance.getConfig() != null) {
                C29950a config = ReactInstance.getConfig();
                if (uri != null) {
                    str2 = uri.toString();
                } else {
                    str2 = "";
                }
                config.mo67292a(str2, !contains);
            }
        }
    }

    public final void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        this.f58175a.put(str, new LinkedList());
        if (this.f58177c == -1) {
            this.f58177c = System.currentTimeMillis();
        }
    }

    public final void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        String str2;
        this.f58175a.remove(str);
        int i = this.f58176b - 1;
        this.f58176b = i;
        if (i == 0 && ReactInstance.getConfig() != null) {
            C29950a config = ReactInstance.getConfig();
            if (imageRequest.mSourceUri != null) {
                str2 = imageRequest.mSourceUri.toString();
            } else {
                str2 = "";
            }
            config.mo67291a(str2);
        }
    }
}
