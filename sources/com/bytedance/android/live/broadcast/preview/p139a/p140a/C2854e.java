package com.bytedance.android.live.broadcast.preview.p139a.p140a;

import android.os.Build.VERSION;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.livesdkapi.C9402f;
import com.bytedance.android.livesdkapi.C9402f.C9403a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.live.broadcast.preview.a.a.e */
public final class C2854e implements C9402f {

    /* renamed from: a */
    private StartLiveEventViewModel f9075a;

    /* renamed from: b */
    private StartLiveViewModel f9076b;

    /* renamed from: c */
    private Game f9077c;

    /* renamed from: d */
    private LiveMode f9078d;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 == null) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11371a() {
        /*
            r1 = this;
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r1.f9076b
            if (r0 == 0) goto L_0x0012
            android.arch.lifecycle.o r0 = r0.mo9597d()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = (com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r0
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
        L_0x0014:
            r1.f9078d = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r1.f9076b
            if (r0 == 0) goto L_0x0027
            android.arch.lifecycle.o r0 = r0.mo9599f()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.live.broadcast.api.model.Game r0 = (com.bytedance.android.live.broadcast.api.model.Game) r0
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            r1.f9077c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.p139a.p140a.C2854e.m11371a():void");
    }

    /* renamed from: a */
    public final void mo9615a(C9403a aVar) {
        C7573i.m23587b(aVar, "chain");
        m11371a();
        if (this.f9078d == LiveMode.SCREEN_RECORD) {
            if (VERSION.SDK_INT >= 21) {
                if (this.f9077c == null) {
                    StartLiveEventViewModel startLiveEventViewModel = this.f9075a;
                    if (startLiveEventViewModel != null) {
                        NextLiveData b = startLiveEventViewModel.mo9468b();
                        if (b != null) {
                            b.postValue(Integer.valueOf(1));
                            return;
                        }
                    }
                    return;
                }
            } else {
                return;
            }
        }
        aVar.mo9613a();
    }

    /* renamed from: a */
    public final void mo9618a(StartLiveViewModel startLiveViewModel, StartLiveEventViewModel startLiveEventViewModel) {
        C7573i.m23587b(startLiveViewModel, "viewModel");
        C7573i.m23587b(startLiveEventViewModel, "eventViewModel");
        this.f9076b = startLiveViewModel;
        this.f9075a = startLiveEventViewModel;
    }
}
