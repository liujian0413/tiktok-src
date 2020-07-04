package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.coroutines.jvm.internal.e */
public final class C47954e {
    /* renamed from: b */
    private static final C7540d m148887b(BaseContinuationImpl baseContinuationImpl) {
        return (C7540d) baseContinuationImpl.getClass().getAnnotation(C7540d.class);
    }

    /* renamed from: c */
    private static final int m148888c(BaseContinuationImpl baseContinuationImpl) {
        int i;
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            C7573i.m23582a((Object) declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static final StackTraceElement m148885a(BaseContinuationImpl baseContinuationImpl) {
        int i;
        String str;
        C7573i.m23587b(baseContinuationImpl, "$this$getStackTraceElementImpl");
        C7540d b = m148887b(baseContinuationImpl);
        if (b == null) {
            return null;
        }
        m148886a(1, b.mo19420a());
        int c = m148888c(baseContinuationImpl);
        if (c < 0) {
            i = -1;
        } else {
            i = b.mo19422c()[c];
        }
        String a = C47956g.f122788b.mo120161a(baseContinuationImpl);
        if (a == null) {
            str = b.mo19424e();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append('/');
            sb.append(b.mo19424e());
            str = sb.toString();
        }
        return new StackTraceElement(str, b.mo19423d(), b.mo19421b(), i);
    }

    /* renamed from: a */
    private static final void m148886a(int i, int i2) {
        if (i2 > 1) {
            StringBuilder sb = new StringBuilder("Debug metadata version mismatch. Expected: ");
            sb.append(1);
            sb.append(", got ");
            sb.append(i2);
            sb.append(". Please update the Kotlin standard library.");
            throw new IllegalStateException(sb.toString().toString());
        }
    }
}
