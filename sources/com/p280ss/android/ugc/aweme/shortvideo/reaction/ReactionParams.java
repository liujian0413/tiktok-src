package com.p280ss.android.ugc.aweme.shortvideo.reaction;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p280ss.android.ugc.asve.recorder.reaction.model.ReactionWindowShape;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams */
public class ReactionParams implements Parcelable, Serializable {
    public static final Creator<ReactionParams> CREATOR = new Creator<ReactionParams>() {
        /* renamed from: a */
        private static ReactionParams[] m128622a(int i) {
            return new ReactionParams[i];
        }

        /* renamed from: a */
        private static ReactionParams m128621a(Parcel parcel) {
            return new ReactionParams(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m128621a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m128622a(i);
        }
    };
    @C6593c(mo15949a = "non_reacted_video")
    public boolean nonReacted;
    @C6593c(mo15949a = "reaction_from_author")
    public User reactionFromAuthor;
    @C6593c(mo15949a = "reaction_from_id")
    public String reactionFromId;
    @C6593c(mo15949a = "reaction_origin_id")
    public String reactionOriginId;
    @C6593c(mo15949a = "reaction_view_id")
    public String reactionViewId;
    @C6593c(mo15949a = "react_shape")
    public ReactionWindowShape shape;
    @C6593c(mo15949a = "video_height")
    public int videoHeight;
    @C6593c(mo15949a = "video_path")
    public String videoPath;
    @C6593c(mo15949a = "video_width")
    public int videoWidth;
    @C6593c(mo15949a = "wav_path")
    public String wavPath;
    @C6593c(mo15949a = "react_shape_list")
    public List<ReactionWindowInfo> windowInfoList = new ArrayList();

    public int describeContents() {
        return 0;
    }

    public ReactionParams() {
    }

    public boolean removeReactionWindowInfo() {
        if (this.windowInfoList.size() <= 0) {
            return false;
        }
        this.windowInfoList.remove(this.windowInfoList.size() - 1);
        return true;
    }

    public void addReactionWindowInfo(ReactionWindowInfo reactionWindowInfo) {
        this.windowInfoList.add(reactionWindowInfo);
    }

    protected ReactionParams(Parcel parcel) {
        boolean z;
        this.videoPath = parcel.readString();
        this.wavPath = parcel.readString();
        this.videoWidth = parcel.readInt();
        this.videoHeight = parcel.readInt();
        this.reactionViewId = parcel.readString();
        this.reactionOriginId = parcel.readString();
        this.reactionFromId = parcel.readString();
        this.reactionFromAuthor = (User) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.nonReacted = z;
        this.shape = (ReactionWindowShape) parcel.readSerializable();
        this.windowInfoList = parcel.createTypedArrayList(ReactionWindowInfo.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.wavPath);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeString(this.reactionViewId);
        parcel.writeString(this.reactionOriginId);
        parcel.writeString(this.reactionFromId);
        parcel.writeSerializable(this.reactionFromAuthor);
        parcel.writeByte(this.nonReacted ? (byte) 1 : 0);
        parcel.writeSerializable(this.shape);
        parcel.writeTypedList(this.windowInfoList);
    }
}
