package com.p280ss.android.ugc.aweme.tools.mvtemplate;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1675a.C42500c;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d.C42537b;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData */
public class MvThemeData implements Parcelable {
    public static final Creator<MvThemeData> CREATOR = new Creator<MvThemeData>() {
        /* renamed from: a */
        private static MvThemeData[] m135052a(int i) {
            return new MvThemeData[i];
        }

        /* renamed from: a */
        private static MvThemeData m135051a(Parcel parcel) {
            return new MvThemeData(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m135051a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m135052a(i);
        }
    };

    /* renamed from: a */
    public Effect f110495a;

    /* renamed from: b */
    public List<String> f110496b;

    /* renamed from: c */
    public int f110497c;

    /* renamed from: d */
    public int f110498d;

    /* renamed from: e */
    public String f110499e;

    /* renamed from: f */
    public String f110500f;

    /* renamed from: g */
    public String f110501g;

    /* renamed from: h */
    public int f110502h;

    /* renamed from: i */
    public int f110503i;

    /* renamed from: j */
    public boolean f110504j;

    /* renamed from: k */
    public int f110505k;

    /* renamed from: l */
    public boolean f110506l;

    /* renamed from: m */
    public String f110507m;

    /* renamed from: n */
    public List<String> f110508n;

    /* renamed from: o */
    private String f110509o;

    public MvThemeData() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final String mo104044a() {
        if (this.f110495a != null) {
            return this.f110495a.getEffectId();
        }
        return null;
    }

    /* renamed from: b */
    public final List<String> mo104046b() {
        if (this.f110495a != null) {
            return this.f110495a.getMusic();
        }
        return null;
    }

    /* renamed from: j */
    public final String mo104055j() {
        if (this.f110495a != null) {
            return this.f110495a.getHint();
        }
        return "";
    }

    /* renamed from: k */
    public final String mo104056k() {
        if (this.f110495a != null) {
            return this.f110495a.getId();
        }
        return null;
    }

    /* renamed from: l */
    public final String mo104057l() {
        if (this.f110509o == null) {
            return "";
        }
        return this.f110509o;
    }

    /* renamed from: f */
    public final String mo104051f() {
        if (this.f110495a != null) {
            UrlModel fileUrl = this.f110495a.getFileUrl();
            if (fileUrl != null && !C23477d.m77081a((Collection<T>) fileUrl.getUrlList())) {
                return fileUrl.getUri();
            }
        }
        return null;
    }

    /* renamed from: h */
    public final String mo104053h() {
        if (this.f110495a == null) {
            return "";
        }
        if (this.f110495a.getName() == null) {
            return "";
        }
        return this.f110495a.getName();
    }

    /* renamed from: m */
    public final int mo104058m() {
        int a = C42500c.m135067a().mo104076a(mo104047c());
        if (a == 1) {
            return 2;
        }
        if (a == 2) {
            return 3;
        }
        if (a == 3) {
            return 1;
        }
        return a == -1 ? -1 : -1;
    }

    /* renamed from: c */
    public final String mo104047c() {
        if (this.f110495a != null) {
            UrlModel fileUrl = this.f110495a.getFileUrl();
            if (fileUrl != null && !C23477d.m77081a((Collection<T>) fileUrl.getUrlList())) {
                return (String) fileUrl.getUrlList().get(0);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final String mo104048d() {
        String a = C42537b.m135179a("mvres");
        if (this.f110495a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(File.separator);
        sb.append(this.f110495a.getId());
        sb.append(".zip");
        return sb.toString();
    }

    /* renamed from: e */
    public final String mo104050e() {
        String a = C42537b.m135179a("mvres");
        if (this.f110495a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(File.separator);
        sb.append(this.f110495a.getId());
        return sb.toString();
    }

    /* renamed from: g */
    public final String mo104052g() {
        if (TextUtils.isEmpty(this.f110499e) || C23477d.m77081a((Collection<T>) this.f110496b)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) this.f110496b.get(0));
        sb.append(this.f110499e);
        return sb.toString();
    }

    /* renamed from: i */
    public final String mo104054i() {
        if (TextUtils.isEmpty(this.f110500f) || C23477d.m77081a((Collection<T>) this.f110496b)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) this.f110496b.get(0));
        sb.append(this.f110500f);
        return sb.toString();
    }

    /* renamed from: n */
    private void m135036n() {
        if (this.f110495a != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f110495a.getExtra());
                this.f110497c = jSONObject.optInt("template_min_material", 0);
                this.f110498d = jSONObject.optInt("template_max_material", 0);
                this.f110499e = jSONObject.optString("template_video_cover", "");
                this.f110500f = jSONObject.optString("template_picture_cover", "");
                this.f110501g = jSONObject.optString("template_pic_fill_mode", "AspectFit");
                this.f110502h = jSONObject.optInt("template_pic_input_width", 720);
                this.f110503i = jSONObject.optInt("template_pic_input_height", 1280);
                this.f110505k = jSONObject.optInt("template_type", 0);
                this.f110509o = jSONObject.optString("mv_algorithm_hint");
                this.f110507m = jSONObject.optString("mv_auto_save_toast");
                this.f110508n = (List) C35563c.f93239b.mo15975a(jSONObject.optString("mv_server_algorithm_result_save_keys"), new C6597a<List<String>>() {
                }.type);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo104045a(Effect effect) {
        this.f110495a = effect;
        m135036n();
    }

    protected MvThemeData(Parcel parcel) {
        boolean z;
        this.f110495a = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.f110496b = parcel.createStringArrayList();
        this.f110497c = parcel.readInt();
        this.f110498d = parcel.readInt();
        this.f110499e = parcel.readString();
        this.f110500f = parcel.readString();
        this.f110501g = parcel.readString();
        this.f110502h = parcel.readInt();
        this.f110503i = parcel.readInt();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f110504j = z;
        this.f110505k = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f110506l = z2;
        this.f110509o = parcel.readString();
        this.f110507m = parcel.readString();
        this.f110508n = parcel.createStringArrayList();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110495a, i);
        parcel.writeStringList(this.f110496b);
        parcel.writeInt(this.f110497c);
        parcel.writeInt(this.f110498d);
        parcel.writeString(this.f110499e);
        parcel.writeString(this.f110500f);
        parcel.writeString(this.f110501g);
        parcel.writeInt(this.f110502h);
        parcel.writeInt(this.f110503i);
        parcel.writeByte(this.f110504j ? (byte) 1 : 0);
        parcel.writeInt(this.f110505k);
        parcel.writeByte(this.f110506l ? (byte) 1 : 0);
        parcel.writeString(this.f110509o);
        parcel.writeString(this.f110507m);
        parcel.writeStringList(this.f110508n);
    }
}
