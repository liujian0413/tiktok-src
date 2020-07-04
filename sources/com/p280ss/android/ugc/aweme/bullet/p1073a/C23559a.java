package com.p280ss.android.ugc.aweme.bullet.p1073a;

import com.bytedance.ies.bullet.base.p535a.C10311a;
import com.bytedance.ies.bullet.core.kit.bridge.IBridge;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.commerce.AsyncGoodsEditInfoMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.commerce.GetGoodsInfoMethod;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.bullet.a.a */
public final class C23559a extends C10311a {

    /* renamed from: a */
    public static final C23560a f62164a = new C23560a(null);

    /* renamed from: com.ss.android.ugc.aweme.bullet.a.a$a */
    public static final class C23560a {
        private C23560a() {
        }

        public /* synthetic */ C23560a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: f */
    public final List<IBridge> mo25047f(C10403b bVar) {
        C7573i.m23587b(bVar, "ctx");
        return C7525m.m23464b((T[]) new BaseBridge[]{new AsyncGoodsEditInfoMethod(bVar), new GetGoodsInfoMethod(bVar)});
    }
}
