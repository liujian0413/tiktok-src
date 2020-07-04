package com.bytedance.android.live.room.p168a;

import com.bytedance.android.live.base.model.user.User;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;

/* renamed from: com.bytedance.android.live.room.a.a */
public final class C3482a {

    /* renamed from: a */
    public String f10310a;

    /* renamed from: b */
    public User f10311b;

    /* renamed from: c */
    public long f10312c;

    /* renamed from: d */
    private long f10313d = System.currentTimeMillis();

    /* renamed from: b */
    public final C3482a mo10466b() {
        C3482a aVar = new C3482a(this.f10310a, this.f10311b, this.f10312c);
        aVar.f10313d = this.f10313d;
        return aVar;
    }

    /* renamed from: a */
    public final boolean mo10465a() {
        if (System.currentTimeMillis() - this.f10313d > C40413c.f105051b) {
            return true;
        }
        return false;
    }

    public C3482a(String str, User user, long j) {
        this.f10310a = str;
        this.f10311b = user;
        this.f10312c = j;
    }
}
