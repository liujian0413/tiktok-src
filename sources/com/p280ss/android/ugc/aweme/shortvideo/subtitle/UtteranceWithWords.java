package com.p280ss.android.ugc.aweme.shortvideo.subtitle;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.C9738o;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords */
public class UtteranceWithWords implements Parcelable, Serializable, Cloneable {
    public static final C41106a CREATOR = new C41106a(null);
    @C6593c(mo15949a = "end_time")
    private int endTime;
    @C6593c(mo15949a = "init_height")
    private int initHeight;
    @C6593c(mo15949a = "init_width")
    private int initWidth;
    @C6593c(mo15949a = "start_time")
    private int startTime;
    @C6593c(mo15949a = "text")
    private String text;
    @C6593c(mo15949a = "words")
    private List<C41119h> words;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords$a */
    public static final class C41106a implements Creator<UtteranceWithWords> {
        private C41106a() {
        }

        /* renamed from: a */
        private static UtteranceWithWords[] m131284a(int i) {
            return new UtteranceWithWords[i];
        }

        public /* synthetic */ C41106a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m131283a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m131284a(i);
        }

        /* renamed from: a */
        private static UtteranceWithWords m131283a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new UtteranceWithWords(parcel);
        }
    }

    public int describeContents() {
        return 0;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final int getInitHeight() {
        return this.initHeight;
    }

    public final int getInitWidth() {
        return this.initWidth;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final String getText() {
        return this.text;
    }

    public final List<C41119h> getWords() {
        return this.words;
    }

    public Object clone() {
        return super.clone();
    }

    public UtteranceWithWords() {
        this.text = "";
        this.words = C7525m.m23461a();
    }

    private final int provideInitWidth() {
        return Math.min((this.text.length() * 42) + ((int) C9738o.m28708b((Context) C35563c.f93238a, ((float) SubtitleTextView.f106957a) * 2.0f)), 672);
    }

    public int hashCode() {
        return (((this.startTime * 31) + Integer.valueOf(this.endTime).hashCode()) * 31) + this.text.hashCode();
    }

    private final int provideInitHeight() {
        if ((this.text.length() * 42) + ((int) C9738o.m28708b((Context) C35563c.f93238a, ((float) SubtitleTextView.f106957a) * 2.0f)) != this.initWidth) {
            return (int) (C9738o.m28708b((Context) C35563c.f93238a, (((float) SubtitleTextView.f106957a) * 2.0f) + ((float) SubtitleTextView.f106958b)) + 84.0f);
        }
        return ((int) C9738o.m28708b((Context) C35563c.f93238a, ((float) SubtitleTextView.f106957a) * 2.0f)) + 42;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setInitHeight(int i) {
        this.initHeight = i;
    }

    public final void setInitWidth(int i) {
        this.initWidth = i;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final void setText(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.text = str;
    }

    public final void setWords(List<C41119h> list) {
        C7573i.m23587b(list, "<set-?>");
        this.words = list;
    }

    public UtteranceWithWords(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this();
        this.startTime = parcel.readInt();
        this.endTime = parcel.readInt();
        String readString = parcel.readString();
        C7573i.m23582a((Object) readString, "parcel.readString()");
        this.text = readString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItemModel)) {
            return false;
        }
        UtteranceWithWords utteranceWithWords = (UtteranceWithWords) obj;
        if (this.startTime == utteranceWithWords.startTime && this.endTime == utteranceWithWords.endTime && !(!C7573i.m23585a((Object) this.text, (Object) utteranceWithWords.text))) {
            return true;
        }
        return false;
    }

    public UtteranceWithWords(StickerItemModel stickerItemModel) {
        C7573i.m23587b(stickerItemModel, "item");
        this();
        this.startTime = stickerItemModel.startTime;
        this.endTime = stickerItemModel.endTime;
        String text2 = stickerItemModel.getText();
        C7573i.m23582a((Object) text2, "item.text");
        this.text = text2;
        this.initWidth = provideInitWidth();
        this.initHeight = provideInitHeight();
    }

    public UtteranceWithWords(UtteranceWithWords utteranceWithWords) {
        C7573i.m23587b(utteranceWithWords, "utterance");
        this();
        this.startTime = utteranceWithWords.startTime;
        this.endTime = utteranceWithWords.endTime;
        this.text = utteranceWithWords.text;
        this.words = utteranceWithWords.words;
        this.initWidth = provideInitWidth();
        this.initHeight = provideInitHeight();
    }

    public UtteranceWithWords(int i, int i2) {
        this();
        this.startTime = i;
        this.endTime = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeString(this.text);
    }

    public UtteranceWithWords(int i, int i2, String str) {
        C7573i.m23587b(str, "text");
        this();
        this.startTime = i;
        this.endTime = i2;
        this.text = str;
        this.initWidth = provideInitWidth();
        this.initHeight = provideInitHeight();
    }
}
