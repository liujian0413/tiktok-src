package com.p280ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource */
public class GameDuetResource implements Parcelable {
    public static final Creator<GameDuetResource> CREATOR = new Creator<GameDuetResource>() {
        public final GameDuetResource[] newArray(int i) {
            return new GameDuetResource[i];
        }

        public final GameDuetResource createFromParcel(Parcel parcel) {
            return new GameDuetResource(parcel);
        }
    };
    public int gameScore;
    public FaceStickerBean gameSticker;

    public int describeContents() {
        return 0;
    }

    protected GameDuetResource(Parcel parcel) {
        this.gameScore = parcel.readInt();
        this.gameSticker = (FaceStickerBean) parcel.readParcelable(FaceStickerBean.class.getClassLoader());
    }

    public GameDuetResource(int i, FaceStickerBean faceStickerBean) {
        this.gameScore = i;
        this.gameSticker = faceStickerBean;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.gameScore);
        parcel.writeParcelable(this.gameSticker, i);
    }
}
