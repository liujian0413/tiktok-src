package com.bytedance.android.livesdk.chatroom.presenter;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.Lifecycle.Event;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3296e;
import com.bytedance.android.live.core.rxutils.C3297f;
import com.bytedance.android.live.core.rxutils.autodispose.C3233a;
import com.bytedance.android.live.core.rxutils.autodispose.C3246ae;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.rxutils.autodispose.C3274m;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.ies.p533a.C10291b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ci */
public abstract class C5017ci<T extends C5595at> extends C10291b<T> {

    /* renamed from: a */
    private C3297f f14274a;

    /* renamed from: g */
    protected DataCenter f14275g;

    /* renamed from: h */
    protected IMessageManager f14276h;

    /* access modifiers changed from: protected */
    /* renamed from: l_ */
    public String mo12985l_() {
        return getClass().getName();
    }

    /* renamed from: t */
    public final <D> C3274m<D> mo13032t() {
        return C3255e.m12293a((C0043i) mo9140c());
    }

    /* renamed from: a */
    public void mo8963a() {
        if ((this instanceof OnMessageListener) && this.f14276h != null) {
            this.f14276h.removeMessageListener((OnMessageListener) this);
        }
        this.f14275g = null;
        super.mo8963a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final <D> C3274m<D> mo13033u() {
        if (this.f14274a == null) {
            this.f14274a = new C3297f();
        }
        return C3255e.m12298a((C3246ae) C3233a.m12259a((C0043i) mo9140c(), Event.ON_DESTROY), (C3296e<T>) this.f14274a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final <D> C3274m<D> mo13034v() {
        if (this.f14274a == null) {
            this.f14274a = new C3297f();
        }
        return C3255e.m12298a((C3246ae) C3233a.m12259a((C0043i) ((C5595at) mo9140c()).getContext(), Event.ON_DESTROY), (C3296e<T>) this.f14274a);
    }

    /* renamed from: m */
    public final void mo13031m(Throwable th) {
        C3166a.m11955a(6, mo12985l_(), th.getStackTrace());
    }

    /* renamed from: a */
    public void mo9142a(T t) {
        super.mo9142a(t);
        if (t != null) {
            this.f14275g = t.getDataCenter();
            if (this.f14275g != null) {
                this.f14276h = (IMessageManager) this.f14275g.get("data_message_manager");
            }
        }
    }
}
