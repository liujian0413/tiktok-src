package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p1848vk.sdk.api.model.VKList.C47196a;
import com.p1848vk.sdk.p1849a.C47108b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKAttachments */
public class VKAttachments extends VKList<VKApiAttachment> implements Parcelable {
    public static Creator<VKAttachments> CREATOR = new Creator<VKAttachments>() {
        /* renamed from: a */
        private static VKAttachments[] m147601a(int i) {
            return new VKAttachments[i];
        }

        /* renamed from: a */
        private static VKAttachments m147600a(Parcel parcel) {
            return new VKAttachments(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147600a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147601a(i);
        }
    };

    /* renamed from: b */
    private final C47196a<VKApiAttachment> f121328b = new C47196a<VKApiAttachment>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo118614a(JSONObject jSONObject) throws Exception {
            return m147598b(jSONObject);
        }

        /* renamed from: b */
        private static VKApiAttachment m147598b(JSONObject jSONObject) throws Exception {
            String optString = jSONObject.optString("type");
            if ("photo".equals(optString)) {
                return new VKApiPhoto().mo118445b(jSONObject.getJSONObject("photo"));
            }
            if ("video".equals(optString)) {
                return new VKApiVideo().mo118445b(jSONObject.getJSONObject("video"));
            }
            if ("audio".equals(optString)) {
                return new VKApiAudio().mo118445b(jSONObject.getJSONObject("audio"));
            }
            if ("doc".equals(optString)) {
                return new VKApiDocument().mo118445b(jSONObject.getJSONObject("doc"));
            }
            if ("wall".equals(optString)) {
                return new VKApiPost().mo118445b(jSONObject.getJSONObject("wall"));
            }
            if ("posted_photo".equals(optString)) {
                return new VKApiPostedPhoto().mo118445b(jSONObject.getJSONObject("posted_photo"));
            }
            if ("link".equals(optString)) {
                return new VKApiLink().mo118445b(jSONObject.getJSONObject("link"));
            }
            if ("note".equals(optString)) {
                return new VKApiNote().mo118445b(jSONObject.getJSONObject("note"));
            }
            if ("app".equals(optString)) {
                return new VKApiApplicationContent().mo118445b(jSONObject.getJSONObject("app"));
            }
            if ("poll".equals(optString)) {
                return new VKApiPoll().mo118445b(jSONObject.getJSONObject("poll"));
            }
            if ("page".equals(optString)) {
                return new VKApiWikiPage().mo118445b(jSONObject.getJSONObject("page"));
            }
            if ("album".equals(optString)) {
                return new VKApiPhotoAlbum().mo118445b(jSONObject.getJSONObject("album"));
            }
            return null;
        }
    };

    /* renamed from: com.vk.sdk.api.model.VKAttachments$VKApiAttachment */
    public static abstract class VKApiAttachment extends VKApiModel implements C47207a {
        /* renamed from: a */
        public abstract CharSequence mo118444a();

        /* renamed from: b */
        public abstract String mo118446b();
    }

    public int describeContents() {
        return 0;
    }

    public VKAttachments() {
    }

    /* renamed from: a */
    public final String mo118610a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(((VKApiAttachment) it.next()).mo118444a());
        }
        return C47108b.m147300a((Collection<?>) arrayList, ",");
    }

    /* renamed from: a */
    public final void mo118611a(JSONArray jSONArray) {
        super.mo118621a(jSONArray, this.f121328b);
    }

    public VKAttachments(List<? extends VKApiAttachment> list) {
        super(list);
    }

    public VKAttachments(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            if ("photo".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiPhoto.class.getClassLoader()));
            } else if ("video".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiVideo.class.getClassLoader()));
            } else if ("audio".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiAudio.class.getClassLoader()));
            } else if ("doc".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiDocument.class.getClassLoader()));
            } else if ("wall".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiPost.class.getClassLoader()));
            } else if ("posted_photo".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiPostedPhoto.class.getClassLoader()));
            } else if ("link".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiLink.class.getClassLoader()));
            } else if ("note".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiNote.class.getClassLoader()));
            } else if ("app".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiApplicationContent.class.getClassLoader()));
            } else if ("poll".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiPoll.class.getClassLoader()));
            } else if ("page".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiWikiPage.class.getClassLoader()));
            } else if ("album".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiPhotoAlbum.class.getClassLoader()));
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            VKApiAttachment vKApiAttachment = (VKApiAttachment) it.next();
            parcel.writeString(vKApiAttachment.mo118446b());
            parcel.writeParcelable(vKApiAttachment, 0);
        }
    }
}
