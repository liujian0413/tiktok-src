package com.p280ss.android.ugc.aweme.property;

import com.p280ss.android.ugc.aweme.property.PropertyStore.C36952a;
import com.p280ss.android.ugc.aweme.property.PropertyStore.PropertyType;

/* renamed from: com.ss.android.ugc.aweme.property.s */
public abstract /* synthetic */ class C36988s {
    /* renamed from: a */
    public static Object m118987a(C36952a aVar, PropertyType propertyType, Object obj) {
        if (propertyType == null) {
            throw new NullPointerException();
        } else if (propertyType == PropertyType.Boolean && !(obj instanceof Boolean)) {
            throw new IllegalArgumentException();
        } else if (propertyType == PropertyType.Float && !(obj instanceof Float)) {
            throw new IllegalArgumentException();
        } else if (propertyType == PropertyType.Integer && !(obj instanceof Integer)) {
            throw new IllegalArgumentException();
        } else if (propertyType != PropertyType.Long || (obj instanceof Long)) {
            if (propertyType != PropertyType.String || (obj instanceof String)) {
                return obj;
            }
            throw new IllegalArgumentException();
        } else if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        } else {
            throw new IllegalArgumentException();
        }
    }
}
