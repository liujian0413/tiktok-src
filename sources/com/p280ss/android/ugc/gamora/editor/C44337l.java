package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.editor.l */
public final class C44337l extends C12629j implements C44396a {

    /* renamed from: k */
    public static final C44338a f114553k = new C44338a(null);

    /* renamed from: i */
    public RelativeLayout f114554i;

    /* renamed from: j */
    public RelativeLayout f114555j;

    /* renamed from: l */
    private EditCornerViewModel f114556l;

    /* renamed from: com.ss.android.ugc.gamora.editor.l$a */
    public static final class C44338a {
        private C44338a() {
        }

        public /* synthetic */ C44338a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.l$b */
    static final class C44339b extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44337l f114557a;

        C44339b(C44337l lVar) {
            this.f114557a = lVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140275a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140275a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            RelativeLayout relativeLayout = this.f114557a.f114554i;
            int i2 = 4;
            if (relativeLayout != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 4;
                }
                relativeLayout.setVisibility(i);
            }
            RelativeLayout relativeLayout2 = this.f114557a.f114555j;
            if (relativeLayout2 != null) {
                if (z) {
                    i2 = 0;
                }
                relativeLayout2.setVisibility(i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.l$c */
    static final class C44340c extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44337l f114558a;

        C44340c(C44337l lVar) {
            this.f114558a = lVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140276a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140276a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            RelativeLayout relativeLayout = this.f114558a.f114554i;
            if (relativeLayout != null) {
                LayoutParams layoutParams = relativeLayout.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = i;
                    relativeLayout.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.l$d */
    static final class C44341d extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44337l f114559a;

        C44341d(C44337l lVar) {
            this.f114559a = lVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140277a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140277a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            RelativeLayout relativeLayout = this.f114559a.f114555j;
            if (relativeLayout != null) {
                LayoutParams layoutParams = relativeLayout.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = i;
                    relativeLayout.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditCornerViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…nerViewModel::class.java)");
            this.f114556l = (EditCornerViewModel) a;
            if (C39805en.m127445a()) {
                this.f114554i = (RelativeLayout) mo31002b((int) R.id.a3b);
                this.f114555j = (RelativeLayout) mo31002b((int) R.id.a3a);
                EditCornerViewModel editCornerViewModel = this.f114556l;
                if (editCornerViewModel == null) {
                    C7573i.m23583a("cornerViewModel");
                }
                editCornerViewModel.mo106198a(true);
            }
            EditCornerViewModel editCornerViewModel2 = this.f114556l;
            if (editCornerViewModel2 == null) {
                C7573i.m23583a("cornerViewModel");
            }
            mo91868b(editCornerViewModel2, C44342m.f114560a, new C11672v(), new C44339b(this));
            EditCornerViewModel editCornerViewModel3 = this.f114556l;
            if (editCornerViewModel3 == null) {
                C7573i.m23583a("cornerViewModel");
            }
            
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007c: INVOKE  (r8v0 'this' com.ss.android.ugc.gamora.editor.l A[THIS]), (r9v10 'editCornerViewModel3' com.ss.android.ugc.gamora.editor.EditCornerViewModel), (wrap: kotlin.reflect.l
                  0x006e: SGET  (r3v1 kotlin.reflect.l) =  com.ss.android.ugc.gamora.editor.n.a kotlin.reflect.l), (null com.bytedance.jedi.arch.v), (wrap: com.ss.android.ugc.gamora.editor.l$c
                  0x0073: CONSTRUCTOR  (r9v11 com.ss.android.ugc.gamora.editor.l$c) = (r8v0 'this' com.ss.android.ugc.gamora.editor.l A[THIS]) com.ss.android.ugc.gamora.editor.l.c.<init>(com.ss.android.ugc.gamora.editor.l):void CONSTRUCTOR), (2 int), (null java.lang.Object) com.ss.android.ugc.gamora.jedi.a.a.a(com.ss.android.ugc.gamora.jedi.a, com.bytedance.jedi.arch.JediViewModel, kotlin.reflect.l, com.bytedance.jedi.arch.v, kotlin.jvm.a.m, int, java.lang.Object):void type: STATIC in method: com.ss.android.ugc.gamora.editor.l.e(android.os.Bundle):void, dex: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:245)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:213)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:138)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:210)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:203)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:316)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:262)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:76)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:32)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:20)
                	at jadx.core.ProcessClass.process(ProcessClass.java:36)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
                Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative
                	at java.base/java.lang.System.arraycopy(Native Method)
                	at java.base/java.util.ArrayList.shiftTailOverGap(ArrayList.java:777)
                	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1720)
                	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1689)
                	at jadx.core.dex.instructions.args.SSAVar.removeUse(SSAVar.java:86)
                	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:90)
                	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:130)
                	at jadx.core.codegen.InsnGen.inlineMethod(InsnGen.java:892)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:669)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:357)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:239)
                	... 26 more
                */
            /*
                this = this;
                super.mo30985e(r9)
                android.app.Activity r9 = r8.f33526d_
                if (r9 == 0) goto L_0x009d
                android.support.v4.app.FragmentActivity r9 = (android.support.p022v4.app.FragmentActivity) r9
                com.ss.android.ugc.gamora.a.a r9 = com.p280ss.android.ugc.gamora.p1486a.C36113b.m116288a(r9)
                java.lang.Class<com.ss.android.ugc.gamora.editor.EditCornerViewModel> r0 = com.p280ss.android.ugc.gamora.editor.EditCornerViewModel.class
                com.bytedance.jedi.arch.JediViewModel r9 = r9.mo91871a(r0)
                java.lang.String r0 = "JediViewModelProviders.o…nerViewModel::class.java)"
                kotlin.jvm.internal.C7573i.m23582a(r9, r0)
                com.ss.android.ugc.gamora.editor.EditCornerViewModel r9 = (com.p280ss.android.ugc.gamora.editor.EditCornerViewModel) r9
                r8.f114556l = r9
                boolean r9 = com.p280ss.android.ugc.aweme.shortvideo.C39805en.m127445a()
                if (r9 == 0) goto L_0x0045
                r9 = 2131297367(0x7f090457, float:1.8212677E38)
                android.view.View r9 = r8.mo31002b(r9)
                android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
                r8.f114554i = r9
                r9 = 2131297366(0x7f090456, float:1.8212675E38)
                android.view.View r9 = r8.mo31002b(r9)
                android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
                r8.f114555j = r9
                com.ss.android.ugc.gamora.editor.EditCornerViewModel r9 = r8.f114556l
                if (r9 != 0) goto L_0x0041
                java.lang.String r0 = "cornerViewModel"
                kotlin.jvm.internal.C7573i.m23583a(r0)
            L_0x0041:
                r0 = 1
                r9.mo106198a(r0)
            L_0x0045:
                com.ss.android.ugc.gamora.editor.EditCornerViewModel r9 = r8.f114556l
                if (r9 != 0) goto L_0x004e
                java.lang.String r0 = "cornerViewModel"
                kotlin.jvm.internal.C7573i.m23583a(r0)
            L_0x004e:
                r2 = r9
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                kotlin.reflect.l r3 = com.p280ss.android.ugc.gamora.editor.C44342m.f114560a
                r4 = 0
                com.ss.android.ugc.gamora.editor.l$b r9 = new com.ss.android.ugc.gamora.editor.l$b
                r9.<init>(r8)
                r5 = r9
                kotlin.jvm.a.m r5 = (kotlin.jvm.p357a.C7563m) r5
                r6 = 2
                r7 = 0
                r1 = r8
                r1.mo91868b(r2, r3, new com.bytedance.jedi.arch.C11672v(), r5)
                com.ss.android.ugc.gamora.editor.EditCornerViewModel r9 = r8.f114556l
                if (r9 != 0) goto L_0x006b
                java.lang.String r0 = "cornerViewModel"
                kotlin.jvm.internal.C7573i.m23583a(r0)
            L_0x006b:
                r2 = r9
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                kotlin.reflect.l r3 = com.p280ss.android.ugc.gamora.editor.C44343n.f114561a
                r4 = 0
                com.ss.android.ugc.gamora.editor.l$c r9 = new com.ss.android.ugc.gamora.editor.l$c
                r9.<init>(r8)
                r5 = r9
                kotlin.jvm.a.m r5 = (kotlin.jvm.p357a.C7563m) r5
                r6 = 2
                r7 = 0
                r1 = r8
                r1.mo91868b(r2, r3, new com.bytedance.jedi.arch.C11672v(), r5)
                com.ss.android.ugc.gamora.editor.EditCornerViewModel r9 = r8.f114556l
                if (r9 != 0) goto L_0x0088
                java.lang.String r0 = "cornerViewModel"
                kotlin.jvm.internal.C7573i.m23583a(r0)
            L_0x0088:
                r2 = r9
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                kotlin.reflect.l r3 = com.p280ss.android.ugc.gamora.editor.C44344o.f114562a
                r4 = 0
                com.ss.android.ugc.gamora.editor.l$d r9 = new com.ss.android.ugc.gamora.editor.l$d
                r9.<init>(r8)
                r5 = r9
                kotlin.jvm.a.m r5 = (kotlin.jvm.p357a.C7563m) r5
                r6 = 2
                r7 = 0
                r1 = r8
                r1.mo91868b(r2, r3, new com.bytedance.jedi.arch.C11672v(), r5)
                return
            L_0x009d:
                kotlin.TypeCastException r9 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44337l.mo30985e(android.os.Bundle):void");
        }

        /* renamed from: a */
        public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
            C7573i.m23587b(vm1, "viewModel1");
            C7573i.m23587b(bVar, "block");
            return C44397a.m140500a(this, vm1, bVar);
        }

        /* renamed from: a */
        public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            C7573i.m23587b(layoutInflater, "inflater");
            C7573i.m23587b(viewGroup, "container");
            View inflate = layoutInflater.inflate(R.layout.is, viewGroup, false);
            C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…layout, container, false)");
            return inflate;
        }

        /* renamed from: a */
        public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$subscribe");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            return C44397a.m140496a(this, jediViewModel, vVar, mVar);
        }

        /* renamed from: b */
        public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
        }

        /* renamed from: c */
        public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
        }

        /* renamed from: d */
        public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
        }

        /* renamed from: a */
        public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
        }

        /* renamed from: a */
        public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(lVar2, "prop2");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(qVar, "subscriber");
            return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
        }

        /* renamed from: a */
        public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
            C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
            C7573i.m23587b(lVar, "prop");
            C7573i.m23587b(vVar, "config");
            return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
        }

        /* renamed from: a */
        public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(lVar2, "prop2");
            C7573i.m23587b(lVar3, "prop3");
            C7573i.m23587b(lVar4, "prop4");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(sVar, "subscriber");
            return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
        }
    }
