package com.bytedance.android.live.broadcast.preview.p139a.p140a;

import android.arch.lifecycle.C0052o;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.C9402f;
import com.bytedance.android.livesdkapi.C9402f.C9403a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.live.broadcast.preview.a.a.f */
public final class C2855f implements C9402f {

    /* renamed from: a */
    private StartLiveEventViewModel f9079a;

    /* renamed from: b */
    private StartLiveViewModel f9080b;

    /* renamed from: c */
    private LiveMode f9081c = LiveMode.VIDEO;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 == null) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11374a() {
        /*
            r1 = this;
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r1.f9080b
            if (r0 == 0) goto L_0x0012
            android.arch.lifecycle.o r0 = r0.mo9597d()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = (com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r0
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
        L_0x0014:
            r1.f9081c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.p139a.p140a.C2855f.m11374a():void");
    }

    /* renamed from: a */
    public final void mo9615a(C9403a aVar) {
        C7573i.m23587b(aVar, "chain");
        m11374a();
        if (this.f9081c.isStreamingBackground) {
            C2324b a = C3596c.m13172a(C3495l.class);
            C7573i.m23582a((Object) a, "ServiceManager.getServic…IRoomService::class.java)");
            Room currentRoom = ((C3495l) a).getCurrentRoom();
            if (currentRoom != null && ((currentRoom.isScreenshot && this.f9081c == LiveMode.SCREEN_RECORD) || (currentRoom.isThirdParty && this.f9081c == LiveMode.THIRD_PARTY))) {
                StartLiveViewModel startLiveViewModel = this.f9080b;
                if (startLiveViewModel != null) {
                    C0052o o = startLiveViewModel.mo9608o();
                    if (o != null) {
                        o.postValue(currentRoom);
                        return;
                    }
                }
                return;
            }
        }
        aVar.mo9613a();
    }

    /* renamed from: a */
    public final void mo9619a(StartLiveViewModel startLiveViewModel, StartLiveEventViewModel startLiveEventViewModel) {
        C7573i.m23587b(startLiveViewModel, "viewModel");
        C7573i.m23587b(startLiveEventViewModel, "eventViewModel");
        this.f9080b = startLiveViewModel;
        this.f9079a = startLiveEventViewModel;
    }
}
