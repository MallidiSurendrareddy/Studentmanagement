
import java.util.Scanner;
public class Student {
    public String sid;
    public String name;
    public String address;
    public long mobile;
    public long adhar_no;
    public int Class1;
    public Student(String sid, String name, String address, long mobile, long adhar_no, int class1) {
        super();
        this.sid = sid;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.adhar_no = adhar_no;
        Class1 = class1;
    }
    public String getSid() {
        return sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public long getMobile() {
        return mobile;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    public long getAdhar_no() {
        return adhar_no;
    }
    public void setAdhar_no(long adhar_no) {
        this.adhar_no = adhar_no;
    }
    public int getClass1() {
        return Class1;
    }
    public void setClass1(int class1) {
        Class1 = class1;
    }


}
