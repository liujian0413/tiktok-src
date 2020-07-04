package com.bytedance.android.livesdkapi.depend.live;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9412a;

/* renamed from: com.bytedance.android.livesdkapi.depend.live.m */
public final class C9339m {
    /* renamed from: a */
    public static Bundle m27772a(Context context, Room room, String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("live.intent.extra.ENTER_LIVE_SOURCE", str);
        bundle2.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle);
        bundle2.putBundle("live.intent.extra.EXTRA_ROOM_ARGS", C9412a.m27916a(room));
        return bundle2;
    }

    /* renamed from: a */
    public static Bundle m27771a(Context context, long j, String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putLong("live.intent.extra.ROOM_ID", j);
        bundle2.putString("live.intent.extra.ENTER_LIVE_SOURCE", str);
        bundle2.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle);
        if (bundle != null) {
            bundle2.putBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA", bundle.getBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA"));
        }
        return bundle2;
    }

    /* renamed from: a */
    public static Bundle m27770a(Context context, int i, String str, String str2, int i2, boolean z, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("live.intent.extra.IS_MULTI", true);
        bundle2.putInt("live.intent.extra.POSITION", i);
        bundle2.putString("live.intent.extra.ENTER_LIVE_SOURCE", str);
        bundle2.putString("live.intent.extra.EXTRA_ENTER_FEED_STYLE", str2);
        bundle2.putInt("live.intent.extra.SWIPE_SWITCH_MASK", i2);
        bundle2.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle);
        bundle2.putBoolean("live.intent.extra.DISLIKE_ENABLED", z);
        return bundle2;
    }
}
