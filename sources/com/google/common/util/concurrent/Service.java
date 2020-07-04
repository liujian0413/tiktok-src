package com.google.common.util.concurrent;

public interface Service {

    public enum State {
        NEW {
            /* access modifiers changed from: 0000 */
            public final boolean isTerminal() {
                return false;
            }
        },
        STARTING {
            /* access modifiers changed from: 0000 */
            public final boolean isTerminal() {
                return false;
            }
        },
        RUNNING {
            /* access modifiers changed from: 0000 */
            public final boolean isTerminal() {
                return false;
            }
        },
        STOPPING {
            /* access modifiers changed from: 0000 */
            public final boolean isTerminal() {
                return false;
            }
        },
        TERMINATED {
            /* access modifiers changed from: 0000 */
            public final boolean isTerminal() {
                return true;
            }
        },
        FAILED {
            /* access modifiers changed from: 0000 */
            public final boolean isTerminal() {
                return true;
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract boolean isTerminal();
    }
}
