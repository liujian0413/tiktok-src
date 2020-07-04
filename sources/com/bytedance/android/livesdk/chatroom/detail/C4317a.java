package com.bytedance.android.livesdk.chatroom.detail;

import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.room.C3481a;
import com.bytedance.android.livesdk.utils.C9069i;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.a */
public final class C4317a implements C3481a {

    /* renamed from: a */
    public int f12537a;

    /* renamed from: b */
    public final ILivePlayController f12538b;

    /* renamed from: c */
    public boolean f12539c = false;

    /* renamed from: d */
    public long f12540d = -1;

    /* renamed from: e */
    public Context f12541e;

    /* renamed from: f */
    private final OnAudioFocusChangeListener f12542f = new OnAudioFocusChangeListener() {
        public final void onAudioFocusChange(int i) {
            C4317a.this.f12537a = i;
            if (C4317a.this.f12539c) {
                if (i == -2 || i == -3) {
                    C4317a.this.f12540d = System.currentTimeMillis();
                    C4317a.this.f12538b.mo21785a(true, C4317a.this.f12541e);
                } else if (i != 1) {
                    if (i == -1) {
                        C4317a.this.f12540d = System.currentTimeMillis();
                        C4317a.this.f12538b.mo21785a(true, C4317a.this.f12541e);
                    }
                } else if (!(C4317a.this.f12541e instanceof FragmentActivity) || ((FragmentActivity) C4317a.this.f12541e).getLifecycle().mo54a().isAtLeast(State.RESUMED)) {
                    C4317a.this.f12540d = -1;
                    C4317a.this.f12538b.mo21785a(false, C4317a.this.f12541e);
                }
            }
        }
    };

    /* renamed from: a */
    public final void mo11992a() {
        C9069i.m27077b(this.f12542f);
    }

    public C4317a(ILivePlayController iLivePlayController) {
        this.f12538b = iLivePlayController;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11994a(boolean z) {
        this.f12539c = z;
        if (z && this.f12537a == -1) {
            this.f12540d = System.currentTimeMillis();
            this.f12538b.mo21785a(true, this.f12541e);
        }
    }

    /* renamed from: b */
    public final void mo11995b(Context context) {
        if (this.f12538b != null) {
            this.f12538b.mo21785a(true, context);
        }
        mo11992a();
        C9069i.m27076b();
    }

    /* renamed from: a */
    public final void mo11993a(Context context) {
        this.f12541e = context;
        C9069i.m27075a(this.f12542f);
        if (C9069i.m27074a() == 1) {
            this.f12540d = -1;
            this.f12538b.mo21785a(false, context);
        } else if (this.f12539c) {
            this.f12540d = System.currentTimeMillis();
            this.f12538b.mo21785a(true, context);
        } else {
            this.f12540d = -1;
            this.f12538b.mo21785a(false, context);
        }
    }
}
