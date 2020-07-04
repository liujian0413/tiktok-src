package shark.internal;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class LruCache$2 extends LinkedHashMap<K, V> {
    final /* synthetic */ C48788i this$0;

    public final Set<Entry<K, V>> entrySet() {
        return getEntries();
    }

    public final Set getEntries() {
        return super.entrySet();
    }

    public final Set getKeys() {
        return super.keySet();
    }

    public final int getSize() {
        return super.size();
    }

    public final Collection getValues() {
        return super.values();
    }

    public final Set<K> keySet() {
        return getKeys();
    }

    public final int size() {
        return getSize();
    }

    public final Collection<V> values() {
        return getValues();
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Entry<K, V> entry) {
        if (size() < this.this$0.f124022e) {
            return false;
        }
        this.this$0.f124019b++;
        return true;
    }

    LruCache$2(C48788i iVar, int i, float f, boolean z) {
        this.this$0 = iVar;
        super(i, f, z);
    }
}
