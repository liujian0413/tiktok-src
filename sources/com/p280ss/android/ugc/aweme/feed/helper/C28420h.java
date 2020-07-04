package com.p280ss.android.ugc.aweme.feed.helper;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.C23347h;
import com.p280ss.android.ugc.aweme.feed.adapter.C28140al;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.h */
public final class C28420h extends C23347h {

    /* renamed from: a */
    private final C28140al f74943a;

    /* renamed from: b */
    private final DataCenter f74944b;

    public final boolean requiresExtraMap(String str) {
        return true;
    }

    public C28420h(C28140al alVar, DataCenter dataCenter) {
        this.f74943a = alVar;
        this.f74944b = dataCenter;
    }

    public final void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        super.onProducerFinishWithSuccess(str, str2, map);
        if (C7163a.m22363a() && TextUtils.equals("PostprocessedBitmapMemoryCacheProducer", str2) && Boolean.valueOf((String) map.get("cached_value_found")) == Boolean.TRUE && this.f74944b != null) {
            this.f74944b.mo60134a("poster_processor", (Object) "使用内存缓存");
        }
        if (TextUtils.equals(str2, "NetworkFetchProducer")) {
            try {
                String str3 = (String) map.get("fetch_time");
                if (str3 != null) {
                    this.f74943a.f74215b = Long.valueOf(str3).longValue();
                }
                String str4 = (String) map.get("image_size");
                if (str4 != null) {
                    this.f74943a.f74216c = Integer.valueOf(str4).intValue();
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("NETWORK_FETCH_PRODUCER->");
                sb.append(th.toString());
                C6921a.m21552a(6, "ImageNetworkInfoListener", sb.toString());
            }
        }
    }
}
