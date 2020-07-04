package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

@C6505uv
public final class ain implements OnAudioFocusChangeListener {

    /* renamed from: a */
    private final AudioManager f40340a;

    /* renamed from: b */
    private final aio f40341b;

    /* renamed from: c */
    private boolean f40342c;

    /* renamed from: d */
    private boolean f40343d;

    /* renamed from: e */
    private boolean f40344e;

    /* renamed from: f */
    private float f40345f = 1.0f;

    public ain(Context context, aio aio) {
        this.f40340a = (AudioManager) context.getSystemService("audio");
        this.f40341b = aio;
    }

    /* renamed from: a */
    public final void mo39488a(boolean z) {
        this.f40344e = z;
        m46017d();
    }

    /* renamed from: a */
    public final void mo39487a(float f) {
        this.f40345f = f;
        m46017d();
    }

    /* renamed from: a */
    public final float mo39486a() {
        float f = this.f40344e ? 0.0f : this.f40345f;
        if (this.f40342c) {
            return f;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void mo39489b() {
        this.f40343d = true;
        m46017d();
    }

    /* renamed from: c */
    public final void mo39490c() {
        this.f40343d = false;
        m46017d();
    }

    public final void onAudioFocusChange(int i) {
        this.f40342c = i > 0;
        this.f40341b.mo39359e();
    }

    /* renamed from: d */
    private final void m46017d() {
        boolean z = false;
        boolean z2 = this.f40343d && !this.f40344e && this.f40345f > 0.0f;
        if (!z2 || this.f40342c) {
            if (!z2 && this.f40342c) {
                if (this.f40340a != null && this.f40342c) {
                    if (this.f40340a.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.f40342c = z;
                }
                this.f40341b.mo39359e();
            }
            return;
        }
        if (this.f40340a != null && !this.f40342c) {
            if (this.f40340a.requestAudioFocus(this, 3, 2) == 1) {
                z = true;
            }
            this.f40342c = z;
        }
        this.f40341b.mo39359e();
    }
}
