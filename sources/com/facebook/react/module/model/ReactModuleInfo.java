package com.facebook.react.module.model;

public class ReactModuleInfo {
    private final boolean mCanOverrideExistingModule;
    private final boolean mHasConstants;
    private final String mName;
    private final boolean mNeedsEagerInit;

    public boolean canOverrideExistingModule() {
        return this.mCanOverrideExistingModule;
    }

    public boolean hasConstants() {
        return this.mHasConstants;
    }

    public String name() {
        return this.mName;
    }

    public boolean needsEagerInit() {
        return this.mNeedsEagerInit;
    }

    public ReactModuleInfo(String str, boolean z, boolean z2, boolean z3) {
        this.mName = str;
        this.mCanOverrideExistingModule = z;
        this.mNeedsEagerInit = z2;
        this.mHasConstants = z3;
    }
}
