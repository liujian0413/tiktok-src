package com.p280ss.android.ugc.aweme.commercialize.egg.p1123a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.a.c */
public final class C24639c implements C24638b {

    /* renamed from: d */
    public static final C24640a f64971d = new C24640a(null);

    /* renamed from: a */
    public String f64972a = "";

    /* renamed from: b */
    public String f64973b = "";

    /* renamed from: c */
    public String f64974c = "";

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.a.c$a */
    public static final class C24640a {
        private C24640a() {
        }

        public /* synthetic */ C24640a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo64486a(View view, int i) {
        C7573i.m23587b(view, "eggView");
    }

    /* renamed from: a */
    public final void mo64487a(View view, View view2) {
        C7573i.m23587b(view2, "eggLayout");
    }

    /* renamed from: c */
    public final boolean mo64491c() {
        return false;
    }

    /* renamed from: d */
    public final boolean mo64492d() {
        return false;
    }

    /* renamed from: a */
    public final void mo64485a() {
        C6907h.m21524a("show_egg_ad", (Map) C22984d.m75611a().mo59973a("enter_from", this.f64974c).mo59973a("group_id", this.f64972a).mo59973a("author_id", this.f64973b).f60753a);
    }

    /* renamed from: b */
    public final void mo64489b() {
        C6907h.m21524a("show_egg_ad_fail", (Map) C22984d.m75611a().mo59973a("fail_type", "load_fail").mo59973a("enter_from", this.f64974c).mo59973a("group_id", this.f64972a).mo59973a("author_id", this.f64973b).f60753a);
    }

    /* renamed from: b */
    public final void mo64509b(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f64973b = str;
    }

    /* renamed from: c */
    public final void mo64510c(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f64974c = str;
    }

    /* renamed from: a */
    public final void mo64508a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f64972a = str;
    }

    /* renamed from: b */
    public final void mo64490b(View view, View view2) {
        C7573i.m23587b(view, "eggView");
        C7573i.m23587b(view2, "eggLayout");
        Context context = view2.getContext();
        C7573i.m23582a((Object) context, "eggLayout.context");
        Resources resources = context.getResources();
        C7573i.m23582a((Object) resources, "eggLayout.context.resources");
        double d = (double) resources.getDisplayMetrics().widthPixels;
        Double.isNaN(d);
        double d2 = d * 0.64d;
        Context context2 = view2.getContext();
        C7573i.m23582a((Object) context2, "eggLayout.context");
        Resources resources2 = context2.getResources();
        C7573i.m23582a((Object) resources2, "eggLayout.context.resources");
        double d3 = (double) resources2.getDisplayMetrics().heightPixels;
        Double.isNaN(d3);
        LayoutParams layoutParams = new LayoutParams((int) d2, (int) (d3 * 0.64d));
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }
}
