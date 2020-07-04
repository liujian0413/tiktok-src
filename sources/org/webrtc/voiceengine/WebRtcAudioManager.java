package org.webrtc.voiceengine;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;

public class WebRtcAudioManager {
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private final AudioManager audioManager = ((AudioManager) ContextUtils.getApplicationContext().getSystemService("audio"));
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private final VolumeLogger volumeLogger = new VolumeLogger(this.audioManager);

    static class VolumeLogger {
        public final AudioManager audioManager;
        private Timer timer;

        class LogVolumeTask extends TimerTask {
            private final int maxRingVolume;
            private final int maxVoiceCallVolume;

            public void run() {
                int mode = VolumeLogger.this.audioManager.getMode();
                if (mode == 1) {
                    StringBuilder sb = new StringBuilder("STREAM_RING stream volume: ");
                    sb.append(VolumeLogger.this.audioManager.getStreamVolume(2));
                    sb.append(" (max=");
                    sb.append(this.maxRingVolume);
                    sb.append(")");
                    Logging.m150047d("WebRtcAudioManager", sb.toString());
                    return;
                }
                if (mode == 3) {
                    StringBuilder sb2 = new StringBuilder("VOICE_CALL stream volume: ");
                    sb2.append(VolumeLogger.this.audioManager.getStreamVolume(0));
                    sb2.append(" (max=");
                    sb2.append(this.maxVoiceCallVolume);
                    sb2.append(")");
                    Logging.m150047d("WebRtcAudioManager", sb2.toString());
                }
            }

            LogVolumeTask(int i, int i2) {
                this.maxRingVolume = i;
                this.maxVoiceCallVolume = i2;
            }
        }

        public void stop() {
            if (this.timer != null) {
                this.timer.cancel();
                this.timer = null;
            }
        }

        public void start() {
            this.timer = new Timer("WebRtcVolumeLevelLoggerThread");
            this.timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0, 30000);
        }

        public VolumeLogger(AudioManager audioManager2) {
            this.audioManager = audioManager2;
        }
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, int i5, long j);

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isWiredHeadsetOn() {
        return this.audioManager.isWiredHeadsetOn();
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    public static synchronized boolean getStereoInput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoInput;
        }
        return z;
    }

    public static synchronized boolean getStereoOutput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoOutput;
        }
        return z;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean isAAudioSupported() {
        Logging.m150051w("WebRtcAudioManager", "AAudio support is currently disabled on all devices!");
        return false;
    }

    private boolean isCommunicationModeEnabled() {
        if (this.audioManager.getMode() == 3) {
            return true;
        }
        return false;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    public boolean isLowLatencyInputSupported() {
        if (VERSION.SDK_INT < 21 || !isLowLatencyOutputSupported()) {
            return false;
        }
        return true;
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        if (VERSION.SDK_INT < 17) {
            return 256;
        }
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    private int getSampleRateForApiLevel() {
        if (VERSION.SDK_INT < 17) {
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        return Integer.parseInt(property);
    }

    private boolean isProAudioSupported() {
        if (VERSION.SDK_INT < 23 || !ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro")) {
            return false;
        }
        return true;
    }

    private void dispose() {
        StringBuilder sb = new StringBuilder("dispose");
        sb.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m150047d("WebRtcAudioManager", sb.toString());
        if (this.initialized) {
            this.volumeLogger.stop();
        }
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean z;
        if (blacklistDeviceForOpenSLESUsageIsOverridden) {
            z = blacklistDeviceForOpenSLESUsage;
        } else {
            z = WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MODEL);
            sb.append(" is blacklisted for OpenSL ES usage!");
            Logging.m150047d("WebRtcAudioManager", sb.toString());
        }
        return z;
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.m150047d("WebRtcAudioManager", "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        } else if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            StringBuilder sb = new StringBuilder("Default sample rate is overriden to ");
            sb.append(WebRtcAudioUtils.getDefaultSampleRateHz());
            sb.append(" Hz");
            Logging.m150047d("WebRtcAudioManager", sb.toString());
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        } else {
            int defaultSampleRateHz = WebRtcAudioUtils.getDefaultSampleRateHz();
            StringBuilder sb2 = new StringBuilder("Sample rate is set to ");
            sb2.append(defaultSampleRateHz);
            sb2.append(" Hz");
            Logging.m150047d("WebRtcAudioManager", sb2.toString());
            return defaultSampleRateHz;
        }
    }

    private boolean init() {
        StringBuilder sb = new StringBuilder("init");
        sb.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m150047d("WebRtcAudioManager", sb.toString());
        if (this.initialized) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("audio mode is: ");
        sb2.append(WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        Logging.m150047d("WebRtcAudioManager", sb2.toString());
        this.initialized = true;
        this.volumeLogger.start();
        return true;
    }

    private void storeAudioParameters() {
        int i;
        int i2;
        int i3;
        int i4 = 1;
        if (getStereoOutput()) {
            i = 2;
        } else {
            i = 1;
        }
        this.outputChannels = i;
        if (getStereoInput()) {
            i4 = 2;
        }
        this.inputChannels = i4;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        if (this.lowLatencyOutput) {
            i2 = getLowLatencyOutputFramesPerBuffer();
        } else {
            i2 = getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        }
        this.outputBufferSize = i2;
        if (this.lowLatencyInput) {
            i3 = getLowLatencyInputFramesPerBuffer();
        } else {
            i3 = getMinInputFrameSize(this.sampleRate, this.inputChannels);
        }
        this.inputBufferSize = i3;
    }

    private void SetAudioMode(int i) {
        this.audioManager.setMode(i);
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            blacklistDeviceForOpenSLESUsageIsOverridden = true;
            blacklistDeviceForOpenSLESUsage = z;
        }
    }

    public static synchronized void setStereoInput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            String str = "WebRtcAudioManager";
            StringBuilder sb = new StringBuilder("Overriding default input behavior: setStereoInput(");
            sb.append(z);
            sb.append(')');
            Logging.m150051w(str, sb.toString());
            useStereoInput = z;
        }
    }

    public static synchronized void setStereoOutput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            String str = "WebRtcAudioManager";
            StringBuilder sb = new StringBuilder("Overriding default output behavior: setStereoOutput(");
            sb.append(z);
            sb.append(')');
            Logging.m150051w(str, sb.toString());
            useStereoOutput = z;
        }
    }

    WebRtcAudioManager(long j) {
        StringBuilder sb = new StringBuilder("ctor");
        sb.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m150047d("WebRtcAudioManager", sb.toString());
        long j2 = j;
        this.nativeAudioManager = j2;
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, j2);
        WebRtcAudioUtils.logAudioState("WebRtcAudioManager");
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        int i3;
        int i4 = i2 * 2;
        if (i2 == 1) {
            i3 = 4;
        } else {
            i3 = 12;
        }
        return AudioTrack.getMinBufferSize(i, i3, 2) / i4;
    }

    private static int getMinInputFrameSize(int i, int i2) {
        int i3;
        int i4 = i2 * 2;
        if (i2 == 1) {
            i3 = 16;
        } else {
            i3 = 12;
        }
        return AudioRecord.getMinBufferSize(i, i3, 2) / i4;
    }
}
