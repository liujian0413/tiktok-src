package com.p280ss.android.ugc.aweme.live;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.live.sdk.chatroom.p1367ui.C32534a;
import com.p280ss.android.ugc.aweme.live.sdk.chatroom.p1367ui.TTLiveBroadcastView;
import com.p280ss.android.ugc.aweme.port.internal.C35610c;
import com.p280ss.android.ugc.aweme.port.internal.C35610c.C35611a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;

/* renamed from: com.ss.android.ugc.aweme.live.g */
public final class C32525g implements C35610c {

    /* renamed from: a */
    public C32534a f84808a;

    /* renamed from: b */
    public volatile boolean f84809b;

    /* renamed from: b */
    public final ImageView mo83762b() {
        C32534a aVar = this.f84808a;
        return null;
    }

    /* renamed from: c */
    public final View mo83764c() {
        C32534a aVar = this.f84808a;
        return null;
    }

    /* renamed from: a */
    public final View mo83757a() {
        return this.f84808a.mo83771a();
    }

    /* renamed from: a */
    public final void mo83760a(C35611a aVar) {
        if (this.f84808a != null) {
            this.f84808a.mo83775a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo83759a(ViewGroup viewGroup) {
        if (this.f84808a != null) {
            viewGroup.removeAllViews();
            this.f84809b = true;
            viewGroup.addView(this.f84808a.mo83771a());
            this.f84808a.mo83778b();
        }
    }

    /* renamed from: b */
    public final void mo83763b(final ViewGroup viewGroup) {
        if (this.f84808a != null && this.f84809b) {
            this.f84808a.mo83780c();
            this.f84809b = false;
            viewGroup.postDelayed(new Runnable() {
                public final void run() {
                    if (viewGroup != null && !C32525g.this.f84809b) {
                        viewGroup.removeView(C32525g.this.f84808a.mo83771a());
                    }
                }
            }, 300);
        }
    }

    /* renamed from: a */
    public final void mo83761a(View... viewArr) {
        if (this.f84808a != null) {
            this.f84808a.mo83776a(viewArr);
        }
    }

    /* renamed from: a */
    public final void mo83758a(Context context, IRecordingOperationPanel iRecordingOperationPanel) {
        if (this.f84808a == null && C32430a.m105068e() != null) {
            this.f84808a = new TTLiveBroadcastView(context, iRecordingOperationPanel);
            if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableFullScreen()) {
                View a = mo83757a();
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) a.getLayoutParams();
                marginLayoutParams.bottomMargin += (int) C9738o.m28708b(context, 20.0f);
                a.requestLayout();
            }
        }
    }
}
