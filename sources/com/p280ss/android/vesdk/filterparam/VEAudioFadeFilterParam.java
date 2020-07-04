package com.p280ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VEAudioFadeFilterParam */
public class VEAudioFadeFilterParam extends VEBaseAudioFilterParam {
    public int fadeInLength;
    public int fadeOutLength;

    public VEAudioFadeFilterParam() {
        this.filterName = VEBaseAudioFilterParam.AUDIO_FADING_TRANSITION_NAME;
    }
}
