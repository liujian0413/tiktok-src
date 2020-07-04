package com.p280ss.video.rtc.engine.utils.audioRouting;

import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.AudioRoutingController$$Lambda$0 */
final /* synthetic */ class AudioRoutingController$$Lambda$0 implements OnNotHotPlugableDeviceCallback {
    private final AudioRoutingController arg$1;

    AudioRoutingController$$Lambda$0(AudioRoutingController audioRoutingController) {
        this.arg$1 = audioRoutingController;
    }

    public final void onError(int i, String str) {
        this.arg$1.lambda$initialize$0$AudioRoutingController(i, str);
    }
}
