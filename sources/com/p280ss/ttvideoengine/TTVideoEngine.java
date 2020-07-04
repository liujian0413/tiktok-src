package com.p280ss.ttvideoengine;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.C1642a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.ugc.aweme.feed.monitor.C28539a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.p280ss.texturerender.TextureRenderManager;
import com.p280ss.texturerender.VideoSurface;
import com.p280ss.texturerender.VideoSurface.OnDrawFrameListener;
import com.p280ss.ttm.player.IMediaDataSource;
import com.p280ss.ttm.player.MediaFormat;
import com.p280ss.ttm.player.MediaPlayer;
import com.p280ss.ttm.player.MediaPlayer.OnBufferingUpdateListener;
import com.p280ss.ttm.player.MediaPlayer.OnCompletionListener;
import com.p280ss.ttm.player.MediaPlayer.OnErrorListener;
import com.p280ss.ttm.player.MediaPlayer.OnInfoListener;
import com.p280ss.ttm.player.MediaPlayer.OnPreparedListener;
import com.p280ss.ttm.player.MediaPlayer.OnSeekCompleteListener;
import com.p280ss.ttm.player.MediaPlayer.OnVideoSizeChangedListener;
import com.p280ss.ttm.player.MediaPlayer.TrackInfo;
import com.p280ss.ttm.player.PlaybackParams;
import com.p280ss.ttm.player.TTPlayerConfiger;
import com.p280ss.ttvideoengine.C46036ad.C46037a;
import com.p280ss.ttvideoengine.C46059d.C46062b;
import com.p280ss.ttvideoengine.log.C46141a;
import com.p280ss.ttvideoengine.log.C46142b;
import com.p280ss.ttvideoengine.log.C46143c;
import com.p280ss.ttvideoengine.log.C46144d;
import com.p280ss.ttvideoengine.log.C46148h;
import com.p280ss.ttvideoengine.log.C46151i;
import com.p280ss.ttvideoengine.log.VideoEventManager;
import com.p280ss.ttvideoengine.p1808a.C46030a;
import com.p280ss.ttvideoengine.p1810c.C46050b;
import com.p280ss.ttvideoengine.p1810c.C46050b.C46057a;
import com.p280ss.ttvideoengine.p1811d.C46073b;
import com.p280ss.ttvideoengine.p1812e.C46078c;
import com.p280ss.ttvideoengine.p1812e.C46082g;
import com.p280ss.ttvideoengine.p1812e.C46083h;
import com.p280ss.ttvideoengine.p1812e.C46084i;
import com.p280ss.ttvideoengine.p1813f.C46090b;
import com.p280ss.ttvideoengine.p1813f.C46091c;
import com.p280ss.ttvideoengine.p1813f.C46102h;
import com.p280ss.ttvideoengine.p1813f.C46106j;
import com.p280ss.ttvideoengine.p1814g.C46109a;
import com.p280ss.ttvideoengine.p1815h.C46111a;
import com.p280ss.ttvideoengine.p1816i.C46115b;
import com.p280ss.ttvideoengine.p1816i.C46117c;
import com.p280ss.ttvideoengine.p1816i.C46118d;
import com.p280ss.ttvideoengine.p1816i.C46122g;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import com.p280ss.ttvideoengine.p1816i.C46125j;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
import p045cn.p046a.p047a.p048a.C1638f;

/* renamed from: com.ss.ttvideoengine.TTVideoEngine */
public class TTVideoEngine {
    private static boolean HTTP_DNS_FIRST = false;
    private static boolean ONLY_USE_MEDIALOADER = false;
    public static int PLAYER_MAX_ACCUMULATED_COUNT = 30;
    public static int PLAYER_TIME_BASE = 1000000;
    private static int PLAY_URL_EXPIRE_TIME = 2400;
    private static String mAppPath = null;
    private static Lock mCreatCacheFileLock = new ReentrantLock();
    private static boolean mForceUseLitePlayer = false;
    private static boolean mForceUsePluginPlayer = false;
    private static boolean mIsFirstOpenEngine = true;
    private static int[] sDNSType;
    public C46078c curP2PUrlInfo;
    private String currentHost;
    private Map<Integer, String> currentParams;
    public Resolution currentResolution;
    private C46082g currentVideoInfo;
    private Resolution lastResolution;
    private float mAEPreGain = 0.25f;
    private float mAEPredelay = 0.007f;
    private float mAERatio = 8.0f;
    private float mAEThreshold = -18.0f;
    private long mALogWriteAddr;
    public String mAPIString;
    private int mAccumulatedErrorCount;
    private boolean mAllowedExpiredModel;
    private int mAsyncInitEnable;
    private boolean mAsyncPlayHitVMCache;
    private MediaPlayer mAsyncPlayer;
    private int mAudioRangeSize = 400000;
    public String mAuthorization = "";
    private boolean mBashEnabled;
    private int mBestResolutionType = 0;
    private int mBufferDataMiliSeconds;
    private int mBufferTimeout = 30;
    private long mBufferingStartT;
    public int mBufferingType = -1;
    public boolean mCacheControlEnabled;
    private String mCacheDir = "";
    private int mCacheFileEnable;
    public C46046c mCacheFilePathListener;
    private String mCachePath;
    private boolean mCheckHijack;
    private int mCleanWhenStop;
    private int mCodecId;
    private HashMap<Integer, Integer> mConfigParams = null;
    private int mConfigParamsOption = 1;
    public Context mContext;
    private String mCurrentQuality = "";
    private int mDNSExpiredTime;
    private C46091c mDNSParser;
    private int mDashAbr;
    public boolean mDashEnabled;
    public int mDataLoaderEnable;
    public C46108g mDataSource;
    public boolean mDecodedVideoFirstFrame;
    private int mDecoderType;
    private String mDecryptionKey = "";
    private String mDefaultCacheDir;
    private int mDefaultRenderType = 3;
    private String mDirectURL = "";
    private int mDisableAccurateStart;
    private int mDisablePlayerTimeOut;
    private int mDrmDowngrade;
    private boolean mDrmRetry = true;
    private int mDrmType;
    public int mDuration;
    private int mEGLNeedWorkAround = 1;
    private int mEnableFragRange = 0;
    private boolean mEnableHttps;
    private int mEnableIndexCache = 0;
    private int mEnableOppoControl;
    private int mEnableSeekInterrupt;
    private int mEnableSetPlayInfoToP2P = 1;
    private int mEnableSharp;
    private int mEnableVolumeBalance;
    private int mEnhancementType;
    public C46117c mError;
    public int mErrorCount;
    private int mExposeSignal;
    private String mExternLogKey;
    private C46142b mExternVideoLoggerListener;
    private C46050b mFetcher;
    private String mFileKey;
    public boolean mFirstGetWidthHeight = true;
    private boolean mFirstHost = true;
    private boolean mFirstIP = true;
    private boolean mFirstQuality = true;
    private boolean mFirstResolution = true;
    private boolean mFirstURL = true;
    private int mForbidOSPlayer = 0;
    private int mForbidP2P;
    private int mForbidP2PWhenSeek;
    private int mFrameDropNum = 2;
    public String mGroupID = "";
    private boolean mH265Enabled;
    private Handler mHandler;
    private int mHardwareDecodeEnablePlayer2;
    private int mHardwareDecodeEnablePlayer3;
    public boolean mHasFirstFrameShown;
    private HashMap<String, String> mHeaders;
    private boolean mHijackRetry;
    private int mHijackRetryBackupDNSType;
    private int mHijackRetryMainDNSType = 2;
    private boolean mHttpsEnabled;
    private C46034ab mInfoCollector;
    public boolean mIsDashSource;
    private boolean mIsDirectURL;
    public int mIsDisableShortSeek;
    private boolean mIsFeedInfo;
    public boolean mIsFetchingInfo;
    public boolean mIsLocal;
    private boolean mIsMute;
    public boolean mIsPlayComplete;
    private boolean mIsPlayItem;
    public int mIsPreferNearestSample;
    public boolean mIsPreloaderItem;
    public boolean mIsStartPlayAutomatically = true;
    private int mIsTTHlsDrm = 0;
    private boolean mIsUseBoe;
    private int mIsUsePlayerDNS = -1;
    private boolean mIsUseServerDns;
    private int mKsyFrameWait = 1;
    public int mLastPlaybackTime;
    private int mLayoutType;
    private int mLimitMDLCacheSize;
    public int mLoadState;
    public int mLoadedProgress;
    private String mLocalURL = "";
    public C46143c mLogger;
    private int mLoopCount;
    private int mLoopEndTime;
    private int mLoopReferVideo;
    private int mLoopStartTime;
    public boolean mLooping;
    private int mMaxAccumulatedCountSetByUser = PLAYER_MAX_ACCUMULATED_COUNT;
    private int mMaxBufferDataMilliSeconds = 5000;
    private int mMaxFileCacheSize = -1;
    private int mMaxFps = 31;
    private int mMediaCodecRender = 1;
    private int mMediaCodecSkipNonRef;
    private int mMediaCodecSyncMode;
    private IMediaDataSource mMediaDataSource;
    public MediaPlayer mMediaPlayer;
    private int mMovPreferNearestSample;
    private int mNeedAdaptiveWorkaround = 0;
    public C46106j mNetClient;
    public int mNetworkTimeout = 5;
    private int mNetworkTryCount = -1;
    public int mNotifyBufferingDirectly;
    public boolean mNotifyFirstFrame;
    private int mOriginalRetry = 1;
    private int mOutputLog;
    private int mP2PCDNType;
    private long mPauseStartT;
    public boolean mPausedBeforePrepared;
    private long mPipeLength;
    private long mPipeOffset;
    public int mPlayAPIVersion;
    public C46118d mPlayDuration;
    private FileDescriptor mPlayFd;
    private C46166u mPlayItem;
    public long mPlayTime = 0;
    private int mPlayType;
    public PlaybackParams mPlaybackParams;
    public int mPlaybackState;
    private int mPlayerCache;
    private int mPlayerDegradeMode;
    public int mPlayerType;
    private C46109a mPreloaderItem;
    public boolean mPrepared;
    private int mQcomVppLevel = -1;
    private int mRenderType = 3;
    private HashMap<String, Resolution> mResolutionMap;
    private boolean mRetryEnableHttps;
    public boolean mRetrying;
    private int mReuseSocket;
    private int mScaleType;
    private C46164s mSeekCompletionListener;
    private int mSeekEndEnabled;
    private boolean mSeeking;
    private final long mSerial = System.currentTimeMillis();
    private int mSetTrackVolume;
    private long mSettingMask;
    public boolean mShouldPlay;
    private int mSkipAudioGraph;
    private int mSkipFfmpegFindStreamInfo;
    private int mSkipFindStreamInfo = 0;
    private int mSoloPlayEnable = 1;
    private String mSpadea = "";
    public int mStartTime;
    public boolean mStarted;
    public int mState;
    public C46165t mStreamInfoListener;
    public String mSubTag = "";
    private int mSuperRes;
    private int mSuperResFxaa;
    private int mSuperResStrengh = 5;
    private Surface mSurface;
    private SurfaceHolder mSurfaceHolder;
    public boolean mSwitchingResolution;
    public String mTTHlsDrmToken = "";
    public String mTag = "";
    private int mTestAction;
    public int mTestNetSpeed = -1;
    public int mTestNetSpeedDiff = VETransitionFilterParam.TransitionDuration_DEFAULT;
    public Handler mTestNetSpeedHandler;
    public C46167v mTestNetSpeedListener;
    public Runnable mTestNetSpeedRunable;
    public boolean mTextureFirstFrame;
    private String mTextureRenderErrorMsg;
    public TextureRenderManager mTextureRenderer;
    private VideoSurface mTextureSurface;
    private int mTimeBarPercentage = 0;
    public String mTokenUrlTemplate = "";
    private C46028m mURLInfo = new C46028m();
    private String[] mURLs;
    private int mUnsupportSampleRatesInBinary;
    private int mUseAudioHWDec;
    private int mUseCodecPool = 0;
    private boolean mUseDNSCache;
    private int mUseExternalDir;
    private int mUseMediacodecAudio;
    public boolean mUsePlayer3;
    private boolean mUsePlayerSpade = true;
    private int mUseQcomLowLatency;
    private int mUseQcomVpp;
    private int mUseTextureRender;
    private boolean mUseVideoModelCache;
    private boolean mUserStopped;
    private String mUsingDataLoaderPlayTaskKey;
    public long mVVTime = 0;
    public C46168w mVideoBufferListener;
    private C46175y mVideoEngineInfoListener;
    private C46176z mVideoEngineInfos;
    public C46033aa mVideoEngineListener;
    private String mVideoID;
    public C46035ac mVideoInfoListener;
    public C46083h mVideoModel;
    private C46036ad mVideoModelCache;
    private int mVideoRangeSize = C28539a.f75176k;
    public C46038ae mVideoRouteListener;
    private float mVolume = -1.0f;
    private Map<String, C46016a> urlIPMap;
    public Map<Resolution, Integer> urlIndexMap;

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$a */
    class C46016a {

        /* renamed from: a */
        public String f117560a;

        /* renamed from: b */
        public String f117561b;

        /* renamed from: c */
        public int f117562c;

        /* renamed from: d */
        public int f117563d;

        /* renamed from: e */
        public String f117564e;

        public C46016a(String str, String str2, int i, int i2, String str3) {
            this.f117560a = str;
            this.f117561b = str2;
            this.f117562c = i;
            this.f117563d = i2;
            this.f117564e = str3;
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$b */
    static class C46017b implements OnBufferingUpdateListener {

        /* renamed from: a */
        private final WeakReference<TTVideoEngine> f117566a;

        public C46017b(TTVideoEngine tTVideoEngine) {
            this.f117566a = new WeakReference<>(tTVideoEngine);
        }

        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117566a.get();
            if (tTVideoEngine != null) {
                if (tTVideoEngine.mIsLocal) {
                    i = 100;
                }
                tTVideoEngine.mLoadedProgress = i;
                tTVideoEngine.setPlayInfo(2, (long) i);
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mVideoEngineListener.onBufferingUpdate(tTVideoEngine, i);
                }
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$c */
    static class C46018c implements OnCompletionListener {

        /* renamed from: a */
        private final WeakReference<TTVideoEngine> f117567a;

        public C46018c(TTVideoEngine tTVideoEngine) {
            this.f117567a = new WeakReference<>(tTVideoEngine);
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117567a.get();
            if (tTVideoEngine != null) {
                C46123h.m144545a("TTVideoEngine", "receive onCompletion");
                tTVideoEngine.mLogger.mo112381g();
                if (!tTVideoEngine.mLooping) {
                    tTVideoEngine.mIsPlayComplete = true;
                    tTVideoEngine._updatePlaybackState(0);
                    if (tTVideoEngine.mPlayDuration != null) {
                        tTVideoEngine.mPlayDuration.mo112292b();
                        tTVideoEngine.mLogger.mo112316J(tTVideoEngine.mPlayDuration.mo112293c());
                    }
                    tTVideoEngine.mLogger.mo112433w(tTVideoEngine.mDuration);
                    tTVideoEngine._updateLogger();
                    tTVideoEngine.mLogger.mo112431v(3);
                    tTVideoEngine.mHasFirstFrameShown = false;
                    tTVideoEngine.mSwitchingResolution = false;
                    tTVideoEngine.mLastPlaybackTime = 0;
                    tTVideoEngine.mRetrying = false;
                    tTVideoEngine.mStarted = false;
                } else {
                    tTVideoEngine.mLogger.mo112389i();
                }
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mVideoEngineListener.onCompletion(tTVideoEngine);
                }
                if (mediaPlayer.getPlayerType() == 0) {
                    tTVideoEngine.mPrepared = false;
                }
                tTVideoEngine.mStartTime = 0;
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$d */
    static class C46019d implements C46090b {

        /* renamed from: a */
        private final WeakReference<TTVideoEngine> f117568a;

        /* renamed from: a */
        public final void mo112094a() {
            C46123h.m144545a("TTVideoEngine", "dns cancelled");
        }

        public C46019d(TTVideoEngine tTVideoEngine) {
            this.f117568a = new WeakReference<>(tTVideoEngine);
        }

        /* renamed from: a */
        public final void mo112095a(C46117c cVar) {
            if (cVar == null) {
                C46123h.m144545a("TTVideoEngine", C1642a.m8034a("fetcher should retry, error:%s", new Object[]{cVar.toString()}));
                TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117568a.get();
                if (tTVideoEngine != null) {
                    if (((Integer) tTVideoEngine.urlIndexMap.get(tTVideoEngine.currentResolution)).intValue() == 0) {
                        tTVideoEngine.mLogger.mo112337a(cVar);
                    }
                    tTVideoEngine.mLogger.mo112365c(cVar);
                }
            }
        }

        /* renamed from: a */
        public final void mo112096a(JSONObject jSONObject, C46117c cVar) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117568a.get();
            if (tTVideoEngine != null) {
                if (cVar != null) {
                    C46123h.m144545a("TTVideoEngine", C1642a.m8034a("dns failed:%s", new Object[]{cVar.toString()}));
                    if (((Integer) tTVideoEngine.urlIndexMap.get(tTVideoEngine.currentResolution)).intValue() == 0) {
                        tTVideoEngine.mLogger.mo112354b(cVar);
                    }
                    tTVideoEngine._receivedError(cVar);
                    return;
                }
                String str = null;
                if (jSONObject != null) {
                    str = jSONObject.optString("ip");
                    long optLong = jSONObject.optLong("time");
                    if (tTVideoEngine.mLogger != null) {
                        tTVideoEngine.mLogger.mo112417p(optLong);
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    tTVideoEngine._receivedError(new C46117c("", -9997, "DNS result empty"));
                    C46123h.m144545a("TTVideoEngine", "dns parse empty");
                    return;
                }
                tTVideoEngine._parseDNSComplete(str);
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$e */
    static class C46020e implements OnErrorListener {

        /* renamed from: a */
        private final WeakReference<TTVideoEngine> f117569a;

        public C46020e(TTVideoEngine tTVideoEngine) {
            this.f117569a = new WeakReference<>(tTVideoEngine);
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117569a.get();
            if (tTVideoEngine == null) {
                return false;
            }
            if (tTVideoEngine.mPlayDuration != null) {
                tTVideoEngine.mPlayDuration.mo112292b();
            }
            tTVideoEngine._updatePlaybackState(3);
            tTVideoEngine._updateLoadState(3, -1);
            String stringOption = mediaPlayer.getStringOption(5002);
            String str = "kTTVideoErrorDomainVideoOwnPlayer";
            if (mediaPlayer.isOSPlayer()) {
                str = "kTTVideoErrorDomainVideoOSPlayer";
            }
            tTVideoEngine.mError = new C46117c(str, i, i2, stringOption);
            tTVideoEngine._receivedError(tTVideoEngine.mError);
            return true;
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$f */
    static class C46021f implements C46057a {

        /* renamed from: a */
        private final WeakReference<TTVideoEngine> f117570a;

        public C46021f(TTVideoEngine tTVideoEngine) {
            this.f117570a = new WeakReference<>(tTVideoEngine);
        }

        /* renamed from: a */
        public final void mo112100a(String str) {
            C46123h.m144545a("TTVideoEngine", "fetcher cancelled");
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117570a.get();
            if (tTVideoEngine != null) {
                tTVideoEngine._logMessage(str);
            }
        }

        /* renamed from: a */
        public final void mo112099a(C46117c cVar) {
            if (cVar != null) {
                C46123h.m144545a("TTVideoEngine", C1642a.m8034a("fetcher should retry, error:%s", new Object[]{cVar.toString()}));
                TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117570a.get();
                if (tTVideoEngine != null) {
                    tTVideoEngine.mLogger.mo112338a(cVar, tTVideoEngine.mPlayAPIVersion);
                }
            }
        }

        /* renamed from: a */
        public final void mo112097a(int i, String str) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117570a.get();
            if (tTVideoEngine != null) {
                C46123h.m144545a("TTVideoEngine", C1642a.m8034a("video status exception:%d", new Object[]{Integer.valueOf(i)}));
                tTVideoEngine.mIsFetchingInfo = false;
                if (tTVideoEngine.mLogger != null) {
                    tTVideoEngine.mLogger.mo112363c(i, str);
                }
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mVideoEngineListener.onVideoStatusException(i);
                }
            }
        }

        /* renamed from: a */
        public final void mo112098a(C46083h hVar, C46117c cVar) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117570a.get();
            if (tTVideoEngine != null) {
                tTVideoEngine.mIsFetchingInfo = false;
                if (hVar == null || cVar != null) {
                    C46123h.m144545a("TTVideoEngine", C1642a.m8034a("fetch info failed:%s", new Object[]{cVar.toString()}));
                    if (cVar != null) {
                        tTVideoEngine._logFetchedFailed(cVar);
                        tTVideoEngine._receivedError(cVar);
                        return;
                    }
                    tTVideoEngine._logFetchedFailed(new C46117c("kTTVideoErrorDomainFetchingInfo", -9997, "fetch empty"));
                    tTVideoEngine._receivedError(new C46117c("kTTVideoErrorDomainFetchingInfo", -9997, "fetch empty"));
                    return;
                }
                tTVideoEngine.mVideoModel = hVar;
                C46123h.m144545a("TTVideoEngine", "fetch info success");
                tTVideoEngine._logFetchedVideoInfo(hVar);
                tTVideoEngine.mIsDashSource = hVar.mo112231a();
                tTVideoEngine.mDashEnabled = tTVideoEngine.mIsDashSource;
                if (!tTVideoEngine.mIsPreloaderItem) {
                    if (tTVideoEngine.mVideoInfoListener != null) {
                        tTVideoEngine.mLogger.mo112317K(0);
                    }
                    tTVideoEngine._parseIPAddress(hVar);
                }
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$g */
    static class C46022g implements OnInfoListener {

        /* renamed from: a */
        private final WeakReference<TTVideoEngine> f117571a;

        public C46022g(TTVideoEngine tTVideoEngine) {
            this.f117571a = new WeakReference<>(tTVideoEngine);
        }

        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117571a.get();
            if (tTVideoEngine == null) {
                return false;
            }
            switch (i) {
                case 3:
                    C46123h.m144545a("TTVideoEngine", "player callback render start");
                    if (tTVideoEngine.mTextureRenderer != null) {
                        tTVideoEngine.mNotifyFirstFrame = true;
                        if (tTVideoEngine.mTextureFirstFrame) {
                            C46123h.m144545a("TTVideoEngine", "render start by player after texture");
                            tTVideoEngine._renderStart();
                            break;
                        }
                    } else {
                        C46123h.m144545a("TTVideoEngine", "render start by player");
                        tTVideoEngine._renderStart();
                        break;
                    }
                    break;
                case 701:
                    tTVideoEngine._bufferStart(i2);
                    break;
                case 702:
                    tTVideoEngine._bufferEnd(i2);
                    break;
                case 801:
                    tTVideoEngine._seekComplete(false);
                    break;
                case 251658244:
                    tTVideoEngine._streamChanged(i2);
                    break;
                case 251658248:
                    tTVideoEngine._renderSeekComplete(i2);
                    break;
                case 251658249:
                    tTVideoEngine._videoBitrateChanged(i2);
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$h */
    static class C46023h implements C46141a {

        /* renamed from: a */
        private final WeakReference<TTVideoEngine> f117572a;

        /* renamed from: c */
        public final String mo112106c() {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117572a.get();
            if (tTVideoEngine != null && tTVideoEngine.mDataLoaderEnable != 0) {
                return C46059d.m144301a().mo112182d(tTVideoEngine.mLogger.mo112393j());
            }
            StringBuilder sb = new StringBuilder("videoEngine is:");
            sb.append(tTVideoEngine);
            sb.append(", dataloader enable:");
            sb.append(tTVideoEngine.mDataLoaderEnable);
            C46123h.m144545a("TTVideoEngine", sb.toString());
            return null;
        }

        /* renamed from: b */
        public final Map mo112104b() {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117572a.get();
            if (tTVideoEngine == null) {
                return null;
            }
            MediaPlayer mediaPlayer = tTVideoEngine.mMediaPlayer;
            if (mediaPlayer == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("vds", Long.valueOf(mediaPlayer.getLongOption(45, 0)));
            hashMap.put("vps", Long.valueOf(mediaPlayer.getLongOption(46, 0)));
            hashMap.put("download_speed", Long.valueOf(mediaPlayer.getLongOption(63, -1)));
            hashMap.put("vlen", Long.valueOf(mediaPlayer.getLongOption(72, 0)));
            hashMap.put("alen", Long.valueOf(mediaPlayer.getLongOption(73, 0)));
            return hashMap;
        }

        /* renamed from: a */
        public final Map mo112102a() {
            String str;
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117572a.get();
            if (tTVideoEngine == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            if (tTVideoEngine.mUsePlayer3) {
                str = C1638f.m8026a(14, "");
            } else {
                str = TTPlayerConfiger.getValue(14, "");
            }
            if (tTVideoEngine.mPlayerType == 0 || tTVideoEngine.mPlayerType == 1) {
                hashMap.put("sv", "5.6");
                if (tTVideoEngine.mUsePlayer3) {
                    hashMap.put("pv", "3.3");
                } else {
                    hashMap.put("pv", "3.0");
                }
                hashMap.put("pc", str);
                hashMap.put("sdk_version", "1.9.17.123");
            } else if (tTVideoEngine.mPlayerType == 2) {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "1.0");
                hashMap.put("pc", "0");
                hashMap.put("sdk_version", "1.9.17.123");
            } else {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "4.0");
                hashMap.put("pc", str);
                hashMap.put("sdk_version", "1.9.17.123");
            }
            return hashMap;
        }

        public C46023h(TTVideoEngine tTVideoEngine) {
            this.f117572a = new WeakReference<>(tTVideoEngine);
        }

        /* renamed from: a */
        public final String mo112101a(int i) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117572a.get();
            if (tTVideoEngine == null) {
                return "";
            }
            if (i != 20) {
                if (i == 29) {
                    return tTVideoEngine.mAuthorization;
                }
                if (i != 37) {
                    switch (i) {
                        case 0:
                            if (tTVideoEngine.mMediaPlayer != null) {
                                int intOption = tTVideoEngine.mMediaPlayer.getIntOption(141, -1);
                                if (intOption == 0) {
                                    return "h264";
                                }
                                if (intOption == 1) {
                                    return "h265";
                                }
                            }
                            break;
                        case 1:
                            if (tTVideoEngine.mMediaPlayer != null) {
                                switch (tTVideoEngine.mMediaPlayer.getIntOption(139, -1)) {
                                    case 0:
                                        return "opengl";
                                    case 1:
                                        return "nativewindow";
                                }
                            }
                            break;
                        case 2:
                            MediaPlayer mediaPlayer = tTVideoEngine.mMediaPlayer;
                            if (mediaPlayer != null) {
                                return mediaPlayer.getStringOption(5002);
                            }
                            break;
                        case 3:
                            return tTVideoEngine.mAPIString;
                        case 4:
                            if (tTVideoEngine.mNetClient == null) {
                                return "own";
                            }
                            return "user";
                        case 5:
                            if (tTVideoEngine.mMediaPlayer != null) {
                                return tTVideoEngine.mMediaPlayer.getStringOption(71);
                            }
                            break;
                        default:
                            switch (i) {
                                case 31:
                                    try {
                                        return Build.BOARD;
                                    } catch (Exception unused) {
                                        return "";
                                    }
                                case 32:
                                    try {
                                        if (VERSION.SDK_INT >= 8) {
                                            return Build.HARDWARE;
                                        }
                                        return "";
                                    } catch (Exception unused2) {
                                        return "";
                                    }
                                case 33:
                                    if (tTVideoEngine.mMediaPlayer != null) {
                                        return tTVideoEngine.mMediaPlayer.getStringOption(C34943c.f91127w);
                                    }
                                    break;
                            }
                    }
                } else {
                    return C46059d.m144301a().mo112155a(6);
                }
            } else if (tTVideoEngine.curP2PUrlInfo != null) {
                return C46030a.m144223a().mo112111a(tTVideoEngine.curP2PUrlInfo.f117781a);
            }
            return "";
        }

        /* renamed from: b */
        public final long mo112103b(int i) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117572a.get();
            if (tTVideoEngine == null || tTVideoEngine.mMediaPlayer == null) {
                return 0;
            }
            if (i == 7) {
                return tTVideoEngine.mMediaPlayer.getLongOption(68, 0);
            }
            if (i == 45) {
                return tTVideoEngine.mMediaPlayer.getLongOption(152, -1);
            }
            switch (i) {
                case 10:
                    return tTVideoEngine.mMediaPlayer.getLongOption(69, 0);
                case 11:
                    return tTVideoEngine.mMediaPlayer.getLongOption(70, 0);
                case 12:
                    return tTVideoEngine.mMediaPlayer.getLongOption(75, 0);
                case 13:
                    return tTVideoEngine.mMediaPlayer.getLongOption(76, 0);
                case 14:
                    return tTVideoEngine.mMediaPlayer.getLongOption(77, 0);
                case 15:
                    return tTVideoEngine.mMediaPlayer.getLongOption(78, 0);
                case 16:
                    return tTVideoEngine.mMediaPlayer.getLongOption(156, -1);
                case 17:
                    return tTVideoEngine.mMediaPlayer.getLongOption(155, -1);
                case 18:
                    return tTVideoEngine.mMediaPlayer.getLongOption(163, -1);
                case 19:
                    return tTVideoEngine.mMediaPlayer.getLongOption(162, -1);
                default:
                    switch (i) {
                        case 38:
                            return tTVideoEngine.mMediaPlayer.getLongOption(307, -1);
                        case 39:
                            return tTVideoEngine.mMediaPlayer.getLongOption(308, -1);
                        case 40:
                            return tTVideoEngine.mPlayTime;
                        case BaseNotice.LIKE /*41*/:
                            return tTVideoEngine.mVVTime;
                        default:
                            return 0;
                    }
            }
        }

        /* renamed from: c */
        public final int mo112105c(int i) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117572a.get();
            if (tTVideoEngine == null) {
                return 0;
            }
            if (i == 30) {
                return tTVideoEngine.mPlayAPIVersion;
            }
            switch (i) {
                case 21:
                    return tTVideoEngine.mPlaybackState;
                case 22:
                    return tTVideoEngine.mLoadState;
                case 23:
                    return tTVideoEngine.mState;
                case 24:
                    if (tTVideoEngine.mMediaPlayer == null) {
                        return 0;
                    }
                    return tTVideoEngine.convertCodecName(tTVideoEngine.mMediaPlayer.getIntOption(157, -1));
                case 25:
                    if (tTVideoEngine.mMediaPlayer == null) {
                        return 0;
                    }
                    return tTVideoEngine.mMediaPlayer.getIntOption(158, -1);
                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                    return (int) tTVideoEngine.getVolume();
                case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                    if (tTVideoEngine.mMediaPlayer == null) {
                        return -1;
                    }
                    if (tTVideoEngine.mMediaPlayer.isMute()) {
                        return 1;
                    }
                    return 0;
                default:
                    switch (i) {
                        case BaseNotice.CHALLENGE /*34*/:
                            return tTVideoEngine.mIsPreferNearestSample;
                        case 35:
                            return tTVideoEngine.mNetworkTimeout;
                        case 36:
                            return tTVideoEngine.mIsDisableShortSeek;
                        default:
                            switch (i) {
                                case 42:
                                    if (tTVideoEngine.mMediaPlayer == null) {
                                        return 0;
                                    }
                                    return tTVideoEngine.mMediaPlayer.getIntOption(221, -1);
                                case 43:
                                    if (tTVideoEngine.mMediaPlayer == null) {
                                        return 0;
                                    }
                                    return tTVideoEngine.mMediaPlayer.getIntOption(222, -1);
                                case 44:
                                    if (tTVideoEngine.mMediaPlayer == null) {
                                        return 0;
                                    }
                                    return tTVideoEngine.mMediaPlayer.getIntOption(245, -1);
                                default:
                                    return 0;
                            }
                    }
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$i */
    static class C46024i implements OnVideoSizeChangedListener {

        /* renamed from: a */
        private final WeakReference<TTVideoEngine> f117573a;

        public C46024i(TTVideoEngine tTVideoEngine) {
            this.f117573a = new WeakReference<>(tTVideoEngine);
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117573a.get();
            if (!(tTVideoEngine == null || tTVideoEngine.mVideoEngineListener == null)) {
                tTVideoEngine.mVideoEngineListener.onVideoSizeChanged(tTVideoEngine, i, i2);
                if (!tTVideoEngine.mSwitchingResolution && tTVideoEngine.mFirstGetWidthHeight) {
                    tTVideoEngine.mFirstGetWidthHeight = false;
                    tTVideoEngine.mLogger.mo112382g(i);
                    tTVideoEngine.mLogger.mo112386h(i2);
                }
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$j */
    static class C46025j implements OnPreparedListener {

        /* renamed from: a */
        private final WeakReference<TTVideoEngine> f117574a;

        public C46025j(TTVideoEngine tTVideoEngine) {
            this.f117574a = new WeakReference<>(tTVideoEngine);
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117574a.get();
            if (tTVideoEngine != null && tTVideoEngine.mMediaPlayer != null) {
                C46123h.m144545a("TTVideoEngine", "reveive onPrepared");
                tTVideoEngine.mErrorCount = 0;
                tTVideoEngine.mError = null;
                tTVideoEngine.mDuration = tTVideoEngine.mMediaPlayer.getDuration();
                tTVideoEngine.mPrepared = true;
                if (tTVideoEngine.mLogger != null) {
                    tTVideoEngine.mLogger.mo112347b();
                    tTVideoEngine.mLogger.mo112410n(tTVideoEngine.mDuration);
                }
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mVideoEngineListener.onPrepared(tTVideoEngine);
                }
                if ((!tTVideoEngine.mPausedBeforePrepared && tTVideoEngine.mShouldPlay) || (!tTVideoEngine.mIsStartPlayAutomatically && tTVideoEngine.mNotifyBufferingDirectly == 0)) {
                    tTVideoEngine.mMediaPlayer.start();
                }
                if (tTVideoEngine.mSwitchingResolution && !tTVideoEngine.mShouldPlay) {
                    tTVideoEngine.mMediaPlayer.start();
                    tTVideoEngine.mMediaPlayer.pause();
                }
                if (tTVideoEngine.mPlaybackParams != null && tTVideoEngine.isSystemPlayer() && VERSION.SDK_INT >= 23) {
                    tTVideoEngine.mMediaPlayer.setPlaybackParams(tTVideoEngine.mPlaybackParams);
                    tTVideoEngine.mLogger.mo112334a(tTVideoEngine.mPlaybackParams);
                }
                if (tTVideoEngine.mMediaPlayer != null && tTVideoEngine.mMediaPlayer.getIntOption(62, -100) == 0 && !tTVideoEngine.mPausedBeforePrepared && tTVideoEngine.mShouldPlay) {
                    tTVideoEngine._renderStart();
                }
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$k */
    static class C46026k implements Runnable {

        /* renamed from: a */
        private MediaPlayer f117575a;

        public final void run() {
            if (this.f117575a != null) {
                try {
                    C46123h.m144545a("TTVideoEngine", "MyReleaseRunnable release");
                    this.f117575a.release();
                    this.f117575a = null;
                } catch (Exception e) {
                    C46123h.m144545a("TTVideoEngine", e.toString());
                }
            }
        }

        public C46026k(MediaPlayer mediaPlayer) {
            this.f117575a = mediaPlayer;
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$l */
    static class C46027l implements OnSeekCompleteListener {

        /* renamed from: a */
        private final WeakReference<TTVideoEngine> f117576a;

        public C46027l(TTVideoEngine tTVideoEngine) {
            this.f117576a = new WeakReference<>(tTVideoEngine);
        }

        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f117576a.get();
            if (tTVideoEngine != null) {
                tTVideoEngine._seekComplete(true);
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$m */
    class C46028m {

        /* renamed from: a */
        public String f117577a;

        /* renamed from: b */
        public String f117578b;

        /* renamed from: c */
        public boolean f117579c;

        /* renamed from: a */
        public final String mo112108a() {
            if (this.f117579c) {
                return this.f117578b;
            }
            return this.f117577a;
        }

        private C46028m() {
        }

        /* renamed from: a */
        public final void mo112109a(String str) {
            this.f117577a = str;
            this.f117579c = false;
        }

        /* renamed from: b */
        public final void mo112110b(String str) {
            this.f117578b = str;
            this.f117579c = true;
        }
    }

    public static int[] getDNSType() {
        return sDNSType;
    }

    public static String getEngineVersion() {
        return "1.9.17.123";
    }

    public static boolean isExpiredIpEnable() {
        return false;
    }

    public static boolean isForceUseLitePlayer() {
        return mForceUseLitePlayer;
    }

    public static boolean isForceUsePluginPlayer() {
        return mForceUsePluginPlayer;
    }

    public static boolean isHttpDnsFirst() {
        return HTTP_DNS_FIRST;
    }

    public static boolean isUsingTTNETHttpDns() {
        return false;
    }

    public static void setDataLoaderNetworkClient(C46106j jVar) {
    }

    public static void setExpiredIpEnable(boolean z) {
    }

    public static void setUsingTTNETHttpDns(boolean z) {
    }

    public static void addTask(String str, String str2, String str3, long j) {
        C46059d.m144301a().mo112175a(str, str2, str3, j);
    }

    public static void addTask(String str, String str2, String[] strArr, long j) {
        C46059d.m144301a().mo112176a(str, str2, strArr, j);
    }

    public static void addTask(String[] strArr, String str, long j, String str2) {
        C46059d.m144301a().mo112177a(strArr, str, j, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:292:0x076d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _playInternal(java.lang.String r18, java.util.HashMap r19) {
        /*
            r17 = this;
            r1 = r17
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 4
            r3 = 0
            r4 = 3
            if (r0 == 0) goto L_0x0028
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            int r0 = r0.getPlayerType()
            if (r0 == 0) goto L_0x0021
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            int r0 = r0.getPlayerType()
            if (r0 == r4) goto L_0x0021
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            int r0 = r0.getPlayerType()
            if (r0 != r2) goto L_0x0028
        L_0x0021:
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r0.release()
            r1.mMediaPlayer = r3
        L_0x0028:
            r17._settingCongureWithPlayer()
            com.ss.ttvideoengine.e.h r0 = r1.mVideoModel
            r5 = r18
            boolean r0 = r1.isSupportFileCache(r5, r0)
            int r6 = r1.mUseTextureRender
            if (r6 == 0) goto L_0x003e
            com.ss.texturerender.TextureRenderManager r6 = r1.mTextureRenderer
            if (r6 != 0) goto L_0x003e
            r17.setupTextureRender()
        L_0x003e:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r1.mConfigParams
            r7 = 100
            r8 = 2
            r9 = 0
            r10 = 1
            if (r6 == 0) goto L_0x008f
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r1.mConfigParams
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            int r12 = r1.mPlayerType
            if (r12 == r8) goto L_0x0053
            r12 = 1
            goto L_0x0054
        L_0x0053:
            r12 = 0
        L_0x0054:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6.put(r11, r12)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r1.mConfigParams
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            int r12 = r1.mPlayerType
            if (r12 != r10) goto L_0x0067
            r12 = 1
            goto L_0x0068
        L_0x0067:
            r12 = 0
        L_0x0068:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6.put(r11, r12)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r1.mConfigParams
            r11 = 11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r12 = r1.mForbidOSPlayer
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6.put(r11, r12)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r1.mConfigParams
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            int r12 = r1.mConfigParamsOption
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6.put(r11, r12)
        L_0x008f:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 133(0x85, float:1.86E-43)
            r12 = 14
            if (r6 != 0) goto L_0x04fb
            com.ss.ttm.player.MediaPlayer r6 = r1.mAsyncPlayer
            if (r6 == 0) goto L_0x00a2
            com.ss.ttm.player.MediaPlayer r6 = r1.mAsyncPlayer
            r1.mMediaPlayer = r6
            r1.mAsyncPlayer = r3
            goto L_0x00a8
        L_0x00a2:
            com.ss.ttm.player.MediaPlayer r6 = r17._createPlayer()
            r1.mMediaPlayer = r6
        L_0x00a8:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r13 = -9993(0xffffffffffffd8f7, float:NaN)
            if (r6 != 0) goto L_0x00bb
            com.ss.ttvideoengine.i.c r0 = new com.ss.ttvideoengine.i.c
            java.lang.String r2 = "kTTVideoErrorDomainVideoOwnPlayer"
            java.lang.String r3 = "create player failed"
            r0.<init>(r2, r13, r3)
            r1._notifyError(r0)
            return
        L_0x00bb:
            boolean r6 = r1.mDashEnabled
            if (r6 != 0) goto L_0x00c7
            boolean r6 = r1.mH265Enabled
            if (r6 != 0) goto L_0x00c7
            boolean r6 = r1.mHttpsEnabled
            if (r6 == 0) goto L_0x00e0
        L_0x00c7:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            if (r6 == 0) goto L_0x00e0
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            boolean r6 = r6.isOSPlayer()
            if (r6 == 0) goto L_0x00e0
            com.ss.ttvideoengine.i.c r0 = new com.ss.ttvideoengine.i.c
            java.lang.String r2 = "kTTVideoErrorDomainVideoOwnPlayer"
            java.lang.String r3 = "create own player failed"
            r0.<init>(r2, r13, r3)
            r1._receivedError(r0)
            return
        L_0x00e0:
            boolean r6 = r1.mDashEnabled
            if (r6 != 0) goto L_0x00ec
            boolean r6 = r1.mH265Enabled
            if (r6 != 0) goto L_0x00ec
            boolean r6 = r1.mHttpsEnabled
            if (r6 == 0) goto L_0x010f
        L_0x00ec:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            if (r6 == 0) goto L_0x010f
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r6 = r6.getPlayerType()
            if (r6 == r4) goto L_0x0100
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r6 = r6.getPlayerType()
            if (r6 != r2) goto L_0x010f
        L_0x0100:
            com.ss.ttvideoengine.i.c r0 = new com.ss.ttvideoengine.i.c
            java.lang.String r2 = "kTTVideoErrorDomainVideoOwnPlayer"
            r3 = -9989(0xffffffffffffd8fb, float:NaN)
            java.lang.String r4 = "create own plugin player failed"
            r0.<init>(r2, r3, r4)
            r1._receivedError(r0)
            return
        L_0x010f:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r6 = r6.getPlayerType()
            switch(r6) {
                case 0: goto L_0x0125;
                case 1: goto L_0x0122;
                case 2: goto L_0x011f;
                case 3: goto L_0x011c;
                case 4: goto L_0x0119;
                default: goto L_0x0118;
            }
        L_0x0118:
            goto L_0x0127
        L_0x0119:
            r1.mPlayerType = r2
            goto L_0x0127
        L_0x011c:
            r1.mPlayerType = r4
            goto L_0x0127
        L_0x011f:
            r1.mPlayerType = r10
            goto L_0x0127
        L_0x0122:
            r1.mPlayerType = r9
            goto L_0x0127
        L_0x0125:
            r1.mPlayerType = r8
        L_0x0127:
            int r6 = r1.mCacheFileEnable
            if (r6 != r10) goto L_0x0151
            if (r0 == 0) goto L_0x0151
            int r6 = r1.mDataLoaderEnable
            if (r6 > 0) goto L_0x0151
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r6.setIntOption(r12, r10)
            java.lang.String r6 = r17.getDefaultCacheFileDirPath()
            java.lang.String r13 = r1.mDefaultCacheDir
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x0144
            java.lang.String r6 = r1.mDefaultCacheDir
        L_0x0144:
            com.ss.ttm.player.MediaPlayer r13 = r1.mMediaPlayer
            r14 = 34
            r13.setStringOption(r14, r6)
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            r6.mo112369d(r10)
            goto L_0x0156
        L_0x0151:
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            r6.mo112369d(r9)
        L_0x0156:
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            if (r6 == 0) goto L_0x0161
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            boolean r13 = r1.mIsStartPlayAutomatically
            r6.mo112346a(r13)
        L_0x0161:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r13 = 185(0xb9, float:2.59E-43)
            int r14 = r1.mSoloPlayEnable
            r6.setIntOption(r13, r14)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            boolean r13 = r1.mIsStartPlayAutomatically
            r13 = r13 ^ r10
            r14 = 196(0xc4, float:2.75E-43)
            r6.setIntOption(r14, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r13 = 201(0xc9, float:2.82E-43)
            int r15 = r1.mIsDisableShortSeek
            r6.setIntOption(r13, r15)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r13 = 94
            int r15 = r1.mSetTrackVolume
            r6.setIntOption(r13, r15)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r13 = 95
            int r15 = r1.mIsPreferNearestSample
            r6.setIntOption(r13, r15)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r13 = 96
            int r15 = r1.mSkipFindStreamInfo
            r6.setIntOption(r13, r15)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r13 = r1.mDisableAccurateStart
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 81
            int r13 = r1.mBufferTimeout
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 9
            int r13 = r1.mNetworkTimeout
            int r15 = PLAYER_TIME_BASE
            int r13 = r13 * r15
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 197(0xc5, float:2.76E-43)
            int r13 = r1.mOriginalRetry
            r6.setIntOption(r11, r13)
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            int r11 = r1.mBufferTimeout
            r6.mo112362c(r10, r11)
            int r6 = r1.mEGLNeedWorkAround
            if (r6 != 0) goto L_0x01d2
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 183(0xb7, float:2.56E-43)
            int r13 = r1.mEGLNeedWorkAround
            r6.setIntOption(r11, r13)
        L_0x01d2:
            boolean r6 = r1.mDashEnabled
            if (r6 == 0) goto L_0x01e6
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 132(0x84, float:1.85E-43)
            r6.setIntOption(r11, r10)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 172(0xac, float:2.41E-43)
            int r13 = r1.mDashAbr
            r6.setIntOption(r11, r13)
        L_0x01e6:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 67
            int r13 = r1.mDecoderType
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            boolean r11 = r1.mIsStartPlayAutomatically
            r11 = r11 ^ r10
            r6.setIntOption(r14, r11)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 86
            int r13 = r1.mBufferDataMiliSeconds
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 110(0x6e, float:1.54E-43)
            int r13 = r1.mMaxBufferDataMilliSeconds
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 111(0x6f, float:1.56E-43)
            int r13 = r1.mUnsupportSampleRatesInBinary
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 159(0x9f, float:2.23E-43)
            int r13 = r1.mFrameDropNum
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 195(0xc3, float:2.73E-43)
            int r13 = r1.mLoopReferVideo
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 79
            int r13 = r1.mTestNetSpeed
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 66
            int r13 = r1.mTestNetSpeedDiff
            r6.setIntOption(r11, r13)
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            int r11 = r1.mDecoderType
            r6.mo112374e(r11)
            int r6 = r1.mPlayerCache
            if (r6 == 0) goto L_0x024e
            boolean r6 = r1.mCacheControlEnabled
            if (r6 == 0) goto L_0x024e
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 24
            int r13 = r1.mPlayerCache
            r6.setIntOption(r11, r13)
        L_0x024e:
            float r6 = r1.mVolume
            r11 = 0
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 < 0) goto L_0x025c
            float r6 = r1.mVolume
            float r11 = r1.mVolume
            r1._setPlayerVolume(r6, r11)
        L_0x025c:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 159(0x9f, float:2.23E-43)
            int r13 = r1.mFrameDropNum
            r6.setIntOption(r11, r13)
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            if (r6 == 0) goto L_0x0270
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            int r11 = r1.mFrameDropNum
            r6.mo112308B(r11)
        L_0x0270:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 83
            int r13 = r1.mTestAction
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 37
            int r13 = r1.mEnhancementType
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 38
            int r13 = r1.mScaleType
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 36
            int r13 = r1.mLayoutType
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 56
            int r13 = r1.mRenderType
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 223(0xdf, float:3.12E-43)
            int r13 = r1.mOutputLog
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 301(0x12d, float:4.22E-43)
            int r13 = r1.mExposeSignal
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 211(0xd3, float:2.96E-43)
            int r13 = r1.mNotifyBufferingDirectly
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 247(0xf7, float:3.46E-43)
            int r13 = r1.mDisablePlayerTimeOut
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 248(0xf8, float:3.48E-43)
            int r13 = r1.mEnableSeekInterrupt
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r6 = r6.getPlayerType()
            if (r6 == r10) goto L_0x02e3
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r6 = r6.getPlayerType()
            if (r6 == r8) goto L_0x02e3
            boolean r6 = r1.mUsePlayer3
            if (r6 == 0) goto L_0x02e1
            r1.mHardwareDecodeEnablePlayer3 = r9
            goto L_0x02e3
        L_0x02e1:
            r1.mHardwareDecodeEnablePlayer2 = r9
        L_0x02e3:
            boolean r6 = r1.mUsePlayer3
            if (r6 == 0) goto L_0x030a
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 59
            int r13 = r1.mHardwareDecodeEnablePlayer3
            r6.setIntOption(r11, r13)
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            int r11 = r1.mHardwareDecodeEnablePlayer3
            r6.mo112361c(r11)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 203(0xcb, float:2.84E-43)
            int r13 = r1.mUseAudioHWDec
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 49
            int r13 = r1.mDefaultRenderType
            r6.setIntOption(r11, r13)
            goto L_0x034b
        L_0x030a:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 59
            int r13 = r1.mHardwareDecodeEnablePlayer2
            r6.setIntOption(r11, r13)
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            int r11 = r1.mHardwareDecodeEnablePlayer2
            r6.mo112361c(r11)
            int r6 = r1.mEnableVolumeBalance
            if (r6 != r10) goto L_0x034b
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 302(0x12e, float:4.23E-43)
            int r13 = r1.mEnableVolumeBalance
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 303(0x12f, float:4.25E-43)
            float r13 = r1.mAEPreGain
            r6.setFloatOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 304(0x130, float:4.26E-43)
            float r13 = r1.mAEThreshold
            r6.setFloatOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 306(0x132, float:4.29E-43)
            float r13 = r1.mAEPredelay
            r6.setFloatOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 305(0x131, float:4.27E-43)
            float r13 = r1.mAERatio
            r6.setFloatOption(r11, r13)
        L_0x034b:
            boolean r6 = r1.mUsePlayer3
            if (r6 != 0) goto L_0x03bc
            int r6 = r1.mHardwareDecodeEnablePlayer2
            if (r6 != r10) goto L_0x03bc
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 254(0xfe, float:3.56E-43)
            int r13 = r1.mNeedAdaptiveWorkaround
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 400(0x190, float:5.6E-43)
            int r13 = r1.mUseCodecPool
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 182(0xb6, float:2.55E-43)
            int r13 = r1.mCodecId
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 181(0xb5, float:2.54E-43)
            int r13 = r1.mAsyncInitEnable
            r6.setIntOption(r11, r13)
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            int r11 = r1.mAsyncInitEnable
            int r13 = r1.mCodecId
            r6.mo112327a(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 90
            int r13 = r1.mMediaCodecSyncMode
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 215(0xd7, float:3.01E-43)
            int r13 = r1.mUseQcomLowLatency
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 216(0xd8, float:3.03E-43)
            int r13 = r1.mMediaCodecSkipNonRef
            r6.setIntOption(r11, r13)
            int r6 = r1.mUseQcomVpp
            if (r6 != r10) goto L_0x03b1
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 212(0xd4, float:2.97E-43)
            int r13 = r1.mUseQcomVpp
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 213(0xd5, float:2.98E-43)
            int r13 = r1.mQcomVppLevel
            r6.setIntOption(r11, r13)
        L_0x03b1:
            int r6 = r1.mEnableOppoControl
            if (r6 != r10) goto L_0x03bc
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 184(0xb8, float:2.58E-43)
            r6.setIntOption(r11, r10)
        L_0x03bc:
            int r6 = r1.mEnableSharp
            if (r6 != r10) goto L_0x03c7
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 189(0xbd, float:2.65E-43)
            r6.setIntOption(r11, r10)
        L_0x03c7:
            int r6 = r1.mTimeBarPercentage
            if (r6 != r10) goto L_0x03d2
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 312(0x138, float:4.37E-43)
            r6.setIntOption(r11, r10)
        L_0x03d2:
            long r13 = r1.mALogWriteAddr
            r15 = 0
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 <= 0) goto L_0x03ea
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 231(0xe7, float:3.24E-43)
            long r13 = r1.mALogWriteAddr
            r6.setLongOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 223(0xdf, float:3.12E-43)
            r6.setIntOption(r11, r10)
        L_0x03ea:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 94
            int r13 = r1.mSetTrackVolume
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 95
            int r13 = r1.mMovPreferNearestSample
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 96
            int r13 = r1.mSkipFfmpegFindStreamInfo
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 134(0x86, float:1.88E-43)
            int r13 = r1.mMaxFps
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 192(0xc0, float:2.69E-43)
            int r13 = r1.mKsyFrameWait
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 165(0xa5, float:2.31E-43)
            int r13 = r1.mSuperRes
            r6.setIntOption(r11, r13)
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            if (r6 == 0) goto L_0x042b
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            int r11 = r1.mSuperRes
            r6.mo112320N(r11)
        L_0x042b:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 166(0xa6, float:2.33E-43)
            int r13 = r1.mSuperResFxaa
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 167(0xa7, float:2.34E-43)
            int r13 = r1.mSuperResStrengh
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 199(0xc7, float:2.79E-43)
            int r13 = r1.mSkipAudioGraph
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 88
            int r13 = r1.mMediaCodecRender
            r6.setIntOption(r11, r13)
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            if (r6 == 0) goto L_0x045a
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            int r11 = r1.mMediaCodecRender
            r6.mo112321O(r11)
        L_0x045a:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 97
            int r13 = r1.mUseMediacodecAudio
            r6.setIntOption(r11, r13)
            int r6 = r1.mEnableVolumeBalance
            if (r6 != r10) goto L_0x0494
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 302(0x12e, float:4.23E-43)
            int r13 = r1.mEnableVolumeBalance
            r6.setIntOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 303(0x12f, float:4.25E-43)
            float r13 = r1.mAEPreGain
            r6.setFloatOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 304(0x130, float:4.26E-43)
            float r13 = r1.mAEThreshold
            r6.setFloatOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 306(0x132, float:4.29E-43)
            float r13 = r1.mAEPredelay
            r6.setFloatOption(r11, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 305(0x131, float:4.27E-43)
            float r13 = r1.mAERatio
            r6.setFloatOption(r11, r13)
        L_0x0494:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$j r11 = new com.ss.ttvideoengine.TTVideoEngine$j
            r11.<init>(r1)
            r6.setOnPreparedListener(r11)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$b r11 = new com.ss.ttvideoengine.TTVideoEngine$b
            r11.<init>(r1)
            r6.setOnBufferingUpdateListener(r11)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$c r11 = new com.ss.ttvideoengine.TTVideoEngine$c
            r11.<init>(r1)
            r6.setOnCompletionListener(r11)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$e r11 = new com.ss.ttvideoengine.TTVideoEngine$e
            r11.<init>(r1)
            r6.setOnErrorListener(r11)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$l r11 = new com.ss.ttvideoengine.TTVideoEngine$l
            r11.<init>(r1)
            r6.setOnSeekCompleteListener(r11)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$g r11 = new com.ss.ttvideoengine.TTVideoEngine$g
            r11.<init>(r1)
            r6.setOnInfoListener(r11)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$i r11 = new com.ss.ttvideoengine.TTVideoEngine$i
            r11.<init>(r1)
            r6.setOnVideoSizeChangedListener(r11)
            android.view.SurfaceHolder r6 = r1.mSurfaceHolder
            if (r6 == 0) goto L_0x04e5
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            android.view.SurfaceHolder r11 = r1.mSurfaceHolder
            r6.setDisplay(r11)
        L_0x04e5:
            android.view.Surface r6 = r1.mSurface
            if (r6 == 0) goto L_0x04ee
            android.view.Surface r6 = r1.mSurface
            r1.setSurfaceHook(r6)
        L_0x04ee:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r6.setScreenOnWhilePlaying(r10)
            boolean r6 = r1.mIsMute
            r1._setPlayerMute(r6)
            r1.mPrepared = r9
            goto L_0x054c
        L_0x04fb:
            com.ss.ttvideoengine.i.c r6 = r1.mError
            if (r6 != 0) goto L_0x0503
            boolean r6 = r1.mSwitchingResolution
            if (r6 == 0) goto L_0x054c
        L_0x0503:
            java.lang.String r6 = "TTVideoEngine"
            java.lang.String r13 = "mediaPlayer reset, surface holder empty:%b ,surace empty:%b"
            java.lang.Object[] r14 = new java.lang.Object[r8]
            android.view.SurfaceHolder r15 = r1.mSurfaceHolder
            if (r15 != 0) goto L_0x050f
            r15 = 1
            goto L_0x0510
        L_0x050f:
            r15 = 0
        L_0x0510:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r14[r9] = r15
            android.view.Surface r15 = r1.mSurface
            if (r15 != 0) goto L_0x051c
            r15 = 1
            goto L_0x051d
        L_0x051c:
            r15 = 0
        L_0x051d:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r14[r10] = r15
            java.lang.String r13 = com.C1642a.m8034a(r13, r14)
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r6, r13)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r6.reset()
            android.view.SurfaceHolder r6 = r1.mSurfaceHolder
            if (r6 == 0) goto L_0x053a
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            android.view.SurfaceHolder r13 = r1.mSurfaceHolder
            r6.setDisplay(r13)
        L_0x053a:
            android.view.Surface r6 = r1.mSurface
            if (r6 == 0) goto L_0x0543
            android.view.Surface r6 = r1.mSurface
            r1.setSurfaceHook(r6)
        L_0x0543:
            r1.mPrepared = r9
            r1.mError = r3
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r6.setIntOption(r11, r9)
        L_0x054c:
            java.lang.String r6 = r1.mUsingDataLoaderPlayTaskKey
            if (r6 == 0) goto L_0x057b
            int r6 = r1.mDataLoaderEnable
            if (r6 <= 0) goto L_0x057b
            java.lang.String r6 = r1.mUsingDataLoaderPlayTaskKey
            long r13 = getCacheFileSize(r6)
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            if (r6 == 0) goto L_0x0563
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            r6.mo112423r(r13)
        L_0x0563:
            com.ss.ttvideoengine.y r6 = r1.mVideoEngineInfoListener
            if (r6 == 0) goto L_0x057b
            com.ss.ttvideoengine.z r6 = r1.mVideoEngineInfos
            if (r6 == 0) goto L_0x057b
            com.ss.ttvideoengine.z r6 = r1.mVideoEngineInfos
            java.lang.String r11 = "mdlhitcachesize"
            r6.f118723a = r11
            com.ss.ttvideoengine.z r6 = r1.mVideoEngineInfos
            java.lang.String r11 = r1.mUsingDataLoaderPlayTaskKey
            r6.f118726d = r11
            com.ss.ttvideoengine.z r6 = r1.mVideoEngineInfos
            r6.f118727e = r13
        L_0x057b:
            boolean r6 = r1.mPrepared
            if (r6 != 0) goto L_0x060c
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r6 = r6.getPlayerType()
            if (r6 == r10) goto L_0x059f
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r6 = r6.getPlayerType()
            if (r6 == r8) goto L_0x059f
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r6 = r6.getPlayerType()
            if (r6 == r4) goto L_0x059f
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r6 = r6.getPlayerType()
            if (r6 != r2) goto L_0x060c
        L_0x059f:
            boolean r2 = r1.mIsPreloaderItem
            r6 = 17
            if (r2 == 0) goto L_0x05ca
            com.ss.ttvideoengine.g.a r2 = r1.mPreloaderItem
            if (r2 == 0) goto L_0x05ca
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r0.setIntOption(r12, r10)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            com.ss.ttvideoengine.g.a r2 = r1.mPreloaderItem
            java.lang.String r2 = r2.f117985d
            r0.setStringOption(r6, r2)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            com.ss.ttvideoengine.g.a r2 = r1.mPreloaderItem
            java.lang.String r2 = r2.f117984c
            r0.setCacheFile(r2, r10)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 18
            r6 = 20
            r0.setIntOption(r2, r6)
            goto L_0x060c
        L_0x05ca:
            int r2 = r1.mCacheFileEnable
            if (r2 != r10) goto L_0x060c
            int r2 = r1.mUseExternalDir
            if (r2 != r10) goto L_0x060c
            if (r0 == 0) goto L_0x060c
            int r0 = r1.mDataLoaderEnable
            if (r0 > 0) goto L_0x060c
            java.lang.String r0 = r17.getFilePath()
            java.lang.String r2 = r17.getMediaFileKey()
            if (r0 == 0) goto L_0x0603
            if (r2 == 0) goto L_0x0603
            com.ss.ttm.player.MediaPlayer r8 = r1.mMediaPlayer
            r8.setIntOption(r12, r10)
            com.ss.ttm.player.MediaPlayer r8 = r1.mMediaPlayer
            r8.setStringOption(r6, r2)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r6.setCacheFile(r0, r10)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r8 = 19
            int r11 = r1.mMaxFileCacheSize
            r6.setIntOption(r8, r11)
            com.ss.ttvideoengine.x r6 = com.p280ss.ttvideoengine.C46169x.m145029a()
            r6.mo112470a(r2, r0)
        L_0x0603:
            com.ss.ttvideoengine.log.c r6 = r1.mLogger
            int r8 = r1.mCacheFileEnable
            java.lang.String r11 = r1.mCacheDir
            r6.mo112331a(r8, r11, r0, r2)
        L_0x060c:
            boolean r0 = r1.mIsLocal
            if (r0 != 0) goto L_0x06e4
            boolean r0 = r1.mIsDirectURL
            if (r0 != 0) goto L_0x06e4
            boolean r0 = r1.mIsPlayItem
            if (r0 != 0) goto L_0x06e4
            boolean r0 = r1.mIsPreloaderItem
            if (r0 != 0) goto L_0x06e4
            com.ss.ttvideoengine.e.g r0 = r1.currentVideoInfo
            if (r0 == 0) goto L_0x06e4
            com.ss.ttvideoengine.e.g r0 = r1.currentVideoInfo
            int r0 = r0.f117802B
            com.ss.ttvideoengine.e.g r2 = r1.currentVideoInfo
            int r2 = r2.mo112216a(r4)
            com.ss.ttvideoengine.e.g r6 = r1.currentVideoInfo
            r8 = 6
            java.lang.String r6 = r6.mo112220b(r8)
            com.ss.ttvideoengine.e.g r8 = r1.currentVideoInfo
            r11 = 31
            java.lang.String r8 = r8.mo112220b(r11)
            boolean r11 = r1.mCheckHijack
            if (r11 == 0) goto L_0x0645
            boolean r11 = android.text.TextUtils.isEmpty(r8)
            if (r11 != 0) goto L_0x0645
            r11 = 1
            goto L_0x0646
        L_0x0645:
            r11 = 0
        L_0x0646:
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 != 0) goto L_0x067b
            java.lang.String r12 = "dash"
            boolean r12 = r6.equals(r12)
            if (r12 != 0) goto L_0x065c
            java.lang.String r12 = "mpd"
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto L_0x067b
        L_0x065c:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r12 = com.p280ss.ttvideoengine.p1812e.C46084i.f117863a
            if (r0 != r12) goto L_0x0665
            r12 = 130(0x82, float:1.82E-43)
            goto L_0x0667
        L_0x0665:
            r12 = 131(0x83, float:1.84E-43)
        L_0x0667:
            r6.setIntOption(r12, r2)
            if (r11 == 0) goto L_0x0688
            com.ss.ttm.player.MediaPlayer r2 = r1.mMediaPlayer
            int r6 = com.p280ss.ttvideoengine.p1812e.C46084i.f117863a
            if (r0 != r6) goto L_0x0675
            r0 = 202(0xca, float:2.83E-43)
            goto L_0x0677
        L_0x0675:
            r0 = 203(0xcb, float:2.84E-43)
        L_0x0677:
            r2.setStringOption(r0, r8)
            goto L_0x0688
        L_0x067b:
            if (r11 == 0) goto L_0x0684
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 202(0xca, float:2.83E-43)
            r0.setStringOption(r2, r8)
        L_0x0684:
            r1.mDashEnabled = r9
            r1.mIsDashSource = r9
        L_0x0688:
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 246(0xf6, float:3.45E-43)
            boolean r6 = r1.mHijackRetry
            r6 = r6 ^ r10
            r0.setIntOption(r2, r6)
            com.ss.ttvideoengine.log.c r0 = r1.mLogger
            r0.mo112402l(r11)
            boolean r0 = r1.mUsePlayer3
            if (r0 != 0) goto L_0x06e8
            int r0 = r1.mHardwareDecodeEnablePlayer2
            if (r0 != r10) goto L_0x06e8
            int r0 = r1.mCodecId
            com.ss.ttvideoengine.e.g r2 = r1.currentVideoInfo
            r6 = 8
            java.lang.String r2 = r2.mo112220b(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L_0x06c2
            java.lang.String r6 = "h264"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x06b9
            r0 = 0
            goto L_0x06c2
        L_0x06b9:
            java.lang.String r6 = "h265"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x06c2
            r0 = 1
        L_0x06c2:
            java.lang.String r2 = "TTVideoEngine"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "videoInfo codec id = "
            r6.<init>(r8)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r2, r6)
            com.ss.ttm.player.MediaPlayer r2 = r1.mMediaPlayer
            r6 = 182(0xb6, float:2.55E-43)
            r2.setIntOption(r6, r0)
            com.ss.ttvideoengine.log.c r2 = r1.mLogger
            int r6 = r1.mAsyncInitEnable
            r2.mo112327a(r6, r0)
            goto L_0x06e8
        L_0x06e4:
            r1.mDashEnabled = r9
            r1.mIsDashSource = r9
        L_0x06e8:
            boolean r0 = r1.mPrepared
            if (r0 != 0) goto L_0x07c9
            boolean r0 = r1.mIsLocal
            r2 = 64
            r6 = -9987(0xffffffffffffd8fd, float:NaN)
            if (r0 != 0) goto L_0x06f8
            boolean r0 = r1.mIsDirectURL
            if (r0 == 0) goto L_0x0723
        L_0x06f8:
            java.lang.String r0 = r1.mDecryptionKey
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0723
            com.ss.ttvideoengine.log.c r0 = r1.mLogger
            java.lang.String r8 = r1.mDecryptionKey
            r0.mo112434w(r8)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            int r0 = r0.getPlayerType()
            if (r0 != 0) goto L_0x071c
            com.ss.ttvideoengine.i.c r0 = new com.ss.ttvideoengine.i.c
            java.lang.String r2 = "kTTVideoErrorDomainVideoOSPlayer"
            java.lang.String r3 = "OS player can't dec encryted video"
            r0.<init>(r2, r6, r3)
            r1._receivedError(r0)
            return
        L_0x071c:
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            java.lang.String r8 = r1.mDecryptionKey
            r0.setStringOption(r2, r8)
        L_0x0723:
            boolean r0 = r1.mDashEnabled
            if (r0 == 0) goto L_0x0732
            com.ss.ttvideoengine.e.h r0 = r1.mVideoModel
            if (r0 == 0) goto L_0x0766
            com.ss.ttvideoengine.e.h r0 = r1.mVideoModel
            java.lang.String r0 = r0.mo112237c()
            goto L_0x0767
        L_0x0732:
            boolean r0 = r1.mIsLocal
            if (r0 != 0) goto L_0x075b
            boolean r0 = r1.mIsPlayItem
            if (r0 != 0) goto L_0x075b
            boolean r0 = r1.mIsPreloaderItem
            if (r0 != 0) goto L_0x075b
            boolean r0 = r1.mIsDirectURL
            if (r0 != 0) goto L_0x075b
            com.ss.ttvideoengine.e.g r0 = r1.currentVideoInfo
            if (r0 == 0) goto L_0x075b
            com.ss.ttvideoengine.e.g r0 = r1.currentVideoInfo
            r8 = 5
            java.lang.String r0 = r0.mo112220b(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x075b
            com.ss.ttvideoengine.e.g r0 = r1.currentVideoInfo
            r8 = 5
            java.lang.String r0 = r0.mo112220b(r8)
            goto L_0x0767
        L_0x075b:
            java.lang.String r0 = r1.mSpadea
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0766
            java.lang.String r0 = r1.mSpadea
            goto L_0x0767
        L_0x0766:
            r0 = r3
        L_0x0767:
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 != 0) goto L_0x07c9
            com.ss.ttvideoengine.log.c r8 = r1.mLogger
            r8.mo112434w(r0)
            com.ss.ttm.player.MediaPlayer r8 = r1.mMediaPlayer
            int r8 = r8.getPlayerType()
            if (r8 != 0) goto L_0x0787
            com.ss.ttvideoengine.i.c r0 = new com.ss.ttvideoengine.i.c
            java.lang.String r2 = "kTTVideoErrorDomainVideoOSPlayer"
            java.lang.String r3 = "OS player can't dec encryted video"
            r0.<init>(r2, r6, r3)
            r1._receivedError(r0)
            return
        L_0x0787:
            boolean r6 = r1.mUsePlayerSpade
            if (r6 != 0) goto L_0x07c2
            byte[] r0 = com.p280ss.ttvideoengine.p1816i.C46122g.m144533b(r0)
            java.lang.String r6 = "encryption null"
            java.lang.String r0 = com.p280ss.ttvideoengine.JniUtils.m144206a(r0)     // Catch:{ Throwable -> 0x0796 }
            goto L_0x079d
        L_0x0796:
            r0 = move-exception
            r6 = r0
            java.lang.String r6 = r6.toString()
            r0 = r3
        L_0x079d:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x07bc
            com.ss.ttvideoengine.i.c r0 = new com.ss.ttvideoengine.i.c
            com.ss.ttm.player.MediaPlayer r2 = r1.mMediaPlayer
            boolean r2 = r2.isOSPlayer()
            if (r2 == 0) goto L_0x07b0
            java.lang.String r2 = "kTTVideoErrorDomainVideoOSPlayer"
            goto L_0x07b2
        L_0x07b0:
            java.lang.String r2 = "kTTVideoErrorDomainVideoOwnPlayer"
        L_0x07b2:
            r3 = -9988(0xffffffffffffd8fc, float:NaN)
            r4 = -1
            r0.<init>(r2, r3, r4, r6)
            r1._receivedError(r0)
            return
        L_0x07bc:
            com.ss.ttm.player.MediaPlayer r3 = r1.mMediaPlayer
            r3.setStringOption(r2, r0)
            goto L_0x07c9
        L_0x07c2:
            com.ss.ttm.player.MediaPlayer r2 = r1.mMediaPlayer
            r3 = 144(0x90, float:2.02E-43)
            r2.setStringOption(r3, r0)
        L_0x07c9:
            r2 = -9992(0xffffffffffffd8f8, float:NaN)
            java.lang.String r0 = "TTVideoEngine"
            java.lang.String r3 = "set screen on"
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r0, r3)     // Catch:{ Throwable -> 0x094c }
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer     // Catch:{ Throwable -> 0x094c }
            r0.setScreenOnWhilePlaying(r10)     // Catch:{ Throwable -> 0x094c }
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer     // Catch:{ Throwable -> 0x094c }
            boolean r3 = r1.mLooping     // Catch:{ Throwable -> 0x094c }
            r0.setLooping(r3)     // Catch:{ Throwable -> 0x094c }
            java.io.FileDescriptor r0 = r1.mPlayFd     // Catch:{ Throwable -> 0x094c }
            if (r0 == 0) goto L_0x07ee
            com.ss.ttm.player.MediaPlayer r8 = r1.mMediaPlayer     // Catch:{ Throwable -> 0x094c }
            java.io.FileDescriptor r9 = r1.mPlayFd     // Catch:{ Throwable -> 0x094c }
            long r10 = r1.mPipeOffset     // Catch:{ Throwable -> 0x094c }
            long r12 = r1.mPipeLength     // Catch:{ Throwable -> 0x094c }
            r8.setDataSource(r9, r10, r12)     // Catch:{ Throwable -> 0x094c }
            goto L_0x07fd
        L_0x07ee:
            com.ss.ttm.player.IMediaDataSource r0 = r1.mMediaDataSource     // Catch:{ Throwable -> 0x094c }
            if (r0 == 0) goto L_0x07fa
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer     // Catch:{ Throwable -> 0x094c }
            com.ss.ttm.player.IMediaDataSource r3 = r1.mMediaDataSource     // Catch:{ Throwable -> 0x094c }
            r0.setDataSource(r3)     // Catch:{ Throwable -> 0x094c }
            goto L_0x07fd
        L_0x07fa:
            r17._setDataSource(r18, r19)     // Catch:{ Throwable -> 0x094c }
        L_0x07fd:
            boolean r0 = r17.isSystemPlayer()
            if (r0 != 0) goto L_0x08b7
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            int r3 = r1.mStartTime
            r0.setIntOption(r7, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 154(0x9a, float:2.16E-43)
            int r5 = r1.mReuseSocket
            r0.setIntOption(r3, r5)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 137(0x89, float:1.92E-43)
            int r5 = r1.mLoopStartTime
            r0.setIntOption(r3, r5)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 138(0x8a, float:1.93E-43)
            int r5 = r1.mLoopEndTime
            r0.setIntOption(r3, r5)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 193(0xc1, float:2.7E-43)
            int r5 = r1.mLoopCount
            r0.setIntOption(r3, r5)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 143(0x8f, float:2.0E-43)
            int r5 = r1.mSeekEndEnabled
            r0.setIntOption(r3, r5)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 206(0xce, float:2.89E-43)
            int r5 = r1.mDrmType
            r0.setIntOption(r3, r5)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 208(0xd0, float:2.91E-43)
            int r5 = r1.mDrmDowngrade
            r0.setIntOption(r3, r5)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 241(0xf1, float:3.38E-43)
            int r5 = r1.mEnableIndexCache
            r0.setIntOption(r3, r5)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 242(0xf2, float:3.39E-43)
            int r5 = r1.mEnableFragRange
            r0.setIntOption(r3, r5)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 243(0xf3, float:3.4E-43)
            int r5 = r1.mVideoRangeSize
            r0.setIntOption(r3, r5)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 244(0xf4, float:3.42E-43)
            int r5 = r1.mAudioRangeSize
            r0.setIntOption(r3, r5)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 250(0xfa, float:3.5E-43)
            int r5 = r1.mIsTTHlsDrm
            r0.setIntOption(r3, r5)
            java.lang.String r0 = r1.mVideoID
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0887
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 205(0xcd, float:2.87E-43)
            java.lang.String r5 = r1.mVideoID
            r0.setStringOption(r3, r5)
        L_0x0887:
            java.lang.String r0 = r1.mTokenUrlTemplate
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0898
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 207(0xcf, float:2.9E-43)
            java.lang.String r5 = r1.mTokenUrlTemplate
            r0.setStringOption(r3, r5)
        L_0x0898:
            java.lang.String r0 = r1.mTTHlsDrmToken
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x08a9
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r3 = 249(0xf9, float:3.49E-43)
            java.lang.String r5 = r1.mTTHlsDrmToken
            r0.setStringOption(r3, r5)
        L_0x08a9:
            com.ss.ttvideoengine.log.c r0 = r1.mLogger
            int r3 = r1.mDrmType
            r0.mo112398k(r3)
            com.ss.ttvideoengine.log.c r0 = r1.mLogger
            java.lang.String r3 = r1.mTokenUrlTemplate
            r0.mo112412n(r3)
        L_0x08b7:
            boolean r0 = r1.mSwitchingResolution
            if (r0 != 0) goto L_0x08bf
            boolean r0 = r1.mRetrying
            if (r0 == 0) goto L_0x08c6
        L_0x08bf:
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            int r3 = r1.mLastPlaybackTime
            r0.setIntOption(r7, r3)
        L_0x08c6:
            java.lang.String r0 = r1.mDirectURL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x08e4
            java.lang.String r0 = r1.mLocalURL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x08e4
            com.ss.ttvideoengine.Resolution r0 = r1.currentResolution
            java.lang.String r0 = r1._resolutionToString(r0)
            r1._logFirstResolution(r0)
            java.lang.String r0 = r1.mCurrentQuality
            r1._logFirstQuality(r0)
        L_0x08e4:
            boolean r0 = r1.mPrepared
            if (r0 != 0) goto L_0x093c
            com.ss.ttm.player.PlaybackParams r0 = r1.mPlaybackParams
            if (r0 == 0) goto L_0x0900
            boolean r0 = r17.isSystemPlayer()
            if (r0 != 0) goto L_0x0900
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            com.ss.ttm.player.PlaybackParams r3 = r1.mPlaybackParams
            r0.setPlaybackParams(r3)
            com.ss.ttvideoengine.log.c r0 = r1.mLogger
            com.ss.ttm.player.PlaybackParams r3 = r1.mPlaybackParams
            r0.mo112334a(r3)
        L_0x0900:
            android.view.Surface r0 = r1.mSurface
            if (r0 == 0) goto L_0x0909
            android.view.Surface r0 = r1.mSurface
            r1.setSurfaceHook(r0)
        L_0x0909:
            com.ss.ttvideoengine.log.c r0 = r1.mLogger     // Catch:{ Exception -> 0x0921 }
            if (r0 == 0) goto L_0x0912
            com.ss.ttvideoengine.log.c r0 = r1.mLogger     // Catch:{ Exception -> 0x0921 }
            r0.mo112324a()     // Catch:{ Exception -> 0x0921 }
        L_0x0912:
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer     // Catch:{ Exception -> 0x0921 }
            r0.prepareAsync()     // Catch:{ Exception -> 0x0921 }
            com.ss.ttvideoengine.aa r0 = r1.mVideoEngineListener
            if (r0 == 0) goto L_0x0949
            com.ss.ttvideoengine.aa r0 = r1.mVideoEngineListener
            r0.onPrepare(r1)
            goto L_0x0949
        L_0x0921:
            r0 = move-exception
            com.ss.ttvideoengine.i.c r3 = new com.ss.ttvideoengine.i.c
            com.ss.ttm.player.MediaPlayer r4 = r1.mMediaPlayer
            boolean r4 = r4.isOSPlayer()
            if (r4 == 0) goto L_0x092f
            java.lang.String r4 = "kTTVideoErrorDomainVideoOSPlayer"
            goto L_0x0931
        L_0x092f:
            java.lang.String r4 = "kTTVideoErrorDomainVideoOwnPlayer"
        L_0x0931:
            java.lang.String r0 = r0.toString()
            r3.<init>(r4, r2, r0)
            r1._receivedError(r3)
            return
        L_0x093c:
            com.ss.ttvideoengine.log.c r0 = r1.mLogger
            r0.mo112324a()
            com.ss.ttvideoengine.log.c r0 = r1.mLogger
            r0.mo112347b()
            r17._resumeVideo()
        L_0x0949:
            r1.mState = r4
            return
        L_0x094c:
            r0 = move-exception
            com.ss.ttvideoengine.i.c r3 = new com.ss.ttvideoengine.i.c
            com.ss.ttm.player.MediaPlayer r4 = r1.mMediaPlayer
            boolean r4 = r4.isOSPlayer()
            if (r4 == 0) goto L_0x095a
            java.lang.String r4 = "kTTVideoErrorDomainVideoOSPlayer"
            goto L_0x095c
        L_0x095a:
            java.lang.String r4 = "kTTVideoErrorDomainVideoOwnPlayer"
        L_0x095c:
            java.lang.String r0 = r0.toString()
            r3.<init>(r4, r2, r0)
            r1._receivedError(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.TTVideoEngine._playInternal(java.lang.String, java.util.HashMap):void");
    }

    public static void cancelAllPreloadTasks() {
        C46059d.m144301a().mo112187f();
    }

    public static void clearAllCaches() {
        C46059d.m144301a().mo112189g();
    }

    public static void closeDataLoader() {
        C46059d.m144301a().mo112183d();
    }

    public C46141a getVideoEngineDataSource() {
        return new C46023h(this);
    }

    public float getVolume() {
        return C46122g.m144531b(this.mContext);
    }

    private int _getPlayerTime() {
        if (this.mMediaPlayer == null) {
            return 0;
        }
        return this.mMediaPlayer.getCurrentPosition();
    }

    public static boolean dataLoaderIsRunning() {
        return C46059d.m144301a().mo112181c();
    }

    public synchronized void createPlayer() {
        if (this.mAsyncPlayer == null) {
            this.mAsyncPlayer = _createPlayer();
        }
    }

    public String getCurrentPlayPath() {
        if (this.mIsLocal) {
            return this.mLocalURL;
        }
        return this.mURLInfo.f117577a;
    }

    public int getVideoHeight() {
        if (this.mMediaPlayer == null) {
            return 0;
        }
        return this.mMediaPlayer.getVideoHeight();
    }

    public int getVideoWidth() {
        if (this.mMediaPlayer == null) {
            return 0;
        }
        return this.mMediaPlayer.getVideoWidth();
    }

    public int getWatchedDuration() {
        if (this.mPlayDuration != null) {
            return this.mPlayDuration.mo112293c();
        }
        return 0;
    }

    public boolean isMute() {
        if (this.mMediaPlayer != null) {
            return this.mMediaPlayer.isMute();
        }
        return this.mIsMute;
    }

    public void pauseByInterruption() {
        C46123h.m144545a("TTVideoEngine", "pause by interruption");
        _pauseByInterruption();
    }

    private void _logFirstFrame() {
        if (!this.mHasFirstFrameShown) {
            this.mHasFirstFrameShown = true;
            if (this.mLogger != null) {
                this.mVVTime = System.currentTimeMillis();
                this.mLogger.mo112360c();
            }
        }
    }

    private void _resetUrlIndexMap() {
        Resolution[] allResolutions = Resolution.getAllResolutions();
        for (Resolution put : allResolutions) {
            this.urlIndexMap.put(put, Integer.valueOf(0));
        }
    }

    private void createCacheFileDirectory() {
        File file = new File(this.mDefaultCacheDir);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static synchronized void releaseTextureRender() {
        synchronized (TTVideoEngine.class) {
            try {
                TextureRenderManager.getManager().release();
            } catch (NullPointerException unused) {
            }
        }
    }

    public int getCurrentPlaybackTime() {
        int i;
        if (this.mSwitchingResolution) {
            i = this.mLastPlaybackTime;
        } else {
            i = _getPlayerTime();
        }
        setPlayInfo(1, (long) i);
        setPlayInfo(5, -1);
        return i;
    }

    public float getMaxVolume() {
        int i;
        if (this.mContext == null) {
            return 0.0f;
        }
        AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
        if (audioManager != null) {
            i = audioManager.getStreamMaxVolume(3);
        } else {
            i = 0;
        }
        if (i < 0) {
            i = 0;
        }
        return (float) i;
    }

    public boolean isSystemPlayer() {
        if (this.mMediaPlayer != null) {
            return this.mMediaPlayer.isOSPlayer();
        }
        if (this.mPlayerType == 2) {
            return true;
        }
        return false;
    }

    public void pause() {
        C46123h.m144545a("TTVideoEngine", "pause");
        this.mShouldPlay = false;
        _pause();
        this.mPauseStartT = SystemClock.elapsedRealtime();
        if (this.mPlayDuration != null) {
            this.mPlayDuration.mo112292b();
        }
    }

    public Resolution[] supportedResolutionTypes() {
        if (this.mIsPreloaderItem && this.mPreloaderItem != null) {
            return this.mPreloaderItem.mo112281a();
        }
        if (this.mVideoModel != null) {
            return this.mVideoModel.mo112243g();
        }
        return new Resolution[0];
    }

    private Map _getCommentInfo() {
        if (this.mMediaPlayer == null) {
            return null;
        }
        String stringOption = this.mMediaPlayer.getStringOption(47);
        HashMap hashMap = new HashMap();
        if (stringOption != null) {
            for (String split : stringOption.replaceAll(" ", "").split(",")) {
                String[] split2 = split.split(":");
                if (split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        return hashMap;
    }

    private void _pause() {
        C46123h.m144545a("TTVideoEngine", "_pause");
        if (!this.mPrepared) {
            this.mPausedBeforePrepared = true;
            _updatePlaybackState(2);
            return;
        }
        if (this.mMediaPlayer != null) {
            C46123h.m144545a("TTVideoEngine", "player will pause");
            if (this.mTextureSurface != null) {
                this.mTextureSurface.pause(true);
            }
            this.mMediaPlayer.pause();
            _updatePlaybackState(2);
        }
    }

    private void _pauseByInterruption() {
        C46123h.m144545a("TTVideoEngine", "_pause ");
        if (!this.mPrepared) {
            this.mPausedBeforePrepared = true;
            return;
        }
        if (this.mMediaPlayer != null) {
            C46123h.m144545a("TTVideoEngine", "player will pause by interruption");
            this.mMediaPlayer.pause();
            this.mPlaybackState = 2;
        }
    }

    private void _reset() {
        C46123h.m144545a("TTVideoEngine", "reset");
        this.mShouldPlay = false;
        this.mIsFetchingInfo = false;
        this.mHeaders.clear();
        _stop(true, 6);
        if (this.mMediaPlayer != null) {
            if (this.mHardwareDecodeEnablePlayer2 == 1) {
                setSurfaceHook(null);
            }
            if (this.mTextureSurface != null) {
                this.mTextureSurface.pause(false);
            }
            this.mMediaPlayer.reset();
            this.mPrepared = false;
        }
        this.mHasFirstFrameShown = false;
        this.mHttpsEnabled = false;
        this.mRetryEnableHttps = false;
        this.mHijackRetry = false;
        this.mLogger.mo112397k();
    }

    private void _settingCongureWithPlayer() {
        if ((this.mSettingMask & 4) == 0) {
            this.mBufferTimeout = C46111a.m144490a(this.mContext).f117991a.f117997a;
            C46123h.m144545a("TTVideoEngine", C1642a.m8034a("==========mBufferTimeout:%d", new Object[]{Integer.valueOf(this.mBufferTimeout)}));
        }
    }

    private void _tryNextURL() {
        this.urlIndexMap.put(this.currentResolution, Integer.valueOf(((Integer) this.urlIndexMap.get(this.currentResolution)).intValue() + 1));
        _parseIPAddress(this.mVideoModel);
    }

    private boolean deleteCacheFile() {
        String filePath = getFilePath();
        if (filePath == null || filePath.length() == 0) {
            return true;
        }
        File file = new File(filePath);
        try {
            if (file.isFile() && file.delete()) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private String getDefaultCacheFileDirPath() {
        String c = C46122g.m144535c(this.mContext);
        if (c == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(File.separator);
        sb.append("mediattmp");
        return sb.toString();
    }

    public JSONObject getPlayErrorInfo() {
        String str;
        try {
            if (this.mMediaPlayer != null) {
                if (this.mMediaPlayer.getIntOption(5000, 0) != 0) {
                    new StringBuilder();
                    JSONObject jSONObject = new JSONObject();
                    new StringBuilder();
                    String stringOption = this.mMediaPlayer.getStringOption(5001);
                    if (this.mMediaPlayer.getIntOption(26, 1) == 1) {
                        str = "breakpad crash";
                    } else {
                        str = "simple crash";
                    }
                    jSONObject.put(str, stringOption);
                    return jSONObject;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void play() {
        C46123h.m144545a("TTVideoEngine", "play");
        this.mShouldPlay = true;
        this.mUserStopped = false;
        this.mAccumulatedErrorCount = 0;
        if (this.mVideoModel != null) {
            this.mVideoModel.mo112229a(this.mResolutionMap);
        }
        _play();
        this.mIsPlayComplete = false;
        if (this.mPauseStartT != 0 && this.mLogger != null) {
            this.mLogger.mo112395j(SystemClock.elapsedRealtime() - this.mPauseStartT);
        }
    }

    public void prepare() {
        C46123h.m144545a("TTVideoEngine", "prepare");
        this.mIsStartPlayAutomatically = false;
        this.mShouldPlay = true;
        this.mUserStopped = false;
        this.mAccumulatedErrorCount = 0;
        if (this.mVideoModel != null) {
            this.mVideoModel.mo112229a(this.mResolutionMap);
        }
        _play();
        this.mIsPlayComplete = false;
    }

    public void start() {
        C46123h.m144545a("TTVideoEngine", "start");
        this.mShouldPlay = true;
        this.mUserStopped = false;
        this.mAccumulatedErrorCount = 0;
        _play();
        this.mIsPlayComplete = false;
        if (this.mPauseStartT != 0 && this.mLogger != null) {
            this.mLogger.mo112395j(SystemClock.elapsedRealtime() - this.mPauseStartT);
        }
    }

    private void _ShutdownOldSource() {
        this.mIsLocal = false;
        this.mIsDirectURL = false;
        this.mIsPreloaderItem = false;
        this.mIsPlayItem = false;
        this.mIsFeedInfo = false;
        if (this.mMediaPlayer != null && this.mMediaPlayer.getPlayerType() == 0) {
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
        }
        _reset();
        this.mState = 0;
        this.currentVideoInfo = null;
        this.mVideoModel = null;
        this.mDirectURL = null;
        this.mLocalURL = null;
        this.mVideoID = null;
        this.mPlayFd = null;
        this.mDirectURL = null;
        this.mTextureFirstFrame = false;
        this.mNotifyFirstFrame = false;
        this.mPrepared = false;
        this.mHasFirstFrameShown = false;
        this.mPlayDuration.mo112295e();
        this.mIsPlayComplete = false;
        this.mDecodedVideoFirstFrame = false;
    }

    private void _play() {
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("_play, mState:%d", new Object[]{Integer.valueOf(this.mState)}));
        this.mStarted = true;
        this.mPausedBeforePrepared = false;
        switch (this.mState) {
            case 0:
            case 4:
                _prepareToPlay();
                return;
            case 1:
                if (this.mVideoModel == null) {
                    if (!this.mIsFetchingInfo) {
                        _prepareToPlay();
                    }
                    return;
                }
                if (!this.mIsPreloaderItem || this.mPreloaderItem == null) {
                    _logBeginToPlay(this.mVideoID);
                } else {
                    _logBeginToPlay(this.mPreloaderItem.f117982a);
                }
                _parseIPAddress(this.mVideoModel);
                return;
            case 3:
                _replayOrResume();
                break;
        }
    }

    private void _resumeVideo() {
        String str;
        C46123h.m144545a("TTVideoEngine", "resumed video");
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setScreenOnWhilePlaying(true);
            if (this.mPrepared) {
                if (this.mTextureSurface != null) {
                    this.mTextureSurface.pause(false);
                }
                try {
                    _setDataSource(this.mURLInfo.mo112108a(), this.mHeaders);
                    this.mMediaPlayer.start();
                    if (this.mPlayDuration != null) {
                        this.mPlayDuration.mo112291a();
                    }
                    if (this.mMediaPlayer.getIntOption(62, -100) != 0 || (this.mPlaybackState != 0 && !this.mIsPlayComplete)) {
                        _updatePlaybackState(1);
                        return;
                    }
                    _renderStart();
                } catch (Throwable th) {
                    if (this.mMediaPlayer.isOSPlayer()) {
                        str = "kTTVideoErrorDomainVideoOSPlayer";
                    } else {
                        str = "kTTVideoErrorDomainVideoOwnPlayer";
                    }
                    _receivedError(new C46117c(str, -9992, th.toString()));
                }
            } else {
                this.mPausedBeforePrepared = false;
            }
        }
    }

    private boolean _validateVideo() {
        if (this.mPlayAPIVersion >= 2) {
            return true;
        }
        try {
            String b = this.mVideoModel.mo112235b(105);
            boolean z = false;
            if (!TextUtils.isEmpty(b) && !"0".equals(b) && !isSystemPlayer()) {
                z = !this.mVideoID.equals(_getCommentInfo().get("vid"));
            }
            if (z) {
                this.mLogger.mo112371d(new C46117c("kTTVideoErrorDomainVideoOwnPlayer", -9991, "header meta validate failed"));
            }
        } catch (NullPointerException unused) {
        }
        return true;
    }

    private void createDefaultCacheFileDirectory() {
        if (mCreatCacheFileLock.tryLock()) {
            try {
                if (!mIsFirstOpenEngine) {
                    mCreatCacheFileLock.unlock();
                    return;
                }
                mIsFirstOpenEngine = false;
                String defaultCacheFileDirPath = getDefaultCacheFileDirPath();
                File file = new File(defaultCacheFileDirPath);
                if (!file.exists()) {
                    file.mkdirs();
                } else if (file.list() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(defaultCacheFileDirPath);
                    sb.append("tem");
                    final File file2 = new File(sb.toString());
                    file.renameTo(file2);
                    file.mkdirs();
                    C46115b.m144501a((Runnable) new Runnable() {
                        public final void run() {
                            C46122g.m144530a(file2);
                        }
                    });
                }
                C46115b.m144501a((Runnable) new Runnable() {
                    public final void run() {
                        C46122g.m144529a(TTVideoEngine.this.mContext);
                    }
                });
                mCreatCacheFileLock.unlock();
            } catch (Throwable th) {
                mCreatCacheFileLock.unlock();
                throw th;
            }
        }
    }

    private String getFilePath() {
        String str;
        if (this.mIsLocal || this.mIsPlayItem || this.mIsPreloaderItem) {
            return null;
        }
        if (this.mIsDirectURL) {
            return this.mFileKey;
        }
        if (TextUtils.isEmpty(this.mCacheDir) || (this.currentVideoInfo != null && TextUtils.isEmpty(this.currentVideoInfo.mo112220b(15)))) {
            return null;
        }
        String mediaFileKey = getMediaFileKey();
        if (TextUtils.isEmpty(mediaFileKey)) {
            return null;
        }
        if (this.mCacheDir.charAt(this.mCacheDir.length() - 1) == '/') {
            str = C1642a.m8034a("%s%s.ttmp", new Object[]{this.mCacheDir, mediaFileKey});
        } else {
            str = C1642a.m8034a("%s/%s.ttmp", new Object[]{this.mCacheDir, mediaFileKey});
        }
        return str;
    }

    private void setupTextureRender() {
        if (this.mLogger != null) {
            this.mLogger.mo112319M(this.mUseTextureRender);
        }
        this.mTextureRenderer = TextureRenderManager.getManager();
        C46123h.m144545a("TTVideoEngine", "get texture renderer start");
        if (this.mTextureRenderer == null) {
            this.mUseTextureRender = 0;
            C46123h.m144547c("TTVideoEngine", "couldn't get rendererManager");
            return;
        }
        this.mTextureSurface = this.mTextureRenderer.genAvaiableSurface();
        if (this.mTextureSurface == null) {
            this.mUseTextureRender = 0;
            this.mTextureRenderErrorMsg = this.mTextureRenderer.getTextureError();
            StringBuilder sb = new StringBuilder("genOffscreenSurface failed = ");
            sb.append(this.mTextureRenderErrorMsg);
            C46123h.m144547c("TTVideoEngine", sb.toString());
            return;
        }
        this.mTextureSurface.setOnDrawFrameListener(new OnDrawFrameListener() {
            public final void onDraw(long j) {
                if (!TTVideoEngine.this.mTextureFirstFrame && TTVideoEngine.this.mDecodedVideoFirstFrame) {
                    C46123h.m144545a("TTVideoEngine", "recive first frame render from texture");
                    TTVideoEngine.this.mTextureFirstFrame = true;
                }
                if (TTVideoEngine.this.mNotifyFirstFrame && !TTVideoEngine.this.mHasFirstFrameShown && TTVideoEngine.this.mShouldPlay) {
                    StringBuilder sb = new StringBuilder("render start by texture, state =");
                    sb.append(TTVideoEngine.this.mPlaybackState);
                    C46123h.m144545a("TTVideoEngine", sb.toString());
                    TTVideoEngine.this._renderStart();
                }
            }
        });
        StringBuilder sb2 = new StringBuilder("get a surface = ");
        sb2.append(this.mTextureSurface);
        C46123h.m144545a("TTVideoEngine", sb2.toString());
    }

    public void release() {
        C46123h.m144545a("TTVideoEngine", "release");
        if (this.mInfoCollector != null) {
            this.mInfoCollector.mo112119a(this.mSerial);
        }
        this.mShouldPlay = false;
        if (!(this.mLogger == null || this.mExternVideoLoggerListener == null)) {
            this.mLogger.mo112438y(this.mExternVideoLoggerListener.mo88681a(this.mExternLogKey));
        }
        _stop(false, 1);
        if (this.mTextureRenderer != null) {
            if (this.mTextureSurface != null) {
                this.mTextureSurface.release();
                this.mTextureSurface = null;
            }
            this.mTextureRenderer = null;
            C46123h.m144545a("TTVideoEngine", "mTextureRenderer become to null");
        }
        if (this.mMediaPlayer != null) {
            try {
                this.mMediaPlayer.release();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.mMediaPlayer = null;
                throw th;
            }
            this.mMediaPlayer = null;
        }
        this.mPreloaderItem = null;
        this.mIsPreloaderItem = false;
        this.mCachePath = null;
        this.mFileKey = null;
    }

    public void releaseAsync() {
        C46123h.m144545a("TTVideoEngine", "releaseAsync");
        if (this.mInfoCollector != null) {
            this.mInfoCollector.mo112119a(this.mSerial);
        }
        _updateLogger();
        this.mShouldPlay = false;
        _stop(false, 2);
        if (!(this.mLogger == null || this.mExternVideoLoggerListener == null)) {
            this.mLogger.mo112438y(this.mExternVideoLoggerListener.mo88681a(this.mExternLogKey));
        }
        if (this.mMediaPlayer != null && !this.mUsePlayer3) {
            if (this.mSurfaceHolder != null) {
                this.mMediaPlayer.setDisplay(null);
            }
            if (this.mSurface != null) {
                setSurfaceHook(null);
            }
            if (this.mTextureSurface != null) {
                this.mTextureSurface.release();
                this.mTextureSurface = null;
            }
        }
        if (this.mAsyncPlayer != null) {
            this.mAsyncPlayer.release();
            this.mAsyncPlayer = null;
        }
        this.mPreloaderItem = null;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        this.mMediaPlayer = null;
        this.mCachePath = null;
        this.mFileKey = null;
        if (mediaPlayer != null) {
            C46115b.m144501a((Runnable) new C46026k(mediaPlayer));
        }
    }

    public void stop() {
        C46123h.m144545a("TTVideoEngine", "stop");
        this.mShouldPlay = false;
        this.mIsFetchingInfo = false;
        _stop(true, 0);
        if (this.mCleanWhenStop > 0) {
            if (this.mMediaPlayer != null) {
                this.mMediaPlayer.reset();
                this.mPrepared = false;
            }
            if (this.mMediaPlayer != null && this.mMediaPlayer.getPlayerType() == 0) {
                this.mMediaPlayer.release();
                this.mMediaPlayer = null;
            }
            if (this.mAsyncPlayer != null) {
                this.mAsyncPlayer.release();
                this.mAsyncPlayer = null;
            }
            this.mState = 0;
        }
        if (this.mTestNetSpeedHandler != null) {
            this.mTestNetSpeedHandler.removeCallbacks(this.mTestNetSpeedRunable);
        }
    }

    private MediaPlayer _createPlayer() {
        int i;
        if (this.mConfigParams != null) {
            HashMap<Integer, Integer> hashMap = this.mConfigParams;
            int i2 = 1;
            Integer valueOf = Integer.valueOf(1);
            if (this.mPlayerType != 2) {
                i = 1;
            } else {
                i = 0;
            }
            hashMap.put(valueOf, Integer.valueOf(i));
            HashMap<Integer, Integer> hashMap2 = this.mConfigParams;
            Integer valueOf2 = Integer.valueOf(2);
            if (this.mPlayerType != 1) {
                i2 = 0;
            }
            hashMap2.put(valueOf2, Integer.valueOf(i2));
            this.mConfigParams.put(Integer.valueOf(11), Integer.valueOf(this.mForbidOSPlayer));
            this.mConfigParams.put(Integer.valueOf(100), Integer.valueOf(this.mConfigParamsOption));
        }
        StringBuilder sb = new StringBuilder("_playInternal MediaPlayerWrapper.create, use player v3: ");
        sb.append(this.mUsePlayer3);
        C46123h.m144545a("TTVideoEngine", sb.toString());
        MediaPlayer mediaPlayer = null;
        if (this.mUsePlayer3) {
            mediaPlayer = C46129k.m144557a(this.mContext, this.mPlayerDegradeMode);
        }
        if (mediaPlayer == null) {
            mediaPlayer = C46128j.m144554a(this.mContext, this.mPlayerDegradeMode, this.mConfigParams);
        }
        if (this.mUsePlayer3) {
            C46129k kVar = (C46129k) mediaPlayer;
            if (kVar.f118032a && this.mLogger != null) {
                this.mLogger.mo112418p(kVar.f118033b);
            }
        } else {
            C46128j jVar = (C46128j) mediaPlayer;
            if (jVar.f118028a && this.mLogger != null) {
                this.mLogger.mo112418p(jVar.f118029b);
            }
        }
        if (this.mLogger != null) {
            this.mLogger.mo112420q(System.currentTimeMillis());
        }
        C46123h.m144545a("TTVideoEngine", "_playInternal MediaPlayerWrapper.create done ");
        return mediaPlayer;
    }

    private void _fetchVideoInfo() {
        String str;
        this.mState = 1;
        _resetUrlIndexMap();
        String _getAPIString = _getAPIString();
        if (this.mIsUseBoe) {
            _getAPIString = C46122g.m144538e(_getAPIString);
        }
        this.mAPIString = _getAPIString;
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("start to fetch video info:%s", new Object[]{_getAPIString}));
        if (this.mVideoModelCache != null && !TextUtils.isEmpty(this.mVideoID) && this.mUseVideoModelCache) {
            boolean b = C46102h.m144481b(this.mContext);
            if ((this.mErrorCount <= 1 && b) || !b) {
                C46037a a = this.mVideoModelCache.mo112121a(this.mVideoID, this.mAPIString);
                if (a != null && (!a.f117601c || (a.f117601c && !b && C46059d.m144301a().mo112181c() && this.mDataLoaderEnable > 0))) {
                    C46123h.m144545a("TTVideoEngine", "using videomodel cache");
                    this.mLogger.mo112318L(1);
                    this.mVideoModel = a.f117599a;
                    _logFetchedVideoInfo(this.mVideoModel);
                    if (this.mAsyncPlayHitVMCache) {
                        try {
                            if (this.mHandler == null) {
                                this.mHandler = new Handler(C46122g.m144534c());
                            }
                            this.mHandler.post(new Runnable() {
                                public final void run() {
                                    TTVideoEngine.this._parseIPAddress(TTVideoEngine.this.mVideoModel);
                                }
                            });
                            return;
                        } catch (Exception e) {
                            C46123h.m144545a("TTVideoEngine", e.toString());
                        }
                    }
                    _parseIPAddress(this.mVideoModel);
                    return;
                }
            }
        }
        if (this.mUseVideoModelCache) {
            this.mLogger.mo112318L(0);
        }
        this.mIsFetchingInfo = true;
        this.mFetcher = new C46050b(this.mContext, this.mNetClient, this.mTag);
        this.mFetcher.f117668g = this.mVideoID;
        this.mFetcher.mo112147a(this.mUseVideoModelCache);
        this.mFetcher.f117664c = this.mPlayType;
        this.mFetcher.f117666e = new C46021f(this);
        C46050b bVar = this.mFetcher;
        if (this.mPlayAPIVersion == 2) {
            str = null;
        } else {
            str = this.mAuthorization;
        }
        bVar.mo112145a(_getAPIString, str, this.mPlayAPIVersion);
        this.mFetcher.f117667f = this.mResolutionMap;
    }

    private String _getAPIString() {
        String str;
        boolean z;
        if (this.mDataSource == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (this.mUsePlayer3) {
            z = C46129k.m144558a();
            str = C1638f.m8026a(14, "");
        } else {
            z = C46128j.m144555a();
            str = TTPlayerConfiger.getValue(14, "");
        }
        if (z) {
            if (this.mDashEnabled) {
                hashMap.put("format_type", "dash");
            }
            if (this.mH265Enabled) {
                hashMap.put("codec_type", "1");
            }
        } else {
            this.mHardwareDecodeEnablePlayer3 = 0;
            this.mHardwareDecodeEnablePlayer2 = 0;
        }
        if (this.mEnableHttps || this.mRetryEnableHttps) {
            this.mHttpsEnabled = true;
            hashMap.put("ssl", "1");
        } else {
            this.mHttpsEnabled = false;
        }
        hashMap.put("player_version", str);
        int i = this.mP2PCDNType;
        if (i > 0 && (C46030a.m144223a().mo112115b() != 0 || this.mDashEnabled)) {
            i = 0;
        }
        hashMap.put("cdn_type", String.valueOf(i));
        C46123h.m144545a("TTVideoEngine", hashMap.toString());
        return this.mDataSource.apiForFetcher(hashMap, this.mPlayAPIVersion);
    }

    private void _prepareToPlay() {
        String str;
        String str2;
        boolean z;
        String str3;
        if (this.mPlayDuration != null) {
            this.mPlayDuration.mo112294d();
        }
        if (this.mIsLocal || this.mIsDirectURL || this.mPlayFd != null || this.mMediaDataSource != null) {
            _logBeginToPlay(null);
            if (this.mIsLocal) {
                str = this.mLocalURL;
            } else {
                str = this.mDirectURL;
            }
            _logFirstURL(str);
            if (this.mIsLocal) {
                str2 = this.mLocalURL;
            } else {
                str2 = this.mDirectURL;
            }
            _singleURLParseAndPlay(str2, this.mHeaders);
        } else if (this.mIsPreloaderItem) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (this.mPreloaderItem.f117987f <= 0 || currentTimeMillis - this.mPreloaderItem.f117987f <= ((long) PLAY_URL_EXPIRE_TIME)) {
                z = false;
            } else {
                z = true;
            }
            HashMap hashMap = new HashMap();
            String str4 = "expire";
            if (z) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            hashMap.put(str4, str3);
            String str5 = "";
            if (this.mPreloaderItem.f117983b != null) {
                str5 = this.mPreloaderItem.f117983b;
            }
            hashMap.put("url", str5);
            if (z) {
                _fetchVideoInfo();
            }
            _logFirstURL(this.mPreloaderItem.f117983b);
            _logBeginToPlay(this.mPreloaderItem.f117982a);
            this.mLogger.mo112345a((Map) hashMap);
            this.mLogger.mo112378f(1);
            _singleURLParseAndPlay(this.mPreloaderItem.f117983b, this.mHeaders);
        } else if (this.mIsPlayItem) {
            _logBeginToPlay(this.mVideoID);
            _logFirstURL(this.mPlayItem.f118700a);
            _singleURLParseAndPlay(this.mPlayItem.f118700a, this.mHeaders);
        } else if (this.mIsFeedInfo) {
            _logBeginToPlay(this.mVideoID);
            _parseIPAddress(this.mVideoModel);
        } else {
            _logBeginToPlay(this.mVideoID);
            _fetchVideoInfo();
        }
        this.mLogger.mo112408m(this.mTag);
        this.mLogger.mo112415o(this.mSubTag);
        if (this.mMediaPlayer != null && this.mP2PCDNType != 0) {
            setPlayInfo(5, 0);
        }
    }

    private void _replayOrResume() {
        String str;
        if ((this.mPlaybackState != 0 && this.mPlaybackState != 3) || this.mPrepared) {
            if (this.mIsPlayComplete) {
                _logBeginToPlay(this.mVideoID);
                if (this.mPlayDuration != null) {
                    this.mPlayDuration.mo112294d();
                }
            }
            _resumeVideo();
        } else if (this.mIsLocal || this.mIsDirectURL || this.mPlayFd != null || this.mMediaDataSource != null) {
            _logBeginToPlay(null);
            if (this.mIsLocal) {
                str = this.mLocalURL;
            } else {
                str = this.mDirectURL;
            }
            _singleURLParseAndPlay(str, this.mHeaders);
        } else if (this.mIsPreloaderItem) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (this.mPreloaderItem.f117987f > 0 && currentTimeMillis - this.mPreloaderItem.f117987f > ((long) PLAY_URL_EXPIRE_TIME)) {
                _fetchVideoInfo();
            }
            _logBeginToPlay(this.mPreloaderItem.f117982a);
            this.mLogger.mo112378f(1);
            _singleURLParseAndPlay(this.mPreloaderItem.f117983b, this.mHeaders);
        } else if (this.mIsPlayItem) {
            _logBeginToPlay(this.mVideoID);
            _singleURLParseAndPlay(this.mPlayItem.f118700a, this.mHeaders);
        } else {
            _logBeginToPlay(this.mVideoID);
            if (this.urlIPMap != null) {
                C46016a aVar = (C46016a) this.urlIPMap.get(this.mURLInfo.f117577a);
                if (aVar != null) {
                    aVar.f117561b = "FromCache";
                    this.urlIPMap.put(this.mURLInfo.f117577a, aVar);
                    _updateVU();
                }
            }
            _playInternal(this.mURLInfo.mo112108a(), this.mHeaders);
        }
    }

    private void _updateLogTime() {
        if (this.mLogger != null && this.mMediaPlayer != null) {
            this.mLogger.mo112333a(this.mMediaPlayer.getLongOption(68, 0), 1);
            this.mLogger.mo112332a(this.mMediaPlayer.getLongOption(69, 0));
            this.mLogger.mo112353b(this.mMediaPlayer.getLongOption(70, 0));
            this.mLogger.mo112364c(this.mMediaPlayer.getLongOption(75, 0));
            this.mLogger.mo112375e(this.mMediaPlayer.getLongOption(76, 0));
            this.mLogger.mo112370d(this.mMediaPlayer.getLongOption(77, 0));
            this.mLogger.mo112379f(this.mMediaPlayer.getLongOption(78, 0));
            this.mLogger.mo112404l(this.mMediaPlayer.getStringOption(71));
            this.mLogger.mo112329a(1, this.mMediaPlayer.getLongOption(156, -1));
            this.mLogger.mo112329a(0, this.mMediaPlayer.getLongOption(155, -1));
            this.mLogger.mo112351b(1, this.mMediaPlayer.getLongOption(163, -1));
            this.mLogger.mo112351b(0, this.mMediaPlayer.getLongOption(162, -1));
        }
    }

    private void _updateVU() {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : this.urlIPMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!(str == null || value == null)) {
                if (value instanceof C46016a) {
                    C46016a aVar = (C46016a) value;
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", str);
                    hashMap.put("ip", aVar.f117560a);
                    hashMap.put("dns", aVar.f117561b);
                    hashMap.put("dns_cache_open", Integer.valueOf(aVar.f117562c));
                    hashMap.put("server_dns_open", Integer.valueOf(aVar.f117563d));
                    hashMap.put("url_desc", aVar.f117564e);
                    if (this.mIsDirectURL && !TextUtils.isEmpty(this.mGroupID)) {
                        hashMap.put("gid", this.mGroupID);
                    }
                    arrayList.add(hashMap);
                } else {
                    throw new RuntimeException(value.getClass().getName());
                }
            }
        }
        this.mLogger.mo112344a(arrayList);
    }

    private String getMediaFileKey() {
        CharSequence charSequence;
        String str;
        long j;
        CharSequence charSequence2;
        String str2;
        if (this.mIsLocal || this.mIsPlayItem || this.mIsPreloaderItem) {
            return null;
        }
        if (this.mIsDirectURL) {
            return this.mFileKey;
        }
        if (this.mVideoModel == null) {
            return null;
        }
        if (this.currentVideoInfo != null) {
            charSequence2 = this.currentVideoInfo.mo112220b(26);
            j = this.currentVideoInfo.mo112222d(12);
            str = this.currentVideoInfo.mo112220b(5);
            charSequence = this.currentVideoInfo.mo112220b(15);
        } else {
            charSequence2 = null;
            str = null;
            charSequence = null;
            j = 0;
        }
        if (TextUtils.isEmpty(charSequence2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence) || j == 0) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = C1642a.m8034a("%s_%s_%s_%d_%s", new Object[]{this.mVideoID, charSequence2, charSequence, Long.valueOf(j), C46122g.m144536c(str)});
        } else {
            str2 = C1642a.m8034a("%s_%s_%s_%d", new Object[]{this.mVideoID, charSequence2, charSequence, Long.valueOf(j)});
        }
        return str2;
    }

    public void _renderStart() {
        C46123h.m144545a("TTVideoEngine", "start to render");
        if (this.mShouldPlay) {
            _updatePlaybackState(1);
        }
        _logFirstFrame();
        _updateLoadState(1, -1);
        if (this.mPlayDuration != null) {
            this.mPlayDuration.mo112291a();
        }
        if (this.mTestNetSpeed >= 0 && this.mMediaPlayer != null && this.mTestNetSpeedDiff > 0) {
            this.mTestNetSpeedHandler = new Handler();
            this.mTestNetSpeedRunable = new Runnable() {
                public final void run() {
                    if (TTVideoEngine.this.mMediaPlayer != null) {
                        long longOption = TTVideoEngine.this.mMediaPlayer.getLongOption(63, 0);
                        if ((TTVideoEngine.this.mTestNetSpeed == 1 || (TTVideoEngine.this.mTestNetSpeed == 0 && longOption < 0)) && TTVideoEngine.this.mTestNetSpeedDiff > 0) {
                            TTVideoEngine.this.mTestNetSpeedHandler.postDelayed(TTVideoEngine.this.mTestNetSpeedRunable, (long) TTVideoEngine.this.mTestNetSpeedDiff);
                        }
                    }
                }
            };
            this.mTestNetSpeedHandler.postDelayed(this.mTestNetSpeedRunable, (long) (this.mTestNetSpeedDiff + (this.mTestNetSpeedDiff / 2)));
        }
        if (this.mMediaPlayer != null) {
            _updateLogTime();
        }
        if (this.mSwitchingResolution || this.mRetrying) {
            if (this.mLastPlaybackTime != 0 && isSystemPlayer()) {
                _seekTo(this.mLastPlaybackTime, this.mSwitchingResolution);
            }
            this.mRetrying = false;
        }
        if (this.mStartTime != 0 && isSystemPlayer()) {
            _seekTo(this.mStartTime, this.mSwitchingResolution);
        }
        this.mStartTime = 0;
        if (this.mSwitchingResolution && !isSystemPlayer()) {
            this.mSwitchingResolution = false;
            if (this.mLogger != null) {
                this.mLogger.mo112373e();
            }
        }
        this.mErrorCount = 0;
        this.mBestResolutionType = 0;
        if (this.mVideoEngineListener != null) {
            C46123h.m144545a("TTVideoEngine", "notify render start");
            this.mVideoEngineListener.onRenderStart(this);
        }
        setPlayInfo(0, 0);
    }

    public void _updateLogger() {
        if (this.mLogger != null && this.mMediaPlayer != null) {
            this.mLogger.mo112325a(this.mMediaPlayer.getFloatOption(NormalGiftView.MASK_TRANSLATE_VALUE, 0.0f));
            this.mLogger.mo112348b(this.mMediaPlayer.getFloatOption(151, 0.0f));
            this.mLogger.mo112435x(this.mMediaPlayer.getIntOption(186, -1));
            this.mLogger.mo112403l(this.mMediaPlayer.getLongOption(152, -1));
            this.mLogger.mo112307A(this.mMediaPlayer.getIntOption(153, -1));
            this.mLogger.mo112439z(this.mMediaPlayer.getIntOption(189, -1));
            this.mLogger.mo112309C(this.mMediaPlayer.getIntOption(221, -1));
            this.mLogger.mo112310D(this.mMediaPlayer.getIntOption(222, -1));
            this.mLogger.mo112311E(this.mMediaPlayer.getIntOption(245, -1));
            if ((this.mHardwareDecodeEnablePlayer2 > 0 && !this.mUsePlayer3) || (this.mHardwareDecodeEnablePlayer3 > 0 && this.mUsePlayer3)) {
                this.mLogger.mo112421q(this.mMediaPlayer.getStringOption(187));
                this.mLogger.mo112437y(this.mMediaPlayer.getIntOption(188, -1));
            }
            if (this.mPlaybackState != 0) {
                this.mLogger.mo112411n(this.mMediaPlayer.getLongOption(73, -1));
                this.mLogger.mo112407m(this.mMediaPlayer.getLongOption(72, -1));
            }
            this.mLogger.mo112436x(this.mTextureRenderErrorMsg);
        }
    }

    public boolean supportHevcPlayback() {
        if (this.mMediaPlayer == null) {
            return true;
        }
        try {
            int currentPosition = this.mMediaPlayer.getCurrentPosition();
            int duration = this.mMediaPlayer.getDuration();
            long longOption = this.mMediaPlayer.getLongOption(72, -1);
            if (this.mMediaPlayer.getIntOption(157, -1) == 5 && this.mPlaybackState == 1 && this.mLoadState == 1 && currentPosition >= 1000 && duration - currentPosition >= 1000 && longOption >= 500) {
                int intOption = this.mMediaPlayer.getIntOption(160, 100);
                long longOption2 = this.mMediaPlayer.getLongOption(152, -1);
                int intOption2 = this.mMediaPlayer.getIntOption(153, -1);
                float floatOption = this.mMediaPlayer.getFloatOption(151, 0.0f);
                if (floatOption > ((float) this.mMaxFps)) {
                    floatOption /= 2.0f;
                }
                int i = (((int) floatOption) * this.mFrameDropNum) / (this.mFrameDropNum + 1);
                if (longOption2 <= -350 && intOption2 >= (i * 2) / 3 && intOption > 2) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public static void onlyUseMediaLoader(boolean z) {
        ONLY_USE_MEDIALOADER = z;
    }

    public static void setForceUseLitePlayer(boolean z) {
        mForceUseLitePlayer = z;
    }

    public static void setForceUsePluginPlayer(boolean z) {
        mForceUsePluginPlayer = z;
    }

    public static void setHTTPDNSFirst(boolean z) {
        HTTP_DNS_FIRST = z;
    }

    public boolean getLooping(boolean z) {
        return this.mLooping;
    }

    public static void cancelPreloadTask(String str) {
        C46059d.m144301a().mo112191i(str);
    }

    public static void cancelPreloadTaskByFilePath(String str) {
        C46059d.m144301a().mo112190h(str);
    }

    public static void disableAutoTrim(String str) {
        C46059d.m144301a().mo112170a(str);
    }

    public static void enableAutoTrim(String str) {
        C46059d.m144301a().mo112179b(str);
    }

    public static void removeCacheFile(String str) {
        C46059d.m144301a().mo112192j(str);
    }

    public static void setDataLoaderListener(C46075e eVar) {
        C46059d.m144301a().mo112166a(eVar);
    }

    public static void setVideoEventUploader(C46144d dVar) {
        VideoEventManager.instance.setUploader(dVar);
    }

    public void _logFetchedFailed(C46117c cVar) {
        this.mLogger.mo112336a((C46083h) null, cVar);
    }

    public void _logFetchedVideoInfo(C46083h hVar) {
        this.mLogger.mo112336a(hVar, (C46117c) null);
    }

    public void _logMessage(String str) {
        this.mLogger.mo112430u(str);
    }

    private boolean _usePlayerDNS(boolean z) {
        if (this.mIsUsePlayerDNS == 1) {
            return true;
        }
        if (this.mIsUsePlayerDNS != 0 && z) {
            return true;
        }
        return false;
    }

    public static long getCacheFileSize(String str) {
        return C46059d.m144301a().mo112194l(str);
    }

    public static long getCacheFileSizeByFilePath(String str) {
        return C46059d.m144301a().mo112188g(str);
    }

    public static C46062b getCacheInfo(String str) {
        return C46059d.m144301a().mo112184e(str);
    }

    public static C46062b getCacheInfoByFilePath(String str) {
        return C46059d.m144301a().mo112186f(str);
    }

    public static String getStringValue(int i) {
        return C46059d.m144301a().mo112155a(i);
    }

    public static void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        C46123h.m144545a("TTVideoEngine", "set threadpool");
        C46115b.m144504a(threadPoolExecutor);
    }

    public C46073b getMetrics(int i) {
        if (this.mLogger == null) {
            return null;
        }
        return this.mLogger.mo112323Q(i);
    }

    public void setDecryptionKey(String str) {
        C46123h.m144545a("TTVideoEngine", "setDecryptionKey");
        this.mDecryptionKey = str;
    }

    public void setDefaultFileCacheDir(String str) {
        if (str != null && str.length() != 0) {
            this.mDefaultCacheDir = str;
            createCacheFileDirectory();
        }
    }

    public void setFileCacheDir(String str) {
        if (str != null && str.length() != 0) {
            this.mCacheDir = str;
        }
    }

    public void setLiveID(String str) {
        setVideoID(str);
        this.mLogger.mo112349b(1);
        this.mPlayType = 1;
    }

    public void setResolutionMap(HashMap<String, Resolution> hashMap) {
        if (hashMap != null && hashMap.size() > 0) {
            this.mResolutionMap = hashMap;
        }
    }

    public void setVideoEngineInfoListener(C46175y yVar) {
        this.mVideoEngineInfos = new C46176z();
        this.mVideoEngineInfoListener = yVar;
    }

    private void _logFirstHost(String str) {
        if (this.mFirstHost) {
            this.mFirstHost = false;
            this.mLogger.mo112372d(str);
        }
        this.mLogger.mo112376e(str);
    }

    private void _logFirstIP(String str) {
        if (this.mFirstIP) {
            this.mFirstIP = false;
            this.mLogger.mo112380f(str);
        }
        this.mLogger.mo112384g(str);
    }

    private void _logFirstQuality(String str) {
        if (this.mFirstQuality) {
            this.mFirstQuality = false;
            this.mLogger.mo112396j(str);
        }
        this.mLogger.mo112400k(str);
    }

    private void _logFirstResolution(String str) {
        if (this.mFirstResolution) {
            this.mFirstResolution = false;
            this.mLogger.mo112388h(str);
        }
        this.mLogger.mo112392i(str);
    }

    private void _logFirstURL(String str) {
        if (this.mFirstURL) {
            this.mFirstURL = false;
            this.mLogger.mo112357b(str);
        }
        this.mLogger.mo112366c(str);
    }

    private String _resolutionToString(Resolution resolution) {
        if (this.mVideoModel != null) {
            C46084i iVar = this.mVideoModel.f117858d;
            if (iVar != null) {
                return iVar.mo112248a(resolution);
            }
        }
        return resolution.toString(C46084i.f117863a);
    }

    private void _setPlayerMute(boolean z) {
        float f;
        if (this.mMediaPlayer != null) {
            if (this.mMediaPlayer.isOSPlayer()) {
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                try {
                    this.mMediaPlayer.setVolume(f, f);
                } catch (Exception unused) {
                }
            } else {
                this.mMediaPlayer.setIsMute(z);
            }
        }
    }

    private String[] addMdlFlag(String[] strArr) {
        if (this.mForbidP2P == 0) {
            return strArr;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                strArr[i] = C46122g.m144527a(strArr[i], "p2p=0");
            }
        }
        return strArr;
    }

    public static void addTask(C46159n nVar) {
        C46059d.m144301a().mo112167a(nVar);
    }

    public static String computeMD5(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return new BigInteger(1, instance.digest()).toString(16);
        } catch (Exception unused) {
            return str;
        }
    }

    public static void startDataLoader(Context context) throws Exception {
        C46059d.m144301a().mo112162a(context);
        try {
            C46059d.m144301a().mo112178b();
        } catch (Exception e) {
            throw e;
        }
    }

    public void _bufferStart(int i) {
        C46123h.m144545a("TTVideoEngine", "buffering start");
        if (this.mPlayDuration != null) {
            this.mPlayDuration.mo112292b();
        }
        if (this.mVideoBufferListener != null) {
            this.mVideoBufferListener.mo88682a(i);
        }
        _updateLoadState(2, i);
    }

    public void configResolution(Resolution resolution) {
        if (resolution != null) {
            C46123h.m144545a("TTVideoEngine", C1642a.m8034a("config reolution:%s", new Object[]{_resolutionToString(resolution)}));
            _configResolution(resolution, null);
        }
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) {
        _ShutdownOldSource();
        this.mMediaDataSource = iMediaDataSource;
        if (this.mLogger != null) {
            this.mLogger.mo112352b(7, (String) null);
        }
    }

    public void setEncodedKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            C46123h.m144545a("TTVideoEngine", "setEncodedKey");
            this.mSpadea = str;
        }
    }

    public void setIsMute(boolean z) {
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("setIsMute:%s", new Object[]{Boolean.valueOf(z)}));
        this.mIsMute = z;
        _setPlayerMute(z);
    }

    public void setStartTime(int i) {
        StringBuilder sb = new StringBuilder("setStartTime:");
        sb.append(i);
        C46123h.m144545a("TTVideoEngine", sb.toString());
        this.mStartTime = i;
        this.mLogger.mo112413o(this.mStartTime);
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.mSurfaceHolder = surfaceHolder;
        if (!(surfaceHolder == null || this.mLogger == null)) {
            this.mLogger.mo112385h();
        }
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setDisplay(surfaceHolder);
        }
    }

    private boolean _isUrlExpired(C46082g gVar) {
        if (gVar != null && !this.mAllowedExpiredModel && gVar.mo112222d(30) > 0 && C46125j.m144552b() && C46125j.m144549a() - (gVar.mo112222d(30) * 1000) > -30000) {
            return true;
        }
        return false;
    }

    private void _notifyError(C46117c cVar) {
        if (!(this.mExternVideoLoggerListener == null || this.mLogger == null)) {
            this.mLogger.mo112438y(this.mExternVideoLoggerListener.mo88681a(this.mExternLogKey));
        }
        if (this.mLogger != null) {
            if (this.mPlayDuration != null) {
                this.mLogger.mo112316J(this.mPlayDuration.mo112293c());
            }
            this.mLogger.mo112355b(cVar, this.mPlayAPIVersion);
        }
        this.mStarted = false;
        if (this.mVideoEngineListener != null) {
            this.mVideoEngineListener.onError(cVar);
        }
        this.mErrorCount = 0;
        this.mAccumulatedErrorCount = 0;
    }

    public static void addTask(C46160o oVar) {
        C46059d.m144301a().mo112168a(oVar);
    }

    private static void removeCacheFile(C46083h hVar) {
        if (hVar != null) {
            C46084i iVar = hVar.f117858d;
            if (iVar != null) {
                List<C46082g> a = iVar.mo112249a();
                if (a != null && a.size() > 0) {
                    for (C46082g b : a) {
                        C46059d.m144301a().mo112193k(b.mo112220b(15));
                    }
                }
            }
        }
    }

    private void setSurfaceHook(Surface surface) {
        MediaPlayer mediaPlayer;
        if (this.mAsyncPlayer != null) {
            mediaPlayer = this.mAsyncPlayer;
        } else {
            mediaPlayer = this.mMediaPlayer;
        }
        if (mediaPlayer != null) {
            if (!(this.mTextureSurface == null || this.mTextureRenderer == null)) {
                this.mTextureSurface.updateRenderSurface(surface);
            }
            if (this.mTextureSurface != null) {
                surface = this.mTextureSurface;
            }
            mediaPlayer.setSurface(surface);
        }
    }

    public void _renderSeekComplete(int i) {
        C46123h.m144545a("TTVideoEngine", "render seek complete");
        if (this.mLogger != null) {
            this.mLogger.mo112422r(i);
            this.mLogger.mo112360c();
        }
        if (this.mVideoEngineInfoListener != null) {
            StringBuilder sb = new StringBuilder("render seek complete call back ");
            sb.append(i);
            C46123h.m144545a("TTVideoEngine", sb.toString());
            this.mVideoEngineInfos.f118723a = "renderSeekComplete";
            this.mVideoEngineInfos.f118725c = Integer.valueOf(i);
        }
    }

    public void _streamChanged(int i) {
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("stream %d changed", new Object[]{Integer.valueOf(i)}));
        if (this.mPrepared && this.mPlaybackState != 0 && this.mLoadState != 0) {
            if (i == 0 && !this.mDecodedVideoFirstFrame) {
                this.mDecodedVideoFirstFrame = true;
            }
            if (this.mVideoEngineListener != null) {
                this.mVideoEngineListener.onStreamChanged(this, i);
            }
        }
    }

    public void _updatePlaybackState(int i) {
        if (this.mPlaybackState != i) {
            C46123h.m144545a("TTVideoEngine", C1642a.m8034a("playback state changed, prev:%d, current:%d", new Object[]{Integer.valueOf(this.mPlaybackState), Integer.valueOf(i)}));
            if (i != 1 || this.mHasFirstFrameShown || _validateVideo()) {
                this.mPlaybackState = i;
                if (this.mVideoEngineListener != null) {
                    this.mVideoEngineListener.onPlaybackStateChanged(this, this.mPlaybackState);
                }
            }
        }
    }

    public int convertCodecName(int i) {
        if (!this.mUsePlayer3) {
            return i;
        }
        switch (i) {
            case 2:
                return 3;
            case 4:
                return 1;
            case 5:
                return 7;
            case 6:
                return 2;
            case 8:
                return 5;
            case 9:
                return 6;
            default:
                return 0;
        }
    }

    public float getFloatOption(int i) {
        float f;
        switch (i) {
            case 70:
                if (this.mMediaPlayer != null) {
                    f = this.mMediaPlayer.getFloatOption(151, 0.0f);
                    break;
                } else {
                    return 0.0f;
                }
            case 71:
                try {
                    if (this.mMediaPlayer != null) {
                        f = this.mMediaPlayer.getFloatOption(NormalGiftView.MASK_TRANSLATE_VALUE, 0.0f);
                        break;
                    } else {
                        return 0.0f;
                    }
                } catch (Throwable unused) {
                    return 0.0f;
                }
            default:
                return 0.0f;
        }
        return f;
    }

    public String getStringOption(int i) {
        String str = "";
        if (i != 80) {
            if (i == 82) {
                try {
                    if (mForceUsePluginPlayer) {
                        return C46128j.m144556b();
                    }
                    str = TTPlayerConfiger.getValue(14, "");
                } catch (Throwable unused) {
                }
            }
        } else if (this.mMediaPlayer != null) {
            return this.mMediaPlayer.getStringOption(142);
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    public int parseP2PCDNType(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int indexOf = str.indexOf("cdn_type=");
        if (indexOf != -1) {
            int i = indexOf + 9;
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    return 0;
                }
                return Character.getNumericValue(charAt);
            }
        }
        return 0;
    }

    public void setCustomStr(String str) {
        if (this.mLogger != null && !TextUtils.isEmpty(str)) {
            if (str.length() > 512) {
                str = str.substring(0, 512);
                C46123h.m144545a("TTVideoEngine", "customStr too long to be truncated!");
            }
            this.mLogger.mo112341a(str);
        }
    }

    public void setLooping(boolean z) {
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("setLooping:%s", new Object[]{Boolean.valueOf(z)}));
        this.mLooping = z;
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setLooping(this.mLooping);
        }
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("set looping value:%d", new Object[]{Integer.valueOf(z ? 1 : 0)}));
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        this.mPlaybackParams = playbackParams;
        if (this.mMediaPlayer != null && (!isSystemPlayer() || (VERSION.SDK_INT >= 23 && this.mPrepared))) {
            this.mMediaPlayer.setPlaybackParams(playbackParams);
            this.mLogger.mo112334a(this.mPlaybackParams);
        }
    }

    public void setSurface(Surface surface) {
        StringBuilder sb = new StringBuilder("setsurface = ");
        sb.append(surface);
        C46123h.m144545a("TTVideoEngine", sb.toString());
        this.mSurface = surface;
        if (!(surface == null || this.mLogger == null || this.mHasFirstFrameShown)) {
            this.mLogger.mo112385h();
        }
        if (this.mMediaPlayer != null) {
            setSurfaceHook(this.mSurface);
        }
    }

    public void setUnSupportSampleRates(int[] iArr) {
        if (!isSystemPlayer()) {
            int length = iArr.length;
            if (length > 0) {
                int length2 = MediaPlayer.MEDIA_PLAYER_SUPPORT_SAMPLERATES.length;
                this.mUnsupportSampleRatesInBinary = 0;
                for (int i = 0; i < length; i++) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        } else if (MediaPlayer.MEDIA_PLAYER_SUPPORT_SAMPLERATES[i2] == iArr[i]) {
                            this.mUnsupportSampleRatesInBinary = (1 << i2) | this.mUnsupportSampleRatesInBinary;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (this.mMediaPlayer != null) {
                    this.mMediaPlayer.setIntOption(111, this.mUnsupportSampleRatesInBinary);
                }
            }
        }
    }

    private void _logBeginToPlay(String str) {
        if (this.mLogger != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.mPlayTime = currentTimeMillis;
            this.mLogger.mo112342a(str, currentTimeMillis, C46029a.f117586f);
            if (TextUtils.isEmpty(this.mLogger.mo112393j())) {
                String a = C46122g.m144526a(C46029a.f117586f, currentTimeMillis);
                if (!TextUtils.isEmpty(a)) {
                    this.mHeaders.put("X-Tt-Traceid", a);
                    this.mLogger.mo112432v(a);
                    StringBuilder sb = new StringBuilder("trace id:");
                    sb.append(a);
                    C46123h.m144545a("TTVideoEngine", sb.toString());
                }
            }
            this.mLogger.mo112315I(this.mDataLoaderEnable);
            this.mLogger.mo112394j(this.mIsUsePlayerDNS);
        }
    }

    public static void addTask(C46163r rVar) {
        C46059d.m144301a().mo112169a(rVar);
    }

    public void _bufferEnd(int i) {
        C46123h.m144545a("TTVideoEngine", "buffering end");
        if (this.mPlayDuration != null) {
            this.mPlayDuration.mo112291a();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.mBufferingStartT > 0 && elapsedRealtime >= this.mBufferingStartT) {
            if (this.mLogger != null) {
                this.mLogger.mo112425s(i);
                if (i == 0) {
                    this.mLogger.mo112399k(elapsedRealtime - this.mBufferingStartT);
                }
            }
            if (this.curP2PUrlInfo != null && !TextUtils.isEmpty(this.curP2PUrlInfo.f117781a)) {
                C46030a.m144223a().mo112117b(this.curP2PUrlInfo.f117781a, (int) (elapsedRealtime - this.mBufferingStartT));
            }
            this.mBufferingStartT = 0;
        } else if (this.mNotifyBufferingDirectly == 1 && this.mLogger != null) {
            this.mLogger.mo112409n();
        }
        this.mBufferingType = -1;
        if (this.mVideoBufferListener != null) {
            this.mVideoBufferListener.mo88683b(i);
        }
        _updateLoadState(1, i);
    }

    public void _seekComplete(boolean z) {
        C46123h.m144545a("TTVideoEngine", "seek complete");
        if (this.mPlayDuration != null) {
            this.mPlayDuration.mo112291a();
        }
        if (this.mSeeking) {
            this.mSeeking = false;
            if (this.mLogger != null) {
                this.mLogger.mo112377f();
                this.mLogger.mo112360c();
            }
        }
        if (this.mSwitchingResolution) {
            this.mSwitchingResolution = false;
            if (this.mLogger != null) {
                this.mLogger.mo112373e();
            }
        }
        if (this.mSeekCompletionListener != null) {
            this.mSeekCompletionListener.onCompletion(z);
            this.mSeekCompletionListener = null;
        }
        setPlayInfo(5, -1);
    }

    public void _videoBitrateChanged(int i) {
        Resolution resolution = Resolution.Undefine;
        if (this.mVideoModel != null && this.mVideoModel.f117858d != null) {
            Resolution[] allResolutions = Resolution.getAllResolutions();
            int i2 = 0;
            while (true) {
                if (i2 >= allResolutions.length) {
                    break;
                }
                C46082g a = this.mVideoModel.mo112224a(allResolutions[i2], C46084i.f117863a, null);
                if (a != null && a.mo112216a(3) == i) {
                    resolution = allResolutions[i2];
                    this.lastResolution = this.currentResolution;
                    this.currentResolution = resolution;
                    break;
                }
                i2++;
            }
        }
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("video bitrate changed:%d, resoluton:%s", new Object[]{Integer.valueOf(i), resolution.toString(C46084i.f117863a)}));
    }

    public long getLongOption(int i) {
        if (i != 81) {
            if (i != 315) {
                switch (i) {
                    case 60:
                        if (this.mMediaPlayer != null) {
                            return this.mMediaPlayer.getLongOption(171, 0);
                        }
                        break;
                    case BaseNotice.TCM /*61*/:
                        if (this.mMediaPlayer != null) {
                            return this.mMediaPlayer.getLongOption(73, 0);
                        }
                        break;
                    case BaseNotice.CREATOR /*62*/:
                        try {
                            if (this.mMediaPlayer != null) {
                                return this.mMediaPlayer.getLongOption(72, 0);
                            }
                        } catch (Throwable unused) {
                            break;
                        }
                        break;
                }
            } else if (this.mMediaPlayer != null) {
                return this.mMediaPlayer.getLongOption(46, 0);
            }
        } else if (this.mMediaPlayer != null) {
            long longOption = this.mMediaPlayer.getLongOption(240, 0);
            String str = "TTVideoEngine";
            try {
                StringBuilder sb = new StringBuilder("get value of KeyIsLastBufferSizeU64: ");
                sb.append(longOption);
                C46123h.m144545a(str, sb.toString());
                return longOption;
            } catch (Throwable unused2) {
                return longOption;
            }
        }
        return -1;
    }

    public void setDirectURL(String str) {
        if (str != null && !str.equals(this.mDirectURL)) {
            C46123h.m144545a("TTVideoEngine", C1642a.m8034a("set direct url:%s", new Object[]{str}));
            _ShutdownOldSource();
            this.mState = 0;
            this.mFirstURL = true;
            this.mFirstIP = true;
            this.mFirstHost = true;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mAPIString = null;
        }
        this.mStarted = false;
        this.mIsDirectURL = true;
        this.mDirectURL = str;
        this.mBufferingStartT = 0;
        this.mCachePath = null;
        this.mFileKey = null;
        this.currentResolution = Resolution.Undefine;
        this.mLogger.mo112343a(_resolutionToString(this.currentResolution), "");
        this.mLogger.mo112352b(1, "");
    }

    public void setLocalURL(String str) {
        if (str != null && !str.equals(this.mLocalURL)) {
            C46123h.m144545a("TTVideoEngine", C1642a.m8034a("set local url:%s", new Object[]{str}));
            _ShutdownOldSource();
            this.mState = 0;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mAPIString = null;
        }
        this.mStarted = false;
        this.mIsLocal = true;
        this.mLocalURL = str;
        this.mBufferingStartT = 0;
        this.mLogger.mo112352b(0, "");
        this.mCachePath = null;
        this.mFileKey = null;
        this.currentResolution = Resolution.Undefine;
        this.mLogger.mo112343a(_resolutionToString(this.currentResolution), "");
    }

    public void setVideoID(String str) {
        if (str != null && !str.equals(this.mVideoID)) {
            C46123h.m144545a("TTVideoEngine", C1642a.m8034a("set video id:%s", new Object[]{str}));
            _ShutdownOldSource();
            this.mIsLocal = false;
            this.mFirstURL = true;
            this.mFirstIP = true;
            this.mFirstHost = true;
            this.mState = 0;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mAPIString = null;
        }
        this.mStarted = false;
        this.mVideoID = str;
        this.mBufferingStartT = 0;
        this.mLogger.mo112352b(5, str);
        this.urlIPMap.clear();
        this.mCachePath = null;
        this.mFileKey = null;
    }

    public void setVideoModel(C46083h hVar) {
        if (hVar != null) {
            String b = hVar.mo112235b(2);
            if (!TextUtils.isEmpty(b)) {
                if (hVar != null && !hVar.equals(this.mVideoModel)) {
                    _ShutdownOldSource();
                    this.mIsLocal = false;
                    this.mFirstURL = true;
                    this.mFirstIP = true;
                    this.mFirstHost = true;
                    this.mState = 0;
                    this.mUserStopped = false;
                    this.mLastPlaybackTime = 0;
                    this.mFetcher = null;
                    this.mAPIString = null;
                }
                this.mStarted = false;
                this.mVideoModel = hVar;
                this.mVideoModel.mo112229a(this.mResolutionMap);
                this.mVideoID = b;
                this.mIsFeedInfo = true;
                this.mBufferingStartT = 0;
                this.mLogger.mo112352b(4, this.mVideoID);
                this.mLogger.mo112335a(hVar);
                this.mCachePath = null;
                this.mFileKey = null;
                C46123h.m144545a("TTVideoEngine", "set video model");
            }
        }
    }

    private void _parseDNS(String str) {
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("hostnameURL:%s", new Object[]{str}));
        this.mState = 2;
        if (this.mLogger != null) {
            this.mLogger.mo112414o(System.currentTimeMillis());
        }
        try {
            this.mDNSParser = new C46091c(this.mContext, new URL(str).getHost(), this.mNetClient);
            this.mDNSParser.f117938d = new C46019d(this);
            if (this.mErrorCount != 0) {
                this.mDNSParser.mo112268f();
            }
            this.mDNSParser.f117941f = this.mUseDNSCache;
            if (this.mDNSExpiredTime > 0) {
                this.mDNSParser.f117943h = this.mDNSExpiredTime;
            }
            if (this.mIsUseServerDns && this.mVideoModel != null) {
                this.mDNSParser.f117942g = this.mIsUseServerDns;
                this.mDNSParser.mo112267a(this.mVideoModel.mo112244h(), Long.valueOf(this.mVideoModel.mo112239d(216)));
            }
            this.mDNSParser.mo112260b();
        } catch (Exception unused) {
        }
    }

    public void _parseDNSComplete(String str) {
        if (this.mLogger != null) {
            this.mLogger.mo112333a(System.currentTimeMillis(), 0);
        }
        String host = Uri.parse(this.mURLInfo.f117577a).getHost();
        String replaceFirst = this.mURLInfo.f117577a.replaceFirst(host, str);
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("dns success, host:%s, ip:%s", new Object[]{host, str}));
        String str2 = "";
        if (this.mDNSParser != null) {
            str2 = this.mDNSParser.mo112269g();
        }
        String str3 = str2;
        C46016a aVar = (C46016a) this.urlIPMap.get(this.mURLInfo.f117577a);
        if (aVar != null) {
            aVar.f117560a = str;
            aVar.f117561b = str3;
        } else {
            Map<String, C46016a> map = this.urlIPMap;
            String str4 = this.mURLInfo.f117577a;
            boolean z = this.mDNSParser.f117941f;
            boolean z2 = this.mDNSParser.f117942g;
            C46016a aVar2 = new C46016a(str, str3, z ? 1 : 0, z2 ? 1 : 0, "");
            map.put(str4, aVar2);
        }
        _updateVU();
        _logFirstURL(this.mURLInfo.f117577a);
        _logFirstHost(host);
        _logFirstIP(str);
        _playVideo(host, replaceFirst);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r5 < 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getIntOption(int r5) {
        /*
            r4 = this;
            r0 = 416(0x1a0, float:5.83E-43)
            r1 = -1
            if (r5 == r0) goto L_0x00d1
            r0 = 3
            r2 = 0
            switch(r5) {
                case 40: goto L_0x00c6;
                case 41: goto L_0x00ba;
                case 42: goto L_0x00ad;
                case 43: goto L_0x009c;
                case 44: goto L_0x008f;
                case 45: goto L_0x0082;
                case 46: goto L_0x0075;
                case 47: goto L_0x0071;
                case 48: goto L_0x0058;
                case 49: goto L_0x003a;
                case 50: goto L_0x0036;
                case 51: goto L_0x0032;
                case 52: goto L_0x0024;
                case 53: goto L_0x0018;
                case 54: goto L_0x0014;
                case 55: goto L_0x0010;
                case 56: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x00d4
        L_0x000c:
            int r5 = r4.mLoadState     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x0010:
            int r5 = r4.mPlaybackState     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x0014:
            int r5 = r4.mBufferingType     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x0018:
            com.ss.ttvideoengine.i.d r5 = r4.mPlayDuration     // Catch:{ Throwable -> 0x00d6 }
            if (r5 == 0) goto L_0x00d4
            com.ss.ttvideoengine.i.d r5 = r4.mPlayDuration     // Catch:{ Throwable -> 0x00d6 }
            int r5 = r5.mo112293c()     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x0024:
            boolean r5 = r4.mSwitchingResolution     // Catch:{ Throwable -> 0x00d6 }
            if (r5 == 0) goto L_0x002c
            int r5 = r4.mLastPlaybackTime     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x002c:
            int r5 = r4._getPlayerTime()     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x0032:
            int r5 = r4.mLoadedProgress     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x0036:
            int r5 = r4.mDuration     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x003a:
            android.content.Context r5 = r4.mContext     // Catch:{ Throwable -> 0x00d6 }
            if (r5 == 0) goto L_0x00d4
            android.content.Context r5 = r4.mContext     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r3 = "audio"
            java.lang.Object r5 = r5.getSystemService(r3)     // Catch:{ Throwable -> 0x00d6 }
            android.media.AudioManager r5 = (android.media.AudioManager) r5     // Catch:{ Throwable -> 0x00d6 }
            if (r5 == 0) goto L_0x004f
            int r5 = r5.getStreamVolume(r0)     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x0050
        L_0x004f:
            r5 = -1
        L_0x0050:
            if (r5 >= 0) goto L_0x0055
        L_0x0052:
            r1 = 0
            goto L_0x00d4
        L_0x0055:
            r1 = r5
            goto L_0x00d4
        L_0x0058:
            android.content.Context r5 = r4.mContext     // Catch:{ Throwable -> 0x00d6 }
            if (r5 == 0) goto L_0x00d4
            android.content.Context r5 = r4.mContext     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r3 = "audio"
            java.lang.Object r5 = r5.getSystemService(r3)     // Catch:{ Throwable -> 0x00d6 }
            android.media.AudioManager r5 = (android.media.AudioManager) r5     // Catch:{ Throwable -> 0x00d6 }
            if (r5 == 0) goto L_0x006d
            int r5 = r5.getStreamMaxVolume(r0)     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x006e
        L_0x006d:
            r5 = -1
        L_0x006e:
            if (r5 >= 0) goto L_0x0055
            goto L_0x0052
        L_0x0071:
            int r5 = r4.mPlayerType     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x0075:
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x00d6 }
            if (r5 == 0) goto L_0x00d4
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x00d6 }
            r0 = 140(0x8c, float:1.96E-43)
            int r5 = r5.getIntOption(r0, r1)     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x0082:
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x00d6 }
            if (r5 == 0) goto L_0x00d4
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x00d6 }
            r0 = 141(0x8d, float:1.98E-43)
            int r5 = r5.getIntOption(r0, r1)     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x008f:
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x00d6 }
            if (r5 == 0) goto L_0x00d4
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x00d6 }
            r0 = 158(0x9e, float:2.21E-43)
            int r5 = r5.getIntOption(r0, r1)     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x009c:
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x00d6 }
            if (r5 == 0) goto L_0x00a8
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x00d6 }
            r0 = 157(0x9d, float:2.2E-43)
            int r2 = r5.getIntOption(r0, r1)     // Catch:{ Throwable -> 0x00d6 }
        L_0x00a8:
            int r5 = r4.convertCodecName(r2)     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x00ad:
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x00d6 }
            if (r5 == 0) goto L_0x00d4
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x00d6 }
            r0 = 153(0x99, float:2.14E-43)
            int r5 = r5.getIntOption(r0, r1)     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x00ba:
            com.ss.ttvideoengine.log.c r5 = r4.mLogger     // Catch:{ Throwable -> 0x00d6 }
            if (r5 == 0) goto L_0x00d4
            com.ss.ttvideoengine.log.c r5 = r4.mLogger     // Catch:{ Throwable -> 0x00d6 }
            long r2 = r5.mo112405m()     // Catch:{ Throwable -> 0x00d6 }
            int r1 = (int) r2     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d4
        L_0x00c6:
            com.ss.ttvideoengine.log.c r5 = r4.mLogger     // Catch:{ Throwable -> 0x00d6 }
            if (r5 == 0) goto L_0x00d4
            com.ss.ttvideoengine.log.c r5 = r4.mLogger     // Catch:{ Throwable -> 0x00d6 }
            int r5 = r5.mo112401l()     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x00d1:
            int r5 = r4.mEnableSetPlayInfoToP2P     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x0055
        L_0x00d4:
            r5 = r1
            goto L_0x00d7
        L_0x00d6:
            r5 = -1
        L_0x00d7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.TTVideoEngine.getIntOption(int):int");
    }

    public void setPlayItem(C46166u uVar) {
        String str;
        if (uVar != null) {
            boolean a = uVar.mo112469a();
            HashMap hashMap = new HashMap();
            String str2 = "expire";
            if (a) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put(str2, str);
            String str3 = "";
            if (uVar.f118700a != null) {
                str3 = uVar.f118700a;
            }
            hashMap.put("url", str3);
            this.mLogger.mo112359b((Map) hashMap);
            if (TextUtils.isEmpty(uVar.f118700a) || a) {
                setVideoID(uVar.f118701b);
                return;
            }
            _ShutdownOldSource();
            if (!uVar.equals(this.mPlayItem)) {
                if (this.mPlayItem != null) {
                    _reset();
                }
                this.mIsPlayItem = true;
                this.mFirstURL = true;
                this.mFirstIP = true;
                this.mFirstHost = true;
                this.mState = 0;
                this.mUserStopped = false;
                this.mLastPlaybackTime = 0;
                this.mAPIString = null;
            }
            this.mStarted = false;
            this.mPlayItem = uVar;
            this.mBufferingStartT = 0;
            if (uVar.f118702c != null) {
                this.currentResolution = uVar.f118702c;
            }
            this.mVideoID = uVar.f118701b;
            this.mLogger.mo112352b(2, uVar.f118701b);
            this.urlIPMap.clear();
            this.mCachePath = null;
            this.mFileKey = null;
        }
    }

    public void setPreloaderItem(C46109a aVar) {
        if (aVar == null) {
            this.mIsPreloaderItem = false;
        } else if (TextUtils.isEmpty(aVar.f117983b)) {
            setVideoID(aVar.f117982a);
        } else {
            switch (aVar.f117986e) {
                case 0:
                    this.currentResolution = Resolution.Standard;
                    break;
                case 1:
                    this.currentResolution = Resolution.High;
                    break;
                case 2:
                    this.currentResolution = Resolution.SuperHigh;
                    break;
                case 3:
                    this.currentResolution = Resolution.ExtremelyHigh;
                    break;
                case 4:
                    this.currentResolution = Resolution.FourK;
                    break;
                default:
                    setVideoID(aVar.f117982a);
                    return;
            }
            _ShutdownOldSource();
            if (this.mPreloaderItem != null && !this.mPreloaderItem.equals(aVar)) {
                _reset();
                this.mIsLocal = false;
                this.mFirstURL = true;
                this.mFirstIP = true;
                this.mFirstHost = true;
                this.mState = 0;
                this.mUserStopped = false;
                this.mLastPlaybackTime = 0;
                this.mFetcher = null;
                this.mAPIString = null;
            }
            this.mStarted = false;
            this.mIsPreloaderItem = true;
            this.mPreloaderItem = aVar;
            this.mBufferingStartT = 0;
            this.urlIPMap.clear();
            this.mVideoID = aVar.f117982a;
            this.mLogger.mo112352b(3, this.mVideoID);
            this.mCachePath = null;
            this.mFileKey = null;
            C46123h.m144545a("TTVideoEngine", "set preloaderitem");
        }
    }

    public void _parseIPAddress(C46083h hVar) {
        String[] strArr;
        boolean z;
        C46082g gVar;
        C46117c cVar;
        String str;
        String str2;
        String str3;
        C46083h hVar2 = hVar;
        if (hVar2 == null) {
            _receivedError(new C46117c("kTTVideoErrorDomainFetchingInfo", -9997, "_parseIPAddress:VideoModel is empty"));
            return;
        }
        this.currentResolution = findBestResolution(hVar2, this.currentResolution, this.mBestResolutionType);
        StringBuilder sb = new StringBuilder("find best resolution type: ");
        sb.append(this.mBestResolutionType);
        sb.append(" resolution: ");
        sb.append(_resolutionToString(this.currentResolution));
        C46123h.m144545a("TTVideoEngine", sb.toString());
        String[] d = hVar.mo112240d();
        if (this.mH265Enabled) {
            this.mH265Enabled = false;
            if (d != null || d.length > 0) {
                int length = d.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str4 = d[i];
                    if (!TextUtils.isEmpty(str4) && str4.equals("h265")) {
                        this.mH265Enabled = true;
                        break;
                    }
                    i++;
                }
            }
        }
        String[] a = hVar2.mo112233a(this.currentResolution, this.currentParams);
        Resolution[] allResolutions = Resolution.getAllResolutions();
        C46082g b = hVar2.mo112234b(this.currentResolution, this.currentParams);
        if (_isUrlExpired(b)) {
            a = null;
            b = null;
        }
        if (allResolutions.length > 0) {
            int length2 = allResolutions.length - 1;
            int i2 = 0;
            while (true) {
                if (i2 >= allResolutions.length) {
                    break;
                } else if (allResolutions[i2].getIndex() == this.currentResolution.getIndex()) {
                    length2 = i2;
                    break;
                } else {
                    i2++;
                }
            }
            gVar = b;
            int i3 = length2;
            z = false;
            while (true) {
                if (strArr != null && strArr.length != 0) {
                    break;
                }
                Resolution resolution = allResolutions[i3];
                String[] a2 = hVar2.mo112233a(resolution, null);
                if (a2 == null || a2.length == 0) {
                    strArr = a2;
                } else {
                    gVar = hVar2.mo112234b(resolution, null);
                    if (!_isUrlExpired(gVar)) {
                        this.currentResolution = resolution;
                        this.mLogger.mo112343a(_resolutionToString(this.currentResolution), "");
                        strArr = a2;
                        break;
                    }
                    strArr = null;
                    gVar = null;
                    z = true;
                }
                i3 = ((i3 + allResolutions.length) - 1) % allResolutions.length;
                if (i3 == length2) {
                    break;
                }
            }
        } else {
            gVar = b;
            z = false;
        }
        this.currentVideoInfo = gVar;
        if (!(this.mVideoEngineInfoListener == null || this.mVideoEngineInfos == null)) {
            String f = hVar.mo112242f();
            ArrayList arrayList = new ArrayList();
            if (!this.mDashEnabled || TextUtils.isEmpty(f) || !f.equals("segment_base")) {
                arrayList.add(this.currentVideoInfo);
                this.mVideoEngineInfos.f118723a = "usingUrlInfos";
                this.mVideoEngineInfos.f118724b = arrayList;
            } else {
                C46082g _videoInfoForResolution = _videoInfoForResolution(this.currentResolution, C46084i.f117863a, this.currentParams);
                C46082g _videoInfoForResolution2 = _videoInfoForResolution(this.currentResolution, C46084i.f117864b, this.currentParams);
                if (_videoInfoForResolution != null) {
                    arrayList.add(_videoInfoForResolution);
                }
                if (_videoInfoForResolution2 != null) {
                    arrayList.add(_videoInfoForResolution2);
                }
                this.mVideoEngineInfos.f118723a = "usingUrlInfos";
                this.mVideoEngineInfos.f118724b = arrayList;
            }
        }
        if (gVar != null) {
            this.mCurrentQuality = gVar.mo112220b(18);
        }
        int intValue = ((Integer) this.urlIndexMap.get(this.currentResolution)).intValue();
        if (strArr == null || strArr.length == 0) {
            if (z) {
                cVar = new C46117c("kTTVideoErrorDomainFetchingInfo", -9959);
            } else {
                cVar = new C46117c("kTTVideoErrorDomainFetchingInfo", -9997);
            }
        } else if (strArr.length <= intValue) {
            cVar = new C46117c("kTTVideoErrorDomainFetchingInfo", -9996);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            _receivedError(cVar);
            return;
        }
        int i4 = 2;
        int i5 = 3;
        if (this.mDataLoaderEnable > 0 && C46059d.m144301a().mo112181c()) {
            String _generatePlayUrl = _generatePlayUrl(strArr[intValue], null);
            if (TextUtils.isEmpty(_generatePlayUrl)) {
                _receivedError(new C46117c("kTTVideoErrorDomainFetchingInfo", -9967));
                return;
            }
            if (this.mIsUseServerDns) {
                Long.valueOf(hVar2.mo112239d(216));
            }
            ArrayList<C46082g> arrayList2 = new ArrayList<>();
            if (!hVar.mo112231a()) {
                arrayList2.add(this.currentVideoInfo);
            } else if (_generatePlayUrl.startsWith("mem://bash") && hVar2.f117858d != null) {
                for (C46082g add : hVar2.f117858d.mo112249a()) {
                    arrayList2.add(add);
                }
            }
            String str5 = _generatePlayUrl;
            String str6 = null;
            for (C46082g gVar2 : arrayList2) {
                if (gVar2 != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    String b2 = gVar2.mo112220b(28);
                    if (b2 == null) {
                        b2 = "";
                    }
                    String b3 = gVar2.mo112220b(29);
                    if (b3 == null) {
                        b3 = "";
                    }
                    stringBuffer.append("fileId=");
                    stringBuffer.append(b2);
                    stringBuffer.append("&bitrate=");
                    stringBuffer.append(gVar2.mo112216a(i5));
                    stringBuffer.append("&pcrc=");
                    stringBuffer.append(C46122g.m144541h(b3));
                    String b4 = gVar2.mo112220b(5);
                    String b5 = hVar2.mo112235b(i4);
                    String b6 = gVar2.mo112220b(15);
                    if (TextUtils.isEmpty(b6) || this.mCacheFilePathListener == null) {
                        str3 = null;
                    } else {
                        String a3 = this.mCacheFilePathListener.mo112132a(b5, gVar2);
                        if (!a3.contains(b6)) {
                            a3 = null;
                        }
                        if (!TextUtils.isEmpty(a3)) {
                            b6 = C46122g.m144524a(this.mContext, a3);
                        }
                        str3 = a3;
                    }
                    String[] c = gVar2.mo112221c(16);
                    if (c != null && c.length > 0) {
                        String[] strArr2 = (String[]) addMdlFlag(c).clone();
                        if (this.mIsUseBoe) {
                            for (int i6 = 0; i6 < strArr2.length; i6++) {
                                strArr2[i6] = C46122g.m144538e(strArr2[i6]);
                            }
                        }
                        if (this.mRetryEnableHttps) {
                            for (int i7 = 0; i7 < strArr2.length; i7++) {
                                strArr2[i7] = C46122g.m144539f(strArr2[i7]);
                            }
                        }
                        C46059d a4 = C46059d.m144301a();
                        String str7 = b5;
                        long j = (long) this.mLimitMDLCacheSize;
                        Resolution resolution2 = this.currentResolution;
                        String stringBuffer2 = stringBuffer.toString();
                        C46059d dVar = a4;
                        String[] strArr3 = c;
                        String a5 = dVar.mo112156a(b6, str7, j, strArr2, resolution2, b4, gVar2, str3, stringBuffer2);
                        if (!TextUtils.isEmpty(a5)) {
                            if (str5.startsWith("mem://bash")) {
                                for (int i8 = 0; i8 < strArr3.length; i8++) {
                                    if (strArr3[i8] != null) {
                                        str5 = str5.replace(strArr3[i8].replace("/", "\\/"), a5);
                                    }
                                }
                                a5 = str5;
                            }
                            this.mUsingDataLoaderPlayTaskKey = b6;
                            str6 = a5;
                        }
                    }
                    i4 = 2;
                    i5 = 3;
                }
            }
            if (!TextUtils.isEmpty(str6)) {
                this.mURLInfo.mo112109a(str6);
                C46143c cVar2 = this.mLogger;
                if (str6.startsWith("mem://bash")) {
                    str2 = C1642a.m8034a("mem://bash/url_index:%d", new Object[]{this.urlIndexMap.get(this.currentResolution)});
                } else {
                    str2 = str6;
                }
                cVar2.mo112428t(str2);
                HashMap<String, String> hashMap = this.mHeaders;
                hashMap.remove("Host");
                _playInternal(str6, hashMap);
                return;
            }
        }
        if (this.mIsUseBoe) {
            for (int i9 = 0; i9 < strArr.length; i9++) {
                strArr[i9] = C46122g.m144538e(strArr[i9]);
            }
        }
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("current resolution:%s, urls:%s, index:%d", new Object[]{_resolutionToString(this.currentResolution), TextUtils.join(",", strArr), Integer.valueOf(intValue)}));
        if (this.mPlayerCache == 0 && this.currentVideoInfo != null) {
            this.mPlayerCache = this.currentVideoInfo.mo112216a(13);
        }
        this.mURLInfo.mo112109a(strArr[intValue]);
        if (this.mURLInfo.f117577a == null) {
            _receivedError(new C46117c("kTTVideoErrorDomainFetchingInfo", -9967, "mURLInfo.hostURL is empty"));
            return;
        }
        this.mURLs = strArr;
        Map<String, C46016a> map = this.urlIPMap;
        String str8 = this.mURLInfo.f117577a;
        String str9 = "";
        String str10 = "";
        boolean z2 = this.mUseDNSCache;
        boolean z3 = this.mIsUseServerDns;
        if (intValue == 0) {
            str = "main";
        } else {
            str = "backup";
        }
        String str11 = str10;
        boolean z4 = z2;
        boolean z5 = z3;
        C46016a aVar = new C46016a(str9, str11, z4 ? 1 : 0, z5 ? 1 : 0, str);
        map.put(str8, aVar);
        _updateVU();
        if (_usePlayerDNS(false)) {
            _playInternal(this.mURLInfo.f117577a, this.mHeaders);
        } else {
            _parseDNS(this.mURLInfo.f117577a);
        }
    }

    public void _receivedError(C46117c cVar) {
        boolean z;
        int i;
        this.mAllowedExpiredModel = false;
        _updateLogTime();
        if (this.mUserStopped) {
            this.mState = 0;
            return;
        }
        int i2 = this.mPlayAPIVersion;
        int _getPlayerTime = _getPlayerTime();
        if (!this.mRetrying) {
            if (this.mStartTime != 0) {
                this.mLastPlaybackTime = this.mStartTime;
                this.mStartTime = 0;
            } else if (!isSystemPlayer() || (isSystemPlayer() && this.mPrepared)) {
                if (this.mDuration <= 0 || _getPlayerTime - this.mDuration <= -1000) {
                    this.mLastPlaybackTime = _getPlayerTime;
                } else {
                    this.mLastPlaybackTime = 0;
                }
            }
        }
        if (this.mMediaPlayer == null || !(this.mMediaPlayer.isOSPlayer() || this.mMediaPlayer.getPlayerType() == 3 || this.mMediaPlayer.getPlayerType() == 4)) {
            z = false;
        } else {
            z = true;
        }
        if (this.mMediaPlayer != null && (this.mMediaPlayer.getPlayerType() == 0 || this.mMediaPlayer.getPlayerType() == 2)) {
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            this.mIsStartPlayAutomatically = true;
        }
        this.mErrorCount++;
        this.mAccumulatedErrorCount++;
        this.mState = 4;
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("videoEngine failed:%s", new Object[]{cVar.toString()}));
        if (cVar.f118004a == -9987) {
            C46123h.m144545a("TTVideoEngine", "can't decrypt video");
            _notifyError(cVar);
        } else if (cVar.f118004a == -9988) {
            C46123h.m144545a("TTVideoEngine", "decode encryptionkey error, not need to retry");
            _notifyError(cVar);
        } else {
            if (cVar.f118004a == -9990) {
                if (this.mPlayAPIVersion != 2 || TextUtils.isEmpty(this.mAuthorization)) {
                    C46123h.m144545a("TTVideoEngine", "invalid request, no need to retry");
                    _notifyError(cVar);
                    return;
                }
                this.mPlayAPIVersion = 1;
            }
            if (this.mErrorCount >= 3) {
                C46123h.m144545a("TTVideoEngine", "videoEngine retry failed");
                this.mLogger.mo112429u(this.mErrorCount);
                _notifyError(cVar);
            } else if (this.mAccumulatedErrorCount >= this.mMaxAccumulatedCountSetByUser) {
                C46123h.m144545a("TTVideoEngine", "videoEngine retry failed:reach maxAccumulatedErrorCount");
                this.mLogger.mo112427t(this.mAccumulatedErrorCount);
                _notifyError(cVar);
            } else {
                if (cVar.f118004a == -9969 && this.mPlayAPIVersion == 2) {
                    if (TextUtils.isEmpty(this.mAuthorization)) {
                        _notifyError(cVar);
                        StringBuilder sb = new StringBuilder("PLAY_API_VERSION_");
                        sb.append(this.mPlayAPIVersion);
                        sb.append(" authorize fail and auth of PLAY_API_VERSION_");
                        sb.append(this.mPlayAPIVersion - 1);
                        sb.append(" is empty");
                        C46123h.m144545a("TTVideoEngine", sb.toString());
                        return;
                    }
                    this.mPlayAPIVersion = 1;
                }
                this.mRetrying = true;
                int c = cVar.mo112289c();
                if ((this.mH265Enabled || this.mDashEnabled || this.mHttpsEnabled) && z) {
                    this.mH265Enabled = false;
                    this.mDashEnabled = false;
                    this.mEnableHttps = false;
                    this.mRetryEnableHttps = false;
                    c = 1;
                }
                if (cVar.f118004a == -499972) {
                    this.mLogger.mo112406m(cVar.f118004a);
                    sDNSType = new int[]{this.mHijackRetryMainDNSType, this.mHijackRetryBackupDNSType};
                    removeCacheFile(this.mVideoModel);
                    C46059d.m144301a().mo112185e();
                    C46059d.m144301a().mo112158a(90, this.mHijackRetryMainDNSType);
                    C46059d.m144301a().mo112158a(91, this.mHijackRetryBackupDNSType);
                    if (this.mHijackRetry || z || this.mVideoModel == null || !this.mVideoModel.mo112238c(106)) {
                        this.mHijackRetry = false;
                        _notifyError(cVar);
                        return;
                    }
                    this.mHijackRetry = true;
                    this.mRetryEnableHttps = true;
                    c = 2;
                }
                if (this.mDrmRetry && (cVar.f118004a == -499699 || cVar.f118004a == -499698)) {
                    this.mDrmType = 0;
                    c = 3;
                }
                if (this.mErrorCount == 2) {
                    if (this.mPlayAPIVersion == 2 && !TextUtils.isEmpty(this.mAuthorization)) {
                        this.mPlayAPIVersion = 1;
                    }
                    c = 1;
                }
                if (this.mIsLocal || this.mIsDirectURL) {
                    c = 3;
                }
                if (this.mIsPlayItem) {
                    this.mIsPlayItem = false;
                    c = 1;
                }
                C46123h.m144545a("TTVideoEngine", C1642a.m8034a("retry strategy:%d", new Object[]{Integer.valueOf(i)}));
                if (i2 != this.mPlayAPIVersion) {
                    StringBuilder sb2 = new StringBuilder("APIVersion rollback from PLAY_API_VERSION_");
                    sb2.append(i2);
                    sb2.append(" to PLAY_API_VERSION_");
                    sb2.append(this.mPlayAPIVersion);
                    sb2.append(" errorCount:");
                    sb2.append(this.mErrorCount);
                    C46123h.m144545a("TTVideoEngine", sb2.toString());
                }
                String str = this.mURLInfo.f117577a;
                if (!TextUtils.isEmpty(str) && str.startsWith("mem://bash")) {
                    str = C1642a.m8034a("mem://bash/url_index:%d", new Object[]{this.urlIndexMap.get(this.currentResolution)});
                }
                if (!cVar.f118006c.equals("kTTVideoErrorDomainHTTPDNS") && !cVar.f118006c.equals("kTTVideoErrorDomainLocalDNS") && i == 2 && ((Integer) this.urlIndexMap.get(this.currentResolution)).intValue() == 0) {
                    this.mLogger.mo112356b(cVar, str);
                }
                if (i == 3 && !this.mIsLocal) {
                    C46143c cVar2 = this.mLogger;
                    if (this.mIsDirectURL) {
                        str = this.mDirectURL;
                    }
                    cVar2.mo112340a(cVar, str);
                    if (cVar.f118004a == -2139062143) {
                        this.mMediaPlayer = null;
                    }
                }
                if (this.mIsPreloaderItem) {
                    if (this.mVideoModel != null) {
                        i = 2;
                    } else {
                        if (this.mFetcher != null) {
                            this.mFetcher.mo112143a();
                        }
                        i = 1;
                    }
                    this.mIsPreloaderItem = false;
                }
                if (i != 0) {
                    this.mLogger.mo112339a(cVar, i, i2);
                }
                _retry(i, cVar);
            }
        }
    }

    public static Resolution findBestResolution(C46083h hVar, int i) {
        return findBestResolution(hVar, Resolution.Standard, i);
    }

    public static void setIntValue(int i, int i2) {
        C46059d.m144301a().mo112158a(i, i2);
    }

    public static void setStringValue(int i, String str) {
        C46059d.m144301a().mo112160a(i, str);
    }

    public void setDirectURL(String str, String str2) {
        setDirectURL(str);
        this.mCachePath = str2;
        this.mFileKey = str2;
    }

    public void setExternLogListener(C46142b bVar, String str) {
        this.mExternVideoLoggerListener = bVar;
        this.mExternLogKey = str;
    }

    public void setQcomVpp(boolean z, int i) {
        this.mUseQcomVpp = z ? 1 : 0;
        this.mQcomVppLevel = i;
    }

    public void setVolume(float f, float f2) {
        this.mVolume = f;
        _setPlayerVolume(f, f2);
    }

    public void setTestSpeedEnable(int i, C46167v vVar) {
        this.mTestNetSpeed = i;
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setIntOption(79, i);
        }
        this.mTestNetSpeedListener = vVar;
    }

    public static long getCacheFileSize(C46083h hVar, Resolution resolution) {
        if (hVar != null) {
            C46082g b = hVar.mo112234b(resolution, null);
            if (b != null) {
                return C46059d.m144301a().mo112180c(b.mo112220b(15));
            }
        }
        return 0;
    }

    public void configParams(Resolution resolution, Map<Integer, String> map) {
        if (resolution != null) {
            C46123h.m144545a("TTVideoEngine", C1642a.m8034a("config params,resolution:%s", new Object[]{_resolutionToString(resolution)}));
            _configResolution(resolution, map);
        }
    }

    public void seekTo(int i, C46164s sVar) {
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("seek to time:%d", new Object[]{Integer.valueOf(i)}));
        this.mSeekCompletionListener = sVar;
        _seekTo(i, false);
    }

    public void setFloatOption(int i, float f) {
        switch (i) {
            case 325:
                this.mAEPreGain = f;
                return;
            case 326:
                this.mAEThreshold = f;
                return;
            case 327:
                this.mAERatio = f;
                return;
            case 328:
                this.mAEPredelay = f;
                break;
        }
    }

    public void setLongOption(int i, long j) {
        if (i == 217) {
            this.mALogWriteAddr = j;
            C46059d.m144301a().mo112159a(62, j);
        }
    }

    private void _playVideo(String str, String str2) {
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("start to play video, host:%s, ip:%s", new Object[]{str, str2}));
        this.mURLInfo.mo112110b(str2);
        if (!TextUtils.isEmpty(str)) {
            this.currentHost = str;
            this.mHeaders.put("Host", C1642a.m8034a(" %s", new Object[]{str}));
        }
        _playInternal(this.mURLInfo.f117578b, this.mHeaders);
    }

    private void _setPlayerVolume(float f, float f2) {
        if (this.mMediaPlayer != null) {
            if (this.mSetTrackVolume == 0 && this.mMediaPlayer.isOSPlayer()) {
                float f3 = 1.0f;
                if (f != 0.0f) {
                    f2 = 1.0f;
                } else {
                    f3 = f;
                }
                AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.setStreamVolume(3, (int) f, 0);
                }
                f = f3;
            }
            this.mMediaPlayer.setVolume(f, f2);
        }
    }

    public static Resolution findDefaultResolution(C46083h hVar, Resolution resolution) {
        if (hVar != null) {
            int length = Resolution.getAllResolutions().length;
            Resolution[] g = hVar.mo112243g();
            if (g != null && g.length != 0) {
                int length2 = g.length;
                int i = 0;
                Resolution resolution2 = resolution;
                while (true) {
                    if (i >= length2) {
                        resolution = resolution2;
                        break;
                    }
                    Resolution resolution3 = g[i];
                    int abs = Math.abs(resolution3.ordinal() - resolution.ordinal());
                    if (abs < length) {
                        if (abs == 0) {
                            resolution = resolution3;
                            break;
                        }
                        resolution2 = resolution3;
                        length = abs;
                    }
                    i++;
                }
            } else {
                return resolution;
            }
        }
        return resolution;
    }

    public static Resolution findMaxCacheResolution(C46083h hVar, Resolution resolution) {
        if (hVar != null) {
            long j = 0;
            Resolution[] g = hVar.mo112243g();
            if (g == null || g.length == 0) {
                return resolution;
            }
            for (Resolution resolution2 : g) {
                long cacheFileSize = getCacheFileSize(hVar, resolution2);
                if (cacheFileSize > j) {
                    resolution = resolution2;
                    j = cacheFileSize;
                }
            }
        }
        return resolution;
    }

    public static Resolution findMaxQualityResolution(C46083h hVar, Resolution resolution) {
        if (hVar != null) {
            Resolution[] g = hVar.mo112243g();
            if (g == null || g.length == 0) {
                return resolution;
            }
            for (Resolution resolution2 : g) {
                if (getCacheFileSize(hVar, resolution2) > 0 && resolution2.ordinal() > resolution.ordinal()) {
                    resolution = resolution2;
                }
            }
        }
        return resolution;
    }

    private boolean isSupportFileCache(String str, C46083h hVar) {
        if (hVar != null && (hVar.mo112231a() || hVar.mo112236b())) {
            return false;
        }
        if (TextUtils.isEmpty(str) || (str.indexOf(".m3u8") <= 0 && str.indexOf(".mpd") <= 0)) {
            return true;
        }
        return false;
    }

    public static void setDNSType(int i, int i2) {
        sDNSType = new int[]{i, i2};
        StringBuilder sb = new StringBuilder("setDNSType main:");
        sb.append(i);
        sb.append(" backup:");
        sb.append(i2);
        C46123h.m144545a("TTVideoEngine", sb.toString());
    }

    public static void setSettingConfig(Context context, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap = (HashMap) map;
        }
        hashMap.put("ttm_version", Integer.valueOf(C46122g.m144537d("1.9.17.123")));
        hashMap.put("avplayerVersion", Integer.valueOf(C46122g.m144537d(TTPlayerConfiger.getValue(14, ""))));
        C46111a a = C46111a.m144490a(context);
        a.mo112282a(hashMap);
        a.mo112283a(false);
    }

    public void setCustomHeader(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = this.mHeaders;
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, 1).toUpperCase());
            sb.append(str.substring(1));
            hashMap.put(sb.toString(), str2);
        }
    }

    public void setPlayAPIVersion(int i, String str) {
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("setPlayAPIVersion:%d", new Object[]{Integer.valueOf(i)}));
        this.mPlayAPIVersion = i;
        this.mAuthorization = str;
        if (this.mLogger != null) {
            this.mLogger.mo112330a(i, str);
        }
    }

    private void _configResolution(Resolution resolution, Map<Integer, String> map) {
        if (resolution != Resolution.Auto) {
            setIntOption(29, 0);
            if (this.mState == 0 || this.mState == 1 || this.mIsPlayComplete) {
                this.lastResolution = resolution;
                this.currentResolution = resolution;
                this.currentParams = map;
                if (TextUtils.isEmpty(this.mDirectURL) && TextUtils.isEmpty(this.mLocalURL)) {
                    this.mLogger.mo112343a(_resolutionToString(resolution), _resolutionToString(resolution));
                }
            } else if (this.mState == 3) {
                _switchToResolution(resolution, map);
            }
        } else {
            setIntOption(29, 1);
        }
    }

    private void _retry(int i, C46117c cVar) {
        String str;
        String str2;
        switch (i) {
            case 0:
                _notifyError(cVar);
                return;
            case 1:
                _fetchVideoInfo();
                return;
            case 2:
                _tryNextURL();
                return;
            case 3:
                if (!this.mIsLocal && !this.mIsDirectURL) {
                    if (!this.mIsPreloaderItem && !this.mIsPlayItem) {
                        _playInternal(this.mURLInfo.mo112108a(), this.mHeaders);
                        break;
                    } else {
                        if (this.mIsPreloaderItem) {
                            str2 = this.mPreloaderItem.f117983b;
                        } else {
                            str2 = this.mPlayItem.f118700a;
                        }
                        _singleURLParseAndPlay(str2, this.mHeaders);
                        return;
                    }
                } else {
                    if (this.mIsLocal) {
                        str = this.mLocalURL;
                    } else {
                        str = this.mDirectURL;
                    }
                    _singleURLParseAndPlay(str, this.mHeaders);
                    return;
                }
                break;
        }
    }

    private void _seekTo(int i, boolean z) {
        int i2;
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("_seekTo:%d", new Object[]{Integer.valueOf(i)}));
        if (this.mMediaPlayer == null || !this.mStarted) {
            _seekComplete(false);
            return;
        }
        if (!this.mSeeking && this.mPlayDuration != null) {
            this.mPlayDuration.mo112292b();
        }
        if (z) {
            i2 = this.mLastPlaybackTime;
        } else {
            i2 = _getPlayerTime();
        }
        if (this.mForbidP2PWhenSeek > 0 && this.curP2PUrlInfo != null && this.curP2PUrlInfo.f117783c > 0 && !TextUtils.isEmpty(this.curP2PUrlInfo.f117781a)) {
            C46123h.m144545a("TTVideoEngine", "forbid proxy p2p when seek");
            C46030a.m144223a().mo112116b(this.curP2PUrlInfo.f117781a);
        }
        this.mSeeking = true;
        this.mMediaPlayer.seekTo(i);
        setPlayInfo(1, (long) i);
        this.mLogger.mo112328a(i2, i, z);
    }

    private void _selectTrack(int i, int i2) {
        int i3;
        int i4;
        if (this.mMediaPlayer != null) {
            TrackInfo[] trackInfo = this.mMediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                if (i2 == C46084i.f117863a) {
                    i3 = 1;
                } else {
                    i3 = 2;
                }
                int i5 = 0;
                while (true) {
                    if (i5 >= trackInfo.length) {
                        i4 = -1;
                        break;
                    }
                    TrackInfo trackInfo2 = trackInfo[i5];
                    if (trackInfo2.getTrackType() == i3) {
                        MediaFormat format = trackInfo2.getFormat();
                        if (format.getInteger("bitrate") == i) {
                            i4 = format.getInteger("track-id");
                            break;
                        }
                    }
                    i5++;
                }
                if (i4 != -1) {
                    this.mMediaPlayer.selectTrack(i4);
                }
            }
        }
    }

    private void _setDataSource(String str, HashMap hashMap) throws IOException {
        String _generatePlayUrl = _generatePlayUrl(str, hashMap);
        if (this.mRetryEnableHttps) {
            _generatePlayUrl = C46122g.m144539f(_generatePlayUrl);
        }
        long currentTimeMillis = System.currentTimeMillis();
        C46078c generateP2PInfo = generateP2PInfo(_generatePlayUrl, hashMap);
        if (generateP2PInfo.f117783c > 0) {
            this.mMediaPlayer.setIntOption(310, this.mNetworkTryCount);
            if (this.mLogger != null) {
                this.mLogger.mo112390i(this.mNetworkTryCount);
            }
        }
        this.curP2PUrlInfo = generateP2PInfo;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (this.mLogger != null) {
            this.mLogger.mo112312F(this.mP2PCDNType);
            this.mLogger.mo112313G(generateP2PInfo.f117783c);
            if (generateP2PInfo.f117783c > 0) {
                this.mLogger.mo112383g(currentTimeMillis);
                this.mLogger.mo112387h(currentTimeMillis2);
                this.mLogger.mo112424r(generateP2PInfo.f117781a);
                this.mLogger.mo112426s(generateP2PInfo.f117784d);
            }
        }
        this.mMediaPlayer.setDataSource(this.mContext, Uri.parse(generateP2PInfo.f117781a), (Map<String, String>) generateP2PInfo.f117782b);
    }

    private void _singleURLParseAndPlay(String str, HashMap hashMap) {
        if (this.mIsUseBoe) {
            str = C46122g.m144538e(str);
        }
        this.mURLInfo.mo112109a(str);
        if (_usePlayerDNS(true) || this.mIsLocal) {
            _playInternal(str, hashMap);
        } else if (C46122g.m144540g(str) || str.indexOf(WebKitApi.SCHEME_HTTP) != 0) {
            _playInternal(str, hashMap);
        } else {
            Map<String, C46016a> map = this.urlIPMap;
            String str2 = this.mURLInfo.f117577a;
            boolean z = this.mUseDNSCache;
            boolean z2 = this.mIsUseServerDns;
            C46016a aVar = new C46016a("", "", z ? 1 : 0, z2 ? 1 : 0, "single");
            map.put(str2, aVar);
            this.mURLs = new String[]{str};
            _updateVU();
            _parseDNS(str);
        }
    }

    public static void setAppInfo(Context context, Map map) {
        if (map != null && map.size() != 0) {
            C46029a.f117581a = context;
            C46029a.f117583c = (String) map.get("appname");
            Object obj = map.get("appid");
            if (obj != null) {
                C46029a.f117582b = ((Integer) obj).intValue();
            }
            C46029a.f117584d = (String) map.get("appchannel");
            C46029a.f117585e = (String) map.get("appversion");
            C46029a.f117586f = (String) map.get("deviceid");
        }
    }

    public void _updateLoadState(int i, int i2) {
        if (this.mLoadState != i) {
            C46123h.m144545a("TTVideoEngine", C1642a.m8034a("load state changed, prev:%d, current:%d", new Object[]{Integer.valueOf(this.mLoadState), Integer.valueOf(i)}));
            if (i == 2 && this.mHasFirstFrameShown && !this.mSeeking && this.mLoadState != 3) {
                int _getPlayerTime = _getPlayerTime();
                this.mBufferingType = i2;
                if (this.mLogger != null) {
                    this.mLogger.mo112350b(i2, _getPlayerTime);
                }
                this.mBufferingStartT = SystemClock.elapsedRealtime();
            }
            this.mLoadState = i;
            if (this.mVideoEngineListener == null) {
                return;
            }
            if (this.mShouldPlay || i != 3) {
                this.mVideoEngineListener.onLoadStateChanged(this, this.mLoadState);
            }
        }
    }

    public void setAsyncInit(boolean z, int i) {
        MediaPlayer mediaPlayer;
        if (this.mAsyncPlayer != null) {
            mediaPlayer = this.mAsyncPlayer;
        } else {
            mediaPlayer = this.mMediaPlayer;
        }
        this.mAsyncInitEnable = z ? 1 : 0;
        if (this.mVideoModel != null) {
            i = -1;
        }
        this.mCodecId = i;
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("setAsyncInit enable:%b codecid:%d", new Object[]{Integer.valueOf(this.mAsyncInitEnable), Integer.valueOf(this.mCodecId)}));
        if (mediaPlayer != null && this.mHardwareDecodeEnablePlayer2 == 1) {
            mediaPlayer.setIntOption(181, this.mAsyncInitEnable);
            mediaPlayer.setIntOption(182, this.mCodecId);
            this.mLogger.mo112327a(this.mAsyncInitEnable, this.mCodecId);
        }
    }

    public void setDirectUrlUseDataLoader(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2) || !C46059d.m144301a().mo112181c() || this.mDataLoaderEnable <= 0) {
                setDirectURL(str);
            } else {
                String str3 = str2;
                String a = C46059d.m144301a().mo112156a(str3, this.mVideoID, (long) this.mLimitMDLCacheSize, new String[]{str}, Resolution.Undefine, this.mDecryptionKey, null, null, null);
                if (TextUtils.isEmpty(a)) {
                    setDirectURL(str);
                } else {
                    this.mLogger.mo112315I(1);
                    setDirectURL(a);
                }
            }
        }
    }

    public void setDirectUrlUseDataLoaderByFilePath(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2) || !C46059d.m144301a().mo112181c() || this.mDataLoaderEnable <= 0) {
                setDirectURL(str);
            } else {
                String a = C46122g.m144524a(this.mContext, str2);
                String str3 = a;
                String a2 = C46059d.m144301a().mo112156a(str3, this.mVideoID, (long) this.mLimitMDLCacheSize, new String[]{str}, Resolution.Undefine, this.mDecryptionKey, null, str2, null);
                if (TextUtils.isEmpty(a2)) {
                    setDirectURL(str);
                } else {
                    this.mLogger.mo112315I(1);
                    this.mUsingDataLoaderPlayTaskKey = a;
                    setDirectURL(a2);
                }
            }
        }
    }

    private String _generatePlayUrl(String str, HashMap hashMap) {
        String str2;
        if (this.mBashEnabled && this.mVideoModel != null && !TextUtils.isEmpty(str) && !str.startsWith("mem://bash")) {
            String f = this.mVideoModel.mo112242f();
            String b = this.mVideoModel.mo112235b(8);
            if (!TextUtils.isEmpty(f) && !TextUtils.isEmpty(b) && f.equals("segment_base")) {
                String a = C1642a.m8034a("mem://bash/url_index:%d/check_hijack:%d/%s", new Object[]{this.urlIndexMap.get(this.currentResolution), Integer.valueOf(this.mCheckHijack ? 1 : 0), b});
                if (hashMap != null && hashMap.containsKey("Host")) {
                    String obj = hashMap.get("Host").toString();
                    try {
                        str2 = new URI(str).getHost();
                    } catch (URISyntaxException unused) {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(str2)) {
                        str = a.replaceAll(obj.trim(), str2);
                    }
                }
                str = a;
            }
        }
        if (this.mForbidP2P == 1) {
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.remove("X-Tt-CDN");
            hashMap.put("X-Tt-CDN", "0");
        }
        this.mLogger.mo112314H(str.startsWith("mem://bash") ? 1 : 0);
        return str;
    }

    private void _stop(boolean z, int i) {
        C46123h.m144545a("TTVideoEngine", C1642a.m8034a("_stop, mState:%d", new Object[]{Integer.valueOf(this.mState)}));
        switch (this.mState) {
            case 0:
                this.mUserStopped = true;
                break;
            case 1:
                this.mUserStopped = true;
                if (this.mFetcher != null) {
                    this.mFetcher.mo112143a();
                    break;
                }
                break;
            case 2:
                this.mUserStopped = true;
                if (this.mDNSParser != null) {
                    this.mDNSParser.mo112262c();
                    break;
                }
                break;
            case 3:
                this.mUserStopped = true;
                break;
        }
        _updateLogger();
        if (this.mMediaPlayer != null && this.mPrepared && z) {
            this.mMediaPlayer.stop();
        }
        if (this.mPlayDuration != null) {
            this.mPlayDuration.mo112292b();
        }
        if (this.mLogger != null) {
            if (this.mMediaPlayer != null) {
                this.mLogger.mo112433w(this.mMediaPlayer.getCurrentPosition());
                if (this.mState == 3) {
                    this.mLogger.mo112406m(this.mMediaPlayer.getIntOption(204, -1));
                }
                HashMap hashMap = new HashMap();
                hashMap.put("abr_probe_count", Integer.valueOf(this.mMediaPlayer.getIntOption(179, 0)));
                hashMap.put("abr_switch_count", Integer.valueOf(this.mMediaPlayer.getIntOption(173, 0)));
                hashMap.put("abr_average_bitrate", Integer.valueOf(this.mMediaPlayer.getIntOption(174, 0)));
                hashMap.put("abr_average_play_speed", Integer.valueOf(this.mMediaPlayer.getIntOption(175, 0)));
                this.mLogger.mo112367c((Map) hashMap);
            }
            if (!(this.mPlaybackState == 0 || this.mPlayDuration == null)) {
                this.mLogger.mo112316J(this.mPlayDuration.mo112293c());
            }
            this.mLogger.mo112326a(i);
        }
        _updatePlaybackState(0);
    }

    public static void addTask(String str, C46160o oVar) {
        C46059d.m144301a().mo112171a(str, oVar);
    }

    private C46078c generateP2PInfo(String str, HashMap hashMap) {
        C46078c cVar = new C46078c(str, hashMap, 0);
        if (this.mP2PCDNType == 0 || TextUtils.isEmpty(str) || str.startsWith("http://127.0.0.1") || str.startsWith("mem://")) {
            return cVar;
        }
        int parseP2PCDNType = parseP2PCDNType(str);
        if (parseP2PCDNType != 1) {
            return cVar;
        }
        String str2 = "";
        if (hashMap != null && hashMap.containsKey("Host")) {
            String obj = hashMap.get("Host").toString();
            try {
                str2 = new URI(str).getHost();
            } catch (URISyntaxException unused) {
            }
            if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(str2)) {
                str = str.replaceFirst(str2, obj.trim());
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb = new StringBuilder("xycip=");
                    sb.append(str2);
                    str = C46122g.m144527a(str, sb.toString());
                }
            }
        }
        if (this.mForbidP2P == 1) {
            str = C46122g.m144527a(str, "xyp2p=0");
        }
        String a = C46030a.m144223a().mo112112a(C46122g.m144527a(str, "xynp=1&xyer=1"), 1);
        if (this.mLogger != null) {
            this.mLogger.mo112391i(System.currentTimeMillis());
        }
        if (!TextUtils.isEmpty(a) && (a.startsWith("http://127.0.0.1") || a.startsWith("https://127.0.0.1"))) {
            if (hashMap != null) {
                hashMap.remove("Host");
            }
            cVar.f117783c = parseP2PCDNType;
            cVar.f117781a = a;
            cVar.f117782b = hashMap;
            cVar.f117784d = C46030a.m144223a().mo112118c();
        }
        return cVar;
    }

    public void setDirectUrlUseDataLoader(String[] strArr, String str) {
        if (strArr.length == 0) {
            C46123h.m144547c("TTVideoEngine", "invalid urls list, it is empty");
            return;
        }
        if (!TextUtils.isEmpty(str) && C46059d.m144301a().mo112181c() && this.mDataLoaderEnable > 0) {
            String a = C46059d.m144301a().mo112156a(str, this.mVideoID, (long) this.mLimitMDLCacheSize, strArr, Resolution.Undefine, this.mDecryptionKey, null, null, null);
            if (!TextUtils.isEmpty(a)) {
                this.mLogger.mo112315I(1);
                setDirectURL(a);
            } else if (TextUtils.isEmpty(strArr[0])) {
                C46123h.m144547c("TTVideoEngine", "cannot construct proxyUrl, and the first url is empty");
            } else {
                setDirectURL(strArr[0]);
            }
        } else if (TextUtils.isEmpty(strArr[0])) {
            C46123h.m144547c("TTVideoEngine", "media loader disabled, and the first url is empty");
        } else {
            setDirectURL(strArr[0]);
        }
    }

    public void setDirectUrlUseDataLoaderByFilePath(String[] strArr, String str) {
        if (strArr.length == 0) {
            C46123h.m144547c("TTVideoEngine", "invalid urls list, it is empty");
            return;
        }
        if (!TextUtils.isEmpty(str) && C46059d.m144301a().mo112181c() && this.mDataLoaderEnable > 0) {
            String a = C46059d.m144301a().mo112156a(C46122g.m144524a(this.mContext, str), this.mVideoID, (long) this.mLimitMDLCacheSize, strArr, Resolution.Undefine, this.mDecryptionKey, null, str, null);
            if (!TextUtils.isEmpty(a)) {
                this.mLogger.mo112315I(1);
                setDirectURL(a);
            } else if (TextUtils.isEmpty(strArr[0])) {
                C46123h.m144547c("TTVideoEngine", "cannot construct proxyUrl, and the first url is empty");
            } else {
                setDirectURL(strArr[0]);
            }
        } else if (TextUtils.isEmpty(strArr[0])) {
            C46123h.m144547c("TTVideoEngine", "media loader disabled, and the first url is empty");
        } else {
            setDirectURL(strArr[0]);
        }
    }

    public TTVideoEngine(Context context, int i) {
        boolean z;
        boolean z2;
        C46123h.m144545a("TTVideoEngine", "init");
        this.mContext = context;
        this.mIsMute = false;
        this.mFirstURL = true;
        this.mFirstIP = true;
        this.mFirstHost = true;
        this.currentResolution = Resolution.Standard;
        this.urlIndexMap = new HashMap();
        _resetUrlIndexMap();
        this.urlIPMap = new HashMap();
        this.mHeaders = new HashMap<>();
        this.mConfigParams = new HashMap<>();
        this.mPlayerType = i;
        this.mTextureFirstFrame = false;
        this.mNotifyFirstFrame = false;
        this.mDataLoaderEnable = ONLY_USE_MEDIALOADER ? 1 : 0;
        TTPlayerConfiger.setValue(6, false);
        if (i != 2) {
            z = true;
        } else {
            z = false;
        }
        TTPlayerConfiger.setValue(1, z);
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        TTPlayerConfiger.setValue(2, z2);
        TTPlayerConfiger.setValue(11, false);
        TTPlayerConfiger.setValue(4, false);
        if (i == 3) {
            setForceUseLitePlayer(true);
        }
        if (VideoEventManager.instance.getLoggerVersion() == 2) {
            this.mLogger = new C46151i(context, new C46023h(this));
        } else {
            this.mLogger = new C46148h(context, new C46023h(this));
        }
        this.mLogger.mo112343a(_resolutionToString(this.currentResolution), "");
        if (!ONLY_USE_MEDIALOADER) {
            createDefaultCacheFileDirectory();
        }
        this.mPlayDuration = new C46118d();
        if (!C46125j.m144552b()) {
            C46125j.m144551a(this.mContext);
        }
        this.mInfoCollector = C46034ab.m144233a();
        if (this.mInfoCollector != null) {
            this.mInfoCollector.mo112120a(this.mSerial, this);
        }
    }

    private void _switchToResolution(Resolution resolution, Map<Integer, String> map) {
        int i;
        if (this.currentResolution == resolution && ((this.currentParams == null && map == null) || (this.currentParams != null && this.currentParams.equals(map)))) {
            C46123h.m144545a("TTVideoEngine", C1642a.m8034a("switch to the same resolution:%s, drop", new Object[]{_resolutionToString(resolution)}));
        } else if (this.mVideoModel != null) {
            this.lastResolution = this.currentResolution;
            this.currentResolution = resolution;
            this.currentParams = map;
            C46123h.m144545a("TTVideoEngine", C1642a.m8034a("will switch to resolution:%s, from resolution:%s", new Object[]{_resolutionToString(this.currentResolution), _resolutionToString(this.lastResolution)}));
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    StringBuilder sb = new StringBuilder("will switch to params, Key = ");
                    sb.append(entry.getKey());
                    sb.append(",Value = ");
                    sb.append((String) entry.getValue());
                    C46123h.m144545a("TTVideoEngine", sb.toString());
                }
            }
            this.mLogger.mo112358b(_resolutionToString(this.currentResolution), _resolutionToString(this.lastResolution));
            if (this.mDashEnabled) {
                String str = null;
                int i2 = C46084i.f117863a;
                if (this.mVideoModel.f117858d != null) {
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    if (map != null && this.mH265Enabled && this.mVideoModel.mo112238c(204)) {
                        map.put(Integer.valueOf(8), "h265");
                    } else if (map != null && this.mVideoModel.mo112238c(203)) {
                        map.put(Integer.valueOf(8), "h264");
                    }
                    C46082g _videoInfoForResolution = _videoInfoForResolution(this.currentResolution, this.mVideoModel.mo112223a(7), map);
                    if (_videoInfoForResolution != null) {
                        str = _videoInfoForResolution.mo112220b(6);
                        int a = _videoInfoForResolution.mo112216a(3);
                        int i3 = _videoInfoForResolution.f117802B;
                        i = a;
                        i2 = i3;
                    } else {
                        i = 0;
                    }
                    String f = this.mVideoModel.mo112242f();
                    if (!TextUtils.isEmpty(f) && f.equals("segment_base") && this.mVideoEngineInfoListener != null && this.mVideoEngineInfos != null) {
                        ArrayList arrayList = new ArrayList();
                        C46082g _videoInfoForResolution2 = _videoInfoForResolution(this.currentResolution, C46084i.f117863a, map);
                        C46082g _videoInfoForResolution3 = _videoInfoForResolution(this.currentResolution, C46084i.f117864b, map);
                        if (_videoInfoForResolution2 != null) {
                            arrayList.add(_videoInfoForResolution2);
                        }
                        if (_videoInfoForResolution3 != null) {
                            arrayList.add(_videoInfoForResolution3);
                        }
                        this.mVideoEngineInfos.f118723a = "usingUrlInfos";
                        this.mVideoEngineInfos.f118724b = arrayList;
                    }
                } else {
                    i = 0;
                }
                if (TextUtils.isEmpty(str) || (!str.equals("dash") && !str.equals("mpd"))) {
                    this.mDashEnabled = false;
                    this.mIsDashSource = false;
                } else if (!(this.mMediaPlayer == null || isSystemPlayer() || this.mPlaybackState == 2)) {
                    if (this.mUsePlayer3) {
                        _selectTrack(i, i2);
                        return;
                    } else {
                        this.mMediaPlayer.switchStream(i, i2);
                        return;
                    }
                }
            }
            if (!this.mSwitchingResolution) {
                this.mSwitchingResolution = true;
                this.mLogger.mo112368d();
                if (!this.mDashEnabled && this.mPlayDuration != null) {
                    this.mPlayDuration.mo112292b();
                }
                this.mLastPlaybackTime = _getPlayerTime();
            }
            if (this.mMediaPlayer != null) {
                this.mMediaPlayer.pause();
            }
            _parseIPAddress(this.mVideoModel);
        }
    }

    public void setPlayInfo(int i, long j) {
        String str;
        if (this.mEnableSetPlayInfoToP2P == 0 || this.mForbidP2P == 1 || this.mP2PCDNType <= 0) {
            C46123h.m144546b("TTVideoEngine", "not enable set playinfo");
            return;
        }
        int i2 = 3;
        int i3 = -1;
        if (this.curP2PUrlInfo != null && this.curP2PUrlInfo.f117783c > 0 && !TextUtils.isEmpty(this.curP2PUrlInfo.f117781a)) {
            switch (i) {
                case 0:
                    i2 = 2;
                    break;
                case 2:
                    break;
                default:
                    i2 = -1;
                    break;
            }
            if (i == 1) {
                C46123h.m144545a("PROXY-XY-SETPLAYINFO", C1642a.m8034a("set play info into xyproxy p2p  key is play pos value:%d", new Object[]{Long.valueOf(j)}));
                C46030a.m144223a().mo112114a(this.curP2PUrlInfo.f117781a, j);
            } else {
                C46123h.m144545a("PROXY-XY-SETPLAYINFO", C1642a.m8034a("set play info into xyproxy p2p key:%d value:%d", new Object[]{Integer.valueOf(i2), Long.valueOf(j)}));
                C46030a.m144223a().mo112113a(this.curP2PUrlInfo.f117781a, i2, j);
            }
        } else if (this.mDataLoaderEnable > 0) {
            if (this.mLogger == null) {
                str = null;
            } else {
                str = this.mLogger.mo112393j();
            }
            if (TextUtils.isEmpty(str)) {
                C46123h.m144546b("TTVideoEngine", "trace id null, not allow setplayinfo");
                return;
            }
            switch (i) {
                case 0:
                    i3 = 22;
                    break;
                case 1:
                    i3 = 23;
                    break;
                case 2:
                    i3 = 24;
                    break;
                case 3:
                    i3 = 25;
                    break;
                case 4:
                    i3 = 26;
                    break;
                case 5:
                    if (this.mMediaPlayer != null) {
                        if (j == -1) {
                            long longOption = this.mMediaPlayer.getLongOption(73, -1);
                            long longOption2 = this.mMediaPlayer.getLongOption(72, -1);
                            if (longOption >= 0 && longOption2 >= 0) {
                                longOption = Math.min(longOption, longOption2);
                            } else if (longOption2 >= 0) {
                                j = longOption2;
                            }
                            j = longOption;
                        }
                        i3 = 27;
                        break;
                    } else {
                        C46123h.m144546b("MDL-SETPLAYINFO", "mediaplayer is null not allow set PLAY_INFO_CURRENT_BUFFER");
                        return;
                    }
            }
            C46059d.m144301a().mo112161a(i3, str, j);
            C46123h.m144546b("MDL-SETPLAYINFO", C1642a.m8034a("set play info into mdl key:%d value:%d traceid:%s", new Object[]{Integer.valueOf(i3), Long.valueOf(j), str}));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:284:0x049f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setIntOption(int r9, int r10) {
        /*
            r8 = this;
            r0 = 59
            r1 = 86
            r2 = 24
            r3 = 11
            r4 = 2
            r5 = 0
            r6 = 1
            switch(r9) {
                case 0: goto L_0x0519;
                case 1: goto L_0x050b;
                case 2: goto L_0x04fd;
                case 3: goto L_0x04f0;
                case 4: goto L_0x04e2;
                case 5: goto L_0x04d4;
                case 6: goto L_0x04cc;
                case 7: goto L_0x04a8;
                case 8: goto L_0x0499;
                case 9: goto L_0x048a;
                case 10: goto L_0x047d;
                case 11: goto L_0x0462;
                case 12: goto L_0x044f;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r9) {
                case 14: goto L_0x044b;
                case 15: goto L_0x0447;
                case 16: goto L_0x0436;
                case 17: goto L_0x042d;
                case 18: goto L_0x0424;
                case 19: goto L_0x0420;
                case 20: goto L_0x040c;
                case 21: goto L_0x03f7;
                case 22: goto L_0x03ee;
                case 23: goto L_0x03e5;
                case 24: goto L_0x03d6;
                case 25: goto L_0x03c7;
                case 26: goto L_0x03b3;
                case 27: goto L_0x03af;
                case 28: goto L_0x03ab;
                case 29: goto L_0x039c;
                case 30: goto L_0x0377;
                case 31: goto L_0x036a;
                case 32: goto L_0x035b;
                case 33: goto L_0x0352;
                case 34: goto L_0x0343;
                default: goto L_0x0011;
            }
        L_0x0011:
            switch(r9) {
                case 36: goto L_0x0334;
                case 37: goto L_0x032b;
                default: goto L_0x0014;
            }
        L_0x0014:
            switch(r9) {
                case 100: goto L_0x0322;
                case 101: goto L_0x031e;
                default: goto L_0x0017;
            }
        L_0x0017:
            switch(r9) {
                case 110: goto L_0x031a;
                case 111: goto L_0x0311;
                default: goto L_0x001a;
            }
        L_0x001a:
            switch(r9) {
                case 116: goto L_0x030b;
                case 117: goto L_0x02fc;
                default: goto L_0x001d;
            }
        L_0x001d:
            switch(r9) {
                case 160: goto L_0x02f8;
                case 161: goto L_0x02f4;
                default: goto L_0x0020;
            }
        L_0x0020:
            switch(r9) {
                case 183: goto L_0x02e3;
                case 184: goto L_0x02d4;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = 95
            switch(r9) {
                case 198: goto L_0x02c5;
                case 199: goto L_0x02c1;
                case 200: goto L_0x02b0;
                case 201: goto L_0x0297;
                case 202: goto L_0x0288;
                case 203: goto L_0x027b;
                case 204: goto L_0x026c;
                case 205: goto L_0x025d;
                case 206: goto L_0x0252;
                case 207: goto L_0x023e;
                case 208: goto L_0x022f;
                default: goto L_0x0028;
            }
        L_0x0028:
            switch(r9) {
                case 210: goto L_0x0220;
                case 211: goto L_0x0211;
                case 212: goto L_0x0202;
                case 213: goto L_0x01f3;
                case 214: goto L_0x01e4;
                case 215: goto L_0x01d5;
                case 216: goto L_0x01c6;
                default: goto L_0x002b;
            }
        L_0x002b:
            switch(r9) {
                case 301: goto L_0x01c2;
                case 302: goto L_0x01be;
                default: goto L_0x002e;
            }
        L_0x002e:
            switch(r9) {
                case 310: goto L_0x01af;
                case 311: goto L_0x01a2;
                case 312: goto L_0x0199;
                case 313: goto L_0x0190;
                case 314: goto L_0x018c;
                default: goto L_0x0031;
            }
        L_0x0031:
            switch(r9) {
                case 320: goto L_0x017d;
                case 321: goto L_0x016e;
                case 322: goto L_0x015f;
                case 323: goto L_0x0150;
                case 324: goto L_0x0141;
                default: goto L_0x0034;
            }
        L_0x0034:
            switch(r9) {
                case 329: goto L_0x013d;
                case 330: goto L_0x012e;
                case 331: goto L_0x011d;
                case 332: goto L_0x0107;
                case 333: goto L_0x00f1;
                default: goto L_0x0037;
            }
        L_0x0037:
            switch(r9) {
                case 400: goto L_0x00e8;
                case 401: goto L_0x00e4;
                case 402: goto L_0x00e0;
                case 403: goto L_0x00d7;
                default: goto L_0x003a;
            }
        L_0x003a:
            switch(r9) {
                case 410: goto L_0x00ce;
                case 411: goto L_0x00c7;
                case 412: goto L_0x00c2;
                case 413: goto L_0x00af;
                case 414: goto L_0x009c;
                case 415: goto L_0x008d;
                case 416: goto L_0x0089;
                case 417: goto L_0x007a;
                case 418: goto L_0x0076;
                case 419: goto L_0x0072;
                case 420: goto L_0x006e;
                case 421: goto L_0x006a;
                case 422: goto L_0x0066;
                case 423: goto L_0x0062;
                case 424: goto L_0x005e;
                case 425: goto L_0x005a;
                default: goto L_0x003d;
            }
        L_0x003d:
            switch(r9) {
                case 250: goto L_0x004b;
                case 450: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0524
        L_0x0042:
            if (r10 <= 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            r8.mAllowedExpiredModel = r0
            goto L_0x0524
        L_0x004b:
            r8.mIsTTHlsDrm = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 250(0xfa, float:3.5E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x005a:
            r8.mHijackRetryBackupDNSType = r10
            goto L_0x0524
        L_0x005e:
            r8.mHijackRetryMainDNSType = r10
            goto L_0x0524
        L_0x0062:
            r8.mAudioRangeSize = r10
            goto L_0x0524
        L_0x0066:
            r8.mVideoRangeSize = r10
            goto L_0x0524
        L_0x006a:
            r8.mEnableFragRange = r10
            goto L_0x0524
        L_0x006e:
            r8.mEnableIndexCache = r10
            goto L_0x0524
        L_0x0072:
            r8.mBestResolutionType = r10
            goto L_0x0524
        L_0x0076:
            r8.mForbidP2PWhenSeek = r10
            goto L_0x0524
        L_0x007a:
            r8.mSoloPlayEnable = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 185(0xb9, float:2.59E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x0089:
            r8.mEnableSetPlayInfoToP2P = r10
            goto L_0x0524
        L_0x008d:
            r8.mSetTrackVolume = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 94
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x009c:
            r8.mDefaultRenderType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            boolean r0 = r8.mUsePlayer3
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 49
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x00af:
            r8.mUseAudioHWDec = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            boolean r0 = r8.mUsePlayer3
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 203(0xcb, float:2.84E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x00c2:
            p045cn.p046a.p047a.p048a.C1638f.m8027a(r2, r10)
            goto L_0x0524
        L_0x00c7:
            r0 = 25
            p045cn.p046a.p047a.p048a.C1638f.m8027a(r0, r10)
            goto L_0x0524
        L_0x00ce:
            if (r10 != r6) goto L_0x00d2
            r0 = 1
            goto L_0x00d3
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            r8.mAsyncPlayHitVMCache = r0
            goto L_0x0524
        L_0x00d7:
            if (r10 != r6) goto L_0x00db
            r0 = 1
            goto L_0x00dc
        L_0x00db:
            r0 = 0
        L_0x00dc:
            r8.mIsUseServerDns = r0
            goto L_0x0524
        L_0x00e0:
            r8.mSeekEndEnabled = r10
            goto L_0x0524
        L_0x00e4:
            r8.mEnableOppoControl = r10
            goto L_0x0524
        L_0x00e8:
            if (r10 != r6) goto L_0x00ec
            r0 = 1
            goto L_0x00ed
        L_0x00ec:
            r0 = 0
        L_0x00ed:
            r8.mIsUseBoe = r0
            goto L_0x0524
        L_0x00f1:
            r8.mNeedAdaptiveWorkaround = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mAsyncPlayer
            if (r0 == 0) goto L_0x00fa
            com.ss.ttm.player.MediaPlayer r0 = r8.mAsyncPlayer
            goto L_0x00fc
        L_0x00fa:
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
        L_0x00fc:
            if (r0 == 0) goto L_0x0524
            r1 = 254(0xfe, float:3.56E-43)
            int r2 = r8.mNeedAdaptiveWorkaround
            r0.setIntOption(r1, r2)
            goto L_0x0524
        L_0x0107:
            r8.mUseCodecPool = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mAsyncPlayer
            if (r0 == 0) goto L_0x0110
            com.ss.ttm.player.MediaPlayer r0 = r8.mAsyncPlayer
            goto L_0x0112
        L_0x0110:
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
        L_0x0112:
            if (r0 == 0) goto L_0x0524
            r1 = 400(0x190, float:5.6E-43)
            int r2 = r8.mUseCodecPool
            r0.setIntOption(r1, r2)
            goto L_0x0524
        L_0x011d:
            r8.mEnableSeekInterrupt = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 248(0xf8, float:3.48E-43)
            int r2 = r8.mEnableSeekInterrupt
            r0.setIntOption(r1, r2)
            goto L_0x0524
        L_0x012e:
            r8.mDisablePlayerTimeOut = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 247(0xf7, float:3.46E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x013d:
            r8.mEnableVolumeBalance = r10
            goto L_0x0524
        L_0x0141:
            r8.mUseQcomLowLatency = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 215(0xd7, float:3.01E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x0150:
            r8.mMediaCodecSkipNonRef = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 216(0xd8, float:3.03E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x015f:
            r8.mNotifyBufferingDirectly = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 211(0xd3, float:2.96E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x016e:
            r8.mExposeSignal = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 301(0x12d, float:4.22E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x017d:
            r8.mOutputLog = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 223(0xdf, float:3.12E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x018c:
            r8.mTimeBarPercentage = r10
            goto L_0x0524
        L_0x0190:
            if (r10 != r6) goto L_0x0194
            r0 = 1
            goto L_0x0195
        L_0x0194:
            r0 = 0
        L_0x0195:
            r8.mCheckHijack = r0
            goto L_0x0524
        L_0x0199:
            if (r10 != r6) goto L_0x019d
            r0 = 1
            goto L_0x019e
        L_0x019d:
            r0 = 0
        L_0x019e:
            r8.mEnableHttps = r0
            goto L_0x0524
        L_0x01a2:
            r8.mIsPreferNearestSample = r10
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
            if (r1 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
            r1.setIntOption(r0, r10)
            goto L_0x0524
        L_0x01af:
            r8.mNetworkTryCount = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 230(0xe6, float:3.22E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x01be:
            r8.mForbidP2P = r10
            goto L_0x0524
        L_0x01c2:
            r8.mP2PCDNType = r10
            goto L_0x0524
        L_0x01c6:
            r8.mUseMediacodecAudio = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 97
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x01d5:
            r8.mMediaCodecRender = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 88
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x01e4:
            r8.mSkipAudioGraph = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 199(0xc7, float:2.79E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x01f3:
            r8.mLoopReferVideo = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 195(0xc3, float:2.73E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x0202:
            r8.mSuperResStrengh = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 167(0xa7, float:2.34E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x0211:
            r8.mSuperResFxaa = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 166(0xa6, float:2.33E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x0220:
            r8.mSuperRes = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 165(0xa5, float:2.31E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x022f:
            r8.mKsyFrameWait = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 192(0xc0, float:2.69E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x023e:
            int r0 = r8.mFrameDropNum
            if (r0 >= 0) goto L_0x0243
            return
        L_0x0243:
            r8.mFrameDropNum = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 159(0x9f, float:2.23E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x0252:
            com.ss.ttvideoengine.log.c r0 = r8.mLogger
            if (r0 == 0) goto L_0x0524
            com.ss.ttvideoengine.log.c r0 = r8.mLogger
            r0.mo112322P(r10)
            goto L_0x0524
        L_0x025d:
            r8.mMaxFps = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 134(0x86, float:1.88E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x026c:
            r8.mSkipFfmpegFindStreamInfo = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 96
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x027b:
            r8.mMovPreferNearestSample = r10
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
            if (r1 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
            r1.setIntOption(r0, r10)
            goto L_0x0524
        L_0x0288:
            r8.mMaxBufferDataMilliSeconds = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 110(0x6e, float:1.54E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x0297:
            r8.mTestNetSpeedDiff = r10
            int r0 = r8.mTestNetSpeedDiff
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L_0x02a1
            r8.mTestNetSpeedDiff = r1
        L_0x02a1:
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 66
            int r2 = r8.mTestNetSpeedDiff
            r0.setIntOption(r1, r2)
            goto L_0x0524
        L_0x02b0:
            int r0 = r10 * 1000
            r8.mBufferDataMiliSeconds = r0
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            int r2 = r8.mBufferDataMiliSeconds
            r0.setIntOption(r1, r2)
            goto L_0x0524
        L_0x02c1:
            r8.mUseTextureRender = r10
            goto L_0x0524
        L_0x02c5:
            r8.mIsDisableShortSeek = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 201(0xc9, float:2.82E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x02d4:
            r8.mOriginalRetry = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 197(0xc5, float:2.76E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x02e3:
            r8.mEGLNeedWorkAround = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            if (r10 != 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 183(0xb7, float:2.56E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x02f4:
            r8.mLimitMDLCacheSize = r10
            goto L_0x0524
        L_0x02f8:
            r8.mDataLoaderEnable = r10
            goto L_0x0524
        L_0x02fc:
            r8.mMediaCodecSyncMode = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 90
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x030b:
            r0 = 4
            com.p280ss.ttm.player.TTPlayerConfiger.setValue(r0, r10)
            goto L_0x0524
        L_0x0311:
            if (r10 != r6) goto L_0x0315
            r0 = 1
            goto L_0x0316
        L_0x0315:
            r0 = 0
        L_0x0316:
            r8.mUsePlayerSpade = r0
            goto L_0x0524
        L_0x031a:
            r8.mIsUsePlayerDNS = r10
            goto L_0x0524
        L_0x031e:
            r8.mEnableSharp = r10
            goto L_0x0524
        L_0x0322:
            if (r10 == 0) goto L_0x0326
            r0 = 1
            goto L_0x0327
        L_0x0326:
            r0 = 0
        L_0x0327:
            r8.mIsStartPlayAutomatically = r0
            goto L_0x0524
        L_0x032b:
            if (r10 != r6) goto L_0x032f
            r0 = 1
            goto L_0x0330
        L_0x032f:
            r0 = 0
        L_0x0330:
            r8.mDrmRetry = r0
            goto L_0x0524
        L_0x0334:
            r8.mDrmDowngrade = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 208(0xd0, float:2.91E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x0343:
            r8.mDrmType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 206(0xce, float:2.89E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x0352:
            if (r10 != r6) goto L_0x0356
            r0 = 1
            goto L_0x0357
        L_0x0356:
            r0 = 0
        L_0x0357:
            r8.mBashEnabled = r0
            goto L_0x0524
        L_0x035b:
            r8.mLoopCount = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 193(0xc1, float:2.7E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x036a:
            r8.mHardwareDecodeEnablePlayer3 = r10
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
            if (r1 == 0) goto L_0x0499
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
            r1.setIntOption(r0, r10)
            goto L_0x0499
        L_0x0377:
            if (r10 != r6) goto L_0x0398
            r8.mUsePlayer3 = r6
            r0 = 6
            p045cn.p046a.p047a.p048a.C1638f.m8028a(r0, r5)
            int r0 = r8.mPlayerType
            if (r0 == r4) goto L_0x0385
            r0 = 1
            goto L_0x0386
        L_0x0385:
            r0 = 0
        L_0x0386:
            p045cn.p046a.p047a.p048a.C1638f.m8028a(r6, r0)
            int r0 = r8.mPlayerType
            if (r0 != r6) goto L_0x038f
            r0 = 1
            goto L_0x0390
        L_0x038f:
            r0 = 0
        L_0x0390:
            p045cn.p046a.p047a.p048a.C1638f.m8028a(r4, r0)
            p045cn.p046a.p047a.p048a.C1638f.m8028a(r3, r5)
            goto L_0x0524
        L_0x0398:
            r8.mUsePlayer3 = r5
            goto L_0x0524
        L_0x039c:
            r8.mDashAbr = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 172(0xac, float:2.41E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x03ab:
            r8.mMaxAccumulatedCountSetByUser = r10
            goto L_0x0524
        L_0x03af:
            r8.mCleanWhenStop = r10
            goto L_0x0524
        L_0x03b3:
            r8.mReuseSocket = r10
            com.ss.ttvideoengine.log.c r0 = r8.mLogger
            r0.mo112416p(r10)
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 154(0x9a, float:2.16E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x03c7:
            r8.mLoopEndTime = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 138(0x8a, float:1.93E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x03d6:
            r8.mLoopStartTime = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 137(0x89, float:1.92E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x03e5:
            com.ss.ttvideoengine.ad r0 = r8.mVideoModelCache
            if (r0 == 0) goto L_0x0524
            com.p280ss.ttvideoengine.C46036ad.m144239b(r10)
            goto L_0x0524
        L_0x03ee:
            com.ss.ttvideoengine.ad r0 = r8.mVideoModelCache
            if (r0 == 0) goto L_0x0524
            com.p280ss.ttvideoengine.C46036ad.m144237a(r10)
            goto L_0x0524
        L_0x03f7:
            if (r10 != r6) goto L_0x0408
            r8.mUseVideoModelCache = r6
            com.ss.ttvideoengine.ad r0 = com.p280ss.ttvideoengine.C46036ad.m144236a()
            r8.mVideoModelCache = r0
            android.content.Context r0 = r8.mContext
            com.p280ss.ttvideoengine.p1809b.C46044b.m144253a(r0)
            goto L_0x0524
        L_0x0408:
            r8.mUseVideoModelCache = r5
            goto L_0x0524
        L_0x040c:
            r8.mDisableAccurateStart = r10
            com.ss.ttvideoengine.log.c r0 = r8.mLogger
            r0.mo112419q(r10)
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 133(0x85, float:1.86E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x0420:
            r8.mDNSExpiredTime = r10
            goto L_0x0524
        L_0x0424:
            if (r10 != r6) goto L_0x0428
            r0 = 1
            goto L_0x0429
        L_0x0428:
            r0 = 0
        L_0x0429:
            r8.mUseDNSCache = r0
            goto L_0x0524
        L_0x042d:
            if (r10 != r6) goto L_0x0431
            r0 = 1
            goto L_0x0432
        L_0x0431:
            r0 = 0
        L_0x0432:
            r8.mDashEnabled = r0
            goto L_0x0524
        L_0x0436:
            r8.mTestAction = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 83
            int r2 = r8.mTestAction
            r0.setIntOption(r1, r2)
            goto L_0x0524
        L_0x0447:
            r8.mUseExternalDir = r10
            goto L_0x0524
        L_0x044b:
            r8.mMaxFileCacheSize = r10
            goto L_0x0524
        L_0x044f:
            r8.mNetworkTimeout = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 9
            int r2 = PLAYER_TIME_BASE
            int r2 = r2 * r10
            r0.setIntOption(r1, r2)
            goto L_0x0524
        L_0x0462:
            r8.mBufferTimeout = r10
            long r0 = r8.mSettingMask
            r2 = 4
            long r0 = r0 | r2
            r8.mSettingMask = r0
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 81
            r0.setIntOption(r1, r10)
            com.ss.ttvideoengine.log.c r0 = r8.mLogger
            r0.mo112362c(r6, r10)
            goto L_0x0524
        L_0x047d:
            r8.mBufferDataMiliSeconds = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x048a:
            r8.mDecoderType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 67
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x0499:
            r8.mCacheFileEnable = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 14
            r0.setIntOption(r1, r6)
            goto L_0x0524
        L_0x04a8:
            com.ss.ttm.player.MediaPlayer r1 = r8.mAsyncPlayer
            if (r1 == 0) goto L_0x04af
            com.ss.ttm.player.MediaPlayer r1 = r8.mAsyncPlayer
            goto L_0x04b1
        L_0x04af:
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
        L_0x04b1:
            java.lang.String r2 = "TTVideoEngine"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "hardware enable = "
            r3.<init>(r7)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r2, r3)
            r8.mHardwareDecodeEnablePlayer2 = r10
            if (r1 == 0) goto L_0x0524
            r1.setIntOption(r0, r10)
            goto L_0x0524
        L_0x04cc:
            if (r10 == 0) goto L_0x04d0
            r0 = 1
            goto L_0x04d1
        L_0x04d0:
            r0 = 0
        L_0x04d1:
            r8.mH265Enabled = r0
            goto L_0x0524
        L_0x04d4:
            r8.mRenderType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 56
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x04e2:
            r8.mLayoutType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 36
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x04f0:
            r8.mForbidOSPlayer = r10
            com.p280ss.ttm.player.TTPlayerConfiger.setValue(r3, r10)
            boolean r0 = r8.mUsePlayer3
            if (r0 == 0) goto L_0x0524
            p045cn.p046a.p047a.p048a.C1638f.m8027a(r3, r10)
            goto L_0x0524
        L_0x04fd:
            r8.mScaleType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 38
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x050b:
            r8.mEnhancementType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 37
            r0.setIntOption(r1, r10)
            goto L_0x0524
        L_0x0519:
            r8.mPlayerCache = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0524
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r0.setIntOption(r2, r10)
        L_0x0524:
            java.lang.String r0 = "TTVideoEngine"
            java.lang.String r1 = "set int option key:%d value:%d"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r5] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r2[r6] = r9
            java.lang.String r9 = com.C1642a.m8034a(r1, r2)
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.TTVideoEngine.setIntOption(int, int):void");
    }

    public static void addTask(C46083h hVar, Resolution resolution, long j) {
        C46059d.m144301a().mo112164a(hVar, resolution, j);
    }

    public static Resolution findBestResolution(C46083h hVar, Resolution resolution, int i) {
        Resolution findDefaultResolution = findDefaultResolution(hVar, resolution);
        switch (i) {
            case 1:
                return findMaxCacheResolution(hVar, findDefaultResolution);
            case 2:
                return findMaxQualityResolution(hVar, findDefaultResolution);
            default:
                return findDefaultResolution;
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) {
        _ShutdownOldSource();
        this.mPlayFd = fileDescriptor;
        this.mPipeOffset = j;
        this.mPipeLength = j2;
        if (this.mLogger != null) {
            this.mLogger.mo112352b(6, (String) null);
        }
    }

    private C46082g _videoInfoForResolution(Resolution resolution, int i, Map<Integer, String> map) {
        C46082g a;
        if (this.mVideoModel == null || this.mVideoModel.f117858d == null) {
            return null;
        }
        C46082g a2 = this.mVideoModel.mo112224a(resolution, i, map);
        Resolution[] allResolutions = Resolution.getAllResolutions();
        if (allResolutions.length <= 0) {
            return a2;
        }
        int length = allResolutions.length - 1;
        int i2 = 0;
        while (true) {
            if (i2 >= allResolutions.length) {
                break;
            } else if (allResolutions[i2].getIndex() == resolution.getIndex()) {
                length = i2;
                break;
            } else {
                i2++;
            }
        }
        int i3 = length;
        while (true) {
            if (a2 != null) {
                break;
            }
            Resolution resolution2 = allResolutions[i3];
            a = this.mVideoModel.mo112224a(resolution2, i, null);
            if (a != null && i == this.mVideoModel.mo112223a(7)) {
                this.currentResolution = resolution2;
                this.mLogger.mo112343a(_resolutionToString(this.currentResolution), "");
                break;
            }
            i3 = ((i3 + allResolutions.length) - 1) % allResolutions.length;
            if (i3 == length) {
                break;
            }
            a2 = a;
        }
        a2 = a;
        return a2;
    }

    public static void addTask(C46083h hVar, Resolution resolution, Map<Integer, String> map, long j) {
        C46059d.m144301a().mo112165a(hVar, resolution, map, j);
    }

    public static void addTask(String str, String str2, long j, C46087f fVar) {
        C46059d.m144301a().mo112172a(str, str2, j, fVar);
    }

    public static void addTask(String str, String str2, long j, String str3) {
        C46059d.m144301a().mo112173a(str, str2, j, str3);
    }

    public static String proxyUrl(String str, String str2, String[] strArr, Resolution resolution, String str3) {
        return C46059d.m144301a().mo112157a(str, str2, strArr, resolution, str3);
    }

    public static void addTask(String str, String str2, C46083h hVar, Resolution resolution, long j) {
        C46059d.m144301a().mo112174a(str, str2, hVar, resolution, j);
    }
}
