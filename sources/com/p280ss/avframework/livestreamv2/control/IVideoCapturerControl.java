package com.p280ss.avframework.livestreamv2.control;

/* renamed from: com.ss.avframework.livestreamv2.control.IVideoCapturerControl */
public interface IVideoCapturerControl {

    /* renamed from: com.ss.avframework.livestreamv2.control.IVideoCapturerControl$Range */
    public static class Range {
        public float max;
        public float min;
    }

    void cancelAudioFocus();

    boolean currentSupportISPControl();

    Range getExposureCompensationRange();

    int setExposureCompensation(float f);

    int setFocusAreas(int i, int i2, int i3, int i4);

    int toggleFlashLight(boolean z);
}
