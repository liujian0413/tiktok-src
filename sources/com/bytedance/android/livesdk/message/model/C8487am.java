package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.message.MessageType;

/* renamed from: com.bytedance.android.livesdk.message.model.am */
public final class C8487am extends C8538c {

    /* renamed from: a */
    public User f23245a;

    /* renamed from: b */
    public long f23246b;

    /* renamed from: c */
    public String f23247c;

    /* renamed from: d */
    public long f23248d;

    public final boolean canText() {
        return true;
    }

    public C8487am() {
        this.type = MessageType.GIFT_GROUP;
    }

    public final boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f26000j == null) {
            return false;
        }
        return true;
    }

    public final boolean isCurrentRoom(long j) {
        if (this.f23248d == j) {
            return true;
        }
        return false;
    }
}
