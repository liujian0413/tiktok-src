package android.support.p022v4.util;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: android.support.v4.util.c */
public final class C0891c {
    /* renamed from: a */
    public static void m3790a(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append(TEVideoRecorder.FACE_BEAUTY_NULL);
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName == null || simpleName.length() <= 0) {
            simpleName = obj.getClass().getName();
            int lastIndexOf = simpleName.lastIndexOf(46);
            if (lastIndexOf > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
