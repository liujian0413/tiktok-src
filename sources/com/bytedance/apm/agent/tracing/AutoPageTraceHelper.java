package com.bytedance.apm.agent.tracing;

import android.text.TextUtils;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.p253n.p470b.C9635a;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;

public class AutoPageTraceHelper {
    private static boolean sIsFirstWindowFocusChangedActivity;
    private static long sMaxValidTimeMs = 10000;
    private static final HashSet<String> sMethodSet = new HashSet<>(32);
    private static final ConcurrentLinkedQueue<PageTraceEntity> sPageList = new ConcurrentLinkedQueue<>();

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0137, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void reportStats() {
        /*
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.apm.agent.tracing.PageTraceEntity> r0 = sPageList     // Catch:{ Exception -> 0x0138 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0138 }
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x0137
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.apm.agent.tracing.PageTraceEntity> r2 = sPageList     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r2 = r2.peek()     // Catch:{ Exception -> 0x0138 }
            com.bytedance.apm.agent.tracing.PageTraceEntity r2 = (com.bytedance.apm.agent.tracing.PageTraceEntity) r2     // Catch:{ Exception -> 0x0138 }
            if (r2 == 0) goto L_0x0137
            long r3 = r2.onWindowFocusTs     // Catch:{ Exception -> 0x0138 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0021
            long r2 = r2.onViewShowTs     // Catch:{ Exception -> 0x0138 }
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0137
        L_0x0021:
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.apm.agent.tracing.PageTraceEntity> r2 = sPageList     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r2 = r2.poll()     // Catch:{ Exception -> 0x0138 }
            com.bytedance.apm.agent.tracing.PageTraceEntity r2 = (com.bytedance.apm.agent.tracing.PageTraceEntity) r2     // Catch:{ Exception -> 0x0138 }
            boolean r3 = r2.isValid()     // Catch:{ Exception -> 0x0138 }
            if (r3 != 0) goto L_0x0040
            boolean r0 = com.bytedance.apm.C6174c.m19149g()     // Catch:{ Exception -> 0x0138 }
            if (r0 == 0) goto L_0x0137
            com.bytedance.apm.d r0 = com.bytedance.apm.C6179d.m19171a()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r1 = "apm_autopage"
            r0.mo14889a(r1)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0138
        L_0x0040:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0138 }
            r3.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "name"
            java.lang.String r7 = "onCreate"
            r3.put(r4, r7)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "start"
            long r7 = r2.onCreateStartTs     // Catch:{ Exception -> 0x0138 }
            r3.put(r4, r7)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "end"
            long r7 = r2.onCreateEndTs     // Catch:{ Exception -> 0x0138 }
            r3.put(r4, r7)     // Catch:{ Exception -> 0x0138 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0138 }
            r4.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = "name"
            java.lang.String r8 = "onResume"
            r4.put(r7, r8)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = "start"
            long r8 = r2.onResumeStartTs     // Catch:{ Exception -> 0x0138 }
            r4.put(r7, r8)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = "end"
            long r8 = r2.onResumeEndTs     // Catch:{ Exception -> 0x0138 }
            r4.put(r7, r8)     // Catch:{ Exception -> 0x0138 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0138 }
            r7.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r8 = "name"
            java.lang.String r9 = "onWindowFocusChanged"
            r7.put(r8, r9)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r8 = "start"
            long r9 = r2.onWindowFocusTs     // Catch:{ Exception -> 0x0138 }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x0138 }
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x0138 }
            r8.<init>()     // Catch:{ Exception -> 0x0138 }
            r8.put(r3)     // Catch:{ Exception -> 0x0138 }
            r8.put(r4)     // Catch:{ Exception -> 0x0138 }
            r8.put(r7)     // Catch:{ Exception -> 0x0138 }
            long r3 = r2.onViewShowTs     // Catch:{ Exception -> 0x0138 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00b1
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0138 }
            r3.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "name"
            java.lang.String r7 = "viewShow"
            r3.put(r4, r7)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "start"
            long r9 = r2.onViewShowTs     // Catch:{ Exception -> 0x0138 }
            r3.put(r4, r9)     // Catch:{ Exception -> 0x0138 }
            r8.put(r3)     // Catch:{ Exception -> 0x0138 }
        L_0x00b1:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0138 }
            r3.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "name"
            java.lang.String r7 = "page_load_stats"
            r3.put(r4, r7)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "page_type"
            java.lang.String r7 = "activity"
            r3.put(r4, r7)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "start"
            long r9 = r2.onCreateStartTs     // Catch:{ Exception -> 0x0138 }
            r3.put(r4, r9)     // Catch:{ Exception -> 0x0138 }
            long r9 = r2.onViewShowTs     // Catch:{ Exception -> 0x0138 }
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00e5
            java.lang.String r4 = "end"
            long r5 = r2.onViewShowTs     // Catch:{ Exception -> 0x0138 }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x0138 }
            long r4 = r2.onViewShowTs     // Catch:{ Exception -> 0x0138 }
            long r6 = r2.onCreateStartTs     // Catch:{ Exception -> 0x0138 }
            r9 = 0
            long r4 = r4 - r6
            long r6 = sMaxValidTimeMs     // Catch:{ Exception -> 0x0138 }
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x00f8
            goto L_0x0133
        L_0x00e5:
            java.lang.String r4 = "end"
            long r5 = r2.onWindowFocusTs     // Catch:{ Exception -> 0x0138 }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x0138 }
            long r4 = r2.onWindowFocusTs     // Catch:{ Exception -> 0x0138 }
            long r6 = r2.onCreateStartTs     // Catch:{ Exception -> 0x0138 }
            r9 = 0
            long r4 = r4 - r6
            long r6 = sMaxValidTimeMs     // Catch:{ Exception -> 0x0138 }
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x0133
        L_0x00f8:
            java.lang.String r4 = "spans"
            r3.put(r4, r8)     // Catch:{ Exception -> 0x0138 }
            java.util.HashSet<java.lang.String> r4 = sMethodSet     // Catch:{ Exception -> 0x0138 }
            java.lang.String r5 = r2.pageName     // Catch:{ Exception -> 0x0138 }
            boolean r4 = r4.contains(r5)     // Catch:{ Exception -> 0x0138 }
            r5 = 1
            if (r4 == 0) goto L_0x010a
            r4 = 2
            goto L_0x010b
        L_0x010a:
            r4 = 1
        L_0x010b:
            java.util.HashSet<java.lang.String> r6 = sMethodSet     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = r2.pageName     // Catch:{ Exception -> 0x0138 }
            r6.add(r7)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r6 = "launch_mode"
            r3.put(r6, r4)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "collect_from"
            r3.put(r4, r5)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "page_name"
            java.lang.String r2 = r2.pageName     // Catch:{ Exception -> 0x0138 }
            r3.put(r4, r2)     // Catch:{ Exception -> 0x0138 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0138 }
            r2.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "trace"
            r2.put(r4, r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r3 = "page_load_trace"
            r4 = 0
            com.bytedance.apm.agent.monitor.MonitorTool.monitorPerformance(r3, r4, r4, r2)     // Catch:{ Exception -> 0x0138 }
        L_0x0133:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0137:
            return
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.tracing.AutoPageTraceHelper.reportStats():void");
    }

    public static void setMaxValidTimeMs(long j) {
        sMaxValidTimeMs = j;
    }

    public static void reportViewIdStats(long j, String str) {
        PageTraceEntity pageTraceEntity = (PageTraceEntity) sPageList.peek();
        if (pageTraceEntity != null && TextUtils.equals(str, pageTraceEntity.pageName)) {
            pageTraceEntity.onViewShowTs = j;
            C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                public final void run() {
                    AutoPageTraceHelper.reportStats();
                }
            });
        }
    }

    public static void onTrace(String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnCreateStart(str);
                }
                sPageList.add(new PageTraceEntity(str, System.currentTimeMillis()));
                return;
            }
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnCreateEnd();
            }
            PageTraceEntity pageTraceEntity = (PageTraceEntity) sPageList.peek();
            if (pageTraceEntity != null) {
                pageTraceEntity.onCreateEndTs = System.currentTimeMillis();
            }
        } else if (!TextUtils.equals("onResume", str2)) {
            if (TextUtils.equals("onWindowFocusChanged", str2) && z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnWindowFocusChangedStart(str);
                    sIsFirstWindowFocusChangedActivity = true;
                }
                PageTraceEntity pageTraceEntity2 = (PageTraceEntity) sPageList.peek();
                if (pageTraceEntity2 != null && pageTraceEntity2.onWindowFocusTs == 0) {
                    pageTraceEntity2.onWindowFocusTs = System.currentTimeMillis();
                    if (C9635a.m28501a(str) == null) {
                        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                            public final void run() {
                                AutoPageTraceHelper.reportStats();
                            }
                        });
                    }
                }
            }
        } else if (z) {
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnResumeStart(str);
            }
            PageTraceEntity pageTraceEntity3 = (PageTraceEntity) sPageList.peek();
            if (pageTraceEntity3 != null) {
                pageTraceEntity3.onResumeStartTs = System.currentTimeMillis();
            }
        } else {
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnResumeEnd();
            }
            PageTraceEntity pageTraceEntity4 = (PageTraceEntity) sPageList.peek();
            if (pageTraceEntity4 != null) {
                pageTraceEntity4.onResumeEndTs = System.currentTimeMillis();
            }
        }
    }
}
