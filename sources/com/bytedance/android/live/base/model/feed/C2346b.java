package com.bytedance.android.live.base.model.feed;

import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.live.base.model.feed.b */
public final class C2346b {
    @C6593c(mo15949a = "live_feed_preload_style_one")

    /* renamed from: a */
    public int f7706a;
    @C6593c(mo15949a = "live_feed_preload_style_two")

    /* renamed from: b */
    public int f7707b;
    @C6593c(mo15949a = "live_feed_preload_in_room")

    /* renamed from: c */
    public int f7708c;
    @C6593c(mo15949a = "live_feed_preload_new_feed")

    /* renamed from: d */
    public int f7709d = 2;

    /* renamed from: a */
    public final int mo8250a() {
        return (this.f7707b - 1) * 2;
    }
}
