package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.browser.fragment.WebDialogFragment;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dx */
public final class C5680dx {

    /* renamed from: a */
    private static final WeakReference<WebDialogFragment> f16769a = new WeakReference<>(null);

    /* renamed from: a */
    public static final WeakReference<WebDialogFragment> m18038a() {
        return f16769a;
    }

    /* renamed from: b */
    public static final void m18039b() {
        C8443c.m25663a().mo21607a("lottery_show", Room.class, C8438j.class);
    }

    /* renamed from: c */
    public static final void m18040c() {
        C8443c.m25663a().mo21607a("click_lottery", Room.class, C8438j.class);
    }
}
