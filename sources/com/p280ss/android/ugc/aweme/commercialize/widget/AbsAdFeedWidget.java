package com.p280ss.android.ugc.aweme.commercialize.widget;

import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget */
public abstract class AbsAdFeedWidget extends Widget implements C0053p<C23083a> {

    /* renamed from: a */
    public Aweme f67508a;

    /* renamed from: i */
    public Fragment f67509i;

    public void onCreate() {
        super.onCreate();
        mo66455a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo66455a() {
        DataCenter dataCenter = this.f60922e;
        if (dataCenter != null) {
            dataCenter.mo60132a("ad_feed_video_params", (C0053p<C23083a>) this);
        }
    }

    /* renamed from: a */
    public final void mo60146a(View view) {
        super.mo60146a(view);
        DataCenter dataCenter = this.f60922e;
        if (dataCenter != null) {
            C25638a aVar = (C25638a) dataCenter.mo60135a("ad_feed_video_params");
            if (aVar != null) {
                mo66457a(aVar);
            }
        }
    }

    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        String str;
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null && str.hashCode() == 1512987055 && str.equals("ad_feed_video_params")) {
            C25638a aVar2 = (C25638a) aVar.mo60161a();
            if (aVar2 != null) {
                mo66457a(aVar2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo66457a(C25638a aVar) {
        C7573i.m23587b(aVar, "params");
        this.f67508a = aVar.f67530a;
        this.f67509i = aVar.f67531b;
    }
}
