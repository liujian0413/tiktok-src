package com.taobao.android.dexposed;

import com.taobao.android.dexposed.XC_MethodHook.MethodHookParam;

public abstract class XC_MethodReplacement extends XC_MethodHook {
    public static final XC_MethodReplacement DO_NOTHING = new XC_MethodReplacement(20000) {
        /* access modifiers changed from: protected */
        public final Object replaceHookedMethod(MethodHookParam methodHookParam) throws Throwable {
            return null;
        }
    };

    public abstract class XC_MethodKeepReplacement extends XC_MethodReplacement {
        public XC_MethodKeepReplacement() {
        }

        public XC_MethodKeepReplacement(int i) {
            super(i);
        }
    }

    public XC_MethodReplacement() {
    }

    /* access modifiers changed from: protected */
    public final void afterHookedMethod(MethodHookParam methodHookParam) throws Throwable {
    }

    /* access modifiers changed from: protected */
    public abstract Object replaceHookedMethod(MethodHookParam methodHookParam) throws Throwable;

    public XC_MethodReplacement(int i) {
        super(i);
    }

    public static XC_MethodReplacement returnConstant(Object obj) {
        return returnConstant(50, obj);
    }

    /* access modifiers changed from: protected */
    public final void beforeHookedMethod(MethodHookParam methodHookParam) throws Throwable {
        try {
            methodHookParam.setResult(replaceHookedMethod(methodHookParam));
        } catch (Throwable th) {
            methodHookParam.setThrowable(th);
        }
    }

    public static XC_MethodReplacement returnConstant(int i, final Object obj) {
        return new XC_MethodReplacement(i) {
            /* access modifiers changed from: protected */
            public final Object replaceHookedMethod(MethodHookParam methodHookParam) throws Throwable {
                return obj;
            }
        };
    }
}
