package com.kakao.usermgmt.response.model;

import com.kakao.network.response.ResponseBody;
import com.kakao.util.OptionalBoolean;
import org.json.JSONObject;

public class UserAccount {
    private AgeRange ageRange;
    private String birthday;
    private String displayId;
    private String email;
    private Gender gender;
    private OptionalBoolean hasAgeRange;
    private OptionalBoolean hasBirthday;
    private OptionalBoolean hasEmail;
    private OptionalBoolean hasGender;
    private OptionalBoolean hasPhoneNumber;
    private OptionalBoolean isEmailVerified;
    private OptionalBoolean isKakaoTalkUser;
    private String phoneNumber;
    private JSONObject response;

    public AgeRange getAgeRange() {
        return this.ageRange;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getDisplayId() {
        return this.displayId;
    }

    public String getEmail() {
        return this.email;
    }

    public Gender getGender() {
        return this.gender;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public JSONObject getResponse() {
        return this.response;
    }

    public OptionalBoolean hasAgeRange() {
        return this.hasAgeRange;
    }

    public OptionalBoolean hasBirthday() {
        return this.hasBirthday;
    }

    public OptionalBoolean hasEmail() {
        return this.hasEmail;
    }

    public OptionalBoolean hasGender() {
        return this.hasGender;
    }

    public OptionalBoolean hasPhoneNumber() {
        return this.hasPhoneNumber;
    }

    public OptionalBoolean isEmailVerified() {
        return this.isEmailVerified;
    }

    public OptionalBoolean isKakaoTalkUser() {
        return this.isKakaoTalkUser;
    }

    public boolean needsScopeAccountEmail() {
        if (this.hasEmail == OptionalBoolean.TRUE && this.email == null) {
            return true;
        }
        return false;
    }

    public boolean needsScopeAgeRange() {
        if (this.hasAgeRange == OptionalBoolean.TRUE && this.ageRange == null) {
            return true;
        }
        return false;
    }

    public boolean needsScopeBirthday() {
        if (this.hasBirthday == OptionalBoolean.TRUE && this.birthday == null) {
            return true;
        }
        return false;
    }

    public boolean needsScopeGender() {
        if (this.hasGender == OptionalBoolean.TRUE && this.gender == null) {
            return true;
        }
        return false;
    }

    public boolean needsScopeIsKakaotalkUser() {
        if (this.isKakaoTalkUser == OptionalBoolean.NONE) {
            return true;
        }
        return false;
    }

    public boolean needsScopePhoneNumber() {
        if (this.hasPhoneNumber == OptionalBoolean.TRUE && this.phoneNumber == null) {
            return true;
        }
        return false;
    }

    public UserAccount(ResponseBody responseBody) {
        OptionalBoolean optionalBoolean;
        OptionalBoolean optionalBoolean2;
        OptionalBoolean optionalBoolean3;
        OptionalBoolean optionalBoolean4;
        OptionalBoolean optionalBoolean5;
        OptionalBoolean optionalBoolean6;
        OptionalBoolean optionalBoolean7;
        if (responseBody.has("has_email")) {
            optionalBoolean = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("has_email")));
        } else {
            optionalBoolean = OptionalBoolean.NONE;
        }
        this.hasEmail = optionalBoolean;
        if (responseBody.has("is_email_verified")) {
            optionalBoolean2 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("is_email_verified")));
        } else {
            optionalBoolean2 = OptionalBoolean.NONE;
        }
        this.isEmailVerified = optionalBoolean2;
        if (responseBody.has("has_phone_number")) {
            optionalBoolean3 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("has_phone_number")));
        } else {
            optionalBoolean3 = OptionalBoolean.NONE;
        }
        this.hasPhoneNumber = optionalBoolean3;
        if (responseBody.has("has_age_range")) {
            optionalBoolean4 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("has_age_range")));
        } else {
            optionalBoolean4 = OptionalBoolean.NONE;
        }
        this.hasAgeRange = optionalBoolean4;
        if (responseBody.has("has_birthday")) {
            optionalBoolean5 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("has_birthday")));
        } else {
            optionalBoolean5 = OptionalBoolean.NONE;
        }
        this.hasBirthday = optionalBoolean5;
        if (responseBody.has("has_gender")) {
            optionalBoolean6 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("has_gender")));
        } else {
            optionalBoolean6 = OptionalBoolean.NONE;
        }
        this.hasGender = optionalBoolean6;
        if (responseBody.has("is_kakaotalk_user")) {
            optionalBoolean7 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(responseBody.getBoolean("is_kakaotalk_user")));
        } else {
            optionalBoolean7 = OptionalBoolean.NONE;
        }
        this.isKakaoTalkUser = optionalBoolean7;
        if (responseBody.has("email")) {
            this.email = responseBody.getString("email");
        }
        if (responseBody.has("phone_number")) {
            this.phoneNumber = responseBody.getString("phone_number");
        }
        if (responseBody.has("age_range")) {
            this.ageRange = AgeRange.getRange(responseBody.getString("age_range"));
        }
        if (responseBody.has("birthday")) {
            this.birthday = responseBody.getString("birthday");
        }
        if (responseBody.has("gender")) {
            this.gender = Gender.getGender(responseBody.getString("gender"));
        }
        if (responseBody.has("display_id")) {
            this.displayId = responseBody.getString("display_id");
        }
        this.response = responseBody.getJson();
    }
}
