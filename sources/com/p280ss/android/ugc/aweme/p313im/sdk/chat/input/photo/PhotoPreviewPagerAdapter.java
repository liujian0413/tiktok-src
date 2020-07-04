package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentStatePagerAdapter;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoPreviewPagerAdapter */
public class PhotoPreviewPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a */
    private List<PhotoParam> f80881a;

    public int getCount() {
        if (this.f80881a != null) {
            return this.f80881a.size();
        }
        return 0;
    }

    public Fragment getItem(int i) {
        PhotoPreviewFragment photoPreviewFragment = new PhotoPreviewFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("photo_param", (Serializable) this.f80881a.get(i));
        photoPreviewFragment.setArguments(bundle);
        return photoPreviewFragment;
    }

    public PhotoPreviewPagerAdapter(C0608j jVar, List<PhotoParam> list) {
        super(jVar);
        this.f80881a = list;
    }
}
