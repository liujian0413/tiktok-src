package com.p280ss.android.ugc.aweme.commercialize.p1122e;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.p280ss.android.ugc.aweme.story.model.StoryResponse.C41999a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e.b */
public final class C24623b implements C24626e {

    /* renamed from: a */
    private static C41999a f64937a;

    /* renamed from: b */
    private C24624c f64938b;

    private C24623b() {
    }

    /* renamed from: a */
    public static C41999a m80724a() {
        return f64937a;
    }

    /* renamed from: c */
    public final void mo64478c() {
        this.f64938b.mo64479a(f64937a);
    }

    /* renamed from: b */
    public static void m80726b() {
        C6907h.m21524a("show_skylight_entrance", (Map) new HashMap());
    }

    private C24623b(Context context) {
        m80727b(context);
    }

    /* renamed from: a */
    public static C24623b m80723a(Context context) {
        return new C24623b(context);
    }

    /* renamed from: a */
    public static void m80725a(C41999a aVar) {
        f64937a = aVar;
    }

    /* renamed from: b */
    private void m80727b(Context context) {
        C24625d dVar = new C24625d(context);
        dVar.setPadding((int) C9738o.m28708b(context, 16.0f), (int) C9738o.m28708b(context, 2.0f), 0, 0);
        C24622a aVar = new C24622a();
        aVar.mo64472a((AbsLiveStoryItemView) dVar);
        this.f64938b = new C24624c(dVar, aVar);
    }

    /* renamed from: a */
    public final void mo64477a(ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this.f64938b.mo84813c());
        if (indexOfChild != 0) {
            if (indexOfChild > 0) {
                viewGroup.removeView(this.f64938b.mo84813c());
            }
            viewGroup.addView(this.f64938b.mo84813c(), 0);
            View childAt = viewGroup.getChildAt(1);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin -= (int) C9738o.m28708b(viewGroup.getContext(), 9.0f);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }
}
