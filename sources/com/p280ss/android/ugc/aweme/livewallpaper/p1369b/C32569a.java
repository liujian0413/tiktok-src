package com.p280ss.android.ugc.aweme.livewallpaper.p1369b;

import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32571c.C32575a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.a */
public final class C32569a implements C32575a {

    /* renamed from: a */
    private String f84921a;

    public C32569a(String str) {
        this.f84921a = str;
    }

    /* renamed from: a */
    public final void mo83852a(boolean z, String str) {
        if (z) {
            C10761a.m31383a(C6399b.m19921a(), (int) R.string.dmg).mo25750a();
            C32577e.m105486a(0, "");
        } else {
            C32577e.m105486a(1, str);
        }
        if (this.f84921a != null) {
            C32577e.m105491a(this.f84921a, "video_share", z);
        }
        C32571c.m105458a().mo83855a("video_share");
    }
}
