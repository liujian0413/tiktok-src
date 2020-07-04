package org.webrtc.voiceengine;

import android.media.AudioRecord;
import android.os.Build.VERSION;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;

public class WebRtcAudioRecord {
    private static final int DEFAULT_AUDIO_SOURCE;
    public static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    private static int audioSource;
    private static WebRtcAudioRecordErrorCallback errorCallback;
    public static volatile boolean microphoneMute;
    public AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    public ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects = WebRtcAudioEffects.create();
    public byte[] emptyBytes;
    public final long nativeAudioRecord;

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    class AudioRecordThread extends Thread {
        private volatile boolean keepAlive = true;

        public void stopThread() {
            Logging.m150047d("WebRtcAudioRecord", "stopThread");
            this.keepAlive = false;
        }

        public void run() {
            boolean z;
            Process.setThreadPriority(-19);
            StringBuilder sb = new StringBuilder("AudioRecordThread");
            sb.append(WebRtcAudioUtils.getThreadInfo());
            Logging.m150047d("WebRtcAudioRecord", sb.toString());
            if (WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioRecord.assertTrue(z);
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.nativeAudioRecord);
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("AudioRecord.read failed: ");
                    sb2.append(read);
                    String sb3 = sb2.toString();
                    Logging.m150048e("WebRtcAudioRecord", sb3);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(sb3);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (Exception e) {
                StringBuilder sb4 = new StringBuilder("AudioRecord.stop failed: ");
                sb4.append(e.getMessage());
                Logging.m150048e("WebRtcAudioRecord", sb4.toString());
            }
        }

        public AudioRecordThread(String str) {
            super(str);
        }
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }
    }

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer2, long j);

    public native void nativeDataIsRecorded(int i, long j);

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
    }

    private void logMainParametersExtended() {
        if (VERSION.SDK_INT >= 23) {
            StringBuilder sb = new StringBuilder("AudioRecord: buffer size in frames: ");
            sb.append(this.audioRecord.getBufferSizeInFrames());
            Logging.m150047d("WebRtcAudioRecord", sb.toString());
        }
    }

    private void releaseAudioResources() {
        Logging.m150047d("WebRtcAudioRecord", "releaseAudioResources");
        if (this.audioRecord != null) {
            this.audioRecord.release();
            this.audioRecord = null;
        }
    }

    private void logMainParameters() {
        StringBuilder sb = new StringBuilder("AudioRecord: session ID: ");
        sb.append(this.audioRecord.getAudioSessionId());
        sb.append(", channels: ");
        sb.append(this.audioRecord.getChannelCount());
        sb.append(", sample rate: ");
        sb.append(this.audioRecord.getSampleRate());
        Logging.m150047d("WebRtcAudioRecord", sb.toString());
    }

    private boolean stopRecording() {
        boolean z;
        Logging.m150047d("WebRtcAudioRecord", "stopRecording");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000)) {
            Logging.m150048e("WebRtcAudioRecord", "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        }
        this.audioThread = null;
        if (this.effects != null) {
            this.effects.release();
        }
        releaseAudioResources();
        return true;
    }

    private boolean startRecording() {
        boolean z;
        boolean z2;
        Logging.m150047d("WebRtcAudioRecord", "startRecording");
        if (this.audioRecord != null) {
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
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                AudioRecordStartErrorCode audioRecordStartErrorCode = AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH;
                StringBuilder sb = new StringBuilder("AudioRecord.startRecording failed - incorrect state :");
                sb.append(this.audioRecord.getRecordingState());
                reportWebRtcAudioRecordStartError(audioRecordStartErrorCode, sb.toString());
                return false;
            }
            this.audioThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioRecordStartErrorCode audioRecordStartErrorCode2 = AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION;
            StringBuilder sb2 = new StringBuilder("AudioRecord.startRecording failed: ");
            sb2.append(e.getMessage());
            reportWebRtcAudioRecordStartError(audioRecordStartErrorCode2, sb2.toString());
            return false;
        }
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.m150047d("WebRtcAudioRecord", "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z) {
        StringBuilder sb = new StringBuilder("setMicrophoneMute(");
        sb.append(z);
        sb.append(")");
        Logging.m150051w("WebRtcAudioRecord", sb.toString());
        microphoneMute = z;
    }

    WebRtcAudioRecord(long j) {
        StringBuilder sb = new StringBuilder("ctor");
        sb.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m150047d("WebRtcAudioRecord", sb.toString());
        this.nativeAudioRecord = j;
    }

    private boolean enableBuiltInAEC(boolean z) {
        StringBuilder sb = new StringBuilder("enableBuiltInAEC(");
        sb.append(z);
        sb.append(')');
        Logging.m150047d("WebRtcAudioRecord", sb.toString());
        if (this.effects != null) {
            return this.effects.setAEC(z);
        }
        Logging.m150048e("WebRtcAudioRecord", "Built-in AEC is not supported on this platform");
        return false;
    }

    private boolean enableBuiltInNS(boolean z) {
        StringBuilder sb = new StringBuilder("enableBuiltInNS(");
        sb.append(z);
        sb.append(')');
        Logging.m150047d("WebRtcAudioRecord", sb.toString());
        if (this.effects != null) {
            return this.effects.setNS(z);
        }
        Logging.m150048e("WebRtcAudioRecord", "Built-in NS is not supported on this platform");
        return false;
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        StringBuilder sb = new StringBuilder("Init recording error: ");
        sb.append(str);
        Logging.m150048e("WebRtcAudioRecord", sb.toString());
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    public static synchronized void setAudioSource(int i) {
        synchronized (WebRtcAudioRecord.class) {
            String str = "WebRtcAudioRecord";
            StringBuilder sb = new StringBuilder("Audio source is changed from: ");
            sb.append(audioSource);
            sb.append(" to ");
            sb.append(i);
            Logging.m150051w(str, sb.toString());
            audioSource = i;
        }
    }

    public void reportWebRtcAudioRecordError(String str) {
        StringBuilder sb = new StringBuilder("Run-time recording error: ");
        sb.append(str);
        Logging.m150048e("WebRtcAudioRecord", sb.toString());
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        StringBuilder sb = new StringBuilder("Start recording error: ");
        sb.append(audioRecordStartErrorCode);
        sb.append(". ");
        sb.append(str);
        Logging.m150048e("WebRtcAudioRecord", sb.toString());
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private int initRecording(int i, int i2, boolean z) {
        int i3;
        StringBuilder sb = new StringBuilder("initRecording(sampleRate=");
        sb.append(i);
        sb.append(", channels=");
        sb.append(i2);
        sb.append(", forbidVoip=");
        sb.append(z);
        sb.append(")");
        Logging.m150047d("WebRtcAudioRecord", sb.toString());
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i4 = i / 100;
        this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * i4);
        StringBuilder sb2 = new StringBuilder("byteBuffer.capacity: ");
        sb2.append(this.byteBuffer.capacity());
        Logging.m150047d("WebRtcAudioRecord", sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            StringBuilder sb3 = new StringBuilder("AudioRecord.getMinBufferSize failed: ");
            sb3.append(minBufferSize);
            reportWebRtcAudioRecordInitError(sb3.toString());
            return -1;
        }
        StringBuilder sb4 = new StringBuilder("AudioRecord.getMinBufferSize: ");
        sb4.append(minBufferSize);
        Logging.m150047d("WebRtcAudioRecord", sb4.toString());
        int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        StringBuilder sb5 = new StringBuilder("bufferSizeInBytes: ");
        sb5.append(max);
        Logging.m150047d("WebRtcAudioRecord", sb5.toString());
        try {
            if (z) {
                i3 = 0;
            } else {
                i3 = audioSource;
            }
            AudioRecord audioRecord2 = new AudioRecord(i3, i, channelCountToConfiguration, 2, max);
            this.audioRecord = audioRecord2;
            if (this.audioRecord == null || this.audioRecord.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources();
                return -1;
            }
            if (this.effects != null) {
                this.effects.enable(this.audioRecord.getAudioSessionId());
            }
            logMainParameters();
            logMainParametersExtended();
            return i4;
        } catch (IllegalArgumentException e) {
            StringBuilder sb6 = new StringBuilder("AudioRecord ctor error: ");
            sb6.append(e.getMessage());
            reportWebRtcAudioRecordInitError(sb6.toString());
            releaseAudioResources();
            return -1;
        }
    }
}
