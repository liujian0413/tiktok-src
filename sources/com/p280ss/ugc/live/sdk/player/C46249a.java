package com.p280ss.ugc.live.sdk.player;

import com.p280ss.ugc.live.sdk.p1831a.C46243a;
import com.p280ss.ugc.live.sdk.p1831a.C46244b;
import com.p280ss.ugc.live.sdk.player.ILivePlayer.C46248a;
import com.p280ss.ugc.live.sdk.player.ILivePlayer.PlayerEvent;
import com.p280ss.ugc.live.sdk.player.ILivePlayer.StreamType;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.player.a */
public abstract class C46249a implements ILivePlayer {

    /* renamed from: a */
    private final C46257c f118866a;

    /* renamed from: b */
    private final C46251a f118867b;

    /* renamed from: c */
    private C46244b f118868c;

    /* renamed from: com.ss.ugc.live.sdk.player.a$a */
    static class C46251a implements C46248a {

        /* renamed from: a */
        public C46248a f118870a;

        /* renamed from: b */
        private final C46257c f118871b;

        private C46251a(C46257c cVar) {
            this.f118871b = cVar;
        }

        /* renamed from: a */
        public final void mo88656a(PlayerEvent playerEvent, int i, String str) {
            switch (playerEvent) {
                case RENDERING_START:
                    this.f118871b.mo114267f();
                    break;
                case PREPARE_FAILED:
                    this.f118871b.mo114259a(i);
                    break;
                case BUFFERING_START:
                    this.f118871b.mo114268g();
                    break;
                case BUFFERING_END:
                    this.f118871b.mo114269h();
                    break;
                case SEI_UPDATE:
                    this.f118871b.mo114260a(str);
                    break;
            }
            if (this.f118870a != null) {
                this.f118870a.mo88656a(playerEvent, i, str);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo114240a(String str, Map<String, String> map) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo114241b(C46248a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo114242j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo114243k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo114244l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo114245m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo114246n();

    /* renamed from: a */
    public final void mo88657a() {
        mo114242j();
        this.f118866a.mo114258a();
    }

    /* renamed from: b */
    public final void mo88662b() {
        this.f118866a.mo114263b();
        mo114243k();
    }

    /* renamed from: c */
    public final void mo88663c() {
        mo114244l();
        this.f118866a.mo114264c();
    }

    /* renamed from: d */
    public final void mo88664d() {
        mo114245m();
        this.f118866a.mo114265d();
    }

    /* renamed from: e */
    public final void mo88665e() {
        mo114246n();
        this.f118866a.mo114266e();
    }

    /* renamed from: a */
    public final void mo88660a(C46248a aVar) {
        this.f118867b.f118870a = aVar;
    }

    public C46249a(C46257c cVar) {
        this.f118866a = cVar;
        this.f118867b = new C46251a(cVar);
        mo114241b(this.f118867b);
    }

    /* renamed from: a */
    public final void mo88661a(String str, Map<String, String> map, StreamType streamType) throws IOException {
        String a = C46243a.m145197a(str, this.f118868c);
        this.f118866a.mo114261a(str, a, streamType);
        mo114240a(a, null);
    }
}
