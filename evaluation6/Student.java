package evaluation6;

public class Student {
    int sid;
    String sname;
   String scity;
    String ssubject;
    int smarks;
    int tid;

    public Student(int sid, String sname, String scity, String ssubject, int smarks,int tid) {
        this.sid = sid;
        this.sname = sname;
        this.scity = scity;
        this.ssubject = ssubject;
        this.smarks = smarks;
        this.tid = tid;
    }

    public Student(String sname, String scity, String ssubject, int smarks,int tid) {
        this.sname = sname;
        this.scity = scity;
        this.ssubject = ssubject;
        this.smarks = smarks;
        this.tid = tid;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", scity='" + scity + '\'' +
                ", ssubject='" + ssubject + '\'' +
                ", smarks=" + smarks + '\'' +
                ", tid=" + tid +
                '}';
    }
}
