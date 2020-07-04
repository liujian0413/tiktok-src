package com.p280ss.android.ugc.aweme.account.common.widget.datepicker;

import android.media.AudioManager;
import android.media.SoundPool;

/* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.a */
public final class C21163a {

    /* renamed from: a */
    private SoundPool f56893a;

    /* renamed from: b */
    private AudioManager f56894b;

    /* renamed from: c */
    private float f56895c;

    /* renamed from: d */
    private int f56896d;

    /* renamed from: a */
    public final void mo57083a() {
        this.f56895c = (float) this.f56894b.getStreamVolume(1);
        if (this.f56896d > 0) {
            this.f56893a.play(this.f56896d, this.f56895c, this.f56895c, 0, 0, 1.0f);
        } else {
            this.f56894b.playSoundEffect(0, this.f56895c);
        }
    }
}
