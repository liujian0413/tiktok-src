package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build.VERSION;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.ThreadUtils.ThreadChecker;
import org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback;
import org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode;

class WebRtcAudioTrack {
    private static final int DEFAULT_USAGE = getDefaultUsageAttribute();
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    public AudioTrack audioTrack;
    public ByteBuffer byteBuffer;
    private final Context context;
    public byte[] emptyBytes;
    private final AudioTrackErrorCallback errorCallback;
    public long nativeAudioTrack;
    public volatile boolean speakerMute;
    private final ThreadChecker threadChecker;
    private final VolumeLogger volumeLogger;

    class AudioTrackThread extends Thread {
        private volatile boolean keepAlive = true;

        public void stopThread() {
            Logging.m150047d("WebRtcAudioTrackExternal", "stopThread");
            this.keepAlive = false;
        }

        public void run() {
            boolean z;
            boolean z2;
            Process.setThreadPriority(-19);
            StringBuilder sb = new StringBuilder("AudioTrackThread");
            sb.append(WebRtcAudioUtils.getThreadInfo());
            Logging.m150047d("WebRtcAudioTrackExternal", sb.toString());
            if (WebRtcAudioTrack.this.audioTrack.getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioTrack.assertTrue(z);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack.nativeGetPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, capacity);
                if (capacity <= WebRtcAudioTrack.this.byteBuffer.remaining()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                WebRtcAudioTrack.assertTrue(z2);
                if (WebRtcAudioTrack.this.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int writeBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeBytes != capacity) {
                    StringBuilder sb2 = new StringBuilder("AudioTrack.write played invalid number of bytes: ");
                    sb2.append(writeBytes);
                    Logging.m150048e("WebRtcAudioTrackExternal", sb2.toString());
                    if (writeBytes < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                        StringBuilder sb3 = new StringBuilder("AudioTrack.write failed: ");
                        sb3.append(writeBytes);
                        webRtcAudioTrack.reportWebRtcAudioTrackError(sb3.toString());
                    }
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.m150047d("WebRtcAudioTrackExternal", "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.m150047d("WebRtcAudioTrackExternal", "AudioTrack.stop is done.");
                } catch (IllegalStateException e) {
                    StringBuilder sb4 = new StringBuilder("AudioTrack.stop failed: ");
                    sb4.append(e.getMessage());
                    Logging.m150048e("WebRtcAudioTrackExternal", sb4.toString());
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

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    private static native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer2);

    public static native void nativeGetPlayoutData(long j, int i);

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
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
        this.threadChecker.checkIsOnValidThread();
        Logging.m150047d("WebRtcAudioTrackExternal", "getStreamMaxVolume");
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m150047d("WebRtcAudioTrackExternal", "getStreamVolume");
        return this.audioManager.getStreamVolume(0);
    }

    private void logBufferCapacityInFrames() {
        if (VERSION.SDK_INT >= 24) {
            StringBuilder sb = new StringBuilder("AudioTrack: buffer capacity in frames: ");
            sb.append(this.audioTrack.getBufferCapacityInFrames());
            Logging.m150047d("WebRtcAudioTrackExternal", sb.toString());
        }
    }

    private void logBufferSizeInFrames() {
        if (VERSION.SDK_INT >= 23) {
            StringBuilder sb = new StringBuilder("AudioTrack: buffer size in frames: ");
            sb.append(this.audioTrack.getBufferSizeInFrames());
            Logging.m150047d("WebRtcAudioTrackExternal", sb.toString());
        }
    }

    private void logUnderrunCount() {
        if (VERSION.SDK_INT >= 24) {
            StringBuilder sb = new StringBuilder("underrun count: ");
            sb.append(this.audioTrack.getUnderrunCount());
            Logging.m150047d("WebRtcAudioTrackExternal", sb.toString());
        }
    }

    private void releaseAudioResources() {
        Logging.m150047d("WebRtcAudioTrackExternal", "releaseAudioResources");
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
        Logging.m150047d("WebRtcAudioTrackExternal", sb.toString());
    }

    private boolean startPlayout() {
        boolean z;
        boolean z2;
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.start();
        Logging.m150047d("WebRtcAudioTrackExternal", "startPlayout");
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
        this.volumeLogger.stop();
        Logging.m150047d("WebRtcAudioTrackExternal", "stopPlayout");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.m150047d("WebRtcAudioTrackExternal", "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000)) {
            Logging.m150048e("WebRtcAudioTrackExternal", "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState("WebRtcAudioTrackExternal", this.context, this.audioManager);
        }
        Logging.m150047d("WebRtcAudioTrackExternal", "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    public void setNativeAudioTrack(long j) {
        this.nativeAudioTrack = j;
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public void setSpeakerMute(boolean z) {
        StringBuilder sb = new StringBuilder("setSpeakerMute(");
        sb.append(z);
        sb.append(")");
        Logging.m150051w("WebRtcAudioTrackExternal", sb.toString());
        this.speakerMute = z;
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        StringBuilder sb = new StringBuilder("Init playout error: ");
        sb.append(str);
        Logging.m150048e("WebRtcAudioTrackExternal", sb.toString());
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrackExternal", this.context, this.audioManager);
        if (this.errorCallback != null) {
            this.errorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        StringBuilder sb = new StringBuilder("setStreamVolume(");
        sb.append(i);
        sb.append(")");
        Logging.m150047d("WebRtcAudioTrackExternal", sb.toString());
        if (isVolumeFixed()) {
            Logging.m150048e("WebRtcAudioTrackExternal", "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    public void reportWebRtcAudioTrackError(String str) {
        StringBuilder sb = new StringBuilder("Run-time playback error: ");
        sb.append(str);
        Logging.m150048e("WebRtcAudioTrackExternal", sb.toString());
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrackExternal", this.context, this.audioManager);
        if (this.errorCallback != null) {
            this.errorCallback.onWebRtcAudioTrackError(str);
        }
    }

    WebRtcAudioTrack(Context context2, AudioManager audioManager2) {
        this(context2, audioManager2, null);
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        StringBuilder sb = new StringBuilder("Start playout error: ");
        sb.append(audioTrackStartErrorCode);
        sb.append(". ");
        sb.append(str);
        Logging.m150048e("WebRtcAudioTrackExternal", sb.toString());
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrackExternal", this.context, this.audioManager);
        if (this.errorCallback != null) {
            this.errorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    private boolean initPlayout(int i, int i2) {
        this.threadChecker.checkIsOnValidThread();
        StringBuilder sb = new StringBuilder("initPlayout(sampleRate=");
        sb.append(i);
        sb.append(", channels=");
        sb.append(i2);
        sb.append(")");
        Logging.m150047d("WebRtcAudioTrackExternal", sb.toString());
        this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
        StringBuilder sb2 = new StringBuilder("byteBuffer.capacity: ");
        sb2.append(this.byteBuffer.capacity());
        Logging.m150047d("WebRtcAudioTrackExternal", sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2);
        StringBuilder sb3 = new StringBuilder("AudioTrack.getMinBufferSize: ");
        sb3.append(minBufferSize);
        Logging.m150047d("WebRtcAudioTrackExternal", sb3.toString());
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
                if (this.audioTrack == null || this.audioTrack.getState() != 1) {
                    reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                    releaseAudioResources();
                    return false;
                }
                logMainParameters();
                logMainParametersExtended();
                return true;
            } catch (IllegalArgumentException e) {
                reportWebRtcAudioTrackInitError(e.getMessage());
                releaseAudioResources();
                return false;
            }
        }
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        AudioTrack audioTrack2 = new AudioTrack(0, i, i2, 2, i3, 1);
        return audioTrack2;
    }

    WebRtcAudioTrack(Context context2, AudioManager audioManager2, AudioTrackErrorCallback audioTrackErrorCallback) {
        this.threadChecker = new ThreadChecker();
        this.threadChecker.detachThread();
        this.context = context2;
        this.audioManager = audioManager2;
        this.errorCallback = audioTrackErrorCallback;
        this.volumeLogger = new VolumeLogger(audioManager2);
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        Logging.m150047d("WebRtcAudioTrackExternal", "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        StringBuilder sb = new StringBuilder("nativeOutputSampleRate: ");
        sb.append(nativeOutputSampleRate);
        Logging.m150047d("WebRtcAudioTrackExternal", sb.toString());
        if (i != nativeOutputSampleRate) {
            Logging.m150051w("WebRtcAudioTrackExternal", "Unable to use fast mode since requested sample rate is not native");
        }
        AudioTrack audioTrack2 = new AudioTrack(new Builder().setUsage(DEFAULT_USAGE).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
        return audioTrack2;
    }
}
