package com.p280ss.avframework.livestreamv2.capture;

import android.os.Handler;
import com.p280ss.avframework.capture.audio.AudioCapturer;
import com.p280ss.avframework.utils.ThreadUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.capture.AudioCapturerExternal */
public class AudioCapturerExternal extends AudioCapturer {

    /* renamed from: m */
    private int f117077m;
    private com.p280ss.avframework.capture.audio.AudioCapturer.AudioCaptureObserver mAudioCaptureObserver;
    private int mBitwidth;
    private ByteBuffer mByteBuffer10ms;
    private int mChannel;
    private Handler mHandler;
    private int mSampleHZ;
    private int mSize;
    private boolean mStart;
    private long mStartTimestamp;
    private Object mStopFence = new Object();

    /* renamed from: com.ss.avframework.livestreamv2.capture.AudioCapturerExternal$AudioCaptureObserver */
    public interface AudioCaptureObserver {
        void onError(int i, Exception exc);

        void onStarted();

        void onStoped();
    }

    public int status() {
        return 0;
    }

    public int updateChannel() {
        return this.mChannel;
    }

    public void start() {
        synchronized (this.mStopFence) {
            this.mStart = true;
        }
    }

    public synchronized void stop() {
        synchronized (this.mStopFence) {
            this.mStart = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        if (this.mHandler != null) {
            Handler handler = this.mHandler;
            final Buffer buffer2 = buffer;
            final int i4 = i;
            final int i5 = i2;
            final int i6 = i3;
            final long j2 = j;
            C455461 r0 = new Runnable() {
                public void run() {
                    AudioCapturerExternal.this.nativeOnData(buffer2, i4, i5, i6, j2);
                }
            };
            ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r0);
            return;
        }
        nativeOnData(buffer, i, i2, i3, j);
    }

    public AudioCapturerExternal(int i, int i2, int i3, Handler handler, com.p280ss.avframework.capture.audio.AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mAudioCaptureObserver = audioCaptureObserver;
        this.mSampleHZ = i;
        this.mChannel = i2;
        this.mBitwidth = i3;
        this.mHandler = handler;
        this.mStart = false;
        this.mSize = 0;
        nativeAdaptedOutputFormat(i, i2, i3);
        this.mByteBuffer10ms = ByteBuffer.allocateDirect(4096);
    }

    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        ByteBuffer byteBuffer2;
        if (!this.mStart) {
            return -1;
        }
        if (!byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            byteBuffer.position(0);
            allocateDirect.put(byteBuffer);
            allocateDirect.position(0);
            byteBuffer2 = allocateDirect;
        } else {
            byteBuffer2 = byteBuffer;
        }
        onData(byteBuffer2, i4 / i2, i, i2, j);
        return 0;
    }

    private void adjustBufferTo10MsAndSend(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int i5 = ((i2 * i) / 100) * 2;
        byteBuffer2.position(0);
        int i6 = i4 * 2;
        if (byteBuffer.capacity() >= i6) {
            if (i5 > this.mSize) {
                ByteBuffer byteBuffer3 = null;
                int position = this.mByteBuffer10ms.position();
                if (position > 0) {
                    byteBuffer3 = ByteBuffer.allocate(position);
                    this.mByteBuffer10ms.position(0);
                    this.mByteBuffer10ms.limit(position);
                    byteBuffer3.put(this.mByteBuffer10ms);
                }
                this.mByteBuffer10ms = ByteBuffer.allocateDirect(i5);
                this.mByteBuffer10ms.position(0);
                this.mSize = i5;
                if (byteBuffer3 != null) {
                    byteBuffer3.position(0);
                    this.mByteBuffer10ms.put(byteBuffer3);
                }
            }
            if (this.mByteBuffer10ms.position() + i6 >= i5) {
                this.mStartTimestamp = j / 1000;
                int i7 = 0;
                boolean z = true;
                while (z) {
                    int position2 = this.mByteBuffer10ms.position();
                    byteBuffer2.position(i7);
                    if (position2 > 0) {
                        int i8 = i5 - position2;
                        byteBuffer2.limit(i8);
                        this.mByteBuffer10ms.put(byteBuffer.slice());
                        this.mByteBuffer10ms.position(0);
                        this.mByteBuffer10ms.limit(i5);
                        this.mByteBuffer10ms.limit(this.mSize);
                        this.mByteBuffer10ms.position(0);
                        int i9 = i7;
                        int i10 = i8;
                        onData(byteBuffer.slice(), i / 100, i, i2, this.mStartTimestamp * 1000);
                        i7 = i9 + i10;
                        byteBuffer2.limit(i6);
                    } else {
                        int i11 = i7;
                        if (i6 - i11 > i5) {
                            byteBuffer2.limit(i5);
                            onData(byteBuffer.slice(), i / 100, i, i2, this.mStartTimestamp * 1000);
                            i7 = i11 + i5;
                        } else {
                            byteBuffer2.limit(i6);
                            this.mByteBuffer10ms.put(byteBuffer.slice());
                            i7 = i11;
                            z = false;
                        }
                    }
                    this.mStartTimestamp += 10;
                }
            }
        }
    }
}
