package com.bytedance.android.livesdkapi.p452h;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.h.l */
public final class C9426l {

    /* renamed from: com.bytedance.android.livesdkapi.h.l$a */
    static class C9428a {

        /* renamed from: a */
        public static C9426l f25908a = new C9426l();
    }

    private C9426l() {
    }

    /* renamed from: a */
    public static C9426l m27948a() {
        return C9428a.f25908a;
    }

    /* renamed from: a */
    public final Room mo23121a(long j) {
        if (C9421i.m27940b().mo23116a() == null || C9421i.m27940b().mo23116a().mo14634d() == null) {
            return null;
        }
        Room a = m27947a(C9421i.m27940b().mo23116a().mo14634d(), j);
        if (a == null) {
            a = m27947a(C9421i.m27940b().mo23116a().mo21537a(), j);
        }
        return a;
    }

    /* renamed from: a */
    private static Room m27947a(List<Room> list, long j) {
        if (C6311g.m19573a(list)) {
            return null;
        }
        for (Room room : list) {
            if (room.getId() == j) {
                return room;
            }
        }
        return null;
    }
}
