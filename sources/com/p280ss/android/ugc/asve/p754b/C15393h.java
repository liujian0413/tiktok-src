package com.p280ss.android.ugc.asve.p754b;

import com.p280ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.b.h */
public final class C15393h extends C15390e {

    /* renamed from: a */
    public String f39695a;

    /* renamed from: b */
    public String[] f39696b;

    /* renamed from: c */
    public String[] f39697c;

    /* renamed from: d */
    public String f39698d;

    /* renamed from: e */
    public int f39699e;

    /* renamed from: f */
    public int f39700f;

    public C15393h(String str, String[] strArr, String[] strArr2) {
        this(str, strArr, strArr2, null, 0, 0, 56, null);
    }

    /* renamed from: a */
    public final void mo38889a(String[] strArr) {
        C7573i.m23587b(strArr, "<set-?>");
        this.f39696b = strArr;
    }

    /* renamed from: a */
    public final int mo38886a(VEEditor vEEditor, boolean z) {
        C7573i.m23587b(vEEditor, "editor");
        if (z) {
            return vEEditor.mo107897a(this.f39695a, this.f39696b, this.f39697c);
        }
        return vEEditor.mo107898a(this.f39695a, this.f39696b, this.f39697c, this.f39698d, this.f39699e, this.f39700f);
    }

    public C15393h(String str, String[] strArr, String[] strArr2, String str2, int i, int i2) {
        C7573i.m23587b(str, "mvPath");
        C7573i.m23587b(strArr, "resourcesFilePaths");
        C7573i.m23587b(strArr2, "resourcesTypes");
        this.f39695a = str;
        this.f39696b = strArr;
        this.f39697c = strArr2;
        this.f39698d = str2;
        this.f39699e = i;
        this.f39700f = i2;
    }

    public /* synthetic */ C15393h(String str, String[] strArr, String[] strArr2, String str2, int i, int i2, int i3, C7571f fVar) {
        this(str, strArr, strArr2, null, 0, 0);
    }
}
