package com.facebook.appevents.codeless.internal;

import android.support.p022v4.view.C0979k;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.C1642a;
import com.facebook.internal.C13967z;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.codeless.internal.d */
public class C13148d {

    /* renamed from: a */
    private static final String f34840a = C13148d.class.getCanonicalName();

    /* renamed from: b */
    private static WeakReference<View> f34841b = new WeakReference<>(null);

    /* renamed from: c */
    private static Method f34842c = null;

    /* renamed from: a */
    private static void m38430a() {
        if (f34842c == null) {
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", new Class[]{float[].class, ViewGroup.class});
                f34842c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException unused) {
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    /* renamed from: l */
    private static boolean m38443l(View view) {
        return view.getClass().getName().equals("com.facebook.react.ReactRootView");
    }

    /* renamed from: f */
    public static View m38437f(View view) {
        while (view != null) {
            if (!m38443l(view)) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        return null;
    }

    /* renamed from: g */
    private static List<View> m38438g(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    private static boolean m38441j(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AdapterView) || (parent instanceof C0979k)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private static float[] m38444m(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new float[]{(float) iArr[0], (float) iArr[1]};
    }

    /* renamed from: c */
    public static String m38434c(View view) {
        CharSequence charSequence;
        if (view instanceof EditText) {
            charSequence = ((EditText) view).getHint();
        } else if (view instanceof TextView) {
            charSequence = ((TextView) view).getHint();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    /* renamed from: d */
    public static OnClickListener m38435d(View view) {
        OnClickListener onClickListener;
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
                onClickListener = (OnClickListener) declaredField2.get(obj);
            } else {
                onClickListener = null;
            }
            return onClickListener;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static OnTouchListener m38436e(View view) {
        OnTouchListener onTouchListener;
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
                onTouchListener = (OnTouchListener) declaredField2.get(obj);
            } else {
                onTouchListener = null;
            }
            return onTouchListener;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: i */
    private static boolean m38440i(View view) {
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(view);
                if (obj == null) {
                    return false;
                }
                Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                if (declaredField2 == null || ((OnClickListener) declaredField2.get(obj)) == null) {
                    return false;
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static JSONObject m38429a(View view) {
        if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
            f34841b = new WeakReference<>(view);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            m38431a(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List g = m38438g(view);
            for (int i = 0; i < g.size(); i++) {
                jSONArray.put(m38429a((View) g.get(i)));
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: h */
    private static int m38439h(View view) {
        int i;
        if (view instanceof ImageView) {
            i = 2;
        } else {
            i = 0;
        }
        if (m38440i(view)) {
            i |= 32;
        }
        if (m38441j(view)) {
            i |= 512;
        }
        if (view instanceof TextView) {
            int i2 = i | PreloadTask.BYTE_UNIT_NUMBER | 1;
            if (view instanceof Button) {
                i2 |= 4;
                if (view instanceof Switch) {
                    i2 |= VideoCacheReadBuffersizeExperiment.DEFAULT;
                } else if (view instanceof CheckBox) {
                    i2 |= 32768;
                }
            }
            if (view instanceof EditText) {
                return i2 | 2048;
            }
            return i2;
        } else if ((view instanceof Spinner) || (view instanceof DatePicker)) {
            return i | 4096;
        } else {
            if (view instanceof RatingBar) {
                return i | 65536;
            }
            if (view instanceof RadioGroup) {
                return i | 16384;
            }
            if (!(view instanceof ViewGroup) || !m38432a(view, (View) f34841b.get())) {
                return i;
            }
            return i | 64;
        }
    }

    /* renamed from: k */
    private static JSONObject m38442k(View view) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("top", view.getTop());
            jSONObject.put("left", view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static String m38433b(View view) {
        Object obj;
        Object obj2 = null;
        if (view instanceof TextView) {
            obj2 = ((TextView) view).getText();
            if (view instanceof Switch) {
                if (((Switch) view).isChecked()) {
                    obj = "1";
                } else {
                    obj = "0";
                }
                obj2 = obj;
            }
        } else if (view instanceof Spinner) {
            Spinner spinner = (Spinner) view;
            if (spinner.getCount() > 0) {
                Object selectedItem = spinner.getSelectedItem();
                if (selectedItem != null) {
                    obj2 = selectedItem.toString();
                }
            }
        } else {
            int i = 0;
            if (view instanceof DatePicker) {
                DatePicker datePicker = (DatePicker) view;
                obj2 = C1642a.m8034a("%04d-%02d-%02d", new Object[]{Integer.valueOf(datePicker.getYear()), Integer.valueOf(datePicker.getMonth()), Integer.valueOf(datePicker.getDayOfMonth())});
            } else if (view instanceof TimePicker) {
                TimePicker timePicker = (TimePicker) view;
                obj2 = C1642a.m8034a("%02d:%02d", new Object[]{Integer.valueOf(timePicker.getCurrentHour().intValue()), Integer.valueOf(timePicker.getCurrentMinute().intValue())});
            } else if (view instanceof RadioGroup) {
                RadioGroup radioGroup = (RadioGroup) view;
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                int childCount = radioGroup.getChildCount();
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = radioGroup.getChildAt(i);
                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                        obj2 = ((RadioButton) childAt).getText();
                        break;
                    }
                    i++;
                }
            } else if (view instanceof RatingBar) {
                obj2 = String.valueOf(((RatingBar) view).getRating());
            }
        }
        if (obj2 == null) {
            return "";
        }
        return obj2.toString();
    }

    /* renamed from: a */
    private static View m38428a(float[] fArr, View view) {
        m38430a();
        if (f34842c == null || view == null) {
            return null;
        }
        try {
            View view2 = (View) f34842c.invoke(null, new Object[]{fArr, view});
            if (view2 != null && view2.getId() > 0) {
                View view3 = (View) view2.getParent();
                if (view3 != null) {
                    return view3;
                }
                return null;
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static void m38431a(View view, JSONObject jSONObject) {
        try {
            String b = m38433b(view);
            String c = m38434c(view);
            Object tag = view.getTag();
            CharSequence contentDescription = view.getContentDescription();
            jSONObject.put("classname", view.getClass().getCanonicalName());
            jSONObject.put("classtypebitmask", m38439h(view));
            jSONObject.put("id", view.getId());
            if (!C13146b.m38418a(view)) {
                jSONObject.put("text", C13967z.m41222a(C13967z.m41262c(b), ""));
            } else {
                jSONObject.put("text", "");
                jSONObject.put("is_user_input", true);
            }
            jSONObject.put("hint", C13967z.m41222a(C13967z.m41262c(c), ""));
            if (tag != null) {
                jSONObject.put("tag", C13967z.m41222a(C13967z.m41262c(tag.toString()), ""));
            }
            if (contentDescription != null) {
                jSONObject.put("description", C13967z.m41222a(C13967z.m41262c(contentDescription.toString()), ""));
            }
            jSONObject.put("dimension", m38442k(view));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static boolean m38432a(View view, View view2) {
        if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
            return false;
        }
        View a = m38428a(m38444m(view), view2);
        if (a == null || a.getId() != view.getId()) {
            return false;
        }
        return true;
    }
}
