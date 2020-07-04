package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39186f.C39187a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39193g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1555b.C39147a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39166d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39167e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39505b;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.IStickPointMusicAdapter;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42605d;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42612j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw */
public final class C38991aw implements C39055bo {

    /* renamed from: a */
    public boolean f101242a;

    /* renamed from: b */
    public int f101243b;

    /* renamed from: c */
    public boolean f101244c;

    /* renamed from: d */
    public C38997ax f101245d;

    /* renamed from: e */
    private final IStickPointMusicAdapter f101246e;

    /* renamed from: f */
    private final ArrayList<AVMusic> f101247f = new ArrayList<>();

    /* renamed from: g */
    private final C39505b f101248g = new C39505b();

    /* renamed from: h */
    private final Activity f101249h;

    /* renamed from: i */
    private int f101250i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw$a */
    static final class C38993a extends Lambda implements C7562b<C42605d, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38991aw f101252a;

        C38993a(C38991aw awVar) {
            this.f101252a = awVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m124558a((C42605d) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124558a(C42605d dVar) {
            C7573i.m23587b(dVar, "result");
            if (dVar.f110763c != null) {
                this.f101252a.mo97304c(dVar.f110763c);
                return;
            }
            C38997ax axVar = this.f101252a.f101245d;
            if (axVar != null) {
                axVar.mo97314a(null, !this.f101252a.f101242a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw$b */
    static final class C38994b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38991aw f101253a;

        C38994b(C38991aw awVar) {
            this.f101253a = awVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m124559a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124559a() {
            C38997ax axVar = this.f101253a.f101245d;
            if (axVar != null) {
                axVar.mo97314a(null, !this.f101253a.f101242a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw$c */
    public static final class C38995c implements C39166d {

        /* renamed from: a */
        final /* synthetic */ C38991aw f101254a;

        C38995c(C38991aw awVar) {
            this.f101254a = awVar;
        }

        /* renamed from: a */
        public final void mo97306a(AVMusic aVMusic, boolean z) {
            if (!z) {
                this.f101254a.mo97301b(aVMusic);
            }
        }

        /* renamed from: b */
        public final void mo97307b(AVMusic aVMusic, boolean z) {
            if (z) {
                this.f101254a.mo97297a(aVMusic);
            } else {
                this.f101254a.mo97301b(aVMusic);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw$d */
    public static final class C38996d implements C39167e {

        /* renamed from: a */
        final /* synthetic */ C38991aw f101255a;

        C38996d(C38991aw awVar) {
            this.f101255a = awVar;
        }

        /* renamed from: a */
        public final void mo97308a(Exception exc) {
            C38997ax axVar = this.f101255a.f101245d;
            if (axVar != null) {
                axVar.mo97318c();
            }
        }

        /* renamed from: a */
        public final void mo97309a(List<? extends AVMusic> list) {
            Collection collection = list;
            if (C23477d.m77081a(collection)) {
                C38997ax axVar = this.f101255a.f101245d;
                if (axVar != null) {
                    axVar.mo97318c();
                    return;
                }
                return;
            }
            C38991aw awVar = this.f101255a;
            if (list == null) {
                C7573i.m23580a();
            }
            awVar.mo97302b(C7525m.m23509d(collection));
        }
    }

    /* renamed from: b */
    public final IStickPointMusicAdapter mo97300b() {
        return this.f101246e;
    }

    /* renamed from: a */
    public final AVMusic mo97295a() {
        if (C23477d.m77081a((Collection<T>) this.f101247f)) {
            return null;
        }
        IStickPointMusicAdapter iStickPointMusicAdapter = this.f101246e;
        if (iStickPointMusicAdapter == null) {
            C7573i.m23580a();
        }
        return m124545b(iStickPointMusicAdapter.mo103962a());
    }

    /* renamed from: c */
    public final void mo97303c() {
        List list;
        int i;
        StringBuilder sb = new StringBuilder();
        C38997ax axVar = this.f101245d;
        if (axVar != null) {
            list = axVar.mo97320e();
        } else {
            list = null;
        }
        Collection collection = list;
        if (C23477d.m77081a(collection) || C23477d.m77081a(collection)) {
            i = 0;
        } else {
            if (list == null) {
                C7573i.m23580a();
            }
            i = list.size();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(((VideoSegment) list.get(i2)).f100761c);
                if (i2 < i - 1) {
                    sb.append(",");
                }
            }
        }
        C38997ax axVar2 = this.f101245d;
        if (axVar2 != null) {
            axVar2.mo97315b();
        }
        C39187a.m125119a().mo97473a(i, sb.toString(), (C39167e) new C38996d(this));
    }

    /* renamed from: a */
    public final void mo97298a(C38997ax axVar) {
        C7573i.m23587b(axVar, "listener");
        this.f101245d = axVar;
    }

    /* renamed from: d */
    private final void m124546d(AVMusic aVMusic) {
        C38997ax axVar = this.f101245d;
        if (axVar != null) {
            axVar.mo97317b(aVMusic);
        }
        this.f101244c = true;
        C39147a.f101501a.mo97436a(this.f101249h, aVMusic, new C38995c(this));
    }

    /* renamed from: b */
    public final void mo97301b(AVMusic aVMusic) {
        C38997ax axVar = this.f101245d;
        if (axVar != null) {
            axVar.mo97314a(null, !this.f101242a);
        }
        this.f101244c = false;
        this.f101242a = false;
        C38997ax axVar2 = this.f101245d;
        if (axVar2 != null) {
            axVar2.mo97310a();
        }
    }

    public C38991aw(Context context) {
        C7573i.m23587b(context, "context");
        this.f101249h = (Activity) context;
        this.f101243b = -1;
        this.f101250i = -1;
        this.f101246e = C35563c.f93224F.mo70086a().mo103845a((List<AVMusic>) this.f101247f, (C42612j) new C42612j(this) {

            /* renamed from: a */
            final /* synthetic */ C38991aw f101251a;

            {
                this.f101251a = r1;
            }

            /* renamed from: a */
            public final void mo97305a(View view, int i) {
                C7573i.m23587b(view, "view");
                if (!this.f101251a.f101244c) {
                    this.f101251a.f101243b = i;
                    this.f101251a.mo97296a(i);
                }
            }
        });
    }

    /* renamed from: b */
    private final AVMusic m124545b(int i) {
        if (!C23477d.m77081a((Collection<T>) this.f101247f) && i >= 0 && i < this.f101247f.size()) {
            return (AVMusic) this.f101247f.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo97299a(List<AVMusic> list) {
        if (C23477d.m77081a((Collection<T>) list)) {
            mo97303c();
        } else {
            mo97302b(list);
        }
    }

    /* renamed from: a */
    public final void mo97296a(int i) {
        if (i == -1) {
            C39505b.m126187a(this.f101249h, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, new C38993a(this), new C38994b(this));
            C38997ax axVar = this.f101245d;
            if (axVar != null) {
                axVar.mo97321f();
            }
            this.f101242a = true;
            return;
        }
        IStickPointMusicAdapter iStickPointMusicAdapter = this.f101246e;
        if (iStickPointMusicAdapter == null) {
            C7573i.m23580a();
        }
        if (iStickPointMusicAdapter.mo103962a() != this.f101246e.mo103967b() || this.f101246e.mo103962a() != i) {
            AVMusic b = m124545b(i);
            C38997ax axVar2 = this.f101245d;
            if (axVar2 != null) {
                axVar2.mo97313a(b);
            }
            this.f101246e.mo103964a(i, false);
            this.f101246e.mo103975g();
            m124546d(b);
        }
    }

    /* renamed from: b */
    public final void mo97302b(List<AVMusic> list) {
        C38997ax axVar = this.f101245d;
        if (axVar != null) {
            axVar.mo97319d();
        }
        IStickPointMusicAdapter iStickPointMusicAdapter = this.f101246e;
        if (iStickPointMusicAdapter == null) {
            C7573i.m23580a();
        }
        iStickPointMusicAdapter.mo103974f();
        ArrayList<AVMusic> arrayList = this.f101247f;
        if (list == null) {
            C7573i.m23580a();
        }
        arrayList.addAll(list);
        this.f101246e.mo103992a(list);
        mo97296a(0);
    }

    /* renamed from: a */
    public final void mo97297a(AVMusic aVMusic) {
        if (!this.f101242a || this.f101243b != -1) {
            this.f101250i = this.f101243b;
            IStickPointMusicAdapter iStickPointMusicAdapter = this.f101246e;
            if (iStickPointMusicAdapter == null) {
                C7573i.m23580a();
            }
            iStickPointMusicAdapter.mo103969b(this.f101246e.mo103967b(), true);
            C39193g.f101577a.mo97477a(aVMusic, this.f101243b);
        } else {
            ArrayList<AVMusic> arrayList = this.f101247f;
            if (aVMusic == null) {
                C7573i.m23580a();
            }
            arrayList.add(0, aVMusic);
            IStickPointMusicAdapter iStickPointMusicAdapter2 = this.f101246e;
            if (iStickPointMusicAdapter2 == null) {
                C7573i.m23580a();
            }
            iStickPointMusicAdapter2.mo103991a(aVMusic);
            this.f101246e.mo103963a(this.f101246e.mo103962a() + 1);
            this.f101246e.mo103969b(0, true);
            C39193g.f101577a.mo97476a(aVMusic);
            this.f101250i = 0;
        }
        C38997ax axVar = this.f101245d;
        if (axVar != null) {
            axVar.mo97314a(aVMusic, !this.f101242a);
        }
        if (this.f101243b != -1) {
            C38997ax axVar2 = this.f101245d;
            if (axVar2 != null) {
                axVar2.mo97311a(this.f101243b + 1);
            }
        }
        this.f101244c = false;
        this.f101242a = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97304c(com.p280ss.android.ugc.aweme.shortvideo.AVMusic r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0006
            r7.f101242a = r0
            return
        L_0x0006:
            java.lang.String r1 = r8.getMusicId()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = -1
            if (r1 != 0) goto L_0x003d
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVMusic> r1 = r7.f101247f
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
        L_0x001c:
            if (r3 >= r1) goto L_0x006e
            java.lang.String r4 = r8.getMusicId()
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVMusic> r5 = r7.f101247f
            java.lang.Object r5 = r5.get(r3)
            java.lang.String r6 = "musicModelList[i]"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            com.ss.android.ugc.aweme.shortvideo.AVMusic r5 = (com.p280ss.android.ugc.aweme.shortvideo.AVMusic) r5
            java.lang.String r5 = r5.getMusicId()
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r4, r5)
            if (r4 == 0) goto L_0x003a
            goto L_0x006f
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x003d:
            java.lang.String r1 = r8.getPath()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x006e
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVMusic> r1 = r7.f101247f
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
        L_0x0052:
            if (r3 >= r1) goto L_0x006e
            java.lang.String r4 = r8.getPath()
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVMusic> r5 = r7.f101247f
            java.lang.Object r5 = r5.get(r3)
            com.ss.android.ugc.aweme.shortvideo.AVMusic r5 = (com.p280ss.android.ugc.aweme.shortvideo.AVMusic) r5
            java.lang.String r5 = r5.getPath()
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r4, r5)
            if (r4 == 0) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            int r3 = r3 + 1
            goto L_0x0052
        L_0x006e:
            r3 = -1
        L_0x006f:
            if (r3 != r2) goto L_0x007a
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e r0 = com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e.f101552a
            r0.mo97467a(r8)
            r7.m124546d(r8)
            return
        L_0x007a:
            int r8 = r7.f101250i
            if (r3 != r8) goto L_0x009c
            int r8 = r7.f101243b
            if (r8 == r2) goto L_0x008d
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ax r8 = r7.f101245d
            if (r8 == 0) goto L_0x008d
            int r1 = r7.f101243b
            int r1 = r1 + 1
            r8.mo97311a(r1)
        L_0x008d:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ax r8 = r7.f101245d
            if (r8 == 0) goto L_0x0099
            r1 = 0
            boolean r2 = r7.f101242a
            r2 = r2 ^ 1
            r8.mo97314a(r1, r2)
        L_0x0099:
            r7.f101242a = r0
            return
        L_0x009c:
            r7.f101243b = r3
            r7.mo97296a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.C38991aw.mo97304c(com.ss.android.ugc.aweme.shortvideo.AVMusic):void");
    }
}
