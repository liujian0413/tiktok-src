package android.support.p022v4.media;

import android.service.media.MediaBrowserService.Result;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.media.d */
final class C0804d {

    /* renamed from: a */
    static Field f2944a;

    /* renamed from: android.support.v4.media.d$a */
    public interface C0805a {
    }

    static {
        try {
            Field declaredField = Result.class.getDeclaredField("mFlags");
            f2944a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }
}
