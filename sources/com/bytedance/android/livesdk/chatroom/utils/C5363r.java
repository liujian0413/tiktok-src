package com.bytedance.android.livesdk.chatroom.utils;

import com.bytedance.android.livesdk.config.LiveSettingKeys;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.r */
public final class C5363r {

    /* renamed from: a */
    private static String f15638a = "live.pref.SHOW_SCROLL_TIPS";

    /* renamed from: b */
    private static int f15639b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.utils.r$a */
    public interface C5364a {
    }

    /* renamed from: b */
    public static void m17096b() {
        f15639b = 0;
    }

    /* renamed from: a */
    public static boolean m17095a() {
        if (((Integer) LiveSettingKeys.SLIDE_UP_SHOW_AB.mo10240a()).intValue() == 1) {
            return true;
        }
        return false;
    }
}
