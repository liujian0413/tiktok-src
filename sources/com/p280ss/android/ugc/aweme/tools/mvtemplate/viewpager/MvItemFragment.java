package com.p280ss.android.ugc.aweme.tools.mvtemplate.viewpager;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p280ss.android.ugc.aweme.views.C43373i;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.viewpager.MvItemFragment */
public class MvItemFragment extends MvItemFragmentAdapter {

    /* renamed from: a */
    public AnimatedImageView f110678a;

    /* renamed from: b */
    public MvThemeData f110679b;

    /* renamed from: c */
    private DmtLoadingLayout f110680c;

    /* renamed from: d */
    private KeepSurfaceTextureView f110681d;

    /* renamed from: e */
    private CircularProgressView f110682e;

    /* renamed from: f */
    private TextView f110683f;

    /* renamed from: g */
    private View f110684g;

    /* renamed from: h */
    private FrameLayout f110685h;

    /* renamed from: i */
    private int f110686i;

    /* renamed from: j */
    private VideoViewComponent f110687j;

    /* renamed from: k */
    private Video f110688k;

    /* renamed from: l */
    private boolean f110689l;

    /* renamed from: m */
    private View f110690m;

    /* renamed from: n */
    private RemoteImageView f110691n;

    /* renamed from: o */
    private RelativeLayout f110692o;

    /* renamed from: p */
    private boolean f110693p;

    /* renamed from: d */
    public final void mo104162d() {
        m135252d(false);
    }

    /* renamed from: b */
    public final int mo104160b() {
        if (this.f110690m != null) {
            return this.f110690m.getMeasuredWidth();
        }
        return 0;
    }

    /* renamed from: g */
    public final void mo104165g() {
        if (this.f110687j != null) {
            this.f110687j.mo71673ae();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo104166h() {
        if (!this.f110689l) {
            m135251c(true);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f110687j != null) {
            this.f110687j.mo71692b((C34976f) this);
        }
    }

    /* renamed from: e */
    public final void mo104163e() {
        if (this.f110687j != null && !this.f110687j.mo107438d() && this.f110688k != null) {
            this.f110687j.mo71660a(this.f110688k);
        }
    }

    /* renamed from: f */
    public final void mo104164f() {
        if (this.f110687j != null && this.f110687j.mo107438d()) {
            this.f110687j.mo71672ad();
        }
    }

    /* renamed from: i */
    private void m135253i() {
        if (m135254j()) {
            C30221c c = C35563c.f93259v.mo83154c();
            if (c != null && !TextUtils.isEmpty(c.f79523m)) {
                this.f110691n.setVisibility(0);
                C23323e.m76514a(this.f110691n, c.f79523m);
            }
        }
    }

    /* renamed from: j */
    private boolean m135254j() {
        if (!C35563c.f93259v.mo83153b()) {
            return false;
        }
        C30221c c = C35563c.f93259v.mo83154c();
        if (c == null || this.f110679b == null) {
            return false;
        }
        List<String> list = c.f79522l;
        if (!C6307b.m19566a((Collection<T>) list) && !TextUtils.isEmpty(this.f110679b.mo104044a()) && list.contains(this.f110679b.mo104044a())) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m135255k() {
        if (this.f110679b != null && this.f110679b.f110495a != null && !TextUtils.isEmpty(this.f110679b.mo104052g()) && !TextUtils.isEmpty(this.f110679b.f110499e) && !TextUtils.isEmpty(this.f110679b.mo104056k())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo104157a() {
        if (!(this.f110678a == null || this.f110679b == null || TextUtils.isEmpty(this.f110679b.mo104054i()))) {
            C23323e.m76525b(this.f110678a, this.f110679b.mo104054i(), 1, 1);
        }
        if (this.f110686i == 0 && !this.f110693p) {
            mo104161c();
        }
    }

    /* renamed from: c */
    public final void mo104161c() {
        if (this.f110687j != null && m135255k()) {
            if (this.f110688k == null) {
                this.f110688k = new Video();
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                videoUrlModel.setH265(false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f110679b.mo104052g());
                videoUrlModel.setUrlList(arrayList);
                videoUrlModel.setUrlKey(this.f110679b.f110499e);
                videoUrlModel.setUri(this.f110679b.f110499e);
                this.f110688k.setPlayAddr(videoUrlModel);
                this.f110688k.setSourceId(this.f110679b.mo104056k());
            }
            this.f110687j.mo71660a(this.f110688k);
            this.f110693p = true;
            if (!(this.f110683f == null || this.f110683f.getVisibility() == 0)) {
                this.f110683f.postDelayed(new C42567b(this), 300);
            }
        }
    }

    /* renamed from: c */
    private void m135251c(boolean z) {
        int i;
        if (this.f110680c != null) {
            DmtLoadingLayout dmtLoadingLayout = this.f110680c;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            dmtLoadingLayout.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        m135251c(false);
        if (this.f110678a != null) {
            this.f110678a.setVisibility(0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f110686i = getArguments().getInt("position");
    }

    /* renamed from: d */
    private void m135252d(boolean z) {
        int i;
        int i2;
        int i3 = 8;
        if (this.f110684g != null) {
            View view = this.f110684g;
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        if (this.f110682e != null) {
            CircularProgressView circularProgressView = this.f110682e;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            circularProgressView.setVisibility(i);
        }
        if (this.f110683f != null) {
            TextView textView = this.f110683f;
            if (z) {
                i3 = 0;
            }
            textView.setVisibility(i3);
        }
    }

    /* renamed from: a */
    public final void mo104158a(int i) {
        m135252d(true);
        m135251c(false);
        if (this.f110682e != null) {
            this.f110682e.setProgress((float) i);
        }
        if (this.f110683f != null) {
            TextView textView = this.f110683f;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("%");
            textView.setText(sb.toString());
        }
    }

    /* renamed from: b */
    private void m135250b(ViewGroup viewGroup) {
        this.f110678a = (AnimatedImageView) this.f110690m.findViewById(R.id.b_c);
        this.f110685h = (FrameLayout) this.f110690m.findViewById(R.id.cwn);
        this.f110681d = (KeepSurfaceTextureView) this.f110690m.findViewById(R.id.ebx);
        this.f110680c = (DmtLoadingLayout) this.f110690m.findViewById(R.id.bu9);
        this.f110682e = (CircularProgressView) this.f110690m.findViewById(R.id.b_w);
        this.f110684g = this.f110690m.findViewById(R.id.btu);
        this.f110683f = (TextView) this.f110690m.findViewById(R.id.cky);
        this.f110691n = (RemoteImageView) this.f110690m.findViewById(R.id.a6s);
        this.f110692o = (RelativeLayout) this.f110690m.findViewById(R.id.oi);
        this.f110682e.setVisibility(4);
        this.f110683f.setVisibility(4);
        this.f110682e.setColor(-1);
        this.f110682e.setThickness((int) C9738o.m28708b(this.f110685h.getContext(), 2.0f));
        if (VERSION.SDK_INT >= 21) {
            this.f110685h.setOutlineProvider(new C43373i((int) C9738o.m28708b(this.f110678a.getContext(), 8.0f)));
            this.f110685h.setClipToOutline(true);
        }
        C44962h a = C44962h.m141885a(this.f110681d);
        this.f110687j = new VideoViewComponent();
        this.f110687j.mo107433a(this.f110681d);
        this.f110687j.mo71663a((C34976f) this);
        a.mo107455a((C44963i) new C44963i() {
            /* renamed from: a */
            public final void mo63037a(int i, int i2) {
            }

            /* renamed from: b */
            public final void mo63039b(int i, int i2) {
            }

            public final void aA_() {
                if (MvItemFragment.this.f110678a != null) {
                    MvItemFragment.this.f110678a.setVisibility(0);
                }
            }
        });
        this.f110690m.setTag(Integer.valueOf(this.f110686i));
        m135253i();
        this.f110690m.post(new C42566a(this, viewGroup));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo104159a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int measuredWidth = this.f110690m.getMeasuredWidth();
            int b = (C39805en.m127447b(this.f110690m.getContext()) - measuredWidth) / 2;
            LayoutParams layoutParams = (LayoutParams) viewGroup.getLayoutParams();
            layoutParams.leftMargin = b;
            layoutParams.rightMargin = b;
            viewGroup.setLayoutParams(layoutParams);
            if (m135254j()) {
                float f = (float) measuredWidth;
                DmtTextView dmtTextView = new DmtTextView(getContext());
                dmtTextView.setText(R.string.atm);
                dmtTextView.setMaxLines(3);
                dmtTextView.setGravity(17);
                dmtTextView.setTextColor(-1);
                dmtTextView.setTextSize(1, 10.0f);
                double d = (double) f;
                Double.isNaN(d);
                int i = (int) (d * 0.1d);
                dmtTextView.setPadding(i, 0, i, 0);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(measuredWidth, (int) (f / 2.25f));
                layoutParams2.addRule(12);
                this.f110692o.addView(dmtTextView, layoutParams2);
            }
        }
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        this.f110689l = true;
        m135251c(false);
        if (this.f110678a != null) {
            this.f110678a.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        if (this.f110678a != null) {
            this.f110678a.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static MvItemFragment m135249a(MvThemeData mvThemeData, int i) {
        MvItemFragment mvItemFragment = new MvItemFragment();
        mvItemFragment.f110679b = mvThemeData;
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        mvItemFragment.setArguments(bundle);
        return mvItemFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f110690m == null) {
            this.f110690m = layoutInflater.inflate(R.layout.zs, viewGroup, false);
        }
        m135250b(viewGroup);
        mo104157a();
        return this.f110690m;
    }
}
