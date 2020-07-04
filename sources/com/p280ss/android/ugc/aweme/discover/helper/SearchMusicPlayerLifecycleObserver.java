package com.p280ss.android.ugc.aweme.discover.helper;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33242an;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver */
public class SearchMusicPlayerLifecycleObserver implements C0042h {

    /* renamed from: a */
    public FragmentActivity f70266a;

    /* renamed from: b */
    public C41654d f70267b;

    /* renamed from: c */
    private MusicPlayHelper f70268c;

    /* renamed from: d */
    private C0053p f70269d = new C0053p<C26657e>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C26657e eVar) {
            if (eVar != null) {
                switch (eVar.f70283a) {
                    case 1:
                        if (SearchMusicPlayerLifecycleObserver.this.f70267b == null) {
                            SearchMusicPlayerLifecycleObserver.this.f70267b = C41654d.m132586b(SearchMusicPlayerLifecycleObserver.this.f70266a, SearchMusicPlayerLifecycleObserver.this.f70266a.getResources().getString(R.string.ch6));
                        }
                        SearchMusicPlayerLifecycleObserver.this.f70267b.setIndeterminate(false);
                        return;
                    case 2:
                        if (SearchMusicPlayerLifecycleObserver.this.f70267b == null) {
                            SearchMusicPlayerLifecycleObserver.this.f70267b = C41654d.m132586b(SearchMusicPlayerLifecycleObserver.this.f70266a, SearchMusicPlayerLifecycleObserver.this.f70266a.getResources().getString(R.string.ch6));
                            SearchMusicPlayerLifecycleObserver.this.f70267b.setIndeterminate(false);
                        }
                        SearchMusicPlayerLifecycleObserver.this.f70267b.setProgress(eVar.f70284b);
                        return;
                    case 3:
                        if (SearchMusicPlayerLifecycleObserver.this.f70267b != null) {
                            SearchMusicPlayerLifecycleObserver.this.f70267b.setProgress(100);
                        }
                        SearchMusicPlayerLifecycleObserver.this.mo68341a();
                        if (!(eVar.f70286d == null || TextUtils.isEmpty(eVar.f70286d.f70302a) || eVar.f70286d.f70303b == null)) {
                            SearchMusicPlayerLifecycleObserver.this.mo68342a(eVar.f70286d.f70302a, eVar.f70286d.f70303b);
                            return;
                        }
                    case 4:
                        SearchMusicPlayerLifecycleObserver.this.mo68341a();
                        if (eVar.f70285c > 0) {
                            C10761a.m31399c((Context) SearchMusicPlayerLifecycleObserver.this.f70266a, eVar.f70285c);
                            break;
                        }
                        break;
                }
            }
        }
    };

    /* renamed from: a */
    public final void mo68341a() {
        if (this.f70267b != null) {
            this.f70267b.dismiss();
        }
        this.f70267b = null;
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public void onCreate() {
        this.f70268c = (MusicPlayHelper) C0069x.m159a(this.f70266a).mo147a(MusicPlayHelper.class);
        this.f70268c.f70230c.mo60162a(this.f70266a, this.f70269d, false);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        mo68341a();
        if (this.f70268c != null) {
            this.f70268c.f70230c.removeObserver(this.f70269d);
        }
    }

    public SearchMusicPlayerLifecycleObserver(FragmentActivity fragmentActivity) {
        this.f70266a = fragmentActivity;
    }

    /* renamed from: a */
    public final void mo68342a(String str, MusicModel musicModel) {
        boolean z;
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_origin", "search_result");
        if (musicModel.getMusicWaveBean() != null) {
            intent.putExtra("music_wave_data", musicModel.getMusicWaveBean());
        }
        if (TextUtils.equals(((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getShootWay(), "direct_shoot") && 2 == ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getMusicChooseType()) {
            String str2 = "extra_clear_dialog_show_needed";
            if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getCurMusic() != null) {
                z = true;
            } else {
                z = false;
            }
            intent.putExtra(str2, z);
        }
        intent.putExtra("reverse_video_record_show_planD", true);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(musicModel);
        intent.putExtra("shoot_way", "search_result");
        C33242an.m107315a("search_result");
        intent.putExtra("translation_type", 3);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) this.f70266a, intent);
    }
}
