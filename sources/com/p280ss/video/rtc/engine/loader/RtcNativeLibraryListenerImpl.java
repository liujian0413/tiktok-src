package com.p280ss.video.rtc.engine.loader;

import com.p280ss.video.rtc.engine.LogReport;
import com.p280ss.video.rtc.engine.utils.LogUtil;

/* renamed from: com.ss.video.rtc.engine.loader.RtcNativeLibraryListenerImpl */
public class RtcNativeLibraryListenerImpl implements RtcNativeLibraryLoaderListener {
    public void onLoadAlready(String str) {
        StringBuilder sb = new StringBuilder("onLoadAlready : ");
        sb.append(str);
        LogUtil.m145281i("RtcNativeLibraryLoaderListener", sb.toString());
    }

    public void onLoadSuccess(String str) {
        StringBuilder sb = new StringBuilder("onLoadSuccess : ");
        sb.append(str);
        LogUtil.m145281i("RtcNativeLibraryLoaderListener", sb.toString());
    }

    public void onLoadError(String str) {
        StringBuilder sb = new StringBuilder("onLoadError : ");
        sb.append(str);
        LogUtil.m145281i("RtcNativeLibraryLoaderListener", sb.toString());
        LogReport instance = LogReport.instance();
        StringBuilder sb2 = new StringBuilder("Load native library error, native library name: ");
        sb2.append(str);
        instance.reportSDKSelfError(sb2.toString());
    }
}
