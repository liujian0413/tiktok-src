package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.content.Context;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42078c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42078c.C42080a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.ad */
public final class C40682ad {

    /* renamed from: a */
    public DmtStatusView f105795a;

    /* renamed from: b */
    private TextView f105796b;

    /* renamed from: c */
    private FrameLayout f105797c;

    /* renamed from: d */
    private EditText f105798d;

    /* renamed from: e */
    private ImageButton f105799e;

    /* renamed from: f */
    private FrameLayout f105800f;

    /* renamed from: g */
    private RelativeLayout f105801g;

    /* renamed from: h */
    private SearchInfoStickerFragment f105802h;

    /* renamed from: i */
    private FragmentActivity f105803i;

    /* renamed from: j */
    private C0608j f105804j;

    /* renamed from: k */
    private TextWatcher f105805k;

    /* renamed from: l */
    private SearchInfoStickerPresenter f105806l;

    /* renamed from: m */
    private View f105807m;

    /* renamed from: n */
    private boolean f105808n = true;

    /* renamed from: o */
    private C42078c f105809o;

    /* renamed from: p */
    private C42080a f105810p;

    /* renamed from: a */
    public final void mo100851a() {
        this.f105798d.setText("");
        this.f105799e.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo100858b() {
        this.f105801g.setVisibility(4);
        this.f105795a.mo25942f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo100864f() {
        if (this.f105798d != null) {
            this.f105798d.requestFocus();
            KeyboardUtils.m77056b(this.f105798d);
        }
    }

    /* renamed from: d */
    public final String mo100862d() {
        if (this.f105798d == null) {
            return "";
        }
        return this.f105798d.getText().toString();
    }

    /* renamed from: c */
    public final void mo100860c() {
        this.f105798d.post(new C40686ag(this));
        this.f105800f.setVisibility(0);
        this.f105809o = new C42078c(this.f105803i);
        this.f105809o.mo103394a(this.f105810p);
    }

    /* renamed from: e */
    public final void mo100863e() {
        mo100851a();
        this.f105804j.mo2645a().mo2587a((Fragment) this.f105802h).mo2604c();
        this.f105808n = true;
        this.f105800f.setVisibility(8);
        KeyboardUtils.m77057c(this.f105798d);
        if (this.f105809o != null) {
            this.f105809o.mo103393a();
        }
    }

    /* renamed from: g */
    private void m130107g() {
        this.f105796b = (TextView) this.f105807m.findViewById(R.id.e1a);
        this.f105795a = (DmtStatusView) this.f105807m.findViewById(R.id.dav);
        this.f105797c = (FrameLayout) this.f105807m.findViewById(R.id.cuz);
        this.f105798d = (EditText) this.f105807m.findViewById(R.id.e19);
        this.f105800f = (FrameLayout) this.f105807m.findViewById(R.id.b12);
        this.f105801g = (RelativeLayout) this.f105807m.findViewById(R.id.d0n);
        this.f105799e = (ImageButton) this.f105807m.findViewById(R.id.pw);
    }

    /* renamed from: a */
    public final void mo100854a(C6905a aVar) {
        this.f105802h.f105757d = aVar;
    }

    /* renamed from: b */
    public final void mo100859b(int i) {
        this.f105802h.mo100824a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo100861c(int i) {
        KeyboardUtils.m77057c(this.f105798d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100853a(View view) {
        if (C6319n.m19593a(mo100862d())) {
            this.f105806l.mo100833a(0);
        } else {
            this.f105806l.mo100835a(mo100862d());
        }
    }

    /* renamed from: a */
    public final void mo100852a(int i) {
        if (i != -1) {
            switch (i) {
                case 1:
                    this.f105801g.setVisibility(4);
                    this.f105795a.mo25943g();
                    return;
                case 2:
                    this.f105801g.setVisibility(4);
                    this.f105795a.mo25944h();
                    break;
            }
            return;
        }
        this.f105801g.setVisibility(0);
        this.f105795a.mo25939d();
    }

    /* renamed from: a */
    public final void mo100855a(SearchInfoStickerPresenter searchInfoStickerPresenter) {
        this.f105806l = searchInfoStickerPresenter;
        m130107g();
        this.f105798d.setOnEditorActionListener(this.f105806l);
        this.f105798d.addTextChangedListener(this.f105805k);
        this.f105797c.setOnClickListener(this.f105806l);
        this.f105796b.setOnClickListener(this.f105806l);
        this.f105799e.setOnClickListener(this.f105806l);
        this.f105795a.setBuilder(C10803a.m31631a((Context) this.f105803i).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C40684ae(this)).mo25955a((int) R.string.fic, (int) R.string.fid).mo25965c(1));
        this.f105810p = new C42080a() {
            /* renamed from: c */
            public final void mo96461c(int i) {
            }

            /* renamed from: a */
            public final void mo96459a(int i) {
                LayoutParams layoutParams = (LayoutParams) C40682ad.this.f105795a.getLayoutParams();
                layoutParams.bottomMargin = i;
                C40682ad.this.f105795a.setLayoutParams(layoutParams);
            }

            /* renamed from: b */
            public final void mo96460b(int i) {
                LayoutParams layoutParams = (LayoutParams) C40682ad.this.f105795a.getLayoutParams();
                layoutParams.bottomMargin = 0;
                C40682ad.this.f105795a.setLayoutParams(layoutParams);
            }
        };
        this.f105802h = SearchInfoStickerFragment.m130072a();
        this.f105804j = this.f105803i.getSupportFragmentManager();
    }

    /* renamed from: a */
    public final void mo100856a(String str) {
        if (C6319n.m19593a(str)) {
            this.f105799e.setVisibility(8);
        } else {
            this.f105799e.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo100857a(List<C40816v> list, boolean z) {
        if (C6311g.m19573a(list)) {
            this.f105795a.mo25943g();
            return;
        }
        if (this.f105808n) {
            this.f105804j.mo2645a().mo2585a((int) R.id.d0m, (Fragment) this.f105802h).mo2604c();
            this.f105808n = false;
        }
        if (z) {
            this.f105802h.mo100827b(list);
        } else {
            this.f105802h.mo100825a(list);
        }
        this.f105802h.f105755b = new C40685af(this);
    }

    C40682ad(View view, FragmentActivity fragmentActivity, TextWatcher textWatcher) {
        this.f105805k = textWatcher;
        this.f105803i = fragmentActivity;
        this.f105807m = view;
    }
}
