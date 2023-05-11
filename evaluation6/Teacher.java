package evaluation6;

public class Teacher {
    int tid;
    String tname;
    String tcity;
    String tsubject;
    int texp;

    public Teacher(int tid, String tname, String tcity, String tsubject, int texp) {
        this.tid = tid;
        this.tname = tname;
        this.tcity = tcity;
        this.tsubject = tsubject;
        this.texp = texp;
    }

    public Teacher(String tname, String tcity, String tsubject, int texp) {
        this.tname = tname;
        this.tcity = tcity;
        this.tsubject = tsubject;
        this.texp = texp;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tcity='" + tcity + '\'' +
                ", tsubject='" + tsubject + '\'' +
                ", texp=" + texp +
                '}';
    }
}
