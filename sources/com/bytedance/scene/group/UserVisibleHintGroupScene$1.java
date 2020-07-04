package com.bytedance.scene.group;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;

class UserVisibleHintGroupScene$1 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C12622f f33447a;

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_START)
    public void onDestroy() {
        this.f33447a.f33498j.mo30986a(Event.ON_DESTROY);
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        this.f33447a.f33500l = false;
        if (this.f33447a.f33499k) {
            this.f33447a.f33498j.mo30986a(Event.ON_PAUSE);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        this.f33447a.f33500l = true;
        if (this.f33447a.f33499k) {
            this.f33447a.f33498j.mo30986a(Event.ON_RESUME);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_START)
    public void onStart() {
        this.f33447a.f33501m = true;
        if (this.f33447a.f33499k) {
            this.f33447a.f33498j.mo30986a(Event.ON_START);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
        this.f33447a.f33501m = false;
        if (this.f33447a.f33499k) {
            this.f33447a.f33498j.mo30986a(Event.ON_STOP);
        }
    }
}
