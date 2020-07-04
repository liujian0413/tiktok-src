package com.p280ss.android.ugc.aweme.infosticker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7577n;

/* renamed from: com.ss.android.ugc.aweme.infosticker.StickerChallenge */
public final class StickerChallenge implements Parcelable, Serializable {
    public static final C32073a CREATOR = new C32073a(null);
    private List<AVChallenge> recordStickerChallengeList;
    private List<String> stickerList;
    private HashMap<String, AVChallenge> stickerToChallenge;

    /* renamed from: com.ss.android.ugc.aweme.infosticker.StickerChallenge$a */
    public static final class C32073a implements Creator<StickerChallenge> {
        private C32073a() {
        }

        /* renamed from: a */
        private static StickerChallenge[] m104109a(int i) {
            return new StickerChallenge[i];
        }

        public /* synthetic */ C32073a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m104108a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m104109a(i);
        }

        /* renamed from: a */
        private static StickerChallenge m104108a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new StickerChallenge(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final List<AVChallenge> getRecordStickerChallengeList() {
        return this.recordStickerChallengeList;
    }

    public final List<String> getStickerList() {
        return this.stickerList;
    }

    public final HashMap<String, AVChallenge> getStickerToChallenge() {
        return this.stickerToChallenge;
    }

    public final Collection<AVChallenge> infoStickerChallenges() {
        Collection<AVChallenge> values = this.stickerToChallenge.values();
        C7573i.m23582a((Object) values, "stickerToChallenge.values");
        return values;
    }

    public StickerChallenge() {
        this.stickerList = new ArrayList();
        this.stickerToChallenge = new HashMap<>();
        this.recordStickerChallengeList = new ArrayList();
    }

    public final void setRecordStickerChallengeList(List<AVChallenge> list) {
        C7573i.m23587b(list, "<set-?>");
        this.recordStickerChallengeList = list;
    }

    public final void setStickerList(List<String> list) {
        C7573i.m23587b(list, "<set-?>");
        this.stickerList = list;
    }

    public final void setStickerToChallenge(HashMap<String, AVChallenge> hashMap) {
        C7573i.m23587b(hashMap, "<set-?>");
        this.stickerToChallenge = hashMap;
    }

    public StickerChallenge(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this();
        parcel.readStringList(this.stickerList);
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable != null) {
            this.stickerToChallenge = (HashMap) readSerializable;
            ArrayList readArrayList = parcel.readArrayList(AVChallenge.class.getClassLoader());
            if (readArrayList != null) {
                this.recordStickerChallengeList = C7577n.m23624d(readArrayList);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.shortvideo.AVChallenge>");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, com.ss.android.ugc.aweme.shortvideo.AVChallenge> /* = java.util.HashMap<kotlin.String, com.ss.android.ugc.aweme.shortvideo.AVChallenge> */");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "dest");
        parcel.writeStringList(this.stickerList);
        parcel.writeSerializable(this.stickerToChallenge);
        parcel.writeList(this.recordStickerChallengeList);
    }
}
