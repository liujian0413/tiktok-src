package com.p280ss.android.ugc.aweme.notification.newstyle.model;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.a */
public final class C34554a {
    /* renamed from: a */
    public static final String m111727a(Comment comment) {
        if (comment == null) {
            return "";
        }
        if (TextUtils.isEmpty(comment.getCid())) {
            return "";
        }
        if (comment.getUser() == null) {
            return ((NoticeCommentHelperService) ServiceManager.get().getService(NoticeCommentHelperService.class)).getDisplayText(comment, false);
        }
        StringBuilder sb = new StringBuilder();
        User user = comment.getUser();
        C7573i.m23582a((Object) user, "user");
        sb.append(C34538e.m111685a(user));
        sb.append(": ");
        sb.append(((NoticeCommentHelperService) ServiceManager.get().getService(NoticeCommentHelperService.class)).getDisplayText(comment, false));
        return sb.toString();
    }
}
