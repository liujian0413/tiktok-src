package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupInviteCardInfo;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.GroupInviteContent */
public final class GroupInviteContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @C6593c(mo15949a = "aweme_invite_card")
    private GroupInviteCardInfo groupInviteCardInfo;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.GroupInviteContent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }

        public final GroupInviteContent obtain(GroupInviteCardInfo groupInviteCardInfo) {
            C7573i.m23587b(groupInviteCardInfo, "groupInviteCardInfo");
            GroupInviteContent groupInviteContent = new GroupInviteContent();
            groupInviteContent.setGroupInviteCardInfo(groupInviteCardInfo);
            return groupInviteContent;
        }
    }

    public static final GroupInviteContent obtain(GroupInviteCardInfo groupInviteCardInfo2) {
        return Companion.obtain(groupInviteCardInfo2);
    }

    public final GroupInviteCardInfo getGroupInviteCardInfo() {
        return this.groupInviteCardInfo;
    }

    public final String getMsgHint() {
        String string = C6399b.m19921a().getResources().getString(R.string.bkl);
        C7573i.m23582a((Object) string, "AppContextManager.getApp…roup_invite_message_hint)");
        return string;
    }

    public final void setGroupInviteCardInfo(GroupInviteCardInfo groupInviteCardInfo2) {
        this.groupInviteCardInfo = groupInviteCardInfo2;
    }
}
