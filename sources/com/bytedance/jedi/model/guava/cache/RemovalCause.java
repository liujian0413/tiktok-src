package com.bytedance.jedi.model.guava.cache;

public enum RemovalCause {
    EXPLICIT {
        /* access modifiers changed from: 0000 */
        public final boolean wasEvicted() {
            return false;
        }
    },
    REPLACED {
        /* access modifiers changed from: 0000 */
        public final boolean wasEvicted() {
            return false;
        }
    },
    COLLECTED {
        /* access modifiers changed from: 0000 */
        public final boolean wasEvicted() {
            return true;
        }
    },
    EXPIRED {
        /* access modifiers changed from: 0000 */
        public final boolean wasEvicted() {
            return true;
        }
    },
    SIZE {
        /* access modifiers changed from: 0000 */
        public final boolean wasEvicted() {
            return true;
        }
    };

    /* access modifiers changed from: 0000 */
    public abstract boolean wasEvicted();
}
