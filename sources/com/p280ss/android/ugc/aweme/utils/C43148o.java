package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

/* renamed from: com.ss.android.ugc.aweme.utils.o */
public final class C43148o {

    /* renamed from: a */
    public OnAudioFocusChangeListener f111773a = new OnAudioFocusChangeListener() {
        public final void onAudioFocusChange(int i) {
        }
    };

    /* renamed from: b */
    private AudioManager f111774b;

    public C43148o(Context context) {
        this.f111774b = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    /* renamed from: a */
    public final void mo104769a(Context context) {
        try {
            if (this.f111774b == null) {
                this.f111774b = (AudioManager) context.getApplicationContext().getSystemService("audio");
            }
            if (!(this.f111774b == null || this.f111773a == null)) {
                this.f111774b.requestAudioFocus(this.f111773a, 3, 2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo104770b(Context context) {
        try {
            if (this.f111774b == null) {
                this.f111774b = (AudioManager) context.getApplicationContext().getSystemService("audio");
            }
            if (!(this.f111774b == null || this.f111773a == null)) {
                this.f111774b.abandonAudioFocus(this.f111773a);
            }
            this.f111774b = null;
        } catch (Exception unused) {
        }
    }
}
