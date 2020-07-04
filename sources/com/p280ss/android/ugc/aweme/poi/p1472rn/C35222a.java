package com.p280ss.android.ugc.aweme.poi.p1472rn;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.ss.android.ugc.aweme.poi.rn.a */
public final class C35222a extends Event<C35222a> {

    /* renamed from: a */
    private final String f92231a;

    public final short getCoalescingKey() {
        return 0;
    }

    public final String getEventName() {
        return "topChange";
    }

    /* renamed from: a */
    private WritableMap m113629a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("state", this.f92231a);
        return createMap;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), m113629a());
    }

    C35222a(int i, String str) {
        super(i);
        this.f92231a = str;
    }
}
