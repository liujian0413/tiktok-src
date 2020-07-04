package com.p280ss.ugc.live.sdk.player.p1832a;

import com.bytedance.common.utility.C6312h;
import com.p280ss.ttm.player.MediaPlayer;
import com.p280ss.ttm.player.MediaPlayer.OnCompletionListener;
import com.p280ss.ttm.player.MediaPlayer.OnErrorListener;
import com.p280ss.ttm.player.MediaPlayer.OnExternInfoListener;
import com.p280ss.ttm.player.MediaPlayer.OnInfoListener;
import com.p280ss.ttm.player.MediaPlayer.OnLogListener;
import com.p280ss.ttm.player.MediaPlayer.OnPreparedListener;
import com.p280ss.ttm.player.MediaPlayer.OnVideoSizeChangedListener;
import com.p280ss.ttm.player.TTMediaPlayer;
import com.p280ss.ugc.live.sdk.player.ILivePlayer.C46248a;
import com.p280ss.ugc.live.sdk.player.ILivePlayer.PlayerEvent;

/* renamed from: com.ss.ugc.live.sdk.player.a.d */
final class C46255d implements OnCompletionListener, OnErrorListener, OnExternInfoListener, OnInfoListener, OnLogListener, OnPreparedListener, OnVideoSizeChangedListener {

    /* renamed from: a */
    public C46248a f118882a;

    /* renamed from: b */
    private final TTMediaPlayer f118883b;

    /* renamed from: c */
    private final boolean f118884c = C6312h.m19578b();

    public final void onLogInfo(MediaPlayer mediaPlayer, String str) {
    }

    C46255d(TTMediaPlayer tTMediaPlayer) {
        this.f118883b = tTMediaPlayer;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        m145255a(PlayerEvent.PLAY_COMPLETED, 0, "play complete");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        m145255a(PlayerEvent.PREPARED, 0, "player is prepared");
    }

    /* renamed from: a */
    private void m145255a(PlayerEvent playerEvent, int i, String str) {
        if (this.f118882a != null) {
            this.f118882a.mo88656a(playerEvent, i, str);
        }
    }

    public final void onExternInfo(MediaPlayer mediaPlayer, int i, String str) {
        if (19 == i) {
            m145255a(PlayerEvent.SEI_UPDATE, 0, str);
        }
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        PlayerEvent playerEvent = PlayerEvent.VIDEO_SIZE_CHANGED;
        int i3 = (i2 << 16) | i;
        StringBuilder sb = new StringBuilder("videoSizeChanged, width: ");
        sb.append(i);
        sb.append(", height: ");
        sb.append(i2);
        m145255a(playerEvent, i3, sb.toString());
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        PlayerEvent playerEvent = PlayerEvent.MEDIA_ERROR;
        StringBuilder sb = new StringBuilder("play error.code:");
        sb.append(i2);
        m145255a(playerEvent, i, sb.toString());
        if (i != 0) {
            PlayerEvent playerEvent2 = PlayerEvent.PREPARE_FAILED;
            StringBuilder sb2 = new StringBuilder("prepare failed.code:");
            sb2.append(i2);
            m145255a(playerEvent2, i, sb2.toString());
            if (this.f118884c) {
                this.f118883b.getStringOption(5002);
            }
        }
        return false;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            switch (i) {
                case 701:
                    m145255a(PlayerEvent.BUFFERING_START, 0, "player start buffer");
                    break;
                case 702:
                    m145255a(PlayerEvent.BUFFERING_END, 0, "player end buffer");
                    break;
            }
        } else {
            m145255a(PlayerEvent.RENDERING_START, 0, "player start render");
        }
        return false;
    }
}
