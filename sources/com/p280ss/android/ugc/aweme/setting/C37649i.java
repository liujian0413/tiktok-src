package com.p280ss.android.ugc.aweme.setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.i */
public final class C37649i {

    /* renamed from: a */
    public static int f98118a = 0;

    /* renamed from: b */
    public static int f98119b = 1;

    /* renamed from: c */
    public static int f98120c = 2;

    /* renamed from: d */
    public static int f98121d = 3;

    /* renamed from: a */
    public static boolean m120470a() {
        if (!C6399b.m19944t() || !((Boolean) C23060u.m75742a().mo60043M().mo59877d()).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m120472b(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        if (aweme.getAuthor().getCommentSetting() == f98121d || aweme.getCommentSetting() == f98121d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m120471a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return true;
        }
        User author = aweme.getAuthor();
        int commentSetting = author.getCommentSetting();
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isMe(author.getUid())) {
            if (commentSetting == f98121d || aweme.getCommentSetting() == f98121d) {
                return false;
            }
            return true;
        } else if (commentSetting == f98118a) {
            return true;
        } else {
            if (commentSetting == f98119b && C43168s.m136913e(aweme)) {
                return true;
            }
            if (commentSetting != f98120c || !C43168s.m136914f(aweme)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static void m120469a(Context context, int i, String str) {
        if (context != null) {
            C10741a aVar = new C10741a(context);
            aVar.mo25649a(i);
            aVar.mo25660b(str);
            aVar.mo25650a((int) R.string.vj, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            aVar.mo25656a().mo25637a().setCancelable(false);
        }
    }
}
