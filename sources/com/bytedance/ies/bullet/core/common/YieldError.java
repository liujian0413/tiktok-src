package com.bytedance.ies.bullet.core.common;

import kotlin.jvm.internal.C7573i;

public final class YieldError extends Error {
    public YieldError(String str) {
        C7573i.m23587b(str, "message");
        super(str);
    }
}
