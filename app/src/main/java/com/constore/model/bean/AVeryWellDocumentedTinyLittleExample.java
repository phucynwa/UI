package com.constore.model.bean;

import com.constore.model.db.Bean;

import java.util.Date;

/**
 * READ ME PLEASE, IT WILL HELP YOU A LOT. JUST 5 MINUTES!
 * ---
 * This is an example of how to create a bean
 * Imagine this like a row in any SQL database
 * Name of column       ===  Field name
 * Type of column data  ===  Field type
 */

// #NOTE:
// %%
// %%   final class Something extends Bean<Something> {}
// %%
//
// Just do it.
// PS: A bean should always be `final`
//
public final class AVeryWellDocumentedTinyLittleExample extends Bean<AVeryWellDocumentedTinyLittleExample> {

    // #NOTE:
    // %% static {
    // %%     beanInitialize(Something.class);
    // %% }
    //
    // Just do it, too.
    //
    static {
        beanInitialize(AVeryWellDocumentedTinyLittleExample.class);
    }

    /* ========================================================================================== */

    // #NOTE:
    // %%
    // %% @BeanField(isNullable = false) protected Integer id;
    // %%
    //
    // The `id` is predefined like this in the `Bean` class with its getter and setter
    // You don't need to define it again
    //


    // #NOTE:
    // Remember the mark `@BeanField`, it looks stupid, but has its own meaning
    //
    @BeanField private String aString;
    @BeanField private Integer anInteger;


    // #NOTE:
    // %%
    // %% @BeanField boolean aPrimitiveBoolean;
    // %%
    //
    // This will NOT work, everything has to be `Object`, sorry :(
    //


    // #NOTE:
    // Getter and Setter name can be define. If not, they will follow standard naming
    // Example `getAString`, `setAnInteger`
    //
    @BeanField(getter = "anotherStringButWithCustomGetterName") private String anotherString;
    @BeanField(setter = "anotherIntegerWithCustomSetterName") private Integer anotherInteger;


    // #NOTE:
    // isNotNull indicate field can be null or not, default is nullable
    // isUnique indicate field need to be unique or not, default is not unique
    //
    @BeanField(isNotNull = true) private Date someDate;
    @BeanField(isUnique = true) private Date anotherDate;


    // #NOTE:
    // Things can be mixed together, like salt and sugar
    //
    @BeanField(isUnique = true, isNotNull = true) private Double someDouble;


    // #NOTE:
    // Remember to create this boring getter & setter
    //

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    public Integer getAnInteger() {
        return anInteger;
    }

    public void setAnInteger(Integer anInteger) {
        this.anInteger = anInteger;
    }

    public String getAnotherString() {
        return anotherString;
    }

    public void setAnotherString(String anotherString) {
        this.anotherString = anotherString;
    }

    public Integer getAnotherInteger() {
        return anotherInteger;
    }

    public void setAnotherInteger(Integer anotherInteger) {
        this.anotherInteger = anotherInteger;
    }

    public Date getSomeDate() {
        return someDate;
    }

    public void setSomeDate(Date someDate) {
        this.someDate = someDate;
    }

    public Date getAnotherDate() {
        return anotherDate;
    }

    public void setAnotherDate(Date anotherDate) {
        this.anotherDate = anotherDate;
    }

    public Double getSomeDouble() {
        return someDouble;
    }

    public void setSomeDouble(Double someDouble) {
        this.someDouble = someDouble;
    }
}
