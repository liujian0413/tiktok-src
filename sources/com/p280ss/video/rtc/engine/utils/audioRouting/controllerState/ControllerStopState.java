package com.p280ss.video.rtc.engine.utils.audioRouting.controllerState;

import android.media.AudioManager;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import com.p280ss.video.rtc.engine.utils.audioRouting.IAudioRoutingController;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.controllerState.ControllerStopState */
class ControllerStopState extends ControllerBaseState {
    public int getState() {
        return 2;
    }

    ControllerStopState(IAudioRoutingController iAudioRoutingController) {
        super(iAudioRoutingController);
        iAudioRoutingController.stopBtSco();
        iAudioRoutingController.getRoutingInfo().setForceSpeakerphone(-1);
        iAudioRoutingController.getRoutingInfo().setDefaultRouting(-1);
        LogUtil.m145281i("ControllerBaseState", "Monitor stopped");
    }

    public void onEvent(int i, int i2) {
        StringBuilder sb = new StringBuilder("StopState: onEvent: ");
        sb.append(i);
        sb.append(", info: ");
        sb.append(i2);
        LogUtil.m145278d("ControllerBaseState", sb.toString());
        try {
            AudioManager audioManager = this.mAudioRoutingController.getAudioManager();
            if (audioManager != null) {
                boolean z = true;
                if (i == 1) {
                    this.mAudioRoutingController.notifyAudioRoutingChanged(this.mAudioRoutingController.queryCurrentAudioRouting());
                } else if (i != 11) {
                    super.onEvent(i, i2);
                } else {
                    if (i2 != 1) {
                        z = false;
                    }
                    audioManager.setSpeakerphoneOn(z);
                    this.mAudioRoutingController.getRoutingInfo().setForceSpeakerphone(i2);
                    this.mAudioRoutingController.notifyAudioRoutingChanged(this.mAudioRoutingController.queryCurrentAudioRouting());
                }
            }
        } catch (Exception e) {
            LogUtil.m145280e("ControllerBaseState", "onEvent: Exception ", e);
        }
    }
}
