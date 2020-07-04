package com.facebook.jni;

import com.facebook.jni.C13974a.C13976a;

public class HybridData {
    private Destructor mDestructor = new Destructor(this);

    public static class Destructor extends C13976a {
        public long mNativePointer;

        static native void deleteNative(long j);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo33625a() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }

        Destructor(Object obj) {
            super(obj);
        }
    }

    public boolean isValid() {
        if (this.mDestructor.mNativePointer != 0) {
            return true;
        }
        return false;
    }

    public synchronized void resetNative() {
        this.mDestructor.mo33625a();
    }
}
