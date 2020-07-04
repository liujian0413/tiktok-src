package com.bytedance.ies.bullet.p551ui.common.p553b;

import android.view.View;
import com.bytedance.ies.bullet.core.C10336c;
import com.bytedance.ies.bullet.core.kit.C10378c;
import com.bytedance.ies.bullet.core.kit.C10388m;
import com.bytedance.ies.bullet.core.kit.C10400u;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.p551ui.common.C10689d;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.ies.bullet.ui.common.b.b */
public abstract class C10680b<T extends View> extends C10388m implements C10678a<T> {

    /* renamed from: m */
    public final List<C10682c<T>> f28558m = new ArrayList();

    /* renamed from: com.bytedance.ies.bullet.ui.common.b.b$a */
    static final class C10681a extends Lambda implements C7562b<List<? extends C10682c<T>>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10680b f28559a;

        /* renamed from: b */
        final /* synthetic */ C7562b f28560b;

        C10681a(C10680b bVar, C7562b bVar2) {
            this.f28559a = bVar;
            this.f28560b = bVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m31204a((List) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m31204a(List<C10682c<T>> list) {
            C7573i.m23587b(list, "it");
            List<C10682c<T>> list2 = this.f28559a.f28558m;
            list2.clear();
            list2.addAll(list);
            this.f28560b.invoke(list);
        }
    }

    /* renamed from: a */
    public abstract void mo25364a(C7562b<? super List<C10682c<T>>, C7581n> bVar);

    /* renamed from: u */
    public final List<C10682c<T>> mo25555u() {
        return this.f28558m;
    }

    /* renamed from: v */
    public final C10689d mo25556v() {
        return (C10689d) mo25185r().mo25202b(C10689d.class);
    }

    /* renamed from: b */
    public final void mo25554b(C7562b<? super List<C10682c<T>>, C7581n> bVar) {
        C7573i.m23587b(bVar, "provider");
        mo25364a(new C10681a(this, bVar));
    }

    public C10680b(C10378c<?, ?, ?, ?> cVar, C10400u uVar, List<String> list, C10336c cVar2, C10403b bVar) {
        C7573i.m23587b(cVar, "kitApi");
        C7573i.m23587b(uVar, "sessionInfo");
        C7573i.m23587b(list, "packageNames");
        C7573i.m23587b(cVar2, "kitPackageRegistryBundle");
        C7573i.m23587b(bVar, "providerFactory");
        super(cVar, uVar, list, cVar2, bVar);
    }
}
