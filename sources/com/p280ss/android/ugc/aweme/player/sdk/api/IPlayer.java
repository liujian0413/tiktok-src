package com.p280ss.android.ugc.aweme.player.sdk.api;

import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p280ss.android.ugc.playerkit.p1750a.C44907a;
import com.p280ss.ttvideoengine.p1812e.C46083h;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.api.IPlayer */
public interface IPlayer {

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.api.IPlayer$PlayerEvent */
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

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.api.IPlayer$StreamType */
    public enum StreamType {
        VIDEO,
        AUDIO,
        OBS
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.api.IPlayer$a */
    public static class C34965a implements C34967c {
        /* renamed from: a */
        public final void mo88605a() {
        }

        /* renamed from: a */
        public final void mo88606a(int i, int i2, Object obj) {
        }

        /* renamed from: a */
        public final void mo88607a(boolean z) {
        }

        /* renamed from: b */
        public final void mo88608b() {
        }

        /* renamed from: c */
        public final void mo88609c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.api.IPlayer$b */
    public interface C34966b {
        /* renamed from: a */
        boolean mo88610a(Surface surface);
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.api.IPlayer$c */
    public interface C34967c {
        /* renamed from: a */
        void mo88605a();

        /* renamed from: a */
        void mo88606a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo88607a(boolean z);

        /* renamed from: b */
        void mo88608b();

        /* renamed from: c */
        void mo88609c();
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.api.IPlayer$d */
    public static class C34968d {

        /* renamed from: a */
        public long f91252a;

        /* renamed from: b */
        public long f91253b;

        /* renamed from: c */
        public long f91254c;

        /* renamed from: d */
        public long f91255d;

        /* renamed from: e */
        public long f91256e;

        /* renamed from: f */
        public long f91257f;
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.api.IPlayer$e */
    public static class C34969e {

        /* renamed from: a */
        public volatile int f91258a;

        /* renamed from: b */
        public volatile int f91259b;

        /* renamed from: c */
        public volatile int f91260c;

        /* renamed from: d */
        public volatile int f91261d;

        /* renamed from: e */
        public volatile long f91262e;

        /* renamed from: f */
        public volatile C34968d f91263f;
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.api.IPlayer$f */
    public static class C34970f {

        /* renamed from: a */
        public String f91264a;

        /* renamed from: b */
        public Bundle f91265b;
    }

    /* renamed from: a */
    float mo88572a(int i);

    /* renamed from: a */
    void mo88573a();

    /* renamed from: a */
    void mo88574a(float f);

    /* renamed from: a */
    void mo88575a(float f, float f2);

    /* renamed from: a */
    void mo88576a(long j);

    /* renamed from: a */
    void mo88577a(Surface surface);

    /* renamed from: a */
    void mo88578a(SurfaceHolder surfaceHolder);

    /* renamed from: a */
    void mo88579a(C34967c cVar);

    /* renamed from: a */
    void mo88580a(C34975e eVar);

    /* renamed from: a */
    void mo88581a(C44907a aVar);

    /* renamed from: a */
    void mo88582a(C46083h hVar, Map<String, Object> map) throws IOException;

    /* renamed from: a */
    void mo88583a(String str);

    /* renamed from: a */
    void mo88584a(String str, C34971a aVar);

    /* renamed from: a */
    void mo88585a(String str, Map<String, Object> map) throws IOException;

    /* renamed from: a */
    void mo88586a(boolean z);

    /* renamed from: b */
    void mo88587b();

    /* renamed from: b */
    void mo88588b(boolean z);

    /* renamed from: c */
    void mo88589c();

    /* renamed from: c */
    boolean mo88590c(boolean z);

    /* renamed from: d */
    void mo88591d();

    /* renamed from: e */
    void mo88592e();

    /* renamed from: f */
    void mo88593f();

    /* renamed from: g */
    boolean mo88594g();

    /* renamed from: h */
    boolean mo88595h();

    /* renamed from: i */
    boolean mo88596i();

    /* renamed from: j */
    boolean mo88597j();

    /* renamed from: k */
    boolean mo88598k();

    /* renamed from: l */
    long mo88599l();

    /* renamed from: m */
    long mo88600m();

    /* renamed from: n */
    String mo88601n();

    /* renamed from: o */
    String mo88602o();

    /* renamed from: p */
    C34970f mo88603p();

    /* renamed from: q */
    C34969e mo88604q();
}
