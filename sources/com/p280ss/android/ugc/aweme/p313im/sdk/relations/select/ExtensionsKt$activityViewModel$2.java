package com.p280ss.android.ugc.aweme.p313im.sdk.relations.select;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7584c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.ExtensionsKt$activityViewModel$2 */
public final class ExtensionsKt$activityViewModel$2 extends Lambda implements C7561a<VM> {
    final /* synthetic */ C7561a $keyFactory;
    final /* synthetic */ C0043i $lifecycleOwner;
    final /* synthetic */ C7584c $viewModelClass;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.ExtensionsKt$activityViewModel$2$a */
    public static final class C31793a implements C0067b {

        /* renamed from: a */
        final /* synthetic */ ExtensionsKt$activityViewModel$2 f83177a;

        public C31793a(ExtensionsKt$activityViewModel$2 extensionsKt$activityViewModel$2) {
            this.f83177a = extensionsKt$activityViewModel$2;
        }

        /* renamed from: a */
        public final <T extends C0063u> T mo149a(Class<T> cls) {
            C7573i.m23587b(cls, "modelClass");
            StringBuilder sb = new StringBuilder();
            sb.append(this.f83177a.$viewModelClass.getClass().getSimpleName());
            sb.append(" should be created in the host before being used.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public ExtensionsKt$activityViewModel$2(C7584c cVar, C0043i iVar, C7561a aVar) {
        this.$viewModelClass = cVar;
        this.$lifecycleOwner = iVar;
        this.$keyFactory = aVar;
        super(0);
    }

    public final VM invoke() {
        C0065w wVar;
        C31793a aVar = new C31793a(this);
        C0043i iVar = this.$lifecycleOwner;
        if (iVar instanceof Fragment) {
            wVar = C0069x.m158a((Fragment) this.$lifecycleOwner, (C0067b) aVar);
        } else if (iVar instanceof FragmentActivity) {
            wVar = C0069x.m160a((FragmentActivity) this.$lifecycleOwner, (C0067b) aVar);
        } else {
            wVar = null;
        }
        if (wVar != null) {
            return wVar.mo148a((String) this.$keyFactory.invoke(), C7560a.m23571a(this.$viewModelClass));
        }
        return null;
    }
}
