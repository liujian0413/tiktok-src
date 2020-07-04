package com.bytedance.android.livesdk.chatroom.p212e;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.a */
public abstract class C4340a<T extends C8538c> extends C4343b<T> {
    /* renamed from: a */
    public abstract ImageModel mo12060a();

    /* renamed from: a */
    public void mo12061a(Context context, Room room) {
    }

    /* renamed from: b */
    public abstract int mo12062b();

    /* renamed from: c */
    public ImageModel mo12063c() {
        return null;
    }

    /* renamed from: d */
    public abstract boolean mo12064d();

    /* renamed from: e */
    public User mo12065e() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        return false;
    }

    /* renamed from: g */
    public String mo12067g() {
        return "#ff4e33";
    }

    /* renamed from: h */
    public ImageModel mo12068h() {
        return null;
    }

    public C4340a(T t) {
        super(t, 1);
    }
}
