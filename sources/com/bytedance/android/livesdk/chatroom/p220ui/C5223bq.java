package com.bytedance.android.livesdk.chatroom.p220ui;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bq */
final /* synthetic */ class C5223bq implements Runnable {

    /* renamed from: a */
    private final LiveInputDialogFragment f15319a;

    /* renamed from: b */
    private final long f15320b;

    /* renamed from: c */
    private final int f15321c;

    /* renamed from: d */
    private final int f15322d;

    C5223bq(LiveInputDialogFragment liveInputDialogFragment, long j, int i, int i2) {
        this.f15319a = liveInputDialogFragment;
        this.f15320b = j;
        this.f15321c = i;
        this.f15322d = i2;
    }

    public final void run() {
        this.f15319a.mo13242a(this.f15320b, this.f15321c, this.f15322d);
    }
}
