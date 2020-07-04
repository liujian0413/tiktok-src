package com.bytedance.ies.bullet.kit.p261rn;

import com.bytedance.ies.bullet.core.C10336c;
import com.bytedance.ies.bullet.core.kit.C10378c;
import com.bytedance.ies.bullet.core.kit.C10397r;
import com.bytedance.ies.bullet.core.kit.C10400u;
import com.bytedance.ies.bullet.core.kit.KitNotMatchException;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.model.pipeline.C10410d;
import com.facebook.react.bridge.OnRNLoadExceptionListener;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.react.bridge.ReactBridge.JSExceptionListener;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.kit.rn.RnKitApi */
public final class RnKitApi implements C10378c<C10582n, C10580l, C10583o, C10581m> {

    /* renamed from: com.bytedance.ies.bullet.kit.rn.RnKitApi$a */
    static final class C10483a implements OnRNLoadExceptionListener {

        /* renamed from: a */
        final /* synthetic */ C10505i f28210a;

        C10483a(C10505i iVar) {
            this.f28210a = iVar;
        }

        public final void onLoadError(String str) {
            if (this.f28210a != null) {
                C7573i.m23582a((Object) str, "it");
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.RnKitApi$b */
    static final class C10484b implements JSExceptionListener {

        /* renamed from: a */
        public static final C10484b f28211a = new C10484b();

        C10484b() {
        }

        public final void upLoad(JSONObject jSONObject) {
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.RnKitApi$c */
    public static final class C10485c implements C10410d<C10397r> {

        /* renamed from: a */
        final /* synthetic */ RnKitApi f28212a;

        C10485c(RnKitApi rnKitApi) {
            this.f28212a = rnKitApi;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo25083a(C10397r rVar, C7562b<? super C10397r, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
            C7573i.m23587b(rVar, "input");
            C7573i.m23587b(bVar, "resolve");
            C7573i.m23587b(bVar2, "reject");
            if (C7573i.m23585a((Object) rVar.f28126a.getScheme(), (Object) "react-native")) {
                bVar.invoke(rVar);
                return;
            }
            KitNotMatchException kitNotMatchException = new KitNotMatchException(this.f28212a, rVar.f28126a, null, 4, null);
            bVar2.invoke(kitNotMatchException);
        }
    }

    public final void onApiMounted(C10583o oVar) {
        C7573i.m23587b(oVar, "kitInstanceApi");
    }

    public final C10410d<C10397r> provideProcessor() {
        return new C10485c<>(this);
    }

    public final void onInitialized(C10581m mVar, C10403b bVar) {
        C10505i iVar;
        C7573i.m23587b(bVar, "contextProviderFactory");
        if (mVar != null) {
            iVar = mVar.mo25362a();
        } else {
            iVar = null;
        }
        ReactBridge.staticInit(new C10483a(iVar));
        ReactBridge.setJSExceptionListener(C10484b.f28211a);
    }

    public final C10583o provideInstanceApi(C10400u uVar, List<String> list, C10336c cVar, C10403b bVar) {
        C7573i.m23587b(uVar, "sessionInfo");
        C7573i.m23587b(list, "packageNames");
        C7573i.m23587b(cVar, "kitPackageRegistryBundle");
        C7573i.m23587b(bVar, "providerFactory");
        C10583o oVar = new C10583o(this, uVar, list, cVar, bVar);
        return oVar;
    }
}
