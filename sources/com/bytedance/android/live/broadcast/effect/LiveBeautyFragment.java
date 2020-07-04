package com.bytedance.android.live.broadcast.effect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LiveBeautyFragment extends BaseFragment implements OnSeekBarChangeListener {

    /* renamed from: a */
    private C2576a f8261a;

    /* renamed from: b */
    private SeekBar f8262b;

    /* renamed from: c */
    private SeekBar f8263c;

    /* renamed from: d */
    private SeekBar f8264d;

    /* renamed from: e */
    private SeekBar f8265e;

    /* renamed from: f */
    private boolean f8266f;

    /* renamed from: com.bytedance.android.live.broadcast.effect.LiveBeautyFragment$a */
    public interface C2576a {
        /* renamed from: a */
        void mo9187a(float f);

        /* renamed from: b */
        void mo9188b(float f);

        /* renamed from: c */
        void mo9189c(float f);

        /* renamed from: d */
        void mo9190d(float f);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onResume() {
        super.onResume();
        m10572a();
    }

    /* renamed from: a */
    private void m10572a() {
        this.f8262b.setProgress((int) (((Float) C8946b.f24362N.mo22117a()).floatValue() * 100.0f));
        this.f8263c.setProgress((int) (((Float) C8946b.f24363O.mo22117a()).floatValue() * 100.0f));
        this.f8264d.setProgress((int) (((Float) C8946b.f24364P.mo22117a()).floatValue() * 100.0f));
        this.f8265e.setProgress((int) (((Float) C8946b.f24365Q.mo22117a()).floatValue() * 100.0f));
    }

    /* renamed from: a */
    public final void mo9183a(int i) {
        float a = C2619g.m10718a(C2624k.m10736a().f8419b, i);
        if (a > ((float) this.f8262b.getProgress())) {
            this.f8262b.setProgress((int) a);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        int id = seekBar.getId();
        if (id == R.id.eh1) {
            C8946b.f24362N.mo22118a(Float.valueOf(((float) seekBar.getProgress()) / 100.0f));
        } else if (id == R.id.l1) {
            C8946b.f24363O.mo22118a(Float.valueOf(((float) seekBar.getProgress()) / 100.0f));
        } else if (id == R.id.mb) {
            C8946b.f24364P.mo22118a(Float.valueOf(((float) seekBar.getProgress()) / 100.0f));
        } else if (id == R.id.aho) {
            C8946b.f24365Q.mo22118a(Float.valueOf(((float) seekBar.getProgress()) / 100.0f));
        }
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            C2619g.m10719a(currentRoom.getId());
        }
    }

    /* renamed from: a */
    private void m10573a(View view) {
        this.f8263c = (SeekBar) view.findViewById(R.id.l1);
        this.f8264d = (SeekBar) view.findViewById(R.id.mb);
        this.f8265e = (SeekBar) view.findViewById(R.id.aho);
        this.f8262b = (SeekBar) view.findViewById(R.id.eh1);
        this.f8262b.setOnSeekBarChangeListener(this);
        this.f8263c.setOnSeekBarChangeListener(this);
        this.f8264d.setOnSeekBarChangeListener(this);
        this.f8265e.setOnSeekBarChangeListener(this);
        if (C9290a.f25466a) {
            view.findViewById(R.id.eh0).setVisibility(8);
        }
    }

    /* renamed from: a */
    public static LiveBeautyFragment m10571a(C2576a aVar, boolean z) {
        LiveBeautyFragment liveBeautyFragment = new LiveBeautyFragment();
        liveBeautyFragment.setArguments(new Bundle());
        liveBeautyFragment.f8261a = aVar;
        liveBeautyFragment.f8266f = z;
        return liveBeautyFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (C9290a.f25466a) {
            i = R.layout.aq0;
        } else if (this.f8266f) {
            i = R.layout.aqf;
        } else {
            i = R.layout.aqe;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        m10573a(inflate);
        m10572a();
        return inflate;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int id = seekBar.getId();
        if (id == R.id.eh1) {
            if (this.f8261a != null) {
                this.f8261a.mo9187a(((float) i) / 100.0f);
            }
        } else if (id == R.id.l1) {
            if (this.f8261a != null) {
                this.f8261a.mo9188b(((float) i) / 100.0f);
            }
        } else if (id == R.id.mb) {
            if (this.f8261a != null) {
                this.f8261a.mo9189c(((float) i) / 100.0f);
            }
        } else if (id == R.id.aho && this.f8261a != null) {
            this.f8261a.mo9190d(((float) i) / 100.0f);
        }
    }
}
