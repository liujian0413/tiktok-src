package com.p280ss.android.ugc.aweme.p313im.sdk.share.panel;

import android.view.View;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31912l;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1352a.C32019b;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1353b.C32021a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.b */
public final class C31833b extends C31834c {

    /* renamed from: a */
    private SharePanelWidget f83277a;

    /* renamed from: b */
    private final C32021a f83278b;

    /* renamed from: c */
    private final C32019b f83279c;

    /* renamed from: f */
    private final boolean m103304f() {
        return C31912l.m103665a(this.f83278b.f83736f);
    }

    /* renamed from: b */
    public final View mo82655b() {
        SharePanelWidget sharePanelWidget = this.f83277a;
        if (sharePanelWidget != null) {
            return sharePanelWidget.mo82648c();
        }
        return null;
    }

    /* renamed from: c */
    public final List<IMContact> mo82656c() {
        SharePanelWidget sharePanelWidget = this.f83277a;
        if (sharePanelWidget != null) {
            return sharePanelWidget.mo82641a();
        }
        return null;
    }

    /* renamed from: d */
    public final void mo82657d() {
        SharePanelWidget sharePanelWidget = this.f83277a;
        if (sharePanelWidget != null) {
            sharePanelWidget.mo82645b();
        }
    }

    /* renamed from: a */
    public final void mo82652a() {
        boolean z;
        C32021a aVar = this.f83278b;
        if (!C7074e.m22066a() || m103304f()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            aVar = null;
        }
        if (aVar != null) {
            this.f83277a = new SharePanelWidget(this.f83278b, this.f83279c);
        } else {
            this.f83278b.f83731a.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo82654a(boolean z) {
        SharePanelWidget sharePanelWidget = this.f83277a;
        if (sharePanelWidget != null) {
            sharePanelWidget.mo82647b(z);
        }
    }

    /* renamed from: a */
    public final void mo82653a(C38380c cVar) {
        C7573i.m23587b(cVar, "config");
        SharePanelWidget sharePanelWidget = this.f83277a;
        if (sharePanelWidget != null) {
            sharePanelWidget.mo82642a(cVar.f99636i);
        }
        this.f83279c.mo80291a(cVar);
    }

    public C31833b(C32021a aVar, C32019b bVar) {
        C7573i.m23587b(aVar, "payload");
        C7573i.m23587b(bVar, "callback");
        super(aVar);
        this.f83278b = aVar;
        this.f83279c = bVar;
    }
}
