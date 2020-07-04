package com.ttnet.org.chromium.base;

import com.C1642a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LifetimeAssert {
    static TestHook sTestHook;
    final WrappedReference mWrapper;

    static class CreationException extends RuntimeException {
        CreationException() {
            super("vvv This is where object was created. vvv");
        }
    }

    static class LifetimeAssertException extends RuntimeException {
        LifetimeAssertException(String str, Throwable th) {
            super(str, th);
        }
    }

    interface TestHook {
        void onCleaned(WrappedReference wrappedReference, String str);
    }

    static class WrappedReference extends PhantomReference<Object> {
        public static Set<WrappedReference> sActiveWrappers = Collections.synchronizedSet(new HashSet());
        public static ReferenceQueue<Object> sReferenceQueue = new ReferenceQueue<>();
        final CreationException mCreationException;
        boolean mSafeToGc;
        final Class<?> mTargetClass;

        static {
            new Thread("GcStateAssertQueue") {
                public void run() {
                    while (true) {
                        try {
                            WrappedReference wrappedReference = (WrappedReference) WrappedReference.sReferenceQueue.remove();
                            WrappedReference.sActiveWrappers.remove(wrappedReference);
                            if (!wrappedReference.mSafeToGc) {
                                String a = C1642a.m8034a("Object of type %s was GC'ed without cleanup. Refer to \"Caused by\" for where object was created.", new Object[]{wrappedReference.mTargetClass.getName()});
                                if (LifetimeAssert.sTestHook != null) {
                                    LifetimeAssert.sTestHook.onCleaned(wrappedReference, a);
                                } else {
                                    throw new LifetimeAssertException(a, wrappedReference.mCreationException);
                                }
                            } else if (LifetimeAssert.sTestHook != null) {
                                LifetimeAssert.sTestHook.onCleaned(wrappedReference, null);
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

                {
                    setDaemon(true);
                    start();
                }
            };
        }

        public WrappedReference(Object obj, CreationException creationException, boolean z) {
            super(obj, sReferenceQueue);
            this.mCreationException = creationException;
            this.mSafeToGc = z;
            this.mTargetClass = obj.getClass();
            sActiveWrappers.add(this);
        }
    }

    public static void assertAllInstancesDestroyedForTesting() throws LifetimeAssertException {
        if (BuildConfig.DCHECK_IS_ON) {
            synchronized (WrappedReference.sActiveWrappers) {
                for (WrappedReference wrappedReference : WrappedReference.sActiveWrappers) {
                    if (!wrappedReference.mSafeToGc) {
                        throw new LifetimeAssertException(C1642a.m8034a("Object of type %s was not destroyed after test completed. Refer to \"Caused by\" for where object was created.", new Object[]{wrappedReference.mTargetClass.getName()}), wrappedReference.mCreationException);
                    }
                }
            }
        }
    }

    private LifetimeAssert(WrappedReference wrappedReference) {
        this.mWrapper = wrappedReference;
    }

    public static LifetimeAssert create(Object obj) {
        if (!BuildConfig.DCHECK_IS_ON) {
            return null;
        }
        return new LifetimeAssert(new WrappedReference(obj, new CreationException(), false));
    }

    public static void setSafeToGc(LifetimeAssert lifetimeAssert, boolean z) {
        if (BuildConfig.DCHECK_IS_ON) {
            lifetimeAssert.mWrapper.mSafeToGc = z;
        }
    }

    public static LifetimeAssert create(Object obj, boolean z) {
        if (!BuildConfig.DCHECK_IS_ON) {
            return null;
        }
        return new LifetimeAssert(new WrappedReference(obj, new CreationException(), z));
    }
}
