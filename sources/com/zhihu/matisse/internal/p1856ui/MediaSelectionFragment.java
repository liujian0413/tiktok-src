package com.zhihu.matisse.internal.p1856ui;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C47338d;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.model.AlbumMediaCollection;
import com.zhihu.matisse.internal.model.AlbumMediaCollection.C47342a;
import com.zhihu.matisse.internal.model.C47343a;
import com.zhihu.matisse.internal.p1855a.C47332f;
import com.zhihu.matisse.internal.p1856ui.adapter.AlbumMediaAdapter;
import com.zhihu.matisse.internal.p1856ui.adapter.AlbumMediaAdapter.C47353b;
import com.zhihu.matisse.internal.p1856ui.adapter.AlbumMediaAdapter.C47355d;
import com.zhihu.matisse.internal.p1856ui.widget.MediaGridInset;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.zhihu.matisse.internal.ui.MediaSelectionFragment */
public class MediaSelectionFragment extends Fragment implements C47342a, C47353b, C47355d {

    /* renamed from: a */
    private final AlbumMediaCollection f121505a = new AlbumMediaCollection();

    /* renamed from: b */
    private RecyclerView f121506b;

    /* renamed from: c */
    private AlbumMediaAdapter f121507c;

    /* renamed from: d */
    private C47346a f121508d;

    /* renamed from: e */
    private C47353b f121509e;

    /* renamed from: f */
    private C47355d f121510f;

    /* renamed from: com.zhihu.matisse.internal.ui.MediaSelectionFragment$a */
    public interface C47346a {
        /* renamed from: b */
        C47343a mo119406b();
    }

    /* renamed from: a */
    public final void mo119378a() {
        this.f121507c.mo119419a(null);
    }

    /* renamed from: b */
    public final void mo119404b() {
        this.f121507c.notifyDataSetChanged();
    }

    /* renamed from: c */
    public final void mo119405c() {
        if (this.f121509e != null) {
            this.f121509e.mo119405c();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f121505a.mo119374a();
    }

    /* renamed from: a */
    public final void mo119379a(Cursor cursor) {
        this.f121507c.mo119419a(cursor);
    }

    /* renamed from: a */
    public static MediaSelectionFragment m147870a(Album album) {
        MediaSelectionFragment mediaSelectionFragment = new MediaSelectionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_album", album);
        mediaSelectionFragment.setArguments(bundle);
        return mediaSelectionFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C47346a) {
            this.f121508d = (C47346a) context;
            if (context instanceof C47353b) {
                this.f121509e = (C47353b) context;
            }
            if (context instanceof C47355d) {
                this.f121510f = (C47355d) context;
                return;
            }
            return;
        }
        throw new IllegalStateException("Context must implement SelectionProvider.");
    }

    public void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        Album album = (Album) getArguments().getParcelable("extra_album");
        this.f121507c = new AlbumMediaAdapter(getContext(), this.f121508d.mo119406b(), this.f121506b);
        this.f121507c.f121516a = this;
        this.f121507c.f121517b = this;
        this.f121506b.setHasFixedSize(true);
        C47338d a = C47338d.m147803a();
        if (a.f121458n > 0) {
            i = C47332f.m147786a(getContext(), a.f121458n);
        } else {
            i = a.f121457m;
        }
        this.f121506b.setLayoutManager(new GridLayoutManager(getContext(), i));
        this.f121506b.mo5525a((C1272h) new MediaGridInset(i, getResources().getDimensionPixelSize(R.dimen.io), false));
        this.f121506b.setAdapter(this.f121507c);
        this.f121505a.mo119375a(getActivity(), (C47342a) this);
        this.f121505a.mo119377a(album, a.f121455k);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f121506b = (RecyclerView) view.findViewById(R.id.cqv);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ow, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo119403a(Album album, Item item, int i) {
        if (this.f121510f != null) {
            this.f121510f.mo119403a((Album) getArguments().getParcelable("extra_album"), item, i);
        }
    }
}
