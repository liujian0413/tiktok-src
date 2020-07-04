package org.msgpack.template.builder.beans;

public interface BeanInfo {
    BeanInfo[] getAdditionalBeanInfo();

    BeanDescriptor getBeanDescriptor();

    int getDefaultEventIndex();

    int getDefaultPropertyIndex();

    EventSetDescriptor[] getEventSetDescriptors();

    MethodDescriptor[] getMethodDescriptors();

    PropertyDescriptor[] getPropertyDescriptors();
}
