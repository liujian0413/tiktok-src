package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p022v4.content.C0688e;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.FacebookException;
import com.facebook.internal.C13945q;
import com.facebook.internal.C13953v;
import com.facebook.internal.C13967z;
import com.facebook.share.internal.C14496f;
import com.facebook.share.internal.C14496f.C14514c;
import com.facebook.share.internal.C14527g;
import com.facebook.share.internal.LikeBoxCountView;
import com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition;

public final class LikeView extends FrameLayout {

    /* renamed from: a */
    public String f37667a;

    /* renamed from: b */
    public ObjectType f37668b;

    /* renamed from: c */
    public C14591c f37669c;

    /* renamed from: d */
    public C14589a f37670d;

    /* renamed from: e */
    private LinearLayout f37671e;

    /* renamed from: f */
    private C14527g f37672f;

    /* renamed from: g */
    private LikeBoxCountView f37673g;

    /* renamed from: h */
    private TextView f37674h;

    /* renamed from: i */
    private C14496f f37675i;

    /* renamed from: j */
    private BroadcastReceiver f37676j;

    /* renamed from: k */
    private Style f37677k;

    /* renamed from: l */
    private HorizontalAlignment f37678l;

    /* renamed from: m */
    private AuxiliaryViewPosition f37679m;

    /* renamed from: n */
    private int f37680n;

    /* renamed from: o */
    private int f37681o;

    /* renamed from: p */
    private int f37682p;

    /* renamed from: q */
    private C13945q f37683q;

    /* renamed from: r */
    private boolean f37684r;

    /* renamed from: com.facebook.share.widget.LikeView$1 */
    class C145871 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LikeView f37685a;

        public final void onClick(View view) {
            this.f37685a.mo36822a();
        }
    }

    public enum AuxiliaryViewPosition {
        BOTTOM("bottom", 0),
        INLINE("inline", 1),
        TOP("top", 2);
        
        static AuxiliaryViewPosition DEFAULT;
        public int intValue;
        private String stringValue;

        public final String toString() {
            return this.stringValue;
        }

        static {
            DEFAULT = BOTTOM;
        }

        static AuxiliaryViewPosition fromInt(int i) {
            AuxiliaryViewPosition[] values;
            for (AuxiliaryViewPosition auxiliaryViewPosition : values()) {
                if (auxiliaryViewPosition.intValue == i) {
                    return auxiliaryViewPosition;
                }
            }
            return null;
        }

        private AuxiliaryViewPosition(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }
    }

    public enum HorizontalAlignment {
        CENTER("center", 0),
        LEFT("left", 1),
        RIGHT("right", 2);
        
        static HorizontalAlignment DEFAULT;
        public int intValue;
        private String stringValue;

        public final String toString() {
            return this.stringValue;
        }

        static {
            DEFAULT = CENTER;
        }

        static HorizontalAlignment fromInt(int i) {
            HorizontalAlignment[] values;
            for (HorizontalAlignment horizontalAlignment : values()) {
                if (horizontalAlignment.intValue == i) {
                    return horizontalAlignment;
                }
            }
            return null;
        }

        private HorizontalAlignment(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }
    }

    public enum ObjectType {
        UNKNOWN("unknown", 0),
        OPEN_GRAPH("open_graph", 1),
        PAGE("page", 2);
        
        public static ObjectType DEFAULT;
        private int intValue;
        private String stringValue;

        public final int getValue() {
            return this.intValue;
        }

        public final String toString() {
            return this.stringValue;
        }

        static {
            DEFAULT = UNKNOWN;
        }

        public static ObjectType fromInt(int i) {
            ObjectType[] values;
            for (ObjectType objectType : values()) {
                if (objectType.getValue() == i) {
                    return objectType;
                }
            }
            return null;
        }

        private ObjectType(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }
    }

    public enum Style {
        STANDARD("standard", 0),
        BUTTON("button", 1),
        BOX_COUNT("box_count", 2);
        
        static Style DEFAULT;
        public int intValue;
        private String stringValue;

        public final String toString() {
            return this.stringValue;
        }

        static {
            DEFAULT = STANDARD;
        }

        static Style fromInt(int i) {
            Style[] values;
            for (Style style : values()) {
                if (style.intValue == i) {
                    return style;
                }
            }
            return null;
        }

        private Style(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$a */
    class C14589a implements C14514c {

        /* renamed from: b */
        private boolean f37688b;

        /* renamed from: a */
        public final void mo36842a() {
            this.f37688b = true;
        }

        private C14589a() {
        }

        /* synthetic */ C14589a(LikeView likeView, C145871 r2) {
            this();
        }

        /* renamed from: a */
        public final void mo36681a(C14496f fVar, FacebookException facebookException) {
            if (!this.f37688b) {
                if (fVar != null) {
                    new FacebookException("Cannot use LikeView. The device may not be supported.");
                    LikeView.this.mo36823a(fVar);
                    LikeView.this.mo36825b();
                }
                LikeView.this.f37670d = null;
            }
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$b */
    class C14590b extends BroadcastReceiver {
        private C14590b() {
        }

        /* synthetic */ C14590b(LikeView likeView, C145871 r2) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            boolean z = true;
            if (extras != null) {
                String string = extras.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
                if (!C13967z.m41249a(string) && !C13967z.m41248a(LikeView.this.f37667a, string)) {
                    z = false;
                }
            }
            if (z) {
                if ("com.facebook.sdk.LikeActionController.UPDATED".equals(action)) {
                    LikeView.this.mo36825b();
                    return;
                }
                if ("com.facebook.sdk.LikeActionController.DID_ERROR".equals(action)) {
                    if (LikeView.this.f37669c != null) {
                        C13953v.m41162a(extras);
                    }
                } else if ("com.facebook.sdk.LikeActionController.DID_RESET".equals(action)) {
                    LikeView.this.mo36824a(LikeView.this.f37667a, LikeView.this.f37668b);
                    LikeView.this.mo36825b();
                }
            }
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$c */
    public interface C14591c {
    }

    public final C14591c getOnErrorListener() {
        return this.f37669c;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        m42191b(null, ObjectType.UNKNOWN);
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.app.Activity getActivity() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
        L_0x0004:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0013
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0013
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0004
        L_0x0013:
            if (r1 == 0) goto L_0x0018
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L_0x0018:
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            java.lang.String r1 = "Unable to get Activity."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.LikeView.getActivity():android.app.Activity");
    }

    /* renamed from: a */
    public final void mo36822a() {
        if (this.f37675i != null) {
            Activity activity = null;
            if (this.f37683q == null) {
                activity = getActivity();
            }
            this.f37675i.mo36671a(activity, this.f37683q, getAnalyticsParameters());
        }
    }

    /* renamed from: c */
    private void m42192c() {
        if (this.f37676j != null) {
            C0688e.m2941a(getContext()).mo2837a(this.f37676j);
            this.f37676j = null;
        }
        if (this.f37670d != null) {
            this.f37670d.mo36842a();
            this.f37670d = null;
        }
        this.f37675i = null;
    }

    /* renamed from: e */
    private void m42194e() {
        LikeBoxCountViewCaretPosition likeBoxCountViewCaretPosition;
        LikeBoxCountView likeBoxCountView;
        switch (this.f37679m) {
            case TOP:
                likeBoxCountView = this.f37673g;
                likeBoxCountViewCaretPosition = LikeBoxCountViewCaretPosition.BOTTOM;
                break;
            case BOTTOM:
                likeBoxCountView = this.f37673g;
                likeBoxCountViewCaretPosition = LikeBoxCountViewCaretPosition.TOP;
                break;
            case INLINE:
                likeBoxCountView = this.f37673g;
                if (this.f37678l != HorizontalAlignment.RIGHT) {
                    likeBoxCountViewCaretPosition = LikeBoxCountViewCaretPosition.LEFT;
                    break;
                } else {
                    likeBoxCountViewCaretPosition = LikeBoxCountViewCaretPosition.RIGHT;
                    break;
                }
            default:
                return;
        }
        likeBoxCountView.setCaretPosition(likeBoxCountViewCaretPosition);
    }

    private Bundle getAnalyticsParameters() {
        Bundle bundle = new Bundle();
        bundle.putString("style", this.f37677k.toString());
        bundle.putString("auxiliary_position", this.f37679m.toString());
        bundle.putString("horizontal_alignment", this.f37678l.toString());
        bundle.putString("object_id", C13967z.m41222a(this.f37667a, ""));
        bundle.putString("object_type", this.f37668b.toString());
        return bundle;
    }

    /* renamed from: b */
    public final void mo36825b() {
        boolean z = !this.f37684r;
        if (this.f37675i == null) {
            this.f37672f.setSelected(false);
            this.f37674h.setText(null);
            this.f37673g.setText(null);
        } else {
            this.f37672f.setSelected(this.f37675i.f37476g);
            this.f37674h.setText(this.f37675i.mo36677b());
            this.f37673g.setText(this.f37675i.mo36670a());
            z = false;
        }
        super.setEnabled(z);
        this.f37672f.setEnabled(z);
        m42193d();
    }

    /* renamed from: d */
    private void m42193d() {
        int i;
        View view;
        LayoutParams layoutParams = (LayoutParams) this.f37671e.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f37672f.getLayoutParams();
        if (this.f37678l == HorizontalAlignment.LEFT) {
            i = 3;
        } else if (this.f37678l == HorizontalAlignment.CENTER) {
            i = 1;
        } else {
            i = 5;
        }
        layoutParams.gravity = i | 48;
        layoutParams2.gravity = i;
        this.f37674h.setVisibility(8);
        this.f37673g.setVisibility(8);
        if (this.f37677k == Style.STANDARD && this.f37675i != null && !C13967z.m41249a(this.f37675i.mo36677b())) {
            view = this.f37674h;
        } else if (this.f37677k == Style.BOX_COUNT && this.f37675i != null && !C13967z.m41249a(this.f37675i.mo36670a())) {
            m42194e();
            view = this.f37673g;
        } else {
            return;
        }
        int i2 = 0;
        view.setVisibility(0);
        ((LinearLayout.LayoutParams) view.getLayoutParams()).gravity = i;
        LinearLayout linearLayout = this.f37671e;
        if (this.f37679m != AuxiliaryViewPosition.INLINE) {
            i2 = 1;
        }
        linearLayout.setOrientation(i2);
        if (this.f37679m == AuxiliaryViewPosition.TOP || (this.f37679m == AuxiliaryViewPosition.INLINE && this.f37678l == HorizontalAlignment.RIGHT)) {
            this.f37671e.removeView(this.f37672f);
            this.f37671e.addView(this.f37672f);
        } else {
            this.f37671e.removeView(view);
            this.f37671e.addView(view);
        }
        switch (this.f37679m) {
            case TOP:
                view.setPadding(this.f37681o, this.f37681o, this.f37681o, this.f37682p);
                return;
            case BOTTOM:
                view.setPadding(this.f37681o, this.f37682p, this.f37681o, this.f37681o);
                return;
            case INLINE:
                if (this.f37678l != HorizontalAlignment.RIGHT) {
                    view.setPadding(this.f37682p, this.f37681o, this.f37681o, this.f37681o);
                    break;
                } else {
                    view.setPadding(this.f37681o, this.f37681o, this.f37682p, this.f37681o);
                    return;
                }
        }
    }

    public final void setOnErrorListener(C14591c cVar) {
        this.f37669c = cVar;
    }

    public final void setEnabled(boolean z) {
        this.f37684r = true;
        mo36825b();
    }

    public final void setFragment(Fragment fragment) {
        this.f37683q = new C13945q(fragment);
    }

    public final void setAuxiliaryViewPosition(AuxiliaryViewPosition auxiliaryViewPosition) {
        if (auxiliaryViewPosition == null) {
            auxiliaryViewPosition = AuxiliaryViewPosition.DEFAULT;
        }
        if (this.f37679m != auxiliaryViewPosition) {
            this.f37679m = auxiliaryViewPosition;
            m42193d();
        }
    }

    public final void setForegroundColor(int i) {
        if (this.f37680n != i) {
            this.f37674h.setTextColor(i);
        }
    }

    public final void setFragment(android.support.p022v4.app.Fragment fragment) {
        this.f37683q = new C13945q(fragment);
    }

    public final void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
        if (horizontalAlignment == null) {
            horizontalAlignment = HorizontalAlignment.DEFAULT;
        }
        if (this.f37678l != horizontalAlignment) {
            this.f37678l = horizontalAlignment;
            m42193d();
        }
    }

    public final void setLikeViewStyle(Style style) {
        if (style == null) {
            style = Style.DEFAULT;
        }
        if (this.f37677k != style) {
            this.f37677k = style;
            m42193d();
        }
    }

    /* renamed from: a */
    public final void mo36823a(C14496f fVar) {
        this.f37675i = fVar;
        this.f37676j = new C14590b(this, null);
        C0688e a = C0688e.m2941a(getContext());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        a.mo2838a(this.f37676j, intentFilter);
    }

    /* renamed from: b */
    private void m42191b(String str, ObjectType objectType) {
        String a = C13967z.m41222a((String) null, (String) null);
        if (objectType == null) {
            objectType = ObjectType.DEFAULT;
        }
        if (!C13967z.m41248a(a, this.f37667a) || objectType != this.f37668b) {
            mo36824a(a, objectType);
            mo36825b();
        }
    }

    /* renamed from: a */
    public final void mo36824a(String str, ObjectType objectType) {
        m42192c();
        this.f37667a = str;
        this.f37668b = objectType;
        if (!C13967z.m41249a(str)) {
            this.f37670d = new C14589a(this, null);
            if (!isInEditMode()) {
                C14496f.m41847a(str, objectType, (C14514c) this.f37670d);
            }
        }
    }
}
