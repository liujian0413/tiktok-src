package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.view.View;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.setting.C37649i;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37709b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37716e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.y */
public final class C41430y implements C37709b {

    /* renamed from: a */
    CommonItemView f107783a;

    /* renamed from: b */
    HashMap<String, String> f107784b;

    /* renamed from: c */
    private C37723b f107785c;

    /* renamed from: d */
    private C37716e f107786d = new C37716e();

    /* renamed from: c_ */
    public final void mo83182c_(Exception exc) {
    }

    /* renamed from: a */
    private void m132065a() {
        String str;
        if (this.f107784b != null && this.f107783a != null) {
            HashMap<String, String> hashMap = this.f107784b;
            String str2 = "to_status";
            if (this.f107783a.mo25778c()) {
                str = "off";
            } else {
                str = "on";
            }
            hashMap.put(str2, str);
            C6907h.m21524a("disable_comment", (Map) this.f107784b);
        }
    }

    /* renamed from: a */
    private void m132066a(boolean z) {
        if (C37649i.m120470a()) {
            this.f107783a.setVisibility(0);
            this.f107783a.setChecked(z);
            this.f107783a.setOnClickListener(new C41431z(this));
            this.f107786d = new C37716e();
            this.f107786d.mo66537a(this);
            this.f107786d.mo56976a(new Object[0]);
            return;
        }
        this.f107783a.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo102053a(View view) {
        if (this.f107785c == null || this.f107785c.f98277m != C37649i.f98121d) {
            this.f107783a.setChecked(!this.f107783a.mo25778c());
            m132065a();
            return;
        }
        C10761a.m31410e(this.f107783a.getContext(), this.f107783a.getContext().getString(R.string.f124285if)).mo25750a();
    }

    /* renamed from: a */
    public final void mo83181a(C37723b bVar) {
        this.f107785c = bVar;
        if (!(this.f107783a == null || this.f107785c == null || this.f107785c.f98277m != C37649i.f98121d)) {
            this.f107783a.setChecked(false);
            this.f107783a.setAlpha(0.66f);
        }
    }

    public C41430y(CommonItemView commonItemView, boolean z, HashMap<String, String> hashMap) {
        this.f107783a = commonItemView;
        this.f107784b = hashMap;
        m132066a(z);
    }
}
