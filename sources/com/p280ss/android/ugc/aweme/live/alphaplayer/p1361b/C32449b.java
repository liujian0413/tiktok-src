package com.p280ss.android.ugc.aweme.live.alphaplayer.p1361b;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.text.TextUtils;
import android.view.Surface;
import com.p280ss.android.ugc.aweme.live.alphaplayer.p1360a.C32446a;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.b.b */
public class C32449b extends C32448a<C32449b> {

    /* renamed from: g */
    private MediaPlayer f84668g = new MediaPlayer();

    /* renamed from: h */
    private MediaMetadataRetriever f84669h = new MediaMetadataRetriever();

    /* renamed from: i */
    private String f84670i;

    /* renamed from: j */
    private OnCompletionListener f84671j = new OnCompletionListener() {
        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (C32449b.this.f84664c != null) {
                C32449b.this.f84664c.mo83696a(C32449b.this.f84662a);
            }
        }
    };

    /* renamed from: k */
    private OnPreparedListener f84672k = new OnPreparedListener() {
        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (C32449b.this.f84665d != null) {
                C32449b.this.f84665d.mo83698a(C32449b.this.f84662a);
            }
        }
    };

    /* renamed from: l */
    private OnErrorListener f84673l = new OnErrorListener() {
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (C32449b.this.f84666e != null) {
                C32449b.this.f84666e.mo83699a(C32449b.this.f84662a, i, i2, "");
            }
            return false;
        }
    };

    /* renamed from: m */
    private OnInfoListener f84674m = new OnInfoListener() {
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (i == 3 && C32449b.this.f84667f != null) {
                C32449b.this.f84667f.mo83695a(C32449b.this.f84662a);
            }
            return false;
        }
    };

    /* renamed from: i */
    public final String mo21078i() {
        return "DefaultSystemPlayer";
    }

    /* renamed from: b */
    public final void mo21070b() {
        this.f84668g.prepareAsync();
    }

    /* renamed from: c */
    public final void mo21072c() {
        this.f84668g.start();
    }

    /* renamed from: d */
    public final void mo21073d() {
        this.f84668g.pause();
    }

    /* renamed from: e */
    public final void mo21074e() {
        this.f84668g.stop();
    }

    /* renamed from: f */
    public final void mo21075f() {
        this.f84668g.reset();
        this.f84670i = null;
    }

    /* renamed from: g */
    public final void mo21076g() {
        this.f84668g.release();
        this.f84670i = null;
    }

    public C32449b() {
        this.f84668g.setOnCompletionListener(this.f84671j);
        this.f84668g.setOnPreparedListener(this.f84672k);
        this.f84668g.setOnErrorListener(this.f84673l);
        this.f84668g.setOnInfoListener(this.f84674m);
    }

    /* renamed from: h */
    public final C32446a mo21077h() throws Exception {
        if (!TextUtils.isEmpty(this.f84670i)) {
            this.f84669h.setDataSource(this.f84670i);
            String extractMetadata = this.f84669h.extractMetadata(18);
            String extractMetadata2 = this.f84669h.extractMetadata(19);
            if (!TextUtils.isEmpty(extractMetadata) && !TextUtils.isEmpty(extractMetadata2)) {
                return new C32446a(Integer.parseInt(this.f84669h.extractMetadata(18)), Integer.parseInt(this.f84669h.extractMetadata(19)));
            }
            throw new Exception("retriever get metadata failure");
        }
        throw new Exception("dataSource is null, please set setDataSource firstly");
    }

    /* renamed from: a */
    public final void mo21067a(Surface surface) {
        this.f84668g.setSurface(surface);
    }

    /* renamed from: a */
    public final void mo21068a(String str) throws IOException {
        this.f84670i = str;
        this.f84668g.setDataSource(str);
    }

    /* renamed from: b */
    public final void mo21071b(boolean z) {
        this.f84668g.setScreenOnWhilePlaying(z);
    }

    /* renamed from: a */
    public final void mo21069a(boolean z) {
        this.f84668g.setLooping(false);
    }
}
