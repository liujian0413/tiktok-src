package com.bytedance.p263im.core.internal.p590db;

import com.bytedance.p263im.core.internal.p590db.p592b.C11339b;
import com.bytedance.p263im.core.internal.p590db.p592b.C11354f;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.p586b.C11209d;

/* renamed from: com.bytedance.im.core.internal.db.t */
public final class C11378t {
    /* renamed from: a */
    public static String m33467a(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static void m33468a(C11339b bVar) {
        if (bVar != null) {
            try {
                bVar.mo27354a();
            } catch (Exception e) {
                C11404d.m33585a("close cursor", (Throwable) e);
                C11209d.m32824a(e);
            }
        }
    }

    /* renamed from: a */
    public static void m33469a(C11354f fVar) {
        if (fVar != null) {
            try {
                fVar.mo27378c();
            } catch (Exception e) {
                C11404d.m33585a("close ISQLiteStatement", (Throwable) e);
                C11209d.m32824a(e);
            }
        }
    }
}
