package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.feed.feed.C5988e;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.f */
public interface C5980f extends C6023h {
    /* renamed from: a */
    ItemRepository mo14609a(FeedDataKey feedDataKey);

    /* renamed from: a */
    void mo14610a();

    /* renamed from: a */
    void mo14611a(FeedDataKey feedDataKey, ItemRepository itemRepository);

    /* renamed from: a */
    void mo14612a(FeedDataKey feedDataKey, String str);

    /* renamed from: a */
    void mo14613a(C5988e eVar);

    /* renamed from: a */
    void mo14614a(String str, List<FeedItem> list, C2344a aVar, boolean z);

    /* renamed from: b */
    void mo14616b(C5988e eVar);

    /* renamed from: b */
    boolean mo14617b(FeedDataKey feedDataKey, ItemRepository itemRepository);
}
