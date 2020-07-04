package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build.VERSION;
import org.webrtc.Logging;

class WebRtcAudioManager {
    WebRtcAudioManager() {
    }

    static AudioManager getAudioManager(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    private static int getSampleRateForApiLevel(AudioManager audioManager) {
        return VERSION.SDK_INT < 17 ? 16000 : 16000;
    }

    private static boolean isLowLatencyInputSupported(Context context) {
        if (VERSION.SDK_INT < 21 || !isLowLatencyOutputSupported(context)) {
            return false;
        }
        return true;
    }

    private static boolean isLowLatencyOutputSupported(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static int getLowLatencyFramesPerBuffer(AudioManager audioManager) {
        if (VERSION.SDK_INT < 17) {
            return 256;
        }
        String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    static int getSampleRate(AudioManager audioManager) {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.m150047d("WebRtcAudioManagerExternal", "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel(audioManager);
        StringBuilder sb = new StringBuilder("Sample rate is set to ");
        sb.append(sampleRateForApiLevel);
        sb.append(" Hz");
        Logging.m150047d("WebRtcAudioManagerExternal", sb.toString());
        return sampleRateForApiLevel;
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

    static int getInputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        if (isLowLatencyInputSupported(context)) {
            return getLowLatencyFramesPerBuffer(audioManager);
        }
        return getMinInputFrameSize(i, i2);
    }

    static int getOutputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        if (isLowLatencyOutputSupported(context)) {
            return getLowLatencyFramesPerBuffer(audioManager);
        }
        return getMinOutputFrameSize(i, i2);
    }
}
