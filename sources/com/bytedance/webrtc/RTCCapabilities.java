package com.bytedance.webrtc;

import java.util.Arrays;
import java.util.List;

public class RTCCapabilities {
    private List<String> supportedVideoCodecs;

    private static native String[] nativeGetSupportedVideoCodecs(long j);

    public List<String> getSupportedVideoCodecs() {
        return this.supportedVideoCodecs;
    }

    public RTCCapabilities(List<String> list) {
        this.supportedVideoCodecs = list;
    }

    public RTCCapabilities(long j) {
        this.supportedVideoCodecs = Arrays.asList(nativeGetSupportedVideoCodecs(j));
    }
}
