package com.p280ss.android.ugc.aweme.tools.draft;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p720g.C13645c;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.C42268a;
import com.p280ss.android.ugc.aweme.tools.draft.p1666a.C42276b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftAdapter */
public class AwemeDraftAdapter extends BaseAdapter<C27311c> implements C42268a {

    /* renamed from: a */
    public boolean f109947a = true;

    /* renamed from: b */
    public C42262a f109948b;

    /* renamed from: c */
    private boolean f109949c;

    /* renamed from: d */
    private boolean f109950d;

    /* renamed from: e */
    private Map<ImageView, C13326a<C13645c>> f109951e;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftAdapter$AwemeDraftFooterViewHolder */
    protected class AwemeDraftFooterViewHolder extends C1293v {
        AwemeDraftFooterViewHolder(View view) {
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftAdapter$DraftTimePeriodHeaderViewHolder */
    protected class DraftTimePeriodHeaderViewHolder extends C1293v {

        /* renamed from: b */
        private TextView f109958b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo103721a(int i) {
            if (this.f109958b != null && i >= 0) {
                this.f109958b.setText(i);
            }
        }

        DraftTimePeriodHeaderViewHolder(View view) {
            super(view);
            this.f109958b = (TextView) view.findViewById(R.id.e3e);
            if (C6399b.m19944t()) {
                C10832b.m31784a().mo26164a(this.f109958b, C10834d.f29337g);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftAdapter$a */
    public interface C42262a {
        /* renamed from: a */
        void mo103722a();
    }

    /* renamed from: a */
    public final List<C27311c> mo62312a() {
        return this.f67539l;
    }

    /* renamed from: j */
    public final String mo103718j() {
        if (this.f109947a) {
            return "storage_management";
        }
        return "personal_homepage";
    }

    /* renamed from: k */
    private boolean m134406k() {
        for (C27311c cVar : this.f67539l) {
            if (cVar != null && cVar.mo70243c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo103717f() {
        final ArrayList<C27311c> arrayList = new ArrayList<>(this.f67539l);
        C6726a.m20842a(new Runnable() {
            public final void run() {
                C27311c cVar = null;
                for (C27311c cVar2 : arrayList) {
                    if (cVar2.f72054w) {
                        AwemeDraftAdapter.m134404b(cVar2);
                        cVar = cVar2;
                    }
                }
                if (cVar != null) {
                    C6726a.m20844b(new C42274a((IAVService) ServiceManager.get().getService(IAVService.class), cVar));
                }
            }
        });
        for (C27311c cVar : arrayList) {
            if (cVar.f72054w) {
                mo103712a(cVar);
            }
        }
    }

    public AwemeDraftAdapter(Map<ImageView, C13326a<C13645c>> map) {
        this.f109951e = map;
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        return ((C27311c) this.f67539l.get(i)).f72053v;
    }

    /* renamed from: b */
    private int m134402b(int i) {
        if (!C42276b.m134489a()) {
            return -1;
        }
        int i2 = i - 1;
        while (i2 >= 0) {
            C27311c cVar = (C27311c) this.f67539l.get(i2);
            if (cVar != null && cVar.f72053v == 3) {
                break;
            }
            i2--;
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo103714a(boolean z) {
        this.f109949c = z;
        notifyDataSetChanged();
    }

    /* renamed from: e */
    public final void mo103716e(List<C27311c> list) {
        if (!(list == null || list.size() == 0)) {
            C27311c cVar = new C27311c();
            cVar.f72053v = 2;
            list.add(0, cVar);
            this.f109950d = true;
        }
        mo58045a(list);
    }

    /* renamed from: c */
    public final void mo103715c(C27311c cVar) {
        if (getItemCount() != 0 && cVar != null) {
            int size = this.f67539l.size();
            for (int i = 0; i < size; i++) {
                C27311c cVar2 = (C27311c) this.f67539l.get(i);
                if (cVar2 != null && C6319n.m19594a(cVar.mo70221aj(), cVar2.mo70221aj())) {
                    this.f67539l.set(i, cVar);
                    notifyItemChanged(i);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m134404b(C27311c cVar) {
        C35563c.f93222D.mo83115a(cVar.mo70221aj());
        C42297n.m134523a().mo103783d(cVar);
        cVar.mo70278m();
    }

    /* renamed from: c */
    private boolean m134405c(int i) {
        if (((C27311c) this.f67539l.get(i)).f72036e == null || i == 0 || ((C27311c) this.f67539l.get(i - 1)).f72053v != 1) {
            return false;
        }
        if (i == this.f67539l.size() - 1) {
            return true;
        }
        int i2 = i + 1;
        if (((C27311c) this.f67539l.get(i2)).f72053v == 1 || ((C27311c) this.f67539l.get(i2)).f72036e == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo103712a(C27311c cVar) {
        int indexOf = this.f67539l.indexOf(cVar);
        if (indexOf != -1) {
            int b = m134402b(indexOf);
            boolean a = m134401a(b, indexOf);
            if (m134405c(indexOf)) {
                this.f67539l.remove(indexOf);
                int i = indexOf - 1;
                this.f67539l.remove(i);
                if (a) {
                    this.f67539l.remove(b);
                }
                if (m134406k() || this.f109948b == null) {
                    notifyItemRangeRemoved(i, 2);
                    if (a) {
                        notifyItemRemoved(b);
                    }
                    return;
                }
                this.f109948b.mo103722a();
                return;
            }
            this.f67539l.remove(indexOf);
            if (a) {
                this.f67539l.remove(b);
            }
            if (m134406k() || this.f109948b == null) {
                notifyItemRemoved(indexOf);
                if (a) {
                    notifyItemRemoved(b);
                }
                return;
            }
            this.f109948b.mo103722a();
        }
    }

    /* renamed from: a */
    public final void mo103713a(String str) {
        if (this.f67539l != null) {
            for (C27311c cVar : this.f67539l) {
                if (TextUtils.equals(str, cVar.mo70221aj())) {
                    mo103712a(cVar);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo103711a(View view, C27311c cVar) {
        m134403b(view, cVar);
    }

    /* renamed from: a */
    private boolean m134401a(int i, int i2) {
        if (!C42276b.m134489a() || -1 == i) {
            return false;
        }
        boolean z = true;
        int i3 = i + 1;
        while (true) {
            if (i3 >= this.f67539l.size()) {
                break;
            }
            C27311c cVar = (C27311c) this.f67539l.get(i3);
            if (cVar == null || !cVar.mo70243c() || i3 == i2) {
                if (cVar != null && 3 == cVar.f72053v) {
                    break;
                }
                i3++;
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    /* renamed from: b */
    private void m134403b(View view, final C27311c cVar) {
        C25712a aVar = new C25712a(view.getContext());
        aVar.mo66614a((CharSequence[]) new String[]{view.getContext().getResources().getString(R.string.ny)}, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                AwemeDraftAdapter.m134404b(cVar);
                AwemeDraftAdapter.this.mo103712a(cVar);
                ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().notifyDraftDelete(cVar);
                C6907h.onEvent(MobClick.obtain().setEventName("click_delete").setLabelName("draft_page"));
                C6907h.m21524a("delete_drafts", (Map) C22984d.m75611a().mo59970a("draft_cnt", 1).mo59973a("enter_from", AwemeDraftAdapter.this.mo103718j()).f60753a);
                dialogInterface.dismiss();
            }
        });
        aVar.mo66615b();
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new AwemeDraftMusicHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uv, viewGroup, false));
        }
        if (i == 2) {
            return new AwemeDraftFooterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uu, viewGroup, false));
        }
        if (3 == i) {
            return new DraftTimePeriodHeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uw, viewGroup, false));
        }
        return new AwemeDraftViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ut, viewGroup, false), this.f109951e, this);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (vVar instanceof AwemeDraftViewHolder) {
            AwemeDraftViewHolder awemeDraftViewHolder = (AwemeDraftViewHolder) vVar;
            awemeDraftViewHolder.f109974b = this.f109949c;
            awemeDraftViewHolder.f109975c = this.f109947a;
            awemeDraftViewHolder.mo66491a((C27311c) this.f67539l.get(i), i);
        } else if (vVar instanceof AwemeDraftMusicHolder) {
            AwemeDraftMusicHolder awemeDraftMusicHolder = (AwemeDraftMusicHolder) vVar;
            awemeDraftMusicHolder.f109959a = this.f109949c;
            awemeDraftMusicHolder.mo66491a((C27311c) this.f67539l.get(i), i);
        } else {
            if (vVar instanceof DraftTimePeriodHeaderViewHolder) {
                ((DraftTimePeriodHeaderViewHolder) vVar).mo103721a(((C27311c) this.f67539l.get(i)).f72056y);
            }
        }
    }
}
