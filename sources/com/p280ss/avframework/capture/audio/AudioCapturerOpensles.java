package com.p280ss.avframework.capture.audio;

import android.os.Handler;
import android.os.Looper;
import com.p280ss.avframework.capture.audio.AudioCapturer.AudioCaptureObserver;
import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.capture.audio.AudioCapturerOpensles */
public class AudioCapturerOpensles extends AudioCapturer {
    public AudioCaptureObserver mAudioCaptureObserver;
    private int mChannel;
    private Runnable mCheckRecordingRunnable;
    private Handler mHandler;
    private int mStat;

    private native void nativeCreate(int i, int i2, int i3, int i4);

    private native void nativePause();

    private native void nativeResume();

    private native int nativeStart();

    private native void nativeStop();

    public native boolean nativeRecording();

    public void pause() {
        nativePause();
    }

    public void resume() {
        nativeResume();
    }

    public int status() {
        return this.mStat;
    }

    public int updateChannel() {
        return this.mChannel;
    }

    public synchronized void release() {
        stop();
        if (this.mHandler != null) {
            this.mHandler.removeCallbacks(this.mCheckRecordingRunnable);
        }
        super.release();
    }

    public synchronized void stop() {
        if (this.mStat != 2) {
            pause();
            nativeStop();
            this.mStat = 2;
        }
    }

    public void start() {
        int nativeStart = nativeStart();
        if (nativeStart == 0) {
            this.mStat = 1;
            if (this.mHandler == null) {
                this.mHandler = new Handler(Looper.myLooper());
                this.mCheckRecordingRunnable = new Runnable() {
                    public void run() {
                        if (!AudioCapturerOpensles.this.nativeRecording() && AudioCapturerOpensles.this.mAudioCaptureObserver != null) {
                            AudioCapturerOpensles.this.mAudioCaptureObserver.onAudioCaptureError(-1, new Exception("OpenSL ES is not recording."));
                        }
                    }
                };
            }
            if (this.mHandler != null) {
                this.mHandler.postDelayed(this.mCheckRecordingRunnable, 3000);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Start failure (");
        sb.append(nativeStart);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    private void channelChange(int i) {
        this.mChannel = i;
    }

    public AudioCapturerOpensles(int i, int i2, int i3, AudioCaptureObserver audioCaptureObserver) {
        this(1, i, i2, i3, audioCaptureObserver);
    }

    public AudioCapturerOpensles(int i, int i2, int i3, int i4, AudioCaptureObserver audioCaptureObserver) {
        this.mChannel = i3;
        this.mAudioCaptureObserver = audioCaptureObserver;
        nativeCreate(i, i2, i3, i4);
        setMode(i);
    }
}
