package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30041c;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30041c.C30043b;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38331u;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.InviteFriendSharePackage */
public final class InviteFriendSharePackage extends SharePackage {
    public static final Creator<InviteFriendSharePackage> CREATOR = new C38198c();

    /* renamed from: b */
    public static final C38197b f99335b = new C38197b(null);

    /* renamed from: a */
    public C30041c f99336a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.InviteFriendSharePackage$a */
    public static final class C38196a extends C7219a<InviteFriendSharePackage> {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public InviteFriendSharePackage mo18866a() {
            return new InviteFriendSharePackage(this);
        }

        /* renamed from: a */
        public final C38196a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.InviteFriendSharePackage$b */
    public static final class C38197b {
        private C38197b() {
        }

        public /* synthetic */ C38197b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static InviteFriendSharePackage m122015a(C30041c cVar) {
            C7573i.m23587b(cVar, "inviteFriendPresenter");
            C7219a f = new C38196a().mo18870f("");
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            String a2 = cVar.mo76292a(C43122ff.m136789t(a.getCurUser()));
            C7573i.m23582a((Object) a2, "inviteFriendPresenter.ge…xyService.get().curUser))");
            InviteFriendSharePackage inviteFriendSharePackage = (InviteFriendSharePackage) f.mo18871g(a2).mo18872h("").mo18868d("text").mo18866a();
            inviteFriendSharePackage.mo95778a(cVar);
            return inviteFriendSharePackage;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.InviteFriendSharePackage$c */
    public static final class C38198c implements Creator<InviteFriendSharePackage> {
        C38198c() {
        }

        /* renamed from: a */
        private static InviteFriendSharePackage[] m122017a(int i) {
            return new InviteFriendSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122016a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122017a(i);
        }

        /* renamed from: a */
        private static InviteFriendSharePackage m122016a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new InviteFriendSharePackage(parcel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.InviteFriendSharePackage$d */
    static final class C38199d implements C30043b {

        /* renamed from: a */
        final /* synthetic */ InviteFriendSharePackage f99337a;

        /* renamed from: b */
        final /* synthetic */ C38343b f99338b;

        /* renamed from: c */
        final /* synthetic */ Context f99339c;

        C38199d(InviteFriendSharePackage inviteFriendSharePackage, C38343b bVar, Context context) {
            this.f99337a = inviteFriendSharePackage;
            this.f99338b = bVar;
            this.f99339c = context;
        }

        /* renamed from: a */
        public final void mo76304a(String str) {
            if (this.f99338b instanceof C38331u) {
                C38343b bVar = this.f99338b;
                C7573i.m23582a((Object) str, "it");
                bVar.mo71406a((C38354f) new C38356g(str, this.f99337a.f20183i, this.f99337a.f20184j), this.f99339c);
                return;
            }
            C38343b bVar2 = this.f99338b;
            C7573i.m23582a((Object) str, "it");
            bVar2.mo71406a((C38354f) new C38356g(str, this.f99337a.f20183i, this.f99337a.f20184j), this.f99339c);
        }
    }

    /* renamed from: b */
    public static final InviteFriendSharePackage m122006b(C30041c cVar) {
        return C38197b.m122015a(cVar);
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

    /* renamed from: a */
    public final void mo95778a(C30041c cVar) {
        C7573i.m23587b(cVar, "<set-?>");
        this.f99336a = cVar;
    }

    public InviteFriendSharePackage(C38196a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
    }

    public InviteFriendSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38196a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        return new C38356g(C38159c.m121914a(this.f20185k, bVar), this.f20183i, this.f20184j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        C6907h.m21524a("invite_via", (Map) C22984d.m75611a().mo59973a("platform", bVar.mo95739b()).mo59973a("enter_from", "invite_friends").f60753a);
        if (this.f99336a == null) {
            C7573i.m23583a("presenter");
        }
        C30041c cVar = this.f99336a;
        if (cVar == null) {
            C7573i.m23583a("presenter");
        }
        String a = C30041c.m98501a(cVar.mo76300e(), bVar.mo95739b(), "invitevia", "invite_friends", false);
        C37984ap.m121302b().addShareRecord(bVar.mo95739b(), 2);
        C30041c cVar2 = this.f99336a;
        if (cVar2 == null) {
            C7573i.m23583a("presenter");
        }
        cVar2.mo76295a(a, (C30043b) new C38199d(this, bVar, context));
        return true;
    }
}
