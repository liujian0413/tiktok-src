package com.p280ss.android.ugc.aweme.money.growth;

import android.text.TextUtils;
import com.bytedance.ies.NullValueException;
import com.bytedance.p073ad.symphony.util.C2203f;
import com.bytedance.polaris.depend.C12428i;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p280ss.android.ugc.aweme.legoImp.task.PolarisInitTask;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.money.growth.e */
public final class C33639e {

    /* renamed from: b */
    public static final C33639e f87791b = C33641b.m108572a();

    /* renamed from: c */
    public static final C33640a f87792c = new C33640a(null);

    /* renamed from: a */
    public final C33637d f87793a;

    /* renamed from: d */
    private List<UgActivityTasks> f87794d;

    /* renamed from: e */
    private boolean f87795e;

    /* renamed from: f */
    private long f87796f;

    /* renamed from: g */
    private boolean f87797g;

    /* renamed from: h */
    private long f87798h;

    /* renamed from: com.ss.android.ugc.aweme.money.growth.e$a */
    public static final class C33640a {
        private C33640a() {
        }

        /* renamed from: a */
        public static C33639e m108571a() {
            return C33639e.f87791b;
        }

        public /* synthetic */ C33640a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.e$b */
    static final class C33641b {

        /* renamed from: a */
        public static final C33641b f87799a = new C33641b();

        /* renamed from: b */
        private static final C33639e f87800b = new C33639e(null);

        private C33641b() {
        }

        /* renamed from: a */
        public static C33639e m108572a() {
            return f87800b;
        }
    }

    /* renamed from: a */
    private static long m108559a() {
        return System.currentTimeMillis() / 1000;
    }

    private C33639e() {
        this.f87793a = new C33637d();
    }

    /* renamed from: b */
    private final void m108562b() {
        m108560a("onRenderFirstFrame");
        this.f87795e = true;
        this.f87796f = m108559a();
    }

    /* renamed from: c */
    private final void m108565c() {
        StringBuilder sb = new StringBuilder("onPlayCompleted, videoIsPlay:");
        sb.append(this.f87795e);
        m108560a(sb.toString());
        if (this.f87795e) {
            long a = m108559a();
            m108563b(a - this.f87796f);
            this.f87795e = true;
            this.f87796f = a;
        }
    }

    /* renamed from: f */
    private final void m108568f() {
        long a = m108559a();
        if (this.f87793a.f87788a <= 0) {
            m108560a("初始化时间记录");
            mo86023a(a);
            return;
        }
        if (a < this.f87793a.f87788a || a > this.f87793a.f87788a + TimeUnit.DAYS.toSeconds(1)) {
            mo86023a(a);
            m108560a("不是同一天，重置时间记录");
        }
    }

    /* renamed from: e */
    private final boolean m108567e() {
        List<UgActivityTasks> list;
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin()) {
            m108560a("未登录，不累计阅读数");
            return false;
        }
        try {
            IESSettingsProxy a2 = C30199h.m98861a();
            C7573i.m23582a((Object) a2, "SettingsReader.get()");
            UgAwemeActivitySetting awemeActivitySetting = a2.getAwemeActivitySetting();
            if (awemeActivitySetting != null) {
                list = awemeActivitySetting.getActivityTasks();
            } else {
                list = null;
            }
            this.f87794d = list;
            if (C2203f.m9514a(this.f87794d)) {
                m108560a("task为空，，不累计阅读数");
                return false;
            }
            List<UgActivityTasks> list2 = this.f87794d;
            if (list2 != null) {
                for (UgActivityTasks taskType : list2) {
                    Integer taskType2 = taskType.getTaskType();
                    if (taskType2 != null) {
                        if (taskType2.intValue() == 1) {
                            return true;
                        }
                    }
                }
            }
            m108560a("未发现阅读任务，不累计阅读数");
            return false;
        } catch (NullValueException unused) {
            m108560a("setting数据为空，不累计阅读数");
            return false;
        }
    }

    /* renamed from: d */
    private final void m108566d() {
        List<UgActivityTasks> list;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            UgAwemeActivitySetting awemeActivitySetting = a.getAwemeActivitySetting();
            if (awemeActivitySetting != null) {
                list = awemeActivitySetting.getActivityTasks();
            } else {
                list = null;
            }
            this.f87794d = list;
            if (!C2203f.m9514a(this.f87794d)) {
                List<UgActivityTasks> list2 = this.f87794d;
                if (list2 != null) {
                    for (UgActivityTasks ugActivityTasks : list2) {
                        Integer taskType = ugActivityTasks.getTaskType();
                        if (taskType != null) {
                            if (taskType.intValue() == 1) {
                                long j = this.f87793a.f87789b;
                                Long time = ugActivityTasks.getTime();
                                C7573i.m23582a((Object) time, "it.time");
                                if (j > time.longValue() && !TextUtils.isEmpty(ugActivityTasks.getTaskId())) {
                                    PolarisInitTask.ensuareInit();
                                    StringBuilder sb = new StringBuilder("上报阅读任务完成，已阅读时长: ");
                                    sb.append(this.f87793a.f87789b);
                                    sb.append("  任务id:");
                                    sb.append(ugActivityTasks.getTaskId());
                                    sb.append("  taskType :");
                                    sb.append(ugActivityTasks.getTaskType());
                                    sb.append("  time: ");
                                    sb.append(ugActivityTasks.getTime());
                                    m108560a(sb.toString());
                                    C12428i.m36147a(ugActivityTasks.getTaskId(), null, (JSONObject) null);
                                }
                            }
                        }
                    }
                }
            }
        } catch (NullValueException unused) {
        }
    }

    public /* synthetic */ C33639e(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    private static void m108560a(String str) {
        C33633c.m108533b(str);
    }

    /* renamed from: a */
    private final void m108561a(boolean z) {
        if (z) {
            m108560a("Ad onResumePlay");
            this.f87797g = true;
            this.f87798h = m108559a();
            return;
        }
        m108560a("onResumePlay");
        this.f87795e = true;
        this.f87796f = m108559a();
    }

    /* renamed from: b */
    private final void m108563b(long j) {
        if (m108567e()) {
            m108568f();
            if (j > TimeUnit.MINUTES.toSeconds(15)) {
                C33637d dVar = this.f87793a;
                dVar.mo86021b(dVar.f87789b + TimeUnit.MINUTES.toSeconds(1));
            } else if (j < 0) {
                C33637d dVar2 = this.f87793a;
                dVar2.mo86021b(dVar2.f87789b + TimeUnit.SECONDS.toSeconds(5));
            } else {
                C33637d dVar3 = this.f87793a;
                dVar3.mo86021b(dVar3.f87789b + j);
            }
            StringBuilder sb = new StringBuilder("已播放： ");
            sb.append(this.f87793a.f87789b);
            m108560a(sb.toString());
            m108566d();
        }
    }

    /* renamed from: a */
    public final void mo86023a(long j) {
        StringBuilder sb = new StringBuilder("resetKevaData, now:");
        sb.append(j);
        m108560a(sb.toString());
        Calendar instance = Calendar.getInstance();
        C7573i.m23582a((Object) instance, "c");
        instance.setTimeInMillis(j * 1000);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        this.f87793a.mo86020a(instance.getTimeInMillis() / 1000);
        this.f87793a.mo86021b(0);
    }

    /* renamed from: b */
    private final void m108564b(boolean z) {
        if (z) {
            StringBuilder sb = new StringBuilder("Ad onPausePlay, videoIsPlay:");
            sb.append(this.f87797g);
            m108560a(sb.toString());
            if (this.f87797g) {
                long a = m108559a();
                m108563b(a - this.f87798h);
                this.f87797g = false;
                this.f87798h = a;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("onPausePlay, videoIsPlay:");
            sb2.append(this.f87795e);
            m108560a(sb2.toString());
            if (this.f87795e) {
                long a2 = m108559a();
                m108563b(a2 - this.f87796f);
                this.f87795e = false;
                this.f87796f = a2;
            }
        }
    }

    /* renamed from: a */
    public final void mo86022a(int i, boolean z) {
        if (i == 7) {
            m108565c();
        } else if (i != 9) {
            switch (i) {
                case 3:
                    m108561a(z);
                    return;
                case 4:
                    m108564b(z);
                    break;
            }
        } else {
            m108562b();
        }
    }
}
