package com.google.common.collect;

/* renamed from: com.google.common.collect.ak */
final class C17726ak extends ImmutableListMultimap<Object, Object> {

    /* renamed from: a */
    static final C17726ak f48962a = new C17726ak();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f48962a;
    }

    private C17726ak() {
        super(ImmutableMap.m58576of(), 0);
    }
}
