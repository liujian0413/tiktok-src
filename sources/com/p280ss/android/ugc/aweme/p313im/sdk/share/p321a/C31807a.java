package com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.keva.Keva;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.ImFeedShareIconOverturnTypeExperiment;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.C31684d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.a */
public final class C31807a {

    /* renamed from: b */
    public static final C31807a f83207b = new C31807a();

    /* renamed from: c */
    public static final C7049a f83208c = new C7049a(null);

    /* renamed from: a */
    public IMContact f83209a;

    /* renamed from: d */
    private final Keva f83210d = Keva.getRepo("last_share_user_keva");

    /* renamed from: e */
    private String f83211e = "";

    /* renamed from: f */
    private String f83212f = "";

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.a$a */
    public static final class C7049a {

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.a$a$a */
        static final class C7050a extends Lambda implements C7563m<List<IMContact>, Boolean, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C6892b f19856a;

            C7050a(C6892b bVar) {
                this.f19856a = bVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m21944a((List) obj, ((Boolean) obj2).booleanValue());
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m21944a(List<IMContact> list, boolean z) {
                boolean z2;
                C7573i.m23587b(list, "list");
                C6892b bVar = this.f19856a;
                if (C31807a.f83207b.mo82617a(list) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bVar.run(Boolean.valueOf(z2));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.a$a$b */
        static final class C7051b extends Lambda implements C7562b<Throwable, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C6892b f19857a;

            C7051b(C6892b bVar) {
                this.f19857a = bVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m21945a((Throwable) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m21945a(Throwable th) {
                C7573i.m23587b(th, "it");
                this.f19857a.run(Boolean.valueOf(false));
            }
        }

        private C7049a() {
        }

        /* renamed from: b */
        public static boolean m21940b() {
            if (!C7074e.m22066a() || !C31807a.f83207b.mo82622d()) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private static boolean m21941c() {
            if (C6384b.m19835a().mo15287a(ImFeedShareIconOverturnTypeExperiment.class, true, "im_feed_share_icon_type", C6384b.m19835a().mo15295d().im_feed_share_icon_type, 0) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo18256a() {
            if (m21941c()) {
                C6956a a = C6956a.m21632a();
                C7573i.m23582a((Object) a, "AwemeImManager.instance()");
                C7103h f = a.mo18009f();
                if (f != null) {
                    f.recordLastShareTypeIsIm();
                }
            }
        }

        public /* synthetic */ C7049a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m21936a(IMContact iMContact) {
            String str;
            C7573i.m23587b(iMContact, "contact");
            if (iMContact instanceof IMConversation) {
                str = ((IMConversation) iMContact).getConversationId();
                if (str == null) {
                    return "";
                }
            } else if (!(iMContact instanceof IMUser)) {
                return "";
            } else {
                str = ((IMUser) iMContact).getUid();
                if (str == null) {
                    return "";
                }
            }
            return str;
        }

        /* renamed from: b */
        public static void m21939b(IMContact iMContact) {
            C7573i.m23587b(iMContact, "contact");
            if (C6384b.m19835a().mo15287a(ImFeedShareIconOverturnTypeExperiment.class, true, "im_feed_share_icon_type", C6384b.m19835a().mo15295d().im_feed_share_icon_type, 0) == 2) {
                C31807a.f83207b.mo82619a(iMContact);
            } else {
                C31807a.f83207b.mo82621c();
            }
        }

        /* renamed from: a */
        public static void m21937a(RemoteImageView remoteImageView) {
            C7573i.m23587b(remoteImageView, "imageView");
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.mo32884a(true);
            C13438a aVar = (C13438a) remoteImageView.getHierarchy();
            C7573i.m23582a((Object) aVar, "imageView.hierarchy");
            aVar.mo32897a(roundingParams);
            C13438a aVar2 = (C13438a) remoteImageView.getHierarchy();
            C7573i.m23582a((Object) aVar2, "imageView.hierarchy");
            aVar2.mo32896a(C13423b.f35598f);
            remoteImageView.setPadding(4, 4, 4, 4);
            C23323e.m76514a(remoteImageView, C31807a.f83207b.mo82618a());
        }

        /* renamed from: a */
        public final List<IMContact> mo18255a(List<IMContact> list) {
            C7573i.m23587b(list, "contactList");
            if (C23477d.m77081a((Collection<T>) list) || !m21940b()) {
                return list;
            }
            C31807a.f83207b.mo82617a(list);
            ArrayList arrayList = new ArrayList();
            if (C31807a.f83207b.f83209a == null) {
                return list;
            }
            IMContact iMContact = C31807a.f83207b.f83209a;
            if (iMContact != null && iMContact.isStickTop()) {
                return list;
            }
            boolean z = false;
            for (IMContact iMContact2 : list) {
                if (!TextUtils.equals(m21936a(iMContact2), C31807a.f83207b.mo82620b())) {
                    if (!iMContact2.isStickTop() && !z) {
                        IMContact iMContact3 = C31807a.f83207b.f83209a;
                        if (iMContact3 == null) {
                            C7573i.m23580a();
                        }
                        arrayList.add(iMContact3);
                        z = true;
                    }
                    arrayList.add(iMContact2);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public static void m21938a(boolean z, C6892b<Boolean> bVar) {
            C7573i.m23587b(bVar, "callback");
            new C31684d(new C31690a(1, z)).m102752a(new C7050a(bVar), new C7051b(bVar), C31622e.f82817a, C31623f.f82818a).mo82406e();
        }
    }

    /* renamed from: c */
    public final void mo82621c() {
        m103246a("");
        m103247b("");
    }

    /* renamed from: d */
    public final boolean mo82622d() {
        if (TextUtils.isEmpty(mo82618a()) || TextUtils.isEmpty(mo82620b())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final String mo82620b() {
        String obj = C7074e.m22069b().toString();
        Keva keva = this.f83210d;
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append("keva_user_id");
        String string = keva.getString(sb.toString(), "");
        if (string == null) {
            return "";
        }
        return string;
    }

    /* renamed from: a */
    public final String mo82618a() {
        String obj = C7074e.m22069b().toString();
        Keva keva = this.f83210d;
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append("keva_user_head_url");
        String string = keva.getString(sb.toString(), "");
        if (string == null) {
            return "";
        }
        return string;
    }

    /* renamed from: a */
    private void m103246a(String str) {
        this.f83211e = str;
        String obj = C7074e.m22069b().toString();
        Keva keva = this.f83210d;
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append("keva_user_head_url");
        keva.storeString(sb.toString(), str);
    }

    /* renamed from: b */
    private void m103247b(String str) {
        this.f83212f = str;
        String obj = C7074e.m22069b().toString();
        Keva keva = this.f83210d;
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append("keva_user_id");
        keva.storeString(sb.toString(), str);
    }

    /* renamed from: a */
    public final IMContact mo82617a(List<? extends IMContact> list) {
        IMContact iMContact;
        C7573i.m23587b(list, "contactList");
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            iMContact = (IMContact) it.next();
            if (i >= 15) {
                break;
            } else if (TextUtils.equals(C7049a.m21936a(iMContact), mo82620b())) {
                break;
            } else {
                i++;
            }
        }
        iMContact = null;
        this.f83209a = iMContact;
        if (iMContact != null) {
            mo82619a(iMContact);
        }
        return iMContact;
    }

    /* renamed from: a */
    public final void mo82619a(IMContact iMContact) {
        C7573i.m23587b(iMContact, "contact");
        this.f83209a = iMContact;
        m103247b(C7049a.m21936a(iMContact));
        if (iMContact.getDisplayAvatar() != null) {
            UrlModel displayAvatar = iMContact.getDisplayAvatar();
            C7573i.m23582a((Object) displayAvatar, "contact.displayAvatar");
            if (C23477d.m77083b(displayAvatar.getUrlList())) {
                UrlModel displayAvatar2 = iMContact.getDisplayAvatar();
                C7573i.m23582a((Object) displayAvatar2, "contact.displayAvatar");
                Object obj = displayAvatar2.getUrlList().get(0);
                C7573i.m23582a(obj, "contact.displayAvatar.urlList[0]");
                m103246a((String) obj);
            }
        }
    }
}
