package com.bytedance.android.live;

import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.gson.C3437a;
import com.bytedance.android.live.gson.FeedItemTypeAdapter;
import com.bytedance.android.live.gson.RoomTypeAdapter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.google.gson.FieldNamingPolicy;

/* renamed from: com.bytedance.android.live.a */
public final class C2317a {

    /* renamed from: com.bytedance.android.live.a$a */
    static class C2318a {

        /* renamed from: a */
        public static final C6607f f7636a;

        /* renamed from: b */
        public static final C6600e f7637b;

        /* renamed from: c */
        public static final C6600e f7638c = new C6600e();

        static {
            C6607f a = new C6607f().mo15984a(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).mo15986a(Room.class, new RoomTypeAdapter()).mo15986a(FeedItem.class, new FeedItemTypeAdapter()).mo15986a(Boolean.class, new C3437a()).mo15986a(Boolean.TYPE, new C3437a());
            f7636a = a;
            f7637b = a.mo15992f();
        }
    }

    /* renamed from: a */
    public static C6600e m9932a() {
        return C2318a.f7637b;
    }

    /* renamed from: b */
    public static C6600e m9933b() {
        return C2318a.f7638c;
    }

    /* renamed from: c */
    public static C6607f m9934c() {
        return C2318a.f7636a;
    }
}
