package com.taobao.android.dexposed;

import com.taobao.android.dexposed.callbacks.IXUnhook;
import com.taobao.android.dexposed.callbacks.XCallback;
import com.taobao.android.dexposed.callbacks.XCallback.Param;
import java.lang.reflect.Member;

public abstract class XC_MethodHook extends XCallback {

    public static class MethodHookParam extends Param {
        public Object[] args;
        public Member method;
        private Object result;
        boolean returnEarly;
        public Object thisObject;
        private Throwable throwable;

        public Object getResult() {
            return this.result;
        }

        public Throwable getThrowable() {
            return this.throwable;
        }

        public boolean hasThrowable() {
            if (this.throwable != null) {
                return true;
            }
            return false;
        }

        public Object getResultOrThrowable() throws Throwable {
            if (this.throwable == null) {
                return this.result;
            }
            throw this.throwable;
        }

        public void setResult(Object obj) {
            this.result = obj;
            this.throwable = null;
            this.returnEarly = true;
        }

        public void setThrowable(Throwable th) {
            this.throwable = th;
            this.result = null;
            this.returnEarly = true;
        }
    }

    public class Unhook implements IXUnhook {
        private final Member hookMethod;

        public XC_MethodHook getCallback() {
            return XC_MethodHook.this;
        }

        public Member getHookedMethod() {
            return this.hookMethod;
        }

        public void unhook() {
            DexposedBridge.unhookMethod(this.hookMethod, XC_MethodHook.this);
        }

        public Unhook(Member member) {
            this.hookMethod = member;
        }
    }

    public abstract class XC_MethodKeepHook extends XC_MethodHook {
        public XC_MethodKeepHook() {
        }

        public XC_MethodKeepHook(int i) {
            super(i);
        }
    }

    public XC_MethodHook() {
    }

    /* access modifiers changed from: protected */
    public void afterHookedMethod(MethodHookParam methodHookParam) throws Throwable {
    }

    /* access modifiers changed from: protected */
    public void beforeHookedMethod(MethodHookParam methodHookParam) throws Throwable {
    }

    public XC_MethodHook(int i) {
        super(i);
    }
}
