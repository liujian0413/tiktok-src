package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.C14561a;
import com.facebook.share.model.ShareHashtag.C14563a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E extends C14561a> implements ShareModel {

    /* renamed from: h */
    public final Uri f37593h;

    /* renamed from: i */
    public final List<String> f37594i;

    /* renamed from: j */
    public final String f37595j;

    /* renamed from: k */
    public final String f37596k;

    /* renamed from: l */
    public final String f37597l;

    /* renamed from: m */
    public final ShareHashtag f37598m;

    /* renamed from: com.facebook.share.model.ShareContent$a */
    public static abstract class C14561a<P extends ShareContent, E extends C14561a> {

        /* renamed from: a */
        public Uri f37599a;

        /* renamed from: b */
        public List<String> f37600b;

        /* renamed from: c */
        public String f37601c;

        /* renamed from: d */
        public String f37602d;

        /* renamed from: e */
        public String f37603e;

        /* renamed from: f */
        public ShareHashtag f37604f;

        /* renamed from: a */
        private E mo36756a(String str) {
            this.f37601c = str;
            return this;
        }

        /* renamed from: b */
        private E m42095b(String str) {
            this.f37602d = str;
            return this;
        }

        /* renamed from: c */
        private E m42096c(String str) {
            this.f37603e = str;
            return this;
        }

        /* renamed from: a */
        public final E mo36746a(Uri uri) {
            this.f37599a = uri;
            return this;
        }

        /* renamed from: a */
        private E mo36807a(List<String> list) {
            List<String> list2;
            if (list == null) {
                list2 = null;
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f37600b = list2;
            return this;
        }

        /* renamed from: a */
        public E mo36747a(P p) {
            if (p == null) {
                return this;
            }
            return mo36746a(p.f37593h).mo36807a(p.f37594i).mo36756a(p.f37595j).m42095b(p.f37596k).m42096c(p.f37597l);
        }
    }

    public int describeContents() {
        return 0;
    }

    protected ShareContent(C14561a aVar) {
        this.f37593h = aVar.f37599a;
        this.f37594i = aVar.f37600b;
        this.f37595j = aVar.f37601c;
        this.f37596k = aVar.f37602d;
        this.f37597l = aVar.f37603e;
        this.f37598m = aVar.f37604f;
    }

    /* renamed from: a */
    private static List<String> m42092a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    protected ShareContent(Parcel parcel) {
        this.f37593h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f37594i = m42092a(parcel);
        this.f37595j = parcel.readString();
        this.f37596k = parcel.readString();
        this.f37597l = parcel.readString();
        this.f37598m = new C14563a().mo36752a(parcel).mo36753a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f37593h, 0);
        parcel.writeStringList(this.f37594i);
        parcel.writeString(this.f37595j);
        parcel.writeString(this.f37596k);
        parcel.writeString(this.f37597l);
        parcel.writeParcelable(this.f37598m, 0);
    }
}
