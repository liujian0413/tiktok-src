package com.p280ss.avframework.livestreamv2;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.avframework.capture.audio.AudioCapturer;
import com.p280ss.avframework.capture.audio.AudioCapturer.AudioCaptureObserver;
import com.p280ss.avframework.capture.audio.AudioCapturerAudioRecord;
import com.p280ss.avframework.capture.audio.AudioCapturerOpensles;
import com.p280ss.avframework.codec.DefaultVideoEncoderFactory;
import com.p280ss.avframework.effect.IVideoEffectProcessor;
import com.p280ss.avframework.engine.AudioDeviceModule;
import com.p280ss.avframework.engine.AudioSource.PowerObserver;
import com.p280ss.avframework.engine.AudioTrack;
import com.p280ss.avframework.engine.MediaEncodeStream;
import com.p280ss.avframework.engine.MediaEncodeStream.Observer;
import com.p280ss.avframework.engine.MediaEngineFactory;
import com.p280ss.avframework.engine.MediaTrack;
import com.p280ss.avframework.engine.Transport;
import com.p280ss.avframework.engine.Transport.EventObserver;
import com.p280ss.avframework.engine.VideoEncoderFactory;
import com.p280ss.avframework.engine.VideoSink;
import com.p280ss.avframework.engine.VideoTrack;
import com.p280ss.avframework.engine.VsyncModule;
import com.p280ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import com.p280ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener;
import com.p280ss.avframework.livestreamv2.ILiveStream.ILiveStreamDataListener;
import com.p280ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener;
import com.p280ss.avframework.livestreamv2.ILiveStream.ILiveStreamInfoListener;
import com.p280ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener;
import com.p280ss.avframework.livestreamv2.capture.LiveStreamAudioCapture;
import com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture;
import com.p280ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.p280ss.avframework.livestreamv2.filter.FilterManager;
import com.p280ss.avframework.livestreamv2.filter.FilterManager.EffectInputAudioStream;
import com.p280ss.avframework.livestreamv2.filter.FilterManager.InputAudioStreamObserver;
import com.p280ss.avframework.livestreamv2.filter.IAudioFilterManager;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager;
import com.p280ss.avframework.livestreamv2.log.LiveStreamLogService;
import com.p280ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.p280ss.avframework.livestreamv2.recorder.IRecorderManager.Config;
import com.p280ss.avframework.livestreamv2.recorder.IRecorderManager.IRecorderListener;
import com.p280ss.avframework.livestreamv2.recorder.RecorderManager;
import com.p280ss.avframework.livestreamv2.utils.UrlUtils;
import com.p280ss.avframework.mixer.AudioMixer;
import com.p280ss.avframework.mixer.AudioMixer.AudioMixerDescription;
import com.p280ss.avframework.mixer.VideoMixer;
import com.p280ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import com.p280ss.avframework.opengl.GLThread;
import com.p280ss.avframework.transport.LibRTMPTransport;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.TEBundle;
import com.p280ss.avframework.utils.ThreadUtils;
import com.p280ss.optimizer.live.sdk.dns.C45914d;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.LiveStream */
public class LiveStream implements AudioCaptureObserver, PowerObserver, Observer, EventObserver, ILiveStream, LiveStreamVideoCapture.Observer {
    private final int STATUS_END;
    private final int STATUS_ERROR;
    private final int STATUS_INIT;
    private final int STATUS_STARTED;
    private final int STATUS_STARTING;
    private final int STATUS_STOPED;
    private final int TRI_STATE_DEFAULT;
    private final int TRI_STATE_FALSE;
    private final int TRI_STATE_TRUE;
    private HandlerThread dataNotifyThread;
    private long lastEstBitrate;
    private volatile long mAdjustBitrate;
    public AudioCapturer mAudioCapture;
    private AudioDeviceModule mAudioDeviceModule;
    private IAudioFilterManager mAudioFilterManager;
    public AudioFrameAvailableSink mAudioFrameAvailableSink;
    private boolean mAudioMixer;
    private int mAudioRecordMode;
    public AudioTrack mAudioTrack;
    private String[] mAvailableVideoEncoders;
    public ILiveStreamDataListener mDataListener;
    private final Handler mDataNotifyThreadHandler;
    public C45914d mDns;
    private boolean mDnsOptHit;
    public boolean mDnsOptOpen;
    private TEBundle mEncodeStreamOpt;
    public ILiveStreamErrorListener mErrorListener;
    private String mEvaluatorSymbol;
    public IFilterManager mFilterManager;
    public boolean mFirstConnect;
    public ILiveStreamInfoListener mInfoListener;
    public ArrayList<IInputAudioStream> mInputAudioStreams;
    public Object mInputStreamListFence;
    public ArrayList<IInputVideoStream> mInputVideoStreams;
    private final String mInvalidOptUrl;
    public LiveStreamBuilder mLiveStreamBuilder;
    public MediaEncodeStream mMediaEncodeStream;
    public MediaEngineFactory mMediaEngineFactory;
    public HashMap<String, String> mOptUrlMap;
    private int mOptUrlReachable;
    public AudioMixerDescription mOriginAudioStreamDescription;
    public VideoMixerDescription mOriginVideoStreamDescription;
    private AtomicInteger mPushCount;
    public Transport mRTMPTransport;
    public RecorderManager mRecorderManager;
    public Object mReleaseFence;
    public VideoSink mRenderView;
    private ReentrantReadWriteLock mReportFence;
    public int mRtmpReConnectCounts;
    public AtomicInteger mStatus;
    public LiveStreamLogService mStreamLogService;
    private String mStreamUuid;
    public TextureFrameAvailableSink mTextureFrameAvailableSink;
    private TEBundle mTransportOpt;
    private long mUploadLogInterval;
    private String mUri;
    private int mUriReachable;
    private List<String> mUris;
    private long mUrlPriority;
    private final Handler mVideoCaptureHandler;
    public LiveStreamVideoCapture mVideoCapturer;
    private VideoEncoderFactory mVideoEncoderFactory;
    private int mVideoMixBgColor;
    private boolean mVideoMixer;
    public VideoTrack mVideoTrack;
    public final Handler mWorkThreadHandler;
    private Runnable rtmpReconnectRunnable;
    private boolean tryOpenAudioCaptureOnLater;
    private GLThread workThread;

    /* renamed from: com.ss.avframework.livestreamv2.LiveStream$ResolutionLevel */
    public class ResolutionLevel {
        public ResolutionLevel() {
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.LiveStream$SharedEncoderRecorder */
    class SharedEncoderRecorder implements IRecorderManager {
        private Config mConfig;
        private String mFile;
        private IRecorderListener mIRecorderListener;
        private WeakReference<LiveStream> mLiveStreamWeak;

        public Config getConfig() {
            return this.mConfig;
        }

        public Canvas lock(Rect rect) {
            return null;
        }

        public void unlockAndPost(Canvas canvas) {
        }

        public void stop() {
            if (this.mLiveStreamWeak.get() != null) {
                ((LiveStream) this.mLiveStreamWeak.get()).stopRecorder();
                return;
            }
            onEvent(11, 0, 0, "stream publish no start.");
        }

        public SharedEncoderRecorder(WeakReference<LiveStream> weakReference) {
            this.mLiveStreamWeak = weakReference;
        }

        public void start(String str, IRecorderListener iRecorderListener, Config config, int i) {
            this.mFile = str;
            this.mIRecorderListener = iRecorderListener;
            this.mConfig = config;
            if (this.mLiveStreamWeak.get() != null) {
                ((LiveStream) this.mLiveStreamWeak.get()).startRecorder(this.mFile);
            }
        }

        public void onEvent(int i, int i2, long j, String str) {
            if (this.mIRecorderListener != null) {
                switch (i) {
                    case 9:
                        this.mIRecorderListener.onRecorderStarted();
                        return;
                    case 10:
                        if (!new File(this.mFile).canRead()) {
                            IRecorderListener iRecorderListener = this.mIRecorderListener;
                            StringBuilder sb = new StringBuilder("Unknown record error event(");
                            sb.append(i);
                            sb.append(",");
                            sb.append(i2);
                            sb.append(",");
                            sb.append(j);
                            sb.append(",");
                            sb.append(str);
                            sb.append(")");
                            iRecorderListener.onRecorderError(i2, new Exception(sb.toString()));
                            return;
                        }
                        this.mIRecorderListener.onRecorderStoped(this.mFile);
                        return;
                    case 11:
                        this.mIRecorderListener.onRecorderError(i2, new Exception(str));
                        break;
                }
            }
        }
    }

    public void doStopVideoSource() {
        destroyVideoTrack();
    }

    public IAudioFilterManager getAudioFilterMgr() {
        return this.mAudioFilterManager;
    }

    public int getAudioRecordMode() {
        return this.mAudioRecordMode;
    }

    public String getEvaluatorSymbol() {
        return this.mEvaluatorSymbol;
    }

    public IRecorderManager getRecorderMgr() {
        return this.mRecorderManager;
    }

    public int getResolutionLevel(int i, int i2) {
        long j = (long) (i * i2);
        if (j < 307200) {
            return 1;
        }
        if (j < 451200) {
            return 2;
        }
        return j < 720000 ? 3 : 4;
    }

    public String getVersion() {
        return "6.0.0.11";
    }

    public IFilterManager getVideoFilterMgr() {
        return this.mFilterManager;
    }

    public long getVideoMetaBitRate() {
        return this.mAdjustBitrate;
    }

    public boolean isDnsOptHit() {
        return this.mDnsOptHit;
    }

    public boolean isDnsOptOpen() {
        return this.mDnsOptOpen;
    }

    private void updateUrlPriority() {
        this.mUrlPriority = System.currentTimeMillis();
    }

    public IFilterManager getFilterMgr() {
        return getVideoFilterMgr();
    }

    public LiveStreamBuilder getLiveStreamBuilder() {
        new LiveStreamBuilder();
        return this.mLiveStreamBuilder;
    }

    public IInputAudioStream getOriginInputAudioStream() {
        return new IInputAudioStream() {
            public void release() {
            }

            public int start() {
                return 0;
            }

            public int stop() {
                return 0;
            }

            public AudioMixerDescription getMixerDescription() {
                return LiveStream.this.mOriginAudioStreamDescription;
            }

            public int getChannel() {
                return LiveStream.this.mLiveStreamBuilder.getAudioChannel();
            }

            public int getSample() {
                return LiveStream.this.mLiveStreamBuilder.getAudioSampleHZ();
            }

            public String name() {
                if (LiveStream.this.mAudioTrack != null) {
                    return LiveStream.this.mAudioTrack.mo109133id();
                }
                return "";
            }

            public void setMixerDescription(AudioMixerDescription audioMixerDescription) {
                LiveStream.this.mOriginAudioStreamDescription = audioMixerDescription;
                if (LiveStream.this.mMediaEncodeStream != null) {
                    LiveStream.this.mMediaEncodeStream.setAudioMixerDescription(name(), LiveStream.this.mOriginAudioStreamDescription);
                }
            }

            public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
                return LiveStream.this.pushAudioFrame(byteBuffer, i, i2, i3, i4, j);
            }
        };
    }

    public IInputVideoStream getOriginInputVideoStream() {
        return new IInputVideoStream() {
            public void release() {
            }

            public int start() {
                return 0;
            }

            public int stop() {
                return 0;
            }

            public VideoMixerDescription getMixerDescription() {
                return LiveStream.this.mOriginVideoStreamDescription;
            }

            public int fps() {
                return LiveStream.this.mLiveStreamBuilder.getVideoFps();
            }

            public int getHeight() {
                return LiveStream.this.mLiveStreamBuilder.getVideoHeight();
            }

            public int getWidth() {
                return LiveStream.this.mLiveStreamBuilder.getVideoWidth();
            }

            public String name() {
                if (LiveStream.this.mVideoTrack != null) {
                    return LiveStream.this.mVideoTrack.mo109133id();
                }
                return "";
            }

            public void setMixerDescription(VideoMixerDescription videoMixerDescription) {
                LiveStream.this.mOriginVideoStreamDescription.copy(videoMixerDescription);
                if (LiveStream.this.mMediaEncodeStream != null) {
                    LiveStream.this.mMediaEncodeStream.setVideoMixerDescription(name(), LiveStream.this.mOriginVideoStreamDescription);
                }
            }

            public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
                return LiveStream.this.pushVideoFrame(byteBuffer, i, i2, i3, j);
            }

            public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
                return LiveStream.this.pushVideoFrame(i, z, i2, i3, i4, fArr, j);
            }
        };
    }

    public void onRtmpSendTooSlow() {
        AVLog.m143696d("LiveStream", "Net is too weak.");
    }

    public void startCaptureSource() {
        startVideoCapture();
        startAudioCapture();
    }

    public int status() {
        return this.mStatus.get();
    }

    public void stopCaptureSource() {
        stopVideoCapture();
        stopAudioCapture();
    }

    private void updatePushCount() {
        if (this.mPushCount != null) {
            this.mPushCount.incrementAndGet();
        }
    }

    public boolean audioMute() {
        if (this.mAudioCapture != null) {
            return this.mAudioCapture.isMute();
        }
        return false;
    }

    public VsyncModule getEncodeStreamVsyncModule() {
        if (this.mMediaEncodeStream != null) {
            return this.mMediaEncodeStream.getVsyncModule();
        }
        return null;
    }

    public IVideoCapturerControl getVideoCapturerControl() {
        if (this.mVideoCapturer != null) {
            return this.mVideoCapturer.getISPControl();
        }
        return null;
    }

    private int chooseAudioProfileLevel() {
        switch (this.mLiveStreamBuilder.getAudioProfile()) {
            case 1:
                return 1;
            case 3:
                return 4;
            default:
                return 3;
        }
    }

    private String getRtmpTcUrl() {
        if (isUsingOptimizedUrl()) {
            String originUrl = getOriginUrl();
            try {
                return originUrl.substring(0, originUrl.lastIndexOf(47) + 1);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private void stopRecord() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    if (LiveStream.this.mRecorderManager != null) {
                        LiveStream.this.mRecorderManager.stop();
                        LiveStream.this.mRecorderManager.release();
                        LiveStream.this.mRecorderManager = null;
                    }
                }
            });
        }
    }

    public void doStopAudioSource() {
        boolean z;
        if (this.mAudioCapture != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            destroyAudioTrack();
            if (this.mRecorderManager != null) {
                this.mRecorderManager.setupAudioSource(null);
            }
            this.mInfoListener.onInfo(9, 0, 0);
        }
    }

    public LiveStreamOption getOption() {
        final LiveStreamOption[] liveStreamOptionArr = new LiveStreamOption[1];
        if (this.mStatus.get() != 7) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, (Runnable) new Runnable() {
                public void run() {
                    if (LiveStream.this.mMediaEncodeStream != null) {
                        liveStreamOptionArr[0] = new LiveStreamOption(LiveStream.this.mMediaEncodeStream.getParameter());
                    }
                }
            });
        }
        return liveStreamOptionArr[0];
    }

    public List<String> getUrls() {
        ArrayList arrayList = new ArrayList();
        if (this.mUri != null) {
            arrayList.add(this.mUri);
            return arrayList;
        } else if (this.mUris == null || this.mUris.isEmpty()) {
            return arrayList;
        } else {
            return this.mUris;
        }
    }

    public boolean isAudioLive() {
        if (this.mAudioCapture == null || this.mAudioCapture.status() != 1) {
            return false;
        }
        return true;
    }

    public boolean isVideoLive() {
        if (this.mVideoCapturer == null || this.mVideoCapturer.status() != 1) {
            return false;
        }
        return true;
    }

    public void onVideoCaptureStoped() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    LiveStream.this.mInfoListener.onInfo(6, 0, 0);
                }
            });
        }
        RecorderManager recorderManager = this.mRecorderManager;
        if (recorderManager != null) {
            recorderManager.setupVideoSource(null);
        }
    }

    public void pause() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    LiveStream.this.doBackgroundPause();
                }
            });
        }
    }

    public void resume() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    LiveStream.this.doBackgroundResume();
                }
            });
        }
    }

    public void startAudioCapture() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    if (LiveStream.this.mStatus.get() != 7) {
                        LiveStream.this.doStartAudioSource();
                    }
                }
            });
        } else {
            AVLog.ioe("LiveStream", "Try to start audio capture while mStatus is STATUS_END");
        }
    }

    public void startVideoCapture() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    if (LiveStream.this.mStatus.get() != 7) {
                        LiveStream.this.doStartVideoSource();
                    }
                }
            });
        } else {
            AVLog.ioe("LiveStream", "Try to start video capture while mStatus is STATUS_END");
        }
    }

    public void stop() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    LiveStream.this.doStop();
                    LiveStream.this.mStreamLogService.close();
                }
            });
        }
    }

    public void stopAudioCapture() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    if (LiveStream.this.mStatus.get() != 7) {
                        LiveStream.this.doStopAudioSource();
                    }
                }
            });
        }
    }

    public void stopRecorder() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    if (LiveStream.this.mMediaEncodeStream != null) {
                        LiveStream.this.mMediaEncodeStream.stopRecord();
                    }
                }
            });
        }
    }

    public void stopVideoCapture() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    if (LiveStream.this.mStatus.get() != 7) {
                        LiveStream.this.doStopVideoSource();
                    }
                }
            });
        }
    }

    private int chooseProfileLevel() {
        int videoProfile = this.mLiveStreamBuilder.getVideoProfile();
        if (this.mLiveStreamBuilder.getVideoEncoder() == 1) {
            switch (videoProfile) {
                case 2:
                    return 2;
                case 3:
                    return 3;
                default:
                    return 1;
            }
        } else if (this.mLiveStreamBuilder.getVideoEncoder() != 2) {
            return -1;
        } else {
            if (videoProfile != 2) {
                return 4;
            }
            return 5;
        }
    }

    private boolean isUsingOptimizedUrl() {
        String originUrl = getOriginUrl();
        if (!TextUtils.isEmpty(originUrl) && this.mDnsOptOpen && this.mDnsOptHit && this.mOptUrlMap != null && this.mOptUrlMap.containsKey(originUrl)) {
            String str = (String) this.mOptUrlMap.get(originUrl);
            if (!TextUtils.isEmpty(str) && !str.equals("INVALID_URL")) {
                return true;
            }
        }
        return false;
    }

    private void setupMixerParameter() {
        AudioMixer audioMixer = this.mMediaEncodeStream.getAudioMixer();
        VideoMixer videoMixer = this.mMediaEncodeStream.getVideoMixer();
        audioMixer.setEnable(this.mAudioMixer);
        videoMixer.setEnable(this.mVideoMixer);
        TEBundle tEBundle = new TEBundle();
        videoMixer.getParameter(tEBundle);
        tEBundle.setInt("vmixer_width", this.mLiveStreamBuilder.getVideoMixerOutWidth());
        tEBundle.setInt("vmixer_height", this.mLiveStreamBuilder.getVideoMixerOutHeight());
        tEBundle.setInt("vmixer_bg_color", this.mVideoMixBgColor);
        videoMixer.setParameter(tEBundle);
    }

    private void setupVsyncParameter() {
        VsyncModule vsyncModule = this.mMediaEncodeStream.getVsyncModule();
        vsyncModule.setEnable(true);
        TEBundle option = vsyncModule.getOption();
        option.setInt("vsync_max_intveval_than_frame_ms", this.mLiveStreamBuilder.getVsyncModuleMaxIntevalOnFrameMs());
        option.setInt("vsync_max_intveval_than_now_ms", this.mLiveStreamBuilder.getVsyncModuleMaxIntevalOnNowMs());
        vsyncModule.setOption(option);
        vsyncModule.registerObserver(new VsyncModule.Observer() {
            public void onEvent(int i, int i2, long j, String str) {
                VsyncModule vsyncModule;
                if (LiveStream.this.mMediaEncodeStream != null) {
                    vsyncModule = LiveStream.this.mMediaEncodeStream.getVsyncModule();
                } else {
                    vsyncModule = null;
                }
                VsyncModule vsyncModule2 = vsyncModule;
                if (vsyncModule2 != null) {
                    LiveStream.this.vsyncEvent(vsyncModule2, i, i2, j, str);
                }
            }
        });
    }

    public IInputAudioStream createInputAudioStream() {
        final InputAudioStream inputAudioStream = new InputAudioStream(this.mMediaEngineFactory, new InputAudioStream.Observer() {
            public void releaseInputStream(final InputAudioStream inputAudioStream) {
                synchronized (LiveStream.this.mInputStreamListFence) {
                    LiveStream.this.mInputAudioStreams.remove(inputAudioStream);
                }
                ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, (Runnable) new Runnable() {
                    public void run() {
                        AudioTrack audioTrack = inputAudioStream.getAudioTrack();
                        if (audioTrack != null && LiveStream.this.mMediaEncodeStream != null) {
                            LiveStream.this.mMediaEncodeStream.removeTrack(audioTrack);
                        }
                    }
                });
            }
        }, this.mLiveStreamBuilder.getAudioSampleHZ(), this.mLiveStreamBuilder.getAudioChannel(), this.mWorkThreadHandler);
        synchronized (this.mInputStreamListFence) {
            this.mInputAudioStreams.add(inputAudioStream);
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, (Runnable) new Runnable() {
            public void run() {
                if (LiveStream.this.mMediaEncodeStream != null) {
                    LiveStream.this.mMediaEncodeStream.addTrack(inputAudioStream.getAudioTrack());
                    LiveStream.this.mMediaEncodeStream.setAudioMixerDescription(inputAudioStream.name(), inputAudioStream.getMixerDescription());
                }
            }
        });
        return inputAudioStream;
    }

    public void doStop() {
        if (this.mStatus.get() != 4) {
            destroyEncodeStream();
            this.mWorkThreadHandler.removeCallbacks(this.rtmpReconnectRunnable);
            if (this.mStatus.get() != 8) {
                this.mStatus.set(4);
                this.mInfoListener.onInfo(3, 0, 0);
                return;
            }
            AVLog.iow("LiveStream", "Try to stop live stream while mStatus is STATUS_ERROR");
        }
    }

    public String getOriginUrl() {
        String str;
        if (this.mUri != null) {
            str = this.mUri;
        } else if (this.mUris == null || this.mUris.isEmpty()) {
            str = null;
        } else {
            str = (String) this.mUris.get(0);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getStreamUniqueId() {
        if (TextUtils.isEmpty(this.mStreamUuid) || this.mPushCount == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.mStreamUuid);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(this.mPushCount.get());
        return sb.toString();
    }

    public int getVideoGop() {
        if (this.mLiveStreamBuilder == null) {
            return 0;
        }
        float videoGopSec = this.mLiveStreamBuilder.getVideoGopSec();
        int videoGop = this.mLiveStreamBuilder.getVideoGop();
        int videoFps = this.mLiveStreamBuilder.getVideoFps();
        if (videoGopSec > 0.0f) {
            return Math.round(videoGopSec * ((float) videoFps));
        }
        if (videoGop > 0) {
            return videoGop;
        }
        this.mLiveStreamBuilder.setVideoGopSec(2.0f);
        int i = videoFps * 2;
        this.mLiveStreamBuilder.setVideoGop(i);
        return i;
    }

    public void onReleaseSafe() {
        if (this.mAudioFrameAvailableSink != null) {
            this.mAudioFrameAvailableSink.release();
            this.mAudioFrameAvailableSink = null;
        }
        if (this.mTextureFrameAvailableSink != null) {
            this.mTextureFrameAvailableSink.release();
            this.mTextureFrameAvailableSink = null;
        }
        if (this.mFilterManager != null) {
            if (this.mFilterManager instanceof FilterManager) {
                ((FilterManager) this.mFilterManager).release();
            }
            this.mFilterManager = null;
        }
        if (this.mMediaEngineFactory != null) {
            this.mMediaEngineFactory.release();
            this.mMediaEngineFactory = null;
        }
        this.mStatus.set(7);
    }

    public void onRtmpConncted() {
        this.mStatus.set(2);
        if (onCanEncodeStream()) {
            addTrackToEncodeStream();
        }
        this.mRtmpReConnectCounts = 0;
        this.mFirstConnect = false;
        if (isUsingOptimizedUrl()) {
            this.mOptUrlReachable = 1;
        } else {
            this.mUriReachable = 1;
        }
        this.mInfoListener.onInfo(2, 0, 0);
    }

    public void onVideoCaptureStarted() {
        RecorderManager recorderManager = this.mRecorderManager;
        if (recorderManager != null) {
            VideoSink sharedSink = recorderManager.getSharedSink();
            if (!(this.mVideoTrack == null || sharedSink == null)) {
                this.mVideoTrack.addVideoSink(sharedSink);
            }
        }
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                if (LiveStream.this.onCanEncodeStream()) {
                    LiveStream.this.addTrackToEncodeStream();
                }
            }
        });
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    LiveStream.this.mInfoListener.onInfo(5, 0, 0);
                }
            });
        }
    }

    private void createEncoderStream() {
        boolean z;
        if (this.mVideoEncoderFactory == null) {
            this.mVideoEncoderFactory = new DefaultVideoEncoderFactory();
        }
        if (this.mRTMPTransport == null) {
            boolean z2 = false;
            if (this.mLiveStreamBuilder.getVideoCaptureDevice() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.mLiveStreamBuilder.getAudioCaptureDevice() != 0) {
                z2 = true;
            }
            this.mRTMPTransport = new LibRTMPTransport(z, z2);
            this.mTransportOpt = this.mRTMPTransport.getParameter();
        }
        if (this.mMediaEncodeStream == null) {
            this.mMediaEncodeStream = this.mMediaEngineFactory.createMediaEncodeStream(this.mVideoEncoderFactory, this.mRTMPTransport);
            this.mEncodeStreamOpt = this.mMediaEncodeStream.getParameter();
            this.mMediaEncodeStream.registerObserver(this);
            this.mMediaEncodeStream.setEstimateTimeInterval((int) this.mUploadLogInterval);
            this.mMediaEncodeStream.start();
        }
        setupParameter();
    }

    private void destroyAudioTrack() {
        this.mReportFence.writeLock().lock();
        if (!(this.mMediaEncodeStream == null || this.mAudioTrack == null)) {
            this.mMediaEncodeStream.removeTrack(this.mAudioTrack);
            removeStreamsFromEncodeStream(false);
        }
        if (this.mAudioCapture != null) {
            this.mAudioCapture.setCalculatePcmPowerEventObserver(null);
            this.mAudioCapture.pause();
            this.mAudioCapture.stop();
            if (this.mAudioDeviceModule != null) {
                this.mAudioDeviceModule.stopRecording();
            }
            this.mAudioCapture.release();
            this.mAudioCapture = null;
        }
        if (this.mAudioTrack != null) {
            if (this.mAudioFrameAvailableSink != null) {
                this.mAudioTrack.removeAudioSink(this.mAudioFrameAvailableSink);
            }
            this.mAudioTrack.release();
            this.mAudioTrack = null;
            if (this.mAudioFilterManager != null) {
                this.mAudioFilterManager.release();
                this.mAudioFilterManager = null;
            }
        }
        this.mReportFence.writeLock().unlock();
    }

    private void destroyVideoTrack() {
        this.mReportFence.writeLock().lock();
        if (!(this.mMediaEncodeStream == null || this.mVideoTrack == null)) {
            this.mMediaEncodeStream.removeTrack(this.mVideoTrack);
            removeStreamsFromEncodeStream(true);
        }
        if (!(this.mRenderView == null || this.mVideoTrack == null)) {
            this.mVideoTrack.removeVideoSink(this.mRenderView);
        }
        if (this.mVideoCapturer != null) {
            this.mVideoCapturer.stop();
            this.mVideoCapturer.release();
            this.mVideoCapturer = null;
        }
        if (this.mVideoTrack != null) {
            if (this.mTextureFrameAvailableSink != null) {
                this.mVideoTrack.removeVideoSink(this.mTextureFrameAvailableSink);
            }
            if (this.mRecorderManager != null) {
                this.mVideoTrack.removeVideoSink(this.mRecorderManager.getSharedSink());
            }
            this.mVideoTrack.setVideoProcessor(null);
            this.mVideoTrack.release();
            this.mVideoTrack = null;
        }
        this.mReportFence.writeLock().unlock();
    }

    private void invalidateOptimizedUrl() {
        if (this.mDns != null && this.mOptUrlMap != null && !this.mOptUrlMap.isEmpty()) {
            String originUrl = getOriginUrl();
            if (!TextUtils.isEmpty(originUrl) && this.mOptUrlMap.containsKey(originUrl) && !((String) this.mOptUrlMap.get(originUrl)).equals("INVALID_URL")) {
                String str = (String) this.mOptUrlMap.get(originUrl);
                this.mOptUrlMap.put(originUrl, "INVALID_URL");
                this.mOptUrlReachable = 0;
                this.mDnsOptOpen = false;
                this.mDnsOptHit = false;
                this.mEvaluatorSymbol = "";
                StringBuilder sb = new StringBuilder("optimized url ");
                sb.append(str);
                sb.append(" is invalidated.");
                AVLog.iow("LiveStream", sb.toString());
            }
        }
    }

    public void addTrackToEncodeStream() {
        if (!(this.mMediaEncodeStream == null || this.mVideoTrack == null)) {
            this.mMediaEncodeStream.removeTrack(this.mVideoTrack);
            removeStreamsFromEncodeStream(true);
            this.mMediaEncodeStream.addTrack(this.mVideoTrack);
            this.mMediaEncodeStream.setOriginVideoTrack(this.mVideoTrack.mo109133id());
            addStreamsToEncodeStream(true);
            this.mMediaEncodeStream.setVideoMixerDescription(this.mVideoTrack.mo109133id(), this.mOriginVideoStreamDescription);
        }
        if (!(this.mMediaEncodeStream == null || this.mAudioTrack == null)) {
            this.mMediaEncodeStream.removeTrack(this.mAudioTrack);
            removeStreamsFromEncodeStream(false);
            this.mMediaEncodeStream.addTrack(this.mAudioTrack);
            this.mMediaEncodeStream.setOriginAudioTrack(this.mAudioTrack.mo109133id());
            addStreamsToEncodeStream(false);
            this.mMediaEncodeStream.setAudioMixerDescription(this.mAudioTrack.mo109133id(), this.mOriginAudioStreamDescription);
            if (this.mAudioCapture != null) {
                this.mAudioCapture.resume();
            }
        }
        if (this.mAudioFilterManager != null) {
            this.mAudioFilterManager.start();
        }
    }

    public IInputVideoStream createInputVideoStream() {
        Handler handler;
        MediaEngineFactory mediaEngineFactory = this.mMediaEngineFactory;
        if (this.mVideoCaptureHandler != null) {
            handler = this.mVideoCaptureHandler;
        } else {
            handler = this.mWorkThreadHandler;
        }
        final InputVideoStream inputVideoStream = new InputVideoStream(mediaEngineFactory, handler, new InputVideoStream.Observer() {
            public void releaseInputStream(final InputVideoStream inputVideoStream) {
                synchronized (LiveStream.this.mInputStreamListFence) {
                    LiveStream.this.mInputVideoStreams.remove(inputVideoStream);
                }
                ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, (Runnable) new Runnable() {
                    public void run() {
                        VideoTrack videoTrack = inputVideoStream.getVideoTrack();
                        if (videoTrack != null && LiveStream.this.mMediaEncodeStream != null) {
                            LiveStream.this.mMediaEncodeStream.removeTrack(videoTrack);
                        }
                    }
                });
            }

            public void onMixerDescriptionChange(final InputVideoStream inputVideoStream, final VideoMixerDescription videoMixerDescription) {
                ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, (Runnable) new Runnable() {
                    public void run() {
                        if (inputVideoStream.getVideoTrack() != null && LiveStream.this.mMediaEncodeStream != null) {
                            LiveStream.this.mMediaEncodeStream.setVideoMixerDescription(inputVideoStream.name(), videoMixerDescription);
                        }
                    }
                });
            }
        }, this.mLiveStreamBuilder.getVideoWidth(), this.mLiveStreamBuilder.getVideoHeight(), this.mLiveStreamBuilder.getVideoFps());
        synchronized (this.mInputStreamListFence) {
            this.mInputVideoStreams.add(inputVideoStream);
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, (Runnable) new Runnable() {
            public void run() {
                if (LiveStream.this.mMediaEncodeStream != null) {
                    LiveStream.this.mMediaEncodeStream.addTrack(inputVideoStream.getVideoTrack());
                    LiveStream.this.mMediaEncodeStream.setVideoMixerDescription(inputVideoStream.name(), inputVideoStream.getMixerDescription());
                }
            }
        });
        return inputVideoStream;
    }

    public void doBackgroundPause() {
        AVLog.ioi("LiveStream", "Switch to background.");
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (this.mStatus.get() != 7 && liveStreamBuilder != null) {
            if (!(this.mVideoCapturer == null || liveStreamBuilder.getBgMode() == 1)) {
                this.mVideoCapturer.pause();
            }
            if (!(this.mAudioCapture == null || !(this.mAudioCapture instanceof LiveStreamAudioCapture) || this.mLiveStreamBuilder.getBgMode() == 1)) {
                ((LiveStreamAudioCapture) this.mAudioCapture).toBackground();
            }
            if (this.mFilterManager != null) {
                this.mFilterManager.pauseEffect();
            }
            if (this.mAudioFilterManager != null) {
                this.mAudioFilterManager.pause();
            }
        }
    }

    public void doBackgroundResume() {
        AVLog.ioi("LiveStream", "Switch to frontground.");
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (this.mStatus.get() != 7 && liveStreamBuilder != null) {
            if (!(this.mVideoCapturer == null || liveStreamBuilder.getBgMode() == 1)) {
                this.mVideoCapturer.resume();
            }
            if (!(this.mAudioCapture == null || !(this.mAudioCapture instanceof LiveStreamAudioCapture) || this.mLiveStreamBuilder.getBgMode() == 1)) {
                ((LiveStreamAudioCapture) this.mAudioCapture).toFront();
            }
            if (this.mFilterManager != null) {
                this.mFilterManager.resumeEffect();
            }
            if (this.mAudioFilterManager != null) {
                this.mAudioFilterManager.resume();
            }
        }
    }

    public String getLiveStreamUrl() {
        String originUrl = getOriginUrl();
        if (!TextUtils.isEmpty(originUrl) && this.mDnsOptOpen && this.mDnsOptHit && this.mOptUrlMap != null && this.mOptUrlMap.containsKey(originUrl)) {
            String str = (String) this.mOptUrlMap.get(originUrl);
            if (!TextUtils.isEmpty(str) && !str.equals("INVALID_URL")) {
                originUrl = str;
            }
        }
        if (!TextUtils.isEmpty(originUrl) && this.mUrlPriority != 0) {
            originUrl = UrlUtils.AddParam(originUrl, "pri", String.valueOf(this.mUrlPriority));
        }
        if (TextUtils.isEmpty(originUrl) || TextUtils.isEmpty(getStreamUniqueId())) {
            return originUrl;
        }
        return UrlUtils.AddParam(originUrl, "_session_id", getStreamUniqueId());
    }

    public boolean onCanEncodeStream() {
        boolean z;
        if (this.mStatus.get() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.mLiveStreamBuilder.getVideoCaptureDevice() != 0) {
            if (this.mVideoCapturer == null || this.mVideoCapturer.status() != 1) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!z || this.mLiveStreamBuilder.getAudioCaptureDevice() == 0) {
            return z;
        }
        if (this.mAudioCapture == null || this.mAudioCapture.status() != 1) {
            return false;
        }
        return true;
    }

    private String chooseVideoEncode() {
        String[] strArr;
        String[] strArr2;
        boolean z;
        boolean z2;
        while (true) {
            if (this.mAvailableVideoEncoders == null) {
                String GetSupportedFormats = this.mVideoEncoderFactory.GetSupportedFormats();
                if (GetSupportedFormats != null) {
                    StringBuilder sb = new StringBuilder("Supports video encoder list:");
                    sb.append(GetSupportedFormats);
                    AVLog.m143696d("LiveStream", sb.toString());
                    this.mAvailableVideoEncoders = GetSupportedFormats.split(":");
                } else {
                    throw new AndroidRuntimeException("Not found any valid video encoder");
                }
            }
            String str = null;
            if (this.mLiveStreamBuilder.getVideoEncoder() == 1) {
                if (this.mLiveStreamBuilder.isEnableVideoEncodeAccelera()) {
                    String str2 = null;
                    for (String str3 : this.mAvailableVideoEncoders) {
                        if (str3.contains("video_enable_accelera=true") && str3.contains("video_type=video/avc")) {
                            str2 = "video/avc";
                        }
                    }
                    str = str2;
                }
                if (str != null) {
                    return str;
                }
                AVLog.iow("LiveStream", "Hardware video encoder not found, use x264 instead.");
                String str4 = "video/x264";
                this.mLiveStreamBuilder.setEnableVideoEncodeAccelera(false);
                return str4;
            } else if (this.mLiveStreamBuilder.getVideoEncoder() != 2) {
                return null;
            } else {
                z = false;
                z2 = false;
                for (String str5 : this.mAvailableVideoEncoders) {
                    if (str5.contains("video_type=video/hevc")) {
                        if (str5.contains("video_enable_accelera=true")) {
                            z = true;
                        } else {
                            z2 = true;
                        }
                    }
                }
                if (z || z2) {
                    String str6 = "video/hevc";
                    boolean isEnableVideoEncodeAccelera = this.mLiveStreamBuilder.isEnableVideoEncodeAccelera();
                } else {
                    AVLog.iow("LiveStream", "No H.265 encoder found, use x264 instead.");
                    this.mLiveStreamBuilder.setVideoEncoder(1);
                    this.mLiveStreamBuilder.setEnableVideoEncodeAccelera(false);
                    if (getResolutionLevel(this.mLiveStreamBuilder.getVideoWidth(), this.mLiveStreamBuilder.getVideoHeight()) >= 4) {
                        this.mLiveStreamBuilder.setVideoProfile(1);
                    } else {
                        this.mLiveStreamBuilder.setVideoProfile(3);
                    }
                }
            }
        }
        String str62 = "video/hevc";
        boolean isEnableVideoEncodeAccelera2 = this.mLiveStreamBuilder.isEnableVideoEncodeAccelera();
        if (isEnableVideoEncodeAccelera2 && !z) {
            AVLog.iow("LiveStream", "Hardware h265 encoder not found, try software h265 encoder instead.");
            this.mLiveStreamBuilder.setEnableVideoEncodeAccelera(false);
            return str62;
        } else if (isEnableVideoEncodeAccelera2 || z2) {
            return str62;
        } else {
            AVLog.iow("LiveStream", "Software h265 encoder not found, try hardware h265 encoder instead.");
            this.mLiveStreamBuilder.setEnableVideoEncodeAccelera(true);
            return str62;
        }
    }

    private void destroyEncodeStream() {
        if (this.mMediaEncodeStream != null) {
            this.mMediaEncodeStream.stop();
        }
        if (!(this.mMediaEncodeStream == null || this.mVideoTrack == null)) {
            this.mMediaEncodeStream.removeTrack(this.mVideoTrack);
            removeStreamsFromEncodeStream(true);
        }
        if (!(this.mMediaEncodeStream == null || this.mAudioTrack == null)) {
            this.mMediaEncodeStream.removeTrack(this.mAudioTrack);
            removeStreamsFromEncodeStream(false);
        }
        this.mReportFence.writeLock().lock();
        if (this.mTransportOpt != null) {
            this.mTransportOpt.release();
            this.mTransportOpt = null;
        }
        if (this.mRTMPTransport != null) {
            this.mRTMPTransport.release();
            this.mRTMPTransport = null;
        }
        if (this.mEncodeStreamOpt != null) {
            this.mEncodeStreamOpt.release();
            this.mEncodeStreamOpt = null;
        }
        if (this.mMediaEncodeStream != null) {
            this.mMediaEncodeStream.registerObserver(null);
            this.mMediaEncodeStream.release();
            this.mMediaEncodeStream = null;
        }
        if (this.mVideoEncoderFactory != null) {
            this.mVideoEncoderFactory.release();
            this.mVideoEncoderFactory = null;
        }
        this.mReportFence.writeLock().unlock();
        if (this.mAudioFilterManager != null) {
            this.mAudioFilterManager.stop();
        }
        this.mStreamLogService.onConnectEnd(this.mStatus.get());
    }

    private void getOptimizedUrl() {
        String originUrl = getOriginUrl();
        if (!TextUtils.isEmpty(originUrl)) {
            if (this.mDns == null) {
                this.mDnsOptOpen = false;
            }
            if (this.mDnsOptOpen && this.mOptUrlMap != null && this.mOptUrlMap.containsKey(originUrl) && ((String) this.mOptUrlMap.get(originUrl)).equals("INVALID_URL")) {
                this.mDnsOptOpen = false;
            }
            this.mDnsOptHit = false;
            this.mEvaluatorSymbol = "";
            if (this.mDnsOptOpen && this.mOptUrlMap != null) {
                try {
                    String[] optUrlAndEvaluateSymbol = getOptUrlAndEvaluateSymbol(this.mDns, originUrl);
                    if (optUrlAndEvaluateSymbol != null && optUrlAndEvaluateSymbol.length == 2) {
                        if (!TextUtils.isEmpty(optUrlAndEvaluateSymbol[0])) {
                            this.mOptUrlMap.put(originUrl, optUrlAndEvaluateSymbol[0]);
                            this.mDnsOptHit = true;
                            StringBuilder sb = new StringBuilder("Dns optimize hit: optimized url ");
                            sb.append(optUrlAndEvaluateSymbol[0]);
                            sb.append(", evaluate symbol ");
                            sb.append(optUrlAndEvaluateSymbol[1]);
                            AVLog.ioi("LiveStream", sb.toString());
                            this.mEvaluatorSymbol = optUrlAndEvaluateSymbol[1];
                            if (TextUtils.isEmpty(this.mEvaluatorSymbol)) {
                                this.mEvaluatorSymbol = "sdk_previous_dns";
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public void doStart() {
        boolean z = true;
        if (this.mStatus.get() == 8) {
            AVLog.ioe("LiveStream", "Try to start live stream while mStatus is STATUS_ERROR");
            this.mErrorListener.onError(1, 0, new Exception("Error status call on start"));
        } else if (this.mStatus.get() != 3 && this.mStatus.get() != 2) {
            this.mStatus.set(3);
            this.mRtmpReConnectCounts = 0;
            this.mFirstConnect = true;
            this.mUriReachable = -1;
            this.mOptUrlReachable = -1;
            if (this.mDns == null) {
                z = false;
            }
            this.mDnsOptOpen = z;
            this.mDnsOptHit = false;
            this.mEvaluatorSymbol = "";
            getOptimizedUrl();
            updateUrlPriority();
            updatePushCount();
            createEncoderStream();
            if (this.mRTMPTransport != null) {
                this.mRTMPTransport.setEventObserver(this);
                String liveStreamUrl = getLiveStreamUrl();
                StringBuilder sb = new StringBuilder("Rtmp(");
                sb.append(this.mRTMPTransport);
                sb.append(") setUrl ");
                sb.append(liveStreamUrl);
                AVLog.iod("LiveStream", sb.toString());
                this.mRTMPTransport.setupUrl(liveStreamUrl);
            }
        }
    }

    public void doStartVideoSource() {
        if (this.mStatus.get() == 8) {
            AVLog.ioe("LiveStream", "Try to start video capture while mStatus is STATUS_ERROR");
            this.mErrorListener.onError(1, 0, new Exception("Error status call on start"));
        } else if (this.mVideoCapturer == null || this.mVideoCapturer.status() != 1) {
            creatVideoTrack();
            if (!(this.mVideoTrack == null || this.mRenderView == null)) {
                this.mVideoTrack.addVideoSink(this.mRenderView);
            }
            if (this.mVideoCapturer != null) {
                this.mInfoListener.onInfo(4, 0, 0);
                this.mVideoCapturer.updateScreenIntent(this.mLiveStreamBuilder.getScreenCaptureIntent());
                this.mVideoCapturer.adaptedOutputFormat(this.mLiveStreamBuilder.getVideoWidth(), this.mLiveStreamBuilder.getVideoHeight(), this.mLiveStreamBuilder.getVideoFps());
                this.mVideoCapturer.start(this.mLiveStreamBuilder.getVideoCaptureWidth(), this.mLiveStreamBuilder.getVideoCaptureHeight(), this.mLiveStreamBuilder.getVideoCaptureFps());
            }
        } else {
            AVLog.iow("LiveStream", "Already start video capture");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:36|37|38|39) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x008d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.stopCaptureSource()     // Catch:{ all -> 0x00bd }
            r7.stopRecord()     // Catch:{ all -> 0x00bd }
            r7.stop()     // Catch:{ all -> 0x00bd }
            r0 = 1
            boolean[] r1 = new boolean[r0]     // Catch:{ all -> 0x00bd }
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x00bd }
            java.util.concurrent.atomic.AtomicInteger r0 = r7.mStatus     // Catch:{ all -> 0x00bd }
            int r0 = r0.get()     // Catch:{ all -> 0x00bd }
            r3 = 7
            if (r0 == r3) goto L_0x0056
            android.os.Handler r0 = r7.mWorkThreadHandler     // Catch:{ all -> 0x00bd }
            com.ss.avframework.livestreamv2.LiveStream$14 r4 = new com.ss.avframework.livestreamv2.LiveStream$14     // Catch:{ all -> 0x00bd }
            r4.<init>(r1)     // Catch:{ all -> 0x00bd }
            r0.post(r4)     // Catch:{ all -> 0x00bd }
            java.lang.Object r0 = r7.mReleaseFence     // Catch:{ all -> 0x00bd }
            monitor-enter(r0)     // Catch:{ all -> 0x00bd }
            java.lang.Object r4 = r7.mReleaseFence     // Catch:{ Throwable -> 0x0052 }
            r5 = 3000(0xbb8, double:1.482E-320)
            r4.wait(r5)     // Catch:{ Throwable -> 0x0052 }
            boolean r4 = r1[r2]     // Catch:{ Throwable -> 0x0052 }
            if (r4 == 0) goto L_0x0052
            java.lang.String r4 = "LiveStream"
            java.lang.String r5 = "Waiting work thread timeout with dump thread stack:"
            com.p280ss.avframework.utils.AVLog.iow(r4, r5)     // Catch:{ Throwable -> 0x0052 }
            android.os.Handler r4 = r7.mWorkThreadHandler     // Catch:{ Throwable -> 0x0052 }
            if (r4 == 0) goto L_0x0052
            android.os.Handler r4 = r7.mWorkThreadHandler     // Catch:{ Throwable -> 0x0052 }
            android.os.Looper r4 = r4.getLooper()     // Catch:{ Throwable -> 0x0052 }
            if (r4 == 0) goto L_0x0052
            java.lang.Thread r4 = r4.getThread()     // Catch:{ Throwable -> 0x0052 }
            if (r4 == 0) goto L_0x0052
            java.lang.String r5 = "LiveStream"
            dumpJavaThreadStackIfNeed(r4, r5)     // Catch:{ Throwable -> 0x0052 }
            goto L_0x0052
        L_0x0050:
            r1 = move-exception
            goto L_0x0054
        L_0x0052:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            goto L_0x0056
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r1     // Catch:{ all -> 0x00bd }
        L_0x0056:
            java.util.concurrent.atomic.AtomicInteger r0 = r7.mStatus     // Catch:{ all -> 0x00bd }
            r0.set(r3)     // Catch:{ all -> 0x00bd }
            boolean r0 = r1[r2]     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0078
            com.ss.avframework.capture.audio.AudioCapturer r0 = r7.mAudioCapture     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0068
            com.ss.avframework.capture.audio.AudioCapturer r0 = r7.mAudioCapture     // Catch:{ all -> 0x00bd }
            r0.stop()     // Catch:{ all -> 0x00bd }
        L_0x0068:
            com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = r7.mVideoCapturer     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0071
            com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = r7.mVideoCapturer     // Catch:{ all -> 0x00bd }
            r0.stop()     // Catch:{ all -> 0x00bd }
        L_0x0071:
            java.lang.String r0 = "LiveStream"
            java.lang.String r1 = "Release on work thread timeout."
            com.p280ss.avframework.utils.AVLog.iow(r0, r1)     // Catch:{ all -> 0x00bd }
        L_0x0078:
            com.ss.avframework.livestreamv2.log.LiveStreamLogService r0 = r7.mStreamLogService     // Catch:{ all -> 0x00bd }
            r0.close()     // Catch:{ all -> 0x00bd }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00bd }
            r1 = 18
            if (r0 < r1) goto L_0x0093
            com.ss.avframework.opengl.GLThread r0 = r7.workThread     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x009c
            com.ss.avframework.opengl.GLThread r0 = r7.workThread     // Catch:{ Throwable -> 0x008d }
            r0.quitSafely()     // Catch:{ Throwable -> 0x008d }
            goto L_0x009c
        L_0x008d:
            com.ss.avframework.opengl.GLThread r0 = r7.workThread     // Catch:{ all -> 0x00bd }
            r0.quit()     // Catch:{ all -> 0x00bd }
            goto L_0x009c
        L_0x0093:
            com.ss.avframework.opengl.GLThread r0 = r7.workThread     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x009c
            com.ss.avframework.opengl.GLThread r0 = r7.workThread     // Catch:{ all -> 0x00bd }
            r0.quit()     // Catch:{ all -> 0x00bd }
        L_0x009c:
            r0 = 0
            r7.workThread = r0     // Catch:{ all -> 0x00bd }
            android.os.HandlerThread r1 = r7.dataNotifyThread     // Catch:{ all -> 0x00bd }
            r1.quit()     // Catch:{ all -> 0x00bd }
            r7.dataNotifyThread = r0     // Catch:{ all -> 0x00bd }
            com.ss.avframework.livestreamv2.LiveStream$15 r1 = new com.ss.avframework.livestreamv2.LiveStream$15     // Catch:{ all -> 0x00bd }
            r1.<init>()     // Catch:{ all -> 0x00bd }
            r7.mInfoListener = r1     // Catch:{ all -> 0x00bd }
            com.ss.avframework.livestreamv2.LiveStream$16 r1 = new com.ss.avframework.livestreamv2.LiveStream$16     // Catch:{ all -> 0x00bd }
            r1.<init>()     // Catch:{ all -> 0x00bd }
            r7.mErrorListener = r1     // Catch:{ all -> 0x00bd }
            com.ss.avframework.livestreamv2.LiveStreamBuilder r1 = r7.mLiveStreamBuilder     // Catch:{ all -> 0x00bd }
            r1.setContext(r0)     // Catch:{ all -> 0x00bd }
            r7.mLiveStreamBuilder = r0     // Catch:{ all -> 0x00bd }
            monitor-exit(r7)
            return
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.LiveStream.release():void");
    }

    public void rtmpReconnect() {
        if (this.mStatus.get() == 8 || this.mStatus.get() == 7) {
            StringBuilder sb = new StringBuilder("Try to reconnect rtmp while mStatus is ");
            sb.append(this.mStatus.get());
            AVLog.ioe("LiveStream", sb.toString());
            this.mErrorListener.onError(1, 0, new Exception("Error status call on rtmpReconnect"));
            return;
        }
        this.mStreamLogService.onReconnect();
        this.mRtmpReConnectCounts++;
        this.mInfoListener.onInfo(15, this.mRtmpReConnectCounts, 0);
        StringBuilder sb2 = new StringBuilder("Reconnect with ");
        sb2.append(getLiveStreamUrl());
        sb2.append(", current reconnect count ");
        sb2.append(this.mRtmpReConnectCounts);
        AVLog.ioi("LiveStream", sb2.toString());
        if (this.mStatus.get() == 2) {
            destroyEncodeStream();
            getOptimizedUrl();
            updateUrlPriority();
            updatePushCount();
            createEncoderStream();
            if (this.mRTMPTransport != null) {
                this.mRTMPTransport.setEventObserver(this);
                this.mRTMPTransport.setupUrl(getLiveStreamUrl());
            }
        } else if (this.mStatus.get() == 3) {
            destroyEncodeStream();
            getOptimizedUrl();
            updateUrlPriority();
            updatePushCount();
            createEncoderStream();
            if (this.mRTMPTransport != null) {
                this.mRTMPTransport.setEventObserver(this);
                this.mRTMPTransport.setupUrl(getLiveStreamUrl());
            }
        } else {
            StringBuilder sb3 = new StringBuilder("mStatus status is ");
            sb3.append(this.mStatus.get());
            sb3.append(" on rtmpReconnect");
            AVLog.ioe("LiveStream", sb3.toString());
            doStop();
        }
    }

    private void creatVideoTrack() {
        int videoCaptureDevice = this.mLiveStreamBuilder.getVideoCaptureDevice();
        if (videoCaptureDevice != 0) {
            this.mVideoCapturer = new LiveStreamVideoCapture(videoCaptureDevice, this.mVideoCaptureHandler, (LiveStreamVideoCapture.Observer) this, this.mLiveStreamBuilder);
            this.mVideoCapturer.setBackgroundPolicy(this.mLiveStreamBuilder.getBgMode());
        }
        if (this.mVideoCapturer != null) {
            this.mVideoTrack = this.mMediaEngineFactory.createVideoTrack(this.mVideoCapturer);
            if (this.mLiveStreamBuilder.getEffectModePath() != null && (this.mFilterManager instanceof FilterManager)) {
                this.mFilterManager.setEffectAlgorithmAB(this.mLiveStreamBuilder.getEffectAlgorithmAB());
                IFilterManager iFilterManager = this.mFilterManager;
                boolean z = true;
                if (this.mLiveStreamBuilder.getRoiOn(true) == 0 && this.mLiveStreamBuilder.getRoiOn(false) == 0) {
                    z = false;
                }
                iFilterManager.enableRoi(z);
                if (this.mLiveStreamBuilder.getEffectResourceFinder() != null) {
                    this.mFilterManager.configEffect(this.mLiveStreamBuilder.getVideoWidth(), this.mLiveStreamBuilder.getVideoHeight(), this.mLiveStreamBuilder.getEffectModePath(), Build.MODEL, this.mLiveStreamBuilder.isUseTTFaceDetect(), this.mLiveStreamBuilder.getEffectResourceFinder());
                } else if (this.mLiveStreamBuilder.getAssetManager() == null || !(this.mLiveStreamBuilder.getAssetManager() instanceof AssetManager)) {
                    this.mFilterManager.configEffect(this.mLiveStreamBuilder.getVideoWidth(), this.mLiveStreamBuilder.getVideoHeight(), this.mLiveStreamBuilder.getEffectModePath(), Build.MODEL, this.mLiveStreamBuilder.isUseTTFaceDetect());
                } else {
                    this.mFilterManager.configEffect(this.mLiveStreamBuilder.getVideoWidth(), this.mLiveStreamBuilder.getVideoHeight(), this.mLiveStreamBuilder.getEffectModePath(), Build.MODEL, this.mLiveStreamBuilder.isUseTTFaceDetect(), (AssetManager) this.mLiveStreamBuilder.getAssetManager());
                }
            }
            if (this.mFilterManager instanceof FilterManager) {
                this.mVideoTrack.setVideoProcessor((FilterManager) this.mFilterManager);
            }
            if (this.mTextureFrameAvailableSink != null) {
                this.mVideoTrack.addVideoSink(this.mTextureFrameAvailableSink);
            }
        }
    }

    private void createAudioTrack() {
        int audioCaptureDevice = this.mLiveStreamBuilder.getAudioCaptureDevice();
        this.mAudioCapture = null;
        if (this.mLiveStreamBuilder.isUsingLiveStreamAudioCapture()) {
            LiveStreamAudioCapture liveStreamAudioCapture = new LiveStreamAudioCapture(this.mAudioRecordMode, audioCaptureDevice, this.mLiveStreamBuilder.getAudioCaptureSampleHZ(), this.mLiveStreamBuilder.getAudioCaptureChannel(), this.mLiveStreamBuilder.getAudioCaptureBitwidth(), null, this, this.mMediaEngineFactory);
            this.mAudioCapture = liveStreamAudioCapture;
        } else if (audioCaptureDevice != 0) {
            if (audioCaptureDevice == 2) {
                AudioCapturerOpensles audioCapturerOpensles = new AudioCapturerOpensles(this.mAudioRecordMode, this.mLiveStreamBuilder.getAudioCaptureSampleHZ(), this.mLiveStreamBuilder.getAudioCaptureChannel(), this.mLiveStreamBuilder.getAudioCaptureBitwidth(), this);
                this.mAudioCapture = audioCapturerOpensles;
            } else if (audioCaptureDevice == 4) {
                LiveStreamAudioCapture liveStreamAudioCapture2 = new LiveStreamAudioCapture(this.mAudioRecordMode, audioCaptureDevice, this.mLiveStreamBuilder.getAudioCaptureSampleHZ(), this.mLiveStreamBuilder.getAudioCaptureChannel(), this.mLiveStreamBuilder.getAudioCaptureBitwidth(), null, this, this.mMediaEngineFactory);
                this.mAudioCapture = liveStreamAudioCapture2;
            } else if (audioCaptureDevice == 1) {
                AudioCapturerAudioRecord audioCapturerAudioRecord = new AudioCapturerAudioRecord(this.mAudioRecordMode, this.mLiveStreamBuilder.getAudioCaptureSampleHZ(), this.mLiveStreamBuilder.getAudioCaptureChannel(), this.mLiveStreamBuilder.getAudioCaptureBitwidth(), this);
                this.mAudioCapture = audioCapturerAudioRecord;
            }
        }
        if (this.mAudioCapture != null) {
            if (this.mAudioDeviceModule != null) {
                this.mAudioCapture.setAudioDeviceModule(this.mAudioDeviceModule);
                this.mAudioDeviceModule.setExternalRecording(true);
            }
            this.mAudioTrack = this.mMediaEngineFactory.createAudioTrack(this.mAudioCapture);
            if (this.mAudioFrameAvailableSink != null) {
                this.mAudioTrack.addAudioSink(this.mAudioFrameAvailableSink);
            }
            if (this.mAudioFilterManager != null && !this.mAudioFilterManager.isDummy()) {
                this.mAudioTrack.setAudioProcessor(this.mAudioFilterManager);
            }
            this.mAudioCapture.setCalculatePcmPowerEventObserver(this);
            this.mAudioCapture.setAudioQuantizeGapPeriod((long) this.mLiveStreamBuilder.getAudioQuantizeGapPeriod());
        }
        if (this.mAudioCapture != null) {
            this.mAudioCapture.setOutputFormat(this.mLiveStreamBuilder.getAudioSampleHZ(), this.mLiveStreamBuilder.getAudioChannel(), this.mLiveStreamBuilder.getAudioBitwidth());
            if (this.mAudioDeviceModule != null) {
                TEBundle parameter = this.mAudioDeviceModule.getParameter();
                parameter.setInt("audio_sample", this.mLiveStreamBuilder.getAudioCaptureSampleHZ());
                parameter.setInt("audio_channels", this.mLiveStreamBuilder.getAudioCaptureChannel());
                parameter.setInt("audio_bit_width", this.mLiveStreamBuilder.getAudioBitwidth());
                this.mAudioDeviceModule.setParameter(parameter);
            }
        }
    }

    public void doStartAudioSource() {
        if (this.mStatus.get() == 8) {
            AVLog.ioe("LiveStream", "Try to start audio capture while mStatus is STATUS_ERROR");
            this.mErrorListener.onError(1, 0, new Exception("Error status call on start"));
        } else if (this.mAudioCapture == null || this.mAudioCapture.status() != 1) {
            createAudioTrack();
            if (this.mAudioDeviceModule != null) {
                int startRecording = this.mAudioDeviceModule.startRecording();
                if (startRecording != 0) {
                    this.mStatus.set(8);
                    StringBuilder sb = new StringBuilder("AudioDeviceModule.startRecording() failed: ");
                    sb.append(startRecording);
                    AVLog.ioe("LiveStream", sb.toString());
                    this.mErrorListener.onError(7, startRecording, new Exception("ADM startRecording error."));
                    return;
                }
            }
            if (this.mAudioTrack != null) {
                this.mInfoListener.onInfo(7, 0, 0);
                try {
                    this.mAudioCapture.start();
                    int updateChannel = this.mAudioCapture.updateChannel();
                    if (updateChannel != this.mLiveStreamBuilder.getAudioCaptureChannel()) {
                        this.mInfoListener.onInfo(17, updateChannel, 0);
                    }
                    this.mLiveStreamBuilder.setAudioCaptureChannel(updateChannel);
                    this.tryOpenAudioCaptureOnLater = true;
                } catch (Exception e) {
                    if (this.tryOpenAudioCaptureOnLater) {
                        this.tryOpenAudioCaptureOnLater = false;
                        StringBuilder sb2 = new StringBuilder("Open capture failed(");
                        sb2.append(e.getCause());
                        sb2.append("(");
                        sb2.append(Log.getStackTraceString(e));
                        sb2.append(")) with try open audio capture at after 400");
                        sb2.append(" ms later");
                        AVLog.iow("LiveStream", sb2.toString());
                        this.mWorkThreadHandler.postDelayed(new Runnable() {
                            public void run() {
                                LiveStream.this.doStopAudioSource();
                                LiveStream.this.doStartAudioSource();
                            }
                        }, 400);
                        return;
                    }
                    this.mStatus.set(8);
                    StringBuilder sb3 = new StringBuilder("Start audio capture failed: ");
                    sb3.append(e.toString());
                    AVLog.ioe("LiveStream", sb3.toString());
                    this.mErrorListener.onError(3, 0, e);
                }
                if (this.mAudioCapture.status() == 1) {
                    if (this.mRecorderManager != null) {
                        this.mRecorderManager.setupAudioSource(this.mAudioCapture);
                    }
                    if (this.mAudioFrameAvailableSink != null) {
                        this.mAudioCapture.resume();
                    }
                    this.mInfoListener.onInfo(8, 0, 0);
                } else {
                    this.mStatus.set(8);
                    StringBuilder sb4 = new StringBuilder("Start audio capture failed: mAudioCapture's status is ");
                    sb4.append(this.mAudioCapture.status());
                    AVLog.ioe("LiveStream", sb4.toString());
                    this.mErrorListener.onError(3, 0, new Exception("Audio capture start fail"));
                }
            }
            if (onCanEncodeStream()) {
                addTrackToEncodeStream();
            }
        } else {
            AVLog.iow("LiveStream", "Already start audio capture");
        }
    }

    private void setupParameter() {
        int i;
        String chooseVideoEncode = chooseVideoEncode();
        boolean isEnableVideoEncodeAccelera = this.mLiveStreamBuilder.isEnableVideoEncodeAccelera();
        int chooseProfileLevel = chooseProfileLevel();
        int chooseAudioProfileLevel = chooseAudioProfileLevel();
        if (this.mRTMPTransport != null) {
            AVLog.m143696d("LiveStream", "Dump default rtmp config:");
            this.mTransportOpt.dump();
            this.mTransportOpt.setLong("rtmp_init_audio_bitrate", (long) this.mLiveStreamBuilder.getAudioBitrate());
            this.mTransportOpt.setLong("rtmp_init_video_bitrate", (long) this.mLiveStreamBuilder.getVideoBitrate());
            this.mTransportOpt.setLong("rtmp_max_video_bitrate", (long) this.mLiveStreamBuilder.getVideoMaxBitrate());
            this.mTransportOpt.setLong("rtmp_min_video_bitrate", (long) this.mLiveStreamBuilder.getVideoMinBitrate());
            this.mTransportOpt.setInt("rtmp_bw_est_strategy", this.mLiveStreamBuilder.getBitrateAdaptStrategy());
            this.mTransportOpt.setString("video_type", chooseVideoEncode);
            this.mTransportOpt.setBool("video_enable_accelera", isEnableVideoEncodeAccelera);
            this.mTransportOpt.setInt("video_width", this.mLiveStreamBuilder.getVideoWidth());
            this.mTransportOpt.setInt("video_height", this.mLiveStreamBuilder.getVideoHeight());
            this.mTransportOpt.setInt("video_profileLevel", chooseProfileLevel);
            this.mTransportOpt.setInt("video_fps", this.mLiveStreamBuilder.getVideoFps());
            this.mTransportOpt.setLong("video_bitrate", (long) this.mLiveStreamBuilder.getVideoBitrate());
            this.mTransportOpt.setInt("video_gop", getVideoGop());
            this.mTransportOpt.setInt("audio_channels", this.mLiveStreamBuilder.getAudioChannel());
            this.mTransportOpt.setInt("audio_sample", this.mLiveStreamBuilder.getAudioSampleHZ());
            this.mTransportOpt.setInt("audio_bit_width", this.mLiveStreamBuilder.getAudioBitwidth());
            this.mTransportOpt.setLong("audio_bit_rate", (long) this.mLiveStreamBuilder.getAudioBitrate());
            this.mTransportOpt.setInt("audio_profileLevel", chooseAudioProfileLevel);
            this.mTransportOpt.setBool("video_enable_ntp", this.mLiveStreamBuilder.isEnableVideoNtp());
            this.mTransportOpt.setString("qos_id", this.mLiveStreamBuilder.getQosId());
            this.mTransportOpt.setBool("hit_node_optimize", this.mDnsOptHit);
            String rtmpTcUrl = getRtmpTcUrl();
            if (!TextUtils.isEmpty(rtmpTcUrl)) {
                this.mTransportOpt.setString("rtmp_tc_url", rtmpTcUrl);
            }
            if (this.mLiveStreamBuilder.getKcpParams() != null) {
                JSONObject kcpParams = this.mLiveStreamBuilder.getKcpParams();
                TEBundle tEBundle = new TEBundle();
                try {
                    if (!kcpParams.isNull("wnd_recv")) {
                        tEBundle.setInt("wnd_recv", kcpParams.getInt("wnd_recv"));
                    }
                    if (!kcpParams.isNull("wnd_send")) {
                        tEBundle.setInt("wnd_send", kcpParams.getInt("wnd_send"));
                    }
                    if (!kcpParams.isNull("mtu_size")) {
                        tEBundle.setInt("mtu_size", kcpParams.getInt("mtu_size"));
                    }
                    if (!kcpParams.isNull("fast_ack")) {
                        tEBundle.setInt("fast_ack", kcpParams.getInt("fast_ack"));
                    }
                    if (!kcpParams.isNull("bwinit")) {
                        tEBundle.setInt("bwinit", kcpParams.getInt("bwinit"));
                    }
                    if (!kcpParams.isNull("bwmin")) {
                        tEBundle.setInt("bwmin", kcpParams.getInt("bwmin"));
                    }
                    if (!kcpParams.isNull("window")) {
                        tEBundle.setInt("window", kcpParams.getInt("window"));
                    }
                    if (!kcpParams.isNull("probebw")) {
                        tEBundle.setInt("probebw", kcpParams.getInt("probebw"));
                    }
                    if (!kcpParams.isNull("preempt")) {
                        tEBundle.setInt("preempt", kcpParams.getInt("preempt"));
                    }
                    if (!kcpParams.isNull("jitter")) {
                        tEBundle.setInt("jitter", kcpParams.getInt("jitter"));
                    }
                    if (!kcpParams.isNull("timeout")) {
                        tEBundle.setInt("timeout", kcpParams.getInt("timeout"));
                    }
                    if (!kcpParams.isNull("retrans")) {
                        tEBundle.setInt("retrans", kcpParams.getInt("retrans"));
                    }
                    if (!kcpParams.isNull("report")) {
                        tEBundle.setInt("report", kcpParams.getInt("report"));
                    }
                    if (!kcpParams.isNull("lost")) {
                        tEBundle.setDouble("lost", kcpParams.getDouble("lost"));
                    }
                    if (!kcpParams.isNull("fec")) {
                        tEBundle.setInt("fec", kcpParams.getInt("fec"));
                    }
                    if (!kcpParams.isNull("logmask")) {
                        tEBundle.setInt("logmask", kcpParams.getInt("logmask"));
                    }
                } catch (Exception unused) {
                }
                this.mTransportOpt.setBundle("kcp_params", tEBundle);
            }
            if (this.mLiveStreamBuilder.getQuicParams() != null) {
                JSONObject quicParams = this.mLiveStreamBuilder.getQuicParams();
                TEBundle tEBundle2 = new TEBundle();
                try {
                    if (!quicParams.isNull("congestion_type")) {
                        tEBundle2.setInt("congestion_type", quicParams.getInt("congestion_type"));
                    }
                    if (!quicParams.isNull("quic_version")) {
                        tEBundle2.setInt("quic_version", quicParams.getInt("quic_version"));
                    }
                    if (!quicParams.isNull("log_level")) {
                        tEBundle2.setInt("log_level", quicParams.getInt("log_level"));
                    }
                    if (!quicParams.isNull("adapt_est_bw_to_quic_bw")) {
                        tEBundle2.setInt("adapt_est_bw_to_quic_bw", quicParams.getInt("adapt_est_bw_to_quic_bw"));
                    }
                } catch (Exception unused2) {
                }
                this.mTransportOpt.setBundle("quic_params", tEBundle2);
            }
            this.mRTMPTransport.setParameter(this.mTransportOpt);
            AVLog.m143696d("LiveStream", "Dump update rtmp config:");
            this.mTransportOpt.dump();
        }
        if (this.mEncodeStreamOpt != null) {
            this.mEncodeStreamOpt.setString("video_type", chooseVideoEncode);
            this.mEncodeStreamOpt.setBool("video_enable_accelera", isEnableVideoEncodeAccelera);
            this.mEncodeStreamOpt.setInt("video_width", this.mLiveStreamBuilder.getVideoWidth());
            this.mEncodeStreamOpt.setInt("video_height", this.mLiveStreamBuilder.getVideoHeight());
            this.mEncodeStreamOpt.setInt("video_profileLevel", chooseProfileLevel);
            this.mEncodeStreamOpt.setInt("video_fps", this.mLiveStreamBuilder.getVideoFps());
            this.mEncodeStreamOpt.setLong("video_bitrate", (long) this.mLiveStreamBuilder.getVideoBitrate());
            this.mEncodeStreamOpt.setInt("video_gop", getVideoGop());
            this.mEncodeStreamOpt.setBool("video_enable_bframe", this.mLiveStreamBuilder.isEnableVideoBFrame());
            this.mEncodeStreamOpt.setInt("roi_on", this.mLiveStreamBuilder.getRoiOn(isEnableVideoEncodeAccelera));
            this.mEncodeStreamOpt.setString("roi_asset_dir", this.mLiveStreamBuilder.getRoiAssetDir());
            TEBundle tEBundle3 = this.mEncodeStreamOpt;
            String str = "video_is_cbr";
            if (this.mLiveStreamBuilder.getVideoBitrateMode() == 2) {
                i = 1;
            } else {
                i = 0;
            }
            tEBundle3.setInt(str, i);
            this.mEncodeStreamOpt.setInt("configuration_type", 1);
            this.mEncodeStreamOpt.setString("audio_type", "audio/faac");
            this.mEncodeStreamOpt.setInt("audio_channels", this.mLiveStreamBuilder.getAudioChannel());
            this.mEncodeStreamOpt.setInt("audio_sample", this.mLiveStreamBuilder.getAudioSampleHZ());
            this.mEncodeStreamOpt.setInt("audio_bit_width", this.mLiveStreamBuilder.getAudioBitwidth());
            this.mEncodeStreamOpt.setInt("audio_profileLevel", chooseAudioProfileLevel);
            this.mEncodeStreamOpt.setLong("audio_bit_rate", (long) this.mLiveStreamBuilder.getAudioBitrate());
            StringBuilder sb = new StringBuilder("Dump all encodeStream config:");
            sb.append(this.mEncodeStreamOpt.toString());
            AVLog.iod("LiveStream", sb.toString());
            this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
            setupMixerParameter();
            setupVsyncParameter();
        }
    }

    public void setDataListener(ILiveStreamDataListener iLiveStreamDataListener) {
        this.mDataListener = iLiveStreamDataListener;
    }

    public void setErrorListener(ILiveStreamErrorListener iLiveStreamErrorListener) {
        this.mErrorListener = iLiveStreamErrorListener;
    }

    public void setInfoListener(ILiveStreamInfoListener iLiveStreamInfoListener) {
        this.mInfoListener = iLiveStreamInfoListener;
    }

    protected LiveStream(LiveStreamBuilder liveStreamBuilder) {
        this(liveStreamBuilder, null, null);
    }

    public boolean isEnableMixer(boolean z) {
        if (z) {
            return this.mAudioMixer;
        }
        return this.mVideoMixer;
    }

    public void setScreenIntent(Intent intent) {
        this.mLiveStreamBuilder.setScreenCaptureIntent(intent);
    }

    public boolean isMirror(boolean z) {
        if (this.mVideoCapturer != null) {
            return this.mVideoCapturer.isMirror(z);
        }
        return false;
    }

    public void onCalculatePcmPowerEvent(final int i) {
        if (this.mDataNotifyThreadHandler != null) {
            this.mDataNotifyThreadHandler.post(new Runnable() {
                public void run() {
                    if (LiveStream.this.mDataListener != null) {
                        LiveStream.this.mDataListener.onData(1, i, 0);
                    }
                }
            });
        }
    }

    public int sendSeiMsg(String str) {
        if (this.mRTMPTransport != null) {
            return this.mRTMPTransport.sendSeiMsg(str);
        }
        return -1;
    }

    public void setAudioFrameAvailableListener(final IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        if (this.mWorkThreadHandler != null) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    if (LiveStream.this.mStatus.get() != 7) {
                        if (iAudioFrameAvailableListener == null) {
                            if (LiveStream.this.mAudioFrameAvailableSink != null) {
                                LiveStream.this.mAudioFrameAvailableSink.setListener(null);
                            }
                            return;
                        }
                        if (LiveStream.this.mAudioFrameAvailableSink == null) {
                            LiveStream.this.mAudioFrameAvailableSink = new AudioFrameAvailableSink();
                        }
                        LiveStream.this.mAudioFrameAvailableSink.setListener(iAudioFrameAvailableListener);
                        if (LiveStream.this.mAudioTrack != null) {
                            LiveStream.this.mAudioTrack.addAudioSink(LiveStream.this.mAudioFrameAvailableSink);
                        }
                        if (LiveStream.this.mAudioCapture != null) {
                            LiveStream.this.mAudioCapture.resume();
                        }
                    }
                }
            });
        }
    }

    public void setAudioMute(boolean z) {
        if (this.mAudioCapture != null) {
            this.mAudioCapture.mute(z);
        }
    }

    public void setBackGroundPhotoPath(Object obj) {
        if (this.mVideoCapturer != null) {
            this.mVideoCapturer.setBackGroundPhotoPath(obj);
        }
    }

    public void setDns(final C45914d dVar) {
        if (this.mWorkThreadHandler != null) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    boolean z;
                    LiveStream.this.mDns = dVar;
                    LiveStream liveStream = LiveStream.this;
                    if (LiveStream.this.mDns != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    liveStream.mDnsOptOpen = z;
                    LiveStream.this.mOptUrlMap = new HashMap<>();
                }
            });
        }
    }

    public void setTextureFrameAvailableListener(final ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        if (this.mWorkThreadHandler != null) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    if (LiveStream.this.mStatus.get() != 7) {
                        if (iTextureFrameAvailableListener == null) {
                            if (LiveStream.this.mTextureFrameAvailableSink != null) {
                                LiveStream.this.mTextureFrameAvailableSink.setListener(null);
                            }
                            return;
                        }
                        if (LiveStream.this.mTextureFrameAvailableSink == null) {
                            LiveStream.this.mTextureFrameAvailableSink = new TextureFrameAvailableSink(LiveStream.this.mLiveStreamBuilder.getVideoWidth(), LiveStream.this.mLiveStreamBuilder.getVideoHeight());
                        }
                        LiveStream.this.mTextureFrameAvailableSink.setListener(iTextureFrameAvailableListener);
                        if (LiveStream.this.mVideoTrack != null) {
                            LiveStream.this.mVideoTrack.addVideoSink(LiveStream.this.mTextureFrameAvailableSink);
                        }
                    }
                }
            });
        }
    }

    public void setTimeInterval(int i) {
        if (this.mMediaEncodeStream != null) {
            this.mMediaEncodeStream.setEstimateTimeInterval(i);
        }
    }

    public long getInt64Value(int i) {
        if (i == 1 && this.mRTMPTransport != null) {
            return this.mRTMPTransport.getInt64Value(i);
        }
        return 0;
    }

    public void setAudioRecordMode(int i) {
        LiveStreamAudioCapture liveStreamAudioCapture;
        this.mAudioRecordMode = i;
        if (this.mAudioCapture == null || !(this.mAudioCapture instanceof LiveStreamAudioCapture)) {
            liveStreamAudioCapture = null;
        } else {
            liveStreamAudioCapture = (LiveStreamAudioCapture) this.mAudioCapture;
        }
        if (liveStreamAudioCapture != null) {
            liveStreamAudioCapture.setMode(i);
        }
    }

    public void setOption(LiveStreamOption liveStreamOption) {
        final TEBundle opt = liveStreamOption.getOpt();
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    if (LiveStream.this.mMediaEncodeStream != null) {
                        LiveStream.this.mMediaEncodeStream.setParameter(opt);
                    }
                }
            });
        }
    }

    public void setRenderSink(final VideoSink videoSink) {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    VideoSink videoSink = videoSink;
                    if (!(LiveStream.this.mVideoTrack == null || LiveStream.this.mRenderView == null)) {
                        LiveStream.this.mVideoTrack.removeVideoSink(LiveStream.this.mRenderView);
                        LiveStream.this.mRenderView.release();
                        LiveStream.this.mRenderView = null;
                    }
                    if (LiveStream.this.mRenderView != null) {
                        LiveStream.this.mRenderView.release();
                        LiveStream.this.mRenderView = null;
                    }
                    LiveStream.this.mRenderView = videoSink;
                    if (LiveStream.this.mVideoTrack != null && LiveStream.this.mRenderView != null) {
                        LiveStream.this.mVideoTrack.addVideoSink(LiveStream.this.mRenderView);
                    }
                }
            });
        }
    }

    public void setVideoMixBgColor(int i) {
        this.mVideoMixBgColor = i;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            VideoMixer videoMixer = mediaEncodeStream.getVideoMixer();
            if (videoMixer != null) {
                TEBundle tEBundle = new TEBundle();
                videoMixer.getParameter(tEBundle);
                tEBundle.setInt("vmixer_bg_color", i);
                videoMixer.setParameter(tEBundle);
            }
        }
    }

    public void switchAudioCapture(int i) {
        if (this.mAudioCapture != null && (this.mAudioCapture instanceof LiveStreamAudioCapture)) {
            ((LiveStreamAudioCapture) this.mAudioCapture).switchSource(i);
        }
    }

    public void switchVideoCapture(final int i) {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    LiveStreamBuilder liveStreamBuilder = LiveStream.this.mLiveStreamBuilder;
                    if (LiveStream.this.mStatus.get() != 7 && liveStreamBuilder != null) {
                        liveStreamBuilder.setVideoCaptureDevice(i);
                        if (LiveStream.this.mVideoCapturer != null) {
                            if (LiveStream.this.mFilterManager != null && (LiveStream.this.mFilterManager instanceof FilterManager) && (i == 3 || i == 0)) {
                                LiveStream.this.mFilterManager.enable(false);
                            }
                            StringBuilder sb = new StringBuilder("Switch video capture to ");
                            sb.append(i);
                            AVLog.ioi("LiveStream", sb.toString());
                            LiveStream.this.mVideoCapturer.switchVideoCaptureDevice(i, liveStreamBuilder.getScreenCaptureIntent());
                            return;
                        }
                        AVLog.ioe("LiveStream", "Maybe video capture already to stopped.");
                        LiveStream.this.mErrorListener.onError(2, 0, new Exception("Maybe video capture already to stopped."));
                    }
                }
            });
        }
    }

    public void start(String str) {
        if (this.mStatus.get() != 7) {
            this.mUri = str;
            StringBuilder sb = new StringBuilder("Try to start live stream with ");
            sb.append(str);
            AVLog.ioi("LiveStream", sb.toString());
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    LiveStream.this.doStart();
                    LiveStream.this.mStreamLogService.reset();
                    LiveStream.this.mStreamLogService.start();
                }
            });
            return;
        }
        AVLog.ioe("LiveStream", "Try to start live stream while mStatus is STATUS_END");
    }

    private String getStackTrack(String str) {
        StackTraceElement[] stackTrace;
        String str2 = "\n";
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append("    at ");
            sb.append(stackTraceElement.getClassName());
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(stackTraceElement.getMethodName());
            sb.append("(");
            sb.append(stackTraceElement.getFileName());
            sb.append(" :");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")\n");
            str2 = sb.toString();
        }
        return str2;
    }

    private void removeStreamsFromEncodeStream(boolean z) {
        MediaTrack mediaTrack;
        MediaTrack mediaTrack2;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            if (z) {
                synchronized (this.mInputStreamListFence) {
                    Iterator it = this.mInputVideoStreams.iterator();
                    while (it.hasNext()) {
                        IInputVideoStream iInputVideoStream = (IInputVideoStream) it.next();
                        if (iInputVideoStream instanceof InputVideoStream) {
                            mediaTrack2 = ((InputVideoStream) iInputVideoStream).getVideoTrack();
                        } else {
                            mediaTrack2 = null;
                        }
                        if (mediaTrack2 != null) {
                            mediaEncodeStream.removeTrack(mediaTrack2);
                        }
                    }
                }
                return;
            }
            synchronized (this.mInputStreamListFence) {
                Iterator it2 = this.mInputAudioStreams.iterator();
                while (it2.hasNext()) {
                    IInputAudioStream iInputAudioStream = (IInputAudioStream) it2.next();
                    if (iInputAudioStream instanceof InputAudioStream) {
                        mediaTrack = ((InputAudioStream) iInputAudioStream).getAudioTrack();
                    } else if (iInputAudioStream instanceof EffectInputAudioStream) {
                        mediaTrack = ((EffectInputAudioStream) iInputAudioStream).getAudioTrack();
                    } else {
                        mediaTrack = null;
                    }
                    if (mediaTrack != null) {
                        mediaEncodeStream.removeTrack(mediaTrack);
                    }
                }
            }
        }
    }

    public boolean getLiveStreamInfo(LiveStreamReport liveStreamReport) {
        boolean z;
        try {
            z = this.mReportFence.readLock().tryLock(100, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (!z) {
            AVLog.m143700w("LiveStream", "Maybe be stream will be release.");
            return false;
        }
        liveStreamReport.clear();
        liveStreamReport.setTransportAdjustBps(this.mAdjustBitrate);
        if (this.mMediaEncodeStream != null) {
            this.mMediaEncodeStream.getStaticsReport(liveStreamReport);
            liveStreamReport.setAudioMixerCostTimePerFrameMs((double) this.mMediaEncodeStream.getAudioMixer().getAvgCostTimePerFrameMs());
            liveStreamReport.setVideoMixerCostTimePerFrameMs((double) this.mMediaEncodeStream.getVideoMixer().getAvgCostTimePerFrameMs());
        }
        if (this.mVideoTrack != null) {
            this.mVideoTrack.getStaticsReport(liveStreamReport);
        }
        if (this.mAudioTrack != null) {
            this.mAudioTrack.getStaticsReport(liveStreamReport);
        }
        if (this.mVideoCapturer != null) {
            this.mVideoCapturer.getStaticsReport(liveStreamReport);
        }
        if (this.mRTMPTransport != null) {
            this.mRTMPTransport.getStaticsReport(liveStreamReport);
        }
        this.mReportFence.readLock().unlock();
        return true;
    }

    public void start(List<String> list) {
        if (this.mStatus.get() != 7) {
            this.mUris = list;
            StringBuilder sb = new StringBuilder("Try to start live stream with ");
            sb.append(list);
            AVLog.ioi("LiveStream", sb.toString());
            int i = 0;
            while (i < this.mUris.size()) {
                if (((String) this.mUris.get(i)).isEmpty()) {
                    this.mUris.remove(i);
                } else {
                    i++;
                }
            }
            if (!this.mUris.isEmpty()) {
                this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        LiveStream.this.mStreamLogService.reset();
                        LiveStream.this.mStreamLogService.start();
                        LiveStream.this.doStart();
                    }
                });
            }
        }
    }

    public void startRecorder(final String str) {
        boolean z;
        if (this.mStatus.get() != 7) {
            z = this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    if (LiveStream.this.mMediaEncodeStream != null) {
                        LiveStream.this.mMediaEncodeStream.startRecord(str);
                        return;
                    }
                    IRecorderManager externRecordMgr = LiveStream.this.mRecorderManager.getExternRecordMgr();
                    if (externRecordMgr instanceof SharedEncoderRecorder) {
                        ((SharedEncoderRecorder) externRecordMgr).onEvent(11, 0, 0, "EncodeStream is null, maybe publish no start.");
                    }
                }
            });
        } else {
            z = false;
        }
        RecorderManager recorderManager = this.mRecorderManager;
        if (!z && recorderManager != null) {
            IRecorderManager externRecordMgr = recorderManager.getExternRecordMgr();
            if (externRecordMgr instanceof SharedEncoderRecorder) {
                SharedEncoderRecorder sharedEncoderRecorder = (SharedEncoderRecorder) externRecordMgr;
                StringBuilder sb = new StringBuilder("Publiser status exception(");
                sb.append(this.mStatus);
                sb.append(")");
                sharedEncoderRecorder.onEvent(11, 0, 0, sb.toString());
            }
        }
    }

    private void addStreamsToEncodeStream(boolean z) {
        MediaTrack mediaTrack;
        MediaTrack mediaTrack2;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            if (z) {
                synchronized (this.mInputStreamListFence) {
                    Iterator it = this.mInputVideoStreams.iterator();
                    while (it.hasNext()) {
                        IInputVideoStream iInputVideoStream = (IInputVideoStream) it.next();
                        if (iInputVideoStream instanceof InputVideoStream) {
                            mediaTrack2 = ((InputVideoStream) iInputVideoStream).getVideoTrack();
                        } else {
                            mediaTrack2 = null;
                        }
                        if (mediaTrack2 != null) {
                            mediaEncodeStream.addTrack(mediaTrack2);
                            mediaEncodeStream.setVideoMixerDescription(iInputVideoStream.name(), iInputVideoStream.getMixerDescription());
                        }
                    }
                }
                return;
            }
            synchronized (this.mInputStreamListFence) {
                Iterator it2 = this.mInputAudioStreams.iterator();
                while (it2.hasNext()) {
                    IInputAudioStream iInputAudioStream = (IInputAudioStream) it2.next();
                    if (iInputAudioStream instanceof InputAudioStream) {
                        mediaTrack = ((InputAudioStream) iInputAudioStream).getAudioTrack();
                    } else if (iInputAudioStream instanceof EffectInputAudioStream) {
                        mediaTrack = ((EffectInputAudioStream) iInputAudioStream).getAudioTrack();
                    } else {
                        mediaTrack = null;
                    }
                    if (mediaTrack != null) {
                        mediaEncodeStream.addTrack(mediaTrack);
                        mediaEncodeStream.setAudioMixerDescription(iInputAudioStream.name(), iInputAudioStream.getMixerDescription());
                    }
                }
            }
        }
    }

    private void adjustParameters(LiveStreamBuilder liveStreamBuilder) {
        int videoMaxBitrate = liveStreamBuilder.getVideoMaxBitrate();
        int videoMinBitrate = liveStreamBuilder.getVideoMinBitrate();
        int videoBitrate = liveStreamBuilder.getVideoBitrate();
        if (videoMaxBitrate < videoBitrate) {
            videoMaxBitrate = (videoBitrate * 5) / 3;
        }
        if (videoMinBitrate <= 0 || videoMinBitrate > videoBitrate) {
            videoMinBitrate = (videoBitrate * 2) / 5;
        }
        this.mLiveStreamBuilder.setVideoMaxBitrate(videoMaxBitrate);
        this.mLiveStreamBuilder.setVideoMinBitrate(videoMinBitrate);
        getVideoGop();
        int videoWidth = liveStreamBuilder.getVideoWidth();
        int videoHeight = liveStreamBuilder.getVideoHeight();
        int align = align(videoWidth, 16);
        int align2 = align(videoHeight, 16);
        this.mLiveStreamBuilder.setVideoWidth(align);
        this.mLiveStreamBuilder.setVideoHeight(align2);
        this.mAdjustBitrate = (long) this.mLiveStreamBuilder.getVideoBitrate();
        int vsyncModuleMaxIntevalOnNowMs = this.mLiveStreamBuilder.getVsyncModuleMaxIntevalOnNowMs();
        if (this.mLiveStreamBuilder.getVsyncModuleMaxIntevalOnFrameMs() < 300) {
            this.mLiveStreamBuilder.setVsyncModuleMaxIntevalOnFrameMs(C34943c.f91128x);
        }
        if (vsyncModuleMaxIntevalOnNowMs < 300) {
            this.mLiveStreamBuilder.setVsyncModuleMaxIntevalOnNowMs(C34943c.f91128x);
        }
        int videoMixerOutWidth = this.mLiveStreamBuilder.getVideoMixerOutWidth();
        int videoMixerOutHeight = this.mLiveStreamBuilder.getVideoMixerOutHeight();
        if (videoMixerOutWidth <= 0 || videoMixerOutHeight <= 0) {
            videoMixerOutWidth = this.mLiveStreamBuilder.getVideoWidth();
            videoMixerOutHeight = this.mLiveStreamBuilder.getVideoHeight();
        }
        int align3 = align(videoMixerOutWidth, 16);
        int align4 = align(videoMixerOutHeight, 16);
        this.mLiveStreamBuilder.setVideoMixerOutWidth(align3);
        this.mLiveStreamBuilder.setVideoMixerOutHeight(align4);
    }

    public void setStreamUniqueIdentifier(String str, AtomicInteger atomicInteger) {
        this.mStreamUuid = str;
        this.mPushCount = atomicInteger;
    }

    private int align(int i, int i2) {
        if (i2 <= 0) {
            return i;
        }
        return (((i + i2) - 1) / i2) * i2;
    }

    public void enableMirror(final boolean z, final boolean z2) {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                if (LiveStream.this.mVideoCapturer != null) {
                    LiveStream.this.mVideoCapturer.enableMirror(z, z2);
                }
            }
        });
    }

    public void enableMixer(boolean z, boolean z2) {
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            if (z) {
                mediaEncodeStream.getAudioMixer().setEnable(z2);
            } else {
                mediaEncodeStream.getVideoMixer().setEnable(z2);
            }
        }
        if (z) {
            this.mAudioMixer = z2;
        } else {
            this.mVideoMixer = z2;
        }
    }

    public void onAudioCaptureError(final int i, final Exception exc) {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    StringBuilder sb = new StringBuilder("onAudioCaptureError: code ");
                    sb.append(i);
                    sb.append(", message ");
                    sb.append(exc.toString());
                    AVLog.ioe("LiveStream", sb.toString());
                    LiveStream.this.mStatus.set(8);
                    LiveStream.this.mErrorListener.onError(3, i, exc);
                }
            });
        }
    }

    public void onVideoCaptureError(final int i, final Exception exc) {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                public void run() {
                    StringBuilder sb = new StringBuilder("onVideoCaptureError: code ");
                    sb.append(i);
                    sb.append(", message ");
                    sb.append(exc.toString());
                    AVLog.ioe("LiveStream", sb.toString());
                    LiveStream.this.mStatus.set(8);
                    LiveStream.this.mErrorListener.onError(2, i, exc);
                }
            });
        }
    }

    private void disableVideoEncoder(String str, boolean z) {
        if (this.mAvailableVideoEncoders != null) {
            for (int i = 0; i < this.mAvailableVideoEncoders.length; i++) {
                String str2 = this.mAvailableVideoEncoders[i];
                StringBuilder sb = new StringBuilder("video_type=");
                sb.append(str);
                if (str2.contains(sb.toString()) && z == this.mAvailableVideoEncoders[i].contains("video_enable_accelera=true")) {
                    this.mAvailableVideoEncoders[i] = "";
                }
            }
        }
    }

    public void catchVideo(Bundle bundle, CatchVideoCallback catchVideoCallback) {
        if (this.mMediaEngineFactory == null || this.mFilterManager == null || !(this.mFilterManager instanceof FilterManager)) {
            if (catchVideoCallback != null) {
                catchVideoCallback.onError(-2, "FilterManager is not ready.");
            }
            return;
        }
        bundle.putInt("width", this.mLiveStreamBuilder.getVideoWidth());
        bundle.putInt("height", this.mLiveStreamBuilder.getVideoHeight());
        bundle.putInt("fps", this.mLiveStreamBuilder.getVideoFps());
        ((FilterManager) this.mFilterManager).catchVideo(this.mMediaEngineFactory, bundle, catchVideoCallback);
    }

    public static void dumpJavaThreadStackIfNeed(Thread thread, String str) {
        StackTraceElement[] stackTrace;
        if (thread != null) {
            StringBuilder sb = new StringBuilder("{status:");
            sb.append(thread.getState());
            sb.append(",id:");
            sb.append(thread.getId());
            sb.append(",name:");
            sb.append(thread.getName());
            sb.append("}");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(".ANR");
            String sb4 = sb3.toString();
            AVLog.iow(sb4, sb2);
            try {
                for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                    StringBuilder sb5 = new StringBuilder("    at ");
                    sb5.append(stackTraceElement.getClassName());
                    sb5.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb5.append(stackTraceElement.getMethodName());
                    sb5.append("(");
                    sb5.append(stackTraceElement.getFileName());
                    sb5.append(" :");
                    sb5.append(stackTraceElement.getLineNumber());
                    sb5.append(")");
                    AVLog.iow(sb4, sb5.toString());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a A[LOOP:0: B:5:0x001b->B:18:0x003a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String[] getOptUrlAndEvaluateSymbol(com.p280ss.optimizer.live.sdk.dns.C45914d r13, java.lang.String r14) {
        /*
            r12 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r0 = r14.toLowerCase(r0)
            java.lang.String r1 = "//"
            int r1 = r0.indexOf(r1)
            r2 = 2
            r3 = -1
            r4 = 0
            if (r1 == r3) goto L_0x0013
            int r1 = r1 + r2
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            int r5 = r0.length()
            r8 = r1
            r6 = -1
            r7 = 0
        L_0x001b:
            r9 = 1
            if (r1 >= r5) goto L_0x003d
            char r10 = r0.charAt(r1)
            r11 = 35
            if (r10 == r11) goto L_0x0037
            r11 = 47
            if (r10 == r11) goto L_0x0037
            r11 = 58
            if (r10 == r11) goto L_0x0035
            switch(r10) {
                case 63: goto L_0x0037;
                case 64: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0038
        L_0x0032:
            int r8 = r1 + 1
            goto L_0x0038
        L_0x0035:
            r6 = r1
            goto L_0x0038
        L_0x0037:
            r7 = 1
        L_0x0038:
            if (r7 != 0) goto L_0x003d
            int r1 = r1 + 1
            goto L_0x001b
        L_0x003d:
            if (r6 != r3) goto L_0x0040
            r6 = r1
        L_0x0040:
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r2 = r14.substring(r8, r6)
            java.lang.String r3 = com.p280ss.optimizer.live.sdk.dns.C45912b.m144016a(r2, r13)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x0093
            java.lang.String r13 = r13.mo111181a(r2, r3)
            r0[r9] = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = r14.substring(r4, r8)
            r13.append(r2)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
            if (r6 >= r1) goto L_0x007e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            java.lang.String r13 = r14.substring(r6, r1)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
        L_0x007e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            java.lang.String r13 = r14.substring(r1)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r0[r4] = r13
        L_0x0093:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.LiveStream.getOptUrlAndEvaluateSymbol(com.ss.optimizer.live.sdk.dns.d, java.lang.String):java.lang.String[]");
    }

    protected LiveStream(LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2) {
        this(liveStreamBuilder, handler, handler2, null, null);
    }

    public int addSeiField(String str, Object obj, int i) {
        if (this.mRTMPTransport != null) {
            return this.mRTMPTransport.addSeiField(str, obj, i);
        }
        return -1;
    }

    public void onAVFrameSyncError(int i, int i2, long j) {
        if (i == 8) {
            long j2 = ((long) i2) + j;
            StringBuilder sb = new StringBuilder("avSync error before encoding: audio timestamp ");
            sb.append(j2);
            sb.append(", video timestamp ");
            sb.append(j);
            AVLog.ioe("LiveStream", sb.toString());
        }
    }

    public void onEncodeCreateEvent(int i, int i2, long j) {
        if (this.mEncodeStreamOpt == null) {
            AVLog.iow("LiveStream", "Opt is null and maybe encoder already release.");
            return;
        }
        boolean z = false;
        if (i == 4) {
            String string = this.mEncodeStreamOpt.getString("audio_type");
            StringBuilder sb = new StringBuilder("Audio encoder(");
            sb.append(string);
            sb.append(") created failed");
            String sb2 = sb.toString();
            AVLog.ioe("LiveStream", sb2);
            this.mErrorListener.onError(6, 0, new Exception(sb2));
            return;
        }
        if (i == 2) {
            String string2 = this.mEncodeStreamOpt.getString("video_type");
            String string3 = this.mEncodeStreamOpt.getString("video_type");
            if (this.mMediaEncodeStream != null) {
                int i3 = 1;
                if (this.mLiveStreamBuilder.getVideoEncoder() == 1) {
                    boolean bool = this.mEncodeStreamOpt.getBool("video_enable_accelera");
                    int videoProfile = this.mLiveStreamBuilder.getVideoProfile();
                    this.mEncodeStreamOpt.getInt("video_profileLevel");
                    int resolutionLevel = getResolutionLevel(this.mLiveStreamBuilder.getVideoWidth(), this.mLiveStreamBuilder.getVideoHeight());
                    if (bool) {
                        int i4 = 3;
                        if (videoProfile == 1) {
                            string3 = "video/x264";
                            switch (resolutionLevel) {
                                case 2:
                                case 3:
                                case 4:
                                    break;
                            }
                        } else if (resolutionLevel != 4) {
                            string3 = "video/x264";
                        } else {
                            z = bool;
                            i4 = 1;
                            StringBuilder sb3 = new StringBuilder("Video encoder switch to ");
                            sb3.append(string3);
                            sb3.append(", hardware ");
                            sb3.append(z);
                            sb3.append(", profile ");
                            sb3.append(i4);
                            AVLog.iow("LiveStream", sb3.toString());
                            this.mEncodeStreamOpt.setString("video_type", string3);
                            this.mEncodeStreamOpt.setBool("video_enable_accelera", z);
                            this.mEncodeStreamOpt.setInt("video_profileLevel", i4);
                            this.mEncodeStreamOpt.setInt("roi_on", this.mLiveStreamBuilder.getRoiOn(z));
                            this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
                            this.mLiveStreamBuilder.setEnableVideoEncodeAccelera(z);
                            this.mLiveStreamBuilder.setVideoProfile(i3);
                            if (!(this.mRTMPTransport == null || this.mTransportOpt == null)) {
                                this.mTransportOpt.setString("video_type", string3);
                                this.mTransportOpt.setBool("video_enable_accelera", z);
                                this.mTransportOpt.setInt("video_profileLevel", i4);
                                this.mRTMPTransport.setParameter(this.mTransportOpt);
                            }
                            this.mInfoListener.onInfo(16, i, i2);
                            return;
                        }
                        i3 = 3;
                        StringBuilder sb32 = new StringBuilder("Video encoder switch to ");
                        sb32.append(string3);
                        sb32.append(", hardware ");
                        sb32.append(z);
                        sb32.append(", profile ");
                        sb32.append(i4);
                        AVLog.iow("LiveStream", sb32.toString());
                        this.mEncodeStreamOpt.setString("video_type", string3);
                        this.mEncodeStreamOpt.setBool("video_enable_accelera", z);
                        this.mEncodeStreamOpt.setInt("video_profileLevel", i4);
                        this.mEncodeStreamOpt.setInt("roi_on", this.mLiveStreamBuilder.getRoiOn(z));
                        this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
                        this.mLiveStreamBuilder.setEnableVideoEncodeAccelera(z);
                        this.mLiveStreamBuilder.setVideoProfile(i3);
                        this.mTransportOpt.setString("video_type", string3);
                        this.mTransportOpt.setBool("video_enable_accelera", z);
                        this.mTransportOpt.setInt("video_profileLevel", i4);
                        this.mRTMPTransport.setParameter(this.mTransportOpt);
                        this.mInfoListener.onInfo(16, i, i2);
                        return;
                    }
                } else {
                    if (this.mLiveStreamBuilder.getVideoProfile() == 1) {
                        disableVideoEncoder(string3, this.mLiveStreamBuilder.isEnableVideoEncodeAccelera());
                        string3 = chooseVideoEncode();
                    } else {
                        this.mLiveStreamBuilder.setVideoProfile(1);
                    }
                    if (string3 != null && !string3.isEmpty()) {
                        boolean isEnableVideoEncodeAccelera = this.mLiveStreamBuilder.isEnableVideoEncodeAccelera();
                        int chooseProfileLevel = chooseProfileLevel();
                        StringBuilder sb4 = new StringBuilder("Video encoder switch to ");
                        sb4.append(string3);
                        sb4.append(", hardware ");
                        sb4.append(isEnableVideoEncodeAccelera);
                        sb4.append(", profile ");
                        sb4.append(chooseProfileLevel);
                        AVLog.iow("LiveStream", sb4.toString());
                        this.mEncodeStreamOpt.setString("video_type", string3);
                        this.mEncodeStreamOpt.setBool("video_enable_accelera", isEnableVideoEncodeAccelera);
                        this.mEncodeStreamOpt.setInt("video_profileLevel", chooseProfileLevel);
                        this.mEncodeStreamOpt.setInt("roi_on", this.mLiveStreamBuilder.getRoiOn(isEnableVideoEncodeAccelera));
                        this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
                        if (!(this.mRTMPTransport == null || this.mTransportOpt == null)) {
                            this.mTransportOpt.setString("video_type", string3);
                            this.mTransportOpt.setBool("video_enable_accelera", isEnableVideoEncodeAccelera);
                            this.mTransportOpt.setInt("video_profileLevel", chooseProfileLevel);
                            this.mRTMPTransport.setParameter(this.mTransportOpt);
                        }
                        this.mInfoListener.onInfo(16, i, i2);
                        return;
                    }
                }
            }
            StringBuilder sb5 = new StringBuilder("Video encoder(");
            sb5.append(string2);
            sb5.append(") created failed");
            String sb6 = sb5.toString();
            AVLog.ioe("LiveStream", sb6);
            this.mErrorListener.onError(5, 0, new Exception(sb6));
        }
    }

    public void onRtmpFailed(int i, int i2, long j) {
        if (this.mStatus.get() != 8) {
            LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
            if (liveStreamBuilder != null) {
                destroyEncodeStream();
                this.mWorkThreadHandler.removeCallbacks(this.rtmpReconnectRunnable);
                boolean z = true;
                if (isUsingOptimizedUrl()) {
                    if (this.mOptUrlReachable != 1) {
                        this.mOptUrlReachable = 0;
                    }
                } else if (this.mUriReachable != 1) {
                    this.mUriReachable = 0;
                }
                if (this.mUri == null) {
                    if (this.mUris != null) {
                        if (isUsingOptimizedUrl()) {
                            if (this.mOptUrlReachable == 0 || this.mRtmpReConnectCounts >= (liveStreamBuilder.getRtmpReconnectCounts() + 1) / 2) {
                                invalidateOptimizedUrl();
                            }
                            this.mWorkThreadHandler.postDelayed(this.rtmpReconnectRunnable, (long) (liveStreamBuilder.getRtmpReconnectIntervalSeconds() * 1000));
                        } else if ((this.mUris.size() <= 1 || this.mUriReachable != 0) && this.mRtmpReConnectCounts < liveStreamBuilder.getRtmpReconnectCounts()) {
                            this.mWorkThreadHandler.postDelayed(this.rtmpReconnectRunnable, (long) (liveStreamBuilder.getRtmpReconnectIntervalSeconds() * 1000));
                        } else if (this.mUris.size() <= 1) {
                            this.mErrorListener.onError(4, i, new Exception("Rtmp connection fail"));
                            AVLog.ioe("LiveStream", "Rtmp connecting failed too many times and no more available urls.");
                            doStop();
                        } else {
                            this.mUris.remove(0);
                            this.mUriReachable = -1;
                            this.mOptUrlReachable = -1;
                            this.mFirstConnect = true;
                            this.mRtmpReConnectCounts = -1;
                            if (this.mDns == null) {
                                z = false;
                            }
                            this.mDnsOptOpen = z;
                            this.mDnsOptHit = false;
                            this.mEvaluatorSymbol = "";
                            this.mWorkThreadHandler.postDelayed(this.rtmpReconnectRunnable, (long) (liveStreamBuilder.getRtmpReconnectIntervalSeconds() * 1000));
                            StringBuilder sb = new StringBuilder("Switched to next url: ");
                            sb.append(getLiveStreamUrl());
                            AVLog.iow("LiveStream", sb.toString());
                        }
                    }
                } else if (isUsingOptimizedUrl()) {
                    if (this.mOptUrlReachable == 0 || this.mRtmpReConnectCounts >= (liveStreamBuilder.getRtmpReconnectCounts() + 1) / 2) {
                        invalidateOptimizedUrl();
                    }
                    this.mWorkThreadHandler.postDelayed(this.rtmpReconnectRunnable, (long) (liveStreamBuilder.getRtmpReconnectIntervalSeconds() * 1000));
                } else if (this.mRtmpReConnectCounts < liveStreamBuilder.getRtmpReconnectCounts()) {
                    this.mWorkThreadHandler.postDelayed(this.rtmpReconnectRunnable, (long) (liveStreamBuilder.getRtmpReconnectIntervalSeconds() * 1000));
                } else {
                    AVLog.ioe("LiveStream", "Rtmp connecting failed too many times");
                    this.mErrorListener.onError(4, i, new Exception("Rtmp connection fail"));
                    doStop();
                }
            }
        }
    }

    protected LiveStream(LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule) {
        this(liveStreamBuilder, handler, handler2, audioDeviceModule, null);
    }

    public void onRecorderEvent(int i, int i2, long j, String str) {
        IRecorderManager iRecorderManager;
        if (this.mRecorderManager != null) {
            iRecorderManager = this.mRecorderManager.getExternRecordMgr();
        } else {
            iRecorderManager = null;
        }
        if (iRecorderManager != null && (iRecorderManager instanceof SharedEncoderRecorder)) {
            ((SharedEncoderRecorder) iRecorderManager).onEvent(i, i2, j, str);
        }
    }

    public void onMediaEncodeStreamEvent(int i, int i2, long j, String str) {
        if (this.mStatus.get() != 7 && this.mStatus.get() != 8) {
            Handler handler = this.mWorkThreadHandler;
            final int i3 = i;
            final int i4 = i2;
            final long j2 = j;
            final String str2 = str;
            C4552229 r1 = new Runnable() {
                public void run() {
                    switch (i3) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            LiveStream.this.onEncodeCreateEvent(i3, i4, j2);
                            return;
                        case 5:
                        case 6:
                            LiveStream.this.onEncodeFormatChanged(i3, i4, j2, str2);
                            return;
                        case 7:
                            return;
                        case 8:
                            LiveStream.this.onAVFrameSyncError(i3, i4, j2);
                            return;
                        case 9:
                        case 10:
                        case 11:
                            LiveStream.this.onRecorderEvent(i3, i4, j2, str2);
                            break;
                    }
                }
            };
            handler.post(r1);
        }
    }

    public void onTransportEvent(int i, int i2, long j, String str) {
        if (this.mStatus.get() != 7 && this.mStatus.get() != 8) {
            Handler handler = this.mWorkThreadHandler;
            final int i3 = i;
            final int i4 = i2;
            final long j2 = j;
            final String str2 = str;
            C4552128 r1 = new Runnable() {
                public void run() {
                    long j;
                    long j2;
                    long j3;
                    if (LiveStream.this.mStatus.get() != 7 && LiveStream.this.mStatus.get() != 8) {
                        String str = "";
                        long j4 = -1;
                        boolean z = false;
                        switch (i3) {
                            case 0:
                                AVLog.ioi("LiveStream", "Rtmp start connecting");
                                LiveStream.this.mInfoListener.onInfo(10, 0, 0);
                                LiveStream.this.mStreamLogService.onRTMPConnecting();
                                return;
                            case 1:
                                LiveStream.this.mInfoListener.onInfo(11, 0, 0);
                                if (LiveStream.this.mRTMPTransport != null) {
                                    str = LiveStream.this.mRTMPTransport.getRemoteIP();
                                    j4 = LiveStream.this.mRTMPTransport.getInt64Value(2);
                                }
                                String str2 = str;
                                long j5 = j4;
                                StringBuilder sb = new StringBuilder("Rtmp connected: reconnect counts ");
                                sb.append(LiveStream.this.mRtmpReConnectCounts);
                                sb.append(", first connect ");
                                sb.append(LiveStream.this.mFirstConnect);
                                sb.append(", remote ip ");
                                sb.append(str2);
                                sb.append(", dns time ");
                                sb.append(j5);
                                AVLog.ioi("LiveStream", sb.toString());
                                LiveStream.this.mStreamLogService.onRTMPEnd(C34943c.f91127w, LiveStream.this.mRtmpReConnectCounts, LiveStream.this.mFirstConnect, str2, j5);
                                LiveStream.this.onRtmpConncted();
                                return;
                            case 2:
                                StringBuilder sb2 = new StringBuilder("Rtmp send too slow: send delay ");
                                sb2.append(i4);
                                AVLog.ioi("LiveStream", sb2.toString());
                                LiveStream.this.mInfoListener.onInfo(13, i4, 0);
                                LiveStream.this.mStreamLogService.onSendPktSlow(i4);
                                LiveStream.this.onRtmpSendTooSlow();
                                return;
                            case 3:
                                if (LiveStream.this.mRtmpReConnectCounts >= LiveStream.this.mLiveStreamBuilder.getRtmpReconnectCounts()) {
                                    if (LiveStream.this.mRTMPTransport != null) {
                                        str = LiveStream.this.mRTMPTransport.getRemoteIP();
                                        j4 = LiveStream.this.mRTMPTransport.getInt64Value(2);
                                    }
                                    LiveStream.this.mStreamLogService.onRTMPEnd(i4, LiveStream.this.mRtmpReConnectCounts, LiveStream.this.mFirstConnect, str, j4);
                                }
                                StringBuilder sb3 = new StringBuilder("Rtmp connecting failed: reconnect counts ");
                                sb3.append(LiveStream.this.mRtmpReConnectCounts);
                                sb3.append(", first connect ");
                                sb3.append(LiveStream.this.mFirstConnect);
                                AVLog.ioe("LiveStream", sb3.toString());
                                LiveStream.this.onRtmpFailed(i3, i4, j2);
                                return;
                            case 4:
                                long j6 = (long) i4;
                                long j7 = j2;
                                long j8 = j6 + j7;
                                VsyncModule vsyncModule = null;
                                MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
                                if (mediaEncodeStream != null) {
                                    vsyncModule = mediaEncodeStream.getVsyncModule();
                                }
                                long j9 = 0;
                                if (vsyncModule != null) {
                                    long firstFrameTimestampMs = vsyncModule.getFirstFrameTimestampMs(LiveStream.this.getOriginInputVideoStream().name());
                                    long firstFrameTimestampMs2 = vsyncModule.getFirstFrameTimestampMs(LiveStream.this.getOriginInputAudioStream().name());
                                    long lastTimeMills = vsyncModule.lastTimeMills(LiveStream.this.getOriginInputVideoStream().name());
                                    j = vsyncModule.getMaxIntevalMs(LiveStream.this.getOriginInputVideoStream().name());
                                    long j10 = firstFrameTimestampMs;
                                    j9 = lastTimeMills;
                                    j2 = firstFrameTimestampMs2;
                                    j3 = j10;
                                } else {
                                    j3 = 0;
                                    j2 = 0;
                                    j = 0;
                                }
                                if (LiveStream.this.mVideoCapturer != null) {
                                    z = LiveStream.this.mVideoCapturer.backgroundMode();
                                }
                                long j11 = j2;
                                long nowNanos = VsyncModule.nowNanos() / 1000000;
                                StringBuilder sb4 = new StringBuilder("avSync error: audio pts ");
                                sb4.append(j8);
                                sb4.append(", video pts ");
                                sb4.append(j7);
                                sb4.append(" last vpts ");
                                sb4.append(j9);
                                sb4.append(" video maxFI ");
                                sb4.append(j);
                                sb4.append(" bgm ");
                                sb4.append(z);
                                sb4.append(" CurrTimeMs ");
                                sb4.append(nowNanos);
                                sb4.append(" vFirst ");
                                sb4.append(j3);
                                sb4.append(" aFirst ");
                                sb4.append(j11);
                                String sb5 = sb4.toString();
                                AVLog.ioe("LiveStream", sb5);
                                LiveStream.this.mStreamLogService.onPushStreamFail(i4, sb5);
                                LiveStream.this.onRtmpFailed(i3, i4, j2);
                                return;
                            case 5:
                                StringBuilder sb6 = new StringBuilder("interleave fail: error code ");
                                sb6.append(i4);
                                AVLog.ioe("LiveStream", sb6.toString());
                                LiveStream.this.mStreamLogService.onPushStreamFail(i4, "interleave fail");
                                LiveStream.this.onRtmpFailed(i3, i4, j2);
                                return;
                            case 6:
                                StringBuilder sb7 = new StringBuilder("Rtmp send package failed: error code ");
                                sb7.append(i4);
                                AVLog.ioe("LiveStream", sb7.toString());
                                LiveStream.this.mStreamLogService.onPushStreamFail(i4, "send package fail");
                                LiveStream.this.onRtmpFailed(i3, i4, j2);
                                return;
                            case 7:
                                AVLog.ioi("LiveStream", "Rtmp pushing stopped");
                                LiveStream.this.mInfoListener.onInfo(14, 0, 0);
                                return;
                            case 8:
                                LiveStream.this.mStreamLogService.onKCPMessage(str2);
                                return;
                            case 9:
                                LiveStream.this.mStreamLogService.onQUICMessage(str2);
                                break;
                        }
                    }
                }
            };
            handler.post(r1);
        }
    }

    public void onEncodeFormatChanged(int i, int i2, long j, String str) {
        String str2;
        if (i == 5) {
            boolean z = false;
            if (i2 == 1 || i2 == 2) {
                if (i2 == 1) {
                    z = true;
                }
                StringBuilder sb = new StringBuilder("Video encode bitrate adjust from ");
                sb.append(this.mAdjustBitrate);
                sb.append(" to ");
                sb.append(j);
                AVLog.ioi("LiveStream", sb.toString());
                LiveStreamLogService liveStreamLogService = this.mStreamLogService;
                if (z) {
                    str2 = "up";
                } else {
                    str2 = "down";
                }
                liveStreamLogService.onBitrateAdjust(j, str2);
                this.mAdjustBitrate = j;
                if (this.mEncodeStreamOpt != null && this.mMediaEncodeStream != null && this.mLiveStreamBuilder.isEnableVideoEncodeAccelera() && VERSION.SDK_INT < 21 && Math.abs(this.lastEstBitrate - j) >= 81920) {
                    this.mEncodeStreamOpt.setLong("video_bitrate", 1 + j);
                    this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
                    this.lastEstBitrate = j;
                }
            } else if (i2 == 5) {
                try {
                    int indexOf = str.indexOf(120);
                    int intValue = Integer.valueOf(str.substring(0, indexOf)).intValue();
                    int intValue2 = Integer.valueOf(str.substring(indexOf + 1)).intValue();
                    this.mLiveStreamBuilder.setVideoWidth(intValue);
                    this.mLiveStreamBuilder.setVideoHeight(intValue2);
                    StringBuilder sb2 = new StringBuilder("Video encode size change to ");
                    sb2.append(str);
                    AVLog.iow("LiveStream", sb2.toString());
                    if (!(this.mRTMPTransport == null || this.mTransportOpt == null)) {
                        this.mTransportOpt.setInt("video_width", intValue);
                        this.mTransportOpt.setInt("video_height", intValue2);
                        this.mRTMPTransport.setParameter(this.mTransportOpt);
                    }
                } catch (Exception unused) {
                }
            }
            this.mInfoListener.onInfo(16, i, i2);
        }
    }

    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        if (this.mVideoCapturer != null) {
            return this.mVideoCapturer.pushVideoFrame(byteBuffer, i, i2, i3, j);
        }
        return -1;
    }

    public void vsyncEvent(VsyncModule vsyncModule, int i, int i2, long j, String str) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        StringBuilder sb = new StringBuilder("Vsync event  arg1 ");
        sb.append(i);
        sb.append(" arg2 ");
        sb.append(i2);
        sb.append(" arg3 ");
        sb.append(j);
        sb.append(" msg ");
        sb.append(str2);
        AVLog.iod("LiveStream", sb.toString());
        switch (i3) {
            case 100:
                StringBuilder sb2 = new StringBuilder("Timestamp exception(diff:");
                sb2.append(i2);
                sb2.append(") at track(");
                sb2.append(str2);
                sb2.append(") with reset stream");
                AVLog.logToIODevice2(5, "LiveStream", sb2.toString(), null, "LiveStream.java:vsyncEvent:2", VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                VsyncModule vsyncModule2 = vsyncModule;
                vsyncModule.reset(str2);
                break;
            case BaseNotice.HASHTAG /*101*/:
                StringBuilder sb3 = new StringBuilder("Timestamp exception(diff:");
                sb3.append(i2);
                sb3.append(") at track(");
                sb3.append(str2);
                sb3.append(")");
                AVLog.logToIODevice2(5, "LiveStream", sb3.toString(), null, "LiveStream.java:vsyncEvent:1", VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                return;
        }
    }

    protected LiveStream(LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
        Handler handler3;
        this.STATUS_INIT = 1;
        this.STATUS_STARTED = 2;
        this.STATUS_STARTING = 3;
        this.STATUS_STOPED = 4;
        this.STATUS_END = 7;
        this.STATUS_ERROR = 8;
        this.TRI_STATE_DEFAULT = -1;
        this.TRI_STATE_TRUE = 1;
        this.tryOpenAudioCaptureOnLater = true;
        this.mUriReachable = -1;
        this.mOptUrlReachable = -1;
        this.mReportFence = new ReentrantReadWriteLock();
        this.mFirstConnect = true;
        this.mInputStreamListFence = new Object();
        this.mUploadLogInterval = 0;
        this.lastEstBitrate = 0;
        this.mDnsOptOpen = false;
        this.mDnsOptHit = false;
        this.mEvaluatorSymbol = "";
        this.mInvalidOptUrl = "INVALID_URL";
        this.mReleaseFence = new Object();
        this.mVideoMixBgColor = 0;
        this.mAudioRecordMode = 1;
        this.mLiveStreamBuilder = liveStreamBuilder;
        this.mMediaEngineFactory = MediaEngineFactory.create();
        this.dataNotifyThread = new HandlerThread("LiveDataNotify");
        this.dataNotifyThread.start();
        this.mAudioDeviceModule = audioDeviceModule;
        if (handler != null) {
            this.mWorkThreadHandler = handler;
            AVLog.m143700w("LiveStream", " Using extern thread as workThread");
        } else {
            this.workThread = new GLThread("LiveStream");
            this.workThread.start();
            this.mWorkThreadHandler = this.workThread.getHandler();
        }
        this.mVideoCaptureHandler = handler2;
        Looper looper = this.dataNotifyThread.getLooper();
        if (looper != null) {
            handler3 = new Handler(looper);
        } else {
            handler3 = null;
        }
        this.mDataNotifyThreadHandler = handler3;
        this.mStatus = new AtomicInteger(1);
        adjustParameters(this.mLiveStreamBuilder);
        this.mRtmpReConnectCounts = 0;
        this.mUploadLogInterval = liveStreamBuilder.uploadLogInterval;
        this.mStreamLogService = new LiveStreamLogService(this, liveStreamBuilder.mLogUploader, this.mUploadLogInterval);
        this.mStreamLogService.setProjectKey(liveStreamBuilder.mProjectKey);
        this.mRecorderManager = new RecorderManager(this.mLiveStreamBuilder, this.mMediaEngineFactory, new SharedEncoderRecorder(new WeakReference(this)));
        this.mInputAudioStreams = new ArrayList<>();
        this.mInputVideoStreams = new ArrayList<>();
        this.mOriginAudioStreamDescription = new AudioMixerDescription();
        this.mOriginVideoStreamDescription = new VideoMixerDescription();
        if (this.mLiveStreamBuilder.getEffectModePath() == null && iVideoEffectProcessor == null) {
            this.mFilterManager = FilterManager.createDummy();
        } else {
            this.mFilterManager = FilterManager.create(new InputAudioStreamObserver() {
                public void onInputAudioStreamRelease(final EffectInputAudioStream effectInputAudioStream) {
                    synchronized (LiveStream.this.mInputStreamListFence) {
                        LiveStream.this.mInputAudioStreams.remove(effectInputAudioStream);
                    }
                    ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, (Runnable) new Runnable() {
                        public void run() {
                            AudioTrack audioTrack = effectInputAudioStream.getAudioTrack();
                            if (audioTrack != null && LiveStream.this.mMediaEncodeStream != null) {
                                LiveStream.this.mMediaEncodeStream.removeTrack(audioTrack);
                            }
                        }
                    });
                }

                public void onInputAudioStreamCreated(final EffectInputAudioStream effectInputAudioStream) {
                    effectInputAudioStream.setupAudioTrack(LiveStream.this.mMediaEngineFactory, LiveStream.this.mLiveStreamBuilder.getAudioSampleHZ(), LiveStream.this.mLiveStreamBuilder.getAudioChannel());
                    synchronized (LiveStream.this.mInputStreamListFence) {
                        LiveStream.this.mInputAudioStreams.add(effectInputAudioStream);
                    }
                    ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, (Runnable) new Runnable() {
                        public void run() {
                            if (LiveStream.this.mMediaEncodeStream != null) {
                                LiveStream.this.mMediaEncodeStream.addTrack(effectInputAudioStream.getAudioTrack());
                                LiveStream.this.mMediaEncodeStream.setAudioMixerDescription(effectInputAudioStream.name(), effectInputAudioStream.getMixerDescription());
                            }
                        }
                    });
                }
            }, this.mLiveStreamBuilder.getContext(), handler2, iVideoEffectProcessor);
        }
        StringBuilder sb = new StringBuilder("FilterManager ");
        sb.append(this.mFilterManager);
        sb.append(" is enable ");
        sb.append(this.mFilterManager.isEnable());
        sb.append(" is valid ");
        sb.append(this.mFilterManager.isValid());
        AVLog.iod("LiveStream", sb.toString());
        this.mAudioFilterManager = IAudioFilterManager.create(this.mLiveStreamBuilder.getContext(), this.mWorkThreadHandler);
        this.rtmpReconnectRunnable = new Runnable() {
            public void run() {
                LiveStream.this.rtmpReconnect();
                StringBuilder sb = new StringBuilder("Rtmp reconnecting... with current status ");
                sb.append(LiveStream.this.mStatus);
                AVLog.iod("LiveStream", sb.toString());
            }
        };
    }

    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (this.mAudioCapture == null || !(this.mAudioCapture instanceof LiveStreamAudioCapture)) {
            return -1;
        }
        return ((LiveStreamAudioCapture) this.mAudioCapture).pushAudioFrame(byteBuffer, i, i2, i3, i4 / i, j);
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
        return pushVideoFrame(i, z, i2, i3, i4, fArr, j, null);
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
        if (this.mVideoCapturer != null) {
            return this.mVideoCapturer.pushVideoFrame(i, z, i2, i3, i4, fArr, j, bundle);
        }
        return -1;
    }
}
