package com.bytedance.android.livesdk.feed.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.core.setting.C3339m;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdk.feed.utils.ObjectInspector.C7783a;
import com.bytedance.android.livesdk.feed.utils.ObjectInspector.DslParser;
import com.bytedance.android.livesdk.feed.utils.ObjectInspector.DslParser.Segment;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.google.gson.C6608g;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.android.livesdk.feed.utils.c */
public final class C7786c {

    /* renamed from: a */
    public static Object f21025a;

    /* renamed from: b */
    public static final List<String> f21026b = new ArrayList();

    /* renamed from: c */
    public static final C7787a f21027c = new C7787a(null);

    /* renamed from: com.bytedance.android.livesdk.feed.utils.c$a */
    public static final class C7787a {

        /* renamed from: com.bytedance.android.livesdk.feed.utils.c$a$a */
        static final class C7788a<T> implements C6608g<DST> {

            /* renamed from: a */
            final /* synthetic */ Object f21028a;

            C7788a(Object obj) {
                this.f21028a = obj;
            }

            /* renamed from: a */
            public final DST mo15993a(Type type) {
                return this.f21028a;
            }
        }

        private C7787a() {
        }

        /* renamed from: a */
        public static Object m23914a() {
            return C7786c.f21025a;
        }

        /* renamed from: c */
        public static List<String> m23920c() {
            return C7786c.f21026b;
        }

        /* renamed from: b */
        public static boolean m23919b() {
            if (C3339m.m12449a()) {
                C3338l<Boolean> lVar = LiveFeedSettings.ENABLE_LIVE_FEED_DEBUG_MENU;
                C7573i.m23582a((Object) lVar, "LiveFeedSettings.ENABLE_LIVE_FEED_DEBUG_MENU");
                Object a = lVar.mo10240a();
                C7573i.m23582a(a, "LiveFeedSettings.ENABLE_LIVE_FEED_DEBUG_MENU.value");
                if (((Boolean) a).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ C7787a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m23917a(Object obj) {
            C7786c.f21025a = obj;
        }

        /* renamed from: a */
        public static void m23916a(View view, C7561a<C7581n> aVar) {
            C7573i.m23587b(view, "itemView");
            C7573i.m23587b(aVar, "onTriggered");
            view.setOnTouchListener(new C7798d(aVar));
        }

        /* renamed from: a */
        public static Object m23915a(Object obj, String str) {
            C7573i.m23587b(obj, "obj");
            C7573i.m23587b(str, "field");
            try {
                Field declaredField = obj.getClass().getDeclaredField(str);
                C7573i.m23582a((Object) declaredField, "f");
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        public static <DST, SRC> void m23918a(DST dst, SRC src) {
            if (dst != null && src != null) {
                Class cls = dst.getClass();
                C6600e f = new C6607f().mo15986a(cls, new C7788a(dst)).mo15992f();
                f.mo15974a(f.mo15979b((Object) src), cls);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.utils.c$b */
    public static abstract class C7789b<SELF extends C7789b<? extends SELF>> {

        /* renamed from: a */
        public final PopupWindow f21029a = new PopupWindow(this.f21032d);

        /* renamed from: b */
        private final LinearLayout f21030b = new LinearLayout(this.f21032d);

        /* renamed from: c */
        private final int f21031c;

        /* renamed from: d */
        private final Context f21032d;

        /* renamed from: com.bytedance.android.livesdk.feed.utils.c$b$a */
        static final class C7790a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ Button f21033a;

            /* renamed from: b */
            final /* synthetic */ C7789b f21034b;

            /* renamed from: c */
            final /* synthetic */ String f21035c;

            /* renamed from: d */
            final /* synthetic */ boolean f21036d;

            /* renamed from: e */
            final /* synthetic */ C7561a f21037e;

            C7790a(Button button, C7789b bVar, String str, boolean z, C7561a aVar) {
                this.f21033a = button;
                this.f21034b = bVar;
                this.f21035c = str;
                this.f21036d = z;
                this.f21037e = aVar;
            }

            public final void onClick(View view) {
                this.f21037e.invoke();
                C7800e.m23943a(this.f21034b.f21029a);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.feed.utils.c$b$b */
        static final class C7791b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ LinearLayout f21038a;

            /* renamed from: b */
            final /* synthetic */ int f21039b;

            /* renamed from: c */
            final /* synthetic */ C7789b f21040c;

            /* renamed from: d */
            final /* synthetic */ String f21041d;

            /* renamed from: e */
            final /* synthetic */ Object f21042e;

            /* renamed from: f */
            final /* synthetic */ C7561a f21043f;

            C7791b(LinearLayout linearLayout, int i, C7789b bVar, String str, Object obj, C7561a aVar) {
                this.f21038a = linearLayout;
                this.f21039b = i;
                this.f21040c = bVar;
                this.f21041d = str;
                this.f21042e = obj;
                this.f21043f = aVar;
            }

            public final void onClick(View view) {
                this.f21043f.invoke();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.feed.utils.c$b$c */
        static final class C7792c implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C7789b f21044a;

            /* renamed from: b */
            final /* synthetic */ String f21045b;

            /* renamed from: c */
            final /* synthetic */ Object f21046c;

            /* renamed from: d */
            final /* synthetic */ C7561a f21047d;

            C7792c(C7789b bVar, String str, Object obj, C7561a aVar) {
                this.f21044a = bVar;
                this.f21045b = str;
                this.f21046c = obj;
                this.f21047d = aVar;
            }

            public final void onClick(View view) {
                this.f21044a.mo20471a(this.f21046c.toString());
            }
        }

        /* renamed from: com.bytedance.android.livesdk.feed.utils.c$b$d */
        static final class C7793d extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C7789b f21048a;

            /* renamed from: b */
            final /* synthetic */ String f21049b;

            C7793d(C7789b bVar, String str) {
                this.f21048a = bVar;
                this.f21049b = str;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m23935a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m23935a() {
                C7787a.m23920c().remove(this.f21049b);
                C7801f.m23944a(this.f21048a.f21029a);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.feed.utils.c$b$e */
        static final class C7794e implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ EditText f21050a;

            /* renamed from: b */
            final /* synthetic */ C7789b f21051b;

            C7794e(EditText editText, C7789b bVar) {
                this.f21050a = editText;
                this.f21051b = bVar;
            }

            public final void onClick(View view) {
                Object obj;
                Editable text = this.f21050a.getText();
                Object obj2 = null;
                if (text != null) {
                    obj = text.toString();
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Iterator it = C7787a.m23920c().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (C7573i.m23585a((Object) (String) next, obj)) {
                            obj2 = next;
                            break;
                        }
                    }
                    if (obj2 == null) {
                        C7787a.m23920c().add(obj);
                        C7802g.m23945a(this.f21051b.f21029a);
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract SELF mo20466a();

        /* renamed from: c */
        private PopupWindow m23927c() {
            ScrollView scrollView = new ScrollView(this.f21032d);
            scrollView.addView(this.f21030b);
            this.f21029a.setContentView(scrollView);
            this.f21029a.setFocusable(true);
            if (VERSION.SDK_INT >= 21) {
                this.f21029a.setElevation((float) m23922a(5.0f));
            }
            this.f21029a.setBackgroundDrawable(this.f21032d.getResources().getDrawable(m23923a(16842836)));
            return this.f21029a;
        }

        /* renamed from: b */
        public final SELF mo20472b() {
            LinearLayout linearLayout = new LinearLayout(this.f21032d);
            EditText editText = new EditText(this.f21032d);
            editText.setHint("ObjPath");
            editText.setMaxWidth(m23922a(180.0f));
            editText.setMaxLines(3);
            linearLayout.addView(editText);
            Button button = new Button(this.f21032d);
            button.setText("Watch");
            button.setBackgroundResource(m23923a(16843534));
            button.setTransformationMethod(null);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 8388693;
            button.setLayoutParams(layoutParams);
            button.setOnClickListener(new C7794e(editText, this));
            linearLayout.addView(button);
            m23926b(linearLayout);
            return mo20466a();
        }

        /* renamed from: b */
        private final void m23926b(View view) {
            this.f21030b.addView(view);
        }

        /* renamed from: a */
        public final void mo20470a(View view) {
            C7573i.m23587b(view, "anchor");
            m23927c().showAsDropDown(view);
        }

        /* renamed from: a */
        private final int m23922a(float f) {
            Resources resources = this.f21032d.getResources();
            C7573i.m23582a((Object) resources, "r");
            return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }

        /* renamed from: a */
        private final int m23923a(int i) {
            TypedValue typedValue = new TypedValue();
            this.f21032d.getTheme().resolveAttribute(i, typedValue, true);
            int i2 = typedValue.data;
            return typedValue.resourceId;
        }

        public C7789b(Context context) {
            C7573i.m23587b(context, "ctx");
            this.f21032d = context;
            this.f21030b.setOrientation(1);
            this.f21030b.setBackgroundColor(Color.argb(210, NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255));
            TypedArray obtainStyledAttributes = this.f21032d.getTheme().obtainStyledAttributes(new int[]{16842806});
            this.f21031c = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final SELF mo20467a(Object obj) {
            for (String str : C7787a.m23920c()) {
                mo20468a(null, obj, str, new C7793d(this, str));
            }
            return mo20466a();
        }

        /* renamed from: a */
        public final void mo20471a(String str) {
            Object systemService = this.f21032d.getSystemService("clipboard");
            if (!(systemService instanceof ClipboardManager)) {
                systemService = null;
            }
            ClipboardManager clipboardManager = (ClipboardManager) systemService;
            if (clipboardManager != null) {
                CharSequence charSequence = str;
                clipboardManager.setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
            }
            C7799d.m23942a(Toast.makeText(this.f21032d, "Copied to clipboard", 0));
        }

        /* renamed from: a */
        private SELF m23925a(String str, Object obj, C7561a<C7581n> aVar) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(obj, "value");
            LinearLayout linearLayout = new LinearLayout(this.f21032d);
            linearLayout.setOrientation(0);
            int a = m23922a(5.0f);
            int a2 = m23922a(10.0f);
            linearLayout.setPadding(a2, a, a2, a);
            TextView textView = new TextView(this.f21032d);
            textView.setText(str);
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setMaxWidth(m23922a(120.0f));
            linearLayout.addView(textView);
            linearLayout.addView(new Space(this.f21032d), a2, -2);
            TextView textView2 = new TextView(this.f21032d);
            textView2.setText(obj.toString());
            textView2.setMaxLines(3);
            textView2.setMaxWidth(m23922a(160.0f));
            linearLayout.addView(textView2);
            if (aVar != null) {
                linearLayout.addView(new Space(this.f21032d), a2, -2);
                TextView textView3 = new TextView(this.f21032d);
                textView3.setText("(×)");
                textView3.setTextColor(-65536);
                C7791b bVar = new C7791b(linearLayout, a2, this, str, obj, aVar);
                textView3.setOnClickListener(bVar);
                linearLayout.addView(textView3);
            }
            linearLayout.setOnClickListener(new C7792c(this, str, obj, aVar));
            m23926b(linearLayout);
            return mo20466a();
        }

        /* renamed from: a */
        public final SELF mo20469a(String str, boolean z, C7561a<C7581n> aVar) {
            C7573i.m23587b(str, "caption");
            Button button = new Button(this.f21032d);
            button.setText(str);
            button.setBackgroundResource(m23923a(16843534));
            button.setTransformationMethod(null);
            button.setEnabled(z);
            if (aVar != null) {
                C7790a aVar2 = new C7790a(button, this, str, z, aVar);
                button.setOnClickListener(aVar2);
            }
            m23926b(button);
            return mo20466a();
        }

        /* renamed from: a */
        public final SELF mo20468a(String str, Object obj, String str2, C7561a<C7581n> aVar) {
            C7573i.m23587b(str2, "objPath");
            List<Segment> list = new DslParser(str2).f21012a;
            Object a = new ObjectInspector(obj).mo20458a(list);
            if (str == null) {
                Segment segment = (Segment) C7525m.m23517i(list);
                if (segment != null) {
                    str = segment.f21014b;
                } else {
                    str = null;
                }
            }
            if (str == null) {
                str = "(null key)";
            }
            return m23925a(str, (Object) C7783a.m23909a(a), aVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.utils.c$c */
    public static final class C7795c extends C7789b<C7795c> {

        /* renamed from: com.bytedance.android.livesdk.feed.utils.c$c$a */
        static final class C7796a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ Object f21052a;

            C7796a(Object obj) {
                this.f21052a = obj;
                super(0);
            }

            /* renamed from: a */
            private void m23940a() {
                C7787a.m23917a(this.f21052a);
            }

            public final /* synthetic */ Object invoke() {
                m23940a();
                return C7581n.f20898a;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.feed.utils.c$c$b */
        static final class C7797b extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C7562b f21053a;

            C7797b(C7562b bVar) {
                this.f21053a = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m23941a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m23941a() {
                Object a = C7787a.m23914a();
                if (a != null) {
                    this.f21053a.invoke(a);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C7795c mo20466a() {
            return this;
        }

        public C7795c(Context context) {
            C7573i.m23587b(context, "ctx");
            super(context);
        }

        /* renamed from: a */
        public final C7795c mo20477a(C7562b<Object, C7581n> bVar) {
            boolean z;
            C7573i.m23587b(bVar, "doPaste");
            String str = "Paste item";
            if (C7787a.m23914a() != null) {
                z = true;
            } else {
                z = false;
            }
            mo20469a(str, z, (C7561a<C7581n>) new C7797b<C7581n>(bVar));
            return mo20466a();
        }

        /* renamed from: b */
        public final C7795c mo20478b(Object obj) {
            C7573i.m23587b(obj, "item");
            mo20469a("Copy item", true, (C7561a<C7581n>) new C7796a<C7581n>(obj));
            return mo20466a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.utils.c$d */
    public static final class C7798d implements OnTouchListener {

        /* renamed from: a */
        public final C7561a<C7581n> f21054a;

        /* renamed from: b */
        private boolean f21055b;

        public C7798d(C7561a<C7581n> aVar) {
            C7573i.m23587b(aVar, "onTriggered");
            this.f21054a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C7573i.m23587b(view, "v");
            C7573i.m23587b(motionEvent, "event");
            switch (motionEvent.getActionMasked()) {
                case 0:
                    this.f21055b = false;
                    break;
                case 1:
                case 6:
                    return this.f21055b;
                case 5:
                    this.f21055b = true;
                    this.f21054a.invoke();
                    return true;
            }
            return false;
        }
    }
}
