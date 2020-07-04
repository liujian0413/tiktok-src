package com.facebook.react.animated;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.List;

class EventAnimationDriver implements RCTEventEmitter {
    private List<String> mEventPath;
    ValueAnimatedNode mValueNode;

    public EventAnimationDriver(List<String> list, ValueAnimatedNode valueAnimatedNode) {
        this.mEventPath = list;
        this.mValueNode = valueAnimatedNode;
    }

    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new RuntimeException("receiveTouches is not support by native animated events");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.facebook.react.bridge.WritableMap, code=com.facebook.react.bridge.ReadableMap, for r4v0, types: [com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.WritableMap] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void receiveEvent(int r2, java.lang.String r3, com.facebook.react.bridge.ReadableMap r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L_0x0035
            r2 = 0
        L_0x0003:
            java.util.List<java.lang.String> r3 = r1.mEventPath
            int r3 = r3.size()
            int r3 = r3 + -1
            if (r2 >= r3) goto L_0x001c
            java.util.List<java.lang.String> r3 = r1.mEventPath
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            com.facebook.react.bridge.ReadableMap r4 = r4.getMap(r3)
            int r2 = r2 + 1
            goto L_0x0003
        L_0x001c:
            com.facebook.react.animated.ValueAnimatedNode r2 = r1.mValueNode
            java.util.List<java.lang.String> r3 = r1.mEventPath
            java.util.List<java.lang.String> r0 = r1.mEventPath
            int r0 = r0.size()
            int r0 = r0 + -1
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            double r3 = r4.getDouble(r3)
            r2.mValue = r3
            return
        L_0x0035:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Native animated events must have event data."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.EventAnimationDriver.receiveEvent(int, java.lang.String, com.facebook.react.bridge.WritableMap):void");
    }
}
