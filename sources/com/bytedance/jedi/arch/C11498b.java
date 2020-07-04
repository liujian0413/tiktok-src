package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.arch.b */
public final class C11498b {

    /* renamed from: a */
    private static final C0067b f31095a = new C11499a();

    /* renamed from: com.bytedance.jedi.arch.b$a */
    public static final class C11499a implements C0067b {
        C11499a() {
        }

        /* renamed from: a */
        public final <T extends C0063u> T mo149a(Class<T> cls) {
            C7573i.m23587b(cls, "modelClass");
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getSimpleName());
            sb.append(" should be created in the host before being used.");
            throw new ViewModelNotCreatedException(sb.toString());
        }
    }

    /* renamed from: a */
    public static final C0067b m33903a() {
        return f31095a;
    }
}
