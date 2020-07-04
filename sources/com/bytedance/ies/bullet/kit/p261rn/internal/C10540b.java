package com.bytedance.ies.bullet.kit.p261rn.internal;

import com.bytedance.ies.bullet.core.kit.bridge.C10375f;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.kit.p261rn.C10488b;
import com.bytedance.ies.bullet.kit.p261rn.C10498e;
import com.bytedance.ies.bullet.kit.p261rn.C10504h;
import com.bytedance.ies.bullet.kit.p261rn.C10583o;
import com.bytedance.ies.bullet.kit.p261rn.C10589p;
import com.bytedance.ies.bullet.kit.p261rn.internal.wrapper.NativeModuleWrapper.C10561a;
import com.bytedance.ies.bullet.kit.p261rn.internal.wrapper.SimpleViewManagerWrapper.C10563a;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.kit.rn.internal.b */
public final class C10540b implements ReactPackage {

    /* renamed from: a */
    public final C10583o f28263a;

    /* renamed from: b */
    public final C10375f f28264b;

    /* renamed from: c */
    public final List<C10504h> f28265c;

    /* renamed from: d */
    public final C10403b f28266d;

    public final List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        C7573i.m23587b(reactApplicationContext, "reactContext");
        List<ViewManager<?, ?>> arrayList = new ArrayList<>();
        C10403b a = this.f28266d.mo25198a();
        a.mo25201a(ReactApplicationContext.class, reactApplicationContext);
        Iterable<C10504h> iterable = this.f28265c;
        Collection arrayList2 = new ArrayList();
        for (C10504h b : iterable) {
            Iterable<C10498e> b2 = b.mo25305b(new C10589p(this.f28263a), a);
            Collection arrayList3 = new ArrayList(C7525m.m23469a(b2, 10));
            for (C10498e eVar : b2) {
                if (eVar != null) {
                    arrayList3.add(C10563a.m30945a(eVar));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.rn.BulletSimpleViewManager<android.view.View>");
                }
            }
            C7525m.m23478a(arrayList2, (Iterable<? extends T>) (List) arrayList3);
        }
        arrayList.addAll((List) arrayList2);
        return arrayList;
    }

    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        C7573i.m23587b(reactApplicationContext, "reactContext");
        List<NativeModule> c = C7525m.m23466c(new RnBridgeModule(reactApplicationContext, this.f28264b));
        C10403b a = this.f28266d.mo25198a();
        a.mo25201a(ReactApplicationContext.class, reactApplicationContext);
        Iterable<C10504h> iterable = this.f28265c;
        Collection arrayList = new ArrayList();
        for (C10504h a2 : iterable) {
            Iterable<C10488b> a3 = a2.mo25304a(new C10589p(this.f28263a), a);
            Collection arrayList2 = new ArrayList(C7525m.m23469a(a3, 10));
            for (C10488b a4 : a3) {
                arrayList2.add(C10561a.m30942a(a4));
            }
            C7525m.m23478a(arrayList, (Iterable<? extends T>) (List) arrayList2);
        }
        c.addAll((List) arrayList);
        return c;
    }

    public C10540b(C10583o oVar, C10375f fVar, List<? extends C10504h> list, C10403b bVar) {
        C7573i.m23587b(oVar, "instance");
        C7573i.m23587b(list, "exportReactPackageDelegates");
        C7573i.m23587b(bVar, "providerFactory");
        this.f28263a = oVar;
        this.f28264b = fVar;
        this.f28265c = list;
        this.f28266d = bVar;
    }
}
