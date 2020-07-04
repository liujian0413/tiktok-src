package com.bytedance.ies.bullet.kit.p261rn.internal;

import android.net.Uri;
import com.bytedance.ies.bullet.core.p539b.C10334a;
import com.facebook.react.bridge.RNDegradeExceptionHandler;
import java.io.File;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 */
public final class C10527xb7b31a0 extends Lambda implements C7562b<Throwable, C7581n> {
    final /* synthetic */ Object $inputSecond;
    final /* synthetic */ C10546c $patchData$inlined;
    final /* synthetic */ long $timeout$inlined;
    final /* synthetic */ C10334a receiver$0$inlined;
    final /* synthetic */ C10543d this$0;
    final /* synthetic */ C10543d this$0$inline_fun;

    public C10527xb7b31a0(Object obj, C10334a aVar, C10543d dVar, C10543d dVar2, C10546c cVar, long j) {
        this.$inputSecond = obj;
        this.this$0$inline_fun = dVar;
        this.this$0 = dVar2;
        this.$patchData$inlined = cVar;
        this.$timeout$inlined = j;
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
        C105281 r0 = new C7562b<File, C7581n>(this) {
            final /* synthetic */ C10527xb7b31a0 this$0;

            /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2$1$a */
            static final class C10529a implements RNDegradeExceptionHandler {

                /* renamed from: a */
                final /* synthetic */ C105281 f28259a;

                C10529a(C105281 r1) {
                    this.f28259a = r1;
                }

                public final void onDegrade(Exception exc) {
                    C10543d dVar = this.f28259a.this$0.this$0;
                    C7573i.m23582a((Object) exc, "it");
                    dVar.mo25333a(exc);
                }
            }

            {
                this.this$0 = r1;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
                if (r0 == null) goto L_0x0021;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(java.io.File r12) {
                /*
                    r11 = this;
                    r9 = r12
                    java.io.File r9 = (java.io.File) r9
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 r12 = r11.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r12 = r12.this$0$inline_fun
                    com.bytedance.ies.bullet.kit.rn.b.c r0 = r12.f28278f
                    boolean r0 = r0.mo25283b()
                    if (r0 != 0) goto L_0x0015
                    com.bytedance.ies.bullet.kit.rn.f r0 = com.bytedance.ies.bullet.kit.p261rn.internal.C10543d.f28271o
                    if (r0 == 0) goto L_0x0015
                    r0 = 1
                    goto L_0x0016
                L_0x0015:
                    r0 = 0
                L_0x0016:
                    if (r0 == 0) goto L_0x001a
                    r0 = r12
                    goto L_0x001b
                L_0x001a:
                    r0 = 0
                L_0x001b:
                    if (r0 == 0) goto L_0x0021
                    com.bytedance.ies.bullet.kit.rn.f r0 = com.bytedance.ies.bullet.kit.p261rn.internal.C10543d.f28271o
                    if (r0 != 0) goto L_0x0036
                L_0x0021:
                    com.bytedance.ies.bullet.kit.rn.f r10 = new com.bytedance.ies.bullet.kit.rn.f
                    com.bytedance.ies.bullet.kit.rn.o r1 = r12.f28276d
                    com.bytedance.ies.bullet.core.model.a.b r2 = r12.f28277e
                    com.bytedance.ies.bullet.core.kit.bridge.f r3 = r12.f28282j
                    com.bytedance.ies.bullet.kit.rn.g r7 = r12.f28286n
                    java.util.List<java.lang.Object> r4 = r12.f28283k
                    java.util.List<com.bytedance.ies.bullet.kit.rn.h> r5 = r12.f28284l
                    java.util.List<com.bytedance.ies.bullet.kit.rn.j> r6 = r12.f28285m
                    r8 = 0
                    r0 = r10
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                L_0x0036:
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 r12 = r11.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r12 = r12.this$0$inline_fun
                    java.lang.String r12 = r12.f28279g
                    r0.mo25290a(r12)
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 r12 = r11.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r12 = r12.this$0$inline_fun
                    com.bytedance.ies.bullet.kit.rn.b.c r12 = r12.f28278f
                    boolean r12 = r12.mo25283b()
                    r0.f28234b = r12
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2$1$a r12 = new com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2$1$a
                    r12.<init>(r11)
                    com.facebook.react.bridge.RNDegradeExceptionHandler r12 = (com.facebook.react.bridge.RNDegradeExceptionHandler) r12
                    r0.mo25289a(r12)
                    java.util.HashMap r12 = new java.util.HashMap
                    r12.<init>()
                    java.util.Map r12 = (java.util.Map) r12
                    r0.mo25291a(r12)
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 r12 = r11.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r12 = r12.this$0
                    com.facebook.react.ReactInstanceManager r0 = r0.getReactInstanceManager()
                    java.lang.String r1 = "it.reactInstanceManager"
                    kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 r1 = r11.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d$c r1 = r1.$patchData$inlined
                    java.lang.String r1 = r1.f28291a
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 r2 = r11.this$0
                    long r2 = r2.$timeout$inlined
                    r12.mo25332a(r0, r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p261rn.internal.C10527xb7b31a0.C105281.invoke(java.lang.Object):void");
            }
        };
        C7562b bVar = r0;
        Uri uri = (Uri) obj;
        this.receiver$0$inlined.mo25100b(uri, bVar, new C7562b<Throwable, C7581n>(this) {
            final /* synthetic */ C10527xb7b31a0 this$0;

            /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2$2$a */
            static final class C10531a implements RNDegradeExceptionHandler {

                /* renamed from: a */
                final /* synthetic */ C105302 f28260a;

                C10531a(C105302 r1) {
                    this.f28260a = r1;
                }

                public final void onDegrade(Exception exc) {
                    C10543d dVar = this.f28260a.this$0.this$0;
                    C7573i.m23582a((Object) exc, "it");
                    dVar.mo25333a(exc);
                }
            }

            {
                this.this$0 = r1;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C7581n.f20898a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
                if (r0 == null) goto L_0x0023;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(java.lang.Throwable r12) {
                /*
                    r11 = this;
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.C7573i.m23587b(r12, r0)
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 r12 = r11.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r12 = r12.this$0$inline_fun
                    com.bytedance.ies.bullet.kit.rn.b.c r0 = r12.f28278f
                    boolean r0 = r0.mo25283b()
                    if (r0 != 0) goto L_0x0017
                    com.bytedance.ies.bullet.kit.rn.f r0 = com.bytedance.ies.bullet.kit.p261rn.internal.C10543d.f28271o
                    if (r0 == 0) goto L_0x0017
                    r0 = 1
                    goto L_0x0018
                L_0x0017:
                    r0 = 0
                L_0x0018:
                    if (r0 == 0) goto L_0x001c
                    r0 = r12
                    goto L_0x001d
                L_0x001c:
                    r0 = 0
                L_0x001d:
                    if (r0 == 0) goto L_0x0023
                    com.bytedance.ies.bullet.kit.rn.f r0 = com.bytedance.ies.bullet.kit.p261rn.internal.C10543d.f28271o
                    if (r0 != 0) goto L_0x0039
                L_0x0023:
                    com.bytedance.ies.bullet.kit.rn.f r0 = new com.bytedance.ies.bullet.kit.rn.f
                    com.bytedance.ies.bullet.kit.rn.o r2 = r12.f28276d
                    com.bytedance.ies.bullet.core.model.a.b r3 = r12.f28277e
                    com.bytedance.ies.bullet.core.kit.bridge.f r4 = r12.f28282j
                    com.bytedance.ies.bullet.kit.rn.g r8 = r12.f28286n
                    java.util.List<java.lang.Object> r5 = r12.f28283k
                    java.util.List<com.bytedance.ies.bullet.kit.rn.h> r6 = r12.f28284l
                    java.util.List<com.bytedance.ies.bullet.kit.rn.j> r7 = r12.f28285m
                    r9 = 0
                    r10 = 0
                    r1 = r0
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                L_0x0039:
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 r12 = r11.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r12 = r12.this$0$inline_fun
                    java.lang.String r12 = r12.f28279g
                    r0.mo25290a(r12)
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 r12 = r11.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r12 = r12.this$0$inline_fun
                    com.bytedance.ies.bullet.kit.rn.b.c r12 = r12.f28278f
                    boolean r12 = r12.mo25283b()
                    r0.f28234b = r12
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2$2$a r12 = new com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2$2$a
                    r12.<init>(r11)
                    com.facebook.react.bridge.RNDegradeExceptionHandler r12 = (com.facebook.react.bridge.RNDegradeExceptionHandler) r12
                    r0.mo25289a(r12)
                    java.util.HashMap r12 = new java.util.HashMap
                    r12.<init>()
                    java.util.Map r12 = (java.util.Map) r12
                    r0.mo25291a(r12)
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 r12 = r11.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d r12 = r12.this$0
                    com.facebook.react.ReactInstanceManager r0 = r0.getReactInstanceManager()
                    java.lang.String r1 = "it.reactInstanceManager"
                    kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 r1 = r11.this$0
                    com.bytedance.ies.bullet.kit.rn.internal.d$c r1 = r1.$patchData$inlined
                    java.lang.String r1 = r1.f28291a
                    com.bytedance.ies.bullet.kit.rn.internal.RnContextBuilder$prepareReactContextImpl$$inlined$prepareNativeHost$2 r2 = r11.this$0
                    long r2 = r2.$timeout$inlined
                    r12.mo25332a(r0, r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p261rn.internal.C10527xb7b31a0.C105302.invoke(java.lang.Throwable):void");
            }
        });
    }
}
