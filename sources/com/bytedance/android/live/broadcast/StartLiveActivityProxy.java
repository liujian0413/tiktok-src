package com.bytedance.android.live.broadcast;

import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.broadcast.preview.StartLivePreviewFragment;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C9430a;
import com.bytedance.android.livesdkapi.plugin.PluginType;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.NetworkUtils.NetworkType;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class StartLiveActivityProxy extends LiveActivityProxy {

    /* renamed from: a */
    public int f7935a;

    /* renamed from: c */
    private C9245h f7936c;

    /* renamed from: d */
    private int f7937d;

    /* renamed from: a */
    public final void mo8834a() {
        LiveCameraResManager.INST.isLoadedRes.observe(this.f25465b, new C2982u(this));
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public void onCreate() {
        this.f25465b.setContentView(R.layout.apu);
        C2404a.m10120a().mo8841b();
        this.f25465b.getWindow().addFlags(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        m10115c();
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        if (this.f7936c != null && this.f7936c.isShowing()) {
            this.f7936c.dismiss();
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        if (!LiveCameraResManager.INST.isLoadedRes() && (this.f7936c == null || !this.f7936c.isShowing())) {
            this.f7936c = new C9249a(this.f25465b, 2).mo22713a((OnDismissListener) new C2981t(this)).mo22729d();
        }
    }

    /* renamed from: c */
    private void m10115c() {
        if (PluginType.LiveResource.isInstalled()) {
            mo8834a();
        } else if (!C2986w.m11581a(this.f25465b)) {
            C3517a.m12960a((Context) this.f25465b, (int) R.string.efr);
        } else if (NetworkUtils.m19550d(this.f25465b) == NetworkType.MOBILE_2G) {
            C3517a.m12960a((Context) this.f25465b, (int) R.string.f8e);
        } else if (this.f7935a <= 3) {
            PluginType.LiveResource.checkInstall(this.f25465b, new C9430a() {
                /* renamed from: a */
                public final void mo8840a(String str) {
                    if (!C2983v.m11577a(StartLiveActivityProxy.this.f25465b)) {
                        C3517a.m12960a((Context) StartLiveActivityProxy.this.f25465b, (int) R.string.efr);
                    } else if (NetworkUtils.m19550d(StartLiveActivityProxy.this.f25465b) == NetworkType.MOBILE_2G) {
                        C3517a.m12960a((Context) StartLiveActivityProxy.this.f25465b, (int) R.string.f8e);
                    } else {
                        StartLiveActivityProxy.this.mo8834a();
                    }
                }
            });
        }
    }

    public StartLiveActivityProxy(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8835a(DialogInterface dialogInterface) {
        if (!LiveCameraResManager.INST.isLoadedRes()) {
            this.f25465b.finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8836a(Boolean bool) {
        PluginType.LiveResource.preload();
        if (bool != null && bool.booleanValue()) {
            if (this.f7936c != null && this.f7936c.isShowing()) {
                this.f7936c.dismiss();
            }
            C0633q a = this.f25465b.getSupportFragmentManager().mo2645a();
            a.mo2599b(R.id.aoy, StartLivePreviewFragment.m11290a());
            a.mo2606d();
        } else if (this.f7937d > 3) {
            C9049ap.m27022a((int) R.string.f3w);
            if (this.f7936c != null && this.f7936c.isShowing()) {
                this.f7936c.dismiss();
            }
            this.f25465b.finish();
        } else {
            LiveCameraResManager.INST.loadResources();
            this.f7937d++;
        }
    }
}
