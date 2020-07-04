package com.bytedance.android.live.misc;

import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.depend.live.C9327c;

public class LiveService$$livegiftimpl {
    public static void registerService() {
        C3596c.m13174a(IGiftService.class, new GiftService());
        C3596c.m13174a(C9327c.class, new GiftService());
    }
}
