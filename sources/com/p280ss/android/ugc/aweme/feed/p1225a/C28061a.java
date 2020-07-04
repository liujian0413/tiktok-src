package com.p280ss.android.ugc.aweme.feed.p1225a;

import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.feed.api.BackUpApi;
import com.p280ss.android.ugc.aweme.feed.event.C28319b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatisticsResponse;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.collections.C7506ac;
import kotlin.collections.C7507ae;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;

/* renamed from: com.ss.android.ugc.aweme.feed.a.a */
public final class C28061a {

    /* renamed from: a */
    public static final C28061a f73924a = new C28061a();

    private C28061a() {
    }

    /* renamed from: a */
    private static final void m91694a(String str) {
        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
        if (awemeById != null) {
            AwemeStatistics statistics = awemeById.getStatistics();
            if (statistics != null) {
                statistics.setLoseCommentCount(0);
            }
            AwemeStatistics statistics2 = awemeById.getStatistics();
            if (statistics2 != null) {
                statistics2.setLoseCount(0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0103  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m91696a(java.util.List<? extends com.p280ss.android.ugc.aweme.feed.model.Aweme> r13) {
        /*
            java.lang.String r0 = "awemeList"
            kotlin.jvm.internal.C7573i.m23587b(r13, r0)
            java.lang.String r0 = "FeedBackupHelper"
            java.lang.String r1 = "FeedBackupHelper start to checkStatisticsInfo!"
            r2 = 4
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ","
            r3 = 0
            r4 = -1
            r5 = 1
            r6 = r13
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ Throwable -> 0x00c5 }
            int r6 = r6.size()     // Catch:{ Throwable -> 0x00c5 }
            r7 = -1
        L_0x001f:
            if (r3 >= r6) goto L_0x00d1
            java.lang.Object r8 = r13.get(r3)     // Catch:{ Throwable -> 0x00c3 }
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r8     // Catch:{ Throwable -> 0x00c3 }
            java.lang.String r9 = r8.getAid()     // Catch:{ Throwable -> 0x00c3 }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Throwable -> 0x00c3 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x00c3 }
            if (r9 != 0) goto L_0x00bf
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r9 = r8.getStatistics()     // Catch:{ Throwable -> 0x00c3 }
            if (r9 == 0) goto L_0x00bf
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r9 = r8.getStatistics()     // Catch:{ Throwable -> 0x00c3 }
            java.lang.String r10 = "aweme.statistics"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)     // Catch:{ Throwable -> 0x00c3 }
            int r9 = r9.getLoseCommentCount()     // Catch:{ Throwable -> 0x00c3 }
            r10 = 2
            r11 = 3
            if (r9 != 0) goto L_0x006a
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r9 = r8.getStatistics()     // Catch:{ Throwable -> 0x00c3 }
            java.lang.String r12 = "aweme.statistics"
            kotlin.jvm.internal.C7573i.m23582a(r9, r12)     // Catch:{ Throwable -> 0x00c3 }
            int r9 = r9.getLoseCount()     // Catch:{ Throwable -> 0x00c3 }
            if (r9 != r5) goto L_0x006a
            java.lang.String r9 = r8.getAid()     // Catch:{ Throwable -> 0x00c3 }
            r0.append(r9)     // Catch:{ Throwable -> 0x00c3 }
            r0.append(r1)     // Catch:{ Throwable -> 0x00c3 }
            if (r7 != r4) goto L_0x0067
            r7 = 1
            goto L_0x00b3
        L_0x0067:
            if (r7 == r5) goto L_0x00b3
            goto L_0x00b2
        L_0x006a:
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r9 = r8.getStatistics()     // Catch:{ Throwable -> 0x00c3 }
            java.lang.String r12 = "aweme.statistics"
            kotlin.jvm.internal.C7573i.m23582a(r9, r12)     // Catch:{ Throwable -> 0x00c3 }
            int r9 = r9.getLoseCommentCount()     // Catch:{ Throwable -> 0x00c3 }
            if (r9 != r5) goto L_0x0099
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r9 = r8.getStatistics()     // Catch:{ Throwable -> 0x00c3 }
            java.lang.String r12 = "aweme.statistics"
            kotlin.jvm.internal.C7573i.m23582a(r9, r12)     // Catch:{ Throwable -> 0x00c3 }
            int r9 = r9.getLoseCount()     // Catch:{ Throwable -> 0x00c3 }
            if (r9 != 0) goto L_0x0099
            java.lang.String r9 = r8.getAid()     // Catch:{ Throwable -> 0x00c3 }
            r0.append(r9)     // Catch:{ Throwable -> 0x00c3 }
            r0.append(r1)     // Catch:{ Throwable -> 0x00c3 }
            if (r7 != r4) goto L_0x0096
            r7 = 2
            goto L_0x00b3
        L_0x0096:
            if (r7 == r10) goto L_0x00b3
            goto L_0x00b2
        L_0x0099:
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r9 = r8.getStatistics()     // Catch:{ Throwable -> 0x00c3 }
            java.lang.String r10 = "aweme.statistics"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)     // Catch:{ Throwable -> 0x00c3 }
            int r9 = r9.getLoseCount()     // Catch:{ Throwable -> 0x00c3 }
            if (r9 != r5) goto L_0x00b3
            java.lang.String r9 = r8.getAid()     // Catch:{ Throwable -> 0x00c3 }
            r0.append(r9)     // Catch:{ Throwable -> 0x00c3 }
            r0.append(r1)     // Catch:{ Throwable -> 0x00c3 }
        L_0x00b2:
            r7 = 3
        L_0x00b3:
            java.lang.String r8 = r8.getAid()     // Catch:{ Throwable -> 0x00c3 }
            java.lang.String r9 = "aweme.aid"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)     // Catch:{ Throwable -> 0x00c3 }
            m91694a(r8)     // Catch:{ Throwable -> 0x00c3 }
        L_0x00bf:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x00c3:
            r13 = move-exception
            goto L_0x00c7
        L_0x00c5:
            r13 = move-exception
            r7 = -1
        L_0x00c7:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r13)
            java.lang.Exception r1 = (java.lang.Exception) r1
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r1)
        L_0x00d1:
            if (r7 == r4) goto L_0x0103
            int r13 = r0.length()
            int r13 = r13 - r5
            r0.deleteCharAt(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = "aids.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r13, r0)
            java.lang.String r0 = "FeedBackupHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "FeedBackupHelper start to process:"
            r1.<init>(r3)
            r1.append(r7)
            r3 = 44
            r1.append(r3)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r0, r1)
            m91695a(r13, r7)
            return
        L_0x0103:
            java.lang.String r13 = "FeedBackupHelper"
            java.lang.String r0 = "FeedBackupHelper process done, no need to process!"
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1225a.C28061a.m91696a(java.util.List):void");
    }

    /* renamed from: a */
    private static final void m91692a(Aweme aweme, AwemeStatisticsBackup awemeStatisticsBackup) {
        if (aweme.getStatistics() == null) {
            aweme.setStatistics(new AwemeStatistics());
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            statistics.setAid(awemeStatisticsBackup.getAid());
            Integer commentCount = awemeStatisticsBackup.getCommentCount();
            if (commentCount == null) {
                C7573i.m23580a();
            }
            if (commentCount.intValue() > 0) {
                Integer commentCount2 = awemeStatisticsBackup.getCommentCount();
                if (commentCount2 == null) {
                    C7573i.m23580a();
                }
                statistics.setCommentCount(commentCount2.intValue());
            }
            Integer diggCount = awemeStatisticsBackup.getDiggCount();
            if (diggCount == null) {
                C7573i.m23580a();
            }
            if (diggCount.intValue() > 0) {
                Integer diggCount2 = awemeStatisticsBackup.getDiggCount();
                if (diggCount2 == null) {
                    C7573i.m23580a();
                }
                statistics.setDiggCount(diggCount2.intValue());
            }
            Integer playCount = awemeStatisticsBackup.getPlayCount();
            if (playCount == null) {
                C7573i.m23580a();
            }
            if (playCount.intValue() > 0) {
                Integer playCount2 = awemeStatisticsBackup.getPlayCount();
                if (playCount2 == null) {
                    C7573i.m23580a();
                }
                statistics.setPlayCount(playCount2.intValue());
            }
            Integer downloadCount = awemeStatisticsBackup.getDownloadCount();
            if (downloadCount == null) {
                C7573i.m23580a();
            }
            if (downloadCount.intValue() > 0) {
                Integer downloadCount2 = awemeStatisticsBackup.getDownloadCount();
                if (downloadCount2 == null) {
                    C7573i.m23580a();
                }
                statistics.setDownloadCount(downloadCount2.intValue());
            }
            Integer shareCount = awemeStatisticsBackup.getShareCount();
            if (shareCount == null) {
                C7573i.m23580a();
            }
            if (shareCount.intValue() > 0) {
                Integer shareCount2 = awemeStatisticsBackup.getShareCount();
                if (shareCount2 == null) {
                    C7573i.m23580a();
                }
                statistics.setShareCount(shareCount2.intValue());
            }
            Integer forwardCount = awemeStatisticsBackup.getForwardCount();
            if (forwardCount == null) {
                C7573i.m23580a();
            }
            if (forwardCount.intValue() > 0) {
                Integer forwardCount2 = awemeStatisticsBackup.getForwardCount();
                if (forwardCount2 == null) {
                    C7573i.m23580a();
                }
                statistics.setForwardCount(forwardCount2.intValue());
            }
        }
    }

    /* renamed from: a */
    private static void m91693a(AwemeStatisticsBackup awemeStatisticsBackup, int i) {
        if (awemeStatisticsBackup != null) {
            String aid = awemeStatisticsBackup.getAid();
            Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(aid);
            if (awemeById == null) {
                StringBuilder sb = new StringBuilder("FeedBackupHelper find that aweme is null!");
                sb.append(aid);
                C6921a.m21552a(4, "FeedBackupHelper", sb.toString());
                return;
            }
            StringBuilder sb2 = new StringBuilder("FeedBackupHelper start to update this aweme:");
            sb2.append(awemeStatisticsBackup);
            C6921a.m21552a(4, "FeedBackupHelper", sb2.toString());
            if (i == 2) {
                if (awemeById.getStatistics() == null) {
                    awemeById.setStatistics(new AwemeStatistics());
                }
                Integer commentCount = awemeStatisticsBackup.getCommentCount();
                if (commentCount == null) {
                    C7573i.m23580a();
                }
                if (commentCount.intValue() > 0) {
                    AwemeStatistics statistics = awemeById.getStatistics();
                    C7573i.m23582a((Object) statistics, "aweme.statistics");
                    statistics.setAid(aid);
                    AwemeStatistics statistics2 = awemeById.getStatistics();
                    C7573i.m23582a((Object) statistics2, "aweme.statistics");
                    Integer commentCount2 = awemeStatisticsBackup.getCommentCount();
                    if (commentCount2 == null) {
                        C7573i.m23580a();
                    }
                    statistics2.setCommentCount(commentCount2.intValue());
                }
            } else if (i == 3 || i == 1) {
                m91692a(awemeById, awemeStatisticsBackup);
            }
        }
    }

    /* renamed from: a */
    private static void m91695a(String str, int i) {
        C7573i.m23587b(str, "aids");
        try {
            AwemeStatisticsResponse a = BackUpApi.m92733a(str, i);
            List statisticsList = a.getStatisticsList();
            if (statisticsList != null) {
                Iterator it = C7525m.m23462a((Collection<?>) statisticsList).iterator();
                while (it.hasNext()) {
                    m91693a((AwemeStatisticsBackup) statisticsList.get(((C7506ac) it).mo19392a()), i);
                }
            }
            if (statisticsList == null) {
                StringBuilder sb = new StringBuilder("FeedBackupHelper get rsp,but list is null. rsp content :");
                sb.append(a);
                C6921a.m21552a(4, "FeedBackupHelper", sb.toString());
                return;
            }
            Iterable iterable = statisticsList;
            Map linkedHashMap = new LinkedHashMap(C7551d.m23566c(C7507ae.m23386a(C7525m.m23469a(iterable, 10)), 16));
            for (Object next : iterable) {
                linkedHashMap.put(((AwemeStatisticsBackup) next).getAid(), (AwemeStatisticsBackup) next);
            }
            C42961az.m136380a(new C28319b(linkedHashMap, i));
        } catch (ExecutionException e) {
            C6921a.m21554a((Exception) C22838j.m75277a(e));
        }
    }
}
