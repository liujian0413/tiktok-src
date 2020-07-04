package com.p280ss.video.rtc.engine.utils.audioRouting.controllerState;

import com.p280ss.video.rtc.engine.utils.LogUtil;
import com.p280ss.video.rtc.engine.utils.audioRouting.IAudioRoutingController;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.controllerState.ControllerBaseState */
abstract class ControllerBaseState implements ControllerState {
    private static int sChannelProfile = 0;
    static int sEngineRole = -1;
    private static boolean sMuteLocal = false;
    private static boolean sMuteRemotes = false;
    static boolean sPhoneInCall = false;
    private static boolean sVideoDisabled = true;
    IAudioRoutingController mAudioRoutingController;

    public int getState() {
        return 0;
    }

    static void init() {
        sVideoDisabled = true;
        sMuteLocal = false;
        sMuteRemotes = false;
        sEngineRole = -1;
        sPhoneInCall = false;
        sChannelProfile = 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean isAudioOnlyCall() {
        if (sChannelProfile == 1) {
            return false;
        }
        if (sVideoDisabled || (sMuteLocal && sMuteRemotes)) {
            return true;
        }
        return false;
    }

    ControllerBaseState(IAudioRoutingController iAudioRoutingController) {
        this.mAudioRoutingController = iAudioRoutingController;
    }

    public void onEvent(int i, int i2) {
        if (i != 10) {
            boolean z = false;
            switch (i) {
                case 12:
                    if (i2 > 0) {
                        z = true;
                    }
                    sMuteLocal = z;
                    return;
                case 13:
                    if (i2 > 0) {
                        z = true;
                    }
                    sMuteRemotes = z;
                    return;
                case 14:
                    if (i2 > 0) {
                        z = true;
                    }
                    sVideoDisabled = z;
                    return;
                default:
                    switch (i) {
                        case 20:
                            sChannelProfile = i2;
                            return;
                        case 21:
                            sEngineRole = i2;
                            return;
                        case 22:
                            if (i2 > 0) {
                                z = true;
                            }
                            sPhoneInCall = z;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.mAudioRoutingController.getRoutingInfo().setDefaultRouting(i2);
            this.mAudioRoutingController.resetAudioRouting(true);
            StringBuilder sb = new StringBuilder("User set default routing to:");
            sb.append(this.mAudioRoutingController.getAudioRouteDesc(this.mAudioRoutingController.getRoutingInfo().getDefaultRouting()));
            LogUtil.m145281i("ControllerBaseState", sb.toString());
        }
    }
}
