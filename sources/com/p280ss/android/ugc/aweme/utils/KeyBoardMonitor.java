package com.p280ss.android.ugc.aweme.utils;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;

/* renamed from: com.ss.android.ugc.aweme.utils.KeyBoardMonitor */
public class KeyBoardMonitor implements C0042h, OnGlobalLayoutListener {

    /* renamed from: a */
    private View f111417a;

    /* renamed from: b */
    private C42902a f111418b;

    /* renamed from: com.ss.android.ugc.aweme.utils.KeyBoardMonitor$a */
    public interface C42902a {
        /* renamed from: a */
        void mo102018a();

        /* renamed from: b */
        void mo102019b();
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        m136220a();
    }

    /* renamed from: a */
    private void m136220a() {
        if (this.f111417a != null) {
            this.f111417a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public void onGlobalLayout() {
        Rect rect = new Rect();
        this.f111417a.getWindowVisibleDisplayFrame(rect);
        if (((float) (this.f111417a.getBottom() - rect.bottom)) > this.f111417a.getResources().getDisplayMetrics().density * 100.0f) {
            this.f111418b.mo102018a();
        } else {
            this.f111418b.mo102019b();
        }
    }

    public KeyBoardMonitor(C0043i iVar) {
        if (iVar != null) {
            iVar.getLifecycle().mo55a(this);
        }
    }

    /* renamed from: a */
    public final void mo104608a(EditText editText, C42902a aVar) {
        this.f111417a = editText.getRootView();
        this.f111418b = aVar;
        if (this.f111417a != null) {
            this.f111417a.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }
}
