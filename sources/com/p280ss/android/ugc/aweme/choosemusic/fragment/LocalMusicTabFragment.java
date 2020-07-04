package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.arch.C23074c;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23843a;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23867m;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.view.BaseMusicListView;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23964i;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25766a;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment */
public final class LocalMusicTabFragment extends BaseMusicListFragment<MusicModel> implements C23843a<MusicModel>, C25766a {

    /* renamed from: l */
    public static final C23898a f63103l = new C23898a(null);

    /* renamed from: m */
    private C23867m f63104m;

    /* renamed from: n */
    private C23819a f63105n;

    /* renamed from: o */
    private long f63106o;

    /* renamed from: p */
    private HashMap f63107p;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment$a */
    public static final class C23898a {
        private C23898a() {
        }

        public /* synthetic */ C23898a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static LocalMusicTabFragment m78365a(int i) {
            LocalMusicTabFragment localMusicTabFragment = new LocalMusicTabFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
            localMusicTabFragment.setArguments(bundle);
            return localMusicTabFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment$b */
    static final class C23899b implements C22480b {

        /* renamed from: a */
        final /* synthetic */ LocalMusicTabFragment f63108a;

        C23899b(LocalMusicTabFragment localMusicTabFragment) {
            this.f63108a = localMusicTabFragment;
        }

        /* renamed from: a */
        public final void mo53549a(String[] strArr, int[] iArr) {
            if (iArr[0] == 0) {
                this.f63108a.mo62039i();
            }
        }
    }

    /* renamed from: a */
    public static final LocalMusicTabFragment m78346a(int i) {
        return C23898a.m78365a(i);
    }

    /* renamed from: a */
    private static void m78348a(MusicModel musicModel, int i) {
        C7573i.m23587b(musicModel, "data");
    }

    /* renamed from: t */
    private void m78350t() {
        if (this.f63107p != null) {
            this.f63107p.clear();
        }
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

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m78350t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo62007p() {
        return R.layout.p8;
    }

    /* renamed from: a */
    public final void mo60113a() {
        super.mo60113a();
        this.f63104m = new C23867m(this.f63050i);
        mo62039i();
    }

    /* renamed from: j */
    public final View mo61750j() {
        if (this.f63051j == null) {
            return null;
        }
        C23074c cVar = this.f63051j;
        if (cVar != null) {
            return ((BaseMusicListView) cVar).mRecyclerView;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView<*>");
    }

    /* renamed from: r */
    public final void mo61918r() {
        if (this.f63104m != null) {
            C23867m mVar = this.f63104m;
            if (mVar == null) {
                C7573i.m23580a();
            }
            mVar.mo61961a(new WeakReference(getActivity()));
        }
    }

    /* renamed from: s */
    public final void mo61919s() {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            activity.onBackPressed();
        }
    }

    /* renamed from: q */
    private final void m78349q() {
        if (mo61750j() instanceof RecyclerView) {
            View j = mo61750j();
            if (j != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView) j).getLayoutManager();
                if (linearLayoutManager != null) {
                    int j2 = linearLayoutManager.mo5445j();
                    int l = linearLayoutManager.mo5447l();
                    C23074c cVar = this.f63051j;
                    C7573i.m23582a((Object) cVar, "mIViewHolder");
                    BaseAdapter d = cVar.mo60125d();
                    if (d != null && (d instanceof MusicAdapter)) {
                        m78347a((MusicAdapter) d, j2, l);
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
            }
        }
    }

    /* renamed from: i */
    public final void mo62039i() {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            if (C0683b.m2909b((Context) activity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || this.f63104m == null) {
                C22477b.m74364a(getActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23899b(this));
                return;
            }
            C23867m mVar = this.f63104m;
            if (mVar == null) {
                C7573i.m23580a();
            }
            mVar.mo61961a(new WeakReference(getActivity()));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f63106o = System.currentTimeMillis();
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            m78349q();
        }
        C23074c cVar = this.f63051j;
        if (!(cVar instanceof C23964i)) {
            cVar = null;
        }
        C23964i iVar = (C23964i) cVar;
        if (iVar != null) {
            iVar.mo62170a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C23074c<MusicModel> mo61998b(View view) {
        C7573i.m23587b(view, "view");
        Context context = getContext();
        if (context != null) {
            C7573i.m23582a((Object) context, "ctx");
            C23964i iVar = new C23964i(context, view, this, this, mo62000g());
            iVar.f63309g = this.f63106o;
            iVar.mo62169a((C23844b) this);
            this.f63105n = new C23819a("change_music_page_detail", "local_music", "click_button", C23888c.m78180a());
            C23819a aVar = this.f63105n;
            if (aVar == null) {
                C7573i.m23580a();
            }
            iVar.mo62168a(aVar);
            iVar.mo62170a(false);
            return iVar;
        }
        throw new IllegalStateException("Context is null");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo61917a(Object obj, int i) {
        m78348a((MusicModel) obj, i);
    }

    /* renamed from: a */
    private final void m78347a(MusicAdapter musicAdapter, int i, int i2) {
        List a = musicAdapter.mo62312a();
        if (!C6307b.m19566a((Collection<T>) a)) {
            while (i < i2) {
                if (i >= 0 && i < a.size()) {
                    MusicModel musicModel = (MusicModel) a.get(i);
                    if (musicModel != null) {
                        C23888c.m78185a(this.f63105n, musicModel.getMusicId(), i, true);
                    }
                }
                i++;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61997a(String str, MusicModel musicModel, String str2, Activity activity) {
        String str3;
        String str4;
        C7573i.m23587b(str, "musicPath");
        C7573i.m23587b(str2, "musicOrigin");
        C7573i.m23587b(activity, "activity");
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
