package com.p280ss.avframework.livestreamv2.interact.controller;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceView;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.p280ss.avframework.livestreamv2.interact.callback.DataCallback;
import com.p280ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.p280ss.avframework.livestreamv2.interact.callback.QualityCallback;
import com.p280ss.avframework.livestreamv2.interact.callback.StateCallback;
import com.p280ss.avframework.livestreamv2.interact.callback.UserCallback;
import com.p280ss.avframework.livestreamv2.interact.engine.Engine;
import com.p280ss.avframework.livestreamv2.interact.engine.EngineFactory;
import com.p280ss.avframework.livestreamv2.interact.model.Config;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoOutputFormat;
import com.p280ss.avframework.livestreamv2.interact.utils.LogUtil;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.interact.controller.BaseController */
public abstract class BaseController implements Callback, EngineCallback {
    public List<DataCallback> mDataCallbacks = new ArrayList();
    Engine mEngine;
    private long mLastStreamDelayCallbackTime;
    Handler mMainThreadHandler;
    private List<QualityCallback> mQualityCallbacks = new ArrayList();
    volatile State mState;
    public List<StateCallback> mStateCallbacks = new ArrayList();
    public List<UserCallback> mUserCallbacks = new ArrayList();

    /* renamed from: com.ss.avframework.livestreamv2.interact.controller.BaseController$State */
    enum State {
        IDLE,
        INITIALIZING,
        INITIALIZED,
        STARTING,
        STARTED,
        STOPPING,
        DESTROYING
    }

    public boolean handleMessage(Message message) {
        return false;
    }

    public void pause() {
        if (this.mEngine != null) {
            this.mEngine.pause();
        }
    }

    public void resume() {
        if (this.mEngine != null) {
            this.mEngine.resume();
        }
    }

    public synchronized void release() {
        this.mUserCallbacks.clear();
        this.mStateCallbacks.clear();
        this.mQualityCallbacks.clear();
    }

    public synchronized void onDestroySuccess() {
        if (this.mState != State.DESTROYING) {
            StringBuilder sb = new StringBuilder("receive onDestroySuccess callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m143695w(sb.toString());
            return;
        }
        this.mState = State.IDLE;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onEndSuccess : BaseController.this.mStateCallbacks) {
                    onEndSuccess.onEndSuccess();
                }
            }
        });
    }

    public synchronized void onInitSuccess() {
        if (this.mState != State.INITIALIZING) {
            StringBuilder sb = new StringBuilder("receive onInitSuccess callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m143695w(sb.toString());
            return;
        }
        this.mState = State.STARTING;
        this.mEngine.start();
    }

    public synchronized void onStartSuccess() {
        if (this.mState != State.STARTING) {
            StringBuilder sb = new StringBuilder("receive onStartSuccess callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m143695w(sb.toString());
            return;
        }
        this.mState = State.STARTED;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onStartSuccess : BaseController.this.mStateCallbacks) {
                    onStartSuccess.onStartSuccess();
                }
            }
        });
    }

    public synchronized void onStopSuccess() {
        if (this.mState != State.STOPPING) {
            StringBuilder sb = new StringBuilder("receive onStopSuccess callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m143695w(sb.toString());
            return;
        }
        this.mState = State.DESTROYING;
        this.mEngine.destroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void end() {
        /*
            r2 = this;
            monitor-enter(r2)
            int[] r0 = com.p280ss.avframework.livestreamv2.interact.controller.BaseController.C4570217.f117081x5ba4b034     // Catch:{ all -> 0x0037 }
            com.ss.avframework.livestreamv2.interact.controller.BaseController$State r1 = r2.mState     // Catch:{ all -> 0x0037 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0037 }
            r0 = r0[r1]     // Catch:{ all -> 0x0037 }
            r1 = 1
            if (r0 == r1) goto L_0x002b
            r1 = 3
            if (r0 == r1) goto L_0x0020
            switch(r0) {
                case 5: goto L_0x0020;
                case 6: goto L_0x0015;
                case 7: goto L_0x0015;
                default: goto L_0x0014;
            }     // Catch:{ all -> 0x0037 }
        L_0x0014:
            goto L_0x001e
        L_0x0015:
            com.ss.avframework.livestreamv2.interact.controller.BaseController$State r0 = com.p280ss.avframework.livestreamv2.interact.controller.BaseController.State.STOPPING     // Catch:{ all -> 0x0037 }
            r2.mState = r0     // Catch:{ all -> 0x0037 }
            com.ss.avframework.livestreamv2.interact.engine.Engine r0 = r2.mEngine     // Catch:{ all -> 0x0037 }
            r0.stop()     // Catch:{ all -> 0x0037 }
        L_0x001e:
            monitor-exit(r2)
            return
        L_0x0020:
            com.ss.avframework.livestreamv2.interact.controller.BaseController$State r0 = com.p280ss.avframework.livestreamv2.interact.controller.BaseController.State.DESTROYING     // Catch:{ all -> 0x0037 }
            r2.mState = r0     // Catch:{ all -> 0x0037 }
            com.ss.avframework.livestreamv2.interact.engine.Engine r0 = r2.mEngine     // Catch:{ all -> 0x0037 }
            r0.destroy()     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x002b:
            android.os.Handler r0 = r2.mMainThreadHandler     // Catch:{ all -> 0x0037 }
            com.ss.avframework.livestreamv2.interact.controller.BaseController$2 r1 = new com.ss.avframework.livestreamv2.interact.controller.BaseController$2     // Catch:{ all -> 0x0037 }
            r1.<init>()     // Catch:{ all -> 0x0037 }
            r0.post(r1)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.interact.controller.BaseController.end():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void start() {
        /*
            r2 = this;
            monitor-enter(r2)
            int[] r0 = com.p280ss.avframework.livestreamv2.interact.controller.BaseController.C4570217.f117081x5ba4b034     // Catch:{ all -> 0x0034 }
            com.ss.avframework.livestreamv2.interact.controller.BaseController$State r1 = r2.mState     // Catch:{ all -> 0x0034 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0034 }
            r0 = r0[r1]     // Catch:{ all -> 0x0034 }
            switch(r0) {
                case 1: goto L_0x0027;
                case 2: goto L_0x0027;
                case 3: goto L_0x001c;
                case 4: goto L_0x001c;
                case 5: goto L_0x001a;
                case 6: goto L_0x001a;
                case 7: goto L_0x000f;
                default: goto L_0x000e;
            }     // Catch:{ all -> 0x0034 }
        L_0x000e:
            goto L_0x0032
        L_0x000f:
            android.os.Handler r0 = r2.mMainThreadHandler     // Catch:{ all -> 0x0034 }
            com.ss.avframework.livestreamv2.interact.controller.BaseController$1 r1 = new com.ss.avframework.livestreamv2.interact.controller.BaseController$1     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            r0.post(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x001a:
            monitor-exit(r2)
            return
        L_0x001c:
            com.ss.avframework.livestreamv2.interact.controller.BaseController$State r0 = com.p280ss.avframework.livestreamv2.interact.controller.BaseController.State.STARTING     // Catch:{ all -> 0x0034 }
            r2.mState = r0     // Catch:{ all -> 0x0034 }
            com.ss.avframework.livestreamv2.interact.engine.Engine r0 = r2.mEngine     // Catch:{ all -> 0x0034 }
            r0.start()     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return
        L_0x0027:
            com.ss.avframework.livestreamv2.interact.controller.BaseController$State r0 = com.p280ss.avframework.livestreamv2.interact.controller.BaseController.State.INITIALIZING     // Catch:{ all -> 0x0034 }
            r2.mState = r0     // Catch:{ all -> 0x0034 }
            com.ss.avframework.livestreamv2.interact.engine.Engine r0 = r2.mEngine     // Catch:{ all -> 0x0034 }
            r0.init()     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return
        L_0x0032:
            monitor-exit(r2)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.interact.controller.BaseController.start():void");
    }

    public void onError(final String str) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onError : BaseController.this.mStateCallbacks) {
                    onError.onError(str);
                }
            }
        });
    }

    public void onWarn(final String str) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onWarn : BaseController.this.mStateCallbacks) {
                    onWarn.onWarn(str);
                }
            }
        });
    }

    public synchronized void removeDataCallback(DataCallback dataCallback) {
        this.mDataCallbacks.remove(dataCallback);
    }

    public synchronized void removeQualityCallback(QualityCallback qualityCallback) {
        this.mQualityCallbacks.remove(qualityCallback);
    }

    public synchronized void removeStateCallback(StateCallback stateCallback) {
        this.mStateCallbacks.remove(stateCallback);
    }

    public synchronized void removeUserCallback(UserCallback userCallback) {
        this.mUserCallbacks.remove(userCallback);
    }

    public synchronized void addDataCallback(DataCallback dataCallback) {
        if (dataCallback != null) {
            if (!this.mDataCallbacks.contains(dataCallback)) {
                this.mDataCallbacks.add(dataCallback);
            }
        }
    }

    public synchronized void addQualityCallback(QualityCallback qualityCallback) {
        if (qualityCallback != null) {
            if (!this.mQualityCallbacks.contains(qualityCallback)) {
                this.mQualityCallbacks.add(qualityCallback);
            }
        }
    }

    public synchronized void addStateCallback(StateCallback stateCallback) {
        if (stateCallback != null) {
            if (!this.mStateCallbacks.contains(stateCallback)) {
                this.mStateCallbacks.add(stateCallback);
            }
        }
    }

    public synchronized void addUserCallback(UserCallback userCallback) {
        if (userCallback != null) {
            if (!this.mUserCallbacks.contains(userCallback)) {
                this.mUserCallbacks.add(userCallback);
            }
        }
    }

    public synchronized void muteAllRemoteAudioStreams(boolean z) {
        if (this.mState == State.STARTED) {
            this.mEngine.muteAllRemoteAudioStreams(z);
        }
    }

    public synchronized void switchAudio(boolean z) {
        if (this.mState == State.STARTED) {
            this.mEngine.switchAudio(z);
        }
    }

    public void onFirstRemoteAudioFrame(final int i) {
        if (this.mState != State.STARTED) {
            StringBuilder sb = new StringBuilder("receive onFirstRemoteAudioFrame callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m143695w(sb.toString());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onFirstRemoteAudioFrame : BaseController.this.mUserCallbacks) {
                    onFirstRemoteAudioFrame.onFirstRemoteAudioFrame(i);
                }
            }
        });
    }

    public void onStreamDelay(int i) {
        if (System.currentTimeMillis() - this.mLastStreamDelayCallbackTime >= 10000) {
            this.mLastStreamDelayCallbackTime = System.currentTimeMillis();
            for (QualityCallback onStreamDelay : this.mQualityCallbacks) {
                onStreamDelay.onStreamDelay(i);
            }
        }
    }

    public void onUserJoined(final int i) {
        if (this.mState != State.STARTED) {
            StringBuilder sb = new StringBuilder("receive onUserJoined callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m143695w(sb.toString());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onUserJoined : BaseController.this.mUserCallbacks) {
                    onUserJoined.onUserJoined(i);
                }
            }
        });
    }

    public synchronized void onUserLeaved(final int i) {
        if (this.mState != State.STARTED) {
            StringBuilder sb = new StringBuilder("receive onUserLeaved callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m143695w(sb.toString());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onUserLeaved : BaseController.this.mUserCallbacks) {
                    onUserLeaved.onUserLeaved(i);
                }
            }
        });
    }

    public synchronized void muteRemoteAudioStream(int i, boolean z) {
        if (this.mState == State.STARTED) {
            this.mEngine.muteRemoteAudioStream(i, z);
        }
    }

    public void onLogReport(String str, JSONObject jSONObject) {
        for (QualityCallback onLogMonitor : this.mQualityCallbacks) {
            onLogMonitor.onLogMonitor(str, jSONObject);
        }
    }

    public void onPushStreamQuality(long j, long j2) {
        for (QualityCallback onPushStreamQuality : this.mQualityCallbacks) {
            onPushStreamQuality.onPushStreamQuality(j, j2);
        }
    }

    public synchronized void onDestroyFailed(final int i, final String str) {
        if (this.mState != State.DESTROYING) {
            StringBuilder sb = new StringBuilder("receive onDestroyFailed callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m143695w(sb.toString());
            return;
        }
        this.mState = State.INITIALIZED;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onEndFailed : BaseController.this.mStateCallbacks) {
                    onEndFailed.onEndFailed(i, str);
                }
            }
        });
    }

    public void onFirstRemoteVideoFrame(final int i, final SurfaceView surfaceView) {
        if (this.mState != State.STARTED) {
            StringBuilder sb = new StringBuilder("receive onFirstRemoteVideoFrame callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m143695w(sb.toString());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onFirstRemoteVideoFrame : BaseController.this.mUserCallbacks) {
                    onFirstRemoteVideoFrame.onFirstRemoteVideoFrame(i, surfaceView);
                }
            }
        });
    }

    public synchronized void onInitFailed(final int i, final String str) {
        if (this.mState != State.INITIALIZING) {
            StringBuilder sb = new StringBuilder("receive onInitFailed callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m143695w(sb.toString());
            return;
        }
        this.mState = State.IDLE;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onStartFailed : BaseController.this.mStateCallbacks) {
                    onStartFailed.onStartFailed(i, str);
                }
            }
        });
    }

    public synchronized void onStartFailed(final int i, final String str) {
        if (this.mState != State.STARTING) {
            StringBuilder sb = new StringBuilder("receive onStartFailed callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m143695w(sb.toString());
            return;
        }
        this.mState = State.INITIALIZED;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onStartFailed : BaseController.this.mStateCallbacks) {
                    onStartFailed.onStartFailed(i, str);
                }
            }
        });
    }

    public synchronized void onStopFailed(final int i, final String str) {
        if (this.mState != State.STOPPING) {
            StringBuilder sb = new StringBuilder("receive onStopFailed callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m143695w(sb.toString());
            return;
        }
        this.mState = State.STARTED;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onEndFailed : BaseController.this.mStateCallbacks) {
                    onEndFailed.onEndFailed(i, str);
                }
            }
        });
    }

    public void onTalkStateUpdated(final String[] strArr, final boolean[] zArr) {
        if (this.mState != State.STARTED) {
            StringBuilder sb = new StringBuilder("receive onSelfVolumeUpdated callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m143695w(sb.toString());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onTalkStateUpdated : BaseController.this.mUserCallbacks) {
                    onTalkStateUpdated.onTalkStateUpdated(strArr, zArr);
                }
            }
        });
    }

    BaseController(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory) {
        Handler handler;
        switch (config.getVendor()) {
            case AGORA:
            case ZEGO:
            case BYTE:
                this.mEngine = EngineFactory.create(config.getVendor(), config, videoClientFactory, audioClientFactory, this);
                this.mState = State.IDLE;
                if (config.getHandler() != null) {
                    handler = config.getHandler();
                } else {
                    handler = new Handler(Looper.getMainLooper(), this);
                }
                this.mMainThreadHandler = handler;
                return;
            default:
                throw new RuntimeException("unknown vendor");
        }
    }

    public void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        for (DataCallback onPlaybackAudioFrame : this.mDataCallbacks) {
            onPlaybackAudioFrame.onPlaybackAudioFrame(byteBuffer, i, i2, i3, j);
        }
    }

    public void onReceiveVideoBufferFrame(int i, ByteBuffer byteBuffer, VideoOutputFormat videoOutputFormat, int i2, int i3, int i4, long j) {
        Handler handler = this.mMainThreadHandler;
        final int i5 = i;
        final ByteBuffer byteBuffer2 = byteBuffer;
        final VideoOutputFormat videoOutputFormat2 = videoOutputFormat;
        final int i6 = i2;
        final int i7 = i3;
        final int i8 = i4;
        final long j2 = j;
        C4569914 r0 = new Runnable() {
            public void run() {
                for (DataCallback onReceiveVideoBufferFrame : BaseController.this.mDataCallbacks) {
                    onReceiveVideoBufferFrame.onReceiveVideoBufferFrame(i5, byteBuffer2, videoOutputFormat2, i6, i7, i8, j2);
                }
            }
        };
        handler.post(r0);
    }

    public void onReceiveTextureFrame(int i, int i2, VideoOutputFormat videoOutputFormat, int i3, int i4, int i5, long j, float[] fArr) {
        for (DataCallback onReceiveTextureFrame : this.mDataCallbacks) {
            onReceiveTextureFrame.onReceiveTextureFrame(i, i2, videoOutputFormat, i3, i4, i5, j, fArr);
        }
    }
}
