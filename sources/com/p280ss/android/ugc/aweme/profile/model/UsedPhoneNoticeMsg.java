package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsg */
public final class UsedPhoneNoticeMsg {
    @C6593c(mo15949a = "args")
    public final UsedPhoneNoticeMsgArgs args;
    @C6593c(mo15949a = "has_notice")
    public final boolean has_notice;
    @C6593c(mo15949a = "highlight")
    public final List<UsedPhoneNoticeMsgHighlight> highlight;
    @C6593c(mo15949a = "notice")
    public final String notice;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgHighlight>, for r3v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsg copy$default(com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsg r0, java.lang.String r1, com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgArgs r2, java.util.List<com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgHighlight> r3, boolean r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.lang.String r1 = r0.notice
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgArgs r2 = r0.args
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            java.util.List<com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgHighlight> r3 = r0.highlight
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            boolean r4 = r0.has_notice
        L_0x0018:
            com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsg r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsg.copy$default(com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsg, java.lang.String, com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgArgs, java.util.List, boolean, int, java.lang.Object):com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsg");
    }

    public final UsedPhoneNoticeMsg copy(String str, UsedPhoneNoticeMsgArgs usedPhoneNoticeMsgArgs, List<UsedPhoneNoticeMsgHighlight> list, boolean z) {
        return new UsedPhoneNoticeMsg(str, usedPhoneNoticeMsgArgs, list, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UsedPhoneNoticeMsg) {
                UsedPhoneNoticeMsg usedPhoneNoticeMsg = (UsedPhoneNoticeMsg) obj;
                if (C7573i.m23585a((Object) this.notice, (Object) usedPhoneNoticeMsg.notice) && C7573i.m23585a((Object) this.args, (Object) usedPhoneNoticeMsg.args) && C7573i.m23585a((Object) this.highlight, (Object) usedPhoneNoticeMsg.highlight)) {
                    if (this.has_notice == usedPhoneNoticeMsg.has_notice) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.notice;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UsedPhoneNoticeMsgArgs usedPhoneNoticeMsgArgs = this.args;
        int hashCode2 = (hashCode + (usedPhoneNoticeMsgArgs != null ? usedPhoneNoticeMsgArgs.hashCode() : 0)) * 31;
        List<UsedPhoneNoticeMsgHighlight> list = this.highlight;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.has_notice;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsedPhoneNoticeMsg(notice=");
        sb.append(this.notice);
        sb.append(", args=");
        sb.append(this.args);
        sb.append(", highlight=");
        sb.append(this.highlight);
        sb.append(", has_notice=");
        sb.append(this.has_notice);
        sb.append(")");
        return sb.toString();
    }

    public UsedPhoneNoticeMsg(String str, UsedPhoneNoticeMsgArgs usedPhoneNoticeMsgArgs, List<UsedPhoneNoticeMsgHighlight> list, boolean z) {
        this.notice = str;
        this.args = usedPhoneNoticeMsgArgs;
        this.highlight = list;
        this.has_notice = z;
    }
}
