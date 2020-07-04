package org.webrtc.audio;

import org.webrtc.JniCommon;
import org.webrtc.Logging;

public class RtcAudioMix {
    private long nativeRtcAudioMix;

    private native int nativeAdjustAudioMixingPlayoutVolume(long j, int i);

    private native int nativeAdjustAudioMixingPublishVolume(long j, int i);

    private native int nativeAdjustAudioMixingVolume(long j, int i);

    private static native long nativeCreateRtcAudioMix();

    private native int nativeGetAudioMixingCurrentPosition(long j);

    private native int nativeGetAudioMixingDuration(long j);

    private native int nativeGetEffectVolume(long j, int i);

    private native void nativePauseAllEffects(long j);

    private native int nativePauseAudioMixing(long j);

    private native int nativePauseEffect(long j, int i);

    private native int nativePlayEffect(long j, int i, String str, boolean z, int i2, int i3);

    private native int nativePreloadEffect(long j, int i, String str);

    private native void nativeRegisterObserver(long j, Object obj);

    private native void nativeResumeAllEffects(long j);

    private native int nativeResumeAudioMixing(long j);

    private native int nativeResumeEffect(long j, int i);

    private native int nativeSetAudioMixingPosition(long j, int i);

    private native void nativeSetEffectsVolume(long j, int i);

    private native int nativeSetVolumeOfEffect(long j, int i, int i2);

    private native int nativeStartAudioMixing(long j, String str, boolean z, boolean z2, int i);

    private native void nativeStopAllEffects(long j);

    private native void nativeStopAudioMixing(long j);

    private native int nativeStopEffect(long j, int i);

    private native void nativeUnRegisterObserver(long j);

    private native void nativeUnloadAllEffects(long j);

    private native int nativeUnloadEffect(long j, int i);

    public void init() {
        this.nativeRtcAudioMix = nativeCreateRtcAudioMix();
    }

    public void uninit() {
        if (this.nativeRtcAudioMix != 0) {
            JniCommon.nativeReleaseRef(this.nativeRtcAudioMix);
            this.nativeRtcAudioMix = 0;
        }
    }

    public int getAudioMixingCurrentPosition() {
        if (this.nativeRtcAudioMix != 0) {
            return nativeGetAudioMixingCurrentPosition(this.nativeRtcAudioMix);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public int getAudioMixingDuration() {
        if (this.nativeRtcAudioMix != 0) {
            return nativeGetAudioMixingDuration(this.nativeRtcAudioMix);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public void pauseAllEffects() {
        if (this.nativeRtcAudioMix == 0) {
            Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        } else {
            nativePauseAllEffects(this.nativeRtcAudioMix);
        }
    }

    public int pauseAudioMixing() {
        if (this.nativeRtcAudioMix != 0) {
            return nativePauseAudioMixing(this.nativeRtcAudioMix);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public void resumeAllEffects() {
        if (this.nativeRtcAudioMix == 0) {
            Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        } else {
            nativeResumeAllEffects(this.nativeRtcAudioMix);
        }
    }

    public int resumeAudioMixing() {
        if (this.nativeRtcAudioMix != 0) {
            return nativeResumeAudioMixing(this.nativeRtcAudioMix);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public void stopAllEffects() {
        if (this.nativeRtcAudioMix == 0) {
            Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        } else {
            nativeStopAllEffects(this.nativeRtcAudioMix);
        }
    }

    public void stopAudioMixing() {
        if (this.nativeRtcAudioMix == 0) {
            Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        } else {
            nativeStopAudioMixing(this.nativeRtcAudioMix);
        }
    }

    public void unloadAllEffects() {
        if (this.nativeRtcAudioMix == 0) {
            Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        } else {
            nativeUnloadAllEffects(this.nativeRtcAudioMix);
        }
    }

    public void unregisterObserver() {
        if (this.nativeRtcAudioMix == 0) {
            Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        } else {
            nativeUnRegisterObserver(this.nativeRtcAudioMix);
        }
    }

    public int adjustAudioMixingPlayoutVolume(int i) {
        if (this.nativeRtcAudioMix != 0) {
            return nativeAdjustAudioMixingPlayoutVolume(this.nativeRtcAudioMix, i);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public int adjustAudioMixingPublishVolume(int i) {
        if (this.nativeRtcAudioMix != 0) {
            return nativeAdjustAudioMixingPublishVolume(this.nativeRtcAudioMix, i);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public int adjustAudioMixingVolume(int i) {
        if (this.nativeRtcAudioMix != 0) {
            return nativeAdjustAudioMixingVolume(this.nativeRtcAudioMix, i);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public int getEffectVolume(int i) {
        if (this.nativeRtcAudioMix != 0) {
            return nativeGetEffectVolume(this.nativeRtcAudioMix, i);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public int pauseEffect(int i) {
        if (this.nativeRtcAudioMix != 0) {
            return nativePauseEffect(this.nativeRtcAudioMix, i);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public void registerObserver(WebRtcAudioMixObserver webRtcAudioMixObserver) {
        if (this.nativeRtcAudioMix == 0) {
            Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        } else {
            nativeRegisterObserver(this.nativeRtcAudioMix, webRtcAudioMixObserver);
        }
    }

    public int resumeEffect(int i) {
        if (this.nativeRtcAudioMix != 0) {
            return nativeResumeEffect(this.nativeRtcAudioMix, i);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public int setAudioMixingPosition(int i) {
        if (this.nativeRtcAudioMix != 0) {
            return nativeSetAudioMixingPosition(this.nativeRtcAudioMix, i);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public void setEffectsVolume(int i) {
        if (this.nativeRtcAudioMix == 0) {
            Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        } else {
            nativeSetEffectsVolume(this.nativeRtcAudioMix, i);
        }
    }

    public int stopEffect(int i) {
        if (this.nativeRtcAudioMix != 0) {
            return nativeStopEffect(this.nativeRtcAudioMix, i);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public int unloadEffect(int i) {
        if (this.nativeRtcAudioMix != 0) {
            return nativeUnloadEffect(this.nativeRtcAudioMix, i);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public int preloadEffect(int i, String str) {
        if (this.nativeRtcAudioMix != 0) {
            return nativePreloadEffect(this.nativeRtcAudioMix, i, str);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public int setVolumeOfEffect(int i, int i2) {
        if (this.nativeRtcAudioMix != 0) {
            return nativeSetVolumeOfEffect(this.nativeRtcAudioMix, i, i2);
        }
        Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
        return -1;
    }

    public int startAudioMixing(String str, boolean z, boolean z2, int i) {
        if (this.nativeRtcAudioMix == 0) {
            Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
            return -1;
        }
        return nativeStartAudioMixing(this.nativeRtcAudioMix, str, z, z2, i);
    }

    public int playEffect(int i, String str, boolean z, int i2, int i3) {
        if (this.nativeRtcAudioMix == 0) {
            Logging.m150047d("RtcAudioMix", "RtcAudioMix has uninited.");
            return -1;
        }
        return nativePlayEffect(this.nativeRtcAudioMix, i, str, z, i2, i3);
    }
}
