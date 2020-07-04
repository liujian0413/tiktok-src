package com.bytedance.android.livesdk.chatroom.p220ui;

import android.graphics.Canvas;
import com.bytedance.android.live.core.widget.HSImageView;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dq */
public final class C5284dq extends HSImageView {

    /* renamed from: a */
    float f15450a;

    public final void setScale(float f) {
        this.f15450a = f;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.scale(this.f15450a, this.f15450a, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        super.onDraw(canvas);
    }
}
