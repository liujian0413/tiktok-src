package org.apache.commons.logging.impl;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public final class WeakHashtable extends Hashtable {
    private int changeCount = 0;
    private ReferenceQueue queue = new ReferenceQueue();

    static final class Entry implements java.util.Map.Entry {
        private final Object key;
        private final Object value;

        public final Object getKey() {
            return this.key;
        }

        public final Object getValue() {
            return this.value;
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (getKey() == null) {
                i = 0;
            } else {
                i = getKey().hashCode();
            }
            if (getValue() != null) {
                i2 = getValue().hashCode();
            }
            return i ^ i2;
        }

        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("Entry.setValue is not supported.");
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (getKey() == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!getKey().equals(entry.getKey())) {
                return false;
            }
            if (getValue() == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!getValue().equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        private Entry(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }
    }

    static final class Referenced {
        private final int hashCode;
        private final WeakReference reference;

        public final int hashCode() {
            return this.hashCode;
        }

        public final Object getValue() {
            return this.reference.get();
        }

        private Referenced(Object obj) {
            this.reference = new WeakReference(obj);
            this.hashCode = obj.hashCode();
        }

        public final boolean equals(Object obj) {
            boolean z;
            if (!(obj instanceof Referenced)) {
                return false;
            }
            Referenced referenced = (Referenced) obj;
            Object value = getValue();
            Object value2 = referenced.getValue();
            if (value != null) {
                return value.equals(value2);
            }
            if (value2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return z;
            }
            if (hashCode() == referenced.hashCode()) {
                return true;
            }
            return false;
        }

        private Referenced(Object obj, ReferenceQueue referenceQueue) {
            this.reference = new WeakKey(obj, referenceQueue, this);
            this.hashCode = obj.hashCode();
        }
    }

    static final class WeakKey extends WeakReference {
        private final Referenced referenced;

        public final Referenced getReferenced() {
            return this.referenced;
        }

        private WeakKey(Object obj, ReferenceQueue referenceQueue, Referenced referenced2) {
            super(obj, referenceQueue);
            this.referenced = referenced2;
        }
    }

    public final Enumeration elements() {
        purge();
        return super.elements();
    }

    public final boolean isEmpty() {
        purge();
        return super.isEmpty();
    }

    /* access modifiers changed from: protected */
    public final void rehash() {
        purge();
        super.rehash();
    }

    public final int size() {
        purge();
        return super.size();
    }

    public final String toString() {
        purge();
        return super.toString();
    }

    public final Collection values() {
        purge();
        return super.values();
    }

    public final Enumeration keys() {
        purge();
        final Enumeration keys = super.keys();
        return new Enumeration() {
            public boolean hasMoreElements() {
                return keys.hasMoreElements();
            }

            public Object nextElement() {
                return ((Referenced) keys.nextElement()).getValue();
            }
        };
    }

    private void purge() {
        synchronized (this.queue) {
            while (true) {
                WeakKey weakKey = (WeakKey) this.queue.poll();
                if (weakKey != null) {
                    super.remove(weakKey.getReferenced());
                }
            }
        }
    }

    private void purgeOne() {
        synchronized (this.queue) {
            WeakKey weakKey = (WeakKey) this.queue.poll();
            if (weakKey != null) {
                super.remove(weakKey.getReferenced());
            }
        }
    }

    public final Set entrySet() {
        purge();
        Set<java.util.Map.Entry> entrySet = super.entrySet();
        HashSet hashSet = new HashSet();
        for (java.util.Map.Entry entry : entrySet) {
            Object value = ((Referenced) entry.getKey()).getValue();
            Object value2 = entry.getValue();
            if (value != null) {
                hashSet.add(new Entry(value, value2));
            }
        }
        return hashSet;
    }

    public final Set keySet() {
        purge();
        Set<Referenced> keySet = super.keySet();
        HashSet hashSet = new HashSet();
        for (Referenced value : keySet) {
            Object value2 = value.getValue();
            if (value2 != null) {
                hashSet.add(value2);
            }
        }
        return hashSet;
    }

    public final boolean containsKey(Object obj) {
        return super.containsKey(new Referenced(obj));
    }

    public final Object get(Object obj) {
        return super.get(new Referenced(obj));
    }

    public final void putAll(Map map) {
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final Object remove(Object obj) {
        int i = this.changeCount;
        this.changeCount = i + 1;
        if (i > 100) {
            purge();
            this.changeCount = 0;
        } else if (this.changeCount % 10 == 0) {
            purgeOne();
        }
        return super.remove(new Referenced(obj));
    }

    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("Null keys are not allowed");
        } else if (obj2 != null) {
            int i = this.changeCount;
            this.changeCount = i + 1;
            if (i > 100) {
                purge();
                this.changeCount = 0;
            } else if (this.changeCount % 10 == 0) {
                purgeOne();
            }
            return super.put(new Referenced(obj, this.queue), obj2);
        } else {
            throw new NullPointerException("Null values are not allowed");
        }
    }
}
