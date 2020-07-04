package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class ImageLoadEvent extends Event<ImageLoadEvent> {
    private final int mEventType;
    private final int mHeight;
    private final String mImageUri;
    private final int mWidth;

    public short getCoalescingKey() {
        return (short) this.mEventType;
    }

    public String getEventName() {
        return eventNameForType(this.mEventType);
    }

    public static String eventNameForType(int i) {
        switch (i) {
            case 1:
                return "topError";
            case 2:
                return "topLoad";
            case 3:
                return "topLoadEnd";
            case 4:
                return "topLoadStart";
            case 5:
                return "topProgress";
            default:
                StringBuilder sb = new StringBuilder("Invalid image event: ");
                sb.append(Integer.toString(i));
                throw new IllegalStateException(sb.toString());
        }
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMap;
        if (this.mImageUri != null || this.mEventType == 2) {
            writableMap = Arguments.createMap();
            if (this.mImageUri != null) {
                writableMap.putString("uri", this.mImageUri);
            }
            if (this.mEventType == 2) {
                WritableMap createMap = Arguments.createMap();
                createMap.putDouble("width", (double) this.mWidth);
                createMap.putDouble("height", (double) this.mHeight);
                if (this.mImageUri != null) {
                    createMap.putString("url", this.mImageUri);
                }
                writableMap.putMap("source", createMap);
            }
        } else {
            writableMap = null;
        }
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), writableMap);
    }

    public ImageLoadEvent(int i, int i2) {
        this(i, i2, null);
    }

    public ImageLoadEvent(int i, int i2, String str) {
        this(i, i2, str, 0, 0);
    }

    public ImageLoadEvent(int i, int i2, String str, int i3, int i4) {
        super(i);
        this.mEventType = i2;
        this.mImageUri = str;
        this.mWidth = i3;
        this.mHeight = i4;
    }
}
