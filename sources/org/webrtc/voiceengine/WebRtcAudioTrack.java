package org.webrtc.voiceengine;

import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build.VERSION;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.ContextUtils;
import org.webrtc.ExceptionUtils;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.ThreadUtils.ThreadChecker;

public class WebRtcAudioTrack {
    private static final int DEFAULT_USAGE;
    private static ErrorCallback errorCallback;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld;
    private static boolean sForbidVoip;
    public static volatile boolean speakerMute;
    private static int usageAttribute;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    public AudioTrack audioTrack;
    public ByteBuffer byteBuffer;
    public byte[] emptyBytes;
    public final long nativeAudioTrack;
    private final ThreadChecker threadChecker = new ThreadChecker();

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    class AudioTrackThread extends Thread {
        private volatile boolean keepAlive = true;

        public void stopThread() {
            Logging.m150047d("WebRtcAudioTrack", "stopThread");
            this.keepAlive = false;
        }

        public void run() {
            boolean z;
            boolean z2;
            Process.setThreadPriority(-19);
            StringBuilder sb = new StringBuilder("AudioTrackThread");
            sb.append(WebRtcAudioUtils.getThreadInfo());
            Logging.m150047d("WebRtcAudioTrack", sb.toString());
            if (WebRtcAudioTrack.this.audioTrack.getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioTrack.assertTrue(z);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                if (capacity <= WebRtcAudioTrack.this.byteBuffer.remaining()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                WebRtcAudioTrack.assertTrue(z2);
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int writeBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeBytes != capacity) {
                    StringBuilder sb2 = new StringBuilder("AudioTrack.write played invalid number of bytes: ");
                    sb2.append(writeBytes);
                    Logging.m150048e("WebRtcAudioTrack", sb2.toString());
                    if (writeBytes < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                        StringBuilder sb3 = new StringBuilder("AudioTrack.write failed: ");
                        sb3.append(writeBytes);
                        webRtcAudioTrack2.reportWebRtcAudioTrackError(sb3.toString());
                    }
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.m150047d("WebRtcAudioTrack", "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.m150047d("WebRtcAudioTrack", "AudioTrack.stop is done.");
                } catch (Exception e) {
                    StringBuilder sb4 = new StringBuilder("AudioTrack.stop failed: ");
                    sb4.append(e.getMessage());
                    Logging.m150048e("WebRtcAudioTrack", sb4.toString());
                }
            }
        }

        public AudioTrackThread(String str) {
            super(str);
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            if (VERSION.SDK_INT >= 21) {
                return audioTrack.write(byteBuffer, i, 0);
            }
            return audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i);
        }
    }

    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer2, long j);

    public native void nativeGetPlayoutData(int i, long j);

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    static {
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
    }

    private static int getDefaultUsageAttribute() {
        if (VERSION.SDK_INT >= 21) {
            return 2;
        }
        return 0;
    }

    private boolean isVolumeFixed() {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        return this.audioManager.isVolumeFixed();
    }

    private int getStreamMaxVolume() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        Logging.m150047d("WebRtcAudioTrack", "getStreamMaxVolume");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        Logging.m150047d("WebRtcAudioTrack", "getStreamVolume");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        return this.audioManager.getStreamVolume(0);
    }

    private void logBufferCapacityInFrames() {
        if (VERSION.SDK_INT >= 24) {
            StringBuilder sb = new StringBuilder("AudioTrack: buffer capacity in frames: ");
            sb.append(this.audioTrack.getBufferCapacityInFrames());
            Logging.m150047d("WebRtcAudioTrack", sb.toString());
        }
    }

    private void logBufferSizeInFrames() {
        if (VERSION.SDK_INT >= 23) {
            StringBuilder sb = new StringBuilder("AudioTrack: buffer size in frames: ");
            sb.append(this.audioTrack.getBufferSizeInFrames());
            Logging.m150047d("WebRtcAudioTrack", sb.toString());
        }
    }

    private void logUnderrunCount() {
        if (VERSION.SDK_INT >= 24) {
            StringBuilder sb = new StringBuilder("underrun count: ");
            sb.append(this.audioTrack.getUnderrunCount());
            Logging.m150047d("WebRtcAudioTrack", sb.toString());
        }
    }

    private void releaseAudioResources() {
        Logging.m150047d("WebRtcAudioTrack", "releaseAudioResources");
        if (this.audioTrack != null) {
            this.audioTrack.release();
            this.audioTrack = null;
        }
    }

    private void logMainParameters() {
        StringBuilder sb = new StringBuilder("AudioTrack: session ID: ");
        sb.append(this.audioTrack.getAudioSessionId());
        sb.append(", channels: ");
        sb.append(this.audioTrack.getChannelCount());
        sb.append(", sample rate: ");
        sb.append(this.audioTrack.getSampleRate());
        sb.append(", max gain: ");
        sb.append(AudioTrack.getMaxVolume());
        Logging.m150047d("WebRtcAudioTrack", sb.toString());
    }

    private boolean startPlayout() {
        boolean z;
        boolean z2;
        this.threadChecker.checkIsOnValidThread();
        Logging.m150047d("WebRtcAudioTrack", "startPlayout");
        if (this.audioTrack != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.audioThread == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        assertTrue(z2);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                AudioTrackStartErrorCode audioTrackStartErrorCode = AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                StringBuilder sb = new StringBuilder("AudioTrack.play failed - incorrect state :");
                sb.append(this.audioTrack.getPlayState());
                reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, sb.toString());
                releaseAudioResources();
                return false;
            }
            this.audioThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioTrackStartErrorCode audioTrackStartErrorCode2 = AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
            StringBuilder sb2 = new StringBuilder("AudioTrack.play failed: ");
            sb2.append(e.getMessage());
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode2, sb2.toString());
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        Logging.m150047d("WebRtcAudioTrack", "stopPlayout");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.m150047d("WebRtcAudioTrack", "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000)) {
            Logging.m150048e("WebRtcAudioTrack", "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        }
        Logging.m150047d("WebRtcAudioTrack", "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.m150047d("WebRtcAudioTrack", "Set extended error callback");
        errorCallback = errorCallback2;
    }

    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.m150047d("WebRtcAudioTrack", "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z) {
        StringBuilder sb = new StringBuilder("setSpeakerMute(");
        sb.append(z);
        sb.append(")");
        Logging.m150051w("WebRtcAudioTrack", sb.toString());
        speakerMute = z;
    }

    WebRtcAudioTrack(long j) {
        this.threadChecker.checkIsOnValidThread();
        StringBuilder sb = new StringBuilder("ctor");
        sb.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m150047d("WebRtcAudioTrack", sb.toString());
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        StringBuilder sb = new StringBuilder("Init playout error: ");
        sb.append(str);
        Logging.m150048e("WebRtcAudioTrack", sb.toString());
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        if (errorCallbackOld != null) {
            errorCallbackOld.onWebRtcAudioTrackInitError(str);
        }
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            String str = "WebRtcAudioTrack";
            StringBuilder sb = new StringBuilder("Default usage attribute is changed from: ");
            sb.append(DEFAULT_USAGE);
            sb.append(" to ");
            sb.append(i);
            Logging.m150051w(str, sb.toString());
            usageAttribute = i;
        }
    }

    private boolean setStreamVolume(int i) {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        StringBuilder sb = new StringBuilder("setStreamVolume(");
        sb.append(i);
        sb.append(")");
        Logging.m150047d("WebRtcAudioTrack", sb.toString());
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (isVolumeFixed()) {
            Logging.m150048e("WebRtcAudioTrack", "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    public void reportWebRtcAudioTrackError(String str) {
        StringBuilder sb = new StringBuilder("Run-time playback error: ");
        sb.append(str);
        Logging.m150048e("WebRtcAudioTrack", sb.toString());
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        if (errorCallbackOld != null) {
            errorCallbackOld.onWebRtcAudioTrackError(str);
        }
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        StringBuilder sb = new StringBuilder("Start playout error: ");
        sb.append(audioTrackStartErrorCode);
        sb.append(". ");
        sb.append(str);
        Logging.m150048e("WebRtcAudioTrack", sb.toString());
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        if (errorCallbackOld != null) {
            errorCallbackOld.onWebRtcAudioTrackStartError(str);
        }
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        if (sForbidVoip) {
            AudioTrack audioTrack2 = new AudioTrack(3, i, i2, 2, i3, 1);
            return audioTrack2;
        }
        AudioTrack audioTrack3 = new AudioTrack(0, i, i2, 2, i3, 1);
        return audioTrack3;
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        int i4;
        Logging.m150047d("WebRtcAudioTrack", "createAudioTrackOnLollipopOrHigher");
        if (sForbidVoip) {
            i4 = 3;
        } else {
            i4 = 0;
        }
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(i4);
        StringBuilder sb = new StringBuilder("nativeOutputSampleRate: ");
        sb.append(nativeOutputSampleRate);
        Logging.m150047d("WebRtcAudioTrack", sb.toString());
        if (i != nativeOutputSampleRate) {
            Logging.m150051w("WebRtcAudioTrack", "Unable to use fast mode since requested sample rate is not native");
        }
        if (sForbidVoip) {
            usageAttribute = 1;
        } else {
            usageAttribute = DEFAULT_USAGE;
        }
        if (usageAttribute != DEFAULT_USAGE) {
            StringBuilder sb2 = new StringBuilder("A non default usage attribute is used: ");
            sb2.append(usageAttribute);
            Logging.m150051w("WebRtcAudioTrack", sb2.toString());
        }
        AudioTrack audioTrack2 = new AudioTrack(new Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
        return audioTrack2;
    }

    private boolean initPlayout(int i, int i2, boolean z) {
        sForbidVoip = z;
        try {
            this.threadChecker.checkIsOnValidThread();
            StringBuilder sb = new StringBuilder("initPlayout(sampleRate=");
            sb.append(i);
            sb.append(", channels=");
            sb.append(i2);
            sb.append(")");
            Logging.m150047d("WebRtcAudioTrack", sb.toString());
            this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
            StringBuilder sb2 = new StringBuilder("byteBuffer.capacity: ");
            sb2.append(this.byteBuffer.capacity());
            Logging.m150047d("WebRtcAudioTrack", sb2.toString());
            this.emptyBytes = new byte[this.byteBuffer.capacity()];
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
            int channelCountToConfiguration = channelCountToConfiguration(i2);
            int minBufferSize = AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2);
            StringBuilder sb3 = new StringBuilder("AudioTrack.getMinBufferSize: ");
            sb3.append(minBufferSize);
            Logging.m150047d("WebRtcAudioTrack", sb3.toString());
            if (minBufferSize < this.byteBuffer.capacity()) {
                reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
                return false;
            } else if (this.audioTrack != null) {
                reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
                return false;
            } else {
                try {
                    if (VERSION.SDK_INT >= 21) {
                        this.audioTrack = createAudioTrackOnLollipopOrHigher(i, channelCountToConfiguration, minBufferSize);
                    } else {
                        this.audioTrack = createAudioTrackOnLowerThanLollipop(i, channelCountToConfiguration, minBufferSize);
                    }
                    if (this.audioTrack != null) {
                        if (this.audioTrack.getState() == 1) {
                            logMainParameters();
                            logMainParametersExtended();
                            return true;
                        }
                    }
                    reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                    releaseAudioResources();
                    return false;
                } catch (IllegalArgumentException e) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(ExceptionUtils.stackTrace(e));
                    sb4.append(e.getMessage());
                    reportWebRtcAudioTrackInitError(sb4.toString());
                    releaseAudioResources();
                    return false;
                }
            }
        } catch (Exception e2) {
            Logging.m150052w("WebRtcAudioTrack", "initPlayout exception", e2);
            reportWebRtcAudioTrackInitError(ExceptionUtils.stackTrace(e2));
            return false;
        }
    }
}
