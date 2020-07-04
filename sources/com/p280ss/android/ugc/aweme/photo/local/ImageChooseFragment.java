package com.p280ss.android.ugc.aweme.photo.local;

import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.p280ss.android.ugc.aweme.mediachoose.ImageChooseAdapter;
import com.p280ss.android.ugc.aweme.mediachoose.ImageChooseAdapter.C33132a;
import com.p280ss.android.ugc.aweme.music.mediachoose.C33794a;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.photo.C34753g;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.photo.local.ImageChooseFragment */
public class ImageChooseFragment extends AmeBaseFragment {

    /* renamed from: e */
    public RecyclerView f90613e;

    /* renamed from: f */
    public TextView f90614f;

    /* renamed from: g */
    public ProgressBar f90615g;

    /* renamed from: h */
    public ImageChooseAdapter f90616h;

    /* renamed from: i */
    public C33794a f90617i;

    /* renamed from: j */
    public boolean f90618j;

    /* renamed from: k */
    public C33132a f90619k = new C33132a() {
        /* renamed from: a */
        public final void mo84859a(View view, MediaModel mediaModel) {
            if (mediaModel != null) {
                if (ImageChooseFragment.this.f90616h.f86174e) {
                    StringBuilder sb = new StringBuilder("file://");
                    sb.append(mediaModel.f88156b);
                    String sb2 = sb.toString();
                    C35563c.f93240c.mo83126a(ImageChooseFragment.this.getActivity(), view, (((float) C9738o.m28691a(ImageChooseFragment.this.getContext())) * 1.0f) / ((float) C9738o.m28709b(ImageChooseFragment.this.getContext())), sb2);
                } else if (ImageChooseAdapter.m106898a(mediaModel)) {
                    ImageChooseFragment.this.f90617i.mo84844a(mediaModel);
                }
            }
        }
    };

    /* renamed from: l */
    private int f90620l;

    /* renamed from: m */
    private int f90621m;

    public void onStart() {
        super.onStart();
        this.f90616h.mo84851b();
    }

    public void onStop() {
        super.onStop();
        this.f90616h.mo84852c();
    }

    /* renamed from: a */
    public final void mo88211a() {
        if (!this.f90618j) {
            this.f90615g.setVisibility(0);
            C6726a.m20842a(new Runnable() {
                public final void run() {
                    final List a = C34753g.m112121a(ImageChooseFragment.this.getContext());
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            try {
                                if (C23477d.m77081a((Collection<T>) a)) {
                                    ImageChooseFragment.this.f90614f.setVisibility(0);
                                    ImageChooseFragment.this.f90614f.setText(ImageChooseFragment.this.getResources().getString(R.string.cmc));
                                    return;
                                }
                                ImageChooseFragment.this.f90614f.setVisibility(8);
                                ImageChooseFragment.this.f90615g.setVisibility(8);
                                ImageChooseFragment.this.f90616h.mo84850a((Collection<? extends MediaModel>) a);
                                ImageChooseFragment.this.f90613e.setAdapter(ImageChooseFragment.this.f90616h);
                                ((SimpleItemAnimator) ImageChooseFragment.this.f90613e.getItemAnimator()).f5112m = false;
                                ImageChooseFragment.this.f90616h.f86176g = ImageChooseFragment.this.f90619k;
                                ImageChooseFragment.this.f90618j = true;
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            });
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f90620l = getArguments().getInt("ARG_NUM_COLUMNS", 4);
        this.f90621m = getArguments().getInt("ARG_SUPPORT_FLAGS", 0);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ImageChooseAdapter imageChooseAdapter = new ImageChooseAdapter(getActivity(), this.f90620l, 1.0d, 1.5f, 0);
        this.f90616h = imageChooseAdapter;
        this.f90616h.f86177h = this.f90617i;
        if ((this.f90621m & 2) <= 0) {
            this.f90616h.mo84847a();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.se, viewGroup, false);
        this.f90613e = (RecyclerView) inflate.findViewById(R.id.aya);
        this.f90615g = (ProgressBar) inflate.findViewById(R.id.ayd);
        this.f90614f = (TextView) inflate.findViewById(R.id.c4l);
        this.f90613e.setLayoutManager(new WrapGridLayoutManager(null, this.f90620l));
        this.f90613e.mo5525a((C1272h) new GridSpacingItemDecoration(this.f90620l, (int) C9738o.m28708b(getContext(), 1.0f), false));
        return inflate;
    }

    /* renamed from: a */
    public static ImageChooseFragment m112149a(int i, int i2, int i3, int i4, C33794a aVar) {
        ImageChooseFragment imageChooseFragment = new ImageChooseFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_NUM_COLUMNS", 4);
        bundle.putInt("ARG_TEXT_COLOR", i2);
        bundle.putInt("ARG_SHADOW_COLOR", i3);
        bundle.putInt("ARG_SUPPORT_FLAGS", i4);
        imageChooseFragment.setArguments(bundle);
        imageChooseFragment.f90617i = aVar;
        return imageChooseFragment;
    }
}
