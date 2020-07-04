package com.p280ss.android.ugc.aweme.account.login;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.account.login.LoginChannleAdapter.LoginDialogHeader;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.I18nLoginViewV2$initView$2 */
public final class I18nLoginViewV2$initView$2 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ C21539i f57098a;

    I18nLoginViewV2$initView$2(C21539i iVar) {
        this.f57098a = iVar;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        View childAt = this.f57098a.mo57688c().getChildAt(0);
        if (childAt != null && childAt.getParent() != null) {
            C1293v b = this.f57098a.mo57688c().mo5539b(childAt);
            float f = 1.0f;
            if (b instanceof LoginDialogHeader) {
                LoginDialogHeader loginDialogHeader = (LoginDialogHeader) b;
                TextView textView = loginDialogHeader.f57123a;
                C7573i.m23582a((Object) textView, "vh.title");
                if (textView.getHeight() > 0) {
                    int top = loginDialogHeader.f57125c.getTop();
                    TextView textView2 = loginDialogHeader.f57123a;
                    C7573i.m23582a((Object) textView2, "vh.title");
                    int top2 = textView2.getTop();
                    if (top >= 0) {
                        f = 0.0f;
                    } else {
                        TextView textView3 = loginDialogHeader.f57123a;
                        C7573i.m23582a((Object) textView3, "vh.title");
                        if (top > (-(textView3.getHeight() + top2))) {
                            float abs = (float) (Math.abs(top) - top2);
                            TextView textView4 = loginDialogHeader.f57123a;
                            C7573i.m23582a((Object) textView4, "vh.title");
                            f = abs / ((float) textView4.getHeight());
                        }
                    }
                }
            }
            TextView a = this.f57098a.mo57686a();
            C7573i.m23582a((Object) a, "title_bar");
            a.setAlpha(f);
            View b2 = this.f57098a.mo57687b();
            C7573i.m23582a((Object) b2, "divider");
            b2.setAlpha(f);
        }
    }
}
