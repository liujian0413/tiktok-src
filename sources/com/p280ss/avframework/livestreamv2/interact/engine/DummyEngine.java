package com.p280ss.avframework.livestreamv2.interact.engine;

import com.p280ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.p280ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.p280ss.avframework.livestreamv2.interact.model.Config;
import com.p280ss.avframework.livestreamv2.interact.model.Region;
import com.p280ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics.RenderVideoFpsStatisticsReport;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import com.p280ss.avframework.utils.AVLog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.interact.engine.DummyEngine */
public class DummyEngine extends Engine {
    private EngineCallback mEngineCallback;

    /* access modifiers changed from: protected */
    public String getVendor() {
        return "dummy";
    }

    public ArrayList<RenderVideoFpsStatisticsReport> getVideoRenderFpsReport() {
        return null;
    }

    public void mixStream(List<Region> list, boolean z) {
    }

    public void muteAllRemoteAudioStreams(boolean z) {
    }

    public void muteRemoteAudioStream(int i, boolean z) {
    }

    public void pause() {
    }

    public void resume() {
    }

    public void stop() {
    }

    public void switchAudio(boolean z) {
    }

    public void init() {
        if (this.mEngineCallback != null) {
            this.mEngineCallback.onInitFailed(-1, "Current is dummy engine.");
        }
    }

    public void start() {
        if (this.mEngineCallback != null) {
            this.mEngineCallback.onStartFailed(-1, "Current is dummy engine.");
        }
    }

    DummyEngine(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, EngineCallback engineCallback) {
        super(config, videoClientFactory, audioClientFactory, engineCallback);
        this.mEngineCallback = engineCallback;
        AVLog.ioi("DummyEngine", "Using dummy intereact engine.");
    }
}
