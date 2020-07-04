package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.dmt.p262ui.titlebar.AbstractTitleBar;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.arch.C23073b;
import com.p280ss.android.ugc.aweme.arch.C23074c;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23843a;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.view.BaseMusicListView;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23966k;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23969n.C23971a;
import com.p280ss.android.ugc.aweme.commercialize.model.C25001j;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.p1385g.C33022h;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment */
public class MusicClassDetailFragment extends BaseMusicListFragment implements C23843a<Music>, C6905a {

    /* renamed from: l */
    public String f63109l;

    /* renamed from: m */
    private String f63110m;

    /* renamed from: n */
    private String f63111n;

    /* renamed from: o */
    private boolean f63112o;

    /* renamed from: p */
    private String f63113p;

    /* renamed from: q */
    private C25001j f63114q;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo61917a(Object obj, int i) {
    }

    /* renamed from: b */
    public final String mo60114b() {
        return "music_list";
    }

    /* renamed from: c */
    public final String mo60115c() {
        return "refresh_status_music_list";
    }

    /* renamed from: d */
    public final String mo60116d() {
        return "loadmore_status_music_list";
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo62004n() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final String mo62005o() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo62007p() {
        return R.layout.p7;
    }

    /* renamed from: a */
    public final void mo60113a() {
        super.mo60113a();
        this.f63049h.mo61939a(this.f63110m, 0, 30);
    }

    /* renamed from: r */
    public final void mo61918r() {
        if (this.f63049h != null) {
            this.f63049h.mo61939a(this.f63110m, 0, 30);
        }
    }

    /* renamed from: s */
    public final void mo61919s() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public final void bd_() {
        if (this.f63049h != null && this.f63050i != null) {
            C23073b bVar = (C23073b) this.f63050i.mo60135a(mo60114b());
            if ((this.f63051j instanceof BaseMusicListView) && ((BaseMusicListView) this.f63051j).f63262e) {
                if (this.f63051j != null) {
                    this.f63051j.mo60120a();
                }
                this.f63049h.mo61944b(this.f63110m, ((Integer) bVar.mo60119a("list_cursor")).intValue(), 16);
            }
        }
    }

    /* renamed from: d */
    private void m78381d(View view) {
        if (this.f63114q != null && this.f63114q.f65924b != null && C33703a.m108722f() != 0) {
            ((AbstractTitleBar) view.findViewById(R.id.djz)).mo25857a(false);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.djw);
            final RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.djx);
            viewGroup.setVisibility(0);
            C23323e.m76509a(remoteImageView, this.f63114q.f65924b.f65925a, (C13401d<C13648f>) new C13400c<C13648f>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                    double width = (double) fVar.getWidth();
                    double height = (double) fVar.getHeight();
                    Double.isNaN(width);
                    Double.isNaN(height);
                    double d = width / height;
                    double a = (double) C23486n.m77122a(21.0d);
                    Double.isNaN(a);
                    double d2 = d * a;
                    LayoutParams layoutParams = remoteImageView.getLayoutParams();
                    layoutParams.width = (int) d2;
                    layoutParams.height = (int) a;
                    remoteImageView.setLayoutParams(layoutParams);
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from", "change_music_page");
                    hashMap.put("category_name", MusicClassDetailFragment.this.f63109l);
                    C6907h.m21524a("show_ad_sticker", (Map) hashMap);
                }
            });
            viewGroup.setOnClickListener(new C23936l(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C23074c mo61998b(View view) {
        C23966k kVar = new C23966k(getContext(), view, this, R.string.cmf, this, this, this.f63052k);
        kVar.mo62177a(this.f63109l);
        kVar.mo62178a(this.f63112o);
        kVar.mo62176a((C23844b) this);
        C23819a aVar = new C23819a(this.f63111n, this.f63109l, this.f63113p, C23888c.m78180a());
        aVar.f62874e = this.f63110m;
        kVar.mo62175a(aVar);
        kVar.mo62112a((C23971a) new C23937m(this), 10);
        return kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo62042c(View view) {
        if (C33703a.m108722f() != 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "change_music_page");
            hashMap.put("category_name", this.f63109l);
            C6907h.m21524a("click_ad_sticker", (Map) hashMap);
            if (!((C33022h) ServiceManager.get().getService(C33022h.class)).mo60017a(getContext(), this.f63114q.f65924b.f65927c, false)) {
                ((C33022h) ServiceManager.get().getService(C33022h.class)).mo60016a(getContext(), this.f63114q.f65924b.f65928d, this.f63114q.f65924b.f65929e);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f63110m = arguments.getString("music_class_id");
            this.f63109l = arguments.getString("music_class_name");
            this.f63111n = arguments.getString("music_class_enter_from");
            this.f63112o = arguments.getBoolean("music_class_is_hot", false);
            this.f63113p = arguments.getString("music_class_enter_method");
        }
        this.f63114q = ((C33022h) ServiceManager.get().getService(C33022h.class)).mo60015a(this.f63110m);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62041a(int i, int i2) {
        bd_();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m78381d(view);
    }

    /* renamed from: a */
    public static MusicClassDetailFragment m78380a(String str, String str2, String str3, int i, boolean z, String str4) {
        MusicClassDetailFragment musicClassDetailFragment = new MusicClassDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("music_class_id", str);
        bundle.putString("music_class_name", str2);
        bundle.putString("music_class_enter_from", str3);
        bundle.putBoolean("music_class_is_hot", z);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        bundle.putString("music_class_enter_method", str4);
        musicClassDetailFragment.setArguments(bundle);
        return musicClassDetailFragment;
    }
}
