package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.content.C0683b;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.utils.C42969bc;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.aj */
public final class C38082aj {

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.aj$a */
    static final class C38083a implements C22480b {

        /* renamed from: a */
        final /* synthetic */ C7561a f99140a;

        /* renamed from: b */
        final /* synthetic */ Activity f99141b;

        C38083a(C7561a aVar, Activity activity) {
            this.f99140a = aVar;
            this.f99141b = activity;
        }

        /* renamed from: a */
        public final void mo53549a(String[] strArr, int[] iArr) {
            boolean z;
            if (iArr != null) {
                if (iArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (iArr[0] == 0) {
                        C7561a aVar = this.f99140a;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                    } else {
                        C37950a.m121238a().showPremissionDialog(R.string.cn0, R.string.cmz, this.f99141b);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.aj$b */
    static final class C38084b implements C22480b {

        /* renamed from: a */
        final /* synthetic */ Activity f99142a;

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a.aj$b$a */
        static final class C38085a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C38084b f99143a;

            C38085a(C38084b bVar) {
                this.f99143a = bVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C42969bc.m136401a(this.f99143a.f99142a);
            }
        }

        C38084b(Activity activity) {
            this.f99142a = activity;
        }

        /* renamed from: a */
        public final void mo53549a(String[] strArr, int[] iArr) {
            boolean z;
            C7573i.m23582a((Object) iArr, "grantResults");
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && iArr[0] == -1 && !ActivityCompat.m2242a(this.f99142a, strArr[0])) {
                C42951au.m136341a(this.f99142a, R.string.lb, R.string.w_, null, R.string.afp, new C38085a(this)).show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.aj$c */
    static final class C38086c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28343z f99144a;

        /* renamed from: b */
        final /* synthetic */ Aweme f99145b;

        C38086c(C28343z zVar, Aweme aweme) {
            this.f99144a = zVar;
            this.f99145b = aweme;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C28343z zVar = this.f99144a;
            if (zVar != null) {
                zVar.mo64929a(new C28318an(2, this.f99145b));
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: b */
    public static final boolean m121571b(Aweme aweme) {
        boolean z;
        boolean z2;
        C7573i.m23587b(aweme, "aweme");
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl isPrivateAvailable = inst.getIsPrivateAvailable();
        C7573i.m23582a((Object) isPrivateAvailable, "SharePrefCache.inst().isPrivateAvailable");
        Boolean bool = (Boolean) isPrivateAvailable.mo59877d();
        if (C43168s.m136912d(aweme) || C43168s.m136911c(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (aweme.getAuthor() != null) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            String curUserId = f.getCurUserId();
            User author = aweme.getAuthor();
            C7573i.m23582a((Object) author, "aweme.author");
            if (C6319n.m19594a(curUserId, author.getUid())) {
                z2 = true;
                C7573i.m23582a((Object) bool, "isPrivateAvailable");
                if (bool.booleanValue() || !z || !z2) {
                    return false;
                }
                return true;
            }
        }
        z2 = false;
        C7573i.m23582a((Object) bool, "isPrivateAvailable");
        if (bool.booleanValue()) {
        }
        return false;
    }

    /* renamed from: a */
    public static final void m121568a(Aweme aweme) {
        String str;
        boolean z;
        C7573i.m23587b(aweme, "aweme");
        C6869c cVar = new C6869c();
        String str2 = "author_id";
        User author = aweme.getAuthor();
        if (author != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        C6869c a = cVar.mo16887a(str2, str);
        String str3 = "video_is_null";
        if (aweme.getVideo() == null) {
            z = true;
        } else {
            z = false;
        }
        C6877n.m21447a("aweme_video_author_info_unmatch", a.mo16882a(str3, Boolean.valueOf(z)).mo16888b());
    }

    /* renamed from: a */
    public static final boolean m121569a(Activity activity) {
        C7573i.m23587b(activity, "context");
        if (C0683b.m2909b((Context) activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C38084b(activity));
        return false;
    }

    /* renamed from: a */
    public static final void m121566a(Activity activity, C7561a<C7581n> aVar) {
        C7573i.m23587b(activity, "context");
        if (C43162f.m136888c(activity) != 0) {
            C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C38083a(aVar, activity));
        } else if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: a */
    public static final boolean m121570a(Aweme aweme, Context context) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(context, "context");
        AwemeStatus status = aweme.getStatus();
        if (status == null || status.isAllowShare()) {
            return true;
        }
        C10761a.m31399c(context, (int) R.string.w7).mo25750a();
        return false;
    }

    /* renamed from: a */
    public static final void m121567a(Context context, Aweme aweme, C28343z<C28318an> zVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        C10741a aVar = new C10741a(context);
        if (aweme.getStarAtlasOrderId() > 0) {
            aVar.mo25657b((int) R.string.ao0);
        } else {
            aVar.mo25657b((int) R.string.anv);
        }
        aVar.mo25658b((int) R.string.w_, (OnClickListener) null).mo25650a((int) R.string.ans, (OnClickListener) new C38086c(zVar, aweme)).mo25656a().mo25637a();
    }
}
