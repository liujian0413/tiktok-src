package com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model;

import com.bytedance.p263im.core.model.Member;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C7048a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember */
public final class IMMember implements C30753a, Serializable {
    private String aliasInitial;
    private String aliasPinyin;
    private Member member;
    private IMUser user;

    public final String getAliasInitial() {
        return this.aliasInitial;
    }

    public final String getAliasPinyin() {
        return this.aliasPinyin;
    }

    public final Member getMember() {
        return this.member;
    }

    public final IMUser getUser() {
        return this.user;
    }

    public final String getMemberDisplayName() {
        CharSequence charSequence;
        boolean z;
        CharSequence charSequence2;
        IMUser iMUser = this.user;
        if (iMUser != null) {
            charSequence = iMUser.getRemarkName();
        } else {
            charSequence = null;
        }
        CharSequence charSequence3 = charSequence;
        boolean z2 = false;
        if (charSequence3 == null || charSequence3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            IMUser iMUser2 = this.user;
            if (iMUser2 != null) {
                return iMUser2.getRemarkName();
            }
            return null;
        }
        Member member2 = this.member;
        if (member2 != null) {
            charSequence2 = member2.getAlias();
        } else {
            charSequence2 = null;
        }
        CharSequence charSequence4 = charSequence2;
        if (charSequence4 == null || charSequence4.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            Member member3 = this.member;
            if (member3 != null) {
                return member3.getAlias();
            }
            return null;
        }
        IMUser iMUser3 = this.user;
        if (iMUser3 != null) {
            return iMUser3.getNickName();
        }
        return null;
    }

    public final void setAliasInitial(String str) {
        this.aliasInitial = str;
    }

    public final void setAliasPinyin(String str) {
        this.aliasPinyin = str;
    }

    public final void setUser(IMUser iMUser) {
        this.user = iMUser;
    }

    public final void setMember(Member member2) {
        String str;
        this.member = member2;
        String str2 = null;
        if (member2 != null) {
            str = member2.getAlias();
        } else {
            str = null;
        }
        String c = C7048a.m21930c(str);
        C7573i.m23582a((Object) c, "CharacterUtil.hanziToPinyin(member?.alias)");
        if (c != null) {
            String lowerCase = c.toLowerCase();
            C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            this.aliasPinyin = lowerCase;
            if (member2 != null) {
                str2 = member2.getAlias();
            }
            String b = C7048a.m21928b(str2);
            C7573i.m23582a((Object) b, "CharacterUtil.hanziToPinyinInitial(member?.alias)");
            if (b != null) {
                String lowerCase2 = b.toLowerCase();
                C7573i.m23582a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                this.aliasInitial = lowerCase2;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
