package com.p280ss.ttm.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.p280ss.ttm.player.MediaPlayer.OnScreenshotListener;
import java.io.File;

/* renamed from: com.ss.ttm.player.TTPlayer */
public class TTPlayer {
    private static boolean IsErrored = false;
    private static final String TAG = "TTPlayer";
    private static String mAppPath;
    private static String mCachePath;
    private static String mCrashPath;
    public static String mErrorInfo;
    private static boolean mIsIPCPlayer;
    private static int mSupportSampleRateNB;
    private static int[] mSupportSampleRates;
    private Context mContext;
    private long mHandle;
    private long mId;
    private long mMediaDataSource;
    private IPlayerNotifyer mNotifyer;
    private long mNotifyerState = 2147483647L;
    private OnScreenshotListener mScreenshotListener;
    private int mTracker;

    /* renamed from: com.ss.ttm.player.TTPlayer$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.load(str);
            C7110b.m22204a(uptimeMillis, str);
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    private static final native void _close(long j);

    private final native long _create(Context context, int i, String str);

    private static final native String _getAppPath();

    private static final native int _getCurrentPosition(long j);

    private static final native double _getDoubleValue(long j, int i, double d);

    private static final native int _getDuration(long j);

    private static final native float _getFloatValue(long j, int i, float f);

    private static final native int _getIntValue(long j, int i, int i2);

    private static final native long _getLongValue(long j, int i, long j2);

    private static final native String _getStringValue(long j, int i);

    private static final native int _getVideoHeight(long j);

    private static final native int _getVideoWidth(long j);

    private static final native int _isLooping(long j);

    private static final native int _isPlaying(long j);

    private static final native void _mouseEvent(long j, int i, int i2, int i3);

    private static final native int _pause(long j);

    private static final native int _prepare(long j);

    private static final native void _prevClose(long j);

    private static final native void _registerPlayerInfo();

    private static final native void _release(long j);

    private static final native int _reset(long j);

    private static final native void _rotateCamera(long j, float f, float f2);

    private static final native int _seek(long j, int i);

    private static final native void _setCacheFile(long j, String str, int i);

    private static final native void _setDataSource(long j, IMediaDataSource iMediaDataSource);

    private static final native void _setDataSource(long j, String str);

    private static final native void _setDataSourceFd(long j, int i);

    private static final native int _setDoubleValue(long j, int i, double d);

    private static final native int _setFloatValue(long j, int i, float f);

    private static final native int _setIntValue(long j, int i, int i2);

    private static final native int _setLongValue(long j, int i, long j2);

    private static final native void _setLooping(long j, int i);

    private static final native int _setStringValue(long j, int i, String str);

    private static final native void _setSupportFormatNB(int i);

    private static final native void _setSupprotSampleRates(int[] iArr, int i);

    private static final native int _setSurfaceValue(long j, long j2);

    private static final native int _setVideoSurface(long j, Surface surface);

    private static final native void _setVolume(long j, float f, float f2);

    private static final native int _start(long j);

    private static final native void _stop(long j);

    private static final native void _switchStream(long j, int i, int i2);

    private static final native void _takeScreenshot(long j);

    public static final String getAppPath() {
        return mAppPath;
    }

    public static final String getCachePath() {
        return mCachePath;
    }

    public static final String getCrashPath() {
        return mCrashPath;
    }

    public static boolean isError() {
        return IsErrored;
    }

    public static boolean isIPPlayer() {
        return mIsIPCPlayer;
    }

    public static void registerPlayerInfo() {
        _registerPlayerInfo();
    }

    public Context getContext() {
        return this.mContext;
    }

    public final long getHandle() {
        return this.mHandle;
    }

    public long getNativePlayer() {
        return this.mHandle;
    }

    public void takeScreenshot() {
        _takeScreenshot(this.mHandle);
    }

    static {
        synchronized (TTPlayer.class) {
            loadLibrary();
        }
    }

    public int close() {
        if (this.mHandle == 0) {
            return -1;
        }
        _close(this.mHandle);
        return 0;
    }

    /* access modifiers changed from: protected */
    public int pause() {
        if (this.mHandle == 0) {
            return -1;
        }
        return _pause(this.mHandle);
    }

    /* access modifiers changed from: protected */
    public int prepare() {
        if (this.mHandle == 0) {
            return -1;
        }
        return _prepare(this.mHandle);
    }

    public int prevClose() {
        if (this.mHandle == 0) {
            return -1;
        }
        _setVideoSurface(this.mHandle, null);
        return 0;
    }

    /* access modifiers changed from: protected */
    public void release() {
        if (this.mHandle != 0) {
            _release(this.mHandle);
            this.mHandle = 0;
        }
        this.mNotifyer = null;
        this.mScreenshotListener = null;
    }

    /* access modifiers changed from: protected */
    public int reset() {
        if (this.mHandle == 0) {
            return -1;
        }
        return _reset(this.mHandle);
    }

    /* access modifiers changed from: protected */
    public int start() {
        if (this.mHandle == 0) {
            return -1;
        }
        return _start(this.mHandle);
    }

    /* access modifiers changed from: protected */
    public int stop() {
        if (this.mHandle == 0) {
            return -1;
        }
        _stop(this.mHandle);
        return 0;
    }

    private static final void loadLibrary() {
        try {
            if (TTPlayerConfiger.getValue(3, false)) {
                loadPlayerlibrary("c++_shared");
                loadPlayerlibrary("audioeffect");
                loadPlayerlibrary("yuv");
                loadPlayerlibrary("ttopenssl");
                loadPlayerlibrary("ttffmpeg");
                loadPlayerlibrary("ttmplayer");
            } else {
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("c++_shared");
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("audioeffect");
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("yuv");
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("ttopenssl");
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("ttffmpeg");
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("ttmplayer");
            }
            if (mSupportSampleRateNB == 0) {
                int[] iArr = new int[AudioFormats.getDefaultSampleRatesNB()];
                mSupportSampleRates = iArr;
                mSupportSampleRateNB = AudioFormats.getMaxSupportedSampleRates(iArr);
                _setSupprotSampleRates(mSupportSampleRates, mSupportSampleRateNB);
            }
        } catch (Throwable th) {
            IsErrored = true;
            StringBuilder sb = new StringBuilder("load default library error.");
            sb.append(th.toString());
            mErrorInfo = sb.toString();
        }
    }

    public static final void setCachePath(String str) {
        mCachePath = str;
    }

    public static final void setCrashPath(String str) {
        mCrashPath = str;
    }

    public static void setIsIPPlayer(boolean z) {
        mIsIPCPlayer = z;
    }

    public static final void setTempFileDir(String str) {
        mAppPath = str;
    }

    public void setNotifyer(IPlayerNotifyer iPlayerNotifyer) {
        this.mNotifyer = iPlayerNotifyer;
    }

    public void setOnScreenshotListener(OnScreenshotListener onScreenshotListener) {
        this.mScreenshotListener = onScreenshotListener;
    }

    public String getStringOption(int i) {
        return _getStringValue(this.mHandle, i);
    }

    public void seekTo(int i) {
        _seek(this.mHandle, i);
    }

    public void setLooping(int i) {
        _setLooping(this.mHandle, i);
    }

    public int setSurfaceValue(long j) {
        return _setSurfaceValue(this.mHandle, j);
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, SecurityException, IllegalStateException {
        if (this.mHandle != 0) {
            _setDataSource(this.mHandle, iMediaDataSource);
        }
    }

    public void setDataSourceFd(int i) {
        if (this.mHandle != 0) {
            _setDataSourceFd(this.mHandle, i);
        }
    }

    public void setNotifyerState(long j) {
        this.mNotifyerState = j;
        _setIntValue(this.mHandle, 16, (int) j);
    }

    public final void takeScreenshotComplete(Bitmap bitmap) {
        if (this.mScreenshotListener != null) {
            this.mScreenshotListener.onTakeScreenShotCompletion(bitmap);
        }
    }

    public void setDataSource(String str) {
        if (this.mHandle != 0) {
            _setDataSource(this.mHandle, str);
        }
    }

    /* access modifiers changed from: protected */
    public int setVideoSurface(Surface surface) {
        if (this.mHandle != 0) {
            return _setVideoSurface(this.mHandle, surface);
        }
        return -1;
    }

    private void create(long j) throws Exception {
        this.mNotifyer = null;
        Context context = this.mContext;
        boolean z = mIsIPCPlayer;
        this.mHandle = _create(context, z ? 1 : 0, mAppPath);
        this.mId = j;
        if (this.mHandle == 0) {
            throw new Exception("create native player is fail.");
        }
    }

    private static void loadPlayerlibrary(String str) {
        String str2;
        StringBuilder sb = new StringBuilder("lib");
        sb.append(str);
        sb.append(".so");
        try {
            TTPlayerConfiger.setLibraryName(sb.toString());
            TTPlayerConfiger.checkDebugTTPlayerLib();
            str2 = TTPlayerConfiger.getPlayerLibraryPath();
            if (str2 != null && !new File(str2).exists()) {
                str2 = null;
            }
            if (str2 != null) {
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(str2);
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("load path library error.");
            sb2.append(th.toString());
            mErrorInfo = sb2.toString();
            str2 = null;
        }
        if (str2 == null) {
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(str);
            mErrorInfo = null;
        }
    }

    public double getDoubleOption(int i, double d) {
        return _getDoubleValue(this.mHandle, i, d);
    }

    public float getFloatOption(int i, float f) {
        return _getFloatValue(this.mHandle, i, f);
    }

    public void rotateCamera(float f, float f2) {
        _rotateCamera(this.mHandle, f, f2);
    }

    public void setCacheFile(String str, int i) {
        _setCacheFile(this.mHandle, str, i);
    }

    public int setDoubleOption(int i, double d) {
        return _setDoubleValue(this.mHandle, i, d);
    }

    public int setFloatOption(int i, float f) {
        return _setFloatValue(this.mHandle, i, f);
    }

    public int setLongOption(int i, long j) {
        return _setLongValue(this.mHandle, i, j);
    }

    public int setStringOption(int i, String str) {
        return _setStringValue(this.mHandle, i, str);
    }

    public void setVolume(float f, float f2) {
        _setVolume(this.mHandle, f, f2);
    }

    public void switchStream(int i, int i2) {
        _switchStream(this.mHandle, i, i2);
    }

    public TTPlayer(Context context, long j) throws Exception {
        this.mContext = context;
        create(j);
    }

    public long getLongOption(int i, long j) {
        if (i == 50) {
            return this.mHandle;
        }
        return _getLongValue(this.mHandle, i, j);
    }

    public int getIntOption(int i, int i2) {
        if (i == 11) {
            return _getIntValue(this.mHandle, i, i2);
        }
        if (i == 51) {
            return this.mTracker;
        }
        switch (i) {
            case 1:
                return _getDuration(this.mHandle);
            case 2:
                return _getCurrentPosition(this.mHandle);
            case 3:
                return _getVideoWidth(this.mHandle);
            case 4:
                return _getVideoHeight(this.mHandle);
            case 5:
                return _isLooping(this.mHandle);
            case 6:
                return _isPlaying(this.mHandle);
            default:
                return _getIntValue(this.mHandle, i, i2);
        }
    }

    public int setIntOption(int i, int i2) throws RemoteException {
        if (i == 22 && i2 != 0 && i2 != 2 && i2 == 1) {
            Process.killProcess(Process.myPid());
            System.exit(0);
            String str = null;
            if (str.endsWith("java")) {
                throw new RemoteException("simple crash occur");
            }
        }
        if (i != 111) {
            return _setIntValue(this.mHandle, i, i2);
        }
        int length = TTPlayerKeys.SupportSampleRates.length;
        int[] iArr = new int[TTPlayerKeys.SupportSampleRates.length];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (((1 << i4) & i2) == 0) {
                iArr[i3] = TTPlayerKeys.SupportSampleRates[i4];
                i3++;
            }
        }
        _setSupprotSampleRates(iArr, i3);
        return 0;
    }

    public void mouseEvent(int i, int i2, int i3) {
        _mouseEvent(this.mHandle, i, i2, i3);
    }

    public final void onLogInfo(int i, int i2, String str) {
        if (this.mNotifyer != null) {
            try {
                this.mNotifyer.handleErrorNotify(this.mId, i, i2, str);
            } catch (Throwable unused) {
            }
        }
    }

    public void onNotify(int i, int i2, int i3, String str) {
        if (((this.mNotifyerState >> i2) & 1) == 1) {
            try {
                if (this.mNotifyer != null) {
                    this.mNotifyer.handlePlayerNotify(this.mId, i, i2, i3, str);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
