package com.p280ss.android.ugc.aweme.antiaddic.lock.entity;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting */
public final class TeenageModeSetting implements Serializable {
    private boolean isMinor;
    private boolean isTeenageModeSelf;
    private int minorControlType;
    private int timeLockSelfInMin;

    public final int getMinorControlType() {
        return this.minorControlType;
    }

    public final int getTimeLockSelfInMin() {
        return this.timeLockSelfInMin;
    }

    public final boolean isMinor() {
        return this.isMinor;
    }

    public final boolean isTeenageModeSelf() {
        return this.isTeenageModeSelf;
    }

    public final void setMinor(boolean z) {
        this.isMinor = z;
    }

    public final void setMinorControlType(int i) {
        this.minorControlType = i;
    }

    public final void setTeenageModeSelf(boolean z) {
        this.isTeenageModeSelf = z;
    }

    public final void setTimeLockSelfInMin(int i) {
        this.timeLockSelfInMin = i;
    }

    public TeenageModeSetting(boolean z, int i, boolean z2, int i2) {
        this.isMinor = z;
        this.minorControlType = i;
        this.isTeenageModeSelf = z2;
        this.timeLockSelfInMin = i2;
    }
}
