package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34325e;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ae */
final class C23199ae implements C34325e {

    /* renamed from: a */
    private Context f61173a;

    /* renamed from: b */
    private Keva f61174b = Keva.getRepoFromSp(this.f61173a, "TutorialVideoPreference", 0);

    /* renamed from: b */
    public final void mo60349b(String str) {
        this.f61174b.storeString("tutorial_video_aweme_id", str);
    }

    /* renamed from: d */
    public final void mo60351d(String str) {
        this.f61174b.storeString("tutorial_video_title", str);
    }

    /* renamed from: f */
    public final void mo60353f(String str) {
        this.f61174b.storeString("tutorial_video_content", str);
    }

    /* renamed from: h */
    public final void mo60355h(String str) {
        this.f61174b.storeString("tutorial_video_button", str);
    }

    /* renamed from: a */
    public final String mo60348a(String str) {
        return this.f61174b.getString("tutorial_video_aweme_id", str);
    }

    /* renamed from: c */
    public final String mo60350c(String str) {
        return this.f61174b.getString("tutorial_video_title", str);
    }

    /* renamed from: e */
    public final String mo60352e(String str) {
        return this.f61174b.getString("tutorial_video_content", str);
    }

    /* renamed from: g */
    public final String mo60354g(String str) {
        return this.f61174b.getString("tutorial_video_button", str);
    }

    public C23199ae(Context context) {
        this.f61173a = context;
    }
}
