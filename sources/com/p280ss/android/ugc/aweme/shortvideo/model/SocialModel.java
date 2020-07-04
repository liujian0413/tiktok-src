package com.p280ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.SocialModel */
public class SocialModel implements Parcelable, Serializable {
    public static final Creator<SocialModel> CREATOR = new Creator<SocialModel>() {
        public final SocialModel[] newArray(int i) {
            return new SocialModel[i];
        }

        public final SocialModel createFromParcel(Parcel parcel) {
            return new SocialModel(parcel);
        }
    };
    @C6593c(mo15949a = "friends")
    public List<String> friends;
    @C6593c(mo15949a = "rec_users")
    public List<String> recUsers;
    @C6593c(mo15949a = "recommend")
    public int recommend;

    public SocialModel() {
    }

    public int describeContents() {
        return 0;
    }

    public String getFriends() {
        if (this.friends == null || this.friends.size() == 0) {
            return null;
        }
        return TextUtils.join(",", this.friends);
    }

    public String getRecUsers() {
        if (this.recUsers == null || this.recUsers.size() == 0) {
            return null;
        }
        return TextUtils.join(",", this.recUsers);
    }

    protected SocialModel(Parcel parcel) {
        this.recommend = parcel.readInt();
        this.friends = parcel.createStringArrayList();
        this.recUsers = parcel.createStringArrayList();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.recommend);
        parcel.writeStringList(this.friends);
        parcel.writeStringList(this.recUsers);
    }
}
