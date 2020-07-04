package com.bytedance.android.livesdk.feed;

import android.arch.lifecycle.C0043i;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.paging.C3197b;
import com.bytedance.android.livesdk.feed.feed.C5984a;
import com.bytedance.android.livesdk.feed.feed.C5985b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import java.util.List;
import p346io.reactivex.C7492s;
import p346io.reactivex.p354j.C7486b;

public interface IFeedRepository extends ItemRepository<FeedItem> {

    /* renamed from: com.bytedance.android.livesdk.feed.IFeedRepository$a */
    public interface C5920a {
        /* renamed from: a */
        FeedDataKey mo14503a();

        /* renamed from: b */
        int mo14504b();

        /* renamed from: c */
        int mo14505c();
    }

    /* renamed from: a */
    C5984a<C3197b<FeedItem>, C5985b> mo14494a(String str);

    /* renamed from: a */
    C7486b<Object> mo14495a();

    /* renamed from: a */
    void mo14496a(C0043i iVar);

    /* renamed from: a */
    void mo14497a(C5920a aVar);

    /* renamed from: a */
    void mo14498a(String str, String str2);

    /* renamed from: b */
    C7492s<String> mo14499b();

    /* renamed from: c */
    C7492s<List<ImageModel>> mo14500c();

    /* renamed from: d */
    void mo14501d();

    /* renamed from: e */
    C5980f mo14502e();
}
