package com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.utils.C27633d;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.emoji.b.b.b */
public final class C27508b {

    /* renamed from: a */
    public static final C27508b f72549a = new C27508b();

    /* renamed from: com.ss.android.ugc.aweme.emoji.b.b.b$a */
    static final class C27509a<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Emoji f72550a;

        C27509a(Emoji emoji) {
            this.f72550a = emoji;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            C27633d.m90594a().mo71028a(this.f72550a);
            return null;
        }
    }

    private C27508b() {
    }

    /* renamed from: a */
    public static final void m90167a(Emoji emoji) {
        C7573i.m23587b(emoji, "emoji");
        C1592h.m7855a((Callable<TResult>) new C27509a<TResult>(emoji), (Executor) C1592h.f5957a);
    }
}
