package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView.C26926a;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.experiment.UserRateRemindExperiment;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.model.UserRateRemindInfo;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import com.p280ss.ttm.player.MediaPlayer;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.dx */
public final class C36439dx implements C26926a {

    /* renamed from: e */
    private static final boolean f95609e = C7163a.m22363a();

    /* renamed from: a */
    public UserRateRemindInfo f95610a;

    /* renamed from: b */
    public boolean f95611b = true;

    /* renamed from: c */
    public Context f95612c;

    /* renamed from: d */
    private NoticeView f95613d;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dx$a */
    static class C36440a {

        /* renamed from: a */
        String f95614a;

        /* renamed from: b */
        long f95615b;

        /* renamed from: c */
        long f95616c;

        /* renamed from: d */
        long f95617d;

        /* renamed from: e */
        long f95618e;

        C36440a() {
        }
    }

    /* renamed from: a */
    private static boolean m117648a(int i) {
        return i >= 2 && i <= 6;
    }

    /* renamed from: e */
    private boolean m117654e() {
        if (this.f95610a == null || TextUtils.isEmpty(this.f95610a.getRemindText())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static List<C36440a> m117656g() {
        List<C36440a> list;
        String b = C6887b.m21436b().mo16905b(C6399b.m19921a(), "user_rate_remind_key", "");
        if (TextUtils.isEmpty(b)) {
            return new ArrayList();
        }
        try {
            list = C42996by.m136486b(b, C36440a[].class);
        } catch (Exception unused) {
            list = new ArrayList<>();
        }
        return list;
    }

    /* renamed from: d */
    private static boolean m117653d() {
        User curUser = C6861a.m21337f().getCurUser();
        if (curUser != null && !TextUtils.isEmpty(curUser.getUid())) {
            String uid = curUser.getUid();
            for (C36440a aVar : m117656g()) {
                if (aVar != null && aVar.f95614a != null && TextUtils.equals(aVar.f95614a, uid) && aVar.f95616c > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    private void m117655f() {
        SpannableString spannableString = new SpannableString(C23481i.m77091b(R.string.fm0));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f95610a.getRemindText());
        if (!(m117652c(this.f95610a) == 0 || this.f95612c == null)) {
            spannableString.setSpan(new ForegroundColorSpan(this.f95612c.getResources().getColor(R.color.a4q)), 0, spannableString.length(), 34);
            spannableStringBuilder.append(spannableString);
        }
        this.f95613d.setTitleText((CharSequence) spannableStringBuilder);
    }

    /* renamed from: a */
    public final void mo69646a() {
        boolean z = true;
        if (m117652c(this.f95610a) == 1 && this.f95612c != null) {
            C6907h.m21524a("toast_click", (Map) C22984d.m75611a().mo59970a("have_view_more", m117652c(this.f95610a)).mo59973a("click_position", "view_more").mo59973a("toast_type", "publisher_block").f60753a);
            this.f95613d.setVisibility(4);
            User curUser = C6861a.m21337f().getCurUser();
            if (curUser != null && !TextUtils.isEmpty(curUser.getUid())) {
                String uid = curUser.getUid();
                List g = m117656g();
                Iterator it = g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C36440a aVar = (C36440a) it.next();
                    if (aVar != null && aVar.f95614a != null && TextUtils.equals(aVar.f95614a, uid)) {
                        aVar.f95617d = System.currentTimeMillis();
                        break;
                    }
                }
                if (!z) {
                    C36440a aVar2 = new C36440a();
                    aVar2.f95614a = uid;
                    aVar2.f95617d = System.currentTimeMillis();
                    g.add(aVar2);
                }
                m117647a(g);
            }
            SmartRouter.buildRoute(this.f95612c, this.f95610a.getDetailLink()).open();
        }
    }

    /* renamed from: c */
    public final void mo92513c() {
        boolean z;
        if (this.f95613d != null && m117654e() && this.f95611b) {
            User curUser = C6861a.m21337f().getCurUser();
            if ((curUser != null || !m117648a(curUser.getUserRate())) && m117650a(this.f95610a)) {
                try {
                    m117655f();
                    if (!TextUtils.isEmpty(curUser.getUid())) {
                        String uid = curUser.getUid();
                        List g = m117656g();
                        Iterator it = g.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            C36440a aVar = (C36440a) it.next();
                            if (aVar != null && TextUtils.equals(aVar.f95614a, uid)) {
                                z = true;
                                aVar.f95615b = System.currentTimeMillis();
                                break;
                            }
                        }
                        if (!z) {
                            C36440a aVar2 = new C36440a();
                            aVar2.f95614a = uid;
                            aVar2.f95615b = System.currentTimeMillis();
                            g.add(aVar2);
                        }
                        m117647a(g);
                        this.f95613d.setVisibility(0);
                        C6907h.m21524a("toast_show", (Map) C22984d.m75611a().mo59973a("toast_type", "publisher_block").mo59970a("have_view_more", m117652c(this.f95610a)).f60753a);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo69647b() {
        C6907h.m21524a("toast_click", (Map) C22984d.m75611a().mo59970a("have_view_more", m117652c(this.f95610a)).mo59973a("click_position", "cross").mo59973a("toast_type", "publisher_block").f60753a);
        this.f95613d.setVisibility(4);
        User curUser = C6861a.m21337f().getCurUser();
        if (curUser != null && !TextUtils.isEmpty(curUser.getUid())) {
            String uid = curUser.getUid();
            List g = m117656g();
            boolean z = false;
            Iterator it = g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C36440a aVar = (C36440a) it.next();
                if (aVar != null && aVar.f95614a != null && TextUtils.equals(aVar.f95614a, uid)) {
                    z = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    aVar.f95616c = currentTimeMillis;
                    if (aVar.f95618e <= 0) {
                        aVar.f95618e = currentTimeMillis;
                    }
                }
            }
            if (!z) {
                C36440a aVar2 = new C36440a();
                aVar2.f95614a = uid;
                aVar2.f95616c = System.currentTimeMillis();
                aVar2.f95618e = System.currentTimeMillis();
                g.add(aVar2);
            }
            m117647a(g);
        }
    }

    public C36439dx(NoticeView noticeView) {
        this.f95613d = noticeView;
    }

    /* renamed from: c */
    private static int m117652c(UserRateRemindInfo userRateRemindInfo) {
        if (!TextUtils.isEmpty(userRateRemindInfo.getDetailLink())) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    private void m117647a(List<C36440a> list) {
        if (list != null && this.f95612c != null) {
            try {
                C6887b.m21436b().mo16901a(this.f95612c, "user_rate_remind_key", C42996by.m136485a(list));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m117650a(UserRateRemindInfo userRateRemindInfo) {
        if (userRateRemindInfo == null) {
            return false;
        }
        switch (C6384b.m19835a().mo15287a(UserRateRemindExperiment.class, true, "user_rate_strategy", C6384b.m19835a().mo15295d().user_rate_strategy, 0)) {
            case 0:
                return false;
            case 1:
                return m117651b(userRateRemindInfo);
            case 2:
                return m117653d();
            default:
                return false;
        }
    }

    /* renamed from: b */
    private static boolean m117651b(UserRateRemindInfo userRateRemindInfo) {
        User curUser = C6861a.m21337f().getCurUser();
        if (curUser != null && !TextUtils.isEmpty(curUser.getUid())) {
            String uid = curUser.getUid();
            Iterator it = m117656g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C36440a aVar = (C36440a) it.next();
                if (aVar != null && aVar.f95614a != null && TextUtils.equals(aVar.f95614a, uid)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (aVar.f95617d > 0 && aVar.f95616c > 0 && aVar.f95617d < aVar.f95616c) {
                        return false;
                    }
                    if (aVar.f95618e > 0 && !m117649a(currentTimeMillis, aVar.f95618e, userRateRemindInfo.getShowDayLimit())) {
                        return false;
                    }
                    if (aVar.f95616c > 0 && aVar.f95617d <= 0 && m117649a(currentTimeMillis, aVar.f95616c, 1)) {
                        return false;
                    }
                    if (aVar.f95616c <= 0 || m117652c(userRateRemindInfo) != 0) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m117649a(long j, long j2, int i) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j2);
        if (i < 0) {
            i = 3;
        }
        int i2 = instance.get(6);
        int i3 = instance.get(1);
        int i4 = instance2.get(6);
        int i5 = 0;
        for (int i6 = instance2.get(1); i6 < i3; i6++) {
            if ((i6 % 4 != 0 || i6 % 100 == 0) && i6 % MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL != 0) {
                i5 += 365;
            } else {
                i5 += 366;
            }
        }
        if (i5 + (i2 - i4) < i) {
            return true;
        }
        return false;
    }
}
