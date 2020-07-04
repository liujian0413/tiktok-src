package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import android.os.Build.VERSION;
import android.view.View;
import com.bef.effectsdk.message.MessageCenter;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.g */
public final class C39576g implements C39583n {

    /* renamed from: a */
    private boolean f102789a;

    /* renamed from: b */
    private final C39570c f102790b;

    /* renamed from: m */
    public final void mo98558m() {
        if (this.f102789a) {
            if (VERSION.SDK_INT < 19) {
                View contentView = this.f102790b.getContentView();
                C7573i.m23582a((Object) contentView, "popupWindow.contentView");
                contentView.setSystemUiVisibility(8);
                return;
            }
            if (VERSION.SDK_INT >= 19) {
                View contentView2 = this.f102790b.getContentView();
                C7573i.m23582a((Object) contentView2, "popupWindow.contentView");
                contentView2.setSystemUiVisibility(MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME);
            }
        }
    }

    /* renamed from: d */
    public final void mo98550d(boolean z) {
        this.f102789a = z;
    }

    public C39576g(C39570c cVar) {
        C7573i.m23587b(cVar, "popupWindow");
        this.f102790b = cVar;
    }
}
