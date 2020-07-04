package com.p280ss.android.ugc.aweme.discover.hotspot;

import android.app.Activity;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider.C28651a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.hotspot.SpotChangeCallBack */
public final class SpotChangeCallBack extends C0063u {

    /* renamed from: c */
    public static final C26687a f70365c = new C26687a(null);

    /* renamed from: a */
    public final C23084b<HotSearchItem> f70366a = new C23084b<>();

    /* renamed from: b */
    public int f70367b;

    /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.SpotChangeCallBack$a */
    public static final class C26687a {
        private C26687a() {
        }

        public /* synthetic */ C26687a(C7571f fVar) {
            this();
        }

        /* renamed from: b */
        private static SpotChangeCallBack m87666b(Context context) {
            C7573i.m23587b(context, "context");
            Activity a = C23487o.m77130a(context);
            if (a != null) {
                C0063u a2 = C0069x.m159a((FragmentActivity) a).mo147a(SpotChangeCallBack.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders\n     …angeCallBack::class.java)");
                return (SpotChangeCallBack) a2;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }

        /* renamed from: a */
        public final Map<String, String> mo68419a(Context context) {
            String str;
            String str2;
            C7573i.m23587b(context, "context");
            Activity a = C23487o.m77130a(context);
            if (a != null) {
                Context context2 = (FragmentActivity) a;
                FeedParam a2 = C28651a.m94274a(context2);
                if (!a2.isHotSpot()) {
                    return new LinkedHashMap<>();
                }
                SpotChangeCallBack b = m87666b(context2);
                C22984d a3 = C22984d.m75611a();
                String str3 = "enter_method";
                if (TextUtils.equals(a2.getHotEnterMethod(), "homepage_channel")) {
                    str = "homepage_channel_trending";
                } else {
                    str = a2.getHotEnterMethod();
                }
                C22984d a4 = a3.mo59973a(str3, str);
                String str4 = "trending_topic";
                HotSearchItem hotSearchItem = (HotSearchItem) b.f70366a.getValue();
                if (hotSearchItem != null) {
                    str2 = hotSearchItem.getWord();
                } else {
                    str2 = null;
                }
                Map<String, String> map = a4.mo59973a(str4, str2).mo59970a(POIService.KEY_ORDER, b.f70367b + 1).mo59973a("previous_page", a2.getPreviousPage()).f60753a;
                C7573i.m23582a((Object) map, "EventMapBuilder.newBuild…               .builder()");
                return map;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }
}
