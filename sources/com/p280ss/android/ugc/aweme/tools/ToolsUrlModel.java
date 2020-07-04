package com.p280ss.android.ugc.aweme.tools;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.ToolsUrlModel */
public class ToolsUrlModel implements Parcelable {
    public static final Creator<ToolsUrlModel> CREATOR = new Creator<ToolsUrlModel>() {
        /* renamed from: a */
        private static ToolsUrlModel[] m134089a(int i) {
            return new ToolsUrlModel[i];
        }

        /* renamed from: a */
        private static ToolsUrlModel m134088a(Parcel parcel) {
            return new ToolsUrlModel(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m134088a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m134089a(i);
        }
    };
    @C6593c(mo15949a = "uri")

    /* renamed from: a */
    public String f109646a;
    @C6593c(mo15949a = "url_list")

    /* renamed from: b */
    public List<String> f109647b;

    public ToolsUrlModel() {
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (this.f109646a.hashCode() * 31) + this.f109647b.hashCode();
    }

    protected ToolsUrlModel(Parcel parcel) {
        this.f109646a = parcel.readString();
        this.f109647b = parcel.createStringArrayList();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToolsUrlModel toolsUrlModel = (ToolsUrlModel) obj;
        if (!this.f109646a.equals(toolsUrlModel.f109646a)) {
            return false;
        }
        return this.f109647b.equals(toolsUrlModel.f109647b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f109646a);
        parcel.writeStringList(this.f109647b);
    }
}
