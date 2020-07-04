package com.bytedance.android.livesdk.honor;

import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5596au;
import com.bytedance.android.livesdk.honor.C8298a.C8299a;
import com.bytedance.android.livesdk.message.model.C8498ax;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public class HonorUpgradeLandscapeNotifyWidget extends LiveRecyclableWidget implements C8299a {

    /* renamed from: a */
    private C8298a f22781a;

    /* renamed from: b */
    private C8300b f22782b;

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public void onInit(Object[] objArr) {
    }

    public void onUnload() {
        if (this.f22781a != null) {
            this.f22781a.mo8963a();
        }
    }

    /* renamed from: a */
    public final void mo21450a(C8498ax axVar) {
        this.f22782b.mo21455a(axVar);
    }

    public void onLoad(Object[] objArr) {
        this.f22781a = new C8298a();
        this.f22781a.mo9142a((C8299a) this);
        this.f22782b = new C8300b(getContext(), true, this.f22781a);
        if (this.containerView != null) {
            this.containerView.addView(this.f22782b, new LayoutParams(-1, -1));
        }
    }
}
