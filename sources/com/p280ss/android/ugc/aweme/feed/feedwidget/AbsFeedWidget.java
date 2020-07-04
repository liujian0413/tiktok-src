package com.p280ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.C0053p;
import android.view.View;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28894e;
import com.p280ss.android.ugc.aweme.utils.GenericWidget;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget */
public abstract class AbsFeedWidget extends GenericWidget implements C0053p<C23083a> {

    /* renamed from: a */
    private C28894e f74689a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C28894e mo61335b(View view);

    /* renamed from: a */
    private void m93131a() {
        if (this.f74689a != null) {
            this.f74689a.mo74131h();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f74689a != null) {
            this.f74689a.mo72018a();
        }
    }

    public final void onStop() {
        super.onStop();
        if (this.f74689a != null) {
            this.f74689a.mo73804g();
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f60922e.mo60132a("video_params", (C0053p<C23083a>) this).mo60132a("on_viewpager_page_selected", (C0053p<C23083a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72017b(C23083a aVar) {
        VideoItemParams videoItemParams = (VideoItemParams) aVar.mo60161a();
        if (this.f74689a != null) {
            this.f74689a.mo72021a(videoItemParams);
        }
    }

    /* renamed from: a */
    public final void mo60146a(View view) {
        super.mo60146a(view);
        this.f74689a = mo61335b(view);
        this.f74689a.mo72020a(this.f60922e);
        VideoItemParams videoItemParams = (VideoItemParams) this.f60922e.mo60135a("video_params");
        if (videoItemParams != null) {
            this.f74689a.mo72021a(videoItemParams);
        }
    }

    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1180796502) {
                if (hashCode == -98766390 && str.equals("video_params")) {
                    c = 0;
                }
            } else if (str.equals("on_viewpager_page_selected")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    mo72017b(aVar);
                    return;
                case 1:
                    m93131a();
                    break;
            }
        }
    }
}
