package com.p280ss.android.ugc.aweme.comment.widgets;

import com.bytedance.widget.Widget;
import com.p280ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7584c;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$$special$$inlined$viewModel$3 */
public final class SearchGifWidget$$special$$inlined$viewModel$3 extends Lambda implements C7561a<GifEmojiListViewModel> {
    final /* synthetic */ C7562b $argumentsAcceptor;
    final /* synthetic */ C7561a $keyFactory;
    final /* synthetic */ Widget $this_viewModel;
    final /* synthetic */ C7584c $viewModelClass;

    public SearchGifWidget$$special$$inlined$viewModel$3(Widget widget, C7561a aVar, C7584c cVar, C7562b bVar) {
        this.$this_viewModel = widget;
        this.$keyFactory = aVar;
        this.$viewModelClass = cVar;
        this.$argumentsAcceptor = bVar;
        super(0);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel, com.bytedance.jedi.arch.JediViewModel]
      assigns: [com.bytedance.jedi.arch.JediViewModel]
      uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel, java.lang.Object]
      mth insns count: 36
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel invoke() {
        /*
            r3 = this;
            com.bytedance.widget.Widget r0 = r3.$this_viewModel
            java.lang.Object r0 = r0.mo31589n()
            boolean r1 = r0 instanceof android.support.p022v4.app.Fragment
            if (r1 == 0) goto L_0x0019
            android.support.v4.app.Fragment r0 = (android.support.p022v4.app.Fragment) r0
            com.bytedance.widget.Widget r1 = r3.$this_viewModel
            com.bytedance.jedi.arch.af r1 = (com.bytedance.jedi.arch.C11497af) r1
            android.arch.lifecycle.w$b r1 = r1.mo29056f()
            android.arch.lifecycle.w r0 = android.arch.lifecycle.C0069x.m158a(r0, r1)
            goto L_0x002b
        L_0x0019:
            boolean r1 = r0 instanceof android.support.p022v4.app.FragmentActivity
            if (r1 == 0) goto L_0x0057
            android.support.v4.app.FragmentActivity r0 = (android.support.p022v4.app.FragmentActivity) r0
            com.bytedance.widget.Widget r1 = r3.$this_viewModel
            com.bytedance.jedi.arch.af r1 = (com.bytedance.jedi.arch.C11497af) r1
            android.arch.lifecycle.w$b r1 = r1.mo29056f()
            android.arch.lifecycle.w r0 = android.arch.lifecycle.C0069x.m160a(r0, r1)
        L_0x002b:
            kotlin.jvm.a.a r1 = r3.$keyFactory
            java.lang.Object r1 = r1.invoke()
            java.lang.String r1 = (java.lang.String) r1
            kotlin.reflect.c r2 = r3.$viewModelClass
            java.lang.Class r2 = kotlin.jvm.C7560a.m23571a(r2)
            android.arch.lifecycle.u r0 = r0.mo148a(r1, r2)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            com.bytedance.jedi.arch.o r1 = r0.f31065b
            java.lang.Class<com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel> r2 = com.p280ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel.class
            com.bytedance.jedi.arch.n r1 = r1.mo29189a(r2)
            if (r1 == 0) goto L_0x0051
            java.lang.String r2 = "this"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            r1.binding(r0)
        L_0x0051:
            kotlin.jvm.a.b r1 = r3.$argumentsAcceptor
            r0.mo29034a(r1)
            return r0
        L_0x0057:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.widgets.SearchGifWidget$$special$$inlined$viewModel$3.invoke():com.bytedance.jedi.arch.JediViewModel");
    }
}
