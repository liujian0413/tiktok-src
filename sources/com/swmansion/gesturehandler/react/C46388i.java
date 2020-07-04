package com.swmansion.gesturehandler.react;

import android.support.p022v4.util.Pools.SynchronizedPool;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.gesturehandler.C46347b;

/* renamed from: com.swmansion.gesturehandler.react.i */
public final class C46388i extends Event<C46388i> {

    /* renamed from: a */
    private static final SynchronizedPool<C46388i> f119430a = new SynchronizedPool<>(7);

    /* renamed from: b */
    private WritableMap f119431b;

    private C46388i() {
    }

    public final boolean canCoalesce() {
        return false;
    }

    public final short getCoalescingKey() {
        return 0;
    }

    public final String getEventName() {
        return "onGestureHandlerStateChange";
    }

    public final void onDispose() {
        this.f119431b = null;
        f119430a.release(this);
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerStateChange", this.f119431b);
    }

    /* renamed from: a */
    public static C46388i m145716a(C46347b bVar, int i, int i2, C46380c cVar) {
        C46388i iVar = (C46388i) f119430a.acquire();
        if (iVar == null) {
            iVar = new C46388i();
        }
        iVar.m145717b(bVar, i, i2, cVar);
        return iVar;
    }

    /* renamed from: b */
    private void m145717b(C46347b bVar, int i, int i2, C46380c cVar) {
        super.init(bVar.f119285d.getId());
        this.f119431b = Arguments.createMap();
        if (cVar != null) {
            cVar.mo115293a(bVar, this.f119431b);
        }
        this.f119431b.putInt("handlerTag", bVar.f119284c);
        this.f119431b.putInt("state", i);
        this.f119431b.putInt("oldState", i2);
    }
}
