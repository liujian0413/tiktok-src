package com.p280ss.android.ugc.aweme.commercialize.playfun;

import android.graphics.Point;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.log.C24951b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24952c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.c */
public final class C25026c {

    /* renamed from: a */
    public static final C25026c f66008a = new C25026c();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.c$a */
    static final class C25027a<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ boolean f66009a;

        /* renamed from: b */
        final /* synthetic */ AwemePlayFunModel f66010b;

        /* renamed from: c */
        final /* synthetic */ AwemeRawAd f66011c;

        /* renamed from: d */
        final /* synthetic */ Aweme f66012d;

        /* renamed from: e */
        final /* synthetic */ String f66013e;

        C25027a(boolean z, AwemePlayFunModel awemePlayFunModel, AwemeRawAd awemeRawAd, Aweme aweme, String str) {
            this.f66009a = z;
            this.f66010b = awemePlayFunModel;
            this.f66011c = awemeRawAd;
            this.f66012d = aweme;
            this.f66013e = str;
        }

        public final /* synthetic */ Object call() {
            m82392a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m82392a() {
            List list;
            try {
                boolean z = true;
                boolean z2 = !this.f66009a;
                JSONObject jSONObject = new JSONObject();
                UrlModel imageInfo = this.f66010b.getImageInfo();
                if (imageInfo != null) {
                    list = imageInfo.getUrlList();
                } else {
                    list = null;
                }
                Collection collection = list;
                if (collection != null) {
                    if (!collection.isEmpty()) {
                        z = false;
                    }
                }
                if (!z) {
                    jSONObject.put("material_url", list.get(0));
                }
                Long creativeId = this.f66011c.getCreativeId();
                C7573i.m23582a((Object) creativeId, "rawAd.creativeId");
                jSONObject.put("creative_id", creativeId.longValue());
                jSONObject.put("log_extra", this.f66011c.getLogExtra());
                jSONObject.put("aweme_id", this.f66012d.getAid());
                C6893q.m21444a(this.f66013e, z2 ? 1 : 0, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    private C25026c() {
    }

    /* renamed from: a */
    private static boolean m82387a() {
        if (!AdPlayFunMonitorLogSetting.get()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo65480a(Aweme aweme) {
        if (!m82387a() && aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C24951b bVar = new C24951b("playfun", "preload_start", 0, 4, null);
                C24952c.f65801b.mo65237a(bVar.mo65230a(aweme.getAid()).mo65232b(awemeRawAd.getCreativeIdStr()).mo65233c(awemeRawAd.getLogExtra()));
            }
        }
    }

    /* renamed from: a */
    public final void mo65483a(List<? extends Aweme> list) {
        String str;
        if (!m82387a() && list != null) {
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (C25352e.m83307R((Aweme) next)) {
                    arrayList.add(next);
                }
            }
            for (Aweme aweme : (List) arrayList) {
                C24951b bVar = new C24951b("playfun", "data_received", 0, 4, null);
                C24951b a = bVar.mo65230a(aweme.getAid());
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                String str2 = null;
                if (awemeRawAd != null) {
                    str = awemeRawAd.getCreativeIdStr();
                } else {
                    str = null;
                }
                C24951b b = a.mo65232b(str);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    str2 = awemeRawAd2.getLogExtra();
                }
                C24952c.f65801b.mo65237a(b.mo65233c(str2));
            }
        }
    }

    /* renamed from: a */
    private static void m82386a(String str, Aweme aweme, boolean z) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C7573i.m23582a((Object) awemeRawAd, "aweme?.awemeRawAd ?: return");
                AwemePlayFunModel playFunModel = awemeRawAd.getPlayFunModel();
                if (playFunModel != null) {
                    C25027a aVar = new C25027a(z, playFunModel, awemeRawAd, aweme, str);
                    C1592h.m7855a((Callable<TResult>) aVar, (Executor) C6907h.m21516a());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo65481a(Aweme aweme, boolean z, String str) {
        if (!m82387a() && aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C24952c.f65801b.mo65237a(new C24951b("playfun", "preload_result", z ^ true ? 1 : 0).mo65230a(aweme.getAid()).mo65232b(awemeRawAd.getCreativeIdStr()).mo65233c(awemeRawAd.getLogExtra()).mo65234d(str));
                m82386a("aweme_ad_play_fun_preload_error_rate", aweme, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo65482a(Aweme aweme, boolean z, String str, Point point, Point point2) {
        C7573i.m23587b(str, "state");
        if (!m82387a() && aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                boolean z2 = !z;
                HashMap hashMap = new HashMap();
                Map map = hashMap;
                map.put("state", str);
                if (point != null) {
                    map.put("egg_coordinate_x", String.valueOf(point.x));
                    map.put("egg_coordinate_y", String.valueOf(point.y));
                }
                if (point2 != null) {
                    map.put("text_coordinate_x", String.valueOf(point2.x));
                    map.put("text_coordinate_y", String.valueOf(point2.y));
                }
                C24952c.f65801b.mo65237a(new C24951b("playfun", "show_result", z2 ? 1 : 0).mo65230a(aweme.getAid()).mo65232b(awemeRawAd.getCreativeIdStr()).mo65233c(awemeRawAd.getLogExtra()).mo65231a(hashMap));
                if (C7573i.m23585a((Object) str, (Object) "display")) {
                    m82386a("aweme_ad_play_fun_show_error_rate", aweme, z);
                }
            }
        }
    }
}
