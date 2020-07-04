package com.p280ss.android.ugc.aweme.photo.local;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.mediachoose.C33177i;
import com.p280ss.android.ugc.aweme.mediachoose.VideoChooseFragment;
import com.p280ss.android.ugc.aweme.music.mediachoose.C33794a;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.photo.local.MediaChooseFragment */
public class MediaChooseFragment extends AmeBaseFragment {

    /* renamed from: e */
    public C33794a f90626e;

    /* renamed from: f */
    public C33177i f90627f;

    /* renamed from: g */
    public boolean f90628g;

    /* renamed from: h */
    public int f90629h = 2;

    /* renamed from: i */
    int f90630i;

    /* renamed from: j */
    public boolean f90631j;

    /* renamed from: k */
    public long f90632k;

    /* renamed from: l */
    private MediaTypeNavigator f90633l;

    /* renamed from: m */
    private ViewPager f90634m;

    /* renamed from: com.ss.android.ugc.aweme.photo.local.MediaChooseFragment$a */
    class C34767a extends FragmentPagerAdapter {
        public final int getCount() {
            return MediaChooseFragment.this.f90629h;
        }

        /* renamed from: a */
        public final Fragment mo2423a(int i) {
            if (i == 0) {
                VideoChooseFragment a = VideoChooseFragment.m106936a(4, MediaChooseFragment.this.getResources().getColor(R.color.a91), MediaChooseFragment.this.getResources().getColor(R.color.a82), MediaChooseFragment.this.f90631j, (AVChallenge) MediaChooseFragment.this.getArguments().getSerializable("challenge"), MediaChooseFragment.this.f90627f);
                a.f86263s = MediaChooseFragment.this.f90628g;
                a.f86261q = MediaChooseFragment.this.f90632k;
                return a;
            } else if (i == 1) {
                return ImageChooseFragment.m112149a(4, MediaChooseFragment.this.getResources().getColor(R.color.a91), MediaChooseFragment.this.getResources().getColor(R.color.a82), MediaChooseFragment.this.f90630i, MediaChooseFragment.this.f90626e);
            } else {
                StringBuilder sb = new StringBuilder("unknown position: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        C34767a(C0608j jVar) {
            super(jVar);
        }
    }

    /* renamed from: a */
    public final ViewPager mo88214a() {
        return this.f90634m;
    }

    /* renamed from: d */
    public final void mo88216d() {
        VideoChooseFragment videoChooseFragment = (VideoChooseFragment) m112152a(this.f90634m, 0);
        if (videoChooseFragment != null) {
            videoChooseFragment.mo84885e();
        }
    }

    /* renamed from: e */
    public final void mo88217e() {
        VideoChooseFragment videoChooseFragment = (VideoChooseFragment) m112152a(this.f90634m, 0);
        if (videoChooseFragment != null) {
            videoChooseFragment.loadData();
        }
        ImageChooseFragment imageChooseFragment = (ImageChooseFragment) m112152a(this.f90634m, 1);
        if (imageChooseFragment != null) {
            imageChooseFragment.mo88211a();
        }
    }

    /* renamed from: f */
    public final boolean mo88218f() {
        if (this.f90634m != null && this.f90634m.getCurrentItem() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo88215a(List<MediaModel> list) {
        VideoChooseFragment videoChooseFragment = (VideoChooseFragment) m112152a(this.f90634m, 0);
        if (videoChooseFragment != null) {
            videoChooseFragment.mo84883a(list);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f90634m.setAdapter(new C34767a(getChildFragmentManager()));
        this.f90633l.setupWithViewPager(this.f90634m);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f90630i = getArguments().getInt("ARG_SUPPORT_FLAGS", 0);
        this.f90631j = getArguments().getBoolean("ARG_MULTI_VIDEO_ENABLE", true);
    }

    /* renamed from: a */
    private Fragment m112152a(ViewPager viewPager, int i) {
        if (!isAdded()) {
            return null;
        }
        return getChildFragmentManager().mo2644a(m112154a(viewPager.getId(), i));
    }

    /* renamed from: a */
    private static String m112154a(int i, int i2) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(i2);
        return sb.toString();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ad6, viewGroup, false);
        this.f90633l = (MediaTypeNavigator) inflate.findViewById(R.id.bxn);
        this.f90634m = (ViewPager) inflate.findViewById(R.id.edp);
        if (this.f90630i == 0) {
            this.f90633l.setVisibility(8);
            this.f90629h = 1;
        }
        return inflate;
    }

    /* renamed from: a */
    public static MediaChooseFragment m112153a(AVChallenge aVChallenge, int i, boolean z, C33794a aVar, C33177i iVar) {
        MediaChooseFragment mediaChooseFragment = new MediaChooseFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("challenge", aVChallenge);
        bundle.putInt("ARG_SUPPORT_FLAGS", i);
        bundle.putBoolean("ARG_MULTI_VIDEO_ENABLE", z);
        mediaChooseFragment.setArguments(bundle);
        mediaChooseFragment.f90626e = aVar;
        mediaChooseFragment.f90627f = iVar;
        return mediaChooseFragment;
    }
}
