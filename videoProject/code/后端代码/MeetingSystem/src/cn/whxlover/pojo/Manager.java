package cn.whxlover.pojo;

public class Manager {
    private Integer mid;

    private String managerName;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }
}