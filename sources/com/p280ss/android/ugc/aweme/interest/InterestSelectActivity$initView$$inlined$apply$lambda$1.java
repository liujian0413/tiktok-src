package com.p280ss.android.ugc.aweme.interest;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.interest.IntereSelectAdapter.C32143a;
import com.p280ss.android.ugc.aweme.interest.InterestSelectActivity.C32153a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$initView$$inlined$apply$lambda$1 */
public final class InterestSelectActivity$initView$$inlined$apply$lambda$1 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ InterestSelectActivity f84037a;

    InterestSelectActivity$initView$$inlined$apply$lambda$1(InterestSelectActivity interestSelectActivity) {
        this.f84037a = interestSelectActivity;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        this.f84037a.f83996b += i2;
        if (C32143a.m104387a() != -1) {
            if (((float) this.f84037a.f83996b) >= ((float) C32143a.m104387a()) + C32153a.m104428a()) {
                DmtTextView d = this.f84037a.mo59893d();
                C7573i.m23582a((Object) d, "titleView");
                d.setAlpha(1.0f);
            } else if (this.f84037a.f83996b <= C32143a.m104387a()) {
                DmtTextView d2 = this.f84037a.mo59893d();
                C7573i.m23582a((Object) d2, "titleView");
                d2.setAlpha(0.0f);
            } else {
                DmtTextView d3 = this.f84037a.mo59893d();
                C7573i.m23582a((Object) d3, "titleView");
                d3.setAlpha((((float) (this.f84037a.f83996b - C32143a.m104387a())) + 0.0f) / C32153a.m104428a());
            }
        }
        if (this.f84037a.f83997c != -1 && this.f84037a.f83997c < this.f84037a.mo83305l().getItemCount()) {
            int l = this.f84037a.mo83306m().mo5447l();
            if (l >= 0) {
                if (l > this.f84037a.f83997c && this.f84037a.mo83298a(l)) {
                    this.f84037a.mo83300b(this.f84037a.f83997c + 1, l);
                }
                int i3 = l + 3;
                if (this.f84037a.f83998d < i3) {
                    this.f84037a.mo83296a(l + 1, i3);
                }
            }
        }
    }
}
