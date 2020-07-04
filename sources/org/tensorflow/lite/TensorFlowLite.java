package org.tensorflow.lite;

import java.io.PrintStream;

public final class TensorFlowLite {
    static {
        m150041a();
    }

    private TensorFlowLite() {
    }

    static native void initTensorFlow();

    public static native String runtimeVersion();

    public static native String schemaVersion();

    /* renamed from: a */
    static boolean m150041a() {
        try {
            C48364c.m150042a("tensorflowlite_jni");
            return true;
        } catch (UnsatisfiedLinkError e) {
            try {
                C48364c.m150042a("tensorflowlite_flex_jni");
                return true;
            } catch (UnsatisfiedLinkError unused) {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder("TensorFlowLite: failed to load native library: ");
                sb.append(e.getMessage());
                printStream.println(sb.toString());
                return false;
            }
        }
    }
}
