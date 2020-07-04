package com.p280ss.avframework.livestreamv2.core;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.SurfaceView;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.avframework.effect.IVideoEffectProcessor;
import com.p280ss.avframework.effect.VideoEffectUtilsWrapper;
import com.p280ss.avframework.engine.AudioDeviceModule;
import com.p280ss.avframework.engine.AudioDeviceModule.Observer;
import com.p280ss.avframework.engine.VideoSink;
import com.p280ss.avframework.engine.VsyncModule;
import com.p280ss.avframework.livestreamv2.IInputAudioStream;
import com.p280ss.avframework.livestreamv2.IInputVideoStream;
import com.p280ss.avframework.livestreamv2.ILiveStream;
import com.p280ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import com.p280ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener;
import com.p280ss.avframework.livestreamv2.ILiveStream.ILiveStreamDataListener;
import com.p280ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener;
import com.p280ss.avframework.livestreamv2.ILiveStream.ILiveStreamInfoListener;
import com.p280ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener;
import com.p280ss.avframework.livestreamv2.LiveStream;
import com.p280ss.avframework.livestreamv2.LiveStreamOption;
import com.p280ss.avframework.livestreamv2.LiveStreamReport;
import com.p280ss.avframework.livestreamv2.RenderView;
import com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture;
import com.p280ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.p280ss.avframework.livestreamv2.core.Anchor.Region;
import com.p280ss.avframework.livestreamv2.core.EffectCameraWrapper.FrameListener;
import com.p280ss.avframework.livestreamv2.core.LiveCore.Builder;
import com.p280ss.avframework.livestreamv2.core.LiveCore.Builder.ILogMonitor;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p280ss.avframework.livestreamv2.filter.IAudioFilterManager;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioCallback;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClient;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.p280ss.avframework.livestreamv2.interact.model.Config.AudioProfile;
import com.p280ss.avframework.livestreamv2.interact.model.Config.MixStreamConfig;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Vendor;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoCodec;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoProfile;
import com.p280ss.avframework.livestreamv2.interact.video.VideoCallback;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClient;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import com.p280ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.p280ss.avframework.livestreamv2.utils.UrlUtils;
import com.p280ss.avframework.mixer.AudioMixer.AudioMixerDescription;
import com.p280ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import com.p280ss.avframework.opengl.GLThread;
import com.p280ss.avframework.opengl.GLThreadManager;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.TEBundle;
import com.p280ss.avframework.utils.ThreadUtils;
import com.p280ss.optimizer.live.sdk.dns.C45914d;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.LiveCoreImpl */
class LiveCoreImpl extends LiveCore implements Observer {
    public boolean mAudioCaptureStarted;
    public InteractAudioClientFactory mAudioClientFactory;
    private AudioDeviceInputStream mAudioDeviceInputStream;
    public final AudioDeviceModule mAudioDeviceModule;
    public ClientFactory mClientFactory;
    private EffectCameraWrapper mEffectCameraWrapper;
    public ILiveStreamErrorListener mErrorListener;
    public ILiveStreamInfoListener mInfoListener;
    public boolean mIsInteracting;
    protected ILiveStream mLiveStream;
    private AtomicInteger mPushCount;
    public boolean mPushStreamStarted;
    private boolean mPushedOnce;
    private RenderView mRenderView;
    private long mStartTimeMs;
    private String mStreamUuid;
    public boolean mUsingClientMixer;
    private boolean mUsingEffectCamera;
    private Handler mVideoCaptureHandler;
    private GLThread mVideoCaptureThread;
    public InteractVideoClientFactory mVideoClientFactory;
    private HandlerThread mWorkThread;
    public Handler mWorkThreadHandler;

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory */
    class ClientFactory {
        private ArrayList<Client> mClients = new ArrayList<>();
        private ArrayList<Integer> mInteractsId = new ArrayList<>();
        public ILogMonitor mLogMonitor;
        private Set<Vendor> mVendorTypeSet;

        /* renamed from: com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$AnchorInternal */
        class AnchorInternal extends Anchor {
            private boolean mDispose;

            public void dispose() {
                if (LiveCoreImpl.this.mClientFactory.removeClient(this)) {
                    superDispose();
                }
            }

            /* access modifiers changed from: protected */
            public void pause() {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        AnchorInternal.super.pause();
                    }
                });
            }

            /* access modifiers changed from: protected */
            public void resume() {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        AnchorInternal.super.resume();
                    }
                });
            }

            /* access modifiers changed from: protected */
            public void superDispose() {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        AnchorInternal.super.dispose();
                    }
                });
            }

            public void clearSei() {
                LiveCoreImpl.this.addSeiField("app_data", null, -1);
                LiveCoreImpl.this.addSeiField("canvas", null, -1);
                LiveCoreImpl.this.addSeiField("source", null, -1);
            }

            public void start() {
                LiveCoreImpl.this.mClientFactory.start(this);
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        AnchorInternal.super.start();
                    }
                });
            }

            public void stop() {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        AnchorInternal.super.stop();
                        if (AnchorInternal.this.mConfig.isClientMixStream()) {
                            AnchorInternal.this.clearSei();
                        }
                    }
                });
                LiveCoreImpl.this.mClientFactory.stop(this);
            }

            public void muteAllRemoteAudioStreams(final boolean z) {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        AnchorInternal.super.muteAllRemoteAudioStreams(z);
                    }
                });
            }

            public void onUserJoined(int i) {
                LiveCoreImpl.this.mClientFactory.onUserJoin(this, i);
                super.onUserJoined(i);
            }

            public void onUserLeaved(int i) {
                LiveCoreImpl.this.mClientFactory.onUserLeaved(this, i);
                super.onUserLeaved(i);
            }

            public void switchAudio(final boolean z) {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        AnchorInternal.super.switchAudio(z);
                    }
                });
            }

            public void mixStream(List<Region> list) {
                String str;
                IInputAudioStream iInputAudioStream;
                boolean z;
                IInputVideoStream iInputVideoStream;
                int i;
                int i2;
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (this.mConfig.isClientMixStream() && iLiveStream != null) {
                    if (list == null || list.size() == 0) {
                        String str2 = "LiveCoreImpl";
                        StringBuilder sb = new StringBuilder("regions is ");
                        if (list == null) {
                            str = TEVideoRecorder.FACE_BEAUTY_NULL;
                        } else {
                            str = "empty";
                        }
                        sb.append(str);
                        AVLog.ioe(str2, sb.toString());
                        return;
                    }
                    composeSei(list);
                    boolean z2 = false;
                    int i3 = 0;
                    for (Region region : list) {
                        boolean z3 = true;
                        if (region.getInteractId() == this.mConfig.getInteractId()) {
                            iInputVideoStream = iLiveStream.getOriginInputVideoStream();
                            iInputAudioStream = iLiveStream.getOriginInputAudioStream();
                            z = true;
                        } else {
                            IInputVideoStream iInputVideoStream2 = this.mOutVideoStream;
                            iInputAudioStream = this.mOutAudioStream;
                            z3 = false;
                            IInputVideoStream iInputVideoStream3 = iInputVideoStream2;
                            z = z2;
                            iInputVideoStream = iInputVideoStream3;
                        }
                        if (iInputVideoStream != null) {
                            VideoMixerDescription mixerDescription = iInputVideoStream.getMixerDescription();
                            if (mixerDescription != null) {
                                mixerDescription.left = (float) region.getX();
                                mixerDescription.top = (float) region.getY();
                                mixerDescription.right = mixerDescription.left + ((float) region.getWidth());
                                mixerDescription.bottom = mixerDescription.top + ((float) region.getHeight());
                                if (z3) {
                                    i = i3;
                                    i2 = 0;
                                } else {
                                    i2 = i3 + 1;
                                    i = i2;
                                }
                                mixerDescription.zOrder = i2;
                                mixerDescription.setMode(2);
                                iInputVideoStream.setMixerDescription(mixerDescription);
                                i3 = i;
                            }
                        }
                        if (iInputAudioStream != null) {
                            AudioMixerDescription mixerDescription2 = iInputAudioStream.getMixerDescription();
                            if (mixerDescription2 != null) {
                                mixerDescription2.volumeCoeff = region.getVolumeCoeff();
                                iInputAudioStream.setMixerDescription(mixerDescription2);
                            }
                        }
                        z2 = z;
                    }
                    if (!z2) {
                        AVLog.ioe("LiveCoreImpl", "Didn't find my region.");
                    }
                }
            }

            private void composeSei(List<Region> list) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Region region : list) {
                        jSONArray.put(new JSONObject().put("type", region.getMediaType()).put("x", region.getX()).put("y", region.getY()).put("w", region.getWidth()).put("h", region.getHeight()).put("account", region.getUserId()).put("uid", region.getInteractId()).put("talk", region.isTalking() ? 1 : 0).put("stat", region.getStatus()));
                    }
                    String str = "unknown";
                    switch (this.mConfig.getVendor()) {
                        case AGORA:
                            str = "agora";
                            break;
                        case BYTE:
                            str = "zego";
                            break;
                        case ZEGO:
                            str = "byte";
                            break;
                    }
                    JSONObject put = new JSONObject().put("timestamp", System.currentTimeMillis()).put("ver", this.mConfig.getSeiVersion()).put("vendor", str).put("channel_id", this.mConfig.getChannelName()).put("grids", jSONArray);
                    if (this.mConfig.getMixStreamConfig() != null) {
                        put.put("canvas", new JSONObject().put("width", this.mConfig.getMixStreamConfig().getVideoWidth()).put("height", this.mConfig.getMixStreamConfig().getVideoHeight()).put("background", this.mConfig.getMixStreamConfig().getBackgroundColorString()));
                        LiveCoreImpl.this.addSeiField("canvas", new JSONObject().put("w", this.mConfig.getMixStreamConfig().getVideoWidth()).put("h", this.mConfig.getMixStreamConfig().getVideoHeight()).put("bgnd", this.mConfig.getMixStreamConfig().getBackgroundColorString()), -1);
                    }
                    LiveCoreImpl.this.addSeiField("app_data", put.toString(), -1);
                    LiveCoreImpl.this.addSeiField("source", "LiveCore_Android_MixStream", -1);
                } catch (Exception unused) {
                }
            }

            public void muteRemoteAudioStream(final int i, final boolean z) {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        AnchorInternal.super.muteRemoteAudioStream(i, z);
                    }
                });
            }

            public void onLogMonitor(String str, JSONObject jSONObject) {
                if (LiveCoreImpl.this.mClientFactory.mLogMonitor != null) {
                    LiveCoreImpl.this.mClientFactory.mLogMonitor.onLogMonitor(str, jSONObject);
                }
            }

            public AnchorInternal(InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, IInputAudioStream iInputAudioStream, IInputVideoStream iInputVideoStream) {
                super(interactConfig, videoClientFactory, audioClientFactory, iInputAudioStream, iInputVideoStream);
            }
        }

        /* renamed from: com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$GuestInternal */
        class GuestInternal extends Guest {
            /* access modifiers changed from: protected */
            public void pause() {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        GuestInternal.super.pause();
                    }
                });
            }

            /* access modifiers changed from: protected */
            public void resume() {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        GuestInternal.super.resume();
                    }
                });
            }

            /* access modifiers changed from: protected */
            public void superDispose() {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        GuestInternal.super.dispose();
                    }
                });
            }

            public synchronized void dispose() {
                if (LiveCoreImpl.this.mClientFactory.removeClient(this)) {
                    superDispose();
                }
            }

            public void start() {
                LiveCoreImpl.this.mClientFactory.start(this);
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        GuestInternal.super.start();
                    }
                });
            }

            public void stop() {
                LiveCoreImpl.this.mClientFactory.stop(this);
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        GuestInternal.super.stop();
                    }
                });
            }

            public void muteAllRemoteAudioStreams(final boolean z) {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        GuestInternal.super.muteAllRemoteAudioStreams(z);
                    }
                });
            }

            public void onUserJoined(int i) {
                LiveCoreImpl.this.mClientFactory.onUserJoin(this, i);
                super.onUserJoined(i);
            }

            public void onUserLeaved(int i) {
                LiveCoreImpl.this.mClientFactory.onUserLeaved(this, i);
                super.onUserLeaved(i);
            }

            public void switchAudio(final boolean z) {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        GuestInternal.super.switchAudio(z);
                    }
                });
            }

            public void muteRemoteAudioStream(final int i, final boolean z) {
                LiveCoreImpl.this.mWorkThreadHandler.post(new Runnable() {
                    public void run() {
                        GuestInternal.super.muteRemoteAudioStream(i, z);
                    }
                });
            }

            public void onLogMonitor(String str, JSONObject jSONObject) {
                if (LiveCoreImpl.this.mClientFactory.mLogMonitor != null) {
                    LiveCoreImpl.this.mClientFactory.mLogMonitor.onLogMonitor(str, jSONObject);
                }
            }

            public GuestInternal(InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, IInputAudioStream iInputAudioStream, IInputVideoStream iInputVideoStream) {
                super(interactConfig, videoClientFactory, audioClientFactory, iInputAudioStream, iInputVideoStream);
            }
        }

        public void pause() {
            synchronized (this.mClients) {
                Iterator it = this.mClients.iterator();
                while (it.hasNext()) {
                    ((Client) it.next()).pause();
                }
            }
        }

        public void resume() {
            synchronized (this.mClients) {
                Iterator it = this.mClients.iterator();
                while (it.hasNext()) {
                    ((Client) it.next()).resume();
                }
            }
        }

        public void dispose() {
            synchronized (this.mClients) {
                Iterator it = this.mClients.iterator();
                while (it.hasNext()) {
                    Client client = (Client) it.next();
                    client.stop();
                    if (client.isGuest()) {
                        ((GuestInternal) client).superDispose();
                    } else {
                        ((AnchorInternal) client).superDispose();
                    }
                }
                this.mClients.clear();
            }
            if (this.mVendorTypeSet.contains(Vendor.BYTE)) {
                LiveCoreImpl.this.mWorkThreadHandler.post(LiveCoreImpl$ClientFactory$$Lambda$0.$instance);
            }
            this.mVendorTypeSet.clear();
        }

        private void addClients(Client client) {
            synchronized (this.mClients) {
                this.mClients.add(client);
            }
        }

        public boolean removeClient(Client client) {
            boolean remove;
            synchronized (this.mClients) {
                remove = this.mClients.remove(client);
            }
            return remove;
        }

        public void start(Client client) {
            StringBuilder sb = new StringBuilder("Start clientFactory at client(");
            sb.append(client);
            sb.append(")");
            AVLog.iod("LiveCoreImpl", sb.toString());
            LiveCoreImpl.this.mIsInteracting = true;
            this.mInteractsId.clear();
            LiveStream liveStream = (LiveStream) LiveCoreImpl.this.mLiveStream;
            if (LiveCoreImpl.this.mUsingClientMixer || liveStream == null) {
                if (LiveCoreImpl.this.mUsingClientMixer && liveStream != null) {
                    StringBuilder sb2 = new StringBuilder("client interact start using mode 7 switch audio capture to ");
                    sb2.append(liveStream.getLiveStreamBuilder().getAudioCaptureDevice());
                    AVLog.iod("LiveCoreImpl", sb2.toString());
                    liveStream.setAudioRecordMode(7);
                    liveStream.switchAudioCapture(liveStream.getLiveStreamBuilder().getAudioCaptureDevice());
                    AudioMixerDescription audioMixerDescription = new AudioMixerDescription();
                    audioMixerDescription.volumeCoeff = 2.0f;
                    liveStream.getOriginInputAudioStream().setMixerDescription(audioMixerDescription);
                }
                return;
            }
            liveStream.stopAudioCapture();
            liveStream.stop();
        }

        public void stop(Client client) {
            StringBuilder sb = new StringBuilder("Stop clientFactory at client(");
            sb.append(client);
            sb.append(")");
            AVLog.iod("LiveCoreImpl", sb.toString());
            LiveCoreImpl.this.mIsInteracting = false;
            LiveStream liveStream = (LiveStream) LiveCoreImpl.this.mLiveStream;
            if (!LiveCoreImpl.this.mUsingClientMixer && liveStream != null) {
                if (LiveCoreImpl.this.mAudioCaptureStarted) {
                    liveStream.startAudioCapture();
                }
                if (!client.isGuest() && LiveCoreImpl.this.mPushStreamStarted) {
                    List urls = liveStream.getUrls();
                    if (urls != null && !urls.isEmpty()) {
                        liveStream.start(liveStream.getUrls());
                    }
                }
            } else if (LiveCoreImpl.this.mUsingClientMixer && liveStream != null) {
                StringBuilder sb2 = new StringBuilder("client interact stop using mode 1 switch audio capture to ");
                sb2.append(liveStream.getLiveStreamBuilder().getAudioCaptureDevice());
                AVLog.iod("LiveCoreImpl", sb2.toString());
                liveStream.setAudioRecordMode(1);
                liveStream.switchAudioCapture(liveStream.getLiveStreamBuilder().getAudioCaptureDevice());
                liveStream.enableMixer(true, false);
                liveStream.enableMixer(false, false);
            }
        }

        public ClientFactory(Builder builder) {
            this.mLogMonitor = builder.getLogMonitor();
            this.mVendorTypeSet = new HashSet();
        }

        public void onUserJoin(Client client, int i) {
            synchronized (this.mInteractsId) {
                boolean isEmpty = this.mInteractsId.isEmpty();
                if (!this.mInteractsId.contains(Integer.valueOf(i))) {
                    this.mInteractsId.add(Integer.valueOf(i));
                }
                if (isEmpty && LiveCoreImpl.this.mUsingClientMixer) {
                    ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                    if (iLiveStream != null) {
                        iLiveStream.enableMixer(false, true);
                        iLiveStream.enableMixer(true, true);
                    }
                    if (LiveCoreImpl.this.mAudioDeviceModule != null) {
                        LiveCoreImpl.this.mAudioDeviceModule.enableBuiltInAEC(true);
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onUserLeaved(com.p280ss.avframework.livestreamv2.core.Client r3, int r4) {
            /*
                r2 = this;
                java.util.ArrayList<java.lang.Integer> r3 = r2.mInteractsId
                monitor-enter(r3)
                java.util.ArrayList<java.lang.Integer> r0 = r2.mInteractsId     // Catch:{ all -> 0x0063 }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0063 }
                if (r0 == 0) goto L_0x0014
                java.lang.String r4 = "LiveCoreImpl"
                java.lang.String r0 = "Repeat interact user leaved event."
                com.p280ss.avframework.utils.AVLog.iow(r4, r0)     // Catch:{ all -> 0x0063 }
                monitor-exit(r3)     // Catch:{ all -> 0x0063 }
                return
            L_0x0014:
                java.util.ArrayList<java.lang.Integer> r0 = r2.mInteractsId     // Catch:{ all -> 0x0063 }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0063 }
                int r0 = r0.indexOf(r1)     // Catch:{ all -> 0x0063 }
            L_0x001e:
                if (r0 < 0) goto L_0x0038
                java.util.ArrayList<java.lang.Integer> r1 = r2.mInteractsId     // Catch:{ all -> 0x0063 }
                int r1 = r1.size()     // Catch:{ all -> 0x0063 }
                if (r0 >= r1) goto L_0x0038
                java.util.ArrayList<java.lang.Integer> r1 = r2.mInteractsId     // Catch:{ all -> 0x0063 }
                r1.remove(r0)     // Catch:{ all -> 0x0063 }
                java.util.ArrayList<java.lang.Integer> r0 = r2.mInteractsId     // Catch:{ all -> 0x0063 }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0063 }
                int r0 = r0.indexOf(r1)     // Catch:{ all -> 0x0063 }
                goto L_0x001e
            L_0x0038:
                java.util.ArrayList<java.lang.Integer> r4 = r2.mInteractsId     // Catch:{ all -> 0x0063 }
                boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0063 }
                if (r4 == 0) goto L_0x0061
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r4 = com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.this     // Catch:{ all -> 0x0063 }
                boolean r4 = r4.mUsingClientMixer     // Catch:{ all -> 0x0063 }
                if (r4 == 0) goto L_0x0061
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r4 = com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.this     // Catch:{ all -> 0x0063 }
                com.ss.avframework.engine.AudioDeviceModule r4 = r4.mAudioDeviceModule     // Catch:{ all -> 0x0063 }
                r0 = 0
                if (r4 == 0) goto L_0x0054
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r4 = com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.this     // Catch:{ all -> 0x0063 }
                com.ss.avframework.engine.AudioDeviceModule r4 = r4.mAudioDeviceModule     // Catch:{ all -> 0x0063 }
                r4.enableBuiltInAEC(r0)     // Catch:{ all -> 0x0063 }
            L_0x0054:
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r4 = com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.this     // Catch:{ all -> 0x0063 }
                com.ss.avframework.livestreamv2.ILiveStream r4 = r4.mLiveStream     // Catch:{ all -> 0x0063 }
                if (r4 == 0) goto L_0x0061
                r4.enableMixer(r0, r0)     // Catch:{ all -> 0x0063 }
                r1 = 1
                r4.enableMixer(r1, r0)     // Catch:{ all -> 0x0063 }
            L_0x0061:
                monitor-exit(r3)     // Catch:{ all -> 0x0063 }
                return
            L_0x0063:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0063 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.ClientFactory.onUserLeaved(com.ss.avframework.livestreamv2.core.Client, int):void");
        }

        /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, com.ss.avframework.livestreamv2.core.Client] */
        /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$AnchorInternal] */
        /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$GuestInternal] */
        /* JADX WARNING: type inference failed for: r0v11, types: [com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$AnchorInternal] */
        /* JADX WARNING: type inference failed for: r0v12, types: [com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$GuestInternal] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v11, types: [com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$AnchorInternal]
          assigns: [com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$AnchorInternal, com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$GuestInternal]
          uses: [com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$AnchorInternal, com.ss.avframework.livestreamv2.core.Client, java.lang.Object, com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$GuestInternal]
          mth insns count: 57
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.p280ss.avframework.livestreamv2.core.Client create(com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig r9, com.p280ss.avframework.livestreamv2.IInputAudioStream r10, com.p280ss.avframework.livestreamv2.IInputVideoStream r11, boolean r12) {
            /*
                r8 = this;
                r0 = 0
                if (r12 == 0) goto L_0x001d
                com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$GuestInternal r7 = new com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$GuestInternal
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r1 = com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.this
                com.ss.avframework.livestreamv2.core.LiveCoreImpl$InteractVideoClientFactory r3 = r1.mVideoClientFactory
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r1 = com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.this
                boolean r1 = r1.mUsingClientMixer
                if (r1 == 0) goto L_0x0013
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r0 = com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.this
                com.ss.avframework.livestreamv2.core.LiveCoreImpl$InteractAudioClientFactory r0 = r0.mAudioClientFactory
            L_0x0013:
                r4 = r0
                r0 = r7
                r1 = r8
                r2 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r2, r3, r4, r5, r6)
                goto L_0x0036
            L_0x001d:
                com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$AnchorInternal r7 = new com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$AnchorInternal
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r1 = com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.this
                com.ss.avframework.livestreamv2.core.LiveCoreImpl$InteractVideoClientFactory r3 = r1.mVideoClientFactory
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r1 = com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.this
                boolean r1 = r1.mUsingClientMixer
                if (r1 == 0) goto L_0x002d
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r0 = com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.this
                com.ss.avframework.livestreamv2.core.LiveCoreImpl$InteractAudioClientFactory r0 = r0.mAudioClientFactory
            L_0x002d:
                r4 = r0
                r0 = r7
                r1 = r8
                r2 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r2, r3, r4, r5, r6)
            L_0x0036:
                r8.addClients(r7)
                java.util.Set<com.ss.avframework.livestreamv2.interact.model.Config$Vendor> r0 = r8.mVendorTypeSet
                com.ss.avframework.livestreamv2.interact.model.Config$Vendor r1 = r9.getVendor()
                r0.add(r1)
                java.lang.String r0 = "LiveCoreImpl"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Create interact client("
                r1.<init>(r2)
                if (r12 == 0) goto L_0x0050
                java.lang.String r2 = "guest"
                goto L_0x0052
            L_0x0050:
                java.lang.String r2 = "anchor"
            L_0x0052:
                r1.append(r2)
                java.lang.String r2 = ","
                r1.append(r2)
                com.ss.avframework.livestreamv2.core.LiveCoreImpl r2 = com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.this
                boolean r2 = r2.mUsingClientMixer
                if (r2 == 0) goto L_0x0063
                java.lang.String r2 = "clientMixer"
                goto L_0x0065
            L_0x0063:
                java.lang.String r2 = "ServerMixer"
            L_0x0065:
                r1.append(r2)
                java.lang.String r2 = ") "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                com.p280ss.avframework.utils.AVLog.iod(r0, r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.ClientFactory.create(com.ss.avframework.livestreamv2.core.LiveCore$InteractConfig, com.ss.avframework.livestreamv2.IInputAudioStream, com.ss.avframework.livestreamv2.IInputVideoStream, boolean):com.ss.avframework.livestreamv2.core.Client");
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCoreImpl$InteractAudioClient */
    class InteractAudioClient implements IAudioFrameAvailableListener, AudioClient {
        private AudioCallback mAudioCallback;
        private int mChannel;
        private long mLastLogTime;
        private int mSampleHz;
        private boolean mStart;

        public int getBitWidth() {
            return 16;
        }

        public void start() {
            this.mStart = true;
        }

        public void stop() {
            this.mStart = false;
        }

        public int getChannelCount() {
            int i;
            synchronized (this) {
                i = this.mChannel;
            }
            return i;
        }

        public int getSampleRate() {
            int i;
            synchronized (this) {
                i = this.mSampleHz;
            }
            return i;
        }

        public void release() {
            synchronized (this) {
                this.mAudioCallback = null;
            }
        }

        public void prepare(AudioCallback audioCallback) {
            this.mAudioCallback = audioCallback;
        }

        public InteractAudioClient(int i, int i2) {
            this.mChannel = i;
            this.mSampleHz = i2;
        }

        public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
            synchronized (this) {
                if (this.mStart && this.mAudioCallback != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.mLastLogTime > 10000) {
                        StringBuilder sb = new StringBuilder("Input interact audio frame: sample_rate ");
                        sb.append(i2);
                        sb.append(", channel ");
                        sb.append(i3);
                        AVLog.ioi("LiveCoreImpl", sb.toString());
                        this.mLastLogTime = currentTimeMillis;
                    }
                    if (getChannelCount() == i3 && getSampleRate() == i2) {
                        this.mAudioCallback.updateAudioFrame(buffer, i, j);
                    } else {
                        throw new AndroidRuntimeException("Interact client BUG!");
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCoreImpl$InteractAudioClientFactory */
    class InteractAudioClientFactory implements IAudioFrameAvailableListener, AudioClientFactory {
        private ArrayList<IAudioFrameAvailableListener> mAudioClients = new ArrayList<>();

        public AudioClient create() {
            InteractAudioClient interactAudioClient;
            synchronized (this.mAudioClients) {
                boolean isEmpty = this.mAudioClients.isEmpty();
                interactAudioClient = new InteractAudioClient(LiveCoreImpl.this.getInternalBuilder().getAudioChannel(), LiveCoreImpl.this.getInternalBuilder().getAudioSampleHZ());
                this.mAudioClients.add(interactAudioClient);
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null && isEmpty) {
                    iLiveStream.setAudioFrameAvailableListener(this);
                }
            }
            return interactAudioClient;
        }

        public void destroy(AudioClient audioClient) {
            synchronized (this.mAudioClients) {
                this.mAudioClients.remove((InteractAudioClient) audioClient);
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null && this.mAudioClients.isEmpty()) {
                    iLiveStream.setAudioFrameAvailableListener(null);
                }
            }
        }

        public InteractAudioClientFactory(Builder builder) {
        }

        public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
            synchronized (this.mAudioClients) {
                Iterator it = this.mAudioClients.iterator();
                while (it.hasNext()) {
                    ((IAudioFrameAvailableListener) it.next()).onAudioFrameAvailable(buffer, i, i2, i3, j);
                }
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCoreImpl$InteractVideoClient */
    class InteractVideoClient implements ITextureFrameAvailableListener, VideoClient {
        private long mLastLogTime;
        private boolean mStart;
        private VideoCallback mVideoCallback;

        public void start() {
            this.mStart = true;
        }

        public void stop() {
            this.mStart = false;
        }

        public void release() {
            synchronized (this) {
                this.mVideoCallback = null;
            }
        }

        private InteractVideoClient() {
        }

        public void prepare(VideoCallback videoCallback) {
            synchronized (this) {
                this.mVideoCallback = videoCallback;
                this.mStart = false;
            }
        }

        public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr) {
            synchronized (this) {
                if (this.mVideoCallback != null && this.mStart) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.mLastLogTime > 10000) {
                        StringBuilder sb = new StringBuilder("Input interact video frame tex ");
                        sb.append(i);
                        AVLog.ioi("LiveCoreImpl", sb.toString());
                        this.mLastLogTime = currentTimeMillis;
                    } else {
                        int i4 = i;
                    }
                    this.mVideoCallback.updateVideoFrame(eGLContext, null, i, i2, i3, j / 1000000);
                }
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCoreImpl$InteractVideoClientFactory */
    class InteractVideoClientFactory implements ITextureFrameAvailableListener, VideoClientFactory {
        private ArrayList<ITextureFrameAvailableListener> mVideoClients = new ArrayList<>();

        public VideoClient create() {
            InteractVideoClient interactVideoClient;
            AVLog.m143696d("LiveCoreImpl", "Create client ");
            synchronized (this.mVideoClients) {
                boolean isEmpty = this.mVideoClients.isEmpty();
                interactVideoClient = new InteractVideoClient();
                this.mVideoClients.add(interactVideoClient);
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null && isEmpty) {
                    IFilterManager videoFilterMgr = LiveCoreImpl.this.getVideoFilterMgr();
                    if (videoFilterMgr != null) {
                        videoFilterMgr.forceOutput2DTex(true);
                    }
                    iLiveStream.setTextureFrameAvailableListener(this);
                }
            }
            return interactVideoClient;
        }

        public void destroy(VideoClient videoClient) {
            AVLog.m143696d("LiveCoreImpl", "Destroy client ");
            synchronized (this.mVideoClients) {
                this.mVideoClients.remove((InteractVideoClient) videoClient);
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null && this.mVideoClients.isEmpty()) {
                    iLiveStream.setTextureFrameAvailableListener(null);
                    IFilterManager videoFilterMgr = LiveCoreImpl.this.getVideoFilterMgr();
                    if (videoFilterMgr != null) {
                        videoFilterMgr.forceOutput2DTex(false);
                    }
                }
            }
        }

        public InteractVideoClientFactory(Builder builder) {
        }

        public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr) {
            synchronized (this.mVideoClients) {
                Iterator it = this.mVideoClients.iterator();
                while (it.hasNext()) {
                    ((ITextureFrameAvailableListener) it.next()).onTextureFrameAvailable(eGLContext, i, z, i2, i3, j, fArr);
                }
            }
        }
    }

    public AudioDeviceModule getADM() {
        return this.mAudioDeviceModule;
    }

    public IFilterManager getFilterMgr() {
        return getVideoFilterMgr();
    }

    public void startCaptureSource() {
        startAudioCapture();
        startVideoCapture();
    }

    public void stopCaptureSource() {
        stopAudioCapture();
        stopVideoCapture();
    }

    public boolean audioMute() {
        if (this.mLiveStream == null || !this.mLiveStream.audioMute()) {
            return false;
        }
        return true;
    }

    public IInputAudioStream createInputAudioStream() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.createInputAudioStream();
    }

    public IInputVideoStream createInputVideoStream() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.createInputVideoStream();
    }

    public IAudioFilterManager getAudioFilterMgr() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getAudioFilterMgr();
    }

    public LiveStreamOption getOption() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getOption();
    }

    public IInputAudioStream getOriginInputAudioStream() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getOriginInputAudioStream();
    }

    public IInputVideoStream getOriginInputVideoStream() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getOriginInputVideoStream();
    }

    public boolean getPreviewFitMode() {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isFitMode();
        }
        return false;
    }

    public IRecorderManager getRecorderMgr() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getRecorderMgr();
    }

    public String getVersion() {
        if (this.mLiveStream == null) {
            return "";
        }
        return this.mLiveStream.getVersion();
    }

    public VsyncModule getVsyncModule() {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            return liveStream.getEncodeStreamVsyncModule();
        }
        return null;
    }

    public void startAudioCapture() {
        if (this.mLiveStream != null) {
            this.mLiveStream.startAudioCapture();
            this.mAudioCaptureStarted = true;
        }
    }

    public int startAudioPlayer() {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                if (LiveCoreImpl.this.mAudioDeviceModule != null) {
                    int startPlayer = LiveCoreImpl.this.mAudioDeviceModule.startPlayer();
                    if (startPlayer != 0) {
                        if (LiveCoreImpl.this.mErrorListener != null) {
                            LiveCoreImpl.this.mErrorListener.onError(8, startPlayer, new Exception("ADM startPlayer error"));
                        }
                    } else if (LiveCoreImpl.this.mInfoListener != null) {
                        LiveCoreImpl.this.mInfoListener.onInfo(18, 0, 0);
                    }
                }
            }
        });
        return 0;
    }

    public void stop() {
        if (this.mLiveStream != null) {
            this.mLiveStream.stop();
            this.mPushStreamStarted = false;
        }
    }

    public void stopAudioCapture() {
        if (this.mLiveStream != null) {
            this.mLiveStream.stopAudioCapture();
            this.mAudioCaptureStarted = false;
        }
    }

    public int stopAudioPlayer() {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                if (LiveCoreImpl.this.mAudioDeviceModule != null) {
                    int stopPlayer = LiveCoreImpl.this.mAudioDeviceModule.stopPlayer();
                    if (stopPlayer != 0) {
                        if (LiveCoreImpl.this.mErrorListener != null) {
                            LiveCoreImpl.this.mErrorListener.onError(8, stopPlayer, new Exception("ADM stopPlayer error"));
                        }
                    } else if (LiveCoreImpl.this.mInfoListener != null) {
                        LiveCoreImpl.this.mInfoListener.onInfo(19, 0, 0);
                    }
                }
            }
        });
        return 0;
    }

    /* access modifiers changed from: protected */
    public Builder getInternalBuilder() {
        if (this.mLiveStream == null) {
            return null;
        }
        return (Builder) ((LiveStream) this.mLiveStream).getLiveStreamBuilder();
    }

    public IVideoCapturerControl getVideoCapturerControl() {
        if (this.mUsingEffectCamera) {
            return this.mEffectCameraWrapper;
        }
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getVideoCapturerControl();
    }

    public IFilterManager getVideoFilterMgr() {
        if (this.mUsingEffectCamera) {
            return this.mEffectCameraWrapper;
        }
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getVideoFilterMgr();
    }

    public void pause() {
        if (this.mUsingEffectCamera && this.mEffectCameraWrapper != null) {
            this.mEffectCameraWrapper.stopCapture();
        }
        if (this.mLiveStream != null) {
            this.mLiveStream.pause();
        }
        if (this.mClientFactory != null) {
            this.mClientFactory.pause();
        }
    }

    public void resume() {
        if (this.mUsingEffectCamera && this.mEffectCameraWrapper != null) {
            this.mEffectCameraWrapper.startCapture();
        }
        if (this.mLiveStream != null) {
            this.mLiveStream.resume();
        }
        if (this.mClientFactory != null) {
            this.mClientFactory.resume();
        }
    }

    public void startVideoCapture() {
        if (this.mUsingEffectCamera && this.mEffectCameraWrapper != null) {
            this.mEffectCameraWrapper.startCapture();
        }
        if (this.mLiveStream != null) {
            this.mLiveStream.startVideoCapture();
        }
    }

    public void stopVideoCapture() {
        if (this.mUsingEffectCamera && this.mEffectCameraWrapper != null) {
            this.mEffectCameraWrapper.stopCapture();
        }
        if (this.mLiveStream != null) {
            this.mLiveStream.stopVideoCapture();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:25|26|27|28|29|(2:31|(2:33|(1:35)))|36|37) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0090 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00b6 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r7.postLiveCoreLog(r0)     // Catch:{ all -> 0x00e1 }
            com.ss.avframework.livestreamv2.core.AudioDeviceInputStream r1 = r7.mAudioDeviceInputStream     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x000e
            com.ss.avframework.livestreamv2.core.AudioDeviceInputStream r1 = r7.mAudioDeviceInputStream     // Catch:{ all -> 0x00e1 }
            r1.release()     // Catch:{ all -> 0x00e1 }
        L_0x000e:
            com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory r1 = r7.mClientFactory     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x0017
            com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory r1 = r7.mClientFactory     // Catch:{ all -> 0x00e1 }
            r1.dispose()     // Catch:{ all -> 0x00e1 }
        L_0x0017:
            com.ss.avframework.livestreamv2.core.EffectCameraWrapper r1 = r7.mEffectCameraWrapper     // Catch:{ all -> 0x00e1 }
            r2 = 0
            if (r1 == 0) goto L_0x0028
            com.ss.avframework.livestreamv2.core.EffectCameraWrapper r1 = r7.mEffectCameraWrapper     // Catch:{ all -> 0x00e1 }
            r1.stopCapture()     // Catch:{ all -> 0x00e1 }
            com.ss.avframework.livestreamv2.core.EffectCameraWrapper r1 = r7.mEffectCameraWrapper     // Catch:{ all -> 0x00e1 }
            r1.release()     // Catch:{ all -> 0x00e1 }
            r7.mEffectCameraWrapper = r2     // Catch:{ all -> 0x00e1 }
        L_0x0028:
            r7.stopAudioCapture()     // Catch:{ all -> 0x00e1 }
            r7.stopVideoCapture()     // Catch:{ all -> 0x00e1 }
            r7.stopAudioPlayer()     // Catch:{ all -> 0x00e1 }
            android.os.Handler r1 = r7.mWorkThreadHandler     // Catch:{ all -> 0x00e1 }
            com.ss.avframework.livestreamv2.core.LiveCoreImpl$3 r3 = new com.ss.avframework.livestreamv2.core.LiveCoreImpl$3     // Catch:{ all -> 0x00e1 }
            r3.<init>()     // Catch:{ all -> 0x00e1 }
            r1.post(r3)     // Catch:{ all -> 0x00e1 }
            com.ss.avframework.livestreamv2.RenderView r1 = r7.mRenderView     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x0048
            com.ss.avframework.livestreamv2.ILiveStream r1 = r7.mLiveStream     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x0048
            com.ss.avframework.livestreamv2.ILiveStream r1 = r7.mLiveStream     // Catch:{ all -> 0x00e1 }
            r1.setRenderSink(r2)     // Catch:{ all -> 0x00e1 }
        L_0x0048:
            com.ss.avframework.livestreamv2.ILiveStream r1 = r7.mLiveStream     // Catch:{ all -> 0x00e1 }
            r7.mLiveStream = r2     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x0054
            r1.stop()     // Catch:{ all -> 0x00e1 }
            r1.release()     // Catch:{ all -> 0x00e1 }
        L_0x0054:
            com.ss.avframework.livestreamv2.RenderView r1 = r7.mRenderView     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x005f
            com.ss.avframework.livestreamv2.RenderView r1 = r7.mRenderView     // Catch:{ all -> 0x00e1 }
            r1.release()     // Catch:{ all -> 0x00e1 }
            r7.mRenderView = r2     // Catch:{ all -> 0x00e1 }
        L_0x005f:
            java.lang.Object r1 = new java.lang.Object     // Catch:{ all -> 0x00e1 }
            r1.<init>()     // Catch:{ all -> 0x00e1 }
            r3 = 1
            boolean[] r4 = new boolean[r3]     // Catch:{ all -> 0x00e1 }
            r4[r0] = r3     // Catch:{ all -> 0x00e1 }
            monitor-enter(r1)     // Catch:{ all -> 0x00e1 }
            android.os.Handler r3 = r7.mWorkThreadHandler     // Catch:{ all -> 0x00de }
            com.ss.avframework.livestreamv2.core.LiveCoreImpl$4 r5 = new com.ss.avframework.livestreamv2.core.LiveCoreImpl$4     // Catch:{ all -> 0x00de }
            r5.<init>(r1, r4)     // Catch:{ all -> 0x00de }
            r3.post(r5)     // Catch:{ all -> 0x00de }
            r5 = 500(0x1f4, double:2.47E-321)
            r1.wait(r5)     // Catch:{ InterruptedException -> 0x0090 }
            boolean r0 = r4[r0]     // Catch:{ InterruptedException -> 0x0090 }
            if (r0 == 0) goto L_0x0090
            android.os.Handler r0 = r7.mWorkThreadHandler     // Catch:{ InterruptedException -> 0x0090 }
            android.os.Looper r0 = r0.getLooper()     // Catch:{ InterruptedException -> 0x0090 }
            if (r0 == 0) goto L_0x0090
            java.lang.Thread r0 = r0.getThread()     // Catch:{ InterruptedException -> 0x0090 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r3 = "LiveCoreImpl"
            com.p280ss.avframework.livestreamv2.LiveStream.dumpJavaThreadStackIfNeed(r0, r3)     // Catch:{ InterruptedException -> 0x0090 }
        L_0x0090:
            monitor-exit(r1)     // Catch:{ all -> 0x00de }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00e1 }
            r1 = 18
            if (r0 < r1) goto L_0x00c2
            android.os.HandlerThread r0 = r7.mWorkThread     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00a7
            android.os.HandlerThread r0 = r7.mWorkThread     // Catch:{ Throwable -> 0x00a1 }
            r0.quitSafely()     // Catch:{ Throwable -> 0x00a1 }
            goto L_0x00ac
        L_0x00a1:
            android.os.HandlerThread r0 = r7.mWorkThread     // Catch:{ all -> 0x00e1 }
            r0.quit()     // Catch:{ all -> 0x00e1 }
            goto L_0x00ac
        L_0x00a7:
            android.os.HandlerThread r0 = r7.mWorkThread     // Catch:{ all -> 0x00e1 }
            r0.quit()     // Catch:{ all -> 0x00e1 }
        L_0x00ac:
            com.ss.avframework.opengl.GLThread r0 = r7.mVideoCaptureThread     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00bc
            com.ss.avframework.opengl.GLThread r0 = r7.mVideoCaptureThread     // Catch:{ Throwable -> 0x00b6 }
            r0.quitSafely()     // Catch:{ Throwable -> 0x00b6 }
            goto L_0x00d4
        L_0x00b6:
            com.ss.avframework.opengl.GLThread r0 = r7.mVideoCaptureThread     // Catch:{ all -> 0x00e1 }
            r0.quit()     // Catch:{ all -> 0x00e1 }
            goto L_0x00d4
        L_0x00bc:
            com.ss.avframework.opengl.GLThread r0 = r7.mVideoCaptureThread     // Catch:{ all -> 0x00e1 }
            r0.quit()     // Catch:{ all -> 0x00e1 }
            goto L_0x00d4
        L_0x00c2:
            android.os.HandlerThread r0 = r7.mWorkThread     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00cb
            android.os.HandlerThread r0 = r7.mWorkThread     // Catch:{ all -> 0x00e1 }
            r0.quit()     // Catch:{ all -> 0x00e1 }
        L_0x00cb:
            com.ss.avframework.opengl.GLThread r0 = r7.mVideoCaptureThread     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00d4
            com.ss.avframework.opengl.GLThread r0 = r7.mVideoCaptureThread     // Catch:{ all -> 0x00e1 }
            r0.quit()     // Catch:{ all -> 0x00e1 }
        L_0x00d4:
            r7.mWorkThread = r2     // Catch:{ all -> 0x00e1 }
            r7.mVideoCaptureThread = r2     // Catch:{ all -> 0x00e1 }
            r7.mInfoListener = r2     // Catch:{ all -> 0x00e1 }
            r7.mErrorListener = r2     // Catch:{ all -> 0x00e1 }
            monitor-exit(r7)
            return
        L_0x00de:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00de }
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.core.LiveCoreImpl.release():void");
    }

    public void setPreviewFitMode(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setFitMode(z);
        }
    }

    public boolean getLiveStreamInfo(LiveStreamReport liveStreamReport) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            return iLiveStream.getLiveStreamInfo(liveStreamReport);
        }
        return false;
    }

    public boolean getPreviewMirror(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isMirror(z);
        }
        return false;
    }

    public boolean isEnableMixer(boolean z) {
        if (this.mLiveStream == null || !this.mLiveStream.isEnableMixer(z)) {
            return false;
        }
        return true;
    }

    public boolean isMirror(boolean z) {
        if (this.mLiveStream == null || !this.mLiveStream.isMirror(z)) {
            return false;
        }
        return true;
    }

    public int sendSeiMsg(String str) {
        if (this.mLiveStream == null) {
            return 0;
        }
        return this.mLiveStream.sendSeiMsg(str);
    }

    public void setAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setAudioFrameAvailableListener(iAudioFrameAvailableListener);
        }
    }

    public void setAudioMute(boolean z) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setAudioMute(z);
        }
    }

    public void setBackGroundPhotoPath(Object obj) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setBackGroundPhotoPath(obj);
        }
    }

    public void setDataListener(ILiveStreamDataListener iLiveStreamDataListener) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setDataListener(iLiveStreamDataListener);
        }
    }

    public void setDns(C45914d dVar) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setDns(dVar);
        }
    }

    public void setErrorListener(ILiveStreamErrorListener iLiveStreamErrorListener) {
        this.mErrorListener = iLiveStreamErrorListener;
        if (this.mLiveStream != null) {
            this.mLiveStream.setErrorListener(iLiveStreamErrorListener);
        }
    }

    public void setInfoListener(ILiveStreamInfoListener iLiveStreamInfoListener) {
        this.mInfoListener = iLiveStreamInfoListener;
        if (this.mLiveStream != null) {
            this.mLiveStream.setInfoListener(iLiveStreamInfoListener);
        }
    }

    public void setOption(LiveStreamOption liveStreamOption) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setOption(liveStreamOption);
        }
    }

    public void setScreenIntent(Intent intent) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setScreenIntent(intent);
        }
    }

    public void setTextureFrameAvailableListener(ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setTextureFrameAvailableListener(iTextureFrameAvailableListener);
        }
    }

    public void setTimeInterval(int i) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setTimeInterval(i);
        }
    }

    public void switchAudioCapture(int i) {
        if (this.mLiveStream != null) {
            this.mLiveStream.switchAudioCapture(i);
        }
    }

    private IInputAudioStream createFromADM(final ILiveStream iLiveStream) {
        final IInputAudioStream[] iInputAudioStreamArr = {null};
        if (this.mAudioDeviceModule == null) {
            return iLiveStream.createInputAudioStream();
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, (Runnable) new Runnable() {
            public void run() {
                iInputAudioStreamArr[0] = LiveCoreImpl.this.onInputAudioStream(iLiveStream);
            }
        });
        return iInputAudioStreamArr[0];
    }

    public void setRenderSink(VideoSink videoSink) {
        if (this.mUsingEffectCamera) {
            throw new AndroidRuntimeException("Unsupport operation.");
        } else if (this.mLiveStream != null) {
            this.mLiveStream.setRenderSink(videoSink);
        }
    }

    public void start(String str) {
        this.mPushedOnce = true;
        if ((!this.mIsInteracting || this.mUsingClientMixer) && this.mLiveStream != null) {
            this.mLiveStream.start(str);
            this.mPushStreamStarted = true;
        }
    }

    public IInputAudioStream onInputAudioStream(ILiveStream iLiveStream) {
        if (this.mAudioDeviceInputStream == null) {
            this.mAudioDeviceInputStream = new AudioDeviceInputStream(this.mAudioDeviceModule, iLiveStream.createInputAudioStream());
            startAudioPlayer();
        }
        RenderStream createRenderSteream = this.mAudioDeviceInputStream.createRenderSteream();
        if (createRenderSteream != null) {
            this.mAudioDeviceModule.getRenderMixer().setOriginTrackIndex(createRenderSteream.getAudioRenderSink().getRenderTrackId());
        }
        return createRenderSteream;
    }

    public void start(List<String> list) {
        this.mPushedOnce = true;
        if ((!this.mIsInteracting || this.mUsingClientMixer) && this.mLiveStream != null) {
            this.mLiveStream.start(list);
            this.mPushStreamStarted = true;
        }
    }

    private void initLogFile(Context context) {
        AVLog.initLogFile(context, 10485760);
        AVLog.ioi("LiveCoreImpl", "SDK version: 6.0.0.11/release");
        StringBuilder sb = new StringBuilder("Android OS: ");
        sb.append(VERSION.SDK_INT);
        sb.append("(");
        sb.append(VERSION.RELEASE);
        sb.append(")");
        AVLog.ioi("LiveCoreImpl", sb.toString());
        StringBuilder sb2 = new StringBuilder("DevicesName:");
        sb2.append(Build.MODEL);
        AVLog.ioi("LiveCoreImpl", sb2.toString());
    }

    public void setDisplay(SurfaceView surfaceView) {
        if (!this.mUsingEffectCamera) {
            RenderView renderView = this.mRenderView;
            this.mRenderView = new RenderView(surfaceView);
            if (renderView != null) {
                this.mRenderView.setMirror(renderView.isMirror(true), true);
                this.mRenderView.setMirror(renderView.isMirror(false), false);
                this.mRenderView.setFitMode(renderView.isFitMode());
            }
            if (this.mLiveStream != null) {
                this.mLiveStream.setRenderSink(this.mRenderView);
            }
        } else if (this.mEffectCameraWrapper != null) {
            this.mEffectCameraWrapper.setSurface(surfaceView);
        }
    }

    private void initEffectCamera(Builder builder) {
        this.mEffectCameraWrapper = EffectCameraWrapper.Create(builder, this.mVideoCaptureHandler, this.mWorkThreadHandler, new LiveStreamVideoCapture.Observer() {
            public void onVideoCaptureStarted() {
                if (LiveCoreImpl.this.mInfoListener != null) {
                    LiveCoreImpl.this.mInfoListener.onInfo(5, 0, 0);
                }
            }

            public void onVideoCaptureStoped() {
                if (LiveCoreImpl.this.mInfoListener != null) {
                    LiveCoreImpl.this.mInfoListener.onInfo(6, 0, 0);
                }
            }

            public void onVideoCaptureError(int i, Exception exc) {
                if (LiveCoreImpl.this.mErrorListener != null) {
                    LiveCoreImpl.this.mErrorListener.onError(2, i, exc);
                }
            }
        }, new FrameListener() {
            public void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, Bundle bundle) {
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null) {
                    iLiveStream.pushVideoFrame(i, false, i3, i4, 0, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f}, j * 1000, bundle);
                }
            }
        });
        this.mEffectCameraWrapper.setEffectAlgorithmAB(builder.getEffectAlgorithmAB());
        EffectCameraWrapper effectCameraWrapper = this.mEffectCameraWrapper;
        boolean z = false;
        if (!(builder.getRoiOn(false) == 0 && builder.getRoiOn(true) == 0)) {
            z = true;
        }
        effectCameraWrapper.enableRoi(z);
        if (builder.getEffectResourceFinder() != null) {
            this.mEffectCameraWrapper.configEffect(builder.getVideoWidth(), builder.getVideoHeight(), builder.getEffectModePath(), Build.MODEL, builder.isUseTTFaceDetect(), builder.getEffectResourceFinder());
        } else if (builder.getAssetManager() == null || !(builder.getAssetManager() instanceof AssetManager)) {
            this.mEffectCameraWrapper.configEffect(builder.getVideoWidth(), builder.getVideoHeight(), builder.getEffectModePath(), Build.MODEL, builder.isUseTTFaceDetect());
        } else {
            this.mEffectCameraWrapper.configEffect(builder.getVideoWidth(), builder.getVideoHeight(), builder.getEffectModePath(), Build.MODEL, builder.isUseTTFaceDetect(), (AssetManager) builder.getAssetManager());
        }
    }

    private void postLiveCoreLog(boolean z) {
        Builder builder = getBuilder();
        if (builder != null) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject put = new JSONObject().put(C38347c.f99551f, "2.0.0").put("report_version", 5).put("product_line", "live").put("timestamp", currentTimeMillis).put("project_key", builder.mProjectKey);
                if (z) {
                    this.mStartTimeMs = currentTimeMillis;
                    put.put("event_key", "live_core_start");
                } else {
                    put.put("event_key", "live_core_end");
                    if (this.mStartTimeMs != 0) {
                        put.put("push_duration", currentTimeMillis - this.mStartTimeMs);
                    }
                    if (this.mPushedOnce) {
                        put.put("mode", "push");
                    }
                }
                ILogMonitor logMonitor = builder.getLogMonitor();
                if (logMonitor != null) {
                    logMonitor.onLogMonitor("live_client_monitor_log", put);
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Create live core log error: ");
                sb.append(e.toString());
                AVLog.ioe("LiveCoreImpl", sb.toString());
            }
        }
    }

    public void switchVideoCapture(int i) {
        if (!this.mUsingEffectCamera || i == 2 || 1 == i) {
            switch (i) {
                case 1:
                case 2:
                    if (this.mUsingEffectCamera) {
                        if (this.mEffectCameraWrapper != null) {
                            this.mEffectCameraWrapper.switchCamera();
                        }
                        getBuilder().setVideoCaptureDevice(i);
                        return;
                    } else if (this.mLiveStream != null) {
                        this.mLiveStream.switchVideoCapture(i);
                        return;
                    }
                    break;
                case 3:
                    if (this.mUsingEffectCamera) {
                        if (this.mEffectCameraWrapper != null) {
                            this.mEffectCameraWrapper.stopCapture();
                        }
                        getBuilder().setVideoCaptureDevice(i);
                    }
                    if (this.mLiveStream != null) {
                        this.mLiveStream.switchVideoCapture(i);
                        return;
                    }
                    break;
                default:
                    if (!this.mUsingEffectCamera) {
                        if (this.mLiveStream != null) {
                            this.mLiveStream.switchVideoCapture(i);
                            break;
                        }
                    } else if (this.mEffectCameraWrapper != null) {
                        this.mEffectCameraWrapper.stopCapture();
                        return;
                    }
                    break;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("invalid operation on switch video capture, target capture ");
        sb.append(i);
        sb.append(" current capture ");
        sb.append(getBuilder().getVideoCaptureDevice());
        sb.append(" is effectcam ");
        sb.append(this.mUsingEffectCamera);
        final Exception exc = new Exception(sb.toString());
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                LiveCoreImpl.this.onWarning(1, 0, exc);
            }
        });
        getBuilder().setVideoCaptureDevice(i);
    }

    public LiveCoreImpl(Builder builder) {
        if (builder.getContext() != null) {
            initLogFile(builder.getContext());
        }
        this.mWorkThread = new HandlerThread("LiveCoreWorkThread");
        this.mWorkThread.start();
        this.mWorkThreadHandler = new Handler(this.mWorkThread.getLooper());
        this.mVideoCaptureThread = new GLThread("LiveCoreVideoCaptureThread");
        this.mVideoCaptureThread.start();
        this.mVideoCaptureHandler = this.mVideoCaptureThread.getHandler();
        this.mAudioDeviceModule = new AudioDeviceModule(this, builder.getContext());
        this.mAudioDeviceModule.enableBuiltInAEC(false);
        this.mAudioDeviceModule.enableEchoMode(false);
        this.mAudioDeviceModule.getRenderMixer().setEnable(true);
        TEBundle parameter = this.mAudioDeviceModule.getParameter();
        parameter.setInt("audio_sample", builder.getAudioCaptureSampleHZ());
        parameter.setInt("audio_channels", builder.getAudioCaptureChannel());
        parameter.setInt("adm_audio_player_channel", builder.getAudioChannel());
        parameter.setInt("adm_audio_player_sample", builder.getAudioSampleHZ());
        parameter.setInt("audio_bit_width", builder.getAudioBitwidth());
        this.mAudioDeviceModule.setParameter(parameter);
        parameter.release();
        this.mUsingEffectCamera = builder.isUsingEffectCamera();
        if (!VideoEffectUtilsWrapper.haveEffect()) {
            this.mUsingEffectCamera = false;
            builder.setUsingEffectCamera(this.mUsingEffectCamera);
            AVLog.iow("LiveCoreImpl", "Not found effect and force using BuiltInCamera");
        }
        if (this.mUsingEffectCamera) {
            initEffectCamera(builder);
            builder.setVideoCaptureDevice(4);
        }
        IVideoEffectProcessor videoEffectProcessor = builder.getVideoEffectProcessor();
        if (videoEffectProcessor != null) {
            AVLog.ioi("LiveCoreImpl", "Using extern video effect handler.");
        }
        this.mLiveStream = builder.createLiveStream(this.mWorkThreadHandler, this.mVideoCaptureHandler, this.mAudioDeviceModule, videoEffectProcessor);
        this.mStreamUuid = UUID.randomUUID().toString().replace("-", "");
        this.mPushCount = new AtomicInteger(-1);
        ((LiveStream) this.mLiveStream).setStreamUniqueIdentifier(this.mStreamUuid, this.mPushCount);
        this.mClientFactory = new ClientFactory(builder);
        this.mVideoClientFactory = new InteractVideoClientFactory(builder);
        this.mAudioClientFactory = new InteractAudioClientFactory(builder);
        if (this.mUsingEffectCamera) {
            this.mLiveStream.getVideoFilterMgr().enable(false);
        } else if (builder.getVideoCaptureDevice() != 3) {
            this.mLiveStream.getVideoFilterMgr().enable(true);
        }
        postLiveCoreLog(true);
    }

    public void catchVideo(Bundle bundle, CatchVideoCallback catchVideoCallback) {
        this.mLiveStream.catchVideo(bundle, catchVideoCallback);
    }

    public void setPreviewMirror(boolean z, boolean z2) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setMirror(z, z2);
        }
    }

    public void enableMixer(boolean z, boolean z2) {
        if (this.mLiveStream != null) {
            this.mLiveStream.enableMixer(z, z2);
        }
    }

    private VideoProfile getVideoProfile(int i, int i2) {
        if (i == 2) {
            return VideoProfile.MAIN;
        }
        switch (i2) {
            case 2:
                return VideoProfile.MAIN;
            case 3:
                return VideoProfile.HIGH;
            default:
                return VideoProfile.BASELINE;
        }
    }

    public void enableMirror(boolean z, boolean z2) {
        if (this.mUsingEffectCamera) {
            if (this.mEffectCameraWrapper != null) {
                this.mEffectCameraWrapper.enableMirror(z, z2);
            }
        } else if (this.mLiveStream != null) {
            this.mLiveStream.enableMirror(z, z2);
        }
    }

    public Client create(InteractConfig interactConfig, boolean z) {
        IInputVideoStream iInputVideoStream;
        IInputAudioStream iInputAudioStream = null;
        if (!checkInteractCfg(interactConfig, z)) {
            AVLog.m143697e("LiveCoreImpl", "Parameter invalid.");
            return null;
        }
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null || !this.mUsingClientMixer) {
            iInputVideoStream = null;
        } else {
            iInputAudioStream = createFromADM(iLiveStream);
            iInputVideoStream = iLiveStream.createInputVideoStream();
        }
        return this.mClientFactory.create(interactConfig, iInputAudioStream, iInputVideoStream, z);
    }

    private boolean checkInteractCfg(InteractConfig interactConfig, boolean z) {
        VideoCodec videoCodec;
        AudioProfile audioProfile;
        MixStreamConfig mixStreamConfig;
        if (!z) {
            if (interactConfig.getStreamMixer() == null) {
                AVLog.m143697e("LiveCoreImpl", "mixer parameter is null");
                return false;
            }
            LiveStream liveStream = (LiveStream) this.mLiveStream;
            if (liveStream == null) {
                AVLog.m143697e("LiveCoreImpl", "LiveStream is null");
                return false;
            }
            Builder internalBuilder = getInternalBuilder();
            try {
                JSONObject jSONObject = internalBuilder.getSdkParams().getJSONObject("PushBase");
                if (jSONObject.has("mixOnClient")) {
                    interactConfig.setClientMixStream(jSONObject.getBoolean("mixOnClient"));
                }
            } catch (Exception unused) {
            }
            MixStreamConfig videoBitrate = new MixStreamConfig().setVideoSize(internalBuilder.getVideoWidth(), internalBuilder.getVideoHeight()).setBackgroundColor(interactConfig.getBackgroundColor()).setVideoFrameRate(internalBuilder.getVideoFps()).setVideoBitrate(internalBuilder.getVideoBitrate() / 1000);
            if (internalBuilder.getVideoEncoder() == 2) {
                videoCodec = VideoCodec.H265;
            } else {
                videoCodec = VideoCodec.H264;
            }
            MixStreamConfig audioChannels = videoBitrate.setVideoCodec(videoCodec).setVideoProfile(getVideoProfile(internalBuilder.getVideoEncoder(), internalBuilder.getVideoProfile())).setVideoGop(internalBuilder.getVideoGopSec()).setAudioSampleRate(internalBuilder.getAudioSampleHZ()).setAudioChannels(internalBuilder.getAudioChannel());
            if (internalBuilder.getAudioProfile() == 2) {
                audioProfile = AudioProfile.HE;
            } else {
                audioProfile = AudioProfile.LC;
            }
            MixStreamConfig audioBitrate = audioChannels.setAudioProfile(audioProfile).setAudioBitrate(internalBuilder.getAudioBitrate() / 1000);
            if (!interactConfig.isClientMixStream()) {
                String originUrl = liveStream.getOriginUrl();
                if (!TextUtils.isEmpty(interactConfig.getMixStreamRtmpUrl())) {
                    originUrl = interactConfig.getMixStreamRtmpUrl();
                }
                String DecodeUrl = UrlUtils.DecodeUrl(originUrl);
                if (!TextUtils.isEmpty(DecodeUrl)) {
                    audioBitrate.setStreamUrl(DecodeUrl);
                    audioBitrate.setStreamUniqueIdentifier(this.mStreamUuid, this.mPushCount);
                } else {
                    StringBuilder sb = new StringBuilder("Live stream url is ");
                    sb.append(DecodeUrl);
                    AVLog.ioe("LiveCoreImpl", sb.toString());
                    return false;
                }
            } else {
                audioBitrate.setStreamUrl(liveStream.getLiveStreamUrl());
            }
            interactConfig.setMixStreamConfig(audioBitrate);
            liveStream.setVideoMixBgColor(audioBitrate.getBackgroundColor());
            if (interactConfig.getRtcExtInfo() == null) {
                AVLog.iow("LiveCoreImpl", "Not found rtc external info");
            }
            if (interactConfig.getRtcExtInfo() != null) {
                MixStreamConfig mixStreamConfig2 = interactConfig.getMixStreamConfig();
                if (!(mixStreamConfig2 != null && mixStreamConfig2.getVideoHeight() == internalBuilder.getVideoHeight() && mixStreamConfig2.getVideoWidth() == internalBuilder.getVideoWidth())) {
                    mixStreamConfig2 = new MixStreamConfig();
                    mixStreamConfig2.setVideoSize(internalBuilder.getVideoWidth(), internalBuilder.getVideoHeight());
                    mixStreamConfig2.setBackgroundColor(interactConfig.getBackgroundColor());
                    interactConfig.setMixStreamConfig(mixStreamConfig2);
                }
                int videoBitrate2 = internalBuilder.getVideoBitrate() / 1000;
                try {
                    JSONObject jSONObject2 = interactConfig.getRtcExtInfo().getJSONObject("rtc_mix_base");
                    mixStreamConfig = interactConfig.getMixStreamConfig();
                    if (jSONObject2 != null) {
                        try {
                            if (jSONObject2.has("bitrate")) {
                                videoBitrate2 = jSONObject2.getInt("bitrate") / 1000;
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                } catch (JSONException unused3) {
                    mixStreamConfig = mixStreamConfig2;
                }
                mixStreamConfig.setVideoBitrate(videoBitrate2);
                interactConfig.setMixStreamConfig(mixStreamConfig);
                StringBuilder sb2 = new StringBuilder("Find rtc external info(");
                sb2.append(interactConfig.getRtcExtInfo());
                sb2.append(")");
                AVLog.ioi("LiveCoreImpl", sb2.toString());
            }
        }
        if (interactConfig.isClientMixStream()) {
            interactConfig.setAutoPlayRemoteAudio(false);
        }
        if (interactConfig.isClientMixStream() && interactConfig.getEGLNativeAddr() == 0 && this.mLiveStream != null && (this.mLiveStream instanceof LiveStream)) {
            long nativeEGLContext = GLThreadManager.getNativeEGLContext();
            interactConfig.setEGLNativeAddr(nativeEGLContext);
            if (nativeEGLContext == 0) {
                throw new RuntimeException("Not found avalable shard egl context.");
            }
        }
        interactConfig.setSharedEGLContext14(GLThreadManager.getEGLContext());
        if (interactConfig.getHandler() == null) {
            interactConfig.setHandler(this.mVideoCaptureHandler);
        }
        if (interactConfig.getOutPlayerAudioChannel() != getBuilder().getAudioChannel()) {
            interactConfig.setOutPlayerAudioChannel(getBuilder().getAudioChannel());
        }
        if (interactConfig.getOutPlayerAudioSampleHz() != getBuilder().getAudioSampleHZ()) {
            interactConfig.setOutPlayerAudioSampleHz(getBuilder().getAudioSampleHZ());
        }
        this.mUsingClientMixer = interactConfig.isClientMixStream();
        return true;
    }

    public int addSeiField(String str, Object obj, int i) {
        if (this.mLiveStream == null) {
            return 0;
        }
        return this.mLiveStream.addSeiField(str, obj, i);
    }

    public void onADMInfo(int i, int i2, long j) {
        if (this.mInfoListener != null) {
            switch (i) {
                case 2:
                    this.mInfoListener.onInfo(22, i2, 0);
                    return;
                case 3:
                    this.mInfoListener.onInfo(23, i2, 0);
                    return;
                case 4:
                    this.mInfoListener.onInfo(24, i2, 0);
                    break;
            }
        }
    }

    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        if (this.mLiveStream == null) {
            return 0;
        }
        return this.mLiveStream.pushVideoFrame(byteBuffer, i, i2, i3, j);
    }

    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (this.mLiveStream == null) {
            return 0;
        }
        return this.mLiveStream.pushAudioFrame(byteBuffer, i, i2, i3, i4, j);
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
        if (this.mLiveStream == null) {
            return 0;
        }
        return this.mLiveStream.pushVideoFrame(i, z, i2, i3, i4, fArr, j);
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
        if (this.mLiveStream == null) {
            return 0;
        }
        return this.mLiveStream.pushVideoFrame(i, z, i2, i3, i4, fArr, j, bundle);
    }
}
