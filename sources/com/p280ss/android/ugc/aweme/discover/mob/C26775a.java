package com.p280ss.android.ugc.aweme.discover.mob;

import android.view.View;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.mob.C26804x.C26805a;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.a */
public final class C26775a {

    /* renamed from: a */
    public static final C26775a f70622a = new C26775a();

    private C26775a() {
    }

    /* renamed from: a */
    public static final void m87934a(String str, String str2, View view) {
        C7573i.m23587b(str, "cardPosition");
        C7573i.m23587b(view, "view");
        C26501r a = C26805a.m88001a(view);
        String str3 = "aladdin_card_click";
        C22984d a2 = C22984d.m75611a().mo59973a("aladdin_card_type", "user").mo59973a("card_position", str).mo59973a("search_keyword", a.mo68129b());
        String str4 = "to_user_id";
        if (str2 == null) {
            str2 = "";
        }
        C6907h.m21524a(str3, (Map) a2.mo59973a(str4, str2).mo59973a("log_pb", a.mo68131d()).f60753a);
    }
}
