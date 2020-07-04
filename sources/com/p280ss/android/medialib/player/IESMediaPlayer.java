package com.p280ss.android.medialib.player;

import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import com.p280ss.android.medialib.model.Point;
import com.p280ss.android.medialib.p883d.C19718d;
import com.p280ss.android.medialib.player.C19759a.C19760a;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.medialib.player.IESMediaPlayer */
public class IESMediaPlayer {
    private Context context;
    private long mHandle = nativeCreatePlayer();
    private C19760a mInfoListener;

    private native long nativeCreatePlayer();

    private native long nativeCurrentPosition(long j);

    private native int nativeDeleteSeg(long j, int i);

    private native int nativeFillBackgroundColor(long j, int i);

    private native long nativeGetDuration(long j);

    private native long[] nativeGetDurations(long j);

    private native boolean nativeIsMultiSpeedSupported(long j, int i);

    private native boolean nativeIsPlaying(long j);

    private native boolean nativeIsSeeking(long j);

    private native int nativePause(long j);

    private native int nativePrepare(long j, String[] strArr, int i, int i2);

    private static native int nativeRegister();

    private native void nativeRelease(long j);

    private native int nativeResume(long j);

    private native int nativeSeek(long j, long j2, int i);

    private native int nativeSelect(long j, int i);

    private native void nativeSetBoundary(long j, int i, long j2, long j3);

    private native void nativeSetLoop(long j, boolean z);

    private native int nativeSetSegPoints(long j, int i, long[] jArr);

    private native int nativeSetSegRotation(long j, int i, int i2);

    private native void nativeSetSpeed(long j, int i, double d);

    private native void nativeSetVolume(long j, double d);

    private native int nativeStart(long j, Surface surface);

    private native void nativeStop(long j);

    public void onInfo(int i, int i2) {
    }

    static {
        TENativeLibsLoader.m67988e();
        nativeRegister();
    }

    public long getCurrentPosition() {
        if (this.mHandle == 0) {
            return 0;
        }
        return nativeCurrentPosition(this.mHandle);
    }

    public long getDuration() {
        if (this.mHandle == 0) {
            return 0;
        }
        return nativeGetDuration(this.mHandle);
    }

    public void stop() {
        if (this.mHandle != 0) {
            nativeStop(this.mHandle);
        }
    }

    public boolean isPlaying() {
        if (this.mHandle == 0) {
            return false;
        }
        return nativeIsPlaying(this.mHandle);
    }

    public boolean isSeeking() {
        if (this.mHandle == 0) {
            return false;
        }
        return nativeIsSeeking(this.mHandle);
    }

    public int pause() {
        if (this.mHandle == 0) {
            return -1;
        }
        return nativePause(this.mHandle);
    }

    public void release() {
        if (this.mHandle != 0) {
            nativeRelease(this.mHandle);
            this.mHandle = 0;
        }
    }

    public int resume() {
        if (this.mHandle == 0) {
            return -1;
        }
        return nativeResume(this.mHandle);
    }

    public int unSelect() {
        if (this.mHandle == 0) {
            return -1;
        }
        return nativeSelect(this.mHandle, -1);
    }

    public List<Long> getDurations() {
        ArrayList arrayList = new ArrayList();
        if (this.mHandle == 0) {
            return arrayList;
        }
        long[] nativeGetDurations = nativeGetDurations(this.mHandle);
        if (nativeGetDurations != null) {
            for (long valueOf : nativeGetDurations) {
                arrayList.add(Long.valueOf(valueOf));
            }
        }
        return arrayList;
    }

    public void setMessageListener(C19760a aVar) {
        this.mInfoListener = aVar;
    }

    public int seek(long j) {
        return seek(j, 0);
    }

    public int seekLeft(long j) {
        return seek(j, -1);
    }

    public int seekRight(long j) {
        return seek(j, 1);
    }

    public void setSpeed(double d) {
        setSegSpeed(-1, d);
    }

    public IESMediaPlayer(Context context2) {
        this.context = context2;
    }

    public int prepare(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return prepare((List<String>) arrayList);
    }

    public void setLoop(boolean z) {
        if (this.mHandle != 0) {
            nativeSetLoop(this.mHandle, z);
        }
    }

    public void setVolume(double d) {
        if (this.mHandle != 0) {
            nativeSetVolume(this.mHandle, d);
        }
    }

    public int deleteSeg(int i) {
        if (this.mHandle == 0) {
            return -1;
        }
        if (i < 0) {
            return -2;
        }
        return nativeDeleteSeg(this.mHandle, i);
    }

    public int fillBackgroundColor(int i) {
        if (this.mHandle == 0) {
            return -1;
        }
        return nativeFillBackgroundColor(this.mHandle, i);
    }

    public boolean isSegMultiSpeedSupported(int i) {
        if (this.mHandle == 0) {
            return false;
        }
        return nativeIsMultiSpeedSupported(this.mHandle, i);
    }

    public int select(int i) {
        if (this.mHandle == 0) {
            return -1;
        }
        if (i < 0) {
            return -2;
        }
        return nativeSelect(this.mHandle, i);
    }

    public int start(Surface surface) {
        if (this.mHandle == 0) {
            return -1;
        }
        return nativeStart(this.mHandle, surface);
    }

    public int prepare(List<String> list) {
        int i;
        int i2;
        if (this.mHandle == 0) {
            return -1;
        }
        if (list == null || list.isEmpty()) {
            return -2;
        }
        if (this.context != null) {
            Pair a = C19718d.m65016a(this.context);
            int intValue = ((Integer) a.first).intValue();
            i = ((Integer) a.second).intValue();
            i2 = intValue;
        } else {
            i2 = 0;
            i = 0;
        }
        return nativePrepare(this.mHandle, (String[]) list.toArray(new String[list.size()]), i2, i);
    }

    private int seek(long j, int i) {
        if (this.mHandle == 0) {
            return -1;
        }
        return nativeSeek(this.mHandle, j, i);
    }

    public void setBoundary(long j, long j2) {
        if (this.mHandle != 0) {
            nativeSetBoundary(this.mHandle, -1, j, j2);
        }
    }

    public void setSegRotation(int i, int i2) {
        if (i >= 0 && this.mHandle != 0) {
            nativeSetSegRotation(this.mHandle, i, i2);
        }
    }

    public void setSegSpeed(int i, double d) {
        if (this.mHandle != 0) {
            nativeSetSpeed(this.mHandle, i, d);
        }
    }

    public int setSegPoints(int i, List<Point> list) {
        if (this.mHandle == 0) {
            return -1;
        }
        if (list == null || list.isEmpty()) {
            return -2;
        }
        long[] jArr = new long[list.size()];
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            Point point = (Point) list.get(i2);
            if (point == null) {
                jArr[i2] = -1;
                jArr[i2 + 1] = -1;
            } else {
                jArr[i2] = point.getLeft();
                jArr[i2 + 1] = point.getRight();
            }
        }
        return nativeSetSegPoints(this.mHandle, i, jArr);
    }

    public void setSegBoundary(int i, long j, long j2) {
        if (i >= 0 && this.mHandle != 0) {
            nativeSetBoundary(this.mHandle, i, j, j2);
        }
    }
}
