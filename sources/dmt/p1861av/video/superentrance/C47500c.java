package dmt.p1861av.video.superentrance;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35536ag;
import com.p280ss.android.ugc.aweme.port.p1479in.C35536ag.C35537a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: dmt.av.video.superentrance.c */
public final class C47500c {

    /* renamed from: a */
    public final AmeActivity f121947a;

    /* renamed from: b */
    private boolean f121948b;

    /* renamed from: c */
    private boolean f121949c;

    /* renamed from: d */
    private boolean f121950d;

    /* renamed from: dmt.av.video.superentrance.c$a */
    public static final class C47501a implements C35537a {

        /* renamed from: a */
        final /* synthetic */ C47500c f121951a;

        /* renamed from: b */
        final /* synthetic */ C7562b f121952b;

        C47501a(C47500c cVar, C7562b bVar) {
            this.f121951a = cVar;
            this.f121952b = bVar;
        }

        /* renamed from: a */
        public final void mo90362a(String[] strArr, int[] iArr) {
            C47494a.m148230a(strArr, iArr);
            if (C47500c.m148245a(iArr)) {
                this.f121952b.invoke(Boolean.valueOf(true));
            } else {
                this.f121952b.invoke(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: dmt.av.video.superentrance.c$b */
    static final class C47502b implements OnCancelListener {

        /* renamed from: a */
        public static final C47502b f121953a = new C47502b();

        C47502b() {
        }

        public final void onCancel(DialogInterface dialogInterface) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: dmt.av.video.superentrance.c$c */
    static final class C47503c implements OnClickListener {

        /* renamed from: a */
        public static final C47503c f121954a = new C47503c();

        C47503c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: dmt.av.video.superentrance.c$d */
    static final class C47504d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47500c f121955a;

        /* renamed from: b */
        final /* synthetic */ boolean f121956b;

        /* renamed from: c */
        final /* synthetic */ C7562b f121957c;

        C47504d(C47500c cVar, boolean z, C7562b bVar) {
            this.f121955a = cVar;
            this.f121956b = z;
            this.f121957c = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f121956b) {
                C35563c.f93224F.mo70088c().mo90361d(this.f121955a.f121947a);
                dialogInterface.dismiss();
                return;
            }
            this.f121955a.mo119620a(this.f121957c);
        }
    }

    /* renamed from: c */
    private final boolean m148247c() {
        if (!this.f121949c || !this.f121948b || !this.f121950d) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m148246b() {
        String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (C35563c.f93224F.mo70088c().mo90355a((Context) this.f121947a, str) == -1 && !C35563c.f93224F.mo70088c().mo90358a((Activity) this.f121947a, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m148244a() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (C35563c.f93224F.mo70088c().mo90359b(this.f121947a) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f121948b = z;
        if (C35563c.f93224F.mo70088c().mo90354a(this.f121947a) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f121949c = z2;
        if (C35563c.f93224F.mo70088c().mo90360c(this.f121947a) == 0) {
            z3 = true;
        }
        this.f121950d = z3;
        return m148247c();
    }

    public C47500c(AmeActivity ameActivity) {
        C7573i.m23587b(ameActivity, "activity");
        this.f121947a = ameActivity;
    }

    /* renamed from: a */
    public static boolean m148245a(int[] iArr) {
        boolean z;
        if (iArr != null) {
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                for (int i : iArr) {
                    if (i != 0) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo119621b(C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(bVar, "requestPermissionCallback");
        Dialog a = new C10741a(this.f121947a).mo25657b((int) R.string.l_).mo25658b((int) R.string.w_, (OnClickListener) C47503c.f121954a).mo25650a((int) R.string.afp, (OnClickListener) new C47504d(this, m148246b(), bVar)).mo25656a().mo25637a();
        a.setOnCancelListener(C47502b.f121953a);
        C42951au.m136342a(a);
    }

    /* renamed from: a */
    public final void mo119620a(C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(bVar, "requestPermissionCallback");
        if (m148244a()) {
            bVar.invoke(Boolean.valueOf(true));
            return;
        }
        if (!C35563c.f93224F.mo70088c().mo90357a()) {
            bVar.invoke(Boolean.valueOf(false));
            return;
        }
        List arrayList = new ArrayList();
        if (!this.f121948b) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (!this.f121949c) {
            arrayList.add("android.permission.CAMERA");
        }
        if (!this.f121950d) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            for (String a : strArr) {
                C6907h.m21524a("permission_toast_show", (Map) C22984d.m75611a().mo59973a("permission_type", C47494a.m148228a(a)).mo59973a("enter_from", "video_shoot_page").f60753a);
            }
            C35536ag c = C35563c.f93224F.mo70088c();
            AmeActivity ameActivity = this.f121947a;
            if (ameActivity != null) {
                c.mo90356a(ameActivity, new C47501a(this, bVar), (String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
