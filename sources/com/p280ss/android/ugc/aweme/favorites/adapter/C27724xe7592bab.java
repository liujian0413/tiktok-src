package com.p280ss.android.ugc.aweme.favorites.adapter;

import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7584c;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi$ProfileCollectionViewHolderForJedi$$special$$inlined$hostViewModel$1 */
public final class C27724xe7592bab extends Lambda implements C7561a<ProfileCollectionViewModel> {
    final /* synthetic */ JediViewHolder $this_hostViewModel;
    final /* synthetic */ C7584c $viewModelClass;
    final /* synthetic */ C7584c $viewModelClass$inlined;

    public C27724xe7592bab(JediViewHolder jediViewHolder, C7584c cVar, C7584c cVar2) {
        this.$this_hostViewModel = jediViewHolder;
        this.$viewModelClass = cVar;
        this.$viewModelClass$inlined = cVar2;
        super(0);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2, types: [com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel] */
    /* JADX WARNING: type inference failed for: r3v4, types: [com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARNING: type inference failed for: r3v8, types: [com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v8, types: [com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel, com.bytedance.jedi.arch.JediViewModel]
      assigns: [com.bytedance.jedi.arch.JediViewModel]
      uses: [com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel]
      mth insns count: 49
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel invoke() {
        /*
            r5 = this;
            com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r5.$this_hostViewModel
            android.arch.lifecycle.i r0 = r0.mo29227n()
            java.lang.Object r0 = com.bytedance.jedi.ext.adapter.C11678a.m34219a(r0)
            kotlin.reflect.c r1 = r5.$viewModelClass$inlined
            java.lang.Class r1 = kotlin.jvm.C7560a.m23571a(r1)
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "viewModelClass.java.name"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            boolean r2 = r0 instanceof android.support.p022v4.app.Fragment
            if (r2 == 0) goto L_0x0057
            android.support.v4.app.Fragment r0 = (android.support.p022v4.app.Fragment) r0
            r2 = r0
        L_0x0020:
            if (r2 == 0) goto L_0x003a
            android.arch.lifecycle.w$b r3 = com.bytedance.jedi.arch.C11498b.m33903a()     // Catch:{ ViewModelNotCreatedException -> 0x0037 }
            android.arch.lifecycle.w r3 = android.arch.lifecycle.C0069x.m158a(r2, r3)     // Catch:{ ViewModelNotCreatedException -> 0x0037 }
            kotlin.reflect.c r4 = r5.$viewModelClass     // Catch:{ ViewModelNotCreatedException -> 0x0037 }
            java.lang.Class r4 = kotlin.jvm.C7560a.m23571a(r4)     // Catch:{ ViewModelNotCreatedException -> 0x0037 }
            android.arch.lifecycle.u r3 = r3.mo148a(r1, r4)     // Catch:{ ViewModelNotCreatedException -> 0x0037 }
            com.bytedance.jedi.arch.JediViewModel r3 = (com.bytedance.jedi.arch.JediViewModel) r3     // Catch:{ ViewModelNotCreatedException -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            android.support.v4.app.Fragment r2 = r2.mParentFragment
            goto L_0x0020
        L_0x003a:
            r3 = 0
        L_0x003b:
            if (r3 != 0) goto L_0x0056
            android.support.v4.app.FragmentActivity r0 = r0.requireActivity()
            android.arch.lifecycle.w$b r2 = com.bytedance.jedi.arch.C11498b.m33903a()
            android.arch.lifecycle.w r0 = android.arch.lifecycle.C0069x.m160a(r0, r2)
            kotlin.reflect.c r2 = r5.$viewModelClass
            java.lang.Class r2 = kotlin.jvm.C7560a.m23571a(r2)
            android.arch.lifecycle.u r0 = r0.mo148a(r1, r2)
            r3 = r0
            com.bytedance.jedi.arch.JediViewModel r3 = (com.bytedance.jedi.arch.JediViewModel) r3
        L_0x0056:
            return r3
        L_0x0057:
            boolean r2 = r0 instanceof android.support.p022v4.app.FragmentActivity
            if (r2 == 0) goto L_0x0077
            android.support.v4.app.FragmentActivity r0 = (android.support.p022v4.app.FragmentActivity) r0
            android.arch.lifecycle.w$b r2 = com.bytedance.jedi.arch.C11498b.m33903a()
            android.arch.lifecycle.w r0 = android.arch.lifecycle.C0069x.m160a(r0, r2)
            kotlin.reflect.c r2 = r5.$viewModelClass
            java.lang.Class r2 = kotlin.jvm.C7560a.m23571a(r2)
            android.arch.lifecycle.u r0 = r0.mo148a(r1, r2)
            java.lang.String r1 = "ViewModelProviders\n     …key, viewModelClass.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            return r0
        L_0x0077:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.adapter.C27724xe7592bab.invoke():com.bytedance.jedi.arch.JediViewModel");
    }
}
