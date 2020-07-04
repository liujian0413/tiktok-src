package com.p280ss.android.ugc.aweme.comment.p1101h;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.h.g */
public final class C24151g {
    /* renamed from: a */
    public static boolean m79362a() {
        if (!C24220a.m79551a().needBindMobile() || C24220a.m79551a().getBindPhoneForCommentAB() != 30) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m79361a(Context context, String str) {
        C10761a.m31403c(context, context.getString(R.string.a8d)).mo25750a();
        User curUser = C6861a.m21337f().getCurUser();
        if (curUser != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("user id = ");
            sb.append(curUser.getUid());
            sb.append(" first comment = ");
            sb.append(SharePrefCache.inst().getIsFirstPublishComment());
            sb.append(" failed reason = ");
            sb.append(str);
            sb.append(" bind phone = ");
            sb.append(curUser.getBindPhone());
            C6921a.m21562b("comment_failed", String.valueOf(sb));
        }
    }

    /* renamed from: a */
    public static void m79360a(final Context context, final C24142b bVar) {
        if (!C24220a.m79551a().needBindMobile()) {
            bVar.mo62571a(false);
            return;
        }
        int bindPhoneForCommentAB = C24220a.m79551a().getBindPhoneForCommentAB();
        if (bindPhoneForCommentAB == 10) {
            bVar.mo62571a(false);
        } else if (bindPhoneForCommentAB == 30) {
            C24220a.m79551a().createDialogForComment(context, R.string.sq, new Runnable() {
                public final void run() {
                    bVar.mo62571a(true);
                }
            });
        } else if (bindPhoneForCommentAB != 40) {
            switch (bindPhoneForCommentAB) {
                case 20:
                    SharePrefCache.inst().setIsFirstPublishComment(false);
                    C24220a.m79551a().createDialogForComment(context, R.string.sq, new Runnable() {
                        public final void run() {
                            bVar.mo62571a(false);
                        }
                    });
                    return;
                case 21:
                    if (SharePrefCache.inst().getIsFirstPublishComment()) {
                        SharePrefCache.inst().setIsFirstPublishComment(false);
                        C24220a.m79551a().createDialogForComment(context, R.string.sq, new Runnable() {
                            public final void run() {
                                bVar.mo62571a(false);
                            }
                        });
                        return;
                    }
                    bVar.mo62571a(false);
                    return;
                default:
                    if (SharePrefCache.inst().getIsFirstPublishComment()) {
                        SharePrefCache.inst().setIsFirstPublishComment(false);
                        C24220a.m79551a().createDialogForComment(context, R.string.sq, new Runnable() {
                            public final void run() {
                                bVar.mo62571a(false);
                            }
                        });
                        return;
                    }
                    bVar.mo62571a(false);
                    return;
            }
        } else {
            C24220a.m79551a().createDialogForComment(context, R.string.sq, new Runnable() {
                public final void run() {
                    C24151g.m79361a(context, "用户拒绝绑定");
                }
            });
        }
    }
}
