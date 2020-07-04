package com.p280ss.video.rtc.engine.utils.audioRouting.controllerState;

import com.p280ss.video.rtc.engine.utils.LogUtil;
import com.p280ss.video.rtc.engine.utils.audioRouting.IAudioRoutingController;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.controllerState.ControllerStartState */
class ControllerStartState extends ControllerBaseState {
    public int getState() {
        return 1;
    }

    ControllerStartState(IAudioRoutingController iAudioRoutingController) {
        super(iAudioRoutingController);
        if (-1 == iAudioRoutingController.getRoutingInfo().getDefaultRouting()) {
            if (isAudioOnlyCall()) {
                iAudioRoutingController.getRoutingInfo().setDefaultRouting(1);
            } else {
                iAudioRoutingController.getRoutingInfo().setDefaultRouting(3);
            }
        }
        this.mAudioRoutingController.resetAudioRouting(false);
        StringBuilder sb = new StringBuilder("Monitor start: default routing: ");
        sb.append(this.mAudioRoutingController.getAudioRouteDesc(iAudioRoutingController.getRoutingInfo().getDefaultRouting()));
        sb.append(", current routing: ");
        sb.append(this.mAudioRoutingController.getAudioRouteDesc(this.mAudioRoutingController.queryCurrentAudioRouting()));
        LogUtil.m145281i("ControllerBaseState", sb.toString());
    }

    public void onEvent(int i, int i2) {
        StringBuilder sb = new StringBuilder("StartState: onEvent: ");
        sb.append(i);
        sb.append(", info: ");
        sb.append(i2);
        LogUtil.m145278d("ControllerBaseState", sb.toString());
        boolean z = false;
        switch (i) {
            case 1:
                if (!sPhoneInCall && !this.mAudioRoutingController.isBTHeadsetPlugged()) {
                    this.mAudioRoutingController.resetAudioRouting(false);
                    return;
                }
                return;
            case 2:
                if ((i2 != 0 || this.mAudioRoutingController.isBTHeadsetPlugged()) && !sPhoneInCall) {
                    this.mAudioRoutingController.resetAudioRouting(false);
                    return;
                }
                return;
            case 11:
                this.mAudioRoutingController.getRoutingInfo().setForceSpeakerphone(i2);
                if (!sPhoneInCall) {
                    this.mAudioRoutingController.resetAudioRouting(true);
                    return;
                }
                break;
            case 21:
                sEngineRole = i2;
                if (!sPhoneInCall) {
                    this.mAudioRoutingController.updateBluetoothSco(this.mAudioRoutingController.queryCurrentAudioRouting());
                    return;
                }
                break;
            case 22:
                StringBuilder sb2 = new StringBuilder("phone state changed: ");
                sb2.append(i2);
                LogUtil.m145281i("ControllerBaseState", sb2.toString());
                if (i2 > 0) {
                    z = true;
                }
                sPhoneInCall = z;
                if (i2 == 0) {
                    this.mAudioRoutingController.resetAudioRouting(true);
                    return;
                }
                break;
            default:
                super.onEvent(i, i2);
                break;
        }
    }
}
