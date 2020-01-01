package cn.whxlover.pojo;

public class SubClass {
    private Integer subId;

    private String className;

    private Integer topClass;

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getTopClass() {
        return topClass;
    }

    public void setTopClass(Integer topClass) {
        this.topClass = topClass;
    }
}