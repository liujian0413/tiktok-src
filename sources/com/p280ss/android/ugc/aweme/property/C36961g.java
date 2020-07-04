package com.p280ss.android.ugc.aweme.property;

import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.PropertyStore.C36952a;
import com.p280ss.android.ugc.aweme.property.PropertyStore.PropertyType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.property.g */
public final class C36961g {

    /* renamed from: com.ss.android.ugc.aweme.property.g$a */
    public static final class C36962a implements C36952a {

        /* renamed from: a */
        final /* synthetic */ String f96864a;

        /* renamed from: b */
        final /* synthetic */ String f96865b;

        public final Object defValue() {
            return this.f96864a;
        }

        public final String key() {
            return this.f96865b;
        }

        public final boolean supportPersist() {
            return false;
        }

        public final PropertyType type() {
            return PropertyType.String;
        }

        C36962a(String str, String str2) {
            this.f96864a = str;
            this.f96865b = str2;
        }
    }

    /* renamed from: a */
    public static final C36981p m118912a(Property property) {
        C7573i.m23587b(property, "$this$getItemMoreMessage");
        C7193k kVar = (C7193k) property.getClass().getField(property.name()).getAnnotation(C7193k.class);
        if (kVar != null) {
            return m118914a(kVar);
        }
        StringBuilder sb = new StringBuilder("Item (");
        sb.append(property.name());
        sb.append(") 配置项必须由 DetailMessage 进行注解 有问题@liuhao.65537");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public static final C36981p m118913a(AVSettings.Property property) {
        C7573i.m23587b(property, "$this$getItemMoreMessage");
        C7193k kVar = (C7193k) property.getClass().getField(property.name()).getAnnotation(C7193k.class);
        if (kVar != null) {
            return m118914a(kVar);
        }
        StringBuilder sb = new StringBuilder("Item (");
        sb.append(property.name());
        sb.append(") 配置项必须由 DetailMessage 进行注解 有问题@liuhao.65537");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    private static C36981p m118914a(C7193k kVar) {
        C7573i.m23587b(kVar, "$this$annotationToItemMoreMessage");
        C36981p pVar = new C36981p(kVar.mo18671a(), kVar.mo18672b(), kVar.mo18673c(), kVar.mo18674d(), kVar.mo18675e(), kVar.mo18676f());
        return pVar;
    }

    /* renamed from: a */
    public static final C36981p m118915a(C36975l lVar) {
        C7573i.m23587b(lVar, "$this$getMoreMessage");
        C7193k kVar = (C7193k) C36975l.f96877a.getClass().getAnnotation(C7193k.class);
        if (kVar == null) {
            C7573i.m23580a();
        }
        return m118914a(kVar);
    }

    /* renamed from: a */
    public static final C36952a m118911a(String str, String str2) {
        C7573i.m23587b(str, "$this$toProperty");
        C7573i.m23587b(str2, "key");
        return new C36962a(str, str2);
    }
}
