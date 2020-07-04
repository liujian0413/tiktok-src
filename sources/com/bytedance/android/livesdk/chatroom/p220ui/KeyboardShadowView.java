package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.common.utility.C9738o;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.KeyboardShadowView */
public class KeyboardShadowView extends View {

    /* renamed from: a */
    private Activity f14593a;

    /* renamed from: b */
    private boolean f14594b;

    /* renamed from: c */
    private boolean f14595c;

    /* renamed from: d */
    private int f14596d;

    /* renamed from: e */
    private C5082a f14597e;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.KeyboardShadowView$a */
    public interface C5082a {
    }

    public KeyboardShadowView(Context context) {
        super(context);
    }

    public void setCallback(C5082a aVar) {
        this.f14597e = aVar;
    }

    public void setShowStatusBar(boolean z) {
        this.f14595c = z;
    }

    /* access modifiers changed from: 0000 */
    public void setActivity(Activity activity) {
        this.f14593a = activity;
        this.f14594b = C3387g.m12599a(activity);
        this.f14596d = C9738o.m28717e(activity);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f14593a == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.f14595c || this.f14594b) {
            motionEvent.offsetLocation(0.0f, (float) this.f14596d);
        }
        Fragment a = ((FragmentActivity) this.f14593a).getSupportFragmentManager().mo2644a("AbsInteractionFragment");
        boolean z = false;
        if (a == null) {
            z = this.f14593a.dispatchTouchEvent(motionEvent);
        } else if (a instanceof DialogFragment) {
            Dialog dialog = ((DialogFragment) a).getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    z = window.superDispatchTouchEvent(motionEvent);
                }
            }
        }
        return z;
    }

    public KeyboardShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public KeyboardShadowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
