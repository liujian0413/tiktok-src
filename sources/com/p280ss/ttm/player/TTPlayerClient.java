package com.p280ss.ttm.player;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.C1642a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.ttm.net.AVResolver;
import com.p280ss.ttm.player.MediaPlayer.OnBufferingUpdateListener;
import com.p280ss.ttm.player.MediaPlayer.OnCompletionListener;
import com.p280ss.ttm.player.MediaPlayer.OnErrorListener;
import com.p280ss.ttm.player.MediaPlayer.OnExternInfoListener;
import com.p280ss.ttm.player.MediaPlayer.OnInfoListener;
import com.p280ss.ttm.player.MediaPlayer.OnLogListener;
import com.p280ss.ttm.player.MediaPlayer.OnPreparedListener;
import com.p280ss.ttm.player.MediaPlayer.OnScreenshotListener;
import com.p280ss.ttm.player.MediaPlayer.OnSeekCompleteListener;
import com.p280ss.ttm.player.MediaPlayer.OnVideoSizeChangedListener;
import com.p280ss.ttm.player.MediaPlayer.TrackInfo;
import com.p280ss.ttm.player.MediaPlayer.onSARChangedListener;
import com.p280ss.ttm.utils.AVErrorInfo;
import com.p280ss.ttm.utils.AVLogger;
import com.p280ss.ttm.utils.AVTime;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/* renamed from: com.ss.ttm.player.TTPlayerClient */
public class TTPlayerClient extends MediaPlayerClient implements Callback, ISurfaceListener {
    private static final String TAG = "TTPlayerClient";
    private String mBufferingInfo;
    private TTSurfaceCallback mCallback;
    private HashMap<Integer, Integer> mConfigParams = null;
    private Context mContext;
    private int mCrashType = -1;
    private StringBuilder mCrashedInfo = new StringBuilder(PreloadTask.BYTE_UNIT_NUMBER);
    private int mErrorCode = 0;
    private Handler mHandler;
    private final Object mHandlerLocker = new Object();
    private long mListenerState = 0;
    private LinkedList<String> mLogInfo = new LinkedList<>();
    private OnLogListener mLogListener;
    private OnBufferingUpdateListener mOnBufferingUpdateListener;
    private OnCompletionListener mOnCompletionListener;
    private OnErrorListener mOnErrorListener;
    private OnExternInfoListener mOnExternInfoListener;
    private OnInfoListener mOnInfoListener;
    private OnPreparedListener mOnPreparedListener;
    private onSARChangedListener mOnSARChangedListener;
    private OnSeekCompleteListener mOnSeekCompleteListener;
    private OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private int mPlayLifeId = -1;
    private ITTPlayerRef mPlayer;
    private final ReadLock mReadLock = this.mReadWritedLock.readLock();
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private volatile boolean mRealsedSurface = false;
    private final ReentrantLock mReentrantLock = new ReentrantLock();
    private boolean mScreenOnWhilePlaying;
    private boolean mSeekComplete = true;
    private boolean mStayAwake;
    private Surface mSurface;
    private SurfaceHolder mSurfaceHolder;
    private String mUri;
    private String mVoiceInfo;
    private WakeLock mWakeLock;
    private MediaPlayer mWrapper;
    private final WriteLock mWriteLock = this.mReadWritedLock.writeLock();

    static {
        TTVersion.saveVersionInfo();
    }

    public String getDataSource() {
        return this.mUri;
    }

    public int getSelectedTrack(int i) {
        if (i == 2) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        return i == 4 ? 2 : -1;
    }

    public void prepare() {
        prepareAsync();
    }

    private boolean isValid() {
        if (this.mPlayer == null || !this.mPlayer.isValid()) {
            return false;
        }
        return true;
    }

    public void close() {
        this.mRealsedSurface = true;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.close();
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int getCurrentPosition() {
        this.mReadLock.lock();
        try {
            int i = 0;
            if (isValid()) {
                i = this.mPlayer.getIntOption(2, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int getDuration() {
        this.mReadLock.lock();
        try {
            int i = 0;
            if (isValid()) {
                i = this.mPlayer.getIntOption(1, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int getType() {
        int i;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i = this.mPlayer.getType();
            } else {
                i = 0;
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int getVideoHeight() {
        this.mReadLock.lock();
        try {
            int i = 0;
            if (isValid()) {
                i = this.mPlayer.getIntOption(4, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int getVideoWidth() {
        this.mReadLock.lock();
        try {
            int i = 0;
            if (isValid()) {
                i = this.mPlayer.getIntOption(3, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void updateSurfaceScreenOn() {
        boolean z;
        if (this.mSurfaceHolder != null) {
            SurfaceHolder surfaceHolder = this.mSurfaceHolder;
            if (!this.mScreenOnWhilePlaying || !this.mStayAwake) {
                z = false;
            } else {
                z = true;
            }
            surfaceHolder.setKeepScreenOn(z);
        }
    }

    public TrackInfo[] getTrackInfo() {
        return new TrackInfo[]{new TrackInfo(0, new MediaFormat()), new TrackInfo(1, new MediaFormat()), new TrackInfo(2, new MediaFormat())};
    }

    public int getVideoType() {
        this.mReadLock.lock();
        try {
            int i = 0;
            if (isValid()) {
                i = this.mPlayer.getIntOption(11, 0);
            }
            return i;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public boolean isLooping() {
        this.mReadLock.lock();
        try {
            boolean z = false;
            if (isValid() && this.mPlayer.getIntOption(5, 0) == 1) {
                z = true;
            }
            return z;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public boolean isMute() {
        this.mReadLock.lock();
        try {
            boolean z = false;
            if (isValid() && this.mPlayer.getIntOption(12, 0) == 1) {
                z = true;
            }
            return z;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public boolean isPlaying() {
        this.mReadLock.lock();
        try {
            boolean z = false;
            if (isValid() && this.mPlayer.getIntOption(6, 0) == 1) {
                z = true;
            }
            return z;
        } finally {
            this.mReadLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public void pause() {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.pause();
            }
            this.mReadLock.unlock();
            stayAwake(false);
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void prepareAsync() {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mErrorCode = 0;
                this.mLogInfo.clear();
                if (this.mRealsedSurface) {
                    this.mPlayer.setSurface(this.mSurfaceHolder.getSurface());
                    this.mRealsedSurface = false;
                }
                this.mPlayer.prepare();
                updateLifeId();
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public void prevClose() {
        this.mRealsedSurface = true;
        if (this.mSurfaceHolder != null) {
            this.mSurfaceHolder.removeCallback(this.mCallback);
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.prevClose();
            }
            this.mReadLock.unlock();
            this.mSurface = null;
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void releaseAsync() {
        this.mRealsedSurface = true;
        if (this.mSurfaceHolder != null) {
            this.mSurfaceHolder.removeCallback(this.mCallback);
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.prevClose();
            }
            this.mReadLock.unlock();
            this.mSurface = null;
            new Thread(new Runnable() {
                public void run() {
                    TTPlayerClient.this.release();
                }
            }).start();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void reset() {
        this.mWriteLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.reset();
                if (this.mSurfaceHolder != null) {
                    this.mPlayer.setSurface(this.mSurfaceHolder.getSurface());
                }
                this.mHandler.removeCallbacksAndMessages(null);
                this.mErrorCode = 0;
                this.mLogInfo.clear();
                updateLifeId();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public void start() {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mErrorCode = 0;
                this.mPlayer.start();
                updateLifeId();
            }
            this.mReadLock.unlock();
            stayAwake(true);
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void stop() {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.stop();
            }
            this.mReadLock.unlock();
            stayAwake(false);
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void updateLifeId() {
        try {
            this.mReentrantLock.lock();
            this.mPlayLifeId = this.mPlayer.getLifeId();
        } finally {
            if (this.mReentrantLock.isLocked()) {
                this.mReentrantLock.unlock();
            }
        }
    }

    private String getPlayerErrorInfo() {
        try {
            StringBuilder sb = new StringBuilder();
            if (!((this.mLogInfo == null || this.mLogInfo.size() <= 0) && this.mBufferingInfo == null && this.mVoiceInfo == null)) {
                AVErrorInfo.setupErrorInfo(this.mContext, sb, "error", "play error", this.mUri);
                Iterator it = this.mLogInfo.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    sb.append("\n");
                }
                if (this.mBufferingInfo != null) {
                    sb.append(this.mBufferingInfo);
                    sb.append("\n");
                    this.mBufferingInfo = null;
                }
                if (this.mVoiceInfo != null) {
                    sb.append(this.mVoiceInfo);
                    sb.append("\n");
                    this.mVoiceInfo = null;
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void release() {
        stayAwake(false);
        updateSurfaceScreenOn();
        this.mWriteLock.lock();
        try {
            ITTPlayerRef iTTPlayerRef = this.mPlayer;
            this.mPlayer = null;
            this.mPlayLifeId = -1;
            if (iTTPlayerRef != null) {
                iTTPlayerRef.release();
            }
            this.mWriteLock.unlock();
            if (this.mSurfaceHolder != null) {
                this.mSurfaceHolder.removeCallback(this.mCallback);
                this.mSurfaceHolder = null;
                this.mRealsedSurface = true;
            }
            this.mSurface = null;
            synchronized (this.mHandlerLocker) {
                if (this.mHandler != null) {
                    this.mHandler.removeCallbacksAndMessages(null);
                    this.mHandler = null;
                }
            }
            if (this.mLogListener != null) {
                String playerErrorInfo = getPlayerErrorInfo();
                if (playerErrorInfo != null && playerErrorInfo.length() > 0) {
                    this.mLogListener.onLogInfo(this.mWrapper, playerErrorInfo);
                }
            }
            this.mContext = null;
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
    }

    private String getPlayerCrashedInfo() {
        Context context;
        int value = TTPlayerConfiger.getValue(18, 1);
        StringBuilder sb = new StringBuilder();
        if (this.mPlayer == null) {
            context = this.mContext;
        } else {
            context = this.mPlayer.getContext();
        }
        if (context == null) {
            return "context is null";
        }
        if (value > 1) {
            String existsCrashFilePath = TTCrashUtil.existsCrashFilePath(context);
            if (existsCrashFilePath != null) {
                String crashFileContext = TTCrashUtil.getCrashFileContext(context, existsCrashFilePath, sb);
                if (crashFileContext != null) {
                    TTCrashUtil.deleteCrashFile(this.mContext, existsCrashFilePath);
                    this.mCrashType = 1;
                    TTPlayerConfiger.getValue(5, false);
                    return crashFileContext;
                }
            }
            AVErrorInfo.setupPhoneInfo(context, sb);
        }
        String value2 = TTPlayerConfiger.getValue(19, (String) null);
        if (value2 != null) {
            String crashFileContext2 = TTCrashUtil.getCrashFileContext(this.mContext, value2, sb);
            if (crashFileContext2 != null) {
                TTCrashUtil.deleteCrashFile(this.mContext, value2);
                this.mCrashType = 1;
                TTPlayerConfiger.getValue(5, false);
                return crashFileContext2;
            }
        }
        StringBuilder sb2 = new StringBuilder("\ncreate time:");
        sb2.append(AVTime.getFormatNow());
        sb.append(sb2.toString());
        sb.append("\nport version:");
        sb.append(value);
        sb.append("\nstart service info:");
        sb.append(TTPlayerConfiger.getValue(16, "not find service start info"));
        sb.append("\nstop service info:");
        sb.append(TTPlayerConfiger.getValue(12, "not find service stop info"));
        sb.append("\ncrash:");
        sb.append(TTPlayerConfiger.getValue(7, false));
        sb.append("\nsdk info:");
        sb.append(TTPlayerConfiger.getValue(15, "not find sdk info"));
        sb.append("\ntimeout count:");
        sb.append(TTPlayerConfiger.getValue(10, -1));
        sb.append("\nforeground:");
        sb.append(TTPlayerConfiger.getValue(21, -1));
        sb.append("\non screen:");
        sb.append(TTPlayerConfiger.getValue(22, -1));
        sb.append("\n battery info:");
        sb.append(TTPlayerConfiger.getValue(23, "not find"));
        sb.append("\nurl:");
        sb.append(this.mUri);
        sb.append("\ncrash:\r\n");
        sb.append(this.mCrashedInfo);
        this.mCrashType = 0;
        if (value <= 1) {
            return sb.toString();
        }
        TTPlayerConfiger.getValue(5, false);
        return TTCrashUtil.getBase64SampleCrash(sb.toString());
    }

    public void setOnLogListener(OnLogListener onLogListener) {
        this.mLogListener = onLogListener;
    }

    public void onSurfaceChanged(SurfaceHolder surfaceHolder) {
        AVLogger.m144197k(TAG, "surface is change");
    }

    public void deselectTrack(int i) {
        if (this.mPlayer != null) {
            this.mPlayer.setIntOption(65, (i << 8) | 0);
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (this.mScreenOnWhilePlaying != z) {
            this.mScreenOnWhilePlaying = z;
            updateSurfaceScreenOn();
        }
    }

    private void sendSeekCompleted(int i) {
        if (!this.mSeekComplete && this.mOnSeekCompleteListener != null) {
            this.mSeekComplete = true;
            if (i >= this.mPlayLifeId) {
                this.mOnSeekCompleteListener.onSeekComplete(this.mWrapper);
            }
        }
    }

    public boolean handleMessage(Message message) {
        String str;
        int i = message.arg2;
        int i2 = message.what;
        int i3 = message.arg1;
        if (message.obj instanceof String) {
            str = (String) message.obj;
        } else {
            str = null;
        }
        handleNotify(i, i2, i3, str);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCrashedInfo(String str) {
        if (this.mCrashedInfo.length() < 1024) {
            StringBuilder sb = this.mCrashedInfo;
            sb.append(str);
            sb.append("\n");
        }
    }

    public void seekTo(int i) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mSeekComplete = false;
                this.mPlayer.seekTo(i);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setIsMute(boolean z) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setIntOption(12, z ? 1 : 0);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setLooping(boolean z) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setLooping(z ? 1 : 0);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setPanoVideoControlModel(int i) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setIntOption(11, i);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setSurface(Surface surface) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mSurface = surface;
                this.mPlayer.setSurface(surface);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    private void sendCompletioned(int i) {
        try {
            this.mReentrantLock.lock();
            if (this.mOnCompletionListener != null && i >= this.mPlayLifeId) {
                this.mOnCompletionListener.onCompletion(this.mWrapper);
            }
        } finally {
            if (this.mReentrantLock.isLocked()) {
                this.mReentrantLock.unlock();
            }
        }
    }

    private void stayAwake(boolean z) {
        if (this.mWakeLock != null) {
            if (z && !this.mWakeLock.isHeld()) {
                this.mWakeLock.acquire();
            } else if (!z && this.mWakeLock.isHeld()) {
                this.mWakeLock.release();
            }
        }
        this.mStayAwake = z;
        updateSurfaceScreenOn();
    }

    public String getStringOption(int i) {
        if (i == 5001) {
            return getPlayerCrashedInfo();
        }
        String str = null;
        if (i != 5002) {
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    str = this.mPlayer.getStringOption(i);
                }
                return str;
            } finally {
                this.mReadLock.unlock();
            }
        } else if (this.mLogInfo == null || this.mLogInfo.size() == 0) {
            return null;
        } else {
            return getPlayerErrorInfo();
        }
    }

    public void onSurfaceCreated(SurfaceHolder surfaceHolder) {
        this.mSurfaceHolder = surfaceHolder;
        if (!this.mRealsedSurface) {
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    this.mPlayer.setSurface(surfaceHolder.getSurface());
                }
            } finally {
                this.mReadLock.unlock();
            }
        }
    }

    public void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (!this.mRealsedSurface) {
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    this.mPlayer.setSurface(null);
                }
            } finally {
                this.mReadLock.unlock();
            }
        }
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (iMediaDataSource != null) {
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    this.mPlayer.setDataSource(iMediaDataSource);
                }
            } finally {
                this.mReadLock.unlock();
            }
        } else {
            throw new IllegalArgumentException("null mediadatasource pointer.");
        }
    }

    /* JADX INFO: finally extract failed */
    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.mSurfaceHolder != null) {
            this.mSurfaceHolder.removeCallback(this.mCallback);
        }
        this.mSurfaceHolder = surfaceHolder;
        Surface surface = null;
        if (surfaceHolder != null) {
            this.mSurfaceHolder.addCallback(this.mCallback);
            surface = this.mSurfaceHolder.getSurface();
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setSurface(surface);
            }
            this.mReadLock.unlock();
            updateSurfaceScreenOn();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
        this.mListenerState |= 8;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
        this.mListenerState |= 8192;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
        this.mListenerState |= 1;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnExternInfoListener(OnExternInfoListener onExternInfoListener) {
        this.mOnExternInfoListener = onExternInfoListener;
        this.mListenerState |= 524288;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
        this.mListenerState |= 24119218;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
        this.mListenerState |= 4;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnSARChangedListener(onSARChangedListener onsarchangedlistener) {
        this.mOnSARChangedListener = onsarchangedlistener;
        this.mListenerState |= 8388608;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
        this.mListenerState |= 4096;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.mOnVideoSizeChangedListener = onVideoSizeChangedListener;
        this.mListenerState |= 64;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setNotifyState(this.mListenerState);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        this.mReadLock.lock();
        try {
            if (!(!isValid() || playbackParams == null || playbackParams.getSpeed() == -1.0f)) {
                this.mPlayer.setFloatOption(60, playbackParams.getSpeed());
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void takeScreenshot(OnScreenshotListener onScreenshotListener) {
        if (this.mPlayer != null && onScreenshotListener != null) {
            this.mListenerState |= 32768;
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    this.mPlayer.setNotifyState(this.mListenerState);
                    this.mPlayer.setOnScreenshotListener(onScreenshotListener);
                    this.mPlayer.takeScreenshot();
                }
            } finally {
                this.mReadLock.unlock();
            }
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor) throws IllegalStateException, IllegalArgumentException, IOException {
        if (VERSION.SDK_INT < 12) {
            try {
                Field declaredField = fileDescriptor.getClass().getDeclaredField("descriptor");
                declaredField.setAccessible(true);
                this.mPlayer.setDataSourceFd(declaredField.getInt(fileDescriptor));
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
            try {
                this.mPlayer.setDataSourceFd(dup.getFd());
            } finally {
                dup.close();
            }
        }
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (str.toLowerCase(Locale.ENGLISH).indexOf("://") <= 0) {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            this.mUri = sb.toString();
        } else {
            this.mUri = str;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setDataSource(this.mUri);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public static synchronized TTPlayerClient create(MediaPlayer mediaPlayer, Context context) {
        TTPlayerClient create;
        synchronized (TTPlayerClient.class) {
            create = create(mediaPlayer, context, null);
        }
        return create;
    }

    public float getFloatOption(int i, float f) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                f = this.mPlayer.getFloatOption(i, f);
            }
            return f;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public long getLongOption(int i, long j) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                j = this.mPlayer.getLongOption(i, j);
            }
            return j;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void rotateCamera(float f, float f2) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.rotateCamera(f, f2);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setCacheFile(String str, int i) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setCacheFile(str, i);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int setFloatOption(int i, float f) {
        int i2;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i2 = this.mPlayer.setFloatOption(i, f);
            } else {
                i2 = -1;
            }
            return i2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int setLongOption(int i, long j) {
        int i2;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i2 = this.mPlayer.setLongOption(i, j);
            } else {
                i2 = -1;
            }
            return i2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int setStringOption(int i, String str) {
        int i2;
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i2 = this.mPlayer.setStringOption(i, str);
            } else {
                i2 = -1;
            }
            return i2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setVolume(float f, float f2) {
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setVolume(f, f2);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int getIntOption(int i, int i2) {
        if (i == 5000) {
            return this.mErrorCode;
        }
        if (i == 26) {
            return this.mCrashType;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i2 = this.mPlayer.getIntOption(i, i2);
            }
            return i2;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public int setIntOption(int i, int i2) {
        int i3;
        if (i == 41) {
            AVResolver.HOST_MAX_CACHE_TIME = i2;
            return 0;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                i3 = this.mPlayer.setIntOption(i, i2);
            } else {
                i3 = -1;
            }
            return i3;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void setWakeMode(Context context, int i) {
        boolean z;
        if (this.mWakeLock != null) {
            if (this.mWakeLock.isHeld()) {
                z = true;
                this.mWakeLock.release();
            } else {
                z = false;
            }
            this.mWakeLock = null;
        } else {
            z = false;
        }
        this.mWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i | 536870912, TTPlayerClient.class.getName());
        this.mWakeLock.setReferenceCounted(false);
        if (z) {
            this.mWakeLock.acquire();
        }
    }

    public void switchStream(int i, int i2) {
        if (this.mPlayer != null) {
            this.mReadLock.lock();
            try {
                if (isValid()) {
                    this.mPlayer.switchStream(i, i2);
                }
            } finally {
                this.mReadLock.unlock();
            }
        }
    }

    private TTPlayerClient(Context context, HashMap<Integer, Integer> hashMap) {
        this.mConfigParams = hashMap;
        this.mRealsedSurface = false;
        this.mCallback = new TTSurfaceCallback(this);
        this.mContext = context;
        if (Looper.myLooper() != null) {
            this.mHandler = new Handler(this);
        } else {
            this.mHandler = new Handler(Looper.getMainLooper(), this);
        }
    }

    private void notifyInfo(int i, int i2) {
        if (this.mOnInfoListener != null) {
            int i3 = -1;
            switch (i) {
                case 4:
                    i3 = 701;
                    break;
                case 5:
                    i3 = 702;
                    break;
                default:
                    switch (i) {
                        case 7:
                            i3 = 3;
                            break;
                        case 8:
                            i3 = 801;
                            break;
                        case 9:
                            i3 = 802;
                            break;
                        case 10:
                            i3 = 901;
                            break;
                        default:
                            switch (i) {
                                case 20:
                                    i3 = 251658243;
                                    break;
                                case 21:
                                    i3 = 251658244;
                                    break;
                                case 22:
                                    i3 = 251658245;
                                    break;
                                case 23:
                                    i3 = 251658246;
                                    break;
                                case 24:
                                    i3 = 251658247;
                                    break;
                            }
                    }
            }
            this.mOnInfoListener.onInfo(this.mWrapper, i3, i2);
        }
    }

    private void sendErrorInfo(int i, int i2) {
        try {
            this.mReentrantLock.lock();
            if (this.mOnErrorListener != null && i2 >= this.mPlayLifeId) {
                if (this.mErrorCode != 0) {
                    i = this.mErrorCode;
                } else if (i == 0) {
                    i = -1048575;
                }
                this.mOnErrorListener.onError(this.mWrapper, i, 0);
            }
        } finally {
            if (this.mReentrantLock.isLocked()) {
                this.mReentrantLock.unlock();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        if (r3 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005d, code lost:
        if (r3 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005f, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        setDataSource(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDataSource(android.content.Context r3, android.net.Uri r4) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = r4.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "settings"
            java.lang.String r1 = r4.getAuthority()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002e
            int r4 = android.media.RingtoneManager.getDefaultType(r4)
            android.net.Uri r4 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r3, r4)
            if (r4 == 0) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r4 = "Failed to resolve default ringtone"
            r3.<init>(r4)
            throw r3
        L_0x002e:
            r0 = 0
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ SecurityException -> 0x005c, IOException -> 0x0058, all -> 0x0051 }
            java.lang.String r1 = "r"
            android.content.res.AssetFileDescriptor r3 = r3.openAssetFileDescriptor(r4, r1)     // Catch:{ SecurityException -> 0x005c, IOException -> 0x0058, all -> 0x0051 }
            if (r3 != 0) goto L_0x0041
            if (r3 == 0) goto L_0x0040
            r3.close()
        L_0x0040:
            return
        L_0x0041:
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ SecurityException -> 0x005d, IOException -> 0x0059, all -> 0x004e }
            r2.setDataSource(r0)     // Catch:{ SecurityException -> 0x005d, IOException -> 0x0059, all -> 0x004e }
            if (r3 == 0) goto L_0x004d
            r3.close()
        L_0x004d:
            return
        L_0x004e:
            r4 = move-exception
            r0 = r3
            goto L_0x0052
        L_0x0051:
            r4 = move-exception
        L_0x0052:
            if (r0 == 0) goto L_0x0057
            r0.close()
        L_0x0057:
            throw r4
        L_0x0058:
            r3 = r0
        L_0x0059:
            if (r3 == 0) goto L_0x0062
            goto L_0x005f
        L_0x005c:
            r3 = r0
        L_0x005d:
            if (r3 == 0) goto L_0x0062
        L_0x005f:
            r3.close()
        L_0x0062:
            java.lang.String r3 = r4.toString()
            r2.setDataSource(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.TTPlayerClient.setDataSource(android.content.Context, android.net.Uri):void");
    }

    public static synchronized TTPlayerClient create(MediaPlayer mediaPlayer, Context context, HashMap<Integer, Integer> hashMap) {
        synchronized (TTPlayerClient.class) {
            TTVersion.saveVersionInfo();
            TTPlayerClient tTPlayerClient = new TTPlayerClient(context, hashMap);
            ITTPlayerRef create = ITTPlayerRef.create(context, tTPlayerClient, hashMap);
            if (create == null) {
                return null;
            }
            tTPlayerClient.mPlayer = create;
            tTPlayerClient.mWrapper = mediaPlayer;
            return tTPlayerClient;
        }
    }

    public void mouseEvent(int i, int i2, int i3) {
        int i4;
        switch (i) {
            case 0:
                i4 = 1;
                break;
            case 1:
                i4 = 3;
                break;
            case 2:
                i4 = 2;
                break;
            default:
                i4 = 0;
                break;
        }
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.mouseEvent(i4, i2, i3);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public void onPlayLogInfo(int i, int i2, String str) {
        if (i != 2) {
            if (i == 0) {
                this.mErrorCode = i2;
            }
            if (str != null) {
                if (this.mLogInfo.size() > 40) {
                    this.mLogInfo.removeFirst();
                }
                this.mLogInfo.addLast(C1642a.m8034a("%s&&time:%d", new Object[]{str, Long.valueOf(System.currentTimeMillis())}));
            }
        } else if (i2 == 1) {
            this.mVoiceInfo = str;
        } else {
            if (i2 == 0) {
                this.mBufferingInfo = str;
            }
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (uri != null) {
            setDataSource(context, uri);
            if (map != null && map.size() != 0) {
                StringBuilder sb = new StringBuilder();
                for (String str : map.keySet()) {
                    sb.append(str);
                    sb.append(":");
                    sb.append((String) map.get(str));
                    sb.append("\r\n");
                }
                this.mReadLock.lock();
                try {
                    if (isValid()) {
                        this.mPlayer.setStringOption(20, sb.toString());
                    }
                } finally {
                    this.mReadLock.unlock();
                }
            }
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
        setDataSource(fileDescriptor);
        this.mReadLock.lock();
        try {
            if (isValid()) {
                this.mPlayer.setLongOption(135, j);
                this.mPlayer.setLongOption(136, j2);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void onPlayerNotify(int i, int i2, int i3, String str) {
        synchronized (this.mHandlerLocker) {
            if (this.mHandler != null) {
                Message obtainMessage = this.mHandler.obtainMessage(i2, i3, i);
                obtainMessage.obj = str;
                obtainMessage.sendToTarget();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        notifyInfo(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleNotify(int r5, int r6, int r7, java.lang.String r8) {
        /*
            r4 = this;
            r0 = 100
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L_0x00d0
            r3 = 20000(0x4e20, float:2.8026E-41)
            if (r6 == r3) goto L_0x0070
            r0 = 65535(0xffff, float:9.1834E-41)
            switch(r6) {
                case 2: goto L_0x0063;
                case 3: goto L_0x0057;
                case 4: goto L_0x0053;
                case 5: goto L_0x0053;
                case 6: goto L_0x0043;
                case 7: goto L_0x0053;
                case 8: goto L_0x0053;
                case 9: goto L_0x0053;
                case 10: goto L_0x0053;
                default: goto L_0x0010;
            }
        L_0x0010:
            switch(r6) {
                case 12: goto L_0x003f;
                case 13: goto L_0x0035;
                default: goto L_0x0013;
            }
        L_0x0013:
            switch(r6) {
                case 19: goto L_0x0027;
                case 20: goto L_0x0053;
                case 21: goto L_0x0053;
                case 22: goto L_0x0053;
                case 23: goto L_0x0017;
                case 24: goto L_0x0053;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x006f
        L_0x0017:
            com.ss.ttm.player.MediaPlayer$onSARChangedListener r5 = r4.mOnSARChangedListener
            if (r5 == 0) goto L_0x006f
            com.ss.ttm.player.MediaPlayer$onSARChangedListener r5 = r4.mOnSARChangedListener
            com.ss.ttm.player.MediaPlayer r6 = r4.mWrapper
            r8 = r7 & r0
            int r7 = r7 >> 16
            r5.onSARChanged(r6, r8, r7)
            goto L_0x006f
        L_0x0027:
            com.ss.ttm.player.MediaPlayer$OnExternInfoListener r5 = r4.mOnExternInfoListener
            if (r5 == 0) goto L_0x006f
            if (r8 == 0) goto L_0x006f
            com.ss.ttm.player.MediaPlayer$OnExternInfoListener r5 = r4.mOnExternInfoListener
            com.ss.ttm.player.MediaPlayer r7 = r4.mWrapper
            r5.onExternInfo(r7, r6, r8)
            return
        L_0x0035:
            r4.stayAwake(r1)
            r4.sendSeekCompleted(r5)
            r4.sendCompletioned(r5)
            return
        L_0x003f:
            r4.sendSeekCompleted(r5)
            return
        L_0x0043:
            com.ss.ttm.player.MediaPlayer$OnVideoSizeChangedListener r5 = r4.mOnVideoSizeChangedListener
            if (r5 == 0) goto L_0x006f
            com.ss.ttm.player.MediaPlayer$OnVideoSizeChangedListener r5 = r4.mOnVideoSizeChangedListener
            com.ss.ttm.player.MediaPlayer r6 = r4.mWrapper
            r8 = r7 & r0
            int r7 = r7 >> 16
            r5.onVideoSizeChanged(r6, r8, r7)
            return
        L_0x0053:
            r4.notifyInfo(r6, r7)
            return
        L_0x0057:
            com.ss.ttm.player.MediaPlayer$OnBufferingUpdateListener r5 = r4.mOnBufferingUpdateListener
            if (r5 == 0) goto L_0x006f
            com.ss.ttm.player.MediaPlayer$OnBufferingUpdateListener r5 = r4.mOnBufferingUpdateListener
            com.ss.ttm.player.MediaPlayer r6 = r4.mWrapper
            r5.onBufferingUpdate(r6, r7)
            return
        L_0x0063:
            com.ss.ttm.player.MediaPlayer$OnPreparedListener r5 = r4.mOnPreparedListener
            if (r5 == 0) goto L_0x006f
            com.ss.ttm.player.MediaPlayer$OnPreparedListener r5 = r4.mOnPreparedListener
            com.ss.ttm.player.MediaPlayer r6 = r4.mWrapper
            r5.onPrepared(r6)
            return
        L_0x006f:
            return
        L_0x0070:
            int r6 = r4.mErrorCode
            r8 = -2139062143(0xffffffff80808081, float:-1.1801042E-38)
            if (r6 != r8) goto L_0x0078
            return
        L_0x0078:
            r4.mErrorCode = r8
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r4.mWriteLock
            r6.lock()
            com.ss.ttm.player.ITTPlayerRef r6 = r4.mPlayer     // Catch:{ all -> 0x00c9 }
            if (r6 == 0) goto L_0x00c3
            r8 = 0
            r4.mPlayer = r8     // Catch:{ all -> 0x00c9 }
            r6.invalid()     // Catch:{ all -> 0x00c9 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r4.mWriteLock
            r6.unlock()
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r4.mConfigParams
            r8 = 7
            if (r6 == 0) goto L_0x00b3
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r4.mConfigParams
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r6 = r6.get(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != r2) goto L_0x00b3
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r4.mConfigParams
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6.put(r8, r0)
            goto L_0x00b6
        L_0x00b3:
            com.p280ss.ttm.player.TTPlayerConfiger.setValue(r8, r2)
        L_0x00b6:
            r4.stayAwake(r1)
            r4.sendSeekCompleted(r5)
            r4.sendErrorInfo(r7, r5)
            r4.sendCompletioned(r5)
            return
        L_0x00c3:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r4.mWriteLock
            r5.unlock()
            return
        L_0x00c9:
            r5 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r4.mWriteLock
            r6.unlock()
            throw r5
        L_0x00d0:
            r4.stayAwake(r1)
            r6 = -499989(0xfffffffffff85eeb, float:NaN)
            if (r7 != r6) goto L_0x0101
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r4.mConfigParams
            r8 = 8
            if (r6 == 0) goto L_0x00fe
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r4.mConfigParams
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r6 = r6.get(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != r2) goto L_0x00fe
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r4.mConfigParams
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6.put(r8, r0)
            goto L_0x0101
        L_0x00fe:
            com.p280ss.ttm.player.TTPlayerConfiger.setValue(r8, r2)
        L_0x0101:
            r4.sendSeekCompleted(r5)
            r4.sendErrorInfo(r7, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.TTPlayerClient.handleNotify(int, int, int, java.lang.String):void");
    }
}
