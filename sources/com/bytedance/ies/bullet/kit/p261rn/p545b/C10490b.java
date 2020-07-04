package com.bytedance.ies.bullet.kit.p261rn.p545b;

import android.net.Uri.Builder;
import com.bytedance.ies.bullet.kit.p261rn.p545b.C10490b;
import com.bytedance.ies.bullet.kit.p261rn.p545b.C10491c;
import com.bytedance.ies.bullet.p551ui.common.params.C10698b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.kit.rn.b.b */
public abstract class C10490b<T extends C10490b<T, S>, S extends C10491c> extends C10698b<T, S> {
    public C10490b() {
        Builder scheme = new Builder().scheme("react-native");
        C7573i.m23582a((Object) scheme, "Uri.Builder().scheme(\"react-native\")");
        super(scheme);
    }

    /* renamed from: a */
    public final T mo25280a(String str) {
        C7573i.m23587b(str, "channel");
        ((C10491c) mo25109a()).f28221b.mo25250a(str);
        return this;
    }

    /* renamed from: b */
    public final T mo25281b(String str) {
        C7573i.m23587b(str, "bundle");
        ((C10491c) mo25109a()).f28222c.mo25250a(str);
        return this;
    }

    /* renamed from: c */
    public final T mo25282c(String str) {
        C7573i.m23587b(str, "moduleName");
        ((C10491c) mo25109a()).f28223d.mo25250a(str);
        return this;
    }
}
