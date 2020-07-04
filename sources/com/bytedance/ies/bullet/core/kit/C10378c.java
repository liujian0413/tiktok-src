package com.bytedance.ies.bullet.core.kit;

import com.bytedance.ies.bullet.core.C10336c;
import com.bytedance.ies.bullet.core.kit.C10379d;
import com.bytedance.ies.bullet.core.kit.C10380e;
import com.bytedance.ies.bullet.core.kit.C10382g;
import com.bytedance.ies.bullet.core.kit.C10386k;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.model.pipeline.C10410d;
import java.util.List;

/* renamed from: com.bytedance.ies.bullet.core.kit.c */
public interface C10378c<S extends C10386k, T extends C10379d, U extends C10382g, V extends C10380e> {
    void onApiMounted(U u);

    void onInitialized(V v, C10403b bVar);

    U provideInstanceApi(C10400u uVar, List<String> list, C10336c cVar, C10403b bVar);

    C10410d<C10397r> provideProcessor();
}
