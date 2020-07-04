package com.p280ss.video.rtc.engine.utils.audioRouting.controllerState;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.controllerState.ControllerState */
interface ControllerState {
    int getState();

    void onEvent(int i, int i2);
}
