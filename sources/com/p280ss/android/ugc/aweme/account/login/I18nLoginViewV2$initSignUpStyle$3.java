package com.p280ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.base.utils.C23485m;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.I18nLoginViewV2$initSignUpStyle$3 */
public final class I18nLoginViewV2$initSignUpStyle$3 extends LinearLayoutManager {

    /* renamed from: a */
    public boolean f57095a;

    /* renamed from: b */
    final /* synthetic */ C21539i f57096b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nLoginViewV2$initSignUpStyle$3$a */
    static final class C21256a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ I18nLoginViewV2$initSignUpStyle$3 f57097a;

        C21256a(I18nLoginViewV2$initSignUpStyle$3 i18nLoginViewV2$initSignUpStyle$3) {
            this.f57097a = i18nLoginViewV2$initSignUpStyle$3;
        }

        public final void run() {
            RecyclerView c = this.f57097a.f57096b.mo57688c();
            C7573i.m23582a((Object) c, "channle_list");
            C1262a adapter = c.getAdapter();
            if (adapter == null) {
                C7573i.m23580a();
            }
            adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo5373a(C1290s sVar) {
        super.mo5373a(sVar);
        View d = this.f57096b.mo57689d();
        C7573i.m23582a((Object) d, "more");
        if (d.getVisibility() != 8 && !this.f57095a) {
            View childAt = this.f57096b.mo57688c().getChildAt(mo5447l());
            if (childAt != null) {
                RecyclerView c = this.f57096b.mo57688c();
                C7573i.m23582a((Object) c, "channle_list");
                if (((float) (c.getHeight() - childAt.getBottom())) < this.f57096b.f57857h) {
                    View d2 = this.f57096b.mo57689d();
                    C7573i.m23582a((Object) d2, "more");
                    d2.setVisibility(8);
                    RecyclerView c2 = this.f57096b.mo57688c();
                    C7573i.m23582a((Object) c2, "channle_list");
                    C1262a adapter = c2.getAdapter();
                    if (adapter != null) {
                        ((LoginChannleAdapter) adapter).f57114a = true;
                        C23485m.m77118b(new C21256a(this));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.LoginChannleAdapter");
                    }
                } else {
                    View d3 = this.f57096b.mo57689d();
                    C7573i.m23582a((Object) d3, "more");
                    LayoutParams layoutParams = d3.getLayoutParams();
                    if (layoutParams != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.setMargins(0, childAt.getBottom(), 0, 0);
                        View d4 = this.f57096b.mo57689d();
                        C7573i.m23582a((Object) d4, "more");
                        d4.setLayoutParams(layoutParams2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                }
            }
            this.f57095a = true;
        }
    }

    I18nLoginViewV2$initSignUpStyle$3(C21539i iVar, Context context) {
        this.f57096b = iVar;
        super(context);
    }
}
