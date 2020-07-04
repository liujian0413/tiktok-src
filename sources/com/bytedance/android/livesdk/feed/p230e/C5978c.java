package com.bytedance.android.livesdk.feed.p230e;

import android.os.Bundle;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9412a;
import com.bytedance.android.livesdkapi.p452h.C9419g;
import com.bytedance.android.livesdkapi.p452h.C9422j;
import com.bytedance.common.utility.C6311g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.e.c */
public final class C5978c extends C9419g implements C9422j {

    /* renamed from: a */
    private final List<Bundle> f17725a = new ArrayList();

    /* renamed from: b */
    private final List<Room> f17726b = new ArrayList();

    /* renamed from: a */
    public final void mo14626a(int i, FeedItem feedItem) {
    }

    /* renamed from: b */
    public final void mo14631b(int i) {
    }

    /* renamed from: c */
    public final void mo14633c(long j) {
    }

    /* renamed from: d */
    public final List<Room> mo14634d() {
        return this.f17726b;
    }

    /* renamed from: b */
    public final int mo14629b() {
        return this.f17725a.size();
    }

    /* renamed from: c */
    public final void mo14632c() {
        super.mo14632c();
        this.f17725a.clear();
        this.f17726b.clear();
    }

    /* renamed from: a */
    public final int mo14624a(Bundle bundle) {
        return this.f17725a.indexOf(bundle);
    }

    /* renamed from: a */
    public final Bundle mo14625a(int i) {
        return (Bundle) this.f17725a.get(i);
    }

    public C5978c(List<Room> list) {
        m18699b(list);
    }

    /* renamed from: b */
    private void m18699b(List<Room> list) {
        this.f17725a.clear();
        this.f17726b.clear();
        if (!C6311g.m19573a(list)) {
            this.f17726b.addAll(list);
            for (Room a : list) {
                this.f17725a.add(C9412a.m27916a(a));
            }
        }
    }

    /* renamed from: a */
    public final void mo14627a(long j) {
        for (int i = 0; i < this.f17725a.size(); i++) {
            if (((Room) this.f17726b.get(i)).getId() == j) {
                this.f17725a.remove(i);
                this.f17726b.remove(i);
                mo23118f();
                return;
            }
        }
    }
}
