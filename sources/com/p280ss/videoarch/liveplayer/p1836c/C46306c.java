package com.p280ss.videoarch.liveplayer.p1836c;

import android.content.Context;
import android.media.AudioManager;
import com.p280ss.ttm.player.MediaPlayer;

/* renamed from: com.ss.videoarch.liveplayer.c.c */
public final class C46306c {

    /* renamed from: a */
    public MediaPlayer f118967a = null;

    /* renamed from: b */
    private final Context f118968b;

    /* renamed from: c */
    private float f118969c;

    /* renamed from: a */
    private float m145351a() {
        int i;
        if (this.f118968b == null) {
            return 0.0f;
        }
        AudioManager audioManager = (AudioManager) this.f118968b.getSystemService("audio");
        if (audioManager != null) {
            i = audioManager.getStreamMaxVolume(3);
        } else {
            i = 0;
        }
        if (i < 0) {
            i = 0;
        }
        return (float) i;
    }

    /* renamed from: b */
    private float m145352b() {
        int i;
        if (this.f118968b == null) {
            return 0.0f;
        }
        AudioManager audioManager = (AudioManager) this.f118968b.getSystemService("audio");
        if (audioManager != null) {
            i = audioManager.getStreamVolume(3);
        } else {
            i = 0;
        }
        if (i < 0) {
            i = 0;
        }
        return (float) i;
    }

    /* renamed from: a */
    public final void mo115057a(float f) {
        if (this.f118967a != null) {
            AudioManager audioManager = (AudioManager) this.f118968b.getSystemService("audio");
            if (audioManager != null) {
                audioManager.setStreamVolume(3, (int) f, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo115058a(boolean z) {
        if (this.f118967a != null) {
            if (this.f118967a.isOSPlayer()) {
                float a = m145351a();
                if (a > 0.0f) {
                    this.f118969c = m145352b() / a;
                }
                if (z) {
                    this.f118967a.setVolume(0.0f, 0.0f);
                } else {
                    this.f118967a.setVolume(this.f118969c, this.f118969c);
                }
            } else {
                this.f118967a.setIsMute(z);
            }
        }
    }

    public C46306c(Context context, MediaPlayer mediaPlayer) {
        this.f118968b = context;
    }
}
