package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32576d;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.v */
final class C23236v implements C32576d {

    /* renamed from: a */
    private Context f61236a;

    /* renamed from: b */
    private Keva f61237b = Keva.getRepoFromSp(this.f61236a, "LiveWallPaper", 0);

    /* renamed from: b */
    public final void mo60445b(int i) {
        this.f61237b.storeInt("current_video_width", i);
    }

    /* renamed from: d */
    public final void mo60449d(int i) {
        this.f61237b.storeInt("current_video_height", i);
    }

    /* renamed from: f */
    public final void mo60452f(String str) {
        this.f61237b.storeString("source", str);
    }

    /* renamed from: a */
    public final int mo60443a(int i) {
        return this.f61237b.getInt("current_video_width", 0);
    }

    /* renamed from: b */
    public final void mo60446b(String str) {
        this.f61237b.storeString("live_wall_paper_list", str);
    }

    /* renamed from: c */
    public final int mo60447c(int i) {
        return this.f61237b.getInt("current_video_height", 0);
    }

    /* renamed from: d */
    public final void mo60450d(String str) {
        this.f61237b.storeString("current_video_path", str);
    }

    /* renamed from: e */
    public final String mo60451e(String str) {
        return this.f61237b.getString("source", str);
    }

    public C23236v(Context context) {
        this.f61236a = context;
    }

    /* renamed from: a */
    public final String mo60444a(String str) {
        return this.f61237b.getString("live_wall_paper_list", str);
    }

    /* renamed from: c */
    public final String mo60448c(String str) {
        return this.f61237b.getString("current_video_path", str);
    }
}
