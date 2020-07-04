package com.p280ss.video.rtc.engine.loader;

import org.webrtc.NativeLibraryLoadListener;

/* renamed from: com.ss.video.rtc.engine.loader.RtcNativeLibraryLoaderListener */
public interface RtcNativeLibraryLoaderListener extends NativeLibraryLoadListener {
    void onLoadAlready(String str);

    void onLoadError(String str);

    void onLoadSuccess(String str);
}
