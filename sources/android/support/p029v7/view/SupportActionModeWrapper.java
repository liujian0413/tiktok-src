package android.support.p029v7.view;

import android.content.Context;
import android.support.p022v4.internal.view.C0745a;
import android.support.p022v4.internal.view.C0746b;
import android.support.p022v4.util.C0904k;
import android.support.p029v7.view.C1153b.C1154a;
import android.support.p029v7.view.menu.C1192k;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.SupportActionModeWrapper */
public final class SupportActionModeWrapper extends ActionMode {

    /* renamed from: a */
    final Context f4144a;

    /* renamed from: b */
    final C1153b f4145b;

    /* renamed from: android.support.v7.view.SupportActionModeWrapper$CallbackWrapper */
    public static class CallbackWrapper implements C1154a {

        /* renamed from: a */
        final Callback f4146a;

        /* renamed from: b */
        final Context f4147b;

        /* renamed from: c */
        final ArrayList<SupportActionModeWrapper> f4148c = new ArrayList<>();

        /* renamed from: d */
        final C0904k<Menu, Menu> f4149d = new C0904k<>();

        /* renamed from: a */
        public final void mo4340a(C1153b bVar) {
            this.f4146a.onDestroyActionMode(mo4569b(bVar));
        }

        /* renamed from: a */
        private Menu m5108a(Menu menu) {
            Menu menu2 = (Menu) this.f4149d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = C1192k.m5416a(this.f4147b, (C0745a) menu);
            this.f4149d.put(menu, a);
            return a;
        }

        /* renamed from: b */
        public final ActionMode mo4569b(C1153b bVar) {
            int size = this.f4148c.size();
            for (int i = 0; i < size; i++) {
                SupportActionModeWrapper supportActionModeWrapper = (SupportActionModeWrapper) this.f4148c.get(i);
                if (supportActionModeWrapper != null && supportActionModeWrapper.f4145b == bVar) {
                    return supportActionModeWrapper;
                }
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.f4147b, bVar);
            this.f4148c.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }

        /* renamed from: b */
        public final boolean mo4343b(C1153b bVar, Menu menu) {
            return this.f4146a.onPrepareActionMode(mo4569b(bVar), m5108a(menu));
        }

        public CallbackWrapper(Context context, Callback callback) {
            this.f4147b = context;
            this.f4146a = callback;
        }

        /* renamed from: a */
        public final boolean mo4341a(C1153b bVar, Menu menu) {
            return this.f4146a.onCreateActionMode(mo4569b(bVar), m5108a(menu));
        }

        /* renamed from: a */
        public final boolean mo4342a(C1153b bVar, MenuItem menuItem) {
            return this.f4146a.onActionItemClicked(mo4569b(bVar), C1192k.m5417a(this.f4147b, (C0746b) menuItem));
        }
    }

    public final void finish() {
        this.f4145b.mo4402c();
    }

    public final View getCustomView() {
        return this.f4145b.mo4408i();
    }

    public final MenuInflater getMenuInflater() {
        return this.f4145b.mo4394a();
    }

    public final CharSequence getSubtitle() {
        return this.f4145b.mo4406g();
    }

    public final Object getTag() {
        return this.f4145b.f4151b;
    }

    public final CharSequence getTitle() {
        return this.f4145b.mo4405f();
    }

    public final boolean getTitleOptionalHint() {
        return this.f4145b.f4152c;
    }

    public final void invalidate() {
        this.f4145b.mo4403d();
    }

    public final boolean isTitleOptional() {
        return this.f4145b.mo4407h();
    }

    public final Menu getMenu() {
        return C1192k.m5416a(this.f4144a, (C0745a) this.f4145b.mo4399b());
    }

    public final void setCustomView(View view) {
        this.f4145b.mo4396a(view);
    }

    public final void setSubtitle(int i) {
        this.f4145b.mo4400b(i);
    }

    public final void setTag(Object obj) {
        this.f4145b.f4151b = obj;
    }

    public final void setTitle(int i) {
        this.f4145b.mo4395a(i);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f4145b.mo4398a(z);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f4145b.mo4397a(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f4145b.mo4401b(charSequence);
    }

    public SupportActionModeWrapper(Context context, C1153b bVar) {
        this.f4144a = context;
        this.f4145b = bVar;
    }
}
