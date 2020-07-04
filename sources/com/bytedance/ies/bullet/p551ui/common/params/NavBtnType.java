package com.bytedance.ies.bullet.p551ui.common.params;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.bytedance.ies.bullet.ui.common.params.NavBtnType */
public enum NavBtnType {
    REPORT(1),
    SHARE(2);
    
    public static final C10695a Companion = null;
    private final int VALUE;

    /* renamed from: com.bytedance.ies.bullet.ui.common.params.NavBtnType$a */
    public static final class C10695a {
        private C10695a() {
        }

        public /* synthetic */ C10695a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static NavBtnType m31248a(int i) {
            NavBtnType[] values;
            for (NavBtnType navBtnType : NavBtnType.values()) {
                if (i == navBtnType.getVALUE()) {
                    return navBtnType;
                }
            }
            return null;
        }
    }

    public final int getVALUE() {
        return this.VALUE;
    }

    static {
        Companion = new C10695a(null);
    }

    private NavBtnType(int i) {
        this.VALUE = i;
    }
}
