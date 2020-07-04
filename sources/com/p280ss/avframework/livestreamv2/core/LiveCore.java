package com.p280ss.avframework.livestreamv2.core;

import android.os.Handler;
import android.view.SurfaceView;
import com.p280ss.avframework.effect.IVideoEffectProcessor;
import com.p280ss.avframework.engine.AudioDeviceModule;
import com.p280ss.avframework.engine.VideoSink;
import com.p280ss.avframework.engine.VsyncModule;
import com.p280ss.avframework.livestreamv2.ILiveStream;
import com.p280ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p280ss.avframework.livestreamv2.core.Anchor.StreamMixer;
import com.p280ss.avframework.livestreamv2.interact.model.Config;
import com.p280ss.avframework.livestreamv2.log.ILogUploader;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.LiveCore */
public abstract class LiveCore implements ILiveStream {
    protected ILiveCoreWarningListener mWarningListener;

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$Builder */
    public static class Builder extends LiveStreamBuilder {
        public ILogMonitor mLogMonitor = new ILogMonitor() {
            public void onLogMonitor(String str, JSONObject jSONObject) {
            }
        };
        private JSONObject mSdkParams;
        private IVideoEffectProcessor mVideoEffectProcessor;
        private boolean usingEffectCamera = true;
        private boolean usingLiveStreamMixer = true;

        /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$Builder$ILogMonitor */
        public interface ILogMonitor {
            void onLogMonitor(String str, JSONObject jSONObject);
        }

        public ILogMonitor getLogMonitor() {
            return this.mLogMonitor;
        }

        /* access modifiers changed from: 0000 */
        public JSONObject getSdkParams() {
            return this.mSdkParams;
        }

        public IVideoEffectProcessor getVideoEffectProcessor() {
            return this.mVideoEffectProcessor;
        }

        public boolean isUsingEffectCamera() {
            return this.usingEffectCamera;
        }

        public boolean isUsingLiveStreamMixer() {
            return this.usingLiveStreamMixer;
        }

        public Builder setLogUploader(ILogUploader iLogUploader) {
            return this;
        }

        public LiveCore create() {
            return new LiveCoreImpl(this);
        }

        public Builder setUsingEffectCamera(boolean z) {
            this.usingEffectCamera = z;
            return this;
        }

        public Builder setUsingLiveStreamMixer(boolean z) {
            this.usingLiveStreamMixer = z;
            return this;
        }

        public Builder setVideoEffectProcessor(IVideoEffectProcessor iVideoEffectProcessor) {
            this.mVideoEffectProcessor = iVideoEffectProcessor;
            return this;
        }

        public Builder setLogMonitor(ILogMonitor iLogMonitor) {
            this.mLogMonitor = iLogMonitor;
            this.mLogUploader = new ILogUploader() {
                public void uploadLog(JSONObject jSONObject) {
                    Builder.this.mLogMonitor.onLogMonitor("live_client_monitor_log", jSONObject);
                }
            };
            return this;
        }

        public Builder setupSdkParams(String str) {
            super.setupSdkParams(str);
            try {
                this.mSdkParams = new JSONObject(str);
            } catch (Exception unused) {
            }
            return this;
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2) {
            return super.create(handler, handler2);
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule) {
            return super.create(handler, handler2, audioDeviceModule);
        }

        /* access modifiers changed from: protected */
        public ILiveStream createLiveStream(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
            return super.create(handler, handler2, audioDeviceModule, iVideoEffectProcessor);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$ILiveCoreWarningListener */
    public interface ILiveCoreWarningListener {
        void onWarning(int i, int i2, Exception exc);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LiveCore$InteractConfig */
    public static class InteractConfig extends Config {
        private String mBackgroundColor;
        private String mMixStreamUrl;
        private StreamMixer mMixer;

        public String getBackgroundColor() {
            return this.mBackgroundColor;
        }

        public String getMixStreamRtmpUrl() {
            return this.mMixStreamUrl;
        }

        public StreamMixer getStreamMixer() {
            return this.mMixer;
        }

        public InteractConfig setBackgroundColor(String str) {
            this.mBackgroundColor = str;
            return this;
        }

        public InteractConfig setMixStreamRtmpUrl(String str) {
            this.mMixStreamUrl = str;
            return this;
        }

        public InteractConfig setStreamMixer(StreamMixer streamMixer) {
            this.mMixer = streamMixer;
            return this;
        }
    }

    public abstract Client create(InteractConfig interactConfig, boolean z);

    public abstract AudioDeviceModule getADM();

    /* access modifiers changed from: protected */
    public abstract Builder getInternalBuilder();

    public abstract boolean getPreviewFitMode();

    public abstract boolean getPreviewMirror(boolean z);

    public abstract VsyncModule getVsyncModule();

    public abstract void setDisplay(SurfaceView surfaceView);

    public abstract void setPreviewFitMode(boolean z);

    public abstract void setPreviewMirror(boolean z, boolean z2);

    public void setRenderSink(VideoSink videoSink) {
    }

    public abstract int startAudioPlayer();

    public abstract int stopAudioPlayer();

    public final Builder getBuilder() {
        return getInternalBuilder();
    }

    public void setWarningListener(ILiveCoreWarningListener iLiveCoreWarningListener) {
        this.mWarningListener = iLiveCoreWarningListener;
    }

    /* access modifiers changed from: protected */
    public void onWarning(int i, int i2, Exception exc) {
        if (this.mWarningListener != null) {
            this.mWarningListener.onWarning(i, i2, exc);
        }
    }
}
