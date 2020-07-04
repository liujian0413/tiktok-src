package com.bytedance.android.live.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.bytedance.android.live.C2317a;
import com.google.gson.p276a.C6593c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public class ImageModel implements Parcelable {
    public static final Creator<ImageModel> CREATOR = new Creator<ImageModel>() {
        /* renamed from: a */
        private static ImageModel[] m9953a(int i) {
            return new ImageModel[i];
        }

        /* renamed from: a */
        private static ImageModel m9952a(Parcel parcel) {
            return new ImageModel(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m9952a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m9953a(i);
        }
    };
    private static final int HASH_CODE_31 = 31;
    @C6593c(mo15949a = "avg_color")
    public String avgColor;
    @C6593c(mo15949a = "content")
    Content content;
    @C6593c(mo15949a = "height")
    public int height;
    @C6593c(mo15949a = "image_type")
    int imageType;
    @C6593c(mo15949a = "is_animated")
    boolean isAnimated;
    private boolean isFeedCandidate;
    private boolean isLoaded;
    private boolean isMonitored;
    @C6593c(mo15949a = "uri")
    public String mUri;
    @C6593c(mo15949a = "url_list")
    public List<String> mUrls = new ArrayList();
    @C6593c(mo15949a = "open_web_url")
    public String schema;
    @C6593c(mo15949a = "width")
    public int width;

    public static class Content implements Parcelable {
        public static final Creator<Content> CREATOR = new Creator<Content>() {
            /* renamed from: a */
            private static Content[] m9956a(int i) {
                return new Content[i];
            }

            /* renamed from: a */
            private static Content m9955a(Parcel parcel) {
                return new Content(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m9955a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m9956a(i);
            }
        };
        @C6593c(mo15949a = "name")

        /* renamed from: a */
        public String f7648a;
        @C6593c(mo15949a = "font_color")

        /* renamed from: b */
        public String f7649b;
        @C6593c(mo15949a = "level")

        /* renamed from: c */
        public long f7650c;

        public Content() {
        }

        public int describeContents() {
            return 0;
        }

        protected Content(Parcel parcel) {
            this.f7648a = parcel.readString();
            this.f7649b = parcel.readString();
            this.f7650c = parcel.readLong();
        }

        /* renamed from: a */
        public static boolean m9954a(Content content) {
            if (content == null || TextUtils.isEmpty(content.f7648a) || TextUtils.isEmpty(content.f7649b)) {
                return false;
            }
            return true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f7648a);
            parcel.writeString(this.f7649b);
            parcel.writeLong(this.f7650c);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getAvgColor() {
        return this.avgColor;
    }

    public int getHeight() {
        return this.height;
    }

    @C6593c(mo15949a = "content")
    public Content getImageContent() {
        return this.content;
    }

    @C6593c(mo15949a = "image_type")
    public int getImageType() {
        return this.imageType;
    }

    @C6593c(mo15949a = "open_web_url")
    public String getSchema() {
        return this.schema;
    }

    @C6593c(mo15949a = "uri")
    public String getUri() {
        return this.mUri;
    }

    @C6593c(mo15949a = "url_list")
    public List<String> getUrls() {
        return this.mUrls;
    }

    public int getWidth() {
        return this.width;
    }

    @C6593c(mo15949a = "is_animated")
    public boolean isAnimated() {
        return this.isAnimated;
    }

    public boolean isFeedCandidate() {
        return this.isFeedCandidate;
    }

    public boolean isLoaded() {
        return this.isLoaded;
    }

    public boolean isMonitored() {
        return this.isMonitored;
    }

    public ImageModel() {
    }

    public int hashCode() {
        return hash(this.avgColor, this.mUri, this.mUrls, Integer.valueOf(this.width), Integer.valueOf(this.height));
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("{\"uri\":");
        sb.append("\"");
        if (this.mUri == null) {
            str = "";
        } else {
            str = this.mUri;
        }
        sb.append(str);
        sb.append("\",\"image_type\":\"");
        if (this.schema == null) {
            str2 = "";
        } else {
            str2 = this.schema;
        }
        sb.append(str2);
        sb.append("\",\"url_list\":[");
        if (this.mUrls != null) {
            int size = this.mUrls.size();
            for (int i = 0; i < size; i++) {
                sb.append("\"");
                sb.append((String) this.mUrls.get(i));
                sb.append("\"");
                if (i != size - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append("]}");
        return sb.toString();
    }

    @C6593c(mo15949a = "is_animated")
    public void setAnimated(boolean z) {
        this.isAnimated = z;
    }

    public void setAvgColor(String str) {
        this.avgColor = str;
    }

    @C6593c(mo15949a = "content")
    public void setContent(Content content2) {
        this.content = content2;
    }

    public void setFeedCandidate(boolean z) {
        this.isFeedCandidate = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @C6593c(mo15949a = "image_type")
    public void setImageType(int i) {
        this.imageType = i;
    }

    public void setLoaded(boolean z) {
        this.isLoaded = z;
    }

    public void setMonitored(boolean z) {
        this.isMonitored = z;
    }

    @C6593c(mo15949a = "open_web_url")
    public void setSchema(String str) {
        this.schema = str;
    }

    @C6593c(mo15949a = "uri")
    public void setUri(String str) {
        this.mUri = str;
    }

    @C6593c(mo15949a = "url_list")
    public void setUrls(List<String> list) {
        this.mUrls = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static ImageModel fromJson(String str) {
        return (ImageModel) C2317a.m9932a().mo15974a(str, ImageModel.class);
    }

    public static ImageModel genBy(String str) {
        ImageModel imageModel = new ImageModel();
        imageModel.setUrls(Collections.singletonList(str));
        return imageModel;
    }

    public static String toJsonString(ImageModel imageModel) {
        if (imageModel == null) {
            return "";
        }
        return C2317a.m9932a().mo15979b((Object) imageModel);
    }

    public static ImageModel fromJson(JSONObject jSONObject) {
        return (ImageModel) C2317a.m9932a().mo15974a(jSONObject.toString(), ImageModel.class);
    }

    private static int hash(Object... objArr) {
        int i;
        if (objArr == null) {
            return 0;
        }
        int i2 = 1;
        for (Object obj : objArr) {
            int i3 = i2 * 31;
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            i2 = i3 + i;
        }
        return i2;
    }

    protected ImageModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.mUri = parcel.readString();
        this.mUrls = parcel.createStringArrayList();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.schema = parcel.readString();
        this.imageType = parcel.readInt();
        this.content = (Content) parcel.readParcelable(Content.class.getClassLoader());
        boolean z4 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAnimated = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isLoaded = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isMonitored = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        }
        this.isFeedCandidate = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageModel imageModel = (ImageModel) obj;
        if (this.width != imageModel.width || this.height != imageModel.height || !equals(this.avgColor, imageModel.avgColor) || !equals(this.mUri, imageModel.mUri) || !equals(this.mUrls, imageModel.mUrls)) {
            return false;
        }
        return true;
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public ImageModel(String str, List<String> list) {
        this.mUri = str;
        this.mUrls = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUri);
        parcel.writeStringList(this.mUrls);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.schema);
        parcel.writeInt(this.imageType);
        parcel.writeParcelable(this.content, i);
        parcel.writeByte(this.isAnimated ? (byte) 1 : 0);
        parcel.writeByte(this.isLoaded ? (byte) 1 : 0);
        parcel.writeByte(this.isMonitored ? (byte) 1 : 0);
        parcel.writeByte(this.isFeedCandidate ? (byte) 1 : 0);
    }

    public ImageModel(String str, List<String> list, String str2) {
        this.mUri = str;
        this.mUrls = list;
        this.schema = str2;
    }
}
