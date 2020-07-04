package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;

public class TouchEventCoalescingKeyHelper {
    private final SparseIntArray mDownTimeToCoalescingKey = new SparseIntArray();

    public void addCoalescingKey(long j) {
        this.mDownTimeToCoalescingKey.put((int) j, 0);
    }

    public void removeCoalescingKey(long j) {
        this.mDownTimeToCoalescingKey.delete((int) j);
    }

    public boolean hasCoalescingKey(long j) {
        if (this.mDownTimeToCoalescingKey.get((int) j, -1) == -1) {
            return false;
        }
        return true;
    }

    public short getCoalescingKey(long j) {
        int i = this.mDownTimeToCoalescingKey.get((int) j, -1);
        if (i != -1) {
            return (short) (i & 65535);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public void incrementCoalescingKey(long j) {
        int i = (int) j;
        int i2 = this.mDownTimeToCoalescingKey.get(i, -1);
        if (i2 != -1) {
            this.mDownTimeToCoalescingKey.put(i, i2 + 1);
            return;
        }
        throw new RuntimeException("Tried to increment non-existent cookie");
    }
}
