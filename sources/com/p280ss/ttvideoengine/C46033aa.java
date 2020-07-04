package com.p280ss.ttvideoengine;

import com.p280ss.ttvideoengine.p1816i.C46117c;

/* renamed from: com.ss.ttvideoengine.aa */
public interface C46033aa {
    void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i);

    void onCompletion(TTVideoEngine tTVideoEngine);

    void onError(C46117c cVar);

    void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i);

    void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i);

    void onPrepare(TTVideoEngine tTVideoEngine);

    void onPrepared(TTVideoEngine tTVideoEngine);

    void onRenderStart(TTVideoEngine tTVideoEngine);

    void onStreamChanged(TTVideoEngine tTVideoEngine, int i);

    void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2);

    void onVideoStatusException(int i);
}
