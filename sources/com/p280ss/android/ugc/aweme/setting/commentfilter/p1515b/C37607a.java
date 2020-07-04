package com.p280ss.android.ugc.aweme.setting.commentfilter.p1515b;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27870d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a.C37704a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.b.a */
public final class C37607a {

    /* renamed from: a */
    public static final C37608a f98067a = new C37608a(null);

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.b.a$a */
    public static final class C37608a implements C37704a {

        /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.b.a$a$a */
        static final class C37609a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C27870d f98068a;

            /* renamed from: b */
            final /* synthetic */ String f98069b;

            /* renamed from: c */
            final /* synthetic */ Activity f98070c;

            C37609a(C27870d dVar, String str, Activity activity) {
                this.f98068a = dVar;
                this.f98069b = str;
                this.f98070c = activity;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C27870d dVar = this.f98068a;
                StringBuilder sb = new StringBuilder("settings_times_");
                sb.append(this.f98069b);
                String sb2 = sb.toString();
                C27870d dVar2 = this.f98068a;
                StringBuilder sb3 = new StringBuilder("settings_times_");
                sb3.append(this.f98069b);
                String a = dVar2.mo71348a(sb3.toString(), "0");
                C7573i.m23582a((Object) a, "storage.get(SETTING_TIMES_KEY + uid, \"0\")");
                dVar.mo71352b(sb2, String.valueOf(Integer.parseInt(a) + 1));
                this.f98070c.startActivity(new Intent(this.f98070c, CommentFilterActivity.class));
                C6907h.m21524a("enter_filter_comment", (Map) new C22984d().mo59973a("enter_from", "comment_panel").f60753a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.b.a$a$b */
        static final class C37610b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C27870d f98071a;

            /* renamed from: b */
            final /* synthetic */ String f98072b;

            C37610b(C27870d dVar, String str) {
                this.f98071a = dVar;
                this.f98072b = str;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C27870d dVar = this.f98071a;
                StringBuilder sb = new StringBuilder("not_now_times_");
                sb.append(this.f98072b);
                String sb2 = sb.toString();
                C27870d dVar2 = this.f98071a;
                StringBuilder sb3 = new StringBuilder("not_now_times_");
                sb3.append(this.f98072b);
                String a = dVar2.mo71348a(sb3.toString(), "0");
                C7573i.m23582a((Object) a, "storage.get(NOT_NOW_TIMES_KEY + uid, \"0\")");
                dVar.mo71352b(sb2, String.valueOf(Integer.parseInt(a) + 1));
                dialogInterface.dismiss();
            }
        }

        private C37608a() {
        }

        /* renamed from: a */
        public final void mo59220a(Exception exc) {
            C7573i.m23587b(exc, "e");
        }

        public /* synthetic */ C37608a(C7571f fVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a6, code lost:
            if ((!kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2, (java.lang.Object) java.lang.Boolean.valueOf(r4.mo18712E()))) != false) goto L_0x00a8;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo59219a(com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b r7) {
            /*
                r6 = this;
                java.lang.String r0 = "settings"
                kotlin.jvm.internal.C7573i.m23587b(r7, r0)
                boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                if (r0 == 0) goto L_0x01cb
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
                java.lang.String r1 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                boolean r0 = r0.isLogin()
                if (r0 == 0) goto L_0x01cb
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
                java.lang.String r1 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                java.lang.String r0 = r0.getCurUserId()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x01cb
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
                java.lang.String r1 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                java.lang.String r0 = r0.getCurUserId()
                com.ss.android.ugc.aweme.fe.b.d r1 = com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27870d.m91297a()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "settings_times_"
                r2.<init>(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = ""
                java.lang.String r2 = r1.mo71348a(r2, r3)
                java.lang.String r3 = ""
                boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r2, r3)
                r3 = 0
                if (r2 != 0) goto L_0x00a8
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "not_now_times_"
                r2.<init>(r4)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r4 = ""
                java.lang.String r2 = r1.mo71348a(r2, r4)
                java.lang.String r4 = ""
                boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r2, r4)
                if (r2 != 0) goto L_0x00a8
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "comment_filter_function_open_"
                r2.<init>(r4)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
                java.lang.Boolean r2 = r1.mo71346a(r2, r4)
                com.ss.android.ugc.aweme.setting.d r4 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
                java.lang.String r5 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.C7573i.m23582a(r4, r5)
                boolean r4 = r4.mo18712E()
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r2, r4)
                r2 = r2 ^ 1
                if (r2 == 0) goto L_0x0126
            L_0x00a8:
                com.ss.android.ugc.aweme.setting.d r2 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
                java.lang.String r4 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                boolean r2 = r2.mo18712E()
                if (r2 == 0) goto L_0x00de
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "settings_times_"
                r2.<init>(r4)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r4 = "0"
                r1.mo71352b(r2, r4)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "not_now_times_"
                r2.<init>(r4)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r4 = "0"
                r1.mo71352b(r2, r4)
                goto L_0x0104
            L_0x00de:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "settings_times_"
                r2.<init>(r4)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r4 = "1"
                r1.mo71352b(r2, r4)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "not_now_times_"
                r2.<init>(r4)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r4 = "2"
                r1.mo71352b(r2, r4)
            L_0x0104:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "comment_filter_function_open_"
                r2.<init>(r4)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                com.ss.android.ugc.aweme.setting.d r4 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
                java.lang.String r5 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.C7573i.m23582a(r4, r5)
                boolean r4 = r4.mo18712E()
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r1.mo71350b(r2, r4)
            L_0x0126:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "comment_filter_function_open_"
                r2.<init>(r4)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
                java.lang.Boolean r2 = r1.mo71346a(r2, r4)
                java.lang.String r4 = "storage.get(COMMENT_FILT…_OPEN + \"_\" + uid, false)"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x01b4
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "comment_filter_status_"
                r2.<init>(r4)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Integer r2 = r1.mo71347a(r2, r3)
                if (r2 != 0) goto L_0x0160
                goto L_0x01b4
            L_0x0160:
                int r2 = r2.intValue()
                if (r2 != 0) goto L_0x01b4
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "comment_filter_status_"
                r2.<init>(r3)
                com.ss.android.ugc.aweme.IAccountUserService r3 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
                java.lang.String r4 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                java.lang.String r3 = r3.getCurUserId()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                int r3 = r7.f98251I
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.mo71351b(r2, r3)
                int r2 = r7.f98251I
                if (r2 <= 0) goto L_0x01b4
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "settings_times_"
                r2.<init>(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "1"
                r1.mo71352b(r2, r3)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "not_now_times_"
                r2.<init>(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "2"
                r1.mo71352b(r2, r3)
            L_0x01b4:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "comment_offensive_filter_"
                r2.<init>(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                int r7 = r7.f98252J
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r1.mo71351b(r0, r7)
            L_0x01cb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.setting.commentfilter.p1515b.C37607a.C37608a.mo59219a(com.ss.android.ugc.aweme.setting.serverpush.model.b):void");
        }

        /* renamed from: a */
        public static void m120413a(Activity activity, Aweme aweme, Comment comment) {
            C7573i.m23587b(aweme, "aweme");
            C7573i.m23587b(comment, "comment");
            if (activity != null && !activity.isFinishing() && C6399b.m19944t()) {
                IAccountUserService a = C21115b.m71197a();
                C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
                String curUserId = a.getCurUserId();
                C27870d a2 = C27870d.m91297a();
                StringBuilder sb = new StringBuilder("comment_filter_function_open_");
                IAccountUserService a3 = C21115b.m71197a();
                C7573i.m23582a((Object) a3, "AccountUserProxyService.get()");
                sb.append(a3.getCurUserId());
                Boolean a4 = a2.mo71346a(sb.toString(), Boolean.valueOf(false));
                C7573i.m23582a((Object) a4, "ReactNativeStorage.insta…e.get().curUserId, false)");
                if (a4.booleanValue()) {
                    CharSequence charSequence = curUserId;
                    if (TextUtils.equals(aweme.getAuthorUid(), charSequence)) {
                        User user = comment.getUser();
                        C7573i.m23582a((Object) user, "comment.user");
                        if (!TextUtils.equals(user.getUid(), charSequence)) {
                            C27870d a5 = C27870d.m91297a();
                            StringBuilder sb2 = new StringBuilder("settings_times_");
                            sb2.append(curUserId);
                            String a6 = a5.mo71348a(sb2.toString(), "0");
                            C7573i.m23582a((Object) a6, "storage.get(SETTING_TIMES_KEY + uid, \"0\")");
                            if (Integer.parseInt(a6) <= 0) {
                                StringBuilder sb3 = new StringBuilder("not_now_times_");
                                sb3.append(curUserId);
                                String a7 = a5.mo71348a(sb3.toString(), "0");
                                C7573i.m23582a((Object) a7, "storage.get(NOT_NOW_TIMES_KEY + uid, \"0\")");
                                if (Integer.parseInt(a7) <= 1) {
                                    Dialog a8 = new C10741a(activity).mo25657b((int) R.string.ao4).mo25654a(activity.getString(R.string.bbw), (OnClickListener) new C37609a(a5, curUserId, activity)).mo25661b(activity.getString(R.string.cnm), (OnClickListener) new C37610b(a5, curUserId)).mo25656a().mo25637a();
                                    a8.setCanceledOnTouchOutside(false);
                                    a8.setCancelable(false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
