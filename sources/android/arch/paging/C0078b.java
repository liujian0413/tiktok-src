package android.arch.paging;

import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.b */
abstract class C0078b<Key, Value> extends C0083d<Key, Value> {
    C0078b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Key mo164a(int i, Value value);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo165a(int i, Value value, int i2, Executor executor, C0099a<Value> aVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo166a(Key key, int i, int i2, boolean z, Executor executor, C0099a<Value> aVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo167a() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo168b(int i, Value value, int i2, Executor executor, C0099a<Value> aVar);
}
