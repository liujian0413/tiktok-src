package com.p280ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.account.login.model.CommonUserInfo.C21562a;
import com.p280ss.android.ugc.aweme.account.login.model.TPUserInfo.C21565a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Date;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.TPLoginMethod */
public final class TPLoginMethod extends BaseLoginMethod implements Parcelable {
    public static final C21564a CREATOR = new C21564a(null);
    private boolean loginFromFeedPage;
    private final String platform;
    private TPUserInfo userInfo;

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.TPLoginMethod$a */
    public static final class C21564a implements Creator<TPLoginMethod> {
        private C21564a() {
        }

        /* renamed from: a */
        private static TPLoginMethod[] m72282a(int i) {
            return new TPLoginMethod[i];
        }

        public /* synthetic */ C21564a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m72281a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m72282a(i);
        }

        /* renamed from: a */
        private static TPLoginMethod m72281a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new TPLoginMethod(parcel);
        }
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo) {
        this(str, str2, tPUserInfo, false, null, 24, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z) {
        this(str, str2, tPUserInfo, z, null, 16, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean getLoginFromFeedPage() {
        return this.loginFromFeedPage;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final TPUserInfo getUserInfo() {
        return this.userInfo;
    }

    public final void setLoginFromFeedPage(boolean z) {
        this.loginFromFeedPage = z;
    }

    public final void setUserInfo(TPUserInfo tPUserInfo) {
        C7573i.m23587b(tPUserInfo, "<set-?>");
        this.userInfo = tPUserInfo;
    }

    public final void updateUserInfo(User user) {
        C7573i.m23587b(user, "user");
        super.updateUserInfo(user);
        if (!(!C7573i.m23585a((Object) user.getUid(), (Object) getUid()))) {
            this.userInfo = C21565a.m72284a(user);
        }
    }

    public TPLoginMethod(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String str = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        String str2 = readString2;
        TPUserInfo tPUserInfo = (TPUserInfo) parcel.readParcelable(TPUserInfo.class.getClassLoader());
        if (tPUserInfo == null) {
            tPUserInfo = new TPUserInfo("", "");
        }
        this(str, str2, tPUserInfo, false, null, 24, null);
        setExpires(new Date(parcel.readLong()));
        CommonUserInfo commonUserInfo = (CommonUserInfo) parcel.readParcelable(CommonUserInfo.class.getClassLoader());
        if (commonUserInfo == null) {
            commonUserInfo = getCommonUserInfo();
        }
        setCommonUserInfo(commonUserInfo);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeString(getUid());
        parcel.writeString(this.platform);
        parcel.writeParcelable(this.userInfo, i);
        parcel.writeLong(getExpires().getTime());
        parcel.writeParcelable(getCommonUserInfo(), i);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo) {
        C7573i.m23587b(str, "uid");
        C7573i.m23587b(str2, "platform");
        C7573i.m23587b(tPUserInfo, "userInfo");
        C7573i.m23587b(commonUserInfo, "commonUserInfo");
        super(str, LoginMethodName.THIRD_PARTY, commonUserInfo, null, 8, null);
        this.platform = str2;
        this.userInfo = tPUserInfo;
        this.loginFromFeedPage = z;
    }

    public /* synthetic */ TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, int i, C7571f fVar) {
        boolean z2;
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 16) != 0) {
            commonUserInfo = C21562a.m72275a();
        }
        this(str, str2, tPUserInfo, z2, commonUserInfo);
    }
}
