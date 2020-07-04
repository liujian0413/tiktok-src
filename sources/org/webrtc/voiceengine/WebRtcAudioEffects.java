package org.webrtc.voiceengine;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AudioEffect.Descriptor;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.UUID;
import org.webrtc.Logging;

public class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;

    /* renamed from: ns */
    private NoiseSuppressor f123517ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    private static Descriptor[] getAvailableEffects() {
        if (cachedEffects != null) {
            return cachedEffects;
        }
        Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
        if (VERSION.SDK_INT < 18) {
            return false;
        }
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
        if (VERSION.SDK_INT < 18) {
            return false;
        }
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    private WebRtcAudioEffects() {
        StringBuilder sb = new StringBuilder("ctor");
        sb.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m150047d("WebRtcAudioEffects", sb.toString());
    }

    public void release() {
        Logging.m150047d("WebRtcAudioEffects", "release");
        if (this.aec != null) {
            this.aec.release();
            this.aec = null;
        }
        if (this.f123517ns != null) {
            this.f123517ns.release();
            this.f123517ns = null;
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z;
        if (!isAcousticEchoCancelerSupported() || WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted() || isAcousticEchoCancelerExcludedByUUID()) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sb = new StringBuilder("canUseAcousticEchoCanceler: ");
        sb.append(z);
        Logging.m150047d("WebRtcAudioEffects", sb.toString());
        return z;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z;
        if (!isNoiseSuppressorSupported() || WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted() || isNoiseSuppressorExcludedByUUID()) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sb = new StringBuilder("canUseNoiseSuppressor: ");
        sb.append(z);
        Logging.m150047d("WebRtcAudioEffects", sb.toString());
        return z;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        boolean contains = WebRtcAudioUtils.getBlackListedModelsForAecUsage().contains(Build.MODEL);
        if (contains) {
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MODEL);
            sb.append(" is blacklisted for HW AEC usage!");
            Logging.m150051w("WebRtcAudioEffects", sb.toString());
        }
        return contains;
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        Descriptor[] availableEffects;
        if (VERSION.SDK_INT < 18) {
            return false;
        }
        for (Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        boolean contains = WebRtcAudioUtils.getBlackListedModelsForNsUsage().contains(Build.MODEL);
        if (contains) {
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MODEL);
            sb.append(" is blacklisted for HW NS usage!");
            Logging.m150051w("WebRtcAudioEffects", sb.toString());
        }
        return contains;
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        Descriptor[] availableEffects;
        if (VERSION.SDK_INT < 18) {
            return false;
        }
        for (Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if (VERSION.SDK_INT < 18) {
            return false;
        }
        if ((!AudioEffect.EFFECT_TYPE_AEC.equals(uuid) || !isAcousticEchoCancelerSupported()) && (!AudioEffect.EFFECT_TYPE_NS.equals(uuid) || !isNoiseSuppressorSupported())) {
            return false;
        }
        return true;
    }

    public boolean setAEC(boolean z) {
        StringBuilder sb = new StringBuilder("setAEC(");
        sb.append(z);
        sb.append(")");
        Logging.m150047d("WebRtcAudioEffects", sb.toString());
        if (!canUseAcousticEchoCanceler()) {
            Logging.m150051w("WebRtcAudioEffects", "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        } else {
            Logging.m150048e("WebRtcAudioEffects", "Platform AEC state can't be modified while recording");
            return false;
        }
    }

    public boolean setNS(boolean z) {
        StringBuilder sb = new StringBuilder("setNS(");
        sb.append(z);
        sb.append(")");
        Logging.m150047d("WebRtcAudioEffects", sb.toString());
        if (!canUseNoiseSuppressor()) {
            Logging.m150051w("WebRtcAudioEffects", "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        } else if (this.f123517ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        } else {
            Logging.m150048e("WebRtcAudioEffects", "Platform NS state can't be modified while recording");
            return false;
        }
    }

    public void enable(int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        boolean z3;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("enable(audioSession=");
        sb.append(i);
        sb.append(")");
        Logging.m150047d("WebRtcAudioEffects", sb.toString());
        boolean z4 = false;
        if (this.aec == null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.f123517ns == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        assertTrue(z2);
        if (isAcousticEchoCancelerSupported()) {
            this.aec = AcousticEchoCanceler.create(i);
            if (this.aec != null) {
                boolean enabled = this.aec.getEnabled();
                if (!this.shouldEnableAec || !canUseAcousticEchoCanceler()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (this.aec.setEnabled(z3) != 0) {
                    Logging.m150048e("WebRtcAudioEffects", "Failed to set the AcousticEchoCanceler state");
                }
                String str5 = "WebRtcAudioEffects";
                StringBuilder sb2 = new StringBuilder("AcousticEchoCanceler: was ");
                if (enabled) {
                    str3 = "enabled";
                } else {
                    str3 = "disabled";
                }
                sb2.append(str3);
                sb2.append(", enable: ");
                sb2.append(z3);
                sb2.append(", is now: ");
                if (this.aec.getEnabled()) {
                    str4 = "enabled";
                } else {
                    str4 = "disabled";
                }
                sb2.append(str4);
                Logging.m150047d(str5, sb2.toString());
            } else {
                Logging.m150048e("WebRtcAudioEffects", "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            this.f123517ns = NoiseSuppressor.create(i);
            if (this.f123517ns != null) {
                boolean enabled2 = this.f123517ns.getEnabled();
                if (this.shouldEnableNs && canUseNoiseSuppressor()) {
                    z4 = true;
                }
                if (this.f123517ns.setEnabled(z4) != 0) {
                    Logging.m150048e("WebRtcAudioEffects", "Failed to set the NoiseSuppressor state");
                }
                String str6 = "WebRtcAudioEffects";
                StringBuilder sb3 = new StringBuilder("NoiseSuppressor: was ");
                if (enabled2) {
                    str = "enabled";
                } else {
                    str = "disabled";
                }
                sb3.append(str);
                sb3.append(", enable: ");
                sb3.append(z4);
                sb3.append(", is now: ");
                if (this.f123517ns.getEnabled()) {
                    str2 = "enabled";
                } else {
                    str2 = "disabled";
                }
                sb3.append(str2);
                Logging.m150047d(str6, sb3.toString());
                return;
            }
            Logging.m150048e("WebRtcAudioEffects", "Failed to create the NoiseSuppressor instance");
        }
    }
}
