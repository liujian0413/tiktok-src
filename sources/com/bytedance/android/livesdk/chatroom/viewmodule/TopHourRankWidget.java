package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.event.C4430av;
import com.bytedance.android.livesdk.chatroom.model.C4914l;
import com.bytedance.android.livesdk.chatroom.presenter.C5025j;
import com.bytedance.android.livesdk.chatroom.presenter.C5025j.C5026a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C8691v;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.rank.DailyRankDialog;
import com.bytedance.android.livesdk.rank.model.C8852a;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

public class TopHourRankWidget extends LiveRecyclableWidget implements C0053p<KVData>, OnClickListener, C5026a {

    /* renamed from: a */
    private TextView f16490a;

    /* renamed from: b */
    private C5025j f16491b;

    /* renamed from: c */
    private DailyRankDialog f16492c;

    /* renamed from: d */
    private Room f16493d;

    /* renamed from: e */
    private boolean f16494e;

    /* renamed from: f */
    private boolean f16495f;

    /* renamed from: g */
    private boolean f16496g;

    /* renamed from: a */
    public final void mo13045a(C4914l lVar) {
    }

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.avn;
    }

    /* renamed from: a */
    private static boolean m17890a() {
        if (((Integer) LiveSettingKeys.LIVE_DAILY_RANK.mo10240a()).intValue() != 0) {
            return true;
        }
        return false;
    }

    public void onUnload() {
        this.f16491b.mo8963a();
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        if (this.f16492c != null) {
            try {
                this.f16492c.dismiss();
            } catch (IllegalStateException unused) {
            }
            this.f16492c = null;
        }
        this.f16496g = false;
    }

    /* renamed from: onEvent */
    public void mo14018a(C4430av avVar) {
        if (isViewValid() && this.f16492c != null) {
            this.f16492c.dismiss();
        }
    }

    public void onClick(View view) {
        if (isViewValid()) {
            this.f16491b.mo13043b();
            m17888a(0);
        }
    }

    public void onInit(Object[] objArr) {
        this.contentView.setOnClickListener(this);
        this.f16490a = (TextView) this.containerView.findViewById(R.id.awn);
    }

    /* renamed from: a */
    private void m17888a(int i) {
        if (this.f16492c != null) {
            this.f16492c.dismiss();
        } else {
            this.f16492c = DailyRankDialog.m26361a(this.f16493d, this.f16494e, this.f16495f, this.dataCenter, 0);
        }
        this.f16492c.f23902f = 0;
        this.f16492c.show(((FragmentActivity) this.context).getSupportFragmentManager(), DailyRankDialog.f23895a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (isViewValid() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -774172322) {
                if (hashCode == 1433895618 && key.equals("cmd_send_gift")) {
                    c = 0;
                }
            } else if (key.equals("cmd_dismiss_dialog_end")) {
                c = 1;
            }
            switch (c) {
                case 0:
                case 1:
                    if (isViewValid() && this.f16492c != null) {
                        this.f16492c.dismiss();
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    private static String m17887a(long j) {
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 100000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            sb.append(C9078p.m27100a("%.1f", Double.valueOf((d * 1.0d) / 10000.0d)));
            sb.append("万");
            return sb.toString();
        } else if (j < 10000000) {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            sb2.append(C9078p.m27100a("%.0f", Double.valueOf((d2 * 1.0d) / 10000.0d)));
            sb2.append("万");
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            double d3 = (double) j;
            Double.isNaN(d3);
            sb3.append(C9078p.m27100a("%.0f", Double.valueOf((d3 * 1.0d) / 1.0E7d)));
            sb3.append("千万");
            return sb3.toString();
        }
    }

    public void onLoad(Object[] objArr) {
        this.f16493d = (Room) this.dataCenter.get("data_room");
        if (this.f16493d != null && this.f16493d.getOwner() != null) {
            this.f16494e = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
            this.f16495f = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
            this.f16496g = true;
            this.f16491b = new C5025j();
            this.f16491b.f14293a = this.f16493d.getOwner().getId();
            this.f16491b.f14294b = this.f16493d.getId();
            this.f16491b.mo9142a((C5026a) this);
            this.dataCenter.observe("cmd_send_gift", this);
            this.dataCenter.observe("cmd_dismiss_dialog_end", this);
            C9097a.m27146a().mo22266a(C4430av.class).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19325f((C7326g<? super T>) new C5710ex<Object>(this));
            if (m17890a()) {
                this.f16491b.mo13043b();
            }
        }
    }

    /* renamed from: a */
    public final void mo13046a(C8691v vVar) {
        if (isViewValid() && vVar != null && vVar.baseMessage != null && !this.f16496g) {
            if (vVar.f23687i != 0) {
                C9738o.m28704a(this.f16490a, (CharSequence) getContext().getResources().getString(R.string.fe5, new Object[]{m17887a((long) vVar.f23687i)}));
                return;
            }
            C9738o.m28704a(this.f16490a, (CharSequence) vVar.f23688j.replace("\n", ""));
        }
    }

    /* renamed from: a */
    public final void mo13047a(C8852a aVar) {
        if (this.isViewValid && aVar != null) {
            if (aVar.f24078k) {
                C9738o.m28712b((View) this.containerView, 4);
                return;
            }
            if (aVar.f24069b != null) {
                C9738o.m28704a(this.f16490a, (CharSequence) aVar.f24069b.f24102f.replace("\n", ""));
            }
        }
    }
}
