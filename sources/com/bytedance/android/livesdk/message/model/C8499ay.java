package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.C9376n;
import com.bytedance.android.livesdkapi.depend.model.live.C9376n.C9377a;
import com.bytedance.common.utility.C6311g;
import com.google.gson.p276a.C6593c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.message.model.ay */
public class C8499ay extends C8538c {

    /* renamed from: a */
    public List<C9376n> f23289a;
    @C6593c(mo15949a = "user_armies_map")

    /* renamed from: b */
    Map<Long, C8500a> f23290b;
    @C6593c(mo15949a = "user_armies_list")

    /* renamed from: c */
    List<C8500a> f23291c;

    /* renamed from: com.bytedance.android.livesdk.message.model.ay$a */
    public static class C8500a {
        @C6593c(mo15949a = "user_armies")

        /* renamed from: a */
        List<C8501a> f23292a;

        /* renamed from: com.bytedance.android.livesdk.message.model.ay$a$a */
        public static class C8501a {
            @C6593c(mo15949a = "user_id")

            /* renamed from: a */
            public long f23293a;
            @C6593c(mo15949a = "score")

            /* renamed from: b */
            public int f23294b;
            @C6593c(mo15949a = "nickname")

            /* renamed from: c */
            public String f23295c;
            @C6593c(mo15949a = "avatar_thumb")

            /* renamed from: d */
            public ImageModel f23296d;
        }
    }

    public C8499ay() {
        this.type = MessageType.LINK_MIC_ARMIES;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21653a() {
        this.f23289a = new ArrayList();
        if (!C6311g.m19573a(this.f23291c)) {
            for (C8500a aVar : this.f23291c) {
                C9376n nVar = new C9376n();
                if (aVar != null) {
                    ArrayList arrayList = new ArrayList();
                    if (aVar.f23292a != null) {
                        for (C8501a aVar2 : aVar.f23292a) {
                            C9377a aVar3 = new C9377a();
                            aVar3.f25739a = aVar2.f23293a;
                            aVar3.f25740b = aVar2.f23294b;
                            aVar3.f25741c = aVar2.f23295c;
                            aVar3.f25742d = aVar2.f23296d;
                            arrayList.add(aVar3);
                        }
                    }
                    nVar.f25736b = arrayList;
                    this.f23289a.add(nVar);
                }
            }
        }
    }
}
