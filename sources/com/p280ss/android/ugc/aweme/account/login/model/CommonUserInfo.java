package com.p280ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.CommonUserInfo */
public final class CommonUserInfo implements Parcelable {
    public static final C21562a CREATOR = new C21562a(null);
    private final String avatarUrl;
    private final String userName;

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.CommonUserInfo$a */
    public static final class C21562a implements Creator<CommonUserInfo> {
        private C21562a() {
        }

        /* renamed from: a */
        public static CommonUserInfo m72275a() {
            return new CommonUserInfo("", "");
        }

        /* renamed from: a */
        private static CommonUserInfo[] m72278a(int i) {
            return new CommonUserInfo[i];
        }

        public /* synthetic */ C21562a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m72276a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m72278a(i);
        }

        /* renamed from: a */
        private static CommonUserInfo m72276a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new CommonUserInfo(parcel);
        }

        /* renamed from: a */
        public static CommonUserInfo m72277a(User user) {
            String str;
            C7573i.m23587b(user, "user");
            String nickname = user.getNickname();
            C7573i.m23582a((Object) nickname, "user.nickname");
            if (user.getAvatarThumb() != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                C7573i.m23582a((Object) avatarThumb, "user.avatarThumb");
                if (avatarThumb.getUrlList() != null) {
                    UrlModel avatarThumb2 = user.getAvatarThumb();
                    C7573i.m23582a((Object) avatarThumb2, "user.avatarThumb");
                    if (!avatarThumb2.getUrlList().isEmpty()) {
                        UrlModel avatarThumb3 = user.getAvatarThumb();
                        C7573i.m23582a((Object) avatarThumb3, "user.avatarThumb");
                        str = (String) avatarThumb3.getUrlList().get(0);
                        C7573i.m23582a((Object) str, "if (user.avatarThumb == …er.avatarThumb.urlList[0]");
                        return new CommonUserInfo(nickname, str);
                    }
                }
            }
            str = "";
            C7573i.m23582a((Object) str, "if (user.avatarThumb == …er.avatarThumb.urlList[0]");
            return new CommonUserInfo(nickname, str);
        }
    }

    public static /* synthetic */ CommonUserInfo copy$default(CommonUserInfo commonUserInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonUserInfo.userName;
        }
        if ((i & 2) != 0) {
            str2 = commonUserInfo.avatarUrl;
        }
        return commonUserInfo.copy(str, str2);
    }

    public final String component1() {
        return this.userName;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final CommonUserInfo copy(String str, String str2) {
        C7573i.m23587b(str, "userName");
        C7573i.m23587b(str2, "avatarUrl");
        return new CommonUserInfo(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.avatarUrl, (java.lang.Object) r3.avatarUrl) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.login.model.CommonUserInfo
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r3 = (com.p280ss.android.ugc.aweme.account.login.model.CommonUserInfo) r3
            java.lang.String r0 = r2.userName
            java.lang.String r1 = r3.userName
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.avatarUrl
            java.lang.String r3 = r3.avatarUrl
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.model.CommonUserInfo.equals(java.lang.Object):boolean");
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final int hashCode() {
        String str = this.userName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.avatarUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonUserInfo(userName=");
        sb.append(this.userName);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append(")");
        return sb.toString();
    }

    public CommonUserInfo(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        this(readString, readString2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeString(this.userName);
        parcel.writeString(this.avatarUrl);
    }

    public CommonUserInfo(String str, String str2) {
        C7573i.m23587b(str, "userName");
        C7573i.m23587b(str2, "avatarUrl");
        this.userName = str;
        this.avatarUrl = str2;
    }
}
