package com.bytedance.jedi.arch;

import com.bytedance.jedi.arch.C11670t;

public interface NestedState<SUB extends C11670t> extends C11670t {
    SUB getSubstate();

    NestedState<SUB> newSubstate(SUB sub);
}
