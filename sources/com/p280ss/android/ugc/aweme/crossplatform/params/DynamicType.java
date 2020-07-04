package com.p280ss.android.ugc.aweme.crossplatform.params;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.params.DynamicType */
public enum DynamicType {
    NONE(0),
    DYNAMIC(1),
    FROCE_DYNAMIC(2);
    
    public static final C25882a Companion = null;
    private final int value;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.params.DynamicType$a */
    public static final class C25882a {
        private C25882a() {
        }

        public /* synthetic */ C25882a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static DynamicType m85149a(int i) {
            switch (i) {
                case 1:
                    return DynamicType.DYNAMIC;
                case 2:
                    return DynamicType.FROCE_DYNAMIC;
                default:
                    return DynamicType.NONE;
            }
        }
    }

    public static final DynamicType parse(int i) {
        return C25882a.m85149a(i);
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Companion = new C25882a(null);
    }

    private DynamicType(int i) {
        this.value = i;
    }
}
