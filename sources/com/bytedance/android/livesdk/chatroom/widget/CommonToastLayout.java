package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class CommonToastLayout extends FrameLayout {

    /* renamed from: a */
    private C5759a f16878a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout$a */
    public interface C5759a {
        /* renamed from: a */
        void mo14184a(CommonToastLayout commonToastLayout);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f16878a != null) {
            this.f16878a.mo14184a(this);
        }
    }

    public void setOnDetachListener(C5759a aVar) {
        this.f16878a = aVar;
    }

    public CommonToastLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
