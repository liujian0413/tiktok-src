package com.p280ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.account.login.model.CommonUserInfo.C21562a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Date;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod */
public class BaseLoginMethod implements Parcelable {
    public static final C21561a CREATOR = new C21561a(null);
    private CommonUserInfo commonUserInfo;
    private Date expires;
    private int lastIsReliableLogin;
    private final LoginMethodName loginMethodName;
    private final String uid;

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod$a */
    public static final class C21561a implements Creator<BaseLoginMethod> {
        private C21561a() {
        }

        /* renamed from: a */
        private static BaseLoginMethod[] m72274a(int i) {
            return new BaseLoginMethod[i];
        }

        public /* synthetic */ C21561a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m72273a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m72274a(i);
        }

        /* renamed from: a */
        private static BaseLoginMethod m72273a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new BaseLoginMethod(parcel);
        }
    }

    public BaseLoginMethod() {
        this(null, null, null, null, 15, null);
    }

    public int describeContents() {
        return 0;
    }

    public final CommonUserInfo getCommonUserInfo() {
        return this.commonUserInfo;
    }

    public Date getExpires() {
        return this.expires;
    }

    public final int getLastIsReliableLogin() {
        return this.lastIsReliableLogin;
    }

    public LoginMethodName getLoginMethodName() {
        return this.loginMethodName;
    }

    public final String getUid() {
        return this.uid;
    }

    public final boolean isExpired() {
        return new Date().after(getExpires());
    }

    public final void setLastIsReliableLogin(int i) {
        this.lastIsReliableLogin = i;
    }

    public final void setCommonUserInfo(CommonUserInfo commonUserInfo2) {
        C7573i.m23587b(commonUserInfo2, "<set-?>");
        this.commonUserInfo = commonUserInfo2;
    }

    public void setExpires(Date date) {
        C7573i.m23587b(date, "<set-?>");
        this.expires = date;
    }

    public void updateUserInfo(User user) {
        C7573i.m23587b(user, "user");
        if (!(!C7573i.m23585a((Object) user.getUid(), (Object) this.uid))) {
            this.commonUserInfo = C21562a.m72277a(user);
        }
    }

    public BaseLoginMethod(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "DEFAULT";
        }
        LoginMethodName valueOf = LoginMethodName.valueOf(readString2);
        CommonUserInfo commonUserInfo2 = (CommonUserInfo) parcel.readParcelable(CommonUserInfo.class.getClassLoader());
        if (commonUserInfo2 == null) {
            commonUserInfo2 = C21562a.m72275a();
        }
        this(readString, valueOf, commonUserInfo2, new Date(parcel.readLong()));
        this.lastIsReliableLogin = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeString(this.uid);
        parcel.writeString(getLoginMethodName().name());
        parcel.writeParcelable(this.commonUserInfo, i);
        parcel.writeLong(getExpires().getTime());
        parcel.writeInt(this.lastIsReliableLogin);
    }

    public BaseLoginMethod(String str, LoginMethodName loginMethodName2, CommonUserInfo commonUserInfo2, Date date) {
        C7573i.m23587b(str, "uid");
        C7573i.m23587b(loginMethodName2, "loginMethodName");
        C7573i.m23587b(commonUserInfo2, "commonUserInfo");
        C7573i.m23587b(date, "expires");
        this.uid = str;
        this.loginMethodName = loginMethodName2;
        this.commonUserInfo = commonUserInfo2;
        this.expires = date;
    }

    public /* synthetic */ BaseLoginMethod(String str, LoginMethodName loginMethodName2, CommonUserInfo commonUserInfo2, Date date, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            loginMethodName2 = LoginMethodName.DEFAULT;
        }
        if ((i & 4) != 0) {
            commonUserInfo2 = C21562a.m72275a();
        }
        if ((i & 8) != 0) {
            date = new Date(System.currentTimeMillis() + 2592000000L);
        }
        this(str, loginMethodName2, commonUserInfo2, date);
    }
}
