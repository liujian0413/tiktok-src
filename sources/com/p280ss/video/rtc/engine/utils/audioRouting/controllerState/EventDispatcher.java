package com.p280ss.video.rtc.engine.utils.audioRouting.controllerState;

import com.p280ss.video.rtc.engine.utils.audioRouting.IAudioRoutingController;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.controllerState.EventDispatcher */
public class EventDispatcher {
    private IAudioRoutingController mAudioRoutingController;
    private ControllerBaseState mRoutingState;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.ss.video.rtc.engine.utils.audioRouting.controllerState.EventDispatcher$RoutingState */
    @interface RoutingState {
    }

    private void errorRoutingControl() {
        this.mRoutingState = new ControllerErrorState(this.mAudioRoutingController);
    }

    private void startRoutingControl() {
        this.mRoutingState = new ControllerStartState(this.mAudioRoutingController);
    }

    private void stopRoutingControl() {
        this.mRoutingState = new ControllerStopState(this.mAudioRoutingController);
    }

    public EventDispatcher(IAudioRoutingController iAudioRoutingController) {
        ControllerBaseState.init();
        this.mAudioRoutingController = iAudioRoutingController;
        this.mRoutingState = new ControllerStopState(iAudioRoutingController);
    }

    public void changeRouteState(int i) {
        if (i != this.mRoutingState.getState()) {
            switch (i) {
                case 1:
                    startRoutingControl();
                    return;
                case 2:
                    stopRoutingControl();
                    return;
                default:
                    errorRoutingControl();
                    return;
            }
        }
    }

    public void onEvent(int i, int i2) {
        this.mRoutingState.onEvent(i, i2);
    }
}
