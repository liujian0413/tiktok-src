package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p145a.C3145b;
import com.bytedance.android.live.core.utils.NoNullRepeatList;
import com.bytedance.android.livesdk.feed.feed.C5988e;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.common.utility.C6311g;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p346io.reactivex.p354j.C47844a;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.bytedance.android.livesdk.feed.d */
public final class C5968d implements C5980f {

    /* renamed from: a */
    Map<FeedDataKey, C5970a> f17698a = new ConcurrentHashMap();

    /* renamed from: b */
    C47844a<Boolean> f17699b = C47844a.m148743a(Boolean.valueOf(false));

    /* renamed from: c */
    C7486b<FeedDataKey> f17700c = C7486b.m23223a();

    /* renamed from: d */
    C7486b<Boolean> f17701d = C7486b.m23223a();

    /* renamed from: e */
    private C3145b<FeedDataKey, FeedItem> f17702e;

    /* renamed from: f */
    private List<C5988e> f17703f = new LinkedList();

    /* renamed from: g */
    private List<Object> f17704g = new NoNullRepeatList();

    /* renamed from: h */
    private boolean f17705h;

    /* renamed from: com.bytedance.android.livesdk.feed.d$a */
    static class C5970a {

        /* renamed from: a */
        public ItemRepository f17706a;

        /* renamed from: b */
        public int f17707b;

        private C5970a(ItemRepository itemRepository) {
            this.f17706a = itemRepository;
        }
    }

    /* renamed from: a */
    public final void mo14610a() {
        if (!this.f17705h) {
            this.f17705h = true;
            this.f17699b.onNext(Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public final void mo14613a(C5988e eVar) {
        this.f17703f.add(eVar);
    }

    /* renamed from: b */
    public final void mo14616b(C5988e eVar) {
        this.f17703f.remove(eVar);
    }

    /* renamed from: a */
    public final ItemRepository mo14609a(FeedDataKey feedDataKey) {
        C5970a aVar = (C5970a) this.f17698a.get(feedDataKey);
        if (aVar != null) {
            return aVar.f17706a;
        }
        return null;
    }

    public C5968d(C3145b<FeedDataKey, FeedItem> bVar) {
        this.f17702e = bVar;
    }

    /* renamed from: b */
    public final FeedItem mo14615b(FeedDataKey feedDataKey, String str) {
        C5970a aVar = (C5970a) this.f17698a.get(feedDataKey);
        if (aVar != null) {
            return aVar.f17706a.mo14507c(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo14611a(FeedDataKey feedDataKey, ItemRepository itemRepository) {
        if (feedDataKey != null && itemRepository != null) {
            C5970a aVar = (C5970a) this.f17698a.get(feedDataKey);
            if (aVar == null) {
                aVar = new C5970a(itemRepository);
                this.f17698a.put(feedDataKey, aVar);
                this.f17700c.onNext(feedDataKey);
            }
            if (aVar.f17706a != itemRepository) {
                aVar.f17706a = itemRepository;
            }
            aVar.f17707b++;
        }
    }

    /* renamed from: b */
    public final boolean mo14617b(FeedDataKey feedDataKey, ItemRepository itemRepository) {
        if (feedDataKey == null || itemRepository == null) {
            return false;
        }
        C5970a aVar = (C5970a) this.f17698a.get(feedDataKey);
        if (aVar != null) {
            aVar.f17707b--;
            if (aVar.f17707b <= 0) {
                this.f17698a.remove(feedDataKey);
            }
        }
        if (aVar == null || aVar.f17707b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo14612a(FeedDataKey feedDataKey, String str) {
        C5970a aVar = (C5970a) this.f17698a.get(feedDataKey);
        if (aVar != null) {
            aVar.f17706a.mo14506b(str);
        }
        Iterator it = this.f17704g.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo14614a(String str, List<FeedItem> list, C2344a aVar, boolean z) {
        if (C6311g.m19574b(this.f17703f)) {
            for (C5988e a : this.f17703f) {
                a.mo14644a(str, list, aVar, z);
            }
        }
    }
}
