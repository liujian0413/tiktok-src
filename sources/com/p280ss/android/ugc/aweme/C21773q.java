package com.p280ss.android.ugc.aweme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.bytedance.ttnet.hostmonitor.ConnectivityReceiver;
import com.p280ss.android.ugc.aweme.common.net.NetworkReceiver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.q */
public final class C21773q {

    /* renamed from: a */
    private List<BroadcastReceiver> f58285a = new ArrayList();

    /* renamed from: d */
    private void m72789d(Context context) {
        for (BroadcastReceiver broadcastReceiver : this.f58285a) {
            if (broadcastReceiver != null) {
                context.unregisterReceiver(broadcastReceiver);
            }
        }
        this.f58285a.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0013, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo58120c(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x0012
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x000f }
            r1 = 26
            if (r0 >= r1) goto L_0x000a
            goto L_0x0012
        L_0x000a:
            r2.m72789d(r3)     // Catch:{ all -> 0x000f }
            monitor-exit(r2)
            return
        L_0x000f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0012:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.C21773q.mo58120c(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo58118a(Context context) {
        if (context != null && VERSION.SDK_INT >= 26) {
            m72787a(context, new NetworkReceiver(), new String[]{"android.net.conn.CONNECTIVITY_CHANGE"});
            m72787a(context, new ConnectivityReceiver(), new String[]{"android.net.conn.CONNECTIVITY_CHANGE"});
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006f, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo58119b(android.content.Context r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ss.android.ugc.aweme.common.net.NetworkStateAvailableReceiver r0 = new com.ss.android.ugc.aweme.common.net.NetworkStateAvailableReceiver     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0070 }
            r7.m72787a(r8, r0, r2)     // Catch:{ all -> 0x0070 }
            if (r8 == 0) goto L_0x006e
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0070 }
            r2 = 26
            if (r0 >= r2) goto L_0x001a
            goto L_0x006e
        L_0x001a:
            com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver r0 = new com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2[r4] = r3     // Catch:{ all -> 0x0070 }
            r7.m72787a(r8, r0, r2)     // Catch:{ all -> 0x0070 }
            com.ss.android.ugc.aweme.livewallpaper.receiver.LiveWallPaperPluginInstalledReceiver r0 = new com.ss.android.ugc.aweme.livewallpaper.receiver.LiveWallPaperPluginInstalledReceiver     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "android.intent.action.PACKAGE_ADDED"
            r2[r4] = r3     // Catch:{ all -> 0x0070 }
            r7.m72787a(r8, r0, r2)     // Catch:{ all -> 0x0070 }
            com.ss.android.download.DownloadReceiver r0 = new com.ss.android.download.DownloadReceiver     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2[r4] = r3     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "android.intent.action.PACKAGE_ADDED"
            r2[r1] = r3     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "android.intent.action.PACKAGE_REPLACED"
            r5 = 2
            r2[r5] = r3     // Catch:{ all -> 0x0070 }
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0070 }
            java.lang.String r6 = "package"
            r3[r4] = r6     // Catch:{ all -> 0x0070 }
            r7.m72788a(r8, r0, r2, r3)     // Catch:{ all -> 0x0070 }
            boolean r0 = com.p280ss.android.ugc.aweme.main.experiment.EarPhoneUnplugExperiment.shouldPausePlayVideo()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.video.EarPhoneUnplugReceiver r0 = new com.ss.android.ugc.aweme.video.EarPhoneUnplugReceiver     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "android.media.AUDIO_BECOMING_NOISY"
            r2[r4] = r3     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"
            r2[r1] = r3     // Catch:{ all -> 0x0070 }
            r7.m72787a(r8, r0, r2)     // Catch:{ all -> 0x0070 }
        L_0x006c:
            monitor-exit(r7)
            return
        L_0x006e:
            monitor-exit(r7)
            return
        L_0x0070:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.C21773q.mo58119b(android.content.Context):void");
    }

    /* renamed from: a */
    private void m72787a(Context context, BroadcastReceiver broadcastReceiver, String[] strArr) {
        this.f58285a.add(broadcastReceiver);
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : strArr) {
            intentFilter.addAction(addAction);
        }
        context.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* renamed from: a */
    private void m72788a(Context context, BroadcastReceiver broadcastReceiver, String[] strArr, String[] strArr2) {
        this.f58285a.add(broadcastReceiver);
        IntentFilter intentFilter = new IntentFilter();
        for (int i = 0; i < 3; i++) {
            intentFilter.addAction(strArr[i]);
        }
        for (int i2 = 0; i2 <= 0; i2++) {
            intentFilter.addDataScheme(strArr2[0]);
        }
        context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
