package com.bytedance.android.livesdk.chatroom.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.Uri.Builder;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.C1780i;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.rxutils.C3301i;
import com.bytedance.android.live.core.utils.C3364ai;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.livebuild.C8408d;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.p397k.C8362l;
import com.bytedance.android.livesdk.utils.C9037af;
import com.bytedance.android.livesdk.utils.C9084v;
import com.bytedance.android.livesdk.viewmodel.ILotteryState;
import com.bytedance.android.livesdk.viewmodel.LotteryFinishing;
import com.bytedance.android.livesdk.viewmodel.LotteryWaiting;
import com.bytedance.android.livesdkapi.depend.live.C9332f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7324c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.i */
public final class C5348i {

    /* renamed from: com.bytedance.android.livesdk.chatroom.utils.i$a */
    static final class C5349a<T, R> implements C7327h<T, C7320af<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ LotteryResource f15621a;

        C5349a(LotteryResource lotteryResource) {
            this.f15621a = lotteryResource;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7319aa<C8362l> apply(String str) {
            C7573i.m23587b(str, "it");
            return C9084v.m27124a(str, (C9037af) this.f15621a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.utils.i$b */
    static final class C5350b<T, R> implements C7327h<T, C7320af<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ Context f15622a;

        C5350b(Context context) {
            this.f15622a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7319aa<Pair<C1757f, C8362l>> apply(C8362l lVar) {
            C7573i.m23587b(lVar, "it");
            return C9084v.m27123a(this.f15622a, lVar).mo19123a((C7320af<U>) C7319aa.m22930a(lVar), (C7324c<? super T, ? super U, ? extends R>) new C3301i<Object,Object,Object>());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.utils.i$c */
    public static final class C5351c extends C8408d {

        /* renamed from: a */
        final /* synthetic */ C8362l f15623a;

        C5351c(C8362l lVar) {
            this.f15623a = lVar;
        }

        /* renamed from: a */
        public final Bitmap mo7162a(C1780i iVar) {
            Object obj;
            HashMap<String, Bitmap> hashMap = this.f15623a.f22923e;
            if (iVar != null) {
                obj = iVar.f6397d;
            } else {
                obj = null;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(obj);
            if (bitmap == null || bitmap.isRecycled()) {
                return null;
            }
            return bitmap;
        }
    }

    /* renamed from: a */
    public static final Uri m17057a(Uri uri, ILotteryState iLotteryState) {
        Integer num;
        C7573i.m23587b(uri, "$this$appendLotteryParams");
        C7573i.m23587b(iLotteryState, "state");
        String queryParameter = uri.getQueryParameter("url");
        if (queryParameter == null) {
            return uri;
        }
        Builder buildUpon = C3364ai.m12543a(uri, "url").buildUpon();
        Builder buildUpon2 = Uri.parse(queryParameter).buildUpon();
        if (iLotteryState instanceof LotteryWaiting) {
            buildUpon2.appendQueryParameter("lottery_id", String.valueOf(((LotteryWaiting) iLotteryState).getLotteryId()));
        } else if (iLotteryState instanceof LotteryFinishing) {
            buildUpon2.appendQueryParameter("lottery_id", String.valueOf(((LotteryFinishing) iLotteryState).getLotteryId()));
        }
        C9332f d = TTLiveSDKContext.getLiveService().mo22018d();
        C7573i.m23582a((Object) d, "TTLiveSDKContext.getLiveService().roomService()");
        Room currentRoom = d.getCurrentRoom();
        Map map = null;
        if (currentRoom != null) {
            num = Integer.valueOf(currentRoom.getOrientation());
        } else {
            num = null;
        }
        if (num != null) {
            buildUpon2.appendQueryParameter("orientation", String.valueOf(num.intValue()));
        }
        C8416g a = C8443c.m25663a().mo21605a(Room.class);
        if (a != null) {
            map = a.mo21568a();
        }
        if (map != null) {
            String str = "log_pb";
            String str2 = (String) map.get("log_pb");
            if (str2 == null) {
                str2 = "";
            }
            buildUpon2.appendQueryParameter(str, str2);
            String str3 = "request_id";
            String str4 = (String) map.get("request_id");
            if (str4 == null) {
                str4 = "";
            }
            buildUpon2.appendQueryParameter(str3, str4);
        }
        buildUpon.appendQueryParameter("url", buildUpon2.build().toString());
        Uri build = buildUpon.build();
        C7573i.m23582a((Object) build, "UriUtils.removeQueryPara…String()) }\n    }.build()");
        return build;
    }

    /* renamed from: a */
    public static final void m17059a(C8362l lVar, C1757f fVar, LottieAnimationView lottieAnimationView) {
        C7573i.m23587b(lVar, "entity");
        C7573i.m23587b(fVar, "composition");
        C7573i.m23587b(lottieAnimationView, "view");
        C8444d.m25673b();
        StringBuilder sb = new StringBuilder("starting lottie animation ");
        sb.append(lVar.f22920b);
        C8444d.m11971b("ttlive_lottery", sb.toString());
        lottieAnimationView.mo7085f();
        lottieAnimationView.setProgress(0.0f);
        lottieAnimationView.setImageAssetDelegate(new C5351c(lVar));
        lottieAnimationView.setComposition(fVar);
        lottieAnimationView.mo7078b();
    }

    /* renamed from: a */
    public static final C7319aa<Pair<C1757f, C8362l>> m17058a(Context context, C7319aa<String> aaVar, LotteryResource lotteryResource) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aaVar, "lotteryAssetRoot");
        C7573i.m23587b(lotteryResource, "what");
        C8444d.m25673b();
        StringBuilder sb = new StringBuilder("loading lottie animation ");
        sb.append(lotteryResource);
        C8444d.m11971b("ttlive_lottery", sb.toString());
        C7319aa<Pair<C1757f, C8362l>> a = aaVar.mo19126a((C7327h<? super T, ? extends C7320af<? extends R>>) new C5349a<Object,Object>(lotteryResource)).mo19126a((C7327h<? super T, ? extends C7320af<? extends R>>) new C5350b<Object,Object>(context)).mo19127a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "lotteryAssetRoot.flatMap…dSchedulers.mainThread())");
        return a;
    }
}
