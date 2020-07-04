package com.p280ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.account.login.model.CommonUserInfo.C21562a;
import java.util.Date;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod */
public final class AccountPassLoginMethod extends BaseLoginMethod implements Parcelable {
    public static final C21560a CREATOR = new C21560a(null);
    private final String name;

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod$a */
    public static final class C21560a implements Creator<AccountPassLoginMethod> {
        private C21560a() {
        }

        /* renamed from: a */
        private static AccountPassLoginMethod[] m72272a(int i) {
            return new AccountPassLoginMethod[i];
        }

        public /* synthetic */ C21560a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m72271a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m72272a(i);
        }

        /* renamed from: a */
        private static AccountPassLoginMethod m72271a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new AccountPassLoginMethod(parcel);
        }
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2) {
        this(str, loginMethodName, str2, null, 8, null);
    }

    public AccountPassLoginMethod(String str, String str2) {
        this(str, null, str2, null, 10, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final String getName() {
        return this.name;
    }

    public AccountPassLoginMethod(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String str = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "DEFAULT";
        }
        LoginMethodName valueOf = LoginMethodName.valueOf(readString2);
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        this(str, valueOf, readString3, null, 8, null);
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
        parcel.writeString(getLoginMethodName().name());
        parcel.writeString(this.name);
        parcel.writeLong(getExpires().getTime());
        parcel.writeParcelable(getCommonUserInfo(), i);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo) {
        C7573i.m23587b(str, "uid");
        C7573i.m23587b(loginMethodName, "loginMethodName");
        C7573i.m23587b(str2, "name");
        C7573i.m23587b(commonUserInfo, "commonUserInfo");
        super(str, loginMethodName, commonUserInfo, null, 8, null);
        this.name = str2;
    }

    public /* synthetic */ AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            loginMethodName = LoginMethodName.EMAIL_PASS;
        }
        if ((i & 8) != 0) {
            commonUserInfo = C21562a.m72275a();
        }
        this(str, loginMethodName, str2, commonUserInfo);
    }
}
