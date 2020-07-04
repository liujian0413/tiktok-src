package android.support.p029v7.widget;

import android.os.Bundle;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.p028a.C0945c;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.RecyclerViewAccessibilityDelegate */
public class RecyclerViewAccessibilityDelegate extends C0939a {

    /* renamed from: a */
    final RecyclerView f5028a;

    /* renamed from: c */
    public final C0939a f5029c = new ItemDelegate(this);

    /* renamed from: android.support.v7.widget.RecyclerViewAccessibilityDelegate$ItemDelegate */
    public static class ItemDelegate extends C0939a {

        /* renamed from: a */
        final RecyclerViewAccessibilityDelegate f5030a;

        public ItemDelegate(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.f5030a = recyclerViewAccessibilityDelegate;
        }

        /* renamed from: a */
        public final void mo1148a(View view, C0945c cVar) {
            super.mo1148a(view, cVar);
            if (!this.f5030a.mo5917a() && this.f5030a.f5028a.getLayoutManager() != null) {
                this.f5030a.f5028a.getLayoutManager().mo5758a(view, cVar);
            }
        }

        /* renamed from: a */
        public final boolean mo1299a(View view, int i, Bundle bundle) {
            if (super.mo1299a(view, i, bundle)) {
                return true;
            }
            if (this.f5030a.mo5917a() || this.f5030a.f5028a.getLayoutManager() == null) {
                return false;
            }
            return this.f5030a.f5028a.getLayoutManager().mo5766a(view, i, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5917a() {
        return this.f5028a.mo5614m();
    }

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        this.f5028a = recyclerView;
    }

    /* renamed from: a */
    public final void mo1148a(View view, C0945c cVar) {
        super.mo1148a(view, cVar);
        cVar.mo3656b((CharSequence) RecyclerView.class.getName());
        if (!mo5917a() && this.f5028a.getLayoutManager() != null) {
            this.f5028a.getLayoutManager().mo5751a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo1390a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1390a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !mo5917a()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo5424a(accessibilityEvent);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1299a(View view, int i, Bundle bundle) {
        if (super.mo1299a(view, i, bundle)) {
            return true;
        }
        if (mo5917a() || this.f5028a.getLayoutManager() == null) {
            return false;
        }
        return this.f5028a.getLayoutManager().mo5761a(i, bundle);
    }
}
