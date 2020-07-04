package com.bytedance.android.livesdk.action.p182a;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.livesdk.action.C3866b;
import com.bytedance.android.livesdk.action.C3867c;
import com.bytedance.android.livesdk.action.C3868d;
import com.bytedance.android.livesdk.action.C3868d.C3869a;
import com.bytedance.common.utility.C6311g;
import com.google.gson.p276a.C6593c;
import com.google.gson.p277b.C6597a;
import java.util.List;
import java.util.Map;

@C3867c(mo11408a = "webcast_inroom_actions")
/* renamed from: com.bytedance.android.livesdk.action.a.e */
public final class C3861e extends C3868d<Void> {

    /* renamed from: b */
    final String f11561b = "actions";

    /* renamed from: com.bytedance.android.livesdk.action.a.e$a */
    public static class C3864a {
        @C6593c(mo15949a = "schema")

        /* renamed from: a */
        public String f11565a;
        @C6593c(mo15949a = "next_actions")

        /* renamed from: b */
        public List<String> f11566b;
    }

    /* renamed from: a */
    public final void mo11405a(Map<String, Object> map) throws Exception {
        List<C3864a> list = (List) C2317a.m9932a().mo15975a(String.valueOf(map.get("actions")), new C6597a<List<C3864a>>() {
        }.type);
        if (!C6311g.m19573a(list)) {
            for (C3864a aVar : list) {
                String str = aVar.f11565a;
                final List<String> list2 = aVar.f11566b;
                C3866b.m13714a().mo11407a(str, new C3869a() {
                    /* renamed from: a */
                    public final void mo11403a(Object obj) {
                        for (String a : list2) {
                            C3866b.m13714a().mo11406a(a);
                        }
                    }
                });
            }
            mo11410a(null);
        }
    }
}
