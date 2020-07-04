package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class Factory implements C0067b {

    static final class SimpleViewHolderState implements C11670t {
        private final C7581n trigger;

        public SimpleViewHolderState() {
            this(null, 1, null);
        }

        private final void component1() {
        }

        public static /* synthetic */ SimpleViewHolderState copy$default(SimpleViewHolderState simpleViewHolderState, C7581n nVar, int i, Object obj) {
            if ((i & 1) != 0) {
                nVar = simpleViewHolderState.trigger;
            }
            return simpleViewHolderState.copy(nVar);
        }

        public final SimpleViewHolderState copy(C7581n nVar) {
            C7573i.m23587b(nVar, "trigger");
            return new SimpleViewHolderState(nVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.trigger, (java.lang.Object) ((com.bytedance.jedi.ext.adapter.Factory.SimpleViewHolderState) r2).trigger) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bytedance.jedi.ext.adapter.Factory.SimpleViewHolderState
                if (r0 == 0) goto L_0x0013
                com.bytedance.jedi.ext.adapter.Factory$SimpleViewHolderState r2 = (com.bytedance.jedi.ext.adapter.Factory.SimpleViewHolderState) r2
                kotlin.n r0 = r1.trigger
                kotlin.n r2 = r2.trigger
                boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.Factory.SimpleViewHolderState.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            C7581n nVar = this.trigger;
            if (nVar != null) {
                return nVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SimpleViewHolderState(trigger=");
            sb.append(this.trigger);
            sb.append(")");
            return sb.toString();
        }

        public SimpleViewHolderState(C7581n nVar) {
            C7573i.m23587b(nVar, "trigger");
            this.trigger = nVar;
        }

        public /* synthetic */ SimpleViewHolderState(C7581n nVar, int i, C7571f fVar) {
            if ((i & 1) != 0) {
                nVar = C7581n.f20898a;
            }
            this(nVar);
        }
    }

    static final class ViewModel extends JediViewModel<SimpleViewHolderState> {
        /* renamed from: f */
        private static SimpleViewHolderState m34170f() {
            return new SimpleViewHolderState(null, 1, null);
        }

        /* renamed from: c */
        public final /* synthetic */ C11670t mo29037c() {
            return m34170f();
        }
    }

    /* renamed from: a */
    public final <T extends C0063u> T mo149a(Class<T> cls) {
        C7573i.m23587b(cls, "modelClass");
        return (C0063u) new ViewModel();
    }
}
