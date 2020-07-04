package com.bytedance.apm.agent.wrapper;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TTToastWrapper {

    public @interface Duration {
    }

    static class ProxyTNHandler extends Handler {
        private Method handleHideMethod;
        private Method handleShowMethod;
        private Object tnObject;

        ProxyTNHandler(Object obj) {
            this.tnObject = obj;
            try {
                this.handleShowMethod = obj.getClass().getDeclaredMethod("handleShow", new Class[]{IBinder.class});
                this.handleShowMethod.setAccessible(true);
                this.handleHideMethod = obj.getClass().getDeclaredMethod("handleHide", new Class[0]);
                this.handleHideMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:15:? A[ExcHandler: IllegalAccessException | InvocationTargetException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:12:0x002b] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                int r0 = r6.what
                r1 = 0
                switch(r0) {
                    case 0: goto L_0x0023;
                    case 1: goto L_0x0015;
                    case 2: goto L_0x0007;
                    default: goto L_0x0006;
                }
            L_0x0006:
                goto L_0x0037
            L_0x0007:
                java.lang.reflect.Method r0 = r5.handleHideMethod
                if (r0 == 0) goto L_0x0037
                java.lang.reflect.Method r0 = r5.handleHideMethod     // Catch:{  }
                java.lang.Object r2 = r5.tnObject     // Catch:{  }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{  }
                r0.invoke(r2, r1)     // Catch:{  }
                goto L_0x0037
            L_0x0015:
                java.lang.reflect.Method r0 = r5.handleHideMethod
                if (r0 == 0) goto L_0x0037
                java.lang.reflect.Method r0 = r5.handleHideMethod     // Catch:{  }
                java.lang.Object r2 = r5.tnObject     // Catch:{  }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{  }
                r0.invoke(r2, r1)     // Catch:{  }
                goto L_0x0037
            L_0x0023:
                java.lang.Object r0 = r6.obj
                android.os.IBinder r0 = (android.os.IBinder) r0
                java.lang.reflect.Method r2 = r5.handleShowMethod
                if (r2 == 0) goto L_0x0037
                java.lang.reflect.Method r2 = r5.handleShowMethod     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0037, IllegalAccessException | InvocationTargetException -> 0x0037 }
                java.lang.Object r3 = r5.tnObject     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0037, IllegalAccessException | InvocationTargetException -> 0x0037 }
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0037, IllegalAccessException | InvocationTargetException -> 0x0037 }
                r4[r1] = r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0037, IllegalAccessException | InvocationTargetException -> 0x0037 }
                r2.invoke(r3, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0037, IllegalAccessException | InvocationTargetException -> 0x0037 }
            L_0x0037:
                super.handleMessage(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.wrapper.TTToastWrapper.ProxyTNHandler.handleMessage(android.os.Message):void");
        }
    }

    public static boolean initToastHook(Toast toast) {
        if (VERSION.SDK_INT == 24 || VERSION.SDK_INT == 25) {
            reflectAndoridNTNHandler(toast);
        }
        return true;
    }

    private static boolean reflectAndoridNTNHandler(Toast toast) {
        Field field;
        try {
            if (toast.getClass().getSuperclass() == null || !Toast.class.getName().equals(toast.getClass().getSuperclass().getName())) {
                field = toast.getClass().getDeclaredField("mTN");
            } else {
                field = toast.getClass().getSuperclass().getDeclaredField("mTN");
            }
            if (field == null) {
                return false;
            }
            field.setAccessible(true);
            Object obj = field.get(toast);
            if (obj == null) {
                return false;
            }
            Field declaredField = obj.getClass().getDeclaredField("mHandler");
            if (declaredField == null) {
                return false;
            }
            declaredField.setAccessible(true);
            declaredField.set(obj, new ProxyTNHandler(obj));
            return true;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    public static Toast makeText(Context context, int i, int i2) throws NotFoundException {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getResources().getText(i));
        sb.append("__wrapper");
        return makeText(context, (CharSequence) sb.toString(), i2);
    }

    public static Toast makeText(Context context, CharSequence charSequence, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        sb.append("__wrapper");
        Toast makeText = Toast.makeText(context, sb.toString(), i);
        initToastHook(makeText);
        return makeText;
    }
}
