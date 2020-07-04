package com.bytedance.android.livesdk.feed.p230e;

import android.arch.lifecycle.C0053p;
import android.arch.paging.C0100h;
import android.arch.paging.C0100h.C0105c;
import android.os.Bundle;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.paging.C3197b;
import com.bytedance.android.livesdk.feed.C5980f;
import com.bytedance.android.livesdk.feed.feed.C5985b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9412a;
import com.bytedance.android.livesdkapi.p452h.C9419g;
import com.bytedance.android.livesdkapi.p452h.C9422j;
import com.bytedance.common.utility.C6311g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.e.a */
public final class C5975a extends C9419g implements C9422j {

    /* renamed from: a */
    private final FeedRepository f17717a;

    /* renamed from: b */
    private final List<Bundle> f17718b = new ArrayList();

    /* renamed from: c */
    private final List<Room> f17719c = new ArrayList();

    /* renamed from: d */
    private C0100h<FeedItem> f17720d = null;

    /* renamed from: e */
    private final C0105c f17721e = new C0105c() {
        /* renamed from: a */
        private void m18696a() {
            C5975a.this.mo14635m_();
            C5975a.this.mo23118f();
        }

        /* renamed from: a */
        public final void mo160a(int i, int i2) {
            m18696a();
        }

        /* renamed from: b */
        public final void mo161b(int i, int i2) {
            m18696a();
        }
    };

    /* renamed from: f */
    private final C0053p<C0100h<FeedItem>> f17722f = new C5977b(this);

    /* renamed from: d */
    public final List<Room> mo14634d() {
        return this.f17719c;
    }

    /* renamed from: b */
    public final int mo14629b() {
        return this.f17718b.size();
    }

    /* renamed from: c */
    public final void mo14632c() {
        if (!(this.f17717a == null || this.f17717a.mo14748i() == null)) {
            this.f17717a.mo14748i().mo10029a().removeObserver(this.f17722f);
        }
        if (this.f17720d != null) {
            this.f17720d.mo203a(this.f17721e);
            this.f17720d = null;
        }
        this.f17718b.clear();
        this.f17719c.clear();
    }

    /* renamed from: m_ */
    public final void mo14635m_() {
        this.f17718b.clear();
        this.f17719c.clear();
        if (this.f17717a != null && !C6311g.m19573a(this.f17717a.mo14508f())) {
            for (FeedItem feedItem : this.f17717a.mo14508f()) {
                if (feedItem.item instanceof Room) {
                    this.f17718b.add(C9412a.m27916a((Room) feedItem.item));
                    this.f17719c.add((Room) feedItem.item);
                }
            }
        }
    }

    /* renamed from: a */
    public final Bundle mo14625a(int i) {
        return (Bundle) this.f17718b.get(i);
    }

    /* renamed from: c */
    private int m18683c(int i) {
        if (this.f17720d == null || this.f17720d.size() <= 0) {
            return i + 6;
        }
        return this.f17720d.size();
    }

    /* renamed from: a */
    public final void mo14627a(long j) {
        if (this.f17717a != null) {
            this.f17717a.mo14506b(String.valueOf(j));
        }
    }

    /* renamed from: a */
    public final int mo14624a(Bundle bundle) {
        long j = bundle.getLong("live.intent.extra.ROOM_ID", -1);
        for (int i = 0; i < this.f17718b.size(); i++) {
            if (((Bundle) this.f17718b.get(i)).getLong("live.intent.extra.ROOM_ID", 0) == j) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo14630b(long j) {
        for (int i = 0; i < this.f17718b.size(); i++) {
            if (((Bundle) this.f17718b.get(i)).getLong("live.intent.extra.ROOM_ID") == j) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo14631b(int i) {
        if (this.f17717a != null) {
            C3197b i2 = this.f17717a.mo14748i();
            if (i2 != null) {
                Boolean bool = (Boolean) i2.mo10035d().getValue();
                if (bool != null && bool.booleanValue()) {
                    this.f17717a.mo14498a((String) null, "detail_loadmore");
                    if (!(this.f17717a.mo14748i() == null || this.f17717a.mo14748i().mo10029a().getValue() == null || ((C0100h) this.f17717a.mo14748i().mo10029a().getValue()).isEmpty())) {
                        ((C0100h) this.f17717a.mo14748i().mo10029a().getValue()).mo210d(m18683c(i));
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo14633c(long j) {
        if (this.f17717a != null) {
            FeedItem c = this.f17717a.mo14507c(String.valueOf(j));
            if (c != null) {
                int indexOf = this.f17717a.mo14508f().indexOf(c);
                if (!(indexOf < 0 || this.f17717a.mo14753j() == null || this.f17717a.mo14753j().f17737b == null)) {
                    ((C5985b) this.f17717a.mo14753j().f17737b).f17738a.setValue(Integer.valueOf(indexOf));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14628a(C0100h hVar) {
        if (hVar != null) {
            boolean z = false;
            if (this.f17720d != null) {
                this.f17720d.mo203a(this.f17721e);
                z = true;
            }
            this.f17720d = hVar;
            this.f17720d.mo204a(null, this.f17721e);
            if (z) {
                mo14635m_();
                mo23118f();
            }
        }
    }

    public C5975a(FeedDataKey feedDataKey, C5980f fVar) {
        this.f17717a = (FeedRepository) fVar.mo14609a(feedDataKey);
        mo14635m_();
        if (this.f17717a != null && this.f17717a.mo14748i() != null) {
            this.f17717a.mo14748i().mo10029a().observeForever(this.f17722f);
        }
    }

    /* renamed from: a */
    public final void mo14626a(int i, FeedItem feedItem) {
        if (feedItem != null && i < this.f17718b.size() && i >= 0) {
            FeedItem c = this.f17717a.mo14507c(String.valueOf(mo14625a(i).getLong("live.intent.extra.ROOM_ID")));
            if (c != null) {
                int b = this.f17717a.mo14748i().mo10032b(c);
                c.banners = feedItem.banners;
                c.setRoomFrom(feedItem);
                c.item = feedItem.item;
                c.logPb = feedItem.logPb;
                c.object = feedItem.object;
                c.orderType = feedItem.orderType;
                c.repeatDisable = feedItem.repeatDisable;
                c.resId = feedItem.resId;
                c.searchId = feedItem.searchId;
                c.tags = feedItem.tags;
                c.searchReqId = feedItem.searchReqId;
                c.type = feedItem.type;
                this.f17717a.mo14748i().mo10030a(b);
            }
        }
    }
}
