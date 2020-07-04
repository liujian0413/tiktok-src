package com.p280ss.android.ugc.aweme.share.improve;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.p1310a.C30545a;
import com.p280ss.android.ugc.aweme.p313im.p1310a.C30552c;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.C32015a;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1353b.C32021a;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38144b;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SkeletonShareDialog;
import com.p280ss.android.ugc.aweme.sharer.p338ui.bar.C38379c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.bar.ShareActionBar;
import com.p280ss.android.ugc.aweme.sharer.p338ui.bar.ShareChannelBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.CommonShareDialog */
public class CommonShareDialog extends SkeletonShareDialog {

    /* renamed from: b */
    public C32015a f99107b;

    /* renamed from: c */
    public final Activity f99108c;

    /* renamed from: f */
    private C38144b f99109f;

    /* renamed from: g */
    private ShareChannelBar f99110g;

    /* renamed from: h */
    private ShareActionBar f99111h;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.CommonShareDialog$a */
    public static final class C38063a implements C38379c {

        /* renamed from: a */
        final /* synthetic */ CommonShareDialog f99112a;

        C38063a(CommonShareDialog commonShareDialog) {
            this.f99112a = commonShareDialog;
        }

        /* renamed from: a */
        public final void mo63024a(C38343b bVar) {
            C7573i.m23587b(bVar, "channel");
            boolean a = bVar.mo71406a((C38354f) new C38358i("", null, 2, null), (Context) this.f99112a.f99108c);
            C38386d dVar = this.f99112a.f99582e.f99639l;
            if (dVar != null) {
                dVar.mo67216a(bVar, a, this.f99112a.f99582e.f99636i, this.f99112a.f99108c);
            }
            if (!bVar.mo95748g()) {
                this.f99112a.dismiss();
            }
        }
    }

    public CommonShareDialog(Activity activity, C38380c cVar) {
        this(activity, cVar, 0, 4, null);
    }

    /* renamed from: c */
    private void mo95706c() {
        C30545a aVar = new C30545a(m121459e());
        IIMService g = C30553b.m99810g();
        C7573i.m23582a((Object) g, "IM.get()");
        this.f99107b = g.getShareService().mo18080a(m121458d(), aVar);
    }

    /* renamed from: d */
    private C32021a m121458d() {
        Activity activity = this.f99108c;
        View findViewById = findViewById(R.id.d5r);
        if (findViewById == null) {
            C7573i.m23580a();
        }
        ViewGroup viewGroup = (ViewGroup) findViewById;
        View findViewById2 = findViewById(R.id.d5g);
        if (findViewById2 == null) {
            C7573i.m23580a();
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(R.id.d5i);
        if (findViewById3 == null) {
            C7573i.m23580a();
        }
        C32021a aVar = new C32021a(activity, this.f99582e.f99636i, viewGroup, viewGroup2, (ViewGroup) findViewById3, this instanceof DynamicShareDialog);
        return aVar;
    }

    /* renamed from: e */
    private C30552c m121459e() {
        Context context = this.f99108c;
        Dialog dialog = this;
        View findViewById = findViewById(R.id.d5k);
        if (findViewById == null) {
            C7573i.m23580a();
        }
        ViewGroup viewGroup = (ViewGroup) findViewById;
        View findViewById2 = findViewById(R.id.d5f);
        if (findViewById2 == null) {
            C7573i.m23580a();
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(R.id.d5h);
        if (findViewById3 == null) {
            C7573i.m23580a();
        }
        C30552c cVar = new C30552c(context, dialog, viewGroup, viewGroup2, findViewById3, this.f99582e.f99636i, this.f99582e.f99640m);
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            com.ss.android.ugc.aweme.sharer.ui.c r6 = r5.f99582e
            boolean r6 = r6.f99637j
            r0 = 0
            if (r6 == 0) goto L_0x0022
            com.ss.android.ugc.aweme.im.service.IIMService r6 = com.p280ss.android.ugc.aweme.p313im.C30553b.m99810g()
            if (r6 == 0) goto L_0x0022
            boolean r6 = r6.isImReduction()
            if (r6 != 0) goto L_0x0022
            r5.mo95706c()
            com.ss.android.ugc.aweme.share.improve.b.b r6 = r5.f99109f
            if (r6 == 0) goto L_0x0028
            com.ss.android.ugc.aweme.im.service.g.a r1 = r5.f99107b
            r6.f99251a = r1
            goto L_0x0028
        L_0x0022:
            com.ss.android.ugc.aweme.share.improve.b.b r6 = r5.f99109f
            if (r6 == 0) goto L_0x0028
            r6.f99252b = r0
        L_0x0028:
            boolean r6 = com.p280ss.android.ugc.aweme.share.p1536f.C38037a.m121403a()
            if (r6 != 0) goto L_0x0120
            com.ss.android.ugc.aweme.sharer.ui.c r6 = r5.f99582e
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r6 = r6.f99636i
            java.lang.String r6 = r6.f20181g
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r1 = "web"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r6 = android.text.TextUtils.equals(r6, r1)
            if (r6 != 0) goto L_0x0120
            r6 = 2131301559(0x7f0914b7, float:1.822118E38)
            android.view.View r6 = r5.findViewById(r6)
            if (r6 != 0) goto L_0x004c
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x004c:
            com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar r6 = (com.p280ss.android.ugc.aweme.sharer.p338ui.bar.ShareChannelBar) r6
            r5.f99110g = r6
            r6 = 2131301550(0x7f0914ae, float:1.8221161E38)
            android.view.View r6 = r5.findViewById(r6)
            if (r6 != 0) goto L_0x005c
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x005c:
            com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar r6 = (com.p280ss.android.ugc.aweme.sharer.p338ui.bar.ShareActionBar) r6
            r5.f99111h = r6
            com.ss.android.ugc.aweme.sharer.ui.c r6 = r5.f99582e
            java.util.List<com.ss.android.ugc.aweme.sharer.b> r6 = r6.f99628a
            java.util.Collection r6 = (java.util.Collection) r6
            r1 = 1
            if (r6 == 0) goto L_0x0072
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r6 = 0
            goto L_0x0073
        L_0x0072:
            r6 = 1
        L_0x0073:
            if (r6 != 0) goto L_0x00a9
            com.ss.android.ugc.aweme.sharer.ui.c r6 = r5.f99582e
            java.util.List<com.ss.android.ugc.aweme.sharer.b> r6 = r6.f99628a
            java.util.Iterator r6 = r6.iterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L_0x0084:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x00a0
            java.lang.Object r3 = r6.next()
            com.ss.android.ugc.aweme.sharer.b r3 = (com.p280ss.android.ugc.aweme.sharer.C38343b) r3
            boolean r4 = r3 instanceof com.p280ss.android.ugc.aweme.share.improve.p1539b.C38144b
            if (r4 != 0) goto L_0x0084
            com.ss.android.ugc.aweme.share.improve.e.a r4 = new com.ss.android.ugc.aweme.share.improve.e.a
            r4.<init>(r3)
            r2.add(r4)
            r6.remove()
            goto L_0x0084
        L_0x00a0:
            com.ss.android.ugc.aweme.sharer.ui.c r6 = r5.f99582e
            java.util.List<com.ss.android.ugc.aweme.sharer.b> r6 = r6.f99628a
            java.util.Collection r2 = (java.util.Collection) r2
            r6.addAll(r2)
        L_0x00a9:
            com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar r6 = r5.f99110g
            if (r6 != 0) goto L_0x00b2
            java.lang.String r2 = "sharePanelChannelBar"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00b2:
            if (r6 == 0) goto L_0x00bb
            com.ss.android.ugc.aweme.sharer.ui.c r2 = r5.f99582e
            java.util.List<com.ss.android.ugc.aweme.sharer.b> r2 = r2.f99628a
            r6.mo95959a(r2)
        L_0x00bb:
            com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar r6 = r5.f99110g
            if (r6 != 0) goto L_0x00c4
            java.lang.String r2 = "sharePanelChannelBar"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00c4:
            if (r6 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.share.improve.CommonShareDialog$a r2 = new com.ss.android.ugc.aweme.share.improve.CommonShareDialog$a
            r2.<init>(r5)
            com.ss.android.ugc.aweme.sharer.ui.bar.c r2 = (com.p280ss.android.ugc.aweme.sharer.p338ui.bar.C38379c) r2
            r6.mo95958a(r2)
        L_0x00d0:
            com.ss.android.ugc.aweme.sharer.ui.c r6 = r5.f99582e
            java.util.List<com.ss.android.ugc.aweme.sharer.ui.f> r6 = r6.f99629b
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L_0x00de
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00df
        L_0x00de:
            r0 = 1
        L_0x00df:
            if (r0 != 0) goto L_0x010d
            com.ss.android.ugc.aweme.sharer.ui.c r6 = r5.f99582e
            java.util.List<com.ss.android.ugc.aweme.sharer.ui.f> r6 = r6.f99629b
            java.util.Iterator r6 = r6.iterator()
        L_0x00e9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r0 = r6.next()
            com.ss.android.ugc.aweme.sharer.ui.f r0 = (com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f) r0
            java.lang.String r1 = r0.mo95715b()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "gif"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0109
            boolean r0 = r0 instanceof com.p280ss.android.ugc.aweme.share.improve.p1538a.C38128s
            if (r0 == 0) goto L_0x00e9
        L_0x0109:
            r6.remove()
            goto L_0x00e9
        L_0x010d:
            com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar r6 = r5.f99111h
            if (r6 != 0) goto L_0x0116
            java.lang.String r0 = "sharePanelActionBar"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0116:
            if (r6 == 0) goto L_0x0120
            com.ss.android.ugc.aweme.sharer.ui.c r0 = r5.f99582e
            java.util.List<com.ss.android.ugc.aweme.sharer.ui.f> r0 = r0.f99629b
            r6.mo95953a(r0)
            return
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.improve.CommonShareDialog.onCreate(android.os.Bundle):void");
    }

    public CommonShareDialog(Activity activity, C38380c cVar, int i) {
        boolean z;
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(cVar, "config");
        super(activity, i, cVar);
        this.f99108c = activity;
        Iterable iterable = cVar.f99628a;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((C38343b) next) instanceof C38144b) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        if (list.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            list = null;
        }
        if (list != null) {
            Object obj = list.get(0);
            if (obj != null) {
                this.f99109f = (C38144b) obj;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.channel.ImChannel");
            }
        }
        if (this.f99109f != null) {
            IIMService g = C30553b.m99810g();
            if (g != null && g.isImReduction()) {
                List<C38343b> list2 = cVar.f99628a;
                C38144b bVar = this.f99109f;
                if (bVar == null) {
                    C7573i.m23580a();
                }
                list2.remove(bVar);
                this.f99109f = null;
            }
        }
    }

    public /* synthetic */ CommonShareDialog(Activity activity, C38380c cVar, int i, int i2, C7571f fVar) {
        this(activity, cVar, R.style.t2);
    }
}
