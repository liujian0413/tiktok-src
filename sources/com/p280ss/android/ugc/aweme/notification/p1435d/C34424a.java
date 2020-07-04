package com.p280ss.android.ugc.aweme.notification.p1435d;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.model.AppImageUri;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.notification.NotificationDetailActivity;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C32013b;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.notification.d.a */
public final class C34424a extends C34427d {
    /* renamed from: b */
    public final int mo18115b() {
        return 7;
    }

    public final String bf_() {
        return "ad_helper";
    }

    public final int bg_() {
        return 1;
    }

    /* renamed from: g */
    public final int mo87750g() {
        return 21;
    }

    /* renamed from: a */
    public final C32013b mo18114a() {
        return new C34425b(this);
    }

    /* renamed from: d */
    public final void mo18120d() {
        this.f19943g = C6399b.m19921a().getString(R.string.bpf);
        this.f19942f = AppImageUri.m76615a((int) R.drawable.bi3);
    }

    /* renamed from: f */
    public final void mo87749f() {
        super.mo87749f();
        C42961az.m136380a(new C34314g(mo87750g(), -1));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87748a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (i == 0) {
            mo87752i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87747a(Context context, C7102a aVar, int i) {
        if (i == 1 || i == 2) {
            mo87749f();
            NotificationDetailActivity.m111097a(context, 7, this.f19946j);
            return;
        }
        if (i == 0) {
            C25712a aVar2 = new C25712a(context);
            aVar2.mo66614a((CharSequence[]) new String[]{context.getResources().getString(R.string.bik)}, (OnClickListener) new C34426c(this));
            aVar2.mo66615b();
        }
    }
}
