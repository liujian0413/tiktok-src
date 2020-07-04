package com.p280ss.android.ugc.aweme.share.improve;

import android.app.Activity;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.share.improve.expr.WhatsappStatusExperiment;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38291a;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38293b;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38295c;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38297d;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38299e;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38303g;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38307i;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38309j;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38311k;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38313l;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38315m;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38317n;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38319o;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38321p;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38323q;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38325r;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38327s;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38329t;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38331u;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38333v;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38335w;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38337x;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38339y;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38341z;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38345a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a */
public final class C38065a {

    /* renamed from: a */
    public static final C38066a f99114a = new C38066a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a$a */
    public static final class C38066a {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a$a$a */
        public static final class C38067a implements C38345a {

            /* renamed from: a */
            final /* synthetic */ Activity f99115a;

            /* renamed from: a */
            public final Activity mo63025a() {
                if (this.f99115a != null) {
                    return this.f99115a;
                }
                return C6405d.m19984g();
            }

            C38067a(Activity activity) {
                this.f99115a = activity;
            }
        }

        private C38066a() {
        }

        public /* synthetic */ C38066a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C38343b m121469a(String str, Activity activity) {
            int i;
            C38067a aVar = new C38067a(activity);
            if (str != null) {
                switch (str.hashCode()) {
                    case -1837180097:
                        if (str.equals("whatsapp_status")) {
                            if (WhatsappStatusExperiment.INSTANCE.isStyle2()) {
                                i = R.drawable.aul;
                            } else {
                                i = R.drawable.auk;
                            }
                            return new C38339y(i);
                        }
                        break;
                    case -1436108013:
                        if (str.equals("messenger")) {
                            return new C38317n(aVar);
                        }
                        break;
                    case -1374807695:
                        if (str.equals("naver_blog")) {
                            return new C38321p();
                        }
                        break;
                    case -1374788756:
                        if (str.equals("naver_cafe")) {
                            return new C38323q();
                        }
                        break;
                    case -1194195335:
                        if (str.equals("kakao_story")) {
                            return new C38311k();
                        }
                        break;
                    case -916346253:
                        if (str.equals("twitter")) {
                            return new C38331u();
                        }
                        break;
                    case -816556504:
                        if (str.equals("instagram_story")) {
                            return new C38309j();
                        }
                        break;
                    case 3765:
                        if (str.equals("vk")) {
                            return new C38335w();
                        }
                        break;
                    case 97325:
                        if (str.equals("bbm")) {
                            return new C38293b();
                        }
                        break;
                    case 114009:
                        if (str.equals("sms")) {
                            return new C38325r();
                        }
                        break;
                    case 3016245:
                        if (str.equals("band")) {
                            return new C38291a("www.tiktokv.com");
                        }
                        break;
                    case 3321844:
                        if (str.equals("line")) {
                            return new C38315m();
                        }
                        break;
                    case 3357525:
                        if (str.equals("more")) {
                            String string = C38159c.m121910a().getString(R.string.bfc);
                            C7573i.m23582a((Object) string, "chaosContext().getString…string.i18n_share_system)");
                            return new C38329t(string);
                        }
                        break;
                    case 3731178:
                        if (str.equals("zalo")) {
                            return new C38341z();
                        }
                        break;
                    case 28903346:
                        if (str.equals("instagram")) {
                            return new C38307i();
                        }
                        break;
                    case 96619420:
                        if (str.equals("email")) {
                            return new C38295c();
                        }
                        break;
                    case 100319648:
                        if (str.equals("imgur")) {
                            return new C38303g();
                        }
                        break;
                    case 112200956:
                        if (str.equals("viber")) {
                            return new C38333v();
                        }
                        break;
                    case 284397090:
                        if (str.equals("snapchat")) {
                            return new C38327s();
                        }
                        break;
                    case 486515695:
                        if (str.equals("kakaotalk")) {
                            return new C38313l();
                        }
                        break;
                    case 497130182:
                        if (str.equals("facebook")) {
                            return new C38297d(aVar);
                        }
                        break;
                    case 628073050:
                        if (str.equals("messenger_lite")) {
                            return new C38319o();
                        }
                        break;
                    case 1620810375:
                        if (str.equals("facebook_lite")) {
                            return new C38299e();
                        }
                        break;
                    case 1934780818:
                        if (str.equals("whatsapp")) {
                            return new C38337x();
                        }
                        break;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final C38343b m121466a(String str) {
        return C38066a.m121469a(str, C6405d.m19984g());
    }

    /* renamed from: a */
    public static final C38343b m121467a(String str, Activity activity) {
        return C38066a.m121469a(str, activity);
    }
}
