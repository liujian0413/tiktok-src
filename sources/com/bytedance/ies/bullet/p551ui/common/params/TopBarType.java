package com.bytedance.ies.bullet.p551ui.common.params;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.bytedance.ies.bullet.ui.common.params.TopBarType */
public enum TopBarType {
    IMMERSIVE(1),
    GRADUAL_CHANGE(2),
    NORMAL(3);
    
    public static final C10696a Companion = null;
    private final int VALUE;

    /* renamed from: com.bytedance.ies.bullet.ui.common.params.TopBarType$a */
    public static final class C10696a {
        private C10696a() {
        }

        public /* synthetic */ C10696a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static TopBarType m31249a(int i) {
            TopBarType[] values;
            for (TopBarType topBarType : TopBarType.values()) {
                if (i == topBarType.getVALUE()) {
                    return topBarType;
                }
            }
            return null;
        }
    }

    public final int getVALUE() {
        return this.VALUE;
    }

    static {
        Companion = new C10696a(null);
    }

    private TopBarType(int i) {
        this.VALUE = i;
    }
}
