package com.p280ss.android.ugc.aweme.history;

import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.p280ss.android.ugc.aweme.history.dao.C30234a;
import com.p280ss.android.ugc.aweme.p1708y.p1709a.p1710a.C43571a;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.history.c */
public final class C30232c implements C43571a {
    /* renamed from: a */
    public final void mo79685a(String str) {
        C7573i.m23587b(str, "awemeId");
    }

    /* renamed from: a */
    public final void mo79684a(CommonItemView commonItemView) {
        if (commonItemView != null) {
            commonItemView.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final List<C30234a> mo79686b(String str) {
        C7573i.m23587b(str, "date");
        return C7525m.m23461a();
    }
}
