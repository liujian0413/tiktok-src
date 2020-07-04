package com.bytedance.ies.bullet.core.kit.p541a;

import com.bytedance.ies.bullet.core.kit.p541a.C10355a;
import java.util.Map.Entry;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.kit.a.c */
public abstract class C10357c<T extends C10355a<T>> implements C10355a<T> {
    /* renamed from: a */
    public final void mo25123a(T t, boolean z) {
        C7573i.m23587b(t, "other");
        for (Entry entry : t.mo25119a().entrySet()) {
            C10356b bVar = (C10356b) mo25119a().get(entry.getKey());
            if (bVar != null) {
                if (bVar == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.setting.IPropertySetter<kotlin.Any>");
                } else if (bVar != null) {
                    C10356b bVar2 = (C10356b) entry.getValue();
                    if (bVar2 == null) {
                        continue;
                    } else if (bVar2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.setting.IPropertySetter<kotlin.Any>");
                    } else if (bVar2 != null) {
                        bVar.mo25120a(bVar2, false);
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
