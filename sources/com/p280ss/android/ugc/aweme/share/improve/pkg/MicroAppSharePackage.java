package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.miniapp_api.model.GlobalMicroAppParams.C33448a;
import com.p280ss.android.ugc.aweme.miniapp_api.model.GlobalMicroAppParams.C33449b;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33431f;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.DynamicShareDialog;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d.C38387a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage */
public final class MicroAppSharePackage extends SharePackage {
    public static final Creator<MicroAppSharePackage> CREATOR = new C38210c();

    /* renamed from: b */
    public static final C38207b f99354b = new C38207b(null);

    /* renamed from: a */
    public final C33431f f99355a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage$a */
    public static final class C38206a extends C7219a<MicroAppSharePackage> {

        /* renamed from: a */
        public C33431f f99356a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public MicroAppSharePackage mo18866a() {
            return new MicroAppSharePackage(this);
        }

        /* renamed from: a */
        public final C38206a mo95788a(C33431f fVar) {
            this.f99356a = fVar;
            return this;
        }

        /* renamed from: a */
        public final C38206a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage$b */
    public static final class C38207b {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage$b$a */
        public static final class C38208a implements C38386d {

            /* renamed from: a */
            final /* synthetic */ Activity f99357a;

            /* renamed from: b */
            final /* synthetic */ MicroAppSharePackage f99358b;

            /* renamed from: c */
            final /* synthetic */ C33431f f99359c;

            /* renamed from: a */
            public final void mo67217a(SharePackage sharePackage, Context context) {
                C7573i.m23587b(sharePackage, "sharePackage");
                C7573i.m23587b(context, "context");
            }

            /* renamed from: a */
            public final void mo67218a(C38389f fVar, SharePackage sharePackage, Context context) {
                C7573i.m23587b(fVar, "action");
                C7573i.m23587b(sharePackage, "sharePackage");
                C7573i.m23587b(context, "context");
            }

            /* renamed from: b */
            public final void mo67219b(SharePackage sharePackage, Context context) {
                C7573i.m23587b(sharePackage, "sharePackage");
                C7573i.m23587b(context, "context");
                this.f99359c.mo85672b("");
            }

            C38208a(Activity activity, MicroAppSharePackage microAppSharePackage, C33431f fVar) {
                this.f99357a = activity;
                this.f99358b = microAppSharePackage;
                this.f99359c = fVar;
            }

            /* renamed from: a */
            public final void mo67216a(C38343b bVar, boolean z, SharePackage sharePackage, Context context) {
                C7573i.m23587b(bVar, "channel");
                C7573i.m23587b(context, "context");
                C38387a.m122612a(this, bVar, z, sharePackage, context);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage$b$b */
        static final class C38209b implements OnCancelListener {

            /* renamed from: a */
            final /* synthetic */ C33431f f99360a;

            C38209b(C33431f fVar) {
                this.f99360a = fVar;
            }

            public final void onCancel(DialogInterface dialogInterface) {
                this.f99360a.mo85672b("");
            }
        }

        private C38207b() {
        }

        public /* synthetic */ C38207b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final MicroAppSharePackage mo95789a(C33449b bVar, MicroAppSharePackage microAppSharePackage) {
            C33431f fVar;
            C7573i.m23587b(bVar, "shareContent");
            if (microAppSharePackage != null) {
                fVar = microAppSharePackage.f99355a;
            } else {
                fVar = null;
            }
            return m122054a(bVar, fVar);
        }

        /* renamed from: a */
        public static DynamicShareDialog m122053a(Activity activity, C33431f fVar) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(fVar, "listener");
            MicroAppSharePackage microAppSharePackage = (MicroAppSharePackage) new C38206a().mo95788a(fVar).mo18868d("game").mo18866a();
            C38382b bVar = new C38382b();
            C37984ap.m121301a().injectUniversalConfig(bVar, activity, true);
            bVar.mo95977b(false);
            bVar.mo95964a((SharePackage) microAppSharePackage);
            bVar.mo95966a((C38386d) new C38208a(activity, microAppSharePackage, fVar));
            DynamicShareDialog dynamicShareDialog = new DynamicShareDialog(activity, bVar.mo95972a(), R.style.sl);
            dynamicShareDialog.setOnCancelListener(new C38209b(fVar));
            dynamicShareDialog.show();
            return dynamicShareDialog;
        }

        /* renamed from: a */
        public static MicroAppSharePackage m122054a(C33449b bVar, C33431f fVar) {
            boolean z;
            C7573i.m23587b(bVar, "shareContent");
            C23323e.m76526b(bVar.f87302c);
            C38206a a = new C38206a().mo95788a(fVar);
            C33448a aVar = bVar.f87312m;
            C7573i.m23582a((Object) aVar, "shareContent.appInfo");
            String str = aVar.f87294a;
            C7573i.m23582a((Object) str, "shareContent.appInfo.appId");
            C7219a e = a.mo18869e(str);
            String str2 = bVar.f87301b;
            C7573i.m23582a((Object) str2, "shareContent.title");
            C7219a f = e.mo18870f(str2);
            String str3 = bVar.f87311l;
            if (str3 == null) {
                str3 = "";
            }
            C7219a g = f.mo18871g(str3);
            String b = C38157b.m121908b(bVar.f87308i);
            if (b == null) {
                b = "";
            }
            MicroAppSharePackage microAppSharePackage = (MicroAppSharePackage) g.mo18872h(b).mo18868d("game").mo18866a();
            Bundle bundle = microAppSharePackage.f20186l;
            C33448a aVar2 = bVar.f87312m;
            C7573i.m23582a((Object) aVar2, "shareContent.appInfo");
            bundle.putString("app_name", aVar2.f87296c);
            bundle.putString("thumb_url", bVar.f87302c);
            String str4 = "is_game";
            C33448a aVar3 = bVar.f87312m;
            C7573i.m23582a((Object) aVar3, "shareContent.appInfo");
            if (aVar3.f87299f == 2) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean(str4, z);
            bundle.putString("query", bVar.f87303d);
            C33448a aVar4 = bVar.f87312m;
            C7573i.m23582a((Object) aVar4, "shareContent.appInfo");
            bundle.putString("app_id", aVar4.f87294a);
            return microAppSharePackage;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage$c */
    public static final class C38210c implements Creator<MicroAppSharePackage> {
        C38210c() {
        }

        /* renamed from: a */
        private static MicroAppSharePackage[] m122061a(int i) {
            return new MicroAppSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122060a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122061a(i);
        }

        /* renamed from: a */
        private static MicroAppSharePackage m122060a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new MicroAppSharePackage(parcel);
        }
    }

    /* renamed from: a */
    public static final DynamicShareDialog m122043a(Activity activity, C33431f fVar) {
        return C38207b.m122053a(activity, fVar);
    }

    /* renamed from: a */
    public static final MicroAppSharePackage m122044a(C33449b bVar, C33431f fVar) {
        return C38207b.m122054a(bVar, (C33431f) null);
    }

    /* renamed from: a */
    public static final MicroAppSharePackage m122045a(C33449b bVar, MicroAppSharePackage microAppSharePackage) {
        return f99354b.mo95789a(bVar, microAppSharePackage);
    }

    public final int describeContents() {
        return 0;
    }

    public MicroAppSharePackage(C38206a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
        this.f99355a = aVar.f99356a;
    }

    public MicroAppSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38206a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        return new C38356g(this.f20185k, this.f20183i, this.f20184j);
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        if (super.mo18861a(bVar, context)) {
            return true;
        }
        C33431f fVar = this.f99355a;
        if (fVar != null) {
            fVar.mo85671a(bVar.mo95739b(), true);
        }
        return true;
    }
}
