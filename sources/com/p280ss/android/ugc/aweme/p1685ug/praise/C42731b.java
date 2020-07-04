package com.p280ss.android.ugc.aweme.p1685ug.praise;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.LikePraiseDialogInfo;
import com.p280ss.android.ugc.aweme.main.C32989dk;
import com.p280ss.android.ugc.aweme.p1685ug.abtest.experiment.PraiseDialogExperiment;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ug.praise.b */
public final class C42731b {

    /* renamed from: a */
    public static final C42731b f111033a = new C42731b();

    /* renamed from: b */
    private static boolean f111034b;

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b$a */
    static final class C42732a<TTaskResult, TContinuationResult> implements C1591g<Void, Boolean> {

        /* renamed from: a */
        final /* synthetic */ Context f111035a;

        C42732a(Context context) {
            this.f111035a = context;
        }

        /* renamed from: a */
        private boolean m135652a(C1592h<Void> hVar) {
            return C42731b.f111033a.mo104339c(this.f111035a);
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            return Boolean.valueOf(m135652a(hVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b$b */
    static final class C42733b<TTaskResult, TContinuationResult> implements C1591g<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ Context f111036a;

        C42733b(Context context) {
            this.f111036a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Boolean> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            Boolean bool = (Boolean) hVar.mo6890e();
            C7573i.m23582a((Object) bool, "shouldShow");
            if (bool.booleanValue()) {
                Context context = this.f111036a;
                if (context == null) {
                    C7573i.m23580a();
                }
                new PraiseGuideDialog(context, true).show();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b$c */
    static final class C42734c<TTaskResult, TContinuationResult> implements C1591g<Void, Boolean> {

        /* renamed from: a */
        final /* synthetic */ Context f111037a;

        C42734c(Context context) {
            this.f111037a = context;
        }

        /* renamed from: a */
        private boolean m135654a(C1592h<Void> hVar) {
            return C42731b.f111033a.mo104340d(this.f111037a);
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            return Boolean.valueOf(m135654a(hVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b$d */
    static final class C42735d<TTaskResult, TContinuationResult> implements C1591g<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ Context f111038a;

        C42735d(Context context) {
            this.f111038a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Boolean> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            Boolean bool = (Boolean) hVar.mo6890e();
            C7573i.m23582a((Object) bool, "shouldShow");
            if (bool.booleanValue()) {
                Context context = this.f111038a;
                if (context == null) {
                    C7573i.m23580a();
                }
                new PraiseGuideDialog(context, false).show();
            }
            return null;
        }
    }

    private C42731b() {
    }

    /* renamed from: a */
    private static boolean m135643a() {
        if (C32989dk.m106640a() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m135642a(boolean z) {
        if (z) {
            f111034b = true;
            C42727a.m135637a(false, "进入点赞列表，条件满足");
            return;
        }
        C42727a.m135637a(false, "进入点赞列表，但点赞条件不满足");
    }

    /* renamed from: e */
    private static boolean m135648e(Context context) {
        if (context == null || ((context instanceof Activity) && ((Activity) context).isFinishing())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m135640a(int i) {
        int i2;
        if (C6399b.m19945u()) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            LikePraiseDialogInfo likePraiseDialogInfo = a.getLikePraiseDialogInfo();
            C7573i.m23582a((Object) likePraiseDialogInfo, "SettingsReader.get().likePraiseDialogInfo");
            Integer newLikeNum = likePraiseDialogInfo.getNewLikeNum();
            C7573i.m23582a((Object) newLikeNum, "SettingsReader.get().lik…aiseDialogInfo.newLikeNum");
            i2 = newLikeNum.intValue();
        } catch (NullValueException unused) {
        }
        if (i >= i2) {
            f111034b = true;
            C42727a.m135637a(false, "进入点赞列表，条件满足");
            return;
        }
        C42727a.m135637a(false, "进入点赞列表，但点赞条件不满足");
    }

    /* renamed from: b */
    public static void m135645b(Context context) {
        if (f111034b) {
            f111034b = false;
            C1592h.m7848a(300).mo6876a((C1591g<TResult, TContinuationResult>) new C42734c<TResult,TContinuationResult>(context), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C42735d<TResult,TContinuationResult>(context), C1592h.f5958b);
            return;
        }
        C42727a.f111027a.mo104335b(false, "点赞条件未满足或非从点赞列表返回");
    }

    /* renamed from: c */
    private static boolean m135647c(boolean z) {
        int a = C6384b.m19835a().mo15287a(PraiseDialogExperiment.class, true, "praise_dialog_experiment", C6384b.m19835a().mo15295d().praise_dialog_experiment, 0);
        if (a == 1) {
            return true;
        }
        if (z) {
            if (a == 0) {
                return true;
            }
            return false;
        } else if (a == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m135649f(Context context) {
        C42736c cVar = new C42736c(true);
        if (cVar.f111044e == 0) {
            cVar.mo104345b(System.currentTimeMillis());
        }
        if (System.currentTimeMillis() - cVar.f111044e >= TimeUnit.DAYS.toMillis(7)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo104340d(Context context) {
        if (!m135644a(context, false)) {
            return false;
        }
        C42736c cVar = new C42736c(false);
        if (cVar.f111041b || cVar.f111042c) {
            C42727a.f111027a.mo104335b(false, "曾点过点赞后弹窗反馈或提交按钮");
            return false;
        } else if (!new C42736c(true).f111042c) {
            return true;
        } else {
            C42727a.f111027a.mo104335b(false, "曾点过活跃度弹窗提交按钮");
            return false;
        }
    }

    /* renamed from: a */
    public static void m135641a(Context context) {
        C1592h.m7848a(300).mo6876a((C1591g<TResult, TContinuationResult>) new C42732a<TResult,TContinuationResult>(context), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C42733b<TResult,TContinuationResult>(context), C1592h.f5958b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3.intValue() != 0) goto L_0x0027;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m135646b(boolean r3) {
        /*
            r2 = this;
            boolean r3 = m135647c(r3)
            r0 = 0
            if (r3 != 0) goto L_0x0008
            return r0
        L_0x0008:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r3 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ NullValueException -> 0x0029 }
            java.lang.String r1 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r1)     // Catch:{ NullValueException -> 0x0029 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage r3 = r3.getAppStoreScore()     // Catch:{ NullValueException -> 0x0029 }
            java.lang.String r1 = "SettingsReader.get().appStoreScore"
            kotlin.jvm.internal.C7573i.m23582a(r3, r1)     // Catch:{ NullValueException -> 0x0029 }
            java.lang.Integer r3 = r3.getSwitcher()     // Catch:{ NullValueException -> 0x0029 }
            if (r3 != 0) goto L_0x0021
            goto L_0x0027
        L_0x0021:
            int r3 = r3.intValue()     // Catch:{ NullValueException -> 0x0029 }
            if (r3 == 0) goto L_0x0029
        L_0x0027:
            r3 = 1
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1685ug.praise.C42731b.m135646b(boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo104339c(android.content.Context r8) {
        /*
            r7 = this;
            r0 = 1
            boolean r1 = r7.m135644a(r8, r0)
            r2 = 0
            if (r1 != 0) goto L_0x0009
            return r2
        L_0x0009:
            boolean r1 = m135643a()
            if (r1 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.ug.praise.a r8 = com.p280ss.android.ugc.aweme.p1685ug.praise.C42727a.f111027a
            java.lang.String r1 = "其他弹窗在展示"
            r8.mo104335b(r0, r1)
            return r2
        L_0x0017:
            com.ss.android.ugc.aweme.ug.praise.c r1 = new com.ss.android.ugc.aweme.ug.praise.c
            r1.<init>(r0)
            boolean r3 = r1.f111041b
            if (r3 != 0) goto L_0x00aa
            boolean r1 = r1.f111042c
            if (r1 == 0) goto L_0x0026
            goto L_0x00aa
        L_0x0026:
            com.ss.android.ugc.aweme.ug.praise.c r1 = new com.ss.android.ugc.aweme.ug.praise.c
            r1.<init>(r2)
            boolean r3 = r1.f111041b
            if (r3 != 0) goto L_0x00a2
            boolean r1 = r1.f111042c
            if (r1 == 0) goto L_0x0034
            goto L_0x00a2
        L_0x0034:
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19945u()
            if (r1 == 0) goto L_0x003c
            r1 = 7
            goto L_0x003d
        L_0x003c:
            r1 = 5
        L_0x003d:
            boolean r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19945u()
            if (r3 == 0) goto L_0x0045
            r3 = 1
            goto L_0x0046
        L_0x0045:
            r3 = 3
        L_0x0046:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r4 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ NullValueException -> 0x0073 }
            java.lang.String r5 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)     // Catch:{ NullValueException -> 0x0073 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage r4 = r4.getAppStoreScore()     // Catch:{ NullValueException -> 0x0073 }
            java.lang.String r5 = "message"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)     // Catch:{ NullValueException -> 0x0073 }
            java.lang.Integer r5 = r4.getSection()     // Catch:{ NullValueException -> 0x0073 }
            java.lang.String r6 = "message.section"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)     // Catch:{ NullValueException -> 0x0073 }
            int r5 = r5.intValue()     // Catch:{ NullValueException -> 0x0073 }
            java.lang.Integer r1 = r4.getThreshold()     // Catch:{ NullValueException -> 0x0074 }
            java.lang.String r4 = "message.threshold"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)     // Catch:{ NullValueException -> 0x0074 }
            int r1 = r1.intValue()     // Catch:{ NullValueException -> 0x0074 }
            goto L_0x0075
        L_0x0073:
            r5 = r1
        L_0x0074:
            r1 = r3
        L_0x0075:
            if (r8 != 0) goto L_0x007a
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x007a:
            boolean r8 = com.p280ss.android.ugc.aweme.main.guide.C33040a.m106710a(r8, r5, r1, r0)
            if (r8 != 0) goto L_0x00a1
            com.ss.android.ugc.aweme.ug.praise.a r8 = com.p280ss.android.ugc.aweme.p1685ug.praise.C42727a.f111027a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "不满足 "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r4 = " 天内 "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " 天活跃"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r8.mo104335b(r0, r1)
            return r2
        L_0x00a1:
            return r0
        L_0x00a2:
            com.ss.android.ugc.aweme.ug.praise.a r8 = com.p280ss.android.ugc.aweme.p1685ug.praise.C42727a.f111027a
            java.lang.String r1 = "曾点过点赞后弹窗反馈或提交按钮"
            r8.mo104335b(r0, r1)
            return r2
        L_0x00aa:
            com.ss.android.ugc.aweme.ug.praise.a r8 = com.p280ss.android.ugc.aweme.p1685ug.praise.C42727a.f111027a
            java.lang.String r1 = "曾点过活跃度弹窗反馈或提交按钮"
            r8.mo104335b(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1685ug.praise.C42731b.mo104339c(android.content.Context):boolean");
    }

    /* renamed from: a */
    private final boolean m135644a(Context context, boolean z) {
        if (!m135648e(context)) {
            C42727a.f111027a.mo104335b(z, "context 不可用");
            return false;
        } else if (!m135646b(z)) {
            C42727a aVar = C42727a.f111027a;
            StringBuilder sb = new StringBuilder("开关未打开，当前AB：");
            sb.append(C6384b.m19835a().mo15287a(PraiseDialogExperiment.class, true, "praise_dialog_experiment", C6384b.m19835a().mo15295d().praise_dialog_experiment, 0));
            aVar.mo104335b(z, sb.toString());
            return false;
        } else {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (!f.isLogin()) {
                C42727a.f111027a.mo104335b(z, "未登录");
                return false;
            }
            C42736c cVar = new C42736c(z);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - cVar.f111040a < TimeUnit.DAYS.toMillis(14)) {
                C42727a.f111027a.mo104335b(z, "14天内曾出现过");
                return false;
            } else if (!m135649f(context)) {
                C42727a.f111027a.mo104335b(true, "安装时间小于7天");
                return false;
            } else {
                if (TextUtils.equals(String.valueOf(C6399b.m19933i()), cVar.f111043d)) {
                    C42727a.f111027a.mo104335b(z, "这个版本展示过");
                    return false;
                }
                C42736c cVar2 = new C42736c(!z);
                long j = 48;
                try {
                    IESSettingsProxy a = C30199h.m98861a();
                    C7573i.m23582a((Object) a, "SettingsReader.get()");
                    LikePraiseDialogInfo likePraiseDialogInfo = a.getLikePraiseDialogInfo();
                    C7573i.m23582a((Object) likePraiseDialogInfo, "SettingsReader.get().likePraiseDialogInfo");
                    j = (long) likePraiseDialogInfo.getTwoDialogInterval().intValue();
                } catch (NullValueException unused) {
                }
                if (cVar2.f111040a == 0 || Math.abs(currentTimeMillis - cVar2.f111040a) >= TimeUnit.HOURS.toMillis(j)) {
                    return true;
                }
                C42727a aVar2 = C42727a.f111027a;
                StringBuilder sb2 = new StringBuilder("两个弹窗需间隔");
                sb2.append(j);
                sb2.append("小时");
                aVar2.mo104335b(z, sb2.toString());
                return false;
            }
        }
    }
}
