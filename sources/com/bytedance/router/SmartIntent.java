package com.bytedance.router;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

class SmartIntent extends Intent {
    public Uri getData() {
        return super.getData();
    }

    public Bundle getExtras() {
        return super.getExtras();
    }

    private SmartIntent(Intent intent) {
        super(intent);
    }

    public static boolean isSmartIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent instanceof SmartIntent;
    }

    public static Intent smartIntent(Intent intent) {
        if (intent != null && !(intent instanceof SmartIntent)) {
            return new SmartIntent(intent);
        }
        return intent;
    }

    public boolean getBooleanExtra(String str, boolean z) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return z;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return z;
        }
        if (obj instanceof String) {
            try {
                return Boolean.parseBoolean((String) obj);
            } catch (NumberFormatException e) {
                String str2 = str;
                typeWarning(str2, obj, "Boolean", Boolean.valueOf(z), e);
                return z;
            }
        } else {
            try {
                return ((Boolean) obj).booleanValue();
            } catch (ClassCastException e2) {
                String str3 = str;
                typeWarning(str3, obj, "Boolean", Boolean.valueOf(z), e2);
                return z;
            }
        }
    }

    public byte getByteExtra(String str, byte b) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return b;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return b;
        }
        if (obj instanceof String) {
            try {
                return Byte.parseByte((String) obj);
            } catch (NumberFormatException e) {
                String str2 = str;
                typeWarning(str2, obj, "Byte", Byte.valueOf(b), e);
                return b;
            }
        } else {
            try {
                return ((Byte) obj).byteValue();
            } catch (ClassCastException e2) {
                String str3 = str;
                typeWarning(str3, obj, "Byte", Byte.valueOf(b), e2);
                return b;
            }
        }
    }

    public double getDoubleExtra(String str, double d) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return d;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return d;
        }
        if (obj instanceof String) {
            try {
                return Double.parseDouble((String) obj);
            } catch (NumberFormatException e) {
                String str2 = str;
                typeWarning(str2, obj, "Double", Double.valueOf(d), e);
                return d;
            }
        } else {
            try {
                return ((Double) obj).doubleValue();
            } catch (ClassCastException e2) {
                String str3 = str;
                typeWarning(str3, obj, "Double", Double.valueOf(d), e2);
                return d;
            }
        }
    }

    public float getFloatExtra(String str, float f) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return f;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return f;
        }
        if (obj instanceof String) {
            try {
                return Float.parseFloat((String) obj);
            } catch (NumberFormatException e) {
                String str2 = str;
                typeWarning(str2, obj, "Float", Float.valueOf(f), e);
                return f;
            }
        } else {
            try {
                return ((Float) obj).floatValue();
            } catch (ClassCastException e2) {
                String str3 = str;
                typeWarning(str3, obj, "Float", Float.valueOf(f), e2);
                return f;
            }
        }
    }

    public int getIntExtra(String str, int i) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return i;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return i;
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException e) {
                String str2 = str;
                typeWarning(str2, obj, "Integer", Integer.valueOf(i), e);
                return i;
            }
        } else {
            try {
                return ((Integer) obj).intValue();
            } catch (ClassCastException e2) {
                String str3 = str;
                typeWarning(str3, obj, "Integer", Integer.valueOf(i), e2);
                return i;
            }
        }
    }

    public long getLongExtra(String str, long j) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return j;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return j;
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException e) {
                String str2 = str;
                typeWarning(str2, obj, "Long", Long.valueOf(j), e);
                return j;
            }
        } else {
            try {
                return ((Long) obj).longValue();
            } catch (ClassCastException e2) {
                String str3 = str;
                typeWarning(str3, obj, "Long", Long.valueOf(j), e2);
                return j;
            }
        }
    }

    public char getCharExtra(String str, char c) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return c;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return c;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.length() == 1) {
                return str2.charAt(0);
            }
            typeWarning(str, obj, "Char", Character.valueOf(c), null);
            return c;
        }
        try {
            return ((Character) obj).charValue();
        } catch (ClassCastException e) {
            String str3 = str;
            typeWarning(str3, obj, "Char", Character.valueOf(c), e);
            return c;
        }
    }

    public short getShortExtra(String str, short s) {
        Bundle extras = super.getExtras();
        if (extras == null) {
            return s;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return s;
        }
        if (obj instanceof String) {
            try {
                return Short.valueOf(Short.parseShort((String) obj)).shortValue();
            } catch (NumberFormatException e) {
                String str2 = str;
                typeWarning(str2, obj, "Short", Short.valueOf(s), e);
                return s;
            }
        } else {
            try {
                return ((Short) obj).shortValue();
            } catch (ClassCastException e2) {
                String str3 = str;
                typeWarning(str3, obj, "Short", Short.valueOf(s), e2);
                return s;
            }
        }
    }

    private void typeWarning(String str, Object obj, String str2, Object obj2, RuntimeException runtimeException) {
        StringBuilder sb = new StringBuilder();
        sb.append("Key ");
        sb.append(str);
        sb.append(" expected ");
        sb.append(str2);
        sb.append(" but value was a ");
        sb.append(obj.getClass().getName());
        sb.append(".  The default value ");
        sb.append(obj2);
        sb.append(" was returned.");
    }
}
