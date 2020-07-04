package com.p280ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.p280ss.android.ugc.aweme.notification.p1433b.C34407a;
import com.p280ss.android.ugc.aweme.notification.util.C34623h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.BaseNotificationHolder */
public class BaseNotificationHolder extends C1293v implements OnClickListener, OnLongClickListener {

    /* renamed from: a */
    public C34396d f89661a;

    /* renamed from: b */
    protected boolean f89662b;

    /* renamed from: c */
    private BaseNotice f89663c;

    /* renamed from: d */
    private Map<String, BaseNotice> f89664d;

    /* renamed from: e */
    private View f89665e;

    /* renamed from: a */
    protected static boolean m111135a(int i) {
        return i == 7 || i == 8 || i == 9 || i == 10;
    }

    /* renamed from: c */
    private static String mo87655c() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo87643a() {
        return false;
    }

    /* renamed from: a */
    public final void mo87651a(Map<String, BaseNotice> map, BaseNotice baseNotice, boolean z, String str) {
        this.f89664d = map;
        mo87641a(baseNotice, z, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87642a(boolean z) {
        if (z && this.f89664d != null && this.f89663c != null) {
            this.f89664d.put(this.f89663c.getNid(), this.f89663c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87647a(String str, String str2, int i, BaseNotice baseNotice, boolean z, String str3, String str4) {
        mo87648a(str, str2, i, baseNotice, z, str3, str4, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87648a(String str, String str2, int i, BaseNotice baseNotice, boolean z, String str3, String str4, String str5) {
        if (baseNotice != null) {
            C34407a j = new C34407a().mo87703a(str).mo87707b(str2).mo87701a(baseNotice.getCreateTime()).mo87708c(str3).mo87702a(baseNotice.logPbBean).mo87715j(str4);
            char c = 65535;
            if (baseNotice.timeLineType != -1) {
                j.mo87713h(C34623h.m111875a(baseNotice.timeLineType)).mo87714i("1002");
            }
            if (!TextUtils.isEmpty(baseNotice.getLabelText())) {
                j.mo87717l(baseNotice.getLabelText());
            }
            if (i != -1) {
                j.mo87700a(i);
            }
            j.mo87704a(!z);
            if (!TextUtils.isEmpty(str5)) {
                j.mo87716k(str5);
            }
            int hashCode = str2.hashCode();
            if (hashCode != 3123) {
                if (hashCode != 3135424) {
                    if (hashCode != 3321751) {
                        if (hashCode == 950398559 && str2.equals("comment")) {
                            c = 2;
                        }
                    } else if (str2.equals("like")) {
                        c = 1;
                    }
                } else if (str2.equals("fans")) {
                    c = 0;
                }
            } else if (str2.equals("at")) {
                c = 3;
            }
            switch (c) {
                case 0:
                    m111132a(j, baseNotice);
                    break;
                case 1:
                    m111136b(j, baseNotice);
                    break;
                case 2:
                    m111138c(j, baseNotice);
                    break;
                case 3:
                    m111139d(j, baseNotice);
                    break;
            }
            j.mo87705a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87649a(String str, String str2, int i, boolean z) {
        mo87650a(str, str2, i, z, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87650a(String str, String str2, int i, boolean z, String str3) {
        m111133a(str, str2, i, z ? "yellow_dot" : "", str3);
    }

    /* renamed from: b */
    public final boolean mo87652b() {
        if (C34391a.m111244a(C6399b.m19921a())) {
            return false;
        }
        C10761a.m31399c(this.f89665e.getContext(), (int) R.string.cjs).mo25750a();
        return true;
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        mo87642a(true);
    }

    public BaseNotificationHolder(View view) {
        super(view);
        this.f89665e = view;
        if (mo87643a()) {
            this.f89665e.setOnLongClickListener(this);
        }
    }

    /* renamed from: a */
    protected static String m111130a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\d+\\d$").matcher(str);
        if (matcher.find()) {
            str2 = matcher.group();
        }
        return str2;
    }

    public boolean onLongClick(View view) {
        int layoutPosition = getLayoutPosition();
        if (this.f89661a != null && layoutPosition >= 0) {
            this.f89661a.mo87671b(layoutPosition);
        }
        return true;
    }

    /* renamed from: a */
    protected static String m111129a(CommentNotice commentNotice) {
        if (commentNotice == null) {
            return "";
        }
        String str = "";
        switch (commentNotice.getCommentType()) {
            case 11:
            case 14:
                str = "comment_a";
                break;
            case 12:
            case 15:
                str = "comment_b";
                break;
            case 13:
            case 16:
                str = "comment_c";
                break;
        }
        return str;
    }

    /* renamed from: d */
    private static void m111139d(C34407a aVar, BaseNotice baseNotice) {
        AtMe atMe = baseNotice.getAtMe();
        if (atMe != null) {
            aVar.mo87706b(0);
            aVar.mo87710e(atMe.getUser().getUid());
        }
    }

    /* renamed from: c */
    private static void m111138c(C34407a aVar, BaseNotice baseNotice) {
        CommentNotice commentNotice = baseNotice.getCommentNotice();
        if (commentNotice != null) {
            aVar.mo87706b(0);
            aVar.mo87710e(commentNotice.getComment().getUser().getUid());
            switch (commentNotice.getCommentType()) {
                case 0:
                case 1:
                case 5:
                case 11:
                case 14:
                    aVar.mo87711f("video");
                    aVar.mo87712g(commentNotice.getForwardId());
                    return;
                case 2:
                case 4:
                case 6:
                case 8:
                case 12:
                    aVar.mo87711f("comment");
                    aVar.mo87712g(commentNotice.getForwardId());
                    break;
            }
        }
    }

    /* renamed from: a */
    private static void m111132a(C34407a aVar, BaseNotice baseNotice) {
        FollowNotice followNotice = baseNotice.getFollowNotice();
        if (followNotice != null) {
            aVar.mo87706b(0);
            aVar.mo87710e(followNotice.getUser().getUid());
            int followStatus = followNotice.getUser().getFollowStatus();
            if (followStatus == 0) {
                aVar.mo87709d("follow");
                return;
            }
            if (followStatus == 1 || followStatus == 2) {
                aVar.mo87709d("followed");
            }
        }
    }

    /* renamed from: b */
    private static void m111136b(C34407a aVar, BaseNotice baseNotice) {
        DiggNotice diggNotice = baseNotice.getDiggNotice();
        if (diggNotice != null) {
            List users = diggNotice.getUsers();
            if (users != null && users.size() != 0) {
                if (diggNotice.getMergeCount() == 1) {
                    aVar.mo87706b(0);
                    aVar.mo87710e(((User) users.get(0)).getUid());
                } else {
                    aVar.mo87706b(1);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < users.size(); i++) {
                        User user = (User) users.get(i);
                        if (i == users.size() - 1) {
                            sb.append(user.getUid());
                        } else {
                            sb.append(user.getUid());
                            sb.append(",");
                        }
                    }
                    aVar.mo87710e(sb.toString());
                }
                if (diggNotice.getDiggType() == 3) {
                    aVar.mo87711f("comment");
                    aVar.mo87712g(diggNotice.getCid());
                    return;
                }
                aVar.mo87711f("video");
                aVar.mo87712g(diggNotice.getForwardId());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87641a(BaseNotice baseNotice, boolean z, String str) {
        this.f89663c = baseNotice;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87645a(Activity activity, String str, String str2) {
        m111131a(activity, str, str2, "message");
    }

    /* renamed from: a */
    protected static void m111134a(String str, String str2, String str3) {
        C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", str2).mo59973a("enter_method", str3).mo59973a("to_user_id", str).mo59975b().f60753a);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=android.app.Activity, code=android.content.Context, for r1v0, types: [android.content.Context, android.app.Activity] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m111131a(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
            if (r1 != 0) goto L_0x0006
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
        L_0x0006:
            java.lang.String r0 = "aweme://user/profile/"
            com.bytedance.router.SmartRoute r1 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            java.lang.String r0 = "uid"
            com.bytedance.router.SmartRoute r1 = r1.withParam(r0, r2)
            java.lang.String r2 = "enter_from"
            com.bytedance.router.SmartRoute r1 = r1.withParam(r2, r4)
            java.lang.String r2 = "sec_user_id"
            com.bytedance.router.SmartRoute r1 = r1.withParam(r2, r3)
            java.lang.String r2 = "previous_page"
            java.lang.String r3 = "message"
            com.bytedance.router.SmartRoute r1 = r1.withParam(r2, r3)
            java.lang.String r2 = "enter_method"
            java.lang.String r3 = "follow_button"
            com.bytedance.router.SmartRoute r1 = r1.withParam(r2, r3)
            boolean r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            if (r2 == 0) goto L_0x0037
            java.lang.String r2 = "previous_page_position"
            goto L_0x0039
        L_0x0037:
            java.lang.String r2 = "extra_previous_page_position"
        L_0x0039:
            java.lang.String r3 = "other_places"
            com.bytedance.router.SmartRoute r1 = r1.withParam(r2, r3)
            r1.open()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.adapter.BaseNotificationHolder.m111131a(android.app.Activity, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    private void m111133a(String str, String str2, int i, String str3, String str4) {
        C22984d a = C22984d.m75611a().mo59973a("action_type", str).mo59973a("account_type", str2).mo59973a("client_order", String.valueOf(i)).mo59973a("notice_type", str3).mo59973a("notification_type", str4);
        String c = mo87655c();
        if (!TextUtils.isEmpty(c)) {
            a.mo59973a("explain_relation", c);
        }
        C6907h.m21524a("notification_message_inner_message", (Map) a.f60753a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87646a(String str, String str2, int i, BaseNotice baseNotice, boolean z, String str3) {
        mo87647a(str, str2, i, baseNotice, z, "", str3);
    }
}
