package com.bytedance.jedi.ext.adapter.extension;

import com.bytedance.jedi.ext.adapter.DiffableMultiTypeAdapter;
import com.bytedance.jedi.ext.adapter.multitype.C11743d;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import kotlin.Triple;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

public final class DiffableAdapterBuilder$build$1 extends DiffableMultiTypeAdapter<T> {

    /* renamed from: a */
    final /* synthetic */ C11705c f31441a;

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1$a */
    static final class C11701a extends Lambda implements C7562b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C7563m f31442a;

        /* renamed from: b */
        final /* synthetic */ DiffableAdapterBuilder$build$1 f31443b;

        /* renamed from: c */
        final /* synthetic */ C11743d f31444c;

        C11701a(C7563m mVar, DiffableAdapterBuilder$build$1 diffableAdapterBuilder$build$1, C11743d dVar) {
            this.f31442a = mVar;
            this.f31443b = diffableAdapterBuilder$build$1;
            this.f31444c = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m34306a(((Number) obj).intValue()));
        }

        /* renamed from: a */
        private boolean m34306a(int i) {
            return ((Boolean) this.f31442a.invoke(Integer.valueOf(i), 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0019: RETURN  (wrap: boolean
                  0x0015: INVOKE  (r7v4 boolean) = (wrap: java.lang.Boolean
                  0x0013: CHECK_CAST  (r7v3 java.lang.Boolean) = (java.lang.Boolean) (wrap: java.lang.Object
                  0x000f: INVOKE  (r7v2 java.lang.Object) = (wrap: kotlin.jvm.a.m
                  0x0000: IGET  (r0v0 kotlin.jvm.a.m) = (r6v0 'this' com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1$a A[THIS]) com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.a kotlin.jvm.a.m), (wrap: java.lang.Integer
                  0x0002: INVOKE  (r1v0 java.lang.Integer) = (r7v0 'i' int) java.lang.Integer.valueOf(int):java.lang.Integer type: STATIC), (wrap: java.lang.Object
                  0x000b: INVOKE  (r7v1 java.lang.Object) = (wrap: com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1
                  0x0006: IGET  (r2v0 com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1) = (r6v0 'this' com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1$a A[THIS]) com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.b com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1), (r7v0 'i' int), false, (2 int), (null java.lang.Object) com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter.a(com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter, int, boolean, int, java.lang.Object):java.lang.Object type: STATIC) kotlin.jvm.a.m.invoke(java.lang.Object, java.lang.Object):java.lang.Object type: INTERFACE)) java.lang.Boolean.booleanValue():boolean type: VIRTUAL) in method: com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.a(int):boolean, dex: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:245)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:213)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:210)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:203)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:316)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:262)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
                	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:237)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:224)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:76)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:32)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:20)
                	at jadx.core.ProcessClass.process(ProcessClass.java:36)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: INVOKE  (r7v4 boolean) = (wrap: java.lang.Boolean
                  0x0013: CHECK_CAST  (r7v3 java.lang.Boolean) = (java.lang.Boolean) (wrap: java.lang.Object
                  0x000f: INVOKE  (r7v2 java.lang.Object) = (wrap: kotlin.jvm.a.m
                  0x0000: IGET  (r0v0 kotlin.jvm.a.m) = (r6v0 'this' com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1$a A[THIS]) com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.a kotlin.jvm.a.m), (wrap: java.lang.Integer
                  0x0002: INVOKE  (r1v0 java.lang.Integer) = (r7v0 'i' int) java.lang.Integer.valueOf(int):java.lang.Integer type: STATIC), (wrap: java.lang.Object
                  0x000b: INVOKE  (r7v1 java.lang.Object) = (wrap: com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1
                  0x0006: IGET  (r2v0 com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1) = (r6v0 'this' com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1$a A[THIS]) com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.b com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1), (r7v0 'i' int), false, (2 int), (null java.lang.Object) com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter.a(com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter, int, boolean, int, java.lang.Object):java.lang.Object type: STATIC) kotlin.jvm.a.m.invoke(java.lang.Object, java.lang.Object):java.lang.Object type: INTERFACE)) java.lang.Boolean.booleanValue():boolean type: VIRTUAL in method: com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.a(int):boolean, dex: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:245)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:105)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:303)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:239)
                	... 22 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: CHECK_CAST  (r7v3 java.lang.Boolean) = (java.lang.Boolean) (wrap: java.lang.Object
                  0x000f: INVOKE  (r7v2 java.lang.Object) = (wrap: kotlin.jvm.a.m
                  0x0000: IGET  (r0v0 kotlin.jvm.a.m) = (r6v0 'this' com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1$a A[THIS]) com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.a kotlin.jvm.a.m), (wrap: java.lang.Integer
                  0x0002: INVOKE  (r1v0 java.lang.Integer) = (r7v0 'i' int) java.lang.Integer.valueOf(int):java.lang.Integer type: STATIC), (wrap: java.lang.Object
                  0x000b: INVOKE  (r7v1 java.lang.Object) = (wrap: com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1
                  0x0006: IGET  (r2v0 com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1) = (r6v0 'this' com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1$a A[THIS]) com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.b com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1), (r7v0 'i' int), false, (2 int), (null java.lang.Object) com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter.a(com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter, int, boolean, int, java.lang.Object):java.lang.Object type: STATIC) kotlin.jvm.a.m.invoke(java.lang.Object, java.lang.Object):java.lang.Object type: INTERFACE) in method: com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.a(int):boolean, dex: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:245)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:105)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:88)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:682)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:357)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:223)
                	... 25 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: INVOKE  (r7v2 java.lang.Object) = (wrap: kotlin.jvm.a.m
                  0x0000: IGET  (r0v0 kotlin.jvm.a.m) = (r6v0 'this' com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1$a A[THIS]) com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.a kotlin.jvm.a.m), (wrap: java.lang.Integer
                  0x0002: INVOKE  (r1v0 java.lang.Integer) = (r7v0 'i' int) java.lang.Integer.valueOf(int):java.lang.Integer type: STATIC), (wrap: java.lang.Object
                  0x000b: INVOKE  (r7v1 java.lang.Object) = (wrap: com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1
                  0x0006: IGET  (r2v0 com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1) = (r6v0 'this' com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1$a A[THIS]) com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.b com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1), (r7v0 'i' int), false, (2 int), (null java.lang.Object) com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter.a(com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter, int, boolean, int, java.lang.Object):java.lang.Object type: STATIC) kotlin.jvm.a.m.invoke(java.lang.Object, java.lang.Object):java.lang.Object type: INTERFACE in method: com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.a(int):boolean, dex: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:245)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:105)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:280)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:223)
                	... 30 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: INVOKE  (r7v1 java.lang.Object) = (wrap: com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1
                  0x0006: IGET  (r2v0 com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1) = (r6v0 'this' com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1$a A[THIS]) com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.b com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1), (r7v0 'i' int), false, (2 int), (null java.lang.Object) com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter.a(com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter, int, boolean, int, java.lang.Object):java.lang.Object type: STATIC in method: com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.a.a(int):boolean, dex: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:245)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:105)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:773)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:713)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:357)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:223)
                	... 33 more
                Caused by: java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 2
                	at java.base/java.util.ArrayList.shiftTailOverGap(ArrayList.java:779)
                	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1720)
                	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1689)
                	at jadx.core.dex.instructions.args.SSAVar.removeUse(SSAVar.java:86)
                	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:90)
                	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:130)
                	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:134)
                	at jadx.core.codegen.InsnGen.inlineMethod(InsnGen.java:892)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:669)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:357)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:223)
                	... 38 more
                */
            /*
                this = this;
                kotlin.jvm.a.m r0 = r6.f31442a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
                com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1 r2 = r6.f31443b
                r3 = 0
                r4 = 2
                r5 = 0
                java.lang.Object r7 = 
                // error: 0x000b: INVOKE  (r7 I:java.lang.Object) = (r2 I:com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter), (r7 I:int), (r3 I:boolean), (r4 I:int), (r5 I:java.lang.Object) com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter.a(com.bytedance.jedi.ext.adapter.multitype.MultiTypeRawAdapter, int, boolean, int, java.lang.Object):java.lang.Object type: STATIC
                java.lang.Object r7 = r0.invoke(r1, r7)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.extension.DiffableAdapterBuilder$build$1.C11701a.m34306a(int):boolean");
        }
    }

    /* renamed from: a */
    public final void mo29263a(C11743d<MultiTypeViewHolder<T>> dVar) {
        C7573i.m23587b(dVar, "registry");
        for (Triple triple : this.f31441a.f31457a) {
            C7562b bVar = (C7562b) triple.component1();
            C7563m mVar = (C7563m) triple.component2();
            dVar.mo29315a((C7562b<? super Integer, Boolean>) new C11701a<Object,Boolean>(mVar, this, dVar), (C7563m) triple.component3(), bVar);
        }
    }
}
