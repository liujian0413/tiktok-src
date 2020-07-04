package com.p280ss.ugc.live.sdk.player;

import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.player.ILivePlayer */
public interface ILivePlayer {

    /* renamed from: com.ss.ugc.live.sdk.player.ILivePlayer$PlayerEvent */
    public enum PlayerEvent {
        PREPARED,
        PREPARE_FAILED,
        VIDEO_SIZE_CHANGED,
        PLAY_COMPLETED,
        MEDIA_ERROR,
        RENDERING_START,
        BUFFERING_START,
        BUFFERING_END,
        SEI_UPDATE
    }

    /* renamed from: com.ss.ugc.live.sdk.player.ILivePlayer$StreamType */
    public enum StreamType {
        VIDEO,
        AUDIO,
        OBS,
        SCREENSHOT
    }

    /* renamed from: com.ss.ugc.live.sdk.player.ILivePlayer$a */
    public interface C46248a {
        /* renamed from: a */
        void mo88656a(PlayerEvent playerEvent, int i, String str);
    }

    /* renamed from: a */
    void mo88657a();

    /* renamed from: a */
    void mo88658a(Surface surface);

    /* renamed from: a */
    void mo88659a(SurfaceHolder surfaceHolder);

    /* renamed from: a */
    void mo88660a(C46248a aVar);

    /* renamed from: a */
    void mo88661a(String str, Map<String, String> map, StreamType streamType) throws IOException;

    /* renamed from: b */
    void mo88662b();

    /* renamed from: c */
    void mo88663c();

    /* renamed from: d */
    void mo88664d();

    /* renamed from: e */
    void mo88665e();

    /* renamed from: f */
    void mo88666f();

    /* renamed from: g */
    boolean mo88667g();

    /* renamed from: h */
    long mo88668h();

    /* renamed from: i */
    long mo88669i();
}
