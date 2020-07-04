package com.bytedance.ies.bullet.p551ui.common;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.bullet.core.C10331b.C10333b;
import com.bytedance.ies.bullet.core.kit.C10378c;
import com.bytedance.ies.bullet.core.kit.C10382g;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.params.C10464g;
import com.bytedance.ies.bullet.core.params.C10471n;
import com.bytedance.ies.bullet.p551ui.common.C10690e.C10691a;
import com.bytedance.ies.bullet.p551ui.common.p553b.C10682c;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView */
public final class BulletContainerView extends FrameLayout implements C10690e {

    /* renamed from: a */
    private final C10692f f28542a;

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$a */
    public static final class C10670a implements C10464g<Bundle> {

        /* renamed from: a */
        public final Bundle f28543a;

        /* renamed from: b */
        final /* synthetic */ C10691a f28544b;

        /* renamed from: c */
        final /* synthetic */ Bundle f28545c;

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo25253a() {
            return this.f28543a;
        }

        /* renamed from: a */
        public final void mo25254a(C10471n nVar) {
            C7573i.m23587b(nVar, "param");
            C10691a aVar = this.f28544b;
            if (aVar != null) {
                aVar.mo25545a(nVar);
            }
        }

        C10670a(C10691a aVar, Bundle bundle) {
            this.f28544b = aVar;
            this.f28545c = bundle;
            this.f28543a = bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$b */
    static final class C10671b extends Lambda implements C7562b<C10403b, C7581n> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f28546a;

        C10671b(BulletContainerView bulletContainerView) {
            this.f28546a = bulletContainerView;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m31168a((C10403b) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m31168a(C10403b bVar) {
            C7573i.m23587b(bVar, "it");
            bVar.mo25201a(C10690e.class, this.f28546a);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$c */
    static final class C10672c extends Lambda implements C7562b<C10682c<? extends View>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f28547a;

        C10672c(BulletContainerView bulletContainerView) {
            this.f28547a = bulletContainerView;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m31169a((C10682c) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m31169a(C10682c<? extends View> cVar) {
            C7573i.m23587b(cVar, "it");
            this.f28547a.addView(cVar.f28561a, cVar.f28562b);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$d */
    static final class C10673d extends Lambda implements C48006q<C10382g, List<? extends C10682c<? extends View>>, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10691a f28548a;

        /* renamed from: b */
        final /* synthetic */ Uri f28549b;

        C10673d(C10691a aVar, Uri uri) {
            this.f28548a = aVar;
            this.f28549b = uri;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m31170a((C10382g) obj, (List) obj2, ((Boolean) obj3).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m31170a(C10382g gVar, List<? extends C10682c<? extends View>> list, boolean z) {
            C7573i.m23587b(gVar, "instance");
            C7573i.m23587b(list, "viewComponents");
            C10691a aVar = this.f28548a;
            if (aVar != null) {
                aVar.mo25543a(this.f28549b, gVar, list, z);
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$e */
    static final class C10674e extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10691a f28550a;

        /* renamed from: b */
        final /* synthetic */ Uri f28551b;

        C10674e(C10691a aVar, Uri uri) {
            this.f28550a = aVar;
            this.f28551b = uri;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m31171a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m31171a(Throwable th) {
            C7573i.m23587b(th, "it");
            C10691a aVar = this.f28550a;
            if (aVar != null) {
                aVar.mo25544a(this.f28551b, th);
            }
        }
    }

    public BulletContainerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BulletContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo25110a() {
        this.f28542a.mo25110a();
    }

    public final C10403b getProviderFactory() {
        return this.f28542a.mo25563b();
    }

    /* renamed from: a */
    public final <T extends C10378c<?, ?, ?, ?>> C10382g mo25067a(Class<? extends T> cls) {
        C7573i.m23587b(cls, "clazz");
        return this.f28542a.mo25067a(cls);
    }

    /* renamed from: a */
    public final C10382g mo25068a(String str) {
        C7573i.m23587b(str, "sessionId");
        return this.f28542a.mo25068a(str);
    }

    /* renamed from: a */
    public final void mo25098a(C10333b bVar) {
        C7573i.m23587b(bVar, "coreProvider");
        this.f28542a.mo25098a(bVar);
    }

    public BulletContainerView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f28542a = new C10684c(context);
    }

    /* renamed from: a */
    public final void mo25549a(Uri uri, Bundle bundle, C10691a aVar) {
        C7573i.m23587b(uri, "uri");
        aVar.mo25542a(uri);
        getProviderFactory().mo25201a(C10464g.class, new C10670a(aVar, bundle));
        this.f28542a.mo25562a(uri, new C10671b(this), new C10672c(this), new C10673d(aVar, uri), new C10674e(aVar, uri));
    }

    public /* synthetic */ BulletContainerView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
