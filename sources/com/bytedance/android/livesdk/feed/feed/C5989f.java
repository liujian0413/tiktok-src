package com.bytedance.android.livesdk.feed.feed;

import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.feed.feed.f */
public final class C5989f {
    @C6593c(mo15949a = "id")

    /* renamed from: a */
    public long f17751a;
    @C6593c(mo15949a = "name")

    /* renamed from: b */
    public String f17752b;
    @C6593c(mo15949a = "default")

    /* renamed from: c */
    public int f17753c;
    @C6593c(mo15949a = "url")

    /* renamed from: d */
    public String f17754d;
    @C6593c(mo15949a = "inter_url")

    /* renamed from: e */
    public String f17755e;
    @C6593c(mo15949a = "style")

    /* renamed from: f */
    public int f17756f;
    @C6593c(mo15949a = "type")

    /* renamed from: g */
    public int f17757g;
    @C6593c(mo15949a = "umeng_event")

    /* renamed from: h */
    public String f17758h;
    @C6593c(mo15949a = "umeng_source")

    /* renamed from: i */
    public int f17759i;
    @C6593c(mo15949a = "enable_dislike")

    /* renamed from: j */
    public int f17760j;

    /* renamed from: k */
    public boolean f17761k;
    @C6593c(mo15949a = "enable_draw_stream")

    /* renamed from: l */
    private int f17762l;

    /* renamed from: c */
    public final boolean mo14647c() {
        if (this.f17762l == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo14645a() {
        if (this.f17756f <= 0 || this.f17756f > 4) {
            this.f17756f = 2;
        }
        return this.f17756f;
    }

    /* renamed from: b */
    public final boolean mo14646b() {
        if (C6319n.m19593a(this.f17752b) || C6319n.m19593a(this.f17754d)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}
