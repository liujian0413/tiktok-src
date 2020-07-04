package com.p280ss.android.ugc.aweme.crossplatform.base;

import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.base.SystemPrintHookTask */
public final class SystemPrintHookTask implements LegoTask {
    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public final void run(Context context) {
        Field field;
        Field field2;
        Field field3;
        if (!C7163a.m22363a()) {
            System.err.println("err before");
            System.out.println("out before");
            try {
                field = System.class.getField("err");
                field2 = System.class.getField("out");
                field.setAccessible(true);
                field2.setAccessible(true);
                field3 = Field.class.getDeclaredField("accessFlags");
            } catch (NoSuchFieldException unused) {
                field3 = Field.class.getDeclaredField("modifiers");
            } catch (Throwable unused2) {
            }
            field3.setAccessible(true);
            field3.setInt(field, field.getModifiers() & -17);
            field3.setInt(field2, field2.getModifiers() & -17);
            PrintStream printStream = new PrintStream(new OutputStream() {
                public final void write(int i) {
                }
            });
            field.set(null, printStream);
            field2.set(null, printStream);
            System.err.println("err after");
            System.out.println("out after");
        }
    }
}
