package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.PhotoParam;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.video.C30973g;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.u */
public final class C30954u {

    /* renamed from: a */
    public static final C30954u f81055a = new C30954u();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.u$a */
    static final class C30955a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ List f81056a;

        /* renamed from: b */
        final /* synthetic */ String f81057b;

        /* renamed from: c */
        final /* synthetic */ boolean f81058c;

        C30955a(List list, String str, boolean z) {
            this.f81056a = list;
            this.f81057b = str;
            this.f81058c = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String call() {
            String str = "";
            boolean z = false;
            int i = 0;
            for (MediaModel mediaModel : this.f81056a) {
                if (mediaModel.isVideo()) {
                    C30954u.m100738a(this.f81057b, mediaModel);
                } else {
                    str = C30954u.m100737a(this.f81057b, mediaModel, this.f81058c);
                    i++;
                }
            }
            if (str.length() > 0) {
                z = true;
            }
            if (!z || i <= 1) {
                return str;
            }
            String string = C6399b.m19921a().getString(R.string.bi7);
            C7573i.m23582a((Object) string, "AppContextManager.getApp…im_compress_failed_multi)");
            return string;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.u$b */
    static final class C30956b<TTaskResult, TContinuationResult> implements C1591g<String, C7581n> {

        /* renamed from: a */
        public static final C30956b f81059a = new C30956b();

        C30956b() {
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m100741a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m100741a(C1592h<String> hVar) {
            boolean z;
            C7573i.m23582a((Object) hVar, "it");
            Object e = hVar.mo6890e();
            C7573i.m23582a(e, "it.result");
            if (((CharSequence) e).length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C10761a.m31403c(C6399b.m19921a(), (String) hVar.mo6890e()).mo25750a();
            }
        }
    }

    private C30954u() {
    }

    /* renamed from: a */
    public static void m100738a(String str, MediaModel mediaModel) {
        StoryVideoContent obtain = StoryVideoContent.Companion.obtain(mediaModel);
        if (obtain != null) {
            C30973g.m100788a(str, obtain);
        }
    }

    /* renamed from: a */
    public static String m100737a(String str, MediaModel mediaModel, boolean z) {
        PhotoParam fromMediaModel = PhotoParam.fromMediaModel(mediaModel);
        if (fromMediaModel == null) {
            return "";
        }
        String a = C30963v.m100755a().mo81331a(str, C7525m.m23457a(fromMediaModel), z);
        if (a == null) {
            a = "";
        }
        return a;
    }

    /* renamed from: a */
    public static final void m100739a(String str, List<MediaModel> list, boolean z) {
        boolean z2;
        C7573i.m23587b(list, "list");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !list.isEmpty()) {
            C1592h.m7853a((Callable<TResult>) new C30955a<TResult>(list, str, z)).mo6876a((C1591g<TResult, TContinuationResult>) C30956b.f81059a, C1592h.f5958b);
        }
    }
}
