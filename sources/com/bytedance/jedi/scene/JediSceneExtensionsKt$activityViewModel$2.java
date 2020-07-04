package com.bytedance.jedi.scene;

import android.app.Activity;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import kotlin.TypeCastException;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7584c;

public final class JediSceneExtensionsKt$activityViewModel$2 extends Lambda implements C7561a<VM> {
    final /* synthetic */ C7561a $keyFactory;
    final /* synthetic */ C12629j $this_activityViewModel;
    final /* synthetic */ C7584c $viewModelClass;

    public JediSceneExtensionsKt$activityViewModel$2(C12629j jVar, C7561a aVar, C7584c cVar) {
        this.$this_activityViewModel = jVar;
        this.$keyFactory = aVar;
        this.$viewModelClass = cVar;
        super(0);
    }

    public final VM invoke() {
        Activity v = this.$this_activityViewModel.mo31015v();
        if (v != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) v;
            C7573i.m23586b();
            return (JediViewModel) C0069x.m160a(fragmentActivity, (C0067b) new C0067b() {
                /* renamed from: a */
                public final <T extends C0063u> T mo149a(Class<T> cls) {
                    C7573i.m23587b(cls, "modelClass");
                    StringBuilder sb = new StringBuilder();
                    C7573i.m23581a(4, "VM");
                    sb.append(JediViewModel.class.getSimpleName());
                    sb.append(" should be created in the activity before being used.");
                    throw new IllegalStateException(sb.toString());
                }
            }).mo148a((String) this.$keyFactory.invoke(), C7560a.m23571a(this.$viewModelClass));
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
