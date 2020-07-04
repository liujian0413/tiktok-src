package com.bytedance.android.livesdk.rank.model;

import com.bytedance.android.livesdk.adapter.C3881d;

/* renamed from: com.bytedance.android.livesdk.rank.model.g */
public class C8858g implements C3881d<C8858g> {

    /* renamed from: a */
    public String f24107a;

    /* renamed from: b */
    public int f24108b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean mo11421a(C8858g gVar) {
        return this == gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean mo11422b(C8858g gVar) {
        if (this.f24107a == gVar.f24107a && this.f24108b == gVar.f24108b) {
            return true;
        }
        return false;
    }

    public C8858g(String str, int i) {
        this.f24107a = str;
        this.f24108b = i;
    }
}
