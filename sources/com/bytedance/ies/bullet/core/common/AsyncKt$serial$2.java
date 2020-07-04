package com.bytedance.ies.bullet.core.common;

import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

public final class AsyncKt$serial$2 extends Lambda implements C7562b<Throwable, C7581n> {
    final /* synthetic */ C7563m $complete;
    final /* synthetic */ C7562b $error;
    final /* synthetic */ Object $inputSecond;
    final /* synthetic */ C48006q $second;

    public AsyncKt$serial$2(C7562b bVar, C48006q qVar, Object obj, C7563m mVar) {
        this.$error = bVar;
        this.$second = qVar;
        this.$inputSecond = obj;
        this.$complete = mVar;
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C7581n.f20898a;
    }

    public final void invoke(Throwable th) {
        C7573i.m23587b(th, "it");
        this.$error.invoke(th);
        this.$second.invoke(this.$inputSecond, new C7562b<OutputSecond, C7581n>(this) {
            final /* synthetic */ AsyncKt$serial$2 this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke(OutputSecond outputsecond) {
                this.this$0.$complete.invoke(null, outputsecond);
            }
        }, new C7562b<Throwable, C7581n>(this) {
            final /* synthetic */ AsyncKt$serial$2 this$0;

            {
                this.this$0 = r1;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C7581n.f20898a;
            }

            public final void invoke(Throwable th) {
                C7573i.m23587b(th, "it");
                this.this$0.$error.invoke(th);
                this.this$0.$complete.invoke(null, null);
            }
        });
    }
}
