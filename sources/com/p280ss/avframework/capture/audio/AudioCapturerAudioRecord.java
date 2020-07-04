package com.p280ss.avframework.capture.audio;

import android.media.AudioRecord;
import android.os.Process;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.avframework.capture.audio.AudioCapturer.AudioCaptureObserver;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.TimeUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.capture.audio.AudioCapturerAudioRecord */
public class AudioCapturerAudioRecord extends AudioCapturer {
    public static String TAG = "AudioCapturerAudioRecord";
    public AudioCaptureObserver mAudioCaptureObserver;
    public AudioRecord mAudioRecord;
    private int mAudioSource;
    private AudioRecordThread mAudioThread;
    private final int mBitWidth;
    public ByteBuffer mByteBuffer;
    public int mChannel;
    public boolean mPause;
    public final int mSample;
    private int mStat;

    /* renamed from: com.ss.avframework.capture.audio.AudioCapturerAudioRecord$AudioRecordThread */
    class AudioRecordThread extends Thread {
        private volatile boolean keepAlive = true;

        public void stopThread() {
            AVLog.m143696d(AudioCapturerAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }

        public void run() {
            int i;
            String str;
            Process.setThreadPriority(-19);
            long nanoTime = TimeUtils.nanoTime() / 1000;
            while (this.keepAlive) {
                try {
                    i = AudioCapturerAudioRecord.this.mAudioRecord.read(AudioCapturerAudioRecord.this.mByteBuffer, AudioCapturerAudioRecord.this.mByteBuffer.capacity());
                } catch (Throwable unused) {
                    i = -3;
                }
                if (i == AudioCapturerAudioRecord.this.mByteBuffer.capacity()) {
                    if (!AudioCapturerAudioRecord.this.mPause) {
                        AudioCapturerAudioRecord.this.nativeOnData((Buffer) AudioCapturerAudioRecord.this.mByteBuffer, AudioCapturerAudioRecord.this.mSample / 100, AudioCapturerAudioRecord.this.mSample, AudioCapturerAudioRecord.this.mChannel, nanoTime);
                    }
                    nanoTime += 10000;
                } else {
                    StringBuilder sb = new StringBuilder("AudioRecord.read failed: ");
                    sb.append(i);
                    AVLog.m143697e(AudioCapturerAudioRecord.TAG, sb.toString());
                    if (i == -3) {
                        this.keepAlive = false;
                        String str2 = new String("AudioRecord read error, invalid operation");
                        AVLog.m143697e(AudioCapturerAudioRecord.TAG, str2);
                        if (AudioCapturerAudioRecord.this.mAudioCaptureObserver != null) {
                            AudioCapturerAudioRecord.this.mAudioCaptureObserver.onAudioCaptureError(-1, new Exception(str2));
                        }
                    }
                    AudioRecord audioRecord = AudioCapturerAudioRecord.this.mAudioRecord;
                    if (audioRecord != null) {
                        StringBuilder sb2 = new StringBuilder("AudioRecord read error (");
                        sb2.append(i);
                        sb2.append(") stat ");
                        String sb3 = sb2.toString();
                        try {
                            int state = audioRecord.getState();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(sb3);
                            sb4.append(state);
                            str = sb4.toString();
                        } catch (Throwable unused2) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(sb3);
                            sb5.append("unknown");
                            str = sb5.toString();
                        }
                        AVLog.logToIODevice2(4, AudioCapturerAudioRecord.TAG, str, null, "AudioCapturerAudioRecord.java:AudioRecordThread", VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                    }
                }
            }
        }

        public AudioRecordThread(String str) {
            super(str);
        }
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    public int getAudioSource() {
        return this.mAudioSource;
    }

    public void pause() {
        this.mPause = true;
    }

    public void resume() {
        this.mPause = false;
    }

    public int status() {
        return this.mStat;
    }

    public int updateChannel() {
        return this.mChannel;
    }

    public synchronized void release() {
        String str = TAG;
        StringBuilder sb = new StringBuilder("Release audioRecord ");
        sb.append(this);
        AVLog.iod(str, sb.toString());
        stop();
        super.release();
    }

    private void startRecording() {
        AVLog.m143696d(TAG, "startRecording");
        try {
            this.mAudioRecord.startRecording();
            if (this.mAudioRecord.getRecordingState() == 3) {
                this.mAudioThread = new AudioRecordThread("AudioRecordJavaThread");
                this.mAudioThread.start();
                this.mStat = 1;
                AVLog.iow(TAG, "AudioRecord started");
                return;
            }
            StringBuilder sb = new StringBuilder("AudioRecord.startRecording failed - incorrect state :");
            sb.append(this.mAudioRecord.getRecordingState());
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            AVLog.m143700w(TAG, illegalStateException.getMessage());
            AVLog.ioe(TAG, illegalStateException.getMessage());
            throw illegalStateException;
        } catch (IllegalStateException e) {
            StringBuilder sb2 = new StringBuilder("AudioRecord.startRecording failed: ");
            sb2.append(e.getMessage());
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void stop() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ss.avframework.capture.audio.AudioCapturerAudioRecord$AudioRecordThread r0 = r5.mAudioThread     // Catch:{ all -> 0x0054 }
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.ss.avframework.capture.audio.AudioCapturerAudioRecord$AudioRecordThread r0 = r5.mAudioThread     // Catch:{ all -> 0x0054 }
            r0.stopThread()     // Catch:{ all -> 0x0054 }
            com.ss.avframework.capture.audio.AudioCapturerAudioRecord$AudioRecordThread r0 = r5.mAudioThread     // Catch:{ InterruptedException -> 0x0012 }
            r2 = 2000(0x7d0, double:9.88E-321)
            r0.join(r2)     // Catch:{ InterruptedException -> 0x0012 }
        L_0x0012:
            r5.mAudioThread = r1     // Catch:{ all -> 0x0054 }
        L_0x0014:
            android.media.AudioRecord r0 = r5.mAudioRecord     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x004b
            android.media.AudioRecord r0 = r5.mAudioRecord     // Catch:{ IllegalStateException -> 0x0025 }
            r0.stop()     // Catch:{ IllegalStateException -> 0x0025 }
            java.lang.String r0 = TAG     // Catch:{ IllegalStateException -> 0x0025 }
            java.lang.String r2 = "AudioRecord stopped"
            com.p280ss.avframework.utils.AVLog.iow(r0, r2)     // Catch:{ IllegalStateException -> 0x0025 }
            goto L_0x003d
        L_0x0025:
            r0 = move-exception
            java.lang.String r2 = TAG     // Catch:{ all -> 0x0054 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "AudioRecord.stop() error: "
            r3.<init>(r4)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0054 }
            r3.append(r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0054 }
            com.p280ss.avframework.utils.AVLog.ioe(r2, r0)     // Catch:{ all -> 0x0054 }
        L_0x003d:
            android.media.AudioRecord r0 = r5.mAudioRecord     // Catch:{ all -> 0x0054 }
            r0.release()     // Catch:{ all -> 0x0054 }
            r5.mAudioRecord = r1     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = TAG     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "AudioRecord released"
            com.p280ss.avframework.utils.AVLog.iow(r0, r2)     // Catch:{ all -> 0x0054 }
        L_0x004b:
            r5.mAudioCaptureObserver = r1     // Catch:{ all -> 0x0054 }
            r0 = 2
            r5.mStat = r0     // Catch:{ all -> 0x0054 }
            r5.mStat = r0     // Catch:{ all -> 0x0054 }
            monitor-exit(r5)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.capture.audio.AudioCapturerAudioRecord.stop():void");
    }

    public void start() {
        int channelCountToConfiguration = channelCountToConfiguration(this.mChannel);
        int minBufferSize = AudioRecord.getMinBufferSize(this.mSample, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            StringBuilder sb = new StringBuilder("AudioRecord.getMinBufferSize failed: ");
            sb.append(minBufferSize);
            throw new IllegalStateException(sb.toString());
        }
        String str = TAG;
        StringBuilder sb2 = new StringBuilder("AudioRecord.getMinBufferSize: ");
        sb2.append(minBufferSize);
        AVLog.m143696d(str, sb2.toString());
        this.mByteBuffer = ByteBuffer.allocateDirect(this.mChannel * (this.mBitWidth / 8) * (this.mSample / 100));
        if (this.mByteBuffer.hasArray()) {
            String str2 = TAG;
            StringBuilder sb3 = new StringBuilder("byteBuffer.capacity: ");
            sb3.append(this.mByteBuffer.capacity());
            AVLog.m143696d(str2, sb3.toString());
            int max = Math.max(minBufferSize * 2, this.mByteBuffer.capacity());
            String str3 = TAG;
            StringBuilder sb4 = new StringBuilder("bufferSizeInBytes: ");
            sb4.append(max);
            AVLog.m143696d(str3, sb4.toString());
            try {
                String str4 = TAG;
                StringBuilder sb5 = new StringBuilder("Using audio mode ");
                sb5.append(this.mAudioSource);
                sb5.append(" at AudioRecord ");
                sb5.append(this);
                AVLog.ioi(str4, sb5.toString());
                AudioRecord audioRecord = new AudioRecord(this.mAudioSource, this.mSample, channelCountToConfiguration, 2, max);
                this.mAudioRecord = audioRecord;
                if (this.mAudioRecord == null || this.mAudioRecord.getState() != 1) {
                    throw new IllegalStateException("Failed to create a new AudioRecord instance");
                }
                startRecording();
            } catch (IllegalArgumentException e) {
                if (this.mChannel != 1) {
                    if (this.mAudioRecord != null) {
                        this.mAudioRecord.release();
                    }
                    this.mChannel = 1;
                    AVLog.m143696d(TAG, "AudioRecord trying mono...");
                    start();
                    return;
                }
                StringBuilder sb6 = new StringBuilder("AudioRecord ctor error: ");
                sb6.append(e.getMessage());
                throw new IllegalStateException(sb6.toString());
            }
        } else {
            throw new IllegalStateException("ByteBuffer does not have backing array.");
        }
    }

    public AudioCapturerAudioRecord(int i, int i2, int i3) {
        this(1, i, i2, i3, null);
    }

    public AudioCapturerAudioRecord(int i, int i2, int i3, AudioCaptureObserver audioCaptureObserver) {
        this(1, i, i2, i3, audioCaptureObserver);
    }

    public AudioCapturerAudioRecord(int i, int i2, int i3, int i4, AudioCaptureObserver audioCaptureObserver) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("Construct audioRecord ");
        sb.append(this);
        AVLog.iod(str, sb.toString());
        this.mStat = 0;
        this.mSample = i2;
        this.mChannel = i3;
        this.mBitWidth = i4;
        this.mAudioSource = i;
        this.mAudioCaptureObserver = audioCaptureObserver;
        setMode(i);
        pause();
    }
}
