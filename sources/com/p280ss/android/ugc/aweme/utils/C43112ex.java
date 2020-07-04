package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager.BadTokenException;
import android.widget.Toast;
import com.bytedance.common.utility.C9729e;
import com.bytedance.common.utility.C9738o.C9741b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.utils.ex */
public final class C43112ex implements C9741b {

    /* renamed from: a */
    private static Field f111736a;

    /* renamed from: b */
    private static Field f111737b;

    /* renamed from: com.ss.android.ugc.aweme.utils.ex$a */
    public static class C43113a extends Handler {

        /* renamed from: a */
        private Handler f111738a;

        public C43113a(Handler handler) {
            this.f111738a = handler;
        }

        public final void handleMessage(Message message) {
            this.f111738a.handleMessage(message);
        }

        public final void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (BadTokenException e) {
                C6921a.m21559a((Throwable) e);
            }
        }
    }

    static {
        try {
            Field declaredField = Toast.class.getDeclaredField("mTN");
            f111736a = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = f111736a.getType().getDeclaredField("mHandler");
            f111737b = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
    }

    /* renamed from: a */
    public static void m136740a(Toast toast) {
        try {
            Object obj = f111736a.get(toast);
            f111737b.set(obj, new C43113a((Handler) f111737b.get(obj)));
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final boolean mo24113a(Context context, int i, CharSequence charSequence, long j, int i2) {
        if ((context instanceof C9729e) || VERSION.SDK_INT != 25) {
            return false;
        }
        Toast makeText = Toast.makeText(context, charSequence, (int) j);
        m136740a(makeText);
        C43114ey.m136742a(makeText);
        return true;
    }
}
