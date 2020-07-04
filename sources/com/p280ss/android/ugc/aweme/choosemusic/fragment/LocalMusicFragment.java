package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.content.C0683b;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.C23074c;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23843a;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23867m;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23966k;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicFragment */
public class LocalMusicFragment extends BaseMusicListFragment implements C23843a<MusicModel> {

    /* renamed from: l */
    private C23867m f63101l;

    /* renamed from: m */
    private long f63102m;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo61917a(Object obj, int i) {
    }

    /* renamed from: b */
    public final String mo60114b() {
        return "local_music_list_data";
    }

    /* renamed from: c */
    public final String mo60115c() {
        return "local_music_list_status";
    }

    /* renamed from: d */
    public final String mo60116d() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo62004n() {
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final String mo62005o() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo62007p() {
        return R.layout.p8;
    }

    /* renamed from: a */
    public final void mo60113a() {
        super.mo60113a();
        this.f63101l = new C23867m(this.f63050i);
        m78331i();
    }

    /* renamed from: s */
    public final void mo61919s() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* renamed from: j */
    private View m78332j() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.x_, null);
        ((DmtTextView) inflate.findViewById(R.id.buf)).setText(R.string.chw);
        return inflate;
    }

    /* renamed from: r */
    public final void mo61918r() {
        if (this.f63101l != null) {
            this.f63101l.mo61961a(new WeakReference(getActivity()));
        }
    }

    /* renamed from: i */
    private void m78331i() {
        if (getActivity() != null) {
            if (C0683b.m2909b((Context) getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || this.f63101l == null) {
                C22477b.m74364a(getActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23934j(this));
                return;
            }
            this.f63101l.mo61961a(new WeakReference(getActivity()));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f63102m = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static Fragment m78330a(int i) {
        LocalMusicFragment localMusicFragment = new LocalMusicFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        localMusicFragment.setArguments(bundle);
        return localMusicFragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C23074c mo61998b(View view) {
        C23966k kVar = new C23966k(getContext(), view, this, R.string.cme, null, null, this.f63052k);
        kVar.f63320h = this.f63102m;
        if (C6399b.m19944t()) {
            kVar.mo62179b(m78332j());
        }
        kVar.mo62174a((int) R.string.chw);
        kVar.mo62176a((C23844b) this);
        kVar.mo62175a(new C23819a("change_music_page_detail", "local_music", "click_button", C23888c.m78180a()));
        kVar.mStatusView.mo25939d();
        kVar.mo62113e();
        return kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62038a(String[] strArr, int[] iArr) {
        if (iArr[0] == 0) {
            m78331i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61997a(String str, MusicModel musicModel, String str2, Activity activity) {
        String str3;
        String str4;
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        String str5 = "local_music_name";
        if (musicModel == null) {
            str3 = "";
        } else {
            str3 = musicModel.getName();
        }
        intent.putExtra(str5, str3);
        String str6 = "local_music_path";
        if (musicModel == null) {
            str4 = "";
        } else {
            str4 = musicModel.getPath();
        }
        intent.putExtra(str6, str4);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
