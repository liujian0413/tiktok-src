package com.bytedance.android.livesdk.feed;

import android.arch.lifecycle.C0042h;
import com.bytedance.android.live.base.model.feed.FeedItem;
import java.util.List;

public interface ItemRepository<T extends FeedItem> extends C0042h {
    /* renamed from: b */
    void mo14506b(String str);

    /* renamed from: c */
    T mo14507c(String str);

    /* renamed from: f */
    List<T> mo14508f();

    /* renamed from: g */
    void mo14509g();
}
