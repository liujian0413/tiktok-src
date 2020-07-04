package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

@C6505uv
public final class adh {

    /* renamed from: a */
    private boolean f40027a;

    /* renamed from: b */
    private float f40028b = 1.0f;

    /* renamed from: a */
    public final synchronized void mo39210a(float f) {
        this.f40028b = f;
    }

    /* renamed from: a */
    public final synchronized float mo39209a() {
        if (!m45631c()) {
            return 1.0f;
        }
        return this.f40028b;
    }

    /* renamed from: a */
    public final synchronized void mo39211a(boolean z) {
        this.f40027a = z;
    }

    /* renamed from: b */
    public final synchronized boolean mo39212b() {
        return this.f40027a;
    }

    /* renamed from: c */
    private final synchronized boolean m45631c() {
        return this.f40028b >= 0.0f;
    }

    /* renamed from: a */
    public static float m45630a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }
}
