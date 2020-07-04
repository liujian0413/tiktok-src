package com.p280ss.android.ugc.aweme.setting;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.android.play.core.install.C17093a;
import com.google.android.play.core.install.C17094b;
import com.google.android.play.core.p766a.C17081a;
import com.google.android.play.core.p766a.C17082b;
import com.google.android.play.core.p766a.C17083c;
import com.google.android.play.core.tasks.C17146b;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FlexibleUpdateStrategy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.share.C38275x;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.ad */
public final class C37543ad {

    /* renamed from: a */
    public static C17081a f97927a;

    /* renamed from: b */
    public static boolean f97928b;

    /* renamed from: c */
    public static C17082b f97929c;

    /* renamed from: d */
    public static C17094b f97930d;

    /* renamed from: e */
    public static boolean f97931e;

    /* renamed from: f */
    public static long f97932f;

    /* renamed from: g */
    public static final C37544a f97933g = new C37544a(null);

    /* renamed from: com.ss.android.ugc.aweme.setting.ad$a */
    public static final class C37544a {

        /* renamed from: com.ss.android.ugc.aweme.setting.ad$a$a */
        static final class C37545a<TResult> implements C17146b<C17081a> {

            /* renamed from: a */
            final /* synthetic */ boolean f97934a;

            /* renamed from: b */
            final /* synthetic */ Activity f97935b;

            C37545a(boolean z, Activity activity) {
                this.f97934a = z;
                this.f97935b = activity;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo24986a(C17081a aVar) {
                if (!this.f97934a) {
                    C6887b.m21436b().mo16899a(C6399b.m19921a(), "KEY_LAST_CHECK_UPDATE_TIME", System.currentTimeMillis());
                }
                C7573i.m23582a((Object) aVar, "appUpdateInfo");
                C37543ad.f97927a = aVar;
                if (aVar == null) {
                    C7573i.m23583a("mAppUpdateInfo");
                }
                if (aVar.f47775c == 2) {
                    C17081a aVar2 = C37543ad.f97927a;
                    if (aVar2 == null) {
                        C7573i.m23583a("mAppUpdateInfo");
                    }
                    if (aVar2.mo44322b(0)) {
                        C37544a.m120273a("app_update_toast_show");
                        if (!this.f97934a) {
                            C6887b.m21436b().mo16898a(C6399b.m19921a(), "KEY_SHOW_UPDATE_TIMES", C6887b.m21436b().mo16903b(C6399b.m19921a(), "KEY_SHOW_UPDATE_TIMES", 0) + 1);
                        }
                        C6887b.m21436b().mo16902a(C6399b.m19921a(), "KEY_UPDATE_IN_PROGRESS", true);
                        C17082b bVar = C37543ad.f97929c;
                        if (bVar != null) {
                            C17081a aVar3 = C37543ad.f97927a;
                            if (aVar3 == null) {
                                C7573i.m23583a("mAppUpdateInfo");
                            }
                            bVar.mo44325a(aVar3, 0, this.f97935b, 19);
                        }
                    }
                } else {
                    C17081a aVar4 = C37543ad.f97927a;
                    if (aVar4 == null) {
                        C7573i.m23583a("mAppUpdateInfo");
                    }
                    if (aVar4.f47775c == 3) {
                        if (!this.f97934a) {
                            C6887b.m21436b().mo16898a(C6399b.m19921a(), "KEY_SHOW_UPDATE_TIMES", C6887b.m21436b().mo16903b(C6399b.m19921a(), "KEY_SHOW_UPDATE_TIMES", 0) + 1);
                        }
                        if (!C6887b.m21436b().mo16909b(C6399b.m19921a(), "KEY_DOWNLOADED_FOR_UPDATE", false)) {
                            if (this.f97934a) {
                                C10761a.m31409e((Context) this.f97935b, (int) R.string.ij).mo25750a();
                            }
                            C17082b bVar2 = C37543ad.f97929c;
                            if (bVar2 != null) {
                                C17081a aVar5 = C37543ad.f97927a;
                                if (aVar5 == null) {
                                    C7573i.m23583a("mAppUpdateInfo");
                                }
                                bVar2.mo44325a(aVar5, 0, this.f97935b, 19);
                            }
                        } else if (this.f97935b.isFinishing()) {
                            C42961az.m136380a(new C37552ae());
                        } else {
                            Dialog b = C37544a.m120275b(this.f97935b);
                            if (!b.isShowing()) {
                                b.show();
                            }
                        }
                    } else {
                        if (this.f97934a) {
                            C10761a.m31409e((Context) this.f97935b, (int) R.string.byl).mo25750a();
                        }
                        C17082b bVar3 = C37543ad.f97929c;
                        if (bVar3 != null) {
                            bVar3.mo44327b(C37543ad.f97930d);
                        }
                    }
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.ad$a$b */
        static final class C37546b implements OnClickListener {

            /* renamed from: a */
            public static final C37546b f97936a = new C37546b();

            C37546b() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C37544a.m120273a("app_update_install");
                C17082b bVar = C37543ad.f97929c;
                if (bVar != null) {
                    bVar.mo44326b();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.ad$a$c */
        static final class C37547c implements OnClickListener {

            /* renamed from: a */
            public static final C37547c f97937a = new C37547c();

            C37547c() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C17082b bVar = C37543ad.f97929c;
                if (bVar != null) {
                    bVar.mo44327b(C37543ad.f97930d);
                }
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.ad$a$d */
        static final class C37548d implements C17094b {

            /* renamed from: a */
            final /* synthetic */ String f97938a;

            /* renamed from: b */
            final /* synthetic */ Activity f97939b;

            C37548d(String str, Activity activity) {
                this.f97938a = str;
                this.f97939b = activity;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15871a(C17093a aVar) {
                if (aVar.f47799a == 11) {
                    C6887b.m21436b().mo16902a(C6399b.m19921a(), "KEY_DOWNLOADED_FOR_UPDATE", true);
                    C6887b.m21436b().mo16902a(C6399b.m19921a(), "KEY_UPDATE_IN_PROGRESS", false);
                    C37544a.m120273a("app_update_download_finish");
                    if (!TextUtils.isEmpty(this.f97938a)) {
                        C38275x.m122279e(this.f97939b, this.f97938a);
                    }
                    AwemeAppData a = AwemeAppData.m65765a();
                    C7573i.m23582a((Object) a, "AwemeAppData.inst()");
                    if (a.f60330j) {
                        C17082b bVar = C37543ad.f97929c;
                        if (bVar != null) {
                            bVar.mo44326b();
                        }
                    } else if (!C37543ad.f97931e) {
                        C37543ad.f97931e = true;
                        if (this.f97939b.isFinishing()) {
                            C42961az.m136380a(new C37552ae());
                            return;
                        }
                        Dialog b = C37544a.m120275b(this.f97939b);
                        if (!b.isShowing()) {
                            b.show();
                        }
                    }
                }
            }
        }

        private C37544a() {
        }

        /* renamed from: a */
        private static boolean m120274a() {
            int i;
            int i2;
            int b = C6887b.m21436b().mo16903b(C6399b.m19921a(), "KEY_CURRENT_VERSIONCODE_FOR_UPDATE", 0);
            AwemeAppData a = AwemeAppData.m65765a();
            C7573i.m23582a((Object) a, "AwemeAppData.inst()");
            if (b != a.mo53437c()) {
                AwemeAppData a2 = AwemeAppData.m65765a();
                C7573i.m23582a((Object) a2, "AwemeAppData.inst()");
                C6887b.m21436b().mo16898a(C6399b.m19921a(), "KEY_CURRENT_VERSIONCODE_FOR_UPDATE", a2.mo53437c());
                C6887b.m21436b().mo16899a(C6399b.m19921a(), "KEY_LAST_CHECK_UPDATE_TIME", 0);
                C6887b.m21436b().mo16898a(C6399b.m19921a(), "KEY_SHOW_UPDATE_TIMES", 0);
                C6887b.m21436b().mo16902a(C6399b.m19921a(), "KEY_DOWNLOADED_FOR_UPDATE", false);
                C6887b.m21436b().mo16902a(C6399b.m19921a(), "KEY_UPDATE_IN_PROGRESS", false);
            }
            int b2 = C6887b.m21436b().mo16903b(C6399b.m19921a(), "KEY_SHOW_UPDATE_TIMES", 0);
            C37543ad.f97932f = C6887b.m21436b().mo16904b(C6399b.m19921a(), "KEY_LAST_CHECK_UPDATE_TIME", 0);
            try {
                IESSettingsProxy a3 = C30199h.m98861a();
                C7573i.m23582a((Object) a3, "SettingsReader.get()");
                FlexibleUpdateStrategy flexibleUpdateStrategy = a3.getFlexibleUpdateStrategy();
                C7573i.m23582a((Object) flexibleUpdateStrategy, "SettingsReader.get().flexibleUpdateStrategy");
                Integer allowShowAllTimes = flexibleUpdateStrategy.getAllowShowAllTimes();
                C7573i.m23582a((Object) allowShowAllTimes, "SettingsReader.get().fle…trategy.allowShowAllTimes");
                i2 = allowShowAllTimes.intValue();
                IESSettingsProxy a4 = C30199h.m98861a();
                C7573i.m23582a((Object) a4, "SettingsReader.get()");
                FlexibleUpdateStrategy flexibleUpdateStrategy2 = a4.getFlexibleUpdateStrategy();
                C7573i.m23582a((Object) flexibleUpdateStrategy2, "SettingsReader.get().flexibleUpdateStrategy");
                Integer intervalDays = flexibleUpdateStrategy2.getIntervalDays();
                C7573i.m23582a((Object) intervalDays, "SettingsReader.get().fle…dateStrategy.intervalDays");
                i = intervalDays.intValue();
            } catch (NullValueException unused) {
                i2 = 0;
                i = 0;
            }
            if (b2 >= i2 || System.currentTimeMillis() - C37543ad.f97932f < ((long) i) * 86400000) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C37544a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m120273a(String str) {
            C7573i.m23587b(str, "event");
            C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("type", "flexible").f60753a);
        }

        /* renamed from: b */
        public static Dialog m120275b(Activity activity) {
            C7573i.m23587b(activity, "activity");
            C10741a aVar = new C10741a(activity);
            aVar.mo25649a((int) R.string.bum).mo25660b(activity.getString(R.string.bul)).mo25650a((int) R.string.buh, (OnClickListener) C37546b.f97936a).mo25658b((int) R.string.cnm, (OnClickListener) C37547c.f97937a);
            Dialog b = aVar.mo25656a().mo25638b();
            b.setCanceledOnTouchOutside(false);
            C7573i.m23582a((Object) b, "dialog");
            return b;
        }

        /* renamed from: a */
        public final void mo94831a(Activity activity) {
            C7573i.m23587b(activity, "activity");
            if (VERSION.SDK_INT >= 21 && C6887b.m21436b().mo16909b(C6399b.m19921a(), "KEY_UPDATE_IN_PROGRESS", false)) {
                m120270a(activity, "");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static void m120270a(Activity activity, String str) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(str, "effectId");
            if (C37543ad.f97929c == null) {
                C37543ad.f97929c = C17083c.m56660a(activity.getApplicationContext());
            }
            C37543ad.f97930d = new C37548d(str, activity);
            C17082b bVar = C37543ad.f97929c;
            if (bVar != null) {
                bVar.mo44324a(C37543ad.f97930d);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
            if (r1.intValue() != 1) goto L_0x0088;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo94832a(android.app.Activity r4, boolean r5, java.lang.String r6) {
            /*
                r3 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.C7573i.m23587b(r4, r0)
                java.lang.String r0 = "effectId"
                kotlin.jvm.internal.C7573i.m23587b(r6, r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 21
                if (r0 >= r1) goto L_0x0011
                return
            L_0x0011:
                r0 = 1
                if (r5 != 0) goto L_0x0089
                boolean r1 = com.p280ss.android.ugc.aweme.setting.C37543ad.f97928b
                if (r1 != 0) goto L_0x0088
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()
                java.lang.String r2 = "SettingsReader.get()"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.Integer r1 = r1.getInappUpdateSwitchStrategy()
                if (r1 != 0) goto L_0x0028
                goto L_0x002f
            L_0x0028:
                int r1 = r1.intValue()
                r2 = 3
                if (r1 == r2) goto L_0x0046
            L_0x002f:
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()
                java.lang.String r2 = "SettingsReader.get()"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.Integer r1 = r1.getInappUpdateSwitchStrategy()
                if (r1 != 0) goto L_0x003f
                return
            L_0x003f:
                int r1 = r1.intValue()
                if (r1 == r0) goto L_0x0046
                goto L_0x0088
            L_0x0046:
                java.lang.Boolean r1 = com.p280ss.android.ugc.aweme.feed.C28580o.m93828a()
                java.lang.String r2 = "Feed0VVManagerUtils.isFirstInstallAndFirstLaunch()"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x0081
                com.ss.android.ugc.aweme.au.b r4 = com.p280ss.android.ugc.aweme.p307au.C6887b.m21436b()
                android.content.Context r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
                java.lang.String r6 = "KEY_LAST_CHECK_UPDATE_TIME"
                long r0 = java.lang.System.currentTimeMillis()
                r4.mo16899a(r5, r6, r0)
                com.ss.android.ugc.aweme.au.b r4 = com.p280ss.android.ugc.aweme.p307au.C6887b.m21436b()
                android.content.Context r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
                java.lang.String r6 = "KEY_CURRENT_VERSIONCODE_FOR_UPDATE"
                com.ss.android.ugc.aweme.app.AwemeAppData r0 = com.p280ss.android.ugc.aweme.app.AwemeAppData.m65765a()
                java.lang.String r1 = "AwemeAppData.inst()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                int r0 = r0.mo53437c()
                r4.mo16898a(r5, r6, r0)
                return
            L_0x0081:
                boolean r1 = m120274a()
                if (r1 != 0) goto L_0x0089
                return
            L_0x0088:
                return
            L_0x0089:
                com.p280ss.android.ugc.aweme.setting.C37543ad.f97928b = r0
                m120270a(r4, r6)
                com.google.android.play.core.a.b r6 = com.p280ss.android.ugc.aweme.setting.C37543ad.f97929c
                if (r6 == 0) goto L_0x0097
                com.google.android.play.core.tasks.c r6 = r6.mo44323a()
                goto L_0x0098
            L_0x0097:
                r6 = 0
            L_0x0098:
                if (r6 == 0) goto L_0x00a5
                com.ss.android.ugc.aweme.setting.ad$a$a r0 = new com.ss.android.ugc.aweme.setting.ad$a$a
                r0.<init>(r5, r4)
                com.google.android.play.core.tasks.b r0 = (com.google.android.play.core.tasks.C17146b) r0
                r6.mo44417a(r0)
                return
            L_0x00a5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.setting.C37543ad.C37544a.mo94832a(android.app.Activity, boolean, java.lang.String):void");
        }
    }

    /* renamed from: a */
    public static final void m120265a(Activity activity) {
        f97933g.mo94831a(activity);
    }

    /* renamed from: a */
    public static final void m120266a(Activity activity, boolean z) {
        f97933g.mo94832a(activity, z, "");
    }

    /* renamed from: a */
    public static final void m120267a(Activity activity, boolean z, String str) {
        f97933g.mo94832a(activity, z, str);
    }

    /* renamed from: a */
    public static final void m120268a(String str) {
        C37544a.m120273a(str);
    }

    /* renamed from: b */
    public static final Dialog m120269b(Activity activity) {
        return C37544a.m120275b(activity);
    }
}
