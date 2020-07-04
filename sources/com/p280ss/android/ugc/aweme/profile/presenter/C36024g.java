package com.p280ss.android.ugc.aweme.profile.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.app.AlertDialog;
import android.support.p029v7.app.AlertDialog.C1081a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileCoverCropActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileCoverLibActivity;
import com.p280ss.android.ugc.aweme.profile.util.C36749q;
import com.p280ss.android.ugc.aweme.profile.util.C36749q.C36759b;
import com.p280ss.android.ugc.aweme.profile.util.C36761s;
import com.p280ss.android.ugc.aweme.utils.C42916ad;
import com.zhihu.matisse.C47321a;
import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.p1853a.C47322a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.g */
public final class C36024g {

    /* renamed from: f */
    public static final int f94250f = 1;

    /* renamed from: g */
    public static final int f94251g = 2;

    /* renamed from: h */
    public static final C36025a f94252h = new C36025a(null);

    /* renamed from: a */
    public Activity f94253a;

    /* renamed from: b */
    public AlertDialog f94254b;

    /* renamed from: c */
    public File f94255c;

    /* renamed from: d */
    public final Fragment f94256d;

    /* renamed from: e */
    public final boolean f94257e;

    /* renamed from: i */
    private final String[] f94258i;

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.g$a */
    public static final class C36025a {
        private C36025a() {
        }

        public /* synthetic */ C36025a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.g$b */
    static final class C36026b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36024g f94259a;

        C36026b(C36024g gVar) {
            this.f94259a = gVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            switch (i) {
                case 0:
                    str = "camera";
                    this.f94259a.mo91677d();
                    C23060u a = C23060u.m75742a();
                    C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
                    a.mo60084n().mo59871a(Integer.valueOf(Integer.MAX_VALUE));
                    break;
                case 1:
                    str = "sys_album";
                    this.f94259a.mo91676c();
                    C23060u a2 = C23060u.m75742a();
                    C7573i.m23582a((Object) a2, "CommonSharePrefCache.inst()");
                    a2.mo60084n().mo59871a(Integer.valueOf(Integer.MAX_VALUE));
                    break;
                case 2:
                    str = "app_album";
                    this.f94259a.mo91674b();
                    C23060u a3 = C23060u.m75742a();
                    C7573i.m23582a((Object) a3, "CommonSharePrefCache.inst()");
                    C22903bl n = a3.mo60084n();
                    C7573i.m23582a((Object) n, "CommonSharePrefCache.inst().editCoverTipShowTime");
                    n.mo59871a(Integer.valueOf(Integer.MAX_VALUE));
                    if (this.f94259a.f94257e) {
                        Activity activity = this.f94259a.f94253a;
                        if (activity == null) {
                            C7573i.m23580a();
                        }
                        activity.finish();
                        break;
                    }
                    break;
                default:
                    str = "cancel";
                    AlertDialog alertDialog = this.f94259a.f94254b;
                    if (alertDialog == null) {
                        C7573i.m23580a();
                    }
                    alertDialog.dismiss();
                    break;
            }
            C6907h.m21524a("replace_profile_cover", (Map) new C22984d().mo59973a("enter_method", str).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.g$c */
    static final class C36027c implements C22480b {

        /* renamed from: a */
        final /* synthetic */ C36024g f94260a;

        C36027c(C36024g gVar) {
            this.f94260a = gVar;
        }

        /* renamed from: a */
        public final void mo53549a(String[] strArr, int[] iArr) {
            if (strArr.length > 1 && iArr[0] == 0 && iArr[1] == 0) {
                this.f94260a.f94255c = C36761s.m118494a();
                Activity activity = this.f94260a.f94253a;
                if (activity == null) {
                    C7573i.m23580a();
                }
                Fragment fragment = this.f94260a.f94256d;
                int i = C36024g.f94251g;
                File file = this.f94260a.f94255c;
                if (file == null) {
                    C7573i.m23580a();
                }
                String parent = file.getParent();
                C7573i.m23582a((Object) parent, "mProfileCoverFile!!.parent");
                File file2 = this.f94260a.f94255c;
                if (file2 == null) {
                    C7573i.m23580a();
                }
                String name = file2.getName();
                C7573i.m23582a((Object) name, "mProfileCoverFile!!.name");
                C42916ad.m136251a(activity, fragment, i, parent, name);
                return;
            }
            Activity activity2 = this.f94260a.f94253a;
            if (activity2 == null) {
                C7573i.m23580a();
            }
            C10761a.m31392b((Context) activity2, (int) R.string.ct3, 0).mo25750a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.g$d */
    static final class C36028d implements C22480b {

        /* renamed from: a */
        final /* synthetic */ C36024g f94261a;

        C36028d(C36024g gVar) {
            this.f94261a = gVar;
        }

        /* renamed from: a */
        public final void mo53549a(String[] strArr, int[] iArr) {
            boolean z;
            C7573i.m23582a((Object) strArr, "permissions");
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z) || iArr[0] != 0) {
                Activity activity = this.f94261a.f94253a;
                if (activity == null) {
                    C7573i.m23580a();
                }
                C10761a.m31392b((Context) activity, (int) R.string.ct5, 0).mo25750a();
                return;
            }
            this.f94261a.mo91671a(C36024g.f94250f);
        }
    }

    /* renamed from: b */
    public final void mo91674b() {
        Intent intent = new Intent(this.f94253a, ProfileCoverLibActivity.class);
        Activity activity = this.f94253a;
        if (activity == null) {
            C7573i.m23580a();
        }
        activity.startActivity(intent);
    }

    /* renamed from: c */
    public final void mo91676c() {
        C22477b.m74364a(this.f94253a, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new C36028d(this));
    }

    /* renamed from: d */
    public final void mo91677d() {
        C22477b.m74364a(this.f94253a, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C36027c(this));
    }

    /* renamed from: a */
    public final void mo91670a() {
        if (this.f94254b == null) {
            Activity activity = this.f94253a;
            if (activity == null) {
                C7573i.m23580a();
            }
            C1081a aVar = new C1081a(activity);
            aVar.mo4236a((CharSequence[]) this.f94258i, (OnClickListener) new C36026b(this));
            this.f94254b = aVar.mo4242b();
        }
        C6907h.m21524a("replace_profile_info", (Map) new C22984d().mo59973a("enter_method", "click_cover").f60753a);
        AlertDialog alertDialog = this.f94254b;
        if (alertDialog == null) {
            C7573i.m23580a();
        }
        alertDialog.show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r1 == null) goto L_0x000e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91673a(android.os.Bundle r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0014
            java.lang.String r0 = "profile_cover_file"
            java.io.File r1 = r2.f94255c
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.getAbsolutePath()
            if (r1 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r1 = ""
        L_0x0010:
            r3.putString(r0, r1)
            return
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.presenter.C36024g.mo91673a(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        if (r2 == null) goto L_0x000a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91675b(android.os.Bundle r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000a
            java.lang.String r0 = "profile_cover_file"
            java.lang.String r2 = r2.getString(r0)
            if (r2 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r2 = ""
        L_0x000c:
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x001a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r0 = 0
            goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            if (r0 == 0) goto L_0x001e
            return
        L_0x001e:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r1.f94255c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.presenter.C36024g.mo91675b(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo91671a(int i) {
        C47321a aVar;
        try {
            if (this.f94256d == null) {
                aVar = C47321a.m147748a(this.f94253a);
            } else {
                aVar = C47321a.m147749a(this.f94256d);
            }
            aVar.mo119331a(MimeType.ofImage()).mo119336a(true).mo119338b(false).mo119337b(1).mo119339c(-1).mo119334a((int) R.style.gv).mo119333a(0.85f).mo119335a((C47322a) new C36759b()).mo119342e(i);
        } catch (Exception e) {
            C6921a.m21554a(e);
            Activity activity = this.f94253a;
            if (activity == null) {
                C7573i.m23580a();
            }
            C19929d.m65758a(activity, this.f94256d, i);
        }
    }

    public C36024g(Activity activity, Fragment fragment, boolean z) {
        this.f94256d = fragment;
        this.f94257e = z;
        if (activity == null && this.f94256d == null) {
            throw new IllegalArgumentException("Must have a activity or a fragment");
        }
        this.f94253a = activity;
        if (this.f94253a == null) {
            Fragment fragment2 = this.f94256d;
            if (fragment2 == null) {
                C7573i.m23580a();
            }
            this.f94253a = fragment2.getActivity();
        }
        Activity activity2 = this.f94253a;
        if (activity2 == null) {
            C7573i.m23580a();
        }
        String[] a = C36749q.m118466a(activity2.getResources(), 0, 1, 2, 4);
        C7573i.m23582a((Object) a, "HeadUploadHelper.resStri…_STRING_ARRAY_IDX_CANCEL)");
        this.f94258i = a;
    }

    /* renamed from: a */
    public final void mo91672a(int i, int i2, Intent intent) {
        Uri uri;
        if (this.f94253a != null && i2 != 0) {
            if (i == f94250f) {
                if (intent != null) {
                    List a = C47321a.m147751a(intent);
                    if (a == null || a.isEmpty()) {
                        uri = intent.getData();
                    } else {
                        uri = (Uri) a.get(0);
                    }
                    String a2 = C19929d.m65756a((Context) this.f94253a, uri);
                    if (C6319n.m19593a(a2)) {
                        Activity activity = this.f94253a;
                        if (activity == null) {
                            C7573i.m23580a();
                        }
                        C9738o.m28694a((Context) activity, (int) R.drawable.wt, (int) R.string.cu2);
                        return;
                    }
                    this.f94255c = new File(a2);
                    File file = this.f94255c;
                    if (file == null) {
                        C7573i.m23580a();
                    }
                    if (!file.exists()) {
                        Activity activity2 = this.f94253a;
                        if (activity2 == null) {
                            C7573i.m23580a();
                        }
                        C9738o.m28694a((Context) activity2, (int) R.drawable.wt, (int) R.string.cu2);
                        return;
                    }
                    Context context = this.f94253a;
                    File file2 = this.f94255c;
                    if (file2 == null) {
                        C7573i.m23580a();
                    }
                    ProfileCoverCropActivity.m117043a(context, file2.getAbsolutePath(), 2);
                    if (this.f94257e) {
                        Activity activity3 = this.f94253a;
                        if (activity3 == null) {
                            C7573i.m23580a();
                        }
                        activity3.finish();
                    }
                }
            } else if (i == f94251g) {
                if (this.f94255c == null) {
                    if (intent != null) {
                        String a3 = C19929d.m65756a((Context) this.f94253a, intent.getData());
                        if (C6319n.m19593a(a3)) {
                            Activity activity4 = this.f94253a;
                            if (activity4 == null) {
                                C7573i.m23580a();
                            }
                            C9738o.m28694a((Context) activity4, (int) R.drawable.wt, (int) R.string.cu2);
                            return;
                        }
                        this.f94255c = new File(a3);
                    } else {
                        return;
                    }
                }
                File file3 = this.f94255c;
                if (file3 == null) {
                    C7573i.m23580a();
                }
                if (!file3.exists()) {
                    Activity activity5 = this.f94253a;
                    if (activity5 == null) {
                        C7573i.m23580a();
                    }
                    C9738o.m28694a((Context) activity5, (int) R.drawable.wt, (int) R.string.cu2);
                    return;
                }
                Activity activity6 = this.f94253a;
                if (activity6 == null) {
                    C7573i.m23580a();
                }
                Context context2 = activity6;
                File file4 = this.f94255c;
                if (file4 == null) {
                    C7573i.m23580a();
                }
                ProfileCoverCropActivity.m117043a(context2, file4.getAbsolutePath(), 1);
                if (this.f94257e) {
                    Activity activity7 = this.f94253a;
                    if (activity7 == null) {
                        C7573i.m23580a();
                    }
                    activity7.finish();
                }
            }
        }
    }
}
