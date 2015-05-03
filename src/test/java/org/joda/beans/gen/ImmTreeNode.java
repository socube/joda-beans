/*
 *  Copyright 2001-2014 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.google.common.collect.ImmutableList;

/**
 * Mock immutable tree node, used for iterator testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(cacheHashCode = true)
public final class ImmTreeNode implements ImmutableBean {

    @PropertyDefinition(validate = "notNull")
    private final String name;
    @PropertyDefinition
    private final ImmTreeNode child1;
    @PropertyDefinition
    private final ImmTreeNode child2;
    @PropertyDefinition
    private final ImmTreeNode child3;
    @PropertyDefinition(validate = "notNull")
    private final List<ImmTreeNode> childList;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code ImmTreeNode}.
     * @return the meta-bean, not null
     */
    public static ImmTreeNode.Meta meta() {
        return ImmTreeNode.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(ImmTreeNode.Meta.INSTANCE);
    }

    /**
     * The cached hash code, using the racy single-check idiom.
     */
    private int cachedHashCode;

    /**
     * Returns a builder used to create an instance of the bean.
     * @return the builder, not null
     */
    public static ImmTreeNode.Builder builder() {
        return new ImmTreeNode.Builder();
    }

    private ImmTreeNode(
            String name,
            ImmTreeNode child1,
            ImmTreeNode child2,
            ImmTreeNode child3,
            List<ImmTreeNode> childList) {
        JodaBeanUtils.notNull(name, "name");
        JodaBeanUtils.notNull(childList, "childList");
        this.name = name;
        this.child1 = child1;
        this.child2 = child2;
        this.child3 = child3;
        this.childList = ImmutableList.copyOf(childList);
    }

    @Override
    public ImmTreeNode.Meta metaBean() {
        return ImmTreeNode.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the name.
     * @return the value of the property, not null
     */
    public String getName() {
        return name;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the child1.
     * @return the value of the property
     */
    public ImmTreeNode getChild1() {
        return child1;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the child2.
     * @return the value of the property
     */
    public ImmTreeNode getChild2() {
        return child2;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the child3.
     * @return the value of the property
     */
    public ImmTreeNode getChild3() {
        return child3;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the childList.
     * @return the value of the property, not null
     */
    public List<ImmTreeNode> getChildList() {
        return childList;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            ImmTreeNode other = (ImmTreeNode) obj;
            return JodaBeanUtils.equal(getName(), other.getName()) &&
                    JodaBeanUtils.equal(getChild1(), other.getChild1()) &&
                    JodaBeanUtils.equal(getChild2(), other.getChild2()) &&
                    JodaBeanUtils.equal(getChild3(), other.getChild3()) &&
                    JodaBeanUtils.equal(getChildList(), other.getChildList());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = cachedHashCode;
        if (hash == 0) {
            hash = getClass().hashCode();
            hash = hash * 31 + JodaBeanUtils.hashCode(getName());
            hash = hash * 31 + JodaBeanUtils.hashCode(getChild1());
            hash = hash * 31 + JodaBeanUtils.hashCode(getChild2());
            hash = hash * 31 + JodaBeanUtils.hashCode(getChild3());
            hash = hash * 31 + JodaBeanUtils.hashCode(getChildList());
            cachedHashCode = hash;
        }
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(192);
        buf.append("ImmTreeNode{");
        buf.append("name").append('=').append(getName()).append(',').append(' ');
        buf.append("child1").append('=').append(getChild1()).append(',').append(' ');
        buf.append("child2").append('=').append(getChild2()).append(',').append(' ');
        buf.append("child3").append('=').append(getChild3()).append(',').append(' ');
        buf.append("childList").append('=').append(JodaBeanUtils.toString(getChildList()));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ImmTreeNode}.
     */
    public static final class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code name} property.
         */
        private final MetaProperty<String> name = DirectMetaProperty.ofImmutable(
                this, "name", ImmTreeNode.class, String.class);
        /**
         * The meta-property for the {@code child1} property.
         */
        private final MetaProperty<ImmTreeNode> child1 = DirectMetaProperty.ofImmutable(
                this, "child1", ImmTreeNode.class, ImmTreeNode.class);
        /**
         * The meta-property for the {@code child2} property.
         */
        private final MetaProperty<ImmTreeNode> child2 = DirectMetaProperty.ofImmutable(
                this, "child2", ImmTreeNode.class, ImmTreeNode.class);
        /**
         * The meta-property for the {@code child3} property.
         */
        private final MetaProperty<ImmTreeNode> child3 = DirectMetaProperty.ofImmutable(
                this, "child3", ImmTreeNode.class, ImmTreeNode.class);
        /**
         * The meta-property for the {@code childList} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<ImmTreeNode>> childList = DirectMetaProperty.ofImmutable(
                this, "childList", ImmTreeNode.class, (Class) List.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "name",
                "child1",
                "child2",
                "child3",
                "childList");

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    return name;
                case -1361400171:  // child1
                    return child1;
                case -1361400170:  // child2
                    return child2;
                case -1361400169:  // child3
                    return child3;
                case -95409190:  // childList
                    return childList;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public ImmTreeNode.Builder builder() {
            return new ImmTreeNode.Builder();
        }

        @Override
        public Class<? extends ImmTreeNode> beanType() {
            return ImmTreeNode.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code name} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String> name() {
            return name;
        }

        /**
         * The meta-property for the {@code child1} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmTreeNode> child1() {
            return child1;
        }

        /**
         * The meta-property for the {@code child2} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmTreeNode> child2() {
            return child2;
        }

        /**
         * The meta-property for the {@code child3} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmTreeNode> child3() {
            return child3;
        }

        /**
         * The meta-property for the {@code childList} property.
         * @return the meta-property, not null
         */
        public MetaProperty<List<ImmTreeNode>> childList() {
            return childList;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    return ((ImmTreeNode) bean).getName();
                case -1361400171:  // child1
                    return ((ImmTreeNode) bean).getChild1();
                case -1361400170:  // child2
                    return ((ImmTreeNode) bean).getChild2();
                case -1361400169:  // child3
                    return ((ImmTreeNode) bean).getChild3();
                case -95409190:  // childList
                    return ((ImmTreeNode) bean).getChildList();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code ImmTreeNode}.
     */
    public static final class Builder extends DirectFieldsBeanBuilder<ImmTreeNode> {

        private String name;
        private ImmTreeNode child1;
        private ImmTreeNode child2;
        private ImmTreeNode child3;
        private List<ImmTreeNode> childList = ImmutableList.of();

        /**
         * Restricted constructor.
         */
        private Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(ImmTreeNode beanToCopy) {
            this.name = beanToCopy.getName();
            this.child1 = beanToCopy.getChild1();
            this.child2 = beanToCopy.getChild2();
            this.child3 = beanToCopy.getChild3();
            this.childList = ImmutableList.copyOf(beanToCopy.getChildList());
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    return name;
                case -1361400171:  // child1
                    return child1;
                case -1361400170:  // child2
                    return child2;
                case -1361400169:  // child3
                    return child3;
                case -95409190:  // childList
                    return childList;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @SuppressWarnings("unchecked")
        @Override
        public Builder set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    this.name = (String) newValue;
                    break;
                case -1361400171:  // child1
                    this.child1 = (ImmTreeNode) newValue;
                    break;
                case -1361400170:  // child2
                    this.child2 = (ImmTreeNode) newValue;
                    break;
                case -1361400169:  // child3
                    this.child3 = (ImmTreeNode) newValue;
                    break;
                case -95409190:  // childList
                    this.childList = (List<ImmTreeNode>) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        @Override
        public Builder setString(String propertyName, String value) {
            setString(meta().metaProperty(propertyName), value);
            return this;
        }

        @Override
        public Builder setString(MetaProperty<?> property, String value) {
            super.setString(property, value);
            return this;
        }

        @Override
        public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
            super.setAll(propertyValueMap);
            return this;
        }

        @Override
        public ImmTreeNode build() {
            return new ImmTreeNode(
                    name,
                    child1,
                    child2,
                    child3,
                    childList);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the name.
         * @param name  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder name(String name) {
            JodaBeanUtils.notNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Sets the child1.
         * @param child1  the new value
         * @return this, for chaining, not null
         */
        public Builder child1(ImmTreeNode child1) {
            this.child1 = child1;
            return this;
        }

        /**
         * Sets the child2.
         * @param child2  the new value
         * @return this, for chaining, not null
         */
        public Builder child2(ImmTreeNode child2) {
            this.child2 = child2;
            return this;
        }

        /**
         * Sets the child3.
         * @param child3  the new value
         * @return this, for chaining, not null
         */
        public Builder child3(ImmTreeNode child3) {
            this.child3 = child3;
            return this;
        }

        /**
         * Sets the childList.
         * @param childList  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder childList(List<ImmTreeNode> childList) {
            JodaBeanUtils.notNull(childList, "childList");
            this.childList = childList;
            return this;
        }

        /**
         * Sets the {@code childList} property in the builder
         * from an array of objects.
         * @param childList  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder childList(ImmTreeNode... childList) {
            return childList(ImmutableList.copyOf(childList));
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(192);
            buf.append("ImmTreeNode.Builder{");
            buf.append("name").append('=').append(JodaBeanUtils.toString(name)).append(',').append(' ');
            buf.append("child1").append('=').append(JodaBeanUtils.toString(child1)).append(',').append(' ');
            buf.append("child2").append('=').append(JodaBeanUtils.toString(child2)).append(',').append(' ');
            buf.append("child3").append('=').append(JodaBeanUtils.toString(child3)).append(',').append(' ');
            buf.append("childList").append('=').append(JodaBeanUtils.toString(childList));
            buf.append('}');
            return buf.toString();
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
