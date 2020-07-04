package com.bytedance.android.live.broadcast.widget;

import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.p128d.C2431a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.taobao.android.dexposed.ClassUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;

public class BroadcastInfoWidget extends LiveRecyclableWidget implements C2431a {

    /* renamed from: a */
    public TextView f9329a;

    /* renamed from: b */
    public final Runnable f9330b = new Runnable() {
        public final void run() {
            if (BroadcastInfoWidget.this.isViewValid()) {
                BroadcastInfoWidget.this.mo9790a(SystemClock.elapsedRealtime());
                BroadcastInfoWidget.this.f9329a.postDelayed(BroadcastInfoWidget.this.f9330b, 1000);
            }
        }
    };

    /* renamed from: c */
    private Integer[] f9331c;

    /* renamed from: d */
    private ImageView f9332d;

    /* renamed from: e */
    private long f9333e;

    /* renamed from: f */
    private Room f9334f;

    /* renamed from: g */
    private View f9335g;

    public int getLayoutId() {
        return R.layout.ats;
    }

    public void onUnload() {
    }

    /* renamed from: a */
    private void m11586a(int i) {
        if (i == 0) {
            this.f9335g.setVisibility(0);
            this.f9332d.setVisibility(4);
            return;
        }
        this.f9335g.setVisibility(4);
        this.f9332d.setVisibility(0);
        this.f9332d.setImageLevel(i);
    }

    /* renamed from: a */
    public final void mo9790a(long j) {
        long j2 = j - this.f9333e;
        if (j2 < 0) {
            j2 = 0;
        }
        this.f9329a.setText(C9048ao.m27016a((int) (j2 / 1000), ClassUtils.PACKAGE_SEPARATOR));
    }

    /* renamed from: a */
    public final void mo8935a(float f) {
        int i;
        BroadcastInfoWidget.class.getSimpleName();
        new StringBuilder("kbps:").append(f);
        Integer[] numArr = this.f9331c;
        if (this.f9334f.getStreamType() != LiveMode.AUDIO) {
            int i2 = 0;
            while (true) {
                if (i2 >= numArr.length) {
                    break;
                } else if (f >= ((float) numArr[i2].intValue())) {
                    i = (numArr.length - i2) - 1;
                    break;
                } else {
                    i2++;
                }
            }
        } else if (f != 0.0f) {
            i = 4;
            C7492s.m23301b(Integer.valueOf(0)).mo19294a(C47549a.m148327a()).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19280a((C7326g<? super T>) new C3101b<Object>(this, i), C3102c.f9575a);
        }
        i = 0;
        C7492s.m23301b(Integer.valueOf(0)).mo19294a(C47549a.m148327a()).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19280a((C7326g<? super T>) new C3101b<Object>(this, i), C3102c.f9575a);
    }

    public void onInit(Object... objArr) {
        this.f9334f = (Room) this.dataCenter.get("data_room");
        this.f9331c = (Integer[]) LiveConfigSettingKeys.LIVE_VIDEO_PUSH_BITRATE_LEVEL.mo10240a();
        this.f9332d = (ImageView) this.contentView.findViewById(R.id.b_q);
        this.f9332d.setImageLevel(4);
        this.f9329a = (TextView) this.contentView.findViewById(R.id.bnp);
        this.f9335g = this.contentView.findViewById(R.id.cl4);
    }

    public void onLoad(Object... objArr) {
        this.f9334f = (Room) this.dataCenter.get("data_room");
        if (this.f9334f.getId() != ((Long) C8946b.f24492v.mo22117a()).longValue() || ((Long) C8946b.f24493w.mo22117a()).longValue() <= 0) {
            this.f9333e = SystemClock.elapsedRealtime();
            C8946b.f24492v.mo22118a(Long.valueOf(this.f9334f.getId()));
            C8946b.f24493w.mo22118a(Long.valueOf(this.f9333e));
        } else {
            this.f9333e = ((Long) C8946b.f24493w.mo22117a()).longValue();
        }
        this.f9329a.postDelayed(this.f9330b, 1000);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9789a(int i, Integer num) throws Exception {
        m11586a(i);
    }
}
