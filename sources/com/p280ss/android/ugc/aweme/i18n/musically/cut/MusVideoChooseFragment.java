package com.p280ss.android.ugc.aweme.i18n.musically.cut;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.mediachoose.MediaAdapter.C33140a;
import com.p280ss.android.ugc.aweme.mediachoose.VideoChooseFragment;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.p280ss.android.ugc.aweme.services.videochoose.IVideoChoose.Callback;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.MusVideoChooseFragment */
public class MusVideoChooseFragment extends VideoChooseFragment implements IVideoChoose {

    /* renamed from: e */
    public Callback f80175e;

    public Fragment fragment() {
        return this;
    }

    /* renamed from: a */
    public static MusVideoChooseFragment m99634a() {
        return m99635a(3, 1.5f, 1.5f, 0, C23481i.m77088a(R.color.a91), C23481i.m77088a(R.color.a82), 1.0d, 13, false, false, C23481i.m77088a(R.color.az3));
    }

    /* renamed from: d */
    public final void mo80204d() {
        final ArrayList arrayList = new ArrayList();
        if (this.f86254j != null) {
            List c = m99636c(this.f86254j.mo84898a(4));
            if (!c.isEmpty()) {
                this.f86251g.setVisibility(0);
            }
            final List c2 = this.f86254j.mo84910c();
            arrayList.addAll(c);
            final ArrayList arrayList2 = new ArrayList();
            C6726a.m20842a(new Runnable() {
                public final void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        MediaModel mediaModel = (MediaModel) it.next();
                        String str = mediaModel.f88156b;
                        if (!TextUtils.isEmpty(str) && !str.contains("amweme/") && !str.contains("hotsoon/") && str.endsWith("mp4")) {
                            arrayList2.add(mediaModel);
                        }
                    }
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            try {
                                MusVideoChooseFragment.this.f86253i.mo84867a((Collection<? extends MediaModel>) arrayList2, (Collection<? extends MediaModel>) c2);
                                MusVideoChooseFragment.this.f86252h.setAdapter(MusVideoChooseFragment.this.f86253i);
                                MusVideoChooseFragment.this.f86253i.f86211g = MusVideoChooseFragment.this.f86265u;
                                MusVideoChooseFragment.this.f86251g.setVisibility(8);
                                if (arrayList2.size() == 0) {
                                    MusVideoChooseFragment.this.f86250f.setText(MusVideoChooseFragment.this.getResources().getString(R.string.cn6));
                                } else {
                                    MusVideoChooseFragment.this.f86250f.setText(null);
                                }
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
        this.f86265u = new C33140a() {
            /* renamed from: a */
            public final void mo80206a(View view, MediaModel mediaModel) {
                if (MusVideoChooseFragment.this.f80175e != null) {
                    MusVideoChooseFragment.this.f80175e.onData(mediaModel.f88156b);
                }
            }
        };
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f86255k.setVisibility(8);
        this.f86252h.setPadding(0, 0, 0, 0);
    }

    /* renamed from: c */
    private static List<MediaModel> m99636c(List<MediaModel> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : list) {
            if (mediaModel.f88159e > 3000) {
                arrayList.add(mediaModel);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static MusVideoChooseFragment m99635a(int i, float f, float f2, int i2, int i3, int i4, double d, int i5, boolean z, boolean z2, int i6) {
        MusVideoChooseFragment musVideoChooseFragment = new MusVideoChooseFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_NUM_COLUMNS", 3);
        bundle.putFloat("ARG_HORIZONTAL_SPACING", 1.5f);
        bundle.putFloat("ARG_VERTICAL_SPACING", 1.5f);
        bundle.putInt("ARG_GRID_PADDING", 0);
        bundle.putInt("ARG_TEXT_COLOR", i3);
        bundle.putInt("ARG_SHADOW_COLOR", i4);
        bundle.putDouble("ARG_ITEM_HEIGHT_WIDTH_RATIO", 1.0d);
        bundle.putInt("ARG_TEXT_SIZE", 13);
        bundle.putBoolean("ARG_TEXT_BACKGROUND", false);
        bundle.putBoolean("ARG_TEXT_INDICATOR", false);
        bundle.putInt("ARG_BG_COLOR", i6);
        musVideoChooseFragment.setArguments(bundle);
        return musVideoChooseFragment;
    }
}
