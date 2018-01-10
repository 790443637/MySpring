package com.ld.domain;

import java.math.BigDecimal;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SomeBean {

        private String name;
        private long max;
        private String password;
        private BigDecimal amount;
        private URL url;

        private OtherBean other;

        private List list;
        private Set set;
        private Map map;
        private Properties properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public OtherBean getOther() {
        return other;
    }

    public void setOther(OtherBean other) {
        this.other = other;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
    @Override
    public String toString() {
        return "SomeBean{" +
                "name='" + name + '\'' +
                ", max=" + max +
                ", password='" + password + '\'' +
                ", amount=" + amount +
                ", url=" + url +
                ", other=" + other +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
