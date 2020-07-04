package com.p280ss.android.ugc.aweme.common.widget.datepicker;

import android.media.AudioManager;
import android.media.SoundPool;

/* renamed from: com.ss.android.ugc.aweme.common.widget.datepicker.a */
public final class C25762a {

    /* renamed from: a */
    private SoundPool f67987a;

    /* renamed from: b */
    private AudioManager f67988b;

    /* renamed from: c */
    private float f67989c;

    /* renamed from: d */
    private int f67990d;

    /* renamed from: a */
    public final void mo66842a() {
        this.f67989c = (float) this.f67988b.getStreamVolume(1);
        if (this.f67990d > 0) {
            this.f67987a.play(this.f67990d, this.f67989c, this.f67989c, 0, 0, 1.0f);
        } else {
            this.f67988b.playSoundEffect(0, this.f67989c);
        }
    }
}
