package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.crossplatform.activity.C25822g;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25834c;
import com.p280ss.android.ugc.aweme.share.C37969ah.C37970a;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import com.p280ss.android.ugc.aweme.web.p1704b.p1705a.C43439a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage */
public final class WebSharePackage extends SharePackage {
    public static final Creator<WebSharePackage> CREATOR = new C38233c();

    /* renamed from: a */
    public static final C38232b f99389a = new C38232b(null);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage$a */
    public static final class C38231a extends C7219a<WebSharePackage> {
        /* renamed from: b */
        public final WebSharePackage mo18866a() {
            return new WebSharePackage(this);
        }

        /* renamed from: a */
        public final C38231a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage$b */
    public static final class C38232b {
        private C38232b() {
        }

        public /* synthetic */ C38232b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static String m122150a(JSONObject jSONObject, String str) {
            String optString = jSONObject.optString(str);
            if (optString == null || C7573i.m23585a((Object) optString, (Object) TEVideoRecorder.FACE_BEAUTY_NULL)) {
                return null;
            }
            return optString;
        }

        /* renamed from: b */
        public static WebSharePackage m122151b(Context context, C43439a aVar, String str) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(aVar, "shareInfo");
            C7219a e = new C38231a().mo18868d("web").mo18869e("web");
            String str2 = aVar.f112509a;
            C7573i.m23582a((Object) str2, "shareInfo.title");
            C7219a f = e.mo18870f(str2);
            String str3 = aVar.f112510b;
            C7573i.m23582a((Object) str3, "shareInfo.desc");
            C7219a g = f.mo18871g(str3);
            String b = C38157b.m121908b(aVar.f112512d);
            if (b == null) {
                b = "";
            }
            WebSharePackage webSharePackage = (WebSharePackage) g.mo18872h(b).mo18866a();
            Bundle bundle = webSharePackage.f20186l;
            bundle.putString("app_name", context.getString(R.string.jf));
            bundle.putString("thumb_url", aVar.f112511c);
            bundle.putString("url_for_im_share", str);
            return webSharePackage;
        }

        /* renamed from: a */
        public static WebSharePackage m122148a(Context context, C43439a aVar, String str) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(aVar, "shareInfo");
            C7219a e = new C38231a().mo18868d("pic").mo18869e("web");
            String str2 = aVar.f112509a;
            C7573i.m23582a((Object) str2, "shareInfo.title");
            C7219a f = e.mo18870f(str2);
            String str3 = aVar.f112510b;
            C7573i.m23582a((Object) str3, "shareInfo.desc");
            C7219a g = f.mo18871g(str3);
            String b = C38157b.m121908b(aVar.f112512d);
            if (b == null) {
                b = "";
            }
            WebSharePackage webSharePackage = (WebSharePackage) g.mo18872h(b).mo18866a();
            Bundle bundle = webSharePackage.f20186l;
            bundle.putString("app_name", context.getString(R.string.jf));
            StringBuilder sb = new StringBuilder("file://");
            sb.append(aVar.f112513e);
            bundle.putString("thumb_url", sb.toString());
            bundle.putString("thumb_path", aVar.f112513e);
            bundle.putString("url_for_im_share", str);
            return webSharePackage;
        }

        /* renamed from: a */
        public static WebSharePackage m122149a(Context context, String str, JSONObject jSONObject, String str2, C25834c cVar) {
            boolean z;
            boolean z2;
            String str3;
            C7573i.m23587b(context, "context");
            C7573i.m23587b(jSONObject, "meta");
            C7573i.m23587b(str2, "currentUrl");
            C7573i.m23587b(cVar, "crossPlatformContainer");
            C38231a aVar = new C38231a();
            aVar.mo18868d("web");
            String a = m122150a(jSONObject, "title");
            if (a == null) {
                a = "";
            }
            aVar.mo18870f(a);
            String a2 = m122150a(jSONObject, "description");
            if (a2 == null) {
                a2 = "";
            }
            aVar.mo18871g(a2);
            String a3 = m122150a(jSONObject, "url");
            if (a3 == null) {
                a3 = "";
            }
            aVar.mo18872h(a3);
            CharSequence charSequence = aVar.f20190h;
            boolean z3 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CharSequence charSequence2 = str;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 || !(!C7573i.m23585a((Object) str, (Object) "undefined"))) {
                    if (cVar instanceof C25822g) {
                        str3 = "";
                    } else {
                        str3 = "";
                    }
                    aVar.mo18870f(str3);
                } else {
                    aVar.mo18870f(str);
                }
            }
            CharSequence charSequence3 = aVar.f20191i;
            if (charSequence3 == null || charSequence3.length() == 0) {
                z3 = true;
            }
            if (z3) {
                aVar.mo18871g(" ");
            }
            String str4 = aVar.f20192j;
            if (str4 == null || !(!C7634n.m23713a(str4))) {
                aVar.mo18872h(str2);
            } else {
                C19290j jVar = new C19290j(aVar.f20192j);
                if (!C37970a.m121275a()) {
                    IAccountUserService a4 = C21115b.m71197a();
                    C7573i.m23582a((Object) a4, "AccountUserProxyService.get()");
                    jVar.mo51188a("u_code", C19929d.m65760b(a4.getCurUserId()));
                }
                if (!C37970a.m121276b()) {
                    jVar.mo51188a("iid", C6789d.m21070b());
                }
                String a5 = jVar.mo51184a();
                C7573i.m23582a((Object) a5, "urlBuilder.build()");
                aVar.mo18872h(a5);
            }
            WebSharePackage b = aVar.mo18866a();
            Bundle bundle = b.f20186l;
            bundle.putString("app_name", context.getString(R.string.jf));
            bundle.putString("thumb_url", m122150a(jSONObject, "image"));
            return b;
        }

        /* renamed from: a */
        public static WebSharePackage m122147a(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, String str7, String str8) {
            String str9;
            C7219a d = new C38231a().mo18868d("web");
            if (str4 == null) {
                str9 = "";
            } else {
                str9 = str4;
            }
            C7219a f = d.mo18870f(str9);
            if (str5 == null) {
                str5 = " ";
            }
            C7219a g = f.mo18871g(str5);
            if (str6 == null) {
                str6 = "";
            }
            C7219a e = g.mo18872h(str6).mo18869e("web");
            if (str4 == null) {
                str4 = "";
            }
            WebSharePackage webSharePackage = (WebSharePackage) e.mo18870f(str4).mo18866a();
            Bundle bundle = webSharePackage.f20186l;
            bundle.putBoolean("user_origin_link", true);
            bundle.putString("thumb_url", str7);
            bundle.putString("url_for_im_share", str8);
            return webSharePackage;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage$c */
    public static final class C38233c implements Creator<WebSharePackage> {
        C38233c() {
        }

        /* renamed from: a */
        private static WebSharePackage[] m122153a(int i) {
            return new WebSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122152a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122153a(i);
        }

        /* renamed from: a */
        private static WebSharePackage m122152a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new WebSharePackage(parcel);
        }
    }

    /* renamed from: a */
    public static final WebSharePackage m122139a(Context context, String str, JSONObject jSONObject, String str2, C25834c cVar) {
        return C38232b.m122149a(context, str, jSONObject, str2, cVar);
    }

    /* renamed from: a */
    public final boolean mo18862a(C38389f fVar, Context context) {
        C7573i.m23587b(fVar, "action");
        C7573i.m23587b(context, "context");
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public WebSharePackage(C38231a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
    }

    public WebSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38231a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        String str;
        C7573i.m23587b(bVar, "channel");
        if (this.f20186l.getBoolean("user_origin_link")) {
            str = this.f20185k;
        } else {
            str = C38159c.m121914a(this.f20185k, bVar);
        }
        return new C38356g(str, this.f20183i, this.f20184j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        C37984ap.m121302b().addShareRecord(bVar.mo95739b(), 2);
        return false;
    }
}
