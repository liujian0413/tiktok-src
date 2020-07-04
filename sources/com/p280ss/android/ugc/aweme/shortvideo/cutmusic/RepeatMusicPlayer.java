package com.p280ss.android.ugc.aweme.shortvideo.cutmusic;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.util.C42880h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer */
public class RepeatMusicPlayer implements C0042h {

    /* renamed from: a */
    public MediaPlayer f102085a;

    /* renamed from: b */
    public int f102086b;

    /* renamed from: c */
    public Handler f102087c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public Runnable f102088d = new Runnable() {
        public final void run() {
            if (RepeatMusicPlayer.this.f102085a != null && RepeatMusicPlayer.this.f102085a.isPlaying()) {
                int currentPosition = RepeatMusicPlayer.this.f102085a.getCurrentPosition();
                if (currentPosition <= RepeatMusicPlayer.this.f102085a.getDuration()) {
                    if (RepeatMusicPlayer.this.f102089e != null) {
                        RepeatMusicPlayer.this.f102089e.mo97859c(currentPosition);
                    }
                    RepeatMusicPlayer.this.f102087c.post(RepeatMusicPlayer.this.f102088d);
                }
            }
        }
    };

    /* renamed from: e */
    public C39306a f102089e;

    /* renamed from: f */
    private int f102090f;

    /* renamed from: g */
    private Runnable f102091g;

    /* renamed from: h */
    private Handler f102092h = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer$a */
    public interface C39306a {
        /* renamed from: c */
        void mo97859c(int i);
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f102092h.removeCallbacksAndMessages(null);
        this.f102087c.removeCallbacksAndMessages(null);
        mo97852a();
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_PAUSE)
    public void pause() {
        if (this.f102085a != null && this.f102085a.isPlaying()) {
            this.f102085a.pause();
        }
        this.f102087c.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo97852a() {
        C42880h.m136156a("stopMusic() called");
        if (this.f102085a != null) {
            if (this.f102085a.isPlaying()) {
                this.f102085a.pause();
            }
            this.f102085a.stop();
            this.f102085a.release();
            this.f102085a = null;
        }
        this.f102087c.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    private Runnable m125598b(final int i) {
        return new Runnable() {
            public final void run() {
                if (RepeatMusicPlayer.this.f102085a != null) {
                    if (RepeatMusicPlayer.this.f102085a.isPlaying()) {
                        RepeatMusicPlayer.this.f102085a.pause();
                    }
                    RepeatMusicPlayer.this.mo97853a(i);
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo97853a(int i) {
        this.f102086b = i;
        C42880h.m136156a("playMusic() called");
        if (this.f102085a != null) {
            if (this.f102085a.isPlaying()) {
                this.f102085a.pause();
            }
            if (this.f102091g != null) {
                this.f102092h.removeCallbacks(this.f102091g);
            }
            this.f102091g = m125598b(i);
            this.f102085a.seekTo(i);
            this.f102092h.postDelayed(this.f102091g, (long) this.f102090f);
            this.f102085a.start();
            if (this.f102088d != null) {
                this.f102087c.removeCallbacks(this.f102088d);
            }
            this.f102087c.post(this.f102088d);
        }
    }

    /* renamed from: a */
    private void m125597a(Context context, Uri uri) {
        this.f102085a = MediaPlayer.create(context, uri);
        if (this.f102085a != null) {
            this.f102085a.setAudioStreamType(3);
            this.f102085a.setDisplay(null);
            this.f102085a.setOnCompletionListener(new OnCompletionListener() {
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    RepeatMusicPlayer.this.mo97853a(RepeatMusicPlayer.this.f102086b);
                }
            });
        }
    }

    public RepeatMusicPlayer(AmeActivity ameActivity, String str, int i) {
        this.f102090f = i;
        ameActivity.getLifecycle().mo55a(this);
        m125597a(ameActivity, Uri.parse(str));
    }
}
