package com.bytedance.android.livesdk.commerce;

import android.content.Context;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.browser.p193c.C3972b;
import com.bytedance.android.livesdk.p428w.C9178j;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.commerce.d */
public final class C5847d {

    /* renamed from: a */
    public static C3338l<String> f17214a = new C3338l<>("live_shop_edit_url", "https://hotsoon.snssdk.com/falcon/live_inapp/page/live_manage_goods/index.html");

    /* renamed from: b */
    public static final C5848a f17215b = new C5848a(null);

    /* renamed from: com.bytedance.android.livesdk.commerce.d$a */
    public static final class C5848a {

        /* renamed from: com.bytedance.android.livesdk.commerce.d$a$a */
        static final class C5849a<T, R> implements C7327h<T, R> {

            /* renamed from: a */
            public static final C5849a f17216a = new C5849a();

            C5849a() {
            }

            /* renamed from: a */
            private static boolean m18318a(C3479d<C5853g> dVar) {
                C7573i.m23587b(dVar, "liveGoodsListResponse");
                C5853g gVar = (C5853g) dVar.data;
                if (gVar != null) {
                    return gVar.f17229b;
                }
                return false;
            }

            public final /* synthetic */ Object apply(Object obj) {
                return Boolean.valueOf(m18318a((C3479d) obj));
            }
        }

        /* renamed from: com.bytedance.android.livesdk.commerce.d$a$b */
        static final class C5850b<T, R> implements C7327h<T, R> {

            /* renamed from: a */
            public static final C5850b f17217a = new C5850b();

            C5850b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                return Boolean.valueOf(m18319a((C3479d) obj));
            }

            /* renamed from: a */
            private static boolean m18319a(C3479d<C5853g> dVar) {
                int i;
                C7573i.m23587b(dVar, "liveGoodsListResponse");
                C5853g gVar = (C5853g) dVar.data;
                if (gVar != null) {
                    i = gVar.f17228a;
                } else {
                    i = 0;
                }
                if (i > 0) {
                    return true;
                }
                return false;
            }
        }

        private C5848a() {
        }

        public /* synthetic */ C5848a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C7492s<Boolean> m18315a(long j) {
            C7492s<Boolean> a = ((LiveCommerceApi) C9178j.m27302j().mo22373b().mo10440a(LiveCommerceApi.class)).fetchLiveGoodsUserStatus("https://hotsoon.snssdk.com/hotsoon/commerce/live/user/info/", j).mo19317d((C7327h<? super T, ? extends R>) C5849a.f17216a).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
            C7573i.m23582a((Object) a, "LiveInternalService.inst…dSchedulers.mainThread())");
            return a;
        }

        /* renamed from: b */
        public static C7492s<Boolean> m18317b(long j) {
            C7492s<Boolean> a = ((LiveCommerceApi) C9178j.m27302j().mo22373b().mo10440a(LiveCommerceApi.class)).fetchLiveGoodsUserStatus("https://hotsoon.snssdk.com/hotsoon/commerce/live/user/info/", j).mo19317d((C7327h<? super T, ? extends R>) C5850b.f17217a).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
            C7573i.m23582a((Object) a, "LiveInternalService.inst…dSchedulers.mainThread())");
            return a;
        }

        /* renamed from: a */
        public static BaseDialogFragment m18314a(Context context, Long l) {
            C7573i.m23587b(context, "context");
            String str = (String) C5847d.f17214a.mo10240a();
            BaseDialogFragment baseDialogFragment = null;
            if (l != null) {
                l.longValue();
                C7573i.m23582a((Object) str, "url");
                if (!C7634n.m23771b((CharSequence) str, '?', false, 2, (Object) null)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append('?');
                    str = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("&room_id=");
                sb2.append(l);
                str = sb2.toString();
            }
            C3972b c = C9178j.m27302j().mo22374c();
            if (c != null) {
                baseDialogFragment = c.mo11532a(context, str, "");
            }
            if (baseDialogFragment == null) {
                C7573i.m23580a();
            }
            return baseDialogFragment;
        }

        /* renamed from: a */
        public static C7492s<C3474a<C5851e, C2344a>> m18316a(long j, long j2, long j3) {
            return ((LiveCommerceApi) C9178j.m27302j().mo22373b().mo10440a(LiveCommerceApi.class)).fetchLiveCommerce("https://hotsoon.snssdk.com/hotsoon/commerce/live/promotions/", j, j2, j3, "live");
        }
    }

    /* renamed from: a */
    public static final BaseDialogFragment m18311a(Context context, Long l) {
        return C5848a.m18314a(context, l);
    }

    /* renamed from: a */
    public static final C7492s<Boolean> m18312a(long j) {
        return C5848a.m18315a(j);
    }

    /* renamed from: b */
    public static final C7492s<Boolean> m18313b(long j) {
        return C5848a.m18317b(j);
    }
}
