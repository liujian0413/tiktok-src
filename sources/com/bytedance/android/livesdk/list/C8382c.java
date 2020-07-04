package com.bytedance.android.livesdk.list;

import android.os.Bundle;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9419g;
import com.bytedance.common.utility.C6311g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.list.c */
public final class C8382c extends C9419g {

    /* renamed from: a */
    private Bundle f22978a;

    /* renamed from: b */
    private List<Room> f22979b = new ArrayList();

    /* renamed from: a */
    public final int mo14624a(Bundle bundle) {
        return 0;
    }

    /* renamed from: a */
    public final void mo14626a(int i, FeedItem feedItem) {
    }

    /* renamed from: a */
    public final void mo14627a(long j) {
    }

    /* renamed from: b */
    public final int mo14629b() {
        return 1;
    }

    /* renamed from: b */
    public final void mo14631b(int i) {
    }

    /* renamed from: d */
    public final List<Room> mo14634d() {
        return Collections.EMPTY_LIST;
    }

    /* renamed from: a */
    public final List<Room> mo21537a() {
        return this.f22979b;
    }

    /* renamed from: a */
    public final Bundle mo14625a(int i) {
        return this.f22978a;
    }

    public C8382c(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f22978a = bundle;
    }

    /* renamed from: a */
    public final void mo21539a(List<Room> list) {
        if (!C6311g.m19573a(list)) {
            if (this.f22979b == null) {
                this.f22979b = new ArrayList();
            }
            this.f22979b.clear();
            this.f22979b.add(list.get(0));
        }
    }
}
