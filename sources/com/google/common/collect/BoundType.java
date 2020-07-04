package com.google.common.collect;

public enum BoundType {
    OPEN(false),
    CLOSED(true);
    
    final boolean inclusive;

    /* access modifiers changed from: 0000 */
    public final BoundType flip() {
        return forBoolean(!this.inclusive);
    }

    static BoundType forBoolean(boolean z) {
        if (z) {
            return CLOSED;
        }
        return OPEN;
    }

    private BoundType(boolean z) {
        this.inclusive = z;
    }
}
