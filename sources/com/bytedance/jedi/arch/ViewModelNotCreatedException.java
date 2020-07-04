package com.bytedance.jedi.arch;

import kotlin.jvm.internal.C7573i;

public final class ViewModelNotCreatedException extends IllegalStateException {
    public ViewModelNotCreatedException(String str) {
        C7573i.m23587b(str, "msg");
        super(str);
    }
}
