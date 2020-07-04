package com.bytedance.android.livesdk.chatroom.p204a.p207c;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.user.FansClubData;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.c */
final /* synthetic */ class C4246c implements C7326g {

    /* renamed from: a */
    private final C4241a f12406a;

    /* renamed from: b */
    private final FansClubData f12407b;

    C4246c(C4241a aVar, FansClubData fansClubData) {
        this.f12406a = aVar;
        this.f12407b = fansClubData;
    }

    public final void accept(Object obj) {
        this.f12406a.mo11804a(this.f12407b, (Bitmap) obj);
    }
}
