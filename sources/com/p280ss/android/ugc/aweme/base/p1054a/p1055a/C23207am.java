package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.setting.p337ui.C37918h;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.am */
final class C23207am implements C37918h {

    /* renamed from: a */
    private Context f61189a;

    /* renamed from: b */
    private Keva f61190b = Keva.getRepoFromSp(this.f61189a, "DiskManager", 0);

    /* renamed from: b */
    public final void mo60395b(long j) {
        this.f61190b.storeLong("last_show_disk_manager_dot_time", j);
    }

    /* renamed from: a */
    public final long mo60393a(long j) {
        return this.f61190b.getLong("last_show_disk_manager_dot_time", 0);
    }

    /* renamed from: b */
    public final void mo60396b(boolean z) {
        this.f61190b.storeBoolean("has_show_disk_manager_guide", true);
    }

    /* renamed from: c */
    public final boolean mo60397c(boolean z) {
        return this.f61190b.getBoolean("has_show_disk_manager_dot", false);
    }

    /* renamed from: d */
    public final void mo60398d(boolean z) {
        this.f61190b.storeBoolean("has_show_disk_manager_dot", true);
    }

    public C23207am(Context context) {
        this.f61189a = context;
    }

    /* renamed from: a */
    public final boolean mo60394a(boolean z) {
        return this.f61190b.getBoolean("has_show_disk_manager_guide", false);
    }
}
