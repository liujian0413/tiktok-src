package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p1848vk.sdk.api.model.VKList.C47196a;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKPhotoSizes */
public class VKPhotoSizes extends VKList<VKApiPhotoSize> implements Parcelable {
    public static Creator<VKPhotoSizes> CREATOR = new Creator<VKPhotoSizes>() {
        /* renamed from: a */
        private static VKPhotoSizes[] m147638a(int i) {
            return new VKPhotoSizes[i];
        }

        /* renamed from: a */
        private static VKPhotoSizes m147637a(Parcel parcel) {
            return new VKPhotoSizes(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147637a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147638a(i);
        }
    };

    /* renamed from: d */
    private static float f121334d = 1.0f;

    /* renamed from: b */
    public int f121335b;

    /* renamed from: c */
    public int f121336c;

    /* renamed from: e */
    private String f121337e;

    /* renamed from: f */
    private int f121338f;

    /* renamed from: g */
    private final C47196a<VKApiPhotoSize> f121339g;

    /* renamed from: a */
    public final void mo118656a() {
        Collections.sort(this);
    }

    public int describeContents() {
        return 0;
    }

    public VKPhotoSizes() {
        this.f121335b = 1;
        this.f121336c = 1;
        this.f121339g = new C47196a<VKApiPhotoSize>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public VKApiPhotoSize mo118614a(JSONObject jSONObject) throws Exception {
                return VKApiPhotoSize.m147523a(jSONObject, VKPhotoSizes.this.f121335b, VKPhotoSizes.this.f121336c);
            }
        };
    }

    /* renamed from: a */
    public final String mo118655a(char c) {
        Iterator it = iterator();
        while (it.hasNext()) {
            VKApiPhotoSize vKApiPhotoSize = (VKApiPhotoSize) it.next();
            if (vKApiPhotoSize.f121138d == c) {
                return vKApiPhotoSize.f121135a;
            }
        }
        return null;
    }

    private VKPhotoSizes(Parcel parcel) {
        super(parcel);
        this.f121335b = 1;
        this.f121336c = 1;
        this.f121339g = new C47196a<VKApiPhotoSize>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public VKApiPhotoSize mo118614a(JSONObject jSONObject) throws Exception {
                return VKApiPhotoSize.m147523a(jSONObject, VKPhotoSizes.this.f121335b, VKPhotoSizes.this.f121336c);
            }
        };
        this.f121335b = parcel.readInt();
        this.f121336c = parcel.readInt();
        this.f121337e = parcel.readString();
        this.f121338f = parcel.readInt();
    }

    /* renamed from: a */
    public final void mo118658a(JSONArray jSONArray) {
        mo118621a(jSONArray, this.f121339g);
        mo118656a();
    }

    /* renamed from: a */
    public final void mo118657a(int i, int i2) {
        if (i != 0) {
            this.f121335b = i;
        }
        if (i2 != 0) {
            this.f121336c = i2;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f121335b);
        parcel.writeInt(this.f121336c);
        parcel.writeString(this.f121337e);
        parcel.writeInt(this.f121338f);
    }
}
