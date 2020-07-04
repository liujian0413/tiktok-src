package com.p280ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0893e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feedback.MyFeedbackFragment */
public class MyFeedbackFragment extends AmeBaseFragment implements C6310a, C29114s {

    /* renamed from: e */
    protected static long f76699e;

    /* renamed from: f */
    private Context f76700f;

    /* renamed from: g */
    private List<C29075g> f76701g = new ArrayList();

    /* renamed from: h */
    private C6309f f76702h = new C6309f(this);

    /* renamed from: i */
    private int f76703i;

    /* renamed from: j */
    private boolean f76704j = false;

    /* renamed from: k */
    private C29078h f76705k;

    /* renamed from: l */
    private boolean f76706l = false;

    /* renamed from: m */
    private ListView f76707m;

    /* renamed from: n */
    private ProgressBar f76708n;

    /* renamed from: o */
    private ViewGroup f76709o;

    /* renamed from: a */
    public final void mo74491a() {
        this.f76706l = true;
    }

    public void onResume() {
        super.onResume();
        if (this.f76706l) {
            if (this.f76704j) {
                this.f76706l = false;
                return;
            }
            this.f76703i++;
            this.f76704j = true;
            this.f76708n.setVisibility(8);
            long j = 0;
            if (this.f76701g != null && this.f76701g.size() > 0) {
                j = ((C29075g) this.f76701g.get(this.f76701g.size() - 1)).f76752b;
            }
            C29091r rVar = new C29091r(0, j, -1, (long) this.f76703i, 3);
            new FeedbackThread2((Handler) this.f76702h, this.f76700f, rVar).start();
        }
        this.f76706l = false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f76700f = getActivity();
        this.f76705k = new C29078h(this.f76700f, this);
        mo15377a(this.f76705k);
        this.f76707m.setAdapter(this.f76705k);
        this.f76703i++;
        this.f76704j = true;
        C29091r rVar = new C29091r(0, 0, -1, (long) this.f76703i, 5);
        new FeedbackThread2((Handler) this.f76702h, this.f76700f, rVar).start();
    }

    public void handleMsg(Message message) {
        int i;
        Message message2 = message;
        if (isViewValid() && (message2.obj instanceof C29091r)) {
            C29091r rVar = (C29091r) message2.obj;
            if (((long) this.f76703i) == rVar.f76834d) {
                if (message2.what == 11) {
                    if (!(message2.arg1 == 19 || message2.arg1 == 18) || this.f76701g.isEmpty()) {
                        C9738o.m28711b(this.f76700f, (int) R.drawable.wt, getString(C19929d.m65752a(message2.arg1)));
                    }
                    this.f76704j = false;
                    this.f76708n.setVisibility(8);
                    return;
                }
                if (rVar.f76835e == 3) {
                    this.f76701g.addAll(m95381a(this.f76701g, rVar.f76837g));
                } else if (rVar.f76835e == 4 || rVar.f76835e == 5 || rVar.f76835e == 1) {
                    if (rVar.f76835e == 1) {
                        f76699e = System.currentTimeMillis();
                    }
                    this.f76701g.clear();
                    this.f76701g.addAll(rVar.f76837g);
                } else {
                    return;
                }
                this.f76705k.mo74515a(this.f76701g, rVar.f76838h);
                this.f76707m.setSelection(this.f76705k.getCount());
                this.f76704j = false;
                this.f76708n.setVisibility(8);
                if (rVar.f76835e == 5) {
                    if (C29088o.m95435a(this.f76700f)) {
                        this.f76703i++;
                        this.f76704j = true;
                        if (System.currentTimeMillis() - f76699e > 864000000) {
                            i = 1;
                        } else {
                            i = 4;
                        }
                        C29091r rVar2 = new C29091r(0, 0, -1, (long) this.f76703i, i);
                        new FeedbackThread2((Handler) this.f76702h, this.f76700f, rVar2).start();
                        return;
                    }
                    C9738o.m28694a(this.f76700f, (int) R.drawable.wt, (int) R.string.dxn);
                }
            }
        }
    }

    /* renamed from: a */
    private static List<C29075g> m95381a(List<C29075g> list, List<C29075g> list2) {
        ArrayList arrayList = new ArrayList();
        if (list == null || list.size() <= 0) {
            arrayList.addAll(list2);
            return arrayList;
        } else if (list2 == null || list2.size() <= 0) {
            return arrayList;
        } else {
            C0893e eVar = new C0893e();
            for (C29075g gVar : list) {
                eVar.mo3333b(gVar.f76752b, gVar);
            }
            for (C29075g gVar2 : list2) {
                if (eVar.mo3328a(gVar2.f76752b, null) == null) {
                    arrayList.add(gVar2);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo74492a(String str, String str2, Bitmap bitmap) {
        if (isViewValid()) {
            FragmentActivity activity = getActivity();
            if (activity instanceof FeedbackActivity) {
                ((FeedbackActivity) activity).mo74479a(str, str2, bitmap);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.afi, viewGroup, false);
        this.f76707m = (ListView) inflate.findViewById(R.id.bng);
        this.f76708n = (ProgressBar) inflate.findViewById(R.id.clc);
        this.f76709o = (ViewGroup) inflate.findViewById(R.id.a1q);
        return inflate;
    }
}
