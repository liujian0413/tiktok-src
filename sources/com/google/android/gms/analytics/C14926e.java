package com.google.android.gms.analytics;

import android.content.BroadcastReceiver.PendingResult;

/* renamed from: com.google.android.gms.analytics.e */
final class C14926e implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ PendingResult f38599a;

    C14926e(CampaignTrackingReceiver campaignTrackingReceiver, PendingResult pendingResult) {
        this.f38599a = pendingResult;
    }

    public final void run() {
        if (this.f38599a != null) {
            this.f38599a.finish();
        }
    }
}
