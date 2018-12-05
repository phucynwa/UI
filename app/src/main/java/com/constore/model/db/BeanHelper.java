package com.constore.model.db;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * DO NOT TOUCH - mrmathami
 */
final class BeanHelper {
    private final Field field;
    private final Method getter;
    private final Method setter;

    BeanHelper(Field field, Method getter, Method setter) {
        this.field = field;
        this.getter = getter;
        this.setter = setter;
    }

    Object getValue(Object object) throws InvocationTargetException, IllegalAccessException {
        return getter.invoke(object);
    }

    Object setValue(Object object, Object value) throws InvocationTargetException, IllegalAccessException {
        return setter.invoke(object, value);
    }

    Field getField() {
        return field;
    }

    String getFieldName() {
        return field.getName();
    }

    Bean.BeanField getFieldAnnotation() {
        return field.getAnnotation(Bean.BeanField.class);
    }
}