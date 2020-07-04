package com.bytedance.android.live.misc;

import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.i18n.C3439a;
import com.bytedance.android.live.linkpk.C3440a;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.module.BrowserService;
import com.bytedance.android.livesdk.module.I18nServices;
import com.bytedance.android.livesdk.module.LinkPkService;
import com.bytedance.android.livesdk.module.RoomService;
import com.bytedance.android.livesdk.module.UserService;
import com.bytedance.android.livesdk.schema.LiveActionHandlerImpl;
import com.bytedance.android.livesdk.schema.interfaces.C8931a;
import com.bytedance.android.livesdkapi.depend.live.C9332f;

public class LiveService$$livesdk {
    public static void registerService() {
        C3596c.m13174a(C8931a.class, new LiveActionHandlerImpl());
        C3596c.m13174a(C3440a.class, new LinkPkService());
        C3596c.m13174a(C3439a.class, new I18nServices());
        C3596c.m13174a(C3592a.class, new UserService());
        C3596c.m13174a(C3141a.class, new BrowserService());
        C3596c.m13174a(C3495l.class, new RoomService());
        C3596c.m13174a(C9332f.class, new RoomService());
        C3451a.m12773a();
    }
}
