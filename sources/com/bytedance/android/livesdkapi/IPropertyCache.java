package com.bytedance.android.livesdkapi;

import com.bytedance.android.live.base.C2324b;

public interface IPropertyCache extends C2324b {

    public enum PropertyType {
        Boolean,
        Integer,
        Long,
        Float,
        String,
        StrSet
    }

    /* renamed from: com.bytedance.android.livesdkapi.IPropertyCache$a */
    public interface C9283a {
        Object defValue();

        String key();

        boolean supportPersist();

        PropertyType type();
    }

    /* renamed from: a */
    void mo22764a(C9283a aVar, int i);

    /* renamed from: a */
    void mo22765a(C9283a aVar, String str);

    /* renamed from: a */
    void mo22766a(C9283a aVar, boolean z);

    /* renamed from: a */
    boolean mo22767a(C9283a aVar);

    /* renamed from: b */
    int mo22768b(C9283a aVar);
}
