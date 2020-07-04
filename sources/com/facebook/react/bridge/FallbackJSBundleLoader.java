package com.facebook.react.bridge;

import com.facebook.common.p686c.C13286a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public final class FallbackJSBundleLoader extends JSBundleLoader {
    private Stack<JSBundleLoader> mLoaders = new Stack<>();
    private final ArrayList<Exception> mRecoveredErrors = new ArrayList<>();

    private JSBundleLoader getDelegateLoader() {
        if (!this.mLoaders.empty()) {
            return (JSBundleLoader) this.mLoaders.peek();
        }
        Throwable runtimeException = new RuntimeException("No fallback options available");
        Iterator it = this.mRecoveredErrors.iterator();
        Throwable th = runtimeException;
        while (it.hasNext()) {
            th.initCause((Exception) it.next());
            while (th.getCause() != null) {
                th = th.getCause();
            }
        }
        throw runtimeException;
    }

    public FallbackJSBundleLoader(List<JSBundleLoader> list) {
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            this.mLoaders.push(listIterator.previous());
        }
    }

    public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
        while (true) {
            try {
                return getDelegateLoader().loadScript(catalystInstanceImpl);
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getMessage().startsWith("facebook::react::Recoverable")) {
                    throw e;
                }
                this.mLoaders.pop();
                this.mRecoveredErrors.add(e);
                C13286a.m38864d("FallbackJSBundleLoader", "Falling back from recoverable error", (Throwable) e);
            }
        }
        throw e;
    }
}
