package kotlin.jvm.internal;

import kotlin.reflect.C7583b;
import kotlin.reflect.C7595j;

public abstract class PropertyReference extends CallableReference implements C7595j {
    public PropertyReference() {
    }

    /* access modifiers changed from: protected */
    public C7595j getReflected() {
        return (C7595j) super.getReflected();
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        C7583b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder sb = new StringBuilder("property ");
        sb.append(getName());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    public PropertyReference(Object obj) {
        super(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (!getOwner().equals(propertyReference.getOwner()) || !getName().equals(propertyReference.getName()) || !getSignature().equals(propertyReference.getSignature()) || !C7573i.m23585a(getBoundReceiver(), propertyReference.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof C7595j) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }
}
