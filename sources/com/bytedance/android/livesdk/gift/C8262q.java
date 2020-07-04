package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.gift.q */
public final class C8262q {
    /* renamed from: b */
    public static String m25252b() {
        return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.musical.ly%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
    }

    /* renamed from: a */
    public static boolean m25251a() {
        boolean z;
        long b = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11155b();
        Boolean bool = (Boolean) LiveSettingKeys.HIDE_GIFT_ICON_FOR_USER.mo10240a();
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (!z || b > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m25254c(Room room, boolean z) {
        int a = m25250a(room, z);
        if (a == 0 || a == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m25253b(Room room, boolean z) {
        int a = m25250a(room, z);
        if (a == 0 || a == 3 || a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m25255d(Room room, boolean z) {
        boolean z2;
        Boolean bool = (Boolean) LiveSettingKeys.SHOW_PROP_PACKET.mo10240a();
        if (bool == null || !bool.booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || !z2 || room == null || room.mRoomAuthStatus == null || !room.mRoomAuthStatus.isEnableProps()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m25250a(Room room, boolean z) {
        boolean z2;
        boolean z3;
        long b = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11155b();
        boolean z4 = true;
        if (room == null || room.mRoomAuthStatus == null || !room.mRoomAuthStatus.isEnableGift()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (room == null || room.mRoomAuthStatus == null || !room.mRoomAuthStatus.isEnableProps()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z) {
            if (!z2) {
                return 2;
            }
            return 0;
        } else if (!z2) {
            return 1;
        } else {
            Boolean bool = (Boolean) LiveSettingKeys.LIVE_MT_USER_CAN_RECHARGE.mo10240a();
            if (bool == null || !bool.booleanValue()) {
                z4 = false;
            }
            if (z4 || b > 0 || !z3) {
                return 0;
            }
            return 3;
        }
    }
}
