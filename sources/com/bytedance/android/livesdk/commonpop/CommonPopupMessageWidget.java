package com.bytedance.android.livesdk.commonpop;

import com.bytedance.android.livesdk.chatroom.viewmodule.C5596au;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public class CommonPopupMessageWidget extends LiveRecyclableWidget implements C5862b {

    /* renamed from: a */
    private C5861a f17243a;

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public void onUnload() {
        this.f17243a.mo8963a();
    }

    public void onInit(Object[] objArr) {
        this.f17243a = new C5861a();
    }

    public void onLoad(Object[] objArr) {
        this.f17243a.mo9142a((C5862b) this);
    }

    /* renamed from: a */
    public final void mo14352a(String str) {
        C9178j.m27302j().mo22380i().handle(getContext(), str);
    }
}
