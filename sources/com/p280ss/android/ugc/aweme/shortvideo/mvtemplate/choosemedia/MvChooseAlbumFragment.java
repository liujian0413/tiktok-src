package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.mediachoose.C33176h;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d.C33154a;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d.C33155b;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter.C40110b;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter.C40112d;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChooseAlbumFragment */
public class MvChooseAlbumFragment extends AmeBaseFragment implements C40110b {

    /* renamed from: e */
    public MvImageAlbumAdapter f104176e;

    /* renamed from: f */
    public C33153d f104177f;

    /* renamed from: g */
    public C40110b f104178g;

    /* renamed from: h */
    public boolean f104179h;

    /* renamed from: i */
    public boolean f104180i;

    /* renamed from: j */
    public boolean f104181j;

    /* renamed from: k */
    private RecyclerView f104182k;

    /* renamed from: l */
    private View f104183l;

    /* renamed from: m */
    private int f104184m;

    /* renamed from: n */
    private int f104185n;

    /* renamed from: o */
    private C33155b f104186o = new C33155b() {
        /* renamed from: a */
        public final void mo84890a(boolean z, int i, List<MediaModel> list) {
            List<MediaModel> a = MvChooseAlbumFragment.this.f104177f.mo84898a(i);
            ArrayList arrayList = new ArrayList();
            for (MediaModel mediaModel : a) {
                if (!(mediaModel == null || mediaModel.f88156b == null || TextUtils.isEmpty(mediaModel.f88156b))) {
                    String[] split = mediaModel.f88156b.split("\\.");
                    if (split.length <= 0 || !split[split.length - 1].equals("gif")) {
                        arrayList.add(MyMediaModel.m128240a(mediaModel));
                    }
                }
            }
            if (i == 4) {
                MvChooseAlbumFragment.this.f104180i = false;
            } else {
                MvChooseAlbumFragment.this.f104179h = false;
            }
            MvChooseAlbumFragment.this.f104176e.mo99842a(arrayList, i, false, false);
        }
    };

    /* renamed from: p */
    private C33176h f104187p = new C40133f(this);

    /* renamed from: q */
    private C40112d f104188q = new C40134g(this);

    /* renamed from: r */
    private C33154a f104189r = new C40135h(this);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99810a() {
        this.f104183l.setTranslationY((float) (-this.f104183l.getHeight()));
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f104177f != null) {
            this.f104177f.mo84908b(this.f104186o);
            this.f104177f.mo84907b(this.f104189r);
        }
    }

    /* renamed from: d */
    private void m128144d() {
        this.f104182k = (RecyclerView) this.f104183l.findViewById(R.id.ay8);
        this.f104182k.setLayoutManager(new WrapLinearLayoutManager(getActivity()));
        this.f104176e = new MvImageAlbumAdapter(getActivity(), this);
        this.f104176e.f104246a = this.f104188q;
        this.f104177f = C33153d.m106972a();
        if (this.f104177f != null) {
            this.f104177f.mo84903a(this.f104186o);
            this.f104177f.mo84902a(this.f104189r);
        }
        this.f104182k.setAdapter(this.f104176e);
        this.f104183l.post(new C40136i(this));
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: c */
    private void m128143c(int i) {
        if (this.f104177f != null) {
            if (!((i & 1) == 0 && (i & 2) == 0)) {
                this.f104179h = true;
                this.f104184m = 0;
                this.f104177f.mo84900a(3, (int) C34943c.f91128x, this.f104184m, this.f104187p);
            }
            if ((i & 4) != 0) {
                this.f104180i = true;
                this.f104185n = 0;
                this.f104177f.mo84900a(4, (int) C34943c.f91128x, this.f104185n, this.f104187p);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo99816b(int i) {
        if (i != 4 || !this.f104180i) {
            if (i == 3 && this.f104179h) {
                C33153d dVar = this.f104177f;
                int i2 = this.f104184m + 1;
                this.f104184m = i2;
                dVar.mo84900a(i, (int) C34943c.f91128x, i2, this.f104187p);
            }
            return;
        }
        C33153d dVar2 = this.f104177f;
        int i3 = this.f104185n + 1;
        this.f104185n = i3;
        dVar2.mo84900a(i, (int) C34943c.f91128x, i3, this.f104187p);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99811a(int i) {
        List<MediaModel> a = this.f104177f.mo84898a(i);
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : a) {
            if (!(mediaModel == null || mediaModel.f88156b == null || TextUtils.isEmpty(mediaModel.f88156b))) {
                String[] split = mediaModel.f88156b.split("\\.");
                if (split.length <= 0 || !split[split.length - 1].equals("gif")) {
                    arrayList.add(MyMediaModel.m128240a(mediaModel));
                }
            }
        }
        if (i == 4) {
            this.f104180i = false;
        } else {
            this.f104179h = false;
        }
        this.f104176e.mo99842a(arrayList, i, true, false);
    }

    /* renamed from: a */
    public final void mo99814a(boolean z) {
        int i;
        this.f104181j = z;
        int i2 = -1;
        if (z) {
            i = 0;
        } else {
            i = -1;
            i2 = 0;
        }
        int height = this.f104183l.getHeight();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{(float) i2, (float) i}).setDuration(500);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addUpdateListener(new C40137j(this, height));
        duration.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99812a(int i, ValueAnimator valueAnimator) {
        this.f104183l.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) i));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f104183l = layoutInflater.inflate(R.layout.a9b, viewGroup, false);
        Bundle arguments = getArguments();
        int i = -1;
        if (arguments != null) {
            i = arguments.getInt("key_support_flag", -1);
        }
        m128144d();
        m128143c(i);
        return this.f104183l;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel>, for r8v0, types: [java.util.List<com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel>, java.util.List] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo99815a(boolean r6, int r7, java.util.List<com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel> r8) {
        /*
            r5 = this;
            r0 = 0
            r1 = 4
            if (r7 != r1) goto L_0x0019
            boolean r1 = r5.f104180i
            if (r1 == 0) goto L_0x0016
            if (r6 == 0) goto L_0x0016
            if (r8 != 0) goto L_0x000d
            goto L_0x0016
        L_0x000d:
            int r6 = r8.size()
            if (r6 != 0) goto L_0x002a
            r5.f104180i = r0
            goto L_0x002a
        L_0x0016:
            r5.f104180i = r0
            return
        L_0x0019:
            boolean r1 = r5.f104179h
            if (r1 == 0) goto L_0x0073
            if (r6 == 0) goto L_0x0073
            if (r8 != 0) goto L_0x0022
            goto L_0x0073
        L_0x0022:
            int r6 = r8.size()
            if (r6 != 0) goto L_0x002a
            r5.f104179h = r0
        L_0x002a:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0033:
            boolean r1 = r8.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x006d
            java.lang.Object r1 = r8.next()
            com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel r1 = (com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel) r1
            if (r1 == 0) goto L_0x0033
            java.lang.String r3 = r1.f88156b
            if (r3 == 0) goto L_0x0033
            java.lang.String r3 = r1.f88156b
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0033
            java.lang.String r3 = r1.f88156b
            java.lang.String r4 = "\\."
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            if (r4 <= 0) goto L_0x0065
            int r4 = r3.length
            int r4 = r4 - r2
            r2 = r3[r4]
            java.lang.String r3 = "gif"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0033
        L_0x0065:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r1 = com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel.m128240a(r1)
            r6.add(r1)
            goto L_0x0033
        L_0x006d:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter r8 = r5.f104176e
            r8.mo99842a(r6, r7, r0, r2)
            return
        L_0x0073:
            r5.f104179h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChooseAlbumFragment.mo99815a(boolean, int, java.util.List):void");
    }

    /* renamed from: a */
    public final void mo99813a(C40109a aVar, boolean z, int i, boolean z2) {
        if (this.f104178g != null) {
            this.f104178g.mo99813a(aVar, z, i, z2);
        }
    }
}
