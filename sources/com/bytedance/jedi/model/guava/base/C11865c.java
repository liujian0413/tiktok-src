package com.bytedance.jedi.model.guava.base;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.bytedance.jedi.model.guava.base.c */
final class C11865c {
    /* renamed from: a */
    private static String m34660a(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj.getClass().getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            String sb2 = sb.toString();
            Logger logger = Logger.getLogger("com.bytedance.jedi.model.guava.base.Strings");
            Level level = Level.WARNING;
            StringBuilder sb3 = new StringBuilder("Exception during lenientFormat for ");
            sb3.append(sb2);
            logger.log(level, sb3.toString(), e);
            StringBuilder sb4 = new StringBuilder("<");
            sb4.append(sb2);
            sb4.append(" threw ");
            sb4.append(e.getClass().getName());
            sb4.append(">");
            return sb4.toString();
        }
    }

    /* renamed from: a */
    static String m34661a(String str, Object... objArr) {
        String valueOf = String.valueOf(str);
        for (int i = 0; i <= 0; i++) {
            objArr[0] = m34660a(objArr[0]);
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + 16);
        int i2 = 0;
        int i3 = 0;
        while (i2 <= 0) {
            int indexOf = valueOf.indexOf("%s", 0);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf, 0, indexOf);
            i2++;
            sb.append(objArr[0]);
            i3 = indexOf + 2;
        }
        sb.append(valueOf, i3, valueOf.length());
        if (i2 <= 0) {
            sb.append(" [");
            sb.append(objArr[0]);
            sb.append(']');
        }
        return sb.toString();
    }
}
