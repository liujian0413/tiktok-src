package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Build.VERSION;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback;
import org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode;
import org.webrtc.audio.JavaAudioDeviceModule.AudioSamples;
import org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback;

class WebRtcAudioRecord {
    private final AudioManager audioManager;
    public AudioRecord audioRecord;
    public final SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private AudioRecordThread audioThread;
    public ByteBuffer byteBuffer;
    private final Context context;
    private final WebRtcAudioEffects effects;
    public byte[] emptyBytes;
    private final AudioRecordErrorCallback errorCallback;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    public volatile boolean microphoneMute;
    public long nativeAudioRecord;

    class AudioRecordThread extends Thread {
        private volatile boolean keepAlive = true;

        public void stopThread() {
            Logging.m150047d("WebRtcAudioRecordExternal", "stopThread");
            this.keepAlive = false;
        }

        public void run() {
            boolean z;
            Process.setThreadPriority(-19);
            StringBuilder sb = new StringBuilder("AudioRecordThread");
            sb.append(WebRtcAudioUtils.getThreadInfo());
            Logging.m150047d("WebRtcAudioRecordExternal", sb.toString());
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
                    if (WebRtcAudioRecord.this.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord.this.nativeDataIsRecorded(WebRtcAudioRecord.this.nativeAudioRecord, read);
                    }
                    if (WebRtcAudioRecord.this.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord.getAudioFormat(), WebRtcAudioRecord.this.audioRecord.getChannelCount(), WebRtcAudioRecord.this.audioRecord.getSampleRate(), Arrays.copyOfRange(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.capacity() + WebRtcAudioRecord.this.byteBuffer.arrayOffset())));
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("AudioRecord.read failed: ");
                    sb2.append(read);
                    String sb3 = sb2.toString();
                    Logging.m150048e("WebRtcAudioRecordExternal", sb3);
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
            } catch (IllegalStateException e) {
                StringBuilder sb4 = new StringBuilder("AudioRecord.stop failed: ");
                sb4.append(e.getMessage());
                Logging.m150048e("WebRtcAudioRecordExternal", sb4.toString());
            }
        }

        public AudioRecordThread(String str) {
            super(str);
        }
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer2);

    /* access modifiers changed from: 0000 */
    public boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    /* access modifiers changed from: 0000 */
    public boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    public native void nativeDataIsRecorded(long j, int i);

    private void logMainParametersExtended() {
        if (VERSION.SDK_INT >= 23) {
            StringBuilder sb = new StringBuilder("AudioRecord: buffer size in frames: ");
            sb.append(this.audioRecord.getBufferSizeInFrames());
            Logging.m150047d("WebRtcAudioRecordExternal", sb.toString());
        }
    }

    private void releaseAudioResources() {
        Logging.m150047d("WebRtcAudioRecordExternal", "releaseAudioResources");
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
        Logging.m150047d("WebRtcAudioRecordExternal", sb.toString());
    }

    private boolean stopRecording() {
        boolean z;
        Logging.m150047d("WebRtcAudioRecordExternal", "stopRecording");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000)) {
            Logging.m150048e("WebRtcAudioRecordExternal", "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState("WebRtcAudioRecordExternal", this.context, this.audioManager);
        }
        this.audioThread = null;
        this.effects.release();
        releaseAudioResources();
        return true;
    }

    private boolean startRecording() {
        boolean z;
        boolean z2;
        Logging.m150047d("WebRtcAudioRecordExternal", "startRecording");
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

    public void setNativeAudioRecord(long j) {
        this.nativeAudioRecord = j;
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        StringBuilder sb = new StringBuilder("enableBuiltInAEC(");
        sb.append(z);
        sb.append(")");
        Logging.m150047d("WebRtcAudioRecordExternal", sb.toString());
        return this.effects.setAEC(z);
    }

    private boolean enableBuiltInNS(boolean z) {
        StringBuilder sb = new StringBuilder("enableBuiltInNS(");
        sb.append(z);
        sb.append(")");
        Logging.m150047d("WebRtcAudioRecordExternal", sb.toString());
        return this.effects.setNS(z);
    }

    public void setMicrophoneMute(boolean z) {
        StringBuilder sb = new StringBuilder("setMicrophoneMute(");
        sb.append(z);
        sb.append(")");
        Logging.m150051w("WebRtcAudioRecordExternal", sb.toString());
        this.microphoneMute = z;
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        StringBuilder sb = new StringBuilder("Init recording error: ");
        sb.append(str);
        Logging.m150048e("WebRtcAudioRecordExternal", sb.toString());
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecordExternal", this.context, this.audioManager);
        if (this.errorCallback != null) {
            this.errorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    public void reportWebRtcAudioRecordError(String str) {
        StringBuilder sb = new StringBuilder("Run-time recording error: ");
        sb.append(str);
        Logging.m150048e("WebRtcAudioRecordExternal", sb.toString());
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecordExternal", this.context, this.audioManager);
        if (this.errorCallback != null) {
            this.errorCallback.onWebRtcAudioRecordError(str);
        }
    }

    WebRtcAudioRecord(Context context2, AudioManager audioManager2) {
        this(context2, audioManager2, 7, null, null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported());
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        StringBuilder sb = new StringBuilder("Start recording error: ");
        sb.append(audioRecordStartErrorCode);
        sb.append(". ");
        sb.append(str);
        Logging.m150048e("WebRtcAudioRecordExternal", sb.toString());
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecordExternal", this.context, this.audioManager);
        if (this.errorCallback != null) {
            this.errorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private int initRecording(int i, int i2) {
        StringBuilder sb = new StringBuilder("initRecording(sampleRate=");
        sb.append(i);
        sb.append(", channels=");
        sb.append(i2);
        sb.append(")");
        Logging.m150047d("WebRtcAudioRecordExternal", sb.toString());
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i3 = i / 100;
        this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * i3);
        if (!this.byteBuffer.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        StringBuilder sb2 = new StringBuilder("byteBuffer.capacity: ");
        sb2.append(this.byteBuffer.capacity());
        Logging.m150047d("WebRtcAudioRecordExternal", sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
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
        Logging.m150047d("WebRtcAudioRecordExternal", sb4.toString());
        int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        StringBuilder sb5 = new StringBuilder("bufferSizeInBytes: ");
        sb5.append(max);
        Logging.m150047d("WebRtcAudioRecordExternal", sb5.toString());
        try {
            AudioRecord audioRecord2 = new AudioRecord(this.audioSource, i, channelCountToConfiguration, 2, max);
            this.audioRecord = audioRecord2;
            if (this.audioRecord == null || this.audioRecord.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources();
                return -1;
            }
            this.effects.enable(this.audioRecord.getAudioSessionId());
            logMainParameters();
            logMainParametersExtended();
            return i3;
        } catch (IllegalArgumentException e) {
            StringBuilder sb6 = new StringBuilder("AudioRecord ctor error: ");
            sb6.append(e.getMessage());
            reportWebRtcAudioRecordInitError(sb6.toString());
            releaseAudioResources();
            return -1;
        }
    }

    public WebRtcAudioRecord(Context context2, AudioManager audioManager2, int i, AudioRecordErrorCallback audioRecordErrorCallback, SamplesReadyCallback samplesReadyCallback, boolean z, boolean z2) {
        this.effects = new WebRtcAudioEffects();
        if (z && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw new IllegalArgumentException("HW AEC not supported");
        } else if (!z2 || WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            this.context = context2;
            this.audioManager = audioManager2;
            this.audioSource = i;
            this.errorCallback = audioRecordErrorCallback;
            this.audioSamplesReadyCallback = samplesReadyCallback;
            this.isAcousticEchoCancelerSupported = z;
            this.isNoiseSuppressorSupported = z2;
        } else {
            throw new IllegalArgumentException("HW NS not supported");
        }
    }
}
