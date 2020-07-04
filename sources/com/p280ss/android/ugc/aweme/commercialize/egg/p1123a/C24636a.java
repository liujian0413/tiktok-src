package com.p280ss.android.ugc.aweme.commercialize.egg.p1123a;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24713ag;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.a.a */
public final class C24636a implements C24638b {

    /* renamed from: h */
    public static final C24637a f64963h = new C24637a(null);

    /* renamed from: a */
    public String f64964a = "";

    /* renamed from: b */
    public String f64965b = "";

    /* renamed from: c */
    public String f64966c = "";

    /* renamed from: d */
    public String f64967d = "";

    /* renamed from: e */
    public String f64968e = "";

    /* renamed from: f */
    public String f64969f = "";

    /* renamed from: g */
    public String f64970g = "";

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.a.a$a */
    public static final class C24637a {
        private C24637a() {
        }

        public /* synthetic */ C24637a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final boolean mo64491c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo64492d() {
        return true;
    }

    /* renamed from: a */
    public final void mo64485a() {
        C6907h.m21524a("show_egg_ad", (Map) C22984d.m75611a().mo59973a("egg_ad_id", this.f64964a).mo59973a("comment_text", this.f64965b).mo59973a("scene_id", "1003").mo59973a("enter_from", this.f64970g).mo59973a("group_id", this.f64968e).mo59973a("author_id", this.f64969f).f60753a);
    }

    /* renamed from: b */
    public final void mo64489b() {
        C6907h.m21524a("show_egg_ad_fail", (Map) C22984d.m75611a().mo59973a("egg_ad_id", this.f64964a).mo59973a("comment_text", this.f64965b).mo59973a("scene_id", "1003").mo59973a("enter_from", this.f64970g).mo59973a("group_id", this.f64968e).mo59973a("author_id", this.f64969f).mo59973a("fail_type", "load_fail").f60753a);
    }

    /* renamed from: a */
    public final void mo64501a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f64964a = str;
    }

    /* renamed from: b */
    public final void mo64502b(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f64965b = str;
    }

    /* renamed from: c */
    public final void mo64503c(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f64966c = str;
    }

    /* renamed from: d */
    public final void mo64504d(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f64967d = str;
    }

    /* renamed from: e */
    public final void mo64505e(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f64968e = str;
    }

    /* renamed from: f */
    public final void mo64506f(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f64969f = str;
    }

    /* renamed from: g */
    public final void mo64507g(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f64970g = str;
    }

    /* renamed from: b */
    public final void mo64490b(View view, View view2) {
        C7573i.m23587b(view, "eggView");
        C7573i.m23587b(view2, "eggLayout");
        double measuredWidth = (double) view2.getMeasuredWidth();
        Double.isNaN(measuredWidth);
        int i = (int) (measuredWidth * 0.64d);
        LayoutParams layoutParams = new LayoutParams(i, i);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo64486a(View view, int i) {
        C7573i.m23587b(view, "eggView");
        if (!TextUtils.isEmpty(this.f64966c) || !TextUtils.isEmpty(this.f64967d)) {
            C24713ag c = C24671f.m80853c();
            C7573i.m23582a((Object) c, "LegacyCommercializeServi…s.getAdOpenUtilsService()");
            if (!c.mo64688a(view.getContext(), this.f64967d, false)) {
                c.mo64687a(view.getContext(), this.f64966c, "");
            }
            C6907h.m21524a("click_egg_ad", (Map) C22984d.m75611a().mo59973a("egg_ad_id", this.f64964a).mo59973a("comment_text", this.f64965b).mo59973a("scene_id", "1003").mo59973a("enter_from", this.f64970g).mo59973a("group_id", this.f64968e).mo59973a("author_id", this.f64969f).mo59970a("duration", i).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo64487a(View view, View view2) {
        Animatable animatable;
        C7573i.m23587b(view2, "eggLayout");
        view2.setVisibility(8);
        if (view != null) {
            view.setVisibility(8);
            if (view instanceof SimpleDraweeView) {
                C13386a controller = ((SimpleDraweeView) view).getController();
                if (controller != null) {
                    animatable = controller.mo32721j();
                } else {
                    animatable = null;
                }
                if (animatable != null && animatable.isRunning()) {
                    animatable.stop();
                }
            }
        }
    }
}
