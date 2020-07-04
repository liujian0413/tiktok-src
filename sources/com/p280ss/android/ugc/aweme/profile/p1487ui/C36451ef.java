package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.graphics.Bitmap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ef */
final /* synthetic */ class C36451ef implements Callable {

    /* renamed from: a */
    private final UpdateAvatarDialog f95633a;

    /* renamed from: b */
    private final Bitmap f95634b;

    C36451ef(UpdateAvatarDialog updateAvatarDialog, Bitmap bitmap) {
        this.f95633a = updateAvatarDialog;
        this.f95634b = bitmap;
    }

    public final Object call() {
        return this.f95633a.mo92348b(this.f95634b);
    }
}
