package com.bytedance.android.livesdk.chatroom.p220ui;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ec */
final /* synthetic */ class C5309ec implements Runnable {

    /* renamed from: a */
    private final SimpleInputDialogFragment f15536a;

    /* renamed from: b */
    private final long f15537b;

    /* renamed from: c */
    private final int f15538c;

    /* renamed from: d */
    private final int f15539d;

    C5309ec(SimpleInputDialogFragment simpleInputDialogFragment, long j, int i, int i2) {
        this.f15536a = simpleInputDialogFragment;
        this.f15537b = j;
        this.f15538c = i;
        this.f15539d = i2;
    }

    public final void run() {
        this.f15536a.mo13414a(this.f15537b, this.f15538c, this.f15539d);
    }
}
