package com.bytedance.scene.ktx;

import com.bytedance.scene.C12629j;
import com.bytedance.scene.group.C12604b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.scene.ktx.a */
public final class C12636a {
    /* renamed from: b */
    public static final void m36711b(C12604b bVar, String str) {
        C7573i.m23587b(bVar, "$this$hide");
        C7573i.m23587b(str, "tag");
        C12629j a = bVar.mo30924a(str);
        if (a != null) {
            bVar.mo30940c(a);
        }
    }

    /* renamed from: c */
    public static final void m36712c(C12604b bVar, String str) {
        C7573i.m23587b(bVar, "$this$remove");
        C7573i.m23587b(str, "tag");
        C12629j a = bVar.mo30924a(str);
        if (a != null) {
            bVar.mo30935b(a);
        }
    }

    /* renamed from: a */
    public static final void m36710a(C12604b bVar, String str) {
        C7573i.m23587b(bVar, "$this$show");
        C7573i.m23587b(str, "tag");
        C12629j a = bVar.mo30924a(str);
        if (a != null) {
            bVar.mo30945d(a);
        }
    }

    /* renamed from: a */
    public static final void m36709a(C12604b bVar, int i, C12629j jVar, String str) {
        C7573i.m23587b(bVar, "$this$addAndHide");
        C7573i.m23587b(jVar, "scene");
        C7573i.m23587b(str, "tag");
        bVar.mo30920G();
        bVar.mo30925a(i, jVar, str);
        bVar.mo30940c(jVar);
        bVar.mo30921H();
    }
}
