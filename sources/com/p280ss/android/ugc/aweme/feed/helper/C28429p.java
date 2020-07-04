package com.p280ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.feed.experiment.InterctionShareButtonWhatsappStyleExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38297d;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38299e;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38307i;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38309j;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38337x;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38339y;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38345a;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.p */
public final class C28429p {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f74961a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C28429p.class), "WHATSAPP_CHANNEL", "getWHATSAPP_CHANNEL()Lcom/ss/android/ugc/aweme/sharer/ext/WhatsappChannel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C28429p.class), "WHATSAPP_STATUS_CHANNEL", "getWHATSAPP_STATUS_CHANNEL()Lcom/ss/android/ugc/aweme/sharer/ext/WhatsappStatusChannel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C28429p.class), "KEVA", "getKEVA()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C28429p f74962b = new C28429p();

    /* renamed from: c */
    private static final C7541d f74963c = C7546e.m23569a(C28431b.f74968a);

    /* renamed from: d */
    private static final C7541d f74964d = C7546e.m23569a(C28432c.f74969a);

    /* renamed from: e */
    private static final C7541d f74965e = C7546e.m23569a(C28430a.f74967a);

    /* renamed from: f */
    private static final ArrayList<String> f74966f = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.p$a */
    static final class C28430a extends Lambda implements C7561a<Keva> {

        /* renamed from: a */
        public static final C28430a f74967a = new C28430a();

        C28430a() {
            super(0);
        }

        /* renamed from: a */
        private static Keva m93449a() {
            return Keva.getRepo("SHARE_CHANNEL_RECORDER");
        }

        public final /* synthetic */ Object invoke() {
            return m93449a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.p$b */
    static final class C28431b extends Lambda implements C7561a<C38337x> {

        /* renamed from: a */
        public static final C28431b f74968a = new C28431b();

        C28431b() {
            super(0);
        }

        /* renamed from: a */
        private static C38337x m93450a() {
            return new C38337x();
        }

        public final /* synthetic */ Object invoke() {
            return m93450a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.p$c */
    static final class C28432c extends Lambda implements C7561a<C38339y> {

        /* renamed from: a */
        public static final C28432c f74969a = new C28432c();

        C28432c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m93451a();
        }

        /* renamed from: a */
        private static C38339y m93451a() {
            return new C38339y(R.drawable.auk);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.p$d */
    public static final class C28433d implements C38345a {

        /* renamed from: a */
        final /* synthetic */ Activity f74970a;

        /* renamed from: a */
        public final Activity mo63025a() {
            if (this.f74970a != null) {
                return this.f74970a;
            }
            return C6405d.m19984g();
        }

        C28433d(Activity activity) {
            this.f74970a = activity;
        }
    }

    private C28429p() {
    }

    /* renamed from: a */
    private final C38337x m93440a() {
        return (C38337x) f74963c.getValue();
    }

    /* renamed from: b */
    private final C38339y m93444b() {
        return (C38339y) f74964d.getValue();
    }

    /* renamed from: c */
    private final Keva m93446c() {
        return (Keva) f74965e.getValue();
    }

    /* renamed from: a */
    public final void mo72164a(C38343b bVar) {
        C7573i.m23587b(bVar, "shareChannel");
        m93446c().storeLong(bVar.mo95739b(), System.currentTimeMillis());
    }

    /* renamed from: b */
    public final boolean mo72165b(Context context) {
        if (context != null) {
            return m93440a().mo95743a(context);
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m93442a(Context context) {
        if (C43122ff.m136767b() || C6384b.m19835a().mo15287a(InterctionShareButtonWhatsappStyleExperiment.class, true, "interction_share_button_whatsapp_style", C6384b.m19835a().mo15295d().interction_share_button_whatsapp_style, 0) == 0 || !f74962b.mo72165b(context)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static ArrayList<String> m93445b(Activity activity) {
        if (f74966f.isEmpty()) {
            C28433d dVar = new C28433d(activity);
            ArrayList<String> arrayList = f74966f;
            arrayList.add(new C38307i().mo95739b());
            arrayList.add(new C38309j().mo95739b());
            arrayList.add(new C38297d(dVar).mo95739b());
            arrayList.add(new C38299e().mo95739b());
        }
        return f74966f;
    }

    /* renamed from: a */
    public static final boolean m93441a(Activity activity) {
        Keva c = f74962b.m93446c();
        C7573i.m23582a((Object) c, "KEVA");
        Map all = c.getAll();
        if (all != null) {
            boolean z = false;
            boolean z2 = false;
            for (Entry entry : all.entrySet()) {
                if (System.currentTimeMillis() - ((Number) entry.getValue()).longValue() <= 604800000) {
                    if (C7573i.m23585a((Object) (String) entry.getKey(), (Object) f74962b.m93440a().mo95739b()) || C7573i.m23585a((Object) (String) entry.getKey(), (Object) f74962b.m93444b().mo95739b())) {
                        z = true;
                    }
                    if (m93445b(activity).contains(entry.getKey())) {
                        z2 = true;
                    }
                }
            }
            if (z || !z2) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Long>");
    }

    /* renamed from: a */
    public static final boolean m93443a(Aweme aweme) {
        boolean z;
        boolean z2;
        C7573i.m23587b(aweme, "aweme");
        if (aweme.getAwemeType() == 56) {
            return true;
        }
        User author = aweme.getAuthor();
        C7573i.m23582a((Object) author, "aweme.author");
        long[] typeLabels = author.getTypeLabels();
        if (typeLabels != null && C7519g.m23431a(typeLabels, 6737595547571456005L)) {
            return true;
        }
        List<TextExtraStruct> textExtra = aweme.getTextExtra();
        Collection collection = textExtra;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                C7573i.m23582a((Object) textExtraStruct, "textExtraStruct");
                CharSequence hashTagName = textExtraStruct.getHashTagName();
                if (hashTagName == null || C7634n.m23713a(hashTagName)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    String hashTagName2 = textExtraStruct.getHashTagName();
                    C7573i.m23582a((Object) hashTagName2, "textExtraStruct.hashTagName");
                    if (!C7634n.m23776c((CharSequence) hashTagName2, (CharSequence) "status", false)) {
                        String hashTagName3 = textExtraStruct.getHashTagName();
                        C7573i.m23582a((Object) hashTagName3, "textExtraStruct.hashTagName");
                        if (C7634n.m23776c((CharSequence) hashTagName3, (CharSequence) "Status", false)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
