package com.bytedance.android.livesdk.gift.effect.video.p388a;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.bytedance.android.livesdkapi.plugin.PluginType;
import com.p280ss.android.ugc.aweme.live.alphaplayer.p1360a.C32446a;
import com.p280ss.android.ugc.aweme.live.alphaplayer.p1361b.C32448a;
import com.p280ss.ttm.player.MediaPlayer;
import com.p280ss.ttm.player.MediaPlayer.OnCompletionListener;
import com.p280ss.ttm.player.MediaPlayer.OnErrorListener;
import com.p280ss.ttm.player.MediaPlayer.OnInfoListener;
import com.p280ss.ttm.player.MediaPlayer.OnPreparedListener;
import com.p280ss.ttm.player.TTPlayerConfiger;
import java.io.IOException;

/* renamed from: com.bytedance.android.livesdk.gift.effect.video.a.a */
public class C8063a extends C32448a<C8063a> {

    /* renamed from: g */
    private static final String f21990g = "a";

    /* renamed from: h */
    private final Context f21991h;

    /* renamed from: i */
    private MediaPlayer f21992i;

    /* renamed from: j */
    private OnPreparedListener f21993j = new OnPreparedListener() {
        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (C8063a.this.f84665d != null) {
                C8063a.this.f84665d.mo83698a(C8063a.this.f84662a);
            }
        }
    };

    /* renamed from: k */
    private OnErrorListener f21994k = new OnErrorListener() {
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (C8063a.this.f84666e != null) {
                C8063a.this.f84666e.mo83699a(C8063a.this.f84662a, i, i2, "TTMediaPlayer on error");
            }
            return false;
        }
    };

    /* renamed from: l */
    private OnCompletionListener f21995l = new OnCompletionListener() {
        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (C8063a.this.f84664c != null) {
                C8063a.this.f84664c.mo83696a(C8063a.this.f84662a);
            }
        }
    };

    /* renamed from: m */
    private OnInfoListener f21996m = new OnInfoListener() {
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (i == 3 && C8063a.this.f84667f != null) {
                C8063a.this.f84667f.mo83695a(C8063a.this.f84662a);
            }
            return false;
        }
    };

    /* renamed from: i */
    public final String mo21078i() {
        return "TTMediaPlayer";
    }

    /* renamed from: c */
    public final void mo21072c() {
        this.f21992i.start();
    }

    /* renamed from: d */
    public final void mo21073d() {
        this.f21992i.pause();
    }

    /* renamed from: e */
    public final void mo21074e() {
        this.f21992i.stop();
    }

    /* renamed from: f */
    public final void mo21075f() {
        this.f21992i.reset();
    }

    /* renamed from: g */
    public final void mo21076g() {
        this.f21992i.release();
    }

    /* renamed from: b */
    public final void mo21070b() {
        super.mo21070b();
        this.f21992i.prepareAsync();
    }

    /* renamed from: j */
    private MediaPlayer m24735j() {
        TTPlayerConfiger.setValue(2, false);
        TTPlayerConfiger.setValue(1, true);
        TTPlayerConfiger.setValue(11, true);
        return C8073d.m24770a(this.f21991h);
    }

    /* renamed from: h */
    public final C32446a mo21077h() throws Exception {
        return new C32446a(this.f21992i.getVideoWidth(), this.f21992i.getVideoHeight());
    }

    /* renamed from: a */
    public final C8063a mo21066a() throws Exception {
        if (PluginType.Player.isInstalled()) {
            MediaPlayer j = m24735j();
            if (j == null) {
                j = m24735j();
                if (j == null || j.isOSPlayer()) {
                    throw new Exception("create ttplayer failure");
                }
            }
            this.f21992i = j;
            this.f21992i.setIntOption(36, 1);
            this.f21992i.setOnPreparedListener(this.f21993j);
            this.f21992i.setOnErrorListener(this.f21994k);
            this.f21992i.setOnCompletionListener(this.f21995l);
            this.f21992i.setOnInfoListener(this.f21996m);
            return this;
        }
        throw new IllegalStateException("ttm plugin not installed");
    }

    /* renamed from: a */
    public final void mo21067a(Surface surface) {
        this.f21992i.setSurface(surface);
    }

    /* renamed from: a */
    public final void mo21069a(boolean z) {
        this.f21992i.setLooping(false);
    }

    /* renamed from: b */
    public final void mo21071b(boolean z) {
        super.mo21071b(z);
        this.f21992i.setScreenOnWhilePlaying(true);
    }

    public C8063a(Context context) {
        super(context);
        this.f21991h = context;
    }

    /* renamed from: a */
    public final void mo21068a(String str) throws IOException {
        super.mo21068a(str);
        if (this.f21992i.isPlaying()) {
            this.f21992i.stop();
        }
        this.f21992i.reset();
        this.f21992i.setDataSource(this.f21991h, Uri.parse(str));
    }
}
