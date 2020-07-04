package com.p280ss.android.message.sswo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.message.sswo.SswoActivity */
public class SswoActivity extends Activity {

    /* renamed from: a */
    private static WeakReference<SswoActivity> f53952a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m65682b() {
        try {
            Window window = getWindow();
            window.setGravity(51);
            LayoutParams attributes = window.getAttributes();
            attributes.x = 35;
            attributes.y = 0;
            attributes.height = 1;
            attributes.width = 1;
            window.setAttributes(attributes);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (f53952a != null && ((SswoActivity) f53952a.get()) == this) {
            f53952a.clear();
            f53952a = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (!C19894a.m65685a(this).mo53317e() && !isFinishing()) {
            finish();
        }
    }

    /* renamed from: a */
    public static boolean m65681a() {
        try {
            if (f53952a != null) {
                SswoActivity sswoActivity = (SswoActivity) f53952a.get();
                if (sswoActivity != null) {
                    return sswoActivity.isFinishing();
                }
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isFinishing()) {
            finish();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isFinishing()) {
            finish();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public static void m65680a(Context context) {
        if (context != null) {
            try {
                Intent intent = new Intent(context, SswoActivity.class);
                intent.addFlags(268435456);
                context.startActivity(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onCreate", true);
        super.onCreate(bundle);
        m65682b();
        f53952a = new WeakReference<>(this);
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onCreate", false);
    }

    /* renamed from: b */
    public static void m65683b(Context context) {
        try {
            if (f53952a != null) {
                SswoActivity sswoActivity = (SswoActivity) f53952a.get();
                if (sswoActivity != null && !sswoActivity.isFinishing()) {
                    sswoActivity.finish();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
