package com.p280ss.android.ugc.aweme.shortvideo.record;

import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.RadioGroup;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.e */
public final class C40308e {

    /* renamed from: a */
    public boolean f104694a = true;

    /* renamed from: b */
    private C40310a f104695b;

    /* renamed from: c */
    private RadioGroup f104696c;

    /* renamed from: d */
    private ViewStub f104697d;

    /* renamed from: e */
    private boolean f104698e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.e$a */
    public interface C40310a {
        /* renamed from: a */
        void mo96729a(RecordingSpeed recordingSpeed);
    }

    /* renamed from: a */
    private void m128755a() {
        if (this.f104697d.getParent() != null) {
            this.f104696c = (RadioGroup) this.f104697d.inflate();
            this.f104696c.setOnCheckedChangeListener(new C40311f(this));
            if (this.f104698e) {
                m128756a(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo100131a(int i) {
        m128755a();
        this.f104696c.setVisibility(i);
    }

    /* renamed from: a */
    private void m128756a(boolean z) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f104696c.getLayoutParams();
        marginLayoutParams.bottomMargin = (int) C9738o.m28708b(this.f104696c.getContext(), 33.0f);
        this.f104696c.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: a */
    public final void mo100133a(RecordingSpeed recordingSpeed) {
        m128755a();
        switch (recordingSpeed) {
            case EPIC:
                this.f104696c.check(R.id.cno);
                return;
            case SLOW:
                this.f104696c.check(R.id.cnp);
                return;
            case NORMAL:
                this.f104696c.check(R.id.cnq);
                return;
            case FAST:
                this.f104696c.check(R.id.cnr);
                return;
            case LAPSE:
                this.f104696c.check(R.id.cns);
                break;
        }
    }

    public C40308e(ViewStub viewStub, C40310a aVar) {
        this.f104697d = viewStub;
        this.f104695b = aVar;
        if (C35563c.f93230L.mo93342a(Property.SpeedPanelOpen)) {
            m128755a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100132a(RadioGroup radioGroup, int i) {
        if (this.f104694a) {
            if (i == R.id.cno) {
                this.f104695b.mo96729a(RecordingSpeed.EPIC);
            } else if (i == R.id.cnp) {
                this.f104695b.mo96729a(RecordingSpeed.SLOW);
            } else if (i == R.id.cnq) {
                this.f104695b.mo96729a(RecordingSpeed.NORMAL);
            } else if (i == R.id.cnr) {
                this.f104695b.mo96729a(RecordingSpeed.FAST);
            } else if (i == R.id.cns) {
                this.f104695b.mo96729a(RecordingSpeed.LAPSE);
            } else {
                StringBuilder sb = new StringBuilder("unknown view: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
}
