package com.p280ss.video.rtc.engine.utils.audioRouting.controllerState;

import com.p280ss.video.rtc.engine.utils.audioRouting.IAudioRoutingController;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.controllerState.ControllerErrorState */
class ControllerErrorState extends ControllerBaseState {
    public int getState() {
        return 4;
    }

    ControllerErrorState(IAudioRoutingController iAudioRoutingController) {
        super(iAudioRoutingController);
    }
}
