package com.google.common.collect;

/* renamed from: com.google.common.collect.al */
final class C17727al extends ImmutableSetMultimap<Object, Object> {

    /* renamed from: a */
    static final C17727al f48963a = new C17727al();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f48963a;
    }

    private C17727al() {
        super(ImmutableMap.m58576of(), 0, null);
    }
}
