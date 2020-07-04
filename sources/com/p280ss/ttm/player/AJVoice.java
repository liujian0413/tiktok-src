package com.p280ss.ttm.player;

import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack.OnPlaybackPositionUpdateListener;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.C1642a;
import com.p280ss.ttm.utils.AVLogger;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: com.ss.ttm.player.AJVoice */
public class AJVoice implements OnPlaybackPositionUpdateListener {
    private static final int SDK_INT = VERSION.SDK_INT;
    private static final String TAG = "AJVoice";
    private static String mDeviceName = null;
    private static boolean mNeedReleaseWorkAround = false;
    private long forceResetWorkaroundTimeMs = -9223372036854775807L;
    private Method getLatencyMethod;
    private long lastRawPlaybackHeadPosition;
    private int mAudioFormat = 2;
    private AudioManager mAudioManager;
    private AudioTrack mAudioTrack;
    private int mBlockSize = 2048;
    private int mBufferSizeMs;
    private int mChannels = 2;
    private int mChannelsLayout;
    private int mFrameSamples;
    private long mLastGetLatencyMs;
    private int mLatencyMs;
    private float mLeftVolume = -1.0f;
    private int mMaxVolume;
    private byte[] mMinBytes;
    private long mNativeObject;
    private TTPlayer mPlayer;
    private int mSampleBytes = 2;
    private int mSampleFormat;
    private int mSampleRate = 44100;
    private int mSerial = -1;
    private long mStartTime;
    private volatile boolean mStoped = true;
    private int mTrackBufferSize;
    private long mWrittenPcmBytes;

    public int getMaxVolume() {
        return this.mMaxVolume;
    }

    public int getTrackBufferSize() {
        return this.mTrackBufferSize;
    }

    public void onMarkerReached(AudioTrack audioTrack) {
    }

    public void onPeriodicNotification(AudioTrack audioTrack) {
    }

    public void pause() {
        try {
            this.mAudioTrack.pause();
        } catch (Throwable unused) {
        }
    }

    public void resume() {
        try {
            this.mAudioTrack.play();
        } catch (Throwable unused) {
        }
    }

    private long getPlaybackBytes() {
        return getPlaybackHeadPosition() * ((long) getPcmFrameSize(this.mAudioFormat, this.mChannels));
    }

    private long getPlaybackPositionMs() {
        return (getPlaybackHeadPosition() * 1000) / ((long) this.mSampleRate);
    }

    public void stop() {
        if (!this.mStoped) {
            this.mStoped = true;
            try {
                this.mAudioTrack.pause();
            } catch (Throwable unused) {
            }
        }
    }

    private long getWrittenDurationMs() {
        return ((this.mWrittenPcmBytes / ((long) getPcmFrameSize(this.mAudioFormat, this.mChannels))) * 1000) / ((long) this.mSampleRate);
    }

    public void close() {
        if (this.mAudioTrack != null) {
            final AudioTrack audioTrack = this.mAudioTrack;
            this.mAudioTrack = null;
            try {
                new Thread() {
                    public void run() {
                        AJVoice.this.releaseTrack(audioTrack);
                    }
                }.start();
            } catch (Throwable unused) {
                releaseTrack(audioTrack);
            }
        }
    }

    public int getEOSDelayMs() {
        long j;
        long writtenDurationMs = getWrittenDurationMs();
        long playbackPositionMs = getPlaybackPositionMs();
        if (getLatency() > 0) {
            j = (long) (this.mLatencyMs - this.mBufferSizeMs);
        } else {
            j = 0;
        }
        return (int) ((writtenDurationMs - playbackPositionMs) + j);
    }

    public int start() {
        if (this.mAudioTrack == null) {
            return -2;
        }
        this.mStoped = false;
        try {
            this.mAudioTrack.play();
            this.mSerial = -1;
            if (mNeedReleaseWorkAround) {
                this.mStartTime = SystemClock.elapsedRealtime();
            }
            return 0;
        } catch (Throwable unused) {
            return -3;
        }
    }

    public AJVoice() {
        if (mDeviceName == null) {
            String str = Build.DEVICE;
            mDeviceName = str;
            if (str.equals("OnePlus6T")) {
                mNeedReleaseWorkAround = true;
            }
        }
    }

    private long getPlaybackHeadPosition() {
        int playState = this.mAudioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.mAudioTrack.getPlaybackHeadPosition());
        if (playbackHeadPosition == 0 && this.lastRawPlaybackHeadPosition > 0 && playState == 3) {
            if (this.forceResetWorkaroundTimeMs == -9223372036854775807L) {
                this.forceResetWorkaroundTimeMs = SystemClock.elapsedRealtime();
            }
            return this.lastRawPlaybackHeadPosition;
        }
        this.forceResetWorkaroundTimeMs = -9223372036854775807L;
        this.lastRawPlaybackHeadPosition = playbackHeadPosition;
        return playbackHeadPosition;
    }

    private boolean needsReset() {
        if (this.forceResetWorkaroundTimeMs == -9223372036854775807L || this.mWrittenPcmBytes <= 0 || SystemClock.elapsedRealtime() - this.forceResetWorkaroundTimeMs < 200) {
            return false;
        }
        return true;
    }

    private int reset() {
        this.mWrittenPcmBytes = 0;
        this.mLatencyMs = 0;
        this.forceResetWorkaroundTimeMs = -9223372036854775807L;
        this.mLastGetLatencyMs = 0;
        this.lastRawPlaybackHeadPosition = 0;
        AudioTrack audioTrack = this.mAudioTrack;
        this.mAudioTrack = null;
        try {
            audioTrack.flush();
            audioTrack.release();
        } catch (Exception unused) {
        } catch (Throwable th) {
            reconfigure();
            throw th;
        }
        return reconfigure();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float getVolume() {
        /*
            r4 = this;
            com.ss.ttm.player.TTPlayer r0 = r4.mPlayer
            r1 = 0
            if (r0 == 0) goto L_0x0022
            float r0 = r4.mLeftVolume
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0022
            android.media.AudioManager r0 = r4.mAudioManager
            if (r0 == 0) goto L_0x0022
            android.media.AudioManager r0 = r4.mAudioManager     // Catch:{ Exception -> 0x0022 }
            r2 = 3
            int r0 = r0.getStreamMaxVolume(r2)     // Catch:{ Exception -> 0x0022 }
            android.media.AudioManager r3 = r4.mAudioManager     // Catch:{ Exception -> 0x0020 }
            int r2 = r3.getStreamVolume(r2)     // Catch:{ Exception -> 0x0020 }
            r1 = r2
            goto L_0x0023
        L_0x0020:
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r1 < 0) goto L_0x0027
            float r0 = (float) r1
            return r0
        L_0x0027:
            if (r0 <= 0) goto L_0x002d
            int r0 = r0 / 4
            float r0 = (float) r0
            return r0
        L_0x002d:
            r0 = 1092616192(0x41200000, float:10.0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.AJVoice.getVolume():float");
    }

    public int getLatency() {
        getPlaybackHeadPosition();
        if (this.getLatencyMethod != null) {
            long nanoTime = System.nanoTime() / 1000000;
            if (nanoTime - this.mLastGetLatencyMs > 500) {
                try {
                    this.mLatencyMs = ((Integer) this.getLatencyMethod.invoke(this.mAudioTrack, null)).intValue();
                    this.mLatencyMs = Math.max(this.mLatencyMs, 0);
                    if (this.mLatencyMs > 5000) {
                        this.mLatencyMs = 0;
                    }
                } catch (Exception unused) {
                    this.getLatencyMethod = null;
                }
                this.mLastGetLatencyMs = nanoTime;
            }
        }
        return this.mLatencyMs;
    }

    private int reconfigure() {
        this.mAudioManager = (AudioManager) this.mPlayer.getContext().getSystemService("audio");
        if (this.mAudioManager != null) {
            this.mMaxVolume = this.mAudioManager.getStreamMaxVolume(3);
        }
        this.mChannelsLayout = getAudioTrackChannelConfig(this.mChannels);
        if (this.mChannelsLayout == 0) {
            AVLogger.m144197k(TAG, C1642a.m8034a("not supoort channel:%d", new Object[]{Integer.valueOf(this.mChannels)}));
            return -1;
        }
        if (this.mSampleBytes == 1) {
            this.mAudioFormat = 3;
        } else if (this.mSampleBytes != 2) {
            return -12;
        } else {
            this.mAudioFormat = 2;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(this.mSampleRate, this.mChannelsLayout, this.mAudioFormat);
        if (minBufferSize <= 0) {
            return minBufferSize;
        }
        this.mTrackBufferSize = minBufferSize;
        try {
            this.mMinBytes = new byte[minBufferSize];
            this.mBufferSizeMs = ((this.mTrackBufferSize / getPcmFrameSize(this.mAudioFormat, this.mChannels)) * 1000) / this.mSampleRate;
            try {
                AudioTrack audioTrack = new AudioTrack(3, this.mSampleRate, this.mChannelsLayout, this.mAudioFormat, minBufferSize, 1);
                this.mAudioTrack = audioTrack;
                if (this.mAudioTrack.getState() == 1) {
                    return 0;
                }
                try {
                    this.mAudioTrack.release();
                    this.mAudioTrack = null;
                    return -3;
                } catch (Exception unused) {
                    this.mAudioTrack = null;
                    return -3;
                } catch (Throwable unused2) {
                    this.mAudioTrack = null;
                    return -3;
                }
            } catch (Throwable unused3) {
                return -1;
            }
        } catch (OutOfMemoryError unused4) {
            return -10;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(2:5|(1:7))|8|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseTrack(android.media.AudioTrack r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = mNeedReleaseWorkAround     // Catch:{ Exception -> 0x0019 }
            if (r0 == 0) goto L_0x0019
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0019 }
            long r2 = r5.mStartTime     // Catch:{ Exception -> 0x0019 }
            r4 = 0
            long r0 = r0 - r2
            r2 = 80
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0019
            long r2 = r2 - r0
            java.lang.Thread.sleep(r2)     // Catch:{ Exception -> 0x0019 }
        L_0x0019:
            r6.release()     // Catch:{ Exception -> 0x001d }
            return
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.AJVoice.releaseTrack(android.media.AudioTrack):void");
    }

    public static int getAudioTrackChannelConfig(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                if (VERSION.SDK_INT < 23 && VERSION.SDK_INT < 21) {
                    return 0;
                }
                return 6396;
            default:
                return 0;
        }
    }

    public void setTrackVolume(float f, float f2) {
        if (this.mAudioTrack != null) {
            this.mAudioTrack.setStereoVolume(f, f2);
        }
    }

    public static int getPcmFrameSize(int i, int i2) {
        switch (i) {
            case 2:
                return i2 * 2;
            case 3:
                return i2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int open(long j, TTPlayer tTPlayer) {
        this.mPlayer = tTPlayer;
        int reconfigure = reconfigure();
        if (reconfigure == 0) {
            if (this.mLeftVolume != -1.0f) {
                setVolume(this.mLeftVolume, this.mLeftVolume);
            }
            if (VERSION.SDK_INT >= 18) {
                try {
                    this.getLatencyMethod = AudioTrack.class.getMethod("getLatency", null);
                } catch (NoSuchMethodException unused) {
                }
            }
        }
        return reconfigure;
    }

    public void setVolume(float f, float f2) {
        try {
            if (((float) this.mMaxVolume) < f) {
                f = (float) this.mMaxVolume;
            }
            if (f2 == -1048575.0f && this.mAudioTrack != null) {
                this.mAudioTrack.setStereoVolume(f, f2);
            } else if (this.mAudioManager != null) {
                this.mAudioManager.setStreamVolume(3, (int) f, 0);
            }
            this.mLeftVolume = f;
        } catch (Exception unused) {
        }
    }

    public int write(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            AVLogger.m144195e(TAG, "buffer is nullpoint");
            return -1;
        } else if (this.mAudioTrack.write(byteBuffer, 0, byteBuffer.capacity()) != byteBuffer.capacity()) {
            return -1;
        } else {
            byteBuffer.flip();
            return 0;
        }
    }

    public int write(byte[] bArr, int i, int i2, int i3) {
        if (bArr == null || bArr.length == 0) {
            AVLogger.m144195e(TAG, "buffer is nullpoint");
            return -10;
        }
        int i4 = 0;
        if (this.mStoped) {
            return 0;
        }
        if (this.mSerial != i3) {
            this.mSerial = i3;
            if (this.mWrittenPcmBytes > 0) {
                this.mAudioTrack.flush();
            }
        }
        try {
            int write = this.mAudioTrack.write(bArr, i, i2);
            if (write < 0) {
                return write;
            }
            this.mWrittenPcmBytes += (long) write;
            if (needsReset()) {
                i4 = reset();
            }
            if (i4 == 0) {
                return write;
            }
            return i4;
        } catch (Exception unused) {
            return -1;
        }
    }

    public void setSampleInfo(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mSampleRate = i2;
        this.mChannels = i3;
        this.mBlockSize = i4;
        this.mSampleBytes = i6;
        this.mSampleFormat = i;
        this.mFrameSamples = i5;
    }
}
