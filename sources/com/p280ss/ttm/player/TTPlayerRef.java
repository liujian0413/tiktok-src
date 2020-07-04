package com.p280ss.ttm.player;

import android.content.Context;
import android.os.RemoteException;
import android.view.Surface;
import com.p280ss.ttm.player.MediaPlayer.OnScreenshotListener;

/* renamed from: com.ss.ttm.player.TTPlayerRef */
public class TTPlayerRef extends ITTPlayerRef implements IPlayerNotifyer {
    private static final String TAG = "TTPlayerRef";
    private static String mAppPath;
    private TTPlayerClient mClient;
    private Context mContext;
    private long mId = System.currentTimeMillis();
    private TTPlayer mPlayer;

    public Context getContext() {
        return this.mContext;
    }

    public int getType() {
        return 1;
    }

    public void close() {
        this.mPlayer.close();
    }

    public long getNativeObject() {
        return this.mPlayer.getNativePlayer();
    }

    /* access modifiers changed from: protected */
    public boolean isValid() {
        if (this.mPlayer == null) {
            return false;
        }
        return true;
    }

    public void pause() {
        this.mPlayer.pause();
    }

    public void prepare() {
        this.mPlayer.prepare();
    }

    public void prevClose() {
        this.mPlayer.prevClose();
    }

    public void reset() {
        this.mPlayer.reset();
    }

    public void start() {
        this.mPlayer.start();
    }

    public void stop() {
        this.mPlayer.stop();
    }

    public void takeScreenshot() {
        this.mPlayer.takeScreenshot();
    }

    /* access modifiers changed from: protected */
    public int getLifeId() {
        return this.mPlayer.getIntOption(35, -1);
    }

    public void release() {
        TTPlayer tTPlayer = this.mPlayer;
        this.mPlayer = null;
        tTPlayer.release();
    }

    public String getStringOption(int i) {
        return this.mPlayer.getStringOption(i);
    }

    public void seekTo(int i) {
        this.mPlayer.seekTo(i);
    }

    /* access modifiers changed from: protected */
    public void setDataSource(IMediaDataSource iMediaDataSource) {
        this.mPlayer.setDataSource(iMediaDataSource);
    }

    /* access modifiers changed from: protected */
    public void setDataSourceFd(int i) {
        this.mPlayer.setDataSourceFd(i);
    }

    public void setLooping(int i) {
        this.mPlayer.setLooping(i);
    }

    public void setNotifyState(long j) {
        this.mPlayer.setNotifyerState(j);
    }

    /* access modifiers changed from: protected */
    public void setOnScreenshotListener(OnScreenshotListener onScreenshotListener) {
        this.mPlayer.setOnScreenshotListener(onScreenshotListener);
    }

    public void setSurface(Surface surface) {
        this.mPlayer.setVideoSurface(surface);
    }

    public TTPlayerRef(Context context) {
        this.mContext = context;
    }

    public void setDataSource(String str) {
        this.mPlayer.setDataSource(str);
    }

    /* access modifiers changed from: protected */
    public double getDoubleOption(int i, double d) {
        return this.mPlayer.getDoubleOption(i, d);
    }

    /* access modifiers changed from: protected */
    public float getFloatOption(int i, float f) {
        return this.mPlayer.getFloatOption(i, f);
    }

    public int getIntOption(int i, int i2) {
        return this.mPlayer.getIntOption(i, i2);
    }

    public long getLongOption(int i, long j) {
        return this.mPlayer.getLongOption(i, j);
    }

    public void rotateCamera(float f, float f2) {
        this.mPlayer.rotateCamera(f, f2);
    }

    public void setCacheFile(String str, int i) {
        this.mPlayer.setCacheFile(str, i);
    }

    /* access modifiers changed from: protected */
    public int setDoubleOption(int i, double d) {
        return this.mPlayer.setDoubleOption(i, d);
    }

    /* access modifiers changed from: protected */
    public int setFloatOption(int i, float f) {
        return this.mPlayer.setFloatOption(i, f);
    }

    public int setLongOption(int i, long j) {
        return this.mPlayer.setLongOption(i, j);
    }

    public int setStringOption(int i, String str) {
        return this.mPlayer.setStringOption(i, str);
    }

    public void setVolume(float f, float f2) {
        this.mPlayer.setVolume(f, f2);
    }

    public void switchStream(int i, int i2) {
        this.mPlayer.switchStream(i, i2);
    }

    public int setIntOption(int i, int i2) {
        try {
            return this.mPlayer.setIntOption(i, i2);
        } catch (RemoteException unused) {
            return -1;
        }
    }

    public static final synchronized TTPlayerRef create(TTPlayerClient tTPlayerClient, Context context) {
        TTPlayerRef tTPlayerRef;
        StringBuffer stringBuffer;
        String str;
        synchronized (TTPlayerRef.class) {
            if (mAppPath == null) {
                mAppPath = TTPlayerConfiger.getAppFileCachePath(context);
                if (TTPlayer.getAppPath() == null) {
                    TTPlayer.setTempFileDir(mAppPath);
                }
            }
            tTPlayerRef = new TTPlayerRef(context);
            tTPlayerRef.mClient = tTPlayerClient;
            try {
                tTPlayerRef.mPlayer = new TTPlayer(context, tTPlayerRef.mId);
                tTPlayerRef.mPlayer.setNotifyer(tTPlayerRef);
            } catch (Throwable th) {
                str = th.toString();
            }
        }
        return tTPlayerRef;
        stringBuffer.append(th.toString());
        stringBuffer.append(",player:");
        stringBuffer.append(str);
        throw new RuntimeException(stringBuffer.toString());
    }

    public void mouseEvent(int i, int i2, int i3) {
        this.mPlayer.mouseEvent(i, i2, i3);
    }

    public void handleErrorNotify(long j, int i, int i2, String str) {
        this.mClient.onPlayLogInfo(i, i2, str);
    }

    public void handlePlayerNotify(long j, int i, int i2, int i3, String str) {
        this.mClient.onPlayerNotify(i, i2, i3, str);
    }
}
