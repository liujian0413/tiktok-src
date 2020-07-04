package com.kakao.usermgmt.response.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.kakao.auth.Session;
import com.kakao.network.response.ResponseBody;
import com.kakao.network.response.ResponseBody.ResponseBodyException;
import com.kakao.util.helper.SharedPreferencesCache;
import java.util.HashMap;
import java.util.Map;

public class UserProfile implements Parcelable, User {
    public static final Creator<UserProfile> CREATOR = new Creator<UserProfile>() {
        public final UserProfile[] newArray(int i) {
            return new UserProfile[i];
        }

        public final UserProfile createFromParcel(Parcel parcel) {
            return new UserProfile(parcel);
        }
    };
    private String email;
    private boolean emailVerified;

    /* renamed from: id */
    private final long f50115id;
    private String nickname;
    private String profileImagePath;
    private Map<String, String> properties = new HashMap();
    private final int remainingGroupMsgCount;
    private final int remainingInviteCount;
    private final long serviceUserId;
    private String thumbnailImagePath;
    private final String uuid;

    public int describeContents() {
        return 0;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean getEmailVerified() {
        return this.emailVerified;
    }

    public long getId() {
        return this.f50115id;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getProfileImagePath() {
        return this.profileImagePath;
    }

    public Map<String, String> getProperties() {
        return this.properties;
    }

    public int getRemainingGroupMsgCount() {
        return this.remainingGroupMsgCount;
    }

    public int getRemainingInviteCount() {
        return this.remainingInviteCount;
    }

    public long getServiceUserId() {
        return this.serviceUserId;
    }

    public String getThumbnailImagePath() {
        return this.thumbnailImagePath;
    }

    public String getUUID() {
        return this.uuid;
    }

    public static UserProfile loadFromCache() {
        SharedPreferencesCache appCache = Session.getCurrentSession().getAppCache();
        if (appCache == null) {
            return null;
        }
        return new UserProfile(appCache);
    }

    public void saveUserToCache() {
        SharedPreferencesCache appCache = Session.getCurrentSession().getAppCache();
        if (appCache != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("com.kakao.user.userId", this.f50115id);
            bundle.putString("com.kakao.user.email", this.email);
            bundle.putBoolean("com.kakao.user.email_verified", this.emailVerified);
            bundle.putString("com.kakao.user.nickname", this.nickname);
            bundle.putString("com.kakao.user.thumbbnailpath", this.thumbnailImagePath);
            bundle.putString("com.kakao.user.profilepath", this.profileImagePath);
            bundle.putString("com.kakao.user.uuid", this.uuid);
            bundle.putLong("com.kakao.user.serviceuserid", this.serviceUserId);
            bundle.putInt("com.kakao.user.remaininginvitecount", this.remainingInviteCount);
            bundle.putInt("com.kakao.user.remaininggroupmsgcount", this.remainingGroupMsgCount);
            if (!this.properties.isEmpty()) {
                for (String str : this.properties.keySet()) {
                    StringBuilder sb = new StringBuilder("com.kakao.user.properties.");
                    sb.append(str);
                    bundle.putString(sb.toString(), (String) this.properties.get(str));
                }
            }
            appCache.save(bundle);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserProfile{nickname='");
        sb.append(this.nickname);
        sb.append('\'');
        sb.append(", email='");
        sb.append(this.email);
        sb.append('\'');
        sb.append(", email_verified='");
        sb.append(this.emailVerified);
        sb.append('\'');
        sb.append(", thumbnailImagePath='");
        sb.append(this.thumbnailImagePath);
        sb.append('\'');
        sb.append(", profileImagePath='");
        sb.append(this.profileImagePath);
        sb.append('\'');
        sb.append(", code='");
        sb.append(this.uuid);
        sb.append('\'');
        sb.append(", serviceUserId='");
        sb.append(this.serviceUserId);
        sb.append('\'');
        sb.append(", remainingInviteCount='");
        sb.append(this.remainingInviteCount);
        sb.append('\'');
        sb.append(", remainingGroupMsgCount='");
        sb.append(this.remainingGroupMsgCount);
        sb.append('\'');
        sb.append(", properties=");
        sb.append(this.properties);
        sb.append('}');
        return sb.toString();
    }

    public String getProperty(String str) {
        if (this.properties != null) {
            return (String) this.properties.get(str);
        }
        return null;
    }

    public UserProfile updateUserProfile(Map<String, String> map) {
        if (map != null) {
            String str = (String) map.remove("nickname");
            if (str != null) {
                this.nickname = str;
            }
            String str2 = (String) map.remove("thumbnail_image");
            if (str2 != null) {
                this.thumbnailImagePath = str2;
            }
            String str3 = (String) map.remove("profile_image");
            if (str3 != null) {
                this.profileImagePath = str3;
            }
            if (!map.isEmpty()) {
                this.properties.putAll(map);
            }
        }
        return this;
    }

    public UserProfile(Parcel parcel) {
        boolean z;
        this.f50115id = parcel.readLong();
        this.email = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.emailVerified = z;
        this.nickname = parcel.readString();
        this.thumbnailImagePath = parcel.readString();
        this.profileImagePath = parcel.readString();
        this.uuid = parcel.readString();
        this.serviceUserId = parcel.readLong();
        this.remainingInviteCount = parcel.readInt();
        this.remainingGroupMsgCount = parcel.readInt();
        parcel.readMap(this.properties, getClass().getClassLoader());
    }

    public UserProfile(ResponseBody responseBody) throws ResponseBodyException {
        this.f50115id = responseBody.getLong("id");
        if (this.f50115id > 0) {
            this.email = responseBody.optString("kaccount_email", null);
            this.emailVerified = responseBody.optBoolean("kaccount_email_verified", false);
            this.uuid = responseBody.optString("uuid", null);
            this.serviceUserId = responseBody.optLong("service_user_id", 0);
            this.remainingInviteCount = responseBody.optInt("remaining_invite_count", 0);
            this.remainingGroupMsgCount = responseBody.optInt("remaining_group_msg_count", 0);
            if (responseBody.has("properties")) {
                this.properties = ResponseBody.toMap(responseBody.getBody("properties"));
                this.nickname = (String) this.properties.remove("nickname");
                this.thumbnailImagePath = (String) this.properties.remove("thumbnail_image");
                this.profileImagePath = (String) this.properties.remove("profile_image");
                return;
            }
            this.nickname = null;
            this.thumbnailImagePath = null;
            this.profileImagePath = null;
            return;
        }
        throw new ResponseBodyException("User is called but the result user is null.");
    }

    public UserProfile(SharedPreferencesCache sharedPreferencesCache) {
        this.f50115id = sharedPreferencesCache.getLong("com.kakao.user.userId").longValue();
        this.email = sharedPreferencesCache.getString("com.kakao.user.email");
        this.emailVerified = sharedPreferencesCache.getBoolean("com.kakao.user.email_verified").booleanValue();
        this.nickname = sharedPreferencesCache.getString("com.kakao.user.nickname");
        this.thumbnailImagePath = sharedPreferencesCache.getString("com.kakao.user.thumbbnailpath");
        this.profileImagePath = sharedPreferencesCache.getString("com.kakao.user.profilepath");
        this.properties = sharedPreferencesCache.getStringMap("com.kakao.user.properties.");
        this.uuid = sharedPreferencesCache.getString("com.kakao.user.uuid");
        this.serviceUserId = sharedPreferencesCache.getLong("com.kakao.user.serviceuserid").longValue();
        this.remainingInviteCount = sharedPreferencesCache.getInt("com.kakao.user.remaininginvitecount");
        this.remainingGroupMsgCount = sharedPreferencesCache.getInt("com.kakao.user.remaininggroupmsgcount");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f50115id);
        parcel.writeString(this.email);
        parcel.writeInt(this.emailVerified ? 1 : 0);
        parcel.writeString(this.nickname);
        parcel.writeString(this.thumbnailImagePath);
        parcel.writeString(this.profileImagePath);
        parcel.writeString(this.uuid);
        parcel.writeLong(this.serviceUserId);
        parcel.writeInt(this.remainingInviteCount);
        parcel.writeInt(this.remainingGroupMsgCount);
        parcel.writeMap(this.properties);
    }
}
