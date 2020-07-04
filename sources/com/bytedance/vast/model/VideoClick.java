package com.bytedance.vast.model;

import java.io.Serializable;
import java.util.Set;

public class VideoClick implements Serializable, Cloneable {
    public String clickThrough;
    public Set<String> clickTracking;
}
