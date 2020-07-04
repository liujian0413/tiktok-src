package com.p280ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.account.login.model.CommonUserInfo.C21562a;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import java.util.Locale;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod */
public final class PhoneLoginMethod extends BaseLoginMethod implements Parcelable {
    public static final C21563a CREATOR = new C21563a(null);
    private final PhoneNumber phoneNumber;

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod$a */
    public static final class C21563a implements Creator<PhoneLoginMethod> {
        private C21563a() {
        }

        /* renamed from: a */
        private static PhoneLoginMethod[] m72280a(int i) {
            return new PhoneLoginMethod[i];
        }

        public /* synthetic */ C21563a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m72279a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m72280a(i);
        }

        /* renamed from: a */
        private static PhoneLoginMethod m72279a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new PhoneLoginMethod(parcel);
        }
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, PhoneNumber phoneNumber2) {
        this(str, loginMethodName, phoneNumber2, null, 8, null);
    }

    public PhoneLoginMethod(String str, PhoneNumber phoneNumber2) {
        this(str, null, phoneNumber2, null, 10, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public PhoneLoginMethod(Parcel parcel) {
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
        this(str, LoginMethodName.valueOf(readString2), new PhoneNumber(), null, 8, null);
        PhoneNumber phoneNumber2 = this.phoneNumber;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        phoneNumber2.setCountryIso(readString3);
        this.phoneNumber.setCountryCode(parcel.readInt());
        this.phoneNumber.setNationalNumber(parcel.readLong());
        CommonUserInfo commonUserInfo = (CommonUserInfo) parcel.readParcelable(CommonUserInfo.class.getClassLoader());
        if (commonUserInfo == null) {
            commonUserInfo = getCommonUserInfo();
        }
        setCommonUserInfo(commonUserInfo);
    }

    private final String parseNumber(String str) {
        boolean z;
        CharSequence charSequence = str;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            for (int i = 0; i < charSequence.length(); i++) {
                int digit = Character.digit(charSequence.charAt(i), 10);
                if (digit != -1) {
                    sb.append(digit);
                }
            }
        }
        if (sb.length() == 0) {
            z2 = true;
        }
        if (z2) {
            return "0";
        }
        String sb2 = sb.toString();
        C7573i.m23582a((Object) sb2, "sb.toString()");
        return sb2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z;
        C7573i.m23587b(parcel, "parcel");
        parcel.writeString(getUid());
        parcel.writeString(getLoginMethodName().name());
        CharSequence countryIso = this.phoneNumber.getCountryIso();
        if (countryIso == null || countryIso.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Locale locale = Locale.CHINA;
            C7573i.m23582a((Object) locale, "Locale.CHINA");
            parcel.writeString(locale.getCountry());
        } else {
            parcel.writeString(this.phoneNumber.getCountryIso());
        }
        parcel.writeInt(this.phoneNumber.getCountryCode());
        parcel.writeLong(this.phoneNumber.getNationalNumber());
        parcel.writeParcelable(getCommonUserInfo(), i);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, PhoneNumber phoneNumber2, CommonUserInfo commonUserInfo) {
        C7573i.m23587b(str, "uid");
        C7573i.m23587b(loginMethodName, "loginMethodName");
        C7573i.m23587b(phoneNumber2, "phoneNumber");
        C7573i.m23587b(commonUserInfo, "commonUserInfo");
        super(str, loginMethodName, commonUserInfo, null, 8, null);
        this.phoneNumber = phoneNumber2;
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, String str2, String str3, String str4) {
        C7573i.m23587b(str, "uid");
        C7573i.m23587b(loginMethodName, "loginMethodName");
        C7573i.m23587b(str2, "countryCodeName");
        C7573i.m23587b(str3, "countryCode");
        C7573i.m23587b(str4, "nationalNumber");
        this(str, loginMethodName, new PhoneNumber(), null, 8, null);
        this.phoneNumber.setCountryIso(str2);
        this.phoneNumber.setCountryCode(Integer.parseInt(parseNumber(str3)));
        this.phoneNumber.setNationalNumber(Long.parseLong(parseNumber(str4)));
    }

    public /* synthetic */ PhoneLoginMethod(String str, LoginMethodName loginMethodName, PhoneNumber phoneNumber2, CommonUserInfo commonUserInfo, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            loginMethodName = LoginMethodName.PHONE_SMS;
        }
        if ((i & 8) != 0) {
            commonUserInfo = C21562a.m72275a();
        }
        this(str, loginMethodName, phoneNumber2, commonUserInfo);
    }

    public /* synthetic */ PhoneLoginMethod(String str, LoginMethodName loginMethodName, String str2, String str3, String str4, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            loginMethodName = LoginMethodName.PHONE_SMS;
        }
        LoginMethodName loginMethodName2 = loginMethodName;
        if ((i & 4) != 0) {
            str2 = "";
        }
        this(str, loginMethodName2, str2, str3, str4);
    }
}
