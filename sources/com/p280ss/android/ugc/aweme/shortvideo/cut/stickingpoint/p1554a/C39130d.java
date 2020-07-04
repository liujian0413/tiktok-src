package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1554a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
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
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39168f;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39505b;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.IStickPointMusicAdapter;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42605d;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42612j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.d */
public final class C39130d extends C39108a {

    /* renamed from: b */
    public StickPointMusicView f101466b;

    /* renamed from: c */
    public C39168f f101467c;

    /* renamed from: d */
    public boolean f101468d;

    /* renamed from: e */
    public int f101469e;

    /* renamed from: f */
    public boolean f101470f;

    /* renamed from: g */
    private final IStickPointMusicAdapter f101471g;

    /* renamed from: h */
    private final ArrayList<AVMusic> f101472h = new ArrayList<>();

    /* renamed from: i */
    private final C39505b f101473i = new C39505b();

    /* renamed from: j */
    private final Activity f101474j;

    /* renamed from: k */
    private int f101475k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.d$a */
    static final class C39132a extends Lambda implements C7562b<C42605d, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39130d f101477a;

        C39132a(C39130d dVar) {
            this.f101477a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m124923a((C42605d) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124923a(C42605d dVar) {
            C7573i.m23587b(dVar, "result");
            if (dVar.f110763c != null) {
                this.f101477a.mo97417c(dVar.f110763c);
                return;
            }
            C39168f fVar = this.f101477a.f101467c;
            if (fVar != null) {
                fVar.mo97327a(null, !this.f101477a.f101468d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.d$b */
    static final class C39133b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39130d f101478a;

        C39133b(C39130d dVar) {
            this.f101478a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m124924a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124924a() {
            C39168f fVar = this.f101478a.f101467c;
            if (fVar != null) {
                fVar.mo97327a(null, !this.f101478a.f101468d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.d$c */
    public static final class C39134c implements C39166d {

        /* renamed from: a */
        final /* synthetic */ C39130d f101479a;

        C39134c(C39130d dVar) {
            this.f101479a = dVar;
        }

        /* renamed from: a */
        public final void mo97306a(AVMusic aVMusic, boolean z) {
            if (!z) {
                this.f101479a.mo97414b(aVMusic);
            }
        }

        /* renamed from: b */
        public final void mo97307b(AVMusic aVMusic, boolean z) {
            if (z) {
                this.f101479a.mo97410a(aVMusic);
            } else {
                this.f101479a.mo97414b(aVMusic);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.d$d */
    public static final class C39135d implements C39167e {

        /* renamed from: a */
        final /* synthetic */ C39130d f101480a;

        C39135d(C39130d dVar) {
            this.f101480a = dVar;
        }

        /* renamed from: a */
        public final void mo97308a(Exception exc) {
            StickPointMusicView stickPointMusicView = this.f101480a.f101466b;
            if (stickPointMusicView != null) {
                stickPointMusicView.mo97540c();
            }
        }

        /* renamed from: a */
        public final void mo97309a(List<? extends AVMusic> list) {
            Collection collection = list;
            if (C23477d.m77081a(collection)) {
                StickPointMusicView stickPointMusicView = this.f101480a.f101466b;
                if (stickPointMusicView != null) {
                    stickPointMusicView.mo97540c();
                    return;
                }
                return;
            }
            C39130d dVar = this.f101480a;
            if (list == null) {
                C7573i.m23580a();
            }
            dVar.mo97415b(C7525m.m23509d(collection));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.d$e */
    public static final class C39136e implements C39168f {

        /* renamed from: a */
        final /* synthetic */ C39130d f101481a;

        /* renamed from: b */
        final /* synthetic */ C39168f f101482b;

        /* renamed from: a */
        public final List<VideoSegment> mo97324a() {
            C39168f fVar = this.f101482b;
            if (fVar != null) {
                return fVar.mo97324a();
            }
            return null;
        }

        /* renamed from: b */
        public final void mo97328b() {
            C39168f fVar = this.f101482b;
            if (fVar != null) {
                fVar.mo97328b();
            }
        }

        /* renamed from: a */
        public final void mo97325a(View view) {
            C7573i.m23587b(view, "segView");
            C39168f fVar = this.f101482b;
            if (fVar != null) {
                fVar.mo97325a(view);
            }
        }

        /* renamed from: b */
        public final void mo97329b(View view) {
            C7573i.m23587b(view, "retryView");
            this.f101481a.mo97416c();
            C39168f fVar = this.f101482b;
            if (fVar != null) {
                fVar.mo97329b(view);
            }
        }

        /* renamed from: a */
        public final void mo97326a(AVMusic aVMusic) {
            C39168f fVar = this.f101482b;
            if (fVar != null) {
                fVar.mo97326a(aVMusic);
            }
        }

        /* renamed from: b */
        public final void mo97330b(AVMusic aVMusic) {
            C39168f fVar = this.f101482b;
            if (fVar != null) {
                fVar.mo97330b(aVMusic);
            }
        }

        C39136e(C39130d dVar, C39168f fVar) {
            this.f101481a = dVar;
            this.f101482b = fVar;
        }

        /* renamed from: a */
        public final void mo97327a(AVMusic aVMusic, boolean z) {
            C39168f fVar = this.f101482b;
            if (fVar != null) {
                fVar.mo97327a(aVMusic, z);
            }
        }
    }

    /* renamed from: a */
    public final View mo97369a() {
        return this.f101466b;
    }

    /* renamed from: b */
    public final AVMusic mo97413b() {
        if (C23477d.m77081a((Collection<T>) this.f101472h)) {
            return null;
        }
        IStickPointMusicAdapter iStickPointMusicAdapter = this.f101471g;
        if (iStickPointMusicAdapter == null) {
            C7573i.m23580a();
        }
        return m124906b(iStickPointMusicAdapter.mo103962a());
    }

    /* renamed from: c */
    public final void mo97416c() {
        List list;
        int i;
        StringBuilder sb = new StringBuilder();
        C39168f fVar = this.f101467c;
        if (fVar != null) {
            list = fVar.mo97324a();
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
        StickPointMusicView stickPointMusicView = this.f101466b;
        if (stickPointMusicView != null) {
            stickPointMusicView.mo97537a();
        }
        C39187a.m125119a().mo97473a(i, sb.toString(), (C39167e) new C39135d(this));
    }

    /* renamed from: a */
    public final void mo97370a(boolean z) {
        if (z) {
            StickPointMusicView stickPointMusicView = this.f101466b;
            if (stickPointMusicView != null) {
                stickPointMusicView.setButtonClickable(false);
            }
        }
        super.mo97370a(z);
    }

    /* renamed from: b */
    public final void mo97371b(boolean z) {
        if (z) {
            StickPointMusicView stickPointMusicView = this.f101466b;
            if (stickPointMusicView != null) {
                stickPointMusicView.setButtonClickable(false);
            }
        }
        super.mo97371b(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo97372c(boolean z) {
        super.mo97372c(z);
        StickPointMusicView stickPointMusicView = this.f101466b;
        if (stickPointMusicView != null) {
            stickPointMusicView.setButtonClickable(z);
        }
    }

    /* renamed from: d */
    private final void m124907d(AVMusic aVMusic) {
        C39168f fVar = this.f101467c;
        if (fVar != null) {
            fVar.mo97330b(aVMusic);
        }
        this.f101470f = true;
        C39147a.f101501a.mo97436a(this.f101474j, aVMusic, new C39134c(this));
    }

    /* renamed from: a */
    public final void mo97409a(View view) {
        this.f101466b = (StickPointMusicView) view;
        StickPointMusicView stickPointMusicView = this.f101466b;
        if (stickPointMusicView != null) {
            IStickPointMusicAdapter iStickPointMusicAdapter = this.f101471g;
            if (iStickPointMusicAdapter == null) {
                C7573i.m23580a();
            }
            stickPointMusicView.setRecyleViewAdapter(iStickPointMusicAdapter);
        }
    }

    public C39130d(Context context) {
        C7573i.m23587b(context, "context");
        this.f101474j = (Activity) context;
        this.f101469e = -1;
        this.f101475k = -1;
        this.f101471g = C35563c.f93224F.mo70086a().mo103845a((List<AVMusic>) this.f101472h, (C42612j) new C42612j(this) {

            /* renamed from: a */
            final /* synthetic */ C39130d f101476a;

            {
                this.f101476a = r1;
            }

            /* renamed from: a */
            public final void mo97305a(View view, int i) {
                C7573i.m23587b(view, "view");
                if (!this.f101476a.f101470f) {
                    this.f101476a.f101469e = i;
                    this.f101476a.mo97408a(i);
                }
            }
        });
    }

    /* renamed from: b */
    private final AVMusic m124906b(int i) {
        if (!C23477d.m77081a((Collection<T>) this.f101472h) && i >= 0 && i < this.f101472h.size()) {
            return (AVMusic) this.f101472h.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo97411a(C39168f fVar) {
        this.f101467c = fVar;
        StickPointMusicView stickPointMusicView = this.f101466b;
        if (stickPointMusicView != null) {
            stickPointMusicView.setStickePointMusicListener(new C39136e(this, fVar));
        }
    }

    /* renamed from: a */
    public final void mo97408a(int i) {
        if (i == -1) {
            C39505b.m126187a(this.f101474j, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, new C39132a(this), new C39133b(this));
            C39168f fVar = this.f101467c;
            if (fVar != null) {
                fVar.mo97328b();
            }
            this.f101468d = true;
            return;
        }
        IStickPointMusicAdapter iStickPointMusicAdapter = this.f101471g;
        if (iStickPointMusicAdapter == null) {
            C7573i.m23580a();
        }
        if (iStickPointMusicAdapter.mo103962a() != this.f101471g.mo103967b() || this.f101471g.mo103962a() != i) {
            AVMusic b = m124906b(i);
            C39168f fVar2 = this.f101467c;
            if (fVar2 != null) {
                fVar2.mo97326a(b);
            }
            this.f101471g.mo103964a(i, false);
            this.f101471g.mo103975g();
            m124907d(b);
        }
    }

    /* renamed from: b */
    public final void mo97414b(AVMusic aVMusic) {
        C39168f fVar = this.f101467c;
        Context context = null;
        if (fVar != null) {
            fVar.mo97327a(null, !this.f101468d);
        }
        this.f101470f = false;
        this.f101468d = false;
        StickPointMusicView stickPointMusicView = this.f101466b;
        if (stickPointMusicView != null) {
            context = stickPointMusicView.getContext();
        }
        C10761a.m31383a(context, (int) R.string.ci7).mo25750a();
    }

    /* renamed from: a */
    public final void mo97410a(AVMusic aVMusic) {
        if (!this.f101468d || this.f101469e != -1) {
            this.f101475k = this.f101469e;
            IStickPointMusicAdapter iStickPointMusicAdapter = this.f101471g;
            if (iStickPointMusicAdapter == null) {
                C7573i.m23580a();
            }
            iStickPointMusicAdapter.mo103969b(this.f101471g.mo103967b(), true);
            C39193g.f101577a.mo97477a(aVMusic, this.f101469e);
        } else {
            ArrayList<AVMusic> arrayList = this.f101472h;
            if (aVMusic == null) {
                C7573i.m23580a();
            }
            arrayList.add(0, aVMusic);
            IStickPointMusicAdapter iStickPointMusicAdapter2 = this.f101471g;
            if (iStickPointMusicAdapter2 == null) {
                C7573i.m23580a();
            }
            iStickPointMusicAdapter2.mo103991a(aVMusic);
            this.f101471g.mo103963a(this.f101471g.mo103962a() + 1);
            this.f101471g.mo103969b(0, true);
            C39193g.f101577a.mo97476a(aVMusic);
            this.f101475k = 0;
        }
        C39168f fVar = this.f101467c;
        if (fVar != null) {
            fVar.mo97327a(aVMusic, !this.f101468d);
        }
        if (this.f101469e != -1) {
            StickPointMusicView stickPointMusicView = this.f101466b;
            if (stickPointMusicView != null) {
                stickPointMusicView.mo97538a(this.f101469e + 1);
            }
        }
        this.f101470f = false;
        this.f101468d = false;
    }

    /* renamed from: b */
    public final void mo97415b(List<AVMusic> list) {
        StickPointMusicView stickPointMusicView = this.f101466b;
        if (stickPointMusicView != null) {
            stickPointMusicView.mo97539b();
        }
        IStickPointMusicAdapter iStickPointMusicAdapter = this.f101471g;
        if (iStickPointMusicAdapter == null) {
            C7573i.m23580a();
        }
        iStickPointMusicAdapter.mo103974f();
        ArrayList<AVMusic> arrayList = this.f101472h;
        if (list == null) {
            C7573i.m23580a();
        }
        arrayList.addAll(list);
        this.f101471g.mo103992a(list);
        mo97408a(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97417c(com.p280ss.android.ugc.aweme.shortvideo.AVMusic r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0006
            r7.f101468d = r0
            return
        L_0x0006:
            java.lang.String r1 = r8.getMusicId()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = -1
            if (r1 != 0) goto L_0x003d
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVMusic> r1 = r7.f101472h
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
        L_0x001c:
            if (r3 >= r1) goto L_0x006e
            java.lang.String r4 = r8.getMusicId()
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVMusic> r5 = r7.f101472h
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
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVMusic> r1 = r7.f101472h
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
        L_0x0052:
            if (r3 >= r1) goto L_0x006e
            java.lang.String r4 = r8.getPath()
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVMusic> r5 = r7.f101472h
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
            r7.m124907d(r8)
            return
        L_0x007a:
            int r8 = r7.f101475k
            if (r3 != r8) goto L_0x009c
            int r8 = r7.f101469e
            if (r8 == r2) goto L_0x008d
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView r8 = r7.f101466b
            if (r8 == 0) goto L_0x008d
            int r1 = r7.f101469e
            int r1 = r1 + 1
            r8.mo97538a(r1)
        L_0x008d:
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f r8 = r7.f101467c
            if (r8 == 0) goto L_0x0099
            r1 = 0
            boolean r2 = r7.f101468d
            r2 = r2 ^ 1
            r8.mo97327a(r1, r2)
        L_0x0099:
            r7.f101468d = r0
            return
        L_0x009c:
            r7.f101469e = r3
            r7.mo97408a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1554a.C39130d.mo97417c(com.ss.android.ugc.aweme.shortvideo.AVMusic):void");
    }

    /* renamed from: a */
    public final void mo97412a(List<AVMusic> list) {
        if (C23477d.m77081a((Collection<T>) list)) {
            mo97416c();
        } else {
            mo97415b(list);
        }
    }
}
