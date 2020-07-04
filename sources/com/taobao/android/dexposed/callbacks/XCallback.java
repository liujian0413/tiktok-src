package com.taobao.android.dexposed.callbacks;

import android.os.Bundle;
import com.taobao.android.dexposed.DexposedBridge;
import com.taobao.android.dexposed.DexposedBridge.CopyOnWriteSortedSet;
import java.io.Serializable;

public abstract class XCallback implements Comparable<XCallback> {
    public final int priority;

    public static class Param {
        public final Object[] callbacks;
        private Bundle extra;

        static class SerializeWrapper implements Serializable {
            private static final long serialVersionUID = 1;
            public Object object;

            public SerializeWrapper(Object obj) {
                this.object = obj;
            }
        }

        protected Param() {
        }

        public synchronized Bundle getExtra() {
            if (this.extra == null) {
                this.extra = new Bundle();
            }
            return this.extra;
        }

        protected Param(CopyOnWriteSortedSet<? extends XCallback> copyOnWriteSortedSet) {
            this.callbacks = copyOnWriteSortedSet.getSnapshot();
        }

        public Object getObjectExtra(String str) {
            Serializable serializable = getExtra().getSerializable(str);
            if (serializable instanceof SerializeWrapper) {
                return ((SerializeWrapper) serializable).object;
            }
            return null;
        }

        public void setObjectExtra(String str, Object obj) {
            getExtra().putSerializable(str, new SerializeWrapper(obj));
        }
    }

    /* access modifiers changed from: protected */
    public void call(Param param) throws Throwable {
    }

    public XCallback() {
        this.priority = 50;
    }

    public XCallback(int i) {
        this.priority = i;
    }

    public int compareTo(XCallback xCallback) {
        if (this == xCallback) {
            return 0;
        }
        if (xCallback.priority != this.priority) {
            return xCallback.priority - this.priority;
        }
        if (System.identityHashCode(this) < System.identityHashCode(xCallback)) {
            return -1;
        }
        return 1;
    }

    public static final void callAll(Param param) {
        if (param.callbacks != null) {
            for (int i = 0; i < param.callbacks.length; i++) {
                try {
                    ((XCallback) param.callbacks[i]).call(param);
                } catch (Throwable th) {
                    DexposedBridge.log(th);
                }
            }
            return;
        }
        throw new IllegalStateException("This object was not created for use with callAll");
    }
}
