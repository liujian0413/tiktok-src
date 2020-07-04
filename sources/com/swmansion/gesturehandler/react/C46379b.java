package com.swmansion.gesturehandler.react;

import android.support.p022v4.util.Pools.SynchronizedPool;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.gesturehandler.C46347b;

/* renamed from: com.swmansion.gesturehandler.react.b */
public final class C46379b extends Event<C46379b> {

    /* renamed from: a */
    private static final SynchronizedPool<C46379b> f119414a = new SynchronizedPool<>(7);

    /* renamed from: b */
    private WritableMap f119415b;

    private C46379b() {
    }

    public final boolean canCoalesce() {
        return false;
    }

    public final short getCoalescingKey() {
        return 0;
    }

    public final String getEventName() {
        return "onGestureHandlerEvent";
    }

    public final void onDispose() {
        this.f119415b = null;
        f119414a.release(this);
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerEvent", this.f119415b);
    }

    /* renamed from: a */
    public static C46379b m145689a(C46347b bVar, C46380c cVar) {
        C46379b bVar2 = (C46379b) f119414a.acquire();
        if (bVar2 == null) {
            bVar2 = new C46379b();
        }
        bVar2.m145690b(bVar, cVar);
        return bVar2;
    }

    /* renamed from: b */
    private void m145690b(C46347b bVar, C46380c cVar) {
        super.init(bVar.f119285d.getId());
        this.f119415b = Arguments.createMap();
        if (cVar != null) {
            cVar.mo115293a(bVar, this.f119415b);
        }
        this.f119415b.putInt("handlerTag", bVar.f119284c);
        this.f119415b.putInt("state", bVar.f119286e);
    }
}
