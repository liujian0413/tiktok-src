package com.bytedance.ies.bullet.kit.web;

import kotlin.jvm.internal.C7571f;

public final class WebLoadError extends Error {
    private final CharSequence description;
    private final int errorCode;
    private final CharSequence failingUrl;

    public final CharSequence getDescription() {
        return this.description;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final CharSequence getFailingUrl() {
        return this.failingUrl;
    }

    public WebLoadError(int i, CharSequence charSequence, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder("WebLoadError, errorCode: ");
        sb.append(i);
        sb.append(", desc: ");
        sb.append(charSequence);
        sb.append(", failingUrl: ");
        sb.append(charSequence2);
        super(sb.toString());
        this.errorCode = i;
        this.description = charSequence;
        this.failingUrl = charSequence2;
    }

    public /* synthetic */ WebLoadError(int i, CharSequence charSequence, CharSequence charSequence2, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            charSequence = null;
        }
        if ((i2 & 4) != 0) {
            charSequence2 = null;
        }
        this(i, charSequence, charSequence2);
    }
}
