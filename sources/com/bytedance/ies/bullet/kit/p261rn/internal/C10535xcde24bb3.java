package com.bytedance.ies.bullet.kit.p261rn.internal;

import android.net.Uri;
import com.bytedance.ies.bullet.core.p539b.C10334a;
import java.io.File;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$rePrepareReactContext$$inlined$prepareNativeHost$2 */
public final class C10535xcde24bb3 extends Lambda implements C7562b<Throwable, C7581n> {
    final /* synthetic */ Object $inputSecond;
    final /* synthetic */ C10334a receiver$0$inlined;
    final /* synthetic */ C10543d this$0;
    final /* synthetic */ C10543d this$0$inline_fun;

    public C10535xcde24bb3(Object obj, C10334a aVar, C10543d dVar, C10543d dVar2) {
        this.$inputSecond = obj;
        this.this$0$inline_fun = dVar;
        this.this$0 = dVar2;
        this.receiver$0$inlined = aVar;
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C7581n.f20898a;
    }

    public final void invoke(Throwable th) {
        C7573i.m23587b(th, "it");
        Object obj = this.$inputSecond;
        C105361 r0 = new C7562b<File, C7581n>(this) {
            final /* synthetic */ C10535xcde24bb3 this$0;

            {
                this.this$0 = r1;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
                if (r0 == null) goto L_0x0024;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(java.io.File r15) {
                /*
                    r14 = this;
                    r9 = r15
                    java.io.File r9 = (java.io.File) r9
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$rePrepareReactContext$$inlined$prepareNativeHost$2 r15 = r14.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r15 = r15.this$0$inline_fun
                    com.bytedance.ies.bullet.kit.rn.b.c r0 = r15.f28278f
                    boolean r0 = r0.mo25283b()
                    r10 = 1
                    r11 = 0
                    if (r0 != 0) goto L_0x0017
                    com.bytedance.ies.bullet.kit.rn.f r0 = com.bytedance.ies.bullet.kit.p261rn.internal.C10543d.f28271o
                    if (r0 == 0) goto L_0x0017
                    r0 = 1
                    goto L_0x0018
                L_0x0017:
                    r0 = 0
                L_0x0018:
                    r12 = 0
                    if (r0 == 0) goto L_0x001d
                    r0 = r15
                    goto L_0x001e
                L_0x001d:
                    r0 = r12
                L_0x001e:
                    if (r0 == 0) goto L_0x0024
                    com.bytedance.ies.bullet.kit.rn.f r0 = com.bytedance.ies.bullet.kit.p261rn.internal.C10543d.f28271o
                    if (r0 != 0) goto L_0x0039
                L_0x0024:
                    com.bytedance.ies.bullet.kit.rn.f r13 = new com.bytedance.ies.bullet.kit.rn.f
                    com.bytedance.ies.bullet.kit.rn.o r1 = r15.f28276d
                    com.bytedance.ies.bullet.core.model.a.b r2 = r15.f28277e
                    com.bytedance.ies.bullet.core.kit.bridge.f r3 = r15.f28282j
                    com.bytedance.ies.bullet.kit.rn.g r7 = r15.f28286n
                    java.util.List<java.lang.Object> r4 = r15.f28283k
                    java.util.List<com.bytedance.ies.bullet.kit.rn.h> r5 = r15.f28284l
                    java.util.List<com.bytedance.ies.bullet.kit.rn.j> r6 = r15.f28285m
                    r8 = 0
                    r0 = r13
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                L_0x0039:
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$rePrepareReactContext$$inlined$prepareNativeHost$2 r15 = r14.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r15 = r15.this$0$inline_fun
                    java.lang.String r15 = r15.f28279g
                    r0.mo25290a(r15)
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$rePrepareReactContext$$inlined$prepareNativeHost$2 r15 = r14.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r15 = r15.this$0$inline_fun
                    com.bytedance.ies.bullet.kit.rn.b.c r15 = r15.f28278f
                    boolean r15 = r15.mo25283b()
                    r0.f28234b = r15
                    com.bytedance.ies.bullet.kit.rn.f r15 = com.bytedance.ies.bullet.kit.p261rn.internal.C10543d.f28271o
                    if (r15 != 0) goto L_0x007f
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$rePrepareReactContext$$inlined$prepareNativeHost$2 r15 = r14.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r15 = r15.this$0
                    com.bytedance.ies.bullet.kit.rn.b.c r15 = r15.f28278f
                    boolean r15 = r15.mo25283b()
                    if (r15 != 0) goto L_0x007f
                    com.bytedance.ies.bullet.kit.p261rn.internal.C10543d.f28271o = r0
                    com.facebook.react.ReactInstanceManager r15 = r0.getReactInstanceManager()
                    if (r15 == 0) goto L_0x007f
                    com.facebook.react.bridge.ReactContext r0 = r15.getCurrentReactContext()
                    if (r0 != 0) goto L_0x0073
                    boolean r0 = r15.hasStartedCreatingInitialContext()
                    if (r0 != 0) goto L_0x0073
                    goto L_0x0074
                L_0x0073:
                    r10 = 0
                L_0x0074:
                    if (r10 == 0) goto L_0x0077
                    goto L_0x0078
                L_0x0077:
                    r15 = r12
                L_0x0078:
                    if (r15 == 0) goto L_0x007e
                    r15.createReactContextInBackground()
                    goto L_0x007f
                L_0x007e:
                    return
                L_0x007f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p261rn.internal.C10535xcde24bb3.C105361.invoke(java.lang.Object):void");
            }
        };
        C7562b bVar = r0;
        Uri uri = (Uri) obj;
        this.receiver$0$inlined.mo25100b(uri, bVar, new C7562b<Throwable, C7581n>(this) {
            final /* synthetic */ C10535xcde24bb3 this$0;

            {
                this.this$0 = r1;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C7581n.f20898a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
                if (r0 == null) goto L_0x0026;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(java.lang.Throwable r15) {
                /*
                    r14 = this;
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.C7573i.m23587b(r15, r0)
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$rePrepareReactContext$$inlined$prepareNativeHost$2 r15 = r14.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r15 = r15.this$0$inline_fun
                    com.bytedance.ies.bullet.kit.rn.b.c r0 = r15.f28278f
                    boolean r0 = r0.mo25283b()
                    r1 = 1
                    r2 = 0
                    if (r0 != 0) goto L_0x0019
                    com.bytedance.ies.bullet.kit.rn.f r0 = com.bytedance.ies.bullet.kit.p261rn.internal.C10543d.f28271o
                    if (r0 == 0) goto L_0x0019
                    r0 = 1
                    goto L_0x001a
                L_0x0019:
                    r0 = 0
                L_0x001a:
                    r3 = 0
                    if (r0 == 0) goto L_0x001f
                    r0 = r15
                    goto L_0x0020
                L_0x001f:
                    r0 = r3
                L_0x0020:
                    if (r0 == 0) goto L_0x0026
                    com.bytedance.ies.bullet.kit.rn.f r0 = com.bytedance.ies.bullet.kit.p261rn.internal.C10543d.f28271o
                    if (r0 != 0) goto L_0x003c
                L_0x0026:
                    com.bytedance.ies.bullet.kit.rn.f r0 = new com.bytedance.ies.bullet.kit.rn.f
                    com.bytedance.ies.bullet.kit.rn.o r5 = r15.f28276d
                    com.bytedance.ies.bullet.core.model.a.b r6 = r15.f28277e
                    com.bytedance.ies.bullet.core.kit.bridge.f r7 = r15.f28282j
                    com.bytedance.ies.bullet.kit.rn.g r11 = r15.f28286n
                    java.util.List<java.lang.Object> r8 = r15.f28283k
                    java.util.List<com.bytedance.ies.bullet.kit.rn.h> r9 = r15.f28284l
                    java.util.List<com.bytedance.ies.bullet.kit.rn.j> r10 = r15.f28285m
                    r12 = 0
                    r13 = 0
                    r4 = r0
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                L_0x003c:
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$rePrepareReactContext$$inlined$prepareNativeHost$2 r15 = r14.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r15 = r15.this$0$inline_fun
                    java.lang.String r15 = r15.f28279g
                    r0.mo25290a(r15)
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$rePrepareReactContext$$inlined$prepareNativeHost$2 r15 = r14.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r15 = r15.this$0$inline_fun
                    com.bytedance.ies.bullet.kit.rn.b.c r15 = r15.f28278f
                    boolean r15 = r15.mo25283b()
                    r0.f28234b = r15
                    com.bytedance.ies.bullet.kit.rn.f r15 = com.bytedance.ies.bullet.kit.p261rn.internal.C10543d.f28271o
                    if (r15 != 0) goto L_0x0082
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$rePrepareReactContext$$inlined$prepareNativeHost$2 r15 = r14.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r15 = r15.this$0
                    com.bytedance.ies.bullet.kit.rn.b.c r15 = r15.f28278f
                    boolean r15 = r15.mo25283b()
                    if (r15 != 0) goto L_0x0082
                    com.bytedance.ies.bullet.kit.p261rn.internal.C10543d.f28271o = r0
                    com.facebook.react.ReactInstanceManager r15 = r0.getReactInstanceManager()
                    if (r15 == 0) goto L_0x0082
                    com.facebook.react.bridge.ReactContext r0 = r15.getCurrentReactContext()
                    if (r0 != 0) goto L_0x0076
                    boolean r0 = r15.hasStartedCreatingInitialContext()
                    if (r0 != 0) goto L_0x0076
                    goto L_0x0077
                L_0x0076:
                    r1 = 0
                L_0x0077:
                    if (r1 == 0) goto L_0x007a
                    goto L_0x007b
                L_0x007a:
                    r15 = r3
                L_0x007b:
                    if (r15 == 0) goto L_0x0081
                    r15.createReactContextInBackground()
                    goto L_0x0082
                L_0x0081:
                    return
                L_0x0082:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p261rn.internal.C10535xcde24bb3.C105372.invoke(java.lang.Throwable):void");
            }
        });
    }
}
