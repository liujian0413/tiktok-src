package com.p280ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.view.C0991u;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33242an;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e.C39313a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordPermissionActivity;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40374af;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42599i;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.p1716b.C43659c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftMusicHolder */
public class AwemeDraftMusicHolder extends AnimatedViewHolder<C27311c> {

    /* renamed from: a */
    public boolean f109959a;

    /* renamed from: b */
    public Context f109960b;

    /* renamed from: c */
    private TextView f109961c;

    /* renamed from: d */
    private TextView f109962d;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftMusicHolder$a */
    abstract class C42264a implements C42599i {

        /* renamed from: e */
        C41654d f109967e;

        /* renamed from: f */
        String f109968f;

        /* renamed from: g */
        int f109969g = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMusicWaveBeanRemainProgress(5);

        C42264a(C41654d dVar, String str) {
            this.f109967e = dVar;
            this.f109968f = str;
        }

        /* renamed from: a */
        public final void mo100634a(String str, int i, String str2, final int i2) {
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    if (C42264a.this.f109967e != null) {
                        if (i2 > C42264a.this.f109969g) {
                            C42264a.this.f109967e.setProgress(C42264a.this.f109969g);
                            return;
                        }
                        C42264a.this.f109967e.setProgress(i2);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo100635a(String str, int i, String str2, Exception exc) {
            C9738o.m28697a(this.f109967e.getContext(), AwemeDraftMusicHolder.this.f109960b.getString(R.string.avf));
            AwemeDraftMusicHolder.this.dismiss(this.f109967e);
        }

        /* renamed from: a */
        public void mo100636a(String str, int i, String str2, float[] fArr) {
            if (this.f109967e != null) {
                this.f109967e.setProgress(100);
            }
            if (i == 3) {
                C7276d.m22820d(str, this.f109968f);
                AwemeDraftMusicHolder.this.dismiss(this.f109967e);
                return;
            }
            if (i == 4) {
                AwemeDraftMusicHolder.this.dismiss(this.f109967e);
            }
        }
    }

    public final void bB_() {
    }

    public void dismiss(C41654d dVar) {
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    AwemeDraftMusicHolder(View view) {
        super(view);
        m134425a(view);
        this.f109960b = view.getContext();
    }

    /* renamed from: a */
    private void m134425a(View view) {
        this.f109961c = (TextView) C0991u.m4211e(view, (int) R.id.dya);
        this.f109962d = (TextView) C0991u.m4211e(view, (int) R.id.dqc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66491a(C27311c cVar, int i) {
        if (cVar != null && cVar.f72036e != null) {
            this.f67534h = cVar;
            if (this.f109959a) {
                this.f109962d.setVisibility(4);
            } else {
                this.f109962d.setVisibility(0);
            }
            this.f109961c.setText(cVar.f72036e.getName());
            this.f109962d.setOnClickListener(new C42277b(this, cVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo103724a(C27311c cVar, View view) {
        if (C39360dw.m125725a().mo97930a(view.getContext()) && C35563c.f93246i.mo103861a(cVar.f72036e, this.f109960b, true)) {
            AVMusic clone = cVar.f72036e.clone();
            if (clone != null) {
                clone.setMusicPriority(99);
                C39360dw.m125725a().mo97928a(clone);
                String path = clone.getPath();
                Context context = this.itemView.getContext();
                int i = cVar.f72043l;
                StringBuilder sb = new StringBuilder("toVideoRecord() called with: path = [");
                sb.append(path);
                sb.append("], context = [], musicModel = [");
                sb.append(clone);
                sb.append("], start = [");
                sb.append(i);
                sb.append("]");
                C42880h.m136156a(sb.toString());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("route", "1");
                } catch (JSONException unused) {
                }
                C6907h.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("draft_again").setValue(clone.getMusicId()).setJsonObject(jSONObject));
                C33242an.m107315a("draft_page");
                m134422a(context, clone, i);
            }
        }
    }

    /* renamed from: a */
    private void m134422a(Context context, AVMusic aVMusic, int i) {
        if (!aVMusic.getPath().startsWith(WebKitApi.SCHEME_HTTP)) {
            m134424a(context, null, aVMusic.getMusicId(), aVMusic.getPath(), i);
            return;
        }
        final AVMusic aVMusic2 = aVMusic;
        final Context context2 = context;
        final int i2 = i;
        C422631 r2 = new C42264a(C41654d.m132586b(context, context.getString(R.string.dy2)), C43659c.m138324a().mo105612a(aVMusic.getPath())) {
            /* renamed from: a */
            public final void mo100636a(String str, int i, String str2, float[] fArr) {
                C42279c cVar = new C42279c(this, str, i, str2, fArr, aVMusic2, context2, i2);
                C39312e.m125625a(str, 5, (C39313a) cVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo103726a(String str, int i, String str2, float[] fArr, AVMusic aVMusic, Context context, int i2, AVMusicWaveBean aVMusicWaveBean) {
                super.mo100636a(str, i, str2, fArr);
                C40374af.m129114a(aVMusic.getMusicId(), str);
                if (aVMusicWaveBean != null) {
                    AwemeDraftMusicHolder.m134424a(context, aVMusicWaveBean, aVMusic.getMusicId(), str, i2);
                } else {
                    AwemeDraftMusicHolder.m134424a(context, null, aVMusic.getMusicId(), str, i2);
                }
            }
        };
        m134423a(context, aVMusic, (C42264a) r2);
    }

    /* renamed from: a */
    private static void m134423a(Context context, AVMusic aVMusic, C42264a aVar) {
        if (context == null || aVMusic.getMusicStatus() != 0) {
            C35563c.f93246i.mo103856a(aVMusic, (C42599i) aVar);
            return;
        }
        String offlineDesc = aVMusic.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getApplicationContext().getString(R.string.chb);
        }
        C9738o.m28697a(context, offlineDesc);
    }

    /* renamed from: a */
    public static void m134424a(Context context, AVMusicWaveBean aVMusicWaveBean, String str, String str2, int i) {
        String uuid = UUID.randomUUID().toString();
        C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("creation_id", uuid).mo59973a("shoot_way", "draft_again").mo59970a("_staging_flag", C6399b.m19946v() ^ true ? 1 : 0).mo59973a("music_id", str).f60753a);
        StringBuilder sb = new StringBuilder("toVideoActivity() called with: context = [ ], path = [");
        sb.append(str2);
        sb.append("], musicStart = [");
        sb.append(i);
        sb.append("]");
        C42880h.m136156a(sb.toString());
        Intent intent = new Intent();
        intent.putExtra("path", str2);
        intent.putExtra("music_start", i);
        intent.putExtra("record_from", 1);
        intent.putExtra("translation_type", 3);
        intent.putExtra("shoot_way", "draft_again");
        intent.putExtra("creation_id", uuid);
        if (aVMusicWaveBean != null) {
            intent.putExtra("music_wave_data", aVMusicWaveBean);
        }
        C39360dw.m125725a().mo97936f();
        C39360dw.m125725a().mo97933c();
        intent.setClass(context, VideoRecordPermissionActivity.class);
        context.startActivity(intent);
    }
}
