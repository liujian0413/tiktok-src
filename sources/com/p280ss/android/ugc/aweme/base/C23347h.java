package com.p280ss.android.ugc.aweme.base;

import android.content.Context;
import android.net.Uri;
import android.support.p022v4.util.ArrayMap;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.imagepipeline.p721h.C13651a;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.base.h */
public class C23347h extends C13651a {

    /* renamed from: a */
    private static ExecutorService f61429a;

    /* renamed from: b */
    private final Map<String, List<String>> f61430b = new ArrayMap();

    /* renamed from: c */
    private int f61431c;

    /* renamed from: d */
    private long f61432d = -1;

    /* renamed from: a */
    private static void m76605a() {
        if (f61429a == null) {
            synchronized (C23347h.class) {
                if (f61429a == null) {
                    f61429a = C23351l.m76609a(1, C23350k.f61438a);
                }
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Thread m76604a(Runnable runnable) {
        return new Thread(runnable, "image-net-requests-monitor");
    }

    public void onRequestCancellation(String str) {
        super.onRequestCancellation(str);
        this.f61430b.remove(str);
    }

    /* renamed from: a */
    public final void mo60644a(ImageRequestBuilder imageRequestBuilder) {
        this.f61431c++;
        imageRequestBuilder.mo33470a((C13653c) this);
    }

    /* renamed from: a */
    static final /* synthetic */ void m76607a(ImageRequest imageRequest, Throwable th) {
        String str;
        Uri uri = imageRequest.mSourceUri;
        Context a = C6399b.m19921a();
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        C23331f.m76552a(a, str, th);
    }

    /* renamed from: a */
    static final /* synthetic */ void m76606a(Uri uri, long j, boolean z) {
        String str;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        C23331f.m76554a(str, j, z);
    }

    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        super.onProducerFinishWithSuccess(str, str2, map);
        List list = (List) this.f61430b.get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        long j;
        super.onRequestSuccess(imageRequest, str, z);
        List list = (List) this.f61430b.remove(str);
        if (list != null) {
            boolean contains = list.contains("NetworkFetchProducer");
            Uri uri = imageRequest.mSourceUri;
            if (this.f61432d > 0) {
                j = System.currentTimeMillis() - this.f61432d;
                this.f61432d = -1;
            } else {
                j = -1;
            }
            m76605a();
            f61429a.submit(new C23349j(uri, j, contains));
        }
    }

    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        super.onRequestFailure(imageRequest, str, th, z);
        this.f61430b.remove(str);
        int i = this.f61431c - 1;
        this.f61431c = i;
        if (i == 0) {
            m76605a();
            f61429a.submit(new C23348i(imageRequest, th));
        }
    }

    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        super.onRequestStart(imageRequest, obj, str, z);
        this.f61430b.put(str, new LinkedList());
        if (this.f61432d == -1) {
            this.f61432d = System.currentTimeMillis();
        }
    }
}
