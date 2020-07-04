package com.bytedance.android.livesdk.commerce;

import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.commerce.c */
public final class C5842c {
    /* renamed from: a */
    public static boolean m18302a(Room room) {
        if (room == null) {
            return false;
        }
        if (room.hasCommerceGoods() || (room.getOwner() != null && room.getOwner().isWithCommercePermission())) {
            return true;
        }
        return false;
    }
}
