package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.p280ss.android.ugc.aweme.setting.p1518f.C37628a.C37629a;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.aj */
final class C23204aj implements C37629a {

    /* renamed from: a */
    private Context f61183a;

    /* renamed from: b */
    private Keva f61184b = Keva.getRepoFromSp(this.f61183a, "HateFulPreferences", 0);

    /* renamed from: a */
    public final void mo60387a(String str) {
        this.f61184b.storeString(SearchNilInfo.HIT_HEAT_SPEECH, str);
    }

    /* renamed from: b */
    public final void mo60388b(String str) {
        this.f61184b.storeString("hate_link", str);
    }

    public C23204aj(Context context) {
        this.f61183a = context;
    }
}
