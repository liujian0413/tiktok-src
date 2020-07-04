package com.bytedance.ies.bullet.core.params;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.params.n */
public abstract class C10471n {
    /* renamed from: a */
    public abstract Map<String, C10463f<?>> mo25105a();

    /* renamed from: a */
    public final <R> void mo25262a(Class<R> cls, R r) {
        C7573i.m23587b(cls, "inputType");
        for (Entry value : mo25105a().entrySet()) {
            ((C10463f) value.getValue()).mo25249a(cls, r);
        }
    }

    /* renamed from: b */
    public final <R> R mo25263b(Class<R> cls, R r) {
        C7573i.m23587b(cls, "inputType");
        for (Entry value : mo25105a().entrySet()) {
            r = ((C10463f) value.getValue()).mo25252b(cls, r);
        }
        return r;
    }
}
