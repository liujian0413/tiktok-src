package com.p280ss.ttm.player;

import android.content.Context;
import android.view.Surface;
import com.p280ss.ttm.player.MediaPlayer.OnScreenshotListener;
import java.util.HashMap;

/* renamed from: com.ss.ttm.player.TTPlayerIPCRef */
public class TTPlayerIPCRef extends ITTPlayerRef {
    private TTPlayerClient mClient;
    private volatile long mPlayerId = System.currentTimeMillis();
    private TTPlayerConnection mPlayerRef;
    private Surface mSurface;

    public long getId() {
        return this.mPlayerId;
    }

    public int getType() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public void setDataSource(IMediaDataSource iMediaDataSource) {
    }

    /* access modifiers changed from: protected */
    public void setDataSourceFd(int i) {
    }

    /* access modifiers changed from: protected */
    public void setOnScreenshotListener(OnScreenshotListener onScreenshotListener) {
    }

    public void takeScreenshot() {
    }

    public Context getContext() {
        return TTPlayerFactory.getContext();
    }

    /* access modifiers changed from: protected */
    public void invalid() {
        this.mPlayerId = 0;
    }

    public void pause() {
        this.mPlayerRef.pause(this.mPlayerId);
    }

    public void prepare() {
        this.mPlayerRef.prepare(this.mPlayerId);
    }

    public void reset() {
        this.mPlayerRef.reset(this.mPlayerId);
    }

    public void start() {
        this.mPlayerRef.start(this.mPlayerId);
    }

    public void stop() {
        this.mPlayerRef.stop(this.mPlayerId);
    }

    /* access modifiers changed from: protected */
    public int getLifeId() {
        return this.mPlayerRef.getIntOption(this.mPlayerId, 35, -1);
    }

    /* access modifiers changed from: protected */
    public boolean isValid() {
        if (this.mPlayerId == 0) {
            return false;
        }
        return true;
    }

    public void prevClose() {
        this.mPlayerRef.prevClose(this.mPlayerId);
        this.mSurface = null;
    }

    public void close() {
        try {
            this.mPlayerRef.close(this.mPlayerId);
        } catch (Exception unused) {
            TTPlayerConfiger.setValue(7, true);
        }
        this.mSurface = null;
    }

    public void release() {
        long j = this.mPlayerId;
        this.mPlayerId = 0;
        try {
            this.mPlayerRef.release(j);
        } catch (Exception unused) {
            TTPlayerConfiger.setValue(7, true);
        }
        TTPlayerFactory.release(this, j);
        this.mSurface = null;
    }

    public void onCrashedInfo(String str) {
        this.mClient.onCrashedInfo(str);
    }

    public void seekTo(int i) {
        this.mPlayerRef.seekTo(this.mPlayerId, i);
    }

    public void setDataSource(String str) {
        this.mPlayerRef.setDataSource(this.mPlayerId, str);
    }

    public void setLooping(int i) {
        this.mPlayerRef.setLooping(this.mPlayerId, i);
    }

    public void setNotifyState(long j) {
        this.mPlayerRef.setNotifyState(this.mPlayerId, j);
    }

    public String getStringOption(int i) {
        return this.mPlayerRef.getStringOption(this.mPlayerId, i);
    }

    public void setSurface(Surface surface) {
        if (surface == null || this.mSurface != surface) {
            this.mPlayerRef.setVideoSurface(this.mPlayerId, surface);
            this.mSurface = surface;
        }
    }

    public void rotateCamera(float f, float f2) {
        this.mPlayerRef.rotateCamera(this.mPlayerId, f, f2);
    }

    public void setCacheFile(String str, int i) {
        this.mPlayerRef.setCacheFile(this.mPlayerId, str, i);
    }

    public void setVolume(float f, float f2) {
        this.mPlayerRef.setVolume(this.mPlayerId, f, f2);
    }

    public void switchStream(int i, int i2) {
        this.mPlayerRef.switchStream(this.mPlayerId, i, i2);
    }

    /* access modifiers changed from: protected */
    public double getDoubleOption(int i, double d) {
        return this.mPlayerRef.getDoubleOption(this.mPlayerId, i, d);
    }

    /* access modifiers changed from: protected */
    public float getFloatOption(int i, float f) {
        return this.mPlayerRef.getFloatOption(this.mPlayerId, i, f);
    }

    public int getIntOption(int i, int i2) {
        return this.mPlayerRef.getIntOption(this.mPlayerId, i, i2);
    }

    public long getLongOption(int i, long j) {
        return this.mPlayerRef.getLongOption(this.mPlayerId, i, j);
    }

    /* access modifiers changed from: protected */
    public int setDoubleOption(int i, double d) {
        return this.mPlayerRef.setDoubleOption(this.mPlayerId, i, d);
    }

    /* access modifiers changed from: protected */
    public int setFloatOption(int i, float f) {
        return this.mPlayerRef.setFloatOption(this.mPlayerId, i, f);
    }

    public int setIntOption(int i, int i2) {
        return this.mPlayerRef.setIntOption(this.mPlayerId, i, i2);
    }

    public int setLongOption(int i, long j) {
        return this.mPlayerRef.setLongOption(this.mPlayerId, i, j);
    }

    public int setStringOption(int i, String str) {
        return this.mPlayerRef.setStringOption(this.mPlayerId, i, str);
    }

    public TTPlayerIPCRef(TTPlayerConnection tTPlayerConnection, Context context) {
        this.mPlayerRef = tTPlayerConnection;
        this.mPlayerId = tTPlayerConnection.create(this.mPlayerId);
    }

    public void onPlayerLogInfo(int i, int i2, String str) {
        this.mClient.onPlayLogInfo(i, i2, str);
    }

    public static TTPlayerIPCRef create(TTPlayerClient tTPlayerClient, Context context, HashMap<Integer, Integer> hashMap) {
        TTPlayerIPCRef create = TTPlayerFactory.create(context, hashMap);
        if (create == null) {
            return null;
        }
        create.mClient = tTPlayerClient;
        return create;
    }

    public void mouseEvent(int i, int i2, int i3) {
        this.mPlayerRef.mouseEvent(this.mPlayerId, i, i2, i3);
    }

    public void handleNotify(int i, int i2, int i3, String str) {
        this.mClient.onPlayerNotify(i, i2, i3, str);
    }
}
