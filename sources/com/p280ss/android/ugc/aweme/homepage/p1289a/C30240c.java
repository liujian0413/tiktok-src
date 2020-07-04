package com.p280ss.android.ugc.aweme.homepage.p1289a;

import android.content.Intent;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.homepage.api.data.C30245a;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel.C30241a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.a.c */
public final class C30240c {
    /* renamed from: a */
    public static final void m98903a(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        Intent intent = fragmentActivity.getIntent();
        String stringExtra = intent.getStringExtra("id");
        String stringExtra2 = intent.getStringExtra("ids");
        String stringExtra3 = intent.getStringExtra("push_params");
        C30245a aVar = C30241a.m98909a(fragmentActivity).f79563b;
        if (aVar != null) {
            aVar.f79577a = stringExtra;
            aVar.f79578b = stringExtra2;
            aVar.f79579c = stringExtra3;
        }
    }
}
