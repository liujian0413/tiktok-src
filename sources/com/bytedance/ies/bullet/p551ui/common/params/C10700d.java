package com.bytedance.ies.bullet.p551ui.common.params;

import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.ies.bullet.core.params.C10465h;
import com.bytedance.ies.bullet.core.params.C10468k;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.ies.bullet.ui.common.params.d */
public final class C10700d {

    /* renamed from: a */
    public static final C10700d f28595a = new C10700d();

    /* renamed from: b */
    private static final C10465h<C10699c> f28596b = new C10468k(C10699c.class);

    /* renamed from: c */
    private static final C10465h<TopBarType> f28597c = new C10468k(TopBarType.class);

    /* renamed from: d */
    private static final C10465h<NavBtnType> f28598d = new C10468k(NavBtnType.class);

    private C10700d() {
    }

    /* renamed from: a */
    public static C10465h<C10699c> m31251a() {
        return f28596b;
    }

    static {
        C10465h<C10699c> hVar = f28596b;
        hVar.mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) new UIParamTypes$$special$$inlined$registerUriQueryHandler$1<Object,Object,Object>());
        hVar.mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) new UIParamTypes$$special$$inlined$registerUriQueryHandler$2<Object,Object,Object,Object>());
        C10465h<TopBarType> hVar2 = f28597c;
        hVar2.mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) new UIParamTypes$$special$$inlined$registerUriQueryHandler$3<Object,Object,Object>());
        hVar2.mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) new UIParamTypes$$special$$inlined$registerUriQueryHandler$4<Object,Object,Object,Object>());
        C10465h<NavBtnType> hVar3 = f28598d;
        hVar3.mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) new UIParamTypes$$special$$inlined$registerUriQueryHandler$5<Object,Object,Object>());
        hVar3.mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) new UIParamTypes$$special$$inlined$registerUriQueryHandler$6<Object,Object,Object,Object>());
    }
}
