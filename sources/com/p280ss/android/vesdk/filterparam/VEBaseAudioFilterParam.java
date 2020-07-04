package com.p280ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam */
public class VEBaseAudioFilterParam extends VEBaseFilterParam {
    public static final String AUDIO_EFFECT_FILTER_NAME = "audio effect";
    public static final String AUDIO_FADING_TRANSITION_NAME = "audio fading";
    public static final String AUDIO_VOLUME_FILTER_NAME = "audio volume filter";

    public VEBaseAudioFilterParam() {
        this.filterName = "audio filter";
        this.filterType = 1;
        this.filterDurationType = 1;
    }
}
