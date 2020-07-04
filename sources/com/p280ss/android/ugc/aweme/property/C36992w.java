package com.p280ss.android.ugc.aweme.property;

import com.p280ss.android.ugc.aweme.property.PropertyStore.C36952a;
import com.p280ss.android.ugc.aweme.property.PropertyStore.PropertyType;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.property.w */
public final class C36992w implements C36952a {

    /* renamed from: a */
    public final String f96910a;

    /* renamed from: b */
    private final C7561a<Boolean> f96911b;

    /* renamed from: c */
    private final C7562b<Boolean, C7581n> f96912c;

    public final String key() {
        return this.f96910a;
    }

    public final boolean supportPersist() {
        return true;
    }

    public final PropertyType type() {
        return PropertyType.Boolean;
    }

    public final Object defValue() {
        return Boolean.valueOf(false);
    }

    /* renamed from: a */
    public final boolean mo93417a() {
        return ((Boolean) this.f96911b.invoke()).booleanValue();
    }

    /* renamed from: a */
    public final void mo93416a(boolean z) {
        C7562b<Boolean, C7581n> bVar = this.f96912c;
        if (bVar != null) {
            bVar.invoke(Boolean.valueOf(z));
        }
    }

    public C36992w(String str, C7561a<Boolean> aVar, C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(str, "title");
        C7573i.m23587b(aVar, "valueProvider");
        this.f96910a = str;
        this.f96911b = aVar;
        this.f96912c = bVar;
    }
}
