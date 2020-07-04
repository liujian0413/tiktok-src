package com.p280ss.ugc.live.sdk.player.p1832a;

import android.content.Context;
import android.net.Uri;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p280ss.ttm.player.TTMediaPlayer;
import com.p280ss.ttm.player.TTPlayerConfiger;
import com.p280ss.ugc.live.sdk.player.C46249a;
import com.p280ss.ugc.live.sdk.player.ILivePlayer.C46248a;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.player.a.b */
final class C46253b extends C46249a {

    /* renamed from: a */
    private static final SparseIntArray f118873a;

    /* renamed from: b */
    private final Context f118874b;

    /* renamed from: c */
    private final TTMediaPlayer f118875c;

    /* renamed from: d */
    private final C46255d f118876d;

    /* renamed from: e */
    private C46248a f118877e;

    /* renamed from: f */
    public final void mo88666f() {
        this.f118875c.release();
    }

    /* renamed from: g */
    public final boolean mo88667g() {
        return this.f118875c.isPlaying();
    }

    /* renamed from: j */
    public final void mo114242j() {
        this.f118875c.reset();
    }

    /* renamed from: l */
    public final void mo114244l() {
        this.f118875c.start();
    }

    /* renamed from: m */
    public final void mo114245m() {
        this.f118875c.pause();
    }

    /* renamed from: n */
    public final void mo114246n() {
        this.f118875c.stop();
    }

    /* renamed from: h */
    public final long mo88668h() {
        return this.f118875c.getLongOption(72, 0);
    }

    /* renamed from: i */
    public final long mo88669i() {
        return this.f118875c.getLongOption(73, 0);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f118873a = sparseIntArray;
        sparseIntArray.put(0, 0);
        f118873a.put(1, 1);
        f118873a.put(2, 2);
        f118873a.put(3, 3);
    }

    /* renamed from: k */
    public final void mo114243k() {
        this.f118875c.setIntOption(38, 0);
        this.f118875c.setIntOption(87, 1);
        TTPlayerConfiger.setValue(11, true);
        this.f118875c.prepareAsync();
    }

    /* renamed from: a */
    public final void mo88658a(Surface surface) {
        this.f118875c.setSurface(surface);
        this.f118875c.setScreenOnWhilePlaying(true);
    }

    /* renamed from: b */
    public final void mo114241b(C46248a aVar) {
        if (this.f118876d != null) {
            this.f118876d.f118882a = aVar;
        } else {
            this.f118877e = aVar;
        }
    }

    /* renamed from: a */
    public final void mo88659a(SurfaceHolder surfaceHolder) {
        this.f118875c.setDisplay(surfaceHolder);
        this.f118875c.setScreenOnWhilePlaying(true);
    }

    /* renamed from: a */
    public final void mo114240a(String str, Map<String, String> map) throws IOException {
        Uri uri;
        try {
            if (str.indexOf("://") <= 0) {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(str);
                uri = Uri.parse(sb.toString());
            } else {
                uri = Uri.parse(str);
            }
            this.f118875c.setDataSource(this.f118874b, uri, map);
        } catch (IOException unused) {
        }
    }

    C46253b(C46254c cVar, TTMediaPlayer tTMediaPlayer) {
        super(new C46252a(cVar.f118880c, tTMediaPlayer));
        this.f118874b = cVar.f118878a;
        this.f118875c = tTMediaPlayer;
        this.f118876d = new C46255d(tTMediaPlayer);
        if (this.f118877e != null) {
            this.f118876d.f118882a = this.f118877e;
            this.f118877e = null;
        }
        tTMediaPlayer.setOnPreparedListener(this.f118876d);
        tTMediaPlayer.setOnErrorListener(this.f118876d);
        tTMediaPlayer.setOnInfoListener(this.f118876d);
        tTMediaPlayer.setOnLogListener(this.f118876d);
        tTMediaPlayer.setOnCompletionListener(this.f118876d);
        tTMediaPlayer.setOnVideoSizeChangedListener(this.f118876d);
        tTMediaPlayer.setOnExternInfoListener(this.f118876d);
        tTMediaPlayer.setIntOption(52, 1);
        tTMediaPlayer.setIntOption(24, 5);
    }
}
