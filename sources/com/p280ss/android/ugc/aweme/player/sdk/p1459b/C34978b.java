package com.p280ss.android.ugc.aweme.player.sdk.p1459b;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34971a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34975e;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34967c;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34969e;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34970f;
import com.p280ss.android.ugc.playerkit.p1750a.C44907a;
import com.p280ss.android.ugc.playerkit.p1750a.C44909c;
import com.p280ss.ttvideoengine.p1812e.C46083h;
import com.p280ss.ugc.live.sdk.player.C46256b;
import com.p280ss.ugc.live.sdk.player.ILivePlayer;
import com.p280ss.ugc.live.sdk.player.ILivePlayer.C46248a;
import com.p280ss.ugc.live.sdk.player.ILivePlayer.PlayerEvent;
import com.p280ss.ugc.live.sdk.player.ILivePlayer.StreamType;
import com.p280ss.ugc.live.sdk.player.p1832a.C46254c;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.b.b */
public final class C34978b implements IPlayer, C46248a {

    /* renamed from: a */
    private ILivePlayer f91267a;

    /* renamed from: b */
    private C34967c f91268b;

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.b.b$a */
    class C34981a implements ILivePlayer {
        /* renamed from: a */
        public final void mo88657a() {
        }

        /* renamed from: a */
        public final void mo88658a(Surface surface) {
        }

        /* renamed from: a */
        public final void mo88659a(SurfaceHolder surfaceHolder) {
        }

        /* renamed from: a */
        public final void mo88660a(C46248a aVar) {
        }

        /* renamed from: a */
        public final void mo88661a(String str, Map<String, String> map, StreamType streamType) throws IOException {
        }

        /* renamed from: b */
        public final void mo88662b() {
        }

        /* renamed from: c */
        public final void mo88663c() {
        }

        /* renamed from: d */
        public final void mo88664d() {
        }

        /* renamed from: e */
        public final void mo88665e() {
        }

        /* renamed from: f */
        public final void mo88666f() {
        }

        /* renamed from: g */
        public final boolean mo88667g() {
            return false;
        }

        /* renamed from: h */
        public final long mo88668h() {
            return 0;
        }

        /* renamed from: i */
        public final long mo88669i() {
            return 0;
        }

        C34981a() {
        }
    }

    /* renamed from: a */
    public final void mo88573a() {
    }

    /* renamed from: a */
    public final void mo88574a(float f) {
    }

    /* renamed from: a */
    public final void mo88575a(float f, float f2) {
    }

    /* renamed from: a */
    public final void mo88576a(long j) {
    }

    /* renamed from: a */
    public final void mo88580a(C34975e eVar) {
    }

    /* renamed from: a */
    public final void mo88581a(C44907a aVar) {
    }

    /* renamed from: a */
    public final void mo88582a(C46083h hVar, Map<String, Object> map) throws IOException {
    }

    /* renamed from: a */
    public final void mo88583a(String str) {
    }

    /* renamed from: a */
    public final void mo88584a(String str, C34971a aVar) {
    }

    /* renamed from: a */
    public final void mo88586a(boolean z) {
    }

    /* renamed from: b */
    public final void mo88588b(boolean z) {
    }

    /* renamed from: c */
    public final boolean mo88590c(boolean z) {
        return false;
    }

    /* renamed from: g */
    public final boolean mo88594g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo88595h() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo88596i() {
        return false;
    }

    /* renamed from: j */
    public final boolean mo88597j() {
        return false;
    }

    /* renamed from: l */
    public final long mo88599l() {
        return 0;
    }

    /* renamed from: m */
    public final long mo88600m() {
        return 0;
    }

    /* renamed from: n */
    public final String mo88601n() {
        return null;
    }

    /* renamed from: o */
    public final String mo88602o() {
        return "";
    }

    /* renamed from: p */
    public final C34970f mo88603p() {
        return null;
    }

    /* renamed from: q */
    public final C34969e mo88604q() {
        return null;
    }

    /* renamed from: a */
    public final void mo88656a(PlayerEvent playerEvent, int i, String str) {
        switch (playerEvent) {
            case RENDERING_START:
                this.f91268b.mo88608b();
                return;
            case MEDIA_ERROR:
                this.f91268b.mo88606a(0, i, str);
                return;
            case PLAY_COMPLETED:
                this.f91268b.mo88609c();
                return;
            case PREPARED:
                this.f91268b.mo88605a();
                return;
            case VIDEO_SIZE_CHANGED:
                return;
            case SEI_UPDATE:
                return;
            case BUFFERING_START:
                this.f91268b.mo88607a(true);
                return;
            case BUFFERING_END:
                this.f91268b.mo88607a(false);
                break;
        }
    }

    /* renamed from: a */
    public final void mo88585a(String str, Map<String, Object> map) throws IOException {
        this.f91267a.mo88661a(str, null, ((Boolean) map.get("stream_type")).booleanValue() ? StreamType.AUDIO : StreamType.VIDEO);
        this.f91267a.mo88662b();
    }

    /* renamed from: b */
    public final void mo88587b() {
        this.f91267a.mo88663c();
    }

    /* renamed from: c */
    public final void mo88589c() {
        this.f91267a.mo88664d();
    }

    /* renamed from: d */
    public final void mo88591d() {
        this.f91267a.mo88665e();
    }

    /* renamed from: e */
    public final void mo88592e() {
        this.f91267a.mo88666f();
    }

    /* renamed from: f */
    public final void mo88593f() {
        this.f91267a.mo88657a();
    }

    /* renamed from: k */
    public final boolean mo88598k() {
        return this.f91267a.mo88667g();
    }

    /* renamed from: a */
    public final float mo88572a(int i) {
        float f = -1.0f;
        if (this.f91267a == null) {
            return -1.0f;
        }
        switch (i) {
            case 6:
                f = (float) this.f91267a.mo88668h();
                break;
            case 7:
                f = (float) this.f91267a.mo88669i();
                break;
        }
        return f;
    }

    /* renamed from: a */
    public final void mo88577a(Surface surface) {
        this.f91267a.mo88658a(surface);
    }

    /* renamed from: a */
    public final void mo88578a(SurfaceHolder surfaceHolder) {
        this.f91267a.mo88659a(surfaceHolder);
    }

    /* renamed from: a */
    public final void mo88579a(C34967c cVar) {
        this.f91268b = cVar;
    }

    public C34978b(Context context, SparseIntArray sparseIntArray, final C44909c cVar) {
        try {
            C46254c cVar2 = new C46254c(context);
            C46254c a = cVar2.mo114257a(false).mo114256a((C46256b) new C46256b() {
            });
            if (sparseIntArray != null) {
                for (int i = 0; i < sparseIntArray.size(); i++) {
                    a.mo114255a(sparseIntArray.keyAt(i), sparseIntArray.valueAt(i));
                }
            }
            this.f91267a = a.mo114254a();
        } catch (Exception unused) {
            this.f91267a = new C34981a();
        }
        this.f91267a.mo88660a((C46248a) this);
    }
}
