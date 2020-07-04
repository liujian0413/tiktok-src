package com.bytedance.android.live.broadcast.stream.p141a;

import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2950c;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager;

/* renamed from: com.bytedance.android.live.broadcast.stream.a.d */
final class C2956d implements C2950c {

    /* renamed from: a */
    IFilterManager f9191a;

    /* renamed from: b */
    boolean f9192b;

    /* renamed from: a */
    public final void mo9693a() {
        this.f9192b = true;
    }

    /* renamed from: a */
    public final void mo9700a(String str, boolean z) {
        if (!this.f9192b) {
            this.f9191a.setEffect(str, z);
        }
    }

    /* renamed from: a */
    public final void mo9699a(String str, String str2, boolean z) {
        if (!this.f9192b) {
            this.f9191a.setCustomEffect(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo9701a(boolean z) {
        if (!this.f9192b) {
            this.f9191a.enableMockFace(z);
        }
    }

    public C2956d(IFilterManager iFilterManager) {
        this.f9191a = iFilterManager;
    }

    /* renamed from: a */
    public final void mo9697a(String str) {
        if (!this.f9192b) {
            this.f9191a.setEffect(null, false);
        }
    }

    /* renamed from: a */
    public final int mo9690a(int i, int i2) {
        if (this.f9192b) {
            return 0;
        }
        return this.f9191a.composerSetMode(i, i2);
    }

    /* renamed from: c */
    public final void mo9705c(float f, float f2) {
        if (!this.f9192b) {
            this.f9191a.processScaleEvent(f, f2);
        }
    }

    /* renamed from: b */
    public final void mo9703b(float f, float f2) {
        if (!this.f9192b) {
            this.f9191a.processLongPressEvent(f, f2);
        }
    }

    /* renamed from: a */
    public final int mo9692a(String[] strArr, int i) {
        if (this.f9192b) {
            return 0;
        }
        return this.f9191a.composerSetNodes(strArr, i);
    }

    /* renamed from: a */
    public final void mo9694a(float f, float f2) {
        if (!this.f9192b) {
            this.f9191a.processTouchEvent(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo9698a(String str, float f) {
        if (!this.f9192b) {
            IFilterManager iFilterManager = this.f9191a;
            if (str == null) {
                str = "";
            }
            iFilterManager.setFilter(str, 1.0f);
        }
    }

    /* renamed from: b */
    public final int mo9702b(String str, String str2, float f) {
        if (this.f9192b) {
            return 0;
        }
        return this.f9191a.composerUpdateNode(str, str2, f);
    }

    /* renamed from: a */
    public final int mo9691a(String str, String str2, float f) {
        if (this.f9192b) {
            return 0;
        }
        return this.f9191a.setFilter(str, str2, f);
    }

    /* renamed from: b */
    public final void mo9704b(float f, float f2, int i) {
        if (!this.f9192b) {
            this.f9191a.processTouchUpEvent(f, f2, i);
        }
    }

    /* renamed from: a */
    public final void mo9696a(float f, float f2, int i) {
        if (!this.f9192b) {
            this.f9191a.processTouchDownEvent(f, f2, i);
        }
    }

    /* renamed from: a */
    public final void mo9695a(float f, float f2, float f3, float f4, float f5) {
        if (!this.f9192b) {
            this.f9191a.processPanEvent(f, f2, f3, f4, f5);
        }
    }
}
