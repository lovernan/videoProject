package cn.whxlover.pojo;

public class TopClass {
    private Integer topId;

    private String className;

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}