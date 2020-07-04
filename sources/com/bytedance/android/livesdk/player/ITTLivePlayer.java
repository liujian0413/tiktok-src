package com.bytedance.android.livesdk.player;

import android.graphics.Point;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

public interface ITTLivePlayer {

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

    public enum StreamType {
        VIDEO,
        AUDIO,
        OBS,
        SCREENSHOT
    }

    /* renamed from: com.bytedance.android.livesdk.player.ITTLivePlayer$a */
    public interface C8752a {
        /* renamed from: a */
        void mo21779a(PlayerEvent playerEvent, int i, String str);
    }

    /* renamed from: a */
    void mo21757a();

    /* renamed from: a */
    void mo21758a(int i);

    /* renamed from: a */
    void mo21759a(Surface surface);

    /* renamed from: a */
    void mo21760a(SurfaceHolder surfaceHolder);

    /* renamed from: a */
    void mo21761a(C8752a aVar);

    /* renamed from: a */
    void mo21762a(String str);

    /* renamed from: a */
    void mo21763a(String str, String str2) throws IOException;

    /* renamed from: a */
    void mo21764a(String str, Map<String, String> map, StreamType streamType) throws IOException;

    /* renamed from: a */
    void mo21765a(boolean z);

    /* renamed from: a */
    void mo21766a(boolean z, boolean z2, int i);

    /* renamed from: b */
    void mo21767b();

    /* renamed from: b */
    void mo21768b(String str);

    /* renamed from: b */
    void mo21769b(boolean z);

    /* renamed from: c */
    void mo21770c();

    /* renamed from: c */
    void mo21771c(boolean z);

    /* renamed from: d */
    void mo21772d();

    /* renamed from: e */
    void mo21773e();

    /* renamed from: f */
    void mo21774f();

    /* renamed from: g */
    boolean mo21775g();

    /* renamed from: h */
    boolean mo21776h();

    /* renamed from: i */
    Point mo21777i();

    /* renamed from: j */
    JSONObject mo21778j();
}
