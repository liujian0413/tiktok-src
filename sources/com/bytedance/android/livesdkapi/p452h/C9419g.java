package com.bytedance.android.livesdkapi.p452h;

import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9416e.C9417a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdkapi.h.g */
public abstract class C9419g implements C9416e {

    /* renamed from: a */
    private final Set<C9417a> f25903a = new HashSet();

    /* renamed from: a */
    public void mo14626a(int i, FeedItem feedItem) {
    }

    /* renamed from: a */
    public abstract void mo14627a(long j);

    /* renamed from: a */
    public void mo21539a(List<Room> list) {
    }

    /* renamed from: b */
    public abstract void mo14631b(int i);

    /* renamed from: d */
    public abstract List<Room> mo14634d();

    /* renamed from: a */
    public List<Room> mo21537a() {
        return new ArrayList();
    }

    /* renamed from: c */
    public void mo14632c() {
        this.f25903a.clear();
    }

    /* renamed from: f */
    public final void mo23118f() {
        for (C9417a a : this.f25903a) {
            a.mo21545a();
        }
    }

    /* renamed from: b */
    public final void mo23115b(C9417a aVar) {
        this.f25903a.remove(aVar);
    }

    /* renamed from: a */
    public final void mo23114a(C9417a aVar) {
        this.f25903a.add(aVar);
    }
}
